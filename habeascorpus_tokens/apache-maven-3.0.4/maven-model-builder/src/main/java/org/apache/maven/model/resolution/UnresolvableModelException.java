package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
resolution	TokenNameIdentifier	 resolution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Signals an error when resolving the path to an external model. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Signals an error when resolving the path to an external model. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
UnresolvableModelException	TokenNameIdentifier	 Unresolvable Model Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/** * The group id of the unresolvable model. */	TokenNameCOMMENT_JAVADOC	 The group id of the unresolvable model. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
/** * The artifact id of the unresolvable model. */	TokenNameCOMMENT_JAVADOC	 The artifact id of the unresolvable model. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
/** * The version of the unresolvable model. */	TokenNameCOMMENT_JAVADOC	 The version of the unresolvable model. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
/** * Creates a new exception with specified detail message and cause. * * @param message The detail message, may be {@code null}. * @param groupId The group id of the unresolvable model, may be {@code null}. * @param artifactId The artifact id of the unresolvable model, may be {@code null}. * @param version The version of the unresolvable model, may be {@code null}. * @param cause The cause, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception with specified detail message and cause. * @param message The detail message, may be {@code null}. @param groupId The group id of the unresolvable model, may be {@code null}. @param artifactId The artifact id of the unresolvable model, may be {@code null}. @param version The version of the unresolvable model, may be {@code null}. @param cause The cause, may be {@code null}. 
public	TokenNamepublic	
UnresolvableModelException	TokenNameIdentifier	 Unresolvable Model Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
groupId	TokenNameIdentifier	 group Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
artifactId	TokenNameIdentifier	 artifact Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new exception with specified detail message. * * @param message The detail message, may be {@code null}. * @param groupId The group id of the unresolvable model, may be {@code null}. * @param artifactId The artifact id of the unresolvable model, may be {@code null}. * @param version The version of the unresolvable model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception with specified detail message. * @param message The detail message, may be {@code null}. @param groupId The group id of the unresolvable model, may be {@code null}. @param artifactId The artifact id of the unresolvable model, may be {@code null}. @param version The version of the unresolvable model, may be {@code null}. 
public	TokenNamepublic	
UnresolvableModelException	TokenNameIdentifier	 Unresolvable Model Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
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
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
groupId	TokenNameIdentifier	 group Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
artifactId	TokenNameIdentifier	 artifact Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the group id of the unresolvable model. * * @return The group id of the unresolvable model, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the group id of the unresolvable model. * @return The group id of the unresolvable model, can be empty but never {@code null}. 
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
/** * Gets the artifact id of the unresolvable model. * * @return The artifact id of the unresolvable model, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact id of the unresolvable model. * @return The artifact id of the unresolvable model, can be empty but never {@code null}. 
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
/** * Gets the version of the unresolvable model. * * @return The version of the unresolvable model, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the version of the unresolvable model. * @return The version of the unresolvable model, can be empty but never {@code null}. 
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
}	TokenNameRBRACE	
