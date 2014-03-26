package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
Set	TokenNameIdentifier	 Set
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
Mirror	TokenNameIdentifier	 Mirror
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
Profile	TokenNameIdentifier	 Profile
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
Repository	TokenNameIdentifier	 Repository
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
Server	TokenNameIdentifier	 Server
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
Settings	TokenNameIdentifier	 Settings
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
SettingsProblem	TokenNameIdentifier	 Settings Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
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
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * @author Milos Kleint */	TokenNameCOMMENT_JAVADOC	 @author Milos Kleint 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
SettingsValidator	TokenNameIdentifier	 Settings Validator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultSettingsValidator	TokenNameIdentifier	 Default Settings Validator
implements	TokenNameimplements	
SettingsValidator	TokenNameIdentifier	 Settings Validator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ID_REGEX	TokenNameIdentifier	 ID  REGEX
=	TokenNameEQUAL	
"[A-Za-z0-9_\-.]+"	TokenNameStringLiteral	[A-Za-z0-9_\-.]+
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_FS_CHARS	TokenNameIdentifier	 ILLEGAL  FS  CHARS
=	TokenNameEQUAL	
"\/:"<>|?*"	TokenNameStringLiteral	\/:"<>|?*
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ILLEGAL_REPO_ID_CHARS	TokenNameIdentifier	 ILLEGAL  REPO  ID  CHARS
=	TokenNameEQUAL	
ILLEGAL_FS_CHARS	TokenNameIdentifier	 ILLEGAL  FS  CHARS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
,	TokenNameCOMMA	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
isUsePluginRegistry	TokenNameIdentifier	 is Use Plugin Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
"usePluginRegistry"	TokenNameStringLiteral	usePluginRegistry
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"is deprecated and has no effect."	TokenNameStringLiteral	is deprecated and has no effect.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
pluginGroups	TokenNameIdentifier	 plugin Groups
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pluginGroups	TokenNameIdentifier	 plugin Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pluginGroups	TokenNameIdentifier	 plugin Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pluginGroup	TokenNameIdentifier	 plugin Group
=	TokenNameEQUAL	
pluginGroups	TokenNameIdentifier	 plugin Groups
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isBlank	TokenNameIdentifier	 is Blank
(	TokenNameLPAREN	
pluginGroup	TokenNameIdentifier	 plugin Group
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"pluginGroups.pluginGroup["	TokenNameStringLiteral	pluginGroups.pluginGroup[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must not be empty"	TokenNameStringLiteral	must not be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pluginGroup	TokenNameIdentifier	 plugin Group
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
ID_REGEX	TokenNameIdentifier	 ID  REGEX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"pluginGroups.pluginGroup["	TokenNameStringLiteral	pluginGroups.pluginGroup[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must denote a valid group id and match the pattern "	TokenNameStringLiteral	must denote a valid group id and match the pattern 
+	TokenNamePLUS	
ID_REGEX	TokenNameIdentifier	 ID  REGEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
servers	TokenNameIdentifier	 servers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
serverIds	TokenNameIdentifier	 server Ids
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
servers	TokenNameIdentifier	 servers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Server	TokenNameIdentifier	 Server
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
servers	TokenNameIdentifier	 servers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
"servers.server["	TokenNameStringLiteral	servers.server[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"].id"	TokenNameStringLiteral	].id
,	TokenNameCOMMA	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
serverIds	TokenNameIdentifier	 server Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
"servers.server.id"	TokenNameStringLiteral	servers.server.id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must be unique but found duplicate server with id "	TokenNameStringLiteral	must be unique but found duplicate server with id 
+	TokenNamePLUS	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getMirrors	TokenNameIdentifier	 get Mirrors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mirrors	TokenNameIdentifier	 mirrors
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Mirror	TokenNameIdentifier	 Mirror
mirror	TokenNameIdentifier	 mirror
:	TokenNameCOLON	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
"mirrors.mirror.id"	TokenNameStringLiteral	mirrors.mirror.id
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateBannedCharacters	TokenNameIdentifier	 validate Banned Characters
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
"mirrors.mirror.id"	TokenNameStringLiteral	mirrors.mirror.id
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ILLEGAL_REPO_ID_CHARS	TokenNameIdentifier	 ILLEGAL  REPO  ID  CHARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
"mirrors.mirror.id"	TokenNameStringLiteral	mirrors.mirror.id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must not be 'local'"	TokenNameStringLiteral	must not be 'local'
+	TokenNamePLUS	
", this identifier is reserved for the local repository"	TokenNameStringLiteral	, this identifier is reserved for the local repository
+	TokenNamePLUS	
", using it for other repositories will corrupt your repository metadata."	TokenNameStringLiteral	, using it for other repositories will corrupt your repository metadata.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
"mirrors.mirror.url"	TokenNameStringLiteral	mirrors.mirror.url
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
"mirrors.mirror.mirrorOf"	TokenNameStringLiteral	mirrors.mirror.mirrorOf
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getMirrorOf	TokenNameIdentifier	 get Mirror Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
profiles	TokenNameIdentifier	 profiles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
profileIds	TokenNameIdentifier	 profile Ids
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
:	TokenNameCOLON	
profiles	TokenNameIdentifier	 profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
profileIds	TokenNameIdentifier	 profile Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
"profiles.profile.id"	TokenNameStringLiteral	profiles.profile.id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must be unique but found duplicate profile with id "	TokenNameStringLiteral	must be unique but found duplicate profile with id 
+	TokenNamePLUS	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"profiles.profile["	TokenNameStringLiteral	profiles.profile[
+	TokenNamePLUS	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
;	TokenNameSEMICOLON	
validateRepositories	TokenNameIdentifier	 validate Repositories
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"repositories.repository"	TokenNameStringLiteral	repositories.repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateRepositories	TokenNameIdentifier	 validate Repositories
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getPluginRepositories	TokenNameIdentifier	 get Plugin Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"pluginRepositories.pluginRepository"	TokenNameStringLiteral	pluginRepositories.pluginRepository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
validateRepositories	TokenNameIdentifier	 validate Repositories
(	TokenNameLPAREN	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Repository	TokenNameIdentifier	 Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
repoIds	TokenNameIdentifier	 repo Ids
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
:	TokenNameCOLON	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
".id"	TokenNameStringLiteral	.id
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateBannedCharacters	TokenNameIdentifier	 validate Banned Characters
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
".id"	TokenNameStringLiteral	.id
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ILLEGAL_REPO_ID_CHARS	TokenNameIdentifier	 ILLEGAL  REPO  ID  CHARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
".id"	TokenNameStringLiteral	.id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must not be 'local'"	TokenNameStringLiteral	must not be 'local'
+	TokenNamePLUS	
", this identifier is reserved for the local repository"	TokenNameStringLiteral	, this identifier is reserved for the local repository
+	TokenNamePLUS	
", using it for other repositories will corrupt your repository metadata."	TokenNameStringLiteral	, using it for other repositories will corrupt your repository metadata.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
repoIds	TokenNameIdentifier	 repo Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
".id"	TokenNameStringLiteral	.id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"must be unique but found duplicate repository with id "	TokenNameStringLiteral	must be unique but found duplicate repository with id 
+	TokenNamePLUS	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
".url"	TokenNameStringLiteral	.url
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"legacy"	TokenNameStringLiteral	legacy
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
".layout"	TokenNameStringLiteral	.layout
,	TokenNameCOMMA	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"uses the unsupported value 'legacy', artifact resolution might fail."	TokenNameStringLiteral	uses the unsupported value 'legacy', artifact resolution might fail.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Field validation 	TokenNameCOMMENT_LINE	Field validation 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** * Asserts: * <p/> * <ul> * <li><code>string.length != null</code> * <li><code>string.length > 0</code> * </ul> */	TokenNameCOMMENT_JAVADOC	 Asserts: <p/> <ul> <li><code>string.length != null</code> <li><code>string.length > 0</code> </ul> 
private	TokenNameprivate	
boolean	TokenNameboolean	
validateStringNotEmpty	TokenNameIdentifier	 validate String Not Empty
(	TokenNameLPAREN	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sourceHint	TokenNameIdentifier	 source Hint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
validateNotNull	TokenNameIdentifier	 validate Not Null
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
sourceHint	TokenNameIdentifier	 source Hint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
sourceHint	TokenNameIdentifier	 source Hint
,	TokenNameCOMMA	
"is missing"	TokenNameStringLiteral	is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts: * <p/> * <ul> * <li><code>string != null</code> * </ul> */	TokenNameCOMMENT_JAVADOC	 Asserts: <p/> <ul> <li><code>string != null</code> </ul> 
private	TokenNameprivate	
boolean	TokenNameboolean	
validateNotNull	TokenNameIdentifier	 validate Not Null
(	TokenNameLPAREN	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sourceHint	TokenNameIdentifier	 source Hint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
sourceHint	TokenNameIdentifier	 source Hint
,	TokenNameCOMMA	
"is missing"	TokenNameStringLiteral	is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
validateBannedCharacters	TokenNameIdentifier	 validate Banned Characters
(	TokenNameLPAREN	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sourceHint	TokenNameIdentifier	 source Hint
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
banned	TokenNameIdentifier	 banned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
banned	TokenNameIdentifier	 banned
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
sourceHint	TokenNameIdentifier	 source Hint
,	TokenNameCOMMA	
"must not contain any of these characters "	TokenNameStringLiteral	must not contain any of these characters 
+	TokenNamePLUS	
banned	TokenNameIdentifier	 banned
+	TokenNamePLUS	
" but found "	TokenNameStringLiteral	 but found 
+	TokenNamePLUS	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addViolation	TokenNameIdentifier	 add Violation
(	TokenNameLPAREN	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
Severity	TokenNameIdentifier	 Severity
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sourceHint	TokenNameIdentifier	 source Hint
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceHint	TokenNameIdentifier	 source Hint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" for "	TokenNameStringLiteral	 for 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sourceHint	TokenNameIdentifier	 source Hint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
