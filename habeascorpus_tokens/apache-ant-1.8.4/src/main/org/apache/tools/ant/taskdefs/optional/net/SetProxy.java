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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Authenticator	TokenNameIdentifier	 Authenticator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
PasswordAuthentication	TokenNameIdentifier	 Password Authentication
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
BuildException	TokenNameIdentifier	 Build Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ProxySetup	TokenNameIdentifier	 Proxy Setup
;	TokenNameSEMICOLON	
/** * Sets Java's web proxy properties, so that tasks and code run in * the same JVM can have through-the-firewall access to remote web sites, * and remote ftp sites. * You can nominate an http and ftp proxy, or a socks server, reset the server * settings, or do nothing at all. * <p> * Examples * <pre>&lt;setproxy/&gt;</pre> * do nothing * <pre>&lt;setproxy proxyhost="firewall"/&gt;</pre> * set the proxy to firewall:80 * <pre>&lt;setproxy proxyhost="firewall" proxyport="81"/&gt;</pre> * set the proxy to firewall:81 * <pre>&lt;setproxy proxyhost=""/&gt;</pre> * stop using the http proxy; don't change the socks settings * <pre>&lt;setproxy socksproxyhost="socksy"/&gt;</pre> * use socks via socksy:1080 * <pre>&lt;setproxy socksproxyhost=""/&gt;</pre> * stop using the socks server. * <p> * You can set a username and password for http with the <tt>proxyHost</tt> * and <tt>proxyPassword</tt> attributes. These can also be * used against SOCKS5 servers. * </p> * @see <a href="http://java.sun.com/j2se/1.5.0/docs/guide/net/properties.html"> * java 1.5 network property list</a> *@since Ant 1.5 * @ant.task category="network" */	TokenNameCOMMENT_JAVADOC	 Sets Java's web proxy properties, so that tasks and code run in the same JVM can have through-the-firewall access to remote web sites, and remote ftp sites. You can nominate an http and ftp proxy, or a socks server, reset the server settings, or do nothing at all. <p> Examples <pre>&lt;setproxy/&gt;</pre> do nothing <pre>&lt;setproxy proxyhost="firewall"/&gt;</pre> set the proxy to firewall:80 <pre>&lt;setproxy proxyhost="firewall" proxyport="81"/&gt;</pre> set the proxy to firewall:81 <pre>&lt;setproxy proxyhost=""/&gt;</pre> stop using the http proxy; don't change the socks settings <pre>&lt;setproxy socksproxyhost="socksy"/&gt;</pre> use socks via socksy:1080 <pre>&lt;setproxy socksproxyhost=""/&gt;</pre> stop using the socks server. <p> You can set a username and password for http with the <tt>proxyHost</tt> and <tt>proxyPassword</tt> attributes. These can also be used against SOCKS5 servers. </p> @see <a href="http://java.sun.com/j2se/1.5.0/docs/guide/net/properties.html"> java 1.5 network property list</a> *@since Ant 1.5 @ant.task category="network" 
public	TokenNamepublic	
class	TokenNameclass	
SetProxy	TokenNameIdentifier	 Set Proxy
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HTTP_PORT	TokenNameIdentifier	 HTTP  PORT
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SOCKS_PORT	TokenNameIdentifier	 SOCKS  PORT
=	TokenNameEQUAL	
1080	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * proxy details */	TokenNameCOMMENT_JAVADOC	 proxy details 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
proxyHost	TokenNameIdentifier	 proxy Host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * name of proxy port */	TokenNameCOMMENT_JAVADOC	 name of proxy port 
protected	TokenNameprotected	
int	TokenNameint	
proxyPort	TokenNameIdentifier	 proxy Port
=	TokenNameEQUAL	
HTTP_PORT	TokenNameIdentifier	 HTTP  PORT
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * socks host. */	TokenNameCOMMENT_JAVADOC	 socks host. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
socksProxyHost	TokenNameIdentifier	 socks Proxy Host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Socks proxy port. Default is 1080. */	TokenNameCOMMENT_JAVADOC	 Socks proxy port. Default is 1080. 
private	TokenNameprivate	
int	TokenNameint	
socksProxyPort	TokenNameIdentifier	 socks Proxy Port
=	TokenNameEQUAL	
SOCKS_PORT	TokenNameIdentifier	 SOCKS  PORT
;	TokenNameSEMICOLON	
/** * list of non proxy hosts */	TokenNameCOMMENT_JAVADOC	 list of non proxy hosts 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * user for http only */	TokenNameCOMMENT_JAVADOC	 user for http only 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
proxyUser	TokenNameIdentifier	 proxy User
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * password for http only */	TokenNameCOMMENT_JAVADOC	 password for http only 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
proxyPassword	TokenNameIdentifier	 proxy Password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * the HTTP/ftp proxy host. Set this to "" for the http proxy * option to be disabled * * @param hostname the new proxy hostname */	TokenNameCOMMENT_JAVADOC	 the HTTP/ftp proxy host. Set this to "" for the http proxy option to be disabled * @param hostname the new proxy hostname 
public	TokenNamepublic	
void	TokenNamevoid	
setProxyHost	TokenNameIdentifier	 set Proxy Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hostname	TokenNameIdentifier	 hostname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxyHost	TokenNameIdentifier	 proxy Host
=	TokenNameEQUAL	
hostname	TokenNameIdentifier	 hostname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the HTTP/ftp proxy port number; default is 80 * * @param port port number of the proxy */	TokenNameCOMMENT_JAVADOC	 the HTTP/ftp proxy port number; default is 80 * @param port port number of the proxy 
public	TokenNamepublic	
void	TokenNamevoid	
setProxyPort	TokenNameIdentifier	 set Proxy Port
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxyPort	TokenNameIdentifier	 proxy Port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of a Socks server. Set to "" to turn socks * proxying off. * * @param host The new SocksProxyHost value */	TokenNameCOMMENT_JAVADOC	 The name of a Socks server. Set to "" to turn socks proxying off. * @param host The new SocksProxyHost value 
public	TokenNamepublic	
void	TokenNamevoid	
setSocksProxyHost	TokenNameIdentifier	 set Socks Proxy Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
socksProxyHost	TokenNameIdentifier	 socks Proxy Host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the ProxyPort for socks connections. The default value is 1080 * * @param port The new SocksProxyPort value */	TokenNameCOMMENT_JAVADOC	 Set the ProxyPort for socks connections. The default value is 1080 * @param port The new SocksProxyPort value 
public	TokenNamepublic	
void	TokenNamevoid	
setSocksProxyPort	TokenNameIdentifier	 set Socks Proxy Port
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
socksProxyPort	TokenNameIdentifier	 socks Proxy Port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A list of hosts to bypass the proxy on. These should be separated * with the vertical bar character '|'. Only in Java 1.4 does ftp use * this list. * e.g. fozbot.corp.sun.com|*.eng.sun.com * @param nonProxyHosts lists of hosts to talk direct to */	TokenNameCOMMENT_JAVADOC	 A list of hosts to bypass the proxy on. These should be separated with the vertical bar character '|'. Only in Java 1.4 does ftp use this list. e.g. fozbot.corp.sun.com|*.eng.sun.com @param nonProxyHosts lists of hosts to talk direct to 
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
/** * set the proxy user. Probably requires a password to accompany this * setting. Default="" * @param proxyUser username * @since Ant1.6 */	TokenNameCOMMENT_JAVADOC	 set the proxy user. Probably requires a password to accompany this setting. Default="" @param proxyUser username @since Ant1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setProxyUser	TokenNameIdentifier	 set Proxy User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
proxyUser	TokenNameIdentifier	 proxy User
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxyUser	TokenNameIdentifier	 proxy User
=	TokenNameEQUAL	
proxyUser	TokenNameIdentifier	 proxy User
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the password for the proxy. Used only if the proxyUser is set. * @param proxyPassword password to go with the username * @since Ant1.6 */	TokenNameCOMMENT_JAVADOC	 Set the password for the proxy. Used only if the proxyUser is set. @param proxyPassword password to go with the username @since Ant1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setProxyPassword	TokenNameIdentifier	 set Proxy Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
proxyPassword	TokenNameIdentifier	 proxy Password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxyPassword	TokenNameIdentifier	 proxy Password
=	TokenNameEQUAL	
proxyPassword	TokenNameIdentifier	 proxy Password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * if the proxy port and host settings are not null, then the settings * get applied these settings last beyond the life of the object and * apply to all network connections * Relevant docs: buglist #4183340 */	TokenNameCOMMENT_JAVADOC	 if the proxy port and host settings are not null, then the settings get applied these settings last beyond the life of the object and apply to all network connections Relevant docs: buglist #4183340 
public	TokenNamepublic	
void	TokenNamevoid	
applyWebProxySettings	TokenNameIdentifier	 apply Web Proxy Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
settingsChanged	TokenNameIdentifier	 settings Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
enablingProxy	TokenNameIdentifier	 enabling Proxy
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
sysprops	TokenNameIdentifier	 sysprops
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxyHost	TokenNameIdentifier	 proxy Host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
settingsChanged	TokenNameIdentifier	 settings Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxyHost	TokenNameIdentifier	 proxy Host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
traceSettingInfo	TokenNameIdentifier	 trace Setting Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enablingProxy	TokenNameIdentifier	 enabling Proxy
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_HOST	TokenNameIdentifier	 HTTP  PROXY  HOST
,	TokenNameCOMMA	
proxyHost	TokenNameIdentifier	 proxy Host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
portString	TokenNameIdentifier	 port String
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
proxyPort	TokenNameIdentifier	 proxy Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_PORT	TokenNameIdentifier	 HTTP  PROXY  PORT
,	TokenNameCOMMA	
portString	TokenNameIdentifier	 port String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTPS_PROXY_HOST	TokenNameIdentifier	 HTTPS  PROXY  HOST
,	TokenNameCOMMA	
proxyHost	TokenNameIdentifier	 proxy Host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTPS_PROXY_PORT	TokenNameIdentifier	 HTTPS  PROXY  PORT
,	TokenNameCOMMA	
portString	TokenNameIdentifier	 port String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
FTP_PROXY_HOST	TokenNameIdentifier	 FTP  PROXY  HOST
,	TokenNameCOMMA	
proxyHost	TokenNameIdentifier	 proxy Host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
FTP_PROXY_PORT	TokenNameIdentifier	 FTP  PROXY  PORT
,	TokenNameCOMMA	
portString	TokenNameIdentifier	 port String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_NON_PROXY_HOSTS	TokenNameIdentifier	 HTTP  NON  PROXY  HOSTS
,	TokenNameCOMMA	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTPS_NON_PROXY_HOSTS	TokenNameIdentifier	 HTTPS  NON  PROXY  HOSTS
,	TokenNameCOMMA	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
FTP_NON_PROXY_HOSTS	TokenNameIdentifier	 FTP  NON  PROXY  HOSTS
,	TokenNameCOMMA	
nonProxyHosts	TokenNameIdentifier	 non Proxy Hosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
proxyUser	TokenNameIdentifier	 proxy User
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_USERNAME	TokenNameIdentifier	 HTTP  PROXY  USERNAME
,	TokenNameCOMMA	
proxyUser	TokenNameIdentifier	 proxy User
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_PASSWORD	TokenNameIdentifier	 HTTP  PROXY  PASSWORD
,	TokenNameCOMMA	
proxyPassword	TokenNameIdentifier	 proxy Password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"resetting http proxy"	TokenNameStringLiteral	resetting http proxy
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_HOST	TokenNameIdentifier	 HTTP  PROXY  HOST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_PORT	TokenNameIdentifier	 HTTP  PROXY  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_USERNAME	TokenNameIdentifier	 HTTP  PROXY  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTP_PROXY_PASSWORD	TokenNameIdentifier	 HTTP  PROXY  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTPS_PROXY_HOST	TokenNameIdentifier	 HTTPS  PROXY  HOST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
HTTPS_PROXY_PORT	TokenNameIdentifier	 HTTPS  PROXY  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
FTP_PROXY_HOST	TokenNameIdentifier	 FTP  PROXY  HOST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
FTP_PROXY_PORT	TokenNameIdentifier	 FTP  PROXY  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//socks 	TokenNameCOMMENT_LINE	socks 
if	TokenNameif	
(	TokenNameLPAREN	
socksProxyHost	TokenNameIdentifier	 socks Proxy Host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
settingsChanged	TokenNameIdentifier	 settings Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
socksProxyHost	TokenNameIdentifier	 socks Proxy Host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enablingProxy	TokenNameIdentifier	 enabling Proxy
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_HOST	TokenNameIdentifier	 SOCKS  PROXY  HOST
,	TokenNameCOMMA	
socksProxyHost	TokenNameIdentifier	 socks Proxy Host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_PORT	TokenNameIdentifier	 SOCKS  PROXY  PORT
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
socksProxyPort	TokenNameIdentifier	 socks Proxy Port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxyUser	TokenNameIdentifier	 proxy User
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this may be a java1.4 thingy only 	TokenNameCOMMENT_LINE	this may be a java1.4 thingy only 
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_USERNAME	TokenNameIdentifier	 SOCKS  PROXY  USERNAME
,	TokenNameCOMMA	
proxyUser	TokenNameIdentifier	 proxy User
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_PASSWORD	TokenNameIdentifier	 SOCKS  PROXY  PASSWORD
,	TokenNameCOMMA	
proxyPassword	TokenNameIdentifier	 proxy Password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"resetting socks proxy"	TokenNameStringLiteral	resetting socks proxy
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_HOST	TokenNameIdentifier	 SOCKS  PROXY  HOST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_PORT	TokenNameIdentifier	 SOCKS  PROXY  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_USERNAME	TokenNameIdentifier	 SOCKS  PROXY  USERNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysprops	TokenNameIdentifier	 sysprops
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ProxySetup	TokenNameIdentifier	 Proxy Setup
.	TokenNameDOT	
SOCKS_PROXY_PASSWORD	TokenNameIdentifier	 SOCKS  PROXY  PASSWORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
proxyUser	TokenNameIdentifier	 proxy User
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enablingProxy	TokenNameIdentifier	 enabling Proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Authenticator	TokenNameIdentifier	 Authenticator
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
new	TokenNamenew	
ProxyAuth	TokenNameIdentifier	 Proxy Auth
(	TokenNameLPAREN	
proxyUser	TokenNameIdentifier	 proxy User
,	TokenNameCOMMA	
proxyPassword	TokenNameIdentifier	 proxy Password
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
settingsChanged	TokenNameIdentifier	 settings Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Authenticator	TokenNameIdentifier	 Authenticator
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
new	TokenNamenew	
ProxyAuth	TokenNameIdentifier	 Proxy Auth
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * list out what is going on */	TokenNameCOMMENT_JAVADOC	 list out what is going on 
private	TokenNameprivate	
void	TokenNamevoid	
traceSettingInfo	TokenNameIdentifier	 trace Setting Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting proxy to "	TokenNameStringLiteral	Setting proxy to 
+	TokenNamePLUS	
(	TokenNameLPAREN	
proxyHost	TokenNameIdentifier	 proxy Host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
proxyHost	TokenNameIdentifier	 proxy Host
:	TokenNameCOLON	
"''"	TokenNameStringLiteral	''
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
proxyPort	TokenNameIdentifier	 proxy Port
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the work. * * @exception BuildException thrown in unrecoverable error. */	TokenNameCOMMENT_JAVADOC	 Does the work. * @exception BuildException thrown in unrecoverable error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
applyWebProxySettings	TokenNameIdentifier	 apply Web Proxy Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since 1.6.3 */	TokenNameCOMMENT_JAVADOC	 @since 1.6.3 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ProxyAuth	TokenNameIdentifier	 Proxy Auth
extends	TokenNameextends	
Authenticator	TokenNameIdentifier	 Authenticator
{	TokenNameLBRACE	
private	TokenNameprivate	
PasswordAuthentication	TokenNameIdentifier	 Password Authentication
auth	TokenNameIdentifier	 auth
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProxyAuth	TokenNameIdentifier	 Proxy Auth
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pass	TokenNameIdentifier	 pass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
auth	TokenNameIdentifier	 auth
=	TokenNameEQUAL	
new	TokenNamenew	
PasswordAuthentication	TokenNameIdentifier	 Password Authentication
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
pass	TokenNameIdentifier	 pass
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PasswordAuthentication	TokenNameIdentifier	 Password Authentication
getPasswordAuthentication	TokenNameIdentifier	 get Password Authentication
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
auth	TokenNameIdentifier	 auth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
