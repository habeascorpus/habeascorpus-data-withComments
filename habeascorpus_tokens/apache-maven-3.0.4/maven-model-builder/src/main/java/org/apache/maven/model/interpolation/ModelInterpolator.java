package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Replaces expressions of the form <tt>${token}</tt> with their effective values. Effective values are basically * calculated from the elements of the model itself and the execution properties from the building request. * * @author jdcasey * <p/> * Created on Feb 2, 2005 */	TokenNameCOMMENT_JAVADOC	 Replaces expressions of the form <tt>${token}</tt> with their effective values. Effective values are basically calculated from the elements of the model itself and the execution properties from the building request. * @author jdcasey <p/> Created on Feb 2, 2005 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelInterpolator	TokenNameIdentifier	 Model Interpolator
{	TokenNameLBRACE	
/** * Interpolates expressions in the specified model. Note that implementations are free to either interpolate the * provided model directly or to create a clone of the model and interpolate the clone. Callers should always use * the returned model and must not rely on the input model being updated. * * @param model The model to interpolate, must not be {@code null}. * @param projectDir The project directory, may be {@code null} if the model does not belong to a local project but * to some artifact's metadata. * @param request The model building request that holds further settings, must not be {@code null}. * @param problems The container used to collect problems that were encountered, must not be {@code null}. * @return The interpolated model, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Interpolates expressions in the specified model. Note that implementations are free to either interpolate the provided model directly or to create a clone of the model and interpolate the clone. Callers should always use the returned model and must not rely on the input model being updated. * @param model The model to interpolate, must not be {@code null}. @param projectDir The project directory, may be {@code null} if the model does not belong to a local project but to some artifact's metadata. @param request The model building request that holds further settings, must not be {@code null}. @param problems The container used to collect problems that were encountered, must not be {@code null}. @return The interpolated model, never {@code null}. 
Model	TokenNameIdentifier	 Model
interpolateModel	TokenNameIdentifier	 interpolate Model
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
projectDir	TokenNameIdentifier	 project Dir
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
