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
ExecutionListener	TokenNameIdentifier	 Execution Listener
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
/** * Assists in firing execution events. <strong>Warning:</strong> This is an internal utility class that is only public * for technical reasons, it is not part of the public API. In particular, this class can be changed or deleted without * prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Assists in firing execution events. <strong>Warning:</strong> This is an internal utility class that is only public for technical reasons, it is not part of the public API. In particular, this class can be changed or deleted without prior notice. * @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ExecutionEventCatapult	TokenNameIdentifier	 Execution Event Catapult
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultExecutionEventCatapult	TokenNameIdentifier	 Default Execution Event Catapult
implements	TokenNameimplements	
ExecutionEventCatapult	TokenNameIdentifier	 Execution Event Catapult
{	TokenNameLBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
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
{	TokenNameLBRACE	
ExecutionListener	TokenNameIdentifier	 Execution Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getRequest	TokenNameIdentifier	 get Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExecutionListener	TokenNameIdentifier	 get Execution Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultExecutionEvent	TokenNameIdentifier	 Default Execution Event
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ProjectDiscoveryStarted	TokenNameIdentifier	 Project Discovery Started
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
projectDiscoveryStarted	TokenNameIdentifier	 project Discovery Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SessionStarted	TokenNameIdentifier	 Session Started
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
sessionStarted	TokenNameIdentifier	 session Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SessionEnded	TokenNameIdentifier	 Session Ended
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
sessionEnded	TokenNameIdentifier	 session Ended
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ProjectSkipped	TokenNameIdentifier	 Project Skipped
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
projectSkipped	TokenNameIdentifier	 project Skipped
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ProjectStarted	TokenNameIdentifier	 Project Started
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
projectStarted	TokenNameIdentifier	 project Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ProjectSucceeded	TokenNameIdentifier	 Project Succeeded
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
projectSucceeded	TokenNameIdentifier	 project Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ProjectFailed	TokenNameIdentifier	 Project Failed
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
projectFailed	TokenNameIdentifier	 project Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MojoSkipped	TokenNameIdentifier	 Mojo Skipped
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
mojoSkipped	TokenNameIdentifier	 mojo Skipped
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MojoStarted	TokenNameIdentifier	 Mojo Started
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
mojoStarted	TokenNameIdentifier	 mojo Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MojoSucceeded	TokenNameIdentifier	 Mojo Succeeded
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
mojoSucceeded	TokenNameIdentifier	 mojo Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MojoFailed	TokenNameIdentifier	 Mojo Failed
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
mojoFailed	TokenNameIdentifier	 mojo Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ForkStarted	TokenNameIdentifier	 Fork Started
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
forkStarted	TokenNameIdentifier	 fork Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ForkSucceeded	TokenNameIdentifier	 Fork Succeeded
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
forkSucceeded	TokenNameIdentifier	 fork Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ForkFailed	TokenNameIdentifier	 Fork Failed
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
forkFailed	TokenNameIdentifier	 fork Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ForkedProjectStarted	TokenNameIdentifier	 Forked Project Started
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
forkedProjectStarted	TokenNameIdentifier	 forked Project Started
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ForkedProjectSucceeded	TokenNameIdentifier	 Forked Project Succeeded
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
forkedProjectSucceeded	TokenNameIdentifier	 forked Project Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ForkedProjectFailed	TokenNameIdentifier	 Forked Project Failed
:	TokenNameCOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
forkedProjectFailed	TokenNameIdentifier	 forked Project Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unknown execution event type "	TokenNameStringLiteral	Unknown execution event type 
+	TokenNamePLUS	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
