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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
dispatch	TokenNameIdentifier	 dispatch
.	TokenNameDOT	
DispatchUtils	TokenNameIdentifier	 Dispatch Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Base class for all tasks. * * Use Project.createTask to create a new task instance rather than * using this class directly for construction. * * @see Project#createTask */	TokenNameCOMMENT_JAVADOC	 Base class for all tasks. * Use Project.createTask to create a new task instance rather than using this class directly for construction. * @see Project#createTask 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Task	TokenNameIdentifier	 Task
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * Target this task belongs to, if any. * @deprecated since 1.6.x. * You should not be accessing this variable directly. * Please use the {@link #getOwningTarget()} method. */	TokenNameCOMMENT_JAVADOC	 Target this task belongs to, if any. @deprecated since 1.6.x. You should not be accessing this variable directly. Please use the {@link #getOwningTarget()} method. 
protected	TokenNameprotected	
Target	TokenNameIdentifier	 Target
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
/** * Name of this task to be used for logging purposes. * This defaults to the same as the type, but may be * overridden by the user. For instance, the name "java" * isn't terribly descriptive for a task used within * another task - the outer task code can probably * provide a better one. * @deprecated since 1.6.x. * You should not be accessing this variable directly. * Please use the {@link #getTaskName()} method. */	TokenNameCOMMENT_JAVADOC	 Name of this task to be used for logging purposes. This defaults to the same as the type, but may be overridden by the user. For instance, the name "java" isn't terribly descriptive for a task used within another task - the outer task code can probably provide a better one. @deprecated since 1.6.x. You should not be accessing this variable directly. Please use the {@link #getTaskName()} method. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
taskName	TokenNameIdentifier	 task Name
;	TokenNameSEMICOLON	
/** * Type of this task. * * @deprecated since 1.6.x. * You should not be accessing this variable directly. * Please use the {@link #getTaskType()} method. */	TokenNameCOMMENT_JAVADOC	 Type of this task. * @deprecated since 1.6.x. You should not be accessing this variable directly. Please use the {@link #getTaskType()} method. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
taskType	TokenNameIdentifier	 task Type
;	TokenNameSEMICOLON	
/** * Wrapper for this object, used to configure it at runtime. * * @deprecated since 1.6.x. * You should not be accessing this variable directly. * Please use the {@link #getWrapper()} method. */	TokenNameCOMMENT_JAVADOC	 Wrapper for this object, used to configure it at runtime. * @deprecated since 1.6.x. You should not be accessing this variable directly. Please use the {@link #getWrapper()} method. 
protected	TokenNameprotected	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
wrapper	TokenNameIdentifier	 wrapper
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Whether or not this task is invalid. A task becomes invalid * if a conflicting class is specified as the implementation for * its type. */	TokenNameCOMMENT_JAVADOC	 Whether or not this task is invalid. A task becomes invalid if a conflicting class is specified as the implementation for its type. 
private	TokenNameprivate	
boolean	TokenNameboolean	
invalid	TokenNameIdentifier	 invalid
;	TokenNameSEMICOLON	
/** Sole constructor. */	TokenNameCOMMENT_JAVADOC	 Sole constructor. 
public	TokenNamepublic	
Task	TokenNameIdentifier	 Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the target container of this task. * * @param target Target in whose scope this task belongs. * May be <code>null</code>, indicating a top-level task. */	TokenNameCOMMENT_JAVADOC	 Sets the target container of this task. * @param target Target in whose scope this task belongs. May be <code>null</code>, indicating a top-level task. 
public	TokenNamepublic	
void	TokenNamevoid	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
Target	TokenNameIdentifier	 Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the container target of this task. * * @return The target containing this task, or <code>null</code> if * this task is a top-level task. */	TokenNameCOMMENT_JAVADOC	 Returns the container target of this task. * @return The target containing this task, or <code>null</code> if this task is a top-level task. 
public	TokenNamepublic	
Target	TokenNameIdentifier	 Target
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name to use in logging messages. * * @param name The name to use in logging messages. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the name to use in logging messages. * @param name The name to use in logging messages. Should not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taskName	TokenNameIdentifier	 task Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name to use in logging messages. * * @return the name to use in logging messages. */	TokenNameCOMMENT_JAVADOC	 Returns the name to use in logging messages. * @return the name to use in logging messages. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskName	TokenNameIdentifier	 task Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name with which the task has been invoked. * * @param type The name the task has been invoked as. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the name with which the task has been invoked. * @param type The name the task has been invoked as. Should not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taskType	TokenNameIdentifier	 task Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by the project to let the task initialize properly. * The default implementation is a no-op. * * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Called by the project to let the task initialize properly. The default implementation is a no-op. * @exception BuildException if something goes wrong with the build 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called by the project to let the task do its work. This method may be * called more than once, if the task is invoked more than once. * For example, * if target1 and target2 both depend on target3, then running * "ant target1 target2" will run all tasks in target3 twice. * * @exception BuildException if something goes wrong with the build. */	TokenNameCOMMENT_JAVADOC	 Called by the project to let the task do its work. This method may be called more than once, if the task is invoked more than once. For example, if target1 and target2 both depend on target3, then running "ant target1 target2" will run all tasks in target3 twice. * @exception BuildException if something goes wrong with the build. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the wrapper used for runtime configuration. * * @return the wrapper used for runtime configuration. This * method will generate a new wrapper (and cache it) * if one isn't set already. */	TokenNameCOMMENT_JAVADOC	 Returns the wrapper used for runtime configuration. * @return the wrapper used for runtime configuration. This method will generate a new wrapper (and cache it) if one isn't set already. 
public	TokenNamepublic	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
getRuntimeConfigurableWrapper	TokenNameIdentifier	 get Runtime Configurable Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wrapper	TokenNameIdentifier	 wrapper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrapper	TokenNameIdentifier	 wrapper
=	TokenNameEQUAL	
new	TokenNamenew	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wrapper	TokenNameIdentifier	 wrapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the wrapper to be used for runtime configuration. * * This method should be used only by the ProjectHelper and Ant internals. * It is public to allow helper plugins to operate on tasks, normal tasks * should never use it. * * @param wrapper The wrapper to be used for runtime configuration. * May be <code>null</code>, in which case the next call * to getRuntimeConfigurableWrapper will generate a new * wrapper. */	TokenNameCOMMENT_JAVADOC	 Sets the wrapper to be used for runtime configuration. * This method should be used only by the ProjectHelper and Ant internals. It is public to allow helper plugins to operate on tasks, normal tasks should never use it. * @param wrapper The wrapper to be used for runtime configuration. May be <code>null</code>, in which case the next call to getRuntimeConfigurableWrapper will generate a new wrapper. 
public	TokenNamepublic	
void	TokenNamevoid	
setRuntimeConfigurableWrapper	TokenNameIdentifier	 set Runtime Configurable Wrapper
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
wrapper	TokenNameIdentifier	 wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wrapper	TokenNameIdentifier	 wrapper
=	TokenNameEQUAL	
wrapper	TokenNameIdentifier	 wrapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XXX: (Jon Skeet) The comment "if it hasn't been done already" may 	TokenNameCOMMENT_LINE	XXX: (Jon Skeet) The comment "if it hasn't been done already" may 
// not be strictly true. wrapper.maybeConfigure() won't configure the same 	TokenNameCOMMENT_LINE	not be strictly true. wrapper.maybeConfigure() won't configure the same 
// attributes/text more than once, but it may well add the children again, 	TokenNameCOMMENT_LINE	attributes/text more than once, but it may well add the children again, 
// unless I've missed something. 	TokenNameCOMMENT_LINE	unless I've missed something. 
/** * Configures this task - if it hasn't been done already. * If the task has been invalidated, it is replaced with an * UnknownElement task which uses the new definition in the project. * * @exception BuildException if the task cannot be configured. */	TokenNameCOMMENT_JAVADOC	 Configures this task - if it hasn't been done already. If the task has been invalidated, it is replaced with an UnknownElement task which uses the new definition in the project. * @exception BuildException if the task cannot be configured. 
public	TokenNamepublic	
void	TokenNamevoid	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
invalid	TokenNameIdentifier	 invalid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wrapper	TokenNameIdentifier	 wrapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getReplacement	TokenNameIdentifier	 get Replacement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Force the task to be reconfigured from its RuntimeConfigurable. */	TokenNameCOMMENT_JAVADOC	 Force the task to be reconfigured from its RuntimeConfigurable. 
public	TokenNamepublic	
void	TokenNamevoid	
reconfigure	TokenNameIdentifier	 reconfigure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wrapper	TokenNameIdentifier	 wrapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
reconfigure	TokenNameIdentifier	 reconfigure
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles output by logging it with the INFO priority. * * @param output The output to log. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Handles output by logging it with the INFO priority. * @param output The output to log. Should not be <code>null</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles output by logging it with the INFO priority. * * @param output The output to log. Should not be <code>null</code>. * * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Handles output by logging it with the INFO priority. * @param output The output to log. Should not be <code>null</code>. * @since Ant 1.5.2 
protected	TokenNameprotected	
void	TokenNamevoid	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handle an input request by this task. * * @param buffer the buffer into which data is to be read. * @param offset the offset into the buffer at which data is stored. * @param length the amount of data to read. * * @return the number of bytes read. * * @exception IOException if the data cannot be read. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Handle an input request by this task. * @param buffer the buffer into which data is to be read. @param offset the offset into the buffer at which data is stored. @param length the amount of data to read. * @return the number of bytes read. * @exception IOException if the data cannot be read. @since Ant 1.6 
protected	TokenNameprotected	
int	TokenNameint	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
defaultInput	TokenNameIdentifier	 default Input
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles an error output by logging it with the WARN priority. * * @param output The error output to log. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Handles an error output by logging it with the WARN priority. * @param output The error output to log. Should not be <code>null</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles an error line by logging it with the WARN priority. * * @param output The error output to log. Should not be <code>null</code>. * * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Handles an error line by logging it with the WARN priority. * @param output The error output to log. Should not be <code>null</code>. * @since Ant 1.5.2 
protected	TokenNameprotected	
void	TokenNamevoid	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs a message with the default (INFO) priority. * * @param msg The message to be logged. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Logs a message with the default (INFO) priority. * @param msg The message to be logged. Should not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs a message with the given priority. This delegates * the actual logging to the project. * * @param msg The message to be logged. Should not be <code>null</code>. * @param msgLevel The message priority at which this message is to * be logged. */	TokenNameCOMMENT_JAVADOC	 Logs a message with the given priority. This delegates the actual logging to the project. * @param msg The message to be logged. Should not be <code>null</code>. @param msgLevel The message priority at which this message is to be logged. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Logs a message with the given priority. This delegates * the actual logging to the project. * * @param t The exception to be logged. Should not be <code>null</code>. * @param msgLevel The message priority at which this message is to * be logged. * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Logs a message with the given priority. This delegates the actual logging to the project. * @param t The exception to be logged. Should not be <code>null</code>. @param msgLevel The message priority at which this message is to be logged. @since 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Logs a message with the given priority. This delegates * the actual logging to the project. * * @param msg The message to be logged. Should not be <code>null</code>. * @param t The exception to be logged. May be <code>null</code>. * @param msgLevel The message priority at which this message is to * be logged. * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Logs a message with the given priority. This delegates the actual logging to the project. * @param msg The message to be logged. Should not be <code>null</code>. @param t The exception to be logged. May be <code>null</code>. @param msgLevel The message priority at which this message is to be logged. @since 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Performs this task if it's still valid, or gets a replacement * version and performs that otherwise. * * Performing a task consists of firing a task started event, * configuring the task, executing it, and then firing task finished * event. If a runtime exception is thrown, the task finished event * is still fired, but with the exception as the cause. */	TokenNameCOMMENT_JAVADOC	 Performs this task if it's still valid, or gets a replacement version and performs that otherwise. * Performing a task consists of firing a task started event, configuring the task, executing it, and then firing task finished event. If a runtime exception is thrown, the task finished event is still fired, but with the exception as the cause. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
perform	TokenNameIdentifier	 perform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
invalid	TokenNameIdentifier	 invalid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTaskStarted	TokenNameIdentifier	 fire Task Started
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
reason	TokenNameIdentifier	 reason
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DispatchUtils	TokenNameIdentifier	 Dispatch Utils
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
UNKNOWN_LOCATION	TokenNameIdentifier	 UNKNOWN  LOCATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reason	TokenNameIdentifier	 reason
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reason	TokenNameIdentifier	 reason
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reason	TokenNameIdentifier	 reason
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTaskFinished	TokenNameIdentifier	 fire Task Finished
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
reason	TokenNameIdentifier	 reason
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
UnknownElement	TokenNameIdentifier	 Unknown Element
ue	TokenNameIdentifier	 ue
=	TokenNameEQUAL	
getReplacement	TokenNameIdentifier	 get Replacement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
perform	TokenNameIdentifier	 perform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Marks this task as invalid. Any further use of this task * will go through a replacement with the updated definition. */	TokenNameCOMMENT_JAVADOC	 Marks this task as invalid. Any further use of this task will go through a replacement with the updated definition. 
final	TokenNamefinal	
void	TokenNamevoid	
markInvalid	TokenNameIdentifier	 mark Invalid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalid	TokenNameIdentifier	 invalid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Has this task been marked invalid? * * @return true if this task is no longer valid. A new task should be * configured in this case. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Has this task been marked invalid? * @return true if this task is no longer valid. A new task should be configured in this case. * @since Ant 1.5 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
invalid	TokenNameIdentifier	 invalid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replacement element used if this task is invalidated. */	TokenNameCOMMENT_JAVADOC	 Replacement element used if this task is invalidated. 
private	TokenNameprivate	
UnknownElement	TokenNameIdentifier	 Unknown Element
replacement	TokenNameIdentifier	 replacement
;	TokenNameSEMICOLON	
/** * Creates an UnknownElement that can be used to replace this task. * Once this has been created once, it is cached and returned by * future calls. * * @return the UnknownElement instance for the new definition of this task. */	TokenNameCOMMENT_JAVADOC	 Creates an UnknownElement that can be used to replace this task. Once this has been created once, it is cached and returned by future calls. * @return the UnknownElement instance for the new definition of this task. 
private	TokenNameprivate	
UnknownElement	TokenNameIdentifier	 Unknown Element
getReplacement	TokenNameIdentifier	 get Replacement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replacement	TokenNameIdentifier	 replacement
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownElement	TokenNameIdentifier	 Unknown Element
(	TokenNameLPAREN	
taskType	TokenNameIdentifier	 task Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
taskType	TokenNameIdentifier	 task Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
setRuntimeConfigurableWrapper	TokenNameIdentifier	 set Runtime Configurable Wrapper
(	TokenNameLPAREN	
wrapper	TokenNameIdentifier	 wrapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replaceChildren	TokenNameIdentifier	 replace Children
(	TokenNameLPAREN	
wrapper	TokenNameIdentifier	 wrapper
,	TokenNameCOMMA	
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
replacement	TokenNameIdentifier	 replacement
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursively adds an UnknownElement instance for each child * element of replacement. * * @since Ant 1.5.1 */	TokenNameCOMMENT_JAVADOC	 Recursively adds an UnknownElement instance for each child element of replacement. * @since Ant 1.5.1 
private	TokenNameprivate	
void	TokenNamevoid	
replaceChildren	TokenNameIdentifier	 replace Children
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
wrapper	TokenNameIdentifier	 wrapper
,	TokenNameCOMMA	
UnknownElement	TokenNameIdentifier	 Unknown Element
parentElement	TokenNameIdentifier	 parent Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
childWrapper	TokenNameIdentifier	 child Wrapper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnknownElement	TokenNameIdentifier	 Unknown Element
childElement	TokenNameIdentifier	 child Element
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownElement	TokenNameIdentifier	 Unknown Element
(	TokenNameLPAREN	
childWrapper	TokenNameIdentifier	 child Wrapper
.	TokenNameDOT	
getElementTag	TokenNameIdentifier	 get Element Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentElement	TokenNameIdentifier	 parent Element
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
childElement	TokenNameIdentifier	 child Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childElement	TokenNameIdentifier	 child Element
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childElement	TokenNameIdentifier	 child Element
.	TokenNameDOT	
setRuntimeConfigurableWrapper	TokenNameIdentifier	 set Runtime Configurable Wrapper
(	TokenNameLPAREN	
childWrapper	TokenNameIdentifier	 child Wrapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childWrapper	TokenNameIdentifier	 child Wrapper
.	TokenNameDOT	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
childElement	TokenNameIdentifier	 child Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replaceChildren	TokenNameIdentifier	 replace Children
(	TokenNameLPAREN	
childWrapper	TokenNameIdentifier	 child Wrapper
,	TokenNameCOMMA	
childElement	TokenNameIdentifier	 child Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the type of task. * * @return the type of task. */	TokenNameCOMMENT_JAVADOC	 Return the type of task. * @return the type of task. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskType	TokenNameIdentifier	 task Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the runtime configurable structure for this task. * * @return the runtime structure for this task. */	TokenNameCOMMENT_JAVADOC	 Return the runtime configurable structure for this task. * @return the runtime structure for this task. 
protected	TokenNameprotected	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wrapper	TokenNameIdentifier	 wrapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bind a task to another; use this when configuring a newly created * task to do work on behalf of another. * Project, OwningTarget, TaskName, Location and Description are all copied * * Important: this method does not call {@link Task#init()}. * If you are creating a task to delegate work to, call {@link Task#init()} * to initialize it. * * @param owner owning target * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Bind a task to another; use this when configuring a newly created task to do work on behalf of another. Project, OwningTarget, TaskName, Location and Description are all copied * Important: this method does not call {@link Task#init()}. If you are creating a task to delegate work to, call {@link Task#init()} to initialize it. * @param owner owning target @since Ant1.7 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
bindToOwner	TokenNameIdentifier	 bind To Owner
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
