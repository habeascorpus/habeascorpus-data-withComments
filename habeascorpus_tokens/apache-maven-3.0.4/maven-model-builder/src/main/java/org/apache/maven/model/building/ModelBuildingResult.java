package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
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
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
/** * Collects the output of the model builder. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects the output of the model builder. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
{	TokenNameLBRACE	
/** * Gets the sequence of model identifiers that denote the lineage of models from which the effective model was * constructed. Model identifiers have the form {@code <groupId>:<artifactId>:<version>}. The first identifier from * the list denotes the model on which the model builder was originally invoked. The last identifier will always be * an empty string that by definition denotes the super POM. * * @return The model identifiers from the lineage of models, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the sequence of model identifiers that denote the lineage of models from which the effective model was constructed. Model identifiers have the form {@code <groupId>:<artifactId>:<version>}. The first identifier from the list denotes the model on which the model builder was originally invoked. The last identifier will always be an empty string that by definition denotes the super POM. * @return The model identifiers from the lineage of models, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getModelIds	TokenNameIdentifier	 get Model Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the assembled model. * * @return The assembled model, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the assembled model. * @return The assembled model, never {@code null}. 
Model	TokenNameIdentifier	 Model
getEffectiveModel	TokenNameIdentifier	 get Effective Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the raw model as it was read from the input model source. Apart from basic validation, the raw model has not * undergone any updates by the model builder, e.g. reflects neither inheritance nor interpolation. * * @return The raw model, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the raw model as it was read from the input model source. Apart from basic validation, the raw model has not undergone any updates by the model builder, e.g. reflects neither inheritance nor interpolation. * @return The raw model, never {@code null}. 
Model	TokenNameIdentifier	 Model
getRawModel	TokenNameIdentifier	 get Raw Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the specified raw model as it was read from a model source. Apart from basic validation, a raw model has not * undergone any updates by the model builder, e.g. reflects neither inheritance nor interpolation. The model * identifier should be from the collection obtained by {@link #getModelIds()}. As a special case, an empty string * can be used as the identifier for the super POM. * * @param modelId The identifier of the desired raw model, must not be {@code null}. * @return The raw model or {@code null} if the specified model id does not refer to a known model. */	TokenNameCOMMENT_JAVADOC	 Gets the specified raw model as it was read from a model source. Apart from basic validation, a raw model has not undergone any updates by the model builder, e.g. reflects neither inheritance nor interpolation. The model identifier should be from the collection obtained by {@link #getModelIds()}. As a special case, an empty string can be used as the identifier for the super POM. * @param modelId The identifier of the desired raw model, must not be {@code null}. @return The raw model or {@code null} if the specified model id does not refer to a known model. 
Model	TokenNameIdentifier	 Model
getRawModel	TokenNameIdentifier	 get Raw Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the profiles from the specified model that were active during model building. The model identifier should be * from the collection obtained by {@link #getModelIds()}. As a special case, an empty string can be used as the * identifier for the super POM. * * @param modelId The identifier of the model whose active profiles should be retrieved, must not be {@code null}. * @return The active profiles of the model or an empty list if none or {@code null} if the specified model id does * not refer to a known model. */	TokenNameCOMMENT_JAVADOC	 Gets the profiles from the specified model that were active during model building. The model identifier should be from the collection obtained by {@link #getModelIds()}. As a special case, an empty string can be used as the identifier for the super POM. * @param modelId The identifier of the model whose active profiles should be retrieved, must not be {@code null}. @return The active profiles of the model or an empty list if none or {@code null} if the specified model id does not refer to a known model. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getActivePomProfiles	TokenNameIdentifier	 get Active Pom Profiles
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the external profiles that were active during model building. External profiles are those that were * contributed by {@link ModelBuildingRequest#getProfiles()}. * * @return The active external profiles or an empty list if none, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the external profiles that were active during model building. External profiles are those that were contributed by {@link ModelBuildingRequest#getProfiles()}. * @return The active external profiles or an empty list if none, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getActiveExternalProfiles	TokenNameIdentifier	 get Active External Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the problems that were encountered during the model building. Note that only problems of severity * {@link ModelProblem.Severity#WARNING} and below are reported here. Problems with a higher severity level cause * the model builder to fail with a {@link ModelBuildingException}. * * @return The problems that were encountered during the model building, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the problems that were encountered during the model building. Note that only problems of severity {@link ModelProblem.Severity#WARNING} and below are reported here. Problems with a higher severity level cause the model builder to fail with a {@link ModelBuildingException}. * @return The problems that were encountered during the model building, can be empty but never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
