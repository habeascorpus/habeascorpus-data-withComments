package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MojoExecution	TokenNameIdentifier	 Mojo Execution
{	TokenNameLBRACE	
private	TokenNameprivate	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executionId	TokenNameIdentifier	 execution Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
/** * Describes the source of an execution. */	TokenNameCOMMENT_JAVADOC	 Describes the source of an execution. 
public	TokenNamepublic	
enum	TokenNameenum	
Source	TokenNameIdentifier	 Source
{	TokenNameLBRACE	
/** * An execution that originates from the direct invocation of a goal from the CLI. */	TokenNameCOMMENT_JAVADOC	 An execution that originates from the direct invocation of a goal from the CLI. 
CLI	TokenNameIdentifier	 CLI
,	TokenNameCOMMA	
/** * An execution that originates from a goal bound to a lifecycle phase. */	TokenNameCOMMENT_JAVADOC	 An execution that originates from a goal bound to a lifecycle phase. 
LIFECYCLE	TokenNameIdentifier	 LIFECYCLE
,	TokenNameCOMMA	
}	TokenNameRBRACE	
private	TokenNameprivate	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
/** * The phase may or may not have been bound to a phase but once the plan has been calculated we know what phase * this mojo execution is going to run in. */	TokenNameCOMMENT_JAVADOC	 The phase may or may not have been bound to a phase but once the plan has been calculated we know what phase this mojo execution is going to run in. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
/** * The executions to fork before this execution, indexed by the groupId:artifactId:version of the project on which * the forked execution are to be run and in reactor build order. */	TokenNameCOMMENT_JAVADOC	 The executions to fork before this execution, indexed by the groupId:artifactId:version of the project on which the forked execution are to be run and in reactor build order. 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>>	TokenNameRIGHT_SHIFT	
forkedExecutions	TokenNameIdentifier	 forked Executions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
executionId	TokenNameIdentifier	 execution Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
executionId	TokenNameIdentifier	 execution Id
=	TokenNameEQUAL	
executionId	TokenNameIdentifier	 execution Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
executionId	TokenNameIdentifier	 execution Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
executionId	TokenNameIdentifier	 execution Id
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
executionId	TokenNameIdentifier	 execution Id
=	TokenNameEQUAL	
executionId	TokenNameIdentifier	 execution Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
executionId	TokenNameIdentifier	 execution Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
executionId	TokenNameIdentifier	 execution Id
=	TokenNameEQUAL	
executionId	TokenNameIdentifier	 execution Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
executionId	TokenNameIdentifier	 execution Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the source of this execution. * * @return The source of this execution or {@code null} if unknown. */	TokenNameCOMMENT_JAVADOC	 Gets the source of this execution. * @return The source of this execution or {@code null} if unknown. 
public	TokenNamepublic	
Source	TokenNameIdentifier	 Source
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExecutionId	TokenNameIdentifier	 get Execution Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executionId	TokenNameIdentifier	 execution Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Plugin	TokenNameIdentifier	 Plugin
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
identify	TokenNameIdentifier	 identify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
executionId	TokenNameIdentifier	 execution Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLifecyclePhase	TokenNameIdentifier	 set Lifecycle Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
=	TokenNameEQUAL	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" {execution: "	TokenNameStringLiteral	 {execution: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
executionId	TokenNameIdentifier	 execution Id
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMojoDescriptor	TokenNameIdentifier	 set Mojo Descriptor
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>>	TokenNameRIGHT_SHIFT	
getForkedExecutions	TokenNameIdentifier	 get Forked Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
forkedExecutions	TokenNameIdentifier	 forked Executions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setForkedExecutions	TokenNameIdentifier	 set Forked Executions
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectKey	TokenNameIdentifier	 project Key
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoExecution	TokenNameIdentifier	 Mojo Execution
>	TokenNameGREATER	
forkedExecutions	TokenNameIdentifier	 forked Executions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
forkedExecutions	TokenNameIdentifier	 forked Executions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
projectKey	TokenNameIdentifier	 project Key
,	TokenNameCOMMA	
forkedExecutions	TokenNameIdentifier	 forked Executions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
