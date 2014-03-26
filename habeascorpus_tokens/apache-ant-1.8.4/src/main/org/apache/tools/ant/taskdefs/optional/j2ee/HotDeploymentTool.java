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
/** * An interface for vendor-specific "hot" deployment tools. * * @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool * @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy */	TokenNameCOMMENT_JAVADOC	 An interface for vendor-specific "hot" deployment tools. * @see org.apache.tools.ant.taskdefs.optional.j2ee.AbstractHotDeploymentTool @see org.apache.tools.ant.taskdefs.optional.j2ee.ServerDeploy 
public	TokenNamepublic	
interface	TokenNameinterface	
HotDeploymentTool	TokenNameIdentifier	 Hot Deployment Tool
{	TokenNameLBRACE	
/** The delete action String **/	TokenNameCOMMENT_JAVADOC	 The delete action String *
String	TokenNameIdentifier	 String
ACTION_DELETE	TokenNameIdentifier	 ACTION  DELETE
=	TokenNameEQUAL	
"delete"	TokenNameStringLiteral	delete
;	TokenNameSEMICOLON	
/** The deploy action String **/	TokenNameCOMMENT_JAVADOC	 The deploy action String *
String	TokenNameIdentifier	 String
ACTION_DEPLOY	TokenNameIdentifier	 ACTION  DEPLOY
=	TokenNameEQUAL	
"deploy"	TokenNameStringLiteral	deploy
;	TokenNameSEMICOLON	
/** The list action String **/	TokenNameCOMMENT_JAVADOC	 The list action String *
String	TokenNameIdentifier	 String
ACTION_LIST	TokenNameIdentifier	 ACTION  LIST
=	TokenNameEQUAL	
"list"	TokenNameStringLiteral	list
;	TokenNameSEMICOLON	
/** The undeploy action String **/	TokenNameCOMMENT_JAVADOC	 The undeploy action String *
String	TokenNameIdentifier	 String
ACTION_UNDEPLOY	TokenNameIdentifier	 ACTION  UNDEPLOY
=	TokenNameEQUAL	
"undeploy"	TokenNameStringLiteral	undeploy
;	TokenNameSEMICOLON	
/** The update action String **/	TokenNameCOMMENT_JAVADOC	 The update action String *
String	TokenNameIdentifier	 String
ACTION_UPDATE	TokenNameIdentifier	 ACTION  UPDATE
=	TokenNameEQUAL	
"update"	TokenNameStringLiteral	update
;	TokenNameSEMICOLON	
/** * Validates the passed in attributes. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Validates the passed in attributes. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
void	TokenNamevoid	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Perform the actual deployment. * @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. */	TokenNameCOMMENT_JAVADOC	 Perform the actual deployment. @exception org.apache.tools.ant.BuildException if the attributes are invalid or incomplete. 
void	TokenNamevoid	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Sets the parent task. * @param task A ServerDeploy object representing the parent task. */	TokenNameCOMMENT_JAVADOC	 Sets the parent task. @param task A ServerDeploy object representing the parent task. 
void	TokenNamevoid	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
ServerDeploy	TokenNameIdentifier	 Server Deploy
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
