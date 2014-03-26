package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Test the artifact resolution exception message * * @author Mauro Talevi */	TokenNameCOMMENT_JAVADOC	 Test the artifact resolution exception message * @author Mauro Talevi 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactResolutionExceptionTest	TokenNameIdentifier	 Artifact Resolution Exception Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingArtifactMessageFormat	TokenNameIdentifier	 test Missing Artifact Message Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Missing artifact"	TokenNameStringLiteral	Missing artifact
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
indentation	TokenNameIdentifier	 indentation
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
"aGroupId"	TokenNameStringLiteral	aGroupId
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
"anArtifactId"	TokenNameStringLiteral	anArtifactId
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
"aVersion"	TokenNameStringLiteral	aVersion
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
"jar"	TokenNameStringLiteral	jar
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
"aClassifier"	TokenNameStringLiteral	aClassifier
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
downloadUrl	TokenNameIdentifier	 download Url
=	TokenNameEQUAL	
"http://somewhere.com/download"	TokenNameStringLiteral	http://somewhere.com/download
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"dependency1"	TokenNameStringLiteral	dependency1
,	TokenNameCOMMA	
"dependency2"	TokenNameStringLiteral	dependency2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"Missing artifact"	TokenNameStringLiteral	Missing artifact
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" Try downloading the file manually from: "	TokenNameStringLiteral	 Try downloading the file manually from: 
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" http://somewhere.com/download"	TokenNameStringLiteral	 http://somewhere.com/download
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" Then, install it using the command: "	TokenNameStringLiteral	 Then, install it using the command: 
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" mvn install:install-file -DgroupId=aGroupId -DartifactId=anArtifactId -Dversion=aVersion "	TokenNameStringLiteral	 mvn install:install-file -DgroupId=aGroupId -DartifactId=anArtifactId -Dversion=aVersion 
+	TokenNamePLUS	
"-Dclassifier=aClassifier -Dpackaging=jar -Dfile=/path/to/file"	TokenNameStringLiteral	-Dclassifier=aClassifier -Dpackaging=jar -Dfile=/path/to/file
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" Alternatively, if you host your own repository you can deploy the file there: "	TokenNameStringLiteral	 Alternatively, if you host your own repository you can deploy the file there: 
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" mvn deploy:deploy-file -DgroupId=aGroupId -DartifactId=anArtifactId"	TokenNameStringLiteral	 mvn deploy:deploy-file -DgroupId=aGroupId -DartifactId=anArtifactId
+	TokenNamePLUS	
" -Dversion=aVersion -Dclassifier=aClassifier -Dpackaging=jar -Dfile=/path/to/file"	TokenNameStringLiteral	 -Dversion=aVersion -Dclassifier=aClassifier -Dpackaging=jar -Dfile=/path/to/file
+	TokenNamePLUS	
" -Durl=[url] -DrepositoryId=[id]"	TokenNameStringLiteral	 -Durl=[url] -DrepositoryId=[id]
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" Path to dependency: "	TokenNameStringLiteral	 Path to dependency: 
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" 1) dependency1"	TokenNameStringLiteral	 1) dependency1
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
" 2) dependency2"	TokenNameStringLiteral	 2) dependency2
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
AbstractArtifactResolutionException	TokenNameIdentifier	 Abstract Artifact Resolution Exception
.	TokenNameDOT	
constructMissingArtifactMessage	TokenNameIdentifier	 construct Missing Artifact Message
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
indentation	TokenNameIdentifier	 indentation
,	TokenNameCOMMA	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
downloadUrl	TokenNameIdentifier	 download Url
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
