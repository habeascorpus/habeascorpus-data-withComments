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
Map	TokenNameIdentifier	 Map
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
/** * a private contract between the toolchains plugin and the components. * @author mkleint */	TokenNameCOMMENT_JAVADOC	 a private contract between the toolchains plugin and the components. @author mkleint 
public	TokenNamepublic	
interface	TokenNameinterface	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
extends	TokenNameextends	
Toolchain	TokenNameIdentifier	 Toolchain
{	TokenNameLBRACE	
/** * Let the toolchain decide if it matches requirements defined * in the toolchain plugin configuration. * @param requirements Map<String, String> key value pair * @return */	TokenNameCOMMENT_JAVADOC	 Let the toolchain decide if it matches requirements defined in the toolchain plugin configuration. @param requirements Map<String, String> key value pair @return 
boolean	TokenNameboolean	
matchesRequirements	TokenNameIdentifier	 matches Requirements
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
requirements	TokenNameIdentifier	 requirements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
