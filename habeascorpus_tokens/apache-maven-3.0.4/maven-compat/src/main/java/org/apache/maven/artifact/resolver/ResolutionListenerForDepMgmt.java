package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Do not use! * <p/> * Should only be implmemented by DebugResolutionListener. Remove this * when the ResolutionListener interface deprecation of the manageArtifact * method (and the [yet to be done] addition of these methods to that * interface) has had a chance to propagate to all interested plugins. */	TokenNameCOMMENT_JAVADOC	 Do not use! <p/> Should only be implmemented by DebugResolutionListener. Remove this when the ResolutionListener interface deprecation of the manageArtifact method (and the [yet to be done] addition of these methods to that interface) has had a chance to propagate to all interested plugins. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
ResolutionListenerForDepMgmt	TokenNameIdentifier	 Resolution Listener For Dep Mgmt
{	TokenNameLBRACE	
void	TokenNamevoid	
manageArtifactVersion	TokenNameIdentifier	 manage Artifact Version
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
manageArtifactScope	TokenNameIdentifier	 manage Artifact Scope
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
manageArtifactSystemPath	TokenNameIdentifier	 manage Artifact System Path
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
