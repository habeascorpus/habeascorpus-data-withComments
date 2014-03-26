package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UCharacter	TokenNameIdentifier	 U Character
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
UTF16	TokenNameIdentifier	 UT F16
;	TokenNameSEMICOLON	
/** * Tests LaoBreakIterator and its RBBI rules */	TokenNameCOMMENT_JAVADOC	 Tests LaoBreakIterator and its RBBI rules 
public	TokenNamepublic	
class	TokenNameclass	
TestLaoBreakIterator	TokenNameIdentifier	 Test Lao Break Iterator
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
BreakIterator	TokenNameIdentifier	 Break Iterator
wordIterator	TokenNameIdentifier	 word Iterator
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"Lao.brk"	TokenNameStringLiteral	Lao.brk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordIterator	TokenNameIdentifier	 word Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
LaoBreakIterator	TokenNameIdentifier	 Lao Break Iterator
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
getInstanceFromCompiledRules	TokenNameIdentifier	 get Instance From Compiled Rules
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sourceText	TokenNameIdentifier	 source Text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sourceText	TokenNameIdentifier	 source Text
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
ci	TokenNameIdentifier	 ci
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ci	TokenNameIdentifier	 ci
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
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
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
&&	TokenNameAND_AND	
!	TokenNameNOT	
isWord	TokenNameIdentifier	 is Word
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isWord	TokenNameIdentifier	 is Word
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
codepoint	TokenNameIdentifier	 codepoint
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
getCharCount	TokenNameIdentifier	 get Char Count
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codepoint	TokenNameIdentifier	 codepoint
=	TokenNameEQUAL	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
UCharacter	TokenNameIdentifier	 U Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasicUsage	TokenNameIdentifier	 test Basic Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
"ກວ່າດອກ"	TokenNameStringLiteral	ກວ່າດອກ
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ກວ່າ"	TokenNameStringLiteral	ກວ່າ
,	TokenNameCOMMA	
"ດອກ"	TokenNameStringLiteral	ດອກ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
"ຜູ້​ເຂົ້າ"	TokenNameStringLiteral	ຜູ້​ເຂົ້າ
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ຜູ້"	TokenNameStringLiteral	ຜູ້
,	TokenNameCOMMA	
"ເຂົ້າ"	TokenNameStringLiteral	ເຂົ້າ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
"ສະບາຍດີ"	TokenNameStringLiteral	ສະບາຍດີ
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ສະ"	TokenNameStringLiteral	ສະ
,	TokenNameCOMMA	
"ບາຍ"	TokenNameStringLiteral	ບາຍ
,	TokenNameCOMMA	
"ດີ"	TokenNameStringLiteral	ດີ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNumerics	TokenNameIdentifier	 test Numerics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
"໐໑໒໓"	TokenNameStringLiteral	໐໑໒໓
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"໐໑໒໓"	TokenNameStringLiteral	໐໑໒໓
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
"໐໑໒໓.໕໖"	TokenNameStringLiteral	໐໑໒໓.໕໖
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"໐໑໒໓.໕໖"	TokenNameStringLiteral	໐໑໒໓.໕໖
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTextAndNumerics	TokenNameIdentifier	 test Text And Numerics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertBreaksTo	TokenNameIdentifier	 assert Breaks To
(	TokenNameLPAREN	
wordIterator	TokenNameIdentifier	 word Iterator
,	TokenNameCOMMA	
"ກວ່າດອກ໐໑໒໓"	TokenNameStringLiteral	ກວ່າດອກ໐໑໒໓
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ກວ່າ"	TokenNameStringLiteral	ກວ່າ
,	TokenNameCOMMA	
"ດອກ"	TokenNameStringLiteral	ດອກ
,	TokenNameCOMMA	
"໐໑໒໓"	TokenNameStringLiteral	໐໑໒໓
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
