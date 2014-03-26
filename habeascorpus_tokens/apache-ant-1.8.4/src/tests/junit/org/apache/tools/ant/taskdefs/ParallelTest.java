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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
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
DemuxOutputStream	TokenNameIdentifier	 Demux Output Stream
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Test of the parallel TaskContainer * * @created 21 February 2002 */	TokenNameCOMMENT_JAVADOC	 Test of the parallel TaskContainer * @created 21 February 2002 
public	TokenNamepublic	
class	TokenNameclass	
ParallelTest	TokenNameIdentifier	 Parallel Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** Standard property value for the basic test */	TokenNameCOMMENT_JAVADOC	 Standard property value for the basic test 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DIRECT_MESSAGE	TokenNameIdentifier	 DIRECT  MESSAGE
=	TokenNameEQUAL	
"direct"	TokenNameStringLiteral	direct
;	TokenNameSEMICOLON	
/** Standard property value for the basic and fail test */	TokenNameCOMMENT_JAVADOC	 Standard property value for the basic and fail test 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DELAYED_MESSAGE	TokenNameIdentifier	 DELAYED  MESSAGE
=	TokenNameEQUAL	
"delayed"	TokenNameStringLiteral	delayed
;	TokenNameSEMICOLON	
/** Standard property value for the fail test */	TokenNameCOMMENT_JAVADOC	 Standard property value for the fail test 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FAILURE_MESSAGE	TokenNameIdentifier	 FAILURE  MESSAGE
=	TokenNameEQUAL	
"failure"	TokenNameStringLiteral	failure
;	TokenNameSEMICOLON	
/** the build fiel associated with this test */	TokenNameCOMMENT_JAVADOC	 the build fiel associated with this test 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TEST_BUILD_FILE	TokenNameIdentifier	 TEST  BUILD  FILE
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/parallel.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/parallel.xml
;	TokenNameSEMICOLON	
/** * Constructor for the ParallelTest object * * @param name name of the test */	TokenNameCOMMENT_JAVADOC	 Constructor for the ParallelTest object * @param name name of the test 
public	TokenNamepublic	
ParallelTest	TokenNameIdentifier	 Parallel Test
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
/** The JUnit setup method */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method 
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
TEST_BUILD_FILE	TokenNameIdentifier	 TEST  BUILD  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** tests basic operation of the parallel task */	TokenNameCOMMENT_JAVADOC	 tests basic operation of the parallel task 
public	TokenNamepublic	
void	TokenNamevoid	
testBasic	TokenNameIdentifier	 test Basic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should get no output at all 	TokenNameCOMMENT_LINE	should get no output at all 
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.direct"	TokenNameStringLiteral	test.direct
,	TokenNameCOMMA	
DIRECT_MESSAGE	TokenNameIdentifier	 DIRECT  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.delayed"	TokenNameStringLiteral	test.delayed
,	TokenNameCOMMA	
DELAYED_MESSAGE	TokenNameIdentifier	 DELAYED  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectOutputAndError	TokenNameIdentifier	 expect Output And Error
(	TokenNameLPAREN	
"testBasic"	TokenNameStringLiteral	testBasic
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"parallel tasks didn't output correct data"	TokenNameStringLiteral	parallel tasks didn't output correct data
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
DIRECT_MESSAGE	TokenNameIdentifier	 DIRECT  MESSAGE
+	TokenNamePLUS	
DELAYED_MESSAGE	TokenNameIdentifier	 DELAYED  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** tests basic operation of the parallel task */	TokenNameCOMMENT_JAVADOC	 tests basic operation of the parallel task 
public	TokenNamepublic	
void	TokenNamevoid	
testThreadCount	TokenNameIdentifier	 test Thread Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should get no output at all 	TokenNameCOMMENT_LINE	should get no output at all 
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.direct"	TokenNameStringLiteral	test.direct
,	TokenNameCOMMA	
DIRECT_MESSAGE	TokenNameIdentifier	 DIRECT  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.delayed"	TokenNameStringLiteral	test.delayed
,	TokenNameCOMMA	
DELAYED_MESSAGE	TokenNameIdentifier	 DELAYED  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectOutputAndError	TokenNameIdentifier	 expect Output And Error
(	TokenNameLPAREN	
"testThreadCount"	TokenNameStringLiteral	testThreadCount
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
countThreads	TokenNameIdentifier	 count Threads
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * the test result string should match the regex * <code>^(\|\d+\/(+-)*)+\|$</code> for someting like * <code>|3/++--+-|5/+++++-----|</code> * *@returns -1 no more tests * # start pos of next test *@throws AssertionFailedException when a constraint is invalid */	TokenNameCOMMENT_JAVADOC	 the test result string should match the regex <code>^(\|\d+\/(+-)*)+\|$</code> for someting like <code>|3/++--+-|5/+++++-----|</code> *@returns -1 no more tests # start pos of next test *@throws AssertionFailedException when a constraint is invalid 
static	TokenNamestatic	
int	TokenNameint	
countThreads	TokenNameIdentifier	 count Threads
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
firstPipe	TokenNameIdentifier	 first Pipe
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
beginSlash	TokenNameIdentifier	 begin Slash
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
firstPipe	TokenNameIdentifier	 first Pipe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPipe	TokenNameIdentifier	 last Pipe
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
beginSlash	TokenNameIdentifier	 begin Slash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstPipe	TokenNameIdentifier	 first Pipe
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
beginSlash	TokenNameIdentifier	 begin Slash
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lastPipe	TokenNameIdentifier	 last Pipe
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
firstPipe	TokenNameIdentifier	 first Pipe
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
beginSlash	TokenNameIdentifier	 begin Slash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
beginSlash	TokenNameIdentifier	 begin Slash
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
lastPipe	TokenNameIdentifier	 last Pipe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
"Only expect '+-' in result count, found "	TokenNameStringLiteral	Only expect '+-' in result count, found 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
+	TokenNamePLUS	
" at position "	TokenNameStringLiteral	 at position 
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
"Number of executing threads exceeded number allowed: "	TokenNameStringLiteral	Number of executing threads exceeded number allowed: 
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
+	TokenNamePLUS	
" > "	TokenNameStringLiteral	 > 
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastPipe	TokenNameIdentifier	 last Pipe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** tests the failure of a task within a parallel construction */	TokenNameCOMMENT_JAVADOC	 tests the failure of a task within a parallel construction 
public	TokenNamepublic	
void	TokenNamevoid	
testFail	TokenNameIdentifier	 test Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should get no output at all 	TokenNameCOMMENT_LINE	should get no output at all 
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.failure"	TokenNameStringLiteral	test.failure
,	TokenNameCOMMA	
FAILURE_MESSAGE	TokenNameIdentifier	 FAILURE  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"test.delayed"	TokenNameStringLiteral	test.delayed
,	TokenNameCOMMA	
DELAYED_MESSAGE	TokenNameIdentifier	 DELAYED  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testFail"	TokenNameStringLiteral	testFail
,	TokenNameCOMMA	
"fail task in one parallel branch"	TokenNameStringLiteral	fail task in one parallel branch
,	TokenNameCOMMA	
FAILURE_MESSAGE	TokenNameIdentifier	 FAILURE  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** tests the demuxing of output streams in a multithreaded situation */	TokenNameCOMMENT_JAVADOC	 tests the demuxing of output streams in a multithreaded situation 
public	TokenNamepublic	
void	TokenNamevoid	
testDemux	TokenNameIdentifier	 test Demux
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addTaskDefinition	TokenNameIdentifier	 add Task Definition
(	TokenNameLPAREN	
"demuxtest"	TokenNameStringLiteral	demuxtest
,	TokenNameCOMMA	
DemuxOutputTask	TokenNameIdentifier	 Demux Output Task
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
DemuxOutputStream	TokenNameIdentifier	 Demux Output Stream
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
DemuxOutputStream	TokenNameIdentifier	 Demux Output Stream
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testDemux"	TokenNameStringLiteral	testDemux
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
