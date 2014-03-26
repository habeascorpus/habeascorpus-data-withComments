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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
/** * Instances of classes that implement this interface can register * to be notified when things happened during a build. * * @see BuildEvent * @see Project#addBuildListener(BuildListener) * */	TokenNameCOMMENT_JAVADOC	 Instances of classes that implement this interface can register to be notified when things happened during a build. * @see BuildEvent @see Project#addBuildListener(BuildListener) 
public	TokenNamepublic	
interface	TokenNameinterface	
BuildListener	TokenNameIdentifier	 Build Listener
extends	TokenNameextends	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
/** * Signals that a build has started. This event * is fired before any targets have started. * * <p>This event is fired before the project instance is fully * configured. In particular no properties have been set and the * project may not know its name or default target, yet.</p> * * @param event An event with any relevant extra information. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Signals that a build has started. This event is fired before any targets have started. * <p>This event is fired before the project instance is fully configured. In particular no properties have been set and the project may not know its name or default target, yet.</p> * @param event An event with any relevant extra information. Must not be <code>null</code>. 
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Signals that the last target has finished. This event * will still be fired if an error occurred during the build. * * @param event An event with any relevant extra information. * Must not be <code>null</code>. * * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Signals that the last target has finished. This event will still be fired if an error occurred during the build. * @param event An event with any relevant extra information. Must not be <code>null</code>. * @see BuildEvent#getException() 
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Signals that a target is starting. * * @param event An event with any relevant extra information. * Must not be <code>null</code>. * * @see BuildEvent#getTarget() */	TokenNameCOMMENT_JAVADOC	 Signals that a target is starting. * @param event An event with any relevant extra information. Must not be <code>null</code>. * @see BuildEvent#getTarget() 
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Signals that a target has finished. This event will * still be fired if an error occurred during the build. * * @param event An event with any relevant extra information. * Must not be <code>null</code>. * * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Signals that a target has finished. This event will still be fired if an error occurred during the build. * @param event An event with any relevant extra information. Must not be <code>null</code>. * @see BuildEvent#getException() 
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Signals that a task is starting. * * @param event An event with any relevant extra information. * Must not be <code>null</code>. * * @see BuildEvent#getTask() */	TokenNameCOMMENT_JAVADOC	 Signals that a task is starting. * @param event An event with any relevant extra information. Must not be <code>null</code>. * @see BuildEvent#getTask() 
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Signals that a task has finished. This event will still * be fired if an error occurred during the build. * * @param event An event with any relevant extra information. * Must not be <code>null</code>. * * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Signals that a task has finished. This event will still be fired if an error occurred during the build. * @param event An event with any relevant extra information. Must not be <code>null</code>. * @see BuildEvent#getException() 
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Signals a message logging event. * * @param event An event with any relevant extra information. * Must not be <code>null</code>. * * @see BuildEvent#getMessage() * @see BuildEvent#getException() * @see BuildEvent#getPriority() */	TokenNameCOMMENT_JAVADOC	 Signals a message logging event. * @param event An event with any relevant extra information. Must not be <code>null</code>. * @see BuildEvent#getMessage() @see BuildEvent#getException() @see BuildEvent#getPriority() 
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
