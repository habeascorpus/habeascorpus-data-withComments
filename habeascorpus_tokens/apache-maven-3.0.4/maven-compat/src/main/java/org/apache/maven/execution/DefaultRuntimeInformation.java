package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
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
personality	TokenNameIdentifier	 personality
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
.	TokenNameDOT	
Initializable	TokenNameIdentifier	 Initializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
personality	TokenNameIdentifier	 personality
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
.	TokenNameDOT	
InitializationException	TokenNameIdentifier	 Initialization Exception
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Describes runtime information about the application. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Describes runtime information about the application. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
RuntimeInformation	TokenNameIdentifier	 Runtime Information
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultRuntimeInformation	TokenNameIdentifier	 Default Runtime Information
implements	TokenNameimplements	
RuntimeInformation	TokenNameIdentifier	 Runtime Information
,	TokenNameCOMMA	
Initializable	TokenNameIdentifier	 Initializable
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
rtinfo	TokenNameIdentifier	 rtinfo
.	TokenNameDOT	
RuntimeInformation	TokenNameIdentifier	 Runtime Information
rtInfo	TokenNameIdentifier	 rt Info
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
applicationVersion	TokenNameIdentifier	 application Version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
getApplicationVersion	TokenNameIdentifier	 get Application Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
applicationVersion	TokenNameIdentifier	 application Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InitializationException	TokenNameIdentifier	 Initialization Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mavenVersion	TokenNameIdentifier	 maven Version
=	TokenNameEQUAL	
rtInfo	TokenNameIdentifier	 rt Info
.	TokenNameDOT	
getMavenVersion	TokenNameIdentifier	 get Maven Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
mavenVersion	TokenNameIdentifier	 maven Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InitializationException	TokenNameIdentifier	 Initialization Exception
(	TokenNameLPAREN	
"Unable to read Maven version from maven-core"	TokenNameStringLiteral	Unable to read Maven version from maven-core
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
applicationVersion	TokenNameIdentifier	 application Version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
mavenVersion	TokenNameIdentifier	 maven Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
