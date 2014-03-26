package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Executors	TokenNameIdentifier	 Executors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ThreadFactory	TokenNameIdentifier	 Thread Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
;	TokenNameSEMICOLON	
/** * A default {@link ThreadFactory} implementation that accepts the name prefix * of the created threads as a constructor argument. Otherwise, this factory * yields the same semantics as the thread factory returned by * {@link Executors#defaultThreadFactory()}. */	TokenNameCOMMENT_JAVADOC	 A default {@link ThreadFactory} implementation that accepts the name prefix of the created threads as a constructor argument. Otherwise, this factory yields the same semantics as the thread factory returned by {@link Executors#defaultThreadFactory()}. 
public	TokenNamepublic	
class	TokenNameclass	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
implements	TokenNameimplements	
ThreadFactory	TokenNameIdentifier	 Thread Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
threadPoolNumber	TokenNameIdentifier	 thread Pool Number
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadGroup	TokenNameIdentifier	 Thread Group
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
threadNumber	TokenNameIdentifier	 thread Number
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAME_PATTERN	TokenNameIdentifier	 NAME  PATTERN
=	TokenNameEQUAL	
"%s-%d-thread"	TokenNameStringLiteral	%s-%d-thread
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
threadNamePrefix	TokenNameIdentifier	 thread Name Prefix
;	TokenNameSEMICOLON	
/** * Creates a new {@link NamedThreadFactory} instance * * @param threadNamePrefix the name prefix assigned to each thread created. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link NamedThreadFactory} instance * @param threadNamePrefix the name prefix assigned to each thread created. 
public	TokenNamepublic	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
threadNamePrefix	TokenNameIdentifier	 thread Name Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SecurityManager	TokenNameIdentifier	 Security Manager
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getSecurityManager	TokenNameIdentifier	 get Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getThreadGroup	TokenNameIdentifier	 get Thread Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getThreadGroup	TokenNameIdentifier	 get Thread Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threadNamePrefix	TokenNameIdentifier	 thread Name Prefix
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
NAME_PATTERN	TokenNameIdentifier	 NAME  PATTERN
,	TokenNameCOMMA	
checkPrefix	TokenNameIdentifier	 check Prefix
(	TokenNameLPAREN	
threadNamePrefix	TokenNameIdentifier	 thread Name Prefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
threadPoolNumber	TokenNameIdentifier	 thread Pool Number
.	TokenNameDOT	
getAndIncrement	TokenNameIdentifier	 get And Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
checkPrefix	TokenNameIdentifier	 check Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"Lucene"	TokenNameStringLiteral	Lucene
:	TokenNameCOLON	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link Thread} * * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable) */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link Thread} * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable) 
public	TokenNamepublic	
Thread	TokenNameIdentifier	 Thread
newThread	TokenNameIdentifier	 new Thread
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s-%d"	TokenNameStringLiteral	%s-%d
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
threadNamePrefix	TokenNameIdentifier	 thread Name Prefix
,	TokenNameCOMMA	
threadNumber	TokenNameIdentifier	 thread Number
.	TokenNameDOT	
getAndIncrement	TokenNameIdentifier	 get And Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
NORM_PRIORITY	TokenNameIdentifier	 NORM  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
