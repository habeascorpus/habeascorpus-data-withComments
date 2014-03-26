package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** An interprocess mutex lock. * <p>Typical use might look like:<pre> * new Lock.With(directory.makeLock("my.lock")) { * public Object doBody() { * <i>... code to execute while locked ...</i> * } * }.run(); * </pre> * * @see Directory#makeLock(String) */	TokenNameCOMMENT_JAVADOC	 An interprocess mutex lock. <p>Typical use might look like:<pre> new Lock.With(directory.makeLock("my.lock")) { public Object doBody() { <i>... code to execute while locked ...</i> } }.run(); </pre> * @see Directory#makeLock(String) 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Lock	TokenNameIdentifier	 Lock
{	TokenNameLBRACE	
/** How long {@link #obtain(long)} waits, in milliseconds, * in between attempts to acquire the lock. */	TokenNameCOMMENT_JAVADOC	 How long {@link #obtain(long)} waits, in milliseconds, in between attempts to acquire the lock. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
LOCK_POLL_INTERVAL	TokenNameIdentifier	 LOCK  POLL  INTERVAL
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Pass this value to {@link #obtain(long)} to try * forever to obtain the lock. */	TokenNameCOMMENT_JAVADOC	 Pass this value to {@link #obtain(long)} to try forever to obtain the lock. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
LOCK_OBTAIN_WAIT_FOREVER	TokenNameIdentifier	 LOCK  OBTAIN  WAIT  FOREVER
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Attempts to obtain exclusive access and immediately return * upon success or failure. * @return true iff exclusive access is obtained */	TokenNameCOMMENT_JAVADOC	 Attempts to obtain exclusive access and immediately return upon success or failure. @return true iff exclusive access is obtained 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * If a lock obtain called, this failureReason may be set * with the "root cause" Exception as to why the lock was * not obtained. */	TokenNameCOMMENT_JAVADOC	 If a lock obtain called, this failureReason may be set with the "root cause" Exception as to why the lock was not obtained. 
protected	TokenNameprotected	
Throwable	TokenNameIdentifier	 Throwable
failureReason	TokenNameIdentifier	 failure Reason
;	TokenNameSEMICOLON	
/** Attempts to obtain an exclusive lock within amount of * time given. Polls once per {@link #LOCK_POLL_INTERVAL} * (currently 1000) milliseconds until lockWaitTimeout is * passed. * @param lockWaitTimeout length of time to wait in * milliseconds or {@link * #LOCK_OBTAIN_WAIT_FOREVER} to retry forever * @return true if lock was obtained * @throws LockObtainFailedException if lock wait times out * @throws IllegalArgumentException if lockWaitTimeout is * out of bounds * @throws IOException if obtain() throws IOException */	TokenNameCOMMENT_JAVADOC	 Attempts to obtain an exclusive lock within amount of time given. Polls once per {@link #LOCK_POLL_INTERVAL} (currently 1000) milliseconds until lockWaitTimeout is passed. @param lockWaitTimeout length of time to wait in milliseconds or {@link #LOCK_OBTAIN_WAIT_FOREVER} to retry forever @return true if lock was obtained @throws LockObtainFailedException if lock wait times out @throws IllegalArgumentException if lockWaitTimeout is out of bounds @throws IOException if obtain() throws IOException 
public	TokenNamepublic	
boolean	TokenNameboolean	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
long	TokenNamelong	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
)	TokenNameRPAREN	
throws	TokenNamethrows	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
failureReason	TokenNameIdentifier	 failure Reason
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
locked	TokenNameIdentifier	 locked
=	TokenNameEQUAL	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
!=	TokenNameNOT_EQUAL	
LOCK_OBTAIN_WAIT_FOREVER	TokenNameIdentifier	 LOCK  OBTAIN  WAIT  FOREVER
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"lockWaitTimeout should be LOCK_OBTAIN_WAIT_FOREVER or a non-negative number (got "	TokenNameStringLiteral	lockWaitTimeout should be LOCK_OBTAIN_WAIT_FOREVER or a non-negative number (got 
+	TokenNamePLUS	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
maxSleepCount	TokenNameIdentifier	 max Sleep Count
=	TokenNameEQUAL	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
/	TokenNameDIVIDE	
LOCK_POLL_INTERVAL	TokenNameIdentifier	 LOCK  POLL  INTERVAL
;	TokenNameSEMICOLON	
long	TokenNamelong	
sleepCount	TokenNameIdentifier	 sleep Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
locked	TokenNameIdentifier	 locked
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
!=	TokenNameNOT_EQUAL	
LOCK_OBTAIN_WAIT_FOREVER	TokenNameIdentifier	 LOCK  OBTAIN  WAIT  FOREVER
&&	TokenNameAND_AND	
sleepCount	TokenNameIdentifier	 sleep Count
++	TokenNamePLUS_PLUS	
>=	TokenNameGREATER_EQUAL	
maxSleepCount	TokenNameIdentifier	 max Sleep Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
reason	TokenNameIdentifier	 reason
=	TokenNameEQUAL	
"Lock obtain timed out: "	TokenNameStringLiteral	Lock obtain timed out: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failureReason	TokenNameIdentifier	 failure Reason
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reason	TokenNameIdentifier	 reason
+=	TokenNamePLUS_EQUAL	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
failureReason	TokenNameIdentifier	 failure Reason
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
(	TokenNameLPAREN	
reason	TokenNameIdentifier	 reason
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failureReason	TokenNameIdentifier	 failure Reason
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
failureReason	TokenNameIdentifier	 failure Reason
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
LOCK_POLL_INTERVAL	TokenNameIdentifier	 LOCK  POLL  INTERVAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
locked	TokenNameIdentifier	 locked
=	TokenNameEQUAL	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
locked	TokenNameIdentifier	 locked
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Releases exclusive access. */	TokenNameCOMMENT_JAVADOC	 Releases exclusive access. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns true if the resource is currently locked. Note that one must * still call {@link #obtain()} before using the resource. */	TokenNameCOMMENT_JAVADOC	 Returns true if the resource is currently locked. Note that one must still call {@link #obtain()} before using the resource. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isLocked	TokenNameIdentifier	 is Locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Utility class for executing code with exclusive access. */	TokenNameCOMMENT_JAVADOC	 Utility class for executing code with exclusive access. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
With	TokenNameIdentifier	 With
{	TokenNameLBRACE	
private	TokenNameprivate	
Lock	TokenNameIdentifier	 Lock
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
;	TokenNameSEMICOLON	
/** Constructs an executor that will grab the named lock. */	TokenNameCOMMENT_JAVADOC	 Constructs an executor that will grab the named lock. 
public	TokenNamepublic	
With	TokenNameIdentifier	 With
(	TokenNameLPAREN	
Lock	TokenNameIdentifier	 Lock
lock	TokenNameIdentifier	 lock
,	TokenNameCOMMA	
long	TokenNamelong	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lock	TokenNameIdentifier	 lock
=	TokenNameEQUAL	
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
=	TokenNameEQUAL	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Code to execute with exclusive access. */	TokenNameCOMMENT_JAVADOC	 Code to execute with exclusive access. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Object	TokenNameIdentifier	 Object
doBody	TokenNameIdentifier	 do Body
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Calls {@link #doBody} while <i>lock</i> is obtained. Blocks if lock * cannot be obtained immediately. Retries to obtain lock once per second * until it is obtained, or until it has tried ten times. Lock is released when * {@link #doBody} exits. * @throws LockObtainFailedException if lock could not * be obtained * @throws IOException if {@link Lock#obtain} throws IOException */	TokenNameCOMMENT_JAVADOC	 Calls {@link #doBody} while <i>lock</i> is obtained. Blocks if lock cannot be obtained immediately. Retries to obtain lock once per second until it is obtained, or until it has tried ten times. Lock is released when {@link #doBody} exits. @throws LockObtainFailedException if lock could not be obtained @throws IOException if {@link Lock#obtain} throws IOException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
locked	TokenNameIdentifier	 locked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
locked	TokenNameIdentifier	 locked
=	TokenNameEQUAL	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
lockWaitTimeout	TokenNameIdentifier	 lock Wait Timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doBody	TokenNameIdentifier	 do Body
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locked	TokenNameIdentifier	 locked
)	TokenNameRPAREN	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
