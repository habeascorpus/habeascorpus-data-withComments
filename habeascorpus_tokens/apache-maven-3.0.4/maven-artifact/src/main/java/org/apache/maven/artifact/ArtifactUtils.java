package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SNAPSHOT_VERSION	TokenNameIdentifier	 SNAPSHOT  VERSION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SNAPSHOT_VERSION	TokenNameIdentifier	 SNAPSHOT  VERSION
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SNAPSHOT_VERSION	TokenNameIdentifier	 SNAPSHOT  VERSION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
VERSION_FILE_PATTERN	TokenNameIdentifier	 VERSION  FILE  PATTERN
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toSnapshotVersion	TokenNameIdentifier	 to Snapshot Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"version: null"	TokenNameStringLiteral	version: null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Matcher	TokenNameIdentifier	 Matcher
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
VERSION_FILE_PATTERN	TokenNameIdentifier	 VERSION  FILE  PATTERN
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SNAPSHOT_VERSION	TokenNameIdentifier	 SNAPSHOT  VERSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
versionlessKey	TokenNameIdentifier	 versionless Key
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
versionlessKey	TokenNameIdentifier	 versionless Key
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
versionlessKey	TokenNameIdentifier	 versionless Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"groupId is null"	TokenNameStringLiteral	groupId is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"artifactId is null"	TokenNameStringLiteral	artifactId is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"groupId is null"	TokenNameStringLiteral	groupId is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"artifactId is null"	TokenNameStringLiteral	artifactId is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"version is null"	TokenNameStringLiteral	version is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactMapByVersionlessId	TokenNameIdentifier	 artifact Map By Versionless Id
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactMap	TokenNameIdentifier	 artifact Map
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
:	TokenNameCOLON	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifactMap	TokenNameIdentifier	 artifact Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
versionlessKey	TokenNameIdentifier	 versionless Key
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
artifactMap	TokenNameIdentifier	 artifact Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Artifact	TokenNameIdentifier	 Artifact
copyArtifactSafe	TokenNameIdentifier	 copy Artifact Safe
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
copyArtifact	TokenNameIdentifier	 copy Artifact
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Artifact	TokenNameIdentifier	 Artifact
copyArtifact	TokenNameIdentifier	 copy Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For some reason with the introduction of MNG-1577 we have the case in Yoko where a depMan section has 	TokenNameCOMMENT_LINE	For some reason with the introduction of MNG-1577 we have the case in Yoko where a depMan section has 
// something like the following: 	TokenNameCOMMENT_LINE	something like the following: 
// 	TokenNameCOMMENT_LINE	 
// <dependencyManagement> 	TokenNameCOMMENT_LINE	<dependencyManagement> 
// <dependencies> 	TokenNameCOMMENT_LINE	<dependencies> 
// <!-- Yoko modules --> 	TokenNameCOMMENT_LINE	<!-- Yoko modules --> 
// <dependency> 	TokenNameCOMMENT_LINE	<dependency> 
// <groupId>org.apache.yoko</groupId> 	TokenNameCOMMENT_LINE	<groupId>org.apache.yoko</groupId> 
// <artifactId>yoko-core</artifactId> 	TokenNameCOMMENT_LINE	<artifactId>yoko-core</artifactId> 
// <version>${version}</version> 	TokenNameCOMMENT_LINE	<version>${version}</version> 
// </dependency> 	TokenNameCOMMENT_LINE	</dependency> 
// ... 	TokenNameCOMMENT_LINE	... 
// 	TokenNameCOMMENT_LINE	 
// And the range is not set so we'll check here and set it. jvz. 	TokenNameCOMMENT_LINE	And the range is not set so we'll check here and set it. jvz. 
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
cloneOf	TokenNameIdentifier	 clone Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isOptional	TokenNameIdentifier	 is Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRelease	TokenNameIdentifier	 set Release
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isRelease	TokenNameIdentifier	 is Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setResolvedVersion	TokenNameIdentifier	 set Resolved Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setAvailableVersions	TokenNameIdentifier	 set Available Versions
(	TokenNameLPAREN	
copyList	TokenNameIdentifier	 copy List
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getAvailableVersions	TokenNameIdentifier	 get Available Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setBaseVersion	TokenNameIdentifier	 set Base Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setDependencyFilter	TokenNameIdentifier	 set Dependency Filter
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyFilter	TokenNameIdentifier	 get Dependency Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setDependencyTrail	TokenNameIdentifier	 set Dependency Trail
(	TokenNameLPAREN	
copyList	TokenNameIdentifier	 copy List
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyTrail	TokenNameIdentifier	 get Dependency Trail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setDownloadUrl	TokenNameIdentifier	 set Download Url
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDownloadUrl	TokenNameIdentifier	 get Download Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRepository	TokenNameIdentifier	 set Repository
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>to</code> collection */	TokenNameCOMMENT_JAVADOC	 Returns <code>to</code> collection 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>>	TokenNameRIGHT_SHIFT	
T	TokenNameIdentifier	 T
copyArtifacts	TokenNameIdentifier	 copy Artifacts
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
:	TokenNameCOLON	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
copyArtifact	TokenNameIdentifier	 copy Artifact
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>>	TokenNameRIGHT_SHIFT	
T	TokenNameIdentifier	 T
copyArtifacts	TokenNameIdentifier	 copy Artifacts
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
?	TokenNameQUESTION	
extends	TokenNameextends	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
?	TokenNameQUESTION	
extends	TokenNameextends	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
from	TokenNameIdentifier	 from
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
copyArtifact	TokenNameIdentifier	 copy Artifact
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
copyList	TokenNameIdentifier	 copy List
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
