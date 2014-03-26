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
image	TokenNameIdentifier	 image
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Tests the Image task. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Tests the Image task. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
ImageTest	TokenNameIdentifier	 Image Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/image/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/image/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
=	TokenNameEQUAL	
"largeimage.jpg"	TokenNameStringLiteral	largeimage.jpg
;	TokenNameSEMICOLON	
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
ImageTest	TokenNameIdentifier	 Image Test
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
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"image.xml"	TokenNameStringLiteral	image.xml
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
testEchoToLog	TokenNameIdentifier	 test Echo To Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testEchoToLog"	TokenNameStringLiteral	testEchoToLog
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleScale	TokenNameIdentifier	 test Simple Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testSimpleScale"	TokenNameStringLiteral	testSimpleScale
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
"/dest/"	TokenNameStringLiteral	/dest/
+	TokenNamePLUS	
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not create "	TokenNameStringLiteral	Did not create 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverwriteTrue	TokenNameIdentifier	 test Overwrite True
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testSimpleScale"	TokenNameStringLiteral	testSimpleScale
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
"/dest/"	TokenNameStringLiteral	/dest/
+	TokenNamePLUS	
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastModified	TokenNameIdentifier	 last Modified
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testOverwriteTrue"	TokenNameStringLiteral	testOverwriteTrue
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
"/dest/"	TokenNameStringLiteral	/dest/
+	TokenNamePLUS	
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
overwrittenLastModified	TokenNameIdentifier	 overwritten Last Modified
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File was not overwritten."	TokenNameStringLiteral	File was not overwritten.
,	TokenNameCOMMA	
lastModified	TokenNameIdentifier	 last Modified
<	TokenNameLESS	
overwrittenLastModified	TokenNameIdentifier	 overwritten Last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverwriteFalse	TokenNameIdentifier	 test Overwrite False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testSimpleScale"	TokenNameStringLiteral	testSimpleScale
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
"/dest/"	TokenNameStringLiteral	/dest/
+	TokenNamePLUS	
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastModified	TokenNameIdentifier	 last Modified
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testOverwriteFalse"	TokenNameStringLiteral	testOverwriteFalse
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
"/dest/"	TokenNameStringLiteral	/dest/
+	TokenNamePLUS	
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
overwrittenLastModified	TokenNameIdentifier	 overwritten Last Modified
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"File was overwritten."	TokenNameStringLiteral	File was overwritten.
,	TokenNameCOMMA	
lastModified	TokenNameIdentifier	 last Modified
==	TokenNameEQUAL_EQUAL	
overwrittenLastModified	TokenNameIdentifier	 overwritten Last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleScaleWithMapper	TokenNameIdentifier	 test Simple Scale With Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testSimpleScaleWithMapper"	TokenNameStringLiteral	testSimpleScaleWithMapper
,	TokenNameCOMMA	
"Processing File"	TokenNameStringLiteral	Processing File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
"/dest/scaled-"	TokenNameStringLiteral	/dest/scaled-
+	TokenNamePLUS	
LARGEIMAGE	TokenNameIdentifier	 LARGEIMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not create "	TokenNameStringLiteral	Did not create 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
off_testFailOnError	TokenNameIdentifier	 off test Fail On Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
"testFailOnError"	TokenNameStringLiteral	testFailOnError
,	TokenNameCOMMA	
"Unable to process image stream"	TokenNameStringLiteral	Unable to process image stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Run time exception should say "	TokenNameStringLiteral	Run time exception should say 
+	TokenNamePLUS	
"'Unable to process image stream'. :"	TokenNameStringLiteral	'Unable to process image stream'. :
+	TokenNamePLUS	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Unable to process image stream"	TokenNameStringLiteral	Unable to process image stream
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
createRelativeFile	TokenNameIdentifier	 create Relative File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else 	TokenNameCOMMENT_LINE	else 
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
