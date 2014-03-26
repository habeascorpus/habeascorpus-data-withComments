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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
TestTopDocsCollector	TokenNameIdentifier	 Test Top Docs Collector
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MyTopsDocCollector	TokenNameIdentifier	 My Tops Doc Collector
extends	TokenNameextends	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MyTopsDocCollector	TokenNameIdentifier	 My Tops Doc Collector
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
HitQueue	TokenNameIdentifier	 Hit Queue
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TopDocs	TokenNameIdentifier	 Top Docs
newTopDocs	TokenNameIdentifier	 new Top Docs
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_TOPDOCS	TokenNameIdentifier	 EMPTY  TOPDOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
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
++	TokenNamePLUS_PLUS	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
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
// Don't do anything. Assign scores in random 	TokenNameCOMMENT_LINE	Don't do anything. Assign scores in random 
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
}	TokenNameRBRACE	
// Scores array to be used by MyTopDocsCollector. If it is changed, MAX_SCORE 	TokenNameCOMMENT_LINE	Scores array to be used by MyTopDocsCollector. If it is changed, MAX_SCORE 
// must also change. 	TokenNameCOMMENT_LINE	must also change. 
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
1.7839992f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.9925785f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.9608946f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.07948637f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.6356435f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.4950366f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.1490803f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.108544f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.961808f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.2423935f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.285586f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.6699767f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.9655676f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.953706f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
5.383931f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.9916306f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.365894f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.888485f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.723962f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
3.1796896f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.39971232f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.3077754f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.8489285f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
9.17561f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
5.060466f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.9793315f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.601509f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.1858315f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.28146625f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
MAX_SCORE	TokenNameIdentifier	 MAX  SCORE
=	TokenNameEQUAL	
9.17561f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
int	TokenNameint	
numResults	TokenNameIdentifier	 num Results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
new	TokenNamenew	
MyTopsDocCollector	TokenNameIdentifier	 My Tops Doc Collector
(	TokenNameLPAREN	
numResults	TokenNameIdentifier	 num Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tdc	TokenNameIdentifier	 tdc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// populate an index with 30 documents, this should be enough for the test. 	TokenNameCOMMENT_LINE	populate an index with 30 documents, this should be enough for the test. 
// The documents have no content - the test uses MatchAllDocsQuery(). 	TokenNameCOMMENT_LINE	The documents have no content - the test uses MatchAllDocsQuery(). 
dir	TokenNameIdentifier	 dir
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
dir	TokenNameIdentifier	 dir
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
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidArguments	TokenNameIdentifier	 test Invalid Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
numResults	TokenNameIdentifier	 num Results
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
numResults	TokenNameIdentifier	 num Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start < 0 	TokenNameCOMMENT_LINE	start < 0 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start > pq.size() 	TokenNameCOMMENT_LINE	start > pq.size() 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
numResults	TokenNameIdentifier	 num Results
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start == pq.size() 	TokenNameCOMMENT_LINE	start == pq.size() 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
numResults	TokenNameIdentifier	 num Results
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// howMany < 0 	TokenNameCOMMENT_LINE	howMany < 0 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// howMany == 0 	TokenNameCOMMENT_LINE	howMany == 0 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testZeroResults	TokenNameIdentifier	 test Zero Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
new	TokenNamenew	
MyTopsDocCollector	TokenNameIdentifier	 My Tops Doc Collector
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFirstResultsPage	TokenNameIdentifier	 test First Results Page
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSecondResultsPages	TokenNameIdentifier	 test Second Results Pages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ask for more results than are available 	TokenNameCOMMENT_LINE	ask for more results than are available 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ask for 5 results (exactly what there should be 	TokenNameCOMMENT_LINE	ask for 5 results (exactly what there should be 
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ask for less results than there are 	TokenNameCOMMENT_LINE	ask for less results than there are 
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetAllResults	TokenNameIdentifier	 test Get All Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetResultsFromStart	TokenNameIdentifier	 test Get Results From Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should bring all results 	TokenNameCOMMENT_LINE	should bring all results 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the last 5 only. 	TokenNameCOMMENT_LINE	get the last 5 only. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMaxScore	TokenNameIdentifier	 test Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// ask for all results 	TokenNameCOMMENT_LINE	ask for all results 
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MAX_SCORE	TokenNameIdentifier	 MAX  SCORE
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
getMaxScore	TokenNameIdentifier	 get Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ask for 5 last results 	TokenNameCOMMENT_LINE	ask for 5 last results 
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MAX_SCORE	TokenNameIdentifier	 MAX  SCORE
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
getMaxScore	TokenNameIdentifier	 get Max Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This does not test the PQ's correctness, but whether topDocs() 	TokenNameCOMMENT_LINE	This does not test the PQ's correctness, but whether topDocs() 
// implementations return the results in decreasing score order. 	TokenNameCOMMENT_LINE	implementations return the results in decreasing score order. 
public	TokenNamepublic	
void	TokenNamevoid	
testResultsOrder	TokenNameIdentifier	 test Results Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
tdc	TokenNameIdentifier	 tdc
=	TokenNameEQUAL	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
tdc	TokenNameIdentifier	 tdc
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MAX_SCORE	TokenNameIdentifier	 MAX  SCORE
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
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
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
>=	TokenNameGREATER_EQUAL	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
