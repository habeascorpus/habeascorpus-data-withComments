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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
;	TokenNameSEMICOLON	
/* See the description in BooleanScorer.java, comparing * BooleanScorer & BooleanScorer2 */	TokenNameCOMMENT_BLOCK	 See the description in BooleanScorer.java, comparing BooleanScorer & BooleanScorer2 
/** An alternative to BooleanScorer that also allows a minimum number * of optional scorers that should match. * <br>Implements skipTo(), and has no limitations on the numbers of added scorers. * <br>Uses ConjunctionScorer, DisjunctionScorer, ReqOptScorer and ReqExclScorer. */	TokenNameCOMMENT_JAVADOC	 An alternative to BooleanScorer that also allows a minimum number of optional scorers that should match. <br>Implements skipTo(), and has no limitations on the numbers of added scorers. <br>Uses ConjunctionScorer, DisjunctionScorer, ReqOptScorer and ReqExclScorer. 
class	TokenNameclass	
BooleanScorer2	TokenNameIdentifier	 Boolean Scorer2
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
requiredScorers	TokenNameIdentifier	 required Scorers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
optionalScorers	TokenNameIdentifier	 optional Scorers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
Coordinator	TokenNameIdentifier	 Coordinator
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coordFactors	TokenNameIdentifier	 coord Factors
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxCoord	TokenNameIdentifier	 max Coord
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// to be increased for each non prohibited scorer 	TokenNameCOMMENT_LINE	to be increased for each non prohibited scorer 
int	TokenNameint	
nrMatchers	TokenNameIdentifier	 nr Matchers
;	TokenNameSEMICOLON	
// to be increased by score() of match counting scorers. 	TokenNameCOMMENT_LINE	to be increased by score() of match counting scorers. 
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use after all scorers have been added. 	TokenNameCOMMENT_LINE	use after all scorers have been added. 
coordFactors	TokenNameIdentifier	 coord Factors
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
requiredScorers	TokenNameIdentifier	 required Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
coordFactors	TokenNameIdentifier	 coord Factors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coordFactors	TokenNameIdentifier	 coord Factors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
disableCoord	TokenNameIdentifier	 disable Coord
?	TokenNameQUESTION	
1.0f	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
maxCoord	TokenNameIdentifier	 max Coord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Coordinator	TokenNameIdentifier	 Coordinator
coordinator	TokenNameIdentifier	 coordinator
;	TokenNameSEMICOLON	
/** The scorer to which all scoring will be delegated, * except for computing and using the coordination factor. */	TokenNameCOMMENT_JAVADOC	 The scorer to which all scoring will be delegated, except for computing and using the coordination factor. 
private	TokenNameprivate	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
;	TokenNameSEMICOLON	
/** The number of optionalScorers that need to match (if there are any) */	TokenNameCOMMENT_JAVADOC	 The number of optionalScorers that need to match (if there are any) 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates a {@link Scorer} with the given similarity and lists of required, * prohibited and optional scorers. In no required scorers are added, at least * one of the optional scorers will have to match during the search. * * @param weight * The BooleanWeight to be used. * @param disableCoord * If this parameter is true, coordination level matching * ({@link Similarity#coord(int, int)}) is not used. * @param minNrShouldMatch * The minimum number of optional added scorers that should match * during the search. In case no required scorers are added, at least * one of the optional scorers will have to match during the search. * @param required * the list of required scorers. * @param prohibited * the list of prohibited scorers. * @param optional * the list of optional scorers. */	TokenNameCOMMENT_JAVADOC	 Creates a {@link Scorer} with the given similarity and lists of required, prohibited and optional scorers. In no required scorers are added, at least one of the optional scorers will have to match during the search. * @param weight The BooleanWeight to be used. @param disableCoord If this parameter is true, coordination level matching ({@link Similarity#coord(int, int)}) is not used. @param minNrShouldMatch The minimum number of optional added scorers that should match during the search. In case no required scorers are added, at least one of the optional scorers will have to match during the search. @param required the list of required scorers. @param prohibited the list of prohibited scorers. @param optional the list of optional scorers. 
public	TokenNamepublic	
BooleanScorer2	TokenNameIdentifier	 Boolean Scorer2
(	TokenNameLPAREN	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
int	TokenNameint	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
optional	TokenNameIdentifier	 optional
,	TokenNameCOMMA	
int	TokenNameint	
maxCoord	TokenNameIdentifier	 max Coord
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Minimum number of optional scorers should not be negative"	TokenNameStringLiteral	Minimum number of optional scorers should not be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
coordinator	TokenNameIdentifier	 coordinator
=	TokenNameEQUAL	
new	TokenNamenew	
Coordinator	TokenNameIdentifier	 Coordinator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
=	TokenNameEQUAL	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
;	TokenNameSEMICOLON	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
maxCoord	TokenNameIdentifier	 max Coord
=	TokenNameEQUAL	
maxCoord	TokenNameIdentifier	 max Coord
;	TokenNameSEMICOLON	
optionalScorers	TokenNameIdentifier	 optional Scorers
=	TokenNameEQUAL	
optional	TokenNameIdentifier	 optional
;	TokenNameSEMICOLON	
requiredScorers	TokenNameIdentifier	 required Scorers
=	TokenNameEQUAL	
required	TokenNameIdentifier	 required
;	TokenNameSEMICOLON	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
=	TokenNameEQUAL	
prohibited	TokenNameIdentifier	 prohibited
;	TokenNameSEMICOLON	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
disableCoord	TokenNameIdentifier	 disable Coord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
=	TokenNameEQUAL	
makeCountingSumScorer	TokenNameIdentifier	 make Counting Sum Scorer
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Count a scorer as a single match. */	TokenNameCOMMENT_JAVADOC	 Count a scorer as a single match. 
private	TokenNameprivate	
class	TokenNameclass	
SingleMatchScorer	TokenNameIdentifier	 Single Match Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Save the score of lastScoredDoc, so that we don't compute it more than 	TokenNameCOMMENT_LINE	Save the score of lastScoredDoc, so that we don't compute it more than 
// once in score(). 	TokenNameCOMMENT_LINE	once in score(). 
private	TokenNameprivate	
float	TokenNamefloat	
lastDocScore	TokenNameIdentifier	 last Doc Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
SingleMatchScorer	TokenNameIdentifier	 Single Match Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
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
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>=	TokenNameGREATER_EQUAL	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastDocScore	TokenNameIdentifier	 last Doc Score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
nrMatchers	TokenNameIdentifier	 nr Matchers
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastDocScore	TokenNameIdentifier	 last Doc Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
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
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
countingDisjunctionSumScorer	TokenNameIdentifier	 counting Disjunction Sum Scorer
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
scorers	TokenNameIdentifier	 scorers
,	TokenNameCOMMA	
int	TokenNameint	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// each scorer from the list counted as a single matcher 	TokenNameCOMMENT_LINE	each scorer from the list counted as a single matcher 
return	TokenNamereturn	
new	TokenNamenew	
DisjunctionSumScorer	TokenNameIdentifier	 Disjunction Sum Scorer
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
scorers	TokenNameIdentifier	 scorers
,	TokenNameCOMMA	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Save the score of lastScoredDoc, so that we don't compute it more than 	TokenNameCOMMENT_LINE	Save the score of lastScoredDoc, so that we don't compute it more than 
// once in score(). 	TokenNameCOMMENT_LINE	once in score(). 
private	TokenNameprivate	
float	TokenNamefloat	
lastDocScore	TokenNameIdentifier	 last Doc Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
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
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>=	TokenNameGREATER_EQUAL	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastDocScore	TokenNameIdentifier	 last Doc Score
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
nrMatchers	TokenNameIdentifier	 nr Matchers
+=	TokenNamePLUS_EQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
nrMatchers	TokenNameIdentifier	 nr Matchers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastDocScore	TokenNameIdentifier	 last Doc Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
countingConjunctionSumScorer	TokenNameIdentifier	 counting Conjunction Sum Scorer
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
requiredScorers	TokenNameIdentifier	 required Scorers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// each scorer from the list counted as a single matcher 	TokenNameCOMMENT_LINE	each scorer from the list counted as a single matcher 
final	TokenNamefinal	
int	TokenNameint	
requiredNrMatchers	TokenNameIdentifier	 required Nr Matchers
=	TokenNameEQUAL	
requiredScorers	TokenNameIdentifier	 required Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ConjunctionScorer	TokenNameIdentifier	 Conjunction Scorer
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
requiredScorers	TokenNameIdentifier	 required Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Save the score of lastScoredDoc, so that we don't compute it more than 	TokenNameCOMMENT_LINE	Save the score of lastScoredDoc, so that we don't compute it more than 
// once in score(). 	TokenNameCOMMENT_LINE	once in score(). 
private	TokenNameprivate	
float	TokenNamefloat	
lastDocScore	TokenNameIdentifier	 last Doc Score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
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
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>=	TokenNameGREATER_EQUAL	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastDocScore	TokenNameIdentifier	 last Doc Score
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastScoredDoc	TokenNameIdentifier	 last Scored Doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
nrMatchers	TokenNameIdentifier	 nr Matchers
+=	TokenNamePLUS_EQUAL	
requiredNrMatchers	TokenNameIdentifier	 required Nr Matchers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// All scorers match, so defaultSimilarity super.score() always has 1 as 	TokenNameCOMMENT_LINE	All scorers match, so defaultSimilarity super.score() always has 1 as 
// the coordination factor. 	TokenNameCOMMENT_LINE	the coordination factor. 
// Therefore the sum of the scores of the requiredScorers 	TokenNameCOMMENT_LINE	Therefore the sum of the scores of the requiredScorers 
// is used as score. 	TokenNameCOMMENT_LINE	is used as score. 
return	TokenNamereturn	
lastDocScore	TokenNameIdentifier	 last Doc Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
dualConjunctionSumScorer	TokenNameIdentifier	 dual Conjunction Sum Scorer
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
req1	TokenNameIdentifier	 req1
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
req2	TokenNameIdentifier	 req2
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// non counting. 	TokenNameCOMMENT_LINE	non counting. 
return	TokenNamereturn	
new	TokenNamenew	
ConjunctionScorer	TokenNameIdentifier	 Conjunction Scorer
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
req1	TokenNameIdentifier	 req1
,	TokenNameCOMMA	
req2	TokenNameIdentifier	 req2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// All scorers match, so defaultSimilarity always has 1 as 	TokenNameCOMMENT_LINE	All scorers match, so defaultSimilarity always has 1 as 
// the coordination factor. 	TokenNameCOMMENT_LINE	the coordination factor. 
// Therefore the sum of the scores of two scorers 	TokenNameCOMMENT_LINE	Therefore the sum of the scores of two scorers 
// is used as score. 	TokenNameCOMMENT_LINE	is used as score. 
}	TokenNameRBRACE	
/** Returns the scorer to be used for match counting and score summing. * Uses requiredScorers, optionalScorers and prohibitedScorers. */	TokenNameCOMMENT_JAVADOC	 Returns the scorer to be used for match counting and score summing. Uses requiredScorers, optionalScorers and prohibitedScorers. 
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
makeCountingSumScorer	TokenNameIdentifier	 make Counting Sum Scorer
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// each scorer counted as a single matcher 	TokenNameCOMMENT_LINE	each scorer counted as a single matcher 
return	TokenNamereturn	
(	TokenNameLPAREN	
requiredScorers	TokenNameIdentifier	 required Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
makeCountingSumScorerNoReq	TokenNameIdentifier	 make Counting Sum Scorer No Req
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
:	TokenNameCOLON	
makeCountingSumScorerSomeReq	TokenNameIdentifier	 make Counting Sum Scorer Some Req
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
makeCountingSumScorerNoReq	TokenNameIdentifier	 make Counting Sum Scorer No Req
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// No required scorers 	TokenNameCOMMENT_LINE	No required scorers 
// minNrShouldMatch optional scorers are required, but at least 1 	TokenNameCOMMENT_LINE	minNrShouldMatch optional scorers are required, but at least 1 
int	TokenNameint	
nrOptRequired	TokenNameIdentifier	 nr Opt Required
=	TokenNameEQUAL	
(	TokenNameLPAREN	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
nrOptRequired	TokenNameIdentifier	 nr Opt Required
)	TokenNameRPAREN	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
=	TokenNameEQUAL	
countingDisjunctionSumScorer	TokenNameIdentifier	 counting Disjunction Sum Scorer
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
,	TokenNameCOMMA	
nrOptRequired	TokenNameIdentifier	 nr Opt Required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
=	TokenNameEQUAL	
new	TokenNamenew	
SingleMatchScorer	TokenNameIdentifier	 Single Match Scorer
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
=	TokenNameEQUAL	
countingConjunctionSumScorer	TokenNameIdentifier	 counting Conjunction Sum Scorer
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
optionalScorers	TokenNameIdentifier	 optional Scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
addProhibitedScorers	TokenNameIdentifier	 add Prohibited Scorers
(	TokenNameLPAREN	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
makeCountingSumScorerSomeReq	TokenNameIdentifier	 make Counting Sum Scorer Some Req
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// At least one required scorer. 	TokenNameCOMMENT_LINE	At least one required scorer. 
if	TokenNameif	
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// all optional scorers also required. 	TokenNameCOMMENT_LINE	all optional scorers also required. 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
allReq	TokenNameIdentifier	 all Req
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
(	TokenNameLPAREN	
requiredScorers	TokenNameIdentifier	 required Scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
allReq	TokenNameIdentifier	 all Req
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
addProhibitedScorers	TokenNameIdentifier	 add Prohibited Scorers
(	TokenNameLPAREN	
countingConjunctionSumScorer	TokenNameIdentifier	 counting Conjunction Sum Scorer
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
allReq	TokenNameIdentifier	 all Req
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// optionalScorers.size() > minNrShouldMatch, and at least one required scorer 	TokenNameCOMMENT_LINE	optionalScorers.size() > minNrShouldMatch, and at least one required scorer 
Scorer	TokenNameIdentifier	 Scorer
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
=	TokenNameEQUAL	
requiredScorers	TokenNameIdentifier	 required Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
SingleMatchScorer	TokenNameIdentifier	 Single Match Scorer
(	TokenNameLPAREN	
requiredScorers	TokenNameIdentifier	 required Scorers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
countingConjunctionSumScorer	TokenNameIdentifier	 counting Conjunction Sum Scorer
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
requiredScorers	TokenNameIdentifier	 required Scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use a required disjunction scorer over the optional scorers 	TokenNameCOMMENT_LINE	use a required disjunction scorer over the optional scorers 
return	TokenNamereturn	
addProhibitedScorers	TokenNameIdentifier	 add Prohibited Scorers
(	TokenNameLPAREN	
dualConjunctionSumScorer	TokenNameIdentifier	 dual Conjunction Sum Scorer
(	TokenNameLPAREN	
// non counting 	TokenNameCOMMENT_LINE	non counting 
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
,	TokenNameCOMMA	
countingDisjunctionSumScorer	TokenNameIdentifier	 counting Disjunction Sum Scorer
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
,	TokenNameCOMMA	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// minNrShouldMatch == 0 	TokenNameCOMMENT_LINE	minNrShouldMatch == 0 
return	TokenNamereturn	
new	TokenNamenew	
ReqOptSumScorer	TokenNameIdentifier	 Req Opt Sum Scorer
(	TokenNameLPAREN	
addProhibitedScorers	TokenNameIdentifier	 add Prohibited Scorers
(	TokenNameLPAREN	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
SingleMatchScorer	TokenNameIdentifier	 Single Match Scorer
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// require 1 in combined, optional scorer. 	TokenNameCOMMENT_LINE	require 1 in combined, optional scorer. 
:	TokenNameCOLON	
countingDisjunctionSumScorer	TokenNameIdentifier	 counting Disjunction Sum Scorer
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the scorer to be used for match counting and score summing. * Uses the given required scorer and the prohibitedScorers. * @param requiredCountingSumScorer A required scorer already built. */	TokenNameCOMMENT_JAVADOC	 Returns the scorer to be used for match counting and score summing. Uses the given required scorer and the prohibitedScorers. @param requiredCountingSumScorer A required scorer already built. 
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
addProhibitedScorers	TokenNameIdentifier	 add Prohibited Scorers
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
// no prohibited 	TokenNameCOMMENT_LINE	no prohibited 
:	TokenNameCOLON	
new	TokenNamenew	
ReqExclScorer	TokenNameIdentifier	 Req Excl Scorer
(	TokenNameLPAREN	
requiredCountingSumScorer	TokenNameIdentifier	 required Counting Sum Scorer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
DisjunctionSumScorer	TokenNameIdentifier	 Disjunction Sum Scorer
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Scores and collects all matching documents. * @param collector The collector to which all matching documents are passed through. */	TokenNameCOMMENT_JAVADOC	 Scores and collects all matching documents. @param collector The collector to which all matching documents are passed through. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
int	TokenNameint	
firstDocID	TokenNameIdentifier	 first Doc ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
firstDocID	TokenNameIdentifier	 first Doc ID
;	TokenNameSEMICOLON	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
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
doc	TokenNameIdentifier	 doc
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
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
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
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
nrMatchers	TokenNameIdentifier	 nr Matchers
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
*	TokenNameMULTIPLY	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
coordFactors	TokenNameIdentifier	 coord Factors
[	TokenNameLBRACKET	
coordinator	TokenNameIdentifier	 coordinator
.	TokenNameDOT	
nrMatchers	TokenNameIdentifier	 nr Matchers
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
countingSumScorer	TokenNameIdentifier	 counting Sum Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
relationship	TokenNameIdentifier	 relationship
,	TokenNameCOMMA	
ScorerVisitor	TokenNameIdentifier	 Scorer Visitor
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
relationship	TokenNameIdentifier	 relationship
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
optionalScorers	TokenNameIdentifier	 optional Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
requiredScorers	TokenNameIdentifier	 required Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
