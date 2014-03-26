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
/** * This is a subclass of java.lang.Thread that includes a non-intrusive * 'halt' method. The Halt method simply sets a boolean that can be * checked periodically during expensive processing. * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: HaltingThread.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a subclass of java.lang.Thread that includes a non-intrusive 'halt' method. The Halt method simply sets a boolean that can be checked periodically during expensive processing. * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: HaltingThread.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
HaltingThread	TokenNameIdentifier	 Halting Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
/** * Boolean indicating if this thread has ever been 'halted'. */	TokenNameCOMMENT_JAVADOC	 Boolean indicating if this thread has ever been 'halted'. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
beenHalted	TokenNameIdentifier	 been Halted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
HaltingThread	TokenNameIdentifier	 Halting Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
HaltingThread	TokenNameIdentifier	 Halting Thread
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HaltingThread	TokenNameIdentifier	 Halting Thread
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HaltingThread	TokenNameIdentifier	 Halting Thread
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns true if someone has halted the thread. */	TokenNameCOMMENT_JAVADOC	 returns true if someone has halted the thread. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
beenHalted	TokenNameIdentifier	 been Halted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set's beenHalted to true. */	TokenNameCOMMENT_JAVADOC	 Set's beenHalted to true. 
public	TokenNamepublic	
void	TokenNamevoid	
halt	TokenNameIdentifier	 halt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beenHalted	TokenNameIdentifier	 been Halted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set's beenHalted to false. */	TokenNameCOMMENT_JAVADOC	 Set's beenHalted to false. 
public	TokenNamepublic	
void	TokenNamevoid	
clearHalted	TokenNameIdentifier	 clear Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beenHalted	TokenNameIdentifier	 been Halted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Calls 'halt' on <tt>Thread.currentThread()</tt> if it is an * instance of HaltingThread otherwise it does nothing. */	TokenNameCOMMENT_JAVADOC	 Calls 'halt' on <tt>Thread.currentThread()</tt> if it is an instance of HaltingThread otherwise it does nothing. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
haltThread	TokenNameIdentifier	 halt Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haltThread	TokenNameIdentifier	 halt Thread
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls 'halt' on <tt>t</tt> if it is an instance of * HaltingThread otherwise it does nothing. */	TokenNameCOMMENT_JAVADOC	 Calls 'halt' on <tt>t</tt> if it is an instance of HaltingThread otherwise it does nothing. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
haltThread	TokenNameIdentifier	 halt Thread
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
HaltingThread	TokenNameIdentifier	 Halting Thread
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
halt	TokenNameIdentifier	 halt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the result of calling hasBeenHalted on * <tt>Thread.currentThread()</tt>, if it is an instance of * HaltingThread otherwise it returns false. */	TokenNameCOMMENT_JAVADOC	 Returns the result of calling hasBeenHalted on <tt>Thread.currentThread()</tt>, if it is an instance of HaltingThread otherwise it returns false. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the result of calling hasBeenHalted on <tt>t</tt>, * if it is an instance of HaltingThread otherwise it returns false. */	TokenNameCOMMENT_JAVADOC	 Returns the result of calling hasBeenHalted on <tt>t</tt>, if it is an instance of HaltingThread otherwise it returns false. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
HaltingThread	TokenNameIdentifier	 Halting Thread
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
isHalted	TokenNameIdentifier	 is Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
