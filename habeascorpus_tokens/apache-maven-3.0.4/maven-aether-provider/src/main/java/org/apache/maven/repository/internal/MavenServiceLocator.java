package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
ArtifactDescriptorReader	TokenNameIdentifier	 Artifact Descriptor Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
DefaultServiceLocator	TokenNameIdentifier	 Default Service Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
MetadataGeneratorFactory	TokenNameIdentifier	 Metadata Generator Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
VersionRangeResolver	TokenNameIdentifier	 Version Range Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
VersionResolver	TokenNameIdentifier	 Version Resolver
;	TokenNameSEMICOLON	
/** * A simple service locator that is already setup with all components from this library. To acquire a complete * repository system, clients need to add some repository connectors for remote transfers. <em>Note:</em> This component * is meant to assist those clients that employ the repository systems outside of an IoC container, Maven plugins * should instead always use regular dependency injection to acquire the repository system. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A simple service locator that is already setup with all components from this library. To acquire a complete repository system, clients need to add some repository connectors for remote transfers. <em>Note:</em> This component is meant to assist those clients that employ the repository systems outside of an IoC container, Maven plugins should instead always use regular dependency injection to acquire the repository system. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
MavenServiceLocator	TokenNameIdentifier	 Maven Service Locator
extends	TokenNameextends	
DefaultServiceLocator	TokenNameIdentifier	 Default Service Locator
{	TokenNameLBRACE	
/** * Creates a new service locator that already knows about all service implementations included in this library. */	TokenNameCOMMENT_JAVADOC	 Creates a new service locator that already knows about all service implementations included in this library. 
public	TokenNamepublic	
MavenServiceLocator	TokenNameIdentifier	 Maven Service Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addService	TokenNameIdentifier	 add Service
(	TokenNameLPAREN	
ArtifactDescriptorReader	TokenNameIdentifier	 Artifact Descriptor Reader
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DefaultArtifactDescriptorReader	TokenNameIdentifier	 Default Artifact Descriptor Reader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addService	TokenNameIdentifier	 add Service
(	TokenNameLPAREN	
VersionResolver	TokenNameIdentifier	 Version Resolver
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DefaultVersionResolver	TokenNameIdentifier	 Default Version Resolver
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addService	TokenNameIdentifier	 add Service
(	TokenNameLPAREN	
VersionRangeResolver	TokenNameIdentifier	 Version Range Resolver
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DefaultVersionRangeResolver	TokenNameIdentifier	 Default Version Range Resolver
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addService	TokenNameIdentifier	 add Service
(	TokenNameLPAREN	
MetadataGeneratorFactory	TokenNameIdentifier	 Metadata Generator Factory
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
SnapshotMetadataGeneratorFactory	TokenNameIdentifier	 Snapshot Metadata Generator Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addService	TokenNameIdentifier	 add Service
(	TokenNameLPAREN	
MetadataGeneratorFactory	TokenNameIdentifier	 Metadata Generator Factory
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
VersionsMetadataGeneratorFactory	TokenNameIdentifier	 Versions Metadata Generator Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
