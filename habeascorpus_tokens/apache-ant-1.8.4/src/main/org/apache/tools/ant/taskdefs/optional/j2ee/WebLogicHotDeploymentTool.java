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
j2ee	TokenNameIdentifier	 j2ee
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
Java	TokenNameIdentifier	 Java
;	TokenNameSEMICOLON	
/** * An Ant wrapper task for the weblogic.deploy tool. This is used to * hot-deploy J2EE applications to a running WebLogic server. * This is <b>not</b> the same as creating the application archive. * This task assumes the archive (EAR, JAR, or WAR) file has been * assembled and is supplied as the "source" attribute. * <p>In the end, this task assembles the commadline parameters * and runs the weblogic.deploy tool in a seperate JVM. * * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy */	TokenNameCOMMENT_JAVADOC	 An Ant wrapper task for the weblogic.deploy tool. This is used to hot-deploy J2EE applications to a running WebLogic server. This is <b>not</b> the same as creating the application archive. This task assumes the archive (EAR, JAR, or WAR) file has been assembled and is supplied as the "source" attribute. <p>In the end, this task assembles the commadline parameters and runs the weblogic.deploy tool in a seperate JVM. * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy 
public	TokenNamepublic	
class	TokenNameclass	
WebLogicHotDeploymentTool	TokenNameIdentifier	 Web Logic Hot Deployment Tool
extends	TokenNameextends	
AbstractHotDeploymentTool	TokenNameIdentifier	 Abstract Hot Deployment Tool
implements	TokenNameimplements	
HotDeploymentTool	TokenNameIdentifier	 Hot Deployment Tool
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING_BUFFER_SIZE	TokenNameIdentifier	 STRING  BUFFER  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The classname of the tool to run **/	TokenNameCOMMENT_JAVADOC	 The classname of the tool to run *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WEBLOGIC_DEPLOY_CLASS_NAME	TokenNameIdentifier	 WEBLOGIC  DEPLOY  CLASS  NAME
=	TokenNameEQUAL	
"weblogic.deploy"	TokenNameStringLiteral	weblogic.deploy
;	TokenNameSEMICOLON	
/** All the valid actions that weblogic.deploy permits **/	TokenNameCOMMENT_JAVADOC	 All the valid actions that weblogic.deploy permits *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
ACTION_DELETE	TokenNameIdentifier	 ACTION  DELETE
,	TokenNameCOMMA	
ACTION_DEPLOY	TokenNameIdentifier	 ACTION  DEPLOY
,	TokenNameCOMMA	
ACTION_LIST	TokenNameIdentifier	 ACTION  LIST
,	TokenNameCOMMA	
ACTION_UNDEPLOY	TokenNameIdentifier	 ACTION  UNDEPLOY
,	TokenNameCOMMA	
ACTION_UPDATE	TokenNameIdentifier	 ACTION  UPDATE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Represents the "-debug" flag from weblogic.deploy **/	TokenNameCOMMENT_JAVADOC	 Represents the "-debug" flag from weblogic.deploy *
private	TokenNameprivate	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
/** The application name that is being deployed **/	TokenNameCOMMENT_JAVADOC	 The application name that is being deployed *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
application	TokenNameIdentifier	 application
;	TokenNameSEMICOLON	
/** The component name:target(s) for the "-component" argument of weblogic.deploy **/	TokenNameCOMMENT_JAVADOC	 The component name:target(s) for the "-component" argument of weblogic.deploy *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
/** * Perform the actual deployment. * For this implementation, a JVM is spawned and the weblogic.deploy * tools is executed. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Perform the actual deployment. For this implementation, a JVM is spawned and the weblogic.deploy tools is executed. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
public	TokenNamepublic	
void	TokenNamevoid	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Java	TokenNameIdentifier	 Java
java	TokenNameIdentifier	 java
=	TokenNameEQUAL	
new	TokenNamenew	
Java	TokenNameIdentifier	 Java
(	TokenNameLPAREN	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
WEBLOGIC_DEPLOY_CLASS_NAME	TokenNameIdentifier	 WEBLOGIC  DEPLOY  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validates the passed in attributes. * <p>The rules are: * <ol><li>If action is "deploy" or "update" the "application" and "source" * attributes must be supplied. * <li>If action is "delete" or "undeploy" the "application" attribute must * be supplied. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete */	TokenNameCOMMENT_JAVADOC	 Validates the passed in attributes. <p>The rules are: <ol><li>If action is "deploy" or "update" the "application" and "source" attributes must be supplied. <li>If action is "delete" or "undeploy" the "application" attribute must be supplied. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete 
public	TokenNamepublic	
void	TokenNamevoid	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check that the password has been set 	TokenNameCOMMENT_LINE	check that the password has been set 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The password attribute must be set."	TokenNameStringLiteral	The password attribute must be set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for missing application on deploy & update 	TokenNameCOMMENT_LINE	check for missing application on deploy & update 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_DEPLOY	TokenNameIdentifier	 ACTION  DEPLOY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_UPDATE	TokenNameIdentifier	 ACTION  UPDATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
application	TokenNameIdentifier	 application
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The application attribute must be set "	TokenNameStringLiteral	The application attribute must be set 
+	TokenNamePLUS	
"if action = "	TokenNameStringLiteral	if action = 
+	TokenNamePLUS	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for missing source on deploy & update 	TokenNameCOMMENT_LINE	check for missing source on deploy & update 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_DEPLOY	TokenNameIdentifier	 ACTION  DEPLOY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_UPDATE	TokenNameIdentifier	 ACTION  UPDATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The source attribute must be set if "	TokenNameStringLiteral	The source attribute must be set if 
+	TokenNamePLUS	
"action = "	TokenNameStringLiteral	action = 
+	TokenNamePLUS	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for missing application on delete & undeploy 	TokenNameCOMMENT_LINE	check for missing application on delete & undeploy 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_DELETE	TokenNameIdentifier	 ACTION  DELETE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_UNDEPLOY	TokenNameIdentifier	 ACTION  UNDEPLOY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
application	TokenNameIdentifier	 application
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The application attribute must be set if "	TokenNameStringLiteral	The application attribute must be set if 
+	TokenNamePLUS	
"action = "	TokenNameStringLiteral	action = 
+	TokenNamePLUS	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Builds the arguments to pass to weblogic.deploy according to the * supplied action. * @return A String containing the arguments for the weblogic.deploy tool. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Builds the arguments to pass to weblogic.deploy according to the supplied action. @return A String containing the arguments for the weblogic.deploy tool. @throws BuildException if there is an error. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_DEPLOY	TokenNameIdentifier	 ACTION  DEPLOY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_UPDATE	TokenNameIdentifier	 ACTION  UPDATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
buildDeployArgs	TokenNameIdentifier	 build Deploy Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_DELETE	TokenNameIdentifier	 ACTION  DELETE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_UNDEPLOY	TokenNameIdentifier	 ACTION  UNDEPLOY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
buildUndeployArgs	TokenNameIdentifier	 build Undeploy Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ACTION_LIST	TokenNameIdentifier	 ACTION  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
buildListArgs	TokenNameIdentifier	 build List Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the action supplied is valid. * <p>Valid actions are contained in the static array VALID_ACTIONS * @return true if the action attribute is valid, false if not. */	TokenNameCOMMENT_JAVADOC	 Determines if the action supplied is valid. <p>Valid actions are contained in the static array VALID_ACTIONS @return true if the action attribute is valid, false if not. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isActionValid	TokenNameIdentifier	 is Action Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
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
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
valid	TokenNameIdentifier	 valid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the prefix arguments to pass to weblogic.deploy. * These arguments are generic across all actions. * @return A StringBuffer containing the prefix arguments. * The action-specific build methods will append to this StringBuffer. */	TokenNameCOMMENT_JAVADOC	 Builds the prefix arguments to pass to weblogic.deploy. These arguments are generic across all actions. @return A StringBuffer containing the prefix arguments. The action-specific build methods will append to this StringBuffer. 
protected	TokenNameprotected	
StringBuffer	TokenNameIdentifier	 String Buffer
buildArgsPrefix	TokenNameIdentifier	 build Args Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerDeploy	TokenNameIdentifier	 Server Deploy
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// constructs the "-url <url> -debug <action> <password>" portion 	TokenNameCOMMENT_LINE	constructs the "-url <url> -debug <action> <password>" portion 
// of the commmand line 	TokenNameCOMMENT_LINE	of the commmand line 
return	TokenNamereturn	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
STRING_BUFFER_SIZE	TokenNameIdentifier	 STRING  BUFFER  SIZE
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"-url "	TokenNameStringLiteral	-url 
+	TokenNamePLUS	
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
?	TokenNameQUESTION	
"-debug "	TokenNameStringLiteral	-debug 
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"-username "	TokenNameStringLiteral	-username 
+	TokenNamePLUS	
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the arguments to pass to weblogic.deploy for deployment actions * ("deploy" and "update"). * @return A String containing the full argument string for weblogic.deploy. */	TokenNameCOMMENT_JAVADOC	 Builds the arguments to pass to weblogic.deploy for deployment actions ("deploy" and "update"). @return A String containing the full argument string for weblogic.deploy. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
buildDeployArgs	TokenNameIdentifier	 build Deploy Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
buildArgsPrefix	TokenNameIdentifier	 build Args Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
application	TokenNameIdentifier	 application
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
"-component "	TokenNameStringLiteral	-component 
+	TokenNamePLUS	
component	TokenNameIdentifier	 component
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the arguments to pass to weblogic.deploy for undeployment actions * ("undeploy" and "delete"). * @return A String containing the full argument string for weblogic.deploy. */	TokenNameCOMMENT_JAVADOC	 Builds the arguments to pass to weblogic.deploy for undeployment actions ("undeploy" and "delete"). @return A String containing the full argument string for weblogic.deploy. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
buildUndeployArgs	TokenNameIdentifier	 build Undeploy Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildArgsPrefix	TokenNameIdentifier	 build Args Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
application	TokenNameIdentifier	 application
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the arguments to pass to weblogic.deploy for the list action * @return A String containing the full argument string for weblogic.deploy. */	TokenNameCOMMENT_JAVADOC	 Builds the arguments to pass to weblogic.deploy for the list action @return A String containing the full argument string for weblogic.deploy. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
buildListArgs	TokenNameIdentifier	 build List Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildArgsPrefix	TokenNameIdentifier	 build Args Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, additional information will be * printed during the deployment process; optional. * @param debug A boolean representing weblogic.deploy "-debug" flag. */	TokenNameCOMMENT_JAVADOC	 If set to true, additional information will be printed during the deployment process; optional. @param debug A boolean representing weblogic.deploy "-debug" flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the application being deployed; required. * @param application A String representing the application portion of the * weblogic.deploy command line. */	TokenNameCOMMENT_JAVADOC	 The name of the application being deployed; required. @param application A String representing the application portion of the weblogic.deploy command line. 
public	TokenNamepublic	
void	TokenNamevoid	
setApplication	TokenNameIdentifier	 set Application
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
application	TokenNameIdentifier	 application
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
application	TokenNameIdentifier	 application
=	TokenNameEQUAL	
application	TokenNameIdentifier	 application
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the component string for the deployment targets; optional. * It is in the form <code>&lt;component&gt;:&lt;target1&gt;,&lt;target2&gt;...</code> * Where component is the archive name (minus the .jar, .ear, .war * extension). Targets are the servers where the components will be deployed * @param component A String representing the value of the "-component" * argument of the weblogic.deploy command line argument. */	TokenNameCOMMENT_JAVADOC	 the component string for the deployment targets; optional. It is in the form <code>&lt;component&gt;:&lt;target1&gt;,&lt;target2&gt;...</code> Where component is the archive name (minus the .jar, .ear, .war extension). Targets are the servers where the components will be deployed @param component A String representing the value of the "-component" argument of the weblogic.deploy command line argument. 
public	TokenNamepublic	
void	TokenNamevoid	
setComponent	TokenNameIdentifier	 set Component
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
