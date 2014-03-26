package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
ProfileManager	TokenNameIdentifier	 Profile Manager
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
{	TokenNameLBRACE	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProfileManager	TokenNameIdentifier	 Profile Manager
getGlobalProfileManager	TokenNameIdentifier	 get Global Profile Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
getExecutionProperties	TokenNameIdentifier	 get Execution Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setGlobalProfileManager	TokenNameIdentifier	 set Global Profile Manager
(	TokenNameLPAREN	
ProfileManager	TokenNameIdentifier	 Profile Manager
globalProfileManager	TokenNameIdentifier	 global Profile Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setExecutionProperties	TokenNameIdentifier	 set Execution Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
executionProperties	TokenNameIdentifier	 execution Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
getBuildStartTime	TokenNameIdentifier	 get Build Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
