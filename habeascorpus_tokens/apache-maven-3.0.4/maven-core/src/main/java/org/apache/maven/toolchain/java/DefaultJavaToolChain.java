package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
java	TokenNameIdentifier	 java
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
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
DefaultToolchain	TokenNameIdentifier	 Default Toolchain
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
FileUtils	TokenNameIdentifier	 File Utils
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
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * @author Milos Kleint */	TokenNameCOMMENT_JAVADOC	 @author Milos Kleint 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
JavaToolChain	TokenNameIdentifier	 Java Tool Chain
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultJavaToolChain	TokenNameIdentifier	 Default Java Tool Chain
extends	TokenNameextends	
DefaultToolchain	TokenNameIdentifier	 Default Toolchain
implements	TokenNameimplements	
JavaToolChain	TokenNameIdentifier	 Java Tool Chain
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
javaHome	TokenNameIdentifier	 java Home
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_JAVAHOME	TokenNameIdentifier	 KEY  JAVAHOME
=	TokenNameEQUAL	
"jdkHome"	TokenNameStringLiteral	jdkHome
;	TokenNameSEMICOLON	
//NOI18N 	TokenNameCOMMENT_LINE	NOI18N 
public	TokenNamepublic	
DefaultJavaToolChain	TokenNameIdentifier	 Default Java Tool Chain
(	TokenNameLPAREN	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
"jdk"	TokenNameStringLiteral	jdk
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJavaHome	TokenNameIdentifier	 get Java Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaHome	TokenNameIdentifier	 java Home
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setJavaHome	TokenNameIdentifier	 set Java Home
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaHome	TokenNameIdentifier	 java Home
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
javaHome	TokenNameIdentifier	 java Home
=	TokenNameEQUAL	
javaHome	TokenNameIdentifier	 java Home
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"JDK["	TokenNameStringLiteral	JDK[
+	TokenNamePLUS	
getJavaHome	TokenNameIdentifier	 get Java Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
findTool	TokenNameIdentifier	 find Tool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toolName	TokenNameIdentifier	 tool Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
toRet	TokenNameIdentifier	 to Ret
=	TokenNameEQUAL	
findTool	TokenNameIdentifier	 find Tool
(	TokenNameLPAREN	
toolName	TokenNameIdentifier	 tool Name
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
getJavaHome	TokenNameIdentifier	 get Java Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toRet	TokenNameIdentifier	 to Ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toRet	TokenNameIdentifier	 to Ret
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
findTool	TokenNameIdentifier	 find Tool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toolName	TokenNameIdentifier	 tool Name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
installFolder	TokenNameIdentifier	 install Folder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
bin	TokenNameIdentifier	 bin
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
installFolder	TokenNameIdentifier	 install Folder
,	TokenNameCOMMA	
"bin"	TokenNameStringLiteral	bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//NOI18N 	TokenNameCOMMENT_LINE	NOI18N 
if	TokenNameif	
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
tool	TokenNameIdentifier	 tool
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
,	TokenNameCOMMA	
toolName	TokenNameIdentifier	 tool Name
+	TokenNamePLUS	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
?	TokenNameQUESTION	
".exe"	TokenNameStringLiteral	.exe
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOI18N 	TokenNameCOMMENT_LINE	NOI18N 
if	TokenNameif	
(	TokenNameLPAREN	
tool	TokenNameIdentifier	 tool
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tool	TokenNameIdentifier	 tool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
