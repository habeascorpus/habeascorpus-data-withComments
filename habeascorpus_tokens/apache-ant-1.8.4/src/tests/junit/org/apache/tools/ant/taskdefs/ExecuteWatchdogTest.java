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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Simple testcase for the ExecuteWatchdog class. * */	TokenNameCOMMENT_JAVADOC	 Simple testcase for the ExecuteWatchdog class. 
public	TokenNamepublic	
class	TokenNameclass	
ExecuteWatchdogTest	TokenNameIdentifier	 Execute Watchdog Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TEST_CLASSPATH	TokenNameIdentifier	 TEST  CLASSPATH
=	TokenNameEQUAL	
getTestClassPath	TokenNameIdentifier	 get Test Class Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
long	TokenNamelong	
TIME_OUT_TEST	TokenNameIdentifier	 TIME  OUT  TEST
=	TokenNameEQUAL	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
-	TokenNameMINUS	
CLOCK_ERROR	TokenNameIdentifier	 CLOCK  ERROR
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExecuteWatchdog	TokenNameIdentifier	 Execute Watchdog
watchdog	TokenNameIdentifier	 watchdog
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExecuteWatchdogTest	TokenNameIdentifier	 Execute Watchdog Test
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
watchdog	TokenNameIdentifier	 watchdog
=	TokenNameEQUAL	
new	TokenNamenew	
ExecuteWatchdog	TokenNameIdentifier	 Execute Watchdog
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
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
private	TokenNameprivate	
Process	TokenNameIdentifier	 Process
getProcess	TokenNameIdentifier	 get Process
(	TokenNameLPAREN	
long	TokenNamelong	
timetorun	TokenNameIdentifier	 timetorun
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cmdArray	TokenNameIdentifier	 cmd Array
=	TokenNameEQUAL	
{	TokenNameLBRACE	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJreExecutable	TokenNameIdentifier	 get Jre Executable
(	TokenNameLPAREN	
"java"	TokenNameStringLiteral	java
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"-classpath"	TokenNameStringLiteral	-classpath
,	TokenNameCOMMA	
TEST_CLASSPATH	TokenNameIdentifier	 TEST  CLASSPATH
,	TokenNameCOMMA	
TimeProcess	TokenNameIdentifier	 Time Process
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
timetorun	TokenNameIdentifier	 timetorun
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//System.out.println("Testing with classpath: " + System.getProperty("java.class.path")); 	TokenNameCOMMENT_LINE	System.out.println("Testing with classpath: " + System.getProperty("java.class.path")); 
return	TokenNamereturn	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
cmdArray	TokenNameIdentifier	 cmd Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getErrorOutput	TokenNameIdentifier	 get Error Output
(	TokenNameLPAREN	
Process	TokenNameIdentifier	 Process
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getErrorStream	TokenNameIdentifier	 get Error Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
waitForEnd	TokenNameIdentifier	 wait For End
(	TokenNameLPAREN	
Process	TokenNameIdentifier	 Process
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
retcode	TokenNameIdentifier	 retcode
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retcode	TokenNameIdentifier	 retcode
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
getErrorOutput	TokenNameIdentifier	 get Error Output
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ERROR:"	TokenNameStringLiteral	ERROR:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
retcode	TokenNameIdentifier	 retcode
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
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
getProcess	TokenNameIdentifier	 get Process
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
retCode	TokenNameIdentifier	 ret Code
=	TokenNameEQUAL	
waitForEnd	TokenNameIdentifier	 wait For End
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should not have been killed"	TokenNameStringLiteral	process should not have been killed
,	TokenNameCOMMA	
!	TokenNameNOT	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
Execute	TokenNameIdentifier	 Execute
.	TokenNameDOT	
isFailure	TokenNameIdentifier	 is Failure
(	TokenNameLPAREN	
retCode	TokenNameIdentifier	 ret Code
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
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
getProcess	TokenNameIdentifier	 get Process
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
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
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
retCode	TokenNameIdentifier	 ret Code
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
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
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// assertTrue("return code is invalid: " + retCode, retCode!=0); 	TokenNameCOMMENT_LINE	assertTrue("return code is invalid: " + retCode, retCode!=0); 
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
// test a process that runs and failed 	TokenNameCOMMENT_LINE	test a process that runs and failed 
public	TokenNamepublic	
void	TokenNamevoid	
testFailed	TokenNameIdentifier	 test Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
getProcess	TokenNameIdentifier	 get Process
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// process should abort 	TokenNameCOMMENT_LINE	process should abort 
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
retCode	TokenNameIdentifier	 ret Code
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should not have been killed"	TokenNameStringLiteral	process should not have been killed
,	TokenNameCOMMA	
!	TokenNameNOT	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"return code is invalid: "	TokenNameStringLiteral	return code is invalid: 
+	TokenNamePLUS	
retCode	TokenNameIdentifier	 ret Code
,	TokenNameCOMMA	
retCode	TokenNameIdentifier	 ret Code
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testManualStop	TokenNameIdentifier	 test Manual Stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
getProcess	TokenNameIdentifier	 get Process
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// I assume that starting this takes less than TIME_OUT/2 ms... 	TokenNameCOMMENT_LINE	I assume that starting this takes less than TIME_OUT/2 ms... 
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not very nice but will do the job 	TokenNameCOMMENT_LINE	not very nice but will do the job 
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"process interrupted in thread"	TokenNameStringLiteral	process interrupted in thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait for TIME_OUT/2, there should be about TIME_OUT/2 ms remaining before timeout 	TokenNameCOMMENT_LINE	wait for TIME_OUT/2, there should be about TIME_OUT/2 ms remaining before timeout 
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
TIME_OUT	TokenNameIdentifier	 TIME  OUT
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now stop the watchdog. 	TokenNameCOMMENT_LINE	now stop the watchdog. 
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait for the thread to die, should be the end of the process 	TokenNameCOMMENT_LINE	wait for the thread to die, should be the end of the process 
thread	TokenNameIdentifier	 thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// process should be dead and well finished 	TokenNameCOMMENT_LINE	process should be dead and well finished 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
exitValue	TokenNameIdentifier	 exit Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"process should not have been killed"	TokenNameStringLiteral	process should not have been killed
,	TokenNameCOMMA	
!	TokenNameNOT	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
