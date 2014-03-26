package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
RepositoryUtils	TokenNameIdentifier	 Repository Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
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
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
MirrorSelector	TokenNameIdentifier	 Mirror Selector
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
implements	TokenNameimplements	
MirrorSelector	TokenNameIdentifier	 Mirror Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WILDCARD	TokenNameIdentifier	 WILDCARD
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXTERNAL_WILDCARD	TokenNameIdentifier	 EXTERNAL  WILDCARD
=	TokenNameEQUAL	
"external:*"	TokenNameStringLiteral	external:*
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Mirror	TokenNameIdentifier	 Mirror
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
repoId	TokenNameIdentifier	 repo Id
=	TokenNameEQUAL	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repoId	TokenNameIdentifier	 repo Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
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
if	TokenNameif	
(	TokenNameLPAREN	
repoId	TokenNameIdentifier	 repo Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getMirrorOf	TokenNameIdentifier	 get Mirror Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mirror	TokenNameIdentifier	 mirror
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Mirror	TokenNameIdentifier	 Mirror
mirror	TokenNameIdentifier	 mirror
:	TokenNameCOLON	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getMirrorOf	TokenNameIdentifier	 get Mirror Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mirror	TokenNameIdentifier	 mirror
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method checks if the pattern matches the originalRepository. Valid patterns: * = * everything external:* = everything not on the localhost and not file based. repo,repo1 = repo * or repo1 *,!repo1 = everything except repo1 * * @param originalRepository to compare for a match. * @param pattern used for match. Currently only '*' is supported. * @return true if the repository is a match to this pattern. */	TokenNameCOMMENT_JAVADOC	 This method checks if the pattern matches the originalRepository. Valid patterns: = everything external:* = everything not on the localhost and not file based. repo,repo1 = repo or repo1 *,!repo1 = everything except repo1 * @param originalRepository to compare for a match. @param pattern used for match. Currently only '*' is supported. @return true if the repository is a match to this pattern. 
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
originalRepository	TokenNameIdentifier	 original Repository
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
originalId	TokenNameIdentifier	 original Id
=	TokenNameEQUAL	
originalRepository	TokenNameIdentifier	 original Repository
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// simple checks first to short circuit processing below. 	TokenNameCOMMENT_LINE	simple checks first to short circuit processing below. 
if	TokenNameif	
(	TokenNameLPAREN	
WILDCARD	TokenNameIdentifier	 WILDCARD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
||	TokenNameOR_OR	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
originalId	TokenNameIdentifier	 original Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// process the list 	TokenNameCOMMENT_LINE	process the list 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
repos	TokenNameIdentifier	 repos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repo	TokenNameIdentifier	 repo
:	TokenNameCOLON	
repos	TokenNameIdentifier	 repos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// see if this is a negative match 	TokenNameCOMMENT_LINE	see if this is a negative match 
if	TokenNameif	
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
originalId	TokenNameIdentifier	 original Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// explicitly exclude. Set result and stop processing. 	TokenNameCOMMENT_LINE	explicitly exclude. Set result and stop processing. 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check for exact match 	TokenNameCOMMENT_LINE	check for exact match 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
originalId	TokenNameIdentifier	 original Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for external:* 	TokenNameCOMMENT_LINE	check for external:* 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
EXTERNAL_WILDCARD	TokenNameIdentifier	 EXTERNAL  WILDCARD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
originalRepository	TokenNameIdentifier	 original Repository
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// don't stop processing in case a future segment explicitly excludes this repo 	TokenNameCOMMENT_LINE	don't stop processing in case a future segment explicitly excludes this repo 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
WILDCARD	TokenNameIdentifier	 WILDCARD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// don't stop processing in case a future segment explicitly excludes this repo 	TokenNameCOMMENT_LINE	don't stop processing in case a future segment explicitly excludes this repo 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks the URL to see if this repository refers to an external repository * * @param originalRepository * @return true if external. */	TokenNameCOMMENT_JAVADOC	 Checks the URL to see if this repository refers to an external repository * @param originalRepository @return true if external. 
static	TokenNamestatic	
boolean	TokenNameboolean	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
originalRepository	TokenNameIdentifier	 original Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
originalRepository	TokenNameIdentifier	 original Repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
)	TokenNameRPAREN	
||	TokenNameOR_OR	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad url just skip it here. It should have been validated already, but the wagon lookup will deal with it 	TokenNameCOMMENT_LINE	bad url just skip it here. It should have been validated already, but the wagon lookup will deal with it 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
Mirror	TokenNameIdentifier	 Mirror
mirror	TokenNameIdentifier	 mirror
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
RepositoryUtils	TokenNameIdentifier	 Repository Utils
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
getMirrorOfLayouts	TokenNameIdentifier	 get Mirror Of Layouts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the layouts configured for a mirror match with the layout of the repository. * * @param repoLayout The layout of the repository, may be {@code null}. * @param mirrorLayout The layouts supported by the mirror, may be {@code null}. * @return {@code true} if the layouts associated with the mirror match the layout of the original repository, * {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 Checks whether the layouts configured for a mirror match with the layout of the repository. * @param repoLayout The layout of the repository, may be {@code null}. @param mirrorLayout The layouts supported by the mirror, may be {@code null}. @return {@code true} if the layouts associated with the mirror match the layout of the original repository, {@code false} otherwise. 
static	TokenNamestatic	
boolean	TokenNameboolean	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repoLayout	TokenNameIdentifier	 repo Layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mirrorLayout	TokenNameIdentifier	 mirror Layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// simple checks first to short circuit processing below. 	TokenNameCOMMENT_LINE	simple checks first to short circuit processing below. 
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
mirrorLayout	TokenNameIdentifier	 mirror Layout
)	TokenNameRPAREN	
||	TokenNameOR_OR	
WILDCARD	TokenNameIdentifier	 WILDCARD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mirrorLayout	TokenNameIdentifier	 mirror Layout
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mirrorLayout	TokenNameIdentifier	 mirror Layout
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repoLayout	TokenNameIdentifier	 repo Layout
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// process the list 	TokenNameCOMMENT_LINE	process the list 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
layouts	TokenNameIdentifier	 layouts
=	TokenNameEQUAL	
mirrorLayout	TokenNameIdentifier	 mirror Layout
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
layout	TokenNameIdentifier	 layout
:	TokenNameCOLON	
layouts	TokenNameIdentifier	 layouts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// see if this is a negative match 	TokenNameCOMMENT_LINE	see if this is a negative match 
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repoLayout	TokenNameIdentifier	 repo Layout
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// explicitly exclude. Set result and stop processing. 	TokenNameCOMMENT_LINE	explicitly exclude. Set result and stop processing. 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check for exact match 	TokenNameCOMMENT_LINE	check for exact match 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
repoLayout	TokenNameIdentifier	 repo Layout
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
WILDCARD	TokenNameIdentifier	 WILDCARD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// don't stop processing in case a future segment explicitly excludes this repo 	TokenNameCOMMENT_LINE	don't stop processing in case a future segment explicitly excludes this repo 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
