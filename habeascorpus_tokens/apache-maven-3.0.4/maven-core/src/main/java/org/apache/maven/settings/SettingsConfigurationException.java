package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * If there was an error in the settings file. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 If there was an error in the settings file. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
SettingsConfigurationException	TokenNameIdentifier	 Settings Configuration Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SettingsConfigurationException	TokenNameIdentifier	 Settings Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SettingsConfigurationException	TokenNameIdentifier	 Settings Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
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
}	TokenNameRBRACE	
public	TokenNamepublic	
SettingsConfigurationException	TokenNameIdentifier	 Settings Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
,	TokenNameCOMMA	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
(	TokenNameLPAREN	
lineNumber	TokenNameIdentifier	 line Number
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
" Line: "	TokenNameStringLiteral	 Line: 
+	TokenNamePLUS	
lineNumber	TokenNameIdentifier	 line Number
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
columnNumber	TokenNameIdentifier	 column Number
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
" Column: "	TokenNameStringLiteral	 Column: 
+	TokenNamePLUS	
columnNumber	TokenNameIdentifier	 column Number
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
