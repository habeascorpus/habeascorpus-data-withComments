package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
ColumnFamily	TokenNameIdentifier	 Column Family
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
googlecode	TokenNameIdentifier	 googlecode
.	TokenNameDOT	
concurrentlinkedhashmap	TokenNameIdentifier	 concurrentlinkedhashmap
.	TokenNameDOT	
Weighers	TokenNameIdentifier	 Weighers
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
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CacheProviderTest	TokenNameIdentifier	 Cache Provider Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key1	TokenNameIdentifier	 key1
=	TokenNameEQUAL	
"key1"	TokenNameStringLiteral	key1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key2	TokenNameIdentifier	 key2
=	TokenNameEQUAL	
"key2"	TokenNameStringLiteral	key2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key3	TokenNameIdentifier	 key3
=	TokenNameEQUAL	
"key3"	TokenNameStringLiteral	key3
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key4	TokenNameIdentifier	 key4
=	TokenNameEQUAL	
"key4"	TokenNameStringLiteral	key4
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key5	TokenNameIdentifier	 key5
=	TokenNameEQUAL	
"key5"	TokenNameStringLiteral	key5
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
CAPACITY	TokenNameIdentifier	 CAPACITY
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
=	TokenNameEQUAL	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
=	TokenNameEQUAL	
"Standard1"	TokenNameStringLiteral	Standard1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
simpleCase	TokenNameIdentifier	 simple Case
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assertDigests	TokenNameIdentifier	 assert Digests
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key2	TokenNameIdentifier	 key2
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key3	TokenNameIdentifier	 key3
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key4	TokenNameIdentifier	 key4
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key5	TokenNameIdentifier	 key5
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CAPACITY	TokenNameIdentifier	 CAPACITY
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertDigests	TokenNameIdentifier	 assert Digests
(	TokenNameLPAREN	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
one	TokenNameIdentifier	 one
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CF does not implement .equals 	TokenNameCOMMENT_LINE	CF does not implement .equals 
assert	TokenNameassert	
one	TokenNameIdentifier	 one
instanceof	TokenNameinstanceof	
ColumnFamily	TokenNameIdentifier	 Column Family
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
)	TokenNameRPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO this isn't terribly useful 	TokenNameCOMMENT_LINE	TODO this isn't terribly useful 
private	TokenNameprivate	
void	TokenNamevoid	
concurrentCase	TokenNameIdentifier	 concurrent Case
(	TokenNameLPAREN	
final	TokenNamefinal	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
final	TokenNamefinal	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
Runnable	TokenNameIdentifier	 Runnable
runable	TokenNameIdentifier	 runable
=	TokenNameEQUAL	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key2	TokenNameIdentifier	 key2
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key3	TokenNameIdentifier	 key3
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key4	TokenNameIdentifier	 key4
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key5	TokenNameIdentifier	 key5
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
>	TokenNameGREATER	
threads	TokenNameIdentifier	 threads
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
>	TokenNameGREATER	
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
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
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
runable	TokenNameIdentifier	 runable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threads	TokenNameIdentifier	 threads
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
thread	TokenNameIdentifier	 thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
:	TokenNameCOLON	
threads	TokenNameIdentifier	 threads
)	TokenNameRPAREN	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ColumnFamily	TokenNameIdentifier	 Column Family
createCF	TokenNameIdentifier	 create CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"vijay"	TokenNameStringLiteral	vijay
,	TokenNameCOMMA	
"great"	TokenNameStringLiteral	great
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"awesome"	TokenNameStringLiteral	awesome
,	TokenNameCOMMA	
"vijay"	TokenNameStringLiteral	vijay
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testHeapCache	TokenNameIdentifier	 test Heap Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
ConcurrentLinkedHashCache	TokenNameIdentifier	 Concurrent Linked Hash Cache
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
CAPACITY	TokenNameIdentifier	 CAPACITY
,	TokenNameCOMMA	
Weighers	TokenNameIdentifier	 Weighers
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
entrySingleton	TokenNameIdentifier	 entry Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
createCF	TokenNameIdentifier	 create CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleCase	TokenNameIdentifier	 simple Case
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
concurrentCase	TokenNameIdentifier	 concurrent Case
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSerializingCache	TokenNameIdentifier	 test Serializing Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
SerializingCache	TokenNameIdentifier	 Serializing Cache
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
CAPACITY	TokenNameIdentifier	 CAPACITY
,	TokenNameCOMMA	
Weighers	TokenNameIdentifier	 Weighers
.	TokenNameDOT	
<	TokenNameLESS	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
>	TokenNameGREATER	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SerializingCacheProvider	TokenNameIdentifier	 Serializing Cache Provider
.	TokenNameDOT	
RowCacheSerializer	TokenNameIdentifier	 Row Cache Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
createCF	TokenNameIdentifier	 create CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleCase	TokenNameIdentifier	 simple Case
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
concurrentCase	TokenNameIdentifier	 concurrent Case
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testKeys	TokenNameIdentifier	 test Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
cfId	TokenNameIdentifier	 cf Id
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
randomUUID	TokenNameIdentifier	 random UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
key1	TokenNameIdentifier	 key1
=	TokenNameEQUAL	
new	TokenNamenew	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
key2	TokenNameIdentifier	 key2
=	TokenNameEQUAL	
new	TokenNamenew	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
,	TokenNameCOMMA	
key2	TokenNameIdentifier	 key2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key2	TokenNameIdentifier	 key2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
key3	TokenNameIdentifier	 key3
=	TokenNameEQUAL	
new	TokenNamenew	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
(	TokenNameLPAREN	
cfId	TokenNameIdentifier	 cf Id
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
b3	TokenNameIdentifier	 b3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
,	TokenNameCOMMA	
key3	TokenNameIdentifier	 key3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key3	TokenNameIdentifier	 key3
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
