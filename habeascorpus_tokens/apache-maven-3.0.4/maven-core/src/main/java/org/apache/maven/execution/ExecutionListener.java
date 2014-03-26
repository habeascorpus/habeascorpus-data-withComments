package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Defines events that Maven fires during a build. <strong>Warning:</strong> This interface might be extended in future * Maven versions to support further events. Hence it is strongly recommended to derive custom listeners from * {@link AbstractExecutionListener} in order to avoid interoperability problems. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Defines events that Maven fires during a build. <strong>Warning:</strong> This interface might be extended in future Maven versions to support further events. Hence it is strongly recommended to derive custom listeners from {@link AbstractExecutionListener} in order to avoid interoperability problems. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ExecutionListener	TokenNameIdentifier	 Execution Listener
{	TokenNameLBRACE	
void	TokenNamevoid	
projectDiscoveryStarted	TokenNameIdentifier	 project Discovery Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
sessionStarted	TokenNameIdentifier	 session Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
sessionEnded	TokenNameIdentifier	 session Ended
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
projectSkipped	TokenNameIdentifier	 project Skipped
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
projectStarted	TokenNameIdentifier	 project Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
projectSucceeded	TokenNameIdentifier	 project Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
projectFailed	TokenNameIdentifier	 project Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
mojoSkipped	TokenNameIdentifier	 mojo Skipped
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
mojoStarted	TokenNameIdentifier	 mojo Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
mojoSucceeded	TokenNameIdentifier	 mojo Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
mojoFailed	TokenNameIdentifier	 mojo Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
forkStarted	TokenNameIdentifier	 fork Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
forkSucceeded	TokenNameIdentifier	 fork Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
forkFailed	TokenNameIdentifier	 fork Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
forkedProjectStarted	TokenNameIdentifier	 forked Project Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
forkedProjectSucceeded	TokenNameIdentifier	 forked Project Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
forkedProjectFailed	TokenNameIdentifier	 forked Project Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
