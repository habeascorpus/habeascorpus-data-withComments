package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
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
MavenSession	TokenNameIdentifier	 Maven Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
MojoExecution	TokenNameIdentifier	 Mojo Execution
;	TokenNameSEMICOLON	
/** * Assists in firing execution events. <strong>Warning:</strong> This is an internal utility interface that is only * public for technical reasons, it is not part of the public API. In particular, this interface can be changed or * deleted without prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Assists in firing execution events. <strong>Warning:</strong> This is an internal utility interface that is only public for technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without prior notice. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ExecutionEventCatapult	TokenNameIdentifier	 Execution Event Catapult
{	TokenNameLBRACE	
void	TokenNamevoid	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
