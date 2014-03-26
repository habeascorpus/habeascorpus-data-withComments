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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
ApplicationState	TokenNameIdentifier	 Application State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
EndpointState	TokenNameIdentifier	 Endpoint State
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
Gossiper	TokenNameIdentifier	 Gossiper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
IEndpointStateChangeSubscriber	TokenNameIdentifier	 I Endpoint State Change Subscriber
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
VersionedValue	TokenNameIdentifier	 Versioned Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
;	TokenNameSEMICOLON	
/** * 1) Snitch will automatically set the public IP by querying the AWS API * * 2) Snitch will set the private IP as a Gossip application state. * * 3) Snitch implements IESCS and will reset the connection if it is within the * same region to communicate via private IP. * * Implements Ec2Snitch to inherit its functionality and extend it for * Multi-Region. * * Operational: All the nodes in this cluster needs to be able to (modify the * Security group settings in AWS) communicate via Public IP's. */	TokenNameCOMMENT_JAVADOC	 1) Snitch will automatically set the public IP by querying the AWS API * 2) Snitch will set the private IP as a Gossip application state. * 3) Snitch implements IESCS and will reset the connection if it is within the same region to communicate via private IP. * Implements Ec2Snitch to inherit its functionality and extend it for Multi-Region. * Operational: All the nodes in this cluster needs to be able to (modify the Security group settings in AWS) communicate via Public IP's. 
public	TokenNamepublic	
class	TokenNameclass	
Ec2MultiRegionSnitch	TokenNameIdentifier	 Ec2 Multi Region Snitch
extends	TokenNameextends	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
implements	TokenNameimplements	
IEndpointStateChangeSubscriber	TokenNameIdentifier	 I Endpoint State Change Subscriber
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PUBLIC_IP_QUERY_URL	TokenNameIdentifier	 PUBLIC  IP  QUERY  URL
=	TokenNameEQUAL	
"http://169.254.169.254/latest/meta-data/public-ipv4"	TokenNameStringLiteral	http://169.254.169.254/latest/meta-data/public-ipv4
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PRIVATE_IP_QUERY_URL	TokenNameIdentifier	 PRIVATE  IP  QUERY  URL
=	TokenNameEQUAL	
"http://169.254.169.254/latest/meta-data/local-ipv4"	TokenNameStringLiteral	http://169.254.169.254/latest/meta-data/local-ipv4
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
public_ip	TokenNameIdentifier	 public ip
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
private_ip	TokenNameIdentifier	 private ip
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Ec2MultiRegionSnitch	TokenNameIdentifier	 Ec2 Multi Region Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public_ip	TokenNameIdentifier	 public ip
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
awsApiCall	TokenNameIdentifier	 aws Api Call
(	TokenNameLPAREN	
PUBLIC_IP_QUERY_URL	TokenNameIdentifier	 PUBLIC  IP  QUERY  URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"EC2Snitch using publicIP as identifier: "	TokenNameStringLiteral	EC2Snitch using publicIP as identifier: 
+	TokenNamePLUS	
public_ip	TokenNameIdentifier	 public ip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private_ip	TokenNameIdentifier	 private ip
=	TokenNameEQUAL	
awsApiCall	TokenNameIdentifier	 aws Api Call
(	TokenNameLPAREN	
PRIVATE_IP_QUERY_URL	TokenNameIdentifier	 PRIVATE  IP  QUERY  URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use the Public IP to broadcast Address to other nodes. 	TokenNameCOMMENT_LINE	use the Public IP to broadcast Address to other nodes. 
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
setBroadcastAddress	TokenNameIdentifier	 set Broadcast Address
(	TokenNameLPAREN	
public_ip	TokenNameIdentifier	 public ip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
INTERNAL_IP	TokenNameIdentifier	 INTERNAL  IP
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reConnect	TokenNameIdentifier	 re Connect
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
epState	TokenNameIdentifier	 ep State
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
INTERNAL_IP	TokenNameIdentifier	 INTERNAL  IP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
INTERNAL_IP	TokenNameIdentifier	 INTERNAL  IP
)	TokenNameRPAREN	
reConnect	TokenNameIdentifier	 re Connect
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
INTERNAL_IP	TokenNameIdentifier	 INTERNAL  IP
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reConnect	TokenNameIdentifier	 re Connect
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
INTERNAL_IP	TokenNameIdentifier	 INTERNAL  IP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onRemove	TokenNameIdentifier	 on Remove
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing. 	TokenNameCOMMENT_LINE	do nothing. 
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
reConnect	TokenNameIdentifier	 re Connect
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
versionedValue	TokenNameIdentifier	 versioned Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
public_ip	TokenNameIdentifier	 public ip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// do nothing return back... 	TokenNameCOMMENT_LINE	do nothing return back... 
try	TokenNametry	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
remoteIP	TokenNameIdentifier	 remote IP
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
versionedValue	TokenNameIdentifier	 versioned Value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnectionPool	TokenNameIdentifier	 get Connection Pool
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
remoteIP	TokenNameIdentifier	 remote IP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Intiated reconnect to an Internal IP %s for the %s"	TokenNameStringLiteral	Intiated reconnect to an Internal IP %s for the %s
,	TokenNameCOMMA	
remoteIP	TokenNameIdentifier	 remote IP
,	TokenNameCOMMA	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error in getting the IP address resolved: "	TokenNameStringLiteral	Error in getting the IP address resolved: 
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addLocalApplicationState	TokenNameIdentifier	 add Local Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
INTERNAL_IP	TokenNameIdentifier	 INTERNAL  IP
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
valueFactory	TokenNameIdentifier	 value Factory
.	TokenNameDOT	
internalIP	TokenNameIdentifier	 internal IP
(	TokenNameLPAREN	
private_ip	TokenNameIdentifier	 private ip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
