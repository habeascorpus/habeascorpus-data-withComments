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
phonetic	TokenNameIdentifier	 phonetic
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
language	TokenNameIdentifier	 language
.	TokenNameDOT	
DoubleMetaphone	TokenNameIdentifier	 Double Metaphone
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
;	TokenNameSEMICOLON	
/** * Filter for DoubleMetaphone (supporting secondary codes) */	TokenNameCOMMENT_JAVADOC	 Filter for DoubleMetaphone (supporting secondary codes) 
public	TokenNamepublic	
class	TokenNameclass	
DoubleMetaphoneFilter	TokenNameIdentifier	 Double Metaphone Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOKEN_TYPE	TokenNameIdentifier	 TOKEN  TYPE
=	TokenNameEQUAL	
"DoubleMetaphone"	TokenNameStringLiteral	DoubleMetaphone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
remainingTokens	TokenNameIdentifier	 remaining Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
State	TokenNameIdentifier	 State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DoubleMetaphone	TokenNameIdentifier	 Double Metaphone
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
new	TokenNamenew	
DoubleMetaphone	TokenNameIdentifier	 Double Metaphone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
inject	TokenNameIdentifier	 inject
;	TokenNameSEMICOLON	
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posAtt	TokenNameIdentifier	 pos Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DoubleMetaphoneFilter	TokenNameIdentifier	 Double Metaphone Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
maxCodeLength	TokenNameIdentifier	 max Code Length
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inject	TokenNameIdentifier	 inject
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
setMaxCodeLen	TokenNameIdentifier	 set Max Code Len
(	TokenNameLPAREN	
maxCodeLength	TokenNameIdentifier	 max Code Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inject	TokenNameIdentifier	 inject
=	TokenNameEQUAL	
inject	TokenNameIdentifier	 inject
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// clearAttributes(); // not currently necessary 	TokenNameCOMMENT_LINE	clearAttributes(); // not currently necessary 
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// pass through zero length terms 	TokenNameCOMMENT_LINE	pass through zero length terms 
int	TokenNameint	
firstAlternativeIncrement	TokenNameIdentifier	 first Alternative Increment
=	TokenNameEQUAL	
inject	TokenNameIdentifier	 inject
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
posAtt	TokenNameIdentifier	 pos Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
=	TokenNameEQUAL	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
doubleMetaphone	TokenNameIdentifier	 double Metaphone
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
alternatePhoneticValue	TokenNameIdentifier	 alternate Phonetic Value
=	TokenNameEQUAL	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
doubleMetaphone	TokenNameIdentifier	 double Metaphone
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a flag to lazily save state if needed... this avoids a save/restore when only 	TokenNameCOMMENT_LINE	a flag to lazily save state if needed... this avoids a save/restore when only 
// one token will be generated. 	TokenNameCOMMENT_LINE	one token will be generated. 
boolean	TokenNameboolean	
saveState	TokenNameIdentifier	 save State
=	TokenNameEQUAL	
inject	TokenNameIdentifier	 inject
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
saveState	TokenNameIdentifier	 save State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
posAtt	TokenNameIdentifier	 pos Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
firstAlternativeIncrement	TokenNameIdentifier	 first Alternative Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstAlternativeIncrement	TokenNameIdentifier	 first Alternative Increment
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saveState	TokenNameIdentifier	 save State
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
alternatePhoneticValue	TokenNameIdentifier	 alternate Phonetic Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
alternatePhoneticValue	TokenNameIdentifier	 alternate Phonetic Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
alternatePhoneticValue	TokenNameIdentifier	 alternate Phonetic Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
primaryPhoneticValue	TokenNameIdentifier	 primary Phonetic Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
saveState	TokenNameIdentifier	 save State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saveState	TokenNameIdentifier	 save State
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
posAtt	TokenNameIdentifier	 pos Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
firstAlternativeIncrement	TokenNameIdentifier	 first Alternative Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
alternatePhoneticValue	TokenNameIdentifier	 alternate Phonetic Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saveState	TokenNameIdentifier	 save State
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Just one token to return, so no need to capture/restore 	TokenNameCOMMENT_LINE	Just one token to return, so no need to capture/restore 
// any state, simply return it. 	TokenNameCOMMENT_LINE	any state, simply return it. 
if	TokenNameif	
(	TokenNameLPAREN	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
saveState	TokenNameIdentifier	 save State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remainingTokens	TokenNameIdentifier	 remaining Tokens
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
