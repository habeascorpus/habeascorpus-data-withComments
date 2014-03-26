package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
PersistedToolchains	TokenNameIdentifier	 Persisted Toolchains
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
xpp3	TokenNameIdentifier	 xpp3
.	TokenNameDOT	
MavenToolchainsXpp3Reader	TokenNameIdentifier	 Maven Toolchains Xpp3 Reader
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
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
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
IOUtil	TokenNameIdentifier	 IO Util
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
ReaderFactory	TokenNameIdentifier	 Reader Factory
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ToolchainsBuilder	TokenNameIdentifier	 Toolchains Builder
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hint	TokenNameIdentifier	 hint
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultToolchainsBuilder	TokenNameIdentifier	 Default Toolchains Builder
implements	TokenNameimplements	
ToolchainsBuilder	TokenNameIdentifier	 Toolchains Builder
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PersistedToolchains	TokenNameIdentifier	 Persisted Toolchains
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
)	TokenNameRPAREN	
throws	TokenNamethrows	
MisconfiguredToolchainException	TokenNameIdentifier	 Misconfigured Toolchain Exception
{	TokenNameLBRACE	
PersistedToolchains	TokenNameIdentifier	 Persisted Toolchains
toolchains	TokenNameIdentifier	 toolchains
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
ReaderFactory	TokenNameIdentifier	 Reader Factory
.	TokenNameDOT	
newXmlReader	TokenNameIdentifier	 new Xml Reader
(	TokenNameLPAREN	
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toolchains	TokenNameIdentifier	 toolchains
=	TokenNameEQUAL	
new	TokenNamenew	
MavenToolchainsXpp3Reader	TokenNameIdentifier	 Maven Toolchains Xpp3 Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MisconfiguredToolchainException	TokenNameIdentifier	 Misconfigured Toolchain Exception
(	TokenNameLPAREN	
"Cannot read toolchains file at "	TokenNameStringLiteral	Cannot read toolchains file at 
+	TokenNamePLUS	
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Toolchains configuration was not found at "	TokenNameStringLiteral	Toolchains configuration was not found at 
+	TokenNamePLUS	
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
toolchains	TokenNameIdentifier	 toolchains
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
