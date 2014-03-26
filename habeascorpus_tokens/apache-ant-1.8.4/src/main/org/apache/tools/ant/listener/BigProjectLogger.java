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
listener	TokenNameIdentifier	 listener
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * This is a special logger that is designed to make it easier to work * with big projects, those that use imports and * subant to build complex systems. * * @since Ant1.7.1 */	TokenNameCOMMENT_JAVADOC	 This is a special logger that is designed to make it easier to work with big projects, those that use imports and subant to build complex systems. * @since Ant1.7.1 
public	TokenNamepublic	
class	TokenNameclass	
BigProjectLogger	TokenNameIdentifier	 Big Project Logger
extends	TokenNameextends	
SimpleBigProjectLogger	TokenNameIdentifier	 Simple Big Project Logger
implements	TokenNameimplements	
SubBuildListener	TokenNameIdentifier	 Sub Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
subBuildStartedRaised	TokenNameIdentifier	 sub Build Started Raised
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
subBuildLock	TokenNameIdentifier	 sub Build Lock
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Header string for the log. * {@value} */	TokenNameCOMMENT_JAVADOC	 Header string for the log. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADER	TokenNameIdentifier	 HEADER
=	TokenNameEQUAL	
"======================================================================"	TokenNameStringLiteral	======================================================================
;	TokenNameSEMICOLON	
/** * Footer string for the log. * {@value} */	TokenNameCOMMENT_JAVADOC	 Footer string for the log. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FOOTER	TokenNameIdentifier	 FOOTER
=	TokenNameEQUAL	
HEADER	TokenNameIdentifier	 HEADER
;	TokenNameSEMICOLON	
/** * This is an override point: the message that indicates whether * a build failed. Subclasses can change/enhance the * message. * * @return The classic "BUILD FAILED" plus a timestamp */	TokenNameCOMMENT_JAVADOC	 This is an override point: the message that indicates whether a build failed. Subclasses can change/enhance the message. * @return The classic "BUILD FAILED" plus a timestamp 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBuildFailedMessage	TokenNameIdentifier	 get Build Failed Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getBuildFailedMessage	TokenNameIdentifier	 get Build Failed Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TimestampedLogger	TokenNameIdentifier	 Timestamped Logger
.	TokenNameDOT	
SPACER	TokenNameIdentifier	 SPACER
+	TokenNamePLUS	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is an override point: the message that indicates that * a build succeeded. Subclasses can change/enhance the * message. * * @return The classic "BUILD SUCCESSFUL" plus a timestamp */	TokenNameCOMMENT_JAVADOC	 This is an override point: the message that indicates that a build succeeded. Subclasses can change/enhance the message. * @return The classic "BUILD SUCCESSFUL" plus a timestamp 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBuildSuccessfulMessage	TokenNameIdentifier	 get Build Successful Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getBuildSuccessfulMessage	TokenNameIdentifier	 get Build Successful Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TimestampedLogger	TokenNameIdentifier	 Timestamped Logger
.	TokenNameDOT	
SPACER	TokenNameIdentifier	 SPACER
+	TokenNamePLUS	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} * * @param event */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} * @param event 
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeRaiseSubBuildStarted	TokenNameIdentifier	 maybe Raise Sub Build Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} * * @param event */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} * @param event 
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeRaiseSubBuildStarted	TokenNameIdentifier	 maybe Raise Sub Build Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} * * @param event */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} * @param event 
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeRaiseSubBuildStarted	TokenNameIdentifier	 maybe Raise Sub Build Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subBuildFinished	TokenNameIdentifier	 sub Build Finished
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} * * @param event */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} * @param event 
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeRaiseSubBuildStarted	TokenNameIdentifier	 maybe Raise Sub Build Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} * * @param event An event with any relevant extra information. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} * @param event An event with any relevant extra information. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
subBuildStarted	TokenNameIdentifier	 sub Build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
extractNameOrDefault	TokenNameIdentifier	 extract Name Or Default
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"With no base directory"	TokenNameStringLiteral	With no base directory
:	TokenNameCOLON	
"In "	TokenNameStringLiteral	In 
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printMessage	TokenNameIdentifier	 print Message
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"Entering project "	TokenNameStringLiteral	Entering project 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of an event * * @param event the event name * @return the name or a default string */	TokenNameCOMMENT_JAVADOC	 Get the name of an event * @param event the event name @return the name or a default string 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
extractNameOrDefault	TokenNameIdentifier	 extract Name Or Default
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
extractProjectName	TokenNameIdentifier	 extract Project Name
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
'"'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
subBuildFinished	TokenNameIdentifier	 sub Build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
extractNameOrDefault	TokenNameIdentifier	 extract Name Or Default
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"failing "	TokenNameStringLiteral	failing 
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
printMessage	TokenNameIdentifier	 print Message
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"Exiting "	TokenNameStringLiteral	Exiting 
+	TokenNamePLUS	
failed	TokenNameIdentifier	 failed
+	TokenNamePLUS	
"project "	TokenNameStringLiteral	project 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override point: return the header string for the entry/exit message * @return the header string */	TokenNameCOMMENT_JAVADOC	 Override point: return the header string for the entry/exit message @return the header string 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
HEADER	TokenNameIdentifier	 HEADER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override point: return the footer string for the entry/exit message * @return the footer string */	TokenNameCOMMENT_JAVADOC	 Override point: return the footer string for the entry/exit message @return the footer string 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FOOTER	TokenNameIdentifier	 FOOTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
maybeRaiseSubBuildStarted	TokenNameIdentifier	 maybe Raise Sub Build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// double checked locking should be OK since the flag is write-once 	TokenNameCOMMENT_LINE	double checked locking should be OK since the flag is write-once 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subBuildStartedRaised	TokenNameIdentifier	 sub Build Started Raised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
subBuildLock	TokenNameIdentifier	 sub Build Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subBuildStartedRaised	TokenNameIdentifier	 sub Build Started Raised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subBuildStartedRaised	TokenNameIdentifier	 sub Build Started Raised
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
subBuildStarted	TokenNameIdentifier	 sub Build Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
