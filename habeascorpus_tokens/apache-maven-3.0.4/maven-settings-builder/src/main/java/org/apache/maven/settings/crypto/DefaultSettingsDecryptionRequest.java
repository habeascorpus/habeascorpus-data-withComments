package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
crypto	TokenNameIdentifier	 crypto
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Proxy	TokenNameIdentifier	 Proxy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Server	TokenNameIdentifier	 Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Settings	TokenNameIdentifier	 Settings
;	TokenNameSEMICOLON	
/** * Collects parameters that control the decryption of settings. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects parameters that control the decryption of settings. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
implements	TokenNameimplements	
SettingsDecryptionRequest	TokenNameIdentifier	 Settings Decryption Request
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
/** * Creates an empty request. */	TokenNameCOMMENT_JAVADOC	 Creates an empty request. 
public	TokenNamepublic	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// does nothing 	TokenNameCOMMENT_LINE	does nothing 
}	TokenNameRBRACE	
/** * Creates a new request to decrypt the specified settings. * * @param settings The settings to decrypt, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new request to decrypt the specified settings. * @param settings The settings to decrypt, must not be {@code null}. 
public	TokenNamepublic	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
(	TokenNameLPAREN	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setServers	TokenNameIdentifier	 set Servers
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProxies	TokenNameIdentifier	 set Proxies
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new request to decrypt the specified server. * * @param server The server to decrypt, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new request to decrypt the specified server. * @param server The server to decrypt, must not be {@code null}. 
public	TokenNamepublic	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
(	TokenNameLPAREN	
Server	TokenNameIdentifier	 Server
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new request to decrypt the specified proxy. * * @param proxy The proxy to decrypt, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new request to decrypt the specified proxy. * @param proxy The proxy to decrypt, must not be {@code null}. 
public	TokenNamepublic	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
(	TokenNameLPAREN	
Proxy	TokenNameIdentifier	 Proxy
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
servers	TokenNameIdentifier	 servers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
setServers	TokenNameIdentifier	 set Servers
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
proxies	TokenNameIdentifier	 proxies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultSettingsDecryptionRequest	TokenNameIdentifier	 Default Settings Decryption Request
setProxies	TokenNameIdentifier	 set Proxies
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
