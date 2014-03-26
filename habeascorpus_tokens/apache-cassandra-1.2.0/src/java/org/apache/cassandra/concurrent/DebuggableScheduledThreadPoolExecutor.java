/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Like DebuggableThreadPoolExecutor, DebuggableScheduledThreadPoolExecutor always * logs exceptions from the tasks it is given, even if Future.get is never called elsewhere. * * DebuggableScheduledThreadPoolExecutor also catches exceptions during Task execution * so that they don't supress subsequent invocations of the task. */	TokenNameCOMMENT_JAVADOC	 Like DebuggableThreadPoolExecutor, DebuggableScheduledThreadPoolExecutor always logs exceptions from the tasks it is given, even if Future.get is never called elsewhere. * DebuggableScheduledThreadPoolExecutor also catches exceptions during Task execution so that they don't supress subsequent invocations of the task. 
public	TokenNamepublic	
class	TokenNameclass	
DebuggableScheduledThreadPoolExecutor	TokenNameIdentifier	 Debuggable Scheduled Thread Pool Executor
extends	TokenNameextends	
ScheduledThreadPoolExecutor	TokenNameIdentifier	 Scheduled Thread Pool Executor
{	TokenNameLBRACE	
public	TokenNamepublic	
DebuggableScheduledThreadPoolExecutor	TokenNameIdentifier	 Debuggable Scheduled Thread Pool Executor
(	TokenNameLPAREN	
int	TokenNameint	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DebuggableScheduledThreadPoolExecutor	TokenNameIdentifier	 Debuggable Scheduled Thread Pool Executor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
NORM_PRIORITY	TokenNameIdentifier	 NORM  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We need this as well as the wrapper for the benefit of non-repeating tasks 	TokenNameCOMMENT_LINE	We need this as well as the wrapper for the benefit of non-repeating tasks 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
afterExecute	TokenNameIdentifier	 after Execute
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
afterExecute	TokenNameIdentifier	 after Execute
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
.	TokenNameDOT	
logExceptionsAfterExecute	TokenNameIdentifier	 log Exceptions After Execute
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// override scheduling to supress exceptions that would cancel future executions 	TokenNameCOMMENT_LINE	override scheduling to supress exceptions that would cancel future executions 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ScheduledFuture	TokenNameIdentifier	 Scheduled Future
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
scheduleAtFixedRate	TokenNameIdentifier	 schedule At Fixed Rate
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
long	TokenNamelong	
initialDelay	TokenNameIdentifier	 initial Delay
,	TokenNameCOMMA	
long	TokenNamelong	
period	TokenNameIdentifier	 period
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
scheduleAtFixedRate	TokenNameIdentifier	 schedule At Fixed Rate
(	TokenNameLPAREN	
new	TokenNamenew	
UncomplainingRunnable	TokenNameIdentifier	 Uncomplaining Runnable
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
,	TokenNameCOMMA	
initialDelay	TokenNameIdentifier	 initial Delay
,	TokenNameCOMMA	
period	TokenNameIdentifier	 period
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ScheduledFuture	TokenNameIdentifier	 Scheduled Future
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
scheduleWithFixedDelay	TokenNameIdentifier	 schedule With Fixed Delay
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
long	TokenNamelong	
initialDelay	TokenNameIdentifier	 initial Delay
,	TokenNameCOMMA	
long	TokenNamelong	
delay	TokenNameIdentifier	 delay
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
scheduleWithFixedDelay	TokenNameIdentifier	 schedule With Fixed Delay
(	TokenNameLPAREN	
new	TokenNamenew	
UncomplainingRunnable	TokenNameIdentifier	 Uncomplaining Runnable
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
,	TokenNameCOMMA	
initialDelay	TokenNameIdentifier	 initial Delay
,	TokenNameCOMMA	
delay	TokenNameIdentifier	 delay
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
UncomplainingRunnable	TokenNameIdentifier	 Uncomplaining Runnable
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UncomplainingRunnable	TokenNameIdentifier	 Uncomplaining Runnable
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
runnable	TokenNameIdentifier	 runnable
=	TokenNameEQUAL	
runnable	TokenNameIdentifier	 runnable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
runnable	TokenNameIdentifier	 runnable
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
.	TokenNameDOT	
handleOrLog	TokenNameIdentifier	 handle Or Log
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
