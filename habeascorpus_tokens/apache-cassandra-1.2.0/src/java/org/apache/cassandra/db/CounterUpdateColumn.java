/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
CounterContext	TokenNameIdentifier	 Counter Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Allocator	TokenNameIdentifier	 Allocator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
;	TokenNameSEMICOLON	
/** * A counter update while it hasn't been applied yet by the leader replica. * * Contains a single counter update. When applied by the leader replica, this * is transformed to a relevant CounterColumn. This Column is a temporary data * structure that should never be stored inside a memtable or an sstable. */	TokenNameCOMMENT_JAVADOC	 A counter update while it hasn't been applied yet by the leader replica. * Contains a single counter update. When applied by the leader replica, this is transformed to a relevant CounterColumn. This Column is a temporary data structure that should never be stored inside a memtable or an sstable. 
public	TokenNamepublic	
class	TokenNameclass	
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
extends	TokenNameextends	
Column	TokenNameIdentifier	 Column
{	TokenNameLBRACE	
public	TokenNamepublic	
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
long	TokenNamelong	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
delta	TokenNameIdentifier	 delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Diff is used during reads, but we should never read those columns 	TokenNameCOMMENT_LINE	Diff is used during reads, but we should never read those columns 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"This operation is unsupported on CounterUpdateColumn."	TokenNameStringLiteral	This operation is unsupported on CounterUpdateColumn.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
reconcile	TokenNameIdentifier	 reconcile
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The only time this could happen is if a batchAdd ships two 	TokenNameCOMMENT_LINE	The only time this could happen is if a batchAdd ships two 
// increment for the same column. Hence we simply sums the delta. 	TokenNameCOMMENT_LINE	increment for the same column. Hence we simply sums the delta. 
assert	TokenNameassert	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
instanceof	TokenNameinstanceof	
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
instanceof	TokenNameinstanceof	
DeletedColumn	TokenNameIdentifier	 Deleted Column
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Wrong class type."	TokenNameStringLiteral	Wrong class type.
;	TokenNameSEMICOLON	
// tombstones take precedence 	TokenNameCOMMENT_LINE	tombstones take precedence 
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
// neither is tombstoned 	TokenNameCOMMENT_LINE	neither is tombstoned 
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
)	TokenNameRPAREN	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CounterUpdateColumn	TokenNameIdentifier	 Counter Update Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
delta	TokenNameIdentifier	 delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
serializationFlags	TokenNameIdentifier	 serialization Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
COUNTER_UPDATE_MASK	TokenNameIdentifier	 COUNTER  UPDATE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CounterColumn	TokenNameIdentifier	 Counter Column
localCopy	TokenNameIdentifier	 local Copy
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CounterColumn	TokenNameIdentifier	 Counter Column
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
internOrCopy	TokenNameIdentifier	 intern Or Copy
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CounterContext	TokenNameIdentifier	 Counter Context
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
localCopy	TokenNameIdentifier	 local Copy
(	TokenNameLPAREN	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CounterColumn	TokenNameIdentifier	 Counter Column
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
internOrCopy	TokenNameIdentifier	 intern Or Copy
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CounterContext	TokenNameIdentifier	 Counter Context
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
