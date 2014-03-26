/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
stress	TokenNameIdentifier	 stress
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
FramedTransportFactory	TokenNameIdentifier	 Framed Transport Factory
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
TSSLTransportFactory	TokenNameIdentifier	 TSSL Transport Factory
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
TSSLTransportFactory	TokenNameIdentifier	 TSSL Transport Factory
.	TokenNameDOT	
TSSLTransportParameters	TokenNameIdentifier	 TSSL Transport Parameters
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
TTransport	TokenNameIdentifier	 T Transport
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
TTransportException	TokenNameIdentifier	 T Transport Exception
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
class	TokenNameclass	
SSLTransportFactory	TokenNameIdentifier	 SSL Transport Factory
extends	TokenNameextends	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
TTransport	TokenNameIdentifier	 T Transport
getTransport	TokenNameIdentifier	 get Transport
(	TokenNameLPAREN	
TTransport	TokenNameIdentifier	 T Transport
trans	TokenNameIdentifier	 trans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
Stress	TokenNameIdentifier	 Stress
.	TokenNameDOT	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hostName	TokenNameIdentifier	 host Name
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
Stress	TokenNameIdentifier	 Stress
.	TokenNameDOT	
randomizer	TokenNameIdentifier	 randomizer
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TSSLTransportParameters	TokenNameIdentifier	 TSSL Transport Parameters
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
TSSLTransportParameters	TokenNameIdentifier	 TSSL Transport Parameters
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
cipher_suites	TokenNameIdentifier	 cipher suites
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setTrustStore	TokenNameIdentifier	 set Trust Store
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
truststore	TokenNameIdentifier	 truststore
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
truststore_password	TokenNameIdentifier	 truststore password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trans	TokenNameIdentifier	 trans
=	TokenNameEQUAL	
TSSLTransportFactory	TokenNameIdentifier	 TSSL Transport Factory
.	TokenNameDOT	
getClientSocket	TokenNameIdentifier	 get Client Socket
(	TokenNameLPAREN	
hostName	TokenNameIdentifier	 host Name
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FramedTransportFactory	TokenNameIdentifier	 Framed Transport Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTransport	TokenNameIdentifier	 get Transport
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TTransportException	TokenNameIdentifier	 T Transport Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Failed to create a client SSL connection."	TokenNameStringLiteral	Failed to create a client SSL connection.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
