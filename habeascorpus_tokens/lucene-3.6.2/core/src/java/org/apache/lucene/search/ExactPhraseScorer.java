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
Arrays	TokenNameIdentifier	 Arrays
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
ExactPhraseScorer	TokenNameIdentifier	 Exact Phrase Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreCache	TokenNameIdentifier	 score Cache
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
endMinus1	TokenNameIdentifier	 end Minus1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
CHUNK	TokenNameIdentifier	 CHUNK
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counts	TokenNameIdentifier	 counts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
CHUNK	TokenNameIdentifier	 CHUNK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gens	TokenNameIdentifier	 gens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
CHUNK	TokenNameIdentifier	 CHUNK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
noDocs	TokenNameIdentifier	 no Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
ChunkState	TokenNameIdentifier	 Chunk State
{	TokenNameLBRACE	
final	TokenNamefinal	
TermPositions	TokenNameIdentifier	 Term Positions
posEnum	TokenNameIdentifier	 pos Enum
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
useAdvance	TokenNameIdentifier	 use Advance
;	TokenNameSEMICOLON	
int	TokenNameint	
posUpto	TokenNameIdentifier	 pos Upto
;	TokenNameSEMICOLON	
int	TokenNameint	
posLimit	TokenNameIdentifier	 pos Limit
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPos	TokenNameIdentifier	 last Pos
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ChunkState	TokenNameIdentifier	 Chunk State
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
posEnum	TokenNameIdentifier	 pos Enum
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useAdvance	TokenNameIdentifier	 use Advance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
=	TokenNameEQUAL	
posEnum	TokenNameIdentifier	 pos Enum
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useAdvance	TokenNameIdentifier	 use Advance
=	TokenNameEQUAL	
useAdvance	TokenNameIdentifier	 use Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ChunkState	TokenNameIdentifier	 Chunk State
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunkStates	TokenNameIdentifier	 chunk States
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
ExactPhraseScorer	TokenNameIdentifier	 Exact Phrase Scorer
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
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkStates	TokenNameIdentifier	 chunk States
=	TokenNameEQUAL	
new	TokenNamenew	
ChunkState	TokenNameIdentifier	 Chunk State
[	TokenNameLBRACKET	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
endMinus1	TokenNameIdentifier	 end Minus1
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Coarse optimization: advance(target) is fairly 	TokenNameCOMMENT_LINE	Coarse optimization: advance(target) is fairly 
// costly, so, if the relative freq of the 2nd 	TokenNameCOMMENT_LINE	costly, so, if the relative freq of the 2nd 
// rarest term is not that much (> 1/5th) rarer than 	TokenNameCOMMENT_LINE	rarest term is not that much (> 1/5th) rarer than 
// the first term, then we just use .nextDoc() when 	TokenNameCOMMENT_LINE	the first term, then we just use .nextDoc() when 
// ANDing. This buys ~15% gain for phrases where 	TokenNameCOMMENT_LINE	ANDing. This buys ~15% gain for phrases where 
// freq of rarest 2 terms is close: 	TokenNameCOMMENT_LINE	freq of rarest 2 terms is close: 
final	TokenNamefinal	
boolean	TokenNameboolean	
useAdvance	TokenNameIdentifier	 use Advance
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>	TokenNameGREATER	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ChunkState	TokenNameIdentifier	 Chunk State
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
postings	TokenNameIdentifier	 postings
,	TokenNameCOMMA	
-	TokenNameMINUS	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
useAdvance	TokenNameIdentifier	 use Advance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noDocs	TokenNameIdentifier	 no Docs
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scoreCache	TokenNameIdentifier	 score Cache
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first (rarest) term 	TokenNameCOMMENT_LINE	first (rarest) term 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not-first terms 	TokenNameCOMMENT_LINE	not-first terms 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
chunkStates	TokenNameIdentifier	 chunk States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ChunkState	TokenNameIdentifier	 Chunk State
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
useAdvance	TokenNameIdentifier	 use Advance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// safety net -- fallback to .skipTo if we've 	TokenNameCOMMENT_LINE	safety net -- fallback to .skipTo if we've 
// done too many .nextDocs 	TokenNameCOMMENT_LINE	done too many .nextDocs 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
iter	TokenNameIdentifier	 iter
==	TokenNameEQUAL_EQUAL	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
>	TokenNameGREATER	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
chunkStates	TokenNameIdentifier	 chunk States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this doc has all the terms -- now test whether 	TokenNameCOMMENT_LINE	this doc has all the terms -- now test whether 
// phrase occurs 	TokenNameCOMMENT_LINE	phrase occurs 
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
phraseFreq	TokenNameIdentifier	 phrase Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
// first term 	TokenNameCOMMENT_LINE	first term 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not-first terms 	TokenNameCOMMENT_LINE	not-first terms 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
chunkStates	TokenNameIdentifier	 chunk States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
>	TokenNameGREATER	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
chunkStates	TokenNameIdentifier	 chunk States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this doc has all the terms -- now test whether 	TokenNameCOMMENT_LINE	this doc has all the terms -- now test whether 
// phrase occurs 	TokenNameCOMMENT_LINE	phrase occurs 
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
phraseFreq	TokenNameIdentifier	 phrase Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"ExactPhraseScorer("	TokenNameStringLiteral	ExactPhraseScorer(
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
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
docID	TokenNameIdentifier	 doc ID
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
final	TokenNamefinal	
float	TokenNamefloat	
raw	TokenNameIdentifier	 raw
;	TokenNameSEMICOLON	
// raw score 	TokenNameCOMMENT_LINE	raw score 
if	TokenNameif	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
<	TokenNameLESS	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
scoreCache	TokenNameIdentifier	 score Cache
[	TokenNameLBRACKET	
freq	TokenNameIdentifier	 freq
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
norms	TokenNameIdentifier	 norms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
raw	TokenNameIdentifier	 raw
:	TokenNameCOLON	
raw	TokenNameIdentifier	 raw
*	TokenNameMULTIPLY	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
docID	TokenNameIdentifier	 doc ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normalize 	TokenNameCOMMENT_LINE	normalize 
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
phraseFreq	TokenNameIdentifier	 phrase Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// init chunks 	TokenNameCOMMENT_LINE	init chunks 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
chunkStates	TokenNameIdentifier	 chunk States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ChunkState	TokenNameIdentifier	 Chunk State
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posLimit	TokenNameIdentifier	 pos Limit
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunkStart	TokenNameIdentifier	 chunk Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkEnd	TokenNameIdentifier	 chunk End
=	TokenNameEQUAL	
CHUNK	TokenNameIdentifier	 CHUNK
;	TokenNameSEMICOLON	
// process chunk by chunk 	TokenNameCOMMENT_LINE	process chunk by chunk 
boolean	TokenNameboolean	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// TODO: we could fold in chunkStart into offset and 	TokenNameCOMMENT_LINE	TODO: we could fold in chunkStart into offset and 
// save one subtract per pos incr 	TokenNameCOMMENT_LINE	save one subtract per pos incr 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gen	TokenNameIdentifier	 gen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wraparound 	TokenNameCOMMENT_LINE	wraparound 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
gens	TokenNameIdentifier	 gens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gen	TokenNameIdentifier	 gen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// first term 	TokenNameCOMMENT_LINE	first term 
{	TokenNameLBRACE	
final	TokenNamefinal	
ChunkState	TokenNameIdentifier	 Chunk State
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
chunkEnd	TokenNameIdentifier	 chunk End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
posIndex	TokenNameIdentifier	 pos Index
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
gens	TokenNameIdentifier	 gens
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
gens	TokenNameIdentifier	 gens
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
==	TokenNameEQUAL_EQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posLimit	TokenNameIdentifier	 pos Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// middle terms 	TokenNameCOMMENT_LINE	middle terms 
boolean	TokenNameboolean	
any	TokenNameIdentifier	 any
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
endMinus1	TokenNameIdentifier	 end Minus1
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ChunkState	TokenNameIdentifier	 Chunk State
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
any	TokenNameIdentifier	 any
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
chunkEnd	TokenNameIdentifier	 chunk End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
posIndex	TokenNameIdentifier	 pos Index
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIndex	TokenNameIdentifier	 pos Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
gens	TokenNameIdentifier	 gens
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
gen	TokenNameIdentifier	 gen
&&	TokenNameAND_AND	
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// viable 	TokenNameCOMMENT_LINE	viable 
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
any	TokenNameIdentifier	 any
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
==	TokenNameEQUAL_EQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posLimit	TokenNameIdentifier	 pos Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
any	TokenNameIdentifier	 any
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
any	TokenNameIdentifier	 any
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// petered out for this chunk 	TokenNameCOMMENT_LINE	petered out for this chunk 
chunkStart	TokenNameIdentifier	 chunk Start
+=	TokenNamePLUS_EQUAL	
CHUNK	TokenNameIdentifier	 CHUNK
;	TokenNameSEMICOLON	
chunkEnd	TokenNameIdentifier	 chunk End
+=	TokenNamePLUS_EQUAL	
CHUNK	TokenNameIdentifier	 CHUNK
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// last term 	TokenNameCOMMENT_LINE	last term 
{	TokenNameLBRACE	
final	TokenNamefinal	
ChunkState	TokenNameIdentifier	 Chunk State
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
chunkStates	TokenNameIdentifier	 chunk States
[	TokenNameLBRACKET	
endMinus1	TokenNameIdentifier	 end Minus1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
chunkEnd	TokenNameIdentifier	 chunk End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
posIndex	TokenNameIdentifier	 pos Index
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
chunkStart	TokenNameIdentifier	 chunk Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIndex	TokenNameIdentifier	 pos Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
gens	TokenNameIdentifier	 gens
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
gen	TokenNameIdentifier	 gen
&&	TokenNameAND_AND	
counts	TokenNameIdentifier	 counts
[	TokenNameLBRACKET	
posIndex	TokenNameIdentifier	 pos Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
endMinus1	TokenNameIdentifier	 end Minus1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freq	TokenNameIdentifier	 freq
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
==	TokenNameEQUAL_EQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posLimit	TokenNameIdentifier	 pos Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posUpto	TokenNameIdentifier	 pos Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
posEnum	TokenNameIdentifier	 pos Enum
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
chunkStart	TokenNameIdentifier	 chunk Start
+=	TokenNamePLUS_EQUAL	
CHUNK	TokenNameIdentifier	 CHUNK
;	TokenNameSEMICOLON	
chunkEnd	TokenNameIdentifier	 chunk End
+=	TokenNamePLUS_EQUAL	
CHUNK	TokenNameIdentifier	 CHUNK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
