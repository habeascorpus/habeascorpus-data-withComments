package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
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
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * @author mkleint */	TokenNameCOMMENT_JAVADOC	 @author mkleint 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ToolchainManager	TokenNameIdentifier	 Toolchain Manager
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultToolchainManager	TokenNameIdentifier	 Default Toolchain Manager
implements	TokenNameimplements	
ToolchainManager	TokenNameIdentifier	 Toolchain Manager
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ToolchainFactory	TokenNameIdentifier	 Toolchain Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ToolchainFactory	TokenNameIdentifier	 Toolchain Factory
>	TokenNameGREATER	
factories	TokenNameIdentifier	 factories
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Toolchain	TokenNameIdentifier	 Toolchain
getToolchainFromBuildContext	TokenNameIdentifier	 get Toolchain From Build Context
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
retrieveContext	TokenNameIdentifier	 retrieve Context
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
getStorageKey	TokenNameIdentifier	 get Storage Key
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ToolchainFactory	TokenNameIdentifier	 Toolchain Factory
fact	TokenNameIdentifier	 fact
=	TokenNameEQUAL	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fact	TokenNameIdentifier	 fact
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fact	TokenNameIdentifier	 fact
.	TokenNameDOT	
createToolchain	TokenNameIdentifier	 create Toolchain
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Missing toolchain factory for type: "	TokenNameStringLiteral	Missing toolchain factory for type: 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
". Possibly caused by misconfigured project."	TokenNameStringLiteral	. Possibly caused by misconfigured project.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MisconfiguredToolchainException	TokenNameIdentifier	 Misconfigured Toolchain Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Misconfigured toolchain."	TokenNameStringLiteral	Misconfigured toolchain.
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
retrieveContext	TokenNameIdentifier	 retrieve Context
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
new	TokenNamenew	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
.	TokenNameDOT	
getDefaultPluginGroupId	TokenNameIdentifier	 get Default Plugin Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
.	TokenNameDOT	
getDefaultPluginArtifactId	TokenNameIdentifier	 get Default Plugin Artifact Id
(	TokenNameLPAREN	
"toolchains"	TokenNameStringLiteral	toolchains
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getCurrentProject	TokenNameIdentifier	 get Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//TODO: why is this using the context 	TokenNameCOMMENT_LINE	TODO: why is this using the context 
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getPluginContext	TokenNameIdentifier	 get Plugin Context
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
context	TokenNameIdentifier	 context
:	TokenNameCOLON	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getStorageKey	TokenNameIdentifier	 get Storage Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"toolchain-"	TokenNameStringLiteral	toolchain-
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// NOI18N 	TokenNameCOMMENT_LINE	NOI18N 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
