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
sound	TokenNameIdentifier	 sound
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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * Plays a sound file at the end of the build, according to whether the build failed or succeeded. * * There are three attributes to be set: * * <code>source</code>: the location of the audio file to be played * <code>duration</code>: play the sound file continuously until "duration" milliseconds has expired * <code>loops</code>: the number of times the sound file should be played until stopped * * I have only tested this with .WAV and .AIFF sound file formats. Both seem * to work fine. * * plans for the future: * - use the midi api to define sounds (or drum beat etc) in xml and have * Ant play them back * */	TokenNameCOMMENT_JAVADOC	 Plays a sound file at the end of the build, according to whether the build failed or succeeded. * There are three attributes to be set: * <code>source</code>: the location of the audio file to be played <code>duration</code>: play the sound file continuously until "duration" milliseconds has expired <code>loops</code>: the number of times the sound file should be played until stopped * I have only tested this with .WAV and .AIFF sound file formats. Both seem to work fine. * plans for the future: - use the midi api to define sounds (or drum beat etc) in xml and have Ant play them back 
public	TokenNamepublic	
class	TokenNameclass	
SoundTask	TokenNameIdentifier	 Sound Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
BuildAlert	TokenNameIdentifier	 Build Alert
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BuildAlert	TokenNameIdentifier	 Build Alert
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * add a sound when the build succeeds * @return a BuildAlert to be configured */	TokenNameCOMMENT_JAVADOC	 add a sound when the build succeeds @return a BuildAlert to be configured 
public	TokenNamepublic	
BuildAlert	TokenNameIdentifier	 Build Alert
createSuccess	TokenNameIdentifier	 create Success
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
new	TokenNamenew	
BuildAlert	TokenNameIdentifier	 Build Alert
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
success	TokenNameIdentifier	 success
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a sound when the build fails * @return a BuildAlert to be configured */	TokenNameCOMMENT_JAVADOC	 add a sound when the build fails @return a BuildAlert to be configured 
public	TokenNamepublic	
BuildAlert	TokenNameIdentifier	 Build Alert
createFail	TokenNameIdentifier	 create Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
new	TokenNamenew	
BuildAlert	TokenNameIdentifier	 Build Alert
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fail	TokenNameIdentifier	 fail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructor for SoundTask. */	TokenNameCOMMENT_JAVADOC	 Constructor for SoundTask. 
public	TokenNamepublic	
SoundTask	TokenNameIdentifier	 Sound Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Initialize the task. */	TokenNameCOMMENT_JAVADOC	 Initialize the task. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Execute the task. */	TokenNameCOMMENT_JAVADOC	 Execute the task. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AntSoundPlayer	TokenNameIdentifier	 Ant Sound Player
soundPlayer	TokenNameIdentifier	 sound Player
=	TokenNameEQUAL	
new	TokenNamenew	
AntSoundPlayer	TokenNameIdentifier	 Ant Sound Player
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"No nested success element found."	TokenNameStringLiteral	No nested success element found.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
soundPlayer	TokenNameIdentifier	 sound Player
.	TokenNameDOT	
addBuildSuccessfulSound	TokenNameIdentifier	 add Build Successful Sound
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
success	TokenNameIdentifier	 success
.	TokenNameDOT	
getLoops	TokenNameIdentifier	 get Loops
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
success	TokenNameIdentifier	 success
.	TokenNameDOT	
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"No nested failure element found."	TokenNameStringLiteral	No nested failure element found.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
soundPlayer	TokenNameIdentifier	 sound Player
.	TokenNameDOT	
addBuildFailedSound	TokenNameIdentifier	 add Build Failed Sound
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fail	TokenNameIdentifier	 fail
.	TokenNameDOT	
getLoops	TokenNameIdentifier	 get Loops
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fail	TokenNameIdentifier	 fail
.	TokenNameDOT	
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
soundPlayer	TokenNameIdentifier	 sound Player
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A class to be extended by any BuildAlert's that require the output * of sound. */	TokenNameCOMMENT_JAVADOC	 A class to be extended by any BuildAlert's that require the output of sound. 
public	TokenNamepublic	
class	TokenNameclass	
BuildAlert	TokenNameIdentifier	 Build Alert
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
loops	TokenNameIdentifier	 loops
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Sets the duration in milliseconds the file should be played; optional. * @param duration the duration in millisconds */	TokenNameCOMMENT_JAVADOC	 Sets the duration in milliseconds the file should be played; optional. @param duration the duration in millisconds 
public	TokenNamepublic	
void	TokenNamevoid	
setDuration	TokenNameIdentifier	 set Duration
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the location of the file to get the audio; required. * * @param source the name of a sound-file directory or of the audio file */	TokenNameCOMMENT_JAVADOC	 Sets the location of the file to get the audio; required. * @param source the name of a sound-file directory or of the audio file 
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of times the source file should be played; optional. * * @param loops the number of loops to play the source file */	TokenNameCOMMENT_JAVADOC	 Sets the number of times the source file should be played; optional. * @param loops the number of loops to play the source file 
public	TokenNamepublic	
void	TokenNamevoid	
setLoops	TokenNameIdentifier	 set Loops
(	TokenNameLPAREN	
int	TokenNameint	
loops	TokenNameIdentifier	 loops
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
loops	TokenNameIdentifier	 loops
=	TokenNameEQUAL	
loops	TokenNameIdentifier	 loops
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the location of the file to get the audio. * @return the file location */	TokenNameCOMMENT_JAVADOC	 Gets the location of the file to get the audio. @return the file location 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
nofile	TokenNameIdentifier	 nofile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Check if source is a directory 	TokenNameCOMMENT_LINE	Check if source is a directory 
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the list of files in the dir 	TokenNameCOMMENT_LINE	get the list of files in the dir 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No files found in directory "	TokenNameStringLiteral	No files found in directory 
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numfiles	TokenNameIdentifier	 numfiles
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get a random number between 0 and the number of files 	TokenNameCOMMENT_LINE	get a random number between 0 and the number of files 
Random	TokenNameIdentifier	 Random
rn	TokenNameIdentifier	 rn
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
rn	TokenNameIdentifier	 rn
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
numfiles	TokenNameIdentifier	 numfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the source to the file at that location 	TokenNameCOMMENT_LINE	set the source to the file at that location 
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
+	TokenNamePLUS	
": invalid path."	TokenNameStringLiteral	: invalid path.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
nofile	TokenNameIdentifier	 nofile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of times the source file should be played. * * @return the number of loops to play the source file */	TokenNameCOMMENT_JAVADOC	 Sets the number of times the source file should be played. * @return the number of loops to play the source file 
public	TokenNamepublic	
int	TokenNameint	
getLoops	TokenNameIdentifier	 get Loops
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
loops	TokenNameIdentifier	 loops
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the duration in milliseconds the file should be played. * @return the duration in milliseconds */	TokenNameCOMMENT_JAVADOC	 Gets the duration in milliseconds the file should be played. @return the duration in milliseconds 
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
