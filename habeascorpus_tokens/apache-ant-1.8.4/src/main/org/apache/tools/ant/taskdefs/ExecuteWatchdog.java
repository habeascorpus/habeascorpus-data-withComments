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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeoutObserver	TokenNameIdentifier	 Timeout Observer
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
Watchdog	TokenNameIdentifier	 Watchdog
;	TokenNameSEMICOLON	
/** * Destroys a process running for too long. * For example: * <pre> * ExecuteWatchdog watchdog = new ExecuteWatchdog(30000); * Execute exec = new Execute(myloghandler, watchdog); * exec.setCommandLine(mycmdline); * int exitvalue = exec.execute(); * if (Execute.isFailure(exitvalue) &amp;&amp; watchdog.killedProcess()) { * // it was killed on purpose by the watchdog * } * </pre> * @see Execute * @see org.apache.tools.ant.util.Watchdog * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 Destroys a process running for too long. For example: <pre> ExecuteWatchdog watchdog = new ExecuteWatchdog(30000); Execute exec = new Execute(myloghandler, watchdog); exec.setCommandLine(mycmdline); int exitvalue = exec.execute(); if (Execute.isFailure(exitvalue) &amp;&amp; watchdog.killedProcess()) { // it was killed on purpose by the watchdog } </pre> @see Execute @see org.apache.tools.ant.util.Watchdog @since Ant 1.2 
public	TokenNamepublic	
class	TokenNameclass	
ExecuteWatchdog	TokenNameIdentifier	 Execute Watchdog
implements	TokenNameimplements	
TimeoutObserver	TokenNameIdentifier	 Timeout Observer
{	TokenNameLBRACE	
/** the process to execute and watch for duration */	TokenNameCOMMENT_JAVADOC	 the process to execute and watch for duration 
private	TokenNameprivate	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
;	TokenNameSEMICOLON	
/** say whether or not the watchdog is currently monitoring a process */	TokenNameCOMMENT_JAVADOC	 say whether or not the watchdog is currently monitoring a process 
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
watch	TokenNameIdentifier	 watch
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** exception that might be thrown during the process execution */	TokenNameCOMMENT_JAVADOC	 exception that might be thrown during the process execution 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
caught	TokenNameIdentifier	 caught
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** say whether or not the process was killed due to running overtime */	TokenNameCOMMENT_JAVADOC	 say whether or not the process was killed due to running overtime 
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
killedProcess	TokenNameIdentifier	 killed Process
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** will tell us whether timeout has occurred */	TokenNameCOMMENT_JAVADOC	 will tell us whether timeout has occurred 
private	TokenNameprivate	
Watchdog	TokenNameIdentifier	 Watchdog
watchdog	TokenNameIdentifier	 watchdog
;	TokenNameSEMICOLON	
/** * Creates a new watchdog with a given timeout. * * @param timeout the timeout for the process in milliseconds. * It must be greater than 0. */	TokenNameCOMMENT_JAVADOC	 Creates a new watchdog with a given timeout. * @param timeout the timeout for the process in milliseconds. It must be greater than 0. 
public	TokenNamepublic	
ExecuteWatchdog	TokenNameIdentifier	 Execute Watchdog
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
watchdog	TokenNameIdentifier	 watchdog
=	TokenNameEQUAL	
new	TokenNamenew	
Watchdog	TokenNameIdentifier	 Watchdog
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
addTimeoutObserver	TokenNameIdentifier	 add Timeout Observer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param timeout the timeout value to use in milliseconds. * @see #ExecuteWatchdog(long) * @deprecated since 1.5.x. * Use constructor with a long type instead. * (1.4.x compatibility) */	TokenNameCOMMENT_JAVADOC	 @param timeout the timeout value to use in milliseconds. @see #ExecuteWatchdog(long) @deprecated since 1.5.x. Use constructor with a long type instead. (1.4.x compatibility) 
public	TokenNamepublic	
ExecuteWatchdog	TokenNameIdentifier	 Execute Watchdog
(	TokenNameLPAREN	
int	TokenNameint	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Watches the given process and terminates it, if it runs for too long. * All information from the previous run are reset. * @param process the process to monitor. It cannot be <tt>null</tt> * @throws IllegalStateException if a process is still being monitored. */	TokenNameCOMMENT_JAVADOC	 Watches the given process and terminates it, if it runs for too long. All information from the previous run are reset. @param process the process to monitor. It cannot be <tt>null</tt> @throws IllegalStateException if a process is still being monitored. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"process is null."	TokenNameStringLiteral	process is null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
process	TokenNameIdentifier	 process
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Already running."	TokenNameStringLiteral	Already running.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
caught	TokenNameIdentifier	 caught
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
killedProcess	TokenNameIdentifier	 killed Process
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
watch	TokenNameIdentifier	 watch
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
;	TokenNameSEMICOLON	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stops the watcher. It will notify all threads possibly waiting * on this object. */	TokenNameCOMMENT_JAVADOC	 Stops the watcher. It will notify all threads possibly waiting on this object. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
watchdog	TokenNameIdentifier	 watchdog
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called after watchdog has finished. * This can be called in the watchdog thread * @param w the watchdog */	TokenNameCOMMENT_JAVADOC	 Called after watchdog has finished. This can be called in the watchdog thread @param w the watchdog 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
timeoutOccured	TokenNameIdentifier	 timeout Occured
(	TokenNameLPAREN	
Watchdog	TokenNameIdentifier	 Watchdog
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// We must check if the process was not stopped 	TokenNameCOMMENT_LINE	We must check if the process was not stopped 
// before being here 	TokenNameCOMMENT_LINE	before being here 
process	TokenNameIdentifier	 process
.	TokenNameDOT	
exitValue	TokenNameIdentifier	 exit Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalThreadStateException	TokenNameIdentifier	 Illegal Thread State Exception
itse	TokenNameIdentifier	 itse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the process is not terminated, if this is really 	TokenNameCOMMENT_LINE	the process is not terminated, if this is really 
// a timeout and not a manual stop then kill it. 	TokenNameCOMMENT_LINE	a timeout and not a manual stop then kill it. 
if	TokenNameif	
(	TokenNameLPAREN	
watch	TokenNameIdentifier	 watch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
killedProcess	TokenNameIdentifier	 killed Process
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caught	TokenNameIdentifier	 caught
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * reset the monitor flag and the process. */	TokenNameCOMMENT_JAVADOC	 reset the monitor flag and the process. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
watch	TokenNameIdentifier	 watch
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method will rethrow the exception that was possibly caught during * the run of the process. It will only remains valid once the process has * been terminated either by 'error', timeout or manual intervention. * Information will be discarded once a new process is ran. * @throws BuildException a wrapped exception over the one that was * silently swallowed and stored during the process run. */	TokenNameCOMMENT_JAVADOC	 This method will rethrow the exception that was possibly caught during the run of the process. It will only remains valid once the process has been terminated either by 'error', timeout or manual intervention. Information will be discarded once a new process is ran. @throws BuildException a wrapped exception over the one that was silently swallowed and stored during the process run. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
checkException	TokenNameIdentifier	 check Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
caught	TokenNameIdentifier	 caught
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Exception in ExecuteWatchdog.run: "	TokenNameStringLiteral	Exception in ExecuteWatchdog.run: 
+	TokenNamePLUS	
caught	TokenNameIdentifier	 caught
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
caught	TokenNameIdentifier	 caught
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Indicates whether or not the watchdog is still monitoring the process. * @return <tt>true</tt> if the process is still running, otherwise * <tt>false</tt>. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not the watchdog is still monitoring the process. @return <tt>true</tt> if the process is still running, otherwise <tt>false</tt>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isWatching	TokenNameIdentifier	 is Watching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
watch	TokenNameIdentifier	 watch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether the last process run was killed on timeout or not. * @return <tt>true</tt> if the process was killed otherwise * <tt>false</tt>. */	TokenNameCOMMENT_JAVADOC	 Indicates whether the last process run was killed on timeout or not. @return <tt>true</tt> if the process was killed otherwise <tt>false</tt>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
killedProcess	TokenNameIdentifier	 killed Process
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
killedProcess	TokenNameIdentifier	 killed Process
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
