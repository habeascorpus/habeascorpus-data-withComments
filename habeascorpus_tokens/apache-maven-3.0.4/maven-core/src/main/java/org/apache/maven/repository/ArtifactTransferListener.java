package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactTransferListener	TokenNameIdentifier	 Artifact Transfer Listener
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isShowChecksumEvents	TokenNameIdentifier	 is Show Checksum Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setShowChecksumEvents	TokenNameIdentifier	 set Show Checksum Events
(	TokenNameLPAREN	
boolean	TokenNameboolean	
showChecksumEvents	TokenNameIdentifier	 show Checksum Events
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
transferInitiated	TokenNameIdentifier	 transfer Initiated
(	TokenNameLPAREN	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
transferStarted	TokenNameIdentifier	 transfer Started
(	TokenNameLPAREN	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
transferProgress	TokenNameIdentifier	 transfer Progress
(	TokenNameLPAREN	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
transferCompleted	TokenNameIdentifier	 transfer Completed
(	TokenNameLPAREN	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
