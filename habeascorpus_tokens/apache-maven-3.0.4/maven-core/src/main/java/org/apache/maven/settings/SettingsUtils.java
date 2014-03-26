package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationFile	TokenNameIdentifier	 Activation File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
MavenSettingsMerger	TokenNameIdentifier	 Maven Settings Merger
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Several convenience methods to handle settings * * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a> */	TokenNameCOMMENT_JAVADOC	 Several convenience methods to handle settings * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SettingsUtils	TokenNameIdentifier	 Settings Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
SettingsUtils	TokenNameIdentifier	 Settings Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't allow construction. 	TokenNameCOMMENT_LINE	don't allow construction. 
}	TokenNameRBRACE	
/** * @param dominant * @param recessive * @param recessiveSourceLevel */	TokenNameCOMMENT_JAVADOC	 @param dominant @param recessive @param recessiveSourceLevel 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Settings	TokenNameIdentifier	 Settings
dominant	TokenNameIdentifier	 dominant
,	TokenNameCOMMA	
Settings	TokenNameIdentifier	 Settings
recessive	TokenNameIdentifier	 recessive
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
MavenSettingsMerger	TokenNameIdentifier	 Maven Settings Merger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
,	TokenNameCOMMA	
recessive	TokenNameIdentifier	 recessive
,	TokenNameCOMMA	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param settingsProfile * @return a profile */	TokenNameCOMMENT_JAVADOC	 @param settingsProfile @return a profile 
public	TokenNamepublic	
static	TokenNamestatic	
Profile	TokenNameIdentifier	 Profile
convertToSettingsProfile	TokenNameIdentifier	 convert To Settings Profile
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
modelProfile	TokenNameIdentifier	 model Profile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
modelProfile	TokenNameIdentifier	 model Profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Activation	TokenNameIdentifier	 Activation
modelActivation	TokenNameIdentifier	 model Activation
=	TokenNameEQUAL	
modelProfile	TokenNameIdentifier	 model Profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
modelActivation	TokenNameIdentifier	 model Activation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Activation	TokenNameIdentifier	 Activation
activation	TokenNameIdentifier	 activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setActiveByDefault	TokenNameIdentifier	 set Active By Default
(	TokenNameLPAREN	
modelActivation	TokenNameIdentifier	 model Activation
.	TokenNameDOT	
isActiveByDefault	TokenNameIdentifier	 is Active By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setJdk	TokenNameIdentifier	 set Jdk
(	TokenNameLPAREN	
modelActivation	TokenNameIdentifier	 model Activation
.	TokenNameDOT	
getJdk	TokenNameIdentifier	 get Jdk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationProperty	TokenNameIdentifier	 Activation Property
modelProp	TokenNameIdentifier	 model Prop
=	TokenNameEQUAL	
modelActivation	TokenNameIdentifier	 model Activation
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
modelProp	TokenNameIdentifier	 model Prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ActivationProperty	TokenNameIdentifier	 Activation Property
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
modelProp	TokenNameIdentifier	 model Prop
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
modelProp	TokenNameIdentifier	 model Prop
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationOS	TokenNameIdentifier	 Activation OS
modelOs	TokenNameIdentifier	 model Os
=	TokenNameEQUAL	
modelActivation	TokenNameIdentifier	 model Activation
.	TokenNameDOT	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
modelOs	TokenNameIdentifier	 model Os
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ActivationOS	TokenNameIdentifier	 Activation OS
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationOS	TokenNameIdentifier	 Activation OS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setArch	TokenNameIdentifier	 set Arch
(	TokenNameLPAREN	
modelOs	TokenNameIdentifier	 model Os
.	TokenNameDOT	
getArch	TokenNameIdentifier	 get Arch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setFamily	TokenNameIdentifier	 set Family
(	TokenNameLPAREN	
modelOs	TokenNameIdentifier	 model Os
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
modelOs	TokenNameIdentifier	 model Os
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
modelOs	TokenNameIdentifier	 model Os
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setOs	TokenNameIdentifier	 set Os
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ActivationFile	TokenNameIdentifier	 Activation File
modelFile	TokenNameIdentifier	 model File
=	TokenNameEQUAL	
modelActivation	TokenNameIdentifier	 model Activation
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
modelFile	TokenNameIdentifier	 model File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
ActivationFile	TokenNameIdentifier	 Activation File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
ActivationFile	TokenNameIdentifier	 Activation File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
modelFile	TokenNameIdentifier	 model File
.	TokenNameDOT	
getExists	TokenNameIdentifier	 get Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setMissing	TokenNameIdentifier	 set Missing
(	TokenNameLPAREN	
modelFile	TokenNameIdentifier	 model File
.	TokenNameDOT	
getMissing	TokenNameIdentifier	 get Missing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
activation	TokenNameIdentifier	 activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
modelProfile	TokenNameIdentifier	 model Profile
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
>	TokenNameGREATER	
repos	TokenNameIdentifier	 repos
=	TokenNameEQUAL	
modelProfile	TokenNameIdentifier	 model Profile
.	TokenNameDOT	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repos	TokenNameIdentifier	 repos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
repo	TokenNameIdentifier	 repo
:	TokenNameCOLON	
repos	TokenNameIdentifier	 repos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
convertToSettingsRepository	TokenNameIdentifier	 convert To Settings Repository
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
>	TokenNameGREATER	
pluginRepos	TokenNameIdentifier	 plugin Repos
=	TokenNameEQUAL	
modelProfile	TokenNameIdentifier	 model Profile
.	TokenNameDOT	
getPluginRepositories	TokenNameIdentifier	 get Plugin Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pluginRepos	TokenNameIdentifier	 plugin Repos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
pluginRepo	TokenNameIdentifier	 plugin Repo
:	TokenNameCOLON	
pluginRepos	TokenNameIdentifier	 plugin Repos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addPluginRepository	TokenNameIdentifier	 add Plugin Repository
(	TokenNameLPAREN	
convertToSettingsRepository	TokenNameIdentifier	 convert To Settings Repository
(	TokenNameLPAREN	
pluginRepo	TokenNameIdentifier	 plugin Repo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
profile	TokenNameIdentifier	 profile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param settingsProfile * @return a profile */	TokenNameCOMMENT_JAVADOC	 @param settingsProfile @return a profile 
public	TokenNamepublic	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
convertFromSettingsProfile	TokenNameIdentifier	 convert From Settings Profile
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
settingsProfile	TokenNameIdentifier	 settings Profile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
settingsProfile	TokenNameIdentifier	 settings Profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
"settings.xml"	TokenNameStringLiteral	settings.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
settingsActivation	TokenNameIdentifier	 settings Activation
=	TokenNameEQUAL	
settingsProfile	TokenNameIdentifier	 settings Profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
settingsActivation	TokenNameIdentifier	 settings Activation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Activation	TokenNameIdentifier	 Activation
activation	TokenNameIdentifier	 activation
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setActiveByDefault	TokenNameIdentifier	 set Active By Default
(	TokenNameLPAREN	
settingsActivation	TokenNameIdentifier	 settings Activation
.	TokenNameDOT	
isActiveByDefault	TokenNameIdentifier	 is Active By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setJdk	TokenNameIdentifier	 set Jdk
(	TokenNameLPAREN	
settingsActivation	TokenNameIdentifier	 settings Activation
.	TokenNameDOT	
getJdk	TokenNameIdentifier	 get Jdk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ActivationProperty	TokenNameIdentifier	 Activation Property
settingsProp	TokenNameIdentifier	 settings Prop
=	TokenNameEQUAL	
settingsActivation	TokenNameIdentifier	 settings Activation
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
settingsProp	TokenNameIdentifier	 settings Prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationProperty	TokenNameIdentifier	 Activation Property
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
settingsProp	TokenNameIdentifier	 settings Prop
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
settingsProp	TokenNameIdentifier	 settings Prop
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ActivationOS	TokenNameIdentifier	 Activation OS
settingsOs	TokenNameIdentifier	 settings Os
=	TokenNameEQUAL	
settingsActivation	TokenNameIdentifier	 settings Activation
.	TokenNameDOT	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
settingsOs	TokenNameIdentifier	 settings Os
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationOS	TokenNameIdentifier	 Activation OS
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ActivationOS	TokenNameIdentifier	 Activation OS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setArch	TokenNameIdentifier	 set Arch
(	TokenNameLPAREN	
settingsOs	TokenNameIdentifier	 settings Os
.	TokenNameDOT	
getArch	TokenNameIdentifier	 get Arch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setFamily	TokenNameIdentifier	 set Family
(	TokenNameLPAREN	
settingsOs	TokenNameIdentifier	 settings Os
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
settingsOs	TokenNameIdentifier	 settings Os
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
settingsOs	TokenNameIdentifier	 settings Os
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setOs	TokenNameIdentifier	 set Os
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
ActivationFile	TokenNameIdentifier	 Activation File
settingsFile	TokenNameIdentifier	 settings File
=	TokenNameEQUAL	
settingsActivation	TokenNameIdentifier	 settings Activation
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
settingsFile	TokenNameIdentifier	 settings File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ActivationFile	TokenNameIdentifier	 Activation File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationFile	TokenNameIdentifier	 Activation File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
settingsFile	TokenNameIdentifier	 settings File
.	TokenNameDOT	
getExists	TokenNameIdentifier	 get Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setMissing	TokenNameIdentifier	 set Missing
(	TokenNameLPAREN	
settingsFile	TokenNameIdentifier	 settings File
.	TokenNameDOT	
getMissing	TokenNameIdentifier	 get Missing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
activation	TokenNameIdentifier	 activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
settingsProfile	TokenNameIdentifier	 settings Profile
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Repository	TokenNameIdentifier	 Repository
>	TokenNameGREATER	
repos	TokenNameIdentifier	 repos
=	TokenNameEQUAL	
settingsProfile	TokenNameIdentifier	 settings Profile
.	TokenNameDOT	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repos	TokenNameIdentifier	 repos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
repo	TokenNameIdentifier	 repo
:	TokenNameCOLON	
repos	TokenNameIdentifier	 repos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
convertFromSettingsRepository	TokenNameIdentifier	 convert From Settings Repository
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Repository	TokenNameIdentifier	 Repository
>	TokenNameGREATER	
pluginRepos	TokenNameIdentifier	 plugin Repos
=	TokenNameEQUAL	
settingsProfile	TokenNameIdentifier	 settings Profile
.	TokenNameDOT	
getPluginRepositories	TokenNameIdentifier	 get Plugin Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pluginRepos	TokenNameIdentifier	 plugin Repos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
pluginRepo	TokenNameIdentifier	 plugin Repo
:	TokenNameCOLON	
pluginRepos	TokenNameIdentifier	 plugin Repos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addPluginRepository	TokenNameIdentifier	 add Plugin Repository
(	TokenNameLPAREN	
convertFromSettingsRepository	TokenNameIdentifier	 convert From Settings Repository
(	TokenNameLPAREN	
pluginRepo	TokenNameIdentifier	 plugin Repo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
profile	TokenNameIdentifier	 profile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param settingsRepo * @return a repository */	TokenNameCOMMENT_JAVADOC	 @param settingsRepo @return a repository 
private	TokenNameprivate	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
convertFromSettingsRepository	TokenNameIdentifier	 convert From Settings Repository
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
settingsRepo	TokenNameIdentifier	 settings Repo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setSnapshots	TokenNameIdentifier	 set Snapshots
(	TokenNameLPAREN	
convertRepositoryPolicy	TokenNameIdentifier	 convert Repository Policy
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setReleases	TokenNameIdentifier	 set Releases
(	TokenNameLPAREN	
convertRepositoryPolicy	TokenNameIdentifier	 convert Repository Policy
(	TokenNameLPAREN	
settingsRepo	TokenNameIdentifier	 settings Repo
.	TokenNameDOT	
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
repo	TokenNameIdentifier	 repo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param settingsPolicy * @return a RepositoryPolicy */	TokenNameCOMMENT_JAVADOC	 @param settingsPolicy @return a RepositoryPolicy 
private	TokenNameprivate	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
convertRepositoryPolicy	TokenNameIdentifier	 convert Repository Policy
(	TokenNameLPAREN	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
settingsPolicy	TokenNameIdentifier	 settings Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
policy	TokenNameIdentifier	 policy
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
settingsPolicy	TokenNameIdentifier	 settings Policy
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
setUpdatePolicy	TokenNameIdentifier	 set Update Policy
(	TokenNameLPAREN	
settingsPolicy	TokenNameIdentifier	 settings Policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
setChecksumPolicy	TokenNameIdentifier	 set Checksum Policy
(	TokenNameLPAREN	
settingsPolicy	TokenNameIdentifier	 settings Policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param modelRepo * @return a repository */	TokenNameCOMMENT_JAVADOC	 @param modelRepo @return a repository 
private	TokenNameprivate	
static	TokenNamestatic	
Repository	TokenNameIdentifier	 Repository
convertToSettingsRepository	TokenNameIdentifier	 convert To Settings Repository
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
modelRepo	TokenNameIdentifier	 model Repo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Repository	TokenNameIdentifier	 Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
new	TokenNamenew	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setSnapshots	TokenNameIdentifier	 set Snapshots
(	TokenNameLPAREN	
convertRepositoryPolicy	TokenNameIdentifier	 convert Repository Policy
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setReleases	TokenNameIdentifier	 set Releases
(	TokenNameLPAREN	
convertRepositoryPolicy	TokenNameIdentifier	 convert Repository Policy
(	TokenNameLPAREN	
modelRepo	TokenNameIdentifier	 model Repo
.	TokenNameDOT	
getReleases	TokenNameIdentifier	 get Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
repo	TokenNameIdentifier	 repo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param modelPolicy * @return a RepositoryPolicy */	TokenNameCOMMENT_JAVADOC	 @param modelPolicy @return a RepositoryPolicy 
private	TokenNameprivate	
static	TokenNamestatic	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
convertRepositoryPolicy	TokenNameIdentifier	 convert Repository Policy
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
modelPolicy	TokenNameIdentifier	 model Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
policy	TokenNameIdentifier	 policy
=	TokenNameEQUAL	
new	TokenNamenew	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
modelPolicy	TokenNameIdentifier	 model Policy
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
setUpdatePolicy	TokenNameIdentifier	 set Update Policy
(	TokenNameLPAREN	
modelPolicy	TokenNameIdentifier	 model Policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
setChecksumPolicy	TokenNameIdentifier	 set Checksum Policy
(	TokenNameLPAREN	
modelPolicy	TokenNameIdentifier	 model Policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param settings could be null * @return a new instance of settings or null if settings was null. */	TokenNameCOMMENT_JAVADOC	 @param settings could be null @return a new instance of settings or null if settings was null. 
public	TokenNamepublic	
static	TokenNamestatic	
Settings	TokenNameIdentifier	 Settings
copySettings	TokenNameIdentifier	 copy Settings
(	TokenNameLPAREN	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Settings	TokenNameIdentifier	 Settings
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setActiveProfiles	TokenNameIdentifier	 set Active Profiles
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setInteractiveMode	TokenNameIdentifier	 set Interactive Mode
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
isInteractiveMode	TokenNameIdentifier	 is Interactive Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setMirrors	TokenNameIdentifier	 set Mirrors
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getMirrors	TokenNameIdentifier	 get Mirrors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setModelEncoding	TokenNameIdentifier	 set Model Encoding
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getModelEncoding	TokenNameIdentifier	 get Model Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setOffline	TokenNameIdentifier	 set Offline
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
isOffline	TokenNameIdentifier	 is Offline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPluginGroups	TokenNameIdentifier	 set Plugin Groups
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setProfiles	TokenNameIdentifier	 set Profiles
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setProxies	TokenNameIdentifier	 set Proxies
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setServers	TokenNameIdentifier	 set Servers
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setSourceLevel	TokenNameIdentifier	 set Source Level
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getSourceLevel	TokenNameIdentifier	 get Source Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setUsePluginRegistry	TokenNameIdentifier	 set Use Plugin Registry
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
isUsePluginRegistry	TokenNameIdentifier	 is Use Plugin Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
