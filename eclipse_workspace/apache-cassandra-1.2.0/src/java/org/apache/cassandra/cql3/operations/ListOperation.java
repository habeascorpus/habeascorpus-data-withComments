/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.cql3.operations;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.cassandra.cql3.ColumnIdentifier;
import org.apache.cassandra.cql3.ColumnNameBuilder;
import org.apache.cassandra.cql3.ColumnSpecification;
import org.apache.cassandra.cql3.Term;
import org.apache.cassandra.cql3.UpdateParameters;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.IColumn;
import org.apache.cassandra.db.marshal.AbstractType;
import org.apache.cassandra.db.marshal.CollectionType;
import org.apache.cassandra.db.marshal.Int32Type;
import org.apache.cassandra.db.marshal.ListType;
import org.apache.cassandra.db.marshal.MapType;
import org.apache.cassandra.db.marshal.MarshalException;
import org.apache.cassandra.exceptions.InvalidRequestException;
import org.apache.cassandra.utils.Pair;
import org.apache.cassandra.utils.UUIDGen;

public class ListOperation implements Operation
{
    // Our reference time (1 jan 2010, 00:00:00) in milliseconds.
    private static final long REFERENCE_TIME = 1262304000000L;

    /*
     * For prepend, we need to be able to generate unique but decreasing time
     * UUID, which is a bit challenging. To do that, given a time in milliseconds,
     * we adds a number representing the 100-nanoseconds precision and make sure
     * that within the same millisecond, that number is always decreasing. We
     * do rely on the fact that the user will only provide decreasing
     * milliseconds timestamp for that purpose.
     */
    private static class PrecisionTime
    {
        public final long millis;
        public final int nanos;

        public PrecisionTime(long millis, int nanos)
        {
            this.millis = millis;
            this.nanos = nanos;
        }
    }

    private static final AtomicReference<PrecisionTime> last = new AtomicReference<PrecisionTime>(new PrecisionTime(Long.MAX_VALUE, 0));

    private static PrecisionTime getNextTime(long millis)
    {
        while (true)
        {
            PrecisionTime current = last.get();

            assert millis <= current.millis;
            PrecisionTime next = millis < current.millis
                    ? new PrecisionTime(millis, 9999)
                    : new PrecisionTime(millis, Math.max(0, current.nanos - 1));

            if (last.compareAndSet(current, next))
                return next;
        }
    }

    enum Kind { SET, SET_IDX, APPEND, PREPEND, DISCARD, DISCARD_IDX }

    private final List<Term> values;
    private final Kind kind;

    private ListOperation(List<Term> values, Kind kind)
    {
        this.values = Collections.unmodifiableList(values);
        this.kind = kind;
    }

    public void execute(ColumnFamily cf,
                        ColumnNameBuilder builder,
                        AbstractType<?> validator,
                        UpdateParameters params,
                        List<Pair<ByteBuffer, IColumn>> list) throws InvalidRequestException
    {
        if (!(validator instanceof ListType || (kind == Kind.SET_IDX && validator instanceof MapType)))
            throw new InvalidRequestException("List operations are only supported on List typed columns, but " + validator + " given.");

        switch (kind)
        {
            case SET:
                cf.addAtom(params.makeTombstoneForOverwrite(builder.copy().build(), builder.copy().buildAsEndOfRange()));
                doAppend(cf, builder, (CollectionType)validator, params);
                break;
            case SET_IDX:
                // Since the parser couldn't disambiguate between a 'list set by idx'
                // and a 'map put by key', we have to do it now.
                if (validator instanceof MapType)
                {
                    assert values.size() == 2;
                    MapOperation.Put(values.get(0), values.get(1)).execute(cf, builder, validator, params, null);
                }
                else
                {
                    doSet(cf, builder, params, (CollectionType)validator, list);
                }
                break;
            case APPEND:
                doAppend(cf, builder, (CollectionType)validator, params);
                break;
            case PREPEND:
                doPrepend(cf, builder, (CollectionType)validator, params);
                break;
            case DISCARD:
                doDiscard(cf, (CollectionType)validator, params, list);
                break;
            case DISCARD_IDX:
                doDiscardIdx(cf, params, list);
                break;
            default:
                throw new AssertionError("Unsupported List operation: " + kind);
        }
    }

    public static void doSetFromPrepared(ColumnFamily cf, ColumnNameBuilder builder, ListType validator, Term values, UpdateParameters params) throws InvalidRequestException
    {
        if (!values.isBindMarker())
            throw new InvalidRequestException("Can't apply operation on column with " + validator + " type.");

        cf.addAtom(params.makeTombstoneForOverwrite(builder.copy().build(), builder.copy().buildAsEndOfRange()));
        doAppendFromPrepared(cf, builder, validator, values, params);
    }

