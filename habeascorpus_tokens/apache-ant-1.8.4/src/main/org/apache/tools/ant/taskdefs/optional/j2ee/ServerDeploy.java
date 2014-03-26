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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * Controls hot deployment tools for J2EE servers. * * This class is used as a framework for the creation of vendor specific * hot deployment tools. * * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.GenericHotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.WebLogicHotDeploymentTool */	TokenNameCOMMENT_JAVADOC	 Controls hot deployment tools for J2EE servers. * This class is used as a framework for the creation of vendor specific hot deployment tools. * @see org.apache.tools.ant.taskdefs.optional.j2ee.HotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.GenericHotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.WebLogicHotDeploymentTool 
public	TokenNamepublic	
class	TokenNameclass	
ServerDeploy	TokenNameIdentifier	 Server Deploy
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** The action to be performed. IE: "deploy", "delete", etc... **/	TokenNameCOMMENT_JAVADOC	 The action to be performed. IE: "deploy", "delete", etc... *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
/** The source (fully-qualified path) to the component being deployed **/	TokenNameCOMMENT_JAVADOC	 The source (fully-qualified path) to the component being deployed *
private	TokenNameprivate	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
/** The vendor specific tool for deploying the component **/	TokenNameCOMMENT_JAVADOC	 The vendor specific tool for deploying the component *
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
vendorTools	TokenNameIdentifier	 vendor Tools
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////////////// 
// 	TokenNameCOMMENT_LINE	 
// Place vendor specific tool creations here. 	TokenNameCOMMENT_LINE	Place vendor specific tool creations here. 
// 	TokenNameCOMMENT_LINE	 
/////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////////////// 
/** * Creates a generic deployment tool. * <p>Ant calls this method on creation to handle embedded "generic" elements * in the ServerDeploy task. * @param tool An instance of GenericHotDeployment tool, passed in by Ant. */	TokenNameCOMMENT_JAVADOC	 Creates a generic deployment tool. <p>Ant calls this method on creation to handle embedded "generic" elements in the ServerDeploy task. @param tool An instance of GenericHotDeployment tool, passed in by Ant. 
public	TokenNamepublic	
void	TokenNamevoid	
addGeneric	TokenNameIdentifier	 add Generic
(	TokenNameLPAREN	
GenericHotDeploymentTool	TokenNameIdentifier	 Generic Hot Deployment Tool
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tool	TokenNameIdentifier	 tool
.	TokenNameDOT	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vendorTools	TokenNameIdentifier	 vendor Tools
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a WebLogic deployment tool, for deployment to WebLogic servers. * <p>Ant calls this method on creation to handle embedded "weblogic" elements * in the ServerDeploy task. * @param tool An instance of WebLogicHotDeployment tool, passed in by Ant. */	TokenNameCOMMENT_JAVADOC	 Creates a WebLogic deployment tool, for deployment to WebLogic servers. <p>Ant calls this method on creation to handle embedded "weblogic" elements in the ServerDeploy task. @param tool An instance of WebLogicHotDeployment tool, passed in by Ant. 
public	TokenNamepublic	
void	TokenNamevoid	
addWeblogic	TokenNameIdentifier	 add Weblogic
(	TokenNameLPAREN	
WebLogicHotDeploymentTool	TokenNameIdentifier	 Web Logic Hot Deployment Tool
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tool	TokenNameIdentifier	 tool
.	TokenNameDOT	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vendorTools	TokenNameIdentifier	 vendor Tools
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a JOnAS deployment tool, for deployment to JOnAS servers. * <p>Ant calls this method on creation to handle embedded "jonas" elements * in the ServerDeploy task. * @param tool An instance of JonasHotDeployment tool, passed in by Ant. */	TokenNameCOMMENT_JAVADOC	 Creates a JOnAS deployment tool, for deployment to JOnAS servers. <p>Ant calls this method on creation to handle embedded "jonas" elements in the ServerDeploy task. @param tool An instance of JonasHotDeployment tool, passed in by Ant. 
public	TokenNamepublic	
void	TokenNamevoid	
addJonas	TokenNameIdentifier	 add Jonas
(	TokenNameLPAREN	
JonasHotDeploymentTool	TokenNameIdentifier	 Jonas Hot Deployment Tool
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tool	TokenNameIdentifier	 tool
.	TokenNameDOT	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vendorTools	TokenNameIdentifier	 vendor Tools
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////////////// 
// 	TokenNameCOMMENT_LINE	 
// Execute method 	TokenNameCOMMENT_LINE	Execute method 
// 	TokenNameCOMMENT_LINE	 
/////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////////////// 
/** * Execute the task. * <p>This method calls the deploy() method on each of the vendor-specific tools * in the <code>vendorTools</code> collection. This performs the actual * process of deployment on each tool. * @exception org.apache.tools.ant.BuildException if the attributes * are invalid or incomplete, or a failure occurs in the deployment process. */	TokenNameCOMMENT_JAVADOC	 Execute the task. <p>This method calls the deploy() method on each of the vendor-specific tools in the <code>vendorTools</code> collection. This performs the actual process of deployment on each tool. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete, or a failure occurs in the deployment process. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
vendorTools	TokenNameIdentifier	 vendor Tools
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HotDeploymentTool	TokenNameIdentifier	 Hot Deployment Tool
tool	TokenNameIdentifier	 tool
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HotDeploymentTool	TokenNameIdentifier	 Hot Deployment Tool
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tool	TokenNameIdentifier	 tool
.	TokenNameDOT	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tool	TokenNameIdentifier	 tool
.	TokenNameDOT	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////////////// 
// 	TokenNameCOMMENT_LINE	 
// Set/get methods 	TokenNameCOMMENT_LINE	Set/get methods 
// 	TokenNameCOMMENT_LINE	 
/////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////////////// 
/** * Returns the action field. * @return A string representing the "action" attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the action field. @return A string representing the "action" attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The action to be performed, usually "deploy"; required. * Some tools support additional actions, such as "delete", "list", "undeploy", "update"... * @param action A String representing the "action" attribute. */	TokenNameCOMMENT_JAVADOC	 The action to be performed, usually "deploy"; required. Some tools support additional actions, such as "delete", "list", "undeploy", "update"... @param action A String representing the "action" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the source field (the path/filename of the component to be * deployed. * @return A File object representing the "source" attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the source field (the path/filename of the component to be deployed. @return A File object representing the "source" attribute. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The filename of the component to be deployed; optional * depending upon the tool and the action. * @param source String representing the "source" attribute. */	TokenNameCOMMENT_JAVADOC	 The filename of the component to be deployed; optional depending upon the tool and the action. @param source String representing the "source" attribute. 
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
}	TokenNameRBRACE	
