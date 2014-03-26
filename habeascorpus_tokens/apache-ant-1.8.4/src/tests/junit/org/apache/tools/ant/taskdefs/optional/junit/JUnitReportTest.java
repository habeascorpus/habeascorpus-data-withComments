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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
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
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
/** * Small testcase for the junitreporttask. * First test added to reproduce an fault, still a lot to improve * */	TokenNameCOMMENT_JAVADOC	 Small testcase for the junitreporttask. First test added to reproduce an fault, still a lot to improve 
public	TokenNamepublic	
class	TokenNameclass	
JUnitReportTest	TokenNameIdentifier	 J Unit Report Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
JUnitReportTest	TokenNameIdentifier	 J Unit Report Test
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
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/junitreport.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"clean"	TokenNameStringLiteral	clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verifies that no empty junit-noframes.html is generated when frames * output is selected via the default. * Needs reports1 task from junitreport.xml. */	TokenNameCOMMENT_JAVADOC	 Verifies that no empty junit-noframes.html is generated when frames output is selected via the default. Needs reports1 task from junitreport.xml. 
public	TokenNamepublic	
void	TokenNamevoid	
testNoFileJUnitNoFrames	TokenNameIdentifier	 test No File J Unit No Frames
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"reports1"	TokenNameStringLiteral	reports1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/junit-noframes.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/junit-noframes.html
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"No file junit-noframes.html expected"	TokenNameStringLiteral	No file junit-noframes.html expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
assertIndexCreated	TokenNameIdentifier	 assert Index Created
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"No file index file found"	TokenNameStringLiteral	No file index file found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * run a target, assert the index file is there, look for text in the log * @param targetName target * @param text optional text to look for */	TokenNameCOMMENT_JAVADOC	 run a target, assert the index file is there, look for text in the log @param targetName target @param text optional text to look for 
private	TokenNameprivate	
void	TokenNamevoid	
expectReportWithText	TokenNameIdentifier	 expect Report With Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
targetName	TokenNameIdentifier	 target Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
targetName	TokenNameIdentifier	 target Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIndexCreated	TokenNameIdentifier	 assert Index Created
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyFile	TokenNameIdentifier	 test Empty File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectReportWithText	TokenNameIdentifier	 expect Report With Text
(	TokenNameLPAREN	
"testEmptyFile"	TokenNameStringLiteral	testEmptyFile
,	TokenNameCOMMA	
XMLResultAggregator	TokenNameIdentifier	 XML Result Aggregator
.	TokenNameDOT	
WARNING_EMPTY_FILE	TokenNameIdentifier	 WARNING  EMPTY  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIncompleteFile	TokenNameIdentifier	 test Incomplete File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectReportWithText	TokenNameIdentifier	 expect Report With Text
(	TokenNameLPAREN	
"testIncompleteFile"	TokenNameStringLiteral	testIncompleteFile
,	TokenNameCOMMA	
XMLResultAggregator	TokenNameIdentifier	 XML Result Aggregator
.	TokenNameDOT	
WARNING_IS_POSSIBLY_CORRUPTED	TokenNameIdentifier	 WARNING  IS  POSSIBLY  CORRUPTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWrongElement	TokenNameIdentifier	 test Wrong Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectReportWithText	TokenNameIdentifier	 expect Report With Text
(	TokenNameLPAREN	
"testWrongElement"	TokenNameStringLiteral	testWrongElement
,	TokenNameCOMMA	
XMLResultAggregator	TokenNameIdentifier	 XML Result Aggregator
.	TokenNameDOT	
WARNING_INVALID_ROOT_ELEMENT	TokenNameIdentifier	 WARNING  INVALID  ROOT  ELEMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bugzilla Report 34963 	TokenNameCOMMENT_LINE	Bugzilla Report 34963 
public	TokenNamepublic	
void	TokenNamevoid	
testStackTraceLineBreaks	TokenNameIdentifier	 test Stack Trace Line Breaks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectReportWithText	TokenNameIdentifier	 expect Report With Text
(	TokenNameLPAREN	
"testStackTraceLineBreaks"	TokenNameStringLiteral	testStackTraceLineBreaks
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileReader	TokenNameIdentifier	 File Reader
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
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/sampleproject/coins/0_CoinTest.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/sampleproject/coins/0_CoinTest.html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
report	TokenNameIdentifier	 report
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"output must contain <br>: "	TokenNameStringLiteral	output must contain <br>: 
+	TokenNamePLUS	
report	TokenNameIdentifier	 report
,	TokenNameCOMMA	
report	TokenNameIdentifier	 report
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"junit.framework.AssertionFailedError: DOEG<br>"	TokenNameStringLiteral	junit.framework.AssertionFailedError: DOEG<br>
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"#51049: output must translate line breaks: "	TokenNameStringLiteral	#51049: output must translate line breaks: 
+	TokenNamePLUS	
report	TokenNameIdentifier	 report
,	TokenNameCOMMA	
report	TokenNameIdentifier	 report
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"cur['line.separator'] = '\r\n';"	TokenNameStringLiteral	cur['line.separator'] = '\r\n';
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
// Bugzilla Report 38477 	TokenNameCOMMENT_LINE	Bugzilla Report 38477 
public	TokenNamepublic	
void	TokenNamevoid	
testSpecialSignsInSrcPath	TokenNameIdentifier	 test Special Signs In Src Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testSpecialSignsInSrcPath"	TokenNameStringLiteral	testSpecialSignsInSrcPath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No index.html present. Not generated?"	TokenNameStringLiteral	No index.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSpecialSignsInHtmlPath	TokenNameIdentifier	 test Special Signs In Html Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testSpecialSignsInHtmlPath"	TokenNameStringLiteral	testSpecialSignsInHtmlPath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html# $%¤&-!report/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html# $%¤&-!report/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No index.html present. Not generated?"	TokenNameStringLiteral	No index.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Bugzilla Report 39708 	TokenNameCOMMENT_LINE	Bugzilla Report 39708 
public	TokenNamepublic	
void	TokenNamevoid	
testWithStyleFromDir	TokenNameIdentifier	 test With Style From Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWithStyleFromDir"	TokenNameStringLiteral	testWithStyleFromDir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No index.html present. Not generated?"	TokenNameStringLiteral	No index.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Bugzilla Report 40021 	TokenNameCOMMENT_LINE	Bugzilla Report 40021 
public	TokenNamepublic	
void	TokenNamevoid	
testNoFrames	TokenNameIdentifier	 test No Frames
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNoFrames"	TokenNameStringLiteral	testNoFrames
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/junit-noframes.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/junit-noframes.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No junit-noframes.html present. Not generated?"	TokenNameStringLiteral	No junit-noframes.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Bugzilla Report 39708 	TokenNameCOMMENT_LINE	Bugzilla Report 39708 
public	TokenNamepublic	
void	TokenNamevoid	
testWithStyleFromDirAndXslImport	TokenNameIdentifier	 test With Style From Dir And Xsl Import
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWithStyleFromDirAndXslImport"	TokenNameStringLiteral	testWithStyleFromDirAndXslImport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No index.html present. Not generated?"	TokenNameStringLiteral	No index.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithStyleFromClasspath	TokenNameIdentifier	 test With Style From Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWithStyleFromClasspath"	TokenNameStringLiteral	testWithStyleFromClasspath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No index.html present. Not generated?"	TokenNameStringLiteral	No index.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithParams	TokenNameIdentifier	 test With Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testWithParams"	TokenNameStringLiteral	testWithParams
,	TokenNameCOMMA	
"key1=value1,key2=value2"	TokenNameStringLiteral	key1=value1,key2=value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
reportFile	TokenNameIdentifier	 report File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/junitreport/test/html/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tests one the file object 	TokenNameCOMMENT_LINE	tests one the file object 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No index.html present. Not generated?"	TokenNameStringLiteral	No index.html present. Not generated?
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Cant read the report file."	TokenNameStringLiteral	Cant read the report file.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File shouldnt be empty."	TokenNameStringLiteral	File shouldnt be empty.
,	TokenNameCOMMA	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 	TokenNameCOMMENT_LINE	conversion to URL via FileUtils like in XMLResultAggregator, not as suggested in the bug report 
URL	TokenNameIdentifier	 URL
reportUrl	TokenNameIdentifier	 report Url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
reportFile	TokenNameIdentifier	 report File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
reportStream	TokenNameIdentifier	 report Stream
=	TokenNameEQUAL	
reportUrl	TokenNameIdentifier	 report Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"This shouldnt be an empty stream."	TokenNameStringLiteral	This shouldnt be an empty stream.
,	TokenNameCOMMA	
reportStream	TokenNameIdentifier	 report Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
