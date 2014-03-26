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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblem	TokenNameIdentifier	 Model Problem
;	TokenNameSEMICOLON	
/** * Collects the output of the project builder. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects the output of the project builder. * @author Benjamin Bentmann 
class	TokenNameclass	
DefaultProjectBuildingResult	TokenNameIdentifier	 Default Project Building Result
implements	TokenNameimplements	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
;	TokenNameSEMICOLON	
/** * Creates a new result with the specified contents. * * @param project The project that was built, may be {@code null}. * @param problems The problems that were encouterned, may be {@code null}. * @param dependencyResolutionResult The result of the resolution for the project dependencies, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new result with the specified contents. * @param project The project that was built, may be {@code null}. @param problems The problems that were encouterned, may be {@code null}. @param dependencyResolutionResult The result of the resolution for the project dependencies, may be {@code null}. 
public	TokenNamepublic	
DefaultProjectBuildingResult	TokenNameIdentifier	 Default Project Building Result
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
,	TokenNameCOMMA	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectId	TokenNameIdentifier	 project Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pomFile	TokenNameIdentifier	 pom File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
=	TokenNameEQUAL	
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new result with the specified contents. * * @param projectId The identifier of the project, may be {@code null}. * @param pomFile The POM file from which the project was built, may be {@code null}. * @param problems The problems that were encouterned, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new result with the specified contents. * @param projectId The identifier of the project, may be {@code null}. @param pomFile The POM file from which the project was built, may be {@code null}. @param problems The problems that were encouterned, may be {@code null}. 
public	TokenNamepublic	
DefaultProjectBuildingResult	TokenNameIdentifier	 Default Project Building Result
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectId	TokenNameIdentifier	 project Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
projectId	TokenNameIdentifier	 project Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pomFile	TokenNameIdentifier	 pom File
=	TokenNameEQUAL	
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProjectId	TokenNameIdentifier	 get Project Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getPomFile	TokenNameIdentifier	 get Pom File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
getDependencyResolutionResult	TokenNameIdentifier	 get Dependency Resolution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencyResolutionResult	TokenNameIdentifier	 dependency Resolution Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
