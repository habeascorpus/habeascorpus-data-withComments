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
ArrayList	TokenNameIdentifier	 Array List
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
/** * Collects settings that control building of effective models. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings that control building of effective models. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
implements	TokenNameimplements	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ModelSource	TokenNameIdentifier	 Model Source
modelSource	TokenNameIdentifier	 model Source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
validationLevel	TokenNameIdentifier	 validation Level
=	TokenNameEQUAL	
VALIDATION_LEVEL_STRICT	TokenNameIdentifier	 VALIDATION  LEVEL  STRICT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
processPlugins	TokenNameIdentifier	 process Plugins
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
locationTracking	TokenNameIdentifier	 location Tracking
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Date	TokenNameIdentifier	 Date
buildStartTime	TokenNameIdentifier	 build Start Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ModelResolver	TokenNameIdentifier	 Model Resolver
modelResolver	TokenNameIdentifier	 model Resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
modelBuildingListener	TokenNameIdentifier	 model Building Listener
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ModelCache	TokenNameIdentifier	 Model Cache
modelCache	TokenNameIdentifier	 model Cache
;	TokenNameSEMICOLON	
/** * Creates an empty request. */	TokenNameCOMMENT_JAVADOC	 Creates an empty request. 
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a shallow copy of the specified request. * * @param request The request to copy, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a shallow copy of the specified request. * @param request The request to copy, must not be {@code null}. 
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
(	TokenNameLPAREN	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPomFile	TokenNameIdentifier	 set Pom File
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setModelSource	TokenNameIdentifier	 set Model Source
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelSource	TokenNameIdentifier	 get Model Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getValidationLevel	TokenNameIdentifier	 get Validation Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isProcessPlugins	TokenNameIdentifier	 is Process Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTwoPhaseBuilding	TokenNameIdentifier	 set Two Phase Building
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isTwoPhaseBuilding	TokenNameIdentifier	 is Two Phase Building
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBuildStartTime	TokenNameIdentifier	 set Build Start Time
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getBuildStartTime	TokenNameIdentifier	 get Build Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setModelResolver	TokenNameIdentifier	 set Model Resolver
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelResolver	TokenNameIdentifier	 get Model Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setModelBuildingListener	TokenNameIdentifier	 set Model Building Listener
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelBuildingListener	TokenNameIdentifier	 get Model Building Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setModelCache	TokenNameIdentifier	 set Model Cache
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getModelCache	TokenNameIdentifier	 get Model Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setPomFile	TokenNameIdentifier	 set Pom File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pomFile	TokenNameIdentifier	 pom File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pomFile	TokenNameIdentifier	 pom File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
pomFile	TokenNameIdentifier	 pom File
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
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
modelSource	TokenNameIdentifier	 model Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setModelSource	TokenNameIdentifier	 set Model Source
(	TokenNameLPAREN	
ModelSource	TokenNameIdentifier	 Model Source
modelSource	TokenNameIdentifier	 model Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
modelSource	TokenNameIdentifier	 model Source
=	TokenNameEQUAL	
modelSource	TokenNameIdentifier	 model Source
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
validationLevel	TokenNameIdentifier	 validation Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
int	TokenNameint	
validationLevel	TokenNameIdentifier	 validation Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
validationLevel	TokenNameIdentifier	 validation Level
=	TokenNameEQUAL	
validationLevel	TokenNameIdentifier	 validation Level
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
processPlugins	TokenNameIdentifier	 process Plugins
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setProcessPlugins	TokenNameIdentifier	 set Process Plugins
(	TokenNameLPAREN	
boolean	TokenNameboolean	
processPlugins	TokenNameIdentifier	 process Plugins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
processPlugins	TokenNameIdentifier	 process Plugins
=	TokenNameEQUAL	
processPlugins	TokenNameIdentifier	 process Plugins
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
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setTwoPhaseBuilding	TokenNameIdentifier	 set Two Phase Building
(	TokenNameLPAREN	
boolean	TokenNameboolean	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
=	TokenNameEQUAL	
twoPhaseBuilding	TokenNameIdentifier	 two Phase Building
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
locationTracking	TokenNameIdentifier	 location Tracking
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setLocationTracking	TokenNameIdentifier	 set Location Tracking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
locationTracking	TokenNameIdentifier	 location Tracking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
locationTracking	TokenNameIdentifier	 location Tracking
=	TokenNameEQUAL	
locationTracking	TokenNameIdentifier	 location Tracking
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
if	TokenNameif	
(	TokenNameLPAREN	
profiles	TokenNameIdentifier	 profiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profiles	TokenNameIdentifier	 profiles
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
profiles	TokenNameIdentifier	 profiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
profiles	TokenNameIdentifier	 profiles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
(	TokenNameLPAREN	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
systemProperties	TokenNameIdentifier	 system Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
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
public	TokenNamepublic	
ModelResolver	TokenNameIdentifier	 Model Resolver
getModelResolver	TokenNameIdentifier	 get Model Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
modelResolver	TokenNameIdentifier	 model Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setModelResolver	TokenNameIdentifier	 set Model Resolver
(	TokenNameLPAREN	
ModelResolver	TokenNameIdentifier	 Model Resolver
modelResolver	TokenNameIdentifier	 model Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
modelResolver	TokenNameIdentifier	 model Resolver
=	TokenNameEQUAL	
modelResolver	TokenNameIdentifier	 model Resolver
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
modelBuildingListener	TokenNameIdentifier	 model Building Listener
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
this	TokenNamethis	
.	TokenNameDOT	
modelBuildingListener	TokenNameIdentifier	 model Building Listener
=	TokenNameEQUAL	
modelBuildingListener	TokenNameIdentifier	 model Building Listener
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
this	TokenNamethis	
.	TokenNameDOT	
modelCache	TokenNameIdentifier	 model Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
setModelCache	TokenNameIdentifier	 set Model Cache
(	TokenNameLPAREN	
ModelCache	TokenNameIdentifier	 Model Cache
modelCache	TokenNameIdentifier	 model Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
modelCache	TokenNameIdentifier	 model Cache
=	TokenNameEQUAL	
modelCache	TokenNameIdentifier	 model Cache
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
