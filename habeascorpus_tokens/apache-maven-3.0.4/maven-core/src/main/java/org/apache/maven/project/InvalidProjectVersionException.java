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
public	TokenNamepublic	
class	TokenNameclass	
InvalidProjectVersionException	TokenNameIdentifier	 Invalid Project Version Exception
extends	TokenNameextends	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
locationInPom	TokenNameIdentifier	 location In Pom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
offendingVersion	TokenNameIdentifier	 offending Version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InvalidProjectVersionException	TokenNameIdentifier	 Invalid Project Version Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
locationInPom	TokenNameIdentifier	 location In Pom
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
offendingVersion	TokenNameIdentifier	 offending Version
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
,	TokenNameCOMMA	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
locationInPom	TokenNameIdentifier	 location In Pom
,	TokenNameCOMMA	
offendingVersion	TokenNameIdentifier	 offending Version
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locationInPom	TokenNameIdentifier	 location In Pom
=	TokenNameEQUAL	
locationInPom	TokenNameIdentifier	 location In Pom
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offendingVersion	TokenNameIdentifier	 offending Version
=	TokenNameEQUAL	
offendingVersion	TokenNameIdentifier	 offending Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
locationInPom	TokenNameIdentifier	 location In Pom
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
offendingVersion	TokenNameIdentifier	 offending Version
,	TokenNameCOMMA	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Invalid version: "	TokenNameStringLiteral	Invalid version: 
+	TokenNamePLUS	
offendingVersion	TokenNameIdentifier	 offending Version
+	TokenNamePLUS	
" found for: "	TokenNameStringLiteral	 found for: 
+	TokenNamePLUS	
locationInPom	TokenNameIdentifier	 location In Pom
+	TokenNamePLUS	
" in project: "	TokenNameStringLiteral	 in project: 
+	TokenNamePLUS	
projectId	TokenNameIdentifier	 project Id
+	TokenNamePLUS	
". Reason: "	TokenNameStringLiteral	. Reason: 
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOffendingVersion	TokenNameIdentifier	 get Offending Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offendingVersion	TokenNameIdentifier	 offending Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocationInPom	TokenNameIdentifier	 get Location In Pom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locationInPom	TokenNameIdentifier	 location In Pom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
