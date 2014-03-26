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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * An Ant wrapper task for the weblogic.deploy tool. This is used * to hot-deploy J2EE applications to a running WebLogic server. * This is <b>not</b> the same as creating the application * archive. This task assumes the archive (EAR, JAR, or WAR) file * has been assembled and is supplied as the "source" attribute. * <p> * * In the end, this task assembles the commadline parameters and * runs the weblogic.deploy tool in a seperate JVM. * *@see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool *@see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool *@see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy */	TokenNameCOMMENT_JAVADOC	 An Ant wrapper task for the weblogic.deploy tool. This is used to hot-deploy J2EE applications to a running WebLogic server. This is <b>not</b> the same as creating the application archive. This task assumes the archive (EAR, JAR, or WAR) file has been assembled and is supplied as the "source" attribute. <p> * In the end, this task assembles the commadline parameters and runs the weblogic.deploy tool in a seperate JVM. *@see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool *@see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool *@see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy 
public	TokenNamepublic	
class	TokenNameclass	
JonasHotDeploymentTool	TokenNameIdentifier	 Jonas Hot Deployment Tool
extends	TokenNameextends	
GenericHotDeploymentTool	TokenNameIdentifier	 Generic Hot Deployment Tool
implements	TokenNameimplements	
HotDeploymentTool	TokenNameIdentifier	 Hot Deployment Tool
{	TokenNameLBRACE	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ORB	TokenNameIdentifier	 DEFAULT  ORB
=	TokenNameEQUAL	
"RMI"	TokenNameStringLiteral	RMI
;	TokenNameSEMICOLON	
/** * The classname of the tool to run * */	TokenNameCOMMENT_JAVADOC	 The classname of the tool to run 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JONAS_DEPLOY_CLASS_NAME	TokenNameIdentifier	 JONAS  DEPLOY  CLASS  NAME
=	TokenNameEQUAL	
"org.objectweb.jonas.adm.JonasAdmin"	TokenNameStringLiteral	org.objectweb.jonas.adm.JonasAdmin
;	TokenNameSEMICOLON	
/** * All the valid actions that weblogic.deploy permits * */	TokenNameCOMMENT_JAVADOC	 All the valid actions that weblogic.deploy permits 
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
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
jonasroot	TokenNameIdentifier	 jonasroot
;	TokenNameSEMICOLON	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
orb	TokenNameIdentifier	 orb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
davidHost	TokenNameIdentifier	 david Host
;	TokenNameSEMICOLON	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
int	TokenNameint	
davidPort	TokenNameIdentifier	 david Port
;	TokenNameSEMICOLON	
/** * Set the host for the David ORB; required if * ORB==david. * *@param inValue The new davidhost value */	TokenNameCOMMENT_JAVADOC	 Set the host for the David ORB; required if ORB==david. *@param inValue The new davidhost value 
public	TokenNamepublic	
void	TokenNamevoid	
setDavidhost	TokenNameIdentifier	 set Davidhost
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
inValue	TokenNameIdentifier	 in Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
davidHost	TokenNameIdentifier	 david Host
=	TokenNameEQUAL	
inValue	TokenNameIdentifier	 in Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the port for the David ORB; required if * ORB==david. * *@param inValue The new davidport value */	TokenNameCOMMENT_JAVADOC	 Set the port for the David ORB; required if ORB==david. *@param inValue The new davidport value 
public	TokenNamepublic	
void	TokenNamevoid	
setDavidport	TokenNameIdentifier	 set Davidport
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
inValue	TokenNameIdentifier	 in Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
davidPort	TokenNameIdentifier	 david Port
=	TokenNameEQUAL	
inValue	TokenNameIdentifier	 in Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the jonas root directory (-Dinstall.root=). This * element is required. * *@param inValue The new jonasroot value */	TokenNameCOMMENT_JAVADOC	 set the jonas root directory (-Dinstall.root=). This element is required. *@param inValue The new jonasroot value 
public	TokenNamepublic	
void	TokenNamevoid	
setJonasroot	TokenNameIdentifier	 set Jonasroot
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
inValue	TokenNameIdentifier	 in Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jonasroot	TokenNameIdentifier	 jonasroot
=	TokenNameEQUAL	
inValue	TokenNameIdentifier	 in Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Choose your ORB : RMI, JEREMIE, DAVID, ...; optional. * If omitted, it defaults * to the one present in classpath. The corresponding JOnAS JAR is * automatically added to the classpath. If your orb is DAVID (RMI/IIOP) you must * specify davidhost and davidport properties. * *@param inValue RMI, JEREMIE, DAVID,... */	TokenNameCOMMENT_JAVADOC	 * Choose your ORB : RMI, JEREMIE, DAVID, ...; optional. If omitted, it defaults to the one present in classpath. The corresponding JOnAS JAR is automatically added to the classpath. If your orb is DAVID (RMI/IIOP) you must specify davidhost and davidport properties. *@param inValue RMI, JEREMIE, DAVID,... 
public	TokenNamepublic	
void	TokenNamevoid	
setOrb	TokenNameIdentifier	 set Orb
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
inValue	TokenNameIdentifier	 in Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
orb	TokenNameIdentifier	 orb
=	TokenNameEQUAL	
inValue	TokenNameIdentifier	 in Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the classpath field. * *@return A Path representing the "classpath" attribute. */	TokenNameCOMMENT_JAVADOC	 gets the classpath field. *@return A Path representing the "classpath" attribute. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
aClassPath	TokenNameIdentifier	 a Class Path
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aClassPath	TokenNameIdentifier	 a Class Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aClassPath	TokenNameIdentifier	 a Class Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
orb	TokenNameIdentifier	 orb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
aOrbJar	TokenNameIdentifier	 a Orb Jar
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
jonasroot	TokenNameIdentifier	 jonasroot
,	TokenNameCOMMA	
"lib/"	TokenNameStringLiteral	lib/
+	TokenNamePLUS	
orb	TokenNameIdentifier	 orb
+	TokenNamePLUS	
"_jonas.jar"	TokenNameStringLiteral	_jonas.jar
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aConfigDir	TokenNameIdentifier	 a Config Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
jonasroot	TokenNameIdentifier	 jonasroot
,	TokenNameCOMMA	
"config/"	TokenNameStringLiteral	config/
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
aJOnASOrbPath	TokenNameIdentifier	 a J On AS Orb Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
aClassPath	TokenNameIdentifier	 a Class Path
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
aOrbJar	TokenNameIdentifier	 a Orb Jar
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
+	TokenNamePLUS	
aConfigDir	TokenNameIdentifier	 a Config Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aClassPath	TokenNameIdentifier	 a Class Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
aJOnASOrbPath	TokenNameIdentifier	 a J On AS Orb Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
aClassPath	TokenNameIdentifier	 a Class Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validates the passed in attributes. <p> * * The rules are: * <ol> * <li> If action is "deploy" or "update" the "application" * and "source" attributes must be supplied. * <li> If action is "delete" or "undeploy" the * "application" attribute must be supplied. * *@exception BuildException Description * of Exception */	TokenNameCOMMENT_JAVADOC	 Validates the passed in attributes. <p> * The rules are: <ol> <li> If action is "deploy" or "update" the "application" and "source" attributes must be supplied. <li> If action is "delete" or "undeploy" the "application" attribute must be supplied. *@exception BuildException Description of Exception 
public	TokenNamepublic	
void	TokenNamevoid	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// super.validateAttributes(); // don't want to call this method 	TokenNameCOMMENT_LINE	super.validateAttributes(); // don't want to call this method 
Java	TokenNameIdentifier	 Java
java	TokenNameIdentifier	 java
=	TokenNameEQUAL	
getJava	TokenNameIdentifier	 get Java
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
if	TokenNameif	
(	TokenNameLPAREN	
action	TokenNameIdentifier	 action
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The "action" attribute must be set"	TokenNameStringLiteral	The "action" attribute must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isActionValid	TokenNameIdentifier	 is Action Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid action ""	TokenNameStringLiteral	Invalid action "
+	TokenNamePLUS	
action	TokenNameIdentifier	 action
+	TokenNamePLUS	
"" passed"	TokenNameStringLiteral	" passed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
JONAS_DEPLOY_CLASS_NAME	TokenNameIdentifier	 JONAS  DEPLOY  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jonasroot	TokenNameIdentifier	 jonasroot
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
jonasroot	TokenNameIdentifier	 jonasroot
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Dinstall.root="	TokenNameStringLiteral	-Dinstall.root=
+	TokenNamePLUS	
jonasroot	TokenNameIdentifier	 jonasroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djava.security.policy="	TokenNameStringLiteral	-Djava.security.policy=
+	TokenNamePLUS	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
"/config/java.policy"	TokenNameStringLiteral	/config/java.policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"DAVID"	TokenNameStringLiteral	DAVID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
orb	TokenNameIdentifier	 orb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Dorg.omg.CORBA.ORBClass"	TokenNameStringLiteral	-Dorg.omg.CORBA.ORBClass
+	TokenNamePLUS	
"=org.objectweb.david.libs.binding.orbs.iiop.IIOPORB"	TokenNameStringLiteral	=org.objectweb.david.libs.binding.orbs.iiop.IIOPORB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Dorg.omg.CORBA.ORBSingletonClass="	TokenNameStringLiteral	-Dorg.omg.CORBA.ORBSingletonClass=
+	TokenNamePLUS	
"org.objectweb.david.libs.binding.orbs.ORBSingletonClass"	TokenNameStringLiteral	org.objectweb.david.libs.binding.orbs.ORBSingletonClass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djavax.rmi.CORBA.StubClass="	TokenNameStringLiteral	-Djavax.rmi.CORBA.StubClass=
+	TokenNamePLUS	
"org.objectweb.david.libs.stub_factories.rmi.StubDelegate"	TokenNameStringLiteral	org.objectweb.david.libs.stub_factories.rmi.StubDelegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djavax.rmi.CORBA.PortableRemoteObjectClass="	TokenNameStringLiteral	-Djavax.rmi.CORBA.PortableRemoteObjectClass=
+	TokenNamePLUS	
"org.objectweb.david.libs.binding.rmi.ORBPortableRemoteObjectDelegate"	TokenNameStringLiteral	org.objectweb.david.libs.binding.rmi.ORBPortableRemoteObjectDelegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djavax.rmi.CORBA.UtilClass="	TokenNameStringLiteral	-Djavax.rmi.CORBA.UtilClass=
+	TokenNamePLUS	
"org.objectweb.david.libs.helpers.RMIUtilDelegate"	TokenNameStringLiteral	org.objectweb.david.libs.helpers.RMIUtilDelegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Ddavid.CosNaming.default_method=0"	TokenNameStringLiteral	-Ddavid.CosNaming.default_method=0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Ddavid.rmi.ValueHandlerClass="	TokenNameStringLiteral	-Ddavid.rmi.ValueHandlerClass=
+	TokenNamePLUS	
"com.sun.corba.se.internal.io.ValueHandlerImpl"	TokenNameStringLiteral	com.sun.corba.se.internal.io.ValueHandlerImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
davidHost	TokenNameIdentifier	 david Host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Ddavid.CosNaming.default_host="	TokenNameStringLiteral	-Ddavid.CosNaming.default_host=
+	TokenNamePLUS	
davidHost	TokenNameIdentifier	 david Host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
davidPort	TokenNameIdentifier	 david Port
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Ddavid.CosNaming.default_port="	TokenNameStringLiteral	-Ddavid.CosNaming.default_port=
+	TokenNamePLUS	
davidPort	TokenNameIdentifier	 david Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
"-n "	TokenNameStringLiteral	-n 
+	TokenNamePLUS	
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
||	TokenNameOR_OR	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"redeploy"	TokenNameStringLiteral	redeploy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
"-a "	TokenNameStringLiteral	-a 
+	TokenNamePLUS	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
"-r "	TokenNameStringLiteral	-r 
+	TokenNamePLUS	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-l"	TokenNameStringLiteral	-l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines if the action supplied is valid. <p> * * Valid actions are contained in the static array * VALID_ACTIONS * *@return true if the action attribute is valid, false if * not. */	TokenNameCOMMENT_JAVADOC	 Determines if the action supplied is valid. <p> * Valid actions are contained in the static array VALID_ACTIONS *@return true if the action attribute is valid, false if not. 
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
}	TokenNameRBRACE	
