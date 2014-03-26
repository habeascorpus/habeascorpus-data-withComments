/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Code to do proxy setup. This is just factored out of the main system just to * keep everything else less convoluted. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Code to do proxy setup. This is just factored out of the main system just to keep everything else less convoluted. @since Ant1.7 
public	TokenNamepublic	
class	TokenNameclass	
ProxySetup	TokenNameIdentifier	 Proxy Setup
{	TokenNameLBRACE	
/** * owner project; used for logging and extracting properties */	TokenNameCOMMENT_JAVADOC	 owner project; used for logging and extracting properties 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
/** * Java1.5 property that enables use of system proxies. * @value */	TokenNameCOMMENT_JAVADOC	 Java1.5 property that enables use of system proxies. @value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USE_SYSTEM_PROXIES	TokenNameIdentifier	 USE  SYSTEM  PROXIES
=	TokenNameEQUAL	
"java.net.useSystemProxies"	TokenNameStringLiteral	java.net.useSystemProxies
;	TokenNameSEMICOLON	
/** the http proxyhost property */	TokenNameCOMMENT_JAVADOC	 the http proxyhost property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_PROXY_HOST	TokenNameIdentifier	 HTTP  PROXY  HOST
=	TokenNameEQUAL	
"http.proxyHost"	TokenNameStringLiteral	http.proxyHost
;	TokenNameSEMICOLON	
/** the http proxyport property */	TokenNameCOMMENT_JAVADOC	 the http proxyport property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_PROXY_PORT	TokenNameIdentifier	 HTTP  PROXY  PORT
=	TokenNameEQUAL	
"http.proxyPort"	TokenNameStringLiteral	http.proxyPort
;	TokenNameSEMICOLON	
/** the https proxyhost property */	TokenNameCOMMENT_JAVADOC	 the https proxyhost property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTPS_PROXY_HOST	TokenNameIdentifier	 HTTPS  PROXY  HOST
=	TokenNameEQUAL	
"https.proxyHost"	TokenNameStringLiteral	https.proxyHost
;	TokenNameSEMICOLON	
/** the https proxyport property */	TokenNameCOMMENT_JAVADOC	 the https proxyport property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTPS_PROXY_PORT	TokenNameIdentifier	 HTTPS  PROXY  PORT
=	TokenNameEQUAL	
"https.proxyPort"	TokenNameStringLiteral	https.proxyPort
;	TokenNameSEMICOLON	
/** the ftp proxyhost property */	TokenNameCOMMENT_JAVADOC	 the ftp proxyhost property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FTP_PROXY_HOST	TokenNameIdentifier	 FTP  PROXY  HOST
=	TokenNameEQUAL	
"ftp.proxyHost"	TokenNameStringLiteral	ftp.proxyHost
;	TokenNameSEMICOLON	
/** the ftp proxyport property */	TokenNameCOMMENT_JAVADOC	 the ftp proxyport property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FTP_PROXY_PORT	TokenNameIdentifier	 FTP  PROXY  PORT
=	TokenNameEQUAL	
"ftp.proxyPort"	TokenNameStringLiteral	ftp.proxyPort
;	TokenNameSEMICOLON	
/** the ftp proxyport property */	TokenNameCOMMENT_JAVADOC	 the ftp proxyport property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_NON_PROXY_HOSTS	TokenNameIdentifier	 HTTP  NON  PROXY  HOSTS
=	TokenNameEQUAL	
"http.nonProxyHosts"	TokenNameStringLiteral	http.nonProxyHosts
;	TokenNameSEMICOLON	
/** the http hosts not to be proxied property */	TokenNameCOMMENT_JAVADOC	 the http hosts not to be proxied property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTPS_NON_PROXY_HOSTS	TokenNameIdentifier	 HTTPS  NON  PROXY  HOSTS
=	TokenNameEQUAL	
"https.nonProxyHosts"	TokenNameStringLiteral	https.nonProxyHosts
;	TokenNameSEMICOLON	
/** the ftp hosts not to be proxied property */	TokenNameCOMMENT_JAVADOC	 the ftp hosts not to be proxied property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FTP_NON_PROXY_HOSTS	TokenNameIdentifier	 FTP  NON  PROXY  HOSTS
=	TokenNameEQUAL	
"ftp.nonProxyHosts"	TokenNameStringLiteral	ftp.nonProxyHosts
;	TokenNameSEMICOLON	
/** the http proxy username property */	TokenNameCOMMENT_JAVADOC	 the http proxy username property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_PROXY_USERNAME	TokenNameIdentifier	 HTTP  PROXY  USERNAME
=	TokenNameEQUAL	
"http.proxyUser"	TokenNameStringLiteral	http.proxyUser
;	TokenNameSEMICOLON	
/** the http proxy password property */	TokenNameCOMMENT_JAVADOC	 the http proxy password property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_PROXY_PASSWORD	TokenNameIdentifier	 HTTP  PROXY  PASSWORD
=	TokenNameEQUAL	
"http.proxyPassword"	TokenNameStringLiteral	http.proxyPassword
;	TokenNameSEMICOLON	
/** the socks proxy host property */	TokenNameCOMMENT_JAVADOC	 the socks proxy host property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOCKS_PROXY_HOST	TokenNameIdentifier	 SOCKS  PROXY  HOST
=	TokenNameEQUAL	
"socksProxyHost"	TokenNameStringLiteral	socksProxyHost
;	TokenNameSEMICOLON	
/** the socks proxy port property */	TokenNameCOMMENT_JAVADOC	 the socks proxy port property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOCKS_PROXY_PORT	TokenNameIdentifier	 SOCKS  PROXY  PORT
=	TokenNameEQUAL	
"socksProxyPort"	TokenNameStringLiteral	socksProxyPort
;	TokenNameSEMICOLON	
/** the socks proxy username property */	TokenNameCOMMENT_JAVADOC	 the socks proxy username property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOCKS_PROXY_USERNAME	TokenNameIdentifier	 SOCKS  PROXY  USERNAME
=	TokenNameEQUAL	
"java.net.socks.username"	TokenNameStringLiteral	java.net.socks.username
;	TokenNameSEMICOLON	
/** the socks proxy password property */	TokenNameCOMMENT_JAVADOC	 the socks proxy password property 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SOCKS_PROXY_PASSWORD	TokenNameIdentifier	 SOCKS  PROXY  PASSWORD
=	TokenNameEQUAL	
"java.net.socks.password"	TokenNameStringLiteral	java.net.socks.password
;	TokenNameSEMICOLON	
/** * create a proxy setup class bound to this project * @param owner the project that owns this setup. */	TokenNameCOMMENT_JAVADOC	 create a proxy setup class bound to this project @param owner the project that owns this setup. 
public	TokenNamepublic	
ProxySetup	TokenNameIdentifier	 Proxy Setup
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current system property settings * @return current value; null for none or no access */	TokenNameCOMMENT_JAVADOC	 Get the current system property settings @return current value; null for none or no access 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSystemProxySetting	TokenNameIdentifier	 get System Proxy Setting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
USE_SYSTEM_PROXIES	TokenNameIdentifier	 USE  SYSTEM  PROXIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if you cannot read it, you won't be able to write it either 	TokenNameCOMMENT_LINE	if you cannot read it, you won't be able to write it either 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * turn proxies on; * if the proxy key is already set to some value: leave alone. * if an ant property of the value {@link #USE_SYSTEM_PROXIES} * is set, use that instead. Else set to "true". */	TokenNameCOMMENT_JAVADOC	 turn proxies on; if the proxy key is already set to some value: leave alone. if an ant property of the value {@link #USE_SYSTEM_PROXIES} is set, use that instead. Else set to "true". 
public	TokenNamepublic	
void	TokenNamevoid	
enableProxies	TokenNameIdentifier	 enable Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
getSystemProxySetting	TokenNameIdentifier	 get System Proxy Setting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
USE_SYSTEM_PROXIES	TokenNameIdentifier	 USE  SYSTEM  PROXIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxies	TokenNameIdentifier	 proxies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
proxies	TokenNameIdentifier	 proxies
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"setting "	TokenNameStringLiteral	setting 
+	TokenNamePLUS	
USE_SYSTEM_PROXIES	TokenNameIdentifier	 USE  SYSTEM  PROXIES
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
USE_SYSTEM_PROXIES	TokenNameIdentifier	 USE  SYSTEM  PROXIES
,	TokenNameCOMMA	
proxies	TokenNameIdentifier	 proxies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//log security exceptions and continue; it aint that 	TokenNameCOMMENT_LINE	log security exceptions and continue; it aint that 
//important and may be quite common running Ant embedded. 	TokenNameCOMMENT_LINE	important and may be quite common running Ant embedded. 
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Security Exception when "	TokenNameStringLiteral	Security Exception when 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
