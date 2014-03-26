package	TokenNamepackage	
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
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
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
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
ArtifactRepositoryLayout2	TokenNameIdentifier	 Artifact Repository Layout2
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
// TODO: use settings? 	TokenNameCOMMENT_LINE	TODO: use settings? 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
globalUpdatePolicy	TokenNameIdentifier	 global Update Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
globalChecksumPolicy	TokenNameIdentifier	 global Checksum Policy
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
>	TokenNameGREATER	
repositoryLayouts	TokenNameIdentifier	 repository Layouts
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
repositoryLayouts	TokenNameIdentifier	 repository Layouts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
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
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
repositoryLayouts	TokenNameIdentifier	 repository Layouts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
layoutId	TokenNameIdentifier	 layout Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkLayout	TokenNameIdentifier	 check Layout
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createDeploymentArtifactRepository	TokenNameIdentifier	 create Deployment Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
uniqueVersion	TokenNameIdentifier	 unique Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkLayout	TokenNameIdentifier	 check Layout
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repositoryId	TokenNameIdentifier	 repository Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
(	TokenNameLPAREN	
repositoryId	TokenNameIdentifier	 repository Id
,	TokenNameCOMMA	
layoutId	TokenNameIdentifier	 layout Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
repositoryLayout	TokenNameIdentifier	 repository Layout
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
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
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
repositoryLayouts	TokenNameIdentifier	 repository Layouts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
layoutId	TokenNameIdentifier	 layout Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkLayout	TokenNameIdentifier	 check Layout
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
releases	TokenNameIdentifier	 releases
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
if	TokenNameif	
(	TokenNameLPAREN	
snapshots	TokenNameIdentifier	 snapshots
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
releases	TokenNameIdentifier	 releases
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
releases	TokenNameIdentifier	 releases
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
globalUpdatePolicy	TokenNameIdentifier	 global Update Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
setUpdatePolicy	TokenNameIdentifier	 set Update Policy
(	TokenNameLPAREN	
globalUpdatePolicy	TokenNameIdentifier	 global Update Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
releases	TokenNameIdentifier	 releases
.	TokenNameDOT	
setUpdatePolicy	TokenNameIdentifier	 set Update Policy
(	TokenNameLPAREN	
globalUpdatePolicy	TokenNameIdentifier	 global Update Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
globalChecksumPolicy	TokenNameIdentifier	 global Checksum Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
setChecksumPolicy	TokenNameIdentifier	 set Checksum Policy
(	TokenNameLPAREN	
globalChecksumPolicy	TokenNameIdentifier	 global Checksum Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
releases	TokenNameIdentifier	 releases
.	TokenNameDOT	
setChecksumPolicy	TokenNameIdentifier	 set Checksum Policy
(	TokenNameLPAREN	
globalChecksumPolicy	TokenNameIdentifier	 global Checksum Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repositoryLayout	TokenNameIdentifier	 repository Layout
instanceof	TokenNameinstanceof	
ArtifactRepositoryLayout2	TokenNameIdentifier	 Artifact Repository Layout2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArtifactRepositoryLayout2	TokenNameIdentifier	 Artifact Repository Layout2
)	TokenNameRPAREN	
repositoryLayout	TokenNameIdentifier	 repository Layout
)	TokenNameRPAREN	
.	TokenNameDOT	
newMavenArtifactRepository	TokenNameIdentifier	 new Maven Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
snapshots	TokenNameIdentifier	 snapshots
,	TokenNameCOMMA	
releases	TokenNameIdentifier	 releases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
new	TokenNamenew	
MavenArtifactRepository	TokenNameIdentifier	 Maven Artifact Repository
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
repository	TokenNameIdentifier	 repository
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
globalUpdatePolicy	TokenNameIdentifier	 global Update Policy
=	TokenNameEQUAL	
updatePolicy	TokenNameIdentifier	 update Policy
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
globalChecksumPolicy	TokenNameIdentifier	 global Checksum Policy
=	TokenNameEQUAL	
checksumPolicy	TokenNameIdentifier	 checksum Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
