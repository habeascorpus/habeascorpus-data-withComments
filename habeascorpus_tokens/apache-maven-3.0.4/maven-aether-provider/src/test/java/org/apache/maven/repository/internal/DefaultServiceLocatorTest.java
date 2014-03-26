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
RepositorySystem	TokenNameIdentifier	 Repository System
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
ServiceLocator	TokenNameIdentifier	 Service Locator
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
DefaultServiceLocatorTest	TokenNameIdentifier	 Default Service Locator Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetRepositorySystem	TokenNameIdentifier	 test Get Repository System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServiceLocator	TokenNameIdentifier	 Service Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
new	TokenNamenew	
MavenServiceLocator	TokenNameIdentifier	 Maven Service Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RepositorySystem	TokenNameIdentifier	 Repository System
repoSys	TokenNameIdentifier	 repo Sys
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getService	TokenNameIdentifier	 get Service
(	TokenNameLPAREN	
RepositorySystem	TokenNameIdentifier	 Repository System
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
repoSys	TokenNameIdentifier	 repo Sys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetMetadataGeneratorFactories	TokenNameIdentifier	 test Get Metadata Generator Factories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServiceLocator	TokenNameIdentifier	 Service Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
new	TokenNamenew	
MavenServiceLocator	TokenNameIdentifier	 Maven Service Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getServices	TokenNameIdentifier	 get Services
(	TokenNameLPAREN	
MetadataGeneratorFactory	TokenNameIdentifier	 Metadata Generator Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
