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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
TaskAdapter	TokenNameIdentifier	 Task Adapter
;	TokenNameSEMICOLON	
/** * Adds a task definition to the current project, such that this new task can be * used in the current project. Two attributes are needed, the name that identifies * this task uniquely, and the full name of the class (including the packages) that * implements this task.</p> * <p>You can also define a group of tasks at once using the file or * resource attributes. These attributes point to files in the format of * Java property files. Each line defines a single task in the * format:</p> * <pre> * taskname=fully.qualified.java.classname * </pre> * @since Ant 1.1 * @ant.task category="internal" */	TokenNameCOMMENT_JAVADOC	 Adds a task definition to the current project, such that this new task can be used in the current project. Two attributes are needed, the name that identifies this task uniquely, and the full name of the class (including the packages) that implements this task.</p> <p>You can also define a group of tasks at once using the file or resource attributes. These attributes point to files in the format of Java property files. Each line defines a single task in the format:</p> <pre> taskname=fully.qualified.java.classname </pre> @since Ant 1.1 @ant.task category="internal" 
public	TokenNamepublic	
class	TokenNameclass	
Taskdef	TokenNameIdentifier	 Taskdef
extends	TokenNameextends	
Typedef	TokenNameIdentifier	 Typedef
{	TokenNameLBRACE	
/** * Default constructor. * Creates a new Taskdef instance. * This sets the adapter and the adaptto classes to * TaskAdapter and Task. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Creates a new Taskdef instance. This sets the adapter and the adaptto classes to TaskAdapter and Task. 
public	TokenNamepublic	
Taskdef	TokenNameIdentifier	 Taskdef
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAdapterClass	TokenNameIdentifier	 set Adapter Class
(	TokenNameLPAREN	
TaskAdapter	TokenNameIdentifier	 Task Adapter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAdaptToClass	TokenNameIdentifier	 set Adapt To Class
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
