package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
deployer	TokenNameIdentifier	 deployer
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
AbstractArtifactComponentTestCase	TokenNameIdentifier	 Abstract Artifact Component Test Case
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
Artifact	TokenNameIdentifier	 Artifact
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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * @author <a href="mailto:jason@maven.org">Jason van Zyl</a> */	TokenNameCOMMENT_JAVADOC	 @author <a href="mailto:jason@maven.org">Jason van Zyl</a> 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactDeployerTest	TokenNameIdentifier	 Artifact Deployer Test
extends	TokenNameextends	
AbstractArtifactComponentTestCase	TokenNameIdentifier	 Abstract Artifact Component Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
ArtifactDeployer	TokenNameIdentifier	 Artifact Deployer
artifactDeployer	TokenNameIdentifier	 artifact Deployer
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
artifactDeployer	TokenNameIdentifier	 artifact Deployer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArtifactDeployer	TokenNameIdentifier	 Artifact Deployer
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactDeployer	TokenNameIdentifier	 Artifact Deployer
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"deployer"	TokenNameStringLiteral	deployer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testArtifactInstallation	TokenNameIdentifier	 test Artifact Installation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
artifactBasedir	TokenNameIdentifier	 artifact Basedir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/test/resources/artifact-install"	TokenNameStringLiteral	src/test/resources/artifact-install
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
createArtifact	TokenNameIdentifier	 create Artifact
(	TokenNameLPAREN	
"artifact"	TokenNameStringLiteral	artifact
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
artifactBasedir	TokenNameIdentifier	 artifact Basedir
,	TokenNameCOMMA	
"artifact-1.0.jar"	TokenNameStringLiteral	artifact-1.0.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
fileRead	TokenNameIdentifier	 file Read
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifactDeployer	TokenNameIdentifier	 artifact Deployer
.	TokenNameDOT	
deploy	TokenNameIdentifier	 deploy
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
remoteRepository	TokenNameIdentifier	 remote Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
=	TokenNameEQUAL	
remoteRepository	TokenNameIdentifier	 remote Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
deployedFile	TokenNameIdentifier	 deployed File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
remoteRepository	TokenNameIdentifier	 remote Repository
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
remoteRepository	TokenNameIdentifier	 remote Repository
.	TokenNameDOT	
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
deployedFile	TokenNameIdentifier	 deployed File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
fileRead	TokenNameIdentifier	 file Read
(	TokenNameLPAREN	
deployedFile	TokenNameIdentifier	 deployed File
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
