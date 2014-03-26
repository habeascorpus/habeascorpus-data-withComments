/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
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
utils	TokenNameIdentifier	 utils
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
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
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
.	TokenNameDOT	
ContextState	TokenNameIdentifier	 Context State
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CounterMutationTest	TokenNameIdentifier	 Counter Mutation Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMergeOldShards	TokenNameIdentifier	 test Merge Old Shards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
;	TokenNameSEMICOLON	
CounterMutation	TokenNameIdentifier	 Counter Mutation
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id1	TokenNameIdentifier	 id1
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Counter1"	TokenNameStringLiteral	Counter1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
CounterMutation	TokenNameIdentifier	 Counter Mutation
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// faking time of renewal for test 	TokenNameCOMMENT_LINE	faking time of renewal for test 
CounterId	TokenNameIdentifier	 Counter Id
id2	TokenNameIdentifier	 id2
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Counter1"	TokenNameStringLiteral	Counter1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
CounterMutation	TokenNameIdentifier	 Counter Mutation
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// faking time of renewal for test 	TokenNameCOMMENT_LINE	faking time of renewal for test 
CounterId	TokenNameIdentifier	 Counter Id
id3	TokenNameIdentifier	 id3
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Counter1"	TokenNameStringLiteral	Counter1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Counter1"	TokenNameStringLiteral	Counter1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column2"	TokenNameStringLiteral	Column2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
CounterMutation	TokenNameIdentifier	 Counter Mutation
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
dk	TokenNameIdentifier	 dk
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dk	TokenNameIdentifier	 dk
,	TokenNameCOMMA	
"Counter1"	TokenNameStringLiteral	Counter1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// First merges old shards 	TokenNameCOMMENT_LINE	First merges old shards 
CounterColumn	TokenNameIdentifier	 Counter Column
.	TokenNameDOT	
mergeAndRemoveOldShards	TokenNameIdentifier	 merge And Remove Old Shards
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
CounterColumn	TokenNameIdentifier	 Counter Column
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
12L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
1000	TokenNameIntegerLiteral	
:	TokenNameCOLON	
" >"	TokenNameStringLiteral	 >
;	TokenNameSEMICOLON	
assert	TokenNameassert	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id2	TokenNameIdentifier	 id2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
12L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// Then collect old shards 	TokenNameCOMMENT_LINE	Then collect old shards 
CounterColumn	TokenNameIdentifier	 Counter Column
.	TokenNameDOT	
mergeAndRemoveOldShards	TokenNameIdentifier	 merge And Remove Old Shards
(	TokenNameLPAREN	
dk	TokenNameIdentifier	 dk
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
CounterColumn	TokenNameIdentifier	 Counter Column
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
12L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
12L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMutateSuperColumns	TokenNameIdentifier	 test Mutate Super Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
;	TokenNameSEMICOLON	
CounterMutation	TokenNameIdentifier	 Counter Mutation
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"SuperCounter1"	TokenNameStringLiteral	SuperCounter1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc1"	TokenNameStringLiteral	sc1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"SuperCounter1"	TokenNameStringLiteral	SuperCounter1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc2"	TokenNameStringLiteral	sc2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column1"	TokenNameStringLiteral	Column1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
CounterMutation	TokenNameIdentifier	 Counter Mutation
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"SuperCounter1"	TokenNameStringLiteral	SuperCounter1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc1"	TokenNameStringLiteral	sc1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column2"	TokenNameStringLiteral	Column2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
addCounter	TokenNameIdentifier	 add Counter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"SuperCounter1"	TokenNameStringLiteral	SuperCounter1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc2"	TokenNameStringLiteral	sc2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column2"	TokenNameStringLiteral	Column2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
CounterMutation	TokenNameIdentifier	 Counter Mutation
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RowMutation	TokenNameIdentifier	 Row Mutation
reprm	TokenNameIdentifier	 reprm
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
makeReplicationMutation	TokenNameIdentifier	 make Replication Mutation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
reprm	TokenNameIdentifier	 reprm
.	TokenNameDOT	
getColumnFamilies	TokenNameIdentifier	 get Column Families
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
sc1	TokenNameIdentifier	 sc1
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc1"	TokenNameStringLiteral	sc1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sc1	TokenNameIdentifier	 sc1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sc1	TokenNameIdentifier	 sc1
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sc1	TokenNameIdentifier	 sc1
.	TokenNameDOT	
getSubColumns	TokenNameIdentifier	 get Sub Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sc1	TokenNameIdentifier	 sc1
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column2"	TokenNameStringLiteral	Column2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
sc2	TokenNameIdentifier	 sc2
=	TokenNameEQUAL	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc2"	TokenNameStringLiteral	sc2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sc2	TokenNameIdentifier	 sc2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sc2	TokenNameIdentifier	 sc2
instanceof	TokenNameinstanceof	
SuperColumn	TokenNameIdentifier	 Super Column
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sc2	TokenNameIdentifier	 sc2
.	TokenNameDOT	
getSubColumns	TokenNameIdentifier	 get Sub Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
sc2	TokenNameIdentifier	 sc2
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"Column2"	TokenNameStringLiteral	Column2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetOldShardFromSystemTable	TokenNameIdentifier	 test Get Old Shard From System Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Renewing a bunch of times and checking we get the same thing from 	TokenNameCOMMENT_LINE	Renewing a bunch of times and checking we get the same thing from 
// the system table that what is in memory 	TokenNameCOMMENT_LINE	the system table that what is in memory 
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
inMem	TokenNameIdentifier	 in Mem
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getOldLocalCounterIds	TokenNameIdentifier	 get Old Local Counter Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
onDisk	TokenNameIdentifier	 on Disk
=	TokenNameEQUAL	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
getOldLocalCounterIds	TokenNameIdentifier	 get Old Local Counter Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inMem	TokenNameIdentifier	 in Mem
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
onDisk	TokenNameIdentifier	 on Disk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveOldShardFixCorrupted	TokenNameIdentifier	 test Remove Old Shard Fix Corrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CounterContext	TokenNameIdentifier	 Counter Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
CounterContext	TokenNameIdentifier	 Counter Context
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
now	TokenNameIdentifier	 now
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
// Check that corrupted context created prior to #2968 are fixed by removeOldShards 	TokenNameCOMMENT_LINE	Check that corrupted context created prior to #2968 are fixed by removeOldShards 
CounterId	TokenNameIdentifier	 Counter Id
id1	TokenNameIdentifier	 id1
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id2	TokenNameIdentifier	 id2
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id2	TokenNameIdentifier	 id2
,	TokenNameCOMMA	
-	TokenNameMINUS	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// corrupted! 	TokenNameCOMMENT_LINE	corrupted! 
assert	TokenNameassert	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
removeOldShards	TokenNameIdentifier	 remove Old Shards
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"RemoveOldShards should throw an exception if the current id is non-sensical"	TokenNameStringLiteral	RemoveOldShards should throw an exception if the current id is non-sensical
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
renewLocalId	TokenNameIdentifier	 renew Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
removeOldShards	TokenNameIdentifier	 remove Old Shards
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Check it is not corrupted anymore 	TokenNameCOMMENT_LINE	Check it is not corrupted anymore 
ContextState	TokenNameIdentifier	 Context State
state2	TokenNameIdentifier	 state2
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
state2	TokenNameIdentifier	 state2
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
state2	TokenNameIdentifier	 state2
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
state2	TokenNameIdentifier	 state2
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
state2	TokenNameIdentifier	 state2
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that if we merge old and clean on another node, we keep the right count 	TokenNameCOMMENT_LINE	Check that if we merge old and clean on another node, we keep the right count 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
onRemote	TokenNameIdentifier	 on Remote
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
clearAllDelta	TokenNameIdentifier	 clear All Delta
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
clearAllDelta	TokenNameIdentifier	 clear All Delta
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
onRemote	TokenNameIdentifier	 on Remote
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
