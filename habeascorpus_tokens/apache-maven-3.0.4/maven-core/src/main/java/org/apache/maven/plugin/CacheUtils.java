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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Dependency	TokenNameIdentifier	 Dependency
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
Exclusion	TokenNameIdentifier	 Exclusion
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
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
WorkspaceReader	TokenNameIdentifier	 Workspace Reader
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
WorkspaceRepository	TokenNameIdentifier	 Workspace Repository
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
class	TokenNameclass	
CacheUtils	TokenNameIdentifier	 Cache Utils
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
boolean	TokenNameboolean	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
:	TokenNameCOLON	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
repositoriesHashCode	TokenNameIdentifier	 repositories Hash Code
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
RemoteRepository	TokenNameIdentifier	 Remote Repository
repository	TokenNameIdentifier	 repository
:	TokenNameCOLON	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
repositoryHashCode	TokenNameIdentifier	 repository Hash Code
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
repositoryHashCode	TokenNameIdentifier	 repository Hash Code
(	TokenNameLPAREN	
RemoteRepository	TokenNameIdentifier	 Remote Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
repositoryEquals	TokenNameIdentifier	 repository Equals
(	TokenNameLPAREN	
RemoteRepository	TokenNameIdentifier	 Remote Repository
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
RemoteRepository	TokenNameIdentifier	 Remote Repository
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
==	TokenNameEQUAL_EQUAL	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
policyEquals	TokenNameIdentifier	 policy Equals
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
policyEquals	TokenNameIdentifier	 policy Equals
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
policyEquals	TokenNameIdentifier	 policy Equals
(	TokenNameLPAREN	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
RepositoryPolicy	TokenNameIdentifier	 Repository Policy
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
==	TokenNameEQUAL_EQUAL	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// update policy doesn't affect contents 	TokenNameCOMMENT_LINE	update policy doesn't affect contents 
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
repositoriesEquals	TokenNameIdentifier	 repositories Equals
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
RemoteRepository	TokenNameIdentifier	 Remote Repository
>	TokenNameGREATER	
it1	TokenNameIdentifier	 it1
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
it2	TokenNameIdentifier	 it2
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
repositoryEquals	TokenNameIdentifier	 repository Equals
(	TokenNameLPAREN	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
pluginHashCode	TokenNameIdentifier	 plugin Hash Code
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
isExtensions	TokenNameIdentifier	 is Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
:	TokenNameCOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Exclusion	TokenNameIdentifier	 Exclusion
exclusion	TokenNameIdentifier	 exclusion
:	TokenNameCOLON	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getExclusions	TokenNameIdentifier	 get Exclusions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
exclusion	TokenNameIdentifier	 exclusion
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
exclusion	TokenNameIdentifier	 exclusion
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
pluginEquals	TokenNameIdentifier	 plugin Equals
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Plugin	TokenNameIdentifier	 Plugin
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
isExtensions	TokenNameIdentifier	 is Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
isExtensions	TokenNameIdentifier	 is Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
dependenciesEquals	TokenNameIdentifier	 dependencies Equals
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
dependenciesEquals	TokenNameIdentifier	 dependencies Equals
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
aI	TokenNameIdentifier	 a I
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
bI	TokenNameIdentifier	 b I
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
aI	TokenNameIdentifier	 a I
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dependency	TokenNameIdentifier	 Dependency
aD	TokenNameIdentifier	 a D
=	TokenNameEQUAL	
aI	TokenNameIdentifier	 a I
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dependency	TokenNameIdentifier	 Dependency
bD	TokenNameIdentifier	 b D
=	TokenNameEQUAL	
bI	TokenNameIdentifier	 b I
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
&=	TokenNameAND_EQUAL	
exclusionsEquals	TokenNameIdentifier	 exclusions Equals
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getExclusions	TokenNameIdentifier	 get Exclusions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getExclusions	TokenNameIdentifier	 get Exclusions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
exclusionsEquals	TokenNameIdentifier	 exclusions Equals
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exclusion	TokenNameIdentifier	 Exclusion
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exclusion	TokenNameIdentifier	 Exclusion
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Exclusion	TokenNameIdentifier	 Exclusion
>	TokenNameGREATER	
aI	TokenNameIdentifier	 a I
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Exclusion	TokenNameIdentifier	 Exclusion
>	TokenNameGREATER	
bI	TokenNameIdentifier	 b I
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
aI	TokenNameIdentifier	 a I
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exclusion	TokenNameIdentifier	 Exclusion
aD	TokenNameIdentifier	 a D
=	TokenNameEQUAL	
aI	TokenNameIdentifier	 a I
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exclusion	TokenNameIdentifier	 Exclusion
bD	TokenNameIdentifier	 b D
=	TokenNameEQUAL	
bI	TokenNameIdentifier	 b I
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// 	TokenNameCOMMENT_LINE	 
&&	TokenNameAND_AND	
eq	TokenNameIdentifier	 eq
(	TokenNameLPAREN	
aD	TokenNameIdentifier	 a D
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bD	TokenNameIdentifier	 b D
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
WorkspaceRepository	TokenNameIdentifier	 Workspace Repository
getWorkspace	TokenNameIdentifier	 get Workspace
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WorkspaceReader	TokenNameIdentifier	 Workspace Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getWorkspaceReader	TokenNameIdentifier	 get Workspace Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
