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
PriorityQueue	TokenNameIdentifier	 Priority Queue
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
Collection	TokenNameIdentifier	 Collection
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
/** * Similar to {@link NearSpansOrdered}, but for the unordered case. * * Expert: * Only public for subclassing. Most implementations should not need this class */	TokenNameCOMMENT_JAVADOC	 Similar to {@link NearSpansOrdered}, but for the unordered case. * Expert: Only public for subclassing. Most implementations should not need this class 
public	TokenNamepublic	
class	TokenNameclass	
NearSpansUnordered	TokenNameIdentifier	 Near Spans Unordered
extends	TokenNameextends	
Spans	TokenNameIdentifier	 Spans
{	TokenNameLBRACE	
private	TokenNameprivate	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SpansCell	TokenNameIdentifier	 Spans Cell
>	TokenNameGREATER	
ordered	TokenNameIdentifier	 ordered
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SpansCell	TokenNameIdentifier	 Spans Cell
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// spans in query order 	TokenNameCOMMENT_LINE	spans in query order 
private	TokenNameprivate	
Spans	TokenNameIdentifier	 Spans
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subSpans	TokenNameIdentifier	 sub Spans
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
// from query 	TokenNameCOMMENT_LINE	from query 
private	TokenNameprivate	
SpansCell	TokenNameIdentifier	 Spans Cell
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
// linked list of spans 	TokenNameCOMMENT_LINE	linked list of spans 
private	TokenNameprivate	
SpansCell	TokenNameIdentifier	 Spans Cell
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
// sorted by doc only 	TokenNameCOMMENT_LINE	sorted by doc only 
private	TokenNameprivate	
int	TokenNameint	
totalLength	TokenNameIdentifier	 total Length
;	TokenNameSEMICOLON	
// sum of current lengths 	TokenNameCOMMENT_LINE	sum of current lengths 
private	TokenNameprivate	
CellQueue	TokenNameIdentifier	 Cell Queue
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
// sorted queue of spans 	TokenNameCOMMENT_LINE	sorted queue of spans 
private	TokenNameprivate	
SpansCell	TokenNameIdentifier	 Spans Cell
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
// max element in queue 	TokenNameCOMMENT_LINE	max element in queue 
private	TokenNameprivate	
boolean	TokenNameboolean	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// true iff not done 	TokenNameCOMMENT_LINE	true iff not done 
private	TokenNameprivate	
boolean	TokenNameboolean	
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// true before first next() 	TokenNameCOMMENT_LINE	true before first next() 
private	TokenNameprivate	
class	TokenNameclass	
CellQueue	TokenNameIdentifier	 Cell Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
SpansCell	TokenNameIdentifier	 Spans Cell
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
CellQueue	TokenNameIdentifier	 Cell Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
SpansCell	TokenNameIdentifier	 Spans Cell
spans1	TokenNameIdentifier	 spans1
,	TokenNameCOMMA	
SpansCell	TokenNameIdentifier	 Spans Cell
spans2	TokenNameIdentifier	 spans2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NearSpansOrdered	TokenNameIdentifier	 Near Spans Ordered
.	TokenNameDOT	
docSpansOrdered	TokenNameIdentifier	 doc Spans Ordered
(	TokenNameLPAREN	
spans1	TokenNameIdentifier	 spans1
,	TokenNameCOMMA	
spans2	TokenNameIdentifier	 spans2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
spans1	TokenNameIdentifier	 spans1
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
spans2	TokenNameIdentifier	 spans2
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Wraps a Spans, and can be used to form a linked list. */	TokenNameCOMMENT_JAVADOC	 Wraps a Spans, and can be used to form a linked list. 
private	TokenNameprivate	
class	TokenNameclass	
SpansCell	TokenNameIdentifier	 Spans Cell
extends	TokenNameextends	
Spans	TokenNameIdentifier	 Spans
{	TokenNameLBRACE	
private	TokenNameprivate	
Spans	TokenNameIdentifier	 Spans
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SpansCell	TokenNameIdentifier	 Spans Cell
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SpansCell	TokenNameIdentifier	 Spans Cell
(	TokenNameLPAREN	
Spans	TokenNameIdentifier	 Spans
spans	TokenNameIdentifier	 spans
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
boolean	TokenNameboolean	
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalLength	TokenNameIdentifier	 total Length
-=	TokenNameMINUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// subtract old length 	TokenNameCOMMENT_LINE	subtract old length 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLength	TokenNameIdentifier	 total Length
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// add new length 	TokenNameCOMMENT_LINE	add new length 
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
return	TokenNamereturn	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
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
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
NearSpansUnordered	TokenNameIdentifier	 Near Spans Unordered
(	TokenNameLPAREN	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
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
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
CellQueue	TokenNameIdentifier	 Cell Queue
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
SpansCell	TokenNameIdentifier	 Spans Cell
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
new	TokenNamenew	
SpansCell	TokenNameIdentifier	 Spans Cell
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordered	TokenNameIdentifier	 ordered
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cell	TokenNameIdentifier	 cell
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subSpans	TokenNameIdentifier	 sub Spans
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listToQueue	TokenNameIdentifier	 list To Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize queue 	TokenNameCOMMENT_LINE	initialize queue 
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// trigger further scanning 	TokenNameCOMMENT_LINE	trigger further scanning 
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maintain queue 	TokenNameCOMMENT_LINE	maintain queue 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
queueStale	TokenNameIdentifier	 queue Stale
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// maintain list 	TokenNameCOMMENT_LINE	maintain list 
queueToList	TokenNameIdentifier	 queue To List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueStale	TokenNameIdentifier	 queue Stale
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip to doc w/ all clauses 	TokenNameCOMMENT_LINE	skip to doc w/ all clauses 
while	TokenNamewhile	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip first upto last 	TokenNameCOMMENT_LINE	skip first upto last 
firstToLast	TokenNameIdentifier	 first To Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and move it to the end 	TokenNameCOMMENT_LINE	and move it to the end 
queueStale	TokenNameIdentifier	 queue Stale
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// found doc w/ all clauses 	TokenNameCOMMENT_LINE	found doc w/ all clauses 
if	TokenNameif	
(	TokenNameLPAREN	
queueStale	TokenNameIdentifier	 queue Stale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// maintain the queue 	TokenNameCOMMENT_LINE	maintain the queue 
listToQueue	TokenNameIdentifier	 list To Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueStale	TokenNameIdentifier	 queue Stale
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atMatch	TokenNameIdentifier	 at Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maintain queue 	TokenNameCOMMENT_LINE	maintain queue 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// no more matches 	TokenNameCOMMENT_LINE	no more matches 
}	TokenNameRBRACE	
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
// initialize 	TokenNameCOMMENT_LINE	initialize 
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SpansCell	TokenNameIdentifier	 Spans Cell
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
cell	TokenNameIdentifier	 cell
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip all 	TokenNameCOMMENT_LINE	skip all 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listToQueue	TokenNameIdentifier	 list To Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// normal case 	TokenNameCOMMENT_LINE	normal case 
while	TokenNamewhile	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip as needed 	TokenNameCOMMENT_LINE	skip as needed 
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
atMatch	TokenNameIdentifier	 at Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SpansCell	TokenNameIdentifier	 Spans Cell
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
/** * WARNING: The List is not necessarily in order of the the positions * @return Collection of <code>byte[]</code> payloads * @throws IOException */	TokenNameCOMMENT_JAVADOC	 WARNING: The List is not necessarily in order of the the positions @return Collection of <code>byte[]</code> payloads @throws IOException 
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
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
matchPayload	TokenNameIdentifier	 match Payload
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
for	TokenNamefor	
(	TokenNameLPAREN	
SpansCell	TokenNameIdentifier	 Spans Cell
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
cell	TokenNameIdentifier	 cell
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchPayload	TokenNameIdentifier	 match Payload
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
SpansCell	TokenNameIdentifier	 Spans Cell
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
pointer	TokenNameIdentifier	 pointer
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
private	TokenNameprivate	
void	TokenNamevoid	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ordered	TokenNameIdentifier	 ordered
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpansCell	TokenNameIdentifier	 Spans Cell
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
ordered	TokenNameIdentifier	 ordered
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// move to first entry 	TokenNameCOMMENT_LINE	move to first entry 
if	TokenNameif	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToList	TokenNameIdentifier	 add To List
(	TokenNameLPAREN	
cell	TokenNameIdentifier	 cell
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to list 	TokenNameCOMMENT_LINE	add to list 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addToList	TokenNameIdentifier	 add To List
(	TokenNameLPAREN	
SpansCell	TokenNameIdentifier	 Spans Cell
cell	TokenNameIdentifier	 cell
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add next to end of list 	TokenNameCOMMENT_LINE	add next to end of list 
last	TokenNameIdentifier	 last
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
;	TokenNameSEMICOLON	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
firstToLast	TokenNameIdentifier	 first To Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
// move first to end of list 	TokenNameCOMMENT_LINE	move first to end of list 
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
queueToList	TokenNameIdentifier	 queue To List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToList	TokenNameIdentifier	 add To List
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
listToQueue	TokenNameIdentifier	 list To Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rebuild queue 	TokenNameCOMMENT_LINE	rebuild queue 
for	TokenNamefor	
(	TokenNameLPAREN	
SpansCell	TokenNameIdentifier	 Spans Cell
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
cell	TokenNameIdentifier	 cell
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cell	TokenNameIdentifier	 cell
=	TokenNameEQUAL	
cell	TokenNameIdentifier	 cell
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cell	TokenNameIdentifier	 cell
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to queue from list 	TokenNameCOMMENT_LINE	add to queue from list 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
atMatch	TokenNameIdentifier	 at Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
