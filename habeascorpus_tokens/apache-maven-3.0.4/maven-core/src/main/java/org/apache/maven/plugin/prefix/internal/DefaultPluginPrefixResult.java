package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
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
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
PluginPrefixResult	TokenNameIdentifier	 Plugin Prefix Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
/** * Describes the result of a plugin prefix resolution request. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes the result of a plugin prefix resolution request. * @since 3.0 @author Benjamin Bentmann 
class	TokenNameclass	
DefaultPluginPrefixResult	TokenNameIdentifier	 Default Plugin Prefix Result
implements	TokenNameimplements	
PluginPrefixResult	TokenNameIdentifier	 Plugin Prefix Result
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultPluginPrefixResult	TokenNameIdentifier	 Default Plugin Prefix Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// does nothing 	TokenNameCOMMENT_LINE	does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixResult	TokenNameIdentifier	 Default Plugin Prefix Result
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixResult	TokenNameIdentifier	 Default Plugin Prefix Result
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRepository	TokenNameIdentifier	 set Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
