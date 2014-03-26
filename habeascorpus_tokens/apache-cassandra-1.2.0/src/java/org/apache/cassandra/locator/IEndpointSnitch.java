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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * This interface helps determine location of node in the data center relative to another node. * Give a node A and another node B it can tell if A and B are on the same rack or in the same * data center. */	TokenNameCOMMENT_JAVADOC	 This interface helps determine location of node in the data center relative to another node. Give a node A and another node B it can tell if A and B are on the same rack or in the same data center. 
public	TokenNamepublic	
interface	TokenNameinterface	
IEndpointSnitch	TokenNameIdentifier	 I Endpoint Snitch
{	TokenNameLBRACE	
/** * returns a String repesenting the rack this endpoint belongs to */	TokenNameCOMMENT_JAVADOC	 returns a String repesenting the rack this endpoint belongs to 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * returns a String representing the datacenter this endpoint belongs to */	TokenNameCOMMENT_JAVADOC	 returns a String representing the datacenter this endpoint belongs to 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * returns a new <tt>List</tt> sorted by proximity to the given endpoint */	TokenNameCOMMENT_JAVADOC	 returns a new <tt>List</tt> sorted by proximity to the given endpoint 
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
;	TokenNameSEMICOLON	
/** * This method will sort the <tt>List</tt> by proximity to the given address. */	TokenNameCOMMENT_JAVADOC	 This method will sort the <tt>List</tt> by proximity to the given address. 
public	TokenNamepublic	
void	TokenNamevoid	
sortByProximity	TokenNameIdentifier	 sort By Proximity
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
addresses	TokenNameIdentifier	 addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * compares two endpoints in relation to the target endpoint, returning as Comparator.compare would */	TokenNameCOMMENT_JAVADOC	 compares two endpoints in relation to the target endpoint, returning as Comparator.compare would 
public	TokenNamepublic	
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
/** * called after Gossiper instance exists immediately before it starts gossiping */	TokenNameCOMMENT_JAVADOC	 called after Gossiper instance exists immediately before it starts gossiping 
public	TokenNamepublic	
void	TokenNamevoid	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
