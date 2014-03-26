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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
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
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
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
/** * Thrown if a dependency has an invalid version. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Thrown if a dependency has an invalid version. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
VersionNotFoundException	TokenNameIdentifier	 Version Not Found Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
public	TokenNamepublic	
VersionNotFoundException	TokenNameIdentifier	 Version Not Found Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
formatLocationInPom	TokenNameIdentifier	 format Location In Pom
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", pom file "	TokenNameStringLiteral	, pom file 
+	TokenNamePLUS	
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projectId	TokenNameIdentifier	 project Id
=	TokenNameEQUAL	
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pomFile	TokenNameIdentifier	 pom File
=	TokenNameEQUAL	
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dependency	TokenNameIdentifier	 dependency
=	TokenNameEQUAL	
dependency	TokenNameIdentifier	 dependency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatLocationInPom	TokenNameIdentifier	 format Location In Pom
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Dependency: "	TokenNameStringLiteral	Dependency: 
+	TokenNamePLUS	
ArtifactUtils	TokenNameIdentifier	 Artifact Utils
.	TokenNameDOT	
versionlessKey	TokenNameIdentifier	 versionless Key
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Dependency	TokenNameIdentifier	 Dependency
getDependency	TokenNameIdentifier	 get Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependency	TokenNameIdentifier	 dependency
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
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
getCauseException	TokenNameIdentifier	 get Cause Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
