package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
/** Represents hits returned by {@link * Searcher#search(Query,Filter,int)} and {@link * Searcher#search(Query,int)}. */	TokenNameCOMMENT_JAVADOC	 Represents hits returned by {@link Searcher#search(Query,Filter,int)} and {@link Searcher#search(Query,int)}. 
public	TokenNamepublic	
class	TokenNameclass	
TopDocs	TokenNameIdentifier	 Top Docs
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** The total number of hits for the query. */	TokenNameCOMMENT_JAVADOC	 The total number of hits for the query. 
public	TokenNamepublic	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
/** The top hits for the query. */	TokenNameCOMMENT_JAVADOC	 The top hits for the query. 
public	TokenNamepublic	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
/** Stores the maximum score value encountered, needed for normalizing. */	TokenNameCOMMENT_JAVADOC	 Stores the maximum score value encountered, needed for normalizing. 
private	TokenNameprivate	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
/** * Returns the maximum score value encountered. Note that in case * scores are not tracked, this returns {@link Float#NaN}. */	TokenNameCOMMENT_JAVADOC	 Returns the maximum score value encountered. Note that in case scores are not tracked, this returns {@link Float#NaN}. 
public	TokenNamepublic	
float	TokenNamefloat	
getMaxScore	TokenNameIdentifier	 get Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the maximum score value encountered. */	TokenNameCOMMENT_JAVADOC	 Sets the maximum score value encountered. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxScore	TokenNameIdentifier	 set Max Score
(	TokenNameLPAREN	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a TopDocs with a default maxScore=Float.NaN. */	TokenNameCOMMENT_JAVADOC	 Constructs a TopDocs with a default maxScore=Float.NaN. 
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
=	TokenNameEQUAL	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Refers to one hit: 	TokenNameCOMMENT_LINE	Refers to one hit: 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ShardRef	TokenNameIdentifier	 Shard Ref
{	TokenNameLBRACE	
// Which shard (index into shardHits[]): 	TokenNameCOMMENT_LINE	Which shard (index into shardHits[]): 
final	TokenNamefinal	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
// Which hit within the shard: 	TokenNameCOMMENT_LINE	Which hit within the shard: 
int	TokenNameint	
hitIndex	TokenNameIdentifier	 hit Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ShardRef	TokenNameIdentifier	 Shard Ref
(	TokenNameLPAREN	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
=	TokenNameEQUAL	
shardIndex	TokenNameIdentifier	 shard Index
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
"ShardRef(shardIndex="	TokenNameStringLiteral	ShardRef(shardIndex=
+	TokenNamePLUS	
shardIndex	TokenNameIdentifier	 shard Index
+	TokenNamePLUS	
" hitIndex="	TokenNameStringLiteral	 hitIndex=
+	TokenNamePLUS	
hitIndex	TokenNameIdentifier	 hit Index
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Specialized MergeSortQueue that just merges by 	TokenNameCOMMENT_LINE	Specialized MergeSortQueue that just merges by 
// relevance score, descending: 	TokenNameCOMMENT_LINE	relevance score, descending: 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScoreMergeSortQueue	TokenNameIdentifier	 Score Merge Sort Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ShardRef	TokenNameIdentifier	 Shard Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ScoreMergeSortQueue	TokenNameIdentifier	 Score Merge Sort Queue
(	TokenNameLPAREN	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shardHits	TokenNameIdentifier	 shard Hits
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Returns true if first is < second 	TokenNameCOMMENT_LINE	Returns true if first is < second 
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
ShardRef	TokenNameIdentifier	 Shard Ref
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
ShardRef	TokenNameIdentifier	 Shard Ref
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
first	TokenNameIdentifier	 first
!=	TokenNameNOT_EQUAL	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
firstScore	TokenNameIdentifier	 first Score
=	TokenNameEQUAL	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
secondScore	TokenNameIdentifier	 second Score
=	TokenNameEQUAL	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstScore	TokenNameIdentifier	 first Score
<	TokenNameLESS	
secondScore	TokenNameIdentifier	 second Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
firstScore	TokenNameIdentifier	 first Score
>	TokenNameGREATER	
secondScore	TokenNameIdentifier	 second Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Tie break: earlier shard wins 	TokenNameCOMMENT_LINE	Tie break: earlier shard wins 
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
<	TokenNameLESS	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
>	TokenNameGREATER	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Tie break in same shard: resolve however the 	TokenNameCOMMENT_LINE	Tie break in same shard: resolve however the 
// shard had resolved it: 	TokenNameCOMMENT_LINE	shard had resolved it: 
assert	TokenNameassert	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
!=	TokenNameNOT_EQUAL	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
<	TokenNameLESS	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MergeSortQueue	TokenNameIdentifier	 Merge Sort Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ShardRef	TokenNameIdentifier	 Shard Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
// These are really FieldDoc instances: 	TokenNameCOMMENT_LINE	These are really FieldDoc instances: 
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reverseMul	TokenNameIdentifier	 reverse Mul
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MergeSortQueue	TokenNameIdentifier	 Merge Sort Queue
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shardHits	TokenNameIdentifier	 shard Hits
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shard	TokenNameIdentifier	 shard
=	TokenNameEQUAL	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
//System.out.println(" init shardIdx=" + shardIDX + " hits=" + shard); 	TokenNameCOMMENT_LINE	System.out.println(" init shardIdx=" + shardIDX + " hits=" + shard); 
if	TokenNameif	
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
;	TokenNameSEMICOLON	
// Fail gracefully if API is misused: 	TokenNameCOMMENT_LINE	Fail gracefully if API is misused: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitIDX	TokenNameIdentifier	 hit IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
<	TokenNameLESS	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
[	TokenNameLBRACKET	
hitIDX	TokenNameIdentifier	 hit IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
instanceof	TokenNameinstanceof	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"shard "	TokenNameStringLiteral	shard 
+	TokenNamePLUS	
shardIDX	TokenNameIdentifier	 shard IDX
+	TokenNamePLUS	
" was not sorted by the provided Sort (expected FieldDoc but got ScoreDoc)"	TokenNameStringLiteral	 was not sorted by the provided Sort (expected FieldDoc but got ScoreDoc)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
sd	TokenNameIdentifier	 sd
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"shard "	TokenNameStringLiteral	shard 
+	TokenNamePLUS	
shardIDX	TokenNameIdentifier	 shard IDX
+	TokenNamePLUS	
" did not set sort field values (FieldDoc.fields is null); you must pass fillFields=true to IndexSearcher.search on each shard"	TokenNameStringLiteral	 did not set sort field values (FieldDoc.fields is null); you must pass fillFields=true to IndexSearcher.search on each shard
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
<	TokenNameLESS	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
sortField	TokenNameIdentifier	 sort Field
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortField	TokenNameIdentifier	 sort Field
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
compIDX	TokenNameIdentifier	 comp IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortField	TokenNameIdentifier	 sort Field
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
// Returns true if first is < second 	TokenNameCOMMENT_LINE	Returns true if first is < second 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
ShardRef	TokenNameIdentifier	 Shard Ref
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
ShardRef	TokenNameIdentifier	 Shard Ref
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
first	TokenNameIdentifier	 first
!=	TokenNameNOT_EQUAL	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
firstFD	TokenNameIdentifier	 first FD
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
secondFD	TokenNameIdentifier	 second FD
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println(" lessThan:\n first=" + first + " doc=" + firstFD.doc + " score=" + firstFD.score + "\n second=" + second + " doc=" + secondFD.doc + " score=" + secondFD.score); 	TokenNameCOMMENT_LINE	System.out.println(" lessThan:\n first=" + first + " doc=" + firstFD.doc + " score=" + firstFD.score + "\n second=" + second + " doc=" + secondFD.doc + " score=" + secondFD.score); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println(" cmp idx=" + compIDX + " cmp1=" + firstFD.fields[compIDX] + " cmp2=" + secondFD.fields[compIDX] + " reverse=" + reverseMul[compIDX]); 	TokenNameCOMMENT_LINE	System.out.println(" cmp idx=" + compIDX + " cmp1=" + firstFD.fields[compIDX] + " cmp2=" + secondFD.fields[compIDX] + " reverse=" + reverseMul[compIDX]); 
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
firstFD	TokenNameIdentifier	 first FD
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
secondFD	TokenNameIdentifier	 second FD
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" return " + (cmp < 0)); 	TokenNameCOMMENT_LINE	System.out.println(" return " + (cmp < 0)); 
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Tie break: earlier shard wins 	TokenNameCOMMENT_LINE	Tie break: earlier shard wins 
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
<	TokenNameLESS	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" return tb true"); 	TokenNameCOMMENT_LINE	System.out.println(" return tb true"); 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
>	TokenNameGREATER	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" return tb false"); 	TokenNameCOMMENT_LINE	System.out.println(" return tb false"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Tie break in same shard: resolve however the 	TokenNameCOMMENT_LINE	Tie break in same shard: resolve however the 
// shard had resolved it: 	TokenNameCOMMENT_LINE	shard had resolved it: 
//System.out.println(" return tb " + (first.hitIndex < second.hitIndex)); 	TokenNameCOMMENT_LINE	System.out.println(" return tb " + (first.hitIndex < second.hitIndex)); 
assert	TokenNameassert	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
!=	TokenNameNOT_EQUAL	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
<	TokenNameLESS	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns a new TopDocs, containing topN results across * the provided TopDocs, sorting by the specified {@link * Sort}. Each of the TopDocs must have been sorted by * the same Sort, and sort field values must have been * filled (ie, <code>fillFields=true</code> must be * passed to {@link * TopFieldCollector#create}. * * <p>Pass sort=null to merge sort by score descending. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Returns a new TopDocs, containing topN results across the provided TopDocs, sorting by the specified {@link Sort}. Each of the TopDocs must have been sorted by the same Sort, and sort field values must have been filled (ie, <code>fillFields=true</code> must be passed to {@link TopFieldCollector#create}. * <p>Pass sort=null to merge sort by score descending. * @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
TopDocs	TokenNameIdentifier	 Top Docs
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
,	TokenNameCOMMA	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ShardRef	TokenNameIdentifier	 Shard Ref
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreMergeSortQueue	TokenNameIdentifier	 Score Merge Sort Queue
(	TokenNameLPAREN	
shardHits	TokenNameIdentifier	 shard Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
MergeSortQueue	TokenNameIdentifier	 Merge Sort Queue
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
shardHits	TokenNameIdentifier	 shard Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
totalHitCount	TokenNameIdentifier	 total Hit Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
availHitCount	TokenNameIdentifier	 avail Hit Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
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
shardHits	TokenNameIdentifier	 shard Hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
shard	TokenNameIdentifier	 shard
=	TokenNameEQUAL	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// totalHits can be non-zero even if no hits were 	TokenNameCOMMENT_LINE	totalHits can be non-zero even if no hits were 
// collected, when searchAfter was used: 	TokenNameCOMMENT_LINE	collected, when searchAfter was used: 
totalHitCount	TokenNameIdentifier	 total Hit Count
+=	TokenNamePLUS_EQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
availHitCount	TokenNameIdentifier	 avail Hit Count
+=	TokenNamePLUS_EQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ShardRef	TokenNameIdentifier	 Shard Ref
(	TokenNameLPAREN	
shardIDX	TokenNameIdentifier	 shard IDX
)	TokenNameRPAREN	
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
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
getMaxScore	TokenNameIdentifier	 get Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" maxScore now " + maxScore + " vs " + shard.getMaxScore()); 	TokenNameCOMMENT_LINE	System.out.println(" maxScore now " + maxScore + " vs " + shard.getMaxScore()); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
availHitCount	TokenNameIdentifier	 avail Hit Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
topN	TokenNameIdentifier	 top N
,	TokenNameCOMMA	
availHitCount	TokenNameIdentifier	 avail Hit Count
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
hitUpto	TokenNameIdentifier	 hit Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
hitUpto	TokenNameIdentifier	 hit Upto
<	TokenNameLESS	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ShardRef	TokenNameIdentifier	 Shard Ref
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
hit	TokenNameIdentifier	 hit
=	TokenNameEQUAL	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
hit	TokenNameIdentifier	 hit
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
hitUpto	TokenNameIdentifier	 hit Upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hit	TokenNameIdentifier	 hit
;	TokenNameSEMICOLON	
//System.out.println(" hitUpto=" + hitUpto); 	TokenNameCOMMENT_LINE	System.out.println(" hitUpto=" + hitUpto); 
//System.out.println(" doc=" + hits[hitUpto].doc + " score=" + hits[hitUpto].score); 	TokenNameCOMMENT_LINE	System.out.println(" doc=" + hits[hitUpto].doc + " score=" + hits[hitUpto].score); 
hitUpto	TokenNameIdentifier	 hit Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
hitIndex	TokenNameIdentifier	 hit Index
<	TokenNameLESS	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not done with this these TopDocs yet: 	TokenNameCOMMENT_LINE	Not done with this these TopDocs yet: 
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHitCount	TokenNameIdentifier	 total Hit Count
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
(	TokenNameLPAREN	
totalHitCount	TokenNameIdentifier	 total Hit Count
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
