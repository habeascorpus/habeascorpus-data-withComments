/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
EventQueue	TokenNameIdentifier	 Event Queue
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
/** * Generic class to dispatch events in a highly reliable way. * * @author <a href="mailto:deweese@apache.org">l449433</a> * @version $Id: EventDispatcher.java 579228 2007-09-25 12:50:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 Generic class to dispatch events in a highly reliable way. * @author <a href="mailto:deweese@apache.org">l449433</a> @version $Id: EventDispatcher.java 579228 2007-09-25 12:50:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
EventDispatcher	TokenNameIdentifier	 Event Dispatcher
{	TokenNameLBRACE	
public	TokenNamepublic	
interface	TokenNameinterface	
Dispatcher	TokenNameIdentifier	 Dispatcher
{	TokenNameLBRACE	
void	TokenNamevoid	
dispatch	TokenNameIdentifier	 dispatch
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
final	TokenNamefinal	
Dispatcher	TokenNameIdentifier	 Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
evt	TokenNameIdentifier	 evt
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
useEventQueue	TokenNameIdentifier	 use Event Queue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useEventQueue	TokenNameIdentifier	 use Event Queue
&&	TokenNameAND_AND	
!	TokenNameNOT	
EventQueue	TokenNameIdentifier	 Event Queue
.	TokenNameDOT	
isDispatchThread	TokenNameIdentifier	 is Dispatch Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEvent	TokenNameIdentifier	 fire Event
(	TokenNameLPAREN	
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
listeners	TokenNameIdentifier	 listeners
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
,	TokenNameCOMMA	
useEventQueue	TokenNameIdentifier	 use Event Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
EventQueue	TokenNameIdentifier	 Event Queue
.	TokenNameDOT	
invokeAndWait	TokenNameIdentifier	 invoke And Wait
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
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
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume they will get delivered???? 	TokenNameCOMMENT_LINE	Assume they will get delivered???? 
// be nice to wait on List but how??? 	TokenNameCOMMENT_LINE	be nice to wait on List but how??? 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
retryCount	TokenNameIdentifier	 retry Count
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
retryCount	TokenNameIdentifier	 retry Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the thread has been interrupted this can 'mess up' 	TokenNameCOMMENT_LINE	If the thread has been interrupted this can 'mess up' 
// the class loader and cause this otherwise safe code to 	TokenNameCOMMENT_LINE	the class loader and cause this otherwise safe code to 
// throw errors. 	TokenNameCOMMENT_LINE	throw errors. 
try	TokenNametry	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
final	TokenNamefinal	
Dispatcher	TokenNameIdentifier	 Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThreadDeath	TokenNameIdentifier	 Thread Death
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
ll	TokenNameIdentifier	 ll
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
dispatch	TokenNameIdentifier	 dispatch
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Keep delivering messages but remember to throw later. 	TokenNameCOMMENT_LINE	Keep delivering messages but remember to throw later. 
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ThreadDeath	TokenNameIdentifier	 Thread Death
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remember to throw later. 	TokenNameCOMMENT_LINE	Remember to throw later. 
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
[	TokenNameLBRACKET	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
