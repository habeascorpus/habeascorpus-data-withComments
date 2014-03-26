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
condition	TokenNameIdentifier	 condition
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
ProjectComponent	TokenNameIdentifier	 Project Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
/** * Test for a host being reachable using ICMP "ping" packets & echo operations. * Ping packets are very reliable for assessing reachability in a LAN or WAN, * but they do not get through any well-configured firewall. Echo (port 7) may. * <p/> * This condition turns unknown host exceptions into false conditions. This is * because on a laptop, DNS is one of the first services lost when the network * goes; you are implicitly offline. * <p/> * If a URL is supplied instead of a host, the hostname is extracted and used in * the test--all other parts of the URL are discarded. * <p/> * The test may not work through firewalls; that is, something may be reachable * using a protocol such as HTTP, while the lower level ICMP packets get dropped * on the floor. Similarly, a host may be detected as reachable with ICMP, but not * reachable on other ports (i.e. port 80), because of firewalls. * <p/> * Requires Java 5+ to work properly. On Java 1.4, if a hostname * can be resolved, the destination is assumed to be reachable. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Test for a host being reachable using ICMP "ping" packets & echo operations. Ping packets are very reliable for assessing reachability in a LAN or WAN, but they do not get through any well-configured firewall. Echo (port 7) may. <p/> This condition turns unknown host exceptions into false conditions. This is because on a laptop, DNS is one of the first services lost when the network goes; you are implicitly offline. <p/> If a URL is supplied instead of a host, the hostname is extracted and used in the test--all other parts of the URL are discarded. <p/> The test may not work through firewalls; that is, something may be reachable using a protocol such as HTTP, while the lower level ICMP packets get dropped on the floor. Similarly, a host may be detected as reachable with ICMP, but not reachable on other ports (i.e. port 80), because of firewalls. <p/> Requires Java 5+ to work properly. On Java 1.4, if a hostname can be resolved, the destination is assumed to be reachable. * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
IsReachable	TokenNameIdentifier	 Is Reachable
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SECOND	TokenNameIdentifier	 SECOND
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// millis per second 	TokenNameCOMMENT_LINE	millis per second 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
/** * The default timeout. */	TokenNameCOMMENT_JAVADOC	 The default timeout. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_TIMEOUT	TokenNameIdentifier	 DEFAULT  TIMEOUT
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
DEFAULT_TIMEOUT	TokenNameIdentifier	 DEFAULT  TIMEOUT
;	TokenNameSEMICOLON	
/** * Error when no hostname is defined */	TokenNameCOMMENT_JAVADOC	 Error when no hostname is defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_HOSTNAME	TokenNameIdentifier	 ERROR  NO  HOSTNAME
=	TokenNameEQUAL	
"No hostname defined"	TokenNameStringLiteral	No hostname defined
;	TokenNameSEMICOLON	
/** * Error when invalid timeout value is defined */	TokenNameCOMMENT_JAVADOC	 Error when invalid timeout value is defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_BAD_TIMEOUT	TokenNameIdentifier	 ERROR  BAD  TIMEOUT
=	TokenNameEQUAL	
"Invalid timeout value"	TokenNameStringLiteral	Invalid timeout value
;	TokenNameSEMICOLON	
/** * Unknown host message is seen. */	TokenNameCOMMENT_JAVADOC	 Unknown host message is seen. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARN_UNKNOWN_HOST	TokenNameIdentifier	 WARN  UNKNOWN  HOST
=	TokenNameEQUAL	
"Unknown host: "	TokenNameStringLiteral	Unknown host: 
;	TokenNameSEMICOLON	
/** * Network error message is seen. */	TokenNameCOMMENT_JAVADOC	 Network error message is seen. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_ON_NETWORK	TokenNameIdentifier	 ERROR  ON  NETWORK
=	TokenNameEQUAL	
"network error to "	TokenNameStringLiteral	network error to 
;	TokenNameSEMICOLON	
/** Error message when url and host are specified. */	TokenNameCOMMENT_JAVADOC	 Error message when url and host are specified. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_BOTH_TARGETS	TokenNameIdentifier	 ERROR  BOTH  TARGETS
=	TokenNameEQUAL	
"Both url and host have been specified"	TokenNameStringLiteral	Both url and host have been specified
;	TokenNameSEMICOLON	
/** Error message when no reachably test avail. */	TokenNameCOMMENT_JAVADOC	 Error message when no reachably test avail. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MSG_NO_REACHABLE_TEST	TokenNameIdentifier	 MSG  NO  REACHABLE  TEST
=	TokenNameEQUAL	
"cannot do a proper reachability test on this Java version"	TokenNameStringLiteral	cannot do a proper reachability test on this Java version
;	TokenNameSEMICOLON	
/** Error message when an invalid url is used. */	TokenNameCOMMENT_JAVADOC	 Error message when an invalid url is used. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_BAD_URL	TokenNameIdentifier	 ERROR  BAD  URL
=	TokenNameEQUAL	
"Bad URL "	TokenNameStringLiteral	Bad URL 
;	TokenNameSEMICOLON	
/** Error message when no hostname in url. */	TokenNameCOMMENT_JAVADOC	 Error message when no hostname in url. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_HOST_IN_URL	TokenNameIdentifier	 ERROR  NO  HOST  IN  URL
=	TokenNameEQUAL	
"No hostname in URL "	TokenNameStringLiteral	No hostname in URL 
;	TokenNameSEMICOLON	
/** The method name to look for in InetAddress */	TokenNameCOMMENT_JAVADOC	 The method name to look for in InetAddress 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
METHOD_NAME	TokenNameIdentifier	 METHOD  NAME
=	TokenNameEQUAL	
"isReachable"	TokenNameStringLiteral	isReachable
;	TokenNameSEMICOLON	
/** * Set the host to ping. * * @param host the host to ping. */	TokenNameCOMMENT_JAVADOC	 Set the host to ping. * @param host the host to ping. 
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
/** * Set the URL from which to extract the hostname. * * @param url a URL object. */	TokenNameCOMMENT_JAVADOC	 Set the URL from which to extract the hostname. * @param url a URL object. 
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the timeout for the reachability test in seconds. * * @param timeout the timeout in seconds. */	TokenNameCOMMENT_JAVADOC	 Set the timeout for the reachability test in seconds. * @param timeout the timeout in seconds. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
int	TokenNameint	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * emptyness test * * @param string param to check * * @return true if it is empty */	TokenNameCOMMENT_JAVADOC	 emptyness test * @param string param to check * @return true if it is empty 
private	TokenNameprivate	
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
string	TokenNameIdentifier	 string
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameterTypes	TokenNameIdentifier	 parameter Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Evaluate the condition. * * @return true if the condition is true. * * @throws org.apache.tools.ant.BuildException * if an error occurs */	TokenNameCOMMENT_JAVADOC	 Evaluate the condition. * @return true if the condition is true. * @throws org.apache.tools.ant.BuildException if an error occurs 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_HOSTNAME	TokenNameIdentifier	 ERROR  NO  HOSTNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_BAD_TIMEOUT	TokenNameIdentifier	 ERROR  BAD  TIMEOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_BOTH_TARGETS	TokenNameIdentifier	 ERROR  BOTH  TARGETS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//get the host of a url 	TokenNameCOMMENT_LINE	get the host of a url 
URL	TokenNameIdentifier	 URL
realURL	TokenNameIdentifier	 real URL
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
realURL	TokenNameIdentifier	 real URL
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_HOST_IN_URL	TokenNameIdentifier	 ERROR  NO  HOST  IN  URL
+	TokenNamePLUS	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_BAD_URL	TokenNameIdentifier	 ERROR  BAD  URL
+	TokenNamePLUS	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Probing host "	TokenNameStringLiteral	Probing host 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InetAddress	TokenNameIdentifier	 Inet Address
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
WARN_UNKNOWN_HOST	TokenNameIdentifier	 WARN  UNKNOWN  HOST
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Host address = "	TokenNameStringLiteral	Host address = 
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reachable	TokenNameIdentifier	 reachable
;	TokenNameSEMICOLON	
//Java1.5: reachable = address.isReachable(timeout * 1000); 	TokenNameCOMMENT_LINE	Java1.5: reachable = address.isReachable(timeout * 1000); 
Method	TokenNameIdentifier	 Method
reachableMethod	TokenNameIdentifier	 reachable Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reachableMethod	TokenNameIdentifier	 reachable Method
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
METHOD_NAME	TokenNameIdentifier	 METHOD  NAME
,	TokenNameCOMMA	
parameterTypes	TokenNameIdentifier	 parameter Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
timeout	TokenNameIdentifier	 timeout
*	TokenNameMULTIPLY	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reachable	TokenNameIdentifier	 reachable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
reachableMethod	TokenNameIdentifier	 reachable Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//utterly implausible, but catered for anyway 	TokenNameCOMMENT_LINE	utterly implausible, but catered for anyway 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"When calling "	TokenNameStringLiteral	When calling 
+	TokenNamePLUS	
reachableMethod	TokenNameIdentifier	 reachable Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//assume this is an IOexception about un readability 	TokenNameCOMMENT_LINE	assume this is an IOexception about un readability 
Throwable	TokenNameIdentifier	 Throwable
nested	TokenNameIdentifier	 nested
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
ERROR_ON_NETWORK	TokenNameIdentifier	 ERROR  ON  NETWORK
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
nested	TokenNameIdentifier	 nested
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//any kind of fault: not reachable. 	TokenNameCOMMENT_LINE	any kind of fault: not reachable. 
reachable	TokenNameIdentifier	 reachable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//java1.4 	TokenNameCOMMENT_LINE	java1.4 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Not found: InetAddress."	TokenNameStringLiteral	Not found: InetAddress.
+	TokenNamePLUS	
METHOD_NAME	TokenNameIdentifier	 METHOD  NAME
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
MSG_NO_REACHABLE_TEST	TokenNameIdentifier	 MSG  NO  REACHABLE  TEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reachable	TokenNameIdentifier	 reachable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"host is"	TokenNameStringLiteral	host is
+	TokenNamePLUS	
(	TokenNameLPAREN	
reachable	TokenNameIdentifier	 reachable
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
" not"	TokenNameStringLiteral	 not
)	TokenNameRPAREN	
+	TokenNamePLUS	
" reachable"	TokenNameStringLiteral	 reachable
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reachable	TokenNameIdentifier	 reachable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
