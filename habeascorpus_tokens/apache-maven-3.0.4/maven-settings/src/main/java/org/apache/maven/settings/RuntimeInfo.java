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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * To handle runtime informations like local repository or profiles. * */	TokenNameCOMMENT_JAVADOC	 To handle runtime informations like local repository or profiles. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
RuntimeInfo	TokenNameIdentifier	 Runtime Info
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
userHome	TokenNameIdentifier	 user Home
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
userMavenConfigurationHome	TokenNameIdentifier	 user Maven Configuration Home
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
userHome	TokenNameIdentifier	 user Home
,	TokenNameCOMMA	
".m2"	TokenNameStringLiteral	.m2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
DEFAULT_USER_SETTINGS_FILE	TokenNameIdentifier	 DEFAULT  USER  SETTINGS  FILE
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
userMavenConfigurationHome	TokenNameIdentifier	 user Maven Configuration Home
,	TokenNameCOMMA	
"settings.xml"	TokenNameStringLiteral	settings.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RuntimeInfo	TokenNameIdentifier	 Runtime Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
DEFAULT_USER_SETTINGS_FILE	TokenNameIdentifier	 DEFAULT  USER  SETTINGS  FILE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RuntimeInfo	TokenNameIdentifier	 Runtime Info
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
settings	TokenNameIdentifier	 settings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
