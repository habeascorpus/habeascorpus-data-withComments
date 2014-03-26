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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageIn	TokenNameIdentifier	 Message In
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
TMessage	TokenNameIdentifier	 T Message
;	TokenNameSEMICOLON	
/** * Datacenter Quorum response handler blocks for a quorum of responses from the local DC */	TokenNameCOMMENT_JAVADOC	 Datacenter Quorum response handler blocks for a quorum of responses from the local DC 
public	TokenNamepublic	
class	TokenNameclass	
DatacenterReadCallback	TokenNameIdentifier	 Datacenter Read Callback
<	TokenNameLESS	
TMessage	TokenNameIdentifier	 T Message
,	TokenNameCOMMA	
TResolved	TokenNameIdentifier	 T Resolved
>	TokenNameGREATER	
extends	TokenNameextends	
ReadCallback	TokenNameIdentifier	 Read Callback
<	TokenNameLESS	
TMessage	TokenNameIdentifier	 T Message
,	TokenNameCOMMA	
TResolved	TokenNameIdentifier	 T Resolved
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
localComparator	TokenNameIdentifier	 local Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint1	TokenNameIdentifier	 endpoint1
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint2	TokenNameIdentifier	 endpoint2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
local1	TokenNameIdentifier	 local1
=	TokenNameEQUAL	
localdc	TokenNameIdentifier	 localdc
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
endpoint1	TokenNameIdentifier	 endpoint1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
local2	TokenNameIdentifier	 local2
=	TokenNameEQUAL	
localdc	TokenNameIdentifier	 localdc
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
endpoint2	TokenNameIdentifier	 endpoint2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
local1	TokenNameIdentifier	 local1
&&	TokenNameAND_AND	
!	TokenNameNOT	
local2	TokenNameIdentifier	 local2
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
local2	TokenNameIdentifier	 local2
&&	TokenNameAND_AND	
!	TokenNameNOT	
local1	TokenNameIdentifier	 local1
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DatacenterReadCallback	TokenNameIdentifier	 Datacenter Read Callback
(	TokenNameLPAREN	
IResponseResolver	TokenNameIdentifier	 I Response Resolver
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
IReadCommand	TokenNameIdentifier	 I Read Command
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
endpoints	TokenNameIdentifier	 endpoints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
sortForConsistencyLevel	TokenNameIdentifier	 sort For Consistency Level
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
,	TokenNameCOMMA	
localComparator	TokenNameIdentifier	 local Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
waitingFor	TokenNameIdentifier	 waiting For
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
;	TokenNameSEMICOLON	
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
localEndpoints	TokenNameIdentifier	 local Endpoints
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
:	TokenNameCOLON	
endpoints	TokenNameIdentifier	 endpoints
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
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
localEndpoints	TokenNameIdentifier	 local Endpoints
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localEndpoints	TokenNameIdentifier	 local Endpoints
<	TokenNameLESS	
blockfor	TokenNameIdentifier	 blockfor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"Local replicas ["	TokenNameStringLiteral	Local replicas [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
:	TokenNameCOLON	
endpoints	TokenNameIdentifier	 endpoints
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
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] are insufficient to satisfy LOCAL_QUORUM requirement of "	TokenNameStringLiteral	] are insufficient to satisfy LOCAL_QUORUM requirement of 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
blockfor	TokenNameIdentifier	 blockfor
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" live nodes in '"	TokenNameStringLiteral	 live nodes in '
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
localdc	TokenNameIdentifier	 localdc
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
blockfor	TokenNameIdentifier	 blockfor
,	TokenNameCOMMA	
localEndpoints	TokenNameIdentifier	 local Endpoints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
