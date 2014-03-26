package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
grouping	TokenNameIdentifier	 grouping
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
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
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
/** * This collector specializes in collecting the most relevant document (group head) for each group that match the query. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This collector specializes in collecting the most relevant document (group head) for each group that match the query. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
<	TokenNameLESS	
GH	TokenNameIdentifier	 GH
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
compIDXEnd	TokenNameIdentifier	 comp IDX End
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
TemporalResult	TokenNameIdentifier	 Temporal Result
temporalResult	TokenNameIdentifier	 temporal Result
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
(	TokenNameLPAREN	
int	TokenNameint	
numberOfSorts	TokenNameIdentifier	 number Of Sorts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numberOfSorts	TokenNameIdentifier	 number Of Sorts
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compIDXEnd	TokenNameIdentifier	 comp IDX End
=	TokenNameEQUAL	
numberOfSorts	TokenNameIdentifier	 number Of Sorts
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
temporalResult	TokenNameIdentifier	 temporal Result
=	TokenNameEQUAL	
new	TokenNamenew	
TemporalResult	TokenNameIdentifier	 Temporal Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param maxDoc The maxDoc of the top level {@link IndexReader}. * @return an {@link FixedBitSet} containing all group heads. */	TokenNameCOMMENT_JAVADOC	 @param maxDoc The maxDoc of the top level {@link IndexReader}. @return an {@link FixedBitSet} containing all group heads. 
public	TokenNamepublic	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
retrieveGroupHeads	TokenNameIdentifier	 retrieve Group Heads
(	TokenNameLPAREN	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bitSet	TokenNameIdentifier	 bit Set
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GH	TokenNameIdentifier	 GH
>	TokenNameGREATER	
groupHeads	TokenNameIdentifier	 group Heads
=	TokenNameEQUAL	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
:	TokenNameCOLON	
groupHeads	TokenNameIdentifier	 group Heads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitSet	TokenNameIdentifier	 bit Set
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bitSet	TokenNameIdentifier	 bit Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return an int array containing all group heads. The size of the array is equal to number of collected unique groups. */	TokenNameCOMMENT_JAVADOC	 @return an int array containing all group heads. The size of the array is equal to number of collected unique groups. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
retrieveGroupHeads	TokenNameIdentifier	 retrieve Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GH	TokenNameIdentifier	 GH
>	TokenNameGREATER	
groupHeads	TokenNameIdentifier	 group Heads
=	TokenNameEQUAL	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docHeads	TokenNameIdentifier	 doc Heads
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
groupHeads	TokenNameIdentifier	 group Heads
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
:	TokenNameCOLON	
groupHeads	TokenNameIdentifier	 group Heads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docHeads	TokenNameIdentifier	 doc Heads
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
docHeads	TokenNameIdentifier	 doc Heads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the number of group heads found for a query. */	TokenNameCOMMENT_JAVADOC	 @return the number of group heads found for a query. 
public	TokenNamepublic	
int	TokenNameint	
groupHeadsSize	TokenNameIdentifier	 group Heads Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the group head and puts it into {@link #temporalResult}. * If the group head wasn't encountered before then it will be added to the collected group heads. * <p/> * The {@link TemporalResult#stop} property will be <code>true</code> if the group head wasn't encountered before * otherwise <code>false</code>. * * @param doc The document to retrieve the group head for. * @throws IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Returns the group head and puts it into {@link #temporalResult}. If the group head wasn't encountered before then it will be added to the collected group heads. <p/> The {@link TemporalResult#stop} property will be <code>true</code> if the group head wasn't encountered before otherwise <code>false</code>. * @param doc The document to retrieve the group head for. @throws IOException If I/O related errors occur 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
retrieveGroupHeadAndAddIfNotExist	TokenNameIdentifier	 retrieve Group Head And Add If Not Exist
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns the collected group heads. * Subsequent calls should return the same group heads. * * @return the collected group heads */	TokenNameCOMMENT_JAVADOC	 Returns the collected group heads. Subsequent calls should return the same group heads. * @return the collected group heads 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GH	TokenNameIdentifier	 GH
>	TokenNameGREATER	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
retrieveGroupHeadAndAddIfNotExist	TokenNameIdentifier	 retrieve Group Head And Add If Not Exist
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GH	TokenNameIdentifier	 GH
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
// Ok now we need to check if the current doc is more relevant then current doc for this group 	TokenNameCOMMENT_LINE	Ok now we need to check if the current doc is more relevant then current doc for this group 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
compIDX	TokenNameIdentifier	 comp IDX
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely not competitive. So don't even bother to continue 	TokenNameCOMMENT_LINE	Definitely not competitive. So don't even bother to continue 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely competitive. 	TokenNameCOMMENT_LINE	Definitely competitive. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compIDX	TokenNameIdentifier	 comp IDX
==	TokenNameEQUAL_EQUAL	
compIDXEnd	TokenNameIdentifier	 comp IDX End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here c=0. If we're at the last comparator, this doc is not 	TokenNameCOMMENT_LINE	Here c=0. If we're at the last comparator, this doc is not 
// competitive, since docs are visited in doc Id order, which means 	TokenNameCOMMENT_LINE	competitive, since docs are visited in doc Id order, which means 
// this doc cannot compete with any other document in the queue. 	TokenNameCOMMENT_LINE	this doc cannot compete with any other document in the queue. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
updateDocHead	TokenNameIdentifier	 update Doc Head
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Contains the result of group head retrieval. * To prevent new object creations of this class for every collect. */	TokenNameCOMMENT_JAVADOC	 Contains the result of group head retrieval. To prevent new object creations of this class for every collect. 
protected	TokenNameprotected	
class	TokenNameclass	
TemporalResult	TokenNameIdentifier	 Temporal Result
{	TokenNameLBRACE	
public	TokenNamepublic	
GH	TokenNameIdentifier	 GH
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Represents a group head. A group head is the most relevant document for a particular group. * The relevancy is based is usually based on the sort. * * The group head contains a group value with its associated most relevant document id. */	TokenNameCOMMENT_JAVADOC	 Represents a group head. A group head is the most relevant document for a particular group. The relevancy is based is usually based on the sort. * The group head contains a group value with its associated most relevant document id. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
GroupHead	TokenNameIdentifier	 Group Head
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares the specified document for a specified comparator against the current most relevant document. * * @param compIDX The comparator index of the specified comparator. * @param doc The specified document. * @return -1 if the specified document wasn't competitive against the current most relevant document, 1 if the * specified document was competitive against the current most relevant document. Otherwise 0. * @throws IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Compares the specified document for a specified comparator against the current most relevant document. * @param compIDX The comparator index of the specified comparator. @param doc The specified document. @return -1 if the specified document wasn't competitive against the current most relevant document, 1 if the specified document was competitive against the current most relevant document. Otherwise 0. @throws IOException If I/O related errors occur 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Updates the current most relevant document with the specified document. * * @param doc The specified document * @throws IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Updates the current most relevant document with the specified document. * @param doc The specified document @throws IOException If I/O related errors occur 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
updateDocHead	TokenNameIdentifier	 update Doc Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
