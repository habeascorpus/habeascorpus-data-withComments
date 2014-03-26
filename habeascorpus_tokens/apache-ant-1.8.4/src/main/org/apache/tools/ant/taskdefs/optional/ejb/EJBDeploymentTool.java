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
ejb	TokenNameIdentifier	 ejb
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
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
/** * The interface to implement for deployment tools. */	TokenNameCOMMENT_JAVADOC	 The interface to implement for deployment tools. 
public	TokenNamepublic	
interface	TokenNameinterface	
EJBDeploymentTool	TokenNameIdentifier	 EJB Deployment Tool
{	TokenNameLBRACE	
/** * Process a deployment descriptor, generating the necessary vendor specific * deployment files. * * @param descriptorFilename the name of the deployment descriptor * @param saxParser a SAX parser which can be used to parse the deployment descriptor. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Process a deployment descriptor, generating the necessary vendor specific deployment files. * @param descriptorFilename the name of the deployment descriptor @param saxParser a SAX parser which can be used to parse the deployment descriptor. @throws BuildException if there is an error. 
void	TokenNamevoid	
processDescriptor	TokenNameIdentifier	 process Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
descriptorFilename	TokenNameIdentifier	 descriptor Filename
,	TokenNameCOMMA	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParser	TokenNameIdentifier	 sax Parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Called to validate that the tool parameters have been configured. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Called to validate that the tool parameters have been configured. @throws BuildException if there is an error. 
void	TokenNamevoid	
validateConfigured	TokenNameIdentifier	 validate Configured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Set the task which owns this tool * @param task the task. */	TokenNameCOMMENT_JAVADOC	 Set the task which owns this tool @param task the task. 
void	TokenNamevoid	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Configure this tool for use in the ejbjar task. * @param config contains configuration state. */	TokenNameCOMMENT_JAVADOC	 Configure this tool for use in the ejbjar task. @param config contains configuration state. 
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
EjbJar	TokenNameIdentifier	 Ejb Jar
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
