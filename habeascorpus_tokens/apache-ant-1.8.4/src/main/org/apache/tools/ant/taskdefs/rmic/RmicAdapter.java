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
rmic	TokenNameIdentifier	 rmic
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
Rmic	TokenNameIdentifier	 Rmic
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
;	TokenNameSEMICOLON	
/** * The interface that all rmic adapters must adhere to. * * <p>A rmic adapter is an adapter that interprets the rmic's * parameters in preperation to be passed off to the compiler this * adapter represents. As all the necessary values are stored in the * Rmic task itself, the only thing all adapters need is the rmic * task, the execute command and a parameterless constructor (for * reflection).</p> * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The interface that all rmic adapters must adhere to. * <p>A rmic adapter is an adapter that interprets the rmic's parameters in preperation to be passed off to the compiler this adapter represents. As all the necessary values are stored in the Rmic task itself, the only thing all adapters need is the rmic task, the execute command and a parameterless constructor (for reflection).</p> * @since Ant 1.4 
public	TokenNamepublic	
interface	TokenNameinterface	
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
{	TokenNameLBRACE	
/** * Sets the rmic attributes, which are stored in the Rmic task. * @param attributes the rmic attributes to use */	TokenNameCOMMENT_JAVADOC	 Sets the rmic attributes, which are stored in the Rmic task. @param attributes the rmic attributes to use 
void	TokenNamevoid	
setRmic	TokenNameIdentifier	 set Rmic
(	TokenNameLPAREN	
Rmic	TokenNameIdentifier	 Rmic
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Call the rmic compiler. * * @return true if has the compilation been successful * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Call the rmic compiler. * @return true if has the compilation been successful @throws BuildException on error 
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Maps source class files to the files generated by this rmic * implementation. * @return the filename mapper used by this implementation */	TokenNameCOMMENT_JAVADOC	 Maps source class files to the files generated by this rmic implementation. @return the filename mapper used by this implementation 
FileNameMapper	TokenNameIdentifier	 File Name Mapper
getMapper	TokenNameIdentifier	 get Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The CLASSPATH this rmic process will use. * @return the classpaht this rmic process will use */	TokenNameCOMMENT_JAVADOC	 The CLASSPATH this rmic process will use. @return the classpaht this rmic process will use 
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
