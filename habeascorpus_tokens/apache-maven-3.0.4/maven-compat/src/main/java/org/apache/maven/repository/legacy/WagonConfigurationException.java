package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
WagonConfigurationException	TokenNameIdentifier	 Wagon Configuration Exception
extends	TokenNameextends	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
repositoryId	TokenNameIdentifier	 repository Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WagonConfigurationException	TokenNameIdentifier	 Wagon Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repositoryId	TokenNameIdentifier	 repository Id
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
"While configuring wagon for '"	TokenNameStringLiteral	While configuring wagon for '
+	TokenNamePLUS	
repositoryId	TokenNameIdentifier	 repository Id
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repositoryId	TokenNameIdentifier	 repository Id
=	TokenNameEQUAL	
repositoryId	TokenNameIdentifier	 repository Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WagonConfigurationException	TokenNameIdentifier	 Wagon Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repositoryId	TokenNameIdentifier	 repository Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"While configuring wagon for '"	TokenNameStringLiteral	While configuring wagon for '
+	TokenNamePLUS	
repositoryId	TokenNameIdentifier	 repository Id
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repositoryId	TokenNameIdentifier	 repository Id
=	TokenNameEQUAL	
repositoryId	TokenNameIdentifier	 repository Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getRepositoryId	TokenNameIdentifier	 get Repository Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositoryId	TokenNameIdentifier	 repository Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getOriginalMessage	TokenNameIdentifier	 get Original Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
