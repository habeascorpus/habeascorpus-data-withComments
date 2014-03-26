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
/** * A {@link Collector} implementation that collects the top-scoring hits, * returning them as a {@link TopDocs}. This is used by {@link IndexSearcher} to * implement {@link TopDocs}-based search. Hits are sorted by score descending * and then (when the scores are tied) docID ascending. When you create an * instance of this collector you should know in advance whether documents are * going to be collected in doc Id order or not. * * <p><b>NOTE</b>: The values {@link Float#NaN} and * {Float#NEGATIVE_INFINITY} are not valid scores. This * collector will not properly collect hits with such * scores. */	TokenNameCOMMENT_JAVADOC	 A {@link Collector} implementation that collects the top-scoring hits, returning them as a {@link TopDocs}. This is used by {@link IndexSearcher} to implement {@link TopDocs}-based search. Hits are sorted by score descending and then (when the scores are tied) docID ascending. When you create an instance of this collector you should know in advance whether documents are going to be collected in doc Id order or not. * <p><b>NOTE</b>: The values {@link Float#NaN} and {Float#NEGATIVE_INFINITY} are not valid scores. This collector will not properly collect hits with such scores. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
extends	TokenNameextends	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
ScoreDoc	TokenNameIdentifier	 Score Doc
>	TokenNameGREATER	
{	TokenNameLBRACE	
// Assumes docs are scored in order. 	TokenNameCOMMENT_LINE	Assumes docs are scored in order. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
InOrderTopScoreDocCollector	TokenNameIdentifier	 In Order Top Score Doc Collector
extends	TokenNameextends	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
InOrderTopScoreDocCollector	TokenNameIdentifier	 In Order Top Score Doc Collector
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
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
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This collector cannot handle these scores: 	TokenNameCOMMENT_LINE	This collector cannot handle these scores: 
assert	TokenNameassert	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<=	TokenNameLESS_EQUAL	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since docs are returned in-order (i.e., increasing doc Id), a document 	TokenNameCOMMENT_LINE	Since docs are returned in-order (i.e., increasing doc Id), a document 
// with equal score to pqTop.score cannot compete since HitQueue favors 	TokenNameCOMMENT_LINE	with equal score to pqTop.score cannot compete since HitQueue favors 
// documents with lower doc Ids. Therefore reject those docs too. 	TokenNameCOMMENT_LINE	documents with lower doc Ids. Therefore reject those docs too. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Assumes docs are scored in order. 	TokenNameCOMMENT_LINE	Assumes docs are scored in order. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
InOrderPagingScoreDocCollector	TokenNameIdentifier	 In Order Paging Score Doc Collector
extends	TokenNameextends	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
after	TokenNameIdentifier	 after
;	TokenNameSEMICOLON	
// this is always after.doc - docBase, to save an add when score == after.score 	TokenNameCOMMENT_LINE	this is always after.doc - docBase, to save an add when score == after.score 
private	TokenNameprivate	
int	TokenNameint	
afterDoc	TokenNameIdentifier	 after Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
collectedHits	TokenNameIdentifier	 collected Hits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InOrderPagingScoreDocCollector	TokenNameIdentifier	 In Order Paging Score Doc Collector
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
after	TokenNameIdentifier	 after
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
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This collector cannot handle these scores: 	TokenNameCOMMENT_LINE	This collector cannot handle these scores: 
assert	TokenNameassert	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
score	TokenNameIdentifier	 score
||	TokenNameOR_OR	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
score	TokenNameIdentifier	 score
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
<=	TokenNameLESS_EQUAL	
afterDoc	TokenNameIdentifier	 after Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// hit was collected on a previous page 	TokenNameCOMMENT_LINE	hit was collected on a previous page 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<=	TokenNameLESS_EQUAL	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since docs are returned in-order (i.e., increasing doc Id), a document 	TokenNameCOMMENT_LINE	Since docs are returned in-order (i.e., increasing doc Id), a document 
// with equal score to pqTop.score cannot compete since HitQueue favors 	TokenNameCOMMENT_LINE	with equal score to pqTop.score cannot compete since HitQueue favors 
// documents with lower doc Ids. Therefore reject those docs too. 	TokenNameCOMMENT_LINE	documents with lower doc Ids. Therefore reject those docs too. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
collectedHits	TokenNameIdentifier	 collected Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
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
false	TokenNamefalse	
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
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
afterDoc	TokenNameIdentifier	 after Doc
=	TokenNameEQUAL	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
-	TokenNameMINUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
topDocsSize	TokenNameIdentifier	 top Docs Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectedHits	TokenNameIdentifier	 collected Hits
<	TokenNameLESS	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
collectedHits	TokenNameIdentifier	 collected Hits
:	TokenNameCOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
return	TokenNamereturn	
results	TokenNameIdentifier	 results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Assumes docs are scored out of order. 	TokenNameCOMMENT_LINE	Assumes docs are scored out of order. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderTopScoreDocCollector	TokenNameIdentifier	 Out Of Order Top Score Doc Collector
extends	TokenNameextends	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
OutOfOrderTopScoreDocCollector	TokenNameIdentifier	 Out Of Order Top Score Doc Collector
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
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
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This collector cannot handle NaN 	TokenNameCOMMENT_LINE	This collector cannot handle NaN 
assert	TokenNameassert	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Doesn't compete w/ bottom entry in queue 	TokenNameCOMMENT_LINE	Doesn't compete w/ bottom entry in queue 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Break tie in score by doc ID: 	TokenNameCOMMENT_LINE	Break tie in score by doc ID: 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
// Assumes docs are scored out of order. 	TokenNameCOMMENT_LINE	Assumes docs are scored out of order. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderPagingScoreDocCollector	TokenNameIdentifier	 Out Of Order Paging Score Doc Collector
extends	TokenNameextends	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
after	TokenNameIdentifier	 after
;	TokenNameSEMICOLON	
// this is always after.doc - docBase, to save an add when score == after.score 	TokenNameCOMMENT_LINE	this is always after.doc - docBase, to save an add when score == after.score 
private	TokenNameprivate	
int	TokenNameint	
afterDoc	TokenNameIdentifier	 after Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
collectedHits	TokenNameIdentifier	 collected Hits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutOfOrderPagingScoreDocCollector	TokenNameIdentifier	 Out Of Order Paging Score Doc Collector
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
after	TokenNameIdentifier	 after
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
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This collector cannot handle NaN 	TokenNameCOMMENT_LINE	This collector cannot handle NaN 
assert	TokenNameassert	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalHits	TokenNameIdentifier	 total Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
score	TokenNameIdentifier	 score
||	TokenNameOR_OR	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
score	TokenNameIdentifier	 score
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
<=	TokenNameLESS_EQUAL	
afterDoc	TokenNameIdentifier	 after Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// hit was collected on a previous page 	TokenNameCOMMENT_LINE	hit was collected on a previous page 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Doesn't compete w/ bottom entry in queue 	TokenNameCOMMENT_LINE	Doesn't compete w/ bottom entry in queue 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Break tie in score by doc ID: 	TokenNameCOMMENT_LINE	Break tie in score by doc ID: 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
collectedHits	TokenNameIdentifier	 collected Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
pqTop	TokenNameIdentifier	 pq Top
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
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
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
afterDoc	TokenNameIdentifier	 after Doc
=	TokenNameEQUAL	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
-	TokenNameMINUS	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
topDocsSize	TokenNameIdentifier	 top Docs Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectedHits	TokenNameIdentifier	 collected Hits
<	TokenNameLESS	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
collectedHits	TokenNameIdentifier	 collected Hits
:	TokenNameCOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
return	TokenNamereturn	
results	TokenNameIdentifier	 results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new {@link TopScoreDocCollector} given the number of hits to * collect and whether documents are scored in order by the input * {@link Scorer} to {@link #setScorer(Scorer)}. * * <p><b>NOTE</b>: The instances returned by this method * pre-allocate a full array of length * <code>numHits</code>, and fill the array with sentinel * objects. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link TopScoreDocCollector} given the number of hits to collect and whether documents are scored in order by the input {@link Scorer} to {@link #setScorer(Scorer)}. * <p><b>NOTE</b>: The instances returned by this method pre-allocate a full array of length <code>numHits</code>, and fill the array with sentinel objects. 
public	TokenNamepublic	
static	TokenNamestatic	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link TopScoreDocCollector} given the number of hits to * collect, the bottom of the previous page, and whether documents are scored in order by the input * {@link Scorer} to {@link #setScorer(Scorer)}. * * <p><b>NOTE</b>: The instances returned by this method * pre-allocate a full array of length * <code>numHits</code>, and fill the array with sentinel * objects. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link TopScoreDocCollector} given the number of hits to collect, the bottom of the previous page, and whether documents are scored in order by the input {@link Scorer} to {@link #setScorer(Scorer)}. * <p><b>NOTE</b>: The instances returned by this method pre-allocate a full array of length <code>numHits</code>, and fill the array with sentinel objects. 
public	TokenNamepublic	
static	TokenNamestatic	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
boolean	TokenNameboolean	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numHits must be > 0; please use TotalHitCountCollector if you just need the total hit count"	TokenNameStringLiteral	numHits must be > 0; please use TotalHitCountCollector if you just need the total hit count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
after	TokenNameIdentifier	 after
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
InOrderTopScoreDocCollector	TokenNameIdentifier	 In Order Top Score Doc Collector
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
InOrderPagingScoreDocCollector	TokenNameIdentifier	 In Order Paging Score Doc Collector
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
after	TokenNameIdentifier	 after
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
OutOfOrderTopScoreDocCollector	TokenNameIdentifier	 Out Of Order Top Score Doc Collector
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
OutOfOrderPagingScoreDocCollector	TokenNameIdentifier	 Out Of Order Paging Score Doc Collector
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ScoreDoc	TokenNameIdentifier	 Score Doc
pqTop	TokenNameIdentifier	 pq Top
;	TokenNameSEMICOLON	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
// prevents instantiation 	TokenNameCOMMENT_LINE	prevents instantiation 
private	TokenNameprivate	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
HitQueue	TokenNameIdentifier	 Hit Queue
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// HitQueue implements getSentinelObject to return a ScoreDoc, so we know 	TokenNameCOMMENT_LINE	HitQueue implements getSentinelObject to return a ScoreDoc, so we know 
// that at this point top() is already initialized. 	TokenNameCOMMENT_LINE	that at this point top() is already initialized. 
pqTop	TokenNameIdentifier	 pq Top
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
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
// We need to compute maxScore in order to set it in TopDocs. If start == 0, 	TokenNameCOMMENT_LINE	We need to compute maxScore in order to set it in TopDocs. If start == 0, 
// it means the largest element is already in results, use its score as 	TokenNameCOMMENT_LINE	it means the largest element is already in results, use its score as 
// maxScore. Otherwise pop everything else, until the largest element is 	TokenNameCOMMENT_LINE	maxScore. Otherwise pop everything else, until the largest element is 
// extracted and use its score as maxScore. 	TokenNameCOMMENT_LINE	extracted and use its score as maxScore. 
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
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
