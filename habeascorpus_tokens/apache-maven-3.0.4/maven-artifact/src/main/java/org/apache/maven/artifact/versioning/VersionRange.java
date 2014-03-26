package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
/** * Construct a version range from a specification. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Construct a version range from a specification. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
VersionRange	TokenNameIdentifier	 Version Range
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
VersionRange	TokenNameIdentifier	 Version Range
(	TokenNameLPAREN	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
recommendedVersion	TokenNameIdentifier	 recommended Version
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
recommendedVersion	TokenNameIdentifier	 recommended Version
=	TokenNameEQUAL	
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionRange	TokenNameIdentifier	 Version Range
cloneOf	TokenNameIdentifier	 clone Of
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
copiedRestrictions	TokenNameIdentifier	 copied Restrictions
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copiedRestrictions	TokenNameIdentifier	 copied Restrictions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copiedRestrictions	TokenNameIdentifier	 copied Restrictions
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionRange	TokenNameIdentifier	 Version Range
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
,	TokenNameCOMMA	
copiedRestrictions	TokenNameIdentifier	 copied Restrictions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a version range from a string representation * <p/> * Some spec examples are * <ul> * <li><code>1.0</code> Version 1.0</li> * <li><code>[1.0,2.0)</code> Versions 1.0 (included) to 2.0 (not included)</li> * <li><code>[1.0,2.0]</code> Versions 1.0 to 2.0 (both included)</li> * <li><code>[1.5,)</code> Versions 1.5 and higher</li> * <li><code>(,1.0],[1.2,)</code> Versions up to 1.0 (included) and 1.2 or higher</li> * </ul> * * @param spec string representation of a version or version range * @return a new {@link VersionRange} object that represents the spec * @throws InvalidVersionSpecificationException * */	TokenNameCOMMENT_JAVADOC	 Create a version range from a string representation <p/> Some spec examples are <ul> <li><code>1.0</code> Version 1.0</li> <li><code>[1.0,2.0)</code> Versions 1.0 (included) to 2.0 (not included)</li> <li><code>[1.0,2.0]</code> Versions 1.0 to 2.0 (both included)</li> <li><code>[1.5,)</code> Versions 1.5 and higher</li> <li><code>(,1.0],[1.2,)</code> Versions up to 1.0 (included) and 1.2 or higher</li> </ul> * @param spec string representation of a version or version range @return a new {@link VersionRange} object that represents the spec @throws InvalidVersionSpecificationException 
public	TokenNamepublic	
static	TokenNamestatic	
VersionRange	TokenNameIdentifier	 Version Range
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
spec	TokenNameIdentifier	 spec
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
upperBound	TokenNameIdentifier	 upper Bound
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
lowerBound	TokenNameIdentifier	 lower Bound
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
||	TokenNameOR_OR	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index1	TokenNameIdentifier	 index1
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index2	TokenNameIdentifier	 index2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index1	TokenNameIdentifier	 index1
<	TokenNameLESS	
index2	TokenNameIdentifier	 index2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index1	TokenNameIdentifier	 index1
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index1	TokenNameIdentifier	 index1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
(	TokenNameLPAREN	
"Unbounded range: "	TokenNameStringLiteral	Unbounded range: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Restriction	TokenNameIdentifier	 Restriction
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
parseRestriction	TokenNameIdentifier	 parse Restriction
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerBound	TokenNameIdentifier	 lower Bound
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lowerBound	TokenNameIdentifier	 lower Bound
=	TokenNameEQUAL	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperBound	TokenNameIdentifier	 upper Bound
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
upperBound	TokenNameIdentifier	 upper Bound
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
(	TokenNameLPAREN	
"Ranges overlap: "	TokenNameStringLiteral	Ranges overlap: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
restriction	TokenNameIdentifier	 restriction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upperBound	TokenNameIdentifier	 upper Bound
=	TokenNameEQUAL	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
(	TokenNameLPAREN	
"Only fully-qualified sets allowed in multiple set scenario: "	TokenNameStringLiteral	Only fully-qualified sets allowed in multiple set scenario: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
.	TokenNameDOT	
EVERYTHING	TokenNameIdentifier	 EVERYTHING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VersionRange	TokenNameIdentifier	 Version Range
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Restriction	TokenNameIdentifier	 Restriction
parseRestriction	TokenNameIdentifier	 parse Restriction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
lowerBoundInclusive	TokenNameIdentifier	 lower Bound Inclusive
=	TokenNameEQUAL	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
upperBoundInclusive	TokenNameIdentifier	 upper Bound Inclusive
=	TokenNameEQUAL	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Restriction	TokenNameIdentifier	 Restriction
restriction	TokenNameIdentifier	 restriction
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lowerBoundInclusive	TokenNameIdentifier	 lower Bound Inclusive
||	TokenNameOR_OR	
!	TokenNameNOT	
upperBoundInclusive	TokenNameIdentifier	 upper Bound Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
(	TokenNameLPAREN	
"Single version must be surrounded by []: "	TokenNameStringLiteral	Single version must be surrounded by []: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
new	TokenNamenew	
Restriction	TokenNameIdentifier	 Restriction
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
lowerBoundInclusive	TokenNameIdentifier	 lower Bound Inclusive
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
upperBoundInclusive	TokenNameIdentifier	 upper Bound Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lowerBound	TokenNameIdentifier	 lower Bound
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
upperBound	TokenNameIdentifier	 upper Bound
=	TokenNameEQUAL	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerBound	TokenNameIdentifier	 lower Bound
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
upperBound	TokenNameIdentifier	 upper Bound
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
(	TokenNameLPAREN	
"Range cannot have identical boundaries: "	TokenNameStringLiteral	Range cannot have identical boundaries: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
lowerVersion	TokenNameIdentifier	 lower Version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerBound	TokenNameIdentifier	 lower Bound
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lowerVersion	TokenNameIdentifier	 lower Version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
lowerBound	TokenNameIdentifier	 lower Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
upperVersion	TokenNameIdentifier	 upper Version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperBound	TokenNameIdentifier	 upper Bound
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upperVersion	TokenNameIdentifier	 upper Version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
upperBound	TokenNameIdentifier	 upper Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVersion	TokenNameIdentifier	 upper Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lowerVersion	TokenNameIdentifier	 lower Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
upperVersion	TokenNameIdentifier	 upper Version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
lowerVersion	TokenNameIdentifier	 lower Version
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
(	TokenNameLPAREN	
"Range defies version ordering: "	TokenNameStringLiteral	Range defies version ordering: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
new	TokenNamenew	
Restriction	TokenNameIdentifier	 Restriction
(	TokenNameLPAREN	
lowerVersion	TokenNameIdentifier	 lower Version
,	TokenNameCOMMA	
lowerBoundInclusive	TokenNameIdentifier	 lower Bound Inclusive
,	TokenNameCOMMA	
upperVersion	TokenNameIdentifier	 upper Version
,	TokenNameCOMMA	
upperBoundInclusive	TokenNameIdentifier	 upper Bound Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
restriction	TokenNameIdentifier	 restriction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
VersionRange	TokenNameIdentifier	 Version Range
createFromVersion	TokenNameIdentifier	 create From Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
VersionRange	TokenNameIdentifier	 Version Range
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new <code>VersionRange</code> that is a restriction of this * version range and the specified version range. * <p> * Note: Precedence is given to the recommended version from this version range over the * recommended version from the specified version range. * </p> * * @param restriction the <code>VersionRange</code> that will be used to restrict this version * range. * @return the <code>VersionRange</code> that is a restriction of this version range and the * specified version range. * <p> * The restrictions of the returned version range will be an intersection of the restrictions * of this version range and the specified version range if both version ranges have * restrictions. Otherwise, the restrictions on the returned range will be empty. * </p> * <p> * The recommended version of the returned version range will be the recommended version of * this version range, provided that ranges falls within the intersected restrictions. If * the restrictions are empty, this version range's recommended version is used if it is not * <code>null</code>. If it is <code>null</code>, the specified version range's recommended * version is used (provided it is non-<code>null</code>). If no recommended version can be * obtained, the returned version range's recommended version is set to <code>null</code>. * </p> * @throws NullPointerException if the specified <code>VersionRange</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new <code>VersionRange</code> that is a restriction of this version range and the specified version range. <p> Note: Precedence is given to the recommended version from this version range over the recommended version from the specified version range. </p> * @param restriction the <code>VersionRange</code> that will be used to restrict this version range. @return the <code>VersionRange</code> that is a restriction of this version range and the specified version range. <p> The restrictions of the returned version range will be an intersection of the restrictions of this version range and the specified version range if both version ranges have restrictions. Otherwise, the restrictions on the returned range will be empty. </p> <p> The recommended version of the returned version range will be the recommended version of this version range, provided that ranges falls within the intersected restrictions. If the restrictions are empty, this version range's recommended version is used if it is not <code>null</code>. If it is <code>null</code>, the specified version range's recommended version is used (provided it is non-<code>null</code>). If no recommended version can be obtained, the returned version range's recommended version is set to <code>null</code>. </p> @throws NullPointerException if the specified <code>VersionRange</code> is <code>null</code>. 
public	TokenNamepublic	
VersionRange	TokenNameIdentifier	 Version Range
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
VersionRange	TokenNameIdentifier	 Version Range
restriction	TokenNameIdentifier	 restriction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we find the original, use that 	TokenNameCOMMENT_LINE	if we find the original, use that 
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use this if we can, but prefer the original if possible 	TokenNameCOMMENT_LINE	use this if we can, but prefer the original if possible 
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Either the original or the specified version ranges have no restrictions 	TokenNameCOMMENT_LINE	Either the original or the specified version ranges have no restrictions 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use the original recommended version since it exists 	TokenNameCOMMENT_LINE	Use the original recommended version since it exists 
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use the recommended version from the specified VersionRange since there is no 	TokenNameCOMMENT_LINE	Use the recommended version from the specified VersionRange since there is no 
// original recommended version 	TokenNameCOMMENT_LINE	original recommended version 
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* TODO: should throw this immediately, but need artifact else { throw new OverConstrainedVersionException( "Restricting incompatible version ranges" ); } */	TokenNameCOMMENT_BLOCK	 TODO: should throw this immediately, but need artifact else { throw new OverConstrainedVersionException( "Restricting incompatible version ranges" ); } 
return	TokenNamereturn	
new	TokenNamenew	
VersionRange	TokenNameIdentifier	 Version Range
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Restriction	TokenNameIdentifier	 Restriction
res1	TokenNameIdentifier	 res1
=	TokenNameEQUAL	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Restriction	TokenNameIdentifier	 Restriction
res2	TokenNameIdentifier	 res2
=	TokenNameEQUAL	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
lower	TokenNameIdentifier	 lower
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
upper	TokenNameIdentifier	 upper
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
upperInclusive	TokenNameIdentifier	 upper Inclusive
;	TokenNameSEMICOLON	
// overlaps 	TokenNameCOMMENT_LINE	overlaps 
if	TokenNameif	
(	TokenNameLPAREN	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
comparison	TokenNameIdentifier	 comparison
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparison	TokenNameIdentifier	 comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
comparison	TokenNameIdentifier	 comparison
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
comparison	TokenNameIdentifier	 comparison
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comparison	TokenNameIdentifier	 comparison
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
comparison	TokenNameIdentifier	 comparison
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
res1	TokenNameIdentifier	 res1
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// don't add if they are equal and one is not inclusive 	TokenNameCOMMENT_LINE	don't add if they are equal and one is not inclusive 
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
upper	TokenNameIdentifier	 upper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Restriction	TokenNameIdentifier	 Restriction
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
&&	TokenNameAND_AND	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Restriction	TokenNameIdentifier	 Restriction
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//noinspection ObjectEquality 	TokenNameCOMMENT_LINE	noinspection ObjectEquality 
if	TokenNameif	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
==	TokenNameEQUAL_EQUAL	
res2	TokenNameIdentifier	 res2
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// advance res2 	TokenNameCOMMENT_LINE	advance res2 
if	TokenNameif	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res2	TokenNameIdentifier	 res2
=	TokenNameEQUAL	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// advance res1 	TokenNameCOMMENT_LINE	advance res1 
if	TokenNameif	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res1	TokenNameIdentifier	 res1
=	TokenNameEQUAL	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// move on to next in r1 	TokenNameCOMMENT_LINE	move on to next in r1 
if	TokenNameif	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res1	TokenNameIdentifier	 res1
=	TokenNameEQUAL	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// move on to next in r2 	TokenNameCOMMENT_LINE	move on to next in r2 
if	TokenNameif	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res2	TokenNameIdentifier	 res2
=	TokenNameEQUAL	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
restrictions	TokenNameIdentifier	 restrictions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
throws	TokenNamethrows	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
recommendedVersion	TokenNameIdentifier	 recommended Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
(	TokenNameLPAREN	
"The artifact has no valid ranges"	TokenNameStringLiteral	The artifact has no valid ranges
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
throws	TokenNamethrows	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
(	TokenNameLPAREN	
"The artifact has no valid ranges"	TokenNameStringLiteral	The artifact has no valid ranges
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recommendedVersion	TokenNameIdentifier	 recommended Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Restriction	TokenNameIdentifier	 Restriction
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
matchVersion	TokenNameIdentifier	 match Version
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: could be more efficient by sorting the list and then moving along the restrictions in order? 	TokenNameCOMMENT_LINE	TODO: could be more efficient by sorting the list and then moving along the restrictions in order? 
ArtifactVersion	TokenNameIdentifier	 Artifact Version
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// valid - check if it is greater than the currently matched version 	TokenNameCOMMENT_LINE	valid - check if it is greater than the currently matched version 
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
matched	TokenNameIdentifier	 matched
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
restriction	TokenNameIdentifier	 restriction
:	TokenNameCOLON	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasRestrictions	TokenNameIdentifier	 has Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
recommendedVersion	TokenNameIdentifier	 recommended Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
VersionRange	TokenNameIdentifier	 Version Range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
VersionRange	TokenNameIdentifier	 Version Range
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VersionRange	TokenNameIdentifier	 Version Range
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
recommendedVersion	TokenNameIdentifier	 recommended Version
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
recommendedVersion	TokenNameIdentifier	 recommended Version
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
recommendedVersion	TokenNameIdentifier	 recommended Version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
recommendedVersion	TokenNameIdentifier	 recommended Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
equals	TokenNameIdentifier	 equals
&=	TokenNameAND_EQUAL	
restrictions	TokenNameIdentifier	 restrictions
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
restrictions	TokenNameIdentifier	 restrictions
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
restrictions	TokenNameIdentifier	 restrictions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
equals	TokenNameIdentifier	 equals
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
recommendedVersion	TokenNameIdentifier	 recommended Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
recommendedVersion	TokenNameIdentifier	 recommended Version
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
restrictions	TokenNameIdentifier	 restrictions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
