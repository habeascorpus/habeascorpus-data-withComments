/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
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
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
LifecycleExecutionException	TokenNameIdentifier	 Lifecycle Execution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
DependencyContext	TokenNameIdentifier	 Dependency Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
MojoExecutor	TokenNameIdentifier	 Mojo Executor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
PhaseRecorder	TokenNameIdentifier	 Phase Recorder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
ProjectIndex	TokenNameIdentifier	 Project Index
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
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
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
MojoExecutorStub	TokenNameIdentifier	 Mojo Executor Stub
extends	TokenNameextends	
MojoExecutor	TokenNameIdentifier	 Mojo Executor
{	TokenNameLBRACE	
// This is being lazy instead of making interface 	TokenNameCOMMENT_LINE	This is being lazy instead of making interface 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
executions	TokenNameIdentifier	 executions
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedList	TokenNameIdentifier	 synchronized List
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
ProjectIndex	TokenNameIdentifier	 Project Index
projectIndex	TokenNameIdentifier	 project Index
,	TokenNameCOMMA	
DependencyContext	TokenNameIdentifier	 Dependency Context
dependencyContext	TokenNameIdentifier	 dependency Context
,	TokenNameCOMMA	
PhaseRecorder	TokenNameIdentifier	 Phase Recorder
phaseRecorder	TokenNameIdentifier	 phase Recorder
)	TokenNameRPAREN	
throws	TokenNamethrows	
LifecycleExecutionException	TokenNameIdentifier	 Lifecycle Execution Exception
{	TokenNameLBRACE	
executions	TokenNameIdentifier	 executions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
mojoExecutions	TokenNameIdentifier	 mojo Executions
,	TokenNameCOMMA	
ProjectIndex	TokenNameIdentifier	 Project Index
projectIndex	TokenNameIdentifier	 project Index
)	TokenNameRPAREN	
throws	TokenNamethrows	
LifecycleExecutionException	TokenNameIdentifier	 Lifecycle Execution Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
:	TokenNameCOLON	
mojoExecutions	TokenNameIdentifier	 mojo Executions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executions	TokenNameIdentifier	 executions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
createMojoDescriptor	TokenNameIdentifier	 create Mojo Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mojoDescription	TokenNameIdentifier	 mojo Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
descriptor	TokenNameIdentifier	 descriptor
=	TokenNameEQUAL	
new	TokenNamenew	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
mojoDescription	TokenNameIdentifier	 mojo Description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
new	TokenNamenew	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
mojoDescription	TokenNameIdentifier	 mojo Description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
setPluginDescriptor	TokenNameIdentifier	 set Plugin Descriptor
(	TokenNameLPAREN	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
