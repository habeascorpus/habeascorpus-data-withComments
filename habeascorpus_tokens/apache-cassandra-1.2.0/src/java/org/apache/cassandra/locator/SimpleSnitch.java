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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * A simple endpoint snitch implementation that treats Strategy order as proximity, * allowing non-read-repaired reads to prefer a single endpoint, which improves * cache locality. */	TokenNameCOMMENT_JAVADOC	 A simple endpoint snitch implementation that treats Strategy order as proximity, allowing non-read-repaired reads to prefer a single endpoint, which improves cache locality. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleSnitch	TokenNameIdentifier	 Simple Snitch
extends	TokenNameextends	
AbstractEndpointSnitch	TokenNameIdentifier	 Abstract Endpoint Snitch
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"rack1"	TokenNameStringLiteral	rack1
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
return	TokenNamereturn	
"datacenter1"	TokenNameStringLiteral	datacenter1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
// Optimization to avoid walking the list 	TokenNameCOMMENT_LINE	Optimization to avoid walking the list 
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
// Making all endpoints equal ensures we won't change the original ordering (since 	TokenNameCOMMENT_LINE	Making all endpoints equal ensures we won't change the original ordering (since 
// Collections.sort is guaranteed to be stable) 	TokenNameCOMMENT_LINE	Collections.sort is guaranteed to be stable) 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
