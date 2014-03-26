/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
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
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
TServer	TokenNameIdentifier	 T Server
;	TokenNameSEMICOLON	
/** * Helper implementation to create a thrift TServer based on one of the common types we support (sync, async, hsha), * or a custom type by setting the fully qualified java class name in the rpc_server_type setting. */	TokenNameCOMMENT_JAVADOC	 Helper implementation to create a thrift TServer based on one of the common types we support (sync, async, hsha), or a custom type by setting the fully qualified java class name in the rpc_server_type setting. 
public	TokenNamepublic	
class	TokenNameclass	
TServerCustomFactory	TokenNameIdentifier	 T Server Custom Factory
implements	TokenNameimplements	
TServerFactory	TokenNameIdentifier	 T Server Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
TServerCustomFactory	TokenNameIdentifier	 T Server Custom Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
serverType	TokenNameIdentifier	 server Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TServerCustomFactory	TokenNameIdentifier	 T Server Custom Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
serverType	TokenNameIdentifier	 server Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
serverType	TokenNameIdentifier	 server Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
serverType	TokenNameIdentifier	 server Type
=	TokenNameEQUAL	
serverType	TokenNameIdentifier	 server Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TServer	TokenNameIdentifier	 T Server
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
TServerFactory	TokenNameIdentifier	 T Server Factory
.	TokenNameDOT	
Args	TokenNameIdentifier	 Args
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TServer	TokenNameIdentifier	 T Server
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ThriftServer	TokenNameIdentifier	 Thrift Server
.	TokenNameDOT	
SYNC	TokenNameIdentifier	 SYNC
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
serverType	TokenNameIdentifier	 server Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
CustomTThreadPoolServer	TokenNameIdentifier	 Custom T Thread Pool Server
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Using synchronous/threadpool thrift server on %s : %s"	TokenNameStringLiteral	Using synchronous/threadpool thrift server on %s : %s
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ThriftServer	TokenNameIdentifier	 Thrift Server
.	TokenNameDOT	
ASYNC	TokenNameIdentifier	 ASYNC
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
serverType	TokenNameIdentifier	 server Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
CustomTNonBlockingServer	TokenNameIdentifier	 Custom T Non Blocking Server
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Using non-blocking/asynchronous thrift server on %s : %s"	TokenNameStringLiteral	Using non-blocking/asynchronous thrift server on %s : %s
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ThriftServer	TokenNameIdentifier	 Thrift Server
.	TokenNameDOT	
HSHA	TokenNameIdentifier	 HSHA
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
serverType	TokenNameIdentifier	 server Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
CustomTHsHaServer	TokenNameIdentifier	 Custom T Hs Ha Server
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Using custom half-sync/half-async thrift server on %s : %s"	TokenNameStringLiteral	Using custom half-sync/half-async thrift server on %s : %s
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TServerFactory	TokenNameIdentifier	 T Server Factory
serverFactory	TokenNameIdentifier	 server Factory
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
serverFactory	TokenNameIdentifier	 server Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TServerFactory	TokenNameIdentifier	 T Server Factory
)	TokenNameRPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
serverType	TokenNameIdentifier	 server Type
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
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
"Failed to instantiate server factory:"	TokenNameStringLiteral	Failed to instantiate server factory:
+	TokenNamePLUS	
serverType	TokenNameIdentifier	 server Type
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
serverFactory	TokenNameIdentifier	 server Factory
.	TokenNameDOT	
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Using custom thrift server %s on %s : %s"	TokenNameStringLiteral	Using custom thrift server %s on %s : %s
,	TokenNameCOMMA	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
