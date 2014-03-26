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
/** * Exception that occurs when the project list contains duplicate projects instead of ignoring one. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Exception that occurs when the project list contains duplicate projects instead of ignoring one. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
existingProjectFile	TokenNameIdentifier	 existing Project File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
conflictingProjectFile	TokenNameIdentifier	 conflicting Project File
;	TokenNameSEMICOLON	
/** * @deprecated use {@link #DuplicateProjectException(String, File, File, String)} */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #DuplicateProjectException(String, File, File, String)} 
public	TokenNamepublic	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated use {@link #DuplicateProjectException(String, File, File, String)} */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #DuplicateProjectException(String, File, File, String)} 
public	TokenNamepublic	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projectId	TokenNameIdentifier	 project Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
existingProjectFile	TokenNameIdentifier	 existing Project File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
conflictingProjectFile	TokenNameIdentifier	 conflicting Project File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DuplicateProjectException	TokenNameIdentifier	 Duplicate Project Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
existingProjectFile	TokenNameIdentifier	 existing Project File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
conflictingProjectFile	TokenNameIdentifier	 conflicting Project File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
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
existingProjectFile	TokenNameIdentifier	 existing Project File
=	TokenNameEQUAL	
existingProjectFile	TokenNameIdentifier	 existing Project File
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
conflictingProjectFile	TokenNameIdentifier	 conflicting Project File
=	TokenNameEQUAL	
conflictingProjectFile	TokenNameIdentifier	 conflicting Project File
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
getExistingProjectFile	TokenNameIdentifier	 get Existing Project File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
existingProjectFile	TokenNameIdentifier	 existing Project File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getConflictingProjectFile	TokenNameIdentifier	 get Conflicting Project File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conflictingProjectFile	TokenNameIdentifier	 conflicting Project File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
