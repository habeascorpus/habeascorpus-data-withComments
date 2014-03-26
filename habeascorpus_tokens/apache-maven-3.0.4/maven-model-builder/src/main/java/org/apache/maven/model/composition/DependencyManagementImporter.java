package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
composition	TokenNameIdentifier	 composition
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Handles the import of dependency management from other models into the target model. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Handles the import of dependency management from other models into the target model. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
DependencyManagementImporter	TokenNameIdentifier	 Dependency Management Importer
{	TokenNameLBRACE	
/** * Imports the specified dependency management sections into the given target model. * * @param target The model into which to import the dependency management section, must not be <code>null</code>. * @param sources The dependency management sections to import, may be <code>null</code>. * @param request The model building request that holds further settings, must not be {@code null}. * @param problems The container used to collect problems that were encountered, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Imports the specified dependency management sections into the given target model. * @param target The model into which to import the dependency management section, must not be <code>null</code>. @param sources The dependency management sections to import, may be <code>null</code>. @param request The model building request that holds further settings, must not be {@code null}. @param problems The container used to collect problems that were encountered, must not be {@code null}. 
void	TokenNamevoid	
importManagement	TokenNameIdentifier	 import Management
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
DependencyManagement	TokenNameIdentifier	 Dependency Management
>	TokenNameGREATER	
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
