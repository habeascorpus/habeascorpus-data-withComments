package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
profile	TokenNameIdentifier	 profile
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
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
/** * Calculates the active profiles among a given collection of profiles. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Calculates the active profiles among a given collection of profiles. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ProfileSelector	TokenNameIdentifier	 Profile Selector
{	TokenNameLBRACE	
/** * Determines the profiles which are active in the specified activation context. Active profiles will eventually be * injected into the model. * * @param profiles The profiles whose activation status should be determined, must not be {@code null}. * @param context The environmental context used to determine the activation status of a profile, must not be * {@code null}. * @param problems The container used to collect problems that were encountered, must not be {@code null}. * @return The profiles that have been activated, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Determines the profiles which are active in the specified activation context. Active profiles will eventually be injected into the model. * @param profiles The profiles whose activation status should be determined, must not be {@code null}. @param context The environmental context used to determine the activation status of a profile, must not be {@code null}. @param problems The container used to collect problems that were encountered, must not be {@code null}. @return The profiles that have been activated, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
profiles	TokenNameIdentifier	 profiles
,	TokenNameCOMMA	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
