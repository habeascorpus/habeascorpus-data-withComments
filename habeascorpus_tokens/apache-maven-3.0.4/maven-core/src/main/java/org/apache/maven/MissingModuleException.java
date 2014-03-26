package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MissingModuleException	TokenNameIdentifier	 Missing Module Exception
extends	TokenNameextends	
MavenExecutionException	TokenNameIdentifier	 Maven Execution Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
moduleFile	TokenNameIdentifier	 module File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
moduleName	TokenNameIdentifier	 module Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MissingModuleException	TokenNameIdentifier	 Missing Module Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
moduleName	TokenNameIdentifier	 module Name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
moduleFile	TokenNameIdentifier	 module File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"The module: "	TokenNameStringLiteral	The module: 
+	TokenNamePLUS	
moduleName	TokenNameIdentifier	 module Name
+	TokenNamePLUS	
" cannot be found in file: "	TokenNameStringLiteral	 cannot be found in file: 
+	TokenNamePLUS	
moduleFile	TokenNameIdentifier	 module File
,	TokenNameCOMMA	
pomFile	TokenNameIdentifier	 pom File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
moduleName	TokenNameIdentifier	 module Name
=	TokenNameEQUAL	
moduleName	TokenNameIdentifier	 module Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
moduleFile	TokenNameIdentifier	 module File
=	TokenNameEQUAL	
moduleFile	TokenNameIdentifier	 module File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getModuleFile	TokenNameIdentifier	 get Module File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
moduleFile	TokenNameIdentifier	 module File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getModuleName	TokenNameIdentifier	 get Module Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
moduleName	TokenNameIdentifier	 module Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
