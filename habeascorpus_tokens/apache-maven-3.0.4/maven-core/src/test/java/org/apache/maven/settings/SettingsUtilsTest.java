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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SettingsUtilsTest	TokenNameIdentifier	 Settings Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldAppendRecessivePluginGroupIds	TokenNameIdentifier	 test Should Append Recessive Plugin Group Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Settings	TokenNameIdentifier	 Settings
dominant	TokenNameIdentifier	 dominant
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
addPluginGroup	TokenNameIdentifier	 add Plugin Group
(	TokenNameLPAREN	
"org.apache.maven.plugins"	TokenNameStringLiteral	org.apache.maven.plugins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
addPluginGroup	TokenNameIdentifier	 add Plugin Group
(	TokenNameLPAREN	
"org.codehaus.modello"	TokenNameStringLiteral	org.codehaus.modello
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Settings	TokenNameIdentifier	 Settings
recessive	TokenNameIdentifier	 recessive
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
addPluginGroup	TokenNameIdentifier	 add Plugin Group
(	TokenNameLPAREN	
"org.codehaus.plexus"	TokenNameStringLiteral	org.codehaus.plexus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SettingsUtils	TokenNameIdentifier	 Settings Utils
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
dominant	TokenNameIdentifier	 dominant
,	TokenNameCOMMA	
recessive	TokenNameIdentifier	 recessive
,	TokenNameCOMMA	
Settings	TokenNameIdentifier	 Settings
.	TokenNameDOT	
GLOBAL_LEVEL	TokenNameIdentifier	 GLOBAL  LEVEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
pluginGroups	TokenNameIdentifier	 plugin Groups
=	TokenNameEQUAL	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
getPluginGroups	TokenNameIdentifier	 get Plugin Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
pluginGroups	TokenNameIdentifier	 plugin Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pluginGroups	TokenNameIdentifier	 plugin Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.apache.maven.plugins"	TokenNameStringLiteral	org.apache.maven.plugins
,	TokenNameCOMMA	
pluginGroups	TokenNameIdentifier	 plugin Groups
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.codehaus.modello"	TokenNameStringLiteral	org.codehaus.modello
,	TokenNameCOMMA	
pluginGroups	TokenNameIdentifier	 plugin Groups
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.codehaus.plexus"	TokenNameStringLiteral	org.codehaus.plexus
,	TokenNameCOMMA	
pluginGroups	TokenNameIdentifier	 plugin Groups
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
