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
*	TokenNameMULTIPLY	
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
/** * A base implementation of {@link AbstractAllGroupHeadsCollector} for retrieving the most relevant groups when grouping * on a string based group field. More specifically this all concrete implementations of this base implementation * use {@link org.apache.lucene.search.FieldCache.StringIndex}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A base implementation of {@link AbstractAllGroupHeadsCollector} for retrieving the most relevant groups when grouping on a string based group field. More specifically this all concrete implementations of this base implementation use {@link org.apache.lucene.search.FieldCache.StringIndex}. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TermAllGroupHeadsCollector	TokenNameIdentifier	 Term All Group Heads Collector
<	TokenNameLESS	
GH	TokenNameIdentifier	 GH
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
<	TokenNameLESS	
GH	TokenNameIdentifier	 GH
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_INITIAL_SIZE	TokenNameIdentifier	 DEFAULT  INITIAL  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
groupIndex	TokenNameIdentifier	 group Index
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TermAllGroupHeadsCollector	TokenNameIdentifier	 Term All Group Heads Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
int	TokenNameint	
numberOfSorts	TokenNameIdentifier	 number Of Sorts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
numberOfSorts	TokenNameIdentifier	 number Of Sorts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupField	TokenNameIdentifier	 group Field
=	TokenNameEQUAL	
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments. * This factory method decides with implementation is best suited. * * Delegates to {@link #create(String, org.apache.lucene.search.Sort, int)} with an initialSize of 128. * * @param groupField The field to group by * @param sortWithinGroup The sort within each group * @return an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments * @throws IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Creates an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments. This factory method decides with implementation is best suited. * Delegates to {@link #create(String, org.apache.lucene.search.Sort, int)} with an initialSize of 128. * @param groupField The field to group by @param sortWithinGroup The sort within each group @return an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments @throws IOException If I/O related errors occur 
public	TokenNamepublic	
static	TokenNamestatic	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
DEFAULT_INITIAL_SIZE	TokenNameIdentifier	 DEFAULT  INITIAL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments. * This factory method decides with implementation is best suited. * * @param groupField The field to group by * @param sortWithinGroup The sort within each group * @param initialSize The initial allocation size of the internal int set and group list which should roughly match * the total number of expected unique groups. Be aware that the heap usage is * 4 bytes * initialSize. * @return an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments * @throws IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Creates an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments. This factory method decides with implementation is best suited. * @param groupField The field to group by @param sortWithinGroup The sort within each group @param initialSize The initial allocation size of the internal int set and group list which should roughly match the total number of expected unique groups. Be aware that the heap usage is 4 bytes initialSize. @return an <code>AbstractAllGroupHeadsCollector</code> instance based on the supplied arguments @throws IOException If I/O related errors occur 
public	TokenNamepublic	
static	TokenNamestatic	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
sortAllScore	TokenNameIdentifier	 sort All Score
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sortAllFieldValue	TokenNameIdentifier	 sort All Field Value
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
sortField	TokenNameIdentifier	 sort Field
:	TokenNameCOLON	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sortField	TokenNameIdentifier	 sort Field
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortAllFieldValue	TokenNameIdentifier	 sort All Field Value
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
needGeneralImpl	TokenNameIdentifier	 need General Impl
(	TokenNameLPAREN	
sortField	TokenNameIdentifier	 sort Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GeneralAllGroupHeadsCollector	TokenNameIdentifier	 General All Group Heads Collector
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sortAllScore	TokenNameIdentifier	 sort All Score
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sortAllScore	TokenNameIdentifier	 sort All Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ScoreAllGroupHeadsCollector	TokenNameIdentifier	 Score All Group Heads Collector
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sortAllFieldValue	TokenNameIdentifier	 sort All Field Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OrdAllGroupHeadsCollector	TokenNameIdentifier	 Ord All Group Heads Collector
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OrdScoreAllGroupHeadsCollector	TokenNameIdentifier	 Ord Score All Group Heads Collector
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Returns when a sort field needs the general impl. 	TokenNameCOMMENT_LINE	Returns when a sort field needs the general impl. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
needGeneralImpl	TokenNameIdentifier	 need General Impl
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
sortField	TokenNameIdentifier	 sort Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sortType	TokenNameIdentifier	 sort Type
=	TokenNameEQUAL	
sortField	TokenNameIdentifier	 sort Field
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note (MvG): We can also make an optimized impl when sorting is SortField.DOC 	TokenNameCOMMENT_LINE	Note (MvG): We can also make an optimized impl when sorting is SortField.DOC 
return	TokenNamereturn	
sortType	TokenNameIdentifier	 sort Type
!=	TokenNameNOT_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING_VAL	TokenNameIdentifier	 STRING  VAL
&&	TokenNameAND_AND	
sortType	TokenNameIdentifier	 sort Type
!=	TokenNameNOT_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
&&	TokenNameAND_AND	
sortType	TokenNameIdentifier	 sort Type
!=	TokenNameNOT_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// A general impl that works for any group sort. 	TokenNameCOMMENT_LINE	A general impl that works for any group sort. 
static	TokenNamestatic	
class	TokenNameclass	
GeneralAllGroupHeadsCollector	TokenNameIdentifier	 General All Group Heads Collector
extends	TokenNameextends	
TermAllGroupHeadsCollector	TokenNameIdentifier	 Term All Group Heads Collector
<	TokenNameLESS	
GeneralAllGroupHeadsCollector	TokenNameIdentifier	 General All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
GeneralAllGroupHeadsCollector	TokenNameIdentifier	 General All Group Heads Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
=	TokenNameEQUAL	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
;	TokenNameSEMICOLON	
groups	TokenNameIdentifier	 groups
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
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
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
retrieveGroupHeadAndAddIfNotExist	TokenNameIdentifier	 retrieve Group Head And Add If Not Exist
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
ord	TokenNameIdentifier	 ord
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupHead	TokenNameIdentifier	 group Head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
groupHead	TokenNameIdentifier	 group Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
groupIndex	TokenNameIdentifier	 group Index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
groupField	TokenNameIdentifier	 group Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
:	TokenNameCOLON	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
:	TokenNameCOLON	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
:	TokenNameCOLON	
groupHead	TokenNameIdentifier	 group Head
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
GroupHead	TokenNameIdentifier	 Group Head
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
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
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateDocHead	TokenNameIdentifier	 update Doc Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// AbstractAllGroupHeadsCollector optimized for ord fields and scores. 	TokenNameCOMMENT_LINE	AbstractAllGroupHeadsCollector optimized for ord fields and scores. 
static	TokenNamestatic	
class	TokenNameclass	
OrdScoreAllGroupHeadsCollector	TokenNameIdentifier	 Ord Score All Group Heads Collector
extends	TokenNameextends	
TermAllGroupHeadsCollector	TokenNameIdentifier	 Term All Group Heads Collector
<	TokenNameLESS	
OrdScoreAllGroupHeadsCollector	TokenNameIdentifier	 Ord Score All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
ordSet	TokenNameIdentifier	 ord Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
collectedGroups	TokenNameIdentifier	 collected Groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
;	TokenNameSEMICOLON	
OrdScoreAllGroupHeadsCollector	TokenNameIdentifier	 Ord Score All Group Heads Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordSet	TokenNameIdentifier	 ord Set
=	TokenNameEQUAL	
new	TokenNamenew	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortsIndex	TokenNameIdentifier	 sorts Index
=	TokenNameEQUAL	
new	TokenNamenew	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
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
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectedGroups	TokenNameIdentifier	 collected Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
retrieveGroupHeadAndAddIfNotExist	TokenNameIdentifier	 retrieve Group Head And Add If Not Exist
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
groupHead	TokenNameIdentifier	 group Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
groupIndex	TokenNameIdentifier	 group Index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
groupField	TokenNameIdentifier	 group Field
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 	TokenNameCOMMENT_LINE	Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
[	TokenNameLBRACKET	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
collectedGroup	TokenNameIdentifier	 collected Group
:	TokenNameCOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
collectedGroup	TokenNameIdentifier	 collected Group
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
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
GroupHead	TokenNameIdentifier	 Group Head
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortValues	TokenNameIdentifier	 sort Values
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortOrds	TokenNameIdentifier	 sort Ords
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortValues	TokenNameIdentifier	 sort Values
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortOrds	TokenNameIdentifier	 sort Ords
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
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
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
<	TokenNameLESS	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
>	TokenNameGREATER	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The current segment doesn't contain the sort value we encountered before. Therefore the ord is negative. 	TokenNameCOMMENT_LINE	The current segment doesn't contain the sort value we encountered before. Therefore the ord is negative. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
val1	TokenNameIdentifier	 val1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
-	TokenNameMINUS	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateDocHead	TokenNameIdentifier	 update Doc Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
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
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// AbstractAllGroupHeadsCollector optimized for ord fields. 	TokenNameCOMMENT_LINE	AbstractAllGroupHeadsCollector optimized for ord fields. 
static	TokenNamestatic	
class	TokenNameclass	
OrdAllGroupHeadsCollector	TokenNameIdentifier	 Ord All Group Heads Collector
extends	TokenNameextends	
TermAllGroupHeadsCollector	TokenNameIdentifier	 Term All Group Heads Collector
<	TokenNameLESS	
OrdAllGroupHeadsCollector	TokenNameIdentifier	 Ord All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
ordSet	TokenNameIdentifier	 ord Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
collectedGroups	TokenNameIdentifier	 collected Groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
;	TokenNameSEMICOLON	
OrdAllGroupHeadsCollector	TokenNameIdentifier	 Ord All Group Heads Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordSet	TokenNameIdentifier	 ord Set
=	TokenNameEQUAL	
new	TokenNamenew	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortsIndex	TokenNameIdentifier	 sorts Index
=	TokenNameEQUAL	
new	TokenNamenew	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
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
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectedGroups	TokenNameIdentifier	 collected Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
retrieveGroupHeadAndAddIfNotExist	TokenNameIdentifier	 retrieve Group Head And Add If Not Exist
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
groupHead	TokenNameIdentifier	 group Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
groupIndex	TokenNameIdentifier	 group Index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
groupField	TokenNameIdentifier	 group Field
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 	TokenNameCOMMENT_LINE	Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
[	TokenNameLBRACKET	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
collectedGroup	TokenNameIdentifier	 collected Group
:	TokenNameCOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
groupOrd	TokenNameIdentifier	 group Ord
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupOrd	TokenNameIdentifier	 group Ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
groupOrd	TokenNameIdentifier	 group Ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
groupOrd	TokenNameIdentifier	 group Ord
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
collectedGroup	TokenNameIdentifier	 collected Group
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
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
GroupHead	TokenNameIdentifier	 Group Head
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortValues	TokenNameIdentifier	 sort Values
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortOrds	TokenNameIdentifier	 sort Ords
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortValues	TokenNameIdentifier	 sort Values
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortOrds	TokenNameIdentifier	 sort Ords
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
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
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The current segment doesn't contain the sort value we encountered before. Therefore the ord is negative. 	TokenNameCOMMENT_LINE	The current segment doesn't contain the sort value we encountered before. Therefore the ord is negative. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
val1	TokenNameIdentifier	 val1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
-	TokenNameMINUS	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateDocHead	TokenNameIdentifier	 update Doc Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
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
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sortsIndex	TokenNameIdentifier	 sorts Index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sortOrds	TokenNameIdentifier	 sort Ords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortsIndex	TokenNameIdentifier	 sorts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// AbstractAllGroupHeadsCollector optimized for scores. 	TokenNameCOMMENT_LINE	AbstractAllGroupHeadsCollector optimized for scores. 
static	TokenNamestatic	
class	TokenNameclass	
ScoreAllGroupHeadsCollector	TokenNameIdentifier	 Score All Group Heads Collector
extends	TokenNameextends	
TermAllGroupHeadsCollector	TokenNameIdentifier	 Term All Group Heads Collector
<	TokenNameLESS	
ScoreAllGroupHeadsCollector	TokenNameIdentifier	 Score All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
ordSet	TokenNameIdentifier	 ord Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
collectedGroups	TokenNameIdentifier	 collected Groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
;	TokenNameSEMICOLON	
ScoreAllGroupHeadsCollector	TokenNameIdentifier	 Score All Group Heads Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sortWithinGroup	TokenNameIdentifier	 sort Within Group
,	TokenNameCOMMA	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordSet	TokenNameIdentifier	 ord Set
=	TokenNameEQUAL	
new	TokenNamenew	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
sortWithinGroup	TokenNameIdentifier	 sort Within Group
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
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
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GroupHead	TokenNameIdentifier	 Group Head
>	TokenNameGREATER	
getCollectedGroupHeads	TokenNameIdentifier	 get Collected Group Heads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectedGroups	TokenNameIdentifier	 collected Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
retrieveGroupHeadAndAddIfNotExist	TokenNameIdentifier	 retrieve Group Head And Add If Not Exist
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
GroupHead	TokenNameIdentifier	 Group Head
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
groupHead	TokenNameIdentifier	 group Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temporalResult	TokenNameIdentifier	 temporal Result
.	TokenNameDOT	
groupHead	TokenNameIdentifier	 group Head
=	TokenNameEQUAL	
groupHead	TokenNameIdentifier	 group Head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
groupIndex	TokenNameIdentifier	 group Index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
groupField	TokenNameIdentifier	 group Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 	TokenNameCOMMENT_LINE	Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
=	TokenNameEQUAL	
new	TokenNamenew	
GroupHead	TokenNameIdentifier	 Group Head
[	TokenNameLBRACKET	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
GroupHead	TokenNameIdentifier	 Group Head
collectedGroup	TokenNameIdentifier	 collected Group
:	TokenNameCOLON	
collectedGroups	TokenNameIdentifier	 collected Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
groupIndex	TokenNameIdentifier	 group Index
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
collectedGroup	TokenNameIdentifier	 collected Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentGroupHeads	TokenNameIdentifier	 segment Group Heads
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
collectedGroup	TokenNameIdentifier	 collected Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
GroupHead	TokenNameIdentifier	 Group Head
extends	TokenNameextends	
AbstractAllGroupHeadsCollector	TokenNameIdentifier	 Abstract All Group Heads Collector
.	TokenNameDOT	
GroupHead	TokenNameIdentifier	 Group Head
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GroupHead	TokenNameIdentifier	 Group Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
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
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
<	TokenNameLESS	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
>	TokenNameGREATER	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateDocHead	TokenNameIdentifier	 update Doc Head
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
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
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
