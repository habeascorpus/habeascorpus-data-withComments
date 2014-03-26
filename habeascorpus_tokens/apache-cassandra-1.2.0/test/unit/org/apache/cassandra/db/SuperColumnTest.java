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
assertNotNull	TokenNameIdentifier	 assert Not Null
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNull	TokenNameIdentifier	 assert Null
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
getBytes	TokenNameIdentifier	 get Bytes
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
LongType	TokenNameIdentifier	 Long Type
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
CounterId	TokenNameIdentifier	 Counter Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SuperColumnTest	TokenNameIdentifier	 Super Column Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CounterContext	TokenNameIdentifier	 Counter Context
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
new	TokenNamenew	
CounterContext	TokenNameIdentifier	 Counter Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMissingSubcolumn	TokenNameIdentifier	 test Missing Subcolumn
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SuperColumn	TokenNameIdentifier	 Super Column
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
new	TokenNamenew	
SuperColumn	TokenNameIdentifier	 Super Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc1"	TokenNameStringLiteral	sc1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAddColumnIncrementCounter	TokenNameIdentifier	 test Add Column Increment Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextState	TokenNameIdentifier	 Context State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
SuperColumn	TokenNameIdentifier	 Super Column
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
new	TokenNamenew	
SuperColumn	TokenNameIdentifier	 Super Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"sc1"	TokenNameStringLiteral	sc1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
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
7L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
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
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
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
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
CounterColumn	TokenNameIdentifier	 Counter Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
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
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
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
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
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
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
CounterColumn	TokenNameIdentifier	 Counter Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
10L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
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
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
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
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
CounterColumn	TokenNameIdentifier	 Counter Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// column: 1 	TokenNameCOMMENT_LINE	column: 1 
ContextState	TokenNameIdentifier	 Context State
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
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
7L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
12L	TokenNameLongLiteral	
,	TokenNameCOMMA	
8L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareSubArrays	TokenNameIdentifier	 compare Sub Arrays
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
)	TokenNameRPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// column: 2 	TokenNameCOMMENT_LINE	column: 2 
ContextState	TokenNameIdentifier	 Context State
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareSubArrays	TokenNameIdentifier	 compare Sub Arrays
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CounterColumn	TokenNameIdentifier	 Counter Column
)	TokenNameRPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getSubColumn	TokenNameIdentifier	 get Sub Column
(	TokenNameLPAREN	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
