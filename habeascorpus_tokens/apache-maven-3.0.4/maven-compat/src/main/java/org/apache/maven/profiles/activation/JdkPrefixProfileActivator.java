package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
activation	TokenNameIdentifier	 activation
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Activation	TokenNameIdentifier	 Activation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
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
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
JdkPrefixProfileActivator	TokenNameIdentifier	 Jdk Prefix Profile Activator
extends	TokenNameextends	
DetectedProfileActivator	TokenNameIdentifier	 Detected Profile Activator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JDK_VERSION	TokenNameIdentifier	 JDK  VERSION
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProfileActivationException	TokenNameIdentifier	 Profile Activation Exception
{	TokenNameLBRACE	
Activation	TokenNameIdentifier	 Activation
activation	TokenNameIdentifier	 activation
=	TokenNameEQUAL	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
jdk	TokenNameIdentifier	 jdk
=	TokenNameEQUAL	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
getJdk	TokenNameIdentifier	 get Jdk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// null case is covered by canDetermineActivation(), so we can do a straight startsWith() here. 	TokenNameCOMMENT_LINE	null case is covered by canDetermineActivation(), so we can do a straight startsWith() here. 
if	TokenNameif	
(	TokenNameLPAREN	
jdk	TokenNameIdentifier	 jdk
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
||	TokenNameOR_OR	
jdk	TokenNameIdentifier	 jdk
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchJdkVersionRange	TokenNameIdentifier	 match Jdk Version Range
(	TokenNameLPAREN	
jdk	TokenNameIdentifier	 jdk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProfileActivationException	TokenNameIdentifier	 Profile Activation Exception
(	TokenNameLPAREN	
"Invalid JDK version in profile '"	TokenNameStringLiteral	Invalid JDK version in profile '
+	TokenNamePLUS	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jdk	TokenNameIdentifier	 jdk
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
jdk	TokenNameIdentifier	 jdk
=	TokenNameEQUAL	
jdk	TokenNameIdentifier	 jdk
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getJdkVersion	TokenNameIdentifier	 get Jdk Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
jdk	TokenNameIdentifier	 jdk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
matchJdkVersionRange	TokenNameIdentifier	 match Jdk Version Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jdk	TokenNameIdentifier	 jdk
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
jdkVersionRange	TokenNameIdentifier	 jdk Version Range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
convertJdkToMavenVersion	TokenNameIdentifier	 convert Jdk To Maven Version
(	TokenNameLPAREN	
jdk	TokenNameIdentifier	 jdk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
jdkVersion	TokenNameIdentifier	 jdk Version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
convertJdkToMavenVersion	TokenNameIdentifier	 convert Jdk To Maven Version
(	TokenNameLPAREN	
getJdkVersion	TokenNameIdentifier	 get Jdk Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
jdkVersionRange	TokenNameIdentifier	 jdk Version Range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
jdkVersion	TokenNameIdentifier	 jdk Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
convertJdkToMavenVersion	TokenNameIdentifier	 convert Jdk To Maven Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jdk	TokenNameIdentifier	 jdk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
jdk	TokenNameIdentifier	 jdk
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"_"	TokenNameStringLiteral	_
,	TokenNameCOMMA	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getJdkVersion	TokenNameIdentifier	 get Jdk Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JDK_VERSION	TokenNameIdentifier	 JDK  VERSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
canDetectActivation	TokenNameIdentifier	 can Detect Activation
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isNotEmpty	TokenNameIdentifier	 is Not Empty
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getJdk	TokenNameIdentifier	 get Jdk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
