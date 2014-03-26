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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
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
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
UnsupportedProtocolException	TokenNameIdentifier	 Unsupported Protocol Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
Wagon	TokenNameIdentifier	 Wagon
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
TransferListener	TokenNameIdentifier	 Transfer Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
WagonManager	TokenNameIdentifier	 Wagon Manager
{	TokenNameLBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
Wagon	TokenNameIdentifier	 Wagon
getWagon	TokenNameIdentifier	 get Wagon
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedProtocolException	TokenNameIdentifier	 Unsupported Protocol Exception
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
Wagon	TokenNameIdentifier	 Wagon
getWagon	TokenNameIdentifier	 get Wagon
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedProtocolException	TokenNameIdentifier	 Unsupported Protocol Exception
,	TokenNameCOMMA	
WagonConfigurationException	TokenNameIdentifier	 Wagon Configuration Exception
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Retriever 	TokenNameCOMMENT_LINE	Retriever 
// 	TokenNameCOMMENT_LINE	 
void	TokenNamevoid	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
transferListener	TokenNameIdentifier	 transfer Listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
force	TokenNameIdentifier	 force
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
remoteRepositories	TokenNameIdentifier	 remote Repositories
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
transferListener	TokenNameIdentifier	 transfer Listener
,	TokenNameCOMMA	
boolean	TokenNameboolean	
force	TokenNameIdentifier	 force
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
getRemoteFile	TokenNameIdentifier	 get Remote File
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
remotePath	TokenNameIdentifier	 remote Path
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
downloadMonitor	TokenNameIdentifier	 download Monitor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
checksumPolicy	TokenNameIdentifier	 checksum Policy
,	TokenNameCOMMA	
boolean	TokenNameboolean	
force	TokenNameIdentifier	 force
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
getArtifactMetadata	TokenNameIdentifier	 get Artifact Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
checksumPolicy	TokenNameIdentifier	 checksum Policy
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
getArtifactMetadataFromDeploymentRepository	TokenNameIdentifier	 get Artifact Metadata From Deployment Repository
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
checksumPolicyWarn	TokenNameIdentifier	 checksum Policy Warn
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Deployer 	TokenNameCOMMENT_LINE	Deployer 
// 	TokenNameCOMMENT_LINE	 
void	TokenNamevoid	
putArtifact	TokenNameIdentifier	 put Artifact
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
deploymentRepository	TokenNameIdentifier	 deployment Repository
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
downloadMonitor	TokenNameIdentifier	 download Monitor
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
putRemoteFile	TokenNameIdentifier	 put Remote File
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
remotePath	TokenNameIdentifier	 remote Path
,	TokenNameCOMMA	
TransferListener	TokenNameIdentifier	 Transfer Listener
downloadMonitor	TokenNameIdentifier	 download Monitor
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
;	TokenNameSEMICOLON	
void	TokenNamevoid	
putArtifactMetadata	TokenNameIdentifier	 put Artifact Metadata
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
artifactMetadata	TokenNameIdentifier	 artifact Metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
