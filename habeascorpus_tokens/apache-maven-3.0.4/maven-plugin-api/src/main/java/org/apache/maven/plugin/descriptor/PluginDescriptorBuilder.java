package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentDependency	TokenNameIdentifier	 Component Dependency
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentRequirement	TokenNameIdentifier	 Component Requirement
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XmlPlexusConfiguration	TokenNameIdentifier	 Xml Plexus Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3DomBuilder	TokenNameIdentifier	 Xpp3 Dom Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
pull	TokenNameIdentifier	 pull
.	TokenNameDOT	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
PluginDescriptorBuilder	TokenNameIdentifier	 Plugin Descriptor Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
{	TokenNameLBRACE	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
buildConfiguration	TokenNameIdentifier	 build Configuration
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
new	TokenNamenew	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"artifactId"	TokenNameStringLiteral	artifactId
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setGoalPrefix	TokenNameIdentifier	 set Goal Prefix
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"goalPrefix"	TokenNameStringLiteral	goalPrefix
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"description"	TokenNameStringLiteral	description
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
isolatedRealm	TokenNameIdentifier	 isolated Realm
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"isolatedRealm"	TokenNameStringLiteral	isolatedRealm
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isolatedRealm	TokenNameIdentifier	 isolated Realm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setIsolatedRealm	TokenNameIdentifier	 set Isolated Realm
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
isolatedRealm	TokenNameIdentifier	 isolated Realm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
inheritedByDefault	TokenNameIdentifier	 inherited By Default
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"inheritedByDefault"	TokenNameStringLiteral	inheritedByDefault
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setInheritedByDefault	TokenNameIdentifier	 set Inherited By Default
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Components 	TokenNameCOMMENT_LINE	Components 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mojoConfigurations	TokenNameIdentifier	 mojo Configurations
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"mojos"	TokenNameStringLiteral	mojos
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
"mojo"	TokenNameStringLiteral	mojo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
component	TokenNameIdentifier	 component
:	TokenNameCOLON	
mojoConfigurations	TokenNameIdentifier	 mojo Configurations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
buildComponentDescriptor	TokenNameIdentifier	 build Component Descriptor
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
addMojo	TokenNameIdentifier	 add Mojo
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Dependencies 	TokenNameCOMMENT_LINE	Dependencies 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dependencyConfigurations	TokenNameIdentifier	 dependency Configurations
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"dependencies"	TokenNameStringLiteral	dependencies
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
"dependency"	TokenNameStringLiteral	dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ComponentDependency	TokenNameIdentifier	 Component Dependency
>	TokenNameGREATER	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ComponentDependency	TokenNameIdentifier	 Component Dependency
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
d	TokenNameIdentifier	 d
:	TokenNameCOLON	
dependencyConfigurations	TokenNameIdentifier	 dependency Configurations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ComponentDependency	TokenNameIdentifier	 Component Dependency
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentDependency	TokenNameIdentifier	 Component Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"artifactId"	TokenNameStringLiteral	artifactId
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"groupId"	TokenNameStringLiteral	groupId
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cd	TokenNameIdentifier	 cd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
setDependencies	TokenNameIdentifier	 set Dependencies
(	TokenNameLPAREN	
dependencies	TokenNameIdentifier	 dependencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
buildComponentDescriptor	TokenNameIdentifier	 build Component Descriptor
(	TokenNameLPAREN	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
throws	TokenNamethrows	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
{	TokenNameLBRACE	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
=	TokenNameEQUAL	
new	TokenNamenew	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setPluginDescriptor	TokenNameIdentifier	 set Plugin Descriptor
(	TokenNameLPAREN	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setGoal	TokenNameIdentifier	 set Goal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"goal"	TokenNameStringLiteral	goal
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"implementation"	TokenNameStringLiteral	implementation
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
langConfig	TokenNameIdentifier	 lang Config
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"language"	TokenNameStringLiteral	language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
langConfig	TokenNameIdentifier	 lang Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
langConfig	TokenNameIdentifier	 lang Config
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
configuratorConfig	TokenNameIdentifier	 configurator Config
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"configurator"	TokenNameStringLiteral	configurator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
configuratorConfig	TokenNameIdentifier	 configurator Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setComponentConfigurator	TokenNameIdentifier	 set Component Configurator
(	TokenNameLPAREN	
configuratorConfig	TokenNameIdentifier	 configurator Config
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
composerConfig	TokenNameIdentifier	 composer Config
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"composer"	TokenNameStringLiteral	composer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
composerConfig	TokenNameIdentifier	 composer Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setComponentComposer	TokenNameIdentifier	 set Component Composer
(	TokenNameLPAREN	
composerConfig	TokenNameIdentifier	 composer Config
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
since	TokenNameIdentifier	 since
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"since"	TokenNameStringLiteral	since
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
since	TokenNameIdentifier	 since
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setSince	TokenNameIdentifier	 set Since
(	TokenNameLPAREN	
since	TokenNameIdentifier	 since
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
deprecated	TokenNameIdentifier	 deprecated
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"deprecated"	TokenNameStringLiteral	deprecated
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deprecated	TokenNameIdentifier	 deprecated
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setDeprecated	TokenNameIdentifier	 set Deprecated
(	TokenNameLPAREN	
deprecated	TokenNameIdentifier	 deprecated
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"phase"	TokenNameStringLiteral	phase
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setPhase	TokenNameIdentifier	 set Phase
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
executePhase	TokenNameIdentifier	 execute Phase
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"executePhase"	TokenNameStringLiteral	executePhase
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
executePhase	TokenNameIdentifier	 execute Phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setExecutePhase	TokenNameIdentifier	 set Execute Phase
(	TokenNameLPAREN	
executePhase	TokenNameIdentifier	 execute Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
executeMojo	TokenNameIdentifier	 execute Mojo
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"executeGoal"	TokenNameStringLiteral	executeGoal
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
executeMojo	TokenNameIdentifier	 execute Mojo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setExecuteGoal	TokenNameIdentifier	 set Execute Goal
(	TokenNameLPAREN	
executeMojo	TokenNameIdentifier	 execute Mojo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"executeLifecycle"	TokenNameStringLiteral	executeLifecycle
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setExecuteLifecycle	TokenNameIdentifier	 set Execute Lifecycle
(	TokenNameLPAREN	
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setInstantiationStrategy	TokenNameIdentifier	 set Instantiation Strategy
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"instantiationStrategy"	TokenNameStringLiteral	instantiationStrategy
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"description"	TokenNameStringLiteral	description
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
dependencyResolution	TokenNameIdentifier	 dependency Resolution
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requiresDependencyResolution"	TokenNameStringLiteral	requiresDependencyResolution
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dependencyResolution	TokenNameIdentifier	 dependency Resolution
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setDependencyResolutionRequired	TokenNameIdentifier	 set Dependency Resolution Required
(	TokenNameLPAREN	
dependencyResolution	TokenNameIdentifier	 dependency Resolution
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
dependencyCollection	TokenNameIdentifier	 dependency Collection
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requiresDependencyCollection"	TokenNameStringLiteral	requiresDependencyCollection
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dependencyCollection	TokenNameIdentifier	 dependency Collection
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setDependencyCollectionRequired	TokenNameIdentifier	 set Dependency Collection Required
(	TokenNameLPAREN	
dependencyCollection	TokenNameIdentifier	 dependency Collection
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requiresDirectInvocation"	TokenNameStringLiteral	requiresDirectInvocation
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setDirectInvocationOnly	TokenNameIdentifier	 set Direct Invocation Only
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
requiresProject	TokenNameIdentifier	 requires Project
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requiresProject"	TokenNameStringLiteral	requiresProject
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
requiresProject	TokenNameIdentifier	 requires Project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setProjectRequired	TokenNameIdentifier	 set Project Required
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
requiresProject	TokenNameIdentifier	 requires Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
requiresReports	TokenNameIdentifier	 requires Reports
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requiresReports"	TokenNameStringLiteral	requiresReports
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
requiresReports	TokenNameIdentifier	 requires Reports
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setRequiresReports	TokenNameIdentifier	 set Requires Reports
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
requiresReports	TokenNameIdentifier	 requires Reports
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
aggregator	TokenNameIdentifier	 aggregator
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"aggregator"	TokenNameStringLiteral	aggregator
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aggregator	TokenNameIdentifier	 aggregator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setAggregator	TokenNameIdentifier	 set Aggregator
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
aggregator	TokenNameIdentifier	 aggregator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
requiresOnline	TokenNameIdentifier	 requires Online
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requiresOnline"	TokenNameStringLiteral	requiresOnline
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
requiresOnline	TokenNameIdentifier	 requires Online
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setOnlineRequired	TokenNameIdentifier	 set Online Required
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
requiresOnline	TokenNameIdentifier	 requires Online
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
inheritedByDefault	TokenNameIdentifier	 inherited By Default
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"inheritedByDefault"	TokenNameStringLiteral	inheritedByDefault
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setInheritedByDefault	TokenNameIdentifier	 set Inherited By Default
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
threadSafe	TokenNameIdentifier	 thread Safe
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"threadSafe"	TokenNameStringLiteral	threadSafe
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
threadSafe	TokenNameIdentifier	 thread Safe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setThreadSafe	TokenNameIdentifier	 set Thread Safe
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
threadSafe	TokenNameIdentifier	 thread Safe
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Configuration 	TokenNameCOMMENT_LINE	Configuration 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
mojoConfig	TokenNameIdentifier	 mojo Config
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"configuration"	TokenNameStringLiteral	configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setMojoConfiguration	TokenNameIdentifier	 set Mojo Configuration
(	TokenNameLPAREN	
mojoConfig	TokenNameIdentifier	 mojo Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Parameters 	TokenNameCOMMENT_LINE	Parameters 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameterConfigurations	TokenNameIdentifier	 parameter Configurations
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"parameters"	TokenNameStringLiteral	parameters
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
"parameter"	TokenNameStringLiteral	parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
d	TokenNameIdentifier	 d
:	TokenNameCOLON	
parameterConfigurations	TokenNameIdentifier	 parameter Configurations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parameter	TokenNameIdentifier	 Parameter
parameter	TokenNameIdentifier	 parameter
=	TokenNameEQUAL	
new	TokenNamenew	
Parameter	TokenNameIdentifier	 Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"alias"	TokenNameStringLiteral	alias
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
required	TokenNameIdentifier	 required
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"required"	TokenNameStringLiteral	required
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setRequired	TokenNameIdentifier	 set Required
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
editableConfig	TokenNameIdentifier	 editable Config
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"editable"	TokenNameStringLiteral	editable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we need the null check for pre-build legacy plugins... 	TokenNameCOMMENT_LINE	we need the null check for pre-build legacy plugins... 
if	TokenNameif	
(	TokenNameLPAREN	
editableConfig	TokenNameIdentifier	 editable Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
editable	TokenNameIdentifier	 editable
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"editable"	TokenNameStringLiteral	editable
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setEditable	TokenNameIdentifier	 set Editable
(	TokenNameLPAREN	
editable	TokenNameIdentifier	 editable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
editable	TokenNameIdentifier	 editable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"description"	TokenNameStringLiteral	description
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setDeprecated	TokenNameIdentifier	 set Deprecated
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"deprecated"	TokenNameStringLiteral	deprecated
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"implementation"	TokenNameStringLiteral	implementation
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
paramConfig	TokenNameIdentifier	 param Config
=	TokenNameEQUAL	
mojoConfig	TokenNameIdentifier	 mojo Config
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paramConfig	TokenNameIdentifier	 param Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
paramConfig	TokenNameIdentifier	 param Config
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
setDefaultValue	TokenNameIdentifier	 set Default Value
(	TokenNameLPAREN	
paramConfig	TokenNameIdentifier	 param Config
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"default-value"	TokenNameStringLiteral	default-value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: this should not need to be handed off... 	TokenNameCOMMENT_LINE	TODO: this should not need to be handed off... 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Requirements 	TokenNameCOMMENT_LINE	Requirements 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
requirements	TokenNameIdentifier	 requirements
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"requirements"	TokenNameStringLiteral	requirements
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
"requirement"	TokenNameStringLiteral	requirement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
requirement	TokenNameIdentifier	 requirement
:	TokenNameCOLON	
requirements	TokenNameIdentifier	 requirements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ComponentRequirement	TokenNameIdentifier	 Component Requirement
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentRequirement	TokenNameIdentifier	 Component Requirement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
setRole	TokenNameIdentifier	 set Role
(	TokenNameLPAREN	
requirement	TokenNameIdentifier	 requirement
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"role"	TokenNameStringLiteral	role
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
setRoleHint	TokenNameIdentifier	 set Role Hint
(	TokenNameLPAREN	
requirement	TokenNameIdentifier	 requirement
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"role-hint"	TokenNameStringLiteral	role-hint
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
setFieldName	TokenNameIdentifier	 set Field Name
(	TokenNameLPAREN	
requirement	TokenNameIdentifier	 requirement
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"field-name"	TokenNameStringLiteral	field-name
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
addRequirement	TokenNameIdentifier	 add Requirement
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mojo	TokenNameIdentifier	 mojo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
public	TokenNamepublic	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
buildConfiguration	TokenNameIdentifier	 build Configuration
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
throws	TokenNamethrows	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XmlPlexusConfiguration	TokenNameIdentifier	 Xml Plexus Configuration
(	TokenNameLPAREN	
Xpp3DomBuilder	TokenNameIdentifier	 Xpp3 Dom Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
