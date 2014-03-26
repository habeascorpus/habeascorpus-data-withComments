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
/** * An interface that provides an application with the ability * to query liveness information of a node in the cluster. It * also exposes methods which help an application register callbacks * for notifications of liveness information of nodes. */	TokenNameCOMMENT_JAVADOC	 An interface that provides an application with the ability to query liveness information of a node in the cluster. It also exposes methods which help an application register callbacks for notifications of liveness information of nodes. 
public	TokenNamepublic	
interface	TokenNameinterface	
IFailureDetector	TokenNameIdentifier	 I Failure Detector
{	TokenNameLBRACE	
/** * Failure Detector's knowledge of whether a node is up or * down. * * @param ep endpoint in question. * @return true if UP and false if DOWN. */	TokenNameCOMMENT_JAVADOC	 Failure Detector's knowledge of whether a node is up or down. * @param ep endpoint in question. @return true if UP and false if DOWN. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Clear any existing interval timings for this endpoint * @param ep */	TokenNameCOMMENT_JAVADOC	 Clear any existing interval timings for this endpoint @param ep 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is invoked by any entity wanting to interrogate the status of an endpoint. * In our case it would be the Gossiper. The Failure Detector will then calculate Phi and * deem an endpoint as suspicious or alive as explained in the Hayashibara paper. * * param ep endpoint for which we interpret the inter arrival times. */	TokenNameCOMMENT_JAVADOC	 This method is invoked by any entity wanting to interrogate the status of an endpoint. In our case it would be the Gossiper. The Failure Detector will then calculate Phi and deem an endpoint as suspicious or alive as explained in the Hayashibara paper. * param ep endpoint for which we interpret the inter arrival times. 
public	TokenNamepublic	
void	TokenNamevoid	
interpret	TokenNameIdentifier	 interpret
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is invoked by the receiver of the heartbeat. In our case it would be * the Gossiper. Gossiper inform the Failure Detector on receipt of a heartbeat. The * FailureDetector will then sample the arrival time as explained in the paper. * * param ep endpoint being reported. */	TokenNameCOMMENT_JAVADOC	 This method is invoked by the receiver of the heartbeat. In our case it would be the Gossiper. Gossiper inform the Failure Detector on receipt of a heartbeat. The FailureDetector will then sample the arrival time as explained in the paper. * param ep endpoint being reported. 
public	TokenNamepublic	
void	TokenNamevoid	
report	TokenNameIdentifier	 report
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * remove endpoint from failure detector */	TokenNameCOMMENT_JAVADOC	 remove endpoint from failure detector 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * force conviction of endpoint in the failure detector */	TokenNameCOMMENT_JAVADOC	 force conviction of endpoint in the failure detector 
public	TokenNamepublic	
void	TokenNamevoid	
forceConviction	TokenNameIdentifier	 force Conviction
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Register interest for Failure Detector events. * @param listener implementation of an application provided IFailureDetectionEventListener */	TokenNameCOMMENT_JAVADOC	 Register interest for Failure Detector events. @param listener implementation of an application provided IFailureDetectionEventListener 
public	TokenNamepublic	
void	TokenNamevoid	
registerFailureDetectionEventListener	TokenNameIdentifier	 register Failure Detection Event Listener
(	TokenNameLPAREN	
IFailureDetectionEventListener	TokenNameIdentifier	 I Failure Detection Event Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Un-register interest for Failure Detector events. * @param listener implementation of an application provided IFailureDetectionEventListener */	TokenNameCOMMENT_JAVADOC	 Un-register interest for Failure Detector events. @param listener implementation of an application provided IFailureDetectionEventListener 
public	TokenNamepublic	
void	TokenNamevoid	
unregisterFailureDetectionEventListener	TokenNameIdentifier	 unregister Failure Detection Event Listener
(	TokenNameLPAREN	
IFailureDetectionEventListener	TokenNameIdentifier	 I Failure Detection Event Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
