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
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractEndpointSnitch	TokenNameIdentifier	 Abstract Endpoint Snitch
implements	TokenNameimplements	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
{	TokenNameLBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
compareEndpoints	TokenNameIdentifier	 compare Endpoints
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sorts the <tt>Collection</tt> of node addresses by proximity to the given address * @param address the address to sort by proximity to * @param unsortedAddress the nodes to sort * @return a new sorted <tt>List</tt> */	TokenNameCOMMENT_JAVADOC	 Sorts the <tt>Collection</tt> of node addresses by proximity to the given address @param address the address to sort by proximity to @param unsortedAddress the nodes to sort @return a new sorted <tt>List</tt> 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
getSortedListByProximity	TokenNameIdentifier	 get Sorted List By Proximity
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
unsortedAddress	TokenNameIdentifier	 unsorted Address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
preferred	TokenNameIdentifier	 preferred
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
unsortedAddress	TokenNameIdentifier	 unsorted Address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
preferred	TokenNameIdentifier	 preferred
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
preferred	TokenNameIdentifier	 preferred
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the <tt>List</tt> of node addresses, in-place, by proximity to the given address * @param address the address to sort the proximity by * @param addresses the nodes to sort */	TokenNameCOMMENT_JAVADOC	 Sorts the <tt>List</tt> of node addresses, in-place, by proximity to the given address @param address the address to sort the proximity by @param addresses the nodes to sort 
public	TokenNamepublic	
void	TokenNamevoid	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
addresses	TokenNameIdentifier	 addresses
,	TokenNameCOMMA	
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
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareEndpoints	TokenNameIdentifier	 compare Endpoints
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// noop by default 	TokenNameCOMMENT_LINE	noop by default 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
