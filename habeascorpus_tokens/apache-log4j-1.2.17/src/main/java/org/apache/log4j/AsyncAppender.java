/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contibutors: Aaron Greenhouse <aarong@cs.cmu.edu> 	TokenNameCOMMENT_LINE	Contibutors: Aaron Greenhouse <aarong@cs.cmu.edu> 
// Thomas Tuft Muller <ttm@online.no> 	TokenNameCOMMENT_LINE	Thomas Tuft Muller <ttm@online.no> 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
AppenderAttachable	TokenNameIdentifier	 Appender Attachable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** * The AsyncAppender lets users log events asynchronously. * <p/> * <p/> * The AsyncAppender will collect the events sent to it and then dispatch them * to all the appenders that are attached to it. You can attach multiple * appenders to an AsyncAppender. * </p> * <p/> * <p/> * The AsyncAppender uses a separate thread to serve the events in its buffer. * </p> * <p/> * <b>Important note:</b> The <code>AsyncAppender</code> can only be script * configured using the {@link org.apache.log4j.xml.DOMConfigurator}. * </p> * * @author Ceki G&uuml;lc&uuml; * @author Curt Arnold * @since 0.9.1 */	TokenNameCOMMENT_JAVADOC	 The AsyncAppender lets users log events asynchronously. <p/> <p/> The AsyncAppender will collect the events sent to it and then dispatch them to all the appenders that are attached to it. You can attach multiple appenders to an AsyncAppender. </p> <p/> <p/> The AsyncAppender uses a separate thread to serve the events in its buffer. </p> <p/> <b>Important note:</b> The <code>AsyncAppender</code> can only be script configured using the {@link org.apache.log4j.xml.DOMConfigurator}. </p> * @author Ceki G&uuml;lc&uuml; @author Curt Arnold @since 0.9.1 
public	TokenNamepublic	
class	TokenNameclass	
AsyncAppender	TokenNameIdentifier	 Async Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
implements	TokenNameimplements	
AppenderAttachable	TokenNameIdentifier	 Appender Attachable
{	TokenNameLBRACE	
/** * The default buffer size is set to 128 events. */	TokenNameCOMMENT_JAVADOC	 The default buffer size is set to 128 events. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event buffer, also used as monitor to protect itself and * discardMap from simulatenous modifications. */	TokenNameCOMMENT_JAVADOC	 Event buffer, also used as monitor to protect itself and discardMap from simulatenous modifications. 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Map of DiscardSummary objects keyed by logger name. */	TokenNameCOMMENT_JAVADOC	 Map of DiscardSummary objects keyed by logger name. 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
discardMap	TokenNameIdentifier	 discard Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Buffer size. */	TokenNameCOMMENT_JAVADOC	 Buffer size. 
private	TokenNameprivate	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
;	TokenNameSEMICOLON	
/** Nested appenders. */	TokenNameCOMMENT_JAVADOC	 Nested appenders. 
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
aai	TokenNameIdentifier	 aai
;	TokenNameSEMICOLON	
/** * Nested appenders. */	TokenNameCOMMENT_JAVADOC	 Nested appenders. 
private	TokenNameprivate	
final	TokenNamefinal	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
appenders	TokenNameIdentifier	 appenders
;	TokenNameSEMICOLON	
/** * Dispatcher. */	TokenNameCOMMENT_JAVADOC	 Dispatcher. 
private	TokenNameprivate	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
dispatcher	TokenNameIdentifier	 dispatcher
;	TokenNameSEMICOLON	
/** * Should location info be included in dispatched messages. */	TokenNameCOMMENT_JAVADOC	 Should location info be included in dispatched messages. 
private	TokenNameprivate	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Does appender block when buffer is full. */	TokenNameCOMMENT_JAVADOC	 Does appender block when buffer is full. 
private	TokenNameprivate	
boolean	TokenNameboolean	
blocking	TokenNameIdentifier	 blocking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
AsyncAppender	TokenNameIdentifier	 Async Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
=	TokenNameEQUAL	
new	TokenNamenew	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// only set for compatibility 	TokenNameCOMMENT_LINE	only set for compatibility 
aai	TokenNameIdentifier	 aai
=	TokenNameEQUAL	
appenders	TokenNameIdentifier	 appenders
;	TokenNameSEMICOLON	
dispatcher	TokenNameIdentifier	 dispatcher
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
discardMap	TokenNameIdentifier	 discard Map
,	TokenNameCOMMA	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It is the user's responsibility to close appenders before 	TokenNameCOMMENT_LINE	It is the user's responsibility to close appenders before 
// exiting. 	TokenNameCOMMENT_LINE	exiting. 
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the dispatcher priority to lowest possible value 	TokenNameCOMMENT_LINE	set the dispatcher priority to lowest possible value 
// dispatcher.setPriority(Thread.MIN_PRIORITY); 	TokenNameCOMMENT_LINE	dispatcher.setPriority(Thread.MIN_PRIORITY); 
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"AsyncAppender-Dispatcher-"	TokenNameStringLiteral	AsyncAppender-Dispatcher-
+	TokenNamePLUS	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add appender. * * @param newAppender appender to add, may not be null. */	TokenNameCOMMENT_JAVADOC	 Add appender. * @param newAppender appender to add, may not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
newAppender	TokenNameIdentifier	 new Appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
newAppender	TokenNameIdentifier	 new Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// if dispatcher thread has died then 	TokenNameCOMMENT_LINE	if dispatcher thread has died then 
// append subsequent events synchronously 	TokenNameCOMMENT_LINE	append subsequent events synchronously 
// See bug 23021 	TokenNameCOMMENT_LINE	See bug 23021 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dispatcher	TokenNameIdentifier	 dispatcher
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
appendLoopOnAppenders	TokenNameIdentifier	 append Loop On Appenders
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set the NDC and thread name for the calling thread as these 	TokenNameCOMMENT_LINE	Set the NDC and thread name for the calling thread as these 
// LoggingEvent fields were not set at event creation time. 	TokenNameCOMMENT_LINE	LoggingEvent fields were not set at event creation time. 
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get a copy of this thread's MDC. 	TokenNameCOMMENT_LINE	Get a copy of this thread's MDC. 
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
previousSize	TokenNameIdentifier	 previous Size
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previousSize	TokenNameIdentifier	 previous Size
<	TokenNameLESS	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if buffer had been empty 	TokenNameCOMMENT_LINE	if buffer had been empty 
// signal all threads waiting on buffer 	TokenNameCOMMENT_LINE	signal all threads waiting on buffer 
// to check their conditions. 	TokenNameCOMMENT_LINE	to check their conditions. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
previousSize	TokenNameIdentifier	 previous Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Following code is only reachable if buffer is full 	TokenNameCOMMENT_LINE	Following code is only reachable if buffer is full 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// if blocking and thread is not already interrupted 	TokenNameCOMMENT_LINE	if blocking and thread is not already interrupted 
// and not the dispatcher then 	TokenNameCOMMENT_LINE	and not the dispatcher then 
// wait for a buffer notification 	TokenNameCOMMENT_LINE	wait for a buffer notification 
boolean	TokenNameboolean	
discard	TokenNameIdentifier	 discard
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blocking	TokenNameIdentifier	 blocking
&&	TokenNameAND_AND	
!	TokenNameNOT	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
interrupted	TokenNameIdentifier	 interrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
dispatcher	TokenNameIdentifier	 dispatcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
discard	TokenNameIdentifier	 discard
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// reset interrupt status so 	TokenNameCOMMENT_LINE	reset interrupt status so 
// calling code can see interrupt on 	TokenNameCOMMENT_LINE	calling code can see interrupt on 
// their next wait or sleep. 	TokenNameCOMMENT_LINE	their next wait or sleep. 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// if blocking is false or thread has been interrupted 	TokenNameCOMMENT_LINE	if blocking is false or thread has been interrupted 
// add event to discard map. 	TokenNameCOMMENT_LINE	add event to discard map. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
discard	TokenNameIdentifier	 discard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
loggerName	TokenNameIdentifier	 logger Name
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DiscardSummary	TokenNameIdentifier	 Discard Summary
summary	TokenNameIdentifier	 summary
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DiscardSummary	TokenNameIdentifier	 Discard Summary
)	TokenNameRPAREN	
discardMap	TokenNameIdentifier	 discard Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
loggerName	TokenNameIdentifier	 logger Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
summary	TokenNameIdentifier	 summary
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
summary	TokenNameIdentifier	 summary
=	TokenNameEQUAL	
new	TokenNamenew	
DiscardSummary	TokenNameIdentifier	 Discard Summary
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
discardMap	TokenNameIdentifier	 discard Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
loggerName	TokenNameIdentifier	 logger Name
,	TokenNameCOMMA	
summary	TokenNameIdentifier	 summary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
summary	TokenNameIdentifier	 summary
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close this <code>AsyncAppender</code> by interrupting the dispatcher * thread which will process all pending events before exiting. */	TokenNameCOMMENT_JAVADOC	 Close this <code>AsyncAppender</code> by interrupting the dispatcher thread which will process all pending events before exiting. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** * Set closed flag and notify all threads to check their conditions. * Should result in dispatcher terminating. */	TokenNameCOMMENT_JAVADOC	 Set closed flag and notify all threads to check their conditions. Should result in dispatcher terminating. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Got an InterruptedException while waiting for the "	TokenNameStringLiteral	Got an InterruptedException while waiting for the 
+	TokenNamePLUS	
"dispatcher to finish."	TokenNameStringLiteral	dispatcher to finish.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// close all attached appenders. 	TokenNameCOMMENT_LINE	close all attached appenders. 
// 	TokenNameCOMMENT_LINE	 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
instanceof	TokenNameinstanceof	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get iterator over attached appenders. * @return iterator or null if no attached appenders. */	TokenNameCOMMENT_JAVADOC	 Get iterator over attached appenders. @return iterator or null if no attached appenders. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
getAllAppenders	TokenNameIdentifier	 get All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get appender by name. * * @param name name, may not be null. * @return matching appender or null. */	TokenNameCOMMENT_JAVADOC	 Get appender by name. * @param name name, may not be null. @return matching appender or null. 
public	TokenNamepublic	
Appender	TokenNameIdentifier	 Appender
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets whether the location of the logging request call * should be captured. * * @return the current value of the <b>LocationInfo</b> option. */	TokenNameCOMMENT_JAVADOC	 Gets whether the location of the logging request call should be captured. * @return the current value of the <b>LocationInfo</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if specified appender is attached. * @param appender appender. * @return true if attached. */	TokenNameCOMMENT_JAVADOC	 Determines if specified appender is attached. @param appender appender. @return true if attached. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttached	TokenNameIdentifier	 is Attached
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
isAttached	TokenNameIdentifier	 is Attached
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes and closes all attached appenders. */	TokenNameCOMMENT_JAVADOC	 Removes and closes all attached appenders. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes an appender. * @param appender appender to remove. */	TokenNameCOMMENT_JAVADOC	 Removes an appender. @param appender appender to remove. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Remove appender by name. * @param name name. */	TokenNameCOMMENT_JAVADOC	 Remove appender by name. @param name name. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The <b>LocationInfo</b> option takes a boolean value. By default, it is * set to false which means there will be no effort to extract the location * information related to the event. As a result, the event that will be * ultimately logged will likely to contain the wrong location information * (if present in the log format). * <p/> * <p/> * Location information extraction is comparatively very slow and should be * avoided unless performance is not a concern. * </p> * @param flag true if location information should be extracted. */	TokenNameCOMMENT_JAVADOC	 The <b>LocationInfo</b> option takes a boolean value. By default, it is set to false which means there will be no effort to extract the location information related to the event. As a result, the event that will be ultimately logged will likely to contain the wrong location information (if present in the log format). <p/> <p/> Location information extraction is comparatively very slow and should be avoided unless performance is not a concern. </p> @param flag true if location information should be extracted. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of messages allowed in the event buffer * before the calling thread is blocked (if blocking is true) * or until messages are summarized and discarded. Changing * the size will not affect messages already in the buffer. * * @param size buffer size, must be positive. */	TokenNameCOMMENT_JAVADOC	 Sets the number of messages allowed in the event buffer before the calling thread is blocked (if blocking is true) or until messages are summarized and discarded. Changing the size will not affect messages already in the buffer. * @param size buffer size, must be positive. 
public	TokenNamepublic	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// log4j 1.2 would throw exception if size was negative 	TokenNameCOMMENT_LINE	log4j 1.2 would throw exception if size was negative 
// and deadlock if size was zero. 	TokenNameCOMMENT_LINE	and deadlock if size was zero. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NegativeArraySizeException	TokenNameIdentifier	 Negative Array Size Exception
(	TokenNameLPAREN	
"size"	TokenNameStringLiteral	size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// don't let size be zero. 	TokenNameCOMMENT_LINE	don't let size be zero. 
// 	TokenNameCOMMENT_LINE	 
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the current buffer size. * @return the current value of the <b>BufferSize</b> option. */	TokenNameCOMMENT_JAVADOC	 Gets the current buffer size. @return the current value of the <b>BufferSize</b> option. 
public	TokenNamepublic	
int	TokenNameint	
getBufferSize	TokenNameIdentifier	 get Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether appender should wait if there is no * space available in the event buffer or immediately return. * * @since 1.2.14 * @param value true if appender should wait until available space in buffer. */	TokenNameCOMMENT_JAVADOC	 Sets whether appender should wait if there is no space available in the event buffer or immediately return. * @since 1.2.14 @param value true if appender should wait until available space in buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
setBlocking	TokenNameIdentifier	 set Blocking
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocking	TokenNameIdentifier	 blocking
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets whether appender should block calling thread when buffer is full. * If false, messages will be counted by logger and a summary * message appended after the contents of the buffer have been appended. * * @since 1.2.14 * @return true if calling thread will be blocked when buffer is full. */	TokenNameCOMMENT_JAVADOC	 Gets whether appender should block calling thread when buffer is full. If false, messages will be counted by logger and a summary message appended after the contents of the buffer have been appended. * @since 1.2.14 @return true if calling thread will be blocked when buffer is full. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBlocking	TokenNameIdentifier	 get Blocking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blocking	TokenNameIdentifier	 blocking
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Summary of discarded logging events for a logger. */	TokenNameCOMMENT_JAVADOC	 Summary of discarded logging events for a logger. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DiscardSummary	TokenNameIdentifier	 Discard Summary
{	TokenNameLBRACE	
/** * First event of the highest severity. */	TokenNameCOMMENT_JAVADOC	 First event of the highest severity. 
private	TokenNameprivate	
LoggingEvent	TokenNameIdentifier	 Logging Event
maxEvent	TokenNameIdentifier	 max Event
;	TokenNameSEMICOLON	
/** * Total count of messages discarded. */	TokenNameCOMMENT_JAVADOC	 Total count of messages discarded. 
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Create new instance. * * @param event event, may not be null. */	TokenNameCOMMENT_JAVADOC	 Create new instance. * @param event event, may not be null. 
public	TokenNamepublic	
DiscardSummary	TokenNameIdentifier	 Discard Summary
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxEvent	TokenNameIdentifier	 max Event
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add discarded event to summary. * * @param event event, may not be null. */	TokenNameCOMMENT_JAVADOC	 Add discarded event to summary. * @param event event, may not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxEvent	TokenNameIdentifier	 max Event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxEvent	TokenNameIdentifier	 max Event
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create event with summary information. * * @return new event. */	TokenNameCOMMENT_JAVADOC	 Create event with summary information. * @return new event. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Discarded {0} messages due to full event buffer including: {1}"	TokenNameStringLiteral	Discarded {0} messages due to full event buffer including: {1}
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxEvent	TokenNameIdentifier	 max Event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"org.apache.log4j.AsyncAppender.DONT_REPORT_LOCATION"	TokenNameStringLiteral	org.apache.log4j.AsyncAppender.DONT_REPORT_LOCATION
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
maxEvent	TokenNameIdentifier	 max Event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxEvent	TokenNameIdentifier	 max Event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Event dispatcher. */	TokenNameCOMMENT_JAVADOC	 Event dispatcher. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Dispatcher	TokenNameIdentifier	 Dispatcher
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** * Parent AsyncAppender. */	TokenNameCOMMENT_JAVADOC	 Parent AsyncAppender. 
private	TokenNameprivate	
final	TokenNamefinal	
AsyncAppender	TokenNameIdentifier	 Async Appender
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * Event buffer. */	TokenNameCOMMENT_JAVADOC	 Event buffer. 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
/** * Map of DiscardSummary keyed by logger name. */	TokenNameCOMMENT_JAVADOC	 Map of DiscardSummary keyed by logger name. 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
discardMap	TokenNameIdentifier	 discard Map
;	TokenNameSEMICOLON	
/** * Wrapped appenders. */	TokenNameCOMMENT_JAVADOC	 Wrapped appenders. 
private	TokenNameprivate	
final	TokenNamefinal	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
appenders	TokenNameIdentifier	 appenders
;	TokenNameSEMICOLON	
/** * Create new instance of dispatcher. * * @param parent parent AsyncAppender, may not be null. * @param buffer event buffer, may not be null. * @param discardMap discard map, may not be null. * @param appenders appenders, may not be null. */	TokenNameCOMMENT_JAVADOC	 Create new instance of dispatcher. * @param parent parent AsyncAppender, may not be null. @param buffer event buffer, may not be null. @param discardMap discard map, may not be null. @param appenders appenders, may not be null. 
public	TokenNamepublic	
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
final	TokenNamefinal	
AsyncAppender	TokenNameIdentifier	 Async Appender
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
discardMap	TokenNameIdentifier	 discard Map
,	TokenNameCOMMA	
final	TokenNamefinal	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
appenders	TokenNameIdentifier	 appenders
=	TokenNameEQUAL	
appenders	TokenNameIdentifier	 appenders
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
discardMap	TokenNameIdentifier	 discard Map
=	TokenNameEQUAL	
discardMap	TokenNameIdentifier	 discard Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if interrupted (unlikely), end thread 	TokenNameCOMMENT_LINE	if interrupted (unlikely), end thread 
// 	TokenNameCOMMENT_LINE	 
try	TokenNametry	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// loop until the AsyncAppender is closed. 	TokenNameCOMMENT_LINE	loop until the AsyncAppender is closed. 
// 	TokenNameCOMMENT_LINE	 
while	TokenNamewhile	
(	TokenNameLPAREN	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
events	TokenNameIdentifier	 events
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// extract pending events while synchronized 	TokenNameCOMMENT_LINE	extract pending events while synchronized 
// on buffer 	TokenNameCOMMENT_LINE	on buffer 
// 	TokenNameCOMMENT_LINE	 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
!	TokenNameNOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isActive	TokenNameIdentifier	 is Active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
!	TokenNameNOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
events	TokenNameIdentifier	 events
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
+	TokenNamePLUS	
discardMap	TokenNameIdentifier	 discard Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
events	TokenNameIdentifier	 events
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// add events due to buffer overflow 	TokenNameCOMMENT_LINE	add events due to buffer overflow 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
discardMap	TokenNameIdentifier	 discard Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
events	TokenNameIdentifier	 events
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DiscardSummary	TokenNameIdentifier	 Discard Summary
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// clear buffer and discard map 	TokenNameCOMMENT_LINE	clear buffer and discard map 
// 	TokenNameCOMMENT_LINE	 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
discardMap	TokenNameIdentifier	 discard Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// allow blocked appends to continue 	TokenNameCOMMENT_LINE	allow blocked appends to continue 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// process events after lock on buffer is released. 	TokenNameCOMMENT_LINE	process events after lock on buffer is released. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
events	TokenNameIdentifier	 events
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
appenders	TokenNameIdentifier	 appenders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appenders	TokenNameIdentifier	 appenders
.	TokenNameDOT	
appendLoopOnAppenders	TokenNameIdentifier	 append Loop On Appenders
(	TokenNameLPAREN	
events	TokenNameIdentifier	 events
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
