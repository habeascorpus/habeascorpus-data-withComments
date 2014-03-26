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
util	TokenNameIdentifier	 util
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
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * A worker ant executes a single task in a background thread. * After the run, any exception thrown is turned into a buildexception, which can be * rethrown, the finished attribute is set, then notifyAll() is called, * so that anyone waiting on the same notify object gets woken up. * </p> * This class is effectively a superset of * {@link org.apache.tools.ant.taskdefs.Parallel.TaskRunnable} * * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 A worker ant executes a single task in a background thread. After the run, any exception thrown is turned into a buildexception, which can be rethrown, the finished attribute is set, then notifyAll() is called, so that anyone waiting on the same notify object gets woken up. </p> This class is effectively a superset of {@link org.apache.tools.ant.taskdefs.Parallel.TaskRunnable} * @since Ant 1.8 
public	TokenNamepublic	
class	TokenNameclass	
WorkerAnt	TokenNameIdentifier	 Worker Ant
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
notify	TokenNameIdentifier	 notify
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
BuildException	TokenNameIdentifier	 Build Exception
buildException	TokenNameIdentifier	 build Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
/** * Error message if invoked with no task */	TokenNameCOMMENT_JAVADOC	 Error message if invoked with no task 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_TASK	TokenNameIdentifier	 ERROR  NO  TASK
=	TokenNameEQUAL	
"No task defined"	TokenNameStringLiteral	No task defined
;	TokenNameSEMICOLON	
/** * Create the worker. * <p/> * This does not start the thread, merely configures it. * @param task the task * @param notify what to notify */	TokenNameCOMMENT_JAVADOC	 Create the worker. <p/> This does not start the thread, merely configures it. @param task the task @param notify what to notify 
public	TokenNamepublic	
WorkerAnt	TokenNameIdentifier	 Worker Ant
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
notify	TokenNameIdentifier	 notify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
=	TokenNameEQUAL	
notify	TokenNameIdentifier	 notify
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
notify	TokenNameIdentifier	 notify
:	TokenNameCOLON	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the worker, using the worker as the notification point. * <p/> * This does not start the thread, merely configures it. * @param task the task */	TokenNameCOMMENT_JAVADOC	 Create the worker, using the worker as the notification point. <p/> This does not start the thread, merely configures it. @param task the task 
public	TokenNamepublic	
WorkerAnt	TokenNameIdentifier	 Worker Ant
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get any build exception. * This would seem to be oversynchronised, but know that Java pre-1.5 can * reorder volatile access. * The synchronized attribute is to force an ordering. * * @return the exception or null */	TokenNameCOMMENT_JAVADOC	 Get any build exception. This would seem to be oversynchronised, but know that Java pre-1.5 can reorder volatile access. The synchronized attribute is to force an ordering. * @return the exception or null 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
BuildException	TokenNameIdentifier	 Build Exception
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildException	TokenNameIdentifier	 build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whatever was thrown, which may or may not be a buildException. * Assertion: getException() instanceof BuildException <=> getBuildException()==getException() * @return the exception. */	TokenNameCOMMENT_JAVADOC	 Get whatever was thrown, which may or may not be a buildException. Assertion: getException() instanceof BuildException <=> getBuildException()==getException() @return the exception. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the task * @return the task */	TokenNameCOMMENT_JAVADOC	 Get the task @return the task 
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
/** * Query the task/thread for being finished. * This would seem to be oversynchronised, but know that Java pre-1.5 can * reorder volatile access. * The synchronized attribute is to force an ordering. * @return true if the task is finished. */	TokenNameCOMMENT_JAVADOC	 Query the task/thread for being finished. This would seem to be oversynchronised, but know that Java pre-1.5 can reorder volatile access. The synchronized attribute is to force an ordering. @return true if the task is finished. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isFinished	TokenNameIdentifier	 is Finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Block on the notify object and so wait until the thread is finished. * @param timeout timeout in milliseconds * @throws InterruptedException if the execution was interrupted */	TokenNameCOMMENT_JAVADOC	 Block on the notify object and so wait until the thread is finished. @param timeout timeout in milliseconds @throws InterruptedException if the execution was interrupted 
public	TokenNamepublic	
void	TokenNamevoid	
waitUntilFinished	TokenNameIdentifier	 wait Until Finished
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
notify	TokenNameIdentifier	 notify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
finished	TokenNameIdentifier	 finished
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notify	TokenNameIdentifier	 notify
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Raise an exception if one was caught * * @throws BuildException if one has been picked up */	TokenNameCOMMENT_JAVADOC	 Raise an exception if one was caught * @throws BuildException if one has been picked up 
public	TokenNamepublic	
void	TokenNamevoid	
rethrowAnyBuildException	TokenNameIdentifier	 rethrow Any Build Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handle a caught exception, by recording it and possibly wrapping it * in a BuildException for later rethrowing. * @param thrown what was caught earlier */	TokenNameCOMMENT_JAVADOC	 Handle a caught exception, by recording it and possibly wrapping it in a BuildException for later rethrowing. @param thrown what was caught earlier 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
caught	TokenNameIdentifier	 caught
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
thrown	TokenNameIdentifier	 thrown
;	TokenNameSEMICOLON	
buildException	TokenNameIdentifier	 build Exception
=	TokenNameEQUAL	
(	TokenNameLPAREN	
thrown	TokenNameIdentifier	 thrown
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
thrown	TokenNameIdentifier	 thrown
:	TokenNameCOLON	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the task, which is skipped if null. * When invoked again, the task is re-run. */	TokenNameCOMMENT_JAVADOC	 Run the task, which is skipped if null. When invoked again, the task is re-run. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caught	TokenNameIdentifier	 caught
(	TokenNameLPAREN	
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
notify	TokenNameIdentifier	 notify
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//reset the task. 	TokenNameCOMMENT_LINE	reset the task. 
//wake up our owner, if it is waiting 	TokenNameCOMMENT_LINE	wake up our owner, if it is waiting 
notify	TokenNameIdentifier	 notify
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
