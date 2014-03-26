package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
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
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
resolution	TokenNameIdentifier	 resolution
.	TokenNameDOT	
ModelResolver	TokenNameIdentifier	 Model Resolver
;	TokenNameSEMICOLON	
/** * A model building request that delegates all methods invocations to another request, meant for easy transformations by * subclassing. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A model building request that delegates all methods invocations to another request, meant for easy transformations by subclassing. * @author Benjamin Bentmann 
class	TokenNameclass	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
implements	TokenNameimplements	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
{	TokenNameLBRACE	
protected	TokenNameprotected	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
(	TokenNameLPAREN	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setPomFile	TokenNameIdentifier	 set Pom File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setPomFile	TokenNameIdentifier	 set Pom File
(	TokenNameLPAREN	
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelSource	TokenNameIdentifier	 Model Source
getModelSource	TokenNameIdentifier	 get Model Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelSource	TokenNameIdentifier	 get Model Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setModelSource	TokenNameIdentifier	 set Model Source
(	TokenNameLPAREN	
ModelSource	TokenNameIdentifier	 Model Source
modelSource	TokenNameIdentifier	 model Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setModelSource	TokenNameIdentifier	 set Model Source
(	TokenNameLPAREN	
modelSource	TokenNameIdentifier	 model Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getValidationLevel	TokenNameIdentifier	 get Validation Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getValidationLevel	TokenNameIdentifier	 get Validation Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
int	TokenNameint	
validationLevel	TokenNameIdentifier	 validation Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
validationLevel	TokenNameIdentifier	 validation Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isProcessPlugins	TokenNameIdentifier	 is Process Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isProcessPlugins	TokenNameIdentifier	 is Process Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
boolean	TokenNameboolean	
processPlugins	TokenNameIdentifier	 process Plugins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
processPlugins	TokenNameIdentifier	 process Plugins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isTwoPhaseBuilding	TokenNameIdentifier	 is Two Phase Building
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isTwoPhaseBuilding	TokenNameIdentifier	 is Two Phase Building
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setTwoPhaseBuilding	TokenNameIdentifier	 set Two Phase Building
(	TokenNameLPAREN	
boolean	TokenNameboolean	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setTwoPhaseBuilding	TokenNameIdentifier	 set Two Phase Building
(	TokenNameLPAREN	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLocationTracking	TokenNameIdentifier	 is Location Tracking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isLocationTracking	TokenNameIdentifier	 is Location Tracking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setLocationTracking	TokenNameIdentifier	 set Location Tracking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
locationTracking	TokenNameIdentifier	 location Tracking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setLocationTracking	TokenNameIdentifier	 set Location Tracking
(	TokenNameLPAREN	
locationTracking	TokenNameIdentifier	 location Tracking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
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
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
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
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getBuildStartTime	TokenNameIdentifier	 get Build Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
buildStartTime	TokenNameIdentifier	 build Start Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelResolver	TokenNameIdentifier	 Model Resolver
getModelResolver	TokenNameIdentifier	 get Model Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelResolver	TokenNameIdentifier	 get Model Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setModelResolver	TokenNameIdentifier	 set Model Resolver
(	TokenNameLPAREN	
ModelResolver	TokenNameIdentifier	 Model Resolver
modelResolver	TokenNameIdentifier	 model Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setModelResolver	TokenNameIdentifier	 set Model Resolver
(	TokenNameLPAREN	
modelResolver	TokenNameIdentifier	 model Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
getModelBuildingListener	TokenNameIdentifier	 get Model Building Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelBuildingListener	TokenNameIdentifier	 get Model Building Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
setModelBuildingListener	TokenNameIdentifier	 set Model Building Listener
(	TokenNameLPAREN	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
modelBuildingListener	TokenNameIdentifier	 model Building Listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setModelBuildingListener	TokenNameIdentifier	 set Model Building Listener
(	TokenNameLPAREN	
modelBuildingListener	TokenNameIdentifier	 model Building Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelCache	TokenNameIdentifier	 Model Cache
getModelCache	TokenNameIdentifier	 get Model Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelCache	TokenNameIdentifier	 get Model Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilterModelBuildingRequest	TokenNameIdentifier	 Filter Model Building Request
setModelCache	TokenNameIdentifier	 set Model Cache
(	TokenNameLPAREN	
ModelCache	TokenNameIdentifier	 Model Cache
modelCache	TokenNameIdentifier	 model Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setModelCache	TokenNameIdentifier	 set Model Cache
(	TokenNameLPAREN	
modelCache	TokenNameIdentifier	 model Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
