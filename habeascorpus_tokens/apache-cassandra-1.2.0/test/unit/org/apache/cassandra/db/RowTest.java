/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
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
AsciiType	TokenNameIdentifier	 Ascii Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
column	TokenNameIdentifier	 column
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
public	TokenNamepublic	
class	TokenNameclass	
RowTest	TokenNameIdentifier	 Row Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDiffColumnFamily	TokenNameIdentifier	 test Diff Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"onev"	TokenNameStringLiteral	onev
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
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
DeletionInfo	TokenNameIdentifier	 Deletion Info
delInfo	TokenNameIdentifier	 del Info
=	TokenNameEQUAL	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cfDiff	TokenNameIdentifier	 cf Diff
=	TokenNameEQUAL	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
cf2	TokenNameIdentifier	 cf2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
cfDiff	TokenNameIdentifier	 cf Diff
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
cfDiff	TokenNameIdentifier	 cf Diff
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDiffSuperColumn	TokenNameIdentifier	 test Diff Super Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SuperColumn	TokenNameIdentifier	 Super Column
sc1	TokenNameIdentifier	 sc1
=	TokenNameEQUAL	
new	TokenNamenew	
SuperColumn	TokenNameIdentifier	 Super Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
,	TokenNameCOMMA	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc1	TokenNameIdentifier	 sc1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"subcolumn"	TokenNameStringLiteral	subcolumn
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SuperColumn	TokenNameIdentifier	 Super Column
sc2	TokenNameIdentifier	 sc2
=	TokenNameEQUAL	
new	TokenNamenew	
SuperColumn	TokenNameIdentifier	 Super Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
,	TokenNameCOMMA	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeletionInfo	TokenNameIdentifier	 Deletion Info
delInfo	TokenNameIdentifier	 del Info
=	TokenNameEQUAL	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc2	TokenNameIdentifier	 sc2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SuperColumn	TokenNameIdentifier	 Super Column
scDiff	TokenNameIdentifier	 sc Diff
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SuperColumn	TokenNameIdentifier	 Super Column
)	TokenNameRPAREN	
sc1	TokenNameIdentifier	 sc1
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
sc2	TokenNameIdentifier	 sc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
scDiff	TokenNameIdentifier	 sc Diff
.	TokenNameDOT	
getSubColumns	TokenNameIdentifier	 get Sub Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
scDiff	TokenNameIdentifier	 sc Diff
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
delInfo	TokenNameIdentifier	 del Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResolve	TokenNameIdentifier	 test Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf1	TokenNameIdentifier	 cf1
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
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf2	TokenNameIdentifier	 cf2
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
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf2	TokenNameIdentifier	 cf2
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
cf2	TokenNameIdentifier	 cf2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cf1	TokenNameIdentifier	 cf1
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExpiringColumnExpiration	TokenNameIdentifier	 test Expiring Column Expiration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Column	TokenNameIdentifier	 Column
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Because we keep the local deletion time with a precision of a 	TokenNameCOMMENT_LINE	Because we keep the local deletion time with a precision of a 
// second, we could have to wait 2 seconds in worst case scenario. 	TokenNameCOMMENT_LINE	second, we could have to wait 2 seconds in worst case scenario. 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Cannot test column expiration if you wake me up too early"	TokenNameStringLiteral	Cannot test column expiration if you wake me up too early
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getMarkedForDeleteAt	TokenNameIdentifier	 get Marked For Delete At
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
