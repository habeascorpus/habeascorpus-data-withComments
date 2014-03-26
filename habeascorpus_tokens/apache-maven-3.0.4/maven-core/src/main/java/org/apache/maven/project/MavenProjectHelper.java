package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
MavenProjectHelper	TokenNameIdentifier	 Maven Project Helper
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
MavenProjectHelper	TokenNameIdentifier	 Maven Project Helper
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactClassifier	TokenNameIdentifier	 artifact Classifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactType	TokenNameIdentifier	 artifact Type
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactType	TokenNameIdentifier	 artifact Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactClassifier	TokenNameIdentifier	 artifact Classifier
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
addResource	TokenNameIdentifier	 add Resource
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resourceDirectory	TokenNameIdentifier	 resource Directory
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
includes	TokenNameIdentifier	 includes
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
addTestResource	TokenNameIdentifier	 add Test Resource
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resourceDirectory	TokenNameIdentifier	 resource Directory
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
includes	TokenNameIdentifier	 includes
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
