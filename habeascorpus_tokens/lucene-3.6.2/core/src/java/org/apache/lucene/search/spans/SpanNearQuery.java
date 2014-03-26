package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ToStringUtils	TokenNameIdentifier	 To String Utils
;	TokenNameSEMICOLON	
/** Matches spans which are near one another. One can specify <i>slop</i>, the * maximum number of intervening unmatched positions, as well as whether * matches are required to be in-order. */	TokenNameCOMMENT_JAVADOC	 Matches spans which are near one another. One can specify <i>slop</i>, the maximum number of intervening unmatched positions, as well as whether matches are required to be in-order. 
public	TokenNamepublic	
class	TokenNameclass	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
extends	TokenNameextends	
SpanQuery	TokenNameIdentifier	 Span Query
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
collectPayloads	TokenNameIdentifier	 collect Payloads
;	TokenNameSEMICOLON	
/** Construct a SpanNearQuery. Matches spans matching a span from each * clause, with up to <code>slop</code> total unmatched positions between * them. * When <code>inOrder</code> is true, the spans from each clause * must be * ordered as in <code>clauses</code>. * @param clauses the clauses to find near each other * @param slop The slop value * @param inOrder true if order is important * */	TokenNameCOMMENT_JAVADOC	 Construct a SpanNearQuery. Matches spans matching a span from each clause, with up to <code>slop</code> total unmatched positions between them. When <code>inOrder</code> is true, the spans from each clause must be ordered as in <code>clauses</code>. @param clauses the clauses to find near each other @param slop The slop value @param inOrder true if order is important 
public	TokenNamepublic	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
inOrder	TokenNameIdentifier	 in Order
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
collectPayloads	TokenNameIdentifier	 collect Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// copy clauses array into an ArrayList 	TokenNameCOMMENT_LINE	copy clauses array into an ArrayList 
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check field 	TokenNameCOMMENT_LINE	check field 
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Clauses must have same field."	TokenNameStringLiteral	Clauses must have same field.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collectPayloads	TokenNameIdentifier	 collect Payloads
=	TokenNameEQUAL	
collectPayloads	TokenNameIdentifier	 collect Payloads
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inOrder	TokenNameIdentifier	 in Order
=	TokenNameEQUAL	
inOrder	TokenNameIdentifier	 in Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the clauses whose spans are matched. */	TokenNameCOMMENT_JAVADOC	 Return the clauses whose spans are matched. 
public	TokenNamepublic	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the maximum number of intervening unmatched positions permitted.*/	TokenNameCOMMENT_JAVADOC	 Return the maximum number of intervening unmatched positions permitted.
public	TokenNamepublic	
int	TokenNameint	
getSlop	TokenNameIdentifier	 get Slop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return true if matches are required to be in-order.*/	TokenNameCOMMENT_JAVADOC	 Return true if matches are required to be in-order.
public	TokenNamepublic	
boolean	TokenNameboolean	
isInOrder	TokenNameIdentifier	 is In Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inOrder	TokenNameIdentifier	 in Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
SpanQuery	TokenNameIdentifier	 Span Query
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"spanNear(["	TokenNameStringLiteral	spanNear([
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"], "	TokenNameStringLiteral	], 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Spans	TokenNameIdentifier	 Spans
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// optimize 0-clause case 	TokenNameCOMMENT_LINE	optimize 0-clause case 
return	TokenNamereturn	
new	TokenNamenew	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
(	TokenNameLPAREN	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// optimize 1-clause case 	TokenNameCOMMENT_LINE	optimize 1-clause case 
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
inOrder	TokenNameIdentifier	 in Order
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Spans	TokenNameIdentifier	 Spans
)	TokenNameRPAREN	
new	TokenNamenew	
NearSpansOrdered	TokenNameIdentifier	 Near Spans Ordered
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
collectPayloads	TokenNameIdentifier	 collect Payloads
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Spans	TokenNameIdentifier	 Spans
)	TokenNameRPAREN	
new	TokenNamenew	
NearSpansUnordered	TokenNameIdentifier	 Near Spans Unordered
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
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
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// clause rewrote: must clone 	TokenNameCOMMENT_LINE	clause rewrote: must clone 
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
// some clauses rewrote 	TokenNameCOMMENT_LINE	some clauses rewrote 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// no clauses rewrote 	TokenNameCOMMENT_LINE	no clauses rewrote 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newClauses	TokenNameIdentifier	 new Clauses
=	TokenNameEQUAL	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
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
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newClauses	TokenNameIdentifier	 new Clauses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
)	TokenNameRPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
spanNearQuery	TokenNameIdentifier	 span Near Query
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
newClauses	TokenNameIdentifier	 new Clauses
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
spanNearQuery	TokenNameIdentifier	 span Near Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true iff <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true iff <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
spanNearQuery	TokenNameIdentifier	 span Near Query
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
!=	TokenNameNOT_EQUAL	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
!=	TokenNameNOT_EQUAL	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mix bits before folding in things like boost, since it could cancel the 	TokenNameCOMMENT_LINE	Mix bits before folding in things like boost, since it could cancel the 
// last element of clauses. This particular mix also serves to 	TokenNameCOMMENT_LINE	last element of clauses. This particular mix also serves to 
// differentiate SpanNearQuery hashcodes from others. 	TokenNameCOMMENT_LINE	differentiate SpanNearQuery hashcodes from others. 
result	TokenNameIdentifier	 result
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<<	TokenNameLEFT_SHIFT	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reversible 	TokenNameCOMMENT_LINE	reversible 
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToRawIntBits	TokenNameIdentifier	 float To Raw Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
inOrder	TokenNameIdentifier	 in Order
?	TokenNameQUESTION	
0x99AFD3BD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
