package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
Build	TokenNameIdentifier	 Build
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
Dependency	TokenNameIdentifier	 Dependency
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
Extension	TokenNameIdentifier	 Extension
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
Model	TokenNameIdentifier	 Model
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
Parent	TokenNameIdentifier	 Parent
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
PluginManagement	TokenNameIdentifier	 Plugin Management
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
dag	TokenNameIdentifier	 dag
.	TokenNameDOT	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
;	TokenNameSEMICOLON	
/** * Test sorting projects by dependencies. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Test sorting projects by dependencies. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
ProjectSorterTest	TokenNameIdentifier	 Project Sorter Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Parent	TokenNameIdentifier	 Parent
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Parent	TokenNameIdentifier	 Parent
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parent	TokenNameIdentifier	 Parent
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
new	TokenNamenew	
Parent	TokenNameIdentifier	 Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Dependency	TokenNameIdentifier	 Dependency
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Dependency	TokenNameIdentifier	 Dependency
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dependency	TokenNameIdentifier	 Dependency
depdendency	TokenNameIdentifier	 depdendency
=	TokenNameEQUAL	
new	TokenNamenew	
Dependency	TokenNameIdentifier	 Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depdendency	TokenNameIdentifier	 depdendency
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depdendency	TokenNameIdentifier	 depdendency
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depdendency	TokenNameIdentifier	 depdendency
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
depdendency	TokenNameIdentifier	 depdendency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Plugin	TokenNameIdentifier	 Plugin
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Plugin	TokenNameIdentifier	 Plugin
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
new	TokenNamenew	
Plugin	TokenNameIdentifier	 Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Extension	TokenNameIdentifier	 Extension
createExtension	TokenNameIdentifier	 create Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
MavenProject	TokenNameIdentifier	 Maven Project
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
new	TokenNamenew	
Model	TokenNameIdentifier	 Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setBuild	TokenNameIdentifier	 set Build
(	TokenNameLPAREN	
new	TokenNamenew	
Build	TokenNameIdentifier	 Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldNotFailWhenPluginDepReferencesCurrentProject	TokenNameIdentifier	 test Should Not Fail When Plugin Dep References Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
,	TokenNameCOMMA	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"artifact"	TokenNameStringLiteral	artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
"other.group"	TokenNameStringLiteral	other.group
,	TokenNameCOMMA	
"other-artifact"	TokenNameStringLiteral	other-artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dependency	TokenNameIdentifier	 Dependency
dep	TokenNameIdentifier	 dep
=	TokenNameEQUAL	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"artifact"	TokenNameStringLiteral	artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
dep	TokenNameIdentifier	 dep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
addPlugin	TokenNameIdentifier	 add Plugin
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldNotFailWhenManagedPluginDepReferencesCurrentProject	TokenNameIdentifier	 test Should Not Fail When Managed Plugin Dep References Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
,	TokenNameCOMMA	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"artifact"	TokenNameStringLiteral	artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PluginManagement	TokenNameIdentifier	 Plugin Management
pMgmt	TokenNameIdentifier	 p Mgmt
=	TokenNameEQUAL	
new	TokenNamenew	
PluginManagement	TokenNameIdentifier	 Plugin Management
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
"other.group"	TokenNameStringLiteral	other.group
,	TokenNameCOMMA	
"other-artifact"	TokenNameStringLiteral	other-artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dependency	TokenNameIdentifier	 Dependency
dep	TokenNameIdentifier	 dep
=	TokenNameEQUAL	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"artifact"	TokenNameStringLiteral	artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
dep	TokenNameIdentifier	 dep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pMgmt	TokenNameIdentifier	 p Mgmt
.	TokenNameDOT	
addPlugin	TokenNameIdentifier	 add Plugin
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setPluginManagement	TokenNameIdentifier	 set Plugin Management
(	TokenNameLPAREN	
pMgmt	TokenNameIdentifier	 p Mgmt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldNotFailWhenProjectReferencesNonExistentProject	TokenNameIdentifier	 test Should Not Fail When Project References Non Existent Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
,	TokenNameCOMMA	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"artifact"	TokenNameStringLiteral	artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
createExtension	TokenNameIdentifier	 create Extension
(	TokenNameLPAREN	
"other.group"	TokenNameStringLiteral	other.group
,	TokenNameCOMMA	
"other-artifact"	TokenNameStringLiteral	other-artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatchingArtifactIdsDifferentGroupIds	TokenNameIdentifier	 test Matching Artifact Ids Different Group Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
,	TokenNameCOMMA	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId1"	TokenNameStringLiteral	groupId1
,	TokenNameCOMMA	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project2	TokenNameIdentifier	 project2
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId2"	TokenNameStringLiteral	groupId2
,	TokenNameCOMMA	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatchingGroupIdsDifferentArtifactIds	TokenNameIdentifier	 test Matching Group Ids Different Artifact Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
,	TokenNameCOMMA	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"artifactId1"	TokenNameStringLiteral	artifactId1
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project2	TokenNameIdentifier	 project2
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"artifactId2"	TokenNameStringLiteral	artifactId2
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatchingIdsAndVersions	TokenNameIdentifier	 test Matching Ids And Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project2	TokenNameIdentifier	 project2
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Duplicate projects should fail"	TokenNameStringLiteral	Duplicate projects should fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatchingIdsAndDifferentVersions	TokenNameIdentifier	 test Matching Ids And Different Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CycleDetectedException	TokenNameIdentifier	 Cycle Detected Exception
,	TokenNameCOMMA	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project2	TokenNameIdentifier	 project2
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project2	TokenNameIdentifier	 project2
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPluginDependenciesInfluenceSorting	TokenNameIdentifier	 test Plugin Dependencies Influence Sorting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
parentProject	TokenNameIdentifier	 parent Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"parent"	TokenNameStringLiteral	parent
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
declaringProject	TokenNameIdentifier	 declaring Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"declarer"	TokenNameStringLiteral	declarer
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
declaringProject	TokenNameIdentifier	 declaring Project
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
declaringProject	TokenNameIdentifier	 declaring Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
declaringProject	TokenNameIdentifier	 declaring Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"plugin-level-dep"	TokenNameStringLiteral	plugin-level-dep
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginProject	TokenNameIdentifier	 plugin Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"plugin"	TokenNameStringLiteral	plugin
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginProject	TokenNameIdentifier	 plugin Project
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginProject	TokenNameIdentifier	 plugin Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
declaringProject	TokenNameIdentifier	 declaring Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
addPlugin	TokenNameIdentifier	 add Plugin
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the order of these two is non-deterministic, based on when they're added to the reactor. 	TokenNameCOMMENT_LINE	the order of these two is non-deterministic, based on when they're added to the reactor. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the declaring project MUST be listed after the plugin and its plugin-level dep, though. 	TokenNameCOMMENT_LINE	the declaring project MUST be listed after the plugin and its plugin-level dep, though. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
declaringProject	TokenNameIdentifier	 declaring Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPluginDependenciesInfluenceSorting_DeclarationInParent	TokenNameIdentifier	 test Plugin Dependencies Influence Sorting  Declaration In Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
parentProject	TokenNameIdentifier	 parent Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"parent-declarer"	TokenNameStringLiteral	parent-declarer
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginProject	TokenNameIdentifier	 plugin Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"plugin"	TokenNameStringLiteral	plugin
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginProject	TokenNameIdentifier	 plugin Project
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginProject	TokenNameIdentifier	 plugin Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
,	TokenNameCOMMA	
"plugin-level-dep"	TokenNameStringLiteral	plugin-level-dep
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
createParent	TokenNameIdentifier	 create Parent
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
parentProject	TokenNameIdentifier	 parent Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
addPlugin	TokenNameIdentifier	 add Plugin
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parentProject	TokenNameIdentifier	 parent Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the order of these two is non-deterministic, based on when they're added to the reactor. 	TokenNameCOMMENT_LINE	the order of these two is non-deterministic, based on when they're added to the reactor. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginLevelDepProject	TokenNameIdentifier	 plugin Level Dep Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPluginVersionsAreConsidered	TokenNameIdentifier	 test Plugin Versions Are Considered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginProjectA	TokenNameIdentifier	 plugin Project A
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"plugin-a"	TokenNameStringLiteral	plugin-a
,	TokenNameCOMMA	
"2.0-SNAPSHOT"	TokenNameStringLiteral	2.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginProjectA	TokenNameIdentifier	 plugin Project A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginProjectA	TokenNameIdentifier	 plugin Project A
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addPlugin	TokenNameIdentifier	 add Plugin
(	TokenNameLPAREN	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"plugin-b"	TokenNameStringLiteral	plugin-b
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginProjectB	TokenNameIdentifier	 plugin Project B
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"plugin-b"	TokenNameStringLiteral	plugin-b
,	TokenNameCOMMA	
"2.0-SNAPSHOT"	TokenNameStringLiteral	2.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginProjectB	TokenNameIdentifier	 plugin Project B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginProjectB	TokenNameIdentifier	 plugin Project B
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addPlugin	TokenNameIdentifier	 add Plugin
(	TokenNameLPAREN	
createPlugin	TokenNameIdentifier	 create Plugin
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"plugin-a"	TokenNameStringLiteral	plugin-a
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginProjectA	TokenNameIdentifier	 plugin Project A
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginProjectB	TokenNameIdentifier	 plugin Project B
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDependencyPrecedesProjectThatUsesSpecificDependencyVersion	TokenNameIdentifier	 test Dependency Precedes Project That Uses Specific Dependency Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
usingProject	TokenNameIdentifier	 using Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"project"	TokenNameStringLiteral	project
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
usingProject	TokenNameIdentifier	 using Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingProject	TokenNameIdentifier	 using Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"dependency"	TokenNameStringLiteral	dependency
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginProject	TokenNameIdentifier	 plugin Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"dependency"	TokenNameStringLiteral	dependency
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
usingProject	TokenNameIdentifier	 using Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDependencyPrecedesProjectThatUsesUnresolvedDependencyVersion	TokenNameIdentifier	 test Dependency Precedes Project That Uses Unresolved Dependency Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
usingProject	TokenNameIdentifier	 using Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"project"	TokenNameStringLiteral	project
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
usingProject	TokenNameIdentifier	 using Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingProject	TokenNameIdentifier	 using Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
createDependency	TokenNameIdentifier	 create Dependency
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"dependency"	TokenNameStringLiteral	dependency
,	TokenNameCOMMA	
"[1.0,)"	TokenNameStringLiteral	[1.0,)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
pluginProject	TokenNameIdentifier	 plugin Project
=	TokenNameEQUAL	
createProject	TokenNameIdentifier	 create Project
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
"dependency"	TokenNameStringLiteral	dependency
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectSorter	TokenNameIdentifier	 Project Sorter
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
.	TokenNameDOT	
getSortedProjects	TokenNameIdentifier	 get Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
pluginProject	TokenNameIdentifier	 plugin Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
usingProject	TokenNameIdentifier	 using Project
,	TokenNameCOMMA	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
