package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
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
Plugin	TokenNameIdentifier	 Plugin
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusContainerException	TokenNameIdentifier	 Plexus Container Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
classworlds	TokenNameIdentifier	 classworlds
.	TokenNameDOT	
realm	TokenNameIdentifier	 realm
.	TokenNameDOT	
NoSuchRealmException	TokenNameIdentifier	 No Such Realm Exception
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
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ComponentRepositoryException	TokenNameIdentifier	 Component Repository Exception
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
/** * Exception in the plugin manager. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Exception in the plugin manager. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pluginGroupId	TokenNameIdentifier	 plugin Group Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pluginVersion	TokenNameIdentifier	 plugin Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ComponentRepositoryException	TokenNameIdentifier	 Component Repository Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
NoSuchRealmException	TokenNameIdentifier	 No Such Realm Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
PlexusContainerException	TokenNameIdentifier	 Plexus Container Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pd	TokenNameIdentifier	 pd
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
PlexusContainerException	TokenNameIdentifier	 Plexus Container Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginVersion	TokenNameIdentifier	 plugin Version
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPluginGroupId	TokenNameIdentifier	 get Plugin Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPluginArtifactId	TokenNameIdentifier	 get Plugin Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPluginVersion	TokenNameIdentifier	 get Plugin Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginVersion	TokenNameIdentifier	 plugin Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
