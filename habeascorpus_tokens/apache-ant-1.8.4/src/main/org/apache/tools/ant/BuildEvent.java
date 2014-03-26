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
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
/** * Class representing an event occurring during a build. An * event is built by specifying either a project, a task or a target. * A project level event will only have a project reference; * a target level event will have project and target references; * a task level event will have project, target and task references. * */	TokenNameCOMMENT_JAVADOC	 Class representing an event occurring during a build. An event is built by specifying either a project, a task or a target. A project level event will only have a project reference; a target level event will have project and target references; a task level event will have project, target and task references. 
public	TokenNamepublic	
class	TokenNameclass	
BuildEvent	TokenNameIdentifier	 Build Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4538050075952288486L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Project which emitted the event. */	TokenNameCOMMENT_JAVADOC	 Project which emitted the event. 
private	TokenNameprivate	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** Target which emitted the event, if specified. */	TokenNameCOMMENT_JAVADOC	 Target which emitted the event, if specified. 
private	TokenNameprivate	
final	TokenNamefinal	
Target	TokenNameIdentifier	 Target
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
/** Task which emitted the event, if specified. */	TokenNameCOMMENT_JAVADOC	 Task which emitted the event, if specified. 
private	TokenNameprivate	
final	TokenNamefinal	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
/** * Message associated with the event. This is only used for * "messageLogged" events. */	TokenNameCOMMENT_JAVADOC	 Message associated with the event. This is only used for "messageLogged" events. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
/** * The priority of the message, for "messageLogged" events. */	TokenNameCOMMENT_JAVADOC	 The priority of the message, for "messageLogged" events. 
private	TokenNameprivate	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
;	TokenNameSEMICOLON	
/** * The exception associated with this event, if any. * This is only used for "messageLogged", "taskFinished", "targetFinished", * and "buildFinished" events. */	TokenNameCOMMENT_JAVADOC	 The exception associated with this event, if any. This is only used for "messageLogged", "taskFinished", "targetFinished", and "buildFinished" events. 
private	TokenNameprivate	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/** * Construct a BuildEvent for a project level event. * * @param project the project that emitted the event. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a BuildEvent for a project level event. * @param project the project that emitted the event. Should not be <code>null</code>. 
public	TokenNamepublic	
BuildEvent	TokenNameIdentifier	 Build Event
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a BuildEvent for a target level event. * The project associated with the event is derived * from the given target. * * @param target the target that emitted the event. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a BuildEvent for a target level event. The project associated with the event is derived from the given target. * @param target the target that emitted the event. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildEvent	TokenNameIdentifier	 Build Event
(	TokenNameLPAREN	
Target	TokenNameIdentifier	 Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a BuildEvent for a task level event. * The project and target associated with the event * are derived from the given task. * * @param task the task that emitted the event. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a BuildEvent for a task level event. The project and target associated with the event are derived from the given task. * @param task the task that emitted the event. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildEvent	TokenNameIdentifier	 Build Event
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the message and priority associated with this event. * This is used for "messageLogged" events. * * @param message the message to be associated with this event. * Should not be <code>null</code>. * @param priority the priority to be associated with this event, * as defined in the {@link Project Project} class. * * @see BuildListener#messageLogged(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 Sets the message and priority associated with this event. This is used for "messageLogged" events. * @param message the message to be associated with this event. Should not be <code>null</code>. @param priority the priority to be associated with this event, as defined in the {@link Project Project} class. * @see BuildListener#messageLogged(BuildEvent) 
public	TokenNamepublic	
void	TokenNamevoid	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the exception associated with this event. This is used * for "messageLogged", "taskFinished", "targetFinished", and "buildFinished" * events. * * @param exception The exception to be associated with this event. * May be <code>null</code>. * * @see BuildListener#messageLogged(BuildEvent) * @see BuildListener#taskFinished(BuildEvent) * @see BuildListener#targetFinished(BuildEvent) * @see BuildListener#buildFinished(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 Sets the exception associated with this event. This is used for "messageLogged", "taskFinished", "targetFinished", and "buildFinished" events. * @param exception The exception to be associated with this event. May be <code>null</code>. * @see BuildListener#messageLogged(BuildEvent) @see BuildListener#taskFinished(BuildEvent) @see BuildListener#targetFinished(BuildEvent) @see BuildListener#buildFinished(BuildEvent) 
public	TokenNamepublic	
void	TokenNamevoid	
setException	TokenNameIdentifier	 set Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the project that fired this event. * * @return the project that fired this event */	TokenNameCOMMENT_JAVADOC	 Returns the project that fired this event. * @return the project that fired this event 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the target that fired this event. * * @return the project that fired this event, or <code>null</code> * if this event is a project level event. */	TokenNameCOMMENT_JAVADOC	 Returns the target that fired this event. * @return the project that fired this event, or <code>null</code> if this event is a project level event. 
public	TokenNamepublic	
Target	TokenNameIdentifier	 Target
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the task that fired this event. * * @return the task that fired this event, or <code>null</code> * if this event is a project or target level event. */	TokenNameCOMMENT_JAVADOC	 Returns the task that fired this event. * @return the task that fired this event, or <code>null</code> if this event is a project or target level event. 
public	TokenNamepublic	
Task	TokenNameIdentifier	 Task
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the logging message. This field will only be set * for "messageLogged" events. * * @return the message associated with this event, or <code>null</code> * if no message has been set. * * @see BuildListener#messageLogged(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 Returns the logging message. This field will only be set for "messageLogged" events. * @return the message associated with this event, or <code>null</code> if no message has been set. * @see BuildListener#messageLogged(BuildEvent) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the priority of the logging message. This field will only * be set for "messageLogged" events. The meaning of this priority * is as specified by the constants in the {@link Project Project} class. * * @return the priority associated with this event. * * @see BuildListener#messageLogged(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 Returns the priority of the logging message. This field will only be set for "messageLogged" events. The meaning of this priority is as specified by the constants in the {@link Project Project} class. * @return the priority associated with this event. * @see BuildListener#messageLogged(BuildEvent) 
public	TokenNamepublic	
int	TokenNameint	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the exception that was thrown, if any. This field will only * be set for "messageLogged", "taskFinished", "targetFinished", and "buildFinished" * events. * * @return the exception associated with this exception, or * <code>null</code> if no exception has been set. * * @see BuildListener#messageLogged(BuildEvent) * @see BuildListener#taskFinished(BuildEvent) * @see BuildListener#targetFinished(BuildEvent) * @see BuildListener#buildFinished(BuildEvent) */	TokenNameCOMMENT_JAVADOC	 Returns the exception that was thrown, if any. This field will only be set for "messageLogged", "taskFinished", "targetFinished", and "buildFinished" events. * @return the exception associated with this exception, or <code>null</code> if no exception has been set. * @see BuildListener#messageLogged(BuildEvent) @see BuildListener#taskFinished(BuildEvent) @see BuildListener#targetFinished(BuildEvent) @see BuildListener#buildFinished(BuildEvent) 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
