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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
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
/** * A {@link Collector} that sorts by {@link SortField} using * {@link FieldComparator}s. * <p/> * See the {@link #create(org.apache.lucene.search.Sort, int, boolean, boolean, boolean, boolean)} method * for instantiating a TopFieldCollector. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A {@link Collector} that sorts by {@link SortField} using {@link FieldComparator}s. <p/> See the {@link #create(org.apache.lucene.search.Sort, int, boolean, boolean, boolean, boolean)} method for instantiating a TopFieldCollector. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
extends	TokenNameextends	
TopDocsCollector	TokenNameIdentifier	 Top Docs Collector
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
{	TokenNameLBRACE	
// TODO: one optimization we could do is to pre-fill 	TokenNameCOMMENT_LINE	TODO: one optimization we could do is to pre-fill 
// the queue with sentinel value that guaranteed to 	TokenNameCOMMENT_LINE	the queue with sentinel value that guaranteed to 
// always compare lower than a real hit; this would 	TokenNameCOMMENT_LINE	always compare lower than a real hit; this would 
// save having to check queueFull on each insert 	TokenNameCOMMENT_LINE	save having to check queueFull on each insert 
/* * Implements a TopFieldCollector over one SortField criteria, without * tracking document scores and maxScore. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over one SortField criteria, without tracking document scores and maxScore. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OneComparatorNonScoringCollector	TokenNameIdentifier	 One Comparator Non Scoring Collector
extends	TokenNameextends	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
reverseMul	TokenNameIdentifier	 reverse Mul
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneComparatorNonScoringCollector	TokenNameIdentifier	 One Comparator Non Scoring Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
getComparators	TokenNameIdentifier	 get Comparators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
getReverseMul	TokenNameIdentifier	 get Reverse Mul
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bottom.score is already set to Float.NaN in add(). 	TokenNameCOMMENT_LINE	bottom.score is already set to Float.NaN in add(). 
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
reverseMul	TokenNameIdentifier	 reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// since docs are visited in doc Id order, if compare is 0, it means 	TokenNameCOMMENT_LINE	since docs are visited in doc Id order, if compare is 0, it means 
// this document is larger than anything else in the queue, and 	TokenNameCOMMENT_LINE	this document is larger than anything else in the queue, and 
// therefore not competitive. 	TokenNameCOMMENT_LINE	therefore not competitive. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
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
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over one SortField criteria, without * tracking document scores and maxScore, and assumes out of orderness in doc * Ids collection. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over one SortField criteria, without tracking document scores and maxScore, and assumes out of orderness in doc Ids collection. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderOneComparatorNonScoringCollector	TokenNameIdentifier	 Out Of Order One Comparator Non Scoring Collector
extends	TokenNameextends	
OneComparatorNonScoringCollector	TokenNameIdentifier	 One Comparator Non Scoring Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
OutOfOrderOneComparatorNonScoringCollector	TokenNameIdentifier	 Out Of Order One Comparator Non Scoring Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over one SortField criteria, while tracking * document scores but no maxScore. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over one SortField criteria, while tracking document scores but no maxScore. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring No Max Score Collector
extends	TokenNameextends	
OneComparatorNonScoringCollector	TokenNameIdentifier	 One Comparator Non Scoring Collector
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
reverseMul	TokenNameIdentifier	 reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// since docs are visited in doc Id order, if compare is 0, it means 	TokenNameCOMMENT_LINE	since docs are visited in doc Id order, if compare is 0, it means 
// this document is largest than anything else in the queue, and 	TokenNameCOMMENT_LINE	this document is largest than anything else in the queue, and 
// therefore not competitive. 	TokenNameCOMMENT_LINE	therefore not competitive. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute the score only if the hit is competitive. 	TokenNameCOMMENT_LINE	Compute the score only if the hit is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Compute the score only if the hit is competitive. 	TokenNameCOMMENT_LINE	Compute the score only if the hit is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over one SortField criteria, while tracking * document scores but no maxScore, and assumes out of orderness in doc Ids * collection. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over one SortField criteria, while tracking document scores but no maxScore, and assumes out of orderness in doc Ids collection. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderOneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Out Of Order One Comparator Scoring No Max Score Collector
extends	TokenNameextends	
OneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring No Max Score Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
OutOfOrderOneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Out Of Order One Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute the score only if the hit is competitive. 	TokenNameCOMMENT_LINE	Compute the score only if the hit is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Compute the score only if the hit is competitive. 	TokenNameCOMMENT_LINE	Compute the score only if the hit is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over one SortField criteria, with tracking * document scores and maxScore. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over one SortField criteria, with tracking document scores and maxScore. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring Max Score Collector
extends	TokenNameextends	
OneComparatorNonScoringCollector	TokenNameIdentifier	 One Comparator Non Scoring Collector
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must set maxScore to NEG_INF, or otherwise Math.max always returns NaN. 	TokenNameCOMMENT_LINE	Must set maxScore to NEG_INF, or otherwise Math.max always returns NaN. 
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
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
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
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
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
reverseMul	TokenNameIdentifier	 reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// since docs are visited in doc Id order, if compare is 0, it means 	TokenNameCOMMENT_LINE	since docs are visited in doc Id order, if compare is 0, it means 
// this document is largest than anything else in the queue, and 	TokenNameCOMMENT_LINE	this document is largest than anything else in the queue, and 
// therefore not competitive. 	TokenNameCOMMENT_LINE	therefore not competitive. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over one SortField criteria, with tracking * document scores and maxScore, and assumes out of orderness in doc Ids * collection. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over one SortField criteria, with tracking document scores and maxScore, and assumes out of orderness in doc Ids collection. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderOneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Out Of Order One Comparator Scoring Max Score Collector
extends	TokenNameextends	
OneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring Max Score Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
OutOfOrderOneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Out Of Order One Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
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
final	TokenNamefinal	
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
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over multiple SortField criteria, without * tracking document scores and maxScore. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over multiple SortField criteria, without tracking document scores and maxScore. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MultiComparatorNonScoringCollector	TokenNameIdentifier	 Multi Comparator Non Scoring Collector
extends	TokenNameextends	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
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
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reverseMul	TokenNameIdentifier	 reverse Mul
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiComparatorNonScoringCollector	TokenNameIdentifier	 Multi Comparator Non Scoring Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
getComparators	TokenNameIdentifier	 get Comparators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
getReverseMul	TokenNameIdentifier	 get Reverse Mul
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bottom.score is already set to Float.NaN in add(). 	TokenNameCOMMENT_LINE	bottom.score is already set to Float.NaN in add(). 
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
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
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
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
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here c=0. If we're at the last comparator, this doc is not 	TokenNameCOMMENT_LINE	Here c=0. If we're at the last comparator, this doc is not 
// competitive, since docs are visited in doc Id order, which means 	TokenNameCOMMENT_LINE	competitive, since docs are visited in doc Id order, which means 
// this doc cannot compete with any other document in the queue. 	TokenNameCOMMENT_LINE	this doc cannot compete with any other document in the queue. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
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
comparators	TokenNameIdentifier	 comparators
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
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// set the scorer on all comparators 	TokenNameCOMMENT_LINE	set the scorer on all comparators 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over multiple SortField criteria, without * tracking document scores and maxScore, and assumes out of orderness in doc * Ids collection. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over multiple SortField criteria, without tracking document scores and maxScore, and assumes out of orderness in doc Ids collection. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderMultiComparatorNonScoringCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Non Scoring Collector
extends	TokenNameextends	
MultiComparatorNonScoringCollector	TokenNameIdentifier	 Multi Comparator Non Scoring Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
OutOfOrderMultiComparatorNonScoringCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Non Scoring Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
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
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
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
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the equals case. 	TokenNameCOMMENT_LINE	This is the equals case. 
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely not competitive 	TokenNameCOMMENT_LINE	Definitely not competitive 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over multiple SortField criteria, with * tracking document scores and maxScore. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over multiple SortField criteria, with tracking document scores and maxScore. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring Max Score Collector
extends	TokenNameextends	
MultiComparatorNonScoringCollector	TokenNameIdentifier	 Multi Comparator Non Scoring Collector
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must set maxScore to NEG_INF, or otherwise Math.max always returns NaN. 	TokenNameCOMMENT_LINE	Must set maxScore to NEG_INF, or otherwise Math.max always returns NaN. 
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
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
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
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
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
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
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
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
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here c=0. If we're at the last comparator, this doc is not 	TokenNameCOMMENT_LINE	Here c=0. If we're at the last comparator, this doc is not 
// competitive, since docs are visited in doc Id order, which means 	TokenNameCOMMENT_LINE	competitive, since docs are visited in doc Id order, which means 
// this doc cannot compete with any other document in the queue. 	TokenNameCOMMENT_LINE	this doc cannot compete with any other document in the queue. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over multiple SortField criteria, with * tracking document scores and maxScore, and assumes out of orderness in doc * Ids collection. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over multiple SortField criteria, with tracking document scores and maxScore, and assumes out of orderness in doc Ids collection. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderMultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Scoring Max Score Collector
extends	TokenNameextends	
MultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring Max Score Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
OutOfOrderMultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
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
final	TokenNamefinal	
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
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
maxScore	TokenNameIdentifier	 max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
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
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
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
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the equals case. 	TokenNameCOMMENT_LINE	This is the equals case. 
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely not competitive 	TokenNameCOMMENT_LINE	Definitely not competitive 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over multiple SortField criteria, with * tracking document scores and maxScore. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over multiple SortField criteria, with tracking document scores and maxScore. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring No Max Score Collector
extends	TokenNameextends	
MultiComparatorNonScoringCollector	TokenNameIdentifier	 Multi Comparator Non Scoring Collector
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
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
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
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
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here c=0. If we're at the last comparator, this doc is not 	TokenNameCOMMENT_LINE	Here c=0. If we're at the last comparator, this doc is not 
// competitive, since docs are visited in doc Id order, which means 	TokenNameCOMMENT_LINE	competitive, since docs are visited in doc Id order, which means 
// this doc cannot compete with any other document in the queue. 	TokenNameCOMMENT_LINE	this doc cannot compete with any other document in the queue. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute score only if it is competitive. 	TokenNameCOMMENT_LINE	Compute score only if it is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute score only if it is competitive. 	TokenNameCOMMENT_LINE	Compute score only if it is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Implements a TopFieldCollector over multiple SortField criteria, with * tracking document scores and maxScore, and assumes out of orderness in doc * Ids collection. */	TokenNameCOMMENT_BLOCK	 Implements a TopFieldCollector over multiple SortField criteria, with tracking document scores and maxScore, and assumes out of orderness in doc Ids collection. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
OutOfOrderMultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Scoring No Max Score Collector
extends	TokenNameextends	
MultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring No Max Score Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
OutOfOrderMultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
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
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fastmatch: return if this hit is not competitive 	TokenNameCOMMENT_LINE	Fastmatch: return if this hit is not competitive 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
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
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
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
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the equals case. 	TokenNameCOMMENT_LINE	This is the equals case. 
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely not competitive 	TokenNameCOMMENT_LINE	Definitely not competitive 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This hit is competitive - replace bottom element in queue & adjustTop 	TokenNameCOMMENT_LINE	This hit is competitive - replace bottom element in queue & adjustTop 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute score only if it is competitive. 	TokenNameCOMMENT_LINE	Compute score only if it is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateBottom	TokenNameIdentifier	 update Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Startup transient: queue hasn't gathered numHits yet 	TokenNameCOMMENT_LINE	Startup transient: queue hasn't gathered numHits yet 
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Copy hit into queue 	TokenNameCOMMENT_LINE	Copy hit into queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute score only if it is competitive. 	TokenNameCOMMENT_LINE	Compute score only if it is competitive. 
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueFull	TokenNameIdentifier	 queue Full
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
comparators	TokenNameIdentifier	 comparators
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
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
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
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_SCOREDOCS	TokenNameIdentifier	 EMPTY  SCOREDOCS
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
;	TokenNameSEMICOLON	
/* * Stores the maximum score value encountered, needed for normalizing. If * document scores are not tracked, this value is initialized to NaN. */	TokenNameCOMMENT_BLOCK	 Stores the maximum score value encountered, needed for normalizing. If document scores are not tracked, this value is initialized to NaN. 
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
;	TokenNameSEMICOLON	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
queueFull	TokenNameIdentifier	 queue Full
;	TokenNameSEMICOLON	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
// Declaring the constructor private prevents extending this class by anyone 	TokenNameCOMMENT_LINE	Declaring the constructor private prevents extending this class by anyone 
// else. Note that the class cannot be final since it's extended by the 	TokenNameCOMMENT_LINE	else. Note that the class cannot be final since it's extended by the 
// internal versions. If someone will define a constructor with any other 	TokenNameCOMMENT_LINE	internal versions. If someone will define a constructor with any other 
// visibility, then anyone will be able to extend the class, which is not what 	TokenNameCOMMENT_LINE	visibility, then anyone will be able to extend the class, which is not what 
// we want. 	TokenNameCOMMENT_LINE	we want. 
private	TokenNameprivate	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
(	TokenNameLPAREN	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numHits	TokenNameIdentifier	 num Hits
=	TokenNameEQUAL	
numHits	TokenNameIdentifier	 num Hits
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fillFields	TokenNameIdentifier	 fill Fields
=	TokenNameEQUAL	
fillFields	TokenNameIdentifier	 fill Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link TopFieldCollector} from the given * arguments. * * <p><b>NOTE</b>: The instances returned by this method * pre-allocate a full array of length * <code>numHits</code>. * * @param sort * the sort criteria (SortFields). * @param numHits * the number of results to collect. * @param fillFields * specifies whether the actual field values should be returned on * the results (FieldDoc). * @param trackDocScores * specifies whether document scores should be tracked and set on the * results. Note that if set to false, then the results' scores will * be set to Float.NaN. Setting this to true affects performance, as * it incurs the score computation on each competitive result. * Therefore if document scores are not required by the application, * it is recommended to set it to false. * @param trackMaxScore * specifies whether the query's maxScore should be tracked and set * on the resulting {@link TopDocs}. Note that if set to false, * {@link TopDocs#getMaxScore()} returns Float.NaN. Setting this to * true affects performance as it incurs the score computation on * each result. Also, setting this true automatically sets * <code>trackDocScores</code> to true as well. * @param docsScoredInOrder * specifies whether documents are scored in doc Id order or not by * the given {@link Scorer} in {@link #setScorer(Scorer)}. * @return a {@link TopFieldCollector} instance which will sort the results by * the sort criteria. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link TopFieldCollector} from the given arguments. * <p><b>NOTE</b>: The instances returned by this method pre-allocate a full array of length <code>numHits</code>. * @param sort the sort criteria (SortFields). @param numHits the number of results to collect. @param fillFields specifies whether the actual field values should be returned on the results (FieldDoc). @param trackDocScores specifies whether document scores should be tracked and set on the results. Note that if set to false, then the results' scores will be set to Float.NaN. Setting this to true affects performance, as it incurs the score computation on each competitive result. Therefore if document scores are not required by the application, it is recommended to set it to false. @param trackMaxScore specifies whether the query's maxScore should be tracked and set on the resulting {@link TopDocs}. Note that if set to false, {@link TopDocs#getMaxScore()} returns Float.NaN. Setting this to true affects performance as it incurs the score computation on each result. Also, setting this true automatically sets <code>trackDocScores</code> to true as well. @param docsScoredInOrder specifies whether documents are scored in doc Id order or not by the given {@link Scorer} in {@link #setScorer(Scorer)}. @return a {@link TopFieldCollector} instance which will sort the results by the sort criteria. @throws IOException 
public	TokenNamepublic	
static	TokenNamestatic	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
,	TokenNameCOMMA	
boolean	TokenNameboolean	
trackDocScores	TokenNameIdentifier	 track Doc Scores
,	TokenNameCOMMA	
boolean	TokenNameboolean	
trackMaxScore	TokenNameIdentifier	 track Max Score
,	TokenNameCOMMA	
boolean	TokenNameboolean	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Sort must contain at least one field"	TokenNameStringLiteral	Sort must contain at least one field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
getComparators	TokenNameIdentifier	 get Comparators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trackMaxScore	TokenNameIdentifier	 track Max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
trackDocScores	TokenNameIdentifier	 track Doc Scores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 One Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OneComparatorNonScoringCollector	TokenNameIdentifier	 One Comparator Non Scoring Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trackMaxScore	TokenNameIdentifier	 track Max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutOfOrderOneComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Out Of Order One Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
trackDocScores	TokenNameIdentifier	 track Doc Scores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutOfOrderOneComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Out Of Order One Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutOfOrderOneComparatorNonScoringCollector	TokenNameIdentifier	 Out Of Order One Comparator Non Scoring Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// multiple comparators. 	TokenNameCOMMENT_LINE	multiple comparators. 
if	TokenNameif	
(	TokenNameLPAREN	
docsScoredInOrder	TokenNameIdentifier	 docs Scored In Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trackMaxScore	TokenNameIdentifier	 track Max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
trackDocScores	TokenNameIdentifier	 track Doc Scores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Multi Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiComparatorNonScoringCollector	TokenNameIdentifier	 Multi Comparator Non Scoring Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trackMaxScore	TokenNameIdentifier	 track Max Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutOfOrderMultiComparatorScoringMaxScoreCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Scoring Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
trackDocScores	TokenNameIdentifier	 track Doc Scores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutOfOrderMultiComparatorScoringNoMaxScoreCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Scoring No Max Score Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutOfOrderMultiComparatorNonScoringCollector	TokenNameIdentifier	 Out Of Order Multi Comparator Non Scoring Collector
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueFull	TokenNameIdentifier	 queue Full
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
==	TokenNameEQUAL_EQUAL	
numHits	TokenNameIdentifier	 num Hits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Only the following callback methods need to be overridden since * topDocs(int, int) calls them to return the results. */	TokenNameCOMMENT_BLOCK	 Only the following callback methods need to be overridden since topDocs(int, int) calls them to return the results. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
populateResults	TokenNameIdentifier	 populate Results
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
int	TokenNameint	
howMany	TokenNameIdentifier	 how Many
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid casting if unnecessary. 	TokenNameCOMMENT_LINE	avoid casting if unnecessary. 
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
)	TokenNameRPAREN	
pq	TokenNameIdentifier	 pq
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
howMany	TokenNameIdentifier	 how Many
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
fillFields	TokenNameIdentifier	 fill Fields
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
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
howMany	TokenNameIdentifier	 how Many
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
FieldDoc	TokenNameIdentifier	 Field Doc
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
EMPTY_SCOREDOCS	TokenNameIdentifier	 EMPTY  SCOREDOCS
;	TokenNameSEMICOLON	
// Set maxScore to NaN, in case this is a maxScore tracking collector. 	TokenNameCOMMENT_LINE	Set maxScore to NaN, in case this is a maxScore tracking collector. 
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If this is a maxScoring tracking collector and there were no results, 	TokenNameCOMMENT_LINE	If this is a maxScoring tracking collector and there were no results, 
return	TokenNamereturn	
new	TokenNamenew	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
(	TokenNameLPAREN	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
)	TokenNameRPAREN	
pq	TokenNameIdentifier	 pq
)	TokenNameRPAREN	
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxScore	TokenNameIdentifier	 max Score
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
