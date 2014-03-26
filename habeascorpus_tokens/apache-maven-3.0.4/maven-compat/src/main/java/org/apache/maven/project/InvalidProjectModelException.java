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
project	TokenNameIdentifier	 project
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
ModelValidationResult	TokenNameIdentifier	 Model Validation Result
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
InvalidProjectModelException	TokenNameIdentifier	 Invalid Project Model Exception
extends	TokenNameextends	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
ModelValidationResult	TokenNameIdentifier	 Model Validation Result
validationResult	TokenNameIdentifier	 validation Result
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InvalidProjectModelException	TokenNameIdentifier	 Invalid Project Model Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
pomLocation	TokenNameIdentifier	 pom Location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
pomLocation	TokenNameIdentifier	 pom Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param projectId * @param pomLocation absolute path of the pom file * @param message * @param validationResult * @deprecated use {@link File} constructor for pomLocation */	TokenNameCOMMENT_JAVADOC	 @param projectId @param pomLocation absolute path of the pom file @param message @param validationResult @deprecated use {@link File} constructor for pomLocation 
public	TokenNamepublic	
InvalidProjectModelException	TokenNameIdentifier	 Invalid Project Model Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pomLocation	TokenNameIdentifier	 pom Location
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ModelValidationResult	TokenNameIdentifier	 Model Validation Result
validationResult	TokenNameIdentifier	 validation Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pomLocation	TokenNameIdentifier	 pom Location
)	TokenNameRPAREN	
,	TokenNameCOMMA	
validationResult	TokenNameIdentifier	 validation Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InvalidProjectModelException	TokenNameIdentifier	 Invalid Project Model Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
ModelValidationResult	TokenNameIdentifier	 Model Validation Result
validationResult	TokenNameIdentifier	 validation Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
validationResult	TokenNameIdentifier	 validation Result
=	TokenNameEQUAL	
validationResult	TokenNameIdentifier	 validation Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param projectId * @param pomLocation absolute path of the pom file * @param message * @deprecated use {@link File} constructor for pomLocation */	TokenNameCOMMENT_JAVADOC	 @param projectId @param pomLocation absolute path of the pom file @param message @deprecated use {@link File} constructor for pomLocation 
public	TokenNamepublic	
InvalidProjectModelException	TokenNameIdentifier	 Invalid Project Model Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pomLocation	TokenNameIdentifier	 pom Location
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pomLocation	TokenNameIdentifier	 pom Location
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
ModelValidationResult	TokenNameIdentifier	 Model Validation Result
getValidationResult	TokenNameIdentifier	 get Validation Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
validationResult	TokenNameIdentifier	 validation Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
