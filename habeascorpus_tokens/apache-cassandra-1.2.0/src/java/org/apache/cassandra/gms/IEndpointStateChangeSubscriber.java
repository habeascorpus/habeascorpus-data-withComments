/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
/** * This is called by an instance of the IEndpointStateChangePublisher to notify * interested parties about changes in the the state associated with any endpoint. * For instance if node A figures there is a changes in state for an endpoint B * it notifies all interested parties of this change. It is upto to the registered * instance to decide what he does with this change. Not all modules maybe interested * in all state changes. */	TokenNameCOMMENT_JAVADOC	 This is called by an instance of the IEndpointStateChangePublisher to notify interested parties about changes in the the state associated with any endpoint. For instance if node A figures there is a changes in state for an endpoint B it notifies all interested parties of this change. It is upto to the registered instance to decide what he does with this change. Not all modules maybe interested in all state changes. 
public	TokenNamepublic	
interface	TokenNameinterface	
IEndpointStateChangeSubscriber	TokenNameIdentifier	 I Endpoint State Change Subscriber
{	TokenNameLBRACE	
/** * Use to inform interested parties about the change in the state * for specified endpoint * * @param endpoint endpoint for which the state change occurred. * @param epState state that actually changed for the above endpoint. */	TokenNameCOMMENT_JAVADOC	 Use to inform interested parties about the change in the state for specified endpoint * @param endpoint endpoint for which the state change occurred. @param epState state that actually changed for the above endpoint. 
public	TokenNamepublic	
void	TokenNamevoid	
onJoin	TokenNameIdentifier	 on Join
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
epState	TokenNameIdentifier	 ep State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
onChange	TokenNameIdentifier	 on Change
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
ApplicationState	TokenNameIdentifier	 Application State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
onAlive	TokenNameIdentifier	 on Alive
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
onDead	TokenNameIdentifier	 on Dead
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
onRemove	TokenNameIdentifier	 on Remove
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called whenever a node is restarted. * Note that there is no guarantee when that happens that the node was * previously marked down. It will have only if {@code state.isAlive() == false} * as {@code state} is from before the restarted node is marked up. */	TokenNameCOMMENT_JAVADOC	 Called whenever a node is restarted. Note that there is no guarantee when that happens that the node was previously marked down. It will have only if {@code state.isAlive() == false} as {@code state} is from before the restarted node is marked up. 
public	TokenNamepublic	
void	TokenNamevoid	
onRestart	TokenNameIdentifier	 on Restart
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
