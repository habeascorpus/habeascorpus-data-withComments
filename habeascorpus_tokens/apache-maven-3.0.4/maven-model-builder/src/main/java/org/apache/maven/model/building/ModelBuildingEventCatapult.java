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
/** * Assists in firing events from a generic method by abstracting from the actual callback method to be called on the * listener. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Assists in firing events from a generic method by abstracting from the actual callback method to be called on the listener. * @author Benjamin Bentmann 
interface	TokenNameinterface	
ModelBuildingEventCatapult	TokenNameIdentifier	 Model Building Event Catapult
{	TokenNameLBRACE	
/** * Notifies the specified listener of the given event. * * @param listener The listener to notify, must not be {@code null}. * @param event The event to fire, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Notifies the specified listener of the given event. * @param listener The listener to notify, must not be {@code null}. @param event The event to fire, must not be {@code null}. 
void	TokenNamevoid	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
ModelBuildingEvent	TokenNameIdentifier	 Model Building Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ModelBuildingEventCatapult	TokenNameIdentifier	 Model Building Event Catapult
BUILD_EXTENSIONS_ASSEMBLED	TokenNameIdentifier	 BUILD  EXTENSIONS  ASSEMBLED
=	TokenNameEQUAL	
new	TokenNamenew	
ModelBuildingEventCatapult	TokenNameIdentifier	 Model Building Event Catapult
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fire	TokenNameIdentifier	 fire
(	TokenNameLPAREN	
ModelBuildingListener	TokenNameIdentifier	 Model Building Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
ModelBuildingEvent	TokenNameIdentifier	 Model Building Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
buildExtensionsAssembled	TokenNameIdentifier	 build Extensions Assembled
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
