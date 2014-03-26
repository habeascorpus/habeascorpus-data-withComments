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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Generalization of <code>ExecuteWatchdog</code> * * @since Ant 1.5 * * @see org.apache.tools.ant.taskdefs.ExecuteWatchdog * */	TokenNameCOMMENT_JAVADOC	 Generalization of <code>ExecuteWatchdog</code> * @since Ant 1.5 * @see org.apache.tools.ant.taskdefs.ExecuteWatchdog 
public	TokenNamepublic	
class	TokenNameclass	
Watchdog	TokenNameIdentifier	 Watchdog
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
observers	TokenNameIdentifier	 observers
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * marked as volatile to stop the compiler caching values or (in java1.5+, * reordering access) */	TokenNameCOMMENT_JAVADOC	 marked as volatile to stop the compiler caching values or (in java1.5+, reordering access) 
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
stopped	TokenNameIdentifier	 stopped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Error string. * {@value} */	TokenNameCOMMENT_JAVADOC	 Error string. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_INVALID_TIMEOUT	TokenNameIdentifier	 ERROR  INVALID  TIMEOUT
=	TokenNameEQUAL	
"timeout less than 1."	TokenNameStringLiteral	timeout less than 1.
;	TokenNameSEMICOLON	
/** * Constructor for Watchdog. * @param timeout the timeout to use in milliseconds (must be >= 1). */	TokenNameCOMMENT_JAVADOC	 Constructor for Watchdog. @param timeout the timeout to use in milliseconds (must be >= 1). 
public	TokenNamepublic	
Watchdog	TokenNameIdentifier	 Watchdog
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
ERROR_INVALID_TIMEOUT	TokenNameIdentifier	 ERROR  INVALID  TIMEOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a timeout observer. * @param to the timeout observer to add. */	TokenNameCOMMENT_JAVADOC	 Add a timeout observer. @param to the timeout observer to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addTimeoutObserver	TokenNameIdentifier	 add Timeout Observer
(	TokenNameLPAREN	
TimeoutObserver	TokenNameIdentifier	 Timeout Observer
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//no need to synchronize, as Vector is always synchronized 	TokenNameCOMMENT_LINE	no need to synchronize, as Vector is always synchronized 
observers	TokenNameIdentifier	 observers
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a timeout observer. * @param to the timeout observer to remove. */	TokenNameCOMMENT_JAVADOC	 Remove a timeout observer. @param to the timeout observer to remove. 
public	TokenNamepublic	
void	TokenNamevoid	
removeTimeoutObserver	TokenNameIdentifier	 remove Timeout Observer
(	TokenNameLPAREN	
TimeoutObserver	TokenNameIdentifier	 Timeout Observer
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//no need to synchronize, as Vector is always synchronized 	TokenNameCOMMENT_LINE	no need to synchronize, as Vector is always synchronized 
observers	TokenNameIdentifier	 observers
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inform the observers that a timeout has occurred. * This happens in the watchdog thread. */	TokenNameCOMMENT_JAVADOC	 Inform the observers that a timeout has occurred. This happens in the watchdog thread. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
fireTimeoutOccured	TokenNameIdentifier	 fire Timeout Occured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
observers	TokenNameIdentifier	 observers
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TimeoutObserver	TokenNameIdentifier	 Timeout Observer
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
timeoutOccured	TokenNameIdentifier	 timeout Occured
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Start the watch dog. */	TokenNameCOMMENT_JAVADOC	 Start the watch dog. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopped	TokenNameIdentifier	 stopped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"WATCHDOG"	TokenNameStringLiteral	WATCHDOG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stop the watch dog. */	TokenNameCOMMENT_JAVADOC	 Stop the watch dog. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopped	TokenNameIdentifier	 stopped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The run method of the watch dog thread. * This simply does a wait for the timeout time, and * if the stop flag has not been set when the wait has returned or * has been interrupted, the watch dog listeners are informed. */	TokenNameCOMMENT_JAVADOC	 The run method of the watch dog thread. This simply does a wait for the timeout time, and if the stop flag has not been set when the wait has returned or has been interrupted, the watch dog listeners are informed. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
until	TokenNameIdentifier	 until
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
+	TokenNamePLUS	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
stopped	TokenNameIdentifier	 stopped
&&	TokenNameAND_AND	
until	TokenNameIdentifier	 until
>	TokenNameGREATER	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
until	TokenNameIdentifier	 until
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore exception 	TokenNameCOMMENT_LINE	Ignore exception 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stopped	TokenNameIdentifier	 stopped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireTimeoutOccured	TokenNameIdentifier	 fire Timeout Occured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
