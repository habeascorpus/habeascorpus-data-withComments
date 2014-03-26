/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
CharType	TokenNameIdentifier	 Char Type
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
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
Utility	TokenNameIdentifier	 Utility
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
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
WordType	TokenNameIdentifier	 Word Type
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
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
.	TokenNameDOT	
SegToken	TokenNameIdentifier	 Seg Token
;	TokenNameSEMICOLON	
//javadoc @link 	TokenNameCOMMENT_LINE	javadoc @link 
/** * Finds the optimal segmentation of a sentence into Chinese words * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Finds the optimal segmentation of a sentence into Chinese words @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
HHMMSegmenter	TokenNameIdentifier	 HHMM Segmenter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
WordDictionary	TokenNameIdentifier	 Word Dictionary
wordDict	TokenNameIdentifier	 word Dict
=	TokenNameEQUAL	
WordDictionary	TokenNameIdentifier	 Word Dictionary
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create the {@link SegGraph} for a sentence. * * @param sentence input sentence, without start and end markers * @return {@link SegGraph} corresponding to the input sentence. */	TokenNameCOMMENT_JAVADOC	 Create the {@link SegGraph} for a sentence. * @param sentence input sentence, without start and end markers @return {@link SegGraph} corresponding to the input sentence. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"fallthrough"	TokenNameStringLiteral	fallthrough
)	TokenNameRPAREN	
private	TokenNameprivate	
SegGraph	TokenNameIdentifier	 Seg Graph
createSegGraph	TokenNameIdentifier	 create Seg Graph
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
foundIndex	TokenNameIdentifier	 found Index
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charTypeArray	TokenNameIdentifier	 char Type Array
=	TokenNameEQUAL	
getCharTypes	TokenNameIdentifier	 get Char Types
(	TokenNameLPAREN	
sentence	TokenNameIdentifier	 sentence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
wordBuf	TokenNameIdentifier	 word Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegToken	TokenNameIdentifier	 Seg Token
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the number of times word appears. 	TokenNameCOMMENT_LINE	the number of times word appears. 
boolean	TokenNameboolean	
hasFullWidth	TokenNameIdentifier	 has Full Width
;	TokenNameSEMICOLON	
int	TokenNameint	
wordType	TokenNameIdentifier	 word Type
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
;	TokenNameSEMICOLON	
SegGraph	TokenNameIdentifier	 Seg Graph
segGraph	TokenNameIdentifier	 seg Graph
=	TokenNameEQUAL	
new	TokenNamenew	
SegGraph	TokenNameIdentifier	 Seg Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasFullWidth	TokenNameIdentifier	 has Full Width
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
SPACE_LIKE	TokenNameIdentifier	 SPACE  LIKE
:	TokenNameCOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
HANZI	TokenNameIdentifier	 HANZI
:	TokenNameCOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wordBuf	TokenNameIdentifier	 word Buf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordBuf	TokenNameIdentifier	 word Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It doesn't matter if a single Chinese character (Hanzi) can form a phrase or not, 	TokenNameCOMMENT_LINE	It doesn't matter if a single Chinese character (Hanzi) can form a phrase or not, 
// it will store that single Chinese character (Hanzi) in the SegGraph. Otherwise, it will 	TokenNameCOMMENT_LINE	it will store that single Chinese character (Hanzi) in the SegGraph. Otherwise, it will 
// cause word division. 	TokenNameCOMMENT_LINE	cause word division. 
wordBuf	TokenNameIdentifier	 word Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
CHINESE_WORD	TokenNameIdentifier	 CHINESE  WORD
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foundIndex	TokenNameIdentifier	 found Index
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getPrefixMatch	TokenNameIdentifier	 get Prefix Match
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
foundIndex	TokenNameIdentifier	 found Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
foundIndex	TokenNameIdentifier	 found Index
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It is the phrase we are looking for; In other words, we have found a phrase SegToken 	TokenNameCOMMENT_LINE	It is the phrase we are looking for; In other words, we have found a phrase SegToken 
// from i to j. It is not a monosyllabic word (single word). 	TokenNameCOMMENT_LINE	from i to j. It is not a monosyllabic word (single word). 
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
CHINESE_WORD	TokenNameIdentifier	 CHINESE  WORD
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
SPACE_LIKE	TokenNameIdentifier	 SPACE  LIKE
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
HANZI	TokenNameIdentifier	 HANZI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordBuf	TokenNameIdentifier	 word Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
wordBuf	TokenNameIdentifier	 word Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordBuf	TokenNameIdentifier	 word Buf
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// idArray has been found (foundWordIndex!=-1) as a prefix before. 	TokenNameCOMMENT_LINE	idArray has been found (foundWordIndex!=-1) as a prefix before. 
// Therefore, idArray after it has been lengthened can only appear after foundWordIndex. 	TokenNameCOMMENT_LINE	Therefore, idArray after it has been lengthened can only appear after foundWordIndex. 
// So start searching after foundWordIndex. 	TokenNameCOMMENT_LINE	So start searching after foundWordIndex. 
foundIndex	TokenNameIdentifier	 found Index
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getPrefixMatch	TokenNameIdentifier	 get Prefix Match
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
foundIndex	TokenNameIdentifier	 found Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
FULLWIDTH_LETTER	TokenNameIdentifier	 FULLWIDTH  LETTER
:	TokenNameCOLON	
hasFullWidth	TokenNameIdentifier	 has Full Width
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/* intentional fallthrough */	TokenNameCOMMENT_BLOCK	 intentional fallthrough 
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
LETTER	TokenNameIdentifier	 LETTER
:	TokenNameCOLON	
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
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
LETTER	TokenNameIdentifier	 LETTER
||	TokenNameOR_OR	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
FULLWIDTH_LETTER	TokenNameIdentifier	 FULLWIDTH  LETTER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
FULLWIDTH_LETTER	TokenNameIdentifier	 FULLWIDTH  LETTER
)	TokenNameRPAREN	
hasFullWidth	TokenNameIdentifier	 has Full Width
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Found a Token from i to j. Type is LETTER char string. 	TokenNameCOMMENT_LINE	Found a Token from i to j. Type is LETTER char string. 
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
STRING_CHAR_ARRAY	TokenNameIdentifier	 STRING  CHAR  ARRAY
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordType	TokenNameIdentifier	 word Type
=	TokenNameEQUAL	
hasFullWidth	TokenNameIdentifier	 has Full Width
?	TokenNameQUESTION	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
FULLWIDTH_STRING	TokenNameIdentifier	 FULLWIDTH  STRING
:	TokenNameCOLON	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
wordType	TokenNameIdentifier	 word Type
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
FULLWIDTH_DIGIT	TokenNameIdentifier	 FULLWIDTH  DIGIT
:	TokenNameCOLON	
hasFullWidth	TokenNameIdentifier	 has Full Width
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/* intentional fallthrough */	TokenNameCOMMENT_BLOCK	 intentional fallthrough 
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
DIGIT	TokenNameIdentifier	 DIGIT
:	TokenNameCOLON	
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
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
DIGIT	TokenNameIdentifier	 DIGIT
||	TokenNameOR_OR	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
FULLWIDTH_DIGIT	TokenNameIdentifier	 FULLWIDTH  DIGIT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
FULLWIDTH_DIGIT	TokenNameIdentifier	 FULLWIDTH  DIGIT
)	TokenNameRPAREN	
hasFullWidth	TokenNameIdentifier	 has Full Width
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Found a Token from i to j. Type is NUMBER char string. 	TokenNameCOMMENT_LINE	Found a Token from i to j. Type is NUMBER char string. 
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
NUMBER_CHAR_ARRAY	TokenNameIdentifier	 NUMBER  CHAR  ARRAY
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordType	TokenNameIdentifier	 word Type
=	TokenNameEQUAL	
hasFullWidth	TokenNameIdentifier	 has Full Width
?	TokenNameQUESTION	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
FULLWIDTH_NUMBER	TokenNameIdentifier	 FULLWIDTH  NUMBER
:	TokenNameCOLON	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
wordType	TokenNameIdentifier	 word Type
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharType	TokenNameIdentifier	 Char Type
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
:	TokenNameCOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// No need to search the weight for the punctuation. Picking the highest frequency will work. 	TokenNameCOMMENT_LINE	No need to search the weight for the punctuation. Picking the highest frequency will work. 
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
MAX_FREQUENCE	TokenNameIdentifier	 MAX  FREQUENCE
;	TokenNameSEMICOLON	
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Treat the unrecognized char symbol as unknown string. 	TokenNameCOMMENT_LINE	Treat the unrecognized char symbol as unknown string. 
// For example, any symbol not in GB2312 is treated as one of these. 	TokenNameCOMMENT_LINE	For example, any symbol not in GB2312 is treated as one of these. 
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
STRING_CHAR_ARRAY	TokenNameIdentifier	 STRING  CHAR  ARRAY
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Add two more Tokens: "beginning xx beginning" 	TokenNameCOMMENT_LINE	Add two more Tokens: "beginning xx beginning" 
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
START_CHAR_ARRAY	TokenNameIdentifier	 START  CHAR  ARRAY
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
SENTENCE_BEGIN	TokenNameIdentifier	 SENTENCE  BEGIN
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "end xx end" 	TokenNameCOMMENT_LINE	"end xx end" 
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
END_CHAR_ARRAY	TokenNameIdentifier	 END  CHAR  ARRAY
;	TokenNameSEMICOLON	
frequency	TokenNameIdentifier	 frequency
=	TokenNameEQUAL	
wordDict	TokenNameIdentifier	 word Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
SegToken	TokenNameIdentifier	 Seg Token
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
SENTENCE_END	TokenNameIdentifier	 SENTENCE  END
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segGraph	TokenNameIdentifier	 seg Graph
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the character types for every character in a sentence. * * @see Utility#getCharType(char) * @param sentence input sentence * @return array of character types corresponding to character positions in the sentence */	TokenNameCOMMENT_JAVADOC	 Get the character types for every character in a sentence. * @see Utility#getCharType(char) @param sentence input sentence @return array of character types corresponding to character positions in the sentence 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCharTypes	TokenNameIdentifier	 get Char Types
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charTypeArray	TokenNameIdentifier	 char Type Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the type of each character by position 	TokenNameCOMMENT_LINE	the type of each character by position 
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
{	TokenNameLBRACE	
charTypeArray	TokenNameIdentifier	 char Type Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
getCharType	TokenNameIdentifier	 get Char Type
(	TokenNameLPAREN	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
charTypeArray	TokenNameIdentifier	 char Type Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a list of {@link SegToken} representing the best segmentation of a sentence * @param sentence input sentence * @return best segmentation as a {@link List} */	TokenNameCOMMENT_JAVADOC	 Return a list of {@link SegToken} representing the best segmentation of a sentence @param sentence input sentence @return best segmentation as a {@link List} 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegGraph	TokenNameIdentifier	 Seg Graph
segGraph	TokenNameIdentifier	 seg Graph
=	TokenNameEQUAL	
createSegGraph	TokenNameIdentifier	 create Seg Graph
(	TokenNameLPAREN	
sentence	TokenNameIdentifier	 sentence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BiSegGraph	TokenNameIdentifier	 Bi Seg Graph
biSegGraph	TokenNameIdentifier	 bi Seg Graph
=	TokenNameEQUAL	
new	TokenNamenew	
BiSegGraph	TokenNameIdentifier	 Bi Seg Graph
(	TokenNameLPAREN	
segGraph	TokenNameIdentifier	 seg Graph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
shortPath	TokenNameIdentifier	 short Path
=	TokenNameEQUAL	
biSegGraph	TokenNameIdentifier	 bi Seg Graph
.	TokenNameDOT	
getShortPath	TokenNameIdentifier	 get Short Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shortPath	TokenNameIdentifier	 short Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
