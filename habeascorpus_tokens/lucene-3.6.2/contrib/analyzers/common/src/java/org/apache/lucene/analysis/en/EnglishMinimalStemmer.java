package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
en	TokenNameIdentifier	 en
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Minimal plural stemmer for English. * <p> * This stemmer implements the "S-Stemmer" from * <i>How Effective Is Suffixing?</i> * Donna Harman. */	TokenNameCOMMENT_JAVADOC	 Minimal plural stemmer for English. <p> This stemmer implements the "S-Stemmer" from <i>How Effective Is Suffixing?</i> Donna Harman. 
public	TokenNamepublic	
class	TokenNameclass	
EnglishMinimalStemmer	TokenNameIdentifier	 English Minimal Stemmer
{	TokenNameLBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"fallthrough"	TokenNameStringLiteral	fallthrough
)	TokenNameRPAREN	
public	TokenNamepublic	
int	TokenNameint	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'y'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'o'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
/* intentional fallthrough */	TokenNameCOMMENT_BLOCK	 intentional fallthrough 
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
