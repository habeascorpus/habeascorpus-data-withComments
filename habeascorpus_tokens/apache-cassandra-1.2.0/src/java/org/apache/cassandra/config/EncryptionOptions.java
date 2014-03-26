/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
keystore	TokenNameIdentifier	 keystore
=	TokenNameEQUAL	
"conf/.keystore"	TokenNameStringLiteral	conf/.keystore
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
keystore_password	TokenNameIdentifier	 keystore password
=	TokenNameEQUAL	
"cassandra"	TokenNameStringLiteral	cassandra
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
truststore	TokenNameIdentifier	 truststore
=	TokenNameEQUAL	
"conf/.truststore"	TokenNameStringLiteral	conf/.truststore
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
truststore_password	TokenNameIdentifier	 truststore password
=	TokenNameEQUAL	
"cassandra"	TokenNameStringLiteral	cassandra
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cipher_suites	TokenNameIdentifier	 cipher suites
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"TLS_RSA_WITH_AES_128_CBC_SHA"	TokenNameStringLiteral	TLS_RSA_WITH_AES_128_CBC_SHA
,	TokenNameCOMMA	
"TLS_RSA_WITH_AES_256_CBC_SHA"	TokenNameStringLiteral	TLS_RSA_WITH_AES_256_CBC_SHA
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
"TLS"	TokenNameStringLiteral	TLS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
algorithm	TokenNameIdentifier	 algorithm
=	TokenNameEQUAL	
"SunX509"	TokenNameStringLiteral	SunX509
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
store_type	TokenNameIdentifier	 store type
=	TokenNameEQUAL	
"JKS"	TokenNameStringLiteral	JKS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ClientEncryptionOptions	TokenNameIdentifier	 Client Encryption Options
extends	TokenNameextends	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ServerEncryptionOptions	TokenNameIdentifier	 Server Encryption Options
extends	TokenNameextends	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
InternodeEncryption	TokenNameIdentifier	 Internode Encryption
{	TokenNameLBRACE	
all	TokenNameIdentifier	 all
,	TokenNameCOMMA	
none	TokenNameIdentifier	 none
,	TokenNameCOMMA	
dc	TokenNameIdentifier	 dc
,	TokenNameCOMMA	
rack	TokenNameIdentifier	 rack
}	TokenNameRBRACE	
public	TokenNamepublic	
InternodeEncryption	TokenNameIdentifier	 Internode Encryption
internode_encryption	TokenNameIdentifier	 internode encryption
=	TokenNameEQUAL	
InternodeEncryption	TokenNameIdentifier	 Internode Encryption
.	TokenNameDOT	
none	TokenNameIdentifier	 none
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
