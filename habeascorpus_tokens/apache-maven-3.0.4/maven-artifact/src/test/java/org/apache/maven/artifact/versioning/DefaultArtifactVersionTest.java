package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Test DefaultArtifactVersion. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Test DefaultArtifactVersion. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactVersionTest	TokenNameIdentifier	 Default Artifact Version Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
int	TokenNameint	
major	TokenNameIdentifier	 major
,	TokenNameCOMMA	
int	TokenNameint	
minor	TokenNameIdentifier	 minor
,	TokenNameCOMMA	
int	TokenNameint	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
int	TokenNameint	
buildnumber	TokenNameIdentifier	 buildnumber
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifier	TokenNameIdentifier	 qualifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
artifactVersion	TokenNameIdentifier	 artifact Version
=	TokenNameEQUAL	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parsed	TokenNameIdentifier	 parsed
=	TokenNameEQUAL	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
"' parsed as ('"	TokenNameStringLiteral	' parsed as ('
+	TokenNamePLUS	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getMajorVersion	TokenNameIdentifier	 get Major Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"', '"	TokenNameStringLiteral	', '
+	TokenNamePLUS	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getMinorVersion	TokenNameIdentifier	 get Minor Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"', '"	TokenNameStringLiteral	', '
+	TokenNamePLUS	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getIncrementalVersion	TokenNameIdentifier	 get Incremental Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"', '"	TokenNameStringLiteral	', '
+	TokenNamePLUS	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getBuildNumber	TokenNameIdentifier	 get Build Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"', '"	TokenNameStringLiteral	', '
+	TokenNamePLUS	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getQualifier	TokenNameIdentifier	 get Qualifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'), "	TokenNameStringLiteral	'), 
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parsed	TokenNameIdentifier	 parsed
+	TokenNamePLUS	
"check major version"	TokenNameStringLiteral	check major version
,	TokenNameCOMMA	
major	TokenNameIdentifier	 major
,	TokenNameCOMMA	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getMajorVersion	TokenNameIdentifier	 get Major Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parsed	TokenNameIdentifier	 parsed
+	TokenNamePLUS	
"check minor version"	TokenNameStringLiteral	check minor version
,	TokenNameCOMMA	
minor	TokenNameIdentifier	 minor
,	TokenNameCOMMA	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getMinorVersion	TokenNameIdentifier	 get Minor Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parsed	TokenNameIdentifier	 parsed
+	TokenNamePLUS	
"check incremental version"	TokenNameStringLiteral	check incremental version
,	TokenNameCOMMA	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getIncrementalVersion	TokenNameIdentifier	 get Incremental Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parsed	TokenNameIdentifier	 parsed
+	TokenNamePLUS	
"check build number"	TokenNameStringLiteral	check build number
,	TokenNameCOMMA	
buildnumber	TokenNameIdentifier	 buildnumber
,	TokenNameCOMMA	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getBuildNumber	TokenNameIdentifier	 get Build Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
parsed	TokenNameIdentifier	 parsed
+	TokenNamePLUS	
"check qualifier"	TokenNameStringLiteral	check qualifier
,	TokenNameCOMMA	
qualifier	TokenNameIdentifier	 qualifier
,	TokenNameCOMMA	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
getQualifier	TokenNameIdentifier	 get Qualifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"check "	TokenNameStringLiteral	check 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" string value"	TokenNameStringLiteral	 string value
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
artifactVersion	TokenNameIdentifier	 artifact Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionParsing	TokenNameIdentifier	 test Version Parsing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2.3-1"	TokenNameStringLiteral	1.2.3-1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2.3-alpha-1"	TokenNameStringLiteral	1.2.3-alpha-1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"alpha-1"	TokenNameStringLiteral	alpha-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2-alpha-1"	TokenNameStringLiteral	1.2-alpha-1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"alpha-1"	TokenNameStringLiteral	alpha-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2-alpha-1-20050205.060708-1"	TokenNameStringLiteral	1.2-alpha-1-20050205.060708-1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"alpha-1-20050205.060708-1"	TokenNameStringLiteral	alpha-1-20050205.060708-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"RELEASE"	TokenNameStringLiteral	RELEASE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"RELEASE"	TokenNameStringLiteral	RELEASE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"2.0-1"	TokenNameStringLiteral	2.0-1
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 0 at the beginning of a number has a special handling 	TokenNameCOMMENT_LINE	0 at the beginning of a number has a special handling 
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"02"	TokenNameStringLiteral	02
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"02"	TokenNameStringLiteral	02
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"0.09"	TokenNameStringLiteral	0.09
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"0.09"	TokenNameStringLiteral	0.09
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"0.2.09"	TokenNameStringLiteral	0.2.09
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"0.2.09"	TokenNameStringLiteral	0.2.09
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"2.0-01"	TokenNameStringLiteral	2.0-01
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"01"	TokenNameStringLiteral	01
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// version schemes not really supported: fully transformed as qualifier 	TokenNameCOMMENT_LINE	version schemes not really supported: fully transformed as qualifier 
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.0.1b"	TokenNameStringLiteral	1.0.1b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.0.1b"	TokenNameStringLiteral	1.0.1b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.0M2"	TokenNameStringLiteral	1.0M2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.0M2"	TokenNameStringLiteral	1.0M2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.0RC2"	TokenNameStringLiteral	1.0RC2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.0RC2"	TokenNameStringLiteral	1.0RC2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.7.3.0"	TokenNameStringLiteral	1.7.3.0
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.7.3.0"	TokenNameStringLiteral	1.7.3.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.7.3.0-1"	TokenNameStringLiteral	1.7.3.0-1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.7.3.0-1"	TokenNameStringLiteral	1.7.3.0-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"PATCH-1193602"	TokenNameStringLiteral	PATCH-1193602
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"PATCH-1193602"	TokenNameStringLiteral	PATCH-1193602
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"5.0.0alpha-2006020117"	TokenNameStringLiteral	5.0.0alpha-2006020117
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"5.0.0alpha-2006020117"	TokenNameStringLiteral	5.0.0alpha-2006020117
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.0.0.-SNAPSHOT"	TokenNameStringLiteral	1.0.0.-SNAPSHOT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.0.0.-SNAPSHOT"	TokenNameStringLiteral	1.0.0.-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1..0-SNAPSHOT"	TokenNameStringLiteral	1..0-SNAPSHOT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1..0-SNAPSHOT"	TokenNameStringLiteral	1..0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.0.-SNAPSHOT"	TokenNameStringLiteral	1.0.-SNAPSHOT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.0.-SNAPSHOT"	TokenNameStringLiteral	1.0.-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
".1.0-SNAPSHOT"	TokenNameStringLiteral	.1.0-SNAPSHOT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
".1.0-SNAPSHOT"	TokenNameStringLiteral	.1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2.3.200705301630"	TokenNameStringLiteral	1.2.3.200705301630
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"1.2.3.200705301630"	TokenNameStringLiteral	1.2.3.200705301630
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionParsing	TokenNameIdentifier	 check Version Parsing
(	TokenNameLPAREN	
"1.2.3-200705301630"	TokenNameStringLiteral	1.2.3-200705301630
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"200705301630"	TokenNameStringLiteral	200705301630
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionComparing	TokenNameIdentifier	 test Version Comparing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2.5"	TokenNameStringLiteral	2.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1.0.0"	TokenNameStringLiteral	1.0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0.0"	TokenNameStringLiteral	1.0.0
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
"1.2.0"	TokenNameStringLiteral	1.2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
,	TokenNameCOMMA	
"1.0-alpha-2"	TokenNameStringLiteral	1.0-alpha-2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-2"	TokenNameStringLiteral	1.0-alpha-2
,	TokenNameCOMMA	
"1.0-alpha-15"	TokenNameStringLiteral	1.0-alpha-15
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
,	TokenNameCOMMA	
"1.0-beta-1"	TokenNameStringLiteral	1.0-beta-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-beta-1"	TokenNameStringLiteral	1.0-beta-1
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"1.0-1"	TokenNameStringLiteral	1.0-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-1"	TokenNameStringLiteral	1.0-1
,	TokenNameCOMMA	
"1.0-2"	TokenNameStringLiteral	1.0-2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"2.0-0"	TokenNameStringLiteral	2.0-0
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"2.0-1"	TokenNameStringLiteral	2.0-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.0"	TokenNameStringLiteral	2.0.0
,	TokenNameCOMMA	
"2.0-1"	TokenNameStringLiteral	2.0-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0-1"	TokenNameStringLiteral	2.0-1
,	TokenNameCOMMA	
"2.0.1"	TokenNameStringLiteral	2.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1-klm"	TokenNameStringLiteral	2.0.1-klm
,	TokenNameCOMMA	
"2.0.1-lmn"	TokenNameStringLiteral	2.0.1-lmn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1"	TokenNameStringLiteral	2.0.1
,	TokenNameCOMMA	
"2.0.1-xyz"	TokenNameStringLiteral	2.0.1-xyz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1-xyz-1"	TokenNameStringLiteral	2.0.1-xyz-1
,	TokenNameCOMMA	
"2.0.1-1-xyz"	TokenNameStringLiteral	2.0.1-1-xyz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1"	TokenNameStringLiteral	2.0.1
,	TokenNameCOMMA	
"2.0.1-123"	TokenNameStringLiteral	2.0.1-123
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1-xyz"	TokenNameStringLiteral	2.0.1-xyz
,	TokenNameCOMMA	
"2.0.1-123"	TokenNameStringLiteral	2.0.1-123
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.2.3-10000000000"	TokenNameStringLiteral	1.2.3-10000000000
,	TokenNameCOMMA	
"1.2.3-10000000001"	TokenNameStringLiteral	1.2.3-10000000001
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.2.3-1"	TokenNameStringLiteral	1.2.3-1
,	TokenNameCOMMA	
"1.2.3-10000000001"	TokenNameStringLiteral	1.2.3-10000000001
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.3.0-v200706262000"	TokenNameStringLiteral	2.3.0-v200706262000
,	TokenNameCOMMA	
"2.3.0-v200706262130"	TokenNameStringLiteral	2.3.0-v200706262130
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// org.eclipse:emf:2.3.0-v200706262000 	TokenNameCOMMENT_LINE	org.eclipse:emf:2.3.0-v200706262000 
// org.eclipse.wst.common_core.feature_2.0.0.v200706041905-7C78EK9E_EkMNfNOd2d8qq 	TokenNameCOMMENT_LINE	org.eclipse.wst.common_core.feature_2.0.0.v200706041905-7C78EK9E_EkMNfNOd2d8qq 
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.0.v200706041905-7C78EK9E_EkMNfNOd2d8qq"	TokenNameStringLiteral	2.0.0.v200706041905-7C78EK9E_EkMNfNOd2d8qq
,	TokenNameCOMMA	
"2.0.0.v200706041906-7C78EK9E_EkMNfNOd2d8qq"	TokenNameStringLiteral	2.0.0.v200706041906-7C78EK9E_EkMNfNOd2d8qq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionSnapshotComparing	TokenNameIdentifier	 test Version Snapshot Comparing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
,	TokenNameCOMMA	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
,	TokenNameCOMMA	
"2-SNAPSHOT"	TokenNameStringLiteral	2-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.5-SNAPSHOT"	TokenNameStringLiteral	1.5-SNAPSHOT
,	TokenNameCOMMA	
"2-SNAPSHOT"	TokenNameStringLiteral	2-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
,	TokenNameCOMMA	
"2.5-SNAPSHOT"	TokenNameStringLiteral	2.5-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
,	TokenNameCOMMA	
"1.0.0-SNAPSHOT"	TokenNameStringLiteral	1.0.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
,	TokenNameCOMMA	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
,	TokenNameCOMMA	
"1.2-SNAPSHOT"	TokenNameStringLiteral	1.2-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0.0-SNAPSHOT"	TokenNameStringLiteral	1.0.0-SNAPSHOT
,	TokenNameCOMMA	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
,	TokenNameCOMMA	
"1.2.0-SNAPSHOT"	TokenNameStringLiteral	1.2.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//assertVersionOlder( "1.0-alpha-1-SNAPSHOT", "1.0-SNAPSHOT" ); 	TokenNameCOMMENT_LINE	assertVersionOlder( "1.0-alpha-1-SNAPSHOT", "1.0-SNAPSHOT" ); 
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-alpha-2-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-2-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-beta-1-SNAPSHOT"	TokenNameStringLiteral	1.0-beta-1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-beta-1-SNAPSHOT"	TokenNameStringLiteral	1.0-beta-1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-SNAPSHOT-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-SNAPSHOT-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT-SNAPSHOT
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-alpha-1-SNAPSHOT-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-1-SNAPSHOT-SNAPSHOT
,	TokenNameCOMMA	
"1.0-alpha-1-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
,	TokenNameCOMMA	
"1.0-1-SNAPSHOT"	TokenNameStringLiteral	1.0-1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-1-SNAPSHOT"	TokenNameStringLiteral	1.0-1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-2-SNAPSHOT"	TokenNameStringLiteral	1.0-2-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//assertVersionEqual( "2.0-0-SNAPSHOT", "2.0-SNAPSHOT" ); 	TokenNameCOMMENT_LINE	assertVersionEqual( "2.0-0-SNAPSHOT", "2.0-SNAPSHOT" ); 
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0-SNAPSHOT"	TokenNameStringLiteral	2.0-SNAPSHOT
,	TokenNameCOMMA	
"2.0-1-SNAPSHOT"	TokenNameStringLiteral	2.0-1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.0-SNAPSHOT"	TokenNameStringLiteral	2.0.0-SNAPSHOT
,	TokenNameCOMMA	
"2.0-1-SNAPSHOT"	TokenNameStringLiteral	2.0-1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0-1-SNAPSHOT"	TokenNameStringLiteral	2.0-1-SNAPSHOT
,	TokenNameCOMMA	
"2.0.1-SNAPSHOT"	TokenNameStringLiteral	2.0.1-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1-klm-SNAPSHOT"	TokenNameStringLiteral	2.0.1-klm-SNAPSHOT
,	TokenNameCOMMA	
"2.0.1-lmn-SNAPSHOT"	TokenNameStringLiteral	2.0.1-lmn-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// assertVersionOlder( "2.0.1-xyz-SNAPSHOT", "2.0.1-SNAPSHOT" ); 	TokenNameCOMMENT_LINE	assertVersionOlder( "2.0.1-xyz-SNAPSHOT", "2.0.1-SNAPSHOT" ); 
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1-SNAPSHOT"	TokenNameStringLiteral	2.0.1-SNAPSHOT
,	TokenNameCOMMA	
"2.0.1-123-SNAPSHOT"	TokenNameStringLiteral	2.0.1-123-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"2.0.1-xyz-SNAPSHOT"	TokenNameStringLiteral	2.0.1-xyz-SNAPSHOT
,	TokenNameCOMMA	
"2.0.1-123-SNAPSHOT"	TokenNameStringLiteral	2.0.1-123-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSnapshotVsReleases	TokenNameIdentifier	 test Snapshot Vs Releases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-RC1"	TokenNameStringLiteral	1.0-RC1
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-rc1"	TokenNameStringLiteral	1.0-rc1
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
"1.0-rc-1"	TokenNameStringLiteral	1.0-rc-1
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHashCode	TokenNameIdentifier	 test Hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEqualsNullSafe	TokenNameIdentifier	 test Equals Null Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEqualsTypeSafe	TokenNameIdentifier	 test Equals Type Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"non-an-artifact-version-instance"	TokenNameStringLiteral	non-an-artifact-version-instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertVersionOlder	TokenNameIdentifier	 assert Version Older
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
" should be older than "	TokenNameStringLiteral	 should be older than 
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
" should be newer than "	TokenNameStringLiteral	 should be newer than 
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertVersionEqual	TokenNameIdentifier	 assert Version Equal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
" should be equal to "	TokenNameStringLiteral	 should be equal to 
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
" should be equal to "	TokenNameStringLiteral	 should be equal to 
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
newArtifactVersion	TokenNameIdentifier	 new Artifact Version
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
