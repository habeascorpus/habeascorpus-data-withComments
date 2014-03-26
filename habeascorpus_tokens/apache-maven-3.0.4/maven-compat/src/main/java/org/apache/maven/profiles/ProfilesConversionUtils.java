package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
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
Activation	TokenNameIdentifier	 Activation
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
ActivationFile	TokenNameIdentifier	 Activation File
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
ActivationProperty	TokenNameIdentifier	 Activation Property
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
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
ProfilesConversionUtils	TokenNameIdentifier	 Profiles Conversion Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
ProfilesConversionUtils	TokenNameIdentifier	 Profiles Conversion Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Profile	TokenNameIdentifier	 Profile
convertFromProfileXmlProfile	TokenNameIdentifier	 convert From Profile Xml Profile
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
profileXmlProfile	TokenNameIdentifier	 profile Xml Profile
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
profileXmlProfile	TokenNameIdentifier	 profile Xml Profile
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
"profiles.xml"	TokenNameStringLiteral	profiles.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
Activation	TokenNameIdentifier	 Activation
profileActivation	TokenNameIdentifier	 profile Activation
=	TokenNameEQUAL	
profileXmlProfile	TokenNameIdentifier	 profile Xml Profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
profileActivation	TokenNameIdentifier	 profile Activation
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
profileActivation	TokenNameIdentifier	 profile Activation
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
profileActivation	TokenNameIdentifier	 profile Activation
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
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
ActivationProperty	TokenNameIdentifier	 Activation Property
profileProp	TokenNameIdentifier	 profile Prop
=	TokenNameEQUAL	
profileActivation	TokenNameIdentifier	 profile Activation
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
profileProp	TokenNameIdentifier	 profile Prop
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
profileProp	TokenNameIdentifier	 profile Prop
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
profileProp	TokenNameIdentifier	 profile Prop
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
profileOs	TokenNameIdentifier	 profile Os
=	TokenNameEQUAL	
profileActivation	TokenNameIdentifier	 profile Activation
.	TokenNameDOT	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
profileOs	TokenNameIdentifier	 profile Os
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
profileOs	TokenNameIdentifier	 profile Os
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
profileOs	TokenNameIdentifier	 profile Os
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
profileOs	TokenNameIdentifier	 profile Os
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
profileOs	TokenNameIdentifier	 profile Os
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
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
ActivationFile	TokenNameIdentifier	 Activation File
profileFile	TokenNameIdentifier	 profile File
=	TokenNameEQUAL	
profileActivation	TokenNameIdentifier	 profile Activation
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
profileFile	TokenNameIdentifier	 profile File
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
profileFile	TokenNameIdentifier	 profile File
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
profileFile	TokenNameIdentifier	 profile File
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
profileXmlProfile	TokenNameIdentifier	 profile Xml Profile
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
repos	TokenNameIdentifier	 repos
=	TokenNameEQUAL	
profileXmlProfile	TokenNameIdentifier	 profile Xml Profile
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
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
repos	TokenNameIdentifier	 repos
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
convertFromProfileXmlRepository	TokenNameIdentifier	 convert From Profile Xml Repository
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
pluginRepos	TokenNameIdentifier	 plugin Repos
=	TokenNameEQUAL	
profileXmlProfile	TokenNameIdentifier	 profile Xml Profile
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
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
pluginRepos	TokenNameIdentifier	 plugin Repos
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addPluginRepository	TokenNameIdentifier	 add Plugin Repository
(	TokenNameLPAREN	
convertFromProfileXmlRepository	TokenNameIdentifier	 convert From Profile Xml Repository
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
profile	TokenNameIdentifier	 profile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Repository	TokenNameIdentifier	 Repository
convertFromProfileXmlRepository	TokenNameIdentifier	 convert From Profile Xml Repository
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
profileXmlRepo	TokenNameIdentifier	 profile Xml Repo
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
}	TokenNameRBRACE	
