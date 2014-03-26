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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Inet4Address	TokenNameIdentifier	 Inet4 Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Inet6Address	TokenNameIdentifier	 Inet6 Address
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
NetworkInterface	TokenNameIdentifier	 Network Interface
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
/** * Sets properties to the host provided, or localhost if no information is * provided. The default properties are NAME, FQDN, ADDR4, ADDR6; * * @since Ant 1.8 * @ant.task category="utility" */	TokenNameCOMMENT_JAVADOC	 Sets properties to the host provided, or localhost if no information is provided. The default properties are NAME, FQDN, ADDR4, ADDR6; * @since Ant 1.8 @ant.task category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
HostInfo	TokenNameIdentifier	 Host Info
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEF_REM_ADDR6	TokenNameIdentifier	 DEF  REM  ADD R6
=	TokenNameEQUAL	
"::"	TokenNameStringLiteral	::
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEF_REM_ADDR4	TokenNameIdentifier	 DEF  REM  ADD R4
=	TokenNameEQUAL	
"0.0.0.0"	TokenNameStringLiteral	0.0.0.0
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEF_LOCAL_ADDR6	TokenNameIdentifier	 DEF  LOCAL  ADD R6
=	TokenNameEQUAL	
"::1"	TokenNameStringLiteral	::1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEF_LOCAL_ADDR4	TokenNameIdentifier	 DEF  LOCAL  ADD R4
=	TokenNameEQUAL	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEF_LOCAL_NAME	TokenNameIdentifier	 DEF  LOCAL  NAME
=	TokenNameEQUAL	
"localhost"	TokenNameStringLiteral	localhost
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEF_DOMAIN	TokenNameIdentifier	 DEF  DOMAIN
=	TokenNameEQUAL	
"localdomain"	TokenNameStringLiteral	localdomain
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOMAIN	TokenNameIdentifier	 DOMAIN
=	TokenNameEQUAL	
"DOMAIN"	TokenNameStringLiteral	DOMAIN
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
"NAME"	TokenNameStringLiteral	NAME
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADDR4	TokenNameIdentifier	 ADD R4
=	TokenNameEQUAL	
"ADDR4"	TokenNameStringLiteral	ADDR4
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADDR6	TokenNameIdentifier	 ADD R6
=	TokenNameEQUAL	
"ADDR6"	TokenNameStringLiteral	ADDR6
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
nameAddr	TokenNameIdentifier	 name Addr
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
best6	TokenNameIdentifier	 best6
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
best4	TokenNameIdentifier	 best4
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
inetAddrs	TokenNameIdentifier	 inet Addrs
;	TokenNameSEMICOLON	
/** * Set a prefix for the properties. If the prefix does not end with a "." * one is automatically added. * * @param aPrefix * the prefix to use. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Set a prefix for the properties. If the prefix does not end with a "." one is automatically added. * @param aPrefix the prefix to use. @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aPrefix	TokenNameIdentifier	 a Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
aPrefix	TokenNameIdentifier	 a Prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
+=	TokenNamePLUS_EQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the host to be retrieved. * * @param aHost * the name or the address of the host, data for the local host * will be retrieved if ommited. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Set the host to be retrieved. * @param aHost the name or the address of the host, data for the local host will be retrieved if ommited. @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aHost	TokenNameIdentifier	 a Host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
aHost	TokenNameIdentifier	 a Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the properties. * * @throws BuildException * on error. */	TokenNameCOMMENT_JAVADOC	 set the properties. * @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeLocal	TokenNameIdentifier	 execute Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
executeRemote	TokenNameIdentifier	 execute Remote
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
executeLocal	TokenNameIdentifier	 execute Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
interfaces	TokenNameIdentifier	 interfaces
=	TokenNameEQUAL	
NetworkInterface	TokenNameIdentifier	 Network Interface
.	TokenNameDOT	
getNetworkInterfaces	TokenNameIdentifier	 get Network Interfaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inetAddrs	TokenNameIdentifier	 inet Addrs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
interfaces	TokenNameIdentifier	 interfaces
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NetworkInterface	TokenNameIdentifier	 Network Interface
currentif	TokenNameIdentifier	 currentif
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NetworkInterface	TokenNameIdentifier	 Network Interface
)	TokenNameRPAREN	
interfaces	TokenNameIdentifier	 interfaces
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
addrs	TokenNameIdentifier	 addrs
=	TokenNameEQUAL	
currentif	TokenNameIdentifier	 currentif
.	TokenNameDOT	
getInetAddresses	TokenNameIdentifier	 get Inet Addresses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
addrs	TokenNameIdentifier	 addrs
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inetAddrs	TokenNameIdentifier	 inet Addrs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
addrs	TokenNameIdentifier	 addrs
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
selectAddresses	TokenNameIdentifier	 select Addresses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameAddr	TokenNameIdentifier	 name Addr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
hasHostName	TokenNameIdentifier	 has Host Name
(	TokenNameLPAREN	
nameAddr	TokenNameIdentifier	 name Addr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDomainAndName	TokenNameIdentifier	 set Domain And Name
(	TokenNameLPAREN	
nameAddr	TokenNameIdentifier	 name Addr
.	TokenNameDOT	
getCanonicalHostName	TokenNameIdentifier	 get Canonical Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
DOMAIN	TokenNameIdentifier	 DOMAIN
,	TokenNameCOMMA	
DEF_DOMAIN	TokenNameIdentifier	 DEF  DOMAIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
DEF_LOCAL_NAME	TokenNameIdentifier	 DEF  LOCAL  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
best4	TokenNameIdentifier	 best4
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR4	TokenNameIdentifier	 ADD R4
,	TokenNameCOMMA	
best4	TokenNameIdentifier	 best4
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR4	TokenNameIdentifier	 ADD R4
,	TokenNameCOMMA	
DEF_LOCAL_ADDR4	TokenNameIdentifier	 DEF  LOCAL  ADD R4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
best6	TokenNameIdentifier	 best6
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR6	TokenNameIdentifier	 ADD R6
,	TokenNameCOMMA	
best6	TokenNameIdentifier	 best6
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR6	TokenNameIdentifier	 ADD R6
,	TokenNameCOMMA	
DEF_LOCAL_ADDR6	TokenNameIdentifier	 DEF  LOCAL  ADD R6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Error retrieving local host information"	TokenNameStringLiteral	Error retrieving local host information
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
DOMAIN	TokenNameIdentifier	 DOMAIN
,	TokenNameCOMMA	
DEF_DOMAIN	TokenNameIdentifier	 DEF  DOMAIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
DEF_LOCAL_NAME	TokenNameIdentifier	 DEF  LOCAL  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR4	TokenNameIdentifier	 ADD R4
,	TokenNameCOMMA	
DEF_LOCAL_ADDR4	TokenNameIdentifier	 DEF  LOCAL  ADD R4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR6	TokenNameIdentifier	 ADD R6
,	TokenNameCOMMA	
DEF_LOCAL_ADDR6	TokenNameIdentifier	 DEF  LOCAL  ADD R6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasHostName	TokenNameIdentifier	 has Host Name
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
addr	TokenNameIdentifier	 addr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getCanonicalHostName	TokenNameIdentifier	 get Canonical Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
selectAddresses	TokenNameIdentifier	 select Addresses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
inetAddrs	TokenNameIdentifier	 inet Addrs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
isMulticastAddress	TokenNameIdentifier	 is Multicast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
instanceof	TokenNameinstanceof	
Inet4Address	TokenNameIdentifier	 Inet4 Address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
best4	TokenNameIdentifier	 best4
=	TokenNameEQUAL	
selectBestAddress	TokenNameIdentifier	 select Best Address
(	TokenNameLPAREN	
best4	TokenNameIdentifier	 best4
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
instanceof	TokenNameinstanceof	
Inet6Address	TokenNameIdentifier	 Inet6 Address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
best6	TokenNameIdentifier	 best6
=	TokenNameEQUAL	
selectBestAddress	TokenNameIdentifier	 select Best Address
(	TokenNameLPAREN	
best6	TokenNameIdentifier	 best6
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nameAddr	TokenNameIdentifier	 name Addr
=	TokenNameEQUAL	
selectBestAddress	TokenNameIdentifier	 select Best Address
(	TokenNameLPAREN	
best4	TokenNameIdentifier	 best4
,	TokenNameCOMMA	
best6	TokenNameIdentifier	 best6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
InetAddress	TokenNameIdentifier	 Inet Address
selectBestAddress	TokenNameIdentifier	 select Best Address
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
bestSoFar	TokenNameIdentifier	 best So Far
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
bestSoFar	TokenNameIdentifier	 best So Far
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// none selected so far, so this one is better. 	TokenNameCOMMENT_LINE	none selected so far, so this one is better. 
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
isLoopbackAddress	TokenNameIdentifier	 is Loopback Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// definitely not better than the previously selected address. 	TokenNameCOMMENT_LINE	definitely not better than the previously selected address. 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
isLinkLocalAddress	TokenNameIdentifier	 is Link Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// link local considered better than loopback 	TokenNameCOMMENT_LINE	link local considered better than loopback 
if	TokenNameif	
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isLoopbackAddress	TokenNameIdentifier	 is Loopback Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
isSiteLocalAddress	TokenNameIdentifier	 is Site Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// site local considered better than link local (and loopback) 	TokenNameCOMMENT_LINE	site local considered better than link local (and loopback) 
// address with hostname resolved considered better than 	TokenNameCOMMENT_LINE	address with hostname resolved considered better than 
// address without hostname 	TokenNameCOMMENT_LINE	address without hostname 
if	TokenNameif	
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isLoopbackAddress	TokenNameIdentifier	 is Loopback Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isLinkLocalAddress	TokenNameIdentifier	 is Link Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isSiteLocalAddress	TokenNameIdentifier	 is Site Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasHostName	TokenNameIdentifier	 has Host Name
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// current is a "Global address", considered better than 	TokenNameCOMMENT_LINE	current is a "Global address", considered better than 
// site local (and better than link local, loopback) 	TokenNameCOMMENT_LINE	site local (and better than link local, loopback) 
// address with hostname resolved considered better than 	TokenNameCOMMENT_LINE	address with hostname resolved considered better than 
// address without hostname 	TokenNameCOMMENT_LINE	address without hostname 
if	TokenNameif	
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isLoopbackAddress	TokenNameIdentifier	 is Loopback Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isLinkLocalAddress	TokenNameIdentifier	 is Link Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
best	TokenNameIdentifier	 best
.	TokenNameDOT	
isSiteLocalAddress	TokenNameIdentifier	 is Site Local Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
hasHostName	TokenNameIdentifier	 has Host Name
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
best	TokenNameIdentifier	 best
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
executeRemote	TokenNameIdentifier	 execute Remote
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
inetAddrs	TokenNameIdentifier	 inet Addrs
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getAllByName	TokenNameIdentifier	 get All By Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectAddresses	TokenNameIdentifier	 select Addresses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameAddr	TokenNameIdentifier	 name Addr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
hasHostName	TokenNameIdentifier	 has Host Name
(	TokenNameLPAREN	
nameAddr	TokenNameIdentifier	 name Addr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDomainAndName	TokenNameIdentifier	 set Domain And Name
(	TokenNameLPAREN	
nameAddr	TokenNameIdentifier	 name Addr
.	TokenNameDOT	
getCanonicalHostName	TokenNameIdentifier	 get Canonical Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setDomainAndName	TokenNameIdentifier	 set Domain And Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
best4	TokenNameIdentifier	 best4
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR4	TokenNameIdentifier	 ADD R4
,	TokenNameCOMMA	
best4	TokenNameIdentifier	 best4
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR4	TokenNameIdentifier	 ADD R4
,	TokenNameCOMMA	
DEF_REM_ADDR4	TokenNameIdentifier	 DEF  REM  ADD R4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
best6	TokenNameIdentifier	 best6
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR6	TokenNameIdentifier	 ADD R6
,	TokenNameCOMMA	
best6	TokenNameIdentifier	 best6
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR6	TokenNameIdentifier	 ADD R6
,	TokenNameCOMMA	
DEF_REM_ADDR6	TokenNameIdentifier	 DEF  REM  ADD R6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Error retrieving remote host information for host:"	TokenNameStringLiteral	Error retrieving remote host information for host:
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDomainAndName	TokenNameIdentifier	 set Domain And Name
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR4	TokenNameIdentifier	 ADD R4
,	TokenNameCOMMA	
DEF_REM_ADDR4	TokenNameIdentifier	 DEF  REM  ADD R4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ADDR6	TokenNameIdentifier	 ADD R6
,	TokenNameCOMMA	
DEF_REM_ADDR6	TokenNameIdentifier	 DEF  REM  ADD R6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setDomainAndName	TokenNameIdentifier	 set Domain And Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fqdn	TokenNameIdentifier	 fqdn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
fqdn	TokenNameIdentifier	 fqdn
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
fqdn	TokenNameIdentifier	 fqdn
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
DOMAIN	TokenNameIdentifier	 DOMAIN
,	TokenNameCOMMA	
fqdn	TokenNameIdentifier	 fqdn
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
fqdn	TokenNameIdentifier	 fqdn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
DOMAIN	TokenNameIdentifier	 DOMAIN
,	TokenNameCOMMA	
DEF_DOMAIN	TokenNameIdentifier	 DEF  DOMAIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
