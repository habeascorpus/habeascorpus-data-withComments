/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ThreadControllerWrapper.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ThreadControllerWrapper.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * A utility class that wraps the ThreadController, which is used * by IncrementalSAXSource for the incremental building of DTM. */	TokenNameCOMMENT_JAVADOC	 A utility class that wraps the ThreadController, which is used by IncrementalSAXSource for the incremental building of DTM. 
public	TokenNamepublic	
class	TokenNameclass	
ThreadControllerWrapper	TokenNameIdentifier	 Thread Controller Wrapper
{	TokenNameLBRACE	
/** The ThreadController pool */	TokenNameCOMMENT_JAVADOC	 The ThreadController pool 
private	TokenNameprivate	
static	TokenNamestatic	
ThreadController	TokenNameIdentifier	 Thread Controller
m_tpool	TokenNameIdentifier	 m tpool
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadController	TokenNameIdentifier	 Thread Controller
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Thread	TokenNameIdentifier	 Thread
runThread	TokenNameIdentifier	 run Thread
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_tpool	TokenNameIdentifier	 m tpool
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
waitThread	TokenNameIdentifier	 wait Thread
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
worker	TokenNameIdentifier	 worker
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
m_tpool	TokenNameIdentifier	 m tpool
.	TokenNameDOT	
waitThread	TokenNameIdentifier	 wait Thread
(	TokenNameLPAREN	
worker	TokenNameIdentifier	 worker
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Thread controller utility class for incremental SAX source. Must * be overriden with a derived class to support thread pooling. * * All thread-related stuff is in this class. */	TokenNameCOMMENT_JAVADOC	 Thread controller utility class for incremental SAX source. Must be overriden with a derived class to support thread pooling. * All thread-related stuff is in this class. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ThreadController	TokenNameIdentifier	 Thread Controller
{	TokenNameLBRACE	
/** * Will get a thread from the pool, execute the task * and return the thread to the pool. * * The return value is used only to wait for completion * * * NEEDSDOC @param task * @param priority if >0 the task will run with the given priority * ( doesn't seem to be used in xalan, since it's allways the default ) * @return The thread that is running the task, can be used * to wait for completion */	TokenNameCOMMENT_JAVADOC	 Will get a thread from the pool, execute the task and return the thread to the pool. * The return value is used only to wait for completion * NEEDSDOC @param task @param priority if >0 the task will run with the given priority ( doesn't seem to be used in xalan, since it's allways the default ) @return The thread that is running the task, can be used to wait for completion 
public	TokenNamepublic	
Thread	TokenNameIdentifier	 Thread
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if( priority > 0 ) 	TokenNameCOMMENT_LINE	if( priority > 0 ) 
// t.setPriority( priority ); 	TokenNameCOMMENT_LINE	t.setPriority( priority ); 
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wait until the task is completed on the worker * thread. * * NEEDSDOC @param worker * NEEDSDOC @param task * * @throws InterruptedException */	TokenNameCOMMENT_JAVADOC	 Wait until the task is completed on the worker thread. * NEEDSDOC @param worker NEEDSDOC @param task * @throws InterruptedException 
public	TokenNamepublic	
void	TokenNamevoid	
waitThread	TokenNameIdentifier	 wait Thread
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
worker	TokenNameIdentifier	 worker
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
// This should wait until the transformThread is considered not alive. 	TokenNameCOMMENT_LINE	This should wait until the transformThread is considered not alive. 
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
