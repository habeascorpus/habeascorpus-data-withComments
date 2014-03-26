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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
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
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
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
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
/** * * @author mkleint */	TokenNameCOMMENT_JAVADOC	 * @author mkleint 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RequirementMatcherFactory	TokenNameIdentifier	 Requirement Matcher Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
RequirementMatcherFactory	TokenNameIdentifier	 Requirement Matcher Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
createExactMatcher	TokenNameIdentifier	 create Exact Matcher
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
provideValue	TokenNameIdentifier	 provide Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExactMatcher	TokenNameIdentifier	 Exact Matcher
(	TokenNameLPAREN	
provideValue	TokenNameIdentifier	 provide Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
createVersionMatcher	TokenNameIdentifier	 create Version Matcher
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
provideValue	TokenNameIdentifier	 provide Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionMatcher	TokenNameIdentifier	 Version Matcher
(	TokenNameLPAREN	
provideValue	TokenNameIdentifier	 provide Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ExactMatcher	TokenNameIdentifier	 Exact Matcher
implements	TokenNameimplements	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
provides	TokenNameIdentifier	 provides
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExactMatcher	TokenNameIdentifier	 Exact Matcher
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
provides	TokenNameIdentifier	 provides
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
provides	TokenNameIdentifier	 provides
=	TokenNameEQUAL	
provides	TokenNameIdentifier	 provides
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requirement	TokenNameIdentifier	 requirement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
provides	TokenNameIdentifier	 provides
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
requirement	TokenNameIdentifier	 requirement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
VersionMatcher	TokenNameIdentifier	 Version Matcher
implements	TokenNameimplements	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
{	TokenNameLBRACE	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
VersionMatcher	TokenNameIdentifier	 Version Matcher
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requirement	TokenNameIdentifier	 requirement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
requirement	TokenNameIdentifier	 requirement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
hasRestrictions	TokenNameIdentifier	 has Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//TODO error reporting 	TokenNameCOMMENT_LINE	TODO error reporting 
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
