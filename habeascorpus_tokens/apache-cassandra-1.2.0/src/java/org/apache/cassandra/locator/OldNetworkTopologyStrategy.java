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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
/** * This Replication Strategy returns the nodes responsible for a given * key but respects rack awareness. It places one replica in a * different data center from the first (if there is any such data center), * the third replica in a different rack in the first datacenter, and * any remaining replicas on the first unused nodes on the ring. */	TokenNameCOMMENT_JAVADOC	 This Replication Strategy returns the nodes responsible for a given key but respects rack awareness. It places one replica in a different data center from the first (if there is any such data center), the third replica in a different rack in the first datacenter, and any remaining replicas on the first unused nodes on the ring. 
public	TokenNamepublic	
class	TokenNameclass	
OldNetworkTopologyStrategy	TokenNameIdentifier	 Old Network Topology Strategy
extends	TokenNameextends	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
{	TokenNameLBRACE	
public	TokenNamepublic	
OldNetworkTopologyStrategy	TokenNameIdentifier	 Old Network Topology Strategy
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
int	TokenNameint	
replicas	TokenNameIdentifier	 replicas
=	TokenNameEQUAL	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
replicas	TokenNameIdentifier	 replicas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
sortedTokens	TokenNameIdentifier	 sorted Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
endpoints	TokenNameIdentifier	 endpoints
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
TokenMetadata	TokenNameIdentifier	 Token Metadata
.	TokenNameDOT	
ringIterator	TokenNameIdentifier	 ring Iterator
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
primaryToken	TokenNameIdentifier	 primary Token
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
primaryToken	TokenNameIdentifier	 primary Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
bDataCenter	TokenNameIdentifier	 b Data Center
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
bOtherRack	TokenNameIdentifier	 b Other Rack
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
replicas	TokenNameIdentifier	 replicas
&&	TokenNameAND_AND	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First try to find one in a different data center 	TokenNameCOMMENT_LINE	First try to find one in a different data center 
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
primaryToken	TokenNameIdentifier	 primary Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we have already found something in a diff datacenter no need to find another 	TokenNameCOMMENT_LINE	If we have already found something in a diff datacenter no need to find another 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bDataCenter	TokenNameIdentifier	 b Data Center
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bDataCenter	TokenNameIdentifier	 b Data Center
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now try to find one on a different rack 	TokenNameCOMMENT_LINE	Now try to find one on a different rack 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
primaryToken	TokenNameIdentifier	 primary Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
primaryToken	TokenNameIdentifier	 primary Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
snitch	TokenNameIdentifier	 snitch
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we have already found something in a diff rack no need to find another 	TokenNameCOMMENT_LINE	If we have already found something in a diff rack no need to find another 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bOtherRack	TokenNameIdentifier	 b Other Rack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bOtherRack	TokenNameIdentifier	 b Other Rack
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we found N number of nodes we are good. This loop wil just exit. Otherwise just 	TokenNameCOMMENT_LINE	If we found N number of nodes we are good. This loop wil just exit. Otherwise just 
// loop through the list and add until we have N nodes. 	TokenNameCOMMENT_LINE	loop through the list and add until we have N nodes. 
if	TokenNameif	
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
replicas	TokenNameIdentifier	 replicas
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
TokenMetadata	TokenNameIdentifier	 Token Metadata
.	TokenNameDOT	
ringIterator	TokenNameIdentifier	 ring Iterator
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
replicas	TokenNameIdentifier	 replicas
&&	TokenNameAND_AND	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
endpoints	TokenNameIdentifier	 endpoints
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getEndpoint	TokenNameIdentifier	 get Endpoint
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
endpoints	TokenNameIdentifier	 endpoints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
configOptions	TokenNameIdentifier	 config Options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"replication_factor"	TokenNameStringLiteral	replication_factor
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
configOptions	TokenNameIdentifier	 config Options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
configOptions	TokenNameIdentifier	 config Options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"replication_factor"	TokenNameStringLiteral	replication_factor
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"SimpleStrategy requires a replication_factor strategy option."	TokenNameStringLiteral	SimpleStrategy requires a replication_factor strategy option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
validateReplicationFactor	TokenNameIdentifier	 validate Replication Factor
(	TokenNameLPAREN	
configOptions	TokenNameIdentifier	 config Options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"replication_factor"	TokenNameStringLiteral	replication_factor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
