/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
;	TokenNameSEMICOLON	
/** Merges sorted input iterators which individually contain unique items. */	TokenNameCOMMENT_JAVADOC	 Merges sorted input iterators which individually contain unique items. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MergeIterator	TokenNameIdentifier	 Merge Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
extends	TokenNameextends	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
<	TokenNameLESS	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
implements	TokenNameimplements	
IMergeIterator	TokenNameIdentifier	 I Merge Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
iterators	TokenNameIdentifier	 iterators
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
MergeIterator	TokenNameIdentifier	 Merge Iterator
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
iters	TokenNameIdentifier	 iters
,	TokenNameCOMMA	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iterators	TokenNameIdentifier	 iterators
=	TokenNameEQUAL	
iters	TokenNameIdentifier	 iters
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reducer	TokenNameIdentifier	 reducer
=	TokenNameEQUAL	
reducer	TokenNameIdentifier	 reducer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
IMergeIterator	TokenNameIdentifier	 I Merge Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
final	TokenNamefinal	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
trivialReduceIsTrivial	TokenNameIdentifier	 trivial Reduce Is Trivial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
TrivialOneToOne	TokenNameIdentifier	 Trivial One To One
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
OneToOne	TokenNameIdentifier	 One To One
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ManyToOne	TokenNameIdentifier	 Many To One
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
iterators	TokenNameIdentifier	 iterators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iterators	TokenNameIdentifier	 iterators
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
iterators	TokenNameIdentifier	 iterators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A MergeIterator that consumes multiple input values per output value. */	TokenNameCOMMENT_JAVADOC	 A MergeIterator that consumes multiple input values per output value. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ManyToOne	TokenNameIdentifier	 Many To One
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
extends	TokenNameextends	
MergeIterator	TokenNameIdentifier	 Merge Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
{	TokenNameLBRACE	
// a queue for return: all candidates must be open and have at least one item 	TokenNameCOMMENT_LINE	a queue for return: all candidates must be open and have at least one item 
protected	TokenNameprotected	
final	TokenNamefinal	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
// a stack of the last consumed candidates, so that we can lazily call 'advance()' 	TokenNameCOMMENT_LINE	a stack of the last consumed candidates, so that we can lazily call 'advance()' 
// TODO: if we had our own PriorityQueue implementation we could stash items 	TokenNameCOMMENT_LINE	TODO: if we had our own PriorityQueue implementation we could stash items 
// at the end of its array, so we wouldn't need this storage 	TokenNameCOMMENT_LINE	at the end of its array, so we wouldn't need this storage 
protected	TokenNameprotected	
final	TokenNamefinal	
ArrayDeque	TokenNameIdentifier	 Array Deque
<	TokenNameLESS	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
candidates	TokenNameIdentifier	 candidates
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ManyToOne	TokenNameIdentifier	 Many To One
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
iters	TokenNameIdentifier	 iters
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
iters	TokenNameIdentifier	 iters
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
iters	TokenNameIdentifier	 iters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
:	TokenNameCOLON	
iters	TokenNameIdentifier	 iters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
new	TokenNamenew	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// was empty 	TokenNameCOMMENT_LINE	was empty 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
candidates	TokenNameIdentifier	 candidates
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayDeque	TokenNameIdentifier	 Array Deque
<	TokenNameLESS	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Out	TokenNameIdentifier	 Out
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Consume values by sending them to the reducer while they are equal. */	TokenNameCOMMENT_JAVADOC	 Consume values by sending them to the reducer while they are equal. 
protected	TokenNameprotected	
final	TokenNamefinal	
Out	TokenNameIdentifier	 Out
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
onKeyChange	TokenNameIdentifier	 on Key Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
candidates	TokenNameIdentifier	 candidates
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Advance and re-enqueue all items we consumed in the last iteration. */	TokenNameCOMMENT_JAVADOC	 Advance and re-enqueue all items we consumed in the last iteration. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
candidate	TokenNameIdentifier	 candidate
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
candidates	TokenNameIdentifier	 candidates
.	TokenNameDOT	
pollFirst	TokenNameIdentifier	 poll First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Holds and is comparable by the head item of an iterator it owns 	TokenNameCOMMENT_LINE	Holds and is comparable by the head item of an iterator it owns 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
In	TokenNameIdentifier	 In
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Candidate	TokenNameIdentifier	 Candidate
(	TokenNameLPAREN	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return True if our iterator had an item, and it is now available */	TokenNameCOMMENT_JAVADOC	 @return True if our iterator had an item, and it is now available 
protected	TokenNameprotected	
boolean	TokenNameboolean	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Candidate	TokenNameIdentifier	 Candidate
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Accumulator that collects values of type A, and outputs a value of type B. */	TokenNameCOMMENT_JAVADOC	 Accumulator that collects values of type A, and outputs a value of type B. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * @return true if Out is the same as In for the case of a single source iterator */	TokenNameCOMMENT_JAVADOC	 @return true if Out is the same as In for the case of a single source iterator 
public	TokenNamepublic	
boolean	TokenNameboolean	
trivialReduceIsTrivial	TokenNameIdentifier	 trivial Reduce Is Trivial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * combine this object with the previous ones. * intermediate state is up to your implementation. */	TokenNameCOMMENT_JAVADOC	 combine this object with the previous ones. intermediate state is up to your implementation. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
In	TokenNameIdentifier	 In
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** @return The last object computed by reduce */	TokenNameCOMMENT_JAVADOC	 @return The last object computed by reduce 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Out	TokenNameIdentifier	 Out
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called at the begining of each new key, before any reduce is called. * To be overriden by implementing classes. */	TokenNameCOMMENT_JAVADOC	 Called at the begining of each new key, before any reduce is called. To be overriden by implementing classes. 
protected	TokenNameprotected	
void	TokenNamevoid	
onKeyChange	TokenNameIdentifier	 on Key Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * May be overridden by implementations that require cleaning up after use */	TokenNameCOMMENT_JAVADOC	 May be overridden by implementations that require cleaning up after use 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OneToOne	TokenNameIdentifier	 One To One
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
extends	TokenNameextends	
MergeIterator	TokenNameIdentifier	 Merge Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>	TokenNameGREATER	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneToOne	TokenNameIdentifier	 One To One
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Out	TokenNameIdentifier	 Out
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
onKeyChange	TokenNameIdentifier	 on Key Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reducer	TokenNameIdentifier	 reducer
.	TokenNameDOT	
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TrivialOneToOne	TokenNameIdentifier	 Trivial One To One
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
extends	TokenNameextends	
MergeIterator	TokenNameIdentifier	 Merge Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TrivialOneToOne	TokenNameIdentifier	 Trivial One To One
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
In	TokenNameIdentifier	 In
>>	TokenNameRIGHT_SHIFT	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
In	TokenNameIdentifier	 In
,	TokenNameCOMMA	
Out	TokenNameIdentifier	 Out
>	TokenNameGREATER	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
reducer	TokenNameIdentifier	 reducer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Out	TokenNameIdentifier	 Out
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Out	TokenNameIdentifier	 Out
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
