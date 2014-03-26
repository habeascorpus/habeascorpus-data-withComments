/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ArrayBlockingQueue	TokenNameIdentifier	 Array Blocking Queue
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RequestThreadPoolExecutor	TokenNameIdentifier	 Request Thread Pool Executor
extends	TokenNameextends	
DebuggableThreadPoolExecutor	TokenNameIdentifier	 Debuggable Thread Pool Executor
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
CORE_THREAD_TIMEOUT_SEC	TokenNameIdentifier	 CORE  THREAD  TIMEOUT  SEC
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RequestThreadPoolExecutor	TokenNameIdentifier	 Request Thread Pool Executor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getNativeTransportMinThreads	TokenNameIdentifier	 get Native Transport Min Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getNativeTransportMaxThreads	TokenNameIdentifier	 get Native Transport Max Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CORE_THREAD_TIMEOUT_SEC	TokenNameIdentifier	 CORE  THREAD  TIMEOUT  SEC
,	TokenNameCOMMA	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
,	TokenNameCOMMA	
new	TokenNamenew	
ArrayBlockingQueue	TokenNameIdentifier	 Array Blocking Queue
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// Seems to help smooth latency compared to SynchronousQueue. 	TokenNameCOMMENT_LINE	Seems to help smooth latency compared to SynchronousQueue. 
new	TokenNamenew	
NamedThreadFactory	TokenNameIdentifier	 Named Thread Factory
(	TokenNameLPAREN	
"Native-Transport-Requests"	TokenNameStringLiteral	Native-Transport-Requests
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
