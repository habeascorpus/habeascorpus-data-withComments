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
IExecutorMBean	TokenNameIdentifier	 I Executor M Bean
{	TokenNameLBRACE	
/** * Get the current number of running tasks */	TokenNameCOMMENT_JAVADOC	 Get the current number of running tasks 
public	TokenNamepublic	
int	TokenNameint	
getActiveCount	TokenNameIdentifier	 get Active Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the number of completed tasks */	TokenNameCOMMENT_JAVADOC	 Get the number of completed tasks 
public	TokenNamepublic	
long	TokenNamelong	
getCompletedTasks	TokenNameIdentifier	 get Completed Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the number of tasks waiting to be executed */	TokenNameCOMMENT_JAVADOC	 Get the number of tasks waiting to be executed 
public	TokenNamepublic	
long	TokenNamelong	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
