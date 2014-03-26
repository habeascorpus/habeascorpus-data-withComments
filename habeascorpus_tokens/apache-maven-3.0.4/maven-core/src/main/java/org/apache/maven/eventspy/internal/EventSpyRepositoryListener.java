package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
eventspy	TokenNameIdentifier	 eventspy
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
AbstractRepositoryListener	TokenNameIdentifier	 Abstract Repository Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositoryEvent	TokenNameIdentifier	 Repository Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositoryListener	TokenNameIdentifier	 Repository Listener
;	TokenNameSEMICOLON	
/** * Forwards repository events to eventspies. */	TokenNameCOMMENT_JAVADOC	 Forwards repository events to eventspies. 
class	TokenNameclass	
EventSpyRepositoryListener	TokenNameIdentifier	 Event Spy Repository Listener
extends	TokenNameextends	
AbstractRepositoryListener	TokenNameIdentifier	 Abstract Repository Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
EventSpyDispatcher	TokenNameIdentifier	 Event Spy Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RepositoryListener	TokenNameIdentifier	 Repository Listener
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EventSpyRepositoryListener	TokenNameIdentifier	 Event Spy Repository Listener
(	TokenNameLPAREN	
EventSpyDispatcher	TokenNameIdentifier	 Event Spy Dispatcher
dispatcher	TokenNameIdentifier	 dispatcher
,	TokenNameCOMMA	
RepositoryListener	TokenNameIdentifier	 Repository Listener
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dispatcher	TokenNameIdentifier	 dispatcher
=	TokenNameEQUAL	
dispatcher	TokenNameIdentifier	 dispatcher
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactDeployed	TokenNameIdentifier	 artifact Deployed
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactDeployed	TokenNameIdentifier	 artifact Deployed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactDeploying	TokenNameIdentifier	 artifact Deploying
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactDeploying	TokenNameIdentifier	 artifact Deploying
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactDescriptorInvalid	TokenNameIdentifier	 artifact Descriptor Invalid
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactDescriptorInvalid	TokenNameIdentifier	 artifact Descriptor Invalid
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactDescriptorMissing	TokenNameIdentifier	 artifact Descriptor Missing
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactDescriptorMissing	TokenNameIdentifier	 artifact Descriptor Missing
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactInstalled	TokenNameIdentifier	 artifact Installed
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactInstalled	TokenNameIdentifier	 artifact Installed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactInstalling	TokenNameIdentifier	 artifact Installing
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactInstalling	TokenNameIdentifier	 artifact Installing
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactResolved	TokenNameIdentifier	 artifact Resolved
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactResolved	TokenNameIdentifier	 artifact Resolved
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactResolving	TokenNameIdentifier	 artifact Resolving
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactResolving	TokenNameIdentifier	 artifact Resolving
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataDeployed	TokenNameIdentifier	 metadata Deployed
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataDeployed	TokenNameIdentifier	 metadata Deployed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataDeploying	TokenNameIdentifier	 metadata Deploying
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataDeploying	TokenNameIdentifier	 metadata Deploying
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataInstalled	TokenNameIdentifier	 metadata Installed
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataInstalled	TokenNameIdentifier	 metadata Installed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataInstalling	TokenNameIdentifier	 metadata Installing
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataInstalling	TokenNameIdentifier	 metadata Installing
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataInvalid	TokenNameIdentifier	 metadata Invalid
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataInvalid	TokenNameIdentifier	 metadata Invalid
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataResolved	TokenNameIdentifier	 metadata Resolved
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataResolved	TokenNameIdentifier	 metadata Resolved
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataResolving	TokenNameIdentifier	 metadata Resolving
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataResolving	TokenNameIdentifier	 metadata Resolving
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactDownloaded	TokenNameIdentifier	 artifact Downloaded
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactDownloaded	TokenNameIdentifier	 artifact Downloaded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
artifactDownloading	TokenNameIdentifier	 artifact Downloading
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
artifactDownloading	TokenNameIdentifier	 artifact Downloading
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataDownloaded	TokenNameIdentifier	 metadata Downloaded
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataDownloaded	TokenNameIdentifier	 metadata Downloaded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
metadataDownloading	TokenNameIdentifier	 metadata Downloading
(	TokenNameLPAREN	
RepositoryEvent	TokenNameIdentifier	 Repository Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispatcher	TokenNameIdentifier	 dispatcher
.	TokenNameDOT	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
metadataDownloading	TokenNameIdentifier	 metadata Downloading
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
