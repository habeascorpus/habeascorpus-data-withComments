/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
context	TokenNameIdentifier	 context
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
Util	TokenNameIdentifier	 Util
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
IContext	TokenNameIdentifier	 I Context
.	TokenNameDOT	
ContextRelationship	TokenNameIdentifier	 Context Relationship
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CounterContextTest	TokenNameIdentifier	 Counter Context Test
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
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
idLength	TokenNameIdentifier	 id Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
clockLength	TokenNameIdentifier	 clock Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
countLength	TokenNameIdentifier	 count Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
stepLength	TokenNameIdentifier	 step Length
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
idLength	TokenNameIdentifier	 id Length
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
// size of int 	TokenNameCOMMENT_LINE	size of int 
clockLength	TokenNameIdentifier	 clock Length
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// size of long 	TokenNameCOMMENT_LINE	size of long 
countLength	TokenNameIdentifier	 count Length
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// size of long 	TokenNameCOMMENT_LINE	size of long 
stepLength	TokenNameIdentifier	 step Length
=	TokenNameEQUAL	
idLength	TokenNameIdentifier	 id Length
+	TokenNamePLUS	
clockLength	TokenNameIdentifier	 clock Length
+	TokenNamePLUS	
countLength	TokenNameIdentifier	 count Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Allocates 1 byte from a new SlabAllocator and returns it. */	TokenNameCOMMENT_JAVADOC	 Allocates 1 byte from a new SlabAllocator and returns it. 
private	TokenNameprivate	
Allocator	TokenNameIdentifier	 Allocator
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SlabAllocator	TokenNameIdentifier	 Slab Allocator
allocator	TokenNameIdentifier	 allocator
=	TokenNameEQUAL	
new	TokenNamenew	
SlabAllocator	TokenNameIdentifier	 Slab Allocator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
allocator	TokenNameIdentifier	 allocator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCreate	TokenNameIdentifier	 test Create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runCreate	TokenNameIdentifier	 run Create
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runCreate	TokenNameIdentifier	 run Create
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runCreate	TokenNameIdentifier	 run Create
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDiff	TokenNameIdentifier	 test Diff
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runDiff	TokenNameIdentifier	 run Diff
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runDiff	TokenNameIdentifier	 run Diff
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runDiff	TokenNameIdentifier	 run Diff
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextState	TokenNameIdentifier	 Context State
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
// equality: equal nodes, all counts same 	TokenNameCOMMENT_LINE	equality: equal nodes, all counts same 
left	TokenNameIdentifier	 left
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
headerLength	TokenNameIdentifier	 header Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// greater than: left has superset of nodes (counts equal) 	TokenNameCOMMENT_LINE	greater than: left has superset of nodes (counts equal) 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// less than: left has subset of nodes (counts equal) 	TokenNameCOMMENT_LINE	less than: left has subset of nodes (counts equal) 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// greater than: equal nodes, but left has higher counts 	TokenNameCOMMENT_LINE	greater than: equal nodes, but left has higher counts 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// less than: equal nodes, but right has higher counts 	TokenNameCOMMENT_LINE	less than: equal nodes, but right has higher counts 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disjoint: right and left have disjoint node sets 	TokenNameCOMMENT_LINE	disjoint: right and left have disjoint node sets 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disjoint: equal nodes, but right and left have higher counts in differing nodes 	TokenNameCOMMENT_LINE	disjoint: equal nodes, but right and left have higher counts in differing nodes 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disjoint: left has more nodes, but lower counts 	TokenNameCOMMENT_LINE	disjoint: left has more nodes, but lower counts 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disjoint: left has less nodes, but higher counts 	TokenNameCOMMENT_LINE	disjoint: left has less nodes, but higher counts 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// disjoint: mixed nodes and counts 	TokenNameCOMMENT_LINE	disjoint: mixed nodes and counts 
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
4L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMerge	TokenNameIdentifier	 test Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runMerge	TokenNameIdentifier	 run Merge
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runMerge	TokenNameIdentifier	 run Merge
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runMerge	TokenNameIdentifier	 run Merge
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// note: local counts aggregated; remote counts are reconciled (i.e. take max) 	TokenNameCOMMENT_LINE	note: local counts aggregated; remote counts are reconciled (i.e. take max) 
ContextState	TokenNameIdentifier	 Context State
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hd	TokenNameIdentifier	 hd
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// local node id's counts are aggregated 	TokenNameCOMMENT_LINE	local node id's counts are aggregated 
assert	TokenNameassert	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
equalsCounterId	TokenNameIdentifier	 equals Counter Id
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
12L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
+	TokenNamePLUS	
clockLength	TokenNameIdentifier	 clock Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remote node id counts are reconciled (i.e. take max) 	TokenNameCOMMENT_LINE	remote node id counts are reconciled (i.e. take max) 
assert	TokenNameassert	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
equalsCounterId	TokenNameIdentifier	 equals Counter Id
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
+	TokenNamePLUS	
clockLength	TokenNameIdentifier	 clock Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
equalsCounterId	TokenNameIdentifier	 equals Counter Id
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
+	TokenNamePLUS	
clockLength	TokenNameIdentifier	 clock Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
equalsCounterId	TokenNameIdentifier	 equals Counter Id
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
+	TokenNamePLUS	
clockLength	TokenNameIdentifier	 clock Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
equalsCounterId	TokenNameIdentifier	 equals Counter Id
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hd	TokenNameIdentifier	 hd
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
+	TokenNamePLUS	
idLength	TokenNameIdentifier	 id Length
+	TokenNamePLUS	
clockLength	TokenNameIdentifier	 clock Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTotal	TokenNameIdentifier	 test Total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTotal	TokenNameIdentifier	 run Total
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runTotal	TokenNameIdentifier	 run Total
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runTotal	TokenNameIdentifier	 run Total
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextState	TokenNameIdentifier	 Context State
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
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
ContextState	TokenNameIdentifier	 Context State
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
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
9L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 127.0.0.1: 12 (3+9) 	TokenNameCOMMENT_LINE	127.0.0.1: 12 (3+9) 
// 0.0.0.1: 1 	TokenNameCOMMENT_LINE	0.0.0.1: 1 
// 0.0.0.2: 2 	TokenNameCOMMENT_LINE	0.0.0.2: 2 
// 0.0.0.4: 4 	TokenNameCOMMENT_LINE	0.0.0.4: 4 
// 0.0.0.5: 5 	TokenNameCOMMENT_LINE	0.0.0.5: 5 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
24L	TokenNameLongLiteral	
,	TokenNameCOMMA	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMergeOldShards	TokenNameIdentifier	 test Merge Old Shards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runMergeOldShards	TokenNameIdentifier	 run Merge Old Shards
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runMergeOldShards	TokenNameIdentifier	 run Merge Old Shards
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runMergeOldShards	TokenNameIdentifier	 run Merge Old Shards
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id1	TokenNameIdentifier	 id1
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id3	TokenNameIdentifier	 id3
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
records	TokenNameIdentifier	 records
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
merger	TokenNameIdentifier	 merger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
3L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveOldShards	TokenNameIdentifier	 test Remove Old Shards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runRemoveOldShards	TokenNameIdentifier	 run Remove Old Shards
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runRemoveOldShards	TokenNameIdentifier	 run Remove Old Shards
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runRemoveOldShards	TokenNameIdentifier	 run Remove Old Shards
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CounterId	TokenNameIdentifier	 Counter Id
id1	TokenNameIdentifier	 id1
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id3	TokenNameIdentifier	 id3
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id6	TokenNameIdentifier	 id6
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id6	TokenNameIdentifier	 id6
,	TokenNameCOMMA	
10L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id6	TokenNameIdentifier	 id6
,	TokenNameCOMMA	
5L	TokenNameLongLiteral	
,	TokenNameCOMMA	
6L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
records	TokenNameIdentifier	 records
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
removeOldShards	TokenNameIdentifier	 remove Old Shards
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
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
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
stepLength	TokenNameIdentifier	 step Length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveOldShardsNotAllExpiring	TokenNameIdentifier	 test Remove Old Shards Not All Expiring
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runRemoveOldShardsNotAllExpiring	TokenNameIdentifier	 run Remove Old Shards Not All Expiring
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runRemoveOldShardsNotAllExpiring	TokenNameIdentifier	 run Remove Old Shards Not All Expiring
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runRemoveOldShardsNotAllExpiring	TokenNameIdentifier	 run Remove Old Shards Not All Expiring
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CounterId	TokenNameIdentifier	 Counter Id
id1	TokenNameIdentifier	 id1
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id3	TokenNameIdentifier	 id3
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
id6	TokenNameIdentifier	 id6
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
,	TokenNameCOMMA	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
(	TokenNameLPAREN	
id6	TokenNameIdentifier	 id6
,	TokenNameCOMMA	
10L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id1	TokenNameIdentifier	 id1
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id3	TokenNameIdentifier	 id3
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
fromInt	TokenNameIdentifier	 from Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id6	TokenNameIdentifier	 id6
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
6L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
timeFirstMerge	TokenNameIdentifier	 time First Merge
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
// First, only merge the first id 	TokenNameCOMMENT_LINE	First, only merge the first id 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
records	TokenNameIdentifier	 records
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
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
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// merge the second one 	TokenNameCOMMENT_LINE	merge the second one 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merger2	TokenNameIdentifier	 merger2
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
records	TokenNameIdentifier	 records
,	TokenNameCOMMA	
7L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merged2	TokenNameIdentifier	 merged2
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
merger2	TokenNameIdentifier	 merger2
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
merged2	TokenNameIdentifier	 merged2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
removeOldShards	TokenNameIdentifier	 remove Old Shards
(	TokenNameLPAREN	
merged2	TokenNameIdentifier	 merged2
,	TokenNameCOMMA	
timeFirstMerge	TokenNameIdentifier	 time First Merge
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We should have cleaned id1 but not id3 	TokenNameCOMMENT_LINE	We should have cleaned id1 but not id3 
ContextState	TokenNameIdentifier	 Context State
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
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
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveNotDeltaOldShards	TokenNameIdentifier	 test Remove Not Delta Old Shards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runRemoveNotDeltaOldShards	TokenNameIdentifier	 run Remove Not Delta Old Shards
(	TokenNameLPAREN	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runRemoveNotDeltaOldShards	TokenNameIdentifier	 run Remove Not Delta Old Shards
(	TokenNameLPAREN	
bumpedSlab	TokenNameIdentifier	 bumped Slab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
runRemoveNotDeltaOldShards	TokenNameIdentifier	 run Remove Not Delta Old Shards
(	TokenNameLPAREN	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextState	TokenNameIdentifier	 Context State
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
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
-	TokenNameMINUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
removeOldShards	TokenNameIdentifier	 remove Old Shards
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
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
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
stepLength	TokenNameIdentifier	 step Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
