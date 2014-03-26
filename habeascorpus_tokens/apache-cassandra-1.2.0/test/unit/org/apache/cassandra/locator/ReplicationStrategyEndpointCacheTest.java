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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
Table	TokenNameIdentifier	 Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
SchemaLoader	TokenNameIdentifier	 Schema Loader
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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ReplicationStrategyEndpointCacheTest	TokenNameIdentifier	 Replication Strategy Endpoint Cache Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tmd	TokenNameIdentifier	 tmd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
searchToken	TokenNameIdentifier	 search Token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
strategy	TokenNameIdentifier	 strategy
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
stratClass	TokenNameIdentifier	 strat Class
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
strategyOptions	TokenNameIdentifier	 strategy Options
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
tmd	TokenNameIdentifier	 tmd
=	TokenNameEQUAL	
new	TokenNamenew	
TokenMetadata	TokenNameIdentifier	 Token Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searchToken	TokenNameIdentifier	 search Token
=	TokenNameEQUAL	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
getStrategyWithNewTokenMetadata	TokenNameIdentifier	 get Strategy With New Token Metadata
(	TokenNameLPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
"Keyspace3"	TokenNameStringLiteral	Keyspace3
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationStrategy	TokenNameIdentifier	 get Replication Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmd	TokenNameIdentifier	 tmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.2"	TokenNameStringLiteral	127.0.0.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.3"	TokenNameStringLiteral	127.0.0.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.4"	TokenNameStringLiteral	127.0.0.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//tmd.updateNormalToken(new BigIntegerToken(String.valueOf(50)), InetAddress.getByName("127.0.0.5")); 	TokenNameCOMMENT_LINE	tmd.updateNormalToken(new BigIntegerToken(String.valueOf(50)), InetAddress.getByName("127.0.0.5")); 
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.6"	TokenNameStringLiteral	127.0.0.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
70	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.7"	TokenNameStringLiteral	127.0.0.7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.8"	TokenNameStringLiteral	127.0.0.8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEndpointsWereCached	TokenNameIdentifier	 test Endpoints Were Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
runEndpointsWereCachedTest	TokenNameIdentifier	 run Endpoints Were Cached Test
(	TokenNameLPAREN	
FakeSimpleStrategy	TokenNameIdentifier	 Fake Simple Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runEndpointsWereCachedTest	TokenNameIdentifier	 run Endpoints Were Cached Test
(	TokenNameLPAREN	
FakeOldNetworkTopologyStrategy	TokenNameIdentifier	 Fake Old Network Topology Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runEndpointsWereCachedTest	TokenNameIdentifier	 run Endpoints Were Cached Test
(	TokenNameLPAREN	
FakeNetworkTopologyStrategy	TokenNameIdentifier	 Fake Network Topology Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
runEndpointsWereCachedTest	TokenNameIdentifier	 run Endpoints Were Cached Test
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
stratClass	TokenNameIdentifier	 strat Class
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
stratClass	TokenNameIdentifier	 strat Class
,	TokenNameCOMMA	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCacheRespectsTokenChanges	TokenNameIdentifier	 test Cache Respects Token Changes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
runCacheRespectsTokenChangesTest	TokenNameIdentifier	 run Cache Respects Token Changes Test
(	TokenNameLPAREN	
SimpleStrategy	TokenNameIdentifier	 Simple Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runCacheRespectsTokenChangesTest	TokenNameIdentifier	 run Cache Respects Token Changes Test
(	TokenNameLPAREN	
OldNetworkTopologyStrategy	TokenNameIdentifier	 Old Network Topology Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runCacheRespectsTokenChangesTest	TokenNameIdentifier	 run Cache Respects Token Changes Test
(	TokenNameLPAREN	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
runCacheRespectsTokenChangesTest	TokenNameIdentifier	 run Cache Respects Token Changes Test
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
stratClass	TokenNameIdentifier	 strat Class
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
stratClass	TokenNameIdentifier	 strat Class
,	TokenNameCOMMA	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
initial	TokenNameIdentifier	 initial
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
;	TokenNameSEMICOLON	
endpoints	TokenNameIdentifier	 endpoints
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test token addition, in DC2 before existing token 	TokenNameCOMMENT_LINE	test token addition, in DC2 before existing token 
initial	TokenNameIdentifier	 initial
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
35	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.5"	TokenNameStringLiteral	127.0.0.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endpoints	TokenNameIdentifier	 endpoints
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
initial	TokenNameIdentifier	 initial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test token removal, newly created token 	TokenNameCOMMENT_LINE	test token removal, newly created token 
initial	TokenNameIdentifier	 initial
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
removeEndpoint	TokenNameIdentifier	 remove Endpoint
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.5"	TokenNameStringLiteral	127.0.0.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endpoints	TokenNameIdentifier	 endpoints
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.5"	TokenNameStringLiteral	127.0.0.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
initial	TokenNameIdentifier	 initial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test token change 	TokenNameCOMMENT_LINE	test token change 
initial	TokenNameIdentifier	 initial
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//move .8 after search token but before other DC3 	TokenNameCOMMENT_LINE	move .8 after search token but before other DC3 
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.8"	TokenNameStringLiteral	127.0.0.8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endpoints	TokenNameIdentifier	 endpoints
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
searchToken	TokenNameIdentifier	 search Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
initial	TokenNameIdentifier	 initial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FakeSimpleStrategy	TokenNameIdentifier	 Fake Simple Strategy
extends	TokenNameextends	
SimpleStrategy	TokenNameIdentifier	 Simple Strategy
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
called	TokenNameIdentifier	 called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FakeSimpleStrategy	TokenNameIdentifier	 Fake Simple Strategy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tokenMetadata	TokenNameIdentifier	 token Metadata
,	TokenNameCOMMA	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
tokenMetadata	TokenNameIdentifier	 token Metadata
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
called	TokenNameIdentifier	 called
:	TokenNameCOLON	
"calculateNaturalEndpoints was already called, result should have been cached"	TokenNameStringLiteral	calculateNaturalEndpoints was already called, result should have been cached
;	TokenNameSEMICOLON	
called	TokenNameIdentifier	 called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FakeOldNetworkTopologyStrategy	TokenNameIdentifier	 Fake Old Network Topology Strategy
extends	TokenNameextends	
OldNetworkTopologyStrategy	TokenNameIdentifier	 Old Network Topology Strategy
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
called	TokenNameIdentifier	 called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FakeOldNetworkTopologyStrategy	TokenNameIdentifier	 Fake Old Network Topology Strategy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tokenMetadata	TokenNameIdentifier	 token Metadata
,	TokenNameCOMMA	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
tokenMetadata	TokenNameIdentifier	 token Metadata
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
called	TokenNameIdentifier	 called
:	TokenNameCOLON	
"calculateNaturalEndpoints was already called, result should have been cached"	TokenNameStringLiteral	calculateNaturalEndpoints was already called, result should have been cached
;	TokenNameSEMICOLON	
called	TokenNameIdentifier	 called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FakeNetworkTopologyStrategy	TokenNameIdentifier	 Fake Network Topology Strategy
extends	TokenNameextends	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
called	TokenNameIdentifier	 called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FakeNetworkTopologyStrategy	TokenNameIdentifier	 Fake Network Topology Strategy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tokenMetadata	TokenNameIdentifier	 token Metadata
,	TokenNameCOMMA	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
tokenMetadata	TokenNameIdentifier	 token Metadata
,	TokenNameCOMMA	
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
called	TokenNameIdentifier	 called
:	TokenNameCOLON	
"calculateNaturalEndpoints was already called, result should have been cached"	TokenNameStringLiteral	calculateNaturalEndpoints was already called, result should have been cached
;	TokenNameSEMICOLON	
called	TokenNameIdentifier	 called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
getStrategyWithNewTokenMetadata	TokenNameIdentifier	 get Strategy With New Token Metadata
(	TokenNameLPAREN	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
strategy	TokenNameIdentifier	 strategy
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
newTmd	TokenNameIdentifier	 new Tmd
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
.	TokenNameDOT	
createReplicationStrategy	TokenNameIdentifier	 create Replication Strategy
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newTmd	TokenNameIdentifier	 new Tmd
,	TokenNameCOMMA	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
snitch	TokenNameIdentifier	 snitch
,	TokenNameCOMMA	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
configOptions	TokenNameIdentifier	 config Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