    public static void doAppendFromPrepared(ColumnFamily cf, ColumnNameBuilder builder, ListType validator, Term values, UpdateParameters params) throws InvalidRequestException
    {
        if (!values.isBindMarker())
            throw new InvalidRequestException("Can't apply operation on column with " + validator + " type.");

        try
        {
            List<?> l = validator.compose(params.variables.get(values.bindIndex));

            for (int i = 0; i < l.size(); i++)
            {
                ColumnNameBuilder b = i == l.size() - 1 ? builder : builder.copy();
                ByteBuffer uuid = ByteBuffer.wrap(UUIDGen.getTimeUUIDBytes());
                ByteBuffer name = b.add(uuid).build();
                cf.addColumn(params.makeColumn(name, validator.valueComparator().decompose(l.get(i))));
            }
        }
        catch (MarshalException e)
        {
            throw new InvalidRequestException(e.getMessage());
        }
    }

    public static void doPrependFromPrepared(ColumnFamily cf, ColumnNameBuilder builder, ListType validator, Term values, UpdateParameters params) throws InvalidRequestException
    {
        if (!values.isBindMarker())
            throw new InvalidRequestException("Can't apply operation on column with " + validator + " type.");

        long time = REFERENCE_TIME - (System.currentTimeMillis() - REFERENCE_TIME);

        try
        {
            List<?> l = validator.compose(params.variables.get(values.bindIndex));

            for (int i = 0; i < l.size(); i++)
            {
                ColumnNameBuilder b = i == l.size() - 1 ? builder : builder.copy();
                PrecisionTime pt = getNextTime(time);
                ByteBuffer uuid = ByteBuffer.wrap(UUIDGen.getTimeUUIDBytes(pt.millis, pt.nanos));
                ByteBuffer name = b.add(uuid).build();
                cf.addColumn(params.makeColumn(name, validator.valueComparator().decompose(l.get(i))));
            }
        }
        catch (MarshalException e)
        {
            throw new InvalidRequestException(e.getMessage());
        }
    }

    public static void doDiscardFromPrepared(ColumnFamily cf, ColumnNameBuilder builder, ListType validator, Term values, UpdateParameters params, List<Pair<ByteBuffer, IColumn>> list) throws InvalidRequestException
    {
        if (!values.isBindMarker())
            throw new InvalidRequestException("Can't apply operation on column with " + validator + " type.");

        if (list == null)
            return;

        try
        {
            List<?> l = validator.compose(params.variables.get(values.bindIndex));

            Set<ByteBuffer> toDiscard = new HashSet<ByteBuffer>();
            for (Object elt : l)
                toDiscard.add(validator.valueComparator().decompose(elt));

            for (Pair<ByteBuffer, IColumn> p : list)
            {
                IColumn c = p.right;
                if (toDiscard.contains(c.value()))
                    cf.addColumn(params.makeTombstone(c.name()));
            }
        }
        catch (MarshalException e)
        {
            throw new InvalidRequestException(e.getMessage());
        }
    }

    private void doSet(ColumnFamily cf, ColumnNameBuilder builder, UpdateParameters params, CollectionType validator, List<Pair<ByteBuffer, IColumn>> list) throws InvalidRequestException
    {
        int idx = validateListIdx(values.get(0), list);
        Term value = values.get(1);

        ByteBuffer name = list.get(idx).right.name();
        cf.addColumn(params.makeColumn(name, value.getByteBuffer(validator.valueComparator(), params.variables)));
    }

    private void doAppend(ColumnFamily cf, ColumnNameBuilder builder, CollectionType validator, UpdateParameters params) throws InvalidRequestException
    {
        for (int i = 0; i < values.size(); i++)
        {
            ColumnNameBuilder b = i == values.size() - 1 ? builder : builder.copy();
            ByteBuffer uuid = ByteBuffer.wrap(UUIDGen.getTimeUUIDBytes());
            ByteBuffer name = b.add(uuid).build();
            cf.addColumn(params.makeColumn(name, values.get(i).getByteBuffer(validator.valueComparator(), params.variables)));
        }
    }

    private void doPrepend(ColumnFamily cf, ColumnNameBuilder builder, CollectionType validator, UpdateParameters params) throws InvalidRequestException
    {
        long time = REFERENCE_TIME - (System.currentTimeMillis() - REFERENCE_TIME);

        for (int i = 0; i < values.size(); i++)
        {
            ColumnNameBuilder b = i == values.size() - 1 ? builder : builder.copy();
            PrecisionTime pt = getNextTime(time);
            ByteBuffer uuid = ByteBuffer.wrap(UUIDGen.getTimeUUIDBytes(pt.millis, pt.nanos));
            ByteBuffer name = b.add(uuid).build();
            cf.addColumn(params.makeColumn(name, values.get(i).getByteBuffer(validator.valueComparator(), params.variables)));
        }
    }

