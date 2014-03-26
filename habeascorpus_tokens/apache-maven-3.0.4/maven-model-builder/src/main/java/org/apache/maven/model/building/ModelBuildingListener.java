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
/** * Defines events that the model builder fires during construction of the effective model. When a listener encounteres * errors while processing the event, it can report these problems via {@link ModelBuildingEvent#getProblems()}. * <em>Note:</em> To cope with future extensions to this interface, it is strongly recommended to extend * {@link AbstractModelBuildingListener} rather than to directly implement this interface. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Defines events that the model builder fires during construction of the effective model. When a listener encounteres errors while processing the event, it can report these problems via {@link ModelBuildingEvent#getProblems()}. <em>Note:</em> To cope with future extensions to this interface, it is strongly recommended to extend {@link AbstractModelBuildingListener} rather than to directly implement this interface. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
{	TokenNameLBRACE	
/** * Notifies the listener that the model has been constructed to the extent where build extensions can be processed. * * @param event The details about the event. */	TokenNameCOMMENT_JAVADOC	 Notifies the listener that the model has been constructed to the extent where build extensions can be processed. * @param event The details about the event. 
void	TokenNamevoid	
buildExtensionsAssembled	TokenNameIdentifier	 build Extensions Assembled
(	TokenNameLPAREN	
ModelBuildingEvent	TokenNameIdentifier	 Model Building Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	