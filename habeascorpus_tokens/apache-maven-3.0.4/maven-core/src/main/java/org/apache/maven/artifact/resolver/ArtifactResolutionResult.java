package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
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
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
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
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
;	TokenNameSEMICOLON	
/** * Specific problems during resolution that we want to account for: * <p/> * - missing metadata - version range violations - version circular dependencies - missing artifacts * - network/transfer errors - file system errors: permissions * * @author Jason van Zyl * @TODO carlos: all these possible has*Exceptions and get*Exceptions methods make the clients too * complex requiring a long list of checks, need to create a parent/interfact/encapsulation * for the types of exceptions */	TokenNameCOMMENT_JAVADOC	 Specific problems during resolution that we want to account for: <p/> - missing metadata - version range violations - version circular dependencies - missing artifacts - network/transfer errors - file system errors: permissions * @author Jason van Zyl @TODO carlos: all these possible has*Exceptions and get*Exceptions methods make the clients too complex requiring a long list of checks, need to create a parent/interfact/encapsulation for the types of exceptions 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
{	TokenNameLBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
originatingArtifact	TokenNameIdentifier	 originating Artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
;	TokenNameSEMICOLON	
// Exceptions 	TokenNameCOMMENT_LINE	Exceptions 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
exceptions	TokenNameIdentifier	 exceptions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
>	TokenNameGREATER	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CyclicDependencyException	TokenNameIdentifier	 Cyclic Dependency Exception
>	TokenNameGREATER	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
>	TokenNameGREATER	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
;	TokenNameSEMICOLON	
// file system errors 	TokenNameCOMMENT_LINE	file system errors 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ResolutionNode	TokenNameIdentifier	 Resolution Node
>	TokenNameGREATER	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Artifact	TokenNameIdentifier	 Artifact
getOriginatingArtifact	TokenNameIdentifier	 get Originating Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originatingArtifact	TokenNameIdentifier	 originating Artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
setOriginatingArtifact	TokenNameIdentifier	 set Originating Artifact
(	TokenNameLPAREN	
final	TokenNamefinal	
Artifact	TokenNameIdentifier	 Artifact
originatingArtifact	TokenNameIdentifier	 originating Artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
originatingArtifact	TokenNameIdentifier	 originating Artifact
=	TokenNameEQUAL	
originatingArtifact	TokenNameIdentifier	 originating Artifact
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addArtifact	TokenNameIdentifier	 add Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
getArtifacts	TokenNameIdentifier	 get Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifacts	TokenNameIdentifier	 set Artifacts
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ResolutionNode	TokenNameIdentifier	 Resolution Node
>	TokenNameGREATER	
getArtifactResolutionNodes	TokenNameIdentifier	 get Artifact Resolution Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
ResolutionNode	TokenNameIdentifier	 Resolution Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactResolutionNodes	TokenNameIdentifier	 set Artifact Resolution Nodes
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ResolutionNode	TokenNameIdentifier	 Resolution Node
>	TokenNameGREATER	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
=	TokenNameEQUAL	
resolutionNodes	TokenNameIdentifier	 resolution Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMissingArtifacts	TokenNameIdentifier	 has Missing Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
getMissingArtifacts	TokenNameIdentifier	 get Missing Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
addMissingArtifact	TokenNameIdentifier	 add Missing Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
setUnresolvedArtifacts	TokenNameIdentifier	 set Unresolved Artifacts
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
unresolvedArtifacts	TokenNameIdentifier	 unresolved Artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
missingArtifacts	TokenNameIdentifier	 missing Artifacts
=	TokenNameEQUAL	
unresolvedArtifacts	TokenNameIdentifier	 unresolved Artifacts
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSuccess	TokenNameIdentifier	 is Success
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
(	TokenNameLPAREN	
hasMissingArtifacts	TokenNameIdentifier	 has Missing Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
hasExceptions	TokenNameIdentifier	 has Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// Exceptions 	TokenNameCOMMENT_LINE	Exceptions 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasExceptions	TokenNameIdentifier	 has Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exceptions	TokenNameIdentifier	 exceptions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
getExceptions	TokenNameIdentifier	 get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exceptions	TokenNameIdentifier	 exceptions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
exceptions	TokenNameIdentifier	 exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// Version Range Violations 	TokenNameCOMMENT_LINE	Version Range Violations 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasVersionRangeViolations	TokenNameIdentifier	 has Version Range Violations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @TODO this needs to accept a {@link OverConstrainedVersionException} as returned by * {@link #getVersionRangeViolation(int)} but it's not used like that in * {@link DefaultLegacyArtifactCollector} */	TokenNameCOMMENT_JAVADOC	 @TODO this needs to accept a {@link OverConstrainedVersionException} as returned by {@link #getVersionRangeViolation(int)} but it's not used like that in {@link DefaultLegacyArtifactCollector} 
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
addVersionRangeViolation	TokenNameIdentifier	 add Version Range Violation
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
exceptions	TokenNameIdentifier	 exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
getVersionRangeViolation	TokenNameIdentifier	 get Version Range Violation
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
)	TokenNameRPAREN	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
getVersionRangeViolations	TokenNameIdentifier	 get Version Range Violations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
versionRangeViolations	TokenNameIdentifier	 version Range Violations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// Metadata Resolution Exceptions: ArtifactResolutionExceptions 	TokenNameCOMMENT_LINE	Metadata Resolution Exceptions: ArtifactResolutionExceptions 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMetadataResolutionExceptions	TokenNameIdentifier	 has Metadata Resolution Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
addMetadataResolutionException	TokenNameIdentifier	 add Metadata Resolution Exception
(	TokenNameLPAREN	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
exceptions	TokenNameIdentifier	 exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
getMetadataResolutionException	TokenNameIdentifier	 get Metadata Resolution Exception
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
>	TokenNameGREATER	
getMetadataResolutionExceptions	TokenNameIdentifier	 get Metadata Resolution Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
metadataResolutionExceptions	TokenNameIdentifier	 metadata Resolution Exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// ErrorArtifactExceptions: ArtifactResolutionExceptions 	TokenNameCOMMENT_LINE	ErrorArtifactExceptions: ArtifactResolutionExceptions 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasErrorArtifactExceptions	TokenNameIdentifier	 has Error Artifact Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
addErrorArtifactException	TokenNameIdentifier	 add Error Artifact Exception
(	TokenNameLPAREN	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
exceptions	TokenNameIdentifier	 exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactResolutionException	TokenNameIdentifier	 Artifact Resolution Exception
>	TokenNameGREATER	
getErrorArtifactExceptions	TokenNameIdentifier	 get Error Artifact Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
errorArtifactExceptions	TokenNameIdentifier	 error Artifact Exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// Circular Dependency Exceptions 	TokenNameCOMMENT_LINE	Circular Dependency Exceptions 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasCircularDependencyExceptions	TokenNameIdentifier	 has Circular Dependency Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
addCircularDependencyException	TokenNameIdentifier	 add Circular Dependency Exception
(	TokenNameLPAREN	
CyclicDependencyException	TokenNameIdentifier	 Cyclic Dependency Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
=	TokenNameEQUAL	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
exceptions	TokenNameIdentifier	 exceptions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CyclicDependencyException	TokenNameIdentifier	 Cyclic Dependency Exception
getCircularDependencyException	TokenNameIdentifier	 get Circular Dependency Exception
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CyclicDependencyException	TokenNameIdentifier	 Cyclic Dependency Exception
>	TokenNameGREATER	
getCircularDependencyExceptions	TokenNameIdentifier	 get Circular Dependency Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
circularDependencyExceptions	TokenNameIdentifier	 circular Dependency Exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// Repositories 	TokenNameCOMMENT_LINE	Repositories 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repositories	TokenNameIdentifier	 repositories
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactResolutionResult	TokenNameIdentifier	 Artifact Resolution Result
setRepositories	TokenNameIdentifier	 set Repositories
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
repositories	TokenNameIdentifier	 repositories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Internal 	TokenNameCOMMENT_LINE	Internal 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
initList	TokenNameIdentifier	 init List
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"---------"	TokenNameStringLiteral	---------
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
a	TokenNameIdentifier	 a
:	TokenNameCOLON	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"---------"	TokenNameStringLiteral	---------
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
