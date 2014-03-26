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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
ArtifactHandlerMock	TokenNameIdentifier	 Artifact Handler Mock
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
class	TokenNameclass	
DefaultArtifactTest	TokenNameIdentifier	 Default Artifact Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
snapshotArtifact	TokenNameIdentifier	 snapshot Artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
"groupid"	TokenNameStringLiteral	groupid
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
"artifactId"	TokenNameStringLiteral	artifactId
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
"artifactScope"	TokenNameStringLiteral	artifactScope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
"classifier"	TokenNameStringLiteral	classifier
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
snapshotSpecVersion	TokenNameIdentifier	 snapshot Spec Version
=	TokenNameEQUAL	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
snapshotResolvedVersion	TokenNameIdentifier	 snapshot Resolved Version
=	TokenNameEQUAL	
"1.0-20070606.010101-1"	TokenNameStringLiteral	1.0-20070606.010101-1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
VersionRange	TokenNameIdentifier	 Version Range
versionRange	TokenNameIdentifier	 version Range
;	TokenNameSEMICOLON	
private	TokenNameprivate	
VersionRange	TokenNameIdentifier	 Version Range
snapshotVersionRange	TokenNameIdentifier	 snapshot Version Range
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactHandlerMock	TokenNameIdentifier	 Artifact Handler Mock
artifactHandler	TokenNameIdentifier	 artifact Handler
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifactHandler	TokenNameIdentifier	 artifact Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactHandlerMock	TokenNameIdentifier	 Artifact Handler Mock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versionRange	TokenNameIdentifier	 version Range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotVersionRange	TokenNameIdentifier	 snapshot Version Range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
snapshotResolvedVersion	TokenNameIdentifier	 snapshot Resolved Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotArtifact	TokenNameIdentifier	 snapshot Artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
snapshotVersionRange	TokenNameIdentifier	 snapshot Version Range
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetVersionReturnsResolvedVersionOnSnapshot	TokenNameIdentifier	 test Get Version Returns Resolved Version On Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
snapshotResolvedVersion	TokenNameIdentifier	 snapshot Resolved Version
,	TokenNameCOMMA	
snapshotArtifact	TokenNameIdentifier	 snapshot Artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this is FOUL! 	TokenNameCOMMENT_LINE	this is FOUL! 
// snapshotArtifact.isSnapshot(); 	TokenNameCOMMENT_LINE	snapshotArtifact.isSnapshot(); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
snapshotSpecVersion	TokenNameIdentifier	 snapshot Spec Version
,	TokenNameCOMMA	
snapshotArtifact	TokenNameIdentifier	 snapshot Artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetDependencyConflictId	TokenNameIdentifier	 test Get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetDependencyConflictIdNullGroupId	TokenNameIdentifier	 test Get Dependency Conflict Id Null Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetDependencyConflictIdNullClassifier	TokenNameIdentifier	 test Get Dependency Conflict Id Null Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetDependencyConflictIdNullScope	TokenNameIdentifier	 test Get Dependency Conflict Id Null Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToString	TokenNameIdentifier	 test To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
classifier	TokenNameIdentifier	 classifier
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToStringNullGroupId	TokenNameIdentifier	 test To String Null Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
classifier	TokenNameIdentifier	 classifier
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToStringNullClassifier	TokenNameIdentifier	 test To String Null Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
versionRange	TokenNameIdentifier	 version Range
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToStringNullScope	TokenNameIdentifier	 test To String Null Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
classifier	TokenNameIdentifier	 classifier
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComparisonByVersion	TokenNameIdentifier	 test Comparison By Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
artifact1	TokenNameIdentifier	 artifact1
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"5.0"	TokenNameStringLiteral	5.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact2	TokenNameIdentifier	 artifact2
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"12.0"	TokenNameStringLiteral	12.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
artifact1	TokenNameIdentifier	 artifact1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
artifact2	TokenNameIdentifier	 artifact2
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
artifact2	TokenNameIdentifier	 artifact2
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
artifact1	TokenNameIdentifier	 artifact1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"5.0"	TokenNameStringLiteral	5.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
artifact1	TokenNameIdentifier	 artifact1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
artifact1	TokenNameIdentifier	 artifact1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonResolvedVersionRangeConsistentlyYieldsNullVersions	TokenNameIdentifier	 test Non Resolved Version Range Consistently Yields Null Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
vr	TokenNameIdentifier	 vr
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,2.0)"	TokenNameStringLiteral	[1.0,2.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
vr	TokenNameIdentifier	 vr
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
artifactHandler	TokenNameIdentifier	 artifact Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
