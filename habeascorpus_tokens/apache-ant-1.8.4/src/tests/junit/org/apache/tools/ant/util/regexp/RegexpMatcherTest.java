/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests for all implementations of the RegexpMatcher interface. * */	TokenNameCOMMENT_JAVADOC	 Tests for all implementations of the RegexpMatcher interface. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
RegexpMatcherTest	TokenNameIdentifier	 Regexp Matcher Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
UNIX_LINE	TokenNameIdentifier	 UNIX  LINE
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
reg	TokenNameIdentifier	 reg
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
getReg	TokenNameIdentifier	 get Reg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reg	TokenNameIdentifier	 reg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RegexpMatcherTest	TokenNameIdentifier	 Regexp Matcher Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatches	TokenNameIdentifier	 test Matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"aaaa"	TokenNameStringLiteral	aaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa should match itself"	TokenNameStringLiteral	aaaa should match itself
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"aaaa"	TokenNameStringLiteral	aaaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa should match xaaaa"	TokenNameStringLiteral	aaaa should match xaaaa
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"xaaaa"	TokenNameStringLiteral	xaaaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa shouldn't match xaaa"	TokenNameStringLiteral	aaaa shouldn't match xaaa
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"xaaa"	TokenNameStringLiteral	xaaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"^aaaa"	TokenNameStringLiteral	^aaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^aaaa shouldn't match xaaaa"	TokenNameStringLiteral	^aaaa shouldn't match xaaaa
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"xaaaa"	TokenNameStringLiteral	xaaaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^aaaa should match aaaax"	TokenNameStringLiteral	^aaaa should match aaaax
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"aaaax"	TokenNameStringLiteral	aaaax
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"aaaa$"	TokenNameStringLiteral	aaaa$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa$ shouldn't match aaaax"	TokenNameStringLiteral	aaaa$ shouldn't match aaaax
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"aaaax"	TokenNameStringLiteral	aaaax
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa$ should match xaaaa"	TokenNameStringLiteral	aaaa$ should match xaaaa
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"xaaaa"	TokenNameStringLiteral	xaaaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"[0-9]+"	TokenNameStringLiteral	[0-9]+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]+ should match 123"	TokenNameStringLiteral	[0-9]+ should match 123
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"123"	TokenNameStringLiteral	123
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]+ should match 1"	TokenNameStringLiteral	[0-9]+ should match 1
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]+ shouldn't match ''"	TokenNameStringLiteral	[0-9]+ shouldn't match ''
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]+ shouldn't match a"	TokenNameStringLiteral	[0-9]+ shouldn't match a
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"[0-9]*"	TokenNameStringLiteral	[0-9]*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]* should match 123"	TokenNameStringLiteral	[0-9]* should match 123
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"123"	TokenNameStringLiteral	123
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]* should match 1"	TokenNameStringLiteral	[0-9]* should match 1
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]* should match ''"	TokenNameStringLiteral	[0-9]* should match ''
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"[0-9]* should match a"	TokenNameStringLiteral	[0-9]* should match a
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"([0-9]+)=\1"	TokenNameStringLiteral	([0-9]+)=\1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"([0-9]+)=\1 should match 1=1"	TokenNameStringLiteral	([0-9]+)=\1 should match 1=1
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"1=1"	TokenNameStringLiteral	1=1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"([0-9]+)=\1 shouldn't match 1=2"	TokenNameStringLiteral	([0-9]+)=\1 shouldn't match 1=2
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"1=2"	TokenNameStringLiteral	1=2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGroups	TokenNameIdentifier	 test Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"aaaa"	TokenNameStringLiteral	aaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
"xaaaa"	TokenNameStringLiteral	xaaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"No parens -> no extra groups"	TokenNameStringLiteral	No parens -> no extra groups
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Trivial match with no parens"	TokenNameStringLiteral	Trivial match with no parens
,	TokenNameCOMMA	
"aaaa"	TokenNameStringLiteral	aaaa
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"(aaaa)"	TokenNameStringLiteral	(aaaa)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
"xaaaa"	TokenNameStringLiteral	xaaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Trivial match with single paren"	TokenNameStringLiteral	Trivial match with single paren
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Trivial match with single paren, full match"	TokenNameStringLiteral	Trivial match with single paren, full match
,	TokenNameCOMMA	
"aaaa"	TokenNameStringLiteral	aaaa
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Trivial match with single paren, matched paren"	TokenNameStringLiteral	Trivial match with single paren, matched paren
,	TokenNameCOMMA	
"aaaa"	TokenNameStringLiteral	aaaa
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"(a+)b(b+)"	TokenNameStringLiteral	(a+)b(b+)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
"xaabb"	TokenNameStringLiteral	xaabb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"aabb"	TokenNameStringLiteral	aabb
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"aa"	TokenNameStringLiteral	aa
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBugzillaReport14619	TokenNameIdentifier	 test Bugzilla Report14619
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"^(.*)/src/((.*/)*)([a-zA-Z0-9_\.]+)\.java$"	TokenNameStringLiteral	^(.*)/src/((.*/)*)([a-zA-Z0-9_\.]+)\.java$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
"de/tom/src/Google.java"	TokenNameStringLiteral	de/tom/src/Google.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"de/tom"	TokenNameStringLiteral	de/tom
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Google"	TokenNameStringLiteral	Google
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCaseInsensitiveMatch	TokenNameIdentifier	 test Case Insensitive Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"aaaa"	TokenNameStringLiteral	aaaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa doesn't match AAaa"	TokenNameStringLiteral	aaaa doesn't match AAaa
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"AAaa"	TokenNameStringLiteral	AAaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"aaaa matches AAaa ignoring case"	TokenNameStringLiteral	aaaa matches AAaa ignoring case
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"AAaa"	TokenNameStringLiteral	AAaa
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_CASE_INSENSITIVE	TokenNameIdentifier	 MATCH  CASE  INSENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure there are no issues concerning line separator interpretation 	TokenNameCOMMENT_LINE	make sure there are no issues concerning line separator interpretation 
// a line separator for regex (perl) is always a unix line (ie \n) 	TokenNameCOMMENT_LINE	a line separator for regex (perl) is always a unix line (ie \n) 
public	TokenNamepublic	
void	TokenNamevoid	
testParagraphCharacter	TokenNameIdentifier	 test Paragraph Character
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text$"	TokenNameStringLiteral	end of text$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"paragraph character"	TokenNameStringLiteral	paragraph character
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text?"	TokenNameStringLiteral	end of text?
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineSeparatorCharacter	TokenNameIdentifier	 test Line Separator Character
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text$"	TokenNameStringLiteral	end of text$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"line-separator character"	TokenNameStringLiteral	line-separator character
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text?"	TokenNameStringLiteral	end of text?
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNextLineCharacter	TokenNameIdentifier	 test Next Line Character
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text$"	TokenNameStringLiteral	end of text$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"next-line character"	TokenNameStringLiteral	next-line character
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text?"	TokenNameStringLiteral	end of text?
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStandaloneCR	TokenNameIdentifier	 test Standalone CR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text$"	TokenNameStringLiteral	end of text$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"standalone CR"	TokenNameStringLiteral	standalone CR
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text "	TokenNameStringLiteral	end of text 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWindowsLineSeparator	TokenNameIdentifier	 test Windows Line Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text$"	TokenNameStringLiteral	end of text$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Windows line separator"	TokenNameStringLiteral	Windows line separator
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text "	TokenNameStringLiteral	end of text 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWindowsLineSeparator2	TokenNameIdentifier	 test Windows Line Separator2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text $"	TokenNameStringLiteral	end of text $
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Windows line separator"	TokenNameStringLiteral	Windows line separator
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text "	TokenNameStringLiteral	end of text 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnixLineSeparator	TokenNameIdentifier	 test Unix Line Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"end of text$"	TokenNameStringLiteral	end of text$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Unix line separator"	TokenNameStringLiteral	Unix line separator
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"end of text "	TokenNameStringLiteral	end of text 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultiVersusSingleLine	TokenNameIdentifier	 test Multi Versus Single Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Line1"	TokenNameStringLiteral	Line1
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
UNIX_LINE	TokenNameIdentifier	 UNIX  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"starttest Line2"	TokenNameStringLiteral	starttest Line2
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
UNIX_LINE	TokenNameIdentifier	 UNIX  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Line3 endtest"	TokenNameStringLiteral	Line3 endtest
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
UNIX_LINE	TokenNameIdentifier	 UNIX  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Line4"	TokenNameStringLiteral	Line4
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
UNIX_LINE	TokenNameIdentifier	 UNIX  LINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doStartTest1	TokenNameIdentifier	 do Start Test1
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doStartTest2	TokenNameIdentifier	 do Start Test2
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doEndTest1	TokenNameIdentifier	 do End Test1
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doEndTest2	TokenNameIdentifier	 do End Test2
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
doStartTest1	TokenNameIdentifier	 do Start Test1
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"^starttest"	TokenNameStringLiteral	^starttest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^starttest in default mode"	TokenNameStringLiteral	^starttest in default mode
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^starttest in single line mode"	TokenNameStringLiteral	^starttest in single line mode
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^starttest in multi line mode"	TokenNameStringLiteral	^starttest in multi line mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
doStartTest2	TokenNameIdentifier	 do Start Test2
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"^Line1"	TokenNameStringLiteral	^Line1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^Line1 in default mode"	TokenNameStringLiteral	^Line1 in default mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^Line1 in single line mode"	TokenNameStringLiteral	^Line1 in single line mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"^Line1 in multi line mode"	TokenNameStringLiteral	^Line1 in multi line mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
doEndTest1	TokenNameIdentifier	 do End Test1
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"endtest$"	TokenNameStringLiteral	endtest$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"endtest$ in default mode"	TokenNameStringLiteral	endtest$ in default mode
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"endtest$ in single line mode"	TokenNameStringLiteral	endtest$ in single line mode
,	TokenNameCOMMA	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"endtest$ in multi line mode"	TokenNameStringLiteral	endtest$ in multi line mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
doEndTest2	TokenNameIdentifier	 do End Test2
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"Line4$"	TokenNameStringLiteral	Line4$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Line4$ in default mode"	TokenNameStringLiteral	Line4$ in default mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Line4$ in single line mode"	TokenNameStringLiteral	Line4$ in single line mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Line4$ in multi line mode"	TokenNameStringLiteral	Line4$ in multi line mode
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
