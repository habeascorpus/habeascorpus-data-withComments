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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
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
BuildLogger	TokenNameIdentifier	 Build Logger
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
DefaultLogger	TokenNameIdentifier	 Default Logger
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
SubBuildListener	TokenNameIdentifier	 Sub Build Listener
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * This is a class that represents a recorder. This is the listener to the * build process. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 This is a class that represents a recorder. This is the listener to the build process. * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
implements	TokenNameimplements	
BuildLogger	TokenNameIdentifier	 Build Logger
,	TokenNameCOMMA	
SubBuildListener	TokenNameIdentifier	 Sub Build Listener
{	TokenNameLBRACE	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// ATTRIBUTES 	TokenNameCOMMENT_LINE	ATTRIBUTES 
/** The name of the file associated with this recorder entry. */	TokenNameCOMMENT_JAVADOC	 The name of the file associated with this recorder entry. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The state of the recorder (recorder on or off). */	TokenNameCOMMENT_JAVADOC	 The state of the recorder (recorder on or off). 
private	TokenNameprivate	
boolean	TokenNameboolean	
record	TokenNameIdentifier	 record
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The current verbosity level to record at. */	TokenNameCOMMENT_JAVADOC	 The current verbosity level to record at. 
private	TokenNameprivate	
int	TokenNameint	
loglevel	TokenNameIdentifier	 loglevel
=	TokenNameEQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
;	TokenNameSEMICOLON	
/** The output PrintStream to record to. */	TokenNameCOMMENT_JAVADOC	 The output PrintStream to record to. 
private	TokenNameprivate	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The start time of the last know target. */	TokenNameCOMMENT_JAVADOC	 The start time of the last know target. 
private	TokenNameprivate	
long	TokenNamelong	
targetStartTime	TokenNameIdentifier	 target Start Time
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Strip task banners if true. */	TokenNameCOMMENT_JAVADOC	 Strip task banners if true. 
private	TokenNameprivate	
boolean	TokenNameboolean	
emacsMode	TokenNameIdentifier	 emacs Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** project instance the recorder is associated with */	TokenNameCOMMENT_JAVADOC	 project instance the recorder is associated with 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// CONSTRUCTORS / INITIALIZERS 	TokenNameCOMMENT_LINE	CONSTRUCTORS / INITIALIZERS 
/** * @param name The name of this recorder (used as the filename). */	TokenNameCOMMENT_JAVADOC	 @param name The name of this recorder (used as the filename). 
protected	TokenNameprotected	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetStartTime	TokenNameIdentifier	 target Start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// ACCESSOR METHODS 	TokenNameCOMMENT_LINE	ACCESSOR METHODS 
/** * @return the name of the file the output is sent to. */	TokenNameCOMMENT_JAVADOC	 @return the name of the file the output is sent to. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turns off or on this recorder. * * @param state true for on, false for off, null for no change. */	TokenNameCOMMENT_JAVADOC	 Turns off or on this recorder. * @param state true for on, false for off, null for no change. 
public	TokenNamepublic	
void	TokenNamevoid	
setRecordState	TokenNameIdentifier	 set Record State
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
record	TokenNameIdentifier	 record
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#buildStarted(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#buildStarted(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"> BUILD STARTED"	TokenNameStringLiteral	> BUILD STARTED
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#buildFinished(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#buildFinished(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"< BUILD FINISHED"	TokenNameStringLiteral	< BUILD FINISHED
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
&&	TokenNameAND_AND	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"BUILD SUCCESSFUL"	TokenNameStringLiteral	BUILD SUCCESSFUL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"BUILD FAILED"	TokenNameStringLiteral	BUILD FAILED
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cleans up any resources held by this recorder entry at the end * of a subbuild if it has been created for the subbuild's project * instance. * * @param event the buildFinished event * * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Cleans up any resources held by this recorder entry at the end of a subbuild if it has been created for the subbuild's project instance. * @param event the buildFinished event * @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
subBuildFinished	TokenNameIdentifier	 sub Build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Empty implementation to satisfy the BuildListener interface. * * @param event the buildStarted event * * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Empty implementation to satisfy the BuildListener interface. * @param event the buildStarted event * @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
subBuildStarted	TokenNameIdentifier	 sub Build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#targetStarted(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#targetStarted(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
">> TARGET STARTED -- "	TokenNameStringLiteral	>> TARGET STARTED -- 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetStartTime	TokenNameIdentifier	 target Start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#targetFinished(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#targetFinished(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"<< TARGET FINISHED -- "	TokenNameStringLiteral	<< TARGET FINISHED -- 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
formatTime	TokenNameIdentifier	 format Time
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
targetStartTime	TokenNameIdentifier	 target Start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": duration "	TokenNameStringLiteral	: duration 
+	TokenNamePLUS	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#taskStarted(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#taskStarted(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
">>> TASK STARTED -- "	TokenNameStringLiteral	>>> TASK STARTED -- 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#taskFinished(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#taskFinished(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"<<< TASK FINISHED -- "	TokenNameStringLiteral	<<< TASK FINISHED -- 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.BuildListener#messageLogged(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.BuildListener#messageLogged(BuildEvent) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"--- MESSAGE LOGGED"	TokenNameStringLiteral	--- MESSAGE LOGGED
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
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
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
DefaultLogger	TokenNameIdentifier	 Default Logger
.	TokenNameDOT	
LEFT_COLUMN_SIZE	TokenNameIdentifier	 LEFT  COLUMN  SIZE
-	TokenNameMINUS	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The thing that actually sends the information to the output. * * @param mesg The message to log. * @param level The verbosity level of the message. */	TokenNameCOMMENT_JAVADOC	 The thing that actually sends the information to the output. * @param mesg The message to log. @param level The verbosity level of the message. 
private	TokenNameprivate	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mesg	TokenNameIdentifier	 mesg
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
<=	TokenNameLESS_EQUAL	
loglevel	TokenNameIdentifier	 loglevel
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
mesg	TokenNameIdentifier	 mesg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
&&	TokenNameAND_AND	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see BuildLogger#setMessageOutputLevel(int) */	TokenNameCOMMENT_JAVADOC	 @see BuildLogger#setMessageOutputLevel(int) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMessageOutputLevel	TokenNameIdentifier	 set Message Output Level
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
>=	TokenNameGREATER_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
&&	TokenNameAND_AND	
level	TokenNameIdentifier	 level
<=	TokenNameLESS_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loglevel	TokenNameIdentifier	 loglevel
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see BuildLogger#setOutputPrintStream(PrintStream) */	TokenNameCOMMENT_JAVADOC	 @see BuildLogger#setOutputPrintStream(PrintStream) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputPrintStream	TokenNameIdentifier	 set Output Print Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see BuildLogger#setEmacsMode(boolean) */	TokenNameCOMMENT_JAVADOC	 @see BuildLogger#setEmacsMode(boolean) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setEmacsMode	TokenNameIdentifier	 set Emacs Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
emacsMode	TokenNameIdentifier	 emacs Mode
=	TokenNameEQUAL	
emacsMode	TokenNameIdentifier	 emacs Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see BuildLogger#setErrorPrintStream(PrintStream) */	TokenNameCOMMENT_JAVADOC	 @see BuildLogger#setErrorPrintStream(PrintStream) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorPrintStream	TokenNameIdentifier	 set Error Print Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputPrintStream	TokenNameIdentifier	 set Output Print Stream
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatTime	TokenNameIdentifier	 format Time
(	TokenNameLPAREN	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
long	TokenNamelong	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
millis	TokenNameIdentifier	 millis
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
seconds	TokenNameIdentifier	 seconds
/	TokenNameDIVIDE	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
+	TokenNamePLUS	
" minute"	TokenNameStringLiteral	 minute
+	TokenNamePLUS	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
" "	TokenNameStringLiteral	 
:	TokenNameCOLON	
"s "	TokenNameStringLiteral	s 
)	TokenNameRPAREN	
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
%	TokenNameREMAINDER	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" second"	TokenNameStringLiteral	 second
+	TokenNamePLUS	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
%	TokenNameREMAINDER	
60	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
+	TokenNamePLUS	
" second"	TokenNameStringLiteral	 second
+	TokenNamePLUS	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
%	TokenNameREMAINDER	
60	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * Set the project associated with this recorder entry. * * @param project the project instance * * @since 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Set the project associated with this recorder entry. * @param project the project instance * @since 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the project associated with this recorder entry. * * @since 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Get the project associated with this recorder entry. * @since 1.8.0 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since 1.6.2 */	TokenNameCOMMENT_JAVADOC	 @since 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initially opens the file associated with this recorder. * Used by Recorder. * @param append Indicates if output must be appended to the logfile or that * the logfile should be overwritten. * @throws BuildException * @since 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Initially opens the file associated with this recorder. Used by Recorder. @param append Indicates if output must be appended to the logfile or that the logfile should be overwritten. @throws BuildException @since 1.6.3 
void	TokenNamevoid	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
openFileImpl	TokenNameIdentifier	 open File Impl
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the file associated with this recorder. * Used by Recorder. * @since 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Closes the file associated with this recorder. Used by Recorder. @since 1.6.3 
void	TokenNamevoid	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Re-opens the file associated with this recorder. * Used by Recorder. * @throws BuildException * @since 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Re-opens the file associated with this recorder. Used by Recorder. @throws BuildException @since 1.6.3 
void	TokenNamevoid	
reopenFile	TokenNameIdentifier	 reopen File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
openFileImpl	TokenNameIdentifier	 open File Impl
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
openFileImpl	TokenNameIdentifier	 open File Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
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
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Problems opening file using a "	TokenNameStringLiteral	Problems opening file using a 
+	TokenNamePLUS	
"recorder entry"	TokenNameStringLiteral	recorder entry
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
