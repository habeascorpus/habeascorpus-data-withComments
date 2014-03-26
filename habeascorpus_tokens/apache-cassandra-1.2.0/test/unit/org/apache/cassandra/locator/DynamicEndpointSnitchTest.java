/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
public	TokenNamepublic	
class	TokenNameclass	
DynamicEndpointSnitchTest	TokenNameIdentifier	 Dynamic Endpoint Snitch Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSnitch	TokenNameIdentifier	 test Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
// do this because SS needs to be initialized before DES can work properly. 	TokenNameCOMMENT_LINE	do this because SS needs to be initialized before DES can work properly. 
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
initClient	TokenNameIdentifier	 init Client
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sleeptime	TokenNameIdentifier	 sleeptime
=	TokenNameEQUAL	
150	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SimpleSnitch	TokenNameIdentifier	 Simple Snitch
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleSnitch	TokenNameIdentifier	 Simple Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DynamicEndpointSnitch	TokenNameIdentifier	 Dynamic Endpoint Snitch
dsnitch	TokenNameIdentifier	 dsnitch
=	TokenNameEQUAL	
new	TokenNamenew	
DynamicEndpointSnitch	TokenNameIdentifier	 Dynamic Endpoint Snitch
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
self	TokenNameIdentifier	 self
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
order	TokenNameIdentifier	 order
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
host1	TokenNameIdentifier	 host1
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
host2	TokenNameIdentifier	 host2
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.2"	TokenNameStringLiteral	127.0.0.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
host3	TokenNameIdentifier	 host3
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.3"	TokenNameStringLiteral	127.0.0.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first, make all hosts equal 	TokenNameCOMMENT_LINE	first, make all hosts equal 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleeptime	TokenNameIdentifier	 sleeptime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
self	TokenNameIdentifier	 self
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make host1 a little worse 	TokenNameCOMMENT_LINE	make host1 a little worse 
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleeptime	TokenNameIdentifier	 sleeptime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
self	TokenNameIdentifier	 self
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make host2 as bad as host1 	TokenNameCOMMENT_LINE	make host2 as bad as host1 
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleeptime	TokenNameIdentifier	 sleeptime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
self	TokenNameIdentifier	 self
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make host3 the worst 	TokenNameCOMMENT_LINE	make host3 the worst 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleeptime	TokenNameIdentifier	 sleeptime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
self	TokenNameIdentifier	 self
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make host3 equal to the others 	TokenNameCOMMENT_LINE	make host3 equal to the others 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
receiveTiming	TokenNameIdentifier	 receive Timing
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleeptime	TokenNameIdentifier	 sleeptime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host1	TokenNameIdentifier	 host1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host2	TokenNameIdentifier	 host2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
host3	TokenNameIdentifier	 host3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dsnitch	TokenNameIdentifier	 dsnitch
.	TokenNameDOT	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
self	TokenNameIdentifier	 self
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
