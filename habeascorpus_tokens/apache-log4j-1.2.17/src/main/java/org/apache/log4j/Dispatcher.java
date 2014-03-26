/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** * Obsolete AsyncAppender dispatcher provided for compatibility only. * * @deprecated Since 1.3. */	TokenNameCOMMENT_JAVADOC	 Obsolete AsyncAppender dispatcher provided for compatibility only. * @deprecated Since 1.3. 
class	TokenNameclass	
Dispatcher	TokenNameIdentifier	 Dispatcher
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
/** * @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
private	TokenNameprivate	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
BoundedFIFO	TokenNameIdentifier	 Bounded FIFO
bf	TokenNameIdentifier	 bf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AppenderAttachableImpl	TokenNameIdentifier	 Appender Attachable Impl
aai	TokenNameIdentifier	 aai
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
AsyncAppender	TokenNameIdentifier	 Async Appender
container	TokenNameIdentifier	 container
;	TokenNameSEMICOLON	
/** * * @param bf * @param container * @deprecated */	TokenNameCOMMENT_JAVADOC	 * @param bf @param container @deprecated 
Dispatcher	TokenNameIdentifier	 Dispatcher
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
BoundedFIFO	TokenNameIdentifier	 Bounded FIFO
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
AsyncAppender	TokenNameIdentifier	 Async Appender
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
bf	TokenNameIdentifier	 bf
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
aai	TokenNameIdentifier	 aai
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
aai	TokenNameIdentifier	 aai
;	TokenNameSEMICOLON	
// It is the user's responsibility to close appenders before 	TokenNameCOMMENT_LINE	It is the user's responsibility to close appenders before 
// exiting. 	TokenNameCOMMENT_LINE	exiting. 
this	TokenNamethis	
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the dispatcher priority to lowest possible value 	TokenNameCOMMENT_LINE	set the dispatcher priority to lowest possible value 
this	TokenNamethis	
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MIN_PRIORITY	TokenNameIdentifier	 MIN  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"Dispatcher-"	TokenNameStringLiteral	Dispatcher-
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the dispatcher priority to MIN_PRIORITY plus or minus 2 	TokenNameCOMMENT_LINE	set the dispatcher priority to MIN_PRIORITY plus or minus 2 
// depending on the direction of MIN to MAX_PRIORITY. 	TokenNameCOMMENT_LINE	depending on the direction of MIN to MAX_PRIORITY. 
//+ (Thread.MAX_PRIORITY > Thread.MIN_PRIORITY ? 1 : -1)*2); 	TokenNameCOMMENT_LINE	+ (Thread.MAX_PRIORITY > Thread.MIN_PRIORITY ? 1 : -1)*2); 
}	TokenNameRBRACE	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// We have a waiting dispacther if and only if bf.length is 	TokenNameCOMMENT_LINE	We have a waiting dispacther if and only if bf.length is 
// zero. In that case, we need to give it a death kiss. 	TokenNameCOMMENT_LINE	zero. In that case, we need to give it a death kiss. 
if	TokenNameif	
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The dispatching strategy is to wait until there are events in the buffer * to process. After having processed an event, we release the monitor * (variable bf) so that new events can be placed in the buffer, instead of * keeping the monitor and processing the remaining events in the buffer. * * <p> * Other approaches might yield better results. * </p> */	TokenNameCOMMENT_JAVADOC	 The dispatching strategy is to wait until there are events in the buffer to process. After having processed an event, we release the monitor (variable bf) so that new events can be placed in the buffer, instead of keeping the monitor and processing the remaining events in the buffer. * <p> Other approaches might yield better results. </p> 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Category cat = Category.getInstance(Dispatcher.class.getName()); 	TokenNameCOMMENT_LINE	Category cat = Category.getInstance(Dispatcher.class.getName()); 
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Exit loop if interrupted but only if the the buffer is empty. 	TokenNameCOMMENT_LINE	Exit loop if interrupted but only if the the buffer is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
interrupted	TokenNameIdentifier	 interrupted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//cat.info("Exiting."); 	TokenNameCOMMENT_LINE	cat.info("Exiting."); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//LogLog.debug("Waiting for new event to dispatch."); 	TokenNameCOMMENT_LINE	LogLog.debug("Waiting for new event to dispatch."); 
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
wasFull	TokenNameIdentifier	 was Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//LogLog.debug("Notifying AsyncAppender about freed space."); 	TokenNameCOMMENT_LINE	LogLog.debug("Notifying AsyncAppender about freed space."); 
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// synchronized 	TokenNameCOMMENT_LINE	synchronized 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
aai	TokenNameIdentifier	 aai
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aai	TokenNameIdentifier	 aai
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aai	TokenNameIdentifier	 aai
.	TokenNameDOT	
appendLoopOnAppenders	TokenNameIdentifier	 append Loop On Appenders
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// while 	TokenNameCOMMENT_LINE	while 
// close and remove all appenders 	TokenNameCOMMENT_LINE	close and remove all appenders 
aai	TokenNameIdentifier	 aai
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
