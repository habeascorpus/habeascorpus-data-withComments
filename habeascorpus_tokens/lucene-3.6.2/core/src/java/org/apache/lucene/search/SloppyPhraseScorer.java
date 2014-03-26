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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
SloppyPhraseScorer	TokenNameIdentifier	 Sloppy Phrase Scorer
extends	TokenNameextends	
PhraseScorer	TokenNameIdentifier	 Phrase Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PhraseQueue	TokenNameIdentifier	 Phrase Queue
pq	TokenNameIdentifier	 pq
;	TokenNameSEMICOLON	
// for advancing min position 	TokenNameCOMMENT_LINE	for advancing min position 
private	TokenNameprivate	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
// current largest phrase position 	TokenNameCOMMENT_LINE	current largest phrase position 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasRpts	TokenNameIdentifier	 has Rpts
;	TokenNameSEMICOLON	
// flag indicating that there are repetitions (as checked in first candidate doc) 	TokenNameCOMMENT_LINE	flag indicating that there are repetitions (as checked in first candidate doc) 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkedRpts	TokenNameIdentifier	 checked Rpts
;	TokenNameSEMICOLON	
// flag to only check for repetitions in first candidate doc 	TokenNameCOMMENT_LINE	flag to only check for repetitions in first candidate doc 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasMultiTermRpts	TokenNameIdentifier	 has Multi Term Rpts
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rptGroups	TokenNameIdentifier	 rpt Groups
;	TokenNameSEMICOLON	
// in each group are PPs that repeats each other (i.e. same term), sorted by (query) offset 	TokenNameCOMMENT_LINE	in each group are PPs that repeats each other (i.e. same term), sorted by (query) offset 
private	TokenNameprivate	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rptStack	TokenNameIdentifier	 rpt Stack
;	TokenNameSEMICOLON	
// temporary stack for switching colliding repeating pps 	TokenNameCOMMENT_LINE	temporary stack for switching colliding repeating pps 
SloppyPhraseScorer	TokenNameIdentifier	 Sloppy Phrase Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
PhraseQuery	TokenNameIdentifier	 Phrase Query
.	TokenNameDOT	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postings	TokenNameIdentifier	 postings
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
norms	TokenNameIdentifier	 norms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQueue	TokenNameIdentifier	 Phrase Queue
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Score a candidate doc for all slop-valid position-combinations (matches) * encountered while traversing/hopping the PhrasePositions. * <br> The score contribution of a match depends on the distance: * <br> - highest score for distance=0 (exact match). * <br> - score gets lower as distance gets higher. * <br>Example: for query "a b"~2, a document "x a b a y" can be scored twice: * once for "a b" (distance=0), and once for "b a" (distance=2). * <br>Possibly not all valid combinations are encountered, because for efficiency * we always propagate the least PhrasePosition. This allows to base on * PriorityQueue and move forward faster. * As result, for example, document "a b c b a" * would score differently for queries "a b c"~4 and "c b a"~4, although * they really are equivalent. * Similarly, for doc "a b c b a f g", query "c b"~2 * would get same score as "g f"~2, although "c b"~2 could be matched twice. * We may want to fix this in the future (currently not, for performance reasons). */	TokenNameCOMMENT_JAVADOC	 Score a candidate doc for all slop-valid position-combinations (matches) encountered while traversing/hopping the PhrasePositions. <br> The score contribution of a match depends on the distance: <br> - highest score for distance=0 (exact match). <br> - score gets lower as distance gets higher. <br>Example: for query "a b"~2, a document "x a b a y" can be scored twice: once for "a b" (distance=0), and once for "b a" (distance=2). <br>Possibly not all valid combinations are encountered, because for efficiency we always propagate the least PhrasePosition. This allows to base on PriorityQueue and move forward faster. As result, for example, document "a b c b a" would score differently for queries "a b c"~4 and "c b a"~4, although they really are equivalent. Similarly, for doc "a b c b a f g", query "c b"~2 would get same score as "g f"~2, although "c b"~2 could be matched twice. We may want to fix this in the future (currently not, for performance reasons). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
float	TokenNamefloat	
phraseFreq	TokenNameIdentifier	 phrase Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initPhrasePositions	TokenNameIdentifier	 init Phrase Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
matchLength	TokenNameIdentifier	 match Length
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
advancePP	TokenNameIdentifier	 advance PP
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasRpts	TokenNameIdentifier	 has Rpts
&&	TokenNameAND_AND	
!	TokenNameNOT	
advanceRpts	TokenNameIdentifier	 advance Rpts
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// pps exhausted 	TokenNameCOMMENT_LINE	pps exhausted 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// done minimizing current match-length 	TokenNameCOMMENT_LINE	done minimizing current match-length 
if	TokenNameif	
(	TokenNameLPAREN	
matchLength	TokenNameIdentifier	 match Length
<=	TokenNameLESS_EQUAL	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freq	TokenNameIdentifier	 freq
+=	TokenNamePLUS_EQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sloppyFreq	TokenNameIdentifier	 sloppy Freq
(	TokenNameLPAREN	
matchLength	TokenNameIdentifier	 match Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// score match 	TokenNameCOMMENT_LINE	score match 
}	TokenNameRBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
matchLength	TokenNameIdentifier	 match Length
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
matchLength2	TokenNameIdentifier	 match Length2
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchLength2	TokenNameIdentifier	 match Length2
<	TokenNameLESS	
matchLength	TokenNameIdentifier	 match Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchLength	TokenNameIdentifier	 match Length
=	TokenNameEQUAL	
matchLength2	TokenNameIdentifier	 match Length2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchLength	TokenNameIdentifier	 match Length
<=	TokenNameLESS_EQUAL	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freq	TokenNameIdentifier	 freq
+=	TokenNamePLUS_EQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sloppyFreq	TokenNameIdentifier	 sloppy Freq
(	TokenNameLPAREN	
matchLength	TokenNameIdentifier	 match Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// score match 	TokenNameCOMMENT_LINE	score match 
}	TokenNameRBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** advance a PhrasePosition and update 'end', return false if exhausted */	TokenNameCOMMENT_JAVADOC	 advance a PhrasePosition and update 'end', return false if exhausted 
private	TokenNameprivate	
boolean	TokenNameboolean	
advancePP	TokenNameIdentifier	 advance PP
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** pp was just advanced. If that caused a repeater collision, resolve by advancing the lesser * of the two colliding pps. Note that there can only be one collision, as by the initialization * there were no collisions before pp was advanced. */	TokenNameCOMMENT_JAVADOC	 pp was just advanced. If that caused a repeater collision, resolve by advancing the lesser of the two colliding pps. Note that there can only be one collision, as by the initialization there were no collisions before pp was advanced. 
private	TokenNameprivate	
boolean	TokenNameboolean	
advanceRpts	TokenNameIdentifier	 advance Rpts
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// not a repeater 	TokenNameCOMMENT_LINE	not a repeater 
}	TokenNameRBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rg	TokenNameIdentifier	 rg
=	TokenNameEQUAL	
rptGroups	TokenNameIdentifier	 rpt Groups
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
rg	TokenNameIdentifier	 rg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for re-queuing after collisions are resolved 	TokenNameCOMMENT_LINE	for re-queuing after collisions are resolved 
int	TokenNameint	
k0	TokenNameIdentifier	 k0
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptInd	TokenNameIdentifier	 rpt Ind
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
collide	TokenNameIdentifier	 collide
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
lesser	TokenNameIdentifier	 lesser
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
,	TokenNameCOMMA	
rg	TokenNameIdentifier	 rg
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// always advance the lesser of the (only) two colliding pps 	TokenNameCOMMENT_LINE	always advance the lesser of the (only) two colliding pps 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
advancePP	TokenNameIdentifier	 advance PP
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// exhausted 	TokenNameCOMMENT_LINE	exhausted 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
!=	TokenNameNOT_EQUAL	
k0	TokenNameIdentifier	 k0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// careful: mark only those currently in the queue 	TokenNameCOMMENT_LINE	careful: mark only those currently in the queue 
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// mark that pp2 need to be re-queued 	TokenNameCOMMENT_LINE	mark that pp2 need to be re-queued 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// collisions resolved, now re-queue 	TokenNameCOMMENT_LINE	collisions resolved, now re-queue 
// empty (partially) the queue until seeing all pps advanced for resolving collisions 	TokenNameCOMMENT_LINE	empty (partially) the queue until seeing all pps advanced for resolving collisions 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rptStack	TokenNameIdentifier	 rpt Stack
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pp2	TokenNameIdentifier	 pp2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptInd	TokenNameIdentifier	 rpt Ind
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptInd	TokenNameIdentifier	 rpt Ind
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// add back to queue 	TokenNameCOMMENT_LINE	add back to queue 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
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
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rptStack	TokenNameIdentifier	 rpt Stack
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** compare two pps, but only by position and offset */	TokenNameCOMMENT_JAVADOC	 compare two pps, but only by position and offset 
private	TokenNameprivate	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
lesser	TokenNameIdentifier	 lesser
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
,	TokenNameCOMMA	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
position	TokenNameIdentifier	 position
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
position	TokenNameIdentifier	 position
&&	TokenNameAND_AND	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pp2	TokenNameIdentifier	 pp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** index of a pp2 colliding with pp, or -1 if none */	TokenNameCOMMENT_JAVADOC	 index of a pp2 colliding with pp, or -1 if none 
private	TokenNameprivate	
int	TokenNameint	
collide	TokenNameIdentifier	 collide
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tpPos	TokenNameIdentifier	 tp Pos
=	TokenNameEQUAL	
tpPos	TokenNameIdentifier	 tp Pos
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rg	TokenNameIdentifier	 rg
=	TokenNameEQUAL	
rptGroups	TokenNameIdentifier	 rpt Groups
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
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
rg	TokenNameIdentifier	 rg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
=	TokenNameEQUAL	
rg	TokenNameIdentifier	 rg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
!=	TokenNameNOT_EQUAL	
pp	TokenNameIdentifier	 pp
&&	TokenNameAND_AND	
tpPos	TokenNameIdentifier	 tp Pos
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
tpPos	TokenNameIdentifier	 tp Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptInd	TokenNameIdentifier	 rpt Ind
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize PhrasePositions in place. * A one time initialization for this scorer (on first doc matching all terms): * <ul> * <li>Check if there are repetitions * <li>If there are, find groups of repetitions. * </ul> * Examples: * <ol> * <li>no repetitions: <b>"ho my"~2</b> * <li>repetitions: <b>"ho my my"~2</b> * <li>repetitions: <b>"my ho my"~2</b> * </ol> * @return false if PPs are exhausted (and so current doc will not be a match) */	TokenNameCOMMENT_JAVADOC	 Initialize PhrasePositions in place. A one time initialization for this scorer (on first doc matching all terms): <ul> <li>Check if there are repetitions <li>If there are, find groups of repetitions. </ul> Examples: <ol> <li>no repetitions: <b>"ho my"~2</b> <li>repetitions: <b>"ho my my"~2</b> <li>repetitions: <b>"my ho my"~2</b> </ol> @return false if PPs are exhausted (and so current doc will not be a match) 
private	TokenNameprivate	
boolean	TokenNameboolean	
initPhrasePositions	TokenNameIdentifier	 init Phrase Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkedRpts	TokenNameIdentifier	 checked Rpts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
initFirstTime	TokenNameIdentifier	 init First Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRpts	TokenNameIdentifier	 has Rpts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initSimple	TokenNameIdentifier	 init Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// PPs available 	TokenNameCOMMENT_LINE	PPs available 
}	TokenNameRBRACE	
return	TokenNamereturn	
initComplex	TokenNameIdentifier	 init Complex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** no repeats: simplest case, and most common. It is important to keep this piece of the code simple and efficient */	TokenNameCOMMENT_JAVADOC	 no repeats: simplest case, and most common. It is important to keep this piece of the code simple and efficient 
private	TokenNameprivate	
void	TokenNamevoid	
initSimple	TokenNameIdentifier	 init Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.err.println("initSimple: doc: "+min.doc); 	TokenNameCOMMENT_LINE	System.err.println("initSimple: doc: "+min.doc); 
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// position pps and build queue from list 	TokenNameCOMMENT_LINE	position pps and build queue from list 
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterate cyclic list: done once handled max 	TokenNameCOMMENT_LINE	iterate cyclic list: done once handled max 
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
firstPosition	TokenNameIdentifier	 first Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** with repeats: not so simple. */	TokenNameCOMMENT_JAVADOC	 with repeats: not so simple. 
private	TokenNameprivate	
boolean	TokenNameboolean	
initComplex	TokenNameIdentifier	 init Complex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.err.println("initComplex: doc: "+min.doc); 	TokenNameCOMMENT_LINE	System.err.println("initComplex: doc: "+min.doc); 
placeFirstPositions	TokenNameIdentifier	 place First Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
advanceRepeatGroups	TokenNameIdentifier	 advance Repeat Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// PPs exhausted 	TokenNameCOMMENT_LINE	PPs exhausted 
}	TokenNameRBRACE	
fillQueue	TokenNameIdentifier	 fill Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// PPs available 	TokenNameCOMMENT_LINE	PPs available 
}	TokenNameRBRACE	
/** move all PPs to their first position */	TokenNameCOMMENT_JAVADOC	 move all PPs to their first position 
private	TokenNameprivate	
void	TokenNamevoid	
placeFirstPositions	TokenNameIdentifier	 place First Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterate cyclic list: done once handled max 	TokenNameCOMMENT_LINE	iterate cyclic list: done once handled max 
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
firstPosition	TokenNameIdentifier	 first Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Fill the queue (all pps are already placed */	TokenNameCOMMENT_JAVADOC	 Fill the queue (all pps are already placed 
private	TokenNameprivate	
void	TokenNamevoid	
fillQueue	TokenNameIdentifier	 fill Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterate cyclic list: done once handled max 	TokenNameCOMMENT_LINE	iterate cyclic list: done once handled max 
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** At initialization (each doc), each repetition group is sorted by (query) offset. * This provides the start condition: no collisions. * <p>Case 1: no multi-term repeats<br> * It is sufficient to advance each pp in the group by one less than its group index. * So lesser pp is not advanced, 2nd one advance once, 3rd one advanced twice, etc. * <p>Case 2: multi-term repeats<br> * * @return false if PPs are exhausted. */	TokenNameCOMMENT_JAVADOC	 At initialization (each doc), each repetition group is sorted by (query) offset. This provides the start condition: no collisions. <p>Case 1: no multi-term repeats<br> It is sufficient to advance each pp in the group by one less than its group index. So lesser pp is not advanced, 2nd one advance once, 3rd one advanced twice, etc. <p>Case 2: multi-term repeats<br> * @return false if PPs are exhausted. 
private	TokenNameprivate	
boolean	TokenNameboolean	
advanceRepeatGroups	TokenNameIdentifier	 advance Repeat Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rg	TokenNameIdentifier	 rg
:	TokenNameCOLON	
rptGroups	TokenNameIdentifier	 rpt Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasMultiTermRpts	TokenNameIdentifier	 has Multi Term Rpts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// more involved, some may not collide 	TokenNameCOMMENT_LINE	more involved, some may not collide 
int	TokenNameint	
incr	TokenNameIdentifier	 incr
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
rg	TokenNameIdentifier	 rg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
incr	TokenNameIdentifier	 incr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incr	TokenNameIdentifier	 incr
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
rg	TokenNameIdentifier	 rg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
collide	TokenNameIdentifier	 collide
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
=	TokenNameEQUAL	
lesser	TokenNameIdentifier	 lesser
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
,	TokenNameCOMMA	
rg	TokenNameIdentifier	 rg
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
advancePP	TokenNameIdentifier	 advance PP
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// at initialization always advance pp with higher offset 	TokenNameCOMMENT_LINE	at initialization always advance pp with higher offset 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// exhausted 	TokenNameCOMMENT_LINE	exhausted 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptInd	TokenNameIdentifier	 rpt Ind
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen? 	TokenNameCOMMENT_LINE	should not happen? 
incr	TokenNameIdentifier	 incr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// simpler, we know exactly how much to advance 	TokenNameCOMMENT_LINE	simpler, we know exactly how much to advance 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
rg	TokenNameIdentifier	 rg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
rg	TokenNameIdentifier	 rg
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// PPs exhausted 	TokenNameCOMMENT_LINE	PPs exhausted 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// PPs available 	TokenNameCOMMENT_LINE	PPs available 
}	TokenNameRBRACE	
/** initialize with checking for repeats. Heavy work, but done only for the first candidate doc.<p> * If there are repetitions, check if multi-term postings (MTP) are involved.<p> * Without MTP, once PPs are placed in the first candidate doc, repeats (and groups) are visible.<br> * With MTP, a more complex check is needed, up-front, as there may be "hidden collisions".<br> * For example P1 has {A,B}, P1 has {B,C}, and the first doc is: "A C B". At start, P1 would point * to "A", p2 to "C", and it will not be identified that P1 and P2 are repetitions of each other.<p> * The more complex initialization has two parts:<br> * (1) identification of repetition groups.<br> * (2) advancing repeat groups at the start of the doc.<br> * For (1), a possible solution is to just create a single repetition group, * made of all repeating pps. But this would slow down the check for collisions, * as all pps would need to be checked. Instead, we compute "connected regions" * on the bipartite graph of postings and terms. */	TokenNameCOMMENT_JAVADOC	 initialize with checking for repeats. Heavy work, but done only for the first candidate doc.<p> If there are repetitions, check if multi-term postings (MTP) are involved.<p> Without MTP, once PPs are placed in the first candidate doc, repeats (and groups) are visible.<br> With MTP, a more complex check is needed, up-front, as there may be "hidden collisions".<br> For example P1 has {A,B}, P1 has {B,C}, and the first doc is: "A C B". At start, P1 would point to "A", p2 to "C", and it will not be identified that P1 and P2 are repetitions of each other.<p> The more complex initialization has two parts:<br> (1) identification of repetition groups.<br> (2) advancing repeat groups at the start of the doc.<br> For (1), a possible solution is to just create a single repetition group, made of all repeating pps. But this would slow down the check for collisions, as all pps would need to be checked. Instead, we compute "connected regions" on the bipartite graph of postings and terms. 
private	TokenNameprivate	
boolean	TokenNameboolean	
initFirstTime	TokenNameIdentifier	 init First Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.err.println("initFirstTime: doc: "+min.doc); 	TokenNameCOMMENT_LINE	System.err.println("initFirstTime: doc: "+min.doc); 
checkedRpts	TokenNameIdentifier	 checked Rpts
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
placeFirstPositions	TokenNameIdentifier	 place First Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
rptTerms	TokenNameIdentifier	 rpt Terms
=	TokenNameEQUAL	
repeatingTerms	TokenNameIdentifier	 repeating Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasRpts	TokenNameIdentifier	 has Rpts
=	TokenNameEQUAL	
!	TokenNameNOT	
rptTerms	TokenNameIdentifier	 rpt Terms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasRpts	TokenNameIdentifier	 has Rpts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rptStack	TokenNameIdentifier	 rpt Stack
=	TokenNameEQUAL	
new	TokenNamenew	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
numPostings	TokenNameIdentifier	 num Postings
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// needed with repetitions 	TokenNameCOMMENT_LINE	needed with repetitions 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
rgs	TokenNameIdentifier	 rgs
=	TokenNameEQUAL	
gatherRptGroups	TokenNameIdentifier	 gather Rpt Groups
(	TokenNameLPAREN	
rptTerms	TokenNameIdentifier	 rpt Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortRptGroups	TokenNameIdentifier	 sort Rpt Groups
(	TokenNameLPAREN	
rgs	TokenNameIdentifier	 rgs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
advanceRepeatGroups	TokenNameIdentifier	 advance Repeat Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// PPs exhausted 	TokenNameCOMMENT_LINE	PPs exhausted 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fillQueue	TokenNameIdentifier	 fill Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// PPs available 	TokenNameCOMMENT_LINE	PPs available 
}	TokenNameRBRACE	
/** sort each repetition group by (query) offset. * Done only once (at first doc) and allows to initialize faster for each doc. */	TokenNameCOMMENT_JAVADOC	 sort each repetition group by (query) offset. Done only once (at first doc) and allows to initialize faster for each doc. 
private	TokenNameprivate	
void	TokenNamevoid	
sortRptGroups	TokenNameIdentifier	 sort Rpt Groups
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
rgs	TokenNameIdentifier	 rgs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rptGroups	TokenNameIdentifier	 rpt Groups
=	TokenNameEQUAL	
new	TokenNamenew	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
rgs	TokenNameIdentifier	 rgs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
cmprtr	TokenNameIdentifier	 cmprtr
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp1	TokenNameIdentifier	 pp1
,	TokenNameCOMMA	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp1	TokenNameIdentifier	 pp1
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
rptGroups	TokenNameIdentifier	 rpt Groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rg	TokenNameIdentifier	 rg
=	TokenNameEQUAL	
rgs	TokenNameIdentifier	 rgs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
rg	TokenNameIdentifier	 rg
,	TokenNameCOMMA	
cmprtr	TokenNameIdentifier	 cmprtr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rptGroups	TokenNameIdentifier	 rpt Groups
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rg	TokenNameIdentifier	 rg
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
rg	TokenNameIdentifier	 rg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rg	TokenNameIdentifier	 rg
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
rptInd	TokenNameIdentifier	 rpt Ind
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// we use this index for efficient re-queuing 	TokenNameCOMMENT_LINE	we use this index for efficient re-queuing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Detect repetition groups. Done once - for first doc */	TokenNameCOMMENT_JAVADOC	 Detect repetition groups. Done once - for first doc 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
gatherRptGroups	TokenNameIdentifier	 gather Rpt Groups
(	TokenNameLPAREN	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
rptTerms	TokenNameIdentifier	 rpt Terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rpp	TokenNameIdentifier	 rpp
=	TokenNameEQUAL	
repeatingPPs	TokenNameIdentifier	 repeating P Ps
(	TokenNameLPAREN	
rptTerms	TokenNameIdentifier	 rpt Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasMultiTermRpts	TokenNameIdentifier	 has Multi Term Rpts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// simpler - no multi-terms - can base on positions in first doc 	TokenNameCOMMENT_LINE	simpler - no multi-terms - can base on positions in first doc 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
rpp	TokenNameIdentifier	 rpp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
rpp	TokenNameIdentifier	 rpp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// already marked as a repetition 	TokenNameCOMMENT_LINE	already marked as a repetition 
int	TokenNameint	
tpPos	TokenNameIdentifier	 tp Pos
=	TokenNameEQUAL	
tpPos	TokenNameIdentifier	 tp Pos
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
rpp	TokenNameIdentifier	 rpp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp2	TokenNameIdentifier	 pp2
=	TokenNameEQUAL	
rpp	TokenNameIdentifier	 rpp
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
// already marked as a repetition 	TokenNameCOMMENT_LINE	already marked as a repetition 
||	TokenNameOR_OR	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
// not a repetition: two PPs are originally in same offset in the query! 	TokenNameCOMMENT_LINE	not a repetition: two PPs are originally in same offset in the query! 
||	TokenNameOR_OR	
tpPos	TokenNameIdentifier	 tp Pos
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
tpPos	TokenNameIdentifier	 tp Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not a repetition 	TokenNameCOMMENT_LINE	not a repetition 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// a repetition 	TokenNameCOMMENT_LINE	a repetition 
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
rl	TokenNameIdentifier	 rl
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rl	TokenNameIdentifier	 rl
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rl	TokenNameIdentifier	 rl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pp2	TokenNameIdentifier	 pp2
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp2	TokenNameIdentifier	 pp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// more involved - has multi-terms 	TokenNameCOMMENT_LINE	more involved - has multi-terms 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
>	TokenNameGREATER	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
ppTermsBitSets	TokenNameIdentifier	 pp Terms Bit Sets
(	TokenNameLPAREN	
rpp	TokenNameIdentifier	 rpp
,	TokenNameCOMMA	
rptTerms	TokenNameIdentifier	 rpt Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unionTermGroups	TokenNameIdentifier	 union Term Groups
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
tg	TokenNameIdentifier	 tg
=	TokenNameEQUAL	
termGroups	TokenNameIdentifier	 term Groups
(	TokenNameLPAREN	
rptTerms	TokenNameIdentifier	 rpt Terms
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
distinctGroupIDs	TokenNameIdentifier	 distinct Group I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
distinctGroupIDs	TokenNameIdentifier	 distinct Group I Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
:	TokenNameCOLON	
rpp	TokenNameIdentifier	 rpp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rptTerms	TokenNameIdentifier	 rpt Terms
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
==	TokenNameEQUAL_EQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
rptGroup	TokenNameIdentifier	 rpt Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
hs	TokenNameIdentifier	 hs
:	TokenNameCOLON	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
(	TokenNameLPAREN	
hs	TokenNameIdentifier	 hs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Actual position in doc of a PhrasePosition, relies on that position = tpPos - offset) */	TokenNameCOMMENT_JAVADOC	 Actual position in doc of a PhrasePosition, relies on that position = tpPos - offset) 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
tpPos	TokenNameIdentifier	 tp Pos
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** find repeating terms and assign them ordinal values */	TokenNameCOMMENT_JAVADOC	 find repeating terms and assign them ordinal values 
private	TokenNameprivate	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
repeatingTerms	TokenNameIdentifier	 repeating Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
tord	TokenNameIdentifier	 tord
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
tcnt	TokenNameIdentifier	 tcnt
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterate cyclic list: done once handled max 	TokenNameCOMMENT_LINE	iterate cyclic list: done once handled max 
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
cnt0	TokenNameIdentifier	 cnt0
=	TokenNameEQUAL	
tcnt	TokenNameIdentifier	 tcnt
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
cnt0	TokenNameIdentifier	 cnt0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
cnt0	TokenNameIdentifier	 cnt0
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tcnt	TokenNameIdentifier	 tcnt
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
cnt	TokenNameIdentifier	 cnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tord	TokenNameIdentifier	 tord
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
tord	TokenNameIdentifier	 tord
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tord	TokenNameIdentifier	 tord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** find repeating pps, and for each, if has multi-terms, update this.hasMultiTermRpts */	TokenNameCOMMENT_JAVADOC	 find repeating pps, and for each, if has multi-terms, update this.hasMultiTermRpts 
private	TokenNameprivate	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
repeatingPPs	TokenNameIdentifier	 repeating P Ps
(	TokenNameLPAREN	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
rptTerms	TokenNameIdentifier	 rpt Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
rp	TokenNameIdentifier	 rp
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// iterate cyclic list: done once handled max 	TokenNameCOMMENT_LINE	iterate cyclic list: done once handled max 
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rptTerms	TokenNameIdentifier	 rpt Terms
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasMultiTermRpts	TokenNameIdentifier	 has Multi Term Rpts
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** bit-sets - for each repeating pp, for each of its repeating terms, the term ordinal values is set */	TokenNameCOMMENT_JAVADOC	 bit-sets - for each repeating pp, for each of its repeating terms, the term ordinal values is set 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
>	TokenNameGREATER	
ppTermsBitSets	TokenNameIdentifier	 pp Terms Bit Sets
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rpp	TokenNameIdentifier	 rpp
,	TokenNameCOMMA	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
tord	TokenNameIdentifier	 tord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
>	TokenNameGREATER	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
>	TokenNameGREATER	
(	TokenNameLPAREN	
rpp	TokenNameIdentifier	 rpp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
pp	TokenNameIdentifier	 pp
:	TokenNameCOLON	
rpp	TokenNameIdentifier	 rpp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
tord	TokenNameIdentifier	 tord
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
tord	TokenNameIdentifier	 tord
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bb	TokenNameIdentifier	 bb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** union (term group) bit-sets until they are disjoint (O(n^^2)), and each group have different terms */	TokenNameCOMMENT_JAVADOC	 union (term group) bit-sets until they are disjoint (O(n^^2)), and each group have different terms 
private	TokenNameprivate	
void	TokenNamevoid	
unionTermGroups	TokenNameIdentifier	 union Term Groups
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
>	TokenNameGREATER	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
incr	TokenNameIdentifier	 incr
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
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
incr	TokenNameIdentifier	 incr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incr	TokenNameIdentifier	 incr
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** map each term to the single group that contains it */	TokenNameCOMMENT_JAVADOC	 map each term to the single group that contains it 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
termGroups	TokenNameIdentifier	 term Groups
(	TokenNameLPAREN	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
tord	TokenNameIdentifier	 tord
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
>	TokenNameGREATER	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
tg	TokenNameIdentifier	 tg
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
tord	TokenNameIdentifier	 tord
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// i is the group no. 	TokenNameCOMMENT_LINE	i is the group no. 
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tg	TokenNameIdentifier	 tg
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tg	TokenNameIdentifier	 tg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private void printQueue(PrintStream ps, PhrasePositions ext, String title) { 	TokenNameCOMMENT_LINE	private void printQueue(PrintStream ps, PhrasePositions ext, String title) { 
// //if (min.doc != ?) return; 	TokenNameCOMMENT_LINE	//if (min.doc != ?) return; 
// ps.println(); 	TokenNameCOMMENT_LINE	ps.println(); 
// ps.println("---- "+title); 	TokenNameCOMMENT_LINE	ps.println("---- "+title); 
// ps.println("EXT: "+ext); 	TokenNameCOMMENT_LINE	ps.println("EXT: "+ext); 
// PhrasePositions[] t = new PhrasePositions[pq.size()]; 	TokenNameCOMMENT_LINE	PhrasePositions[] t = new PhrasePositions[pq.size()]; 
// if (pq.size()>0) { 	TokenNameCOMMENT_LINE	if (pq.size()>0) { 
// t[0] = pq.pop(); 	TokenNameCOMMENT_LINE	t[0] = pq.pop(); 
// ps.println(" " + 0 + " " + t[0]); 	TokenNameCOMMENT_LINE	ps.println(" " + 0 + " " + t[0]); 
// for (int i=1; i<t.length; i++) { 	TokenNameCOMMENT_LINE	for (int i=1; i<t.length; i++) { 
// t[i] = pq.pop(); 	TokenNameCOMMENT_LINE	t[i] = pq.pop(); 
// assert t[i-1].position <= t[i].position; 	TokenNameCOMMENT_LINE	assert t[i-1].position <= t[i].position; 
// ps.println(" " + i + " " + t[i]); 	TokenNameCOMMENT_LINE	ps.println(" " + i + " " + t[i]); 
// } 	TokenNameCOMMENT_LINE	} 
// // add them back 	TokenNameCOMMENT_LINE	// add them back 
// for (int i=t.length-1; i>=0; i--) { 	TokenNameCOMMENT_LINE	for (int i=t.length-1; i>=0; i--) { 
// pq.add(t[i]); 	TokenNameCOMMENT_LINE	pq.add(t[i]); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
