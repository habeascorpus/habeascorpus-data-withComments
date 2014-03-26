package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ngram	TokenNameIdentifier	 ngram
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
/** * Tokenizes the input into n-grams of the given size(s). */	TokenNameCOMMENT_JAVADOC	 Tokenizes the input into n-grams of the given size(s). 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NGramTokenFilter	TokenNameIdentifier	 N Gram Token Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MIN  NGRAM  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MAX  NGRAM  SIZE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curTermLength	TokenNameIdentifier	 cur Term Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curGramSize	TokenNameIdentifier	 cur Gram Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curPos	TokenNameIdentifier	 cur Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tokStart	TokenNameIdentifier	 tok Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tokEnd	TokenNameIdentifier	 tok End
;	TokenNameSEMICOLON	
// only used if the length changed before this filter 	TokenNameCOMMENT_LINE	only used if the length changed before this filter 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasIllegalOffsets	TokenNameIdentifier	 has Illegal Offsets
;	TokenNameSEMICOLON	
// only if the length changed before this filter 	TokenNameCOMMENT_LINE	only if the length changed before this filter 
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates NGramTokenFilter with given min and max n-grams. * @param input {@link TokenStream} holding the input to be tokenized * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates NGramTokenFilter with given min and max n-grams. @param input {@link TokenStream} holding the input to be tokenized @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
NGramTokenFilter	TokenNameIdentifier	 N Gram Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
int	TokenNameint	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minGram must be greater than zero"	TokenNameStringLiteral	minGram must be greater than zero
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
>	TokenNameGREATER	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minGram must not be greater than maxGram"	TokenNameStringLiteral	minGram must not be greater than maxGram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minGram	TokenNameIdentifier	 min Gram
=	TokenNameEQUAL	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxGram	TokenNameIdentifier	 max Gram
=	TokenNameEQUAL	
maxGram	TokenNameIdentifier	 max Gram
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates NGramTokenFilter with default min and max n-grams. * @param input {@link TokenStream} holding the input to be tokenized */	TokenNameCOMMENT_JAVADOC	 Creates NGramTokenFilter with default min and max n-grams. @param input {@link TokenStream} holding the input to be tokenized 
public	TokenNamepublic	
NGramTokenFilter	TokenNameIdentifier	 N Gram Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_MIN_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MIN  NGRAM  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MAX  NGRAM  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the next token in the stream, or null at EOS. */	TokenNameCOMMENT_JAVADOC	 Returns the next token in the stream, or null at EOS. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
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
if	TokenNameif	
(	TokenNameLPAREN	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curTermLength	TokenNameIdentifier	 cur Term Length
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curGramSize	TokenNameIdentifier	 cur Gram Size
=	TokenNameEQUAL	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
curPos	TokenNameIdentifier	 cur Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tokStart	TokenNameIdentifier	 tok Start
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokEnd	TokenNameIdentifier	 tok End
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if length by start + end offsets doesn't match the term text then assume 	TokenNameCOMMENT_LINE	if length by start + end offsets doesn't match the term text then assume 
// this is a synonym and don't adjust the offsets. 	TokenNameCOMMENT_LINE	this is a synonym and don't adjust the offsets. 
hasIllegalOffsets	TokenNameIdentifier	 has Illegal Offsets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tokStart	TokenNameIdentifier	 tok Start
+	TokenNamePLUS	
curTermLength	TokenNameIdentifier	 cur Term Length
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
tokEnd	TokenNameIdentifier	 tok End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
curGramSize	TokenNameIdentifier	 cur Gram Size
<=	TokenNameLESS_EQUAL	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
curPos	TokenNameIdentifier	 cur Pos
+	TokenNamePLUS	
curGramSize	TokenNameIdentifier	 cur Gram Size
<=	TokenNameLESS_EQUAL	
curTermLength	TokenNameIdentifier	 cur Term Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// while there is input 	TokenNameCOMMENT_LINE	while there is input 
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
,	TokenNameCOMMA	
curPos	TokenNameIdentifier	 cur Pos
,	TokenNameCOMMA	
curGramSize	TokenNameIdentifier	 cur Gram Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasIllegalOffsets	TokenNameIdentifier	 has Illegal Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
tokStart	TokenNameIdentifier	 tok Start
,	TokenNameCOMMA	
tokEnd	TokenNameIdentifier	 tok End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
tokStart	TokenNameIdentifier	 tok Start
+	TokenNamePLUS	
curPos	TokenNameIdentifier	 cur Pos
,	TokenNameCOMMA	
tokStart	TokenNameIdentifier	 tok Start
+	TokenNamePLUS	
curPos	TokenNameIdentifier	 cur Pos
+	TokenNamePLUS	
curGramSize	TokenNameIdentifier	 cur Gram Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curPos	TokenNameIdentifier	 cur Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curGramSize	TokenNameIdentifier	 cur Gram Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// increase n-gram size 	TokenNameCOMMENT_LINE	increase n-gram size 
curPos	TokenNameIdentifier	 cur Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
