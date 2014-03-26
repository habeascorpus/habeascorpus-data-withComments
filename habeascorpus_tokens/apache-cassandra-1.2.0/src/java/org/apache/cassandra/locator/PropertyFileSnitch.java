/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ResourceWatcher	TokenNameIdentifier	 Resource Watcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
;	TokenNameSEMICOLON	
/** * Used to determine if two IP's are in the same datacenter or on the same rack. * <p/> * Based on a properties file in the following format: * * 10.0.0.13=DC1:RAC2 * 10.21.119.14=DC3:RAC2 * 10.20.114.15=DC2:RAC2 * default=DC1:r1 */	TokenNameCOMMENT_JAVADOC	 Used to determine if two IP's are in the same datacenter or on the same rack. <p/> Based on a properties file in the following format: * 10.0.0.13=DC1:RAC2 10.21.119.14=DC3:RAC2 10.20.114.15=DC2:RAC2 default=DC1:r1 
public	TokenNamepublic	
class	TokenNameclass	
PropertyFileSnitch	TokenNameIdentifier	 Property File Snitch
extends	TokenNameextends	
AbstractNetworkTopologySnitch	TokenNameIdentifier	 Abstract Network Topology Snitch
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
PropertyFileSnitch	TokenNameIdentifier	 Property File Snitch
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
=	TokenNameEQUAL	
"cassandra-topology.properties"	TokenNameStringLiteral	cassandra-topology.properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
volatile	TokenNamevolatile	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
endpointMap	TokenNameIdentifier	 endpoint Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
volatile	TokenNamevolatile	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
defaultDCRack	TokenNameIdentifier	 default DC Rack
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
gossipStarted	TokenNameIdentifier	 gossip Started
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PropertyFileSnitch	TokenNameIdentifier	 Property File Snitch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
reloadConfiguration	TokenNameIdentifier	 reload Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
resourceToFile	TokenNameIdentifier	 resource To File
(	TokenNameLPAREN	
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Runnable	TokenNameIdentifier	 Runnable
runnable	TokenNameIdentifier	 runnable
=	TokenNameEQUAL	
new	TokenNamenew	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
reloadConfiguration	TokenNameIdentifier	 reload Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ResourceWatcher	TokenNameIdentifier	 Resource Watcher
.	TokenNameDOT	
watch	TokenNameIdentifier	 watch
(	TokenNameLPAREN	
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
,	TokenNameCOMMA	
runnable	TokenNameIdentifier	 runnable
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
+	TokenNamePLUS	
" found, but does not look like a plain file. Will not watch it for changes"	TokenNameStringLiteral	 found, but does not look like a plain file. Will not watch it for changes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the raw information about an end point * * @param endpoint endpoint to process * @return a array of string with the first index being the data center and the second being the rack */	TokenNameCOMMENT_JAVADOC	 Get the raw information about an end point * @param endpoint endpoint to process @return a array of string with the first index being the data center and the second being the rack 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEndpointInfo	TokenNameIdentifier	 get Endpoint Info
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rawEndpointInfo	TokenNameIdentifier	 raw Endpoint Info
=	TokenNameEQUAL	
getRawEndpointInfo	TokenNameIdentifier	 get Raw Endpoint Info
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rawEndpointInfo	TokenNameIdentifier	 raw Endpoint Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Unknown host "	TokenNameStringLiteral	Unknown host 
+	TokenNamePLUS	
endpoint	TokenNameIdentifier	 endpoint
+	TokenNamePLUS	
" with no default configured"	TokenNameStringLiteral	 with no default configured
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rawEndpointInfo	TokenNameIdentifier	 raw Endpoint Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRawEndpointInfo	TokenNameIdentifier	 get Raw Endpoint Info
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
endpointMap	TokenNameIdentifier	 endpoint Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Could not find end point information for {}, will use default"	TokenNameStringLiteral	Could not find end point information for {}, will use default
,	TokenNameCOMMA	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultDCRack	TokenNameIdentifier	 default DC Rack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the data center for which an endpoint resides in * * @param endpoint the endpoint to process * @return string of data center */	TokenNameCOMMENT_JAVADOC	 Return the data center for which an endpoint resides in * @param endpoint the endpoint to process @return string of data center 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDatacenter	TokenNameIdentifier	 get Datacenter
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
getEndpointInfo	TokenNameIdentifier	 get Endpoint Info
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"No location defined for endpoint "	TokenNameStringLiteral	No location defined for endpoint 
+	TokenNamePLUS	
endpoint	TokenNameIdentifier	 endpoint
;	TokenNameSEMICOLON	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the rack for which an endpoint resides in * * @param endpoint the endpoint to process * @return string of rack */	TokenNameCOMMENT_JAVADOC	 Return the rack for which an endpoint resides in * @param endpoint the endpoint to process @return string of rack 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRack	TokenNameIdentifier	 get Rack
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
getEndpointInfo	TokenNameIdentifier	 get Endpoint Info
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"No location defined for endpoint "	TokenNameStringLiteral	No location defined for endpoint 
+	TokenNamePLUS	
endpoint	TokenNameIdentifier	 endpoint
;	TokenNameSEMICOLON	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reloadConfiguration	TokenNameIdentifier	 reload Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
reloadedMap	TokenNameIdentifier	 reloaded Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Unable to read "	TokenNameStringLiteral	Unable to read 
+	TokenNamePLUS	
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newDefault	TokenNameIdentifier	 new Default
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newDefault	TokenNameIdentifier	 new Default
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
newDefault	TokenNameIdentifier	 new Default
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
defaultDCRack	TokenNameIdentifier	 default DC Rack
=	TokenNameEQUAL	
newDefault	TokenNameIdentifier	 new Default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
hostString	TokenNameIdentifier	 host String
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
hostString	TokenNameIdentifier	 host String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Unknown host "	TokenNameStringLiteral	Unknown host 
+	TokenNamePLUS	
hostString	TokenNameIdentifier	 host String
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
reloadedMap	TokenNameIdentifier	 reloaded Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reloadedMap	TokenNameIdentifier	 reloaded Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Snitch definitions at %s do not define a location for this node's broadcast address %s"	TokenNameStringLiteral	Snitch definitions at %s do not define a location for this node's broadcast address %s
,	TokenNameCOMMA	
SNITCH_PROPERTIES_FILENAME	TokenNameIdentifier	 SNITCH  PROPERTIES  FILENAME
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"loaded network topology {}"	TokenNameStringLiteral	loaded network topology {}
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
reloadedMap	TokenNameIdentifier	 reloaded Map
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endpointMap	TokenNameIdentifier	 endpoint Map
=	TokenNameEQUAL	
reloadedMap	TokenNameIdentifier	 reloaded Map
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// null check tolerates circular dependency; see CASSANDRA-4145 	TokenNameCOMMENT_LINE	null check tolerates circular dependency; see CASSANDRA-4145 
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTokenMetadata	TokenNameIdentifier	 get Token Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
invalidateCaches	TokenNameIdentifier	 invalidate Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gossipStarted	TokenNameIdentifier	 gossip Started
)	TokenNameRPAREN	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
gossipSnitchInfo	TokenNameIdentifier	 gossip Snitch Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
gossiperStarting	TokenNameIdentifier	 gossiper Starting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gossipStarted	TokenNameIdentifier	 gossip Started
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
