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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * JUnit Testcases for ConcatReader */	TokenNameCOMMENT_JAVADOC	 JUnit Testcases for ConcatReader 
public	TokenNamepublic	
class	TokenNameclass	
ConcatFilterTest	TokenNameIdentifier	 Concat Filter Test
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
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lSep	TokenNameIdentifier	 l Sep
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_PREPEND_WITH	TokenNameIdentifier	 FILE  PREPEND  WITH
=	TokenNameEQUAL	
"this-should-be-the-first-line"	TokenNameStringLiteral	this-should-be-the-first-line
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 1"	TokenNameStringLiteral	Line 1
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 2"	TokenNameStringLiteral	Line 2
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 3"	TokenNameStringLiteral	Line 3
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 4"	TokenNameStringLiteral	Line 4
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_PREPEND	TokenNameIdentifier	 FILE  PREPEND
=	TokenNameEQUAL	
"Line 1"	TokenNameStringLiteral	Line 1
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 2"	TokenNameStringLiteral	Line 2
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 3"	TokenNameStringLiteral	Line 3
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 4"	TokenNameStringLiteral	Line 4
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 5"	TokenNameStringLiteral	Line 5
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_APPEND_WITH	TokenNameIdentifier	 FILE  APPEND  WITH
=	TokenNameEQUAL	
"Line 57"	TokenNameStringLiteral	Line 57
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 58"	TokenNameStringLiteral	Line 58
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 59"	TokenNameStringLiteral	Line 59
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 60"	TokenNameStringLiteral	Line 60
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"this-should-be-the-last-line"	TokenNameStringLiteral	this-should-be-the-last-line
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_APPEND	TokenNameIdentifier	 FILE  APPEND
=	TokenNameEQUAL	
"Line 56"	TokenNameStringLiteral	Line 56
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 57"	TokenNameStringLiteral	Line 57
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 58"	TokenNameStringLiteral	Line 58
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 59"	TokenNameStringLiteral	Line 59
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
+	TokenNamePLUS	
"Line 60"	TokenNameStringLiteral	Line 60
+	TokenNamePLUS	
lSep	TokenNameIdentifier	 l Sep
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ConcatFilterTest	TokenNameIdentifier	 Concat Filter Test
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
"src/etc/testcases/filters/concat.xml"	TokenNameStringLiteral	src/etc/testcases/filters/concat.xml
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
testFilterReaderNoArgs	TokenNameIdentifier	 test Filter Reader No Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilterReaderNoArgs"	TokenNameStringLiteral	testFilterReaderNoArgs
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
"input/concatfilter.test"	TokenNameStringLiteral	input/concatfilter.test
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
"result/concat.FilterReaderNoArgs.test"	TokenNameStringLiteral	result/concat.FilterReaderNoArgs.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"testFilterReaderNoArgs: Result not like expected"	TokenNameStringLiteral	testFilterReaderNoArgs: Result not like expected
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
testFilterReaderBefore	TokenNameIdentifier	 test Filter Reader Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testFilterReaderPrepend"	TokenNameStringLiteral	testFilterReaderPrepend
,	TokenNameCOMMA	
FILE_PREPEND_WITH	TokenNameIdentifier	 FILE  PREPEND  WITH
,	TokenNameCOMMA	
FILE_APPEND	TokenNameIdentifier	 FILE  APPEND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReaderAfter	TokenNameIdentifier	 test Filter Reader After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testFilterReaderAppend"	TokenNameStringLiteral	testFilterReaderAppend
,	TokenNameCOMMA	
FILE_PREPEND	TokenNameIdentifier	 FILE  PREPEND
,	TokenNameCOMMA	
FILE_APPEND_WITH	TokenNameIdentifier	 FILE  APPEND  WITH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilterReaderBeforeAfter	TokenNameIdentifier	 test Filter Reader Before After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testFilterReaderPrependAppend"	TokenNameStringLiteral	testFilterReaderPrependAppend
,	TokenNameCOMMA	
FILE_PREPEND_WITH	TokenNameIdentifier	 FILE  PREPEND  WITH
,	TokenNameCOMMA	
FILE_APPEND_WITH	TokenNameIdentifier	 FILE  APPEND  WITH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConcatFilter	TokenNameIdentifier	 test Concat Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testConcatFilter"	TokenNameStringLiteral	testConcatFilter
,	TokenNameCOMMA	
FILE_PREPEND	TokenNameIdentifier	 FILE  PREPEND
,	TokenNameCOMMA	
FILE_APPEND	TokenNameIdentifier	 FILE  APPEND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConcatFilterBefore	TokenNameIdentifier	 test Concat Filter Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testConcatFilterPrepend"	TokenNameStringLiteral	testConcatFilterPrepend
,	TokenNameCOMMA	
FILE_PREPEND_WITH	TokenNameIdentifier	 FILE  PREPEND  WITH
,	TokenNameCOMMA	
FILE_APPEND	TokenNameIdentifier	 FILE  APPEND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConcatFilterAfter	TokenNameIdentifier	 test Concat Filter After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testConcatFilterAppend"	TokenNameStringLiteral	testConcatFilterAppend
,	TokenNameCOMMA	
FILE_PREPEND	TokenNameIdentifier	 FILE  PREPEND
,	TokenNameCOMMA	
FILE_APPEND_WITH	TokenNameIdentifier	 FILE  APPEND  WITH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConcatFilterBeforeAfter	TokenNameIdentifier	 test Concat Filter Before After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
"testConcatFilterPrependAppend"	TokenNameStringLiteral	testConcatFilterPrependAppend
,	TokenNameCOMMA	
FILE_PREPEND_WITH	TokenNameIdentifier	 FILE  PREPEND  WITH
,	TokenNameCOMMA	
FILE_APPEND_WITH	TokenNameIdentifier	 FILE  APPEND  WITH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes a target and checks the beginning and the ending of a file. * The filename depends on the target name: target name <i>testHelloWorld</i> * will search for a file <i>result/concat.HelloWorld.test</i>. * @param target The target to invoke * @param expectedStart The string which should be at the beginning of the file * @param expectedEnd The string which should be at the end of the file */	TokenNameCOMMENT_JAVADOC	 Executes a target and checks the beginning and the ending of a file. The filename depends on the target name: target name <i>testHelloWorld</i> will search for a file <i>result/concat.HelloWorld.test</i>. @param target The target to invoke @param expectedStart The string which should be at the beginning of the file @param expectedEnd The string which should be at the end of the file 
protected	TokenNameprotected	
void	TokenNamevoid	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedStart	TokenNameIdentifier	 expected Start
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedEnd	TokenNameIdentifier	 expected End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
resultContent	TokenNameIdentifier	 result Content
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
"result/concat."	TokenNameStringLiteral	result/concat.
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".test"	TokenNameStringLiteral	.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"First 5 lines differs."	TokenNameStringLiteral	First 5 lines differs.
,	TokenNameCOMMA	
resultContent	TokenNameIdentifier	 result Content
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
expectedStart	TokenNameIdentifier	 expected Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Last 5 lines differs."	TokenNameStringLiteral	Last 5 lines differs.
,	TokenNameCOMMA	
resultContent	TokenNameIdentifier	 result Content
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
expectedEnd	TokenNameIdentifier	 expected End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wrapper for FileUtils.readFully(). * Additionally it resolves the filename according the the projects basedir * and closes the used reader. * @param filename The name of the file to read * @return the content of the file or <i>null</i> if something goes wrong */	TokenNameCOMMENT_JAVADOC	 Wrapper for FileUtils.readFully(). Additionally it resolves the filename according the the projects basedir and closes the used reader. @param filename The name of the file to read @return the content of the file or <i>null</i> if something goes wrong 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
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
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
rdr	TokenNameIdentifier	 rdr
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rdr	TokenNameIdentifier	 rdr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rdr	TokenNameIdentifier	 rdr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
