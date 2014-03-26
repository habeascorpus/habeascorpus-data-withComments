package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StemmerUtil	TokenNameIdentifier	 Stemmer Util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Stemmer for Indonesian. * <p> * Stems Indonesian words with the algorithm presented in: * <i>A Study of Stemming Effects on Information Retrieval in * Bahasa Indonesia</i>, Fadillah Z Tala. * http://www.illc.uva.nl/Publications/ResearchReports/MoL-2003-02.text.pdf */	TokenNameCOMMENT_JAVADOC	 Stemmer for Indonesian. <p> Stems Indonesian words with the algorithm presented in: <i>A Study of Stemming Effects on Information Retrieval in Bahasa Indonesia</i>, Fadillah Z Tala. http://www.illc.uva.nl/Publications/ResearchReports/MoL-2003-02.text.pdf 
public	TokenNamepublic	
class	TokenNameclass	
IndonesianStemmer	TokenNameIdentifier	 Indonesian Stemmer
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
numSyllables	TokenNameIdentifier	 num Syllables
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_KE	TokenNameIdentifier	 REMOVED  KE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_DI	TokenNameIdentifier	 REMOVED  DI
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_TER	TokenNameIdentifier	 REMOVED  TER
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_BER	TokenNameIdentifier	 REMOVED  BER
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REMOVED_PE	TokenNameIdentifier	 REMOVED  PE
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Stem a term (returning its new length). * <p> * Use <code>stemDerivational</code> to control whether full stemming * or only light inflectional stemming is done. */	TokenNameCOMMENT_JAVADOC	 Stem a term (returning its new length). <p> Use <code>stemDerivational</code> to control whether full stemming or only light inflectional stemming is done. 
public	TokenNamepublic	
int	TokenNameint	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
boolean	TokenNameboolean	
stemDerivational	TokenNameIdentifier	 stem Derivational
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removeParticle	TokenNameIdentifier	 remove Particle
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removePossessivePronoun	TokenNameIdentifier	 remove Possessive Pronoun
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stemDerivational	TokenNameIdentifier	 stem Derivational
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
stemDerivational	TokenNameIdentifier	 stem Derivational
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
stemDerivational	TokenNameIdentifier	 stem Derivational
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldLength	TokenNameIdentifier	 old Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removeFirstOrderPrefix	TokenNameIdentifier	 remove First Order Prefix
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldLength	TokenNameIdentifier	 old Length
!=	TokenNameNOT_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a rule is fired 	TokenNameCOMMENT_LINE	a rule is fired 
oldLength	TokenNameIdentifier	 old Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removeSuffix	TokenNameIdentifier	 remove Suffix
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldLength	TokenNameIdentifier	 old Length
!=	TokenNameNOT_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
// a rule is fired 	TokenNameCOMMENT_LINE	a rule is fired 
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removeSecondOrderPrefix	TokenNameIdentifier	 remove Second Order Prefix
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// fail 	TokenNameCOMMENT_LINE	fail 
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removeSecondOrderPrefix	TokenNameIdentifier	 remove Second Order Prefix
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSyllables	TokenNameIdentifier	 num Syllables
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
removeSuffix	TokenNameIdentifier	 remove Suffix
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'o'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
removeParticle	TokenNameIdentifier	 remove Particle
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"kah"	TokenNameStringLiteral	kah
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"lah"	TokenNameStringLiteral	lah
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"pun"	TokenNameStringLiteral	pun
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
removePossessivePronoun	TokenNameIdentifier	 remove Possessive Pronoun
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"ku"	TokenNameStringLiteral	ku
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"mu"	TokenNameStringLiteral	mu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"nya"	TokenNameStringLiteral	nya
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
removeFirstOrderPrefix	TokenNameIdentifier	 remove First Order Prefix
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"meng"	TokenNameStringLiteral	meng
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"meny"	TokenNameStringLiteral	meny
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"men"	TokenNameStringLiteral	men
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"mem"	TokenNameStringLiteral	mem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"me"	TokenNameStringLiteral	me
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"peng"	TokenNameStringLiteral	peng
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"peny"	TokenNameStringLiteral	peny
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"peny"	TokenNameStringLiteral	peny
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"pen"	TokenNameStringLiteral	pen
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"pen"	TokenNameStringLiteral	pen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"pem"	TokenNameStringLiteral	pem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"di"	TokenNameStringLiteral	di
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_DI	TokenNameIdentifier	 REMOVED  DI
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"ter"	TokenNameStringLiteral	ter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_TER	TokenNameIdentifier	 REMOVED  TER
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"ke"	TokenNameStringLiteral	ke
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_KE	TokenNameIdentifier	 REMOVED  KE
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
removeSecondOrderPrefix	TokenNameIdentifier	 remove Second Order Prefix
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"ber"	TokenNameStringLiteral	ber
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_BER	TokenNameIdentifier	 REMOVED  BER
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"belajar"	TokenNameStringLiteral	belajar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_BER	TokenNameIdentifier	 REMOVED  BER
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"be"	TokenNameStringLiteral	be
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_BER	TokenNameIdentifier	 REMOVED  BER
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"per"	TokenNameStringLiteral	per
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"pelajar"	TokenNameStringLiteral	pelajar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"pe"	TokenNameStringLiteral	pe
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
REMOVED_PE	TokenNameIdentifier	 REMOVED  PE
;	TokenNameSEMICOLON	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deleteN	TokenNameIdentifier	 delete N
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
removeSuffix	TokenNameIdentifier	 remove Suffix
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"kan"	TokenNameStringLiteral	kan
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_KE	TokenNameIdentifier	 REMOVED  KE
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_PE	TokenNameIdentifier	 REMOVED  PE
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"an"	TokenNameStringLiteral	an
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_DI	TokenNameIdentifier	 REMOVED  DI
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_MENG	TokenNameIdentifier	 REMOVED  MENG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_TER	TokenNameIdentifier	 REMOVED  TER
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"si"	TokenNameStringLiteral	si
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_BER	TokenNameIdentifier	 REMOVED  BER
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_KE	TokenNameIdentifier	 REMOVED  KE
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
REMOVED_PENG	TokenNameIdentifier	 REMOVED  PENG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numSyllables	TokenNameIdentifier	 num Syllables
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
