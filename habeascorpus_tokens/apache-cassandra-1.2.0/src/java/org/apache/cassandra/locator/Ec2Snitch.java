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
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
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
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
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
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Charsets	TokenNameIdentifier	 Charsets
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
/** * A snitch that assumes an EC2 region is a DC and an EC2 availability_zone * is a rack. This information is available in the config for the node. */	TokenNameCOMMENT_JAVADOC	 A snitch that assumes an EC2 region is a DC and an EC2 availability_zone is a rack. This information is available in the config for the node. 
public	TokenNamepublic	
class	TokenNameclass	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
extends	TokenNameextends	
AbstractNetworkTopologySnitch	TokenNameIdentifier	 Abstract Network Topology Snitch
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ZONE_NAME_QUERY_URL	TokenNameIdentifier	 ZONE  NAME  QUERY  URL
=	TokenNameEQUAL	
"http://169.254.169.254/latest/meta-data/placement/availability-zone"	TokenNameStringLiteral	http://169.254.169.254/latest/meta-data/placement/availability-zone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_DC	TokenNameIdentifier	 DEFAULT  DC
=	TokenNameEQUAL	
"UNKNOWN-DC"	TokenNameStringLiteral	UNKNOWN-DC
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_RACK	TokenNameIdentifier	 DEFAULT  RACK
=	TokenNameEQUAL	
"UNKNOWN-RACK"	TokenNameStringLiteral	UNKNOWN-RACK
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
ec2zone	TokenNameIdentifier	 ec2zone
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
ec2region	TokenNameIdentifier	 ec2region
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Ec2Snitch	TokenNameIdentifier	 Ec2 Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
az	TokenNameIdentifier	 az
=	TokenNameEQUAL	
awsApiCall	TokenNameIdentifier	 aws Api Call
(	TokenNameLPAREN	
ZONE_NAME_QUERY_URL	TokenNameIdentifier	 ZONE  NAME  QUERY  URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Split "us-east-1a" or "asia-1a" into "us-east"/"1a" and "asia"/"1a". 	TokenNameCOMMENT_LINE	Split "us-east-1a" or "asia-1a" into "us-east"/"1a" and "asia"/"1a". 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splits	TokenNameIdentifier	 splits
=	TokenNameEQUAL	
az	TokenNameIdentifier	 az
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ec2zone	TokenNameIdentifier	 ec2zone
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
splits	TokenNameIdentifier	 splits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// hack for CASSANDRA-4026 	TokenNameCOMMENT_LINE	hack for CASSANDRA-4026 
ec2region	TokenNameIdentifier	 ec2region
=	TokenNameEQUAL	
az	TokenNameIdentifier	 az
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
az	TokenNameIdentifier	 az
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ec2region	TokenNameIdentifier	 ec2region
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ec2region	TokenNameIdentifier	 ec2region
=	TokenNameEQUAL	
az	TokenNameIdentifier	 az
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
az	TokenNameIdentifier	 az
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"EC2Snitch using region: "	TokenNameStringLiteral	EC2Snitch using region: 
+	TokenNamePLUS	
ec2region	TokenNameIdentifier	 ec2region
+	TokenNamePLUS	
", zone: "	TokenNameStringLiteral	, zone: 
+	TokenNamePLUS	
ec2zone	TokenNameIdentifier	 ec2zone
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// Populate the region and zone by introspection, fail if 404 on metadata 	TokenNameCOMMENT_LINE	Populate the region and zone by introspection, fail if 404 on metadata 
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
)	TokenNameRPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
setRequestMethod	TokenNameIdentifier	 set Request Method
(	TokenNameLPAREN	
"GET"	TokenNameStringLiteral	GET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getResponseCode	TokenNameIdentifier	 get Response Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Ec2Snitch was unable to execute the API call. Not an ec2 node?"	TokenNameStringLiteral	Ec2Snitch was unable to execute the API call. Not an ec2 node?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Read the information. I wish I could say (String) conn.getContent() here... 	TokenNameCOMMENT_LINE	Read the information. I wish I could say (String) conn.getContent() here... 
int	TokenNameint	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getContentLength	TokenNameIdentifier	 get Content Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
cl	TokenNameIdentifier	 cl
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
)	TokenNameRPAREN	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getContent	TokenNameIdentifier	 get Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
Charsets	TokenNameIdentifier	 Charsets
.	TokenNameDOT	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ec2zone	TokenNameIdentifier	 ec2zone
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getEndpointStateForEndpoint	TokenNameIdentifier	 get Endpoint State For Endpoint
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
RACK	TokenNameIdentifier	 RACK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
DEFAULT_RACK	TokenNameIdentifier	 DEFAULT  RACK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
RACK	TokenNameIdentifier	 RACK
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ec2region	TokenNameIdentifier	 ec2region
;	TokenNameSEMICOLON	
EndpointState	TokenNameIdentifier	 Endpoint State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getEndpointStateForEndpoint	TokenNameIdentifier	 get Endpoint State For Endpoint
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
DC	TokenNameIdentifier	 DC
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
DEFAULT_DC	TokenNameIdentifier	 DEFAULT  DC
;	TokenNameSEMICOLON	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getApplicationState	TokenNameIdentifier	 get Application State
(	TokenNameLPAREN	
ApplicationState	TokenNameIdentifier	 Application State
.	TokenNameDOT	
DC	TokenNameIdentifier	 DC
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
