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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
/** * Holds data relevant for an execution event. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Holds data relevant for an execution event. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ExecutionEvent	TokenNameIdentifier	 Execution Event
{	TokenNameLBRACE	
/** * The possible types of execution events. */	TokenNameCOMMENT_JAVADOC	 The possible types of execution events. 
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
ProjectDiscoveryStarted	TokenNameIdentifier	 Project Discovery Started
,	TokenNameCOMMA	
SessionStarted	TokenNameIdentifier	 Session Started
,	TokenNameCOMMA	
SessionEnded	TokenNameIdentifier	 Session Ended
,	TokenNameCOMMA	
ProjectSkipped	TokenNameIdentifier	 Project Skipped
,	TokenNameCOMMA	
ProjectStarted	TokenNameIdentifier	 Project Started
,	TokenNameCOMMA	
ProjectSucceeded	TokenNameIdentifier	 Project Succeeded
,	TokenNameCOMMA	
ProjectFailed	TokenNameIdentifier	 Project Failed
,	TokenNameCOMMA	
MojoSkipped	TokenNameIdentifier	 Mojo Skipped
,	TokenNameCOMMA	
MojoStarted	TokenNameIdentifier	 Mojo Started
,	TokenNameCOMMA	
MojoSucceeded	TokenNameIdentifier	 Mojo Succeeded
,	TokenNameCOMMA	
MojoFailed	TokenNameIdentifier	 Mojo Failed
,	TokenNameCOMMA	
ForkStarted	TokenNameIdentifier	 Fork Started
,	TokenNameCOMMA	
ForkSucceeded	TokenNameIdentifier	 Fork Succeeded
,	TokenNameCOMMA	
ForkFailed	TokenNameIdentifier	 Fork Failed
,	TokenNameCOMMA	
ForkedProjectStarted	TokenNameIdentifier	 Forked Project Started
,	TokenNameCOMMA	
ForkedProjectSucceeded	TokenNameIdentifier	 Forked Project Succeeded
,	TokenNameCOMMA	
ForkedProjectFailed	TokenNameIdentifier	 Forked Project Failed
,	TokenNameCOMMA	
}	TokenNameRBRACE	
/** * Gets the type of the event. * * @return The type of the event, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the type of the event. * @return The type of the event, never {@code null}. 
Type	TokenNameIdentifier	 Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the session from which this event originates. * * @return The current session, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the session from which this event originates. * @return The current session, never {@code null}. 
MavenSession	TokenNameIdentifier	 Maven Session
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current project (if any). * * @return The current project or {@code null} if not applicable. */	TokenNameCOMMENT_JAVADOC	 Gets the current project (if any). * @return The current project or {@code null} if not applicable. 
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the current mojo execution (if any). * * @return The current mojo execution or {@code null} if not applicable. */	TokenNameCOMMENT_JAVADOC	 Gets the current mojo execution (if any). * @return The current mojo execution or {@code null} if not applicable. 
MojoExecution	TokenNameIdentifier	 Mojo Execution
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the exception that caused the event (if any). * * @return The exception or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the exception that caused the event (if any). * @return The exception or {@code null} if none. 
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
