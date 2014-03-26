package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
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
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
LegacySupport	TokenNameIdentifier	 Legacy Support
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
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
;	TokenNameSEMICOLON	
/** * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 @author jdcasey 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactRepositoryFactory	TokenNameIdentifier	 Artifact Repository Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactRepositoryFactory	TokenNameIdentifier	 Default Artifact Repository Factory
implements	TokenNameimplements	
ArtifactRepositoryFactory	TokenNameIdentifier	 Artifact Repository Factory
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepositoryFactory	TokenNameIdentifier	 Artifact Repository Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
LegacySupport	TokenNameIdentifier	 Legacy Support
legacySupport	TokenNameIdentifier	 legacy Support
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
RepositorySystem	TokenNameIdentifier	 Repository System
repositorySystem	TokenNameIdentifier	 repository System
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
layoutId	TokenNameIdentifier	 layout Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
createDeploymentArtifactRepository	TokenNameIdentifier	 create Deployment Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
uniqueVersion	TokenNameIdentifier	 unique Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
injectSession	TokenNameIdentifier	 inject Session
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDeploymentArtifactRepository	TokenNameIdentifier	 create Deployment Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
uniqueVersion	TokenNameIdentifier	 unique Version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
createDeploymentArtifactRepository	TokenNameIdentifier	 create Deployment Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
repositoryLayout	TokenNameIdentifier	 repository Layout
,	TokenNameCOMMA	
boolean	TokenNameboolean	
uniqueVersion	TokenNameIdentifier	 unique Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
injectSession	TokenNameIdentifier	 inject Session
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createDeploymentArtifactRepository	TokenNameIdentifier	 create Deployment Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
repositoryLayout	TokenNameIdentifier	 repository Layout
,	TokenNameCOMMA	
uniqueVersion	TokenNameIdentifier	 unique Version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
injectSession	TokenNameIdentifier	 inject Session
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
repositoryLayout	TokenNameIdentifier	 repository Layout
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
injectSession	TokenNameIdentifier	 inject Session
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
repositoryLayout	TokenNameIdentifier	 repository Layout
,	TokenNameCOMMA	
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGlobalUpdatePolicy	TokenNameIdentifier	 set Global Update Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
updatePolicy	TokenNameIdentifier	 update Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setGlobalUpdatePolicy	TokenNameIdentifier	 set Global Update Policy
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGlobalChecksumPolicy	TokenNameIdentifier	 set Global Checksum Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
checksumPolicy	TokenNameIdentifier	 checksum Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setGlobalChecksumPolicy	TokenNameIdentifier	 set Global Checksum Policy
(	TokenNameLPAREN	
checksumPolicy	TokenNameIdentifier	 checksum Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
injectSession	TokenNameIdentifier	 inject Session
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
legacySupport	TokenNameIdentifier	 legacy Support
.	TokenNameDOT	
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
repository	TokenNameIdentifier	 repository
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isLocalRepository	TokenNameIdentifier	 is Local Repository
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
injectMirror	TokenNameIdentifier	 inject Mirror
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
injectProxy	TokenNameIdentifier	 inject Proxy
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
injectAuthentication	TokenNameIdentifier	 inject Authentication
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isLocalRepository	TokenNameIdentifier	 is Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// unfortunately, the API doesn't allow to tell a remote repo and the local repo apart... 	TokenNameCOMMENT_LINE	unfortunately, the API doesn't allow to tell a remote repo and the local repo apart... 
return	TokenNamereturn	
"local"	TokenNameStringLiteral	local
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
