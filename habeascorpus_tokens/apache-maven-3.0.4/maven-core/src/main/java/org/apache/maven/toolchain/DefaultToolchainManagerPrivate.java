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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
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
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
/** * @author mkleint */	TokenNameCOMMENT_JAVADOC	 @author mkleint 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ToolchainManagerPrivate	TokenNameIdentifier	 Toolchain Manager Private
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultToolchainManagerPrivate	TokenNameIdentifier	 Default Toolchain Manager Private
extends	TokenNameextends	
DefaultToolchainManager	TokenNameIdentifier	 Default Toolchain Manager
implements	TokenNameimplements	
ToolchainManagerPrivate	TokenNameIdentifier	 Toolchain Manager Private
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ToolchainsBuilder	TokenNameIdentifier	 Toolchains Builder
toolchainsBuilder	TokenNameIdentifier	 toolchains Builder
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getToolchainsForType	TokenNameIdentifier	 get Toolchains For Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
MisconfiguredToolchainException	TokenNameIdentifier	 Misconfigured Toolchain Exception
{	TokenNameLBRACE	
PersistedToolchains	TokenNameIdentifier	 Persisted Toolchains
pers	TokenNameIdentifier	 pers
=	TokenNameEQUAL	
toolchainsBuilder	TokenNameIdentifier	 toolchains Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getRequest	TokenNameIdentifier	 get Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUserToolchainsFile	TokenNameIdentifier	 get User Toolchains File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
>	TokenNameGREATER	
toRet	TokenNameIdentifier	 to Ret
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pers	TokenNameIdentifier	 pers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
>	TokenNameGREATER	
lst	TokenNameIdentifier	 lst
=	TokenNameEQUAL	
pers	TokenNameIdentifier	 pers
.	TokenNameDOT	
getToolchains	TokenNameIdentifier	 get Toolchains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lst	TokenNameIdentifier	 lst
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
toolchainModel	TokenNameIdentifier	 toolchain Model
:	TokenNameCOLON	
lst	TokenNameIdentifier	 lst
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ToolchainFactory	TokenNameIdentifier	 Toolchain Factory
fact	TokenNameIdentifier	 fact
=	TokenNameEQUAL	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
toolchainModel	TokenNameIdentifier	 toolchain Model
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fact	TokenNameIdentifier	 fact
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toRet	TokenNameIdentifier	 to Ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fact	TokenNameIdentifier	 fact
.	TokenNameDOT	
createToolchain	TokenNameIdentifier	 create Toolchain
(	TokenNameLPAREN	
toolchainModel	TokenNameIdentifier	 toolchain Model
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Missing toolchain factory for type: "	TokenNameStringLiteral	Missing toolchain factory for type: 
+	TokenNamePLUS	
toolchainModel	TokenNameIdentifier	 toolchain Model
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
". Possibly caused by misconfigured project."	TokenNameStringLiteral	. Possibly caused by misconfigured project.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ToolchainFactory	TokenNameIdentifier	 Toolchain Factory
toolchainFactory	TokenNameIdentifier	 toolchain Factory
:	TokenNameCOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
tool	TokenNameIdentifier	 tool
=	TokenNameEQUAL	
toolchainFactory	TokenNameIdentifier	 toolchain Factory
.	TokenNameDOT	
createDefaultToolchain	TokenNameIdentifier	 create Default Toolchain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tool	TokenNameIdentifier	 tool
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toRet	TokenNameIdentifier	 to Ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tool	TokenNameIdentifier	 tool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
toRet	TokenNameIdentifier	 to Ret
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
[	TokenNameLBRACKET	
toRet	TokenNameIdentifier	 to Ret
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
storeToolchainToBuildContext	TokenNameIdentifier	 store Toolchain To Build Context
(	TokenNameLPAREN	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
toolchain	TokenNameIdentifier	 toolchain
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
retrieveContext	TokenNameIdentifier	 retrieve Context
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
getStorageKey	TokenNameIdentifier	 get Storage Key
(	TokenNameLPAREN	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
