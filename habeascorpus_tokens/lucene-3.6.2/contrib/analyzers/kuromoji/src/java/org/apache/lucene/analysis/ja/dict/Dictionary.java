package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Dictionary interface for retrieving morphological data * by id. */	TokenNameCOMMENT_JAVADOC	 Dictionary interface for retrieving morphological data by id. 
public	TokenNamepublic	
interface	TokenNameinterface	
Dictionary	TokenNameIdentifier	 Dictionary
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTERNAL_SEPARATOR	TokenNameIdentifier	 INTERNAL  SEPARATOR
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Get left id of specified word * @param wordId * @return left id */	TokenNameCOMMENT_JAVADOC	 Get left id of specified word @param wordId @return left id 
public	TokenNamepublic	
int	TokenNameint	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get right id of specified word * @param wordId * @return left id */	TokenNameCOMMENT_JAVADOC	 Get right id of specified word @param wordId @return left id 
public	TokenNamepublic	
int	TokenNameint	
getRightId	TokenNameIdentifier	 get Right Id
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get word cost of specified word * @param wordId * @return left id */	TokenNameCOMMENT_JAVADOC	 Get word cost of specified word @param wordId @return left id 
public	TokenNamepublic	
int	TokenNameint	
getWordCost	TokenNameIdentifier	 get Word Cost
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get Part-Of-Speech of tokens * @param wordId word ID of token * @return Part-Of-Speech of the token */	TokenNameCOMMENT_JAVADOC	 Get Part-Of-Speech of tokens @param wordId word ID of token @return Part-Of-Speech of the token 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPartOfSpeech	TokenNameIdentifier	 get Part Of Speech
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get reading of tokens * @param wordId word ID of token * @return Reading of the token */	TokenNameCOMMENT_JAVADOC	 Get reading of tokens @param wordId word ID of token @return Reading of the token 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get base form of word * @param wordId word ID of token * @return Base form (only different for inflected words, otherwise null) */	TokenNameCOMMENT_JAVADOC	 Get base form of word @param wordId word ID of token @return Base form (only different for inflected words, otherwise null) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseForm	TokenNameIdentifier	 get Base Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get pronunciation of tokens * @param wordId word ID of token * @return Pronunciation of the token */	TokenNameCOMMENT_JAVADOC	 Get pronunciation of tokens @param wordId word ID of token @return Pronunciation of the token 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get inflection type of tokens * @param wordId word ID of token * @return inflection type, or null */	TokenNameCOMMENT_JAVADOC	 Get inflection type of tokens @param wordId word ID of token @return inflection type, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get inflection form of tokens * @param wordId word ID of token * @return inflection form, or null */	TokenNameCOMMENT_JAVADOC	 Get inflection form of tokens @param wordId word ID of token @return inflection form, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: maybe we should have a optimal method, a non-typesafe 	TokenNameCOMMENT_LINE	TODO: maybe we should have a optimal method, a non-typesafe 
// 'getAdditionalData' if other dictionaries like unidic have additional data 	TokenNameCOMMENT_LINE	'getAdditionalData' if other dictionaries like unidic have additional data 
}	TokenNameRBRACE	
