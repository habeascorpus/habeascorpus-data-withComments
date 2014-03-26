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
/** * Builds the effective model from a POM. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Builds the effective model from a POM. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelBuilder	TokenNameIdentifier	 Model Builder
{	TokenNameLBRACE	
/** * Builds the effective model of the specified POM. * * @param request The model building request that holds the parameters, must not be {@code null}. * @return The result of the model building, never {@code null}. * @throws ModelBuildingException If the effective model could not be built. */	TokenNameCOMMENT_JAVADOC	 Builds the effective model of the specified POM. * @param request The model building request that holds the parameters, must not be {@code null}. @return The result of the model building, never {@code null}. @throws ModelBuildingException If the effective model could not be built. 
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
;	TokenNameSEMICOLON	
/** * Builds the effective model by completing the specified interim result which was produced by a previous call to * {@link #build(ModelBuildingRequest)} with {@link ModelBuildingRequest#isTwoPhaseBuilding()} being {@code true}. * The model building request passed to this method must be the same as the one used for the first phase of the * model building. * * @param request The model building request that holds the parameters, must not be {@code null}. * @param result The interim result of the first phase of model building, must not be {@code null}. * @return The result of the model building, never {@code null}. * @throws ModelBuildingException If the effective model could not be built. */	TokenNameCOMMENT_JAVADOC	 Builds the effective model by completing the specified interim result which was produced by a previous call to {@link #build(ModelBuildingRequest)} with {@link ModelBuildingRequest#isTwoPhaseBuilding()} being {@code true}. The model building request passed to this method must be the same as the one used for the first phase of the model building. * @param request The model building request that holds the parameters, must not be {@code null}. @param result The interim result of the first phase of model building, must not be {@code null}. @return The result of the model building, never {@code null}. @throws ModelBuildingException If the effective model could not be built. 
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
