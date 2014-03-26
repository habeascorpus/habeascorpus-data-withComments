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
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
/** * A generic tool for J2EE server hot deployment. * <p>The simple implementation spawns a JVM with the supplied * class name, jvm args, and arguments. * * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy */	TokenNameCOMMENT_JAVADOC	 A generic tool for J2EE server hot deployment. <p>The simple implementation spawns a JVM with the supplied class name, jvm args, and arguments. * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy 
public	TokenNamepublic	
class	TokenNameclass	
GenericHotDeploymentTool	TokenNameIdentifier	 Generic Hot Deployment Tool
extends	TokenNameextends	
AbstractHotDeploymentTool	TokenNameIdentifier	 Abstract Hot Deployment Tool
{	TokenNameLBRACE	
/** A Java task used to run the deployment tool **/	TokenNameCOMMENT_JAVADOC	 A Java task used to run the deployment tool *
private	TokenNameprivate	
Java	TokenNameIdentifier	 Java
java	TokenNameIdentifier	 java
;	TokenNameSEMICOLON	
/** The fully qualified class name of the deployment tool **/	TokenNameCOMMENT_JAVADOC	 The fully qualified class name of the deployment tool *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
/** List of valid actions **/	TokenNameCOMMENT_JAVADOC	 List of valid actions *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
ACTION_DEPLOY	TokenNameIdentifier	 ACTION  DEPLOY
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Add a nested argument element to hand to the deployment tool; optional. * @return A Commandline.Argument object representing the * command line argument being passed when the deployment * tool is run. IE: "-user=mark", "-password=venture"... */	TokenNameCOMMENT_JAVADOC	 Add a nested argument element to hand to the deployment tool; optional. @return A Commandline.Argument object representing the command line argument being passed when the deployment tool is run. IE: "-user=mark", "-password=venture"... 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a nested argment element to hand to the JVM running the * deployment tool. * Creates a nested arg element. * @return A Commandline.Argument object representing the * JVM command line argument being passed when the deployment * tool is run. IE: "-ms64m", "-mx128m"... */	TokenNameCOMMENT_JAVADOC	 Add a nested argment element to hand to the JVM running the deployment tool. Creates a nested arg element. @return A Commandline.Argument object representing the JVM command line argument being passed when the deployment tool is run. IE: "-ms64m", "-mx128m"... 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the "action" attribute defines a valid action. * <p>Subclasses should determine if the action passed in is * supported by the vendor's deployment tool. * For this generic implementation, the only valid action is "deploy" * @return true if the "action" attribute is valid, false if not. */	TokenNameCOMMENT_JAVADOC	 Determines if the "action" attribute defines a valid action. <p>Subclasses should determine if the action passed in is supported by the vendor's deployment tool. For this generic implementation, the only valid action is "deploy" @return true if the "action" attribute is valid, false if not. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isActionValid	TokenNameIdentifier	 is Action Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
VALID_ACTIONS	TokenNameIdentifier	 VALID  ACTIONS
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the parent task. * @param task An ServerDeploy object representing the parent task. * @ant.attribute ignored="true" */	TokenNameCOMMENT_JAVADOC	 Sets the parent task. @param task An ServerDeploy object representing the parent task. @ant.attribute ignored="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
ServerDeploy	TokenNameIdentifier	 Server Deploy
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
=	TokenNameEQUAL	
new	TokenNamenew	
Java	TokenNameIdentifier	 Java
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform the actual deployment. * For this generic implementation, a JVM is spawned using the * supplied classpath, classname, JVM args, and command line arguments. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Perform the actual deployment. For this generic implementation, a JVM is spawned using the supplied classpath, classname, JVM args, and command line arguments. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
public	TokenNamepublic	
void	TokenNamevoid	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
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
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validates the passed in attributes. * Ensures the className and arguments attribute have been set. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Validates the passed in attributes. Ensures the className and arguments attribute have been set. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
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
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The classname attribute must be set"	TokenNameStringLiteral	The classname attribute must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The name of the class to execute to perfom * deployment; required. * Example: "com.foobar.tools.deploy.DeployTool" * @param className The fully qualified class name of the class * to perform deployment. */	TokenNameCOMMENT_JAVADOC	 The name of the class to execute to perfom deployment; required. Example: "com.foobar.tools.deploy.DeployTool" @param className The fully qualified class name of the class to perform deployment. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the java attribute. * @return the java attribute. */	TokenNameCOMMENT_JAVADOC	 get the java attribute. @return the java attribute. 
public	TokenNamepublic	
Java	TokenNameIdentifier	 Java
getJava	TokenNameIdentifier	 get Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classname attribute. * @return the classname value. */	TokenNameCOMMENT_JAVADOC	 Get the classname attribute. @return the classname value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
