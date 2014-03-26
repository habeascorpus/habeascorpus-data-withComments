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
/** * Builds the toolchains model from a previously configured filesystem path to the toolchains file. * <strong>Note:</strong> This is an internal component whose interface can change without prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Builds the toolchains model from a previously configured filesystem path to the toolchains file. <strong>Note:</strong> This is an internal component whose interface can change without prior notice. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ToolchainsBuilder	TokenNameIdentifier	 Toolchains Builder
{	TokenNameLBRACE	
/** * Builds the toolchains model from the configured toolchain files. * * @param userToolchainsFile The path to the toolchains file, may be <code>null</code> to disable parsing. * @return The toolchains model or <code>null</code> if no toolchain file was configured or the configured file does * not exist. * @throws MisconfiguredToolchainException If the toolchain file exists but cannot be parsed. */	TokenNameCOMMENT_JAVADOC	 Builds the toolchains model from the configured toolchain files. * @param userToolchainsFile The path to the toolchains file, may be <code>null</code> to disable parsing. @return The toolchains model or <code>null</code> if no toolchain file was configured or the configured file does not exist. @throws MisconfiguredToolchainException If the toolchain file exists but cannot be parsed. 
PersistedToolchains	TokenNameIdentifier	 Persisted Toolchains
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
userToolchainsFile	TokenNameIdentifier	 user Toolchains File
)	TokenNameRPAREN	
throws	TokenNamethrows	
MisconfiguredToolchainException	TokenNameIdentifier	 Misconfigured Toolchain Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
