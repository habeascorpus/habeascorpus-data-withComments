/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * Target executor abstraction. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Target executor abstraction. @since Ant 1.6.3 
public	TokenNamepublic	
interface	TokenNameinterface	
Executor	TokenNameIdentifier	 Executor
{	TokenNameLBRACE	
/** * Execute the specified Targets for the specified Project. * @param project the Ant Project. * @param targetNames String[] of Target names as specified on the command line. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the specified Targets for the specified Project. @param project the Ant Project. @param targetNames String[] of Target names as specified on the command line. @throws BuildException on error 
void	TokenNamevoid	
executeTargets	TokenNameIdentifier	 execute Targets
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetNames	TokenNameIdentifier	 target Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Get the appropriate subproject Executor instance. * * This allows the top executor to control what type of executor is used to execute * subprojects via <ant>/<antcall>/<subant> and task that extend these. * All bundled Executors return a SingleCheckExecutor (running a merged set of * depended targets for all targets called) to run sub-builds. * * @return an Executor instance. */	TokenNameCOMMENT_JAVADOC	 Get the appropriate subproject Executor instance. * This allows the top executor to control what type of executor is used to execute subprojects via <ant>/<antcall>/<subant> and task that extend these. All bundled Executors return a SingleCheckExecutor (running a merged set of depended targets for all targets called) to run sub-builds. * @return an Executor instance. 
Executor	TokenNameIdentifier	 Executor
getSubProjectExecutor	TokenNameIdentifier	 get Sub Project Executor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
