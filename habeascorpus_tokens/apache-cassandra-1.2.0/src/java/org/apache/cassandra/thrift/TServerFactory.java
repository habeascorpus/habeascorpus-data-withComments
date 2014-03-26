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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
TProtocolFactory	TokenNameIdentifier	 T Protocol Factory
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
TServerFactory	TokenNameIdentifier	 T Server Factory
{	TokenNameLBRACE	
TServer	TokenNameIdentifier	 T Server
buildTServer	TokenNameIdentifier	 build T Server
(	TokenNameLPAREN	
Args	TokenNameIdentifier	 Args
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Args	TokenNameIdentifier	 Args
{	TokenNameLBRACE	
public	TokenNamepublic	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
addr	TokenNameIdentifier	 addr
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CassandraServer	TokenNameIdentifier	 Cassandra Server
cassandraServer	TokenNameIdentifier	 cassandra Server
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Processor	TokenNameIdentifier	 Processor
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TProtocolFactory	TokenNameIdentifier	 T Protocol Factory
tProtocolFactory	TokenNameIdentifier	 t Protocol Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
inTransportFactory	TokenNameIdentifier	 in Transport Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
outTransportFactory	TokenNameIdentifier	 out Transport Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
sendBufferSize	TokenNameIdentifier	 send Buffer Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
recvBufferSize	TokenNameIdentifier	 recv Buffer Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
keepAlive	TokenNameIdentifier	 keep Alive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
