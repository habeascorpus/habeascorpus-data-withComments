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
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
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
Model	TokenNameIdentifier	 Model
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
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
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
RemoteRepository	TokenNameIdentifier	 Remote Repository
;	TokenNameSEMICOLON	
/** * Collects settings required to resolve a plugin prefix. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings required to resolve a plugin prefix. * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
implements	TokenNameimplements	
PluginPrefixRequest	TokenNameIdentifier	 Plugin Prefix Request
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
pluginGroups	TokenNameIdentifier	 plugin Groups
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
pom	TokenNameIdentifier	 pom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
/** * Creates an empty request. */	TokenNameCOMMENT_JAVADOC	 Creates an empty request. 
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a request for the specified plugin prefix and build session. The provided build session will be used to * configure repository settings. If the session has a current project, its plugin repositories and model will be * used as well. * * @param prefix The plugin prefix to resolve, must not be {@code null}. * @param session The build session from which to derive further settings, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a request for the specified plugin prefix and build session. The provided build session will be used to configure repository settings. If the session has a current project, its plugin repositories and model will be used as well. * @param prefix The plugin prefix to resolve, must not be {@code null}. @param session The build session from which to derive further settings, must not be {@code null}. 
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getCurrentProject	TokenNameIdentifier	 get Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRepositories	TokenNameIdentifier	 set Repositories
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getRemotePluginRepositories	TokenNameIdentifier	 get Remote Plugin Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPom	TokenNameIdentifier	 set Pom
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setPluginGroups	TokenNameIdentifier	 set Plugin Groups
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
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
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginGroups	TokenNameIdentifier	 plugin Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
setPluginGroups	TokenNameIdentifier	 set Plugin Groups
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
pluginGroups	TokenNameIdentifier	 plugin Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pluginGroups	TokenNameIdentifier	 plugin Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pluginGroups	TokenNameIdentifier	 plugin Groups
=	TokenNameEQUAL	
pluginGroups	TokenNameIdentifier	 plugin Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pluginGroups	TokenNameIdentifier	 plugin Groups
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getPom	TokenNameIdentifier	 get Pom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pom	TokenNameIdentifier	 pom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
setPom	TokenNameIdentifier	 set Pom
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pom	TokenNameIdentifier	 pom
=	TokenNameEQUAL	
pom	TokenNameIdentifier	 pom
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
setRepositories	TokenNameIdentifier	 set Repositories
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repositories	TokenNameIdentifier	 repositories
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultPluginPrefixRequest	TokenNameIdentifier	 Default Plugin Prefix Request
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
