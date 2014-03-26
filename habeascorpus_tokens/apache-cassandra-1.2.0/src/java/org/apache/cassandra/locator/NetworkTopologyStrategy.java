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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
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
TokenMetadata	TokenNameIdentifier	 Token Metadata
.	TokenNameDOT	
Topology	TokenNameIdentifier	 Topology
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
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Multimap	TokenNameIdentifier	 Multimap
;	TokenNameSEMICOLON	
/** * This Replication Strategy takes a property file that gives the intended * replication factor in each datacenter. The sum total of the datacenter * replication factor values should be equal to the keyspace replication * factor. * <p/> * So for example, if the keyspace replication factor is 6, the * datacenter replication factors could be 3, 2, and 1 - so 3 replicas in * one datacenter, 2 in another, and 1 in another - totalling 6. * <p/> * This class also caches the Endpoints and invalidates the cache if there is a * change in the number of tokens. */	TokenNameCOMMENT_JAVADOC	 This Replication Strategy takes a property file that gives the intended replication factor in each datacenter. The sum total of the datacenter replication factor values should be equal to the keyspace replication factor. <p/> So for example, if the keyspace replication factor is 6, the datacenter replication factors could be 3, 2, and 1 - so 3 replicas in one datacenter, 2 in another, and 1 in another - totalling 6. <p/> This class also caches the Endpoints and invalidates the cache if there is a change in the number of tokens. 
public	TokenNamepublic	
class	TokenNameclass	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
extends	TokenNameextends	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
snitch	TokenNameIdentifier	 snitch
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
datacenters	TokenNameIdentifier	 datacenters
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
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
this	TokenNamethis	
.	TokenNameDOT	
snitch	TokenNameIdentifier	 snitch
=	TokenNameEQUAL	
snitch	TokenNameIdentifier	 snitch
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
newDatacenters	TokenNameIdentifier	 new Datacenters
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
configOptions	TokenNameIdentifier	 config Options
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
configOptions	TokenNameIdentifier	 config Options
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"replication_factor"	TokenNameStringLiteral	replication_factor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"replication_factor is an option for SimpleStrategy, not NetworkTopologyStrategy"	TokenNameStringLiteral	replication_factor is an option for SimpleStrategy, not NetworkTopologyStrategy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
replicas	TokenNameIdentifier	 replicas
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newDatacenters	TokenNameIdentifier	 new Datacenters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
replicas	TokenNameIdentifier	 replicas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
datacenters	TokenNameIdentifier	 datacenters
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
newDatacenters	TokenNameIdentifier	 new Datacenters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Configured datacenter replicas are {}"	TokenNameStringLiteral	Configured datacenter replicas are {}
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
datacenters	TokenNameIdentifier	 datacenters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * calculate endpoints in one pass through the tokens by tracking our progress in each DC, rack etc. */	TokenNameCOMMENT_JAVADOC	 calculate endpoints in one pass through the tokens by tracking our progress in each DC, rack etc. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"serial"	TokenNameStringLiteral	serial
)	TokenNameRPAREN	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
calculateNaturalEndpoints	TokenNameIdentifier	 calculate Natural Endpoints
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
searchToken	TokenNameIdentifier	 search Token
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tokenMetadata	TokenNameIdentifier	 token Metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
replicas	TokenNameIdentifier	 replicas
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// replicas we have found in each DC 	TokenNameCOMMENT_LINE	replicas we have found in each DC 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
dcReplicas	TokenNameIdentifier	 dc Replicas
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dc	TokenNameIdentifier	 dc
:	TokenNameCOLON	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Topology	TokenNameIdentifier	 Topology
topology	TokenNameIdentifier	 topology
=	TokenNameEQUAL	
tokenMetadata	TokenNameIdentifier	 token Metadata
.	TokenNameDOT	
getTopology	TokenNameIdentifier	 get Topology
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// all endpoints in each DC, so we can check when we have exhausted all the members of a DC 	TokenNameCOMMENT_LINE	all endpoints in each DC, so we can check when we have exhausted all the members of a DC 
Multimap	TokenNameIdentifier	 Multimap
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
allEndpoints	TokenNameIdentifier	 all Endpoints
=	TokenNameEQUAL	
topology	TokenNameIdentifier	 topology
.	TokenNameDOT	
getDatacenterEndpoints	TokenNameIdentifier	 get Datacenter Endpoints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// all racks in a DC so we can check when we have exhausted all racks in a DC 	TokenNameCOMMENT_LINE	all racks in a DC so we can check when we have exhausted all racks in a DC 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Multimap	TokenNameIdentifier	 Multimap
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
racks	TokenNameIdentifier	 racks
=	TokenNameEQUAL	
topology	TokenNameIdentifier	 topology
.	TokenNameDOT	
getDatacenterRacks	TokenNameIdentifier	 get Datacenter Racks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
allEndpoints	TokenNameIdentifier	 all Endpoints
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
racks	TokenNameIdentifier	 racks
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"not aware of any cluster members"	TokenNameStringLiteral	not aware of any cluster members
;	TokenNameSEMICOLON	
// tracks the racks we have already placed replicas in 	TokenNameCOMMENT_LINE	tracks the racks we have already placed replicas in 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
seenRacks	TokenNameIdentifier	 seen Racks
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dc	TokenNameIdentifier	 dc
:	TokenNameCOLON	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// tracks the endpoints that we skipped over while looking for unique racks 	TokenNameCOMMENT_LINE	tracks the endpoints that we skipped over while looking for unique racks 
// when we relax the rack uniqueness we can append this to the current result so we don't have to wind back the iterator 	TokenNameCOMMENT_LINE	when we relax the rack uniqueness we can append this to the current result so we don't have to wind back the iterator 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
skippedDcEndpoints	TokenNameIdentifier	 skipped Dc Endpoints
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
dc	TokenNameIdentifier	 dc
:	TokenNameCOLON	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokenIter	TokenNameIdentifier	 token Iter
=	TokenNameEQUAL	
TokenMetadata	TokenNameIdentifier	 Token Metadata
.	TokenNameDOT	
ringIterator	TokenNameIdentifier	 ring Iterator
(	TokenNameLPAREN	
tokenMetadata	TokenNameIdentifier	 token Metadata
.	TokenNameDOT	
sortedTokens	TokenNameIdentifier	 sorted Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
searchToken	TokenNameIdentifier	 search Token
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenIter	TokenNameIdentifier	 token Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasSufficientReplicas	TokenNameIdentifier	 has Sufficient Replicas
(	TokenNameLPAREN	
dcReplicas	TokenNameIdentifier	 dc Replicas
,	TokenNameCOMMA	
allEndpoints	TokenNameIdentifier	 all Endpoints
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
tokenIter	TokenNameIdentifier	 token Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
tokenMetadata	TokenNameIdentifier	 token Metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
=	TokenNameEQUAL	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// have we already found all replicas for this dc? 	TokenNameCOMMENT_LINE	have we already found all replicas for this dc? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
||	TokenNameOR_OR	
hasSufficientReplicas	TokenNameIdentifier	 has Sufficient Replicas
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
dcReplicas	TokenNameIdentifier	 dc Replicas
,	TokenNameCOMMA	
allEndpoints	TokenNameIdentifier	 all Endpoints
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// can we skip checking the rack? 	TokenNameCOMMENT_LINE	can we skip checking the rack? 
if	TokenNameif	
(	TokenNameLPAREN	
seenRacks	TokenNameIdentifier	 seen Racks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
racks	TokenNameIdentifier	 racks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dcReplicas	TokenNameIdentifier	 dc Replicas
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicas	TokenNameIdentifier	 replicas
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rack	TokenNameIdentifier	 rack
=	TokenNameEQUAL	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is this a new rack? 	TokenNameCOMMENT_LINE	is this a new rack? 
if	TokenNameif	
(	TokenNameLPAREN	
seenRacks	TokenNameIdentifier	 seen Racks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
rack	TokenNameIdentifier	 rack
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skippedDcEndpoints	TokenNameIdentifier	 skipped Dc Endpoints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dcReplicas	TokenNameIdentifier	 dc Replicas
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicas	TokenNameIdentifier	 replicas
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seenRacks	TokenNameIdentifier	 seen Racks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rack	TokenNameIdentifier	 rack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if we've run out of distinct racks, add the hosts we skipped past already (up to RF) 	TokenNameCOMMENT_LINE	if we've run out of distinct racks, add the hosts we skipped past already (up to RF) 
if	TokenNameif	
(	TokenNameLPAREN	
seenRacks	TokenNameIdentifier	 seen Racks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
racks	TokenNameIdentifier	 racks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
skippedIt	TokenNameIdentifier	 skipped It
=	TokenNameEQUAL	
skippedDcEndpoints	TokenNameIdentifier	 skipped Dc Endpoints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
skippedIt	TokenNameIdentifier	 skipped It
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasSufficientReplicas	TokenNameIdentifier	 has Sufficient Replicas
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
dcReplicas	TokenNameIdentifier	 dc Replicas
,	TokenNameCOMMA	
allEndpoints	TokenNameIdentifier	 all Endpoints
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
nextSkipped	TokenNameIdentifier	 next Skipped
=	TokenNameEQUAL	
skippedIt	TokenNameIdentifier	 skipped It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dcReplicas	TokenNameIdentifier	 dc Replicas
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nextSkipped	TokenNameIdentifier	 next Skipped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicas	TokenNameIdentifier	 replicas
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nextSkipped	TokenNameIdentifier	 next Skipped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
replicas	TokenNameIdentifier	 replicas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasSufficientReplicas	TokenNameIdentifier	 has Sufficient Replicas
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
dcReplicas	TokenNameIdentifier	 dc Replicas
,	TokenNameCOMMA	
Multimap	TokenNameIdentifier	 Multimap
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
allEndpoints	TokenNameIdentifier	 all Endpoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dcReplicas	TokenNameIdentifier	 dc Replicas
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
allEndpoints	TokenNameIdentifier	 all Endpoints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasSufficientReplicas	TokenNameIdentifier	 has Sufficient Replicas
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
dcReplicas	TokenNameIdentifier	 dc Replicas
,	TokenNameCOMMA	
Multimap	TokenNameIdentifier	 Multimap
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
allEndpoints	TokenNameIdentifier	 all Endpoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
:	TokenNameCOLON	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasSufficientReplicas	TokenNameIdentifier	 has Sufficient Replicas
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
dcReplicas	TokenNameIdentifier	 dc Replicas
,	TokenNameCOMMA	
allEndpoints	TokenNameIdentifier	 all Endpoints
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
repFactor	TokenNameIdentifier	 rep Factor
:	TokenNameCOLON	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
repFactor	TokenNameIdentifier	 rep Factor
;	TokenNameSEMICOLON	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
replicas	TokenNameIdentifier	 replicas
=	TokenNameEQUAL	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
replicas	TokenNameIdentifier	 replicas
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
replicas	TokenNameIdentifier	 replicas
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getDatacenters	TokenNameIdentifier	 get Datacenters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
datacenters	TokenNameIdentifier	 datacenters
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateOptions	TokenNameIdentifier	 validate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
configOptions	TokenNameIdentifier	 config Options
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateReplicationFactor	TokenNameIdentifier	 validate Replication Factor
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
