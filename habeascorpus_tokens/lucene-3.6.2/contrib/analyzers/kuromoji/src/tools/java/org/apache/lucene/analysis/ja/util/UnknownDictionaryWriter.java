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
util	TokenNameIdentifier	 util
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
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
.	TokenNameDOT	
CharacterDefinition	TokenNameIdentifier	 Character Definition
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
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
extends	TokenNameextends	
BinaryDictionaryWriter	TokenNameIdentifier	 Binary Dictionary Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CharacterDefinitionWriter	TokenNameIdentifier	 Character Definition Writer
characterDefinition	TokenNameIdentifier	 character Definition
=	TokenNameEQUAL	
new	TokenNamenew	
CharacterDefinitionWriter	TokenNameIdentifier	 Character Definition Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
UnknownDictionary	TokenNameIdentifier	 Unknown Dictionary
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get wordId of current entry 	TokenNameCOMMENT_LINE	Get wordId of current entry 
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Put entry 	TokenNameCOMMENT_LINE	Put entry 
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Put entry in targetMap 	TokenNameCOMMENT_LINE	Put entry in targetMap 
int	TokenNameint	
characterId	TokenNameIdentifier	 character Id
=	TokenNameEQUAL	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
lookupCharacterClass	TokenNameIdentifier	 lookup Character Class
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addMapping	TokenNameIdentifier	 add Mapping
(	TokenNameLPAREN	
characterId	TokenNameIdentifier	 character Id
,	TokenNameCOMMA	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put mapping from unicode code point to character class. * * @param codePoint code point * @param characterClassName character class name */	TokenNameCOMMENT_JAVADOC	 Put mapping from unicode code point to character class. * @param codePoint code point @param characterClassName character class name 
public	TokenNamepublic	
void	TokenNamevoid	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
characterDefinition	TokenNameIdentifier	 character Definition
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
putInvokeDefinition	TokenNameIdentifier	 put Invoke Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
characterClassName	TokenNameIdentifier	 character Class Name
,	TokenNameCOMMA	
int	TokenNameint	
invoke	TokenNameIdentifier	 invoke
,	TokenNameCOMMA	
int	TokenNameint	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
characterDefinition	TokenNameIdentifier	 character Definition
.	TokenNameDOT	
putInvokeDefinition	TokenNameIdentifier	 put Invoke Definition
(	TokenNameLPAREN	
characterClassName	TokenNameIdentifier	 character Class Name
,	TokenNameCOMMA	
invoke	TokenNameIdentifier	 invoke
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
characterDefinition	TokenNameIdentifier	 character Definition
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
