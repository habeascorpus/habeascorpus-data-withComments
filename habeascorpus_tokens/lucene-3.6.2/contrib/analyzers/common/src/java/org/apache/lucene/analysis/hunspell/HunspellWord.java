package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
hunspell	TokenNameIdentifier	 hunspell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * A dictionary (.dic) entry with its associated flags. */	TokenNameCOMMENT_JAVADOC	 A dictionary (.dic) entry with its associated flags. 
public	TokenNamepublic	
class	TokenNameclass	
HunspellWord	TokenNameIdentifier	 Hunspell Word
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
flags	TokenNameIdentifier	 flags
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// sorted, can we represent more concisely? 	TokenNameCOMMENT_LINE	sorted, can we represent more concisely? 
/** * Creates a new HunspellWord with no associated flags */	TokenNameCOMMENT_JAVADOC	 Creates a new HunspellWord with no associated flags 
public	TokenNamepublic	
HunspellWord	TokenNameIdentifier	 Hunspell Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new HunspellWord with the given flags * * @param flags Flags to associate with the word */	TokenNameCOMMENT_JAVADOC	 Constructs a new HunspellWord with the given flags * @param flags Flags to associate with the word 
public	TokenNamepublic	
HunspellWord	TokenNameIdentifier	 Hunspell Word
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the word has the given flag associated with it * * @param flag Flag to check whether it is associated with the word * @return {@code true} if the flag is associated, {@code false} otherwise */	TokenNameCOMMENT_JAVADOC	 Checks whether the word has the given flag associated with it * @param flag Flag to check whether it is associated with the word @return {@code true} if the flag is associated, {@code false} otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
char	TokenNamechar	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the flags associated with the word * * @return Flags asssociated with the word */	TokenNameCOMMENT_JAVADOC	 Returns the flags associated with the word * @return Flags asssociated with the word 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
