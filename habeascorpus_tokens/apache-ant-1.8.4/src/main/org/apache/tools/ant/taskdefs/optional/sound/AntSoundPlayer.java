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
// ant includes 	TokenNameCOMMENT_LINE	ant includes 
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
AudioFormat	TokenNameIdentifier	 Audio Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
AudioInputStream	TokenNameIdentifier	 Audio Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
AudioSystem	TokenNameIdentifier	 Audio System
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
Clip	TokenNameIdentifier	 Clip
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
DataLine	TokenNameIdentifier	 Data Line
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
Line	TokenNameIdentifier	 Line
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
LineEvent	TokenNameIdentifier	 Line Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
LineListener	TokenNameIdentifier	 Line Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
LineUnavailableException	TokenNameIdentifier	 Line Unavailable Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
sound	TokenNameIdentifier	 sound
.	TokenNameDOT	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
UnsupportedAudioFileException	TokenNameIdentifier	 Unsupported Audio File Exception
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
BuildEvent	TokenNameIdentifier	 Build Event
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
BuildListener	TokenNameIdentifier	 Build Listener
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
/** * This class is designed to be used by any AntTask that requires audio output. * * It implements the BuildListener interface to listen for BuildEvents * and could be easily extended to provide audio output upon any * specific build events occurring. * * I have only tested this with .WAV and .AIFF sound file formats. Both seem to work fine. * */	TokenNameCOMMENT_JAVADOC	 This class is designed to be used by any AntTask that requires audio output. * It implements the BuildListener interface to listen for BuildEvents and could be easily extended to provide audio output upon any specific build events occurring. * I have only tested this with .WAV and .AIFF sound file formats. Both seem to work fine. 
public	TokenNamepublic	
class	TokenNameclass	
AntSoundPlayer	TokenNameIdentifier	 Ant Sound Player
implements	TokenNameimplements	
LineListener	TokenNameIdentifier	 Line Listener
,	TokenNameCOMMA	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
fileSuccess	TokenNameIdentifier	 file Success
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
loopsSuccess	TokenNameIdentifier	 loops Success
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
durationSuccess	TokenNameIdentifier	 duration Success
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
fileFail	TokenNameIdentifier	 file Fail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
loopsFail	TokenNameIdentifier	 loops Fail
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
durationFail	TokenNameIdentifier	 duration Fail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Constructor for AntSoundPlayer. */	TokenNameCOMMENT_JAVADOC	 Constructor for AntSoundPlayer. 
public	TokenNamepublic	
AntSoundPlayer	TokenNameIdentifier	 Ant Sound Player
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @param file the location of the audio file to be played when the * build is successful * @param loops the number of times the file should be played when * the build is successful * @param duration the number of milliseconds the file should be * played when the build is successful */	TokenNameCOMMENT_JAVADOC	 @param file the location of the audio file to be played when the build is successful @param loops the number of times the file should be played when the build is successful @param duration the number of milliseconds the file should be played when the build is successful 
public	TokenNamepublic	
void	TokenNamevoid	
addBuildSuccessfulSound	TokenNameIdentifier	 add Build Successful Sound
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
int	TokenNameint	
loops	TokenNameIdentifier	 loops
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fileSuccess	TokenNameIdentifier	 file Success
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loopsSuccess	TokenNameIdentifier	 loops Success
=	TokenNameEQUAL	
loops	TokenNameIdentifier	 loops
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
durationSuccess	TokenNameIdentifier	 duration Success
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param fileFail the location of the audio file to be played * when the build fails * @param loopsFail the number of times the file should be played * when the build is fails * @param durationFail the number of milliseconds the file should be * played when the build fails */	TokenNameCOMMENT_JAVADOC	 @param fileFail the location of the audio file to be played when the build fails @param loopsFail the number of times the file should be played when the build is fails @param durationFail the number of milliseconds the file should be played when the build fails 
public	TokenNamepublic	
void	TokenNamevoid	
addBuildFailedSound	TokenNameIdentifier	 add Build Failed Sound
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
fileFail	TokenNameIdentifier	 file Fail
,	TokenNameCOMMA	
int	TokenNameint	
loopsFail	TokenNameIdentifier	 loops Fail
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
durationFail	TokenNameIdentifier	 duration Fail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fileFail	TokenNameIdentifier	 file Fail
=	TokenNameEQUAL	
fileFail	TokenNameIdentifier	 file Fail
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loopsFail	TokenNameIdentifier	 loops Fail
=	TokenNameEQUAL	
loopsFail	TokenNameIdentifier	 loops Fail
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
durationFail	TokenNameIdentifier	 duration Fail
=	TokenNameEQUAL	
durationFail	TokenNameIdentifier	 duration Fail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Plays the file for duration milliseconds or loops. */	TokenNameCOMMENT_JAVADOC	 Plays the file for duration milliseconds or loops. 
private	TokenNameprivate	
void	TokenNamevoid	
play	TokenNameIdentifier	 play
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
int	TokenNameint	
loops	TokenNameIdentifier	 loops
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Clip	TokenNameIdentifier	 Clip
audioClip	TokenNameIdentifier	 audio Clip
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AudioInputStream	TokenNameIdentifier	 Audio Input Stream
audioInputStream	TokenNameIdentifier	 audio Input Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
audioInputStream	TokenNameIdentifier	 audio Input Stream
=	TokenNameEQUAL	
AudioSystem	TokenNameIdentifier	 Audio System
.	TokenNameDOT	
getAudioInputStream	TokenNameIdentifier	 get Audio Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedAudioFileException	TokenNameIdentifier	 Unsupported Audio File Exception
uafe	TokenNameIdentifier	 uafe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Audio format is not yet supported: "	TokenNameStringLiteral	Audio format is not yet supported: 
+	TokenNamePLUS	
uafe	TokenNameIdentifier	 uafe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
audioInputStream	TokenNameIdentifier	 audio Input Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AudioFormat	TokenNameIdentifier	 Audio Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
audioInputStream	TokenNameIdentifier	 audio Input Stream
.	TokenNameDOT	
getFormat	TokenNameIdentifier	 get Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataLine	TokenNameIdentifier	 Data Line
.	TokenNameDOT	
Info	TokenNameIdentifier	 Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
new	TokenNamenew	
DataLine	TokenNameIdentifier	 Data Line
.	TokenNameDOT	
Info	TokenNameIdentifier	 Info
(	TokenNameLPAREN	
Clip	TokenNameIdentifier	 Clip
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
AudioSystem	TokenNameIdentifier	 Audio System
.	TokenNameDOT	
NOT_SPECIFIED	TokenNameIdentifier	 NOT  SPECIFIED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
audioClip	TokenNameIdentifier	 audio Clip
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Clip	TokenNameIdentifier	 Clip
)	TokenNameRPAREN	
AudioSystem	TokenNameIdentifier	 Audio System
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
audioClip	TokenNameIdentifier	 audio Clip
.	TokenNameDOT	
addLineListener	TokenNameIdentifier	 add Line Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
audioClip	TokenNameIdentifier	 audio Clip
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
audioInputStream	TokenNameIdentifier	 audio Input Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LineUnavailableException	TokenNameIdentifier	 Line Unavailable Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"The sound device is currently unavailable"	TokenNameStringLiteral	The sound device is currently unavailable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
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
if	TokenNameif	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
playClip	TokenNameIdentifier	 play Clip
(	TokenNameLPAREN	
audioClip	TokenNameIdentifier	 audio Clip
,	TokenNameCOMMA	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
playClip	TokenNameIdentifier	 play Clip
(	TokenNameLPAREN	
audioClip	TokenNameIdentifier	 audio Clip
,	TokenNameCOMMA	
loops	TokenNameIdentifier	 loops
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
audioClip	TokenNameIdentifier	 audio Clip
.	TokenNameDOT	
drain	TokenNameIdentifier	 drain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
audioClip	TokenNameIdentifier	 audio Clip
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Can't get data from file "	TokenNameStringLiteral	Can't get data from file 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
playClip	TokenNameIdentifier	 play Clip
(	TokenNameLPAREN	
Clip	TokenNameIdentifier	 Clip
clip	TokenNameIdentifier	 clip
,	TokenNameCOMMA	
int	TokenNameint	
loops	TokenNameIdentifier	 loops
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
loop	TokenNameIdentifier	 loop
(	TokenNameLPAREN	
loops	TokenNameIdentifier	 loops
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
long	TokenNamelong	
timeLeft	TokenNameIdentifier	 time Left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
getMicrosecondLength	TokenNameIdentifier	 get Microsecond Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
getMicrosecondPosition	TokenNameIdentifier	 get Microsecond Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timeLeft	TokenNameIdentifier	 time Left
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
timeLeft	TokenNameIdentifier	 time Left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
isRunning	TokenNameIdentifier	 is Running
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
isRunning	TokenNameIdentifier	 is Running
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
playClip	TokenNameIdentifier	 play Clip
(	TokenNameLPAREN	
Clip	TokenNameIdentifier	 Clip
clip	TokenNameIdentifier	 clip
,	TokenNameCOMMA	
long	TokenNamelong	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
loop	TokenNameIdentifier	 loop
(	TokenNameLPAREN	
Clip	TokenNameIdentifier	 Clip
.	TokenNameDOT	
LOOP_CONTINUOUSLY	TokenNameIdentifier	 LOOP  CONTINUOUSLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore Exception 	TokenNameCOMMENT_LINE	Ignore Exception 
}	TokenNameRBRACE	
clip	TokenNameIdentifier	 clip
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is implemented to listen for any line events and closes the * clip if required. * @param event the line event to follow */	TokenNameCOMMENT_JAVADOC	 This is implemented to listen for any line events and closes the clip if required. @param event the line event to follow 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
LineEvent	TokenNameIdentifier	 Line Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
LineEvent	TokenNameIdentifier	 Line Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STOP	TokenNameIdentifier	 STOP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Line	TokenNameIdentifier	 Line
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fired before any targets are started. * @param event ignored */	TokenNameCOMMENT_JAVADOC	 Fired before any targets are started. @param event ignored 
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired after the last target has finished. This event * will still be thrown if an error occurred during the build. * @param event the build finished event. * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Fired after the last target has finished. This event will still be thrown if an error occurred during the build. @param event the build finished event. @see BuildEvent#getException() 
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fileSuccess	TokenNameIdentifier	 file Success
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// build successfull! 	TokenNameCOMMENT_LINE	build successfull! 
play	TokenNameIdentifier	 play
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fileSuccess	TokenNameIdentifier	 file Success
,	TokenNameCOMMA	
loopsSuccess	TokenNameIdentifier	 loops Success
,	TokenNameCOMMA	
durationSuccess	TokenNameIdentifier	 duration Success
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fileFail	TokenNameIdentifier	 file Fail
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
play	TokenNameIdentifier	 play
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fileFail	TokenNameIdentifier	 file Fail
,	TokenNameCOMMA	
loopsFail	TokenNameIdentifier	 loops Fail
,	TokenNameCOMMA	
durationFail	TokenNameIdentifier	 duration Fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fired when a target is started. * @param event ignored. * @see BuildEvent#getTarget() */	TokenNameCOMMENT_JAVADOC	 Fired when a target is started. @param event ignored. @see BuildEvent#getTarget() 
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired when a target has finished. This event will * still be thrown if an error occurred during the build. * @param event ignored. * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Fired when a target has finished. This event will still be thrown if an error occurred during the build. @param event ignored. @see BuildEvent#getException() 
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired when a task is started. * @param event ignored. * @see BuildEvent#getTask() */	TokenNameCOMMENT_JAVADOC	 Fired when a task is started. @param event ignored. @see BuildEvent#getTask() 
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired when a task has finished. This event will still * be throw if an error occurred during the build. * @param event ignored. * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Fired when a task has finished. This event will still be throw if an error occurred during the build. @param event ignored. @see BuildEvent#getException() 
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired whenever a message is logged. * @param event the build event * @see BuildEvent#getMessage() * @see BuildEvent#getPriority() */	TokenNameCOMMENT_JAVADOC	 Fired whenever a message is logged. @param event the build event @see BuildEvent#getMessage() @see BuildEvent#getPriority() 
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
