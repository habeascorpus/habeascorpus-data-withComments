/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Callable	TokenNameIdentifier	 Callable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Future	TokenNameIdentifier	 Future
;	TokenNameSEMICOLON	
/** * Like ExecutorService, but customized for batch and periodic commitlog execution. */	TokenNameCOMMENT_JAVADOC	 Like ExecutorService, but customized for batch and periodic commitlog execution. 
public	TokenNamepublic	
interface	TokenNameinterface	
ICommitLogExecutorService	TokenNameIdentifier	 I Commit Log Executor Service
{	TokenNameLBRACE	
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
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
Future	TokenNameIdentifier	 Future
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
submit	TokenNameIdentifier	 submit
(	TokenNameLPAREN	
Callable	TokenNameIdentifier	 Callable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * submits the adder for execution and blocks for it to be synced, if necessary */	TokenNameCOMMENT_JAVADOC	 submits the adder for execution and blocks for it to be synced, if necessary 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
LogRecordAdder	TokenNameIdentifier	 Log Record Adder
adder	TokenNameIdentifier	 adder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** shuts down the CommitLogExecutor in an orderly fashion */	TokenNameCOMMENT_JAVADOC	 shuts down the CommitLogExecutor in an orderly fashion 
public	TokenNamepublic	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Blocks until shutdown is complete. */	TokenNameCOMMENT_JAVADOC	 Blocks until shutdown is complete. 
public	TokenNamepublic	
void	TokenNamevoid	
awaitTermination	TokenNameIdentifier	 await Termination
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
