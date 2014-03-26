/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
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
SchemaLoader	TokenNameIdentifier	 Schema Loader
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
IdentityQueryFilter	TokenNameIdentifier	 Identity Query Filter
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
QueryPath	TokenNameIdentifier	 Query Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
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
config	TokenNameIdentifier	 config
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
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
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
*	TokenNameMULTIPLY	
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
dk	TokenNameIdentifier	 dk
;	TokenNameSEMICOLON	
/** * Test cases where multiple keys collides, ie have the same token. * Order preserving partitioner have no possible collision and creating * collision for the RandomPartitioner is ... difficult, so we create a dumb * length partitioner that takes the length of the key as token, making * collision easy and predictable. */	TokenNameCOMMENT_JAVADOC	 Test cases where multiple keys collides, ie have the same token. Order preserving partitioner have no possible collision and creating collision for the RandomPartitioner is ... difficult, so we create a dumb length partitioner that takes the length of the key as token, making collision easy and predictable. 
public	TokenNamepublic	
class	TokenNameclass	
KeyCollisionTest	TokenNameIdentifier	 Key Collision Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
IPartitioner	TokenNameIdentifier	 I Partitioner
oldPartitioner	TokenNameIdentifier	 old Partitioner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEYSPACE	TokenNameIdentifier	 KEYSPACE
=	TokenNameEQUAL	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CF	TokenNameIdentifier	 CF
=	TokenNameEQUAL	
"Standard1"	TokenNameStringLiteral	Standard1
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldPartitioner	TokenNameIdentifier	 old Partitioner
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
setPartitioner	TokenNameIdentifier	 set Partitioner
(	TokenNameLPAREN	
new	TokenNamenew	
LengthPartitioner	TokenNameIdentifier	 Length Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
setPartitioner	TokenNameIdentifier	 set Partitioner
(	TokenNameLPAREN	
oldPartitioner	TokenNameIdentifier	 old Partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetSliceWithCollision	TokenNameIdentifier	 test Get Slice With Collision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Table	TokenNameIdentifier	 Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
CF	TokenNameIdentifier	 CF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
clearUnsafe	TokenNameIdentifier	 clear Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"k1"	TokenNameStringLiteral	k1
,	TokenNameCOMMA	
"k2"	TokenNameStringLiteral	k2
,	TokenNameCOMMA	
"k3"	TokenNameStringLiteral	k3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// token = 2 	TokenNameCOMMENT_LINE	token = 2 
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
,	TokenNameCOMMA	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"key3"	TokenNameStringLiteral	key3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// token = 4 	TokenNameCOMMENT_LINE	token = 4 
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"longKey1"	TokenNameStringLiteral	longKey1
,	TokenNameCOMMA	
"longKey2"	TokenNameStringLiteral	longKey2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// token = 8 	TokenNameCOMMENT_LINE	token = 8 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
getRangeSlice	TokenNameIdentifier	 get Range Slice
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Bounds	TokenNameIdentifier	 Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"k2"	TokenNameStringLiteral	k2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
IdentityQueryFilter	TokenNameIdentifier	 Identity Query Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 4 keys, got "	TokenNameStringLiteral	Expecting 4 keys, got 
+	TokenNamePLUS	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k2"	TokenNameStringLiteral	k2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k3"	TokenNameStringLiteral	k3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
:	TokenNameCOLON	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
CF	TokenNameIdentifier	 CF
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"column"	TokenNameStringLiteral	column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"asdf"	TokenNameStringLiteral	asdf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
LengthPartitioner	TokenNameIdentifier	 Length Partitioner
extends	TokenNameextends	
AbstractPartitioner	TokenNameIdentifier	 Abstract Partitioner
<	TokenNameLESS	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
ZERO	TokenNameIdentifier	 ZERO
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
MINIMUM	TokenNameIdentifier	 MINIMUM
=	TokenNameEQUAL	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"-1"	TokenNameStringLiteral	-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
DELIMITER_BYTE	TokenNameIdentifier	 DELIMITER  BYTE
=	TokenNameEQUAL	
":"	TokenNameStringLiteral	:
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DecoratedKey	TokenNameIdentifier	 Decorated Key
(	TokenNameLPAREN	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
convertFromDiskFormat	TokenNameIdentifier	 convert From Disk Format
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromdisk	TokenNameIdentifier	 fromdisk
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
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
ltoken	TokenNameIdentifier	 ltoken
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the symbolic MINIMUM token should act as ZERO: the empty bit array 	TokenNameCOMMENT_LINE	the symbolic MINIMUM token should act as ZERO: the empty bit array 
BigInteger	TokenNameIdentifier	 Big Integer
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ltoken	TokenNameIdentifier	 ltoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MINIMUM	TokenNameIdentifier	 MINIMUM
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ZERO	TokenNameIdentifier	 ZERO
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
ltoken	TokenNameIdentifier	 ltoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
rtoken	TokenNameIdentifier	 rtoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MINIMUM	TokenNameIdentifier	 MINIMUM
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ZERO	TokenNameIdentifier	 ZERO
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
midpair	TokenNameIdentifier	 midpair
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// discard the remainder 	TokenNameCOMMENT_LINE	discard the remainder 
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
midpair	TokenNameIdentifier	 midpair
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
tokenFactory	TokenNameIdentifier	 token Factory
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenFactory	TokenNameIdentifier	 token Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
preservesOrder	TokenNameIdentifier	 preserves Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
describeOwnership	TokenNameIdentifier	 describe Ownership
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
sortedTokens	TokenNameIdentifier	 sorted Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// allTokens will contain the count and be returned, sorted_ranges is shorthand for token<->token math. 	TokenNameCOMMENT_LINE	allTokens will contain the count and be returned, sorted_ranges is shorthand for token<->token math. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
allTokens	TokenNameIdentifier	 all Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
sortedRanges	TokenNameIdentifier	 sorted Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this initializes the counts to 0 and calcs the ranges in order. 	TokenNameCOMMENT_LINE	this initializes the counts to 0 and calcs the ranges in order. 
Token	TokenNameIdentifier	 Token
lastToken	TokenNameIdentifier	 last Token
=	TokenNameEQUAL	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
node	TokenNameIdentifier	 node
:	TokenNameCOLON	
sortedTokens	TokenNameIdentifier	 sorted Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortedRanges	TokenNameIdentifier	 sorted Ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
lastToken	TokenNameIdentifier	 last Token
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastToken	TokenNameIdentifier	 last Token
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ks	TokenNameIdentifier	 ks
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTables	TokenNameIdentifier	 get Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfmd	TokenNameIdentifier	 cfmd
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getKSMetaData	TokenNameIdentifier	 get KS Meta Data
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
)	TokenNameRPAREN	
.	TokenNameDOT	
cfMetaData	TokenNameIdentifier	 cf Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
sortedRanges	TokenNameIdentifier	 sorted Ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Looping over every KS:CF:Range, get the splits size and add it to the count 	TokenNameCOMMENT_LINE	Looping over every KS:CF:Range, get the splits size and add it to the count 
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
+	TokenNamePLUS	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSplits	TokenNameIdentifier	 get Splits
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
,	TokenNameCOMMA	
cfmd	TokenNameIdentifier	 cfmd
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Sum every count up and divide count/total for the fractional ownership. 	TokenNameCOMMENT_LINE	Sum every count up and divide count/total for the fractional ownership. 
Float	TokenNameIdentifier	 Float
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
allTokens	TokenNameIdentifier	 all Tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
