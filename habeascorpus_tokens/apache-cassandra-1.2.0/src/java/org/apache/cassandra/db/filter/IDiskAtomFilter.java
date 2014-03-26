/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
*	TokenNameMULTIPLY	
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AbstractType	TokenNameIdentifier	 Abstract Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableReader	TokenNameIdentifier	 SS Table Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileDataInput	TokenNameIdentifier	 File Data Input
;	TokenNameSEMICOLON	
/** * Given an implementation-specific description of what columns to look for, provides methods * to extract the desired columns from a Memtable, SSTable, or SuperColumn. Either the get*ColumnIterator * methods will be called, or filterSuperColumn, but not both on the same object. QueryFilter * takes care of putting the two together if subcolumn filtering needs to be done, based on the * querypath that it knows (but that IFilter implementations are oblivious to). */	TokenNameCOMMENT_JAVADOC	 Given an implementation-specific description of what columns to look for, provides methods to extract the desired columns from a Memtable, SSTable, or SuperColumn. Either the get*ColumnIterator methods will be called, or filterSuperColumn, but not both on the same object. QueryFilter takes care of putting the two together if subcolumn filtering needs to be done, based on the querypath that it knows (but that IFilter implementations are oblivious to). 
public	TokenNamepublic	
interface	TokenNameinterface	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
{	TokenNameLBRACE	
/** * returns an iterator that returns columns from the given memtable * matching the Filter criteria in sorted order. */	TokenNameCOMMENT_JAVADOC	 returns an iterator that returns columns from the given memtable matching the Filter criteria in sorted order. 
public	TokenNamepublic	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
getMemtableColumnIterator	TokenNameIdentifier	 get Memtable Column Iterator
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get an iterator that returns columns from the given SSTable using the opened file * matching the Filter criteria in sorted order. * @param sstable * @param file Already opened file data input, saves us opening another one * @param key The key of the row we are about to iterate over */	TokenNameCOMMENT_JAVADOC	 Get an iterator that returns columns from the given SSTable using the opened file matching the Filter criteria in sorted order. @param sstable @param file Already opened file data input, saves us opening another one @param key The key of the row we are about to iterate over 
public	TokenNamepublic	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
FileDataInput	TokenNameIdentifier	 File Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
indexEntry	TokenNameIdentifier	 index Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * returns an iterator that returns columns from the given SSTable * matching the Filter criteria in sorted order. */	TokenNameCOMMENT_JAVADOC	 returns an iterator that returns columns from the given SSTable matching the Filter criteria in sorted order. 
public	TokenNamepublic	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
getSSTableColumnIterator	TokenNameIdentifier	 get SS Table Column Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * collects columns from reducedColumns into returnCF. Termination is determined * by the filter code, which should have some limit on the number of columns * to avoid running out of memory on large rows. */	TokenNameCOMMENT_JAVADOC	 collects columns from reducedColumns into returnCF. Termination is determined by the filter code, which should have some limit on the number of columns to avoid running out of memory on large rows. 
public	TokenNamepublic	
void	TokenNamevoid	
collectReducedColumns	TokenNameIdentifier	 collect Reduced Columns
(	TokenNameLPAREN	
IColumnContainer	TokenNameIdentifier	 I Column Container
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
reducedColumns	TokenNameIdentifier	 reduced Columns
,	TokenNameCOMMA	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * subcolumns of a supercolumn are unindexed, so to pick out parts of those we operate in-memory. * @param superColumn may be modified by filtering op. */	TokenNameCOMMENT_JAVADOC	 subcolumns of a supercolumn are unindexed, so to pick out parts of those we operate in-memory. @param superColumn may be modified by filtering op. 
public	TokenNamepublic	
SuperColumn	TokenNameIdentifier	 Super Column
filterSuperColumn	TokenNameIdentifier	 filter Super Column
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
superColumn	TokenNameIdentifier	 super Column
,	TokenNameCOMMA	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
getColumnComparator	TokenNameIdentifier	 get Column Comparator
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isReversed	TokenNameIdentifier	 is Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
updateColumnsLimit	TokenNameIdentifier	 update Columns Limit
(	TokenNameLPAREN	
int	TokenNameint	
newLimit	TokenNameIdentifier	 new Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getLiveCount	TokenNameIdentifier	 get Live Count
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Serializer	TokenNameIdentifier	 Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Serializer	TokenNameIdentifier	 Serializer
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
Serializer	TokenNameIdentifier	 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
IDiskAtomFilter	TokenNameIdentifier	 I Disk Atom Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
instanceof	TokenNameinstanceof	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SliceQueryFilter	TokenNameIdentifier	 Slice Query Filter
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamesQueryFilter	TokenNameIdentifier	 Names Query Filter
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
