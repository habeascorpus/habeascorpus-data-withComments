package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
/** * * @author Jason van Zyl * */	TokenNameCOMMENT_JAVADOC	 * @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
MetadataResolution	TokenNameIdentifier	 Metadata Resolution
{	TokenNameLBRACE	
/** resolved MD */	TokenNameCOMMENT_JAVADOC	 resolved MD 
private	TokenNameprivate	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
artifactMetadata	TokenNameIdentifier	 artifact Metadata
;	TokenNameSEMICOLON	
/** repositories, added by this POM */	TokenNameCOMMENT_JAVADOC	 repositories, added by this POM 
private	TokenNameprivate	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
;	TokenNameSEMICOLON	
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataResolution	TokenNameIdentifier	 Metadata Resolution
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
artifactMetadata	TokenNameIdentifier	 artifact Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
=	TokenNameEQUAL	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataResolution	TokenNameIdentifier	 Metadata Resolution
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
artifactMetadata	TokenNameIdentifier	 artifact Metadata
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
=	TokenNameEQUAL	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getMetadataRepositories	TokenNameIdentifier	 get Metadata Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMetadataRepositories	TokenNameIdentifier	 set Metadata Repositories
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
=	TokenNameEQUAL	
metadataRepositories	TokenNameIdentifier	 metadata Repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
getArtifactMetadata	TokenNameIdentifier	 get Artifact Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactMetadata	TokenNameIdentifier	 set Artifact Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
artifactMetadata	TokenNameIdentifier	 artifact Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
=	TokenNameEQUAL	
artifactMetadata	TokenNameIdentifier	 artifact Metadata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
}	TokenNameRBRACE	
