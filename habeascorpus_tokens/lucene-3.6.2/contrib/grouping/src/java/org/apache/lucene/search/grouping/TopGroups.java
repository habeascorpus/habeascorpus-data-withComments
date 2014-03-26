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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoreDoc	TokenNameIdentifier	 Score Doc
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
Sort	TokenNameIdentifier	 Sort
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
SortField	TokenNameIdentifier	 Sort Field
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
TopDocs	TokenNameIdentifier	 Top Docs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Represents result returned by a grouping search. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Represents result returned by a grouping search. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** Number of documents matching the search */	TokenNameCOMMENT_JAVADOC	 Number of documents matching the search 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
totalHitCount	TokenNameIdentifier	 total Hit Count
;	TokenNameSEMICOLON	
/** Number of documents grouped into the topN groups */	TokenNameCOMMENT_JAVADOC	 Number of documents grouped into the topN groups 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
;	TokenNameSEMICOLON	
/** The total number of unique groups. If <code>null</code> this value is not computed. */	TokenNameCOMMENT_JAVADOC	 The total number of unique groups. If <code>null</code> this value is not computed. 
public	TokenNamepublic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
totalGroupCount	TokenNameIdentifier	 total Group Count
;	TokenNameSEMICOLON	
/** Group results in groupSort order */	TokenNameCOMMENT_JAVADOC	 Group results in groupSort order 
public	TokenNamepublic	
final	TokenNamefinal	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
/** How groups are sorted against each other */	TokenNameCOMMENT_JAVADOC	 How groups are sorted against each other 
public	TokenNamepublic	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupSort	TokenNameIdentifier	 group Sort
;	TokenNameSEMICOLON	
/** How docs are sorted within each group */	TokenNameCOMMENT_JAVADOC	 How docs are sorted within each group 
public	TokenNamepublic	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
withinGroupSort	TokenNameIdentifier	 within Group Sort
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TopGroups	TokenNameIdentifier	 Top Groups
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
withinGroupSort	TokenNameIdentifier	 within Group Sort
,	TokenNameCOMMA	
int	TokenNameint	
totalHitCount	TokenNameIdentifier	 total Hit Count
,	TokenNameCOMMA	
int	TokenNameint	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
,	TokenNameCOMMA	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groups	TokenNameIdentifier	 groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
totalHitCount	TokenNameIdentifier	 total Hit Count
=	TokenNameEQUAL	
totalHitCount	TokenNameIdentifier	 total Hit Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
=	TokenNameEQUAL	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
=	TokenNameEQUAL	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalGroupCount	TokenNameIdentifier	 total Group Count
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopGroups	TokenNameIdentifier	 Top Groups
(	TokenNameLPAREN	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
oldTopGroups	TokenNameIdentifier	 old Top Groups
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
totalGroupCount	TokenNameIdentifier	 total Group Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupSort	TokenNameIdentifier	 group Sort
=	TokenNameEQUAL	
oldTopGroups	TokenNameIdentifier	 old Top Groups
.	TokenNameDOT	
groupSort	TokenNameIdentifier	 group Sort
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
withinGroupSort	TokenNameIdentifier	 within Group Sort
=	TokenNameEQUAL	
oldTopGroups	TokenNameIdentifier	 old Top Groups
.	TokenNameDOT	
withinGroupSort	TokenNameIdentifier	 within Group Sort
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalHitCount	TokenNameIdentifier	 total Hit Count
=	TokenNameEQUAL	
oldTopGroups	TokenNameIdentifier	 old Top Groups
.	TokenNameDOT	
totalHitCount	TokenNameIdentifier	 total Hit Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
=	TokenNameEQUAL	
oldTopGroups	TokenNameIdentifier	 old Top Groups
.	TokenNameDOT	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
=	TokenNameEQUAL	
oldTopGroups	TokenNameIdentifier	 old Top Groups
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalGroupCount	TokenNameIdentifier	 total Group Count
=	TokenNameEQUAL	
totalGroupCount	TokenNameIdentifier	 total Group Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Merges an array of TopGroups, for example obtained * from the second-pass collector across multiple * shards. Each TopGroups must have been sorted by the * same groupSort and docSort, and the top groups passed * to all second-pass collectors must be the same. * * <b>NOTE</b>: We can't always compute an exact totalGroupCount. * Documents belonging to a group may occur on more than * one shard and thus the merged totalGroupCount can be * higher than the actual totalGroupCount. In this case the * totalGroupCount represents a upper bound. If the documents * of one group do only reside in one shard then the * totalGroupCount is exact. * * <b>NOTE</b>: the topDocs in each GroupDocs is actually * an instance of TopDocsAndShards */	TokenNameCOMMENT_JAVADOC	 Merges an array of TopGroups, for example obtained from the second-pass collector across multiple shards. Each TopGroups must have been sorted by the same groupSort and docSort, and the top groups passed to all second-pass collectors must be the same. * <b>NOTE</b>: We can't always compute an exact totalGroupCount. Documents belonging to a group may occur on more than one shard and thus the merged totalGroupCount can be higher than the actual totalGroupCount. In this case the totalGroupCount represents a upper bound. If the documents of one group do only reside in one shard then the totalGroupCount is exact. * <b>NOTE</b>: the topDocs in each GroupDocs is actually an instance of TopDocsAndShards 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardGroups	TokenNameIdentifier	 shard Groups
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
docSort	TokenNameIdentifier	 doc Sort
,	TokenNameCOMMA	
int	TokenNameint	
docOffset	TokenNameIdentifier	 doc Offset
,	TokenNameCOMMA	
int	TokenNameint	
docTopN	TokenNameIdentifier	 doc Top N
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println("TopGroups.merge"); 	TokenNameCOMMENT_LINE	System.out.println("TopGroups.merge"); 
if	TokenNameif	
(	TokenNameLPAREN	
shardGroups	TokenNameIdentifier	 shard Groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
totalHitCount	TokenNameIdentifier	 total Hit Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Optionally merge the totalGroupCount. 	TokenNameCOMMENT_LINE	Optionally merge the totalGroupCount. 
Integer	TokenNameIdentifier	 Integer
totalGroupCount	TokenNameIdentifier	 total Group Count
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numGroups	TokenNameIdentifier	 num Groups
=	TokenNameEQUAL	
shardGroups	TokenNameIdentifier	 shard Groups
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
shard	TokenNameIdentifier	 shard
:	TokenNameCOLON	
shardGroups	TokenNameIdentifier	 shard Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numGroups	TokenNameIdentifier	 num Groups
!=	TokenNameNOT_EQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"number of groups differs across shards; you must pass same top groups to all shards' second-pass collector"	TokenNameStringLiteral	number of groups differs across shards; you must pass same top groups to all shards' second-pass collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
totalHitCount	TokenNameIdentifier	 total Hit Count
+=	TokenNamePLUS_EQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
totalHitCount	TokenNameIdentifier	 total Hit Count
;	TokenNameSEMICOLON	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
+=	TokenNamePLUS_EQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
totalGroupCount	TokenNameIdentifier	 total Group Count
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
totalGroupCount	TokenNameIdentifier	 total Group Count
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalGroupCount	TokenNameIdentifier	 total Group Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
totalGroupCount	TokenNameIdentifier	 total Group Count
+=	TokenNamePLUS_EQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
totalGroupCount	TokenNameIdentifier	 total Group Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
final	TokenNamefinal	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergedGroupDocs	TokenNameIdentifier	 merged Group Docs
=	TokenNameEQUAL	
new	TokenNamenew	
GroupDocs	TokenNameIdentifier	 Group Docs
[	TokenNameLBRACKET	
numGroups	TokenNameIdentifier	 num Groups
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardTopDocs	TokenNameIdentifier	 shard Top Docs
=	TokenNameEQUAL	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
shardGroups	TokenNameIdentifier	 shard Groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
groupIDX	TokenNameIdentifier	 group IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
groupIDX	TokenNameIdentifier	 group IDX
<	TokenNameLESS	
numGroups	TokenNameIdentifier	 num Groups
;	TokenNameSEMICOLON	
groupIDX	TokenNameIdentifier	 group IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
shardGroups	TokenNameIdentifier	 shard Groups
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
[	TokenNameLBRACKET	
groupIDX	TokenNameIdentifier	 group IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
//System.out.println(" merge groupValue=" + groupValue + " sortValues=" + Arrays.toString(shardGroups[0].groups[groupIDX].groupSortValues)); 	TokenNameCOMMENT_LINE	System.out.println(" merge groupValue=" + groupValue + " sortValues=" + Arrays.toString(shardGroups[0].groups[groupIDX].groupSortValues)); 
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
shardIDX	TokenNameIdentifier	 shard IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
<	TokenNameLESS	
shardGroups	TokenNameIdentifier	 shard Groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" shard=" + shardIDX); 	TokenNameCOMMENT_LINE	System.out.println(" shard=" + shardIDX); 
final	TokenNamefinal	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
shard	TokenNameIdentifier	 shard
=	TokenNameEQUAL	
shardGroups	TokenNameIdentifier	 shard Groups
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GroupDocs	TokenNameIdentifier	 Group Docs
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
[	TokenNameLBRACKET	
groupIDX	TokenNameIdentifier	 group IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"group values differ across shards; you must pass same top groups to all shards' second-pass collector"	TokenNameStringLiteral	group values differ across shards; you must pass same top groups to all shards' second-pass collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
groupValue	TokenNameIdentifier	 group Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"group values differ across shards; you must pass same top groups to all shards' second-pass collector"	TokenNameStringLiteral	group values differ across shards; you must pass same top groups to all shards' second-pass collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* for(ScoreDoc sd : shardGroupDocs.scoreDocs) { System.out.println(" doc=" + sd.doc); } */	TokenNameCOMMENT_BLOCK	 for(ScoreDoc sd : shardGroupDocs.scoreDocs) { System.out.println(" doc=" + sd.doc); } 
shardTopDocs	TokenNameIdentifier	 shard Top Docs
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
+=	TokenNamePLUS_EQUAL	
shardGroupDocs	TokenNameIdentifier	 shard Group Docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
mergedTopDocs	TokenNameIdentifier	 merged Top Docs
=	TokenNameEQUAL	
TopDocs	TokenNameIdentifier	 Top Docs
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
docSort	TokenNameIdentifier	 doc Sort
,	TokenNameCOMMA	
docOffset	TokenNameIdentifier	 doc Offset
+	TokenNamePLUS	
docTopN	TokenNameIdentifier	 doc Top N
,	TokenNameCOMMA	
shardTopDocs	TokenNameIdentifier	 shard Top Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Slice; 	TokenNameCOMMENT_LINE	Slice; 
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergedScoreDocs	TokenNameIdentifier	 merged Score Docs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docOffset	TokenNameIdentifier	 doc Offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedScoreDocs	TokenNameIdentifier	 merged Score Docs
=	TokenNameEQUAL	
mergedTopDocs	TokenNameIdentifier	 merged Top Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
docOffset	TokenNameIdentifier	 doc Offset
>=	TokenNameGREATER_EQUAL	
mergedTopDocs	TokenNameIdentifier	 merged Top Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedScoreDocs	TokenNameIdentifier	 merged Score Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mergedScoreDocs	TokenNameIdentifier	 merged Score Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
mergedTopDocs	TokenNameIdentifier	 merged Top Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
docOffset	TokenNameIdentifier	 doc Offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
mergedTopDocs	TokenNameIdentifier	 merged Top Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
docOffset	TokenNameIdentifier	 doc Offset
,	TokenNameCOMMA	
mergedScoreDocs	TokenNameIdentifier	 merged Score Docs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mergedTopDocs	TokenNameIdentifier	 merged Top Docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
docOffset	TokenNameIdentifier	 doc Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("SHARDS=" + Arrays.toString(mergedTopDocs.shardIndex)); 	TokenNameCOMMENT_LINE	System.out.println("SHARDS=" + Arrays.toString(mergedTopDocs.shardIndex)); 
mergedGroupDocs	TokenNameIdentifier	 merged Group Docs
[	TokenNameLBRACKET	
groupIDX	TokenNameIdentifier	 group IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
mergedScoreDocs	TokenNameIdentifier	 merged Score Docs
,	TokenNameCOMMA	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
shardGroups	TokenNameIdentifier	 shard Groups
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
groups	TokenNameIdentifier	 groups
[	TokenNameLBRACKET	
groupIDX	TokenNameIdentifier	 group IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
groupSortValues	TokenNameIdentifier	 group Sort Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
totalGroupCount	TokenNameIdentifier	 total Group Count
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
groupSort	TokenNameIdentifier	 group Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
docSort	TokenNameIdentifier	 doc Sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
docSort	TokenNameIdentifier	 doc Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
totalHitCount	TokenNameIdentifier	 total Hit Count
,	TokenNameCOMMA	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
,	TokenNameCOMMA	
mergedGroupDocs	TokenNameIdentifier	 merged Group Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
totalGroupCount	TokenNameIdentifier	 total Group Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopGroups	TokenNameIdentifier	 Top Groups
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
groupSort	TokenNameIdentifier	 group Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
docSort	TokenNameIdentifier	 doc Sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
docSort	TokenNameIdentifier	 doc Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
totalHitCount	TokenNameIdentifier	 total Hit Count
,	TokenNameCOMMA	
totalGroupedHitCount	TokenNameIdentifier	 total Grouped Hit Count
,	TokenNameCOMMA	
mergedGroupDocs	TokenNameIdentifier	 merged Group Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
