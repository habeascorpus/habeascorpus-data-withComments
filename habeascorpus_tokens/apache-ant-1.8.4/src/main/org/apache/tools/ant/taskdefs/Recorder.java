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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
Task	TokenNameIdentifier	 Task
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
LogLevel	TokenNameIdentifier	 Log Level
;	TokenNameSEMICOLON	
/** * Adds a listener to the current build process that records the * output to a file. * <p>Several recorders can exist at the same time. Each recorder is * associated with a file. The filename is used as a unique identifier for * the recorders. The first call to the recorder task with an unused filename * will create a recorder (using the parameters provided) and add it to the * listeners of the build. All subsequent calls to the recorder task using * this filename will modify that recorders state (recording or not) or other * properties (like logging level).</p> * <p>Some technical issues: the file's print stream is flushed for &quot;finished&quot; * events (buildFinished, targetFinished and taskFinished), and is closed on * a buildFinished event.</p> * @see RecorderEntry * @version 0.5 * @since Ant 1.4 * @ant.task name="record" category="utility" */	TokenNameCOMMENT_JAVADOC	 Adds a listener to the current build process that records the output to a file. <p>Several recorders can exist at the same time. Each recorder is associated with a file. The filename is used as a unique identifier for the recorders. The first call to the recorder task with an unused filename will create a recorder (using the parameters provided) and add it to the listeners of the build. All subsequent calls to the recorder task using this filename will modify that recorders state (recording or not) or other properties (like logging level).</p> <p>Some technical issues: the file's print stream is flushed for &quot;finished&quot; events (buildFinished, targetFinished and taskFinished), and is closed on a buildFinished event.</p> @see RecorderEntry @version 0.5 @since Ant 1.4 @ant.task name="record" category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
Recorder	TokenNameIdentifier	 Recorder
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
SubBuildListener	TokenNameIdentifier	 Sub Build Listener
{	TokenNameLBRACE	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// ATTRIBUTES 	TokenNameCOMMENT_LINE	ATTRIBUTES 
/** The name of the file to record to. */	TokenNameCOMMENT_JAVADOC	 The name of the file to record to. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Whether or not to append. Need Boolean to record an unset state (null). */	TokenNameCOMMENT_JAVADOC	 Whether or not to append. Need Boolean to record an unset state (null). 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Whether to start or stop recording. Need Boolean to record an unset * state (null). */	TokenNameCOMMENT_JAVADOC	 Whether to start or stop recording. Need Boolean to record an unset state (null). 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The level to log at. A level of -1 means not initialized yet. */	TokenNameCOMMENT_JAVADOC	 The level to log at. A level of -1 means not initialized yet. 
private	TokenNameprivate	
int	TokenNameint	
loglevel	TokenNameIdentifier	 loglevel
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Strip task banners if true. */	TokenNameCOMMENT_JAVADOC	 Strip task banners if true. 
private	TokenNameprivate	
boolean	TokenNameboolean	
emacsMode	TokenNameIdentifier	 emacs Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The list of recorder entries. */	TokenNameCOMMENT_JAVADOC	 The list of recorder entries. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
recorderEntries	TokenNameIdentifier	 recorder Entries
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// CONSTRUCTORS / INITIALIZERS 	TokenNameCOMMENT_LINE	CONSTRUCTORS / INITIALIZERS 
/** * Overridden so we can add the task as build listener. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Overridden so we can add the task as build listener. * @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// ACCESSOR METHODS 	TokenNameCOMMENT_LINE	ACCESSOR METHODS 
/** * Sets the name of the file to log to, and the name of the recorder * entry. * * @param fname File name of logfile. */	TokenNameCOMMENT_JAVADOC	 Sets the name of the file to log to, and the name of the recorder entry. * @param fname File name of logfile. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fname	TokenNameIdentifier	 fname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
fname	TokenNameIdentifier	 fname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the action for the associated recorder entry. * * @param action The action for the entry to take: start or stop. */	TokenNameCOMMENT_JAVADOC	 Sets the action for the associated recorder entry. * @param action The action for the entry to take: start or stop. 
public	TokenNamepublic	
void	TokenNamevoid	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
ActionChoices	TokenNameIdentifier	 Action Choices
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"start"	TokenNameStringLiteral	start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Whether or not the logger should append to a previous file. * @param append if true, append to a previous file. */	TokenNameCOMMENT_JAVADOC	 Whether or not the logger should append to a previous file. @param append if true, append to a previous file. 
public	TokenNamepublic	
void	TokenNamevoid	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set emacs mode. * @param emacsMode if true use emacs mode */	TokenNameCOMMENT_JAVADOC	 Set emacs mode. @param emacsMode if true use emacs mode 
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
/** * Sets the level to which this recorder entry should log to. * @param level the level to set. * @see VerbosityLevelChoices */	TokenNameCOMMENT_JAVADOC	 Sets the level to which this recorder entry should log to. @param level the level to set. @see VerbosityLevelChoices 
public	TokenNamepublic	
void	TokenNamevoid	
setLoglevel	TokenNameIdentifier	 set Loglevel
(	TokenNameLPAREN	
VerbosityLevelChoices	TokenNameIdentifier	 Verbosity Level Choices
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loglevel	TokenNameIdentifier	 loglevel
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// CORE / MAIN BODY 	TokenNameCOMMENT_LINE	CORE / MAIN BODY 
/** * The main execution. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 The main execution. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No filename specified"	TokenNameStringLiteral	No filename specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"setting a recorder for name "	TokenNameStringLiteral	setting a recorder for name 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the recorder entry 	TokenNameCOMMENT_LINE	get the recorder entry 
RecorderEntry	TokenNameIdentifier	 Recorder Entry
recorder	TokenNameIdentifier	 recorder
=	TokenNameEQUAL	
getRecorder	TokenNameIdentifier	 get Recorder
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the values on the recorder 	TokenNameCOMMENT_LINE	set the values on the recorder 
recorder	TokenNameIdentifier	 recorder
.	TokenNameDOT	
setMessageOutputLevel	TokenNameIdentifier	 set Message Output Level
(	TokenNameLPAREN	
loglevel	TokenNameIdentifier	 loglevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recorder	TokenNameIdentifier	 recorder
.	TokenNameDOT	
setEmacsMode	TokenNameIdentifier	 set Emacs Mode
(	TokenNameLPAREN	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recorder	TokenNameIdentifier	 recorder
.	TokenNameDOT	
reopenFile	TokenNameIdentifier	 reopen File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recorder	TokenNameIdentifier	 recorder
.	TokenNameDOT	
setRecordState	TokenNameIdentifier	 set Record State
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
recorder	TokenNameIdentifier	 recorder
.	TokenNameDOT	
setRecordState	TokenNameIdentifier	 set Record State
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recorder	TokenNameIdentifier	 recorder
.	TokenNameDOT	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////// 
// INNER CLASSES 	TokenNameCOMMENT_LINE	INNER CLASSES 
/** * A list of possible values for the <code>setAction()</code> method. * Possible values include: start and stop. */	TokenNameCOMMENT_JAVADOC	 A list of possible values for the <code>setAction()</code> method. Possible values include: start and stop. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ActionChoices	TokenNameIdentifier	 Action Choices
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALUES	TokenNameIdentifier	 VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"start"	TokenNameStringLiteral	start
,	TokenNameCOMMA	
"stop"	TokenNameStringLiteral	stop
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * @see EnumeratedAttribute#getValues() */	TokenNameCOMMENT_JAVADOC	 @see EnumeratedAttribute#getValues() 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALUES	TokenNameIdentifier	 VALUES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A list of possible values for the <code>setLoglevel()</code> method. * Possible values include: error, warn, info, verbose, debug. */	TokenNameCOMMENT_JAVADOC	 A list of possible values for the <code>setLoglevel()</code> method. Possible values include: error, warn, info, verbose, debug. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
VerbosityLevelChoices	TokenNameIdentifier	 Verbosity Level Choices
extends	TokenNameextends	
LogLevel	TokenNameIdentifier	 Log Level
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Gets the recorder that's associated with the passed in name. If the * recorder doesn't exist, then a new one is created. * @param name the name of the recoder * @param proj the current project * @return a recorder * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Gets the recorder that's associated with the passed in name. If the recorder doesn't exist, then a new one is created. @param name the name of the recoder @param proj the current project @return a recorder @throws BuildException on error 
protected	TokenNameprotected	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
getRecorder	TokenNameIdentifier	 get Recorder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
proj	TokenNameIdentifier	 proj
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
recorderEntries	TokenNameIdentifier	 recorder Entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a recorder entry 	TokenNameCOMMENT_LINE	create a recorder entry 
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
proj	TokenNameIdentifier	 proj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recorderEntries	TokenNameIdentifier	 recorder Entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
subBuildStarted	TokenNameIdentifier	 sub Build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation required by SubBuildListener interface. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Empty implementation required by SubBuildListener interface. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Cleans recorder registry. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Cleans recorder registry. @param event ignored. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cleans recorder registry, if this is the subbuild the task has * been created in. * @param event ignored. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Cleans recorder registry, if this is the subbuild the task has been created in. @param event ignored. @since Ant 1.7 
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
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * cleans recorder registry and removes itself from BuildListener list. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 cleans recorder registry and removes itself from BuildListener list. * @since Ant 1.7 
private	TokenNameprivate	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
recorderEntries	TokenNameIdentifier	 recorder Entries
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
itEntries	TokenNameIdentifier	 it Entries
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
itEntries	TokenNameIdentifier	 it Entries
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
itEntries	TokenNameIdentifier	 it Entries
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
re	TokenNameIdentifier	 re
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RecorderEntry	TokenNameIdentifier	 Recorder Entry
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recorderEntries	TokenNameIdentifier	 recorder Entries
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
