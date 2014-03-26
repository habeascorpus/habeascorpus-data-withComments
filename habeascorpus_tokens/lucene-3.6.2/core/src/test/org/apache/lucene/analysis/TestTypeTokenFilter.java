package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
English	TokenNameIdentifier	 English
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestTypeTokenFilter	TokenNameIdentifier	 Test Type Token Filter
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTypeFilter	TokenNameIdentifier	 test Type Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringReader	TokenNameIdentifier	 String Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"121 is palindrome, while 123 is not"	TokenNameStringLiteral	121 is palindrome, while 123 is not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopTypes	TokenNameIdentifier	 stop Types
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
"<NUM>"	TokenNameStringLiteral	<NUM>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stopTypes	TokenNameIdentifier	 stop Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"palindrome"	TokenNameStringLiteral	palindrome
,	TokenNameCOMMA	
"while"	TokenNameStringLiteral	while
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"not"	TokenNameStringLiteral	not
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test Position increments applied by TypeTokenFilter with and without enabling this option. */	TokenNameCOMMENT_JAVADOC	 Test Position increments applied by TypeTokenFilter with and without enabling this option. 
public	TokenNamepublic	
void	TokenNamevoid	
testStopPositons	TokenNameIdentifier	 test Stop Positons
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
English	TokenNameIdentifier	 English
.	TokenNameDOT	
intToEnglish	TokenNameIdentifier	 int To English
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopSet	TokenNameIdentifier	 stop Set
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
"<NUM>"	TokenNameStringLiteral	<NUM>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// with increments 	TokenNameCOMMENT_LINE	with increments 
StringReader	TokenNameIdentifier	 String Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
typeTokenFilter	TokenNameIdentifier	 type Token Filter
=	TokenNameEQUAL	
new	TokenNamenew	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stopSet	TokenNameIdentifier	 stop Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testPositons	TokenNameIdentifier	 test Positons
(	TokenNameLPAREN	
typeTokenFilter	TokenNameIdentifier	 type Token Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// without increments 	TokenNameCOMMENT_LINE	without increments 
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeTokenFilter	TokenNameIdentifier	 type Token Filter
=	TokenNameEQUAL	
new	TokenNamenew	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stopSet	TokenNameIdentifier	 stop Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testPositons	TokenNameIdentifier	 test Positons
(	TokenNameLPAREN	
typeTokenFilter	TokenNameIdentifier	 type Token Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testPositons	TokenNameIdentifier	 test Positons
(	TokenNameLPAREN	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
stpf	TokenNameIdentifier	 stpf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAttribute	TokenNameIdentifier	 term Attribute
=	TokenNameEQUAL	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
=	TokenNameEQUAL	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
getEnablePositionIncrements	TokenNameIdentifier	 get Enable Position Increments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Token: "	TokenNameStringLiteral	Token: 
+	TokenNamePLUS	
termAttribute	TokenNameIdentifier	 term Attribute
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"if position increment is enabled the positionIncrementAttribute value should be 3, otherwise 1"	TokenNameStringLiteral	if position increment is enabled the positionIncrementAttribute value should be 3, otherwise 1
,	TokenNameCOMMA	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
?	TokenNameQUESTION	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stpf	TokenNameIdentifier	 stpf
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTypeFilterWhitelist	TokenNameIdentifier	 test Type Filter Whitelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringReader	TokenNameIdentifier	 String Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"121 is palindrome, while 123 is not"	TokenNameStringLiteral	121 is palindrome, while 123 is not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopTypes	TokenNameIdentifier	 stop Types
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
"<NUM>"	TokenNameStringLiteral	<NUM>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
TypeTokenFilter	TokenNameIdentifier	 Type Token Filter
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stopTypes	TokenNameIdentifier	 stop Types
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"121"	TokenNameStringLiteral	121
,	TokenNameCOMMA	
"123"	TokenNameStringLiteral	123
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// print debug info depending on VERBOSE 	TokenNameCOMMENT_LINE	print debug info depending on VERBOSE 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
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
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
