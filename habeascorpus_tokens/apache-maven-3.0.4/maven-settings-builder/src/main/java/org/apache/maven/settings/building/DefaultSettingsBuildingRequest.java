package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * Collects settings that control building of effective settings. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings that control building of effective settings. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
implements	TokenNameimplements	
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
globalSettingsFile	TokenNameIdentifier	 global Settings File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
userSettingsFile	TokenNameIdentifier	 user Settings File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SettingsSource	TokenNameIdentifier	 Settings Source
globalSettingsSource	TokenNameIdentifier	 global Settings Source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SettingsSource	TokenNameIdentifier	 Settings Source
userSettingsSource	TokenNameIdentifier	 user Settings Source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getGlobalSettingsFile	TokenNameIdentifier	 get Global Settings File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
globalSettingsFile	TokenNameIdentifier	 global Settings File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
setGlobalSettingsFile	TokenNameIdentifier	 set Global Settings File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
globalSettingsFile	TokenNameIdentifier	 global Settings File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
globalSettingsFile	TokenNameIdentifier	 global Settings File
=	TokenNameEQUAL	
globalSettingsFile	TokenNameIdentifier	 global Settings File
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SettingsSource	TokenNameIdentifier	 Settings Source
getGlobalSettingsSource	TokenNameIdentifier	 get Global Settings Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
globalSettingsSource	TokenNameIdentifier	 global Settings Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
setGlobalSettingsSource	TokenNameIdentifier	 set Global Settings Source
(	TokenNameLPAREN	
SettingsSource	TokenNameIdentifier	 Settings Source
globalSettingsSource	TokenNameIdentifier	 global Settings Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
globalSettingsSource	TokenNameIdentifier	 global Settings Source
=	TokenNameEQUAL	
globalSettingsSource	TokenNameIdentifier	 global Settings Source
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getUserSettingsFile	TokenNameIdentifier	 get User Settings File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userSettingsFile	TokenNameIdentifier	 user Settings File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
setUserSettingsFile	TokenNameIdentifier	 set User Settings File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
userSettingsFile	TokenNameIdentifier	 user Settings File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userSettingsFile	TokenNameIdentifier	 user Settings File
=	TokenNameEQUAL	
userSettingsFile	TokenNameIdentifier	 user Settings File
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SettingsSource	TokenNameIdentifier	 Settings Source
getUserSettingsSource	TokenNameIdentifier	 get User Settings Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userSettingsSource	TokenNameIdentifier	 user Settings Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
setUserSettingsSource	TokenNameIdentifier	 set User Settings Source
(	TokenNameLPAREN	
SettingsSource	TokenNameIdentifier	 Settings Source
userSettingsSource	TokenNameIdentifier	 user Settings Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userSettingsSource	TokenNameIdentifier	 user Settings Source
=	TokenNameEQUAL	
userSettingsSource	TokenNameIdentifier	 user Settings Source
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
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
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
DefaultSettingsBuildingRequest	TokenNameIdentifier	 Default Settings Building Request
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
}	TokenNameRBRACE	
