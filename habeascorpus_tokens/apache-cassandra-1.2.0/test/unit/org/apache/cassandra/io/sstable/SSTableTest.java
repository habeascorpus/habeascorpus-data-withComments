/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
SchemaLoader	TokenNameIdentifier	 Schema Loader
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
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
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
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableTest	TokenNameIdentifier	 SS Table Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSingleWrite	TokenNameIdentifier	 test Single Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// write test data 	TokenNameCOMMENT_LINE	write test data 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cbytes	TokenNameIdentifier	 cbytes
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextBytes	TokenNameIdentifier	 next Bytes
(	TokenNameLPAREN	
cbytes	TokenNameIdentifier	 cbytes
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
cbytes	TokenNameIdentifier	 cbytes
,	TokenNameCOMMA	
cbytes	TokenNameIdentifier	 cbytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableReader	TokenNameIdentifier	 SS Table Reader
ssTable	TokenNameIdentifier	 ss Table
=	TokenNameEQUAL	
SSTableUtils	TokenNameIdentifier	 SS Table Utils
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
cf	TokenNameIdentifier	 cf
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify 	TokenNameCOMMENT_LINE	verify 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verifySingle	TokenNameIdentifier	 verify Single
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ssTable	TokenNameIdentifier	 ss Table
=	TokenNameEQUAL	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the index from disk 	TokenNameCOMMENT_LINE	read the index from disk 
verifySingle	TokenNameIdentifier	 verify Single
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
verifySingle	TokenNameIdentifier	 verify Single
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
openDataReader	TokenNameIdentifier	 open Data Reader
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
Operator	TokenNameIdentifier	 Operator
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
readRowSize	TokenNameIdentifier	 read Row Size
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes2	TokenNameIdentifier	 bytes2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
bytes2	TokenNameIdentifier	 bytes2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bytes2	TokenNameIdentifier	 bytes2
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testManyWrites	TokenNameIdentifier	 test Many Writes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
bytesMap	TokenNameIdentifier	 bytes Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//for (int i = 100; i < 1000; ++i) 	TokenNameCOMMENT_LINE	for (int i = 100; i < 1000; ++i) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
300	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard2"	TokenNameStringLiteral	Standard2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"Avinash Lakshman is a good man: "	TokenNameStringLiteral	Avinash Lakshman is a good man: 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesMap	TokenNameIdentifier	 bytes Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// write 	TokenNameCOMMENT_LINE	write 
SSTableReader	TokenNameIdentifier	 SS Table Reader
ssTable	TokenNameIdentifier	 ss Table
=	TokenNameEQUAL	
SSTableUtils	TokenNameIdentifier	 SS Table Utils
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
cf	TokenNameIdentifier	 cf
(	TokenNameLPAREN	
"Standard2"	TokenNameStringLiteral	Standard2
)	TokenNameRPAREN	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify 	TokenNameCOMMENT_LINE	verify 
verifyMany	TokenNameIdentifier	 verify Many
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
,	TokenNameCOMMA	
bytesMap	TokenNameIdentifier	 bytes Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ssTable	TokenNameIdentifier	 ss Table
=	TokenNameEQUAL	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the index from disk 	TokenNameCOMMENT_LINE	read the index from disk 
verifyMany	TokenNameIdentifier	 verify Many
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
,	TokenNameCOMMA	
bytesMap	TokenNameIdentifier	 bytes Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Component	TokenNameIdentifier	 Component
>	TokenNameGREATER	
live	TokenNameIdentifier	 live
=	TokenNameEQUAL	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
componentsFor	TokenNameIdentifier	 components For
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
live	TokenNameIdentifier	 live
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"SSTable has no live components"	TokenNameStringLiteral	SSTable has no live components
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Component	TokenNameIdentifier	 Component
>	TokenNameGREATER	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
componentsFor	TokenNameIdentifier	 components For
(	TokenNameLPAREN	
ssTable	TokenNameIdentifier	 ss Table
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
asTemporary	TokenNameIdentifier	 as Temporary
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"SSTable has unexpected temp components"	TokenNameStringLiteral	SSTable has unexpected temp components
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
verifyMany	TokenNameIdentifier	 verify Many
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Collections.shuffle(keys); 	TokenNameCOMMENT_LINE	Collections.shuffle(keys); 
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
openDataReader	TokenNameIdentifier	 open Data Reader
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
:	TokenNameCOLON	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
Operator	TokenNameIdentifier	 Operator
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
readRowSize	TokenNameIdentifier	 read Row Size
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes2	TokenNameIdentifier	 bytes2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
bytes2	TokenNameIdentifier	 bytes2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bytes2	TokenNameIdentifier	 bytes2
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
