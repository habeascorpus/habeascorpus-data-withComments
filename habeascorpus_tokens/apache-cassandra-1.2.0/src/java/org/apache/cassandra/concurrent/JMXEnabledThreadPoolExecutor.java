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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
ThreadPoolMetrics	TokenNameIdentifier	 Thread Pool Metrics
;	TokenNameSEMICOLON	
/** * This is a wrapper class for the <i>ScheduledThreadPoolExecutor</i>. It provides an implementation * for the <i>afterExecute()</i> found in the <i>ThreadPoolExecutor</i> class to log any unexpected * Runtime Exceptions. */	TokenNameCOMMENT_JAVADOC	 This is a wrapper class for the <i>ScheduledThreadPoolExecutor</i>. It provides an implementation for the <i>afterExecute()</i> found in the <i>ThreadPoolExecutor</i> class to log any unexpected Runtime Exceptions. 
public	TokenNamepublic	
class	TokenNameclass	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
extends	TokenNameextends	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
implements	TokenNameimplements	
JMXEnabledThreadPoolExecutorMBean	TokenNameIdentifier	 JMX Enabled Thread Pool Executor M Bean
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mbeanName	TokenNameIdentifier	 mbean Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadPoolMetrics	TokenNameIdentifier	 Thread Pool Metrics
metrics	TokenNameIdentifier	 metrics
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
,	TokenNameCOMMA	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"internal"	TokenNameStringLiteral	internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
,	TokenNameCOMMA	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
,	TokenNameCOMMA	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
threadPoolName	TokenNameIdentifier	 thread Pool Name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"internal"	TokenNameStringLiteral	internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
int	TokenNameint	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
long	TokenNamelong	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
threadFactory	TokenNameIdentifier	 thread Factory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
threadFactory	TokenNameIdentifier	 thread Factory
,	TokenNameCOMMA	
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
int	TokenNameint	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
int	TokenNameint	
maxPoolSize	TokenNameIdentifier	 max Pool Size
,	TokenNameCOMMA	
long	TokenNamelong	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
BlockingQueue	TokenNameIdentifier	 Blocking Queue
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
threadFactory	TokenNameIdentifier	 thread Factory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
jmxPath	TokenNameIdentifier	 jmx Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
corePoolSize	TokenNameIdentifier	 core Pool Size
,	TokenNameCOMMA	
maxPoolSize	TokenNameIdentifier	 max Pool Size
,	TokenNameCOMMA	
keepAliveTime	TokenNameIdentifier	 keep Alive Time
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
workQueue	TokenNameIdentifier	 work Queue
,	TokenNameCOMMA	
threadFactory	TokenNameIdentifier	 thread Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
prestartAllCoreThreads	TokenNameIdentifier	 prestart All Core Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadPoolMetrics	TokenNameIdentifier	 Thread Pool Metrics
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
jmxPath	TokenNameIdentifier	 jmx Path
,	TokenNameCOMMA	
threadFactory	TokenNameIdentifier	 thread Factory
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MBeanServer	TokenNameIdentifier	 M Bean Server
mbs	TokenNameIdentifier	 mbs
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanName	TokenNameIdentifier	 mbean Name
=	TokenNameEQUAL	
"org.apache.cassandra."	TokenNameStringLiteral	org.apache.cassandra.
+	TokenNamePLUS	
jmxPath	TokenNameIdentifier	 jmx Path
+	TokenNamePLUS	
":type="	TokenNameStringLiteral	:type=
+	TokenNamePLUS	
threadFactory	TokenNameIdentifier	 thread Factory
.	TokenNameDOT	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mbs	TokenNameIdentifier	 mbs
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
mbeanName	TokenNameIdentifier	 mbean Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
JMXEnabledThreadPoolExecutor	TokenNameIdentifier	 JMX Enabled Thread Pool Executor
(	TokenNameLPAREN	
Stage	TokenNameIdentifier	 Stage
stage	TokenNameIdentifier	 stage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxName	TokenNameIdentifier	 get Jmx Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stage	TokenNameIdentifier	 stage
.	TokenNameDOT	
getJmxType	TokenNameIdentifier	 get Jmx Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
mbeanName	TokenNameIdentifier	 mbean Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// release metrics 	TokenNameCOMMENT_LINE	release metrics 
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// synchronized, because there is no way to access super.mainLock, which would be 	TokenNameCOMMENT_LINE	synchronized, because there is no way to access super.mainLock, which would be 
// the preferred way to make this threadsafe 	TokenNameCOMMENT_LINE	the preferred way to make this threadsafe 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isShutdown	TokenNameIdentifier	 is Shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Runnable	TokenNameIdentifier	 Runnable
>	TokenNameGREATER	
shutdownNow	TokenNameIdentifier	 shutdown Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// synchronized, because there is no way to access super.mainLock, which would be 	TokenNameCOMMENT_LINE	synchronized, because there is no way to access super.mainLock, which would be 
// the preferred way to make this threadsafe 	TokenNameCOMMENT_LINE	the preferred way to make this threadsafe 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isShutdown	TokenNameIdentifier	 is Shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
shutdownNow	TokenNameIdentifier	 shutdown Now
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of completed tasks */	TokenNameCOMMENT_JAVADOC	 Get the number of completed tasks 
public	TokenNamepublic	
long	TokenNamelong	
getCompletedTasks	TokenNameIdentifier	 get Completed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCompletedTaskCount	TokenNameIdentifier	 get Completed Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of tasks waiting to be executed */	TokenNameCOMMENT_JAVADOC	 Get the number of tasks waiting to be executed 
public	TokenNamepublic	
long	TokenNamelong	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getTaskCount	TokenNameIdentifier	 get Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getCompletedTaskCount	TokenNameIdentifier	 get Completed Task Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTotalBlockedTasks	TokenNameIdentifier	 get Total Blocked Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
totalBlocked	TokenNameIdentifier	 total Blocked
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCurrentlyBlockedTasks	TokenNameIdentifier	 get Currently Blocked Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
currentBlocked	TokenNameIdentifier	 current Blocked
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
onInitialRejection	TokenNameIdentifier	 on Initial Rejection
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
totalBlocked	TokenNameIdentifier	 total Blocked
.	TokenNameDOT	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
currentBlocked	TokenNameIdentifier	 current Blocked
.	TokenNameDOT	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
onFinalAccept	TokenNameIdentifier	 on Final Accept
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
currentBlocked	TokenNameIdentifier	 current Blocked
.	TokenNameDOT	
dec	TokenNameIdentifier	 dec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
onFinalRejection	TokenNameIdentifier	 on Final Rejection
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
currentBlocked	TokenNameIdentifier	 current Blocked
.	TokenNameDOT	
dec	TokenNameIdentifier	 dec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
