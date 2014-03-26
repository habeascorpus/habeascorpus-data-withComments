/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
scheduler	TokenNameIdentifier	 scheduler
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeoutException	TokenNameIdentifier	 Timeout Exception
;	TokenNameSEMICOLON	
/** * Implementors of IRequestScheduler must provide a constructor taking a RequestSchedulerOptions object. */	TokenNameCOMMENT_JAVADOC	 Implementors of IRequestScheduler must provide a constructor taking a RequestSchedulerOptions object. 
public	TokenNamepublic	
interface	TokenNameinterface	
IRequestScheduler	TokenNameIdentifier	 I Request Scheduler
{	TokenNameLBRACE	
/** * Queue incoming request threads * * @param t Thread handing the request * @param id Scheduling parameter, an id to distinguish profiles (users/keyspace) * @param timeoutMS The max time in milliseconds to spend blocking for a slot */	TokenNameCOMMENT_JAVADOC	 Queue incoming request threads * @param t Thread handing the request @param id Scheduling parameter, an id to distinguish profiles (users/keyspace) @param timeoutMS The max time in milliseconds to spend blocking for a slot 
public	TokenNamepublic	
void	TokenNamevoid	
queue	TokenNameIdentifier	 queue
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
timeoutMS	TokenNameIdentifier	 timeout MS
)	TokenNameRPAREN	
throws	TokenNamethrows	
TimeoutException	TokenNameIdentifier	 Timeout Exception
;	TokenNameSEMICOLON	
/** * A convenience method for indicating when a particular request has completed * processing, and before a return to the client */	TokenNameCOMMENT_JAVADOC	 A convenience method for indicating when a particular request has completed processing, and before a return to the client 
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
