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
/** * Exception thrown when the identity of an artifact can not be established, * eg. one of groupId, artifactId, version or type is null. */	TokenNameCOMMENT_JAVADOC	 Exception thrown when the identity of an artifact can not be established, eg. one of groupId, artifactId, version or type is null. 
public	TokenNamepublic	
class	TokenNameclass	
InvalidArtifactRTException	TokenNameIdentifier	 Invalid Artifact RT Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
baseMessage	TokenNameIdentifier	 base Message
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InvalidArtifactRTException	TokenNameIdentifier	 Invalid Artifact RT Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseMessage	TokenNameIdentifier	 base Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InvalidArtifactRTException	TokenNameIdentifier	 Invalid Artifact RT Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseMessage	TokenNameIdentifier	 base Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"For artifact {"	TokenNameStringLiteral	For artifact {
+	TokenNamePLUS	
getArtifactKey	TokenNameIdentifier	 get Artifact Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}: "	TokenNameStringLiteral	}: 
+	TokenNamePLUS	
getBaseMessage	TokenNameIdentifier	 get Base Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseMessage	TokenNameIdentifier	 get Base Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseMessage	TokenNameIdentifier	 base Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactKey	TokenNameIdentifier	 get Artifact Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
