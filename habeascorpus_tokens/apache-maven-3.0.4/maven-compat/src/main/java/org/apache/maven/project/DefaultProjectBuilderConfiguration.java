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
class	TokenNameclass	
DefaultProjectBuilderConfiguration	TokenNameIdentifier	 Default Project Builder Configuration
implements	TokenNameimplements	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
{	TokenNameLBRACE	
private	TokenNameprivate	
ProfileManager	TokenNameIdentifier	 Profile Manager
globalProfileManager	TokenNameIdentifier	 global Profile Manager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
executionProperties	TokenNameIdentifier	 execution Properties
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultProjectBuilderConfiguration	TokenNameIdentifier	 Default Project Builder Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setGlobalProfileManager	TokenNameIdentifier	 set Global Profile Manager
(	TokenNameLPAREN	
ProfileManager	TokenNameIdentifier	 Profile Manager
globalProfileManager	TokenNameIdentifier	 global Profile Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
globalProfileManager	TokenNameIdentifier	 global Profile Manager
=	TokenNameEQUAL	
globalProfileManager	TokenNameIdentifier	 global Profile Manager
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProfileManager	TokenNameIdentifier	 Profile Manager
getGlobalProfileManager	TokenNameIdentifier	 get Global Profile Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
globalProfileManager	TokenNameIdentifier	 global Profile Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
localRepository	TokenNameIdentifier	 local Repository
=	TokenNameEQUAL	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localRepository	TokenNameIdentifier	 local Repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getExecutionProperties	TokenNameIdentifier	 get Execution Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executionProperties	TokenNameIdentifier	 execution Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setExecutionProperties	TokenNameIdentifier	 set Execution Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
executionProperties	TokenNameIdentifier	 execution Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executionProperties	TokenNameIdentifier	 execution Properties
=	TokenNameEQUAL	
executionProperties	TokenNameIdentifier	 execution Properties
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
getBuildStartTime	TokenNameIdentifier	 get Build Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildStartTime	TokenNameIdentifier	 build Start Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buildStartTime	TokenNameIdentifier	 build Start Time
=	TokenNameEQUAL	
buildStartTime	TokenNameIdentifier	 build Start Time
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
