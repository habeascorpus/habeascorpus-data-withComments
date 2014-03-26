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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Dictionary for unknown-word handling. */	TokenNameCOMMENT_JAVADOC	 Dictionary for unknown-word handling. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
extends	TokenNameextends	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CharacterDefinition	TokenNameIdentifier	 Character Definition
characterDefinition	TokenNameIdentifier	 character Definition
=	TokenNameEQUAL	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
characterDefinition	TokenNameIdentifier	 character Definition
.	TokenNameDOT	
isGroup	TokenNameIdentifier	 is Group
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Extract unknown word. Characters with the same character class are considered to be part of unknown word 	TokenNameCOMMENT_LINE	Extract unknown word. Characters with the same character class are considered to be part of unknown word 
byte	TokenNamebyte	
characterIdOfFirstCharacter	TokenNameIdentifier	 character Id Of First Character
=	TokenNameEQUAL	
characterDefinition	TokenNameIdentifier	 character Definition
.	TokenNameDOT	
getCharacterClass	TokenNameIdentifier	 get Character Class
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
characterIdOfFirstCharacter	TokenNameIdentifier	 character Id Of First Character
==	TokenNameEQUAL_EQUAL	
characterDefinition	TokenNameIdentifier	 character Definition
.	TokenNameDOT	
getCharacterClass	TokenNameIdentifier	 get Character Class
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharacterDefinition	TokenNameIdentifier	 Character Definition
getCharacterDefinition	TokenNameIdentifier	 get Character Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
characterDefinition	TokenNameIdentifier	 character Definition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SingletonHolder	TokenNameIdentifier	 Singleton Holder
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SingletonHolder	TokenNameIdentifier	 Singleton Holder
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot load UnknownDictionary."	TokenNameStringLiteral	Cannot load UnknownDictionary.
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
