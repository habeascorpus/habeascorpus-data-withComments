package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
eventspy	TokenNameIdentifier	 eventspy
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
AbstractExecutionListener	TokenNameIdentifier	 Abstract Execution Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
ExecutionEvent	TokenNameIdentifier	 Execution Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
ExecutionListener	TokenNameIdentifier	 Execution Listener
;	TokenNameSEMICOLON	
/** * Forwards execution events to eventspies. */	TokenNameCOMMENT_JAVADOC	 Forwards execution events to eventspies. 
class	TokenNameclass	
EventSpyExecutionListener	TokenNameIdentifier	 Event Spy Execution Listener
extends	TokenNameextends	
AbstractExecutionListener	TokenNameIdentifier	 Abstract Execution Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
EventSpyDispatcher	TokenNameIdentifier	 Event Spy Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ExecutionListener	TokenNameIdentifier	 Execution Listener
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EventSpyExecutionListener	TokenNameIdentifier	 Event Spy Execution Listener
(	TokenNameLPAREN	
EventSpyDispatcher	TokenNameIdentifier	 Event Spy Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
ExecutionListener	TokenNameIdentifier	 Execution Listener
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dispatcher	TokenNameIdentifier	 dispatcher
=	TokenNameEQUAL	
dispatcher	TokenNameIdentifier	 dispatcher
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
projectDiscoveryStarted	TokenNameIdentifier	 project Discovery Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
projectDiscoveryStarted	TokenNameIdentifier	 project Discovery Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sessionStarted	TokenNameIdentifier	 session Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
sessionStarted	TokenNameIdentifier	 session Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sessionEnded	TokenNameIdentifier	 session Ended
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
sessionEnded	TokenNameIdentifier	 session Ended
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
projectSkipped	TokenNameIdentifier	 project Skipped
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
projectSkipped	TokenNameIdentifier	 project Skipped
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
projectStarted	TokenNameIdentifier	 project Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
projectStarted	TokenNameIdentifier	 project Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
projectSucceeded	TokenNameIdentifier	 project Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
projectSucceeded	TokenNameIdentifier	 project Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
projectFailed	TokenNameIdentifier	 project Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
projectFailed	TokenNameIdentifier	 project Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forkStarted	TokenNameIdentifier	 fork Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
forkStarted	TokenNameIdentifier	 fork Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forkSucceeded	TokenNameIdentifier	 fork Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
forkSucceeded	TokenNameIdentifier	 fork Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forkFailed	TokenNameIdentifier	 fork Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
forkFailed	TokenNameIdentifier	 fork Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mojoSkipped	TokenNameIdentifier	 mojo Skipped
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
mojoSkipped	TokenNameIdentifier	 mojo Skipped
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mojoStarted	TokenNameIdentifier	 mojo Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
mojoStarted	TokenNameIdentifier	 mojo Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mojoSucceeded	TokenNameIdentifier	 mojo Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
mojoSucceeded	TokenNameIdentifier	 mojo Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mojoFailed	TokenNameIdentifier	 mojo Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
mojoFailed	TokenNameIdentifier	 mojo Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forkedProjectStarted	TokenNameIdentifier	 forked Project Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
forkedProjectStarted	TokenNameIdentifier	 forked Project Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forkedProjectSucceeded	TokenNameIdentifier	 forked Project Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
forkedProjectSucceeded	TokenNameIdentifier	 forked Project Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
forkedProjectFailed	TokenNameIdentifier	 forked Project Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
forkedProjectFailed	TokenNameIdentifier	 forked Project Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
