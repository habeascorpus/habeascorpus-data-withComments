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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
Dispatchable	TokenNameIdentifier	 Dispatchable
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
/** * Uses introspection to "adapt" an arbitrary Bean which doesn't * itself extend Task, but still contains an execute method and optionally * a setProject method. * */	TokenNameCOMMENT_JAVADOC	 Uses introspection to "adapt" an arbitrary Bean which doesn't itself extend Task, but still contains an execute method and optionally a setProject method. 
public	TokenNamepublic	
class	TokenNameclass	
TaskAdapter	TokenNameIdentifier	 Task Adapter
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
TypeAdapter	TokenNameIdentifier	 Type Adapter
{	TokenNameLBRACE	
/** Object to act as a proxy for. */	TokenNameCOMMENT_JAVADOC	 Object to act as a proxy for. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
/** * No-arg constructor for reflection. */	TokenNameCOMMENT_JAVADOC	 No-arg constructor for reflection. 
public	TokenNamepublic	
TaskAdapter	TokenNameIdentifier	 Task Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor for given proxy. * So you could write easier code * <pre> * myTaskContainer.addTask( new TaskAdapter(myProxy) ); * </pre> * * @param proxy The object which Ant should use as task. */	TokenNameCOMMENT_JAVADOC	 Constructor for given proxy. So you could write easier code <pre> myTaskContainer.addTask( new TaskAdapter(myProxy) ); </pre> * @param proxy The object which Ant should use as task. 
public	TokenNamepublic	
TaskAdapter	TokenNameIdentifier	 Task Adapter
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether or not a class is suitable to be adapted by TaskAdapter. * If the class is of type Dispatchable, the check is not performed because * the method that will be executed will be determined only at runtime of * the actual task and not during parse time. * * This only checks conditions which are additionally required for * tasks adapted by TaskAdapter. Thus, this method should be called by * Project.checkTaskClass. * * Throws a BuildException and logs as Project.MSG_ERR for * conditions that will cause the task execution to fail. * Logs other suspicious conditions with Project.MSG_WARN. * * @param taskClass Class to test for suitability. * Must not be <code>null</code>. * @param project Project to log warnings/errors to. * Must not be <code>null</code>. * * @see Project#checkTaskClass(Class) */	TokenNameCOMMENT_JAVADOC	 Checks whether or not a class is suitable to be adapted by TaskAdapter. If the class is of type Dispatchable, the check is not performed because the method that will be executed will be determined only at runtime of the actual task and not during parse time. * This only checks conditions which are additionally required for tasks adapted by TaskAdapter. Thus, this method should be called by Project.checkTaskClass. * Throws a BuildException and logs as Project.MSG_ERR for conditions that will cause the task execution to fail. Logs other suspicious conditions with Project.MSG_WARN. * @param taskClass Class to test for suitability. Must not be <code>null</code>. @param project Project to log warnings/errors to. Must not be <code>null</code>. * @see Project#checkTaskClass(Class) 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkTaskClass	TokenNameIdentifier	 check Task Class
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
taskClass	TokenNameIdentifier	 task Class
,	TokenNameCOMMA	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Dispatchable	TokenNameIdentifier	 Dispatchable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
taskClass	TokenNameIdentifier	 task Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't have to check for interface, since then 	TokenNameCOMMENT_LINE	don't have to check for interface, since then 
// taskClass would be abstract too. 	TokenNameCOMMENT_LINE	taskClass would be abstract too. 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
executeM	TokenNameIdentifier	 execute M
=	TokenNameEQUAL	
taskClass	TokenNameIdentifier	 task Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"execute"	TokenNameStringLiteral	execute
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// don't have to check for public, since 	TokenNameCOMMENT_LINE	don't have to check for public, since 
// getMethod finds public method only. 	TokenNameCOMMENT_LINE	getMethod finds public method only. 
// don't have to check for abstract, since then 	TokenNameCOMMENT_LINE	don't have to check for abstract, since then 
// taskClass would be abstract too. 	TokenNameCOMMENT_LINE	taskClass would be abstract too. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Void	TokenNameIdentifier	 Void
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
executeM	TokenNameIdentifier	 execute M
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"return type of execute() should be "	TokenNameStringLiteral	return type of execute() should be 
+	TokenNamePLUS	
"void but was ""	TokenNameStringLiteral	void but was "
+	TokenNamePLUS	
executeM	TokenNameIdentifier	 execute M
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" in "	TokenNameStringLiteral	" in 
+	TokenNamePLUS	
taskClass	TokenNameIdentifier	 task Class
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"No public execute() in "	TokenNameStringLiteral	No public execute() in 
+	TokenNamePLUS	
taskClass	TokenNameIdentifier	 task Class
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LinkageError	TokenNameIdentifier	 Linkage Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Could not load "	TokenNameStringLiteral	Could not load 
+	TokenNamePLUS	
taskClass	TokenNameIdentifier	 task Class
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Check if the proxy class is a valid class to use * with this adapter. * The class must have a public no-arg "execute()" method. * @param proxyClass the class to check. */	TokenNameCOMMENT_JAVADOC	 Check if the proxy class is a valid class to use with this adapter. The class must have a public no-arg "execute()" method. @param proxyClass the class to check. 
public	TokenNamepublic	
void	TokenNamevoid	
checkProxyClass	TokenNameIdentifier	 check Proxy Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
proxyClass	TokenNameIdentifier	 proxy Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkTaskClass	TokenNameIdentifier	 check Task Class
(	TokenNameLPAREN	
proxyClass	TokenNameIdentifier	 proxy Class
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the proxied task. * * @exception BuildException if the project could not be set * or the method could not be executed. */	TokenNameCOMMENT_JAVADOC	 Executes the proxied task. * @exception BuildException if the project could not be set or the method could not be executed. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
setLocationM	TokenNameIdentifier	 set Location M
=	TokenNameEQUAL	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setLocation"	TokenNameStringLiteral	setLocation
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setLocationM	TokenNameIdentifier	 set Location M
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLocationM	TokenNameIdentifier	 set Location M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore this if the class being used as a task does not have 	TokenNameCOMMENT_LINE	ignore this if the class being used as a task does not have 
// a set location method. 	TokenNameCOMMENT_LINE	a set location method. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Error setting location in "	TokenNameStringLiteral	Error setting location in 
+	TokenNamePLUS	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
setProjectM	TokenNameIdentifier	 set Project M
=	TokenNameEQUAL	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setProject"	TokenNameStringLiteral	setProject
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setProjectM	TokenNameIdentifier	 set Project M
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProjectM	TokenNameIdentifier	 set Project M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore this if the class being used as a task does not have 	TokenNameCOMMENT_LINE	ignore this if the class being used as a task does not have 
// a set project method. 	TokenNameCOMMENT_LINE	a set project method. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Error setting project in "	TokenNameStringLiteral	Error setting project in 
+	TokenNamePLUS	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DispatchUtils	TokenNameIdentifier	 Dispatch Utils
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Error in "	TokenNameStringLiteral	Error in 
+	TokenNamePLUS	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the target object to proxy for. * * @param o The target object. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the target object to proxy for. * @param o The target object. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxy	TokenNameIdentifier	 proxy
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the target object being proxied. * * @return the target proxy object. */	TokenNameCOMMENT_JAVADOC	 Returns the target object being proxied. * @return the target proxy object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
