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
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
JapaneseTokenizer	TokenNameIdentifier	 Japanese Tokenizer
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
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
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
.	TokenNameDOT	
Dictionary	TokenNameIdentifier	 Dictionary
;	TokenNameSEMICOLON	
/** * Analyzed token with morphological data from its dictionary. */	TokenNameCOMMENT_JAVADOC	 Analyzed token with morphological data from its dictionary. 
public	TokenNamepublic	
class	TokenNameclass	
Token	TokenNameIdentifier	 Token
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Dictionary	TokenNameIdentifier	 Dictionary
dictionary	TokenNameIdentifier	 dictionary
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
surfaceForm	TokenNameIdentifier	 surface Form
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
positionLength	TokenNameIdentifier	 position Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
Dictionary	TokenNameIdentifier	 Dictionary
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wordId	TokenNameIdentifier	 word Id
=	TokenNameEQUAL	
wordId	TokenNameIdentifier	 word Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
surfaceForm	TokenNameIdentifier	 surface Form
=	TokenNameEQUAL	
surfaceForm	TokenNameIdentifier	 surface Form
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
positionLength	TokenNameIdentifier	 position Length
=	TokenNameEQUAL	
positionLength	TokenNameIdentifier	 position Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dictionary	TokenNameIdentifier	 dictionary
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
;	TokenNameSEMICOLON	
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
"Token(""	TokenNameStringLiteral	Token("
+	TokenNamePLUS	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" pos="	TokenNameStringLiteral	" pos=
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
" length="	TokenNameStringLiteral	 length=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" posLen="	TokenNameStringLiteral	 posLen=
+	TokenNamePLUS	
positionLength	TokenNameIdentifier	 position Length
+	TokenNamePLUS	
" type="	TokenNameStringLiteral	 type=
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" wordId="	TokenNameStringLiteral	 wordId=
+	TokenNamePLUS	
wordId	TokenNameIdentifier	 word Id
+	TokenNamePLUS	
" leftID="	TokenNameStringLiteral	 leftID=
+	TokenNamePLUS	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return surfaceForm */	TokenNameCOMMENT_JAVADOC	 @return surfaceForm 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSurfaceForm	TokenNameIdentifier	 get Surface Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
surfaceForm	TokenNameIdentifier	 surface Form
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return offset into surfaceForm */	TokenNameCOMMENT_JAVADOC	 @return offset into surfaceForm 
public	TokenNamepublic	
int	TokenNameint	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return length of surfaceForm */	TokenNameCOMMENT_JAVADOC	 @return length of surfaceForm 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return surfaceForm as a String */	TokenNameCOMMENT_JAVADOC	 @return surfaceForm as a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSurfaceFormString	TokenNameIdentifier	 get Surface Form String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return reading. null if token doesn't have reading. */	TokenNameCOMMENT_JAVADOC	 @return reading. null if token doesn't have reading. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return pronunciation. null if token doesn't have pronunciation. */	TokenNameCOMMENT_JAVADOC	 @return pronunciation. null if token doesn't have pronunciation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return part of speech. */	TokenNameCOMMENT_JAVADOC	 @return part of speech. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPartOfSpeech	TokenNameIdentifier	 get Part Of Speech
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getPartOfSpeech	TokenNameIdentifier	 get Part Of Speech
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return inflection type or null */	TokenNameCOMMENT_JAVADOC	 @return inflection type or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return inflection form or null */	TokenNameCOMMENT_JAVADOC	 @return inflection form or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return base form or null if token is not inflected */	TokenNameCOMMENT_JAVADOC	 @return base form or null if token is not inflected 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseForm	TokenNameIdentifier	 get Base Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getBaseForm	TokenNameIdentifier	 get Base Form
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this token is known word * @return true if this token is in standard dictionary. false if not. */	TokenNameCOMMENT_JAVADOC	 Returns true if this token is known word @return true if this token is in standard dictionary. false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isKnown	TokenNameIdentifier	 is Known
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
KNOWN	TokenNameIdentifier	 KNOWN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this token is unknown word * @return true if this token is unknown word. false if not. */	TokenNameCOMMENT_JAVADOC	 Returns true if this token is unknown word @return true if this token is unknown word. false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isUnknown	TokenNameIdentifier	 is Unknown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
UNKNOWN	TokenNameIdentifier	 UNKNOWN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this token is defined in user dictionary * @return true if this token is in user dictionary. false if not. */	TokenNameCOMMENT_JAVADOC	 Returns true if this token is defined in user dictionary @return true if this token is in user dictionary. false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isUser	TokenNameIdentifier	 is User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
USER	TokenNameIdentifier	 USER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get index of this token in input text * @return position of token */	TokenNameCOMMENT_JAVADOC	 Get index of this token in input text @return position of token 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the position length (in tokens) of this token. For normal * tokens this is 1; for compound tokens it's > 1. */	TokenNameCOMMENT_JAVADOC	 Set the position length (in tokens) of this token. For normal tokens this is 1; for compound tokens it's > 1. 
public	TokenNamepublic	
void	TokenNamevoid	
setPositionLength	TokenNameIdentifier	 set Position Length
(	TokenNameLPAREN	
int	TokenNameint	
positionLength	TokenNameIdentifier	 position Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positionLength	TokenNameIdentifier	 position Length
=	TokenNameEQUAL	
positionLength	TokenNameIdentifier	 position Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length (in tokens) of this token. For normal * tokens this is 1; for compound tokens it's > 1. * @return position length of token */	TokenNameCOMMENT_JAVADOC	 Get the length (in tokens) of this token. For normal tokens this is 1; for compound tokens it's > 1. @return position length of token 
public	TokenNamepublic	
int	TokenNameint	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positionLength	TokenNameIdentifier	 position Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
