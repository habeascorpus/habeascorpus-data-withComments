package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
VersionedValue	TokenNameIdentifier	 Versioned Value
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
EC2SnitchTest	TokenNameIdentifier	 E C2 Snitch Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
az	TokenNameIdentifier	 az
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
TestEC2Snitch	TokenNameIdentifier	 Test E C2 Snitch
extends	TokenNameextends	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
{	TokenNameLBRACE	
public	TokenNamepublic	
TestEC2Snitch	TokenNameIdentifier	 Test E C2 Snitch
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
String	TokenNameIdentifier	 String
awsApiCall	TokenNameIdentifier	 aws Api Call
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
az	TokenNameIdentifier	 az
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRac	TokenNameIdentifier	 test Rac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
az	TokenNameIdentifier	 az
=	TokenNameEQUAL	
"us-east-1d"	TokenNameStringLiteral	us-east-1d
;	TokenNameSEMICOLON	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
snitch	TokenNameIdentifier	 snitch
=	TokenNameEQUAL	
new	TokenNamenew	
TestEC2Snitch	TokenNameIdentifier	 Test E C2 Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
nonlocal	TokenNameIdentifier	 nonlocal
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.7"	TokenNameStringLiteral	127.0.0.7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addSavedEndpoint	TokenNameIdentifier	 add Saved Endpoint
(	TokenNameLPAREN	
nonlocal	TokenNameIdentifier	 nonlocal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ApplicationState	TokenNameIdentifier	 Application State
,	TokenNameCOMMA	
VersionedValue	TokenNameIdentifier	 Versioned Value
>	TokenNameGREATER	
stateMap	TokenNameIdentifier	 state Map
=	TokenNameEQUAL	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getEndpointStateForEndpoint	TokenNameIdentifier	 get Endpoint State For Endpoint
(	TokenNameLPAREN	
nonlocal	TokenNameIdentifier	 nonlocal
)	TokenNameRPAREN	
.	TokenNameDOT	
getApplicationStateMap	TokenNameIdentifier	 get Application State Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stateMap	TokenNameIdentifier	 state Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
DC	TokenNameIdentifier	 DC
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
valueFactory	TokenNameIdentifier	 value Factory
.	TokenNameDOT	
datacenter	TokenNameIdentifier	 datacenter
(	TokenNameLPAREN	
"us-west"	TokenNameStringLiteral	us-west
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stateMap	TokenNameIdentifier	 state Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
RACK	TokenNameIdentifier	 RACK
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
valueFactory	TokenNameIdentifier	 value Factory
.	TokenNameDOT	
datacenter	TokenNameIdentifier	 datacenter
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"us-west"	TokenNameStringLiteral	us-west
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
nonlocal	TokenNameIdentifier	 nonlocal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
nonlocal	TokenNameIdentifier	 nonlocal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"us-east"	TokenNameStringLiteral	us-east
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1d"	TokenNameStringLiteral	1d
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNewRegions	TokenNameIdentifier	 test New Regions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
az	TokenNameIdentifier	 az
=	TokenNameEQUAL	
"us-east-2d"	TokenNameStringLiteral	us-east-2d
;	TokenNameSEMICOLON	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
snitch	TokenNameIdentifier	 snitch
=	TokenNameEQUAL	
new	TokenNamenew	
TestEC2Snitch	TokenNameIdentifier	 Test E C2 Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"us-east-2"	TokenNameStringLiteral	us-east-2
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2d"	TokenNameStringLiteral	2d
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
