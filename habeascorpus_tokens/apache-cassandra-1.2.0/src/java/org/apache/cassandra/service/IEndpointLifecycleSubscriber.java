/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
/** * Interface on which interested parties can be notified of high level endpoint * state changes. * * Note that while IEndpointStateChangeSubscriber notify about gossip related * changes (IEndpointStateChangeSubscriber.onJoin() is called when a node join * gossip), this interface allows to be notified about higher level events. */	TokenNameCOMMENT_JAVADOC	 Interface on which interested parties can be notified of high level endpoint state changes. * Note that while IEndpointStateChangeSubscriber notify about gossip related changes (IEndpointStateChangeSubscriber.onJoin() is called when a node join gossip), this interface allows to be notified about higher level events. 
public	TokenNamepublic	
interface	TokenNameinterface	
IEndpointLifecycleSubscriber	TokenNameIdentifier	 I Endpoint Lifecycle Subscriber
{	TokenNameLBRACE	
/** * Called when a new node joins the cluster, i.e. either has just been * bootstrapped or "instajoins". * * @param endpoint the newly added endpoint. */	TokenNameCOMMENT_JAVADOC	 Called when a new node joins the cluster, i.e. either has just been bootstrapped or "instajoins". * @param endpoint the newly added endpoint. 
public	TokenNamepublic	
void	TokenNamevoid	
onJoinCluster	TokenNameIdentifier	 on Join Cluster
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a new node leave the cluster (decommission or removeToken). * * @param endpoint the endpoint that is leaving. */	TokenNameCOMMENT_JAVADOC	 Called when a new node leave the cluster (decommission or removeToken). * @param endpoint the endpoint that is leaving. 
public	TokenNamepublic	
void	TokenNamevoid	
onLeaveCluster	TokenNameIdentifier	 on Leave Cluster
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a node is marked UP. * * @param endpoint the endpoint marked UP. */	TokenNameCOMMENT_JAVADOC	 Called when a node is marked UP. * @param endpoint the endpoint marked UP. 
public	TokenNamepublic	
void	TokenNamevoid	
onUp	TokenNameIdentifier	 on Up
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a node is marked DOWN. * * @param endpoint the endpoint marked DOWN. */	TokenNameCOMMENT_JAVADOC	 Called when a node is marked DOWN. * @param endpoint the endpoint marked DOWN. 
public	TokenNamepublic	
void	TokenNamevoid	
onDown	TokenNameIdentifier	 on Down
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a node has moved (to a new token). * * @param endpoint the endpoint that has moved. */	TokenNameCOMMENT_JAVADOC	 Called when a node has moved (to a new token). * @param endpoint the endpoint that has moved. 
public	TokenNamepublic	
void	TokenNamevoid	
onMove	TokenNameIdentifier	 on Move
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
