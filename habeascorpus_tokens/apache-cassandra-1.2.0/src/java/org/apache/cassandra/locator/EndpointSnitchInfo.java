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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
EndpointSnitchInfo	TokenNameIdentifier	 Endpoint Snitch Info
implements	TokenNameimplements	
EndpointSnitchInfoMBean	TokenNameIdentifier	 Endpoint Snitch Info M Bean
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MBeanServer	TokenNameIdentifier	 M Bean Server
mbs	TokenNameIdentifier	 mbs
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mbs	TokenNameIdentifier	 mbs
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
new	TokenNamenew	
EndpointSnitchInfo	TokenNameIdentifier	 Endpoint Snitch Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
"org.apache.cassandra.db:type=EndpointSnitchInfo"	TokenNameStringLiteral	org.apache.cassandra.db:type=EndpointSnitchInfo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getEndpointSnitch	TokenNameIdentifier	 get Endpoint Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getEndpointSnitch	TokenNameIdentifier	 get Endpoint Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
