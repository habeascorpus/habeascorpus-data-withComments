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
.	TokenNameDOT	
java15	TokenNameIdentifier	 java15
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ProxySelector	TokenNameIdentifier	 Proxy Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URISyntaxException	TokenNameIdentifier	 URI Syntax Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Proxy	TokenNameIdentifier	 Proxy
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketAddress	TokenNameIdentifier	 Socket Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * This class exists to create a string that tells diagnostics about the current * state of proxy diagnostics. * It does this in its toString operator. * Java1.5+ is needed to compile this class; its interface is classic typeless * Java. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 This class exists to create a string that tells diagnostics about the current state of proxy diagnostics. It does this in its toString operator. Java1.5+ is needed to compile this class; its interface is classic typeless Java. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
ProxyDiagnostics	TokenNameIdentifier	 Proxy Diagnostics
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
destination	TokenNameIdentifier	 destination
;	TokenNameSEMICOLON	
private	TokenNameprivate	
URI	TokenNameIdentifier	 URI
destURI	TokenNameIdentifier	 dest URI
;	TokenNameSEMICOLON	
/** {@value} */	TokenNameCOMMENT_JAVADOC	 {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_DESTINATION	TokenNameIdentifier	 DEFAULT  DESTINATION
=	TokenNameEQUAL	
"http://ant.apache.org/"	TokenNameStringLiteral	http://ant.apache.org/
;	TokenNameSEMICOLON	
/** * create a diagnostics binding for a specific URI * @param destination dest to bind to * @throws BuildException if the URI is malformed. */	TokenNameCOMMENT_JAVADOC	 create a diagnostics binding for a specific URI @param destination dest to bind to @throws BuildException if the URI is malformed. 
public	TokenNamepublic	
ProxyDiagnostics	TokenNameIdentifier	 Proxy Diagnostics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
destination	TokenNameIdentifier	 destination
=	TokenNameEQUAL	
destination	TokenNameIdentifier	 destination
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
destURI	TokenNameIdentifier	 dest URI
=	TokenNameEQUAL	
new	TokenNamenew	
URI	TokenNameIdentifier	 URI
(	TokenNameLPAREN	
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
URISyntaxException	TokenNameIdentifier	 URI Syntax Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * create a proxy diagnostics tool bound to * {@link #DEFAULT_DESTINATION} */	TokenNameCOMMENT_JAVADOC	 create a proxy diagnostics tool bound to {@link #DEFAULT_DESTINATION} 
public	TokenNamepublic	
ProxyDiagnostics	TokenNameIdentifier	 Proxy Diagnostics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_DESTINATION	TokenNameIdentifier	 DEFAULT  DESTINATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the diagnostics for proxy information. * @return the information. */	TokenNameCOMMENT_JAVADOC	 Get the diagnostics for proxy information. @return the information. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProxySelector	TokenNameIdentifier	 Proxy Selector
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
ProxySelector	TokenNameIdentifier	 Proxy Selector
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
.	TokenNameDOT	
select	TokenNameIdentifier	 select
(	TokenNameLPAREN	
destURI	TokenNameIdentifier	 dest URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Proxy	TokenNameIdentifier	 Proxy
proxy	TokenNameIdentifier	 proxy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Proxy	TokenNameIdentifier	 Proxy
)	TokenNameRPAREN	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SocketAddress	TokenNameIdentifier	 Socket Address
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
address	TokenNameIdentifier	 address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Direct connection "	TokenNameStringLiteral	Direct connection 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
instanceof	TokenNameinstanceof	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
ina	TokenNameIdentifier	 ina
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InetSocketAddress	TokenNameIdentifier	 Inet Socket Address
)	TokenNameRPAREN	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ina	TokenNameIdentifier	 ina
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ina	TokenNameIdentifier	 ina
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ina	TokenNameIdentifier	 ina
.	TokenNameDOT	
isUnresolved	TokenNameIdentifier	 is Unresolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" [unresolved]"	TokenNameStringLiteral	 [unresolved]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
addr	TokenNameIdentifier	 addr
=	TokenNameEQUAL	
ina	TokenNameIdentifier	 ina
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
