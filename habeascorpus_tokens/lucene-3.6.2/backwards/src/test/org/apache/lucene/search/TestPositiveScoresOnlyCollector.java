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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPositiveScoresOnlyCollector	TokenNameIdentifier	 Test Positive Scores Only Collector
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SimpleScorer	TokenNameIdentifier	 Simple Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleScorer	TokenNameIdentifier	 Simple Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
:	TokenNameCOLON	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
++	TokenNamePLUS_PLUS	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
idx	TokenNameIdentifier	 idx
:	TokenNameCOLON	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
idx	TokenNameIdentifier	 idx
:	TokenNameCOLON	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// The scores must have positive as well as negative values 	TokenNameCOMMENT_LINE	The scores must have positive as well as negative values 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0.7767749f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.7839992f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.9925785f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.9608946f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
0.07948637f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.6356435f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.4950366f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.1490803f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
8.108544f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.961808f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.2423935f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
7.285586f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.6699767f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testNegativeScores	TokenNameIdentifier	 test Negative Scores
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// The Top*Collectors previously filtered out documents with <= scores. This 	TokenNameCOMMENT_LINE	The Top*Collectors previously filtered out documents with <= scores. This 
// behavior has changed. This test checks that if PositiveOnlyScoresFilter 	TokenNameCOMMENT_LINE	behavior has changed. This test checks that if PositiveOnlyScoresFilter 
// wraps one of these collectors, documents with <= 0 scores are indeed 	TokenNameCOMMENT_LINE	wraps one of these collectors, documents with <= 0 scores are indeed 
// filtered. 	TokenNameCOMMENT_LINE	filtered. 
int	TokenNameint	
numPositiveScores	TokenNameIdentifier	 num Positive Scores
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
numPositiveScores	TokenNameIdentifier	 num Positive Scores
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Weight	TokenNameIdentifier	 Weight
fake	TokenNameIdentifier	 fake
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"fake"	TokenNameStringLiteral	fake
,	TokenNameCOMMA	
"weight"	TokenNameStringLiteral	weight
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleScorer	TokenNameIdentifier	 Simple Scorer
(	TokenNameLPAREN	
fake	TokenNameIdentifier	 fake
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
PositiveScoresOnlyCollector	TokenNameIdentifier	 Positive Scores Only Collector
(	TokenNameLPAREN	
tdc	TokenNameIdentifier	 tdc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
numPositiveScores	TokenNameIdentifier	 num Positive Scores
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
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
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"only positive scores should return: "	TokenNameStringLiteral	only positive scores should return: 
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
