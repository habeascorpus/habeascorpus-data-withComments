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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests {@link ArtifactUtils}. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Tests {@link ArtifactUtils}. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactUtilsTest	TokenNameIdentifier	 Artifact Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aid	TokenNameIdentifier	 aid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
"group"	TokenNameStringLiteral	group
,	TokenNameCOMMA	
aid	TokenNameIdentifier	 aid
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
"tests"	TokenNameStringLiteral	tests
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsSnapshot	TokenNameIdentifier	 test Is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
"1.2.3-SNAPSHOT"	TokenNameStringLiteral	1.2.3-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
"1.2.3-snapshot"	TokenNameStringLiteral	1.2.3-snapshot
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
"1.2.3-20090413.094722-2"	TokenNameStringLiteral	1.2.3-20090413.094722-2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToSnapshotVersion	TokenNameIdentifier	 test To Snapshot Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
toSnapshotVersion	TokenNameIdentifier	 to Snapshot Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.2.3-SNAPSHOT"	TokenNameStringLiteral	1.2.3-SNAPSHOT
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
toSnapshotVersion	TokenNameIdentifier	 to Snapshot Version
(	TokenNameLPAREN	
"1.2.3-SNAPSHOT"	TokenNameStringLiteral	1.2.3-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.2.3-SNAPSHOT"	TokenNameStringLiteral	1.2.3-SNAPSHOT
,	TokenNameCOMMA	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
toSnapshotVersion	TokenNameIdentifier	 to Snapshot Version
(	TokenNameLPAREN	
"1.2.3-20090413.094722-2"	TokenNameStringLiteral	1.2.3-20090413.094722-2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that the ordering of the map resembles the ordering of the input collection of artifacts. */	TokenNameCOMMENT_JAVADOC	 Tests that the ordering of the map resembles the ordering of the input collection of artifacts. 
public	TokenNamepublic	
void	TokenNamevoid	
testArtifactMapByVersionlessIdOrdering	TokenNameIdentifier	 test Artifact Map By Versionless Id Ordering
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
artifactMapByVersionlessId	TokenNameIdentifier	 artifact Map By Versionless Id
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
