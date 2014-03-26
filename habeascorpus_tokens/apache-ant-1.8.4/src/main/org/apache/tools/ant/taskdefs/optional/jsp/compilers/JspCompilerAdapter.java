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
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
compilers	TokenNameIdentifier	 compilers
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspC	TokenNameIdentifier	 Jsp C
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspMangler	TokenNameIdentifier	 Jsp Mangler
;	TokenNameSEMICOLON	
/** * The interface that all jsp compiler adapters must adher to. * * <p>A compiler adapter is an adapter that interprets the jspc's * parameters in preperation to be passed off to the compier this * adapter represents. As all the necessary values are stored in the * Jspc task itself, the only thing all adapters need is the jsp * task, the execute command and a parameterless constructor (for * reflection).</p> * */	TokenNameCOMMENT_JAVADOC	 The interface that all jsp compiler adapters must adher to. * <p>A compiler adapter is an adapter that interprets the jspc's parameters in preperation to be passed off to the compier this adapter represents. As all the necessary values are stored in the Jspc task itself, the only thing all adapters need is the jsp task, the execute command and a parameterless constructor (for reflection).</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
{	TokenNameLBRACE	
/** * Sets the compiler attributes, which are stored in the Jspc task. * @param attributes the jsp compiler attributes */	TokenNameCOMMENT_JAVADOC	 Sets the compiler attributes, which are stored in the Jspc task. @param attributes the jsp compiler attributes 
void	TokenNamevoid	
setJspc	TokenNameIdentifier	 set Jspc
(	TokenNameLPAREN	
JspC	TokenNameIdentifier	 Jsp C
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Executes the task. * * @return has the compilation been successful * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Executes the task. * @return has the compilation been successful @throws BuildException on error 
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * @return an instance of the mangler this compiler uses */	TokenNameCOMMENT_JAVADOC	 @return an instance of the mangler this compiler uses 
JspMangler	TokenNameIdentifier	 Jsp Mangler
createMangler	TokenNameIdentifier	 create Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * ask if compiler can sort out its own dependencies * @return true if the compiler wants to do its own * depends */	TokenNameCOMMENT_JAVADOC	 ask if compiler can sort out its own dependencies @return true if the compiler wants to do its own depends 
boolean	TokenNameboolean	
implementsOwnDependencyChecking	TokenNameIdentifier	 implements Own Dependency Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
