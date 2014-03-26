/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionResolver	TokenNameIdentifier	 Plugin Version Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionResult	TokenNameIdentifier	 Plugin Version Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
PluginVersionResolverStub	TokenNameIdentifier	 Plugin Version Resolver Stub
implements	TokenNameimplements	
PluginVersionResolver	TokenNameIdentifier	 Plugin Version Resolver
{	TokenNameLBRACE	
public	TokenNamepublic	
PluginVersionResult	TokenNameIdentifier	 Plugin Version Result
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
PluginVersionRequest	TokenNameIdentifier	 Plugin Version Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PluginVersionResult	TokenNameIdentifier	 Plugin Version Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"0.42"	TokenNameStringLiteral	0.42
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
