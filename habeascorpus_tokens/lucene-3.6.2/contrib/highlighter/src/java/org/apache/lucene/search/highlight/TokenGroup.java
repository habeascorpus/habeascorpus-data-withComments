package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
/** * One, or several overlapping tokens, along with the score(s) and the scope of * the original text */	TokenNameCOMMENT_JAVADOC	 One, or several overlapping tokens, along with the score(s) and the scope of the original text 
public	TokenNamepublic	
class	TokenNameclass	
TokenGroup	TokenNameIdentifier	 Token Group
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_NUM_TOKENS_PER_GROUP	TokenNameIdentifier	 MAX  NUM  TOKENS  PER  GROUP
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
MAX_NUM_TOKENS_PER_GROUP	TokenNameIdentifier	 MAX  NUM  TOKENS  PER  GROUP
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
MAX_NUM_TOKENS_PER_GROUP	TokenNameIdentifier	 MAX  NUM  TOKENS  PER  GROUP
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numTokens	TokenNameIdentifier	 num Tokens
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
int	TokenNameint	
matchStartOffset	TokenNameIdentifier	 match Start Offset
,	TokenNameCOMMA	
matchEndOffset	TokenNameIdentifier	 match End Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TokenGroup	TokenNameIdentifier	 Token Group
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numTokens	TokenNameIdentifier	 num Tokens
<	TokenNameLESS	
MAX_NUM_TOKENS_PER_GROUP	TokenNameIdentifier	 MAX  NUM  TOKENS  PER  GROUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
termStartOffset	TokenNameIdentifier	 term Start Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
termEndOffset	TokenNameIdentifier	 term End Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numTokens	TokenNameIdentifier	 num Tokens
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
matchStartOffset	TokenNameIdentifier	 match Start Offset
=	TokenNameEQUAL	
termStartOffset	TokenNameIdentifier	 term Start Offset
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
matchEndOffset	TokenNameIdentifier	 match End Offset
=	TokenNameEQUAL	
termEndOffset	TokenNameIdentifier	 term End Offset
;	TokenNameSEMICOLON	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
termStartOffset	TokenNameIdentifier	 term Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
termEndOffset	TokenNameIdentifier	 term End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tot	TokenNameIdentifier	 tot
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchStartOffset	TokenNameIdentifier	 match Start Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchEndOffset	TokenNameIdentifier	 match End Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
matchStartOffset	TokenNameIdentifier	 match Start Offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
matchStartOffset	TokenNameIdentifier	 match Start Offset
,	TokenNameCOMMA	
termStartOffset	TokenNameIdentifier	 term Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchEndOffset	TokenNameIdentifier	 match End Offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
matchEndOffset	TokenNameIdentifier	 match End Offset
,	TokenNameCOMMA	
termEndOffset	TokenNameIdentifier	 term End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tot	TokenNameIdentifier	 tot
+=	TokenNamePLUS_EQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
termStartOffset	TokenNameIdentifier	 term Start Offset
,	TokenNameCOMMA	
termEndOffset	TokenNameIdentifier	 term End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
numTokens	TokenNameIdentifier	 num Tokens
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
numTokens	TokenNameIdentifier	 num Tokens
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
numTokens	TokenNameIdentifier	 num Tokens
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isDistinct	TokenNameIdentifier	 is Distinct
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numTokens	TokenNameIdentifier	 num Tokens
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * @param index a value between 0 and numTokens -1 * @return the "n"th token */	TokenNameCOMMENT_BLOCK	 @param index a value between 0 and numTokens -1 @return the "n"th token 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param index a value between 0 and numTokens -1 * @return the "n"th score */	TokenNameCOMMENT_JAVADOC	 * @param index a value between 0 and numTokens -1 @return the "n"th score 
public	TokenNamepublic	
float	TokenNamefloat	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the end position in the original text */	TokenNameCOMMENT_JAVADOC	 @return the end position in the original text 
public	TokenNamepublic	
int	TokenNameint	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the number of tokens in this group */	TokenNameCOMMENT_JAVADOC	 @return the number of tokens in this group 
public	TokenNamepublic	
int	TokenNameint	
getNumTokens	TokenNameIdentifier	 get Num Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the start position in the original text */	TokenNameCOMMENT_JAVADOC	 @return the start position in the original text 
public	TokenNamepublic	
int	TokenNameint	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return all tokens' scores summed up */	TokenNameCOMMENT_JAVADOC	 @return all tokens' scores summed up 
public	TokenNamepublic	
float	TokenNamefloat	
getTotalScore	TokenNameIdentifier	 get Total Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
