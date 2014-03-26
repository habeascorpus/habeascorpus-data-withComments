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
/** Expert: Scoring functionality for phrase queries. * <br>A document is considered matching if it contains the phrase-query terms * at "valid" positions. What "valid positions" are * depends on the type of the phrase query: for an exact phrase query terms are required * to appear in adjacent locations, while for a sloppy phrase query some distance between * the terms is allowed. The abstract method {@link #phraseFreq()} of extending classes * is invoked for each document containing all the phrase query terms, in order to * compute the frequency of the phrase query in that document. A non zero frequency * means a match. */	TokenNameCOMMENT_JAVADOC	 Expert: Scoring functionality for phrase queries. <br>A document is considered matching if it contains the phrase-query terms at "valid" positions. What "valid positions" are depends on the type of the phrase query: for an exact phrase query terms are required to appear in adjacent locations, while for a sloppy phrase query some distance between the terms is allowed. The abstract method {@link #phraseFreq()} of extending classes is invoked for each document containing all the phrase query terms, in order to compute the frequency of the phrase query in that document. A non zero frequency means a match. 
abstract	TokenNameabstract	
class	TokenNameclass	
PhraseScorer	TokenNameIdentifier	 Phrase Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
//phrase frequency in current doc as computed by phraseFreq(). 	TokenNameCOMMENT_LINE	phrase frequency in current doc as computed by phraseFreq(). 
PhraseScorer	TokenNameIdentifier	 Phrase Scorer
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
// convert tps to a list of phrase positions. 	TokenNameCOMMENT_LINE	convert tps to a list of phrase positions. 
// note: phrase-position differs from term-position in that its position 	TokenNameCOMMENT_LINE	note: phrase-position differs from term-position in that its position 
// reflects the phrase offset: pp.pos = tp.pos - offset. 	TokenNameCOMMENT_LINE	reflects the phrase offset: pp.pos = tp.pos - offset. 
// this allows to easily identify a matching (exact) phrase 	TokenNameCOMMENT_LINE	this allows to easily identify a matching (exact) phrase 
// when all PhrasePositions have exactly the same position. 	TokenNameCOMMENT_LINE	when all PhrasePositions have exactly the same position. 
if	TokenNameif	
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
new	TokenNamenew	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
postings	TokenNameIdentifier	 postings
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
postings	TokenNameIdentifier	 postings
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
new	TokenNamenew	
PhrasePositions	TokenNameIdentifier	 Phrase Positions
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
postings	TokenNameIdentifier	 postings
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
// make it cyclic for easier manipulation 	TokenNameCOMMENT_LINE	make it cyclic for easier manipulation 
}	TokenNameRBRACE	
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
max	TokenNameIdentifier	 max
.	TokenNameDOT	
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
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
advanceMin	TokenNameIdentifier	 advance Min
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
// for further calls to docID() 	TokenNameCOMMENT_LINE	for further calls to docID() 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// cyclic 	TokenNameCOMMENT_LINE	cyclic 
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// cyclic 	TokenNameCOMMENT_LINE	cyclic 
return	TokenNamereturn	
true	TokenNametrue	
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
//System.out.println("scoring " + max.doc); 	TokenNameCOMMENT_LINE	System.out.println("scoring " + max.doc); 
float	TokenNamefloat	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// raw score 	TokenNameCOMMENT_LINE	raw score 
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
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normalize 	TokenNameCOMMENT_LINE	normalize 
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
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
advanceMin	TokenNameIdentifier	 advance Min
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
restart	TokenNameIdentifier	 restart
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
||	TokenNameOR_OR	
restart	TokenNameIdentifier	 restart
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restart	TokenNameIdentifier	 restart
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
advanceMin	TokenNameIdentifier	 advance Min
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// found a doc with all of the terms 	TokenNameCOMMENT_LINE	found a doc with all of the terms 
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
phraseFreq	TokenNameIdentifier	 phrase Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for phrase 	TokenNameCOMMENT_LINE	check for phrase 
restart	TokenNameIdentifier	 restart
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// found a match 	TokenNameCOMMENT_LINE	found a match 
return	TokenNamereturn	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * phrase frequency in current doc as computed by phraseFreq(). */	TokenNameCOMMENT_JAVADOC	 phrase frequency in current doc as computed by phraseFreq(). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For a document containing all the phrase query terms, compute the * frequency of the phrase in that document. * A non zero frequency means a match. * <br>Note, that containing all phrase terms does not guarantee a match - they have to be found in matching locations. * @return frequency of the phrase in current doc, 0 if not found. */	TokenNameCOMMENT_JAVADOC	 For a document containing all the phrase query terms, compute the frequency of the phrase in that document. A non zero frequency means a match. <br>Note, that containing all phrase terms does not guarantee a match - they have to be found in matching locations. @return frequency of the phrase in current doc, 0 if not found. 
abstract	TokenNameabstract	
float	TokenNamefloat	
phraseFreq	TokenNameIdentifier	 phrase Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"scorer("	TokenNameStringLiteral	scorer(
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
