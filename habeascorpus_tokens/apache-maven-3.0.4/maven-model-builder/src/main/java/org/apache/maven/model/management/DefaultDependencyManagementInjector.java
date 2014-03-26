package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
management	TokenNameIdentifier	 management
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
Dependency	TokenNameIdentifier	 Dependency
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
DependencyManagement	TokenNameIdentifier	 Dependency Management
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
Exclusion	TokenNameIdentifier	 Exclusion
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
Model	TokenNameIdentifier	 Model
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
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
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
MavenModelMerger	TokenNameIdentifier	 Maven Model Merger
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
/** * Handles injection of dependency management into the model. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Handles injection of dependency management into the model. * @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
DependencyManagementInjector	TokenNameIdentifier	 Dependency Management Injector
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultDependencyManagementInjector	TokenNameIdentifier	 Default Dependency Management Injector
implements	TokenNameimplements	
DependencyManagementInjector	TokenNameIdentifier	 Dependency Management Injector
{	TokenNameLBRACE	
private	TokenNameprivate	
ManagementModelMerger	TokenNameIdentifier	 Management Model Merger
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
new	TokenNamenew	
ManagementModelMerger	TokenNameIdentifier	 Management Model Merger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
injectManagement	TokenNameIdentifier	 inject Management
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
mergeManagedDependencies	TokenNameIdentifier	 merge Managed Dependencies
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ManagementModelMerger	TokenNameIdentifier	 Management Model Merger
extends	TokenNameextends	
MavenModelMerger	TokenNameIdentifier	 Maven Model Merger
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mergeManagedDependencies	TokenNameIdentifier	 merge Managed Dependencies
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DependencyManagement	TokenNameIdentifier	 Dependency Management
dependencyManagement	TokenNameIdentifier	 dependency Management
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getDependencyManagement	TokenNameIdentifier	 get Dependency Management
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dependencyManagement	TokenNameIdentifier	 dependency Management
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
:	TokenNameCOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
getDependencyKey	TokenNameIdentifier	 get Dependency Key
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
managedDependency	TokenNameIdentifier	 managed Dependency
:	TokenNameCOLON	
dependencyManagement	TokenNameIdentifier	 dependency Management
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
getDependencyKey	TokenNameIdentifier	 get Dependency Key
(	TokenNameLPAREN	
managedDependency	TokenNameIdentifier	 managed Dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
=	TokenNameEQUAL	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeDependency	TokenNameIdentifier	 merge Dependency
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
,	TokenNameCOMMA	
managedDependency	TokenNameIdentifier	 managed Dependency
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
mergeDependency_Optional	TokenNameIdentifier	 merge Dependency  Optional
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Dependency	TokenNameIdentifier	 Dependency
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sourceDominant	TokenNameIdentifier	 source Dominant
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optional flag is not managed 	TokenNameCOMMENT_LINE	optional flag is not managed 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
mergeDependency_Exclusions	TokenNameIdentifier	 merge Dependency  Exclusions
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Dependency	TokenNameIdentifier	 Dependency
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sourceDominant	TokenNameIdentifier	 source Dominant
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exclusion	TokenNameIdentifier	 Exclusion
>	TokenNameGREATER	
tgt	TokenNameIdentifier	 tgt
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getExclusions	TokenNameIdentifier	 get Exclusions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tgt	TokenNameIdentifier	 tgt
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exclusion	TokenNameIdentifier	 Exclusion
>	TokenNameGREATER	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getExclusions	TokenNameIdentifier	 get Exclusions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Exclusion	TokenNameIdentifier	 Exclusion
element	TokenNameIdentifier	 element
:	TokenNameCOLON	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exclusion	TokenNameIdentifier	 Exclusion
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addExclusion	TokenNameIdentifier	 add Exclusion
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
