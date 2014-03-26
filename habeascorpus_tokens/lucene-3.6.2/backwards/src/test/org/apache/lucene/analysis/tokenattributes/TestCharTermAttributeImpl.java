package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
CharBuffer	TokenNameIdentifier	 Char Buffer
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Formatter	TokenNameIdentifier	 Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCharTermAttributeImpl	TokenNameIdentifier	 Test Char Term Attribute Impl
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResize	TokenNameIdentifier	 test Resize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
"hello"	TokenNameStringLiteral	hello
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hello"	TokenNameStringLiteral	hello
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGrow	TokenNameIdentifier	 test Grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1048576	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now as a StringBuilder, first variant 	TokenNameCOMMENT_LINE	now as a StringBuilder, first variant 
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1048576	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Test for slow growth to a long term 	TokenNameCOMMENT_LINE	Test for slow growth to a long term 
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
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
20000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToString	TokenNameIdentifier	 test To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'h'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"aloha"	TokenNameStringLiteral	aloha
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"hi there"	TokenNameStringLiteral	hi there
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hi there"	TokenNameStringLiteral	hi there
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClone	TokenNameIdentifier	 test Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
"hello"	TokenNameStringLiteral	hello
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
)	TokenNameRPAREN	
TestSimpleAttributeImpls	TokenNameIdentifier	 Test Simple Attribute Impls
.	TokenNameDOT	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEquals	TokenNameIdentifier	 test Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t1a	TokenNameIdentifier	 t1a
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content1a	TokenNameIdentifier	 content1a
=	TokenNameEQUAL	
"hello"	TokenNameStringLiteral	hello
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t1a	TokenNameIdentifier	 t1a
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content1a	TokenNameIdentifier	 content1a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t1b	TokenNameIdentifier	 t1b
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content1b	TokenNameIdentifier	 content1b
=	TokenNameEQUAL	
"hello"	TokenNameStringLiteral	hello
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t1b	TokenNameIdentifier	 t1b
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content1b	TokenNameIdentifier	 content1b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content2	TokenNameIdentifier	 content2
=	TokenNameEQUAL	
"hello2"	TokenNameStringLiteral	hello2
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content2	TokenNameIdentifier	 content2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
t1a	TokenNameIdentifier	 t1a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t1b	TokenNameIdentifier	 t1b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
t1a	TokenNameIdentifier	 t1a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t1b	TokenNameIdentifier	 t1b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyTo	TokenNameIdentifier	 test Copy To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
)	TokenNameRPAREN	
TestSimpleAttributeImpls	TokenNameIdentifier	 Test Simple Attribute Impls
.	TokenNameDOT	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
"hello"	TokenNameStringLiteral	hello
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
)	TokenNameRPAREN	
TestSimpleAttributeImpls	TokenNameIdentifier	 Test Simple Attribute Impls
.	TokenNameDOT	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAttributeReflection	TokenNameIdentifier	 test Attribute Reflection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"foobar"	TokenNameStringLiteral	foobar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonMap	TokenNameIdentifier	 singleton Map
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#term"	TokenNameStringLiteral	#term
,	TokenNameCOMMA	
"foobar"	TokenNameStringLiteral	foobar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCharSequenceInterface	TokenNameIdentifier	 test Char Sequence Interface
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"0123456789"	TokenNameStringLiteral	0123456789
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"12"	TokenNameStringLiteral	12
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"01\d+"	TokenNameStringLiteral	01\d+
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"34"	TokenNameStringLiteral	34
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAppendableInterface	TokenNameIdentifier	 test Appendable Interface
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Formatter	TokenNameIdentifier	 Formatter
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
Formatter	TokenNameIdentifier	 Formatter
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%d"	TokenNameStringLiteral	%d
,	TokenNameCOMMA	
1234	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1234"	TokenNameStringLiteral	1234
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%d"	TokenNameStringLiteral	%d
,	TokenNameCOMMA	
5678	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"12345678"	TokenNameStringLiteral	12345678
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"123456789"	TokenNameStringLiteral	123456789
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1234567890"	TokenNameStringLiteral	1234567890
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"123456789012"	TokenNameStringLiteral	123456789012
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"12345678901234"	TokenNameStringLiteral	12345678901234
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1234567890123412345678901234"	TokenNameStringLiteral	1234567890123412345678901234
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"123456789012341234567890123456"	TokenNameStringLiteral	123456789012341234567890123456
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"123456789012341234567890123456123456789012341234567890123456"	TokenNameStringLiteral	123456789012341234567890123456123456789012341234567890123456
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very wierd, to test if a subSlice is wrapped correct :) 	TokenNameCOMMENT_LINE	very wierd, to test if a subSlice is wrapped correct :) 
CharBuffer	TokenNameIdentifier	 Char Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"34567"	TokenNameStringLiteral	34567
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4test"	TokenNameStringLiteral	4test
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4teste"	TokenNameStringLiteral	4teste
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IndexOutOfBoundsException"	TokenNameStringLiteral	Should throw IndexOutOfBoundsException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
iobe	TokenNameIdentifier	 iobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IndexOutOfBoundsException"	TokenNameStringLiteral	Should throw IndexOutOfBoundsException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
iobe	TokenNameIdentifier	 iobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4testenull"	TokenNameStringLiteral	4testenull
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAppendableInterfaceWithLongSequences	TokenNameIdentifier	 test Appendable Interface With Long Sequences
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
"01234567890123456789012345678901234567890123456789"	TokenNameStringLiteral	01234567890123456789012345678901234567890123456789
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
"01234567890123456789012345678901234567890123456789"	TokenNameStringLiteral	01234567890123456789012345678901234567890123456789
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"0123456789012345678901234567890123456789012345678934567890123456789012345678901234567890123456789"	TokenNameStringLiteral	0123456789012345678901234567890123456789012345678934567890123456789012345678901234567890123456789
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"01234567890123456789"	TokenNameStringLiteral	01234567890123456789
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
"567890123456"	TokenNameStringLiteral	567890123456
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
"567890123456567890123456"	TokenNameStringLiteral	567890123456567890123456
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// very wierd, to test if a subSlice is wrapped correct :) 	TokenNameCOMMENT_LINE	very wierd, to test if a subSlice is wrapped correct :) 
CharBuffer	TokenNameIdentifier	 Char Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
"012345678901234567890123456789"	TokenNameStringLiteral	012345678901234567890123456789
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"345678901234567"	TokenNameStringLiteral	345678901234567
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4567890123456"	TokenNameStringLiteral	4567890123456
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// finally use a completely custom CharSequence that is not catched by instanceof checks 	TokenNameCOMMENT_LINE	finally use a completely custom CharSequence that is not catched by instanceof checks 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
longTestString	TokenNameIdentifier	 long Test String
=	TokenNameEQUAL	
"012345678901234567890123456789"	TokenNameStringLiteral	012345678901234567890123456789
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
CharSequence	TokenNameIdentifier	 Char Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
longTestString	TokenNameIdentifier	 long Test String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
longTestString	TokenNameIdentifier	 long Test String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
longTestString	TokenNameIdentifier	 long Test String
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
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
longTestString	TokenNameIdentifier	 long Test String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4567890123456"	TokenNameStringLiteral	4567890123456
+	TokenNamePLUS	
longTestString	TokenNameIdentifier	 long Test String
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonCharSequenceAppend	TokenNameIdentifier	 test Non Char Sequence Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"01234567890123456789"	TokenNameStringLiteral	01234567890123456789
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"0123456789"	TokenNameStringLiteral	0123456789
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"012345678901234567890123456789"	TokenNameStringLiteral	012345678901234567890123456789
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"012345678901234567890123456789test"	TokenNameStringLiteral	012345678901234567890123456789test
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"012345678901234567890123456789testnullnullnull"	TokenNameStringLiteral	012345678901234567890123456789testnullnullnull
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExceptions	TokenNameIdentifier	 test Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IndexOutOfBoundsException"	TokenNameStringLiteral	Should throw IndexOutOfBoundsException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
iobe	TokenNameIdentifier	 iobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IndexOutOfBoundsException"	TokenNameStringLiteral	Should throw IndexOutOfBoundsException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
iobe	TokenNameIdentifier	 iobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IndexOutOfBoundsException"	TokenNameStringLiteral	Should throw IndexOutOfBoundsException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
iobe	TokenNameIdentifier	 iobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IndexOutOfBoundsException"	TokenNameStringLiteral	Should throw IndexOutOfBoundsException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
iobe	TokenNameIdentifier	 iobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* // test speed of the dynamic instanceof checks in append(CharSequence), // to find the best max length for the generic while (start<end) loop: public void testAppendPerf() { CharTermAttributeImpl t = new CharTermAttributeImpl(); final int count = 32; CharSequence[] csq = new CharSequence[count * 6]; final StringBuilder sb = new StringBuilder(); for (int i=0,j=0; i<count; i++) { sb.append(i%10); final String testString = sb.toString(); CharTermAttribute cta = new CharTermAttributeImpl(); cta.append(testString); csq[j++] = cta; csq[j++] = testString; csq[j++] = new StringBuilder(sb); csq[j++] = new StringBuffer(sb); csq[j++] = CharBuffer.wrap(testString.toCharArray()); csq[j++] = new CharSequence() { public char charAt(int i) { return testString.charAt(i); } public int length() { return testString.length(); } public CharSequence subSequence(int start, int end) { return testString.subSequence(start, end); } public String toString() { return testString; } }; } Random rnd = newRandom(); long startTime = System.currentTimeMillis(); for (int i=0; i<100000000; i++) { t.setEmpty().append(csq[rnd.nextInt(csq.length)]); } long endTime = System.currentTimeMillis(); System.out.println("Time: " + (endTime-startTime)/1000.0 + " s"); } */	TokenNameCOMMENT_BLOCK	 // test speed of the dynamic instanceof checks in append(CharSequence), // to find the best max length for the generic while (start<end) loop: public void testAppendPerf() { CharTermAttributeImpl t = new CharTermAttributeImpl(); final int count = 32; CharSequence[] csq = new CharSequence[count 6]; final StringBuilder sb = new StringBuilder(); for (int i=0,j=0; i<count; i++) { sb.append(i%10); final String testString = sb.toString(); CharTermAttribute cta = new CharTermAttributeImpl(); cta.append(testString); csq[j++] = cta; csq[j++] = testString; csq[j++] = new StringBuilder(sb); csq[j++] = new StringBuffer(sb); csq[j++] = CharBuffer.wrap(testString.toCharArray()); csq[j++] = new CharSequence() { public char charAt(int i) { return testString.charAt(i); } public int length() { return testString.length(); } public CharSequence subSequence(int start, int end) { return testString.subSequence(start, end); } public String toString() { return testString; } }; } Random rnd = newRandom(); long startTime = System.currentTimeMillis(); for (int i=0; i<100000000; i++) { t.setEmpty().append(csq[rnd.nextInt(csq.length)]); } long endTime = System.currentTimeMillis(); System.out.println("Time: " + (endTime-startTime)/1000.0 + " s"); } 
}	TokenNameRBRACE	