    private void doDiscard(ColumnFamily cf, CollectionType validator, UpdateParameters params, List<Pair<ByteBuffer, IColumn>> list) throws InvalidRequestException
    {
        if (list == null)
            return;

        Set<ByteBuffer> toDiscard = new HashSet<ByteBuffer>();

        for (Term value : values)
            toDiscard.add(value.getByteBuffer(validator.valueComparator(), params.variables));

        for (Pair<ByteBuffer, IColumn> p : list)
        {
            IColumn c = p.right;
            if (toDiscard.contains(c.value()))
                cf.addColumn(params.makeTombstone(c.name()));
        }
    }

    private void doDiscardIdx(ColumnFamily cf, UpdateParameters params, List<Pair<ByteBuffer, IColumn>> list) throws InvalidRequestException
    {
        int idx = validateListIdx(values.get(0), list);
        cf.addColumn(params.makeTombstone(list.get(idx).right.name()));
    }

    public void addBoundNames(ColumnSpecification column, ColumnSpecification[] boundNames) throws InvalidRequestException
    {
        // Since the parser couldn't disambiguate between a 'list set by idx'
        // and a 'map put by key', we have to do it now.
        if (kind == Kind.SET_IDX && (column.type instanceof MapType))
        {
            assert values.size() == 2;
            MapOperation.Put(values.get(0), values.get(1)).addBoundNames(column, boundNames);
            return;
        }

        if (!(column.type instanceof ListType))
            throw new InvalidRequestException(String.format("Invalid operation, %s is not of list type", column.name));

        ListType lt = (ListType)column.type;
        if (kind == Kind.SET_IDX)
        {
            assert values.size() == 2;
            Term idx = values.get(0);
            Term value = values.get(1);
            if (idx.isBindMarker())
                boundNames[idx.bindIndex] = indexSpecOf(column);
            if (value.isBindMarker())
                boundNames[value.bindIndex] = valueSpecOf(column, lt);
        }
        else
        {
            for (Term t : values)
                if (t.isBindMarker())
                    boundNames[t.bindIndex] = column;
        }
    }

    public static ColumnSpecification indexSpecOf(ColumnSpecification column)
    {
        return new ColumnSpecification(column.ksName, column.cfName, new ColumnIdentifier("idx(" + column.name + ")", true), Int32Type.instance);
    }

    public static ColumnSpecification valueSpecOf(ColumnSpecification column, ListType type)
    {
        return new ColumnSpecification(column.ksName, column.cfName, new ColumnIdentifier("value(" + column.name + ")", true), type.elements);
    }

    public List<Term> getValues()
    {
        return values;
    }

    public boolean requiresRead(AbstractType<?> validator)
    {
        return kind == Kind.DISCARD || kind == Kind.DISCARD_IDX || kind == Kind.SET_IDX;
    }

    public Type getType()
    {
        return Type.LIST;
    }

    /* Utility methods */

    public static Operation Set(List<Term> values)
    {
        return new ListOperation(values, Kind.SET);
    }

    public static Operation SetIndex(List<Term> values)
    {
        return new ListOperation(values, Kind.SET_IDX);
    }

    public static Operation Append(List<Term> values)
    {
        return new ListOperation(values, Kind.APPEND);
    }

    public static Operation Prepend(List<Term> values)
    {
        return new ListOperation(values, Kind.PREPEND);
    }

    public static Operation Discard(List<Term> values)
    {
        return new ListOperation(values, Kind.DISCARD);
    }

    public static Operation DiscardKey(List<Term> values)
    {
        return new ListOperation(values, Kind.DISCARD_IDX);
    }

    @Override
    public String toString()
    {
        return "ListOperation(" + kind + ", " + values + ")";
    }

    private int validateListIdx(Term value, List<Pair<ByteBuffer, IColumn>> list) throws InvalidRequestException
    {
        try
        {
            if (value.getType() != Term.Type.INTEGER)
                throw new InvalidRequestException(String.format("Invalid argument %s for %s, must be an integer.", value.getText(), getType()));

            int idx = Integer.parseInt(value.getText());
            if (list == null || list.size() <= idx)
                throw new InvalidRequestException(String.format("Invalid index %d, list has size %d", idx, list == null ? 0 : list.size()));

            return idx;
        }
        catch (NumberFormatException e)
        {
            // This should not happen, unless we screwed up the parser
            throw new RuntimeException();
        }
    }
}
