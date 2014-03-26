package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
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
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
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
Scorer	TokenNameIdentifier	 Scorer
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A {@link Collector} which stores all docIDs and their scores in a * {@link ScoredDocIDs} instance. If scoring is not enabled, then the default * score as set in {@link #setDefaultScore(float)} (or * {@link ScoredDocIDsIterator#DEFAULT_SCORE}) will be set for all documents. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A {@link Collector} which stores all docIDs and their scores in a {@link ScoredDocIDs} instance. If scoring is not enabled, then the default score as set in {@link #setDefaultScore(float)} (or {@link ScoredDocIDsIterator#DEFAULT_SCORE}) will be set for all documents. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NonScoringDocIdCollector	TokenNameIdentifier	 Non Scoring Doc Id Collector
extends	TokenNameextends	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
{	TokenNameLBRACE	
float	TokenNamefloat	
defaultScore	TokenNameIdentifier	 default Score
=	TokenNameEQUAL	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
.	TokenNameDOT	
DEFAULT_SCORE	TokenNameIdentifier	 DEFAULT  SCORE
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"synthetic-access"	TokenNameStringLiteral	synthetic-access
)	TokenNameRPAREN	
public	TokenNamepublic	
NonScoringDocIdCollector	TokenNameIdentifier	 Non Scoring Doc Id Collector
(	TokenNameLPAREN	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
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
docIds	TokenNameIdentifier	 doc Ids
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
numDocIds	TokenNameIdentifier	 num Doc Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getDefaultScore	TokenNameIdentifier	 get Default Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultScore	TokenNameIdentifier	 default Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
scoredDocIdsIterator	TokenNameIdentifier	 scored Doc Ids Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
docIdsIter	TokenNameIdentifier	 doc Ids Iter
=	TokenNameEQUAL	
docIds	TokenNameIdentifier	 doc Ids
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getDocID	TokenNameIdentifier	 get Doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextDoc	TokenNameIdentifier	 next Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultScore	TokenNameIdentifier	 default Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
nextDoc	TokenNameIdentifier	 next Doc
=	TokenNameEQUAL	
docIdsIter	TokenNameIdentifier	 doc Ids Iter
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nextDoc	TokenNameIdentifier	 next Doc
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should not happen as we're iterating over an OpenBitSet. For 	TokenNameCOMMENT_LINE	This should not happen as we're iterating over an OpenBitSet. For 
// completeness, terminate iteration 	TokenNameCOMMENT_LINE	completeness, terminate iteration 
nextDoc	TokenNameIdentifier	 next Doc
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultScore	TokenNameIdentifier	 set Default Score
(	TokenNameLPAREN	
float	TokenNamefloat	
defaultScore	TokenNameIdentifier	 default Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultScore	TokenNameIdentifier	 default Score
=	TokenNameEQUAL	
defaultScore	TokenNameIdentifier	 default Score
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ScoringDocIdCollector	TokenNameIdentifier	 Scoring Doc Id Collector
extends	TokenNameextends	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"synthetic-access"	TokenNameStringLiteral	synthetic-access
)	TokenNameRPAREN	
public	TokenNamepublic	
ScoringDocIdCollector	TokenNameIdentifier	 Scoring Doc Id Collector
(	TokenNameLPAREN	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only matching documents have an entry in the scores array. Therefore start with 	TokenNameCOMMENT_LINE	only matching documents have an entry in the scores array. Therefore start with 
// a small array and grow when needed. 	TokenNameCOMMENT_LINE	a small array and grow when needed. 
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
64	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
docIds	TokenNameIdentifier	 doc Ids
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numDocIds	TokenNameIdentifier	 num Doc Ids
>=	TokenNameGREATER_EQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newScores	TokenNameIdentifier	 new Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
numDocIds	TokenNameIdentifier	 num Doc Ids
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newScores	TokenNameIdentifier	 new Scores
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numDocIds	TokenNameIdentifier	 num Doc Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
newScores	TokenNameIdentifier	 new Scores
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
numDocIds	TokenNameIdentifier	 num Doc Ids
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
numDocIds	TokenNameIdentifier	 num Doc Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
scoredDocIdsIterator	TokenNameIdentifier	 scored Doc Ids Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
docIdsIter	TokenNameIdentifier	 doc Ids Iter
=	TokenNameEQUAL	
docIds	TokenNameIdentifier	 doc Ids
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
scoresIdx	TokenNameIdentifier	 scores Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getDocID	TokenNameIdentifier	 get Doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextDoc	TokenNameIdentifier	 next Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
scoresIdx	TokenNameIdentifier	 scores Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
nextDoc	TokenNameIdentifier	 next Doc
=	TokenNameEQUAL	
docIdsIter	TokenNameIdentifier	 doc Ids Iter
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextDoc	TokenNameIdentifier	 next Doc
==	TokenNameEQUAL_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
scoresIdx	TokenNameIdentifier	 scores Idx
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should not happen as we're iterating over an OpenBitSet. For 	TokenNameCOMMENT_LINE	This should not happen as we're iterating over an OpenBitSet. For 
// completeness, terminate iteration 	TokenNameCOMMENT_LINE	completeness, terminate iteration 
nextDoc	TokenNameIdentifier	 next Doc
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getDefaultScore	TokenNameIdentifier	 get Default Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
.	TokenNameDOT	
DEFAULT_SCORE	TokenNameIdentifier	 DEFAULT  SCORE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultScore	TokenNameIdentifier	 set Default Score
(	TokenNameLPAREN	
float	TokenNamefloat	
defaultScore	TokenNameIdentifier	 default Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
numDocIds	TokenNameIdentifier	 num Doc Ids
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
docIds	TokenNameIdentifier	 doc Ids
;	TokenNameSEMICOLON	
/** * Creates a new {@link ScoredDocIdCollector} with the given parameters. * * @param maxDoc the number of documents that are expected to be collected. * Note that if more documents are collected, unexpected exceptions may * be thrown. Usually you should pass {@link IndexReader#maxDoc()} of * the same IndexReader with which the search is executed. * @param enableScoring if scoring is enabled, a score will be computed for * every matching document, which might be expensive. Therefore if you * do not require scoring, it is better to set it to <i>false</i>. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link ScoredDocIdCollector} with the given parameters. * @param maxDoc the number of documents that are expected to be collected. Note that if more documents are collected, unexpected exceptions may be thrown. Usually you should pass {@link IndexReader#maxDoc()} of the same IndexReader with which the search is executed. @param enableScoring if scoring is enabled, a score will be computed for every matching document, which might be expensive. Therefore if you do not require scoring, it is better to set it to <i>false</i>. 
public	TokenNamepublic	
static	TokenNamestatic	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
,	TokenNameCOMMA	
boolean	TokenNameboolean	
enableScoring	TokenNameIdentifier	 enable Scoring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enableScoring	TokenNameIdentifier	 enable Scoring
?	TokenNameQUESTION	
new	TokenNamenew	
ScoringDocIdCollector	TokenNameIdentifier	 Scoring Doc Id Collector
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
NonScoringDocIdCollector	TokenNameIdentifier	 Non Scoring Doc Id Collector
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ScoredDocIdCollector	TokenNameIdentifier	 Scored Doc Id Collector
(	TokenNameLPAREN	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numDocIds	TokenNameIdentifier	 num Doc Ids
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docIds	TokenNameIdentifier	 doc Ids
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the default score used when scoring is disabled. */	TokenNameCOMMENT_JAVADOC	 Returns the default score used when scoring is disabled. 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
getDefaultScore	TokenNameIdentifier	 get Default Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the default score. Only applicable if scoring is disabled. */	TokenNameCOMMENT_JAVADOC	 Set the default score. Only applicable if scoring is disabled. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
setDefaultScore	TokenNameIdentifier	 set Default Score
(	TokenNameLPAREN	
float	TokenNamefloat	
defaultScore	TokenNameIdentifier	 default Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
scoredDocIdsIterator	TokenNameIdentifier	 scored Doc Ids Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
getScoredDocIDs	TokenNameIdentifier	 get Scored Doc I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
scoredDocIdsIterator	TokenNameIdentifier	 scored Doc Ids Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIDs	TokenNameIdentifier	 get Doc I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docIds	TokenNameIdentifier	 doc Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numDocIds	TokenNameIdentifier	 num Doc Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
