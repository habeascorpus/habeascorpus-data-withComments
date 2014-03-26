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
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
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
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
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
ISSTableSerializer	TokenNameIdentifier	 ISS Table Serializer
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
Descriptor	TokenNameIdentifier	 Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
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
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnFamilySerializer	TokenNameIdentifier	 Column Family Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
,	TokenNameCOMMA	
ISSTableSerializer	TokenNameIdentifier	 ISS Table Serializer
<	TokenNameLESS	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
{	TokenNameLBRACE	
/* * Serialized ColumnFamily format: * * [serialized for intra-node writes only, e.g. returning a query result] * <cf nullability boolean: false if the cf is null> * <cf id> * * [in sstable only] * <column bloom filter> * <sparse column index, start/finish columns every ColumnIndexSizeInKB of data> * * [always present] * <local deletion time> * <client-provided deletion time> * <column count> * <columns, serialized individually> */	TokenNameCOMMENT_BLOCK	 Serialized ColumnFamily format: * [serialized for intra-node writes only, e.g. returning a query result] <cf nullability boolean: false if the cf is null> <cf id> * [in sstable only] <column bloom filter> <sparse column index, start/finish columns every ColumnIndexSizeInKB of data> * [always present] <local deletion time> <client-provided deletion time> <column count> <columns, serialized individually> 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializeCfId	TokenNameIdentifier	 serialize Cf Id
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
columnSerializer	TokenNameIdentifier	 column Serializer
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnSerializer	TokenNameIdentifier	 get Column Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
written	TokenNameIdentifier	 written
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columnSerializer	TokenNameIdentifier	 column Serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
written	TokenNameIdentifier	 written
:	TokenNameCOLON	
"Column family had "	TokenNameStringLiteral	Column family had 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" columns, but "	TokenNameStringLiteral	 columns, but 
+	TokenNamePLUS	
written	TokenNameIdentifier	 written
+	TokenNamePLUS	
" written"	TokenNameStringLiteral	 written
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
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
return	TokenNamereturn	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
LOCAL	TokenNameIdentifier	 LOCAL
,	TokenNameCOMMA	
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
deserializeCfId	TokenNameIdentifier	 deserialize Cf Id
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
columnSerializer	TokenNameIdentifier	 column Serializer
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnSerializer	TokenNameIdentifier	 get Column Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expireBefore	TokenNameIdentifier	 expire Before
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
columnSerializer	TokenNameIdentifier	 column Serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
contentSerializedSize	TokenNameIdentifier	 content Serialized Size
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
/* nullness bool */	TokenNameCOMMENT_BLOCK	 nullness bool 
+	TokenNamePLUS	
cfIdSerializedSize	TokenNameIdentifier	 cf Id Serialized Size
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
id	TokenNameIdentifier	 id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
/* id */	TokenNameCOMMENT_BLOCK	 id 
+	TokenNamePLUS	
contentSerializedSize	TokenNameIdentifier	 content Serialized Size
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Column families shouldn't be written directly to disk, use ColumnIndex.Builder instead 	TokenNameCOMMENT_LINE	Column families shouldn't be written directly to disk, use ColumnIndex.Builder instead 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deserializeColumnsFromSSTable	TokenNameIdentifier	 deserialize Columns From SS Table
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
int	TokenNameint	
expireBefore	TokenNameIdentifier	 expire Before
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
atomSerializer	TokenNameIdentifier	 atom Serializer
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getOnDiskSerializer	TokenNameIdentifier	 get On Disk Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addAtom	TokenNameIdentifier	 add Atom
(	TokenNameLPAREN	
atomSerializer	TokenNameIdentifier	 atom Serializer
.	TokenNameDOT	
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expireBefore	TokenNameIdentifier	 expire Before
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deserializeColumnsFromSSTable	TokenNameIdentifier	 deserialize Columns From SS Table
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serializeCfId	TokenNameIdentifier	 serialize Cf Id
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
cfId	TokenNameIdentifier	 cf Id
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
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
// try to use CF's old id where possible (CASSANDRA-3794) 	TokenNameCOMMENT_LINE	try to use CF's old id where possible (CASSANDRA-3794) 
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
oldId	TokenNameIdentifier	 old Id
=	TokenNameEQUAL	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
convertNewCfId	TokenNameIdentifier	 convert New Cf Id
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldId	TokenNameIdentifier	 old Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Can't serialize ColumnFamily ID "	TokenNameStringLiteral	Can't serialize ColumnFamily ID 
+	TokenNamePLUS	
cfId	TokenNameIdentifier	 cf Id
+	TokenNamePLUS	
" to be used by version "	TokenNameStringLiteral	 to be used by version 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
", because int <-> uuid mapping could not be established (CF was created in mixed version cluster)."	TokenNameStringLiteral	, because int <-> uuid mapping could not be established (CF was created in mixed version cluster).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
oldId	TokenNameIdentifier	 old Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UUID	TokenNameIdentifier	 UUID
deserializeCfId	TokenNameIdentifier	 deserialize Cf Id
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
// create a ColumnFamily based on the cf id 	TokenNameCOMMENT_LINE	create a ColumnFamily based on the cf id 
UUID	TokenNameIdentifier	 UUID
cfId	TokenNameIdentifier	 cf Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
convertOldCfId	TokenNameIdentifier	 convert Old Cf Id
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
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
if	TokenNameif	
(	TokenNameLPAREN	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getCF	TokenNameIdentifier	 get CF
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnknownColumnFamilyException	TokenNameIdentifier	 Unknown Column Family Exception
(	TokenNameLPAREN	
"Couldn't find cfId="	TokenNameStringLiteral	Couldn't find cfId=
+	TokenNamePLUS	
cfId	TokenNameIdentifier	 cf Id
,	TokenNameCOMMA	
cfId	TokenNameIdentifier	 cf Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cfId	TokenNameIdentifier	 cf Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
cfIdSerializedSize	TokenNameIdentifier	 cf Id Serialized Size
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
cfId	TokenNameIdentifier	 cf Id
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
// try to use CF's old id where possible (CASSANDRA-3794) 	TokenNameCOMMENT_LINE	try to use CF's old id where possible (CASSANDRA-3794) 
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
oldId	TokenNameIdentifier	 old Id
=	TokenNameEQUAL	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
convertNewCfId	TokenNameIdentifier	 convert New Cf Id
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldId	TokenNameIdentifier	 old Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Can't serialize ColumnFamily ID "	TokenNameStringLiteral	Can't serialize ColumnFamily ID 
+	TokenNamePLUS	
cfId	TokenNameIdentifier	 cf Id
+	TokenNamePLUS	
" to be used by version "	TokenNameStringLiteral	 to be used by version 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
", because int <-> uuid mapping could not be established (CF was created in mixed version cluster)."	TokenNameStringLiteral	, because int <-> uuid mapping could not be established (CF was created in mixed version cluster).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
oldId	TokenNameIdentifier	 old Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
