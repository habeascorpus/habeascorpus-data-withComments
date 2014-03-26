package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
DuplicateArtifactAttachmentException	TokenNameIdentifier	 Duplicate Artifact Attachment Exception
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
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PluginExecutionException	TokenNameIdentifier	 Plugin Execution Exception
extends	TokenNameextends	
PluginManagerException	TokenNameIdentifier	 Plugin Manager Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PluginExecutionException	TokenNameIdentifier	 Plugin Execution Exception
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginExecutionException	TokenNameIdentifier	 Plugin Execution Exception
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
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
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginExecutionException	TokenNameIdentifier	 Plugin Execution Exception
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
constructMessage	TokenNameIdentifier	 construct Message
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginExecutionException	TokenNameIdentifier	 Plugin Execution Exception
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
DuplicateArtifactAttachmentException	TokenNameIdentifier	 Duplicate Artifact Attachment Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
constructMessage	TokenNameIdentifier	 construct Message
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
constructMessage	TokenNameIdentifier	 construct Message
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojoExecution	TokenNameIdentifier	 mojo Execution
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Execution "	TokenNameStringLiteral	Execution 
+	TokenNamePLUS	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getExecutionId	TokenNameIdentifier	 get Execution Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" of goal "	TokenNameStringLiteral	 of goal 
+	TokenNamePLUS	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" failed"	TokenNameStringLiteral	 failed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Mojo execution failed"	TokenNameStringLiteral	Mojo execution failed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isNotEmpty	TokenNameIdentifier	 is Not Empty
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
+=	TokenNamePLUS_EQUAL	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
+=	TokenNamePLUS_EQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
