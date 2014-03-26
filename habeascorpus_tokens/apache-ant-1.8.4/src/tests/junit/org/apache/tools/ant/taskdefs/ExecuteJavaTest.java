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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
MagicNames	TokenNameIdentifier	 Magic Names
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Simple testcase for the ExecuteJava class - mostly stolen from * ExecuteWatchdogTest. * */	TokenNameCOMMENT_JAVADOC	 Simple testcase for the ExecuteJava class - mostly stolen from ExecuteWatchdogTest. 
public	TokenNamepublic	
class	TokenNameclass	
ExecuteJavaTest	TokenNameIdentifier	 Execute Java Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
CLOCK_ERROR	TokenNameIdentifier	 CLOCK  ERROR
=	TokenNameEQUAL	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TIME_OUT_TEST	TokenNameIdentifier	 TIME  OUT  TEST
=	TokenNameEQUAL	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
-	TokenNameMINUS	
CLOCK_ERROR	TokenNameIdentifier	 CLOCK  ERROR
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExecuteJava	TokenNameIdentifier	 Execute Java
ej	TokenNameIdentifier	 ej
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
cp	TokenNameIdentifier	 cp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExecuteJavaTest	TokenNameIdentifier	 Execute Java Test
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
ej	TokenNameIdentifier	 ej
=	TokenNameEQUAL	
new	TokenNamenew	
ExecuteJava	TokenNameIdentifier	 Execute Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
getTestClassPath	TokenNameIdentifier	 get Test Class Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Commandline	TokenNameIdentifier	 Commandline
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
int	TokenNameint	
timetorun	TokenNameIdentifier	 timetorun
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
TimeProcess	TokenNameIdentifier	 Time Process
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
timetorun	TokenNameIdentifier	 timetorun
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoTimeOut	TokenNameIdentifier	 test No Time Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
setJavaCommand	TokenNameIdentifier	 set Java Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should not have been killed"	TokenNameStringLiteral	process should not have been killed
,	TokenNameCOMMA	
!	TokenNameNOT	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// test that the watchdog ends the process 	TokenNameCOMMENT_LINE	test that the watchdog ends the process 
public	TokenNamepublic	
void	TokenNamevoid	
testTimeOut	TokenNameIdentifier	 test Time Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
setJavaCommand	TokenNameIdentifier	 set Java Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should have been killed"	TokenNameStringLiteral	process should have been killed
,	TokenNameCOMMA	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"elapse time of "	TokenNameStringLiteral	elapse time of 
+	TokenNamePLUS	
elapsed	TokenNameIdentifier	 elapsed
+	TokenNamePLUS	
" ms is less than timeout value of "	TokenNameStringLiteral	 ms is less than timeout value of 
+	TokenNamePLUS	
TIME_OUT_TEST	TokenNameIdentifier	 TIME  OUT  TEST
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
,	TokenNameCOMMA	
elapsed	TokenNameIdentifier	 elapsed
>=	TokenNameGREATER_EQUAL	
TIME_OUT_TEST	TokenNameIdentifier	 TIME  OUT  TEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"elapse time of "	TokenNameStringLiteral	elapse time of 
+	TokenNamePLUS	
elapsed	TokenNameIdentifier	 elapsed
+	TokenNamePLUS	
" ms is greater than run value of "	TokenNameStringLiteral	 ms is greater than run value of 
+	TokenNamePLUS	
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
,	TokenNameCOMMA	
elapsed	TokenNameIdentifier	 elapsed
<	TokenNameLESS	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoTimeOutForked	TokenNameIdentifier	 test No Time Out Forked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
setJavaCommand	TokenNameIdentifier	 set Java Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
fork	TokenNameIdentifier	 fork
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should not have been killed"	TokenNameStringLiteral	process should not have been killed
,	TokenNameCOMMA	
!	TokenNameNOT	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// test that the watchdog ends the process 	TokenNameCOMMENT_LINE	test that the watchdog ends the process 
public	TokenNamepublic	
void	TokenNamevoid	
testTimeOutForked	TokenNameIdentifier	 test Time Out Forked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
setJavaCommand	TokenNameIdentifier	 set Java Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
fork	TokenNameIdentifier	 fork
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should have been killed"	TokenNameStringLiteral	process should have been killed
,	TokenNameCOMMA	
ej	TokenNameIdentifier	 ej
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"elapse time of "	TokenNameStringLiteral	elapse time of 
+	TokenNamePLUS	
elapsed	TokenNameIdentifier	 elapsed
+	TokenNamePLUS	
" ms is less than timeout value of "	TokenNameStringLiteral	 ms is less than timeout value of 
+	TokenNamePLUS	
TIME_OUT_TEST	TokenNameIdentifier	 TIME  OUT  TEST
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
,	TokenNameCOMMA	
elapsed	TokenNameIdentifier	 elapsed
>=	TokenNameGREATER_EQUAL	
TIME_OUT_TEST	TokenNameIdentifier	 TIME  OUT  TEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"elapse time of "	TokenNameStringLiteral	elapse time of 
+	TokenNamePLUS	
elapsed	TokenNameIdentifier	 elapsed
+	TokenNamePLUS	
" ms is greater than run value of "	TokenNameStringLiteral	 ms is greater than run value of 
+	TokenNamePLUS	
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ms"	TokenNameStringLiteral	 ms
,	TokenNameCOMMA	
elapsed	TokenNameIdentifier	 elapsed
<	TokenNameLESS	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dangerous method to obtain the classpath for the test. This is * severely tighted to the build.xml properties. */	TokenNameCOMMENT_JAVADOC	 Dangerous method to obtain the classpath for the test. This is severely tighted to the build.xml properties. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getTestClassPath	TokenNameIdentifier	 get Test Class Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"build.tests"	TokenNameStringLiteral	build.tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: 'build.tests' property is not available !"	TokenNameStringLiteral	WARNING: 'build.tests' property is not available !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
