/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
/** * An endpoint snitch tells Cassandra information about network topology that it can use to route * requests more efficiently. */	TokenNameCOMMENT_JAVADOC	 An endpoint snitch tells Cassandra information about network topology that it can use to route requests more efficiently. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractNetworkTopologySnitch	TokenNameIdentifier	 Abstract Network Topology Snitch
extends	TokenNameextends	
AbstractEndpointSnitch	TokenNameIdentifier	 Abstract Endpoint Snitch
{	TokenNameLBRACE	
/** * Return the rack for which an endpoint resides in * @param endpoint a specified endpoint * @return string of rack */	TokenNameCOMMENT_JAVADOC	 Return the rack for which an endpoint resides in @param endpoint a specified endpoint @return string of rack 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the data center for which an endpoint resides in * @param endpoint a specified endpoint * @return string of data center */	TokenNameCOMMENT_JAVADOC	 Return the data center for which an endpoint resides in @param endpoint a specified endpoint @return string of data center 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compareEndpoints	TokenNameIdentifier	 compare Endpoints
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
addressDatacenter	TokenNameIdentifier	 address Datacenter
=	TokenNameEQUAL	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
a1Datacenter	TokenNameIdentifier	 a1 Datacenter
=	TokenNameEQUAL	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
a2Datacenter	TokenNameIdentifier	 a2 Datacenter
=	TokenNameEQUAL	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
addressDatacenter	TokenNameIdentifier	 address Datacenter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a1Datacenter	TokenNameIdentifier	 a1 Datacenter
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
addressDatacenter	TokenNameIdentifier	 address Datacenter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a2Datacenter	TokenNameIdentifier	 a2 Datacenter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
addressDatacenter	TokenNameIdentifier	 address Datacenter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a2Datacenter	TokenNameIdentifier	 a2 Datacenter
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
addressDatacenter	TokenNameIdentifier	 address Datacenter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a1Datacenter	TokenNameIdentifier	 a1 Datacenter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
addressRack	TokenNameIdentifier	 address Rack
=	TokenNameEQUAL	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
a1Rack	TokenNameIdentifier	 a1 Rack
=	TokenNameEQUAL	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
a2Rack	TokenNameIdentifier	 a2 Rack
=	TokenNameEQUAL	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
addressRack	TokenNameIdentifier	 address Rack
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a1Rack	TokenNameIdentifier	 a1 Rack
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
addressRack	TokenNameIdentifier	 address Rack
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a2Rack	TokenNameIdentifier	 a2 Rack
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
addressRack	TokenNameIdentifier	 address Rack
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a2Rack	TokenNameIdentifier	 a2 Rack
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
addressRack	TokenNameIdentifier	 address Rack
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a1Rack	TokenNameIdentifier	 a1 Rack
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
