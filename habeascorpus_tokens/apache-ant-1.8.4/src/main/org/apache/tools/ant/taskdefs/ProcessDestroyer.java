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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Destroys all registered <code>Process</code>es when the VM exits. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Destroys all registered <code>Process</code>es when the VM exits. * @since Ant 1.5 
class	TokenNameclass	
ProcessDestroyer	TokenNameIdentifier	 Process Destroyer
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
THREAD_DIE_TIMEOUT	TokenNameIdentifier	 THREAD  DIE  TIMEOUT
=	TokenNameEQUAL	
20000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashSet	TokenNameIdentifier	 Hash Set
processes	TokenNameIdentifier	 processes
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// methods to register and unregister shutdown hooks 	TokenNameCOMMENT_LINE	methods to register and unregister shutdown hooks 
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
addShutdownHookMethod	TokenNameIdentifier	 add Shutdown Hook Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
removeShutdownHookMethod	TokenNameIdentifier	 remove Shutdown Hook Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProcessDestroyerImpl	TokenNameIdentifier	 Process Destroyer Impl
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// whether or not this ProcessDestroyer has been registered as a 	TokenNameCOMMENT_LINE	whether or not this ProcessDestroyer has been registered as a 
// shutdown hook 	TokenNameCOMMENT_LINE	shutdown hook 
private	TokenNameprivate	
boolean	TokenNameboolean	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// whether or not this ProcessDestroyer is currently running as 	TokenNameCOMMENT_LINE	whether or not this ProcessDestroyer is currently running as 
// shutdown hook 	TokenNameCOMMENT_LINE	shutdown hook 
private	TokenNameprivate	
boolean	TokenNameboolean	
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
ProcessDestroyerImpl	TokenNameIdentifier	 Process Destroyer Impl
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
shouldDestroy	TokenNameIdentifier	 should Destroy
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProcessDestroyerImpl	TokenNameIdentifier	 Process Destroyer Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"ProcessDestroyer Shutdown Hook"	TokenNameStringLiteral	ProcessDestroyer Shutdown Hook
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldDestroy	TokenNameIdentifier	 should Destroy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProcessDestroyer	TokenNameIdentifier	 Process Destroyer
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setShouldDestroy	TokenNameIdentifier	 set Should Destroy
(	TokenNameLPAREN	
boolean	TokenNameboolean	
shouldDestroy	TokenNameIdentifier	 should Destroy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shouldDestroy	TokenNameIdentifier	 should Destroy
=	TokenNameEQUAL	
shouldDestroy	TokenNameIdentifier	 should Destroy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructs a <code>ProcessDestroyer</code> and obtains * <code>Runtime.addShutdownHook()</code> and * <code>Runtime.removeShutdownHook()</code> through reflection. The * ProcessDestroyer manages a list of processes to be destroyed when the * VM exits. If a process is added when the list is empty, * this <code>ProcessDestroyer</code> is registered as a shutdown hook. If * removing a process results in an empty list, the * <code>ProcessDestroyer</code> is removed as a shutdown hook. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>ProcessDestroyer</code> and obtains <code>Runtime.addShutdownHook()</code> and <code>Runtime.removeShutdownHook()</code> through reflection. The ProcessDestroyer manages a list of processes to be destroyed when the VM exits. If a process is added when the list is empty, this <code>ProcessDestroyer</code> is registered as a shutdown hook. If removing a process results in an empty list, the <code>ProcessDestroyer</code> is removed as a shutdown hook. 
ProcessDestroyer	TokenNameIdentifier	 Process Destroyer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// check to see if the shutdown hook methods exists 	TokenNameCOMMENT_LINE	check to see if the shutdown hook methods exists 
// (support pre-JDK 1.3 and Non-Sun VMs) 	TokenNameCOMMENT_LINE	(support pre-JDK 1.3 and Non-Sun VMs) 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
addShutdownHookMethod	TokenNameIdentifier	 add Shutdown Hook Method
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"addShutdownHook"	TokenNameStringLiteral	addShutdownHook
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeShutdownHookMethod	TokenNameIdentifier	 remove Shutdown Hook Method
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"removeShutdownHook"	TokenNameStringLiteral	removeShutdownHook
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait to add shutdown hook as needed 	TokenNameCOMMENT_LINE	wait to add shutdown hook as needed 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it just won't be added as a shutdown hook... :( 	TokenNameCOMMENT_LINE	it just won't be added as a shutdown hook... :( 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Registers this <code>ProcessDestroyer</code> as a shutdown hook, * uses reflection to ensure pre-JDK 1.3 compatibility. */	TokenNameCOMMENT_JAVADOC	 Registers this <code>ProcessDestroyer</code> as a shutdown hook, uses reflection to ensure pre-JDK 1.3 compatibility. 
private	TokenNameprivate	
void	TokenNamevoid	
addShutdownHook	TokenNameIdentifier	 add Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addShutdownHookMethod	TokenNameIdentifier	 add Shutdown Hook Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
running	TokenNameIdentifier	 running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
=	TokenNameEQUAL	
new	TokenNamenew	
ProcessDestroyerImpl	TokenNameIdentifier	 Process Destroyer Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
{	TokenNameLBRACE	
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
addShutdownHookMethod	TokenNameIdentifier	 add Shutdown Hook Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shutdown already is in progress 	TokenNameCOMMENT_LINE	shutdown already is in progress 
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes this <code>ProcessDestroyer</code> as a shutdown hook, * uses reflection to ensure pre-JDK 1.3 compatibility */	TokenNameCOMMENT_JAVADOC	 Removes this <code>ProcessDestroyer</code> as a shutdown hook, uses reflection to ensure pre-JDK 1.3 compatibility 
private	TokenNameprivate	
void	TokenNamevoid	
removeShutdownHook	TokenNameIdentifier	 remove Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
removeShutdownHookMethod	TokenNameIdentifier	 remove Shutdown Hook Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
added	TokenNameIdentifier	 added
&&	TokenNameAND_AND	
!	TokenNameNOT	
running	TokenNameIdentifier	 running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
{	TokenNameLBRACE	
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Boolean	TokenNameIdentifier	 Boolean
removed	TokenNameIdentifier	 removed
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
removeShutdownHookMethod	TokenNameIdentifier	 remove Shutdown Hook Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
removed	TokenNameIdentifier	 removed
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Could not remove shutdown hook"	TokenNameStringLiteral	Could not remove shutdown hook
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shutdown already is in progress 	TokenNameCOMMENT_LINE	shutdown already is in progress 
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// start the hook thread, a unstarted thread may not be 	TokenNameCOMMENT_LINE	start the hook thread, a unstarted thread may not be 
// eligible for garbage collection 	TokenNameCOMMENT_LINE	eligible for garbage collection 
// Cf.: http://developer.java.sun.com/developer/bugParade/bugs/4533087.html 	TokenNameCOMMENT_LINE	Cf.: http://developer.java.sun.com/developer/bugParade/bugs/4533087.html 
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
.	TokenNameDOT	
setShouldDestroy	TokenNameIdentifier	 set Should Destroy
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
.	TokenNameDOT	
getThreadGroup	TokenNameIdentifier	 get Thread Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDestroyed	TokenNameIdentifier	 is Destroyed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// start() would throw IllegalThreadStateException from 	TokenNameCOMMENT_LINE	start() would throw IllegalThreadStateException from 
// ThreadGroup.add if it were destroyed 	TokenNameCOMMENT_LINE	ThreadGroup.add if it were destroyed 
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this should return quickly, since it basically is a NO-OP. 	TokenNameCOMMENT_LINE	this should return quickly, since it basically is a NO-OP. 
try	TokenNametry	
{	TokenNameLBRACE	
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
THREAD_DIE_TIMEOUT	TokenNameIdentifier	 THREAD  DIE  TIMEOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the thread didn't die in time 	TokenNameCOMMENT_LINE	the thread didn't die in time 
// it should not kill any processes unexpectedly 	TokenNameCOMMENT_LINE	it should not kill any processes unexpectedly 
}	TokenNameRBRACE	
destroyProcessThread	TokenNameIdentifier	 destroy Process Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns whether or not the ProcessDestroyer is registered as * as shutdown hook * @return true if this is currently added as shutdown hook */	TokenNameCOMMENT_JAVADOC	 Returns whether or not the ProcessDestroyer is registered as as shutdown hook @return true if this is currently added as shutdown hook 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAddedAsShutdownHook	TokenNameIdentifier	 is Added As Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if the specified <code>Process</code> was * successfully added to the list of processes to destroy upon VM exit. * * @param process the process to add * @return <code>true</code> if the specified <code>Process</code> was * successfully added */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the specified <code>Process</code> was successfully added to the list of processes to destroy upon VM exit. * @param process the process to add @return <code>true</code> if the specified <code>Process</code> was successfully added 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
processes	TokenNameIdentifier	 processes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if this list is empty, register the shutdown hook 	TokenNameCOMMENT_LINE	if this list is empty, register the shutdown hook 
if	TokenNameif	
(	TokenNameLPAREN	
processes	TokenNameIdentifier	 processes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addShutdownHook	TokenNameIdentifier	 add Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
processes	TokenNameIdentifier	 processes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if the specified <code>Process</code> was * successfully removed from the list of processes to destroy upon VM exit. * * @param process the process to remove * @return <code>true</code> if the specified <code>Process</code> was * successfully removed */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the specified <code>Process</code> was successfully removed from the list of processes to destroy upon VM exit. * @param process the process to remove @return <code>true</code> if the specified <code>Process</code> was successfully removed 
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
processes	TokenNameIdentifier	 processes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
processRemoved	TokenNameIdentifier	 process Removed
=	TokenNameEQUAL	
processes	TokenNameIdentifier	 processes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
processRemoved	TokenNameIdentifier	 process Removed
&&	TokenNameAND_AND	
processes	TokenNameIdentifier	 processes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeShutdownHook	TokenNameIdentifier	 remove Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
processRemoved	TokenNameIdentifier	 process Removed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked by the VM when it is exiting. */	TokenNameCOMMENT_JAVADOC	 Invoked by the VM when it is exiting. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
processes	TokenNameIdentifier	 processes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
processes	TokenNameIdentifier	 processes
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Process	TokenNameIdentifier	 Process
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
