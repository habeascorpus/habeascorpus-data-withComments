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
context	TokenNameIdentifier	 context
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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
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
Iterator	TokenNameIdentifier	 Iterator
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
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
TypeSizes	TokenNameIdentifier	 Type Sizes
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
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
CompactionManager	TokenNameIdentifier	 Compaction Manager
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
MarshalException	TokenNameIdentifier	 Marshal Exception
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
/** * An implementation of a partitioned counter context. * * A context is primarily a list of tuples (counter id, clock, count) -- called * shard in the following. But with some shard are flagged as delta (with * special resolution rules in merge()). * * The data structure has two parts: * a) a header containing the lists of "delta" (a list of references to the second parts) * b) a list of shard -- (counter id, logical clock, count) tuples -- (the so-called 'body' below) * * The exact layout is: * | header | body | * context : |--|------|----------| * ^ ^ * | list of indices in the body list (2*#elt bytes) * #elt in rest of header (2 bytes) * * The body layout being: * * body: |----|----|----|----|----|----|.... * ^ ^ ^ ^ ^ ^ * | | count_1 | | count_2 * | clock_1 | clock_2 * counterid_1 counterid_2 * * The rules when merging two shard with the same counterid are: * - delta + delta = sum counts (and logical clock) * - delta + other = keep the delta one * - other + other = keep the shard with highest logical clock * * For a detailed description of the meaning of a delta and why the merging * rules work this way, see CASSANDRA-1938 - specifically the 1938_discussion * attachment. */	TokenNameCOMMENT_JAVADOC	 An implementation of a partitioned counter context. * A context is primarily a list of tuples (counter id, clock, count) -- called shard in the following. But with some shard are flagged as delta (with special resolution rules in merge()). * The data structure has two parts: a) a header containing the lists of "delta" (a list of references to the second parts) b) a list of shard -- (counter id, logical clock, count) tuples -- (the so-called 'body' below) * The exact layout is: | header | body | context : |--|------|----------| ^ ^ | list of indices in the body list (2*#elt bytes) #elt in rest of header (2 bytes) * The body layout being: * body: |----|----|----|----|----|----|.... ^ ^ ^ ^ ^ ^ | | count_1 | | count_2 | clock_1 | clock_2 counterid_1 counterid_2 * The rules when merging two shard with the same counterid are: - delta + delta = sum counts (and logical clock) - delta + other = keep the delta one - other + other = keep the shard with highest logical clock * For a detailed description of the meaning of a delta and why the merging rules work this way, see CASSANDRA-1938 - specifically the 1938_discussion attachment. 
public	TokenNamepublic	
class	TokenNameclass	
CounterContext	TokenNameIdentifier	 Counter Context
implements	TokenNameimplements	
IContext	TokenNameIdentifier	 I Context
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOCK_LENGTH	TokenNameIdentifier	 CLOCK  LENGTH
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COUNT_LENGTH	TokenNameIdentifier	 COUNT  LENGTH
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
+	TokenNamePLUS	
CLOCK_LENGTH	TokenNameIdentifier	 CLOCK  LENGTH
+	TokenNamePLUS	
COUNT_LENGTH	TokenNameIdentifier	 COUNT  LENGTH
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
CounterContext	TokenNameIdentifier	 Counter Context
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lazy-load singleton 	TokenNameCOMMENT_LINE	lazy-load singleton 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LazyHolder	TokenNameIdentifier	 Lazy Holder
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CounterContext	TokenNameIdentifier	 Counter Context
counterContext	TokenNameIdentifier	 counter Context
=	TokenNameEQUAL	
new	TokenNamenew	
CounterContext	TokenNameIdentifier	 Counter Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CounterContext	TokenNameIdentifier	 Counter Context
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LazyHolder	TokenNameIdentifier	 Lazy Holder
.	TokenNameDOT	
counterContext	TokenNameIdentifier	 counter Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an initial counter context with an initial value for the local node. * * * @param value the value for this initial update * * @param allocator * @return an empty counter context. */	TokenNameCOMMENT_JAVADOC	 Creates an initial counter context with an initial value for the local node. * @param value the value for this initial update * @param allocator @return an empty counter context. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
long	TokenNamelong	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
+	TokenNamePLUS	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
+	TokenNamePLUS	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The first (and only) elt is a delta 	TokenNameCOMMENT_LINE	The first (and only) elt is a delta 
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeElementAtOffset	TokenNameIdentifier	 write Element At Offset
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
+	TokenNamePLUS	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
,	TokenNameCOMMA	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Provided for use by unit tests 	TokenNameCOMMENT_LINE	Provided for use by unit tests 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
long	TokenNamelong	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isDelta	TokenNameIdentifier	 is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
+	TokenNamePLUS	
(	TokenNameLPAREN	
isDelta	TokenNameIdentifier	 is Delta
?	TokenNameQUESTION	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
isDelta	TokenNameIdentifier	 is Delta
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDelta	TokenNameIdentifier	 is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeElementAtOffset	TokenNameIdentifier	 write Element At Offset
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
+	TokenNamePLUS	
(	TokenNameLPAREN	
isDelta	TokenNameIdentifier	 is Delta
?	TokenNameQUESTION	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// write a tuple (counter id, clock, count) at an absolute (bytebuffer-wise) offset 	TokenNameCOMMENT_LINE	write a tuple (counter id, clock, count) at an absolute (bytebuffer-wise) offset 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
writeElementAtOffset	TokenNameIdentifier	 write Element At Offset
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
long	TokenNamelong	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putLong	TokenNameIdentifier	 put Long
(	TokenNameLPAREN	
clock	TokenNameIdentifier	 clock
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putLong	TokenNameIdentifier	 put Long
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareId	TokenNameIdentifier	 compare Id
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb1	TokenNameIdentifier	 bb1
,	TokenNameCOMMA	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb2	TokenNameIdentifier	 bb2
,	TokenNameCOMMA	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareSubArrays	TokenNameIdentifier	 compare Sub Arrays
(	TokenNameLPAREN	
bb1	TokenNameIdentifier	 bb1
,	TokenNameCOMMA	
pos1	TokenNameIdentifier	 pos1
,	TokenNameCOMMA	
bb2	TokenNameIdentifier	 bb2
,	TokenNameCOMMA	
pos2	TokenNameIdentifier	 pos2
,	TokenNameCOMMA	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the count relationship between two contexts. * * EQUAL: Equal set of nodes and every count is equal. * GREATER_THAN: Superset of nodes and every count is equal or greater than its corollary. * LESS_THAN: Subset of nodes and every count is equal or less than its corollary. * DISJOINT: Node sets are not equal and/or counts are not all greater or less than. * * Strategy: compare node logical clocks (like a version vector). * * @param left counter context. * @param right counter context. * @return the ContextRelationship between the contexts. */	TokenNameCOMMENT_JAVADOC	 Determine the count relationship between two contexts. * EQUAL: Equal set of nodes and every count is equal. GREATER_THAN: Superset of nodes and every count is equal or greater than its corollary. LESS_THAN: Subset of nodes and every count is equal or less than its corollary. DISJOINT: Node sets are not equal and/or counts are not all greater or less than. * Strategy: compare node logical clocks (like a version vector). * @param left counter context. @param right counter context. @return the ContextRelationship between the contexts. 
public	TokenNamepublic	
ContextRelationship	TokenNameIdentifier	 Context Relationship
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextRelationship	TokenNameIdentifier	 Context Relationship
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
leftState	TokenNameIdentifier	 left State
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
rightState	TokenNameIdentifier	 right State
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// compare id bytes 	TokenNameCOMMENT_LINE	compare id bytes 
int	TokenNameint	
compareId	TokenNameIdentifier	 compare Id
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
compareIdTo	TokenNameIdentifier	 compare Id To
(	TokenNameLPAREN	
rightState	TokenNameIdentifier	 right State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compareId	TokenNameIdentifier	 compare Id
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
leftClock	TokenNameIdentifier	 left Clock
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
rightClock	TokenNameIdentifier	 right Clock
=	TokenNameEQUAL	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
leftCount	TokenNameIdentifier	 left Count
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
rightCount	TokenNameIdentifier	 right Count
=	TokenNameEQUAL	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// advance 	TokenNameCOMMENT_LINE	advance 
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// process clock comparisons 	TokenNameCOMMENT_LINE	process clock comparisons 
if	TokenNameif	
(	TokenNameLPAREN	
leftClock	TokenNameIdentifier	 left Clock
==	TokenNameEQUAL_EQUAL	
rightClock	TokenNameIdentifier	 right Clock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leftCount	TokenNameIdentifier	 left Count
!=	TokenNameNOT_EQUAL	
rightCount	TokenNameIdentifier	 right Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Inconsistent shard (see the corresponding code in merge()). We return DISJOINT in this 	TokenNameCOMMENT_LINE	Inconsistent shard (see the corresponding code in merge()). We return DISJOINT in this 
// case so that it will be treated as a difference, allowing read-repair to work. 	TokenNameCOMMENT_LINE	case so that it will be treated as a difference, allowing read-repair to work. 
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
leftClock	TokenNameIdentifier	 left Clock
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rightClock	TokenNameIdentifier	 right Clock
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
leftClock	TokenNameIdentifier	 left Clock
>	TokenNameGREATER	
rightClock	TokenNameIdentifier	 right Clock
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
leftClock	TokenNameIdentifier	 left Clock
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rightClock	TokenNameIdentifier	 right Clock
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
leftClock	TokenNameIdentifier	 left Clock
<	TokenNameLESS	
rightClock	TokenNameIdentifier	 right Clock
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// relationship == ContextRelationship.LESS_THAN 	TokenNameCOMMENT_LINE	relationship == ContextRelationship.LESS_THAN 
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// relationship == ContextRelationship.LESS_THAN 	TokenNameCOMMENT_LINE	relationship == ContextRelationship.LESS_THAN 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compareId	TokenNameIdentifier	 compare Id
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only advance the right context 	TokenNameCOMMENT_LINE	only advance the right context 
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// relationship == ContextRelationship.LESS_THAN 	TokenNameCOMMENT_LINE	relationship == ContextRelationship.LESS_THAN 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
// compareId < 0 	TokenNameCOMMENT_LINE	compareId < 0 
{	TokenNameLBRACE	
// only advance the left context 	TokenNameCOMMENT_LINE	only advance the left context 
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// relationship == ContextRelationship.LESS_THAN 	TokenNameCOMMENT_LINE	relationship == ContextRelationship.LESS_THAN 
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check final lengths 	TokenNameCOMMENT_LINE	check final lengths 
if	TokenNameif	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
==	TokenNameEQUAL_EQUAL	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ContextRelationship	TokenNameIdentifier	 Context Relationship
.	TokenNameDOT	
DISJOINT	TokenNameIdentifier	 DISJOINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
relationship	TokenNameIdentifier	 relationship
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a context w/ an aggregated count for each counter id. * * @param left counter context. * @param right counter context. * @param allocator An allocator for the merged value. */	TokenNameCOMMENT_JAVADOC	 Return a context w/ an aggregated count for each counter id. * @param left counter context. @param right counter context. @param allocator An allocator for the merged value. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextState	TokenNameIdentifier	 Context State
leftState	TokenNameIdentifier	 left State
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
rightState	TokenNameIdentifier	 right State
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute size of result 	TokenNameCOMMENT_LINE	Compute size of result 
int	TokenNameint	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
=	TokenNameEQUAL	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
;	TokenNameSEMICOLON	
int	TokenNameint	
mergedBodyLength	TokenNameIdentifier	 merged Body Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
compareIdTo	TokenNameIdentifier	 compare Id To
(	TokenNameLPAREN	
rightState	TokenNameIdentifier	 right State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedBodyLength	TokenNameIdentifier	 merged Body Length
+=	TokenNamePLUS_EQUAL	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
+=	TokenNamePLUS_EQUAL	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedBodyLength	TokenNameIdentifier	 merged Body Length
+=	TokenNamePLUS_EQUAL	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
+=	TokenNamePLUS_EQUAL	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// cmp < 0 	TokenNameCOMMENT_LINE	cmp < 0 
{	TokenNameLBRACE	
mergedBodyLength	TokenNameIdentifier	 merged Body Length
+=	TokenNamePLUS_EQUAL	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
+=	TokenNamePLUS_EQUAL	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
+=	TokenNamePLUS_EQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
remainingHeaderLength	TokenNameIdentifier	 remaining Header Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
remainingHeaderLength	TokenNameIdentifier	 remaining Header Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedBodyLength	TokenNameIdentifier	 merged Body Length
+=	TokenNamePLUS_EQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
remainingBodyLength	TokenNameIdentifier	 remaining Body Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
remainingBodyLength	TokenNameIdentifier	 remaining Body Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do the actual merge 	TokenNameCOMMENT_LINE	Do the actual merge 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
+	TokenNamePLUS	
mergedBodyLength	TokenNameIdentifier	 merged Body Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
-	TokenNameMINUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
mergedState	TokenNameIdentifier	 merged State
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
mergedHeaderLength	TokenNameIdentifier	 merged Header Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
compareIdTo	TokenNameIdentifier	 compare Id To
(	TokenNameLPAREN	
rightState	TokenNameIdentifier	 right State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Local id and at least one is a delta 	TokenNameCOMMENT_LINE	Local id and at least one is a delta 
if	TokenNameif	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// both delta, sum 	TokenNameCOMMENT_LINE	both delta, sum 
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedState	TokenNameIdentifier	 merged State
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Only one have delta, keep that one 	TokenNameCOMMENT_LINE	Only one have delta, keep that one 
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
leftState	TokenNameIdentifier	 left State
:	TokenNameCOLON	
rightState	TokenNameIdentifier	 right State
)	TokenNameRPAREN	
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
long	TokenNamelong	
leftClock	TokenNameIdentifier	 left Clock
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
rightClock	TokenNameIdentifier	 right Clock
=	TokenNameEQUAL	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leftClock	TokenNameIdentifier	 left Clock
==	TokenNameEQUAL_EQUAL	
rightClock	TokenNameIdentifier	 right Clock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We should never see non-delta shards w/ same id+clock but different counts. However, if we do 	TokenNameCOMMENT_LINE	We should never see non-delta shards w/ same id+clock but different counts. However, if we do 
// we should "heal" the problem by being deterministic in our selection of shard - and 	TokenNameCOMMENT_LINE	we should "heal" the problem by being deterministic in our selection of shard - and 
// log the occurrence so that the operator will know something is wrong. 	TokenNameCOMMENT_LINE	log the occurrence so that the operator will know something is wrong. 
long	TokenNamelong	
leftCount	TokenNameIdentifier	 left Count
=	TokenNameEQUAL	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
rightCount	TokenNameIdentifier	 right Count
=	TokenNameEQUAL	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leftCount	TokenNameIdentifier	 left Count
!=	TokenNameNOT_EQUAL	
rightCount	TokenNameIdentifier	 right Count
&&	TokenNameAND_AND	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
isCompactionManager	TokenNameIdentifier	 is Compaction Manager
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"invalid counter shard detected; ({}, {}, {}) and ({}, {}, {}) differ only in "	TokenNameStringLiteral	invalid counter shard detected; ({}, {}, {}) and ({}, {}, {}) differ only in 
+	TokenNamePLUS	
"count; will pick highest to self-heal on compaction"	TokenNameStringLiteral	count; will pick highest to self-heal on compaction
,	TokenNameCOMMA	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
leftClock	TokenNameIdentifier	 left Clock
,	TokenNameCOMMA	
leftCount	TokenNameIdentifier	 left Count
,	TokenNameCOMMA	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rightClock	TokenNameIdentifier	 right Clock
,	TokenNameCOMMA	
rightCount	TokenNameIdentifier	 right Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leftCount	TokenNameIdentifier	 left Count
>	TokenNameGREATER	
rightCount	TokenNameIdentifier	 right Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
leftClock	TokenNameIdentifier	 left Clock
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rightClock	TokenNameIdentifier	 right Clock
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
leftClock	TokenNameIdentifier	 left Clock
>=	TokenNameGREATER_EQUAL	
rightClock	TokenNameIdentifier	 right Clock
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
leftClock	TokenNameIdentifier	 left Clock
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rightClock	TokenNameIdentifier	 right Clock
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
leftClock	TokenNameIdentifier	 left Clock
<	TokenNameLESS	
rightClock	TokenNameIdentifier	 right Clock
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// cmp < 0 	TokenNameCOMMENT_LINE	cmp < 0 
{	TokenNameLBRACE	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
leftState	TokenNameIdentifier	 left State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
mergedState	TokenNameIdentifier	 merged State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightState	TokenNameIdentifier	 right State
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
merged	TokenNameIdentifier	 merged
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Human-readable String from context. * * @param context counter context. * @return a human-readable String of the context. */	TokenNameCOMMENT_JAVADOC	 Human-readable String from context. * @param context counter context. @return a human-readable String of the context. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContextState	TokenNameIdentifier	 Context State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
elementIdx	TokenNameIdentifier	 element Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the aggregated count across all counter ids. * * @param context a counter context * @return the aggregated count represented by {@code context} */	TokenNameCOMMENT_JAVADOC	 Returns the aggregated count across all counter ids. * @param context a counter context @return the aggregated count represented by {@code context} 
public	TokenNamepublic	
long	TokenNamelong	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// we could use a ContextState but it is easy enough that we avoid the object creation 	TokenNameCOMMENT_LINE	we could use a ContextState but it is easy enough that we avoid the object creation 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
+	TokenNamePLUS	
CLOCK_LENGTH	TokenNameIdentifier	 CLOCK  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mark context to delete delta afterward. * Marking is done by multiply #elt by -1 to preserve header length * and #elt count in order to clear all delta later. * * @param context a counter context * @return context that marked to delete delta */	TokenNameCOMMENT_JAVADOC	 Mark context to delete delta afterward. Marking is done by multiply #elt by -1 to preserve header length and #elt count in order to clear all delta later. * @param context a counter context @return context that marked to delete delta 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
markDeltaToBeCleared	TokenNameIdentifier	 mark Delta To Be Cleared
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
headerLength	TokenNameIdentifier	 header Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
marked	TokenNameIdentifier	 marked
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// negate #elt to mark as deleted, without changing its size. 	TokenNameCOMMENT_LINE	negate #elt to mark as deleted, without changing its size. 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
marked	TokenNameIdentifier	 marked
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
marked	TokenNameIdentifier	 marked
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
*	TokenNameMULTIPLY	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
marked	TokenNameIdentifier	 marked
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove all the delta of a context (i.e, set an empty header). * * @param context a counter context * @return a version of {@code context} where no count are a delta. */	TokenNameCOMMENT_JAVADOC	 Remove all the delta of a context (i.e, set an empty header). * @param context a counter context @return a version of {@code context} where no count are a delta. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
clearAllDelta	TokenNameIdentifier	 clear All Delta
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
headerLength	TokenNameIdentifier	 header Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
headerLength	TokenNameIdentifier	 header Length
+	TokenNamePLUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
arrayCopy	TokenNameIdentifier	 array Copy
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
headerLength	TokenNameIdentifier	 header Length
,	TokenNameCOMMA	
cleaned	TokenNameIdentifier	 cleaned
,	TokenNameCOMMA	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
headerLength	TokenNameIdentifier	 header Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cleaned	TokenNameIdentifier	 cleaned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateContext	TokenNameIdentifier	 validate Context
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
headerLength	TokenNameIdentifier	 header Length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
headerLength	TokenNameIdentifier	 header Length
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Invalid size for a counter context"	TokenNameStringLiteral	Invalid size for a counter context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Update a MessageDigest with the content of a context. * Note that this skips the header entirely since the header information * has local meaning only, while digests a meant for comparison across * nodes. This means in particular that we always have: * updateDigest(ctx) == updateDigest(clearAllDelta(ctx)) */	TokenNameCOMMENT_JAVADOC	 Update a MessageDigest with the content of a context. Note that this skips the header entirely since the header information has local meaning only, while digests a meant for comparison across nodes. This means in particular that we always have: updateDigest(ctx) == updateDigest(clearAllDelta(ctx)) 
public	TokenNamepublic	
void	TokenNamevoid	
updateDigest	TokenNameIdentifier	 update Digest
(	TokenNameLPAREN	
MessageDigest	TokenNameIdentifier	 Message Digest
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hlength	TokenNameIdentifier	 hlength
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
dup	TokenNameIdentifier	 dup
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dup	TokenNameIdentifier	 dup
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
hlength	TokenNameIdentifier	 hlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
dup	TokenNameIdentifier	 dup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the provided context has a count for the provided * CounterId. * * TODO: since the context is sorted, we could implement a binary search. * This is however not called in any critical path and contexts will be * fairly small so it doesn't matter much. */	TokenNameCOMMENT_JAVADOC	 Checks whether the provided context has a count for the provided CounterId. * TODO: since the context is sorted, we could implement a binary search. This is however not called in any critical path and contexts will be fairly small so it doesn't matter much. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasCounterId	TokenNameIdentifier	 has Counter Id
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we could use a ContextState but it is easy enough that we avoid the object creation 	TokenNameCOMMENT_LINE	we could use a ContextState but it is easy enough that we avoid the object creation 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute a new context such that if applied to context yields the same * total but with old local counter ids nulified and there content merged to * the current localCounterId. */	TokenNameCOMMENT_JAVADOC	 Compute a new context such that if applied to context yields the same total but with old local counter ids nulified and there content merged to the current localCounterId. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
computeOldShardMerger	TokenNameIdentifier	 compute Old Shard Merger
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
oldIds	TokenNameIdentifier	 old Ids
,	TokenNameCOMMA	
long	TokenNamelong	
mergeBefore	TokenNameIdentifier	 merge Before
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
int	TokenNameint	
hlength	TokenNameIdentifier	 hlength
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
localId	TokenNameIdentifier	 local Id
=	TokenNameEQUAL	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
getLocalId	TokenNameIdentifier	 get Local Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
>	TokenNameGREATER	
recordIterator	TokenNameIdentifier	 record Iterator
=	TokenNameEQUAL	
oldIds	TokenNameIdentifier	 old Ids
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
CounterIdRecord	TokenNameIdentifier	 Counter Id Record
currRecord	TokenNameIdentifier	 curr Record
=	TokenNameEQUAL	
recordIterator	TokenNameIdentifier	 record Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
recordIterator	TokenNameIdentifier	 record Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
hlength	TokenNameIdentifier	 hlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
>	TokenNameGREATER	
toMerge	TokenNameIdentifier	 to Merge
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CounterId	TokenNameIdentifier	 Counter Id
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
mergeTotal	TokenNameIdentifier	 merge Total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
currRecord	TokenNameIdentifier	 curr Record
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
currRecord	TokenNameIdentifier	 curr Record
.	TokenNameDOT	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localId	TokenNameIdentifier	 local Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CounterId	TokenNameIdentifier	 Counter Id
counterId	TokenNameIdentifier	 counter Id
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
currRecord	TokenNameIdentifier	 curr Record
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currRecord	TokenNameIdentifier	 curr Record
=	TokenNameEQUAL	
recordIterator	TokenNameIdentifier	 record Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
recordIterator	TokenNameIdentifier	 record Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Already merged shard, waiting to be collected 	TokenNameCOMMENT_LINE	Already merged shard, waiting to be collected 
if	TokenNameif	
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localId	TokenNameIdentifier	 local Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// we should not get there, but we have been creating problematic context prior to #2968 	TokenNameCOMMENT_LINE	we should not get there, but we have been creating problematic context prior to #2968 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Current counterId with a negative clock (likely due to #2968). You need to restart this node with -Dcassandra.renew_counter_id=true to fix."	TokenNameStringLiteral	Current counterId with a negative clock (likely due to #2968). You need to restart this node with -Dcassandra.renew_counter_id=true to fix.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should not happen, but previous bugs have generated this (#2968 in particular) so fixing it. 	TokenNameCOMMENT_LINE	This should not happen, but previous bugs have generated this (#2968 in particular) so fixing it. 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Invalid counter context (clock is %d and count is %d for CounterId %s), will fix"	TokenNameStringLiteral	Invalid counter context (clock is %d and count is %d for CounterId %s), will fix
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeTotal	TokenNameIdentifier	 merge Total
+=	TokenNamePLUS_EQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Found an old id. However, merging an oldId that has just been renewed isn't safe, so 	TokenNameCOMMENT_LINE	Found an old id. However, merging an oldId that has just been renewed isn't safe, so 
// we check that it has been renewed before mergeBefore. 	TokenNameCOMMENT_LINE	we check that it has been renewed before mergeBefore. 
if	TokenNameif	
(	TokenNameLPAREN	
currRecord	TokenNameIdentifier	 curr Record
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
<	TokenNameLESS	
mergeBefore	TokenNameIdentifier	 merge Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeTotal	TokenNameIdentifier	 merge Total
+=	TokenNamePLUS_EQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
currRecord	TokenNameIdentifier	 curr Record
=	TokenNameEQUAL	
recordIterator	TokenNameIdentifier	 record Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
recordIterator	TokenNameIdentifier	 record Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Continuing the iteration so that we can repair invalid shards 	TokenNameCOMMENT_LINE	Continuing the iteration so that we can repair invalid shards 
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CounterId	TokenNameIdentifier	 Counter Id
counterId	TokenNameIdentifier	 counter Id
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localId	TokenNameIdentifier	 local Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// we should not get there, but we have been creating problematic context prior to #2968 	TokenNameCOMMENT_LINE	we should not get there, but we have been creating problematic context prior to #2968 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Current counterId with a negative clock (likely due to #2968). You need to restart this node with -Dcassandra.renew_counter_id=true to fix."	TokenNameStringLiteral	Current counterId with a negative clock (likely due to #2968). You need to restart this node with -Dcassandra.renew_counter_id=true to fix.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should not happen, but previous bugs have generated this (#2968 in particular) so fixing it. 	TokenNameCOMMENT_LINE	This should not happen, but previous bugs have generated this (#2968 in particular) so fixing it. 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Invalid counter context (clock is %d and count is %d for CounterId %s), will fix"	TokenNameStringLiteral	Invalid counter context (clock is %d and count is %d for CounterId %s), will fix
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeTotal	TokenNameIdentifier	 merge Total
+=	TokenNamePLUS_EQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
ContextState	TokenNameIdentifier	 Context State
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
removedTotal	TokenNameIdentifier	 removed Total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
localWritten	TokenNameIdentifier	 local Written
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CounterId	TokenNameIdentifier	 Counter Id
counterId	TokenNameIdentifier	 counter Id
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
localId	TokenNameIdentifier	 local Id
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
localId	TokenNameIdentifier	 local Id
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
mergeTotal	TokenNameIdentifier	 merge Total
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localWritten	TokenNameIdentifier	 local Written
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
counterId	TokenNameIdentifier	 counter Id
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
toMerge	TokenNameIdentifier	 to Merge
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removedTotal	TokenNameIdentifier	 removed Total
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
counterId	TokenNameIdentifier	 counter Id
,	TokenNameCOMMA	
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
localWritten	TokenNameIdentifier	 local Written
)	TokenNameRPAREN	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
localId	TokenNameIdentifier	 local Id
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
mergeTotal	TokenNameIdentifier	 merge Total
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity check 	TokenNameCOMMENT_LINE	sanity check 
assert	TokenNameassert	
mergeTotal	TokenNameIdentifier	 merge Total
==	TokenNameEQUAL_EQUAL	
removedTotal	TokenNameIdentifier	 removed Total
;	TokenNameSEMICOLON	
return	TokenNamereturn	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove shards that have been canceled through computeOldShardMerger * since a time older than gcBefore. * Used by compaction to strip context of unecessary information, * shrinking them. */	TokenNameCOMMENT_JAVADOC	 Remove shards that have been canceled through computeOldShardMerger since a time older than gcBefore. Used by compaction to strip context of unecessary information, shrinking them. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
removeOldShards	TokenNameIdentifier	 remove Old Shards
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hlength	TokenNameIdentifier	 hlength
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
hlength	TokenNameIdentifier	 hlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
removedShards	TokenNameIdentifier	 removed Shards
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
removedDelta	TokenNameIdentifier	 removed Delta
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clock	TokenNameIdentifier	 clock
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We should never have a count != 0 when clock < 0. 	TokenNameCOMMENT_LINE	We should never have a count != 0 when clock < 0. 
// We know that previous may have created those situation though, so: 	TokenNameCOMMENT_LINE	We know that previous may have created those situation though, so: 
// * for delta shard: we throw an exception since computeOldShardMerger should 	TokenNameCOMMENT_LINE	* for delta shard: we throw an exception since computeOldShardMerger should 
// have corrected that situation 	TokenNameCOMMENT_LINE	have corrected that situation 
// * for non-delta shard: it is a much more crappier situation because there is 	TokenNameCOMMENT_LINE	* for non-delta shard: it is a much more crappier situation because there is 
// not much we can do since we are not responsible for that shard. So we simply 	TokenNameCOMMENT_LINE	not much we can do since we are not responsible for that shard. So we simply 
// ignore the shard. 	TokenNameCOMMENT_LINE	ignore the shard. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Counter shard with negative clock but count != 0; context = "	TokenNameStringLiteral	Counter shard with negative clock but count != 0; context = 
+	TokenNamePLUS	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Ignoring non-removable non-delta corrupted shard in context "	TokenNameStringLiteral	Ignoring non-removable non-delta corrupted shard in context 
+	TokenNamePLUS	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
clock	TokenNameIdentifier	 clock
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removedShards	TokenNameIdentifier	 removed Shards
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
removedDelta	TokenNameIdentifier	 removed Delta
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
removedShards	TokenNameIdentifier	 removed Shards
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
int	TokenNameint	
removedHeaderSize	TokenNameIdentifier	 removed Header Size
=	TokenNameEQUAL	
removedDelta	TokenNameIdentifier	 removed Delta
*	TokenNameMULTIPLY	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
int	TokenNameint	
removedBodySize	TokenNameIdentifier	 removed Body Size
=	TokenNameEQUAL	
removedShards	TokenNameIdentifier	 removed Shards
*	TokenNameMULTIPLY	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
removedHeaderSize	TokenNameIdentifier	 removed Header Size
-	TokenNameMINUS	
removedBodySize	TokenNameIdentifier	 removed Body Size
;	TokenNameSEMICOLON	
int	TokenNameint	
newHlength	TokenNameIdentifier	 new Hlength
=	TokenNameEQUAL	
hlength	TokenNameIdentifier	 hlength
-	TokenNameMINUS	
removedHeaderSize	TokenNameIdentifier	 removed Header Size
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
cleanedContext	TokenNameIdentifier	 cleaned Context
=	TokenNameEQUAL	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanedContext	TokenNameIdentifier	 cleaned Context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
cleanedContext	TokenNameIdentifier	 cleaned Context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
newHlength	TokenNameIdentifier	 new Hlength
-	TokenNameMINUS	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContextState	TokenNameIdentifier	 Context State
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
cleanedContext	TokenNameIdentifier	 cleaned Context
,	TokenNameCOMMA	
newHlength	TokenNameIdentifier	 new Hlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clock	TokenNameIdentifier	 clock
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
clock	TokenNameIdentifier	 clock
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
cleaned	TokenNameIdentifier	 cleaned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cleanedContext	TokenNameIdentifier	 cleaned Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper class to work on contexts (works by iterating over them). * A context being abstractly a list of tuple (counterid, clock, count), a * ContextState encapsulate a context and a position to one of the tuple. * It also allow to create new context iteratively. * * Note: this is intrinsically a private class intended for use by the * methods of CounterContext only. It is however public because it is * convenient to create handcrafted context for unit tests. */	TokenNameCOMMENT_JAVADOC	 Helper class to work on contexts (works by iterating over them). A context being abstractly a list of tuple (counterid, clock, count), a ContextState encapsulate a context and a position to one of the tuple. It also allow to create new context iteratively. * Note: this is intrinsically a private class intended for use by the methods of CounterContext only. It is however public because it is convenient to create handcrafted context for unit tests. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ContextState	TokenNameIdentifier	 Context State
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
headerOffset	TokenNameIdentifier	 header Offset
;	TokenNameSEMICOLON	
// offset from context.position() 	TokenNameCOMMENT_LINE	offset from context.position() 
private	TokenNameprivate	
int	TokenNameint	
bodyOffset	TokenNameIdentifier	 body Offset
;	TokenNameSEMICOLON	
// offset from context.position() 	TokenNameCOMMENT_LINE	offset from context.position() 
private	TokenNameprivate	
boolean	TokenNameboolean	
currentIsDelta	TokenNameIdentifier	 current Is Delta
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
,	TokenNameCOMMA	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateIsDelta	TokenNameIdentifier	 update Is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
,	TokenNameCOMMA	
int	TokenNameint	
headerOffset	TokenNameIdentifier	 header Offset
,	TokenNameCOMMA	
int	TokenNameint	
bodyOffset	TokenNameIdentifier	 body Offset
,	TokenNameCOMMA	
boolean	TokenNameboolean	
currentIsDelta	TokenNameIdentifier	 current Is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
headerLength	TokenNameIdentifier	 header Length
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
headerOffset	TokenNameIdentifier	 header Offset
=	TokenNameEQUAL	
headerOffset	TokenNameIdentifier	 header Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bodyOffset	TokenNameIdentifier	 body Offset
=	TokenNameEQUAL	
bodyOffset	TokenNameIdentifier	 body Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentIsDelta	TokenNameIdentifier	 current Is Delta
=	TokenNameEQUAL	
currentIsDelta	TokenNameIdentifier	 current Is Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDelta	TokenNameIdentifier	 is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentIsDelta	TokenNameIdentifier	 current Is Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updateIsDelta	TokenNameIdentifier	 update Is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentIsDelta	TokenNameIdentifier	 current Is Delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
headerOffset	TokenNameIdentifier	 header Offset
<	TokenNameLESS	
headerLength	TokenNameIdentifier	 header Length
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
headerOffset	TokenNameIdentifier	 header Offset
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
elementIdx	TokenNameIdentifier	 element Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bodyOffset	TokenNameIdentifier	 body Offset
<	TokenNameLESS	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
remainingHeaderLength	TokenNameIdentifier	 remaining Header Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
headerLength	TokenNameIdentifier	 header Length
-	TokenNameMINUS	
headerOffset	TokenNameIdentifier	 header Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
remainingBodyLength	TokenNameIdentifier	 remaining Body Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
bodyOffset	TokenNameIdentifier	 body Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bodyOffset	TokenNameIdentifier	 body Offset
+=	TokenNamePLUS_EQUAL	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentIsDelta	TokenNameIdentifier	 current Is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
headerOffset	TokenNameIdentifier	 header Offset
+=	TokenNamePLUS_EQUAL	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateIsDelta	TokenNameIdentifier	 update Is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This advance other to the next position (but not this) 	TokenNameCOMMENT_LINE	This advance other to the next position (but not this) 
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
ContextState	TokenNameIdentifier	 Context State
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
arrayCopy	TokenNameIdentifier	 array Copy
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bodyOffset	TokenNameIdentifier	 body Offset
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bodyOffset	TokenNameIdentifier	 body Offset
,	TokenNameCOMMA	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentIsDelta	TokenNameIdentifier	 current Is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
headerOffset	TokenNameIdentifier	 header Offset
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
elementIdx	TokenNameIdentifier	 element Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
currentIsDelta	TokenNameIdentifier	 current Is Delta
=	TokenNameEQUAL	
currentIsDelta	TokenNameIdentifier	 current Is Delta
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareIdTo	TokenNameIdentifier	 compare Id To
(	TokenNameLPAREN	
ContextState	TokenNameIdentifier	 Context State
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareId	TokenNameIdentifier	 compare Id
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bodyOffset	TokenNameIdentifier	 body Offset
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bodyOffset	TokenNameIdentifier	 body Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
headerOffset	TokenNameIdentifier	 header Offset
=	TokenNameEQUAL	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bodyOffset	TokenNameIdentifier	 body Offset
=	TokenNameEQUAL	
headerLength	TokenNameIdentifier	 header Length
;	TokenNameSEMICOLON	
updateIsDelta	TokenNameIdentifier	 update Is Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CounterId	TokenNameIdentifier	 Counter Id
getCounterId	TokenNameIdentifier	 get Counter Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bodyOffset	TokenNameIdentifier	 body Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getClock	TokenNameIdentifier	 get Clock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bodyOffset	TokenNameIdentifier	 body Offset
+	TokenNamePLUS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bodyOffset	TokenNameIdentifier	 body Offset
+	TokenNamePLUS	
CounterId	TokenNameIdentifier	 Counter Id
.	TokenNameDOT	
LENGTH	TokenNameIdentifier	 LENGTH
+	TokenNamePLUS	
CLOCK_LENGTH	TokenNameIdentifier	 CLOCK  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Advance this to the next position 	TokenNameCOMMENT_LINE	Advance this to the next position 
public	TokenNamepublic	
void	TokenNamevoid	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
long	TokenNamelong	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isDelta	TokenNameIdentifier	 is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeElementAtOffset	TokenNameIdentifier	 write Element At Offset
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bodyOffset	TokenNameIdentifier	 body Offset
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDelta	TokenNameIdentifier	 is Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
headerOffset	TokenNameIdentifier	 header Offset
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
elementIdx	TokenNameIdentifier	 element Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentIsDelta	TokenNameIdentifier	 current Is Delta
=	TokenNameEQUAL	
isDelta	TokenNameIdentifier	 is Delta
;	TokenNameSEMICOLON	
moveToNext	TokenNameIdentifier	 move To Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
CounterId	TokenNameIdentifier	 Counter Id
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
long	TokenNamelong	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeElement	TokenNameIdentifier	 write Element
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
clock	TokenNameIdentifier	 clock
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
elementIdx	TokenNameIdentifier	 element Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
bodyOffset	TokenNameIdentifier	 body Offset
-	TokenNameMINUS	
headerLength	TokenNameIdentifier	 header Length
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ContextState	TokenNameIdentifier	 Context State
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
headerLength	TokenNameIdentifier	 header Length
,	TokenNameCOMMA	
headerOffset	TokenNameIdentifier	 header Offset
,	TokenNameCOMMA	
bodyOffset	TokenNameIdentifier	 body Offset
,	TokenNameCOMMA	
currentIsDelta	TokenNameIdentifier	 current Is Delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Allocate a new context big enough for {@code elementCount} elements * with {@code deltaCount} of them being delta, and return the initial * ContextState corresponding. */	TokenNameCOMMENT_BLOCK	 Allocate a new context big enough for {@code elementCount} elements with {@code deltaCount} of them being delta, and return the initial ContextState corresponding. 
public	TokenNamepublic	
static	TokenNamestatic	
ContextState	TokenNameIdentifier	 Context State
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
int	TokenNameint	
elementCount	TokenNameIdentifier	 element Count
,	TokenNameCOMMA	
int	TokenNameint	
deltaCount	TokenNameIdentifier	 delta Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
elementCount	TokenNameIdentifier	 element Count
,	TokenNameCOMMA	
deltaCount	TokenNameIdentifier	 delta Count
,	TokenNameCOMMA	
HeapAllocator	TokenNameIdentifier	 Heap Allocator
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ContextState	TokenNameIdentifier	 Context State
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
int	TokenNameint	
elementCount	TokenNameIdentifier	 element Count
,	TokenNameCOMMA	
int	TokenNameint	
deltaCount	TokenNameIdentifier	 delta Count
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
deltaCount	TokenNameIdentifier	 delta Count
<=	TokenNameLESS_EQUAL	
elementCount	TokenNameIdentifier	 element Count
;	TokenNameSEMICOLON	
int	TokenNameint	
hlength	TokenNameIdentifier	 hlength
=	TokenNameEQUAL	
HEADER_SIZE_LENGTH	TokenNameIdentifier	 HEADER  SIZE  LENGTH
+	TokenNamePLUS	
deltaCount	TokenNameIdentifier	 delta Count
*	TokenNameMULTIPLY	
HEADER_ELT_LENGTH	TokenNameIdentifier	 HEADER  ELT  LENGTH
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
allocator	TokenNameIdentifier	 allocator
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
hlength	TokenNameIdentifier	 hlength
+	TokenNamePLUS	
elementCount	TokenNameIdentifier	 element Count
*	TokenNameMULTIPLY	
STEP_LENGTH	TokenNameIdentifier	 STEP  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
deltaCount	TokenNameIdentifier	 delta Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ContextState	TokenNameIdentifier	 Context State
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
hlength	TokenNameIdentifier	 hlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
