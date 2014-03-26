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
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Artifact	TokenNameIdentifier	 Artifact
pomArtifact	TokenNameIdentifier	 pom Artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Artifact	TokenNameIdentifier	 Artifact
relocatedArtifact	TokenNameIdentifier	 relocated Artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
managedVersions	TokenNameIdentifier	 managed Versions
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
pomArtifact	TokenNameIdentifier	 pom Artifact
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
pomArtifact	TokenNameIdentifier	 pom Artifact
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
artifacts	TokenNameIdentifier	 artifacts
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ResolutionGroup	TokenNameIdentifier	 Resolution Group
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
pomArtifact	TokenNameIdentifier	 pom Artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
relocatedArtifact	TokenNameIdentifier	 relocated Artifact
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
managedVersions	TokenNameIdentifier	 managed Versions
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pomArtifact	TokenNameIdentifier	 pom Artifact
=	TokenNameEQUAL	
pomArtifact	TokenNameIdentifier	 pom Artifact
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relocatedArtifact	TokenNameIdentifier	 relocated Artifact
=	TokenNameEQUAL	
relocatedArtifact	TokenNameIdentifier	 relocated Artifact
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
managedVersions	TokenNameIdentifier	 managed Versions
=	TokenNameEQUAL	
managedVersions	TokenNameIdentifier	 managed Versions
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
=	TokenNameEQUAL	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
getPomArtifact	TokenNameIdentifier	 get Pom Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pomArtifact	TokenNameIdentifier	 pom Artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
getRelocatedArtifact	TokenNameIdentifier	 get Relocated Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relocatedArtifact	TokenNameIdentifier	 relocated Artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
getArtifacts	TokenNameIdentifier	 get Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getResolutionRepositories	TokenNameIdentifier	 get Resolution Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolutionRepositories	TokenNameIdentifier	 resolution Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
getManagedVersions	TokenNameIdentifier	 get Managed Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
managedVersions	TokenNameIdentifier	 managed Versions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
