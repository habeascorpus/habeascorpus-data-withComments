package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
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
composition	TokenNameIdentifier	 composition
.	TokenNameDOT	
CycleDetectedInComponentGraphException	TokenNameIdentifier	 Cycle Detected In Component Graph Exception
;	TokenNameSEMICOLON	
/** * Exception occurring trying to resolve a plugin. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Exception occurring trying to resolve a plugin. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
CycleDetectedInPluginGraphException	TokenNameIdentifier	 Cycle Detected In Plugin Graph Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CycleDetectedInPluginGraphException	TokenNameIdentifier	 Cycle Detected In Plugin Graph Exception
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
CycleDetectedInComponentGraphException	TokenNameIdentifier	 Cycle Detected In Component Graph Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"A cycle was detected in the component graph of the plugin: "	TokenNameStringLiteral	A cycle was detected in the component graph of the plugin: 
+	TokenNamePLUS	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Plugin	TokenNameIdentifier	 Plugin
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
