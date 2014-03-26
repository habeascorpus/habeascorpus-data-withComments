/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CoroutineManager.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CoroutineManager.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
/** * <p>Support the coroutine design pattern.</p> * * <p>A coroutine set is a very simple cooperative non-preemptive * multitasking model, where the switch from one task to another is * performed via an explicit request. Coroutines interact according to * the following rules:</p> * * <ul> * <li>One coroutine in the set has control, which it retains until it * either exits or resumes another coroutine.</li> * <li>A coroutine is activated when it is resumed by some other coroutine * for the first time.</li> * <li>An active coroutine that gives up control by resuming another in * the set retains its context -- including call stack and local variables * -- so that if/when it is resumed, it will proceed from the point at which * it last gave up control.</li> * </ul> * * <p>Coroutines can be thought of as falling somewhere between pipes and * subroutines. Like call/return, there is an explicit flow of control * from one coroutine to another. Like pipes, neither coroutine is * actually "in charge", and neither must exit in order to transfer * control to the other. </p> * * <p>One classic application of coroutines is in compilers, where both * the parser and the lexer are maintaining complex state * information. The parser resumes the lexer to process incoming * characters into lexical tokens, and the lexer resumes the parser * when it has reached a point at which it has a reliably interpreted * set of tokens available for semantic processing. Structuring this * as call-and-return would require saving and restoring a * considerable amount of state each time. Structuring it as two tasks * connected by a queue may involve higher overhead (in systems which * can optimize the coroutine metaphor), isn't necessarily as clear in * intent, may have trouble handling cases where data flows in both * directions, and may not handle some of the more complex cases where * more than two coroutines are involved.</p> * * <p>Most coroutine systems also provide a way to pass data between the * source and target of a resume operation; this is sometimes referred * to as "yielding" a value. Others rely on the fact that, since only * one member of a coroutine set is running at a time and does not * lose control until it chooses to do so, data structures may be * directly shared between them with only minimal precautions.</p> * * <p>"Note: This should not be taken to mean that producer/consumer * problems should be always be done with coroutines." Queueing is * often a better solution when only two threads of execution are * involved and full two-way handshaking is not required. It's a bit * difficult to find short pedagogical examples that require * coroutines for a clear solution.</p> * * <p>The fact that only one of a group of coroutines is running at a * time, and the control transfer between them is explicit, simplifies * their possible interactions, and in some implementations permits * them to be implemented more efficiently than general multitasking. * In some situations, coroutines can be compiled out entirely; * in others, they may only require a few instructions more than a * simple function call.</p> * * <p>This version is built on top of standard Java threading, since * that's all we have available right now. It's been encapsulated for * code clarity and possible future optimization.</p> * * <p>(Two possible approaches: wait-notify based and queue-based. Some * folks think that a one-item queue is a cleaner solution because it's * more abstract -- but since coroutine _is_ an abstraction I'm not really * worried about that; folks should be able to switch this code without * concern.)</p> * * <p>%TBD% THIS SHOULD BE AN INTERFACE, to facilitate building other * implementations... perhaps including a true coroutine system * someday, rather than controlled threading. Arguably Coroutine * itself should be an interface much like Runnable, but I think that * can be built on top of this.</p> * */	TokenNameCOMMENT_JAVADOC	 <p>Support the coroutine design pattern.</p> * <p>A coroutine set is a very simple cooperative non-preemptive multitasking model, where the switch from one task to another is performed via an explicit request. Coroutines interact according to the following rules:</p> * <ul> <li>One coroutine in the set has control, which it retains until it either exits or resumes another coroutine.</li> <li>A coroutine is activated when it is resumed by some other coroutine for the first time.</li> <li>An active coroutine that gives up control by resuming another in the set retains its context -- including call stack and local variables -- so that if/when it is resumed, it will proceed from the point at which it last gave up control.</li> </ul> * <p>Coroutines can be thought of as falling somewhere between pipes and subroutines. Like call/return, there is an explicit flow of control from one coroutine to another. Like pipes, neither coroutine is actually "in charge", and neither must exit in order to transfer control to the other. </p> * <p>One classic application of coroutines is in compilers, where both the parser and the lexer are maintaining complex state information. The parser resumes the lexer to process incoming characters into lexical tokens, and the lexer resumes the parser when it has reached a point at which it has a reliably interpreted set of tokens available for semantic processing. Structuring this as call-and-return would require saving and restoring a considerable amount of state each time. Structuring it as two tasks connected by a queue may involve higher overhead (in systems which can optimize the coroutine metaphor), isn't necessarily as clear in intent, may have trouble handling cases where data flows in both directions, and may not handle some of the more complex cases where more than two coroutines are involved.</p> * <p>Most coroutine systems also provide a way to pass data between the source and target of a resume operation; this is sometimes referred to as "yielding" a value. Others rely on the fact that, since only one member of a coroutine set is running at a time and does not lose control until it chooses to do so, data structures may be directly shared between them with only minimal precautions.</p> * <p>"Note: This should not be taken to mean that producer/consumer problems should be always be done with coroutines." Queueing is often a better solution when only two threads of execution are involved and full two-way handshaking is not required. It's a bit difficult to find short pedagogical examples that require coroutines for a clear solution.</p> * <p>The fact that only one of a group of coroutines is running at a time, and the control transfer between them is explicit, simplifies their possible interactions, and in some implementations permits them to be implemented more efficiently than general multitasking. In some situations, coroutines can be compiled out entirely; in others, they may only require a few instructions more than a simple function call.</p> * <p>This version is built on top of standard Java threading, since that's all we have available right now. It's been encapsulated for code clarity and possible future optimization.</p> * <p>(Two possible approaches: wait-notify based and queue-based. Some folks think that a one-item queue is a cleaner solution because it's more abstract -- but since coroutine _is_ an abstraction I'm not really worried about that; folks should be able to switch this code without concern.)</p> * <p>%TBD% THIS SHOULD BE AN INTERFACE, to facilitate building other implementations... perhaps including a true coroutine system someday, rather than controlled threading. Arguably Coroutine itself should be an interface much like Runnable, but I think that can be built on top of this.</p> 
public	TokenNamepublic	
class	TokenNameclass	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
{	TokenNameLBRACE	
/** "Is this coroutine ID number already in use" lookup table. * Currently implemented as a bitset as a compromise between * compactness and speed of access, but obviously other solutions * could be applied. * */	TokenNameCOMMENT_JAVADOC	 "Is this coroutine ID number already in use" lookup table. Currently implemented as a bitset as a compromise between compactness and speed of access, but obviously other solutions could be applied. 
BitSet	TokenNameIdentifier	 Bit Set
m_activeIDs	TokenNameIdentifier	 m active I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Limit on the coroutine ID numbers accepted. I didn't want the * in-use table to grow without bound. If we switch to a more efficient * sparse-array mechanism, it may be possible to raise or eliminate * this boundary. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Limit on the coroutine ID numbers accepted. I didn't want the in-use table to grow without bound. If we switch to a more efficient sparse-array mechanism, it may be possible to raise or eliminate this boundary. @xsl.usage internal 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
m_unreasonableId	TokenNameIdentifier	 m unreasonable Id
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Internal field used to hold the data being explicitly passed * from one coroutine to another during a co_resume() operation. * (Of course implicit data sharing may also occur; one of the reasons * for using coroutines is that you're guaranteed that none of the * other coroutines in your set are using shared structures at the time * you access them.) * * %REVIEW% It's been proposed that we be able to pass types of data * other than Object -- more specific object types, or * lighter-weight primitives. This would seem to create a potential * explosion of "pass x recieve y back" methods (or require * fracturing resume into two calls, resume-other and * wait-to-be-resumed), and the weight issue could be managed by * reusing a mutable buffer object to contain the primitive * (remember that only one coroutine runs at a time, so once the * buffer's set it won't be walked on). Typechecking objects is * interesting from a code-robustness point of view, but it's * unclear whether it makes sense to encapsulate that in the * coroutine code or let the callers do it, since it depends on RTTI * either way. Restricting the parameters to objects implementing a * specific CoroutineParameter interface does _not_ seem to be a net * win; applications can do so if they want via front-end code, but * there seem to be too many use cases involving passing an existing * object type that you may not have the freedom to alter and may * not want to spend time wrapping another object around. * */	TokenNameCOMMENT_JAVADOC	 Internal field used to hold the data being explicitly passed from one coroutine to another during a co_resume() operation. (Of course implicit data sharing may also occur; one of the reasons for using coroutines is that you're guaranteed that none of the other coroutines in your set are using shared structures at the time you access them.) * %REVIEW% It's been proposed that we be able to pass types of data other than Object -- more specific object types, or lighter-weight primitives. This would seem to create a potential explosion of "pass x recieve y back" methods (or require fracturing resume into two calls, resume-other and wait-to-be-resumed), and the weight issue could be managed by reusing a mutable buffer object to contain the primitive (remember that only one coroutine runs at a time, so once the buffer's set it won't be walked on). Typechecking objects is interesting from a code-robustness point of view, but it's unclear whether it makes sense to encapsulate that in the coroutine code or let the callers do it, since it depends on RTTI either way. Restricting the parameters to objects implementing a specific CoroutineParameter interface does _not_ seem to be a net win; applications can do so if they want via front-end code, but there seem to be too many use cases involving passing an existing object type that you may not have the freedom to alter and may not want to spend time wrapping another object around. 
Object	TokenNameIdentifier	 Object
m_yield	TokenNameIdentifier	 m yield
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Expose??? 	TokenNameCOMMENT_LINE	Expose??? 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NOBODY	TokenNameIdentifier	 NOBODY
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ANYBODY	TokenNameIdentifier	 ANYBODY
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Internal field used to confirm that the coroutine now waking up is * in fact the one we intended to resume. Some such selection mechanism * is needed when more that two coroutines are operating within the same * group. */	TokenNameCOMMENT_JAVADOC	 Internal field used to confirm that the coroutine now waking up is in fact the one we intended to resume. Some such selection mechanism is needed when more that two coroutines are operating within the same group. 
int	TokenNameint	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
=	TokenNameEQUAL	
NOBODY	TokenNameIdentifier	 NOBODY
;	TokenNameSEMICOLON	
/** <p>Each coroutine in the set managed by a single * CoroutineManager is identified by a small positive integer. This * brings up the question of how to manage those integers to avoid * reuse... since if two coroutines use the same ID number, resuming * that ID could resume either. I can see arguments for either * allowing applications to select their own numbers (they may want * to declare mnemonics via manefest constants) or generating * numbers on demand. This routine's intended to support both * approaches.</p> * * <p>%REVIEW% We could use an object as the identifier. Not sure * it's a net gain, though it would allow the thread to be its own * ID. Ponder.</p> * * @param coroutineID If >=0, requests that we reserve this number. * If <0, requests that we find, reserve, and return an available ID * number. * * @return If >=0, the ID number to be used by this coroutine. If <0, * an error occurred -- the ID requested was already in use, or we * couldn't assign one without going over the "unreasonable value" mark * */	TokenNameCOMMENT_JAVADOC	 <p>Each coroutine in the set managed by a single CoroutineManager is identified by a small positive integer. This brings up the question of how to manage those integers to avoid reuse... since if two coroutines use the same ID number, resuming that ID could resume either. I can see arguments for either allowing applications to select their own numbers (they may want to declare mnemonics via manefest constants) or generating numbers on demand. This routine's intended to support both approaches.</p> * <p>%REVIEW% We could use an object as the identifier. Not sure it's a net gain, though it would allow the thread to be its own ID. Ponder.</p> * @param coroutineID If >=0, requests that we reserve this number. If <0, requests that we find, reserve, and return an available ID number. * @return If >=0, the ID number to be used by this coroutine. If <0, an error occurred -- the ID requested was already in use, or we couldn't assign one without going over the "unreasonable value" mark 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
co_joinCoroutineSet	TokenNameIdentifier	 co join Coroutine Set
(	TokenNameLPAREN	
int	TokenNameint	
coroutineID	TokenNameIdentifier	 coroutine ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
>=	TokenNameGREATER_EQUAL	
m_unreasonableId	TokenNameIdentifier	 m unreasonable Id
||	TokenNameOR_OR	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// What I want is "Find first clear bit". That doesn't exist. 	TokenNameCOMMENT_LINE	What I want is "Find first clear bit". That doesn't exist. 
// JDK1.2 added "find last set bit", but that doesn't help now. 	TokenNameCOMMENT_LINE	JDK1.2 added "find last set bit", but that doesn't help now. 
coroutineID	TokenNameIdentifier	 coroutine ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
<	TokenNameLESS	
m_unreasonableId	TokenNameIdentifier	 m unreasonable Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
++	TokenNamePLUS_PLUS	
coroutineID	TokenNameIdentifier	 coroutine ID
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
>=	TokenNameGREATER_EQUAL	
m_unreasonableId	TokenNameIdentifier	 m unreasonable Id
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
coroutineID	TokenNameIdentifier	 coroutine ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
coroutineID	TokenNameIdentifier	 coroutine ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** In the standard coroutine architecture, coroutines are * identified by their method names and are launched and run up to * their first yield by simply resuming them; its's presumed that * this recognizes the not-already-running case and does the right * thing. We seem to need a way to achieve that same threadsafe * run-up... eg, start the coroutine with a wait. * * %TBD% whether this makes any sense... * * @param thisCoroutine the identifier of this coroutine, so we can * recognize when we are being resumed. * @exception java.lang.NoSuchMethodException if thisCoroutine isn't * a registered member of this group. %REVIEW% whether this is the * best choice. * */	TokenNameCOMMENT_JAVADOC	 In the standard coroutine architecture, coroutines are identified by their method names and are launched and run up to their first yield by simply resuming them; its's presumed that this recognizes the not-already-running case and does the right thing. We seem to need a way to achieve that same threadsafe run-up... eg, start the coroutine with a wait. * %TBD% whether this makes any sense... * @param thisCoroutine the identifier of this coroutine, so we can recognize when we are being resumed. @exception java.lang.NoSuchMethodException if thisCoroutine isn't a registered member of this group. %REVIEW% whether this is the best choice. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
co_entry_pause	TokenNameIdentifier	 co entry pause
(	TokenNameLPAREN	
int	TokenNameint	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
!=	TokenNameNOT_EQUAL	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% -- Declare? Encapsulate? Ignore? Or 	TokenNameCOMMENT_LINE	%TBD% -- Declare? Encapsulate? Ignore? Or 
// dance widdershins about the instruction cache? 	TokenNameCOMMENT_LINE	dance widdershins about the instruction cache? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_yield	TokenNameIdentifier	 m yield
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Transfer control to another coroutine which has already been started and * is waiting on this CoroutineManager. We won't return from this call * until that routine has relinquished control. * * %TBD% What should we do if toCoroutine isn't registered? Exception? * * @param arg_object A value to be passed to the other coroutine. * @param thisCoroutine Integer identifier for this coroutine. This is the * ID we watch for to see if we're the ones being resumed. * @param toCoroutine Integer identifier for the coroutine we wish to * invoke. * @exception java.lang.NoSuchMethodException if toCoroutine isn't a * registered member of this group. %REVIEW% whether this is the best choice. * */	TokenNameCOMMENT_JAVADOC	 Transfer control to another coroutine which has already been started and is waiting on this CoroutineManager. We won't return from this call until that routine has relinquished control. * %TBD% What should we do if toCoroutine isn't registered? Exception? * @param arg_object A value to be passed to the other coroutine. @param thisCoroutine Integer identifier for this coroutine. This is the ID we watch for to see if we're the ones being resumed. @param toCoroutine Integer identifier for the coroutine we wish to invoke. @exception java.lang.NoSuchMethodException if toCoroutine isn't a registered member of this group. %REVIEW% whether this is the best choice. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
co_resume	TokenNameIdentifier	 co resume
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg_object	TokenNameIdentifier	 arg object
,	TokenNameCOMMA	
int	TokenNameint	
thisCoroutine	TokenNameIdentifier	 this Coroutine
,	TokenNameCOMMA	
int	TokenNameint	
toCoroutine	TokenNameIdentifier	 to Coroutine
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
toCoroutine	TokenNameIdentifier	 to Coroutine
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier	 ER  COROUTINE  NOT  AVAIL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
toCoroutine	TokenNameIdentifier	 to Coroutine
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Coroutine not available, id="+toCoroutine); 	TokenNameCOMMENT_LINE	"Coroutine not available, id="+toCoroutine); 
// We expect these values to be overwritten during the notify()/wait() 	TokenNameCOMMENT_LINE	We expect these values to be overwritten during the notify()/wait() 
// periods, as other coroutines in this set get their opportunity to run. 	TokenNameCOMMENT_LINE	periods, as other coroutines in this set get their opportunity to run. 
m_yield	TokenNameIdentifier	 m yield
=	TokenNameEQUAL	
arg_object	TokenNameIdentifier	 arg object
;	TokenNameSEMICOLON	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
=	TokenNameEQUAL	
toCoroutine	TokenNameIdentifier	 to Coroutine
;	TokenNameSEMICOLON	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
!=	TokenNameNOT_EQUAL	
thisCoroutine	TokenNameIdentifier	 this Coroutine
||	TokenNameOR_OR	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
==	TokenNameEQUAL_EQUAL	
ANYBODY	TokenNameIdentifier	 ANYBODY
||	TokenNameOR_OR	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
==	TokenNameEQUAL_EQUAL	
NOBODY	TokenNameIdentifier	 NOBODY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// System.out.println("waiting..."); 	TokenNameCOMMENT_LINE	System.out.println("waiting..."); 
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% -- Declare? Encapsulate? Ignore? Or 	TokenNameCOMMENT_LINE	%TBD% -- Declare? Encapsulate? Ignore? Or 
// dance deasil about the program counter? 	TokenNameCOMMENT_LINE	dance deasil about the program counter? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
==	TokenNameEQUAL_EQUAL	
NOBODY	TokenNameIdentifier	 NOBODY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Pass it along 	TokenNameCOMMENT_LINE	Pass it along 
co_exit	TokenNameIdentifier	 co exit
(	TokenNameLPAREN	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// And inform this coroutine that its partners are Going Away 	TokenNameCOMMENT_LINE	And inform this coroutine that its partners are Going Away 
// %REVIEW% Should this throw/return something more useful? 	TokenNameCOMMENT_LINE	%REVIEW% Should this throw/return something more useful? 
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_COROUTINE_CO_EXIT	TokenNameIdentifier	 ER  COROUTINE  CO  EXIT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"CoroutineManager recieved co_exit() request"); 	TokenNameCOMMENT_LINE	"CoroutineManager recieved co_exit() request"); 
}	TokenNameRBRACE	
return	TokenNamereturn	
m_yield	TokenNameIdentifier	 m yield
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Terminate this entire set of coroutines. The others will be * deregistered and have exceptions thrown at them. Note that this * is intended as a panic-shutdown operation; under normal * circumstances a coroutine should always end with co_exit_to() in * order to politely inform at least one of its partners that it is * going away. * * %TBD% This may need significantly more work. * * %TBD% Should this just be co_exit_to(,,CoroutineManager.PANIC)? * * @param thisCoroutine Integer identifier for the coroutine requesting exit. * */	TokenNameCOMMENT_JAVADOC	 Terminate this entire set of coroutines. The others will be deregistered and have exceptions thrown at them. Note that this is intended as a panic-shutdown operation; under normal circumstances a coroutine should always end with co_exit_to() in order to politely inform at least one of its partners that it is going away. * %TBD% This may need significantly more work. * %TBD% Should this just be co_exit_to(,,CoroutineManager.PANIC)? * @param thisCoroutine Integer identifier for the coroutine requesting exit. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
co_exit	TokenNameIdentifier	 co exit
(	TokenNameLPAREN	
int	TokenNameint	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
=	TokenNameEQUAL	
NOBODY	TokenNameIdentifier	 NOBODY
;	TokenNameSEMICOLON	
// %REVIEW% 	TokenNameCOMMENT_LINE	%REVIEW% 
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Make the ID available for reuse and terminate this coroutine, * transferring control to the specified coroutine. Note that this * returns immediately rather than waiting for any further coroutine * traffic, so the thread can proceed with other shutdown activities. * * @param arg_object A value to be passed to the other coroutine. * @param thisCoroutine Integer identifier for the coroutine leaving the set. * @param toCoroutine Integer identifier for the coroutine we wish to * invoke. * @exception java.lang.NoSuchMethodException if toCoroutine isn't a * registered member of this group. %REVIEW% whether this is the best choice. * */	TokenNameCOMMENT_JAVADOC	 Make the ID available for reuse and terminate this coroutine, transferring control to the specified coroutine. Note that this returns immediately rather than waiting for any further coroutine traffic, so the thread can proceed with other shutdown activities. * @param arg_object A value to be passed to the other coroutine. @param thisCoroutine Integer identifier for the coroutine leaving the set. @param toCoroutine Integer identifier for the coroutine we wish to invoke. @exception java.lang.NoSuchMethodException if toCoroutine isn't a registered member of this group. %REVIEW% whether this is the best choice. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
co_exit_to	TokenNameIdentifier	 co exit to
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg_object	TokenNameIdentifier	 arg object
,	TokenNameCOMMA	
int	TokenNameint	
thisCoroutine	TokenNameIdentifier	 this Coroutine
,	TokenNameCOMMA	
int	TokenNameint	
toCoroutine	TokenNameIdentifier	 to Coroutine
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
toCoroutine	TokenNameIdentifier	 to Coroutine
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier	 ER  COROUTINE  NOT  AVAIL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
toCoroutine	TokenNameIdentifier	 to Coroutine
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Coroutine not available, id="+toCoroutine); 	TokenNameCOMMENT_LINE	"Coroutine not available, id="+toCoroutine); 
// We expect these values to be overwritten during the notify()/wait() 	TokenNameCOMMENT_LINE	We expect these values to be overwritten during the notify()/wait() 
// periods, as other coroutines in this set get their opportunity to run. 	TokenNameCOMMENT_LINE	periods, as other coroutines in this set get their opportunity to run. 
m_yield	TokenNameIdentifier	 m yield
=	TokenNameEQUAL	
arg_object	TokenNameIdentifier	 arg object
;	TokenNameSEMICOLON	
m_nextCoroutine	TokenNameIdentifier	 m next Coroutine
=	TokenNameEQUAL	
toCoroutine	TokenNameIdentifier	 to Coroutine
;	TokenNameSEMICOLON	
m_activeIDs	TokenNameIdentifier	 m active I Ds
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
thisCoroutine	TokenNameIdentifier	 this Coroutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
