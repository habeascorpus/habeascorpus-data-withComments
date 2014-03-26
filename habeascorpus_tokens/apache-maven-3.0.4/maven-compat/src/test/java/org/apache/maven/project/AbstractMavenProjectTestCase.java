package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URISyntaxException	TokenNameIdentifier	 URI Syntax Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblem	TokenNameIdentifier	 Model Problem
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RepositorySystem	TokenNameIdentifier	 Repository System
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
MavenRepositorySystemSession	TokenNameIdentifier	 Maven Repository System Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
ProjectBuilder	TokenNameIdentifier	 Project Builder
projectBuilder	TokenNameIdentifier	 project Builder
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RepositorySystem	TokenNameIdentifier	 Repository System
repositorySystem	TokenNameIdentifier	 repository System
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasComponent	TokenNameIdentifier	 has Component
(	TokenNameLPAREN	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectBuilder	TokenNameIdentifier	 project Builder
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// default over to the main project builder... 	TokenNameCOMMENT_LINE	default over to the main project builder... 
projectBuilder	TokenNameIdentifier	 project Builder
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
repositorySystem	TokenNameIdentifier	 repository System
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
RepositorySystem	TokenNameIdentifier	 Repository System
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
projectBuilder	TokenNameIdentifier	 project Builder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ProjectBuilder	TokenNameIdentifier	 Project Builder
getProjectBuilder	TokenNameIdentifier	 get Project Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuilder	TokenNameIdentifier	 project Builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getCustomConfigurationName	TokenNameIdentifier	 get Custom Configuration Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".xml"	TokenNameStringLiteral	.xml
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Local repository 	TokenNameCOMMENT_LINE	Local repository 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
getLocalRepositoryPath	TokenNameIdentifier	 get Local Repository Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
URISyntaxException	TokenNameIdentifier	 URI Syntax Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
markerFile	TokenNameIdentifier	 marker File
=	TokenNameEQUAL	
getFileForClasspathResource	TokenNameIdentifier	 get File For Classpath Resource
(	TokenNameLPAREN	
"local-repo/marker.txt"	TokenNameStringLiteral	local-repo/marker.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
markerFile	TokenNameIdentifier	 marker File
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getFileForClasspathResource	TokenNameIdentifier	 get File For Classpath Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cloader	TokenNameIdentifier	 cloader
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
resourceUrl	TokenNameIdentifier	 resource Url
=	TokenNameEQUAL	
cloader	TokenNameIdentifier	 cloader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceUrl	TokenNameIdentifier	 resource Url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
(	TokenNameLPAREN	
"Unable to find: "	TokenNameStringLiteral	Unable to find: 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
resourceUrl	TokenNameIdentifier	 resource Url
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"%20"	TokenNameStringLiteral	%20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
repoLayout	TokenNameIdentifier	 repo Layout
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"legacy"	TokenNameStringLiteral	legacy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
,	TokenNameCOMMA	
"file://"	TokenNameStringLiteral	file://
+	TokenNamePLUS	
getLocalRepositoryPath	TokenNameIdentifier	 get Local Repository Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
repoLayout	TokenNameIdentifier	 repo Layout
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Project building 	TokenNameCOMMENT_LINE	Project building 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
protected	TokenNameprotected	
MavenProject	TokenNameIdentifier	 Maven Project
getProjectWithDependencies	TokenNameIdentifier	 get Project With Dependencies
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProjectBuildingRequest	TokenNameIdentifier	 Default Project Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
setRemoteRepositories	TokenNameIdentifier	 set Remote Repositories
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
setResolveDependencies	TokenNameIdentifier	 set Resolve Dependencies
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initRepoSession	TokenNameIdentifier	 init Repo Session
(	TokenNameLPAREN	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuilder	TokenNameIdentifier	 project Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"In: "	TokenNameStringLiteral	In: 
+	TokenNamePLUS	
pom	TokenNameIdentifier	 pom
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
problem	TokenNameIdentifier	 problem
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
+=	TokenNamePLUS_EQUAL	
problem	TokenNameIdentifier	 problem
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProjectBuildingRequest	TokenNameIdentifier	 Default Project Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initRepoSession	TokenNameIdentifier	 init Repo Session
(	TokenNameLPAREN	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
projectBuilder	TokenNameIdentifier	 project Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
initRepoSession	TokenNameIdentifier	 init Repo Session
(	TokenNameLPAREN	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
localRepo	TokenNameIdentifier	 local Repo
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenRepositorySystemSession	TokenNameIdentifier	 Maven Repository System Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
new	TokenNamenew	
MavenRepositorySystemSession	TokenNameIdentifier	 Maven Repository System Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
setLocalRepositoryManager	TokenNameIdentifier	 set Local Repository Manager
(	TokenNameLPAREN	
new	TokenNamenew	
LegacyLocalRepositoryManager	TokenNameIdentifier	 Legacy Local Repository Manager
(	TokenNameLPAREN	
localRepo	TokenNameIdentifier	 local Repo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
