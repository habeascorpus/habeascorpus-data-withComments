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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * Abstract class to support vendor-specific hot deployment tools. * This class will validate boilerplate attributes. * * Subclassing this class for a vendor specific tool involves the * following. * <ol><li>Implement the <code>isActionValid()<code> method to insure the * action supplied as the "action" attribute of ServerDeploy is valid. * <li>Implement the <code>validateAttributes()</code> method to insure * all required attributes are supplied, and are in the correct format. * <li>Add a <code>add&lt;TOOL&gt;</code> method to the ServerDeploy * class. This method will be called when Ant encounters a * <code>add&lt;TOOL&gt;</code> task nested in the * <code>serverdeploy</code> task. * <li>Define the <code>deploy</code> method. This method should perform * whatever task it takes to hot-deploy the component. IE: spawn a JVM and * run class, exec a native executable, run Java code... * * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy */	TokenNameCOMMENT_JAVADOC	 Abstract class to support vendor-specific hot deployment tools. This class will validate boilerplate attributes. * Subclassing this class for a vendor specific tool involves the following. <ol><li>Implement the <code>isActionValid()<code> method to insure the action supplied as the "action" attribute of ServerDeploy is valid. <li>Implement the <code>validateAttributes()</code> method to insure all required attributes are supplied, and are in the correct format. <li>Add a <code>add&lt;TOOL&gt;</code> method to the ServerDeploy class. This method will be called when Ant encounters a <code>add&lt;TOOL&gt;</code> task nested in the <code>serverdeploy</code> task. <li>Define the <code>deploy</code> method. This method should perform whatever task it takes to hot-deploy the component. IE: spawn a JVM and run class, exec a native executable, run Java code... * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractHotDeploymentTool	TokenNameIdentifier	 Abstract Hot Deployment Tool
implements	TokenNameimplements	
HotDeploymentTool	TokenNameIdentifier	 Hot Deployment Tool
{	TokenNameLBRACE	
/** The parent task **/	TokenNameCOMMENT_JAVADOC	 The parent task *
private	TokenNameprivate	
ServerDeploy	TokenNameIdentifier	 Server Deploy
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
/** The classpath passed to the JVM on execution. **/	TokenNameCOMMENT_JAVADOC	 The classpath passed to the JVM on execution. *
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
/** The username for the deployment server. **/	TokenNameCOMMENT_JAVADOC	 The username for the deployment server. *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
/** The password for the deployment server. **/	TokenNameCOMMENT_JAVADOC	 The password for the deployment server. *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
/** The address of the deployment server **/	TokenNameCOMMENT_JAVADOC	 The address of the deployment server *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
/** * Add a classpath as a nested element. * @return A Path object representing the classpath to be used. */	TokenNameCOMMENT_JAVADOC	 Add a classpath as a nested element. @return A Path object representing the classpath to be used. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the "action" attribute defines a valid action. * <p>Subclasses should determine if the action passed in is * supported by the vendor's deployment tool. * <p>Actions may by "deploy", "delete", etc... It all depends * on the tool. * @return true if the "action" attribute is valid, false if not. */	TokenNameCOMMENT_JAVADOC	 Determines if the "action" attribute defines a valid action. <p>Subclasses should determine if the action passed in is supported by the vendor's deployment tool. <p>Actions may by "deploy", "delete", etc... It all depends on the tool. @return true if the "action" attribute is valid, false if not. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isActionValid	TokenNameIdentifier	 is Action Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Validates the passed in attributes. * Subclasses should chain to this super-method to insure * validation of boilerplate attributes. * <p>Only the "action" attribute is required in the * base class. Subclasses should check attributes accordingly. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Validates the passed in attributes. Subclasses should chain to this super-method to insure validation of boilerplate attributes. <p>Only the "action" attribute is required in the base class. Subclasses should check attributes accordingly. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
public	TokenNamepublic	
void	TokenNamevoid	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
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
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" passed"	TokenNameStringLiteral	" passed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The classpath attribute must be set"	TokenNameStringLiteral	The classpath attribute must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform the actual deployment. * It's up to the subclasses to implement the actual behavior. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Perform the actual deployment. It's up to the subclasses to implement the actual behavior. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Sets the parent task. * @param task a ServerDeploy object representing the parent task. * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Sets the parent task. @param task a ServerDeploy object representing the parent task. @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
ServerDeploy	TokenNameIdentifier	 Server Deploy
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the task field, a ServerDeploy object. * @return An ServerDeploy representing the parent task. */	TokenNameCOMMENT_JAVADOC	 Returns the task field, a ServerDeploy object. @return An ServerDeploy representing the parent task. 
protected	TokenNameprotected	
ServerDeploy	TokenNameIdentifier	 Server Deploy
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the classpath field. * @return A Path representing the "classpath" attribute. */	TokenNameCOMMENT_JAVADOC	 gets the classpath field. @return A Path representing the "classpath" attribute. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The classpath to be passed to the JVM running the tool; * optional depending upon the tool. * The classpath may also be supplied as a nested element. * @param classpath A Path object representing the "classpath" attribute. */	TokenNameCOMMENT_JAVADOC	 The classpath to be passed to the JVM running the tool; optional depending upon the tool. The classpath may also be supplied as a nested element. @param classpath A Path object representing the "classpath" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the userName field. * @return A String representing the "userName" attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the userName field. @return A String representing the "userName" attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The user with privileges to deploy applications to the server; optional. * @param userName A String representing the "userName" attribute. */	TokenNameCOMMENT_JAVADOC	 The user with privileges to deploy applications to the server; optional. @param userName A String representing the "userName" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the password field. * @return A String representing the "password" attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the password field. @return A String representing the "password" attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The password of the user; optional. * @param password A String representing the "password" attribute. */	TokenNameCOMMENT_JAVADOC	 The password of the user; optional. @param password A String representing the "password" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the server field. * @return A String representing the "server" attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the server field. @return A String representing the "server" attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The address or URL for the server where the component will be deployed. * @param server A String representing the "server" attribute. */	TokenNameCOMMENT_JAVADOC	 The address or URL for the server where the component will be deployed. @param server A String representing the "server" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setServer	TokenNameIdentifier	 set Server
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
