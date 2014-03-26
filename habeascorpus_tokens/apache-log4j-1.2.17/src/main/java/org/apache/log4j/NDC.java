/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Dan Milstein 	TokenNameCOMMENT_LINE	Contributors: Dan Milstein 
// Ray Millard 	TokenNameCOMMENT_LINE	Ray Millard 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
/** The NDC class implements <i>nested diagnostic contexts</i> as defined by Neil Harrison in the article "Patterns for Logging Diagnostic Messages" part of the book "<i>Pattern Languages of Program Design 3</i>" edited by Martin et al. <p>A Nested Diagnostic Context, or NDC in short, is an instrument to distinguish interleaved log output from different sources. Log output is typically interleaved when a server handles multiple clients near-simultaneously. <p>Interleaved log output can still be meaningful if each log entry from different contexts had a distinctive stamp. This is where NDCs come into play. <p><em><b>Note that NDCs are managed on a per thread basis</b></em>. NDC operations such as {@link #push push}, {@link #pop}, {@link #clear}, {@link #getDepth} and {@link #setMaxDepth} affect the NDC of the <em>current</em> thread only. NDCs of other threads remain unaffected. <p>For example, a servlet can build a per client request NDC consisting the clients host name and other information contained in the the request. <em>Cookies</em> are another source of distinctive information. To build an NDC one uses the {@link #push push} operation. Simply put, <p><ul> <li>Contexts can be nested. <p><li>When entering a context, call <code>NDC.push</code>. As a side effect, if there is no nested diagnostic context for the current thread, this method will create it. <p><li>When leaving a context, call <code>NDC.pop</code>. <p><li><b>When exiting a thread make sure to call {@link #remove NDC.remove()}</b>. </ul> <p>There is no penalty for forgetting to match each <code>push</code> operation with a corresponding <code>pop</code>, except the obvious mismatch between the real application context and the context set in the NDC. <p>If configured to do so, {@link PatternLayout} and {@link TTCCLayout} instances automatically retrieve the nested diagnostic context for the current thread without any user intervention. Hence, even if a servlet is serving multiple clients simultaneously, the logs emanating from the same code (belonging to the same category) can still be distinguished because each client request will have a different NDC tag. <p>Heavy duty systems should call the {@link #remove} method when leaving the run method of a thread. This ensures that the memory used by the thread can be freed by the Java garbage collector. There is a mechanism to lazily remove references to dead threads. In practice, this means that you can be a little sloppy and sometimes forget to call {@link #remove} before exiting a thread. <p>A thread may inherit the nested diagnostic context of another (possibly parent) thread using the {@link #inherit inherit} method. A thread may obtain a copy of its NDC with the {@link #cloneStack cloneStack} method and pass the reference to any other thread, in particular to a child. @author Ceki G&uuml;lc&uuml; @since 0.7.0 */	TokenNameCOMMENT_JAVADOC	 The NDC class implements <i>nested diagnostic contexts</i> as defined by Neil Harrison in the article "Patterns for Logging Diagnostic Messages" part of the book "<i>Pattern Languages of Program Design 3</i>" edited by Martin et al. <p>A Nested Diagnostic Context, or NDC in short, is an instrument to distinguish interleaved log output from different sources. Log output is typically interleaved when a server handles multiple clients near-simultaneously. <p>Interleaved log output can still be meaningful if each log entry from different contexts had a distinctive stamp. This is where NDCs come into play. <p><em><b>Note that NDCs are managed on a per thread basis</b></em>. NDC operations such as {@link #push push}, {@link #pop}, {@link #clear}, {@link #getDepth} and {@link #setMaxDepth} affect the NDC of the <em>current</em> thread only. NDCs of other threads remain unaffected. <p>For example, a servlet can build a per client request NDC consisting the clients host name and other information contained in the the request. <em>Cookies</em> are another source of distinctive information. To build an NDC one uses the {@link #push push} operation. Simply put, <p><ul> <li>Contexts can be nested. <p><li>When entering a context, call <code>NDC.push</code>. As a side effect, if there is no nested diagnostic context for the current thread, this method will create it. <p><li>When leaving a context, call <code>NDC.pop</code>. <p><li><b>When exiting a thread make sure to call {@link #remove NDC.remove()}</b>. </ul> <p>There is no penalty for forgetting to match each <code>push</code> operation with a corresponding <code>pop</code>, except the obvious mismatch between the real application context and the context set in the NDC. <p>If configured to do so, {@link PatternLayout} and {@link TTCCLayout} instances automatically retrieve the nested diagnostic context for the current thread without any user intervention. Hence, even if a servlet is serving multiple clients simultaneously, the logs emanating from the same code (belonging to the same category) can still be distinguished because each client request will have a different NDC tag. <p>Heavy duty systems should call the {@link #remove} method when leaving the run method of a thread. This ensures that the memory used by the thread can be freed by the Java garbage collector. There is a mechanism to lazily remove references to dead threads. In practice, this means that you can be a little sloppy and sometimes forget to call {@link #remove} before exiting a thread. <p>A thread may inherit the nested diagnostic context of another (possibly parent) thread using the {@link #inherit inherit} method. A thread may obtain a copy of its NDC with the {@link #cloneStack cloneStack} method and pass the reference to any other thread, in particular to a child. @author Ceki G&uuml;lc&uuml; @since 0.7.0 
public	TokenNamepublic	
class	TokenNameclass	
NDC	TokenNameIdentifier	 NDC
{	TokenNameLBRACE	
// The synchronized keyword is not used in this class. This may seem 	TokenNameCOMMENT_LINE	The synchronized keyword is not used in this class. This may seem 
// dangerous, especially since the class will be used by 	TokenNameCOMMENT_LINE	dangerous, especially since the class will be used by 
// multiple-threads. In particular, all threads share the same 	TokenNameCOMMENT_LINE	multiple-threads. In particular, all threads share the same 
// hashtable (the "ht" variable). This is OK since java hashtables 	TokenNameCOMMENT_LINE	hashtable (the "ht" variable). This is OK since java hashtables 
// are thread safe. Same goes for Stacks. 	TokenNameCOMMENT_LINE	are thread safe. Same goes for Stacks. 
// More importantly, when inheriting diagnostic contexts the child 	TokenNameCOMMENT_LINE	More importantly, when inheriting diagnostic contexts the child 
// thread is handed a clone of the parent's NDC. It follows that 	TokenNameCOMMENT_LINE	thread is handed a clone of the parent's NDC. It follows that 
// each thread has its own NDC (i.e. stack). 	TokenNameCOMMENT_LINE	each thread has its own NDC (i.e. stack). 
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
pushCounter	TokenNameIdentifier	 push Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the number of times push has been called 	TokenNameCOMMENT_LINE	the number of times push has been called 
// after the latest call to lazyRemove 	TokenNameCOMMENT_LINE	after the latest call to lazyRemove 
// The number of times we allow push to be called before we call lazyRemove 	TokenNameCOMMENT_LINE	The number of times we allow push to be called before we call lazyRemove 
// 5 is a relatively small number. As such, lazyRemove is not called too 	TokenNameCOMMENT_LINE	5 is a relatively small number. As such, lazyRemove is not called too 
// frequently. We thus avoid the cost of creating an Enumeration too often. 	TokenNameCOMMENT_LINE	frequently. We thus avoid the cost of creating an Enumeration too often. 
// The higher this number, the longer is the avarage period for which all 	TokenNameCOMMENT_LINE	The higher this number, the longer is the avarage period for which all 
// logging calls in all threads are blocked. 	TokenNameCOMMENT_LINE	logging calls in all threads are blocked. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REAP_THRESHOLD	TokenNameIdentifier	 REAP  THRESHOLD
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// No instances allowed. 	TokenNameCOMMENT_LINE	No instances allowed. 
private	TokenNameprivate	
NDC	TokenNameIdentifier	 NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get NDC stack for current thread. * @return NDC stack for current thread. */	TokenNameCOMMENT_JAVADOC	 Get NDC stack for current thread. @return NDC stack for current thread. 
private	TokenNameprivate	
static	TokenNamestatic	
Stack	TokenNameIdentifier	 Stack
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clear any nested diagnostic information if any. This method is useful in cases where the same thread can be potentially used over and over in different unrelated contexts. <p>This method is equivalent to calling the {@link #setMaxDepth} method with a zero <code>maxDepth</code> argument. @since 0.8.4c */	TokenNameCOMMENT_JAVADOC	 Clear any nested diagnostic information if any. This method is useful in cases where the same thread can be potentially used over and over in different unrelated contexts. <p>This method is equivalent to calling the {@link #setMaxDepth} method with a zero <code>maxDepth</code> argument. @since 0.8.4c 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clone the diagnostic context for the current thread. <p>Internally a diagnostic context is represented as a stack. A given thread can supply the stack (i.e. diagnostic context) to a child thread so that the child can inherit the parent thread's diagnostic context. <p>The child thread uses the {@link #inherit inherit} method to inherit the parent's diagnostic context. @return Stack A clone of the current thread's diagnostic context. */	TokenNameCOMMENT_JAVADOC	 Clone the diagnostic context for the current thread. <p>Internally a diagnostic context is represented as a stack. A given thread can supply the stack (i.e. diagnostic context) to a child thread so that the child can inherit the parent thread's diagnostic context. <p>The child thread uses the {@link #inherit inherit} method to inherit the parent's diagnostic context. @return Stack A clone of the current thread's diagnostic context. 
public	TokenNamepublic	
static	TokenNamestatic	
Stack	TokenNameIdentifier	 Stack
cloneStack	TokenNameIdentifier	 clone Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Inherit the diagnostic context of another thread. <p>The parent thread can obtain a reference to its diagnostic context using the {@link #cloneStack} method. It should communicate this information to its child so that it may inherit the parent's diagnostic context. <p>The parent's diagnostic context is cloned before being inherited. In other words, once inherited, the two diagnostic contexts can be managed independently. <p>In java, a child thread cannot obtain a reference to its parent, unless it is directly handed the reference. Consequently, there is no client-transparent way of inheriting diagnostic contexts. Do you know any solution to this problem? @param stack The diagnostic context of the parent thread. */	TokenNameCOMMENT_JAVADOC	 Inherit the diagnostic context of another thread. <p>The parent thread can obtain a reference to its diagnostic context using the {@link #cloneStack} method. It should communicate this information to its child so that it may inherit the parent's diagnostic context. <p>The parent's diagnostic context is cloned before being inherited. In other words, once inherited, the two diagnostic contexts can be managed independently. <p>In java, a child thread cannot obtain a reference to its parent, unless it is directly handed the reference. Consequently, there is no client-transparent way of inheriting diagnostic contexts. Do you know any solution to this problem? @param stack The diagnostic context of the parent thread. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
inherit	TokenNameIdentifier	 inherit
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <font color="#FF4040"><b>Never use this method directly, use the {@link org.apache.log4j.spi.LoggingEvent#getNDC} method instead</b></font>. */	TokenNameCOMMENT_JAVADOC	 <font color="#FF4040"><b>Never use this method directly, use the {@link org.apache.log4j.spi.LoggingEvent#getNDC} method instead</b></font>. 
static	TokenNamestatic	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fullMessage	TokenNameIdentifier	 full Message
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current nesting depth of this diagnostic context. * * @see #setMaxDepth * @since 0.7.5 */	TokenNameCOMMENT_JAVADOC	 Get the current nesting depth of this diagnostic context. * @see #setMaxDepth @since 0.7.5 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
lazyRemove	TokenNameIdentifier	 lazy Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// The synchronization on ht is necessary to prevent JDK 1.2.x from 	TokenNameCOMMENT_LINE	The synchronization on ht is necessary to prevent JDK 1.2.x from 
// throwing ConcurrentModificationExceptions at us. This sucks BIG-TIME. 	TokenNameCOMMENT_LINE	throwing ConcurrentModificationExceptions at us. This sucks BIG-TIME. 
// One solution is to write our own hashtable implementation. 	TokenNameCOMMENT_LINE	One solution is to write our own hashtable implementation. 
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Avoid calling clean-up too often. 	TokenNameCOMMENT_LINE	Avoid calling clean-up too often. 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
pushCounter	TokenNameIdentifier	 push Counter
<=	TokenNameLESS_EQUAL	
REAP_THRESHOLD	TokenNameIdentifier	 REAP  THRESHOLD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// We release the lock ASAP. 	TokenNameCOMMENT_LINE	We release the lock ASAP. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushCounter	TokenNameIdentifier	 push Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// OK let's do some work. 	TokenNameCOMMENT_LINE	OK let's do some work. 
}	TokenNameRBRACE	
int	TokenNameint	
misses	TokenNameIdentifier	 misses
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We give up after 4 straigt missses. That is 4 consecutive 	TokenNameCOMMENT_LINE	We give up after 4 straigt missses. That is 4 consecutive 
// inspected threads in 'ht' that turn out to be alive. 	TokenNameCOMMENT_LINE	inspected threads in 'ht' that turn out to be alive. 
// The higher the proportion on dead threads in ht, the higher the 	TokenNameCOMMENT_LINE	The higher the proportion on dead threads in ht, the higher the 
// chances of removal. 	TokenNameCOMMENT_LINE	chances of removal. 
while	TokenNamewhile	
(	TokenNameLPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
misses	TokenNameIdentifier	 misses
<=	TokenNameLESS_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
)	TokenNameRPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
misses	TokenNameIdentifier	 misses
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
misses	TokenNameIdentifier	 misses
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// synchronized 	TokenNameCOMMENT_LINE	synchronized 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Lazy NDC removal for thread ["	TokenNameStringLiteral	Lazy NDC removal for thread [
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] ("	TokenNameStringLiteral	] (
+	TokenNamePLUS	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Clients should call this method before leaving a diagnostic context. <p>The returned value is the value that was pushed last. If no context is available, then the empty string "" is returned. @return String The innermost diagnostic context. */	TokenNameCOMMENT_JAVADOC	 Clients should call this method before leaving a diagnostic context. <p>The returned value is the value that was pushed last. If no context is available, then the empty string "" is returned. @return String The innermost diagnostic context. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Looks at the last diagnostic context at the top of this NDC without removing it. <p>The returned value is the value that was pushed last. If no context is available, then the empty string "" is returned. @return String The innermost diagnostic context. */	TokenNameCOMMENT_JAVADOC	 Looks at the last diagnostic context at the top of this NDC without removing it. <p>The returned value is the value that was pushed last. If no context is available, then the empty string "" is returned. @return String The innermost diagnostic context. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Push new diagnostic context information for the current thread. <p>The contents of the <code>message</code> parameter is determined solely by the client. @param message The new diagnostic context information. */	TokenNameCOMMENT_JAVADOC	 Push new diagnostic context information for the current thread. <p>The contents of the <code>message</code> parameter is determined solely by the client. @param message The new diagnostic context information. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
dc	TokenNameIdentifier	 dc
=	TokenNameEQUAL	
new	TokenNamenew	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
dc	TokenNameIdentifier	 dc
=	TokenNameEQUAL	
new	TokenNamenew	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
new	TokenNamenew	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Remove the diagnostic context for this thread. <p>Each thread that created a diagnostic context by calling {@link #push} should call this method before exiting. Otherwise, the memory used by the <b>thread</b> cannot be reclaimed by the VM. <p>As this is such an important problem in heavy duty systems and because it is difficult to always guarantee that the remove method is called before exiting a thread, this method has been augmented to lazily remove references to dead threads. In practice, this means that you can be a little sloppy and occasionally forget to call {@link #remove} before exiting a thread. However, you must call <code>remove</code> sometime. If you never call it, then your application is sure to run out of memory. */	TokenNameCOMMENT_JAVADOC	 Remove the diagnostic context for this thread. <p>Each thread that created a diagnostic context by calling {@link #push} should call this method before exiting. Otherwise, the memory used by the <b>thread</b> cannot be reclaimed by the VM. <p>As this is such an important problem in heavy duty systems and because it is difficult to always guarantee that the remove method is called before exiting a thread, this method has been augmented to lazily remove references to dead threads. In practice, this means that you can be a little sloppy and occasionally forget to call {@link #remove} before exiting a thread. However, you must call <code>remove</code> sometime. If you never call it, then your application is sure to run out of memory. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Lazily remove dead-thread references in ht. 	TokenNameCOMMENT_LINE	Lazily remove dead-thread references in ht. 
lazyRemove	TokenNameIdentifier	 lazy Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set maximum depth of this diagnostic context. If the current depth is smaller or equal to <code>maxDepth</code>, then no action is taken. <p>This method is a convenient alternative to multiple {@link #pop} calls. Moreover, it is often the case that at the end of complex call sequences, the depth of the NDC is unpredictable. The <code>setMaxDepth</code> method circumvents this problem. <p>For example, the combination <pre> void foo() { &nbsp; int depth = NDC.getDepth(); &nbsp; ... complex sequence of calls &nbsp; NDC.setMaxDepth(depth); } </pre> ensures that between the entry and exit of foo the depth of the diagnostic stack is conserved. @see #getDepth @since 0.7.5 */	TokenNameCOMMENT_JAVADOC	 Set maximum depth of this diagnostic context. If the current depth is smaller or equal to <code>maxDepth</code>, then no action is taken. <p>This method is a convenient alternative to multiple {@link #pop} calls. Moreover, it is often the case that at the end of complex call sequences, the depth of the NDC is unpredictable. The <code>setMaxDepth</code> method circumvents this problem. <p>For example, the combination <pre> void foo() { &nbsp; int depth = NDC.getDepth(); &nbsp; ... complex sequence of calls &nbsp; NDC.setMaxDepth(depth); } </pre> ensures that between the entry and exit of foo the depth of the diagnostic stack is conserved. @see #getDepth @since 0.7.5 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxDepth	TokenNameIdentifier	 set Max Depth
(	TokenNameLPAREN	
int	TokenNameint	
maxDepth	TokenNameIdentifier	 max Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getCurrentStack	TokenNameIdentifier	 get Current Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
maxDepth	TokenNameIdentifier	 max Depth
<	TokenNameLESS	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
maxDepth	TokenNameIdentifier	 max Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ===================================================================== 	TokenNameCOMMENT_LINE	===================================================================== 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fullMessage	TokenNameIdentifier	 full Message
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
DiagnosticContext	TokenNameIdentifier	 Diagnostic Context
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullMessage	TokenNameIdentifier	 full Message
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
fullMessage	TokenNameIdentifier	 full Message
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fullMessage	TokenNameIdentifier	 full Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
