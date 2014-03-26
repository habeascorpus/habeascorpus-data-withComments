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
/** * Implemented by the Gossiper to convict an endpoint * based on the PHI calculated by the Failure Detector on the inter-arrival * times of the heart beats. */	TokenNameCOMMENT_JAVADOC	 Implemented by the Gossiper to convict an endpoint based on the PHI calculated by the Failure Detector on the inter-arrival times of the heart beats. 
public	TokenNamepublic	
interface	TokenNameinterface	
IFailureDetectionEventListener	TokenNameIdentifier	 I Failure Detection Event Listener
{	TokenNameLBRACE	
/** * Convict the specified endpoint. * @param ep endpoint to be convicted * @param phi the value of phi with with ep was convicted */	TokenNameCOMMENT_JAVADOC	 Convict the specified endpoint. @param ep endpoint to be convicted @param phi the value of phi with with ep was convicted 
public	TokenNamepublic	
void	TokenNamevoid	
convict	TokenNameIdentifier	 convict
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
,	TokenNameCOMMA	
double	TokenNamedouble	
phi	TokenNameIdentifier	 phi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
