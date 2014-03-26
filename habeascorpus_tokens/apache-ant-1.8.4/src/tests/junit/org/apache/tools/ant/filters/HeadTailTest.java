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
File	TokenNameIdentifier	 File
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
/** JUnit Testcases for TailFilter and HeadFilter */	TokenNameCOMMENT_JAVADOC	 JUnit Testcases for TailFilter and HeadFilter 
/* I wrote the testcases in one java file because I want also to test the * combined behaviour (see end of the class). */	TokenNameCOMMENT_BLOCK	 I wrote the testcases in one java file because I want also to test the combined behaviour (see end of the class). 
public	TokenNamepublic	
class	TokenNameclass	
HeadTailTest	TokenNameIdentifier	 Head Tail Test
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
HeadTailTest	TokenNameIdentifier	 Head Tail Test
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
"src/etc/testcases/filters/head-tail.xml"	TokenNameStringLiteral	src/etc/testcases/filters/head-tail.xml
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
public	TokenNamepublic	
void	TokenNamevoid	
testHead	TokenNameIdentifier	 test Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testHead"	TokenNameStringLiteral	testHead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.head.test"	TokenNameStringLiteral	expected/head-tail.head.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.head.test"	TokenNameStringLiteral	result/head-tail.head.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testHead: Result not like expected"	TokenNameStringLiteral	testHead: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHeadLines	TokenNameIdentifier	 test Head Lines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testHeadLines"	TokenNameStringLiteral	testHeadLines
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.headLines.test"	TokenNameStringLiteral	expected/head-tail.headLines.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.headLines.test"	TokenNameStringLiteral	result/head-tail.headLines.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testHeadLines: Result not like expected"	TokenNameStringLiteral	testHeadLines: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHeadSkip	TokenNameIdentifier	 test Head Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testHeadSkip"	TokenNameStringLiteral	testHeadSkip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.headSkip.test"	TokenNameStringLiteral	expected/head-tail.headSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.headSkip.test"	TokenNameStringLiteral	result/head-tail.headSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testHeadSkip: Result not like expected"	TokenNameStringLiteral	testHeadSkip: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHeadLinesSkip	TokenNameIdentifier	 test Head Lines Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testHeadLinesSkip"	TokenNameStringLiteral	testHeadLinesSkip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.headLinesSkip.test"	TokenNameStringLiteral	expected/head-tail.headLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.headLinesSkip.test"	TokenNameStringLiteral	result/head-tail.headLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testHeadLinesSkip: Result not like expected"	TokenNameStringLiteral	testHeadLinesSkip: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReaderHeadLinesSkip	TokenNameIdentifier	 test Filter Reader Head Lines Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilterReaderHeadLinesSkip"	TokenNameStringLiteral	testFilterReaderHeadLinesSkip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.headLinesSkip.test"	TokenNameStringLiteral	expected/head-tail.headLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.filterReaderHeadLinesSkip.test"	TokenNameStringLiteral	result/head-tail.filterReaderHeadLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testFilterReaderHeadLinesSkip: Result not like expected"	TokenNameStringLiteral	testFilterReaderHeadLinesSkip: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTail	TokenNameIdentifier	 test Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testTail"	TokenNameStringLiteral	testTail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.tail.test"	TokenNameStringLiteral	expected/head-tail.tail.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.tail.test"	TokenNameStringLiteral	result/head-tail.tail.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testTail: Result not like expected"	TokenNameStringLiteral	testTail: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTailLines	TokenNameIdentifier	 test Tail Lines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testTailLines"	TokenNameStringLiteral	testTailLines
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.tailLines.test"	TokenNameStringLiteral	expected/head-tail.tailLines.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.tailLines.test"	TokenNameStringLiteral	result/head-tail.tailLines.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testTailLines: Result not like expected"	TokenNameStringLiteral	testTailLines: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTailSkip	TokenNameIdentifier	 test Tail Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testTailSkip"	TokenNameStringLiteral	testTailSkip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.tailSkip.test"	TokenNameStringLiteral	expected/head-tail.tailSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.tailSkip.test"	TokenNameStringLiteral	result/head-tail.tailSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testTailSkip: Result not like expected"	TokenNameStringLiteral	testTailSkip: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTailLinesSkip	TokenNameIdentifier	 test Tail Lines Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testTailLinesSkip"	TokenNameStringLiteral	testTailLinesSkip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.tailLinesSkip.test"	TokenNameStringLiteral	expected/head-tail.tailLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.tailLinesSkip.test"	TokenNameStringLiteral	result/head-tail.tailLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testTailLinesSkip: Result not like expected"	TokenNameStringLiteral	testTailLinesSkip: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReaderTailLinesSkip	TokenNameIdentifier	 test Filter Reader Tail Lines Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilterReaderTailLinesSkip"	TokenNameStringLiteral	testFilterReaderTailLinesSkip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.tailLinesSkip.test"	TokenNameStringLiteral	expected/head-tail.tailLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.filterReaderTailLinesSkip.test"	TokenNameStringLiteral	result/head-tail.filterReaderTailLinesSkip.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testFilterReaderTailLinesSkip: Result not like expected"	TokenNameStringLiteral	testFilterReaderTailLinesSkip: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHeadTail	TokenNameIdentifier	 test Head Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testHeadTail"	TokenNameStringLiteral	testHeadTail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
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
"expected/head-tail.headtail.test"	TokenNameStringLiteral	expected/head-tail.headtail.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
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
"result/head-tail.headtail.test"	TokenNameStringLiteral	result/head-tail.headtail.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testHeadTail: Result not like expected"	TokenNameStringLiteral	testHeadTail: Result not like expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
