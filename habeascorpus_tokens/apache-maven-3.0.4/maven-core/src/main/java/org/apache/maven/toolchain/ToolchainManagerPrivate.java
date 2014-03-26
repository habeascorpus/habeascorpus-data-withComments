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
/** * Component for use by the maven-toolchains-plugin only. * @author mkleint */	TokenNameCOMMENT_JAVADOC	 Component for use by the maven-toolchains-plugin only. @author mkleint 
public	TokenNamepublic	
interface	TokenNameinterface	
ToolchainManagerPrivate	TokenNameIdentifier	 Toolchain Manager Private
{	TokenNameLBRACE	
/** * Retrieves the toolchains of given type from the user settings. */	TokenNameCOMMENT_JAVADOC	 Retrieves the toolchains of given type from the user settings. 
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
;	TokenNameSEMICOLON	
/** * Stores the toolchain into build context. */	TokenNameCOMMENT_JAVADOC	 Stores the toolchain into build context. 
void	TokenNamevoid	
storeToolchainToBuildContext	TokenNameIdentifier	 store Toolchain To Build Context
(	TokenNameLPAREN	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
toolchain	TokenNameIdentifier	 toolchain
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
