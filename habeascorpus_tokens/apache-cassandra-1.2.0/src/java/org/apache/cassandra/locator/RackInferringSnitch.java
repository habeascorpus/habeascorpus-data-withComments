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
/** * A simple endpoint snitch implementation that assumes datacenter and rack information is encoded * in the 2nd and 3rd octets of the ip address, respectively. */	TokenNameCOMMENT_JAVADOC	 A simple endpoint snitch implementation that assumes datacenter and rack information is encoded in the 2nd and 3rd octets of the ip address, respectively. 
public	TokenNamepublic	
class	TokenNameclass	
RackInferringSnitch	TokenNameIdentifier	 Rack Inferring Snitch
extends	TokenNameextends	
AbstractNetworkTopologySnitch	TokenNameIdentifier	 Abstract Network Topology Snitch
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
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
