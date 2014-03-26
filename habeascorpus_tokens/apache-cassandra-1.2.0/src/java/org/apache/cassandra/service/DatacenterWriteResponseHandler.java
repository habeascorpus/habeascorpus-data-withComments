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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Iterables	TokenNameIdentifier	 Iterables
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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
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
FailureDetector	TokenNameIdentifier	 Failure Detector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
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
MessageIn	TokenNameIdentifier	 Message In
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
WriteType	TokenNameIdentifier	 Write Type
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
/** * This class blocks for a quorum of responses _in the local datacenter only_ (CL.LOCAL_QUORUM). */	TokenNameCOMMENT_JAVADOC	 This class blocks for a quorum of responses _in the local datacenter only_ (CL.LOCAL_QUORUM). 
public	TokenNamepublic	
class	TokenNameclass	
DatacenterWriteResponseHandler	TokenNameIdentifier	 Datacenter Write Response Handler
extends	TokenNameextends	
WriteResponseHandler	TokenNameIdentifier	 Write Response Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
=	TokenNameEQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getEndpointSnitch	TokenNameIdentifier	 get Endpoint Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localdc	TokenNameIdentifier	 localdc
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
localdc	TokenNameIdentifier	 localdc
=	TokenNameEQUAL	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DatacenterWriteResponseHandler	TokenNameIdentifier	 Datacenter Write Response Handler
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
WriteType	TokenNameIdentifier	 Write Type
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
,	TokenNameCOMMA	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
,	TokenNameCOMMA	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
consistencyLevel	TokenNameIdentifier	 consistency Level
==	TokenNameEQUAL_EQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
response	TokenNameIdentifier	 response
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
localdc	TokenNameIdentifier	 localdc
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
signal	TokenNameIdentifier	 signal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
assureSufficientLiveNodes	TokenNameIdentifier	 assure Sufficient Live Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
{	TokenNameLBRACE	
int	TokenNameint	
liveNodes	TokenNameIdentifier	 live Nodes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
destination	TokenNameIdentifier	 destination
:	TokenNameCOLON	
Iterables	TokenNameIdentifier	 Iterables
.	TokenNameDOT	
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
naturalEndpoints	TokenNameIdentifier	 natural Endpoints
,	TokenNameCOMMA	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localdc	TokenNameIdentifier	 localdc
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
FailureDetector	TokenNameIdentifier	 Failure Detector
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
)	TokenNameRPAREN	
liveNodes	TokenNameIdentifier	 live Nodes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
liveNodes	TokenNameIdentifier	 live Nodes
<	TokenNameLESS	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
liveNodes	TokenNameIdentifier	 live Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
