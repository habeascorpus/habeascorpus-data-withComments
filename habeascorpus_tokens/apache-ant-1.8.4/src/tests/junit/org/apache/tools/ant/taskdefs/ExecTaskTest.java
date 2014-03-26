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
*	TokenNameMULTIPLY	
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
;	TokenNameSEMICOLON	
/** * Unit test for the &lt;exec&gt; task. */	TokenNameCOMMENT_JAVADOC	 Unit test for the &lt;exec&gt; task. 
public	TokenNamepublic	
class	TokenNameclass	
ExecTaskTest	TokenNameIdentifier	 Exec Task Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_PATH	TokenNameIdentifier	 BUILD  PATH
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/exec/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/exec/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_FILE	TokenNameIdentifier	 BUILD  FILE
=	TokenNameEQUAL	
BUILD_PATH	TokenNameIdentifier	 BUILD  PATH
+	TokenNamePLUS	
"exec.xml"	TokenNameStringLiteral	exec.xml
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIME_TO_WAIT	TokenNameIdentifier	 TIME  TO  WAIT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** maximum time allowed for the build in milliseconds */	TokenNameCOMMENT_JAVADOC	 maximum time allowed for the build in milliseconds 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_BUILD_TIME	TokenNameIdentifier	 MAX  BUILD  TIME
=	TokenNameEQUAL	
4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SECURITY_MARGIN	TokenNameIdentifier	 SECURITY  MARGIN
=	TokenNameEQUAL	
2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// wait 2 second extras 	TokenNameCOMMENT_LINE	wait 2 second extras 
// the test failed with 100 ms of margin on cvs.apache.org on August 1st, 	TokenNameCOMMENT_LINE	the test failed with 100 ms of margin on cvs.apache.org on August 1st, 
// 2003 	TokenNameCOMMENT_LINE	2003 
/** Utilities used for file operations */	TokenNameCOMMENT_JAVADOC	 Utilities used for file operations 
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
File	TokenNameIdentifier	 File
logFile	TokenNameIdentifier	 log File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MonitoredBuild	TokenNameIdentifier	 Monitored Build
myBuild	TokenNameIdentifier	 my Build
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
volatile	TokenNamevolatile	
private	TokenNameprivate	
boolean	TokenNameboolean	
buildFinished	TokenNameIdentifier	 build Finished
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExecTaskTest	TokenNameIdentifier	 Exec Task Test
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
BUILD_FILE	TokenNameIdentifier	 BUILD  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logFile	TokenNameIdentifier	 log File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"logFile"	TokenNameStringLiteral	logFile
,	TokenNameCOMMA	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testspawn	TokenNameIdentifier	 testspawn
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"init"	TokenNameStringLiteral	init
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"test.can.run"	TokenNameStringLiteral	test.can.run
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
myBuild	TokenNameIdentifier	 my Build
=	TokenNameEQUAL	
new	TokenNamenew	
MonitoredBuild	TokenNameIdentifier	 Monitored Build
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
BUILD_FILE	TokenNameIdentifier	 BUILD  FILE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"spawn"	TokenNameStringLiteral	spawn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logFile	TokenNameIdentifier	 log File
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"spawn"	TokenNameStringLiteral	spawn
,	TokenNameCOMMA	
"log"	TokenNameStringLiteral	log
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this is guaranteed by FileUtils#createTempFile 	TokenNameCOMMENT_LINE	this is guaranteed by FileUtils#createTempFile 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"log file not existing"	TokenNameStringLiteral	log file not existing
,	TokenNameCOMMA	
!	TokenNameNOT	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make the spawned process run 4 seconds 	TokenNameCOMMENT_LINE	make the spawned process run 4 seconds 
myBuild	TokenNameIdentifier	 my Build
.	TokenNameDOT	
setTimeToWait	TokenNameIdentifier	 set Time To Wait
(	TokenNameLPAREN	
TIME_TO_WAIT	TokenNameIdentifier	 TIME  TO  WAIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myBuild	TokenNameIdentifier	 my Build
.	TokenNameDOT	
setLogFile	TokenNameIdentifier	 set Log File
(	TokenNameLPAREN	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myBuild	TokenNameIdentifier	 my Build
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
new	TokenNamenew	
MonitoredBuildListener	TokenNameIdentifier	 Monitored Build Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myBuild	TokenNameIdentifier	 my Build
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
startwait	TokenNameIdentifier	 startwait
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this loop runs parallel to the build 	TokenNameCOMMENT_LINE	this loop runs parallel to the build 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
buildFinished	TokenNameIdentifier	 build Finished
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"my sleep was interrupted"	TokenNameStringLiteral	my sleep was interrupted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// security 	TokenNameCOMMENT_LINE	security 
if	TokenNameif	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startwait	TokenNameIdentifier	 startwait
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
MAX_BUILD_TIME	TokenNameIdentifier	 MAX  BUILD  TIME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"aborting wait, too long "	TokenNameStringLiteral	aborting wait, too long 
+	TokenNamePLUS	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startwait	TokenNameIdentifier	 startwait
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"milliseconds"	TokenNameStringLiteral	milliseconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now wait until the spawned process is finished 	TokenNameCOMMENT_LINE	now wait until the spawned process is finished 
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TIME_TO_WAIT	TokenNameIdentifier	 TIME  TO  WAIT
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
+	TokenNamePLUS	
SECURITY_MARGIN	TokenNameIdentifier	 SECURITY  MARGIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"my sleep was interrupted"	TokenNameStringLiteral	my sleep was interrupted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// time of the build in milli seconds 	TokenNameCOMMENT_LINE	time of the build in milli seconds 
long	TokenNamelong	
elapsed	TokenNameIdentifier	 elapsed
=	TokenNameEQUAL	
myBuild	TokenNameIdentifier	 my Build
.	TokenNameDOT	
getTimeElapsed	TokenNameIdentifier	 get Time Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"we waited more than the process lasted"	TokenNameStringLiteral	we waited more than the process lasted
,	TokenNameCOMMA	
TIME_TO_WAIT	TokenNameIdentifier	 TIME  TO  WAIT
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
+	TokenNamePLUS	
SECURITY_MARGIN	TokenNameIdentifier	 SECURITY  MARGIN
>	TokenNameGREATER	
elapsed	TokenNameIdentifier	 elapsed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logFile	TokenNameIdentifier	 log File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"log file found after spawn"	TokenNameStringLiteral	log file found after spawn
,	TokenNameCOMMA	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutAndErr	TokenNameIdentifier	 test Out And Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-out-and-err"	TokenNameStringLiteral	test-out-and-err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MonitoredBuild	TokenNameIdentifier	 Monitored Build
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
worker	TokenNameIdentifier	 worker
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
myBuildFile	TokenNameIdentifier	 my Build File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
timeToWait	TokenNameIdentifier	 time To Wait
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
logFile	TokenNameIdentifier	 log File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
timeStarted	TokenNameIdentifier	 time Started
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
timeFinished	TokenNameIdentifier	 time Finished
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setLogFile	TokenNameIdentifier	 set Log File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
logFile	TokenNameIdentifier	 log File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logFile	TokenNameIdentifier	 log File
=	TokenNameEQUAL	
logFile	TokenNameIdentifier	 log File
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"logFile"	TokenNameStringLiteral	logFile
,	TokenNameCOMMA	
logFile	TokenNameIdentifier	 log File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTimeToWait	TokenNameIdentifier	 set Time To Wait
(	TokenNameLPAREN	
int	TokenNameint	
timeToWait	TokenNameIdentifier	 time To Wait
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeToWait	TokenNameIdentifier	 time To Wait
=	TokenNameEQUAL	
timeToWait	TokenNameIdentifier	 time To Wait
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"timeToWait"	TokenNameStringLiteral	timeToWait
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
timeToWait	TokenNameIdentifier	 time To Wait
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
BuildListener	TokenNameIdentifier	 Build Listener
bl	TokenNameIdentifier	 bl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
bl	TokenNameIdentifier	 bl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MonitoredBuild	TokenNameIdentifier	 Monitored Build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
buildFile	TokenNameIdentifier	 build File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myBuildFile	TokenNameIdentifier	 my Build File
=	TokenNameEQUAL	
buildFile	TokenNameIdentifier	 build File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
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
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"ant.file"	TokenNameStringLiteral	ant.file
,	TokenNameCOMMA	
myBuildFile	TokenNameIdentifier	 my Build File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
myBuildFile	TokenNameIdentifier	 my Build File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return time in millis of the build */	TokenNameCOMMENT_JAVADOC	 * @return time in millis of the build 
public	TokenNamepublic	
long	TokenNamelong	
getTimeElapsed	TokenNameIdentifier	 get Time Elapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeFinished	TokenNameIdentifier	 time Finished
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
timeStarted	TokenNameIdentifier	 time Started
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
worker	TokenNameIdentifier	 worker
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
myBuildFile	TokenNameIdentifier	 my Build File
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startProject	TokenNameIdentifier	 start Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
startProject	TokenNameIdentifier	 start Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeStarted	TokenNameIdentifier	 time Started
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeFinished	TokenNameIdentifier	 time Finished
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
MonitoredBuildListener	TokenNameIdentifier	 Monitored Build Listener
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"spawn"	TokenNameStringLiteral	spawn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildFinished	TokenNameIdentifier	 build Finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
