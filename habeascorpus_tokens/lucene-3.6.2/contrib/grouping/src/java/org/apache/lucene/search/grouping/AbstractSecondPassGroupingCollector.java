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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * SecondPassGroupingCollector is the second of two passes * necessary to collect grouped docs. This pass gathers the * top N documents per top group computed from the * first pass. Concrete subclasses define what a group is and how it * is internally collected. * * <p>See {@link org.apache.lucene.search.grouping} for more * details including a full code example.</p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 SecondPassGroupingCollector is the second of two passes necessary to collect grouped docs. This pass gathers the top N documents per top group computed from the first pass. Concrete subclasses define what a group is and how it is internally collected. * <p>See {@link org.apache.lucene.search.grouping} for more details including a full code example.</p> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSecondPassGroupingCollector	TokenNameIdentifier	 Abstract Second Pass Grouping Collector
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
,	TokenNameCOMMA	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
groupMap	TokenNameIdentifier	 group Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupDocs	TokenNameIdentifier	 group Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
withinGroupSort	TokenNameIdentifier	 within Group Sort
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
totalHitCount	TokenNameIdentifier	 total Hit Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractSecondPassGroupingCollector	TokenNameIdentifier	 Abstract Second Pass Grouping Collector
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
groups	TokenNameIdentifier	 groups
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
withinGroupSort	TokenNameIdentifier	 within Group Sort
,	TokenNameCOMMA	
int	TokenNameint	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
,	TokenNameCOMMA	
boolean	TokenNameboolean	
getScores	TokenNameIdentifier	 get Scores
,	TokenNameCOMMA	
boolean	TokenNameboolean	
getMaxScores	TokenNameIdentifier	 get Max Scores
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillSortFields	TokenNameIdentifier	 fill Sort Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println("SP init"); 	TokenNameCOMMENT_LINE	System.out.println("SP init"); 
if	TokenNameif	
(	TokenNameLPAREN	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no groups to collect (groups.size() is 0)"	TokenNameStringLiteral	no groups to collect (groups.size() is 0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupSort	TokenNameIdentifier	 group Sort
=	TokenNameEQUAL	
groupSort	TokenNameIdentifier	 group Sort
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
withinGroupSort	TokenNameIdentifier	 within Group Sort
=	TokenNameEQUAL	
withinGroupSort	TokenNameIdentifier	 within Group Sort
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
=	TokenNameEQUAL	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
=	TokenNameEQUAL	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
;	TokenNameSEMICOLON	
groupMap	TokenNameIdentifier	 group Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
,	TokenNameCOMMA	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
:	TokenNameCOLON	
groups	TokenNameIdentifier	 groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" prep group=" + (group.groupValue == null ? "null" : group.groupValue.utf8ToString())); 	TokenNameCOMMENT_LINE	System.out.println(" prep group=" + (group.groupValue == null ? "null" : group.groupValue.utf8ToString())); 
final	TokenNamefinal	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
collector	TokenNameIdentifier	 collector
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
withinGroupSort	TokenNameIdentifier	 within Group Sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Sort by score 	TokenNameCOMMENT_LINE	Sort by score 
collector	TokenNameIdentifier	 collector
=	TokenNameEQUAL	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Sort by fields 	TokenNameCOMMENT_LINE	Sort by fields 
collector	TokenNameIdentifier	 collector
=	TokenNameEQUAL	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
withinGroupSort	TokenNameIdentifier	 within Group Sort
,	TokenNameCOMMA	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
,	TokenNameCOMMA	
fillSortFields	TokenNameIdentifier	 fill Sort Fields
,	TokenNameCOMMA	
getScores	TokenNameIdentifier	 get Scores
,	TokenNameCOMMA	
getMaxScores	TokenNameIdentifier	 get Max Scores
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
new	TokenNamenew	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
for	TokenNamefor	
(	TokenNameLPAREN	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
:	TokenNameCOLON	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
totalHitCount	TokenNameIdentifier	 total Hit Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
retrieveGroup	TokenNameIdentifier	 retrieve Group
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the group the specified doc belongs to or <code>null</code> if no group could be retrieved. * * @param doc The specified doc * @return the group the specified doc belongs to or <code>null</code> if no group could be retrieved * @throws IOException If an I/O related error occurred */	TokenNameCOMMENT_JAVADOC	 Returns the group the specified doc belongs to or <code>null</code> if no group could be retrieved. * @param doc The specified doc @return the group the specified doc belongs to or <code>null</code> if no group could be retrieved @throws IOException If an I/O related error occurred 
protected	TokenNameprotected	
abstract	TokenNameabstract	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
retrieveGroup	TokenNameIdentifier	 retrieve Group
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
//System.out.println("SP.setNextReader"); 	TokenNameCOMMENT_LINE	System.out.println("SP.setNextReader"); 
for	TokenNamefor	
(	TokenNameLPAREN	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
:	TokenNameCOLON	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
collector	TokenNameIdentifier	 collector
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
getTopGroups	TokenNameIdentifier	 get Top Groups
(	TokenNameLPAREN	
int	TokenNameint	
withinGroupOffset	TokenNameIdentifier	 within Group Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
final	TokenNamefinal	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupDocsResult	TokenNameIdentifier	 group Docs Result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
GroupDocs	TokenNameIdentifier	 Group Docs
[	TokenNameLBRACKET	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
groupIDX	TokenNameIdentifier	 group IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SearchGroup	TokenNameIdentifier	 Search Group
group	TokenNameIdentifier	 group
:	TokenNameCOLON	
groups	TokenNameIdentifier	 groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
groupDocs	TokenNameIdentifier	 group Docs
=	TokenNameEQUAL	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
topDocs	TokenNameIdentifier	 top Docs
=	TokenNameEQUAL	
groupDocs	TokenNameIdentifier	 group Docs
.	TokenNameDOT	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
withinGroupOffset	TokenNameIdentifier	 within Group Offset
,	TokenNameCOMMA	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groupDocsResult	TokenNameIdentifier	 group Docs Result
[	TokenNameLBRACKET	
groupIDX	TokenNameIdentifier	 group IDX
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
(	TokenNameLPAREN	
topDocs	TokenNameIdentifier	 top Docs
.	TokenNameDOT	
getMaxScore	TokenNameIdentifier	 get Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
topDocs	TokenNameIdentifier	 top Docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
topDocs	TokenNameIdentifier	 top Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
groupDocs	TokenNameIdentifier	 group Docs
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
(	TokenNameLPAREN	
groupSort	TokenNameIdentifier	 group Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
withinGroupSort	TokenNameIdentifier	 within Group Sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
withinGroupSort	TokenNameIdentifier	 within Group Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
totalHitCount	TokenNameIdentifier	 total Hit Count
,	TokenNameCOMMA	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
,	TokenNameCOMMA	
groupDocsResult	TokenNameIdentifier	 group Docs Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: merge with SearchGroup or not? 	TokenNameCOMMENT_LINE	TODO: merge with SearchGroup or not? 
// ad: don't need to build a new hashmap 	TokenNameCOMMENT_LINE	ad: don't need to build a new hashmap 
// disad: blows up the size of SearchGroup if we need many of them, and couples implementations 	TokenNameCOMMENT_LINE	disad: blows up the size of SearchGroup if we need many of them, and couples implementations 
public	TokenNamepublic	
class	TokenNameclass	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
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
final	TokenNamefinal	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
collector	TokenNameIdentifier	 collector
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
(	TokenNameLPAREN	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
collector	TokenNameIdentifier	 collector
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
collector	TokenNameIdentifier	 collector
=	TokenNameEQUAL	
collector	TokenNameIdentifier	 collector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
