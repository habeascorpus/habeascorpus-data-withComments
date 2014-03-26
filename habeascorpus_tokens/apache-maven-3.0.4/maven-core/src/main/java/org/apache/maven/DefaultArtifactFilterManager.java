package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
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
HashSet	TokenNameIdentifier	 Hash Set
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ExclusionSetFilter	TokenNameIdentifier	 Exclusion Set Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusContainer	TokenNameIdentifier	 Plexus Container
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
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl * @todo this should probably be a component with some dynamic control of filtering */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl @todo this should probably be a component with some dynamic control of filtering 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactFilterManager	TokenNameIdentifier	 Artifact Filter Manager
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactFilterManager	TokenNameIdentifier	 Default Artifact Filter Manager
implements	TokenNameimplements	
ArtifactFilterManager	TokenNameIdentifier	 Artifact Filter Manager
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
DEFAULT_EXCLUSIONS	TokenNameIdentifier	 DEFAULT  EXCLUSIONS
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
PlexusContainer	TokenNameIdentifier	 Plexus Container
plexus	TokenNameIdentifier	 plexus
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"classworlds:classworlds"	TokenNameStringLiteral	classworlds:classworlds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.codehaus.plexus:plexus-classworlds"	TokenNameStringLiteral	org.codehaus.plexus:plexus-classworlds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.codehaus.plexus:plexus-component-api"	TokenNameStringLiteral	org.codehaus.plexus:plexus-component-api
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.codehaus.plexus:plexus-container-default"	TokenNameStringLiteral	org.codehaus.plexus:plexus-container-default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"plexus:plexus-container-default"	TokenNameStringLiteral	plexus:plexus-container-default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.sonatype.spice:spice-inject-plexus"	TokenNameStringLiteral	org.sonatype.spice:spice-inject-plexus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.sonatype.sisu:sisu-inject-plexus"	TokenNameStringLiteral	org.sonatype.sisu:sisu-inject-plexus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-artifact"	TokenNameStringLiteral	org.apache.maven:maven-artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-aether-provider"	TokenNameStringLiteral	org.apache.maven:maven-aether-provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-artifact-manager"	TokenNameStringLiteral	org.apache.maven:maven-artifact-manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-compat"	TokenNameStringLiteral	org.apache.maven:maven-compat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-core"	TokenNameStringLiteral	org.apache.maven:maven-core
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-error-diagnostics"	TokenNameStringLiteral	org.apache.maven:maven-error-diagnostics
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-lifecycle"	TokenNameStringLiteral	org.apache.maven:maven-lifecycle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-model"	TokenNameStringLiteral	org.apache.maven:maven-model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-model-builder"	TokenNameStringLiteral	org.apache.maven:maven-model-builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-monitor"	TokenNameStringLiteral	org.apache.maven:maven-monitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-plugin-api"	TokenNameStringLiteral	org.apache.maven:maven-plugin-api
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-plugin-descriptor"	TokenNameStringLiteral	org.apache.maven:maven-plugin-descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-plugin-parameter-documenter"	TokenNameStringLiteral	org.apache.maven:maven-plugin-parameter-documenter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-plugin-registry"	TokenNameStringLiteral	org.apache.maven:maven-plugin-registry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-profile"	TokenNameStringLiteral	org.apache.maven:maven-profile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-project"	TokenNameStringLiteral	org.apache.maven:maven-project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-repository-metadata"	TokenNameStringLiteral	org.apache.maven:maven-repository-metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-settings"	TokenNameStringLiteral	org.apache.maven:maven-settings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-settings-builder"	TokenNameStringLiteral	org.apache.maven:maven-settings-builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven:maven-toolchain"	TokenNameStringLiteral	org.apache.maven:maven-toolchain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.apache.maven.wagon:wagon-provider-api"	TokenNameStringLiteral	org.apache.maven.wagon:wagon-provider-api
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.sonatype.aether:aether-api"	TokenNameStringLiteral	org.sonatype.aether:aether-api
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.sonatype.aether:aether-spi"	TokenNameStringLiteral	org.sonatype.aether:aether-spi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"org.sonatype.aether:aether-impl"	TokenNameStringLiteral	org.sonatype.aether:aether-impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * NOTE: Don't exclude the wagons or any of their dependencies (apart from the wagon API). This would otherwise * provoke linkage errors for wagons contributed by build extensions. We also don't need to exclude the wagons * from plugins. Plugins that use wagons directly and declare the corresponding dependency will simply use a * wagon from their plugin realm. */	TokenNameCOMMENT_BLOCK	 NOTE: Don't exclude the wagons or any of their dependencies (apart from the wagon API). This would otherwise provoke linkage errors for wagons contributed by build extensions. We also don't need to exclude the wagons from plugins. Plugins that use wagons directly and declare the corresponding dependency will simply use a wagon from their plugin realm. 
DEFAULT_EXCLUSIONS	TokenNameIdentifier	 DEFAULT  EXCLUSIONS
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
excludedArtifacts	TokenNameIdentifier	 excluded Artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
DEFAULT_EXCLUSIONS	TokenNameIdentifier	 DEFAULT  EXCLUSIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use this class as a component instead, and then use getArtifactFilter(). */	TokenNameCOMMENT_JAVADOC	 @deprecated Use this class as a component instead, and then use getArtifactFilter(). 
public	TokenNamepublic	
static	TokenNamestatic	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
createStandardFilter	TokenNameIdentifier	 create Standard Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: configure this from bootstrap or scan lib 	TokenNameCOMMENT_LINE	TODO: configure this from bootstrap or scan lib 
return	TokenNamereturn	
new	TokenNamenew	
ExclusionSetFilter	TokenNameIdentifier	 Exclusion Set Filter
(	TokenNameLPAREN	
DEFAULT_EXCLUSIONS	TokenNameIdentifier	 DEFAULT  EXCLUSIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the artifact filter for the core + extension artifacts. * * @see org.apache.maven.ArtifactFilterManager#getArtifactFilter() */	TokenNameCOMMENT_JAVADOC	 Returns the artifact filter for the core + extension artifacts. * @see org.apache.maven.ArtifactFilterManager#getArtifactFilter() 
public	TokenNamepublic	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
getArtifactFilter	TokenNameIdentifier	 get Artifact Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
excludes	TokenNameIdentifier	 excludes
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
excludedArtifacts	TokenNameIdentifier	 excluded Artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactFilterManagerDelegate	TokenNameIdentifier	 Artifact Filter Manager Delegate
delegate	TokenNameIdentifier	 delegate
:	TokenNameCOLON	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
addExcludes	TokenNameIdentifier	 add Excludes
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExclusionSetFilter	TokenNameIdentifier	 Exclusion Set Filter
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the artifact filter for the standard core artifacts. * * @see org.apache.maven.ArtifactFilterManager#getExtensionDependencyFilter() */	TokenNameCOMMENT_JAVADOC	 Returns the artifact filter for the standard core artifacts. * @see org.apache.maven.ArtifactFilterManager#getExtensionDependencyFilter() 
public	TokenNamepublic	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
getCoreArtifactFilter	TokenNameIdentifier	 get Core Artifact Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExclusionSetFilter	TokenNameIdentifier	 Exclusion Set Filter
(	TokenNameLPAREN	
getCoreArtifactExcludes	TokenNameIdentifier	 get Core Artifact Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactFilterManagerDelegate	TokenNameIdentifier	 Artifact Filter Manager Delegate
>	TokenNameGREATER	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lookupList	TokenNameIdentifier	 lookup List
(	TokenNameLPAREN	
ArtifactFilterManagerDelegate	TokenNameIdentifier	 Artifact Filter Manager Delegate
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ArtifactFilterManagerDelegate	TokenNameIdentifier	 Artifact Filter Manager Delegate
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.maven.ArtifactFilterManager#excludeArtifact(java.lang.String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.maven.ArtifactFilterManager#excludeArtifact(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
excludeArtifact	TokenNameIdentifier	 exclude Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
excludedArtifacts	TokenNameIdentifier	 excluded Artifacts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCoreArtifactExcludes	TokenNameIdentifier	 get Core Artifact Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
excludes	TokenNameIdentifier	 excludes
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
DEFAULT_EXCLUSIONS	TokenNameIdentifier	 DEFAULT  EXCLUSIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactFilterManagerDelegate	TokenNameIdentifier	 Artifact Filter Manager Delegate
delegate	TokenNameIdentifier	 delegate
:	TokenNameCOLON	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
addCoreExcludes	TokenNameIdentifier	 add Core Excludes
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
excludes	TokenNameIdentifier	 excludes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
