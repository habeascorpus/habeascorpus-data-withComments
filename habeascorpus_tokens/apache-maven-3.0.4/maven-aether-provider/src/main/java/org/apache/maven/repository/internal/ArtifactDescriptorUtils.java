package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RemoteRepository	TokenNameIdentifier	 Remote Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
;	TokenNameSEMICOLON	
/** * <strong>Warning:</strong> This is an internal utility class that is only public for technical reasons, it is not part * of the public API. In particular, this class can be changed or deleted without prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 <strong>Warning:</strong> This is an internal utility class that is only public for technical reasons, it is not part of the public API. In particular, this class can be changed or deleted without prior notice. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactDescriptorUtils	TokenNameIdentifier	 Artifact Descriptor Utils
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Artifact	TokenNameIdentifier	 Artifact
toPomArtifact	TokenNameIdentifier	 to Pom Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
pomArtifact	TokenNameIdentifier	 pom Artifact
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pomArtifact	TokenNameIdentifier	 pom Artifact
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
"pom"	TokenNameStringLiteral	pom
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pomArtifact	TokenNameIdentifier	 pom Artifact
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pomArtifact	TokenNameIdentifier	 pom Artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"pom"	TokenNameStringLiteral	pom
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pomArtifact	TokenNameIdentifier	 pom Artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RemoteRepository	TokenNameIdentifier	 Remote Repository
toRemoteRepository	TokenNameIdentifier	 to Remote Repository
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RemoteRepository	TokenNameIdentifier	 Remote Repository
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
RemoteRepository	TokenNameIdentifier	 Remote Repository
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setPolicy	TokenNameIdentifier	 set Policy
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
toRepositoryPolicy	TokenNameIdentifier	 to Repository Policy
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setPolicy	TokenNameIdentifier	 set Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
toRepositoryPolicy	TokenNameIdentifier	 to Repository Policy
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
toRepositoryPolicy	TokenNameIdentifier	 to Repository Policy
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
checksums	TokenNameIdentifier	 checksums
=	TokenNameEQUAL	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
.	TokenNameDOT	
CHECKSUM_POLICY_WARN	TokenNameIdentifier	 CHECKSUM  POLICY  WARN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
updates	TokenNameIdentifier	 updates
=	TokenNameEQUAL	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
.	TokenNameDOT	
UPDATE_POLICY_DAILY	TokenNameIdentifier	 UPDATE  POLICY  DAILY
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enabled	TokenNameIdentifier	 enabled
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updates	TokenNameIdentifier	 updates
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksums	TokenNameIdentifier	 checksums
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
(	TokenNameLPAREN	
enabled	TokenNameIdentifier	 enabled
,	TokenNameCOMMA	
updates	TokenNameIdentifier	 updates
,	TokenNameCOMMA	
checksums	TokenNameIdentifier	 checksums
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
