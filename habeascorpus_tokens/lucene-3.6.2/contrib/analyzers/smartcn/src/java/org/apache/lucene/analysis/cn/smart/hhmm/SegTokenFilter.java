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
/** * <p> * Filters a {@link SegToken} by converting full-width latin to half-width, then lowercasing latin. * Additionally, all punctuation is converted into {@link Utility#COMMON_DELIMITER} * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 <p> Filters a {@link SegToken} by converting full-width latin to half-width, then lowercasing latin. Additionally, all punctuation is converted into {@link Utility#COMMON_DELIMITER} </p> @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SegTokenFilter	TokenNameIdentifier	 Seg Token Filter
{	TokenNameLBRACE	
/** * Filter an input {@link SegToken} * <p> * Full-width latin will be converted to half-width, then all latin will be lowercased. * All punctuation is converted into {@link Utility#COMMON_DELIMITER} * </p> * * @param token input {@link SegToken} * @return normalized {@link SegToken} */	TokenNameCOMMENT_JAVADOC	 Filter an input {@link SegToken} <p> Full-width latin will be converted to half-width, then all latin will be lowercased. All punctuation is converted into {@link Utility#COMMON_DELIMITER} </p> * @param token input {@link SegToken} @return normalized {@link SegToken} 
public	TokenNamepublic	
SegToken	TokenNameIdentifier	 Seg Token
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
wordType	TokenNameIdentifier	 word Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
FULLWIDTH_NUMBER	TokenNameIdentifier	 FULLWIDTH  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
FULLWIDTH_STRING	TokenNameIdentifier	 FULLWIDTH  STRING
:	TokenNameCOLON	
/* first convert full-width -> half-width */	TokenNameCOMMENT_BLOCK	 first convert full-width -> half-width 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
0xFF10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
0xFEE0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
0x0041	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
0x005A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/* lowercase latin */	TokenNameCOMMENT_BLOCK	 lowercase latin 
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
0x0020	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
0x0041	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
0x005A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/* lowercase latin */	TokenNameCOMMENT_BLOCK	 lowercase latin 
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
0x0020	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
DELIMITER	TokenNameIdentifier	 DELIMITER
:	TokenNameCOLON	
/* convert all punctuation to Utility.COMMON_DELIMITER */	TokenNameCOMMENT_BLOCK	 convert all punctuation to Utility.COMMON_DELIMITER 
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
COMMON_DELIMITER	TokenNameIdentifier	 COMMON  DELIMITER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
