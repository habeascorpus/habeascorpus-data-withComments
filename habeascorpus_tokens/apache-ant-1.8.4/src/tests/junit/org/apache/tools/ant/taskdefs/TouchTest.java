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
BuildException	TokenNameIdentifier	 Build Exception
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
public	TokenNamepublic	
class	TokenNameclass	
TouchTest	TokenNameIdentifier	 Touch Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TOUCH_FILE	TokenNameIdentifier	 TOUCH  FILE
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/touchtest"	TokenNameStringLiteral	src/etc/testcases/taskdefs/touchtest
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
TouchTest	TokenNameIdentifier	 Touch Test
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
"src/etc/testcases/taskdefs/touch.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/touch.xml
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
long	TokenNamelong	
getTargetTime	TokenNameIdentifier	 get Target Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
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
TOUCH_FILE	TokenNameIdentifier	 TOUCH  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"failed to touch file "	TokenNameStringLiteral	failed to touch file 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No real test, simply checks whether the dateformat without * seconds is accepted - by erroring out otherwise. */	TokenNameCOMMENT_JAVADOC	 No real test, simply checks whether the dateformat without seconds is accepted - by erroring out otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
testNoSeconds	TokenNameIdentifier	 test No Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"noSeconds"	TokenNameStringLiteral	noSeconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
getTargetTime	TokenNameIdentifier	 get Target Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No real test, simply checks whether the dateformat with * seconds is accepted - by erroring out otherwise. */	TokenNameCOMMENT_JAVADOC	 No real test, simply checks whether the dateformat with seconds is accepted - by erroring out otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
testSeconds	TokenNameIdentifier	 test Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"seconds"	TokenNameStringLiteral	seconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
getTargetTime	TokenNameIdentifier	 get Target Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that the millis test sets things up */	TokenNameCOMMENT_JAVADOC	 verify that the millis test sets things up 
public	TokenNamepublic	
void	TokenNamevoid	
testMillis	TokenNameIdentifier	 test Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
"testMillis"	TokenNameStringLiteral	testMillis
,	TokenNameCOMMA	
662256000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that the default value defaults to now */	TokenNameCOMMENT_JAVADOC	 verify that the default value defaults to now 
public	TokenNamepublic	
void	TokenNamevoid	
testNow	TokenNameIdentifier	 test Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNow"	TokenNameStringLiteral	testNow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
getTargetTime	TokenNameIdentifier	 get Target Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTimesNearlyMatch	TokenNameIdentifier	 assert Times Nearly Match
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
5000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that the millis test sets things up */	TokenNameCOMMENT_JAVADOC	 verify that the millis test sets things up 
public	TokenNamepublic	
void	TokenNamevoid	
test2000	TokenNameIdentifier	 test2000
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
"test2000"	TokenNameStringLiteral	test2000
,	TokenNameCOMMA	
946080000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the file list */	TokenNameCOMMENT_JAVADOC	 test the file list 
public	TokenNamepublic	
void	TokenNamevoid	
testFilelist	TokenNameIdentifier	 test Filelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
"testFilelist"	TokenNameStringLiteral	testFilelist
,	TokenNameCOMMA	
662256000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the file set */	TokenNameCOMMENT_JAVADOC	 test the file set 
public	TokenNamepublic	
void	TokenNamevoid	
testFileset	TokenNameIdentifier	 test Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
"testFileset"	TokenNameStringLiteral	testFileset
,	TokenNameCOMMA	
946080000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the resource collection */	TokenNameCOMMENT_JAVADOC	 test the resource collection 
public	TokenNamepublic	
void	TokenNamevoid	
testResourceCollection	TokenNameIdentifier	 test Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
"testResourceCollection"	TokenNameStringLiteral	testResourceCollection
,	TokenNameCOMMA	
1662256000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the mapped file set */	TokenNameCOMMENT_JAVADOC	 test the mapped file set 
public	TokenNamepublic	
void	TokenNamevoid	
testMappedFileset	TokenNameIdentifier	 test Mapped Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testMappedFileset"	TokenNameStringLiteral	testMappedFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the explicit mapped file set */	TokenNameCOMMENT_JAVADOC	 test the explicit mapped file set 
public	TokenNamepublic	
void	TokenNamevoid	
testExplicitMappedFileset	TokenNameIdentifier	 test Explicit Mapped Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testExplicitMappedFileset"	TokenNameStringLiteral	testExplicitMappedFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the mapped file list */	TokenNameCOMMENT_JAVADOC	 test the mapped file list 
public	TokenNamepublic	
void	TokenNamevoid	
testMappedFilelist	TokenNameIdentifier	 test Mapped Filelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testMappedFilelist"	TokenNameStringLiteral	testMappedFilelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the pattern attribute */	TokenNameCOMMENT_JAVADOC	 test the pattern attribute 
public	TokenNamepublic	
void	TokenNamevoid	
testGoodPattern	TokenNameIdentifier	 test Good Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testGoodPattern"	TokenNameStringLiteral	testGoodPattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the pattern attribute again */	TokenNameCOMMENT_JAVADOC	 test the pattern attribute again 
public	TokenNamepublic	
void	TokenNamevoid	
testBadPattern	TokenNameIdentifier	 test Bad Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testBadPattern"	TokenNameStringLiteral	testBadPattern
,	TokenNameCOMMA	
"No parsing exception thrown"	TokenNameStringLiteral	No parsing exception thrown
,	TokenNameCOMMA	
"Unparseable"	TokenNameStringLiteral	Unparseable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * run a target to touch the test file; verify the timestamp is as expected * @param targetName * @param timestamp */	TokenNameCOMMENT_JAVADOC	 run a target to touch the test file; verify the timestamp is as expected @param targetName @param timestamp 
private	TokenNameprivate	
void	TokenNamevoid	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
targetName	TokenNameIdentifier	 target Name
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
targetName	TokenNameIdentifier	 target Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
getTargetTime	TokenNameIdentifier	 get Target Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTimesNearlyMatch	TokenNameIdentifier	 assert Times Nearly Match
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that two times are within the current FS granularity; * @param timestamp * @param time */	TokenNameCOMMENT_JAVADOC	 assert that two times are within the current FS granularity; @param timestamp @param time 
public	TokenNamepublic	
void	TokenNamevoid	
assertTimesNearlyMatch	TokenNameIdentifier	 assert Times Nearly Match
(	TokenNameLPAREN	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTimesNearlyMatch	TokenNameIdentifier	 assert Times Nearly Match
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that two times are within a specified range * @param timestamp * @param time * @param range */	TokenNameCOMMENT_JAVADOC	 assert that two times are within a specified range @param timestamp @param time @param range 
private	TokenNameprivate	
void	TokenNamevoid	
assertTimesNearlyMatch	TokenNameIdentifier	 assert Times Nearly Match
(	TokenNameLPAREN	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
long	TokenNamelong	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
long	TokenNamelong	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Time "	TokenNameStringLiteral	Time 
+	TokenNamePLUS	
timestamp	TokenNameIdentifier	 timestamp
+	TokenNamePLUS	
" is not within "	TokenNameStringLiteral	 is not within 
+	TokenNamePLUS	
range	TokenNameIdentifier	 range
+	TokenNamePLUS	
" ms of "	TokenNameStringLiteral	 ms of 
+	TokenNamePLUS	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
