package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
Set	TokenNameIdentifier	 Set
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
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
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
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
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
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hint	TokenNameIdentifier	 hint
=	TokenNameEQUAL	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
TestMetadataSource	TokenNameIdentifier	 Test Metadata Source
implements	TokenNameimplements	
ArtifactMetadataSource	TokenNameIdentifier	 Artifact Metadata Source
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ArtifactFactory	TokenNameIdentifier	 Artifact Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
retrieve	TokenNameIdentifier	 retrieve
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createBuildArtifact	TokenNameIdentifier	 create Build Artifact
(	TokenNameLPAREN	
"org.apache.maven"	TokenNameStringLiteral	org.apache.maven
,	TokenNameCOMMA	
"h"	TokenNameStringLiteral	h
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
(	TokenNameLPAREN	
"Error retrieving metadata"	TokenNameStringLiteral	Error retrieving metadata
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createBuildArtifact	TokenNameIdentifier	 create Build Artifact
(	TokenNameLPAREN	
"org.apache.maven"	TokenNameStringLiteral	org.apache.maven
,	TokenNameCOMMA	
"j"	TokenNameStringLiteral	j
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
(	TokenNameLPAREN	
"Error retrieving metadata"	TokenNameStringLiteral	Error retrieving metadata
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
dependencies	TokenNameIdentifier	 dependencies
,	TokenNameCOMMA	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
retrieveAvailableVersions	TokenNameIdentifier	 retrieve Available Versions
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Cannot get available versions in this test case"	TokenNameStringLiteral	Cannot get available versions in this test case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
retrieveAvailableVersionsFromDeploymentRepository	TokenNameIdentifier	 retrieve Available Versions From Deployment Repository
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Cannot get available versions in this test case"	TokenNameStringLiteral	Cannot get available versions in this test case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
retrieve	TokenNameIdentifier	 retrieve
(	TokenNameLPAREN	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
retrieve	TokenNameIdentifier	 retrieve
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
retrieveAvailableVersions	TokenNameIdentifier	 retrieve Available Versions
(	TokenNameLPAREN	
MetadataResolutionRequest	TokenNameIdentifier	 Metadata Resolution Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactMetadataRetrievalException	TokenNameIdentifier	 Artifact Metadata Retrieval Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
retrieveAvailableVersions	TokenNameIdentifier	 retrieve Available Versions
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRemoteRepositories	TokenNameIdentifier	 get Remote Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
