package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
IdentifiableBase	TokenNameIdentifier	 Identifiable Base
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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a> * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a> @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
MavenSettingsMerger	TokenNameIdentifier	 Maven Settings Merger
{	TokenNameLBRACE	
/** * @param dominant * @param recessive * @param recessiveSourceLevel */	TokenNameCOMMENT_JAVADOC	 @param dominant @param recessive @param recessiveSourceLevel 
public	TokenNamepublic	
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
if	TokenNameif	
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
recessive	TokenNameIdentifier	 recessive
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
setSourceLevel	TokenNameIdentifier	 set Source Level
(	TokenNameLPAREN	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dominantActiveProfiles	TokenNameIdentifier	 dominant Active Profiles
=	TokenNameEQUAL	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
recessiveActiveProfiles	TokenNameIdentifier	 recessive Active Profiles
=	TokenNameEQUAL	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recessiveActiveProfiles	TokenNameIdentifier	 recessive Active Profiles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dominantActiveProfiles	TokenNameIdentifier	 dominant Active Profiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dominantActiveProfiles	TokenNameIdentifier	 dominant Active Profiles
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
setActiveProfiles	TokenNameIdentifier	 set Active Profiles
(	TokenNameLPAREN	
dominantActiveProfiles	TokenNameIdentifier	 dominant Active Profiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
profileId	TokenNameIdentifier	 profile Id
:	TokenNameCOLON	
recessiveActiveProfiles	TokenNameIdentifier	 recessive Active Profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dominantActiveProfiles	TokenNameIdentifier	 dominant Active Profiles
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
profileId	TokenNameIdentifier	 profile Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dominantActiveProfiles	TokenNameIdentifier	 dominant Active Profiles
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
profileId	TokenNameIdentifier	 profile Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dominantPluginGroupIds	TokenNameIdentifier	 dominant Plugin Group Ids
=	TokenNameEQUAL	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
recessivePluginGroupIds	TokenNameIdentifier	 recessive Plugin Group Ids
=	TokenNameEQUAL	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recessivePluginGroupIds	TokenNameIdentifier	 recessive Plugin Group Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dominantPluginGroupIds	TokenNameIdentifier	 dominant Plugin Group Ids
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dominantPluginGroupIds	TokenNameIdentifier	 dominant Plugin Group Ids
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
setPluginGroups	TokenNameIdentifier	 set Plugin Groups
(	TokenNameLPAREN	
dominantPluginGroupIds	TokenNameIdentifier	 dominant Plugin Group Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pluginGroupId	TokenNameIdentifier	 plugin Group Id
:	TokenNameCOLON	
recessivePluginGroupIds	TokenNameIdentifier	 recessive Plugin Group Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dominantPluginGroupIds	TokenNameIdentifier	 dominant Plugin Group Ids
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dominantPluginGroupIds	TokenNameIdentifier	 dominant Plugin Group Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
setLocalRepository	TokenNameIdentifier	 set Local Repository
(	TokenNameLPAREN	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getLocalRepository	TokenNameIdentifier	 get Local Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
shallowMergeById	TokenNameIdentifier	 shallow Merge By Id
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getMirrors	TokenNameIdentifier	 get Mirrors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getMirrors	TokenNameIdentifier	 get Mirrors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shallowMergeById	TokenNameIdentifier	 shallow Merge By Id
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shallowMergeById	TokenNameIdentifier	 shallow Merge By Id
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shallowMergeById	TokenNameIdentifier	 shallow Merge By Id
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
getProfiles	TokenNameIdentifier	 get Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param dominant * @param recessive * @param recessiveSourceLevel */	TokenNameCOMMENT_JAVADOC	 @param dominant @param recessive @param recessiveSourceLevel 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
IdentifiableBase	TokenNameIdentifier	 Identifiable Base
>	TokenNameGREATER	
void	TokenNamevoid	
shallowMergeById	TokenNameIdentifier	 shallow Merge By Id
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
dominant	TokenNameIdentifier	 dominant
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
recessive	TokenNameIdentifier	 recessive
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
dominantById	TokenNameIdentifier	 dominant By Id
=	TokenNameEQUAL	
mapById	TokenNameIdentifier	 map By Id
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
identifiable	TokenNameIdentifier	 identifiable
:	TokenNameCOLON	
recessive	TokenNameIdentifier	 recessive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dominantById	TokenNameIdentifier	 dominant By Id
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
identifiable	TokenNameIdentifier	 identifiable
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
identifiable	TokenNameIdentifier	 identifiable
.	TokenNameDOT	
setSourceLevel	TokenNameIdentifier	 set Source Level
(	TokenNameLPAREN	
recessiveSourceLevel	TokenNameIdentifier	 recessive Source Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
identifiable	TokenNameIdentifier	 identifiable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param identifiables * @return a map */	TokenNameCOMMENT_JAVADOC	 @param identifiables @return a map 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
IdentifiableBase	TokenNameIdentifier	 Identifiable Base
>	TokenNameGREATER	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
mapById	TokenNameIdentifier	 map By Id
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
identifiables	TokenNameIdentifier	 identifiables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
byId	TokenNameIdentifier	 by Id
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
identifiable	TokenNameIdentifier	 identifiable
:	TokenNameCOLON	
identifiables	TokenNameIdentifier	 identifiables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byId	TokenNameIdentifier	 by Id
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
identifiable	TokenNameIdentifier	 identifiable
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
identifiable	TokenNameIdentifier	 identifiable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
byId	TokenNameIdentifier	 by Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
