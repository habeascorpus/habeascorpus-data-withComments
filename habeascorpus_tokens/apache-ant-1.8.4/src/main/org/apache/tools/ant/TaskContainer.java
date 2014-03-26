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
/** * Interface for objects which can contain tasks. * <p> * It is recommended that implementations call perform rather than * execute for the tasks they contain, as this method ensures that the * appropriate BuildEvents will be generated. * * @see Task#perform * @see Task#execute * @see BuildEvent * */	TokenNameCOMMENT_JAVADOC	 Interface for objects which can contain tasks. <p> It is recommended that implementations call perform rather than execute for the tasks they contain, as this method ensures that the appropriate BuildEvents will be generated. * @see Task#perform @see Task#execute @see BuildEvent 
public	TokenNamepublic	
interface	TokenNameinterface	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
/** * Adds a task to this task container * * @param task The task to be added to this container. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a task to this task container * @param task The task to be added to this container. Must not be <code>null</code>. 
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
