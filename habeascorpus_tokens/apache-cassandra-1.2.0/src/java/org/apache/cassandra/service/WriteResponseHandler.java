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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
/** * Handles blocking writes for ONE, ANY, TWO, THREE, QUORUM, and ALL consistency levels. */	TokenNameCOMMENT_JAVADOC	 Handles blocking writes for ONE, ANY, TWO, THREE, QUORUM, and ALL consistency levels. 
public	TokenNamepublic	
class	TokenNameclass	
WriteResponseHandler	TokenNameIdentifier	 Write Response Handler
extends	TokenNameextends	
AbstractWriteResponseHandler	TokenNameIdentifier	 Abstract Write Response Handler
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
WriteResponseHandler	TokenNameIdentifier	 Write Response Handler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
responses	TokenNameIdentifier	 responses
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WriteResponseHandler	TokenNameIdentifier	 Write Response Handler
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
writeEndpoints	TokenNameIdentifier	 write Endpoints
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
writeEndpoints	TokenNameIdentifier	 write Endpoints
,	TokenNameCOMMA	
pendingEndpoints	TokenNameIdentifier	 pending Endpoints
,	TokenNameCOMMA	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockFor	TokenNameIdentifier	 block For
=	TokenNameEQUAL	
consistencyLevel	TokenNameIdentifier	 consistency Level
.	TokenNameDOT	
blockFor	TokenNameIdentifier	 block For
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
responses	TokenNameIdentifier	 responses
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
blockFor	TokenNameIdentifier	 block For
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WriteResponseHandler	TokenNameIdentifier	 Write Response Handler
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
WriteType	TokenNameIdentifier	 Write Type
writeType	TokenNameIdentifier	 write Type
,	TokenNameCOMMA	
Runnable	TokenNameIdentifier	 Runnable
callback	TokenNameIdentifier	 callback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
,	TokenNameCOMMA	
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockFor	TokenNameIdentifier	 block For
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
responses	TokenNameIdentifier	 responses
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WriteResponseHandler	TokenNameIdentifier	 Write Response Handler
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
,	TokenNameCOMMA	
WriteType	TokenNameIdentifier	 Write Type
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
writeType	TokenNameIdentifier	 write Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockFor	TokenNameIdentifier	 block For
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
responses	TokenNameIdentifier	 responses
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
response	TokenNameIdentifier	 response
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
m	TokenNameIdentifier	 m
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
protected	TokenNameprotected	
int	TokenNameint	
ackCount	TokenNameIdentifier	 ack Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blockFor	TokenNameIdentifier	 block For
-	TokenNameMINUS	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
blockForCL	TokenNameIdentifier	 block For CL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blockFor	TokenNameIdentifier	 block For
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
assureSufficientLiveNodes	TokenNameIdentifier	 assure Sufficient Live Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
consistencyLevel	TokenNameIdentifier	 consistency Level
==	TokenNameEQUAL_EQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ANY	TokenNameIdentifier	 ANY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// local hint is acceptable, and local node is always live 	TokenNameCOMMENT_LINE	local hint is acceptable, and local node is always live 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// count destinations that are part of the desired target set 	TokenNameCOMMENT_LINE	count destinations that are part of the desired target set 
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
blockFor	TokenNameIdentifier	 block For
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
consistencyLevel	TokenNameIdentifier	 consistency Level
,	TokenNameCOMMA	
blockFor	TokenNameIdentifier	 block For
,	TokenNameCOMMA	
liveNodes	TokenNameIdentifier	 live Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLatencyForSnitch	TokenNameIdentifier	 is Latency For Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
