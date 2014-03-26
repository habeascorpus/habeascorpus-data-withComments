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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** A Scorer for OR like queries, counterpart of <code>ConjunctionScorer</code>. * This Scorer implements {@link Scorer#skipTo(int)} and uses skipTo() on the given Scorers. */	TokenNameCOMMENT_JAVADOC	 A Scorer for OR like queries, counterpart of <code>ConjunctionScorer</code>. This Scorer implements {@link Scorer#skipTo(int)} and uses skipTo() on the given Scorers. 
class	TokenNameclass	
DisjunctionSumScorer	TokenNameIdentifier	 Disjunction Sum Scorer
extends	TokenNameextends	
DisjunctionScorer	TokenNameIdentifier	 Disjunction Scorer
{	TokenNameLBRACE	
/** The minimum number of scorers that should match. */	TokenNameCOMMENT_JAVADOC	 The minimum number of scorers that should match. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
;	TokenNameSEMICOLON	
/** The document number of the current match. */	TokenNameCOMMENT_JAVADOC	 The document number of the current match. 
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The number of subscorers that provide the current match. */	TokenNameCOMMENT_JAVADOC	 The number of subscorers that provide the current match. 
protected	TokenNameprotected	
int	TokenNameint	
nrMatchers	TokenNameIdentifier	 nr Matchers
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
/** Construct a <code>DisjunctionScorer</code>. * @param weight The weight to be used. * @param subScorers A collection of at least two subscorers. * @param minimumNrMatchers The positive minimum number of subscorers that should * match to match this query. * <br>When <code>minimumNrMatchers</code> is bigger than * the number of <code>subScorers</code>, * no matches will be produced. * <br>When minimumNrMatchers equals the number of subScorers, * it more efficient to use <code>ConjunctionScorer</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a <code>DisjunctionScorer</code>. @param weight The weight to be used. @param subScorers A collection of at least two subscorers. @param minimumNrMatchers The positive minimum number of subscorers that should match to match this query. <br>When <code>minimumNrMatchers</code> is bigger than the number of <code>subScorers</code>, no matches will be produced. <br>When minimumNrMatchers equals the number of subScorers, it more efficient to use <code>ConjunctionScorer</code>. 
public	TokenNamepublic	
DisjunctionSumScorer	TokenNameIdentifier	 Disjunction Sum Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
subScorers	TokenNameIdentifier	 sub Scorers
,	TokenNameCOMMA	
int	TokenNameint	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Minimum nr of matchers must be positive"	TokenNameStringLiteral	Minimum nr of matchers must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"There must be at least 2 subScorers"	TokenNameStringLiteral	There must be at least 2 subScorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
=	TokenNameEQUAL	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a <code>DisjunctionScorer</code>, using one as the minimum number * of matching subscorers. */	TokenNameCOMMENT_JAVADOC	 Construct a <code>DisjunctionScorer</code>, using one as the minimum number of matching subscorers. 
public	TokenNamepublic	
DisjunctionSumScorer	TokenNameIdentifier	 Disjunction Sum Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
subScorers	TokenNameIdentifier	 sub Scorers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
subScorers	TokenNameIdentifier	 sub Scorers
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
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
assert	TokenNameassert	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapAdjust	TokenNameIdentifier	 heap Adjust
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
heapRemoveRoot	TokenNameIdentifier	 heap Remove Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
<	TokenNameLESS	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
afterNext	TokenNameIdentifier	 after Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nrMatchers	TokenNameIdentifier	 nr Matchers
>=	TokenNameGREATER_EQUAL	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
afterNext	TokenNameIdentifier	 after Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nrMatchers	TokenNameIdentifier	 nr Matchers
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// stop looping 	TokenNameCOMMENT_LINE	stop looping 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nrMatchers	TokenNameIdentifier	 nr Matchers
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
countMatches	TokenNameIdentifier	 count Matches
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countMatches	TokenNameIdentifier	 count Matches
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: this currently scores, but so did the previous impl 	TokenNameCOMMENT_LINE	TODO: this currently scores, but so did the previous impl 
// TODO: remove recursion. 	TokenNameCOMMENT_LINE	TODO: remove recursion. 
// TODO: if we separate scoring, out of here, modify this 	TokenNameCOMMENT_LINE	TODO: if we separate scoring, out of here, modify this 
// and afterNext() to terminate when nrMatchers == minimumNrMatchers 	TokenNameCOMMENT_LINE	and afterNext() to terminate when nrMatchers == minimumNrMatchers 
// then also change freq() to just always compute it from scratch 	TokenNameCOMMENT_LINE	then also change freq() to just always compute it from scratch 
private	TokenNameprivate	
void	TokenNamevoid	
countMatches	TokenNameIdentifier	 count Matches
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
<	TokenNameLESS	
numScorers	TokenNameIdentifier	 num Scorers
&&	TokenNameAND_AND	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
root	TokenNameIdentifier	 root
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nrMatchers	TokenNameIdentifier	 nr Matchers
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
root	TokenNameIdentifier	 root
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countMatches	TokenNameIdentifier	 count Matches
(	TokenNameLPAREN	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countMatches	TokenNameIdentifier	 count Matches
(	TokenNameLPAREN	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the score of the current document matching the query. * Initially invalid, until {@link #nextDoc()} is called the first time. */	TokenNameCOMMENT_JAVADOC	 Returns the score of the current document matching the query. Initially invalid, until {@link #nextDoc()} is called the first time. 
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
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
score	TokenNameIdentifier	 score
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
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
nrMatchers	TokenNameIdentifier	 nr Matchers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Advances to the first match beyond the current whose document number is * greater than or equal to a given target. <br> * The implementation uses the advance() method on the subscorers. * * @param target * The target document number. * @return the document whose number is greater than or equal to the given * target, or -1 if none exist. */	TokenNameCOMMENT_JAVADOC	 Advances to the first match beyond the current whose document number is greater than or equal to a given target. <br> The implementation uses the advance() method on the subscorers. * @param target The target document number. @return the document whose number is greater than or equal to the given target, or -1 if none exist. 
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
if	TokenNameif	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapAdjust	TokenNameIdentifier	 heap Adjust
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
heapRemoveRoot	TokenNameIdentifier	 heap Remove Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
afterNext	TokenNameIdentifier	 after Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nrMatchers	TokenNameIdentifier	 nr Matchers
>=	TokenNameGREATER_EQUAL	
minimumNrMatchers	TokenNameIdentifier	 minimum Nr Matchers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
