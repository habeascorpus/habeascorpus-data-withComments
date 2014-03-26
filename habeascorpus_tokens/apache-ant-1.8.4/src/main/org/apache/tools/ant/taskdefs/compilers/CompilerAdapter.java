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
Javac	TokenNameIdentifier	 Javac
;	TokenNameSEMICOLON	
/** * The interface that all compiler adapters must adhere to. * * <p>A compiler adapter is an adapter that interprets the javac's * parameters in preparation to be passed off to the compiler this * adapter represents. As all the necessary values are stored in the * Javac task itself, the only thing all adapters need is the javac * task, the execute command and a parameterless constructor (for * reflection).</p> * * @since Ant 1.3 */	TokenNameCOMMENT_JAVADOC	 The interface that all compiler adapters must adhere to. * <p>A compiler adapter is an adapter that interprets the javac's parameters in preparation to be passed off to the compiler this adapter represents. As all the necessary values are stored in the Javac task itself, the only thing all adapters need is the javac task, the execute command and a parameterless constructor (for reflection).</p> * @since Ant 1.3 
public	TokenNamepublic	
interface	TokenNameinterface	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
{	TokenNameLBRACE	
/** * Sets the compiler attributes, which are stored in the Javac task. * @param attributes the compiler attributes */	TokenNameCOMMENT_JAVADOC	 Sets the compiler attributes, which are stored in the Javac task. @param attributes the compiler attributes 
void	TokenNamevoid	
setJavac	TokenNameIdentifier	 set Javac
(	TokenNameLPAREN	
Javac	TokenNameIdentifier	 Javac
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
}	TokenNameRBRACE	
