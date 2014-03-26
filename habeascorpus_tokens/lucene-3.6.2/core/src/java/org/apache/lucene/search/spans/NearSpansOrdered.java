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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayUtil	TokenNameIdentifier	 Array Util
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** A Spans that is formed from the ordered subspans of a SpanNearQuery * where the subspans do not overlap and have a maximum slop between them. * <p> * The formed spans only contains minimum slop matches.<br> * The matching slop is computed from the distance(s) between * the non overlapping matching Spans.<br> * Successive matches are always formed from the successive Spans * of the SpanNearQuery. * <p> * The formed spans may contain overlaps when the slop is at least 1. * For example, when querying using * <pre>t1 t2 t3</pre> * with slop at least 1, the fragment: * <pre>t1 t2 t1 t3 t2 t3</pre> * matches twice: * <pre>t1 t2 .. t3 </pre> * <pre> t1 .. t2 t3</pre> * * * Expert: * Only public for subclassing. Most implementations should not need this class */	TokenNameCOMMENT_JAVADOC	 A Spans that is formed from the ordered subspans of a SpanNearQuery where the subspans do not overlap and have a maximum slop between them. <p> The formed spans only contains minimum slop matches.<br> The matching slop is computed from the distance(s) between the non overlapping matching Spans.<br> Successive matches are always formed from the successive Spans of the SpanNearQuery. <p> The formed spans may contain overlaps when the slop is at least 1. For example, when querying using <pre>t1 t2 t3</pre> with slop at least 1, the fragment: <pre>t1 t2 t1 t3 t2 t3</pre> matches twice: <pre>t1 t2 .. t3 </pre> <pre> t1 .. t2 t3</pre> * Expert: Only public for subclassing. Most implementations should not need this class 
public	TokenNamepublic	
class	TokenNameclass	
NearSpansOrdered	TokenNameIdentifier	 Near Spans Ordered
extends	TokenNameextends	
Spans	TokenNameIdentifier	 Spans
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
allowedSlop	TokenNameIdentifier	 allowed Slop
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The spans in the same order as the SpanNearQuery */	TokenNameCOMMENT_JAVADOC	 The spans in the same order as the SpanNearQuery 
private	TokenNameprivate	
final	TokenNamefinal	
Spans	TokenNameIdentifier	 Spans
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subSpans	TokenNameIdentifier	 sub Spans
;	TokenNameSEMICOLON	
/** Indicates that all subSpans have same doc() */	TokenNameCOMMENT_JAVADOC	 Indicates that all subSpans have same doc() 
private	TokenNameprivate	
boolean	TokenNameboolean	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
matchDoc	TokenNameIdentifier	 match Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
matchPayload	TokenNameIdentifier	 match Payload
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Spans	TokenNameIdentifier	 Spans
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Spans	TokenNameIdentifier	 Spans
>	TokenNameGREATER	
spanDocComparator	TokenNameIdentifier	 span Doc Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Spans	TokenNameIdentifier	 Spans
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Spans	TokenNameIdentifier	 Spans
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Spans	TokenNameIdentifier	 Spans
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
collectPayloads	TokenNameIdentifier	 collect Payloads
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NearSpansOrdered	TokenNameIdentifier	 Near Spans Ordered
(	TokenNameLPAREN	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
spanNearQuery	TokenNameIdentifier	 span Near Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
spanNearQuery	TokenNameIdentifier	 span Near Query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NearSpansOrdered	TokenNameIdentifier	 Near Spans Ordered
(	TokenNameLPAREN	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
spanNearQuery	TokenNameIdentifier	 span Near Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
collectPayloads	TokenNameIdentifier	 collect Payloads
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Less than 2 clauses: "	TokenNameStringLiteral	Less than 2 clauses: 
+	TokenNamePLUS	
spanNearQuery	TokenNameIdentifier	 span Near Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collectPayloads	TokenNameIdentifier	 collect Payloads
=	TokenNameEQUAL	
collectPayloads	TokenNameIdentifier	 collect Payloads
;	TokenNameSEMICOLON	
allowedSlop	TokenNameIdentifier	 allowed Slop
=	TokenNameEQUAL	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
getSlop	TokenNameIdentifier	 get Slop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
spanNearQuery	TokenNameIdentifier	 span Near Query
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subSpans	TokenNameIdentifier	 sub Spans
=	TokenNameEQUAL	
new	TokenNamenew	
Spans	TokenNameIdentifier	 Spans
[	TokenNameLBRACKET	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
matchPayload	TokenNameIdentifier	 match Payload
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
=	TokenNameEQUAL	
new	TokenNamenew	
Spans	TokenNameIdentifier	 Spans
[	TokenNameLBRACKET	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// used in toSameDoc() 	TokenNameCOMMENT_LINE	used in toSameDoc() 
}	TokenNameRBRACE	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
spanNearQuery	TokenNameIdentifier	 span Near Query
;	TokenNameSEMICOLON	
// kept for toString() only. 	TokenNameCOMMENT_LINE	kept for toString() only. 
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchDoc	TokenNameIdentifier	 match Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchStart	TokenNameIdentifier	 match Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchEnd	TokenNameIdentifier	 match End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Spans	TokenNameIdentifier	 Spans
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSubSpans	TokenNameIdentifier	 get Sub Spans
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subSpans	TokenNameIdentifier	 sub Spans
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
// TODO: Would be nice to be able to lazy load payloads 	TokenNameCOMMENT_LINE	TODO: Would be nice to be able to lazy load payloads 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
matchPayload	TokenNameIdentifier	 match Payload
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchPayload	TokenNameIdentifier	 match Payload
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstTime	TokenNameIdentifier	 first Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
false	TokenNamefalse	
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
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collectPayloads	TokenNameIdentifier	 collect Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchPayload	TokenNameIdentifier	 match Payload
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
advanceAfterOrdered	TokenNameIdentifier	 advance After Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstTime	TokenNameIdentifier	 first Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
false	TokenNamefalse	
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
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collectPayloads	TokenNameIdentifier	 collect Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchPayload	TokenNameIdentifier	 match Payload
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
advanceAfterOrdered	TokenNameIdentifier	 advance After Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Advances the subSpans to just after an ordered match with a minimum slop * that is smaller than the slop allowed by the SpanNearQuery. * @return true iff there is such a match. */	TokenNameCOMMENT_JAVADOC	 Advances the subSpans to just after an ordered match with a minimum slop that is smaller than the slop allowed by the SpanNearQuery. @return true iff there is such a match. 
private	TokenNameprivate	
boolean	TokenNameboolean	
advanceAfterOrdered	TokenNameIdentifier	 advance After Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
inSameDoc	TokenNameIdentifier	 in Same Doc
||	TokenNameOR_OR	
toSameDoc	TokenNameIdentifier	 to Same Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stretchToOrder	TokenNameIdentifier	 stretch To Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
shrinkToAfterShortestMatch	TokenNameIdentifier	 shrink To After Shortest Match
(	TokenNameLPAREN	
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
// no more matches 	TokenNameCOMMENT_LINE	no more matches 
}	TokenNameRBRACE	
/** Advance the subSpans to the same document */	TokenNameCOMMENT_JAVADOC	 Advance the subSpans to the same document 
private	TokenNameprivate	
boolean	TokenNameboolean	
toSameDoc	TokenNameIdentifier	 to Same Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
,	TokenNameCOMMA	
spanDocComparator	TokenNameIdentifier	 span Doc Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstIndex	TokenNameIdentifier	 first Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
firstIndex	TokenNameIdentifier	 first Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
firstIndex	TokenNameIdentifier	 first Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
firstIndex	TokenNameIdentifier	 first Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
firstIndex	TokenNameIdentifier	 first Index
==	TokenNameEQUAL_EQUAL	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstIndex	TokenNameIdentifier	 first Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
:	TokenNameCOLON	
" NearSpansOrdered.toSameDoc() spans "	TokenNameStringLiteral	 NearSpansOrdered.toSameDoc() spans 
+	TokenNamePLUS	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" at doc "	TokenNameStringLiteral	 at doc 
+	TokenNamePLUS	
subSpansByDoc	TokenNameIdentifier	 sub Spans By Doc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", but should be at "	TokenNameStringLiteral	, but should be at 
+	TokenNamePLUS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Check whether two Spans in the same document are ordered. * @param spans1 * @param spans2 * @return true iff spans1 starts before spans2 * or the spans start at the same position, * and spans1 ends before spans2. */	TokenNameCOMMENT_JAVADOC	 Check whether two Spans in the same document are ordered. @param spans1 @param spans2 @return true iff spans1 starts before spans2 or the spans start at the same position, and spans1 ends before spans2. 
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
docSpansOrdered	TokenNameIdentifier	 doc Spans Ordered
(	TokenNameLPAREN	
Spans	TokenNameIdentifier	 Spans
spans1	TokenNameIdentifier	 spans1
,	TokenNameCOMMA	
Spans	TokenNameIdentifier	 Spans
spans2	TokenNameIdentifier	 spans2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
spans1	TokenNameIdentifier	 spans1
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
spans2	TokenNameIdentifier	 spans2
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"doc1 "	TokenNameStringLiteral	doc1 
+	TokenNamePLUS	
spans1	TokenNameIdentifier	 spans1
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" != doc2 "	TokenNameStringLiteral	 != doc2 
+	TokenNamePLUS	
spans2	TokenNameIdentifier	 spans2
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start1	TokenNameIdentifier	 start1
=	TokenNameEQUAL	
spans1	TokenNameIdentifier	 spans1
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start2	TokenNameIdentifier	 start2
=	TokenNameEQUAL	
spans2	TokenNameIdentifier	 spans2
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Do not call docSpansOrdered(int,int,int,int) to avoid invoking .end() : */	TokenNameCOMMENT_BLOCK	 Do not call docSpansOrdered(int,int,int,int) to avoid invoking .end() : 
return	TokenNamereturn	
(	TokenNameLPAREN	
start1	TokenNameIdentifier	 start1
==	TokenNameEQUAL_EQUAL	
start2	TokenNameIdentifier	 start2
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
spans1	TokenNameIdentifier	 spans1
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
spans2	TokenNameIdentifier	 spans2
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
start1	TokenNameIdentifier	 start1
<	TokenNameLESS	
start2	TokenNameIdentifier	 start2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Like {@link #docSpansOrdered(Spans,Spans)}, but use the spans * starts and ends as parameters. */	TokenNameCOMMENT_JAVADOC	 Like {@link #docSpansOrdered(Spans,Spans)}, but use the spans starts and ends as parameters. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
docSpansOrdered	TokenNameIdentifier	 doc Spans Ordered
(	TokenNameLPAREN	
int	TokenNameint	
start1	TokenNameIdentifier	 start1
,	TokenNameCOMMA	
int	TokenNameint	
end1	TokenNameIdentifier	 end1
,	TokenNameCOMMA	
int	TokenNameint	
start2	TokenNameIdentifier	 start2
,	TokenNameCOMMA	
int	TokenNameint	
end2	TokenNameIdentifier	 end2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
start1	TokenNameIdentifier	 start1
==	TokenNameEQUAL_EQUAL	
start2	TokenNameIdentifier	 start2
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
end1	TokenNameIdentifier	 end1
<	TokenNameLESS	
end2	TokenNameIdentifier	 end2
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
start1	TokenNameIdentifier	 start1
<	TokenNameLESS	
start2	TokenNameIdentifier	 start2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Order the subSpans within the same document by advancing all later spans * after the previous one. */	TokenNameCOMMENT_JAVADOC	 Order the subSpans within the same document by advancing all later spans after the previous one. 
private	TokenNameprivate	
boolean	TokenNameboolean	
stretchToOrder	TokenNameIdentifier	 stretch To Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
matchDoc	TokenNameIdentifier	 match Doc
=	TokenNameEQUAL	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
inSameDoc	TokenNameIdentifier	 in Same Doc
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
docSpansOrdered	TokenNameIdentifier	 doc Spans Ordered
(	TokenNameLPAREN	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
matchDoc	TokenNameIdentifier	 match Doc
!=	TokenNameNOT_EQUAL	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
inSameDoc	TokenNameIdentifier	 in Same Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The subSpans are ordered in the same doc, so there is a possible match. * Compute the slop while making the match as short as possible by advancing * all subSpans except the last one in reverse order. */	TokenNameCOMMENT_JAVADOC	 The subSpans are ordered in the same doc, so there is a possible match. Compute the slop while making the match as short as possible by advancing all subSpans except the last one in reverse order. 
private	TokenNameprivate	
boolean	TokenNameboolean	
shrinkToAfterShortestMatch	TokenNameIdentifier	 shrink To After Shortest Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
possibleMatchPayloads	TokenNameIdentifier	 possible Match Payloads
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
possibleMatchPayloads	TokenNameIdentifier	 possible Match Payloads
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
possiblePayload	TokenNameIdentifier	 possible Payload
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
matchSlop	TokenNameIdentifier	 match Slop
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastStart	TokenNameIdentifier	 last Start
=	TokenNameEQUAL	
matchStart	TokenNameIdentifier	 match Start
;	TokenNameSEMICOLON	
int	TokenNameint	
lastEnd	TokenNameIdentifier	 last End
=	TokenNameEQUAL	
matchEnd	TokenNameIdentifier	 match End
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
subSpans	TokenNameIdentifier	 sub Spans
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Spans	TokenNameIdentifier	 Spans
prevSpans	TokenNameIdentifier	 prev Spans
=	TokenNameEQUAL	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
collectPayloads	TokenNameIdentifier	 collect Payloads
&&	TokenNameAND_AND	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
possiblePayload	TokenNameIdentifier	 possible Payload
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
possiblePayload	TokenNameIdentifier	 possible Payload
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
prevStart	TokenNameIdentifier	 prev Start
=	TokenNameEQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevEnd	TokenNameIdentifier	 prev End
=	TokenNameEQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Advance prevSpans until after (lastStart, lastEnd) 	TokenNameCOMMENT_LINE	Advance prevSpans until after (lastStart, lastEnd) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Check remaining subSpans for final match. 	TokenNameCOMMENT_LINE	Check remaining subSpans for final match. 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
matchDoc	TokenNameIdentifier	 match Doc
!=	TokenNameNOT_EQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inSameDoc	TokenNameIdentifier	 in Same Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// The last subSpans is not advanced here. 	TokenNameCOMMENT_LINE	The last subSpans is not advanced here. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Check remaining subSpans for last match in this document. 	TokenNameCOMMENT_LINE	Check remaining subSpans for last match in this document. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
ppStart	TokenNameIdentifier	 pp Start
=	TokenNameEQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ppEnd	TokenNameIdentifier	 pp End
=	TokenNameEQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Cannot avoid invoking .end() 	TokenNameCOMMENT_LINE	Cannot avoid invoking .end() 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
docSpansOrdered	TokenNameIdentifier	 doc Spans Ordered
(	TokenNameLPAREN	
ppStart	TokenNameIdentifier	 pp Start
,	TokenNameCOMMA	
ppEnd	TokenNameIdentifier	 pp End
,	TokenNameCOMMA	
lastStart	TokenNameIdentifier	 last Start
,	TokenNameCOMMA	
lastEnd	TokenNameIdentifier	 last End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Check remaining subSpans. 	TokenNameCOMMENT_LINE	Check remaining subSpans. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// prevSpans still before (lastStart, lastEnd) 	TokenNameCOMMENT_LINE	prevSpans still before (lastStart, lastEnd) 
prevStart	TokenNameIdentifier	 prev Start
=	TokenNameEQUAL	
ppStart	TokenNameIdentifier	 pp Start
;	TokenNameSEMICOLON	
prevEnd	TokenNameIdentifier	 prev End
=	TokenNameEQUAL	
ppEnd	TokenNameIdentifier	 pp End
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
collectPayloads	TokenNameIdentifier	 collect Payloads
&&	TokenNameAND_AND	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
prevSpans	TokenNameIdentifier	 prev Spans
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
possiblePayload	TokenNameIdentifier	 possible Payload
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
possiblePayload	TokenNameIdentifier	 possible Payload
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collectPayloads	TokenNameIdentifier	 collect Payloads
&&	TokenNameAND_AND	
possiblePayload	TokenNameIdentifier	 possible Payload
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
possibleMatchPayloads	TokenNameIdentifier	 possible Match Payloads
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
possiblePayload	TokenNameIdentifier	 possible Payload
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
prevStart	TokenNameIdentifier	 prev Start
<=	TokenNameLESS_EQUAL	
matchStart	TokenNameIdentifier	 match Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
>	TokenNameGREATER	
prevEnd	TokenNameIdentifier	 prev End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only non overlapping spans add to slop. 	TokenNameCOMMENT_LINE	Only non overlapping spans add to slop. 
matchSlop	TokenNameIdentifier	 match Slop
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
-	TokenNameMINUS	
prevEnd	TokenNameIdentifier	 prev End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Do not break on (matchSlop > allowedSlop) here to make sure * that subSpans[0] is advanced after the match, if any. */	TokenNameCOMMENT_BLOCK	 Do not break on (matchSlop > allowedSlop) here to make sure that subSpans[0] is advanced after the match, if any. 
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
prevStart	TokenNameIdentifier	 prev Start
;	TokenNameSEMICOLON	
lastStart	TokenNameIdentifier	 last Start
=	TokenNameEQUAL	
prevStart	TokenNameIdentifier	 prev Start
;	TokenNameSEMICOLON	
lastEnd	TokenNameIdentifier	 last End
=	TokenNameEQUAL	
prevEnd	TokenNameIdentifier	 prev End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
matchSlop	TokenNameIdentifier	 match Slop
<=	TokenNameLESS_EQUAL	
allowedSlop	TokenNameIdentifier	 allowed Slop
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
collectPayloads	TokenNameIdentifier	 collect Payloads
&&	TokenNameAND_AND	
match	TokenNameIdentifier	 match
&&	TokenNameAND_AND	
possibleMatchPayloads	TokenNameIdentifier	 possible Match Payloads
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchPayload	TokenNameIdentifier	 match Payload
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
possibleMatchPayloads	TokenNameIdentifier	 possible Match Payloads
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
// ordered and allowed slop 	TokenNameCOMMENT_LINE	ordered and allowed slop 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")@"	TokenNameStringLiteral	)@
+	TokenNamePLUS	
(	TokenNameLPAREN	
firstTime	TokenNameIdentifier	 first Time
?	TokenNameQUESTION	
"START"	TokenNameStringLiteral	START
:	TokenNameCOLON	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
?	TokenNameQUESTION	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"END"	TokenNameStringLiteral	END
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
