package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
/** * Base class for all Lucene unit tests that use TokenStreams. * <p> * When writing unit tests for analysis components, its highly recommended * to use the helper methods here (especially in conjunction with {@link MockAnalyzer} or * {@link MockTokenizer}), as they contain many assertions and checks to * catch bugs. * * @see MockAnalyzer * @see MockTokenizer */	TokenNameCOMMENT_JAVADOC	 Base class for all Lucene unit tests that use TokenStreams. <p> When writing unit tests for analysis components, its highly recommended to use the helper methods here (especially in conjunction with {@link MockAnalyzer} or {@link MockTokenizer}), as they contain many assertions and checks to catch bugs. * @see MockAnalyzer @see MockTokenizer 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
// some helpers to test Analyzers and TokenStreams: 	TokenNameCOMMENT_LINE	some helpers to test Analyzers and TokenStreams: 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
boolean	TokenNameboolean	
getAndResetClearCalled	TokenNameIdentifier	 get And Reset Clear Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CheckClearAttributesAttributeImpl	TokenNameIdentifier	 Check Clear Attributes Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
clearCalled	TokenNameIdentifier	 clear Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
getAndResetClearCalled	TokenNameIdentifier	 get And Reset Clear Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
clearCalled	TokenNameIdentifier	 clear Called
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
clearCalled	TokenNameIdentifier	 clear Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearCalled	TokenNameIdentifier	 clear Called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
CheckClearAttributesAttributeImpl	TokenNameIdentifier	 Check Clear Attributes Attribute Impl
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CheckClearAttributesAttributeImpl	TokenNameIdentifier	 Check Clear Attributes Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
clearCalled	TokenNameIdentifier	 clear Called
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
clearCalled	TokenNameIdentifier	 clear Called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
76137213	TokenNameIntegerLiteral	
^	TokenNameXOR	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
clearCalled	TokenNameIdentifier	 clear Called
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CheckClearAttributesAttributeImpl	TokenNameIdentifier	 Check Clear Attributes Attribute Impl
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
posIncrements	TokenNameIdentifier	 pos Increments
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
checkClearAtt	TokenNameIdentifier	 check Clear Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CheckClearAttributesAttribute	TokenNameIdentifier	 Check Clear Attributes Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"has no CharTermAttribute"	TokenNameStringLiteral	has no CharTermAttribute
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startOffsets	TokenNameIdentifier	 start Offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
endOffsets	TokenNameIdentifier	 end Offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
finalOffset	TokenNameIdentifier	 final Offset
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"has no OffsetAttribute"	TokenNameStringLiteral	has no OffsetAttribute
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"has no TypeAttribute"	TokenNameStringLiteral	has no TypeAttribute
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIncrements	TokenNameIdentifier	 pos Increments
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"has no PositionIncrementAttribute"	TokenNameStringLiteral	has no PositionIncrementAttribute
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// extra safety to enforce, that the state is not preserved and also assign bogus values 	TokenNameCOMMENT_LINE	extra safety to enforce, that the state is not preserved and also assign bogus values 
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
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
"bogusTerm"	TokenNameStringLiteral	bogusTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
14584724	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24683243	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"bogusType"	TokenNameStringLiteral	bogusType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
45987657	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkClearAtt	TokenNameIdentifier	 check Clear Att
.	TokenNameDOT	
getAndResetClearCalled	TokenNameIdentifier	 get And Reset Clear Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset it, because we called clearAttribute() before 	TokenNameCOMMENT_LINE	reset it, because we called clearAttribute() before 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"token "	TokenNameStringLiteral	token 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" does not exist"	TokenNameStringLiteral	 does not exist
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"clearAttributes() was not called correctly in TokenStream chain"	TokenNameStringLiteral	clearAttributes() was not called correctly in TokenStream chain
,	TokenNameCOMMA	
checkClearAtt	TokenNameIdentifier	 check Clear Att
.	TokenNameDOT	
getAndResetClearCalled	TokenNameIdentifier	 get And Reset Clear Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"term "	TokenNameStringLiteral	term 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startOffsets	TokenNameIdentifier	 start Offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"startOffset "	TokenNameStringLiteral	startOffset 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endOffsets	TokenNameIdentifier	 end Offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"endOffset "	TokenNameStringLiteral	endOffset 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"type "	TokenNameStringLiteral	type 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIncrements	TokenNameIdentifier	 pos Increments
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"posIncrement "	TokenNameStringLiteral	posIncrement 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we can enforce some basic things about a few attributes even if the caller doesn't check: 	TokenNameCOMMENT_LINE	we can enforce some basic things about a few attributes even if the caller doesn't check: 
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"startOffset must be >= 0"	TokenNameStringLiteral	startOffset must be >= 0
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"endOffset must be >= 0"	TokenNameStringLiteral	endOffset must be >= 0
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"endOffset must be >= startOffset"	TokenNameStringLiteral	endOffset must be >= startOffset
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"posIncrement must be >= 0"	TokenNameStringLiteral	posIncrement must be >= 0
,	TokenNameCOMMA	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"end of stream"	TokenNameStringLiteral	end of stream
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"finalOffset "	TokenNameStringLiteral	finalOffset 
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"finalOffset must be >= 0"	TokenNameStringLiteral	finalOffset must be >= 0
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
posIncrements	TokenNameIdentifier	 pos Increments
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
posIncrements	TokenNameIdentifier	 pos Increments
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
posIncrements	TokenNameIdentifier	 pos Increments
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
int	TokenNameint	
startOffsets	TokenNameIdentifier	 start Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
endOffsets	TokenNameIdentifier	 end Offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
startOffsets	TokenNameIdentifier	 start Offsets
,	TokenNameCOMMA	
endOffsets	TokenNameIdentifier	 end Offsets
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
posIncrements	TokenNameIdentifier	 pos Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// simple utility method for testing stemmers 	TokenNameCOMMENT_LINE	simple utility method for testing stemmers 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// simple utility method for blasting tokenstreams with data to make sure they don't do anything crazy 	TokenNameCOMMENT_LINE	simple utility method for blasting tokenstreams with data to make sure they don't do anything crazy 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
iterations	TokenNameIdentifier	 iterations
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
iterations	TokenNameIdentifier	 iterations
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
iterations	TokenNameIdentifier	 iterations
,	TokenNameCOMMA	
int	TokenNameint	
maxWordLength	TokenNameIdentifier	 max Word Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iterations	TokenNameIdentifier	 iterations
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomSimpleString	TokenNameIdentifier	 random Simple String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomRealisticUnicodeString	TokenNameIdentifier	 random Realistic Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
maxWordLength	TokenNameIdentifier	 max Word Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
maxWordLength	TokenNameIdentifier	 max Word Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NOTE: BaseTokenStreamTestCase: get first token stream now text="	TokenNameStringLiteral	NOTE: BaseTokenStreamTestCase: get first token stream now text=
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"has no CharTermAttribute"	TokenNameStringLiteral	has no CharTermAttribute
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
startOffsets	TokenNameIdentifier	 start Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
endOffsets	TokenNameIdentifier	 end Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIncAtt	TokenNameIdentifier	 pos Inc Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startOffsets	TokenNameIdentifier	 start Offsets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endOffsets	TokenNameIdentifier	 end Offsets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify reusing is "reproducable" and also get the normal tokenstream sanity checks 	TokenNameCOMMENT_LINE	verify reusing is "reproducable" and also get the normal tokenstream sanity checks 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NOTE: BaseTokenStreamTestCase: re-run analysis"	TokenNameStringLiteral	NOTE: BaseTokenStreamTestCase: re-run analysis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
posIncAtt	TokenNameIdentifier	 pos Inc Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// offset + pos + type 	TokenNameCOMMENT_LINE	offset + pos + type 
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
startOffsets	TokenNameIdentifier	 start Offsets
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
endOffsets	TokenNameIdentifier	 end Offsets
)	TokenNameRPAREN	
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
posIncAtt	TokenNameIdentifier	 pos Inc Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// offset + pos 	TokenNameCOMMENT_LINE	offset + pos 
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
startOffsets	TokenNameIdentifier	 start Offsets
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
endOffsets	TokenNameIdentifier	 end Offsets
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// offset 	TokenNameCOMMENT_LINE	offset 
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
startOffsets	TokenNameIdentifier	 start Offsets
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
endOffsets	TokenNameIdentifier	 end Offsets
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// terms only 	TokenNameCOMMENT_LINE	terms only 
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
