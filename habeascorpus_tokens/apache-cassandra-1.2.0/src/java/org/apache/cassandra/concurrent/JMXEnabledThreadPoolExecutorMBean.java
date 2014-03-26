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
/** * @see org.apache.cassandra.metrics.ThreadPoolMetrics */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ThreadPoolMetrics 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
JMXEnabledThreadPoolExecutorMBean	TokenNameIdentifier	 JMX Enabled Thread Pool Executor M Bean
extends	TokenNameextends	
IExecutorMBean	TokenNameIdentifier	 I Executor M Bean
{	TokenNameLBRACE	
/** * Get the number of tasks that had blocked before being accepted (or * rejected). */	TokenNameCOMMENT_JAVADOC	 Get the number of tasks that had blocked before being accepted (or rejected). 
public	TokenNamepublic	
int	TokenNameint	
getTotalBlockedTasks	TokenNameIdentifier	 get Total Blocked Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the number of tasks currently blocked, waiting to be accepted by * the executor (because all threads are busy and the backing queue is full). */	TokenNameCOMMENT_JAVADOC	 Get the number of tasks currently blocked, waiting to be accepted by the executor (because all threads are busy and the backing queue is full). 
public	TokenNamepublic	
int	TokenNameint	
getCurrentlyBlockedTasks	TokenNameIdentifier	 get Currently Blocked Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
