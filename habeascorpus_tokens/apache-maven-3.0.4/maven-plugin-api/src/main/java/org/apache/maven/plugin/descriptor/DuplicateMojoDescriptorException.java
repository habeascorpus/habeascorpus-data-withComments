package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
DuplicateMojoDescriptorException	TokenNameIdentifier	 Duplicate Mojo Descriptor Exception
extends	TokenNameextends	
InvalidPluginDescriptorException	TokenNameIdentifier	 Invalid Plugin Descriptor Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
DuplicateMojoDescriptorException	TokenNameIdentifier	 Duplicate Mojo Descriptor Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
goalPrefix	TokenNameIdentifier	 goal Prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
existingImplementation	TokenNameIdentifier	 existing Implementation
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newImplementation	TokenNameIdentifier	 new Implementation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Goal: "	TokenNameStringLiteral	Goal: 
+	TokenNamePLUS	
goal	TokenNameIdentifier	 goal
+	TokenNamePLUS	
" already exists in the plugin descriptor for prefix: "	TokenNameStringLiteral	 already exists in the plugin descriptor for prefix: 
+	TokenNamePLUS	
goalPrefix	TokenNameIdentifier	 goal Prefix
+	TokenNamePLUS	
" Existing implementation is: "	TokenNameStringLiteral	 Existing implementation is: 
+	TokenNamePLUS	
existingImplementation	TokenNameIdentifier	 existing Implementation
+	TokenNamePLUS	
" Conflicting implementation is: "	TokenNameStringLiteral	 Conflicting implementation is: 
+	TokenNamePLUS	
newImplementation	TokenNameIdentifier	 new Implementation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
