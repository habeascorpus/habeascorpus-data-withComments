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
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * Tests for org.apache.tools.ant.util.FileUtils. * */	TokenNameCOMMENT_JAVADOC	 Tests for org.apache.tools.ant.util.FileUtils. 
public	TokenNamepublic	
class	TokenNameclass	
FileUtilsTest	TokenNameIdentifier	 File Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
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
File	TokenNameIdentifier	 File
removeThis	TokenNameIdentifier	 remove This
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FileUtilsTest	TokenNameIdentifier	 File Utils Test
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
// Windows adds the drive letter in uppercase, unless you run Cygwin 	TokenNameCOMMENT_LINE	Windows adds the drive letter in uppercase, unless you run Cygwin 
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
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
removeThis	TokenNameIdentifier	 remove This
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * test modification. * Since Ant1.7, the method being tested no longer uses * reflection to provide backwards support to Java1.1, so this * test is not so critical. But it does explore file system * behaviour and will help catch any regression in Java itself, * so is worth retaining. * @see FileUtils#setFileLastModified(java.io.File, long) * @throws IOException */	TokenNameCOMMENT_JAVADOC	 test modification. Since Ant1.7, the method being tested no longer uses reflection to provide backwards support to Java1.1, so this test is not so critical. But it does explore file system behaviour and will help catch any regression in Java itself, so is worth retaining. @see FileUtils#setFileLastModified(java.io.File, long) @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
testSetLastModified	TokenNameIdentifier	 test Set Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
removeThis	TokenNameIdentifier	 remove This
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
removeThis	TokenNameIdentifier	 remove This
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
modTime	TokenNameIdentifier	 mod Time
=	TokenNameEQUAL	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
modTime	TokenNameIdentifier	 mod Time
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Sleep for some time to make sure a touched file would get a * more recent timestamp according to the file system's * granularity (should be > 2s to account for Windows FAT). */	TokenNameCOMMENT_BLOCK	 Sleep for some time to make sure a touched file would get a more recent timestamp according to the file system's granularity (should be > 2s to account for Windows FAT). 
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
setFileLastModified	TokenNameIdentifier	 set File Last Modified
(	TokenNameLPAREN	
removeThis	TokenNameIdentifier	 remove This
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
secondModTime	TokenNameIdentifier	 second Mod Time
=	TokenNameEQUAL	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
secondModTime	TokenNameIdentifier	 second Mod Time
>	TokenNameGREATER	
modTime	TokenNameIdentifier	 mod Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// number of milliseconds in a day 	TokenNameCOMMENT_LINE	number of milliseconds in a day 
final	TokenNamefinal	
int	TokenNameint	
millisperday	TokenNameIdentifier	 millisperday
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
3600	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// in a previous version, the date of the file was set to 123456 	TokenNameCOMMENT_LINE	in a previous version, the date of the file was set to 123456 
// milliseconds since 01.01.1970 	TokenNameCOMMENT_LINE	milliseconds since 01.01.1970 
// it did not work on a computer running JDK 1.4.1_02 + Windows 2000 	TokenNameCOMMENT_LINE	it did not work on a computer running JDK 1.4.1_02 + Windows 2000 
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
setFileLastModified	TokenNameIdentifier	 set File Last Modified
(	TokenNameLPAREN	
removeThis	TokenNameIdentifier	 remove This
,	TokenNameCOMMA	
secondModTime	TokenNameIdentifier	 second Mod Time
+	TokenNamePLUS	
millisperday	TokenNameIdentifier	 millisperday
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
thirdModTime	TokenNameIdentifier	 third Mod Time
=	TokenNameEQUAL	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * I would love to compare this with 123456, but depending on * the filesystems granularity it can take an arbitrary value. * * Just assert the time has changed. */	TokenNameCOMMENT_BLOCK	 I would love to compare this with 123456, but depending on the filesystems granularity it can take an arbitrary value. * Just assert the time has changed. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
thirdModTime	TokenNameIdentifier	 third Mod Time
!=	TokenNameNOT_EQUAL	
secondModTime	TokenNameIdentifier	 second Mod Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResolveFile	TokenNameIdentifier	 test Resolve File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Start with simple absolute file names. */	TokenNameCOMMENT_BLOCK	 Start with simple absolute file names. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * throw in drive letters */	TokenNameCOMMENT_BLOCK	 throw in drive letters 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"C:"	TokenNameStringLiteral	C:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"c:"	TokenNameStringLiteral	c:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * promised to eliminate consecutive slashes after drive letter. */	TokenNameCOMMENT_BLOCK	 promised to eliminate consecutive slashes after drive letter. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/////"	TokenNameStringLiteral	/////
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\\\\\\"	TokenNameStringLiteral	\\\\\\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * throw in NetWare volume names */	TokenNameCOMMENT_BLOCK	 throw in NetWare volume names 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"SYS:"	TokenNameStringLiteral	SYS:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"sys:"	TokenNameStringLiteral	sys:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * promised to eliminate consecutive slashes after drive letter. */	TokenNameCOMMENT_BLOCK	 promised to eliminate consecutive slashes after drive letter. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/////"	TokenNameStringLiteral	/////
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\\\\\\"	TokenNameStringLiteral	\\\\\\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * drive letters must be considered just normal filenames. */	TokenNameCOMMENT_BLOCK	 drive letters must be considered just normal filenames. 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"C:"	TokenNameStringLiteral	C:
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
udir	TokenNameIdentifier	 udir
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"c:"	TokenNameStringLiteral	c:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Now test some relative file name magic. */	TokenNameCOMMENT_BLOCK	 Now test some relative file name magic. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"./4"	TokenNameStringLiteral	./4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
".\4"	TokenNameStringLiteral	.\4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"./.\4"	TokenNameStringLiteral	./.\4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"../3/4"	TokenNameStringLiteral	../3/4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"..\3\4"	TokenNameStringLiteral	..\3\4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"../../5/.././2/./3/6/../4"	TokenNameStringLiteral	../../5/.././2/./3/6/../4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"..\../5/..\./2/./3/6\../4"	TokenNameStringLiteral	..\../5/..\./2/./3/6\../4
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"meaningless result but no exception"	TokenNameStringLiteral	meaningless result but no exception
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/../../b"	TokenNameStringLiteral	/1/../../b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1"	TokenNameStringLiteral	/1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"../../b"	TokenNameStringLiteral	../../b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNormalize	TokenNameIdentifier	 test Normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Start with simple absolute file names. */	TokenNameCOMMENT_BLOCK	 Start with simple absolute file names. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"normalized "/" on dos or netware"	TokenNameStringLiteral	normalized "/" on dos or netware
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"normalized "\" on dos or netware"	TokenNameStringLiteral	normalized "\" on dos or netware
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * throw in drive letters */	TokenNameCOMMENT_BLOCK	 throw in drive letters 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"C:"	TokenNameStringLiteral	C:
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
" is not an absolute path"	TokenNameStringLiteral	 is not an absolute path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"c:"	TokenNameStringLiteral	c:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * promised to eliminate consecutive slashes after drive letter. */	TokenNameCOMMENT_BLOCK	 promised to eliminate consecutive slashes after drive letter. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/////"	TokenNameStringLiteral	/////
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\\\\\\"	TokenNameStringLiteral	\\\\\\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * throw in NetWare volume names */	TokenNameCOMMENT_BLOCK	 throw in NetWare volume names 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"SYS:"	TokenNameStringLiteral	SYS:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"sys:"	TokenNameStringLiteral	sys:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\junk"	TokenNameStringLiteral	\junk
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\junk"	TokenNameStringLiteral	\junk
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * promised to eliminate consecutive slashes after drive letter. */	TokenNameCOMMENT_BLOCK	 promised to eliminate consecutive slashes after drive letter. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/////"	TokenNameStringLiteral	/////
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\\\\\\"	TokenNameStringLiteral	\\\\\\
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"C:"	TokenNameStringLiteral	C:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected failure, C: isn't an absolute path on other os's"	TokenNameStringLiteral	Expected failure, C: isn't an absolute path on other os's
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Passed test 	TokenNameCOMMENT_LINE	Passed test 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Now test some relative file name magic. */	TokenNameCOMMENT_BLOCK	 Now test some relative file name magic. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/./4"	TokenNameStringLiteral	/1/2/3/./4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/.\4"	TokenNameStringLiteral	/1/2/3/.\4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/./.\4"	TokenNameStringLiteral	/1/2/3/./.\4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/../3/4"	TokenNameStringLiteral	/1/2/3/../3/4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/..\3\4"	TokenNameStringLiteral	/1/2/3/..\3\4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/../../5/.././2/./3/6/../4"	TokenNameStringLiteral	/1/2/3/../../5/.././2/./3/6/../4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/..\../5/..\./2/./3/6\../4"	TokenNameStringLiteral	/1/2/3/..\../5/..\./2/./3/6\../4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"foo is not an absolute path"	TokenNameStringLiteral	foo is not an absolute path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Expected exception caught 	TokenNameCOMMENT_LINE	Expected exception caught 
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"will not go outside FS root (but will not throw an exception either)"	TokenNameStringLiteral	will not go outside FS root (but will not throw an exception either)
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/../../b"	TokenNameStringLiteral	/1/../../b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/../../b"	TokenNameStringLiteral	/1/../../b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test handling of null arguments. */	TokenNameCOMMENT_JAVADOC	 Test handling of null arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
testNullArgs	TokenNameIdentifier	 test Null Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"successfully normalized a null-file"	TokenNameStringLiteral	successfully normalized a null-file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Expected exception caught 	TokenNameCOMMENT_LINE	Expected exception caught 
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test createTempFile */	TokenNameCOMMENT_JAVADOC	 Test createTempFile 
public	TokenNamepublic	
void	TokenNamevoid	
testCreateTempFile	TokenNameIdentifier	 test Create Temp File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// null parent dir 	TokenNameCOMMENT_LINE	null parent dir 
File	TokenNameIdentifier	 File
tmp1	TokenNameIdentifier	 tmp1
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
,	TokenNameCOMMA	
".suf"	TokenNameStringLiteral	.suf
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmploc	TokenNameIdentifier	 tmploc
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.io.tmpdir"	TokenNameStringLiteral	java.io.tmpdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"starts with pre"	TokenNameStringLiteral	starts with pre
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ends with .suf"	TokenNameStringLiteral	ends with .suf
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".suf"	TokenNameStringLiteral	.suf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File was created"	TokenNameStringLiteral	File was created
,	TokenNameCOMMA	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tmploc	TokenNameIdentifier	 tmploc
,	TokenNameCOMMA	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tmploc	TokenNameIdentifier	 tmploc
+	TokenNamePLUS	
"/ant-test"	TokenNameStringLiteral	/ant-test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeThis	TokenNameIdentifier	 remove This
=	TokenNameEQUAL	
dir2	TokenNameIdentifier	 dir2
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
,	TokenNameCOMMA	
".suf"	TokenNameStringLiteral	.suf
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name2	TokenNameIdentifier	 name2
=	TokenNameEQUAL	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"starts with pre"	TokenNameStringLiteral	starts with pre
,	TokenNameCOMMA	
name2	TokenNameIdentifier	 name2
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ends with .suf"	TokenNameStringLiteral	ends with .suf
,	TokenNameCOMMA	
name2	TokenNameIdentifier	 name2
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".suf"	TokenNameStringLiteral	.suf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File was created"	TokenNameStringLiteral	File was created
,	TokenNameCOMMA	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/tmp"	TokenNameStringLiteral	/tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp1	TokenNameIdentifier	 tmp1
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
,	TokenNameCOMMA	
".suf"	TokenNameStringLiteral	.suf
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"new file"	TokenNameStringLiteral	new file
,	TokenNameCOMMA	
!	TokenNameNOT	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"starts with pre"	TokenNameStringLiteral	starts with pre
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ends with .suf"	TokenNameStringLiteral	ends with .suf
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".suf"	TokenNameStringLiteral	.suf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"is inside parent dir"	TokenNameStringLiteral	is inside parent dir
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
,	TokenNameCOMMA	
".suf"	TokenNameStringLiteral	.suf
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"files are different"	TokenNameStringLiteral	files are different
,	TokenNameCOMMA	
!	TokenNameNOT	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// null parent dir 	TokenNameCOMMENT_LINE	null parent dir 
File	TokenNameIdentifier	 File
tmp3	TokenNameIdentifier	 tmp3
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"pre"	TokenNameStringLiteral	pre
,	TokenNameCOMMA	
".suf"	TokenNameStringLiteral	.suf
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmploc	TokenNameIdentifier	 tmploc
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.io.tmpdir"	TokenNameStringLiteral	java.io.tmpdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tmploc	TokenNameIdentifier	 tmploc
,	TokenNameCOMMA	
tmp3	TokenNameIdentifier	 tmp3
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmp3	TokenNameIdentifier	 tmp3
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test contentEquals */	TokenNameCOMMENT_JAVADOC	 Test contentEquals 
public	TokenNamepublic	
void	TokenNamevoid	
testContentEquals	TokenNameIdentifier	 test Content Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Non existing files"	TokenNameStringLiteral	Non existing files
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
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
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"One exists, the other one doesn't"	TokenNameStringLiteral	One exists, the other one doesn't
,	TokenNameCOMMA	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
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
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
"build.xml"	TokenNameStringLiteral	build.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Don't compare directories"	TokenNameStringLiteral	Don't compare directories
,	TokenNameCOMMA	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
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
"src"	TokenNameStringLiteral	src
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
"src"	TokenNameStringLiteral	src
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File equals itself"	TokenNameStringLiteral	File equals itself
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
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
"build.xml"	TokenNameStringLiteral	build.xml
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
"build.xml"	TokenNameStringLiteral	build.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Files are different"	TokenNameStringLiteral	Files are different
,	TokenNameCOMMA	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
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
"build.xml"	TokenNameStringLiteral	build.xml
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
"docs.xml"	TokenNameStringLiteral	docs.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test createNewFile */	TokenNameCOMMENT_JAVADOC	 Test createNewFile 
public	TokenNamepublic	
void	TokenNamevoid	
testCreateNewFile	TokenNameIdentifier	 test Create New File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
removeThis	TokenNameIdentifier	 remove This
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
removeThis	TokenNameIdentifier	 remove This
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
removeThis	TokenNameIdentifier	 remove This
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test removeLeadingPath. */	TokenNameCOMMENT_JAVADOC	 Test removeLeadingPath. 
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveLeadingPath	TokenNameIdentifier	 test Remove Leading Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/"	TokenNameStringLiteral	/foo/
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"\foo"	TokenNameStringLiteral	\foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"\foo\bar"	TokenNameStringLiteral	\foo\bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"\foo\"	TokenNameStringLiteral	\foo\
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"\foo\bar"	TokenNameStringLiteral	\foo\bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:/foo"	TokenNameStringLiteral	c:/foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:/foo/bar"	TokenNameStringLiteral	c:/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:/foo/"	TokenNameStringLiteral	c:/foo/
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:/foo/bar"	TokenNameStringLiteral	c:/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:\foo"	TokenNameStringLiteral	c:\foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:\foo\bar"	TokenNameStringLiteral	c:\foo\bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:\foo\"	TokenNameStringLiteral	c:\foo\
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:\foo\bar"	TokenNameStringLiteral	c:\foo\bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"/bar"	TokenNameStringLiteral	/bar
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/bar"	TokenNameStringLiteral	/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"/foobar"	TokenNameStringLiteral	/foobar
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foobar"	TokenNameStringLiteral	/foobar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bugzilla report 19979 	TokenNameCOMMENT_LINE	bugzilla report 19979 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar/"	TokenNameStringLiteral	/foo/bar/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar/"	TokenNameStringLiteral	/foo/bar/
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar/"	TokenNameStringLiteral	/foo/bar/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar/"	TokenNameStringLiteral	/foo/bar/
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"foo/bar"	TokenNameStringLiteral	foo/bar
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/foo/bar"	TokenNameStringLiteral	/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:/"	TokenNameStringLiteral	c:/
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:/foo/bar"	TokenNameStringLiteral	c:/foo/bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:\"	TokenNameStringLiteral	c:\
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"c:\foo\bar"	TokenNameStringLiteral	c:\foo\bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test toUri */	TokenNameCOMMENT_JAVADOC	 test toUri 
public	TokenNamepublic	
void	TokenNamevoid	
testToURI	TokenNameIdentifier	 test To URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dosRoot	TokenNameIdentifier	 dos Root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dosRoot	TokenNameIdentifier	 dos Root
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dosRoot	TokenNameIdentifier	 dos Root
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/c:/foo"	TokenNameStringLiteral	file:/c:/foo
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"c:\foo"	TokenNameStringLiteral	c:\foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/SYS:/foo"	TokenNameStringLiteral	file:/SYS:/foo
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"sys:\foo"	TokenNameStringLiteral	sys:\foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/foo"	TokenNameStringLiteral	file:/foo
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"file: URIs must name absolute paths"	TokenNameStringLiteral	file: URIs must name absolute paths
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"./foo"	TokenNameStringLiteral	./foo
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"./foo"	TokenNameStringLiteral	./foo
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
"foo%20bar"	TokenNameStringLiteral	foo%20bar
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"/foo bar"	TokenNameStringLiteral	/foo bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
"foo%23bar"	TokenNameStringLiteral	foo%23bar
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"/foo#bar"	TokenNameStringLiteral	/foo#bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"\foo"	TokenNameStringLiteral	\foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"file: URIs must name absolute paths"	TokenNameStringLiteral	file: URIs must name absolute paths
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
".\foo"	TokenNameStringLiteral	.\foo
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
".\foo"	TokenNameStringLiteral	.\foo
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
"foo%20bar"	TokenNameStringLiteral	foo%20bar
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"\foo bar"	TokenNameStringLiteral	\foo bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
"foo%23bar"	TokenNameStringLiteral	foo%23bar
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"\foo#bar"	TokenNameStringLiteral	\foo#bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// a test with ant for germans 	TokenNameCOMMENT_LINE	a test with ant for germans 
// the escaped character used for the test is the "a umlaut" 	TokenNameCOMMENT_LINE	the escaped character used for the test is the "a umlaut" 
// this is the fix for the bug 37348 	TokenNameCOMMENT_LINE	this is the fix for the bug 37348 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
"%C3%A4nt"	TokenNameStringLiteral	%C3%A4nt
,	TokenNameCOMMA	
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
"/Šnt"	TokenNameStringLiteral	/Šnt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Authority field is unnecessary, but harmless, in file: URIs. * Java 1.4 does not produce it when using File.toURI. */	TokenNameCOMMENT_JAVADOC	 Authority field is unnecessary, but harmless, in file: URIs. Java 1.4 does not produce it when using File.toURI. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
removeExtraneousAuthority	TokenNameIdentifier	 remove Extraneous Authority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"file:///"	TokenNameStringLiteral	file:///
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"file:/"	TokenNameStringLiteral	file:/
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsContextRelativePath	TokenNameIdentifier	 test Is Context Relative Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
isContextRelativePath	TokenNameIdentifier	 is Context Relative Path
(	TokenNameLPAREN	
"/Šnt"	TokenNameStringLiteral	/Šnt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
isContextRelativePath	TokenNameIdentifier	 is Context Relative Path
(	TokenNameLPAREN	
"\foo"	TokenNameStringLiteral	\foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * test fromUri */	TokenNameCOMMENT_JAVADOC	 test fromUri 
public	TokenNamepublic	
void	TokenNamevoid	
testFromURI	TokenNameIdentifier	 test From URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dosRoot	TokenNameIdentifier	 dos Root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dosRoot	TokenNameIdentifier	 dos Root
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dosRoot	TokenNameIdentifier	 dos Root
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
"SYS:\foo"	TokenNameStringLiteral	SYS:\foo
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
"file:///sys:/foo"	TokenNameStringLiteral	file:///sys:/foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
"C:\foo"	TokenNameStringLiteral	C:\foo
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
"file:///c:/foo"	TokenNameStringLiteral	file:///c:/foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
"file:///foo"	TokenNameStringLiteral	file:///foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
"file:./foo"	TokenNameStringLiteral	file:./foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"foo bar"	TokenNameStringLiteral	foo bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
"file:///foo%20bar"	TokenNameStringLiteral	file:///foo%20bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
dosRoot	TokenNameIdentifier	 dos Root
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"foo#bar"	TokenNameStringLiteral	foo#bar
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
"file:///foo%23bar"	TokenNameStringLiteral	file:///foo%23bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testModificationTests	TokenNameIdentifier	 test Modification Tests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//get a time 	TokenNameCOMMENT_LINE	get a time 
long	TokenNamelong	
firstTime	TokenNameIdentifier	 first Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//add some time. We assume no OS has a granularity this bad 	TokenNameCOMMENT_LINE	add some time. We assume no OS has a granularity this bad 
long	TokenNamelong	
secondTime	TokenNameIdentifier	 second Time
=	TokenNameEQUAL	
firstTime	TokenNameIdentifier	 first Time
+	TokenNamePLUS	
60000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* assertTrue("same timestamp is up to date", fu.isUpToDate(firstTime, firstTime)); */	TokenNameCOMMENT_BLOCK	 assertTrue("same timestamp is up to date", fu.isUpToDate(firstTime, firstTime)); 
//check that older is up to date with a newer dest 	TokenNameCOMMENT_LINE	check that older is up to date with a newer dest 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"older source files are up to date"	TokenNameStringLiteral	older source files are up to date
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
isUpToDate	TokenNameIdentifier	 is Up To Date
(	TokenNameLPAREN	
firstTime	TokenNameIdentifier	 first Time
,	TokenNameCOMMA	
secondTime	TokenNameIdentifier	 second Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check that older is up to date with a newer dest 	TokenNameCOMMENT_LINE	check that older is up to date with a newer dest 
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"newer source files are no up to date"	TokenNameStringLiteral	newer source files are no up to date
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
isUpToDate	TokenNameIdentifier	 is Up To Date
(	TokenNameLPAREN	
secondTime	TokenNameIdentifier	 second Time
,	TokenNameCOMMA	
firstTime	TokenNameIdentifier	 first Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"-1 dest timestamp implies nonexistence"	TokenNameStringLiteral	-1 dest timestamp implies nonexistence
,	TokenNameCOMMA	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
isUpToDate	TokenNameIdentifier	 is Up To Date
(	TokenNameLPAREN	
firstTime	TokenNameIdentifier	 first Time
,	TokenNameCOMMA	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHasErrorInCase	TokenNameIdentifier	 test Has Error In Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
tempFolder	TokenNameIdentifier	 temp Folder
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.io.tmpdir"	TokenNameStringLiteral	java.io.tmpdir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
wellcased	TokenNameIdentifier	 wellcased
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"beta"	TokenNameStringLiteral	beta
,	TokenNameCOMMA	
tempFolder	TokenNameIdentifier	 temp Folder
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
wellcased	TokenNameIdentifier	 wellcased
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
wrongcased	TokenNameIdentifier	 wrongcased
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tempFolder	TokenNameIdentifier	 temp Folder
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"mac"	TokenNameStringLiteral	mac
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"unix"	TokenNameStringLiteral	unix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//no guarantees on filesystem case-sensitivity 	TokenNameCOMMENT_LINE	no guarantees on filesystem case-sensitivity 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
hasErrorInCase	TokenNameIdentifier	 has Error In Case
(	TokenNameLPAREN	
wrongcased	TokenNameIdentifier	 wrongcased
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
hasErrorInCase	TokenNameIdentifier	 has Error In Case
(	TokenNameLPAREN	
wellcased	TokenNameIdentifier	 wellcased
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
hasErrorInCase	TokenNameIdentifier	 has Error In Case
(	TokenNameLPAREN	
wrongcased	TokenNameIdentifier	 wrongcased
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
hasErrorInCase	TokenNameIdentifier	 has Error In Case
(	TokenNameLPAREN	
wellcased	TokenNameIdentifier	 wellcased
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetDefaultEncoding	TokenNameIdentifier	 test Get Default Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This just tests that the function does not blow up 	TokenNameCOMMENT_LINE	This just tests that the function does not blow up 
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getDefaultEncoding	TokenNameIdentifier	 get Default Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * adapt file separators to local conventions */	TokenNameCOMMENT_JAVADOC	 adapt file separators to local conventions 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convenience method * normalize brings the drive in uppercase * the drive letter is in lower case under cygwin * calling this method allows tests where normalize is called to pass under cygwin */	TokenNameCOMMENT_JAVADOC	 convenience method normalize brings the drive in uppercase the drive letter is in lower case under cygwin calling this method allows tests where normalize is called to pass under cygwin 
private	TokenNameprivate	
void	TokenNamevoid	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb1	TokenNameIdentifier	 sb1
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb2	TokenNameIdentifier	 sb2
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb1	TokenNameIdentifier	 sb1
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb2	TokenNameIdentifier	 sb2
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sb1	TokenNameIdentifier	 sb1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sb2	TokenNameIdentifier	 sb2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
