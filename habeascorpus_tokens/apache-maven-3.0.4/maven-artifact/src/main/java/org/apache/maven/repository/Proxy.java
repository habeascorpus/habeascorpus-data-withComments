package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
Proxy	TokenNameIdentifier	 Proxy
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROXY_SOCKS5	TokenNameIdentifier	 PROXY  SOCK S5
=	TokenNameEQUAL	
"SOCKS_5"	TokenNameStringLiteral	SOCKS_5
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROXY_SOCKS4	TokenNameIdentifier	 PROXY  SOCK S4
=	TokenNameEQUAL	
"SOCKS4"	TokenNameStringLiteral	SOCKS4
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROXY_HTTP	TokenNameIdentifier	 PROXY  HTTP
=	TokenNameEQUAL	
"HTTP"	TokenNameStringLiteral	HTTP
;	TokenNameSEMICOLON	
/** * Proxy server host */	TokenNameCOMMENT_JAVADOC	 Proxy server host 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
/** * Username used to access the proxy server */	TokenNameCOMMENT_JAVADOC	 Username used to access the proxy server 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
/** * Password associated with the proxy server */	TokenNameCOMMENT_JAVADOC	 Password associated with the proxy server 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
/** * Proxy server port */	TokenNameCOMMENT_JAVADOC	 Proxy server port 
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
/** * Type of the proxy */	TokenNameCOMMENT_JAVADOC	 Type of the proxy 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
/** * The non-proxy hosts. Follows Java system property format: <code>*.foo.com|localhost</code>. */	TokenNameCOMMENT_JAVADOC	 The non-proxy hosts. Follows Java system property format: <code>*.foo.com|localhost</code>. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
;	TokenNameSEMICOLON	
/** * For NTLM proxies, specifies the NTLM host. */	TokenNameCOMMENT_JAVADOC	 For NTLM proxies, specifies the NTLM host. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ntlmHost	TokenNameIdentifier	 ntlm Host
;	TokenNameSEMICOLON	
/** * For NTLM proxies, specifies the NTLM domain. */	TokenNameCOMMENT_JAVADOC	 For NTLM proxies, specifies the NTLM domain. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ntlmDomain	TokenNameIdentifier	 ntlm Domain
;	TokenNameSEMICOLON	
/** * Return proxy server host name. * * @return proxy server host name */	TokenNameCOMMENT_JAVADOC	 Return proxy server host name. * @return proxy server host name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set proxy host name. * * @param host proxy server host name */	TokenNameCOMMENT_JAVADOC	 Set proxy host name. * @param host proxy server host name 
public	TokenNamepublic	
void	TokenNamevoid	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get user's password used to login to proxy server. * * @return user's password at proxy host */	TokenNameCOMMENT_JAVADOC	 Get user's password used to login to proxy server. * @return user's password at proxy host 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user's password for the proxy server. * * @param password password to use to login to a proxy server */	TokenNameCOMMENT_JAVADOC	 Set the user's password for the proxy server. * @param password password to use to login to a proxy server 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the proxy port. * * @return proxy server port */	TokenNameCOMMENT_JAVADOC	 Get the proxy port. * @return proxy server port 
public	TokenNamepublic	
int	TokenNameint	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the proxy port. * * @param port proxy server port */	TokenNameCOMMENT_JAVADOC	 Set the proxy port. * @param port proxy server port 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the proxy username. * * @return username for the proxy server */	TokenNameCOMMENT_JAVADOC	 Get the proxy username. * @return username for the proxy server 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the proxy username. * * @param userName username for the proxy server */	TokenNameCOMMENT_JAVADOC	 Set the proxy username. * @param userName username for the proxy server 
public	TokenNamepublic	
void	TokenNamevoid	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type of the proxy server. * * @return the type of the proxy server */	TokenNameCOMMENT_JAVADOC	 Get the type of the proxy server. * @return the type of the proxy server 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param type the type of the proxy server like <i>SOCKSv4</i> */	TokenNameCOMMENT_JAVADOC	 @param type the type of the proxy server like <i>SOCKSv4</i> 
public	TokenNamepublic	
void	TokenNamevoid	
setProtocol	TokenNameIdentifier	 set Protocol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
protocol	TokenNameIdentifier	 protocol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNonProxyHosts	TokenNameIdentifier	 get Non Proxy Hosts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNonProxyHosts	TokenNameIdentifier	 set Non Proxy Hosts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
=	TokenNameEQUAL	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNtlmHost	TokenNameIdentifier	 get Ntlm Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ntlmHost	TokenNameIdentifier	 ntlm Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNtlmHost	TokenNameIdentifier	 set Ntlm Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ntlmHost	TokenNameIdentifier	 ntlm Host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ntlmHost	TokenNameIdentifier	 ntlm Host
=	TokenNameEQUAL	
ntlmHost	TokenNameIdentifier	 ntlm Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNtlmDomain	TokenNameIdentifier	 set Ntlm Domain
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ntlmDomain	TokenNameIdentifier	 ntlm Domain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ntlmDomain	TokenNameIdentifier	 ntlm Domain
=	TokenNameEQUAL	
ntlmDomain	TokenNameIdentifier	 ntlm Domain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNtlmDomain	TokenNameIdentifier	 get Ntlm Domain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ntlmDomain	TokenNameIdentifier	 ntlm Domain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
