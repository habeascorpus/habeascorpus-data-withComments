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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
classworlds	TokenNameIdentifier	 classworlds
.	TokenNameDOT	
realm	TokenNameIdentifier	 realm
.	TokenNameDOT	
ClassRealm	TokenNameIdentifier	 Class Realm
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
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
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
/** * Exception which occurs to indicate that the plugin cannot be initialized due * to some deeper problem with Plexus. Context information includes the groupId, * artifactId, and version for the plugin; at times, the goal name for which * execution failed; a message detailing the problem; the ClassRealm used to * lookup the plugin; and the Plexus exception that caused this error. * * @author jdcasey * */	TokenNameCOMMENT_JAVADOC	 Exception which occurs to indicate that the plugin cannot be initialized due to some deeper problem with Plexus. Context information includes the groupId, artifactId, and version for the plugin; at times, the goal name for which execution failed; a message detailing the problem; the ClassRealm used to lookup the plugin; and the Plexus exception that caused this error. * @author jdcasey 
public	TokenNamepublic	
class	TokenNameclass	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
extends	TokenNameextends	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginRealm	TokenNameIdentifier	 plugin Realm
=	TokenNameEQUAL	
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginRealm	TokenNameIdentifier	 plugin Realm
=	TokenNameEQUAL	
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginRealm	TokenNameIdentifier	 plugin Realm
=	TokenNameEQUAL	
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginRealm	TokenNameIdentifier	 plugin Realm
=	TokenNameEQUAL	
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginContainerException	TokenNameIdentifier	 Plugin Container Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
ClassRealm	TokenNameIdentifier	 Class Realm
pluginRealm	TokenNameIdentifier	 plugin Realm
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ComponentRepositoryException	TokenNameIdentifier	 Component Repository Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginRealm	TokenNameIdentifier	 plugin Realm
=	TokenNameEQUAL	
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassRealm	TokenNameIdentifier	 Class Realm
getPluginRealm	TokenNameIdentifier	 get Plugin Realm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginRealm	TokenNameIdentifier	 plugin Realm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
