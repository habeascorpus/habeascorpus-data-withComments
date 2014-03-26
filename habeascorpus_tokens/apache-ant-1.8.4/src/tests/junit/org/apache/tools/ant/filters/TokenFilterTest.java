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
filters	TokenNameIdentifier	 filters
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
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
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildFileTest	TokenNameIdentifier	 Build File Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
TokenFilterTest	TokenNameIdentifier	 Token Filter Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TokenFilterTest	TokenNameIdentifier	 Token Filter Test
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
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/filters/tokenfilter.xml"	TokenNameStringLiteral	src/etc/testcases/filters/tokenfilter.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"init"	TokenNameStringLiteral	init
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** make sure tokenfilter exists */	TokenNameCOMMENT_JAVADOC	 make sure tokenfilter exists 
public	TokenNamepublic	
void	TokenNamevoid	
testTokenfilter	TokenNameIdentifier	 test Tokenfilter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"tokenfilter"	TokenNameStringLiteral	tokenfilter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTrimignore	TokenNameIdentifier	 test Trimignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"trimignore"	TokenNameStringLiteral	trimignore
,	TokenNameCOMMA	
"Hello-World"	TokenNameStringLiteral	Hello-World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStringTokenizer	TokenNameIdentifier	 test String Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"stringtokenizer"	TokenNameStringLiteral	stringtokenizer
,	TokenNameCOMMA	
"#This#is#a#number#of#words#"	TokenNameStringLiteral	#This#is#a#number#of#words#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnixLineOutput	TokenNameIdentifier	 test Unix Line Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"unixlineoutput"	TokenNameStringLiteral	unixlineoutput
,	TokenNameCOMMA	
"result/unixlineoutput"	TokenNameStringLiteral	result/unixlineoutput
,	TokenNameCOMMA	
" This is a number of words "	TokenNameStringLiteral	 This is a number of words 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDosLineOutput	TokenNameIdentifier	 test Dos Line Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"doslineoutput"	TokenNameStringLiteral	doslineoutput
,	TokenNameCOMMA	
"result/doslineoutput"	TokenNameStringLiteral	result/doslineoutput
,	TokenNameCOMMA	
" This is a number of words "	TokenNameStringLiteral	 This is a number of words 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFileTokenizer	TokenNameIdentifier	 test File Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"filetokenizer"	TokenNameStringLiteral	filetokenizer
,	TokenNameCOMMA	
"result/filetokenizer"	TokenNameStringLiteral	result/filetokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
" of words"	TokenNameStringLiteral	 of words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
" This is"	TokenNameStringLiteral	 This is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReplaceString	TokenNameIdentifier	 test Replace String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"replacestring"	TokenNameStringLiteral	replacestring
,	TokenNameCOMMA	
"result/replacestring"	TokenNameStringLiteral	result/replacestring
,	TokenNameCOMMA	
"this is the moon"	TokenNameStringLiteral	this is the moon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReplaceStrings	TokenNameIdentifier	 test Replace Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"replacestrings"	TokenNameStringLiteral	replacestrings
,	TokenNameCOMMA	
"bar bar bar"	TokenNameStringLiteral	bar bar bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsString	TokenNameIdentifier	 test Contains String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"containsstring"	TokenNameStringLiteral	containsstring
,	TokenNameCOMMA	
"result/containsstring"	TokenNameStringLiteral	result/containsstring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"this is a line contains foo"	TokenNameStringLiteral	this is a line contains foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"this line does not"	TokenNameStringLiteral	this line does not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReplaceRegex	TokenNameIdentifier	 test Replace Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
"testReplaceRegex"	TokenNameStringLiteral	testReplaceRegex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"replaceregex"	TokenNameStringLiteral	replaceregex
,	TokenNameCOMMA	
"result/replaceregex"	TokenNameStringLiteral	result/replaceregex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"world world world world"	TokenNameStringLiteral	world world world world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"dog Cat dog"	TokenNameStringLiteral	dog Cat dog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"moon Sun Sun"	TokenNameStringLiteral	moon Sun Sun
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"found WhiteSpace"	TokenNameStringLiteral	found WhiteSpace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"Found digits [1234]"	TokenNameStringLiteral	Found digits [1234]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"This is a line with digits"	TokenNameStringLiteral	This is a line with digits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReplaceRegex	TokenNameIdentifier	 test Filter Replace Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
"testFilterReplaceRegex"	TokenNameStringLiteral	testFilterReplaceRegex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"filterreplaceregex"	TokenNameStringLiteral	filterreplaceregex
,	TokenNameCOMMA	
"result/filterreplaceregex"	TokenNameStringLiteral	result/filterreplaceregex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"world world world world"	TokenNameStringLiteral	world world world world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHandleDollerMatch	TokenNameIdentifier	 test Handle Doller Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
"testFilterReplaceRegex"	TokenNameStringLiteral	testFilterReplaceRegex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"dollermatch"	TokenNameStringLiteral	dollermatch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTrimFile	TokenNameIdentifier	 test Trim File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"trimfile"	TokenNameStringLiteral	trimfile
,	TokenNameCOMMA	
"result/trimfile"	TokenNameStringLiteral	result/trimfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"no ws at start"	TokenNameStringLiteral	no ws at start
,	TokenNameCOMMA	
contents	TokenNameIdentifier	 contents
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"This is th"	TokenNameStringLiteral	This is th
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"no ws at end"	TokenNameStringLiteral	no ws at end
,	TokenNameCOMMA	
contents	TokenNameIdentifier	 contents
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"second line."	TokenNameStringLiteral	second line.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
" This is the second"	TokenNameStringLiteral	 This is the second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTrimFileByLine	TokenNameIdentifier	 test Trim File By Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"trimfilebyline"	TokenNameStringLiteral	trimfilebyline
,	TokenNameCOMMA	
"result/trimfilebyline"	TokenNameStringLiteral	result/trimfilebyline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"no ws at start"	TokenNameStringLiteral	no ws at start
,	TokenNameCOMMA	
contents	TokenNameIdentifier	 contents
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"This is th"	TokenNameStringLiteral	This is th
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"no ws at end"	TokenNameStringLiteral	no ws at end
,	TokenNameCOMMA	
contents	TokenNameIdentifier	 contents
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"second line."	TokenNameStringLiteral	second line.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
" This is the second"	TokenNameStringLiteral	 This is the second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"file. This is the second"	TokenNameStringLiteral	file. This is the second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReplaceString	TokenNameIdentifier	 test Filter Replace String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"filterreplacestring"	TokenNameStringLiteral	filterreplacestring
,	TokenNameCOMMA	
"result/filterreplacestring"	TokenNameStringLiteral	result/filterreplacestring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"This is the moon"	TokenNameStringLiteral	This is the moon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReplaceStrings	TokenNameIdentifier	 test Filter Replace Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"filterreplacestrings"	TokenNameStringLiteral	filterreplacestrings
,	TokenNameCOMMA	
"bar bar bar"	TokenNameStringLiteral	bar bar bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsRegex	TokenNameIdentifier	 test Contains Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
"testContainsRegex"	TokenNameStringLiteral	testContainsRegex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"containsregex"	TokenNameStringLiteral	containsregex
,	TokenNameCOMMA	
"result/containsregex"	TokenNameStringLiteral	result/containsregex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"hello world"	TokenNameStringLiteral	hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"this is the moon"	TokenNameStringLiteral	this is the moon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"World here"	TokenNameStringLiteral	World here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterContainsRegex	TokenNameIdentifier	 test Filter Contains Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
"testFilterContainsRegex"	TokenNameStringLiteral	testFilterContainsRegex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"filtercontainsregex"	TokenNameStringLiteral	filtercontainsregex
,	TokenNameCOMMA	
"result/filtercontainsregex"	TokenNameStringLiteral	result/filtercontainsregex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"hello world"	TokenNameStringLiteral	hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"this is the moon"	TokenNameStringLiteral	this is the moon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"World here"	TokenNameStringLiteral	World here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsRegex2	TokenNameIdentifier	 test Contains Regex2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
"testContainsRegex2"	TokenNameStringLiteral	testContainsRegex2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"containsregex2"	TokenNameStringLiteral	containsregex2
,	TokenNameCOMMA	
"result/containsregex2"	TokenNameStringLiteral	result/containsregex2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"void register_bits();"	TokenNameStringLiteral	void register_bits();
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDeleteCharacters	TokenNameIdentifier	 test Delete Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
"deletecharacters"	TokenNameStringLiteral	deletecharacters
,	TokenNameCOMMA	
"result/deletechars"	TokenNameStringLiteral	result/deletechars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
"This is some "	TokenNameStringLiteral	This is some 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testScriptFilter	TokenNameIdentifier	 test Script Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasScript	TokenNameIdentifier	 has Script
(	TokenNameLPAREN	
"testScriptFilter"	TokenNameStringLiteral	testScriptFilter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"scriptfilter"	TokenNameStringLiteral	scriptfilter
,	TokenNameCOMMA	
"result/scriptfilter"	TokenNameStringLiteral	result/scriptfilter
,	TokenNameCOMMA	
"HELLO WORLD"	TokenNameStringLiteral	HELLO WORLD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testScriptFilter2	TokenNameIdentifier	 test Script Filter2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasScript	TokenNameIdentifier	 has Script
(	TokenNameLPAREN	
"testScriptFilter"	TokenNameStringLiteral	testScriptFilter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"scriptfilter2"	TokenNameStringLiteral	scriptfilter2
,	TokenNameCOMMA	
"result/scriptfilter2"	TokenNameStringLiteral	result/scriptfilter2
,	TokenNameCOMMA	
"HELLO MOON"	TokenNameStringLiteral	HELLO MOON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCustomTokenFilter	TokenNameIdentifier	 test Custom Token Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"customtokenfilter"	TokenNameStringLiteral	customtokenfilter
,	TokenNameCOMMA	
"result/custom"	TokenNameStringLiteral	result/custom
,	TokenNameCOMMA	
"Hello World"	TokenNameStringLiteral	Hello World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------ 
// Helper methods 	TokenNameCOMMENT_LINE	Helper methods 
// ----------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------- 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasScript	TokenNameIdentifier	 has Script
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"hasscript"	TokenNameStringLiteral	hasscript
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
": skipped - script not present "	TokenNameStringLiteral	: skipped - script not present 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasRegex	TokenNameIdentifier	 has Regex
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"hasregex"	TokenNameStringLiteral	hasregex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
"result/replaceregexp"	TokenNameStringLiteral	result/replaceregexp
,	TokenNameCOMMA	
"bye world"	TokenNameStringLiteral	bye world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
": skipped - regex not present "	TokenNameStringLiteral	: skipped - regex not present 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertStringContains	TokenNameIdentifier	 assert String Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
string	TokenNameIdentifier	 string
+	TokenNamePLUS	
"] does not contain ["	TokenNameStringLiteral	] does not contain [
+	TokenNamePLUS	
contains	TokenNameIdentifier	 contains
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertStringNotContains	TokenNameIdentifier	 assert String Not Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
string	TokenNameIdentifier	 string
+	TokenNamePLUS	
"] does contain ["	TokenNameStringLiteral	] does contain [
+	TokenNamePLUS	
contains	TokenNameIdentifier	 contains
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
getFileString	TokenNameIdentifier	 get File String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting file "	TokenNameStringLiteral	expecting file 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" to contain "	TokenNameStringLiteral	 to contain 
+	TokenNamePLUS	
contains	TokenNameIdentifier	 contains
+	TokenNamePLUS	
" but got "	TokenNameStringLiteral	 but got 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectFileContains	TokenNameIdentifier	 expect File Contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Capitalize	TokenNameIdentifier	 Capitalize
implements	TokenNameimplements	
TokenFilter	TokenNameIdentifier	 Token Filter
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
