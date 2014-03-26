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
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
;	TokenNameSEMICOLON	
/** * * @author mkleint */	TokenNameCOMMENT_JAVADOC	 * @author mkleint 
public	TokenNamepublic	
interface	TokenNameinterface	
ToolchainFactory	TokenNameIdentifier	 Toolchain Factory
{	TokenNameLBRACE	
/** * Create instance of toolchain. **/	TokenNameCOMMENT_JAVADOC	 Create instance of toolchain. *
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
createToolchain	TokenNameIdentifier	 create Toolchain
(	TokenNameLPAREN	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
MisconfiguredToolchainException	TokenNameIdentifier	 Misconfigured Toolchain Exception
;	TokenNameSEMICOLON	
/** * Returns the default instance of the particular type of toolchain, can return null * if not applicable. * TODO keep around?? **/	TokenNameCOMMENT_JAVADOC	 Returns the default instance of the particular type of toolchain, can return null if not applicable. TODO keep around?? *
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
createDefaultToolchain	TokenNameIdentifier	 create Default Toolchain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
