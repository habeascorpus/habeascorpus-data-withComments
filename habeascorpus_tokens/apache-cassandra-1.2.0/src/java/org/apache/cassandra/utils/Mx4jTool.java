/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
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
/** * If mx4j-tools is in the classpath call maybeLoad to load the HTTP interface of mx4j. * * The default port is 8081. To override that provide e.g. -Dmx4jport=8082 * The default listen address is 0.0.0.0. To override that provide -Dmx4jaddress=127.0.0.1 */	TokenNameCOMMENT_JAVADOC	 If mx4j-tools is in the classpath call maybeLoad to load the HTTP interface of mx4j. * The default port is 8081. To override that provide e.g. -Dmx4jport=8082 The default listen address is 0.0.0.0. To override that provide -Dmx4jaddress=127.0.0.1 
public	TokenNamepublic	
class	TokenNameclass	
Mx4jTool	TokenNameIdentifier	 Mx4j Tool
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
Mx4jTool	TokenNameIdentifier	 Mx4j Tool
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Starts a JMX over http interface if and mx4j-tools.jar is in the classpath. * @return true if successfully loaded. */	TokenNameCOMMENT_JAVADOC	 Starts a JMX over http interface if and mx4j-tools.jar is in the classpath. @return true if successfully loaded. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
maybeLoad	TokenNameIdentifier	 maybe Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Will try to load mx4j now, if it's in the classpath"	TokenNameStringLiteral	Will try to load mx4j now, if it's in the classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MBeanServer	TokenNameIdentifier	 M Bean Server
mbs	TokenNameIdentifier	 mbs
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectName	TokenNameIdentifier	 Object Name
processorName	TokenNameIdentifier	 processor Name
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
"Server:name=XSLTProcessor"	TokenNameStringLiteral	Server:name=XSLTProcessor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
httpAdaptorClass	TokenNameIdentifier	 http Adaptor Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"mx4j.tools.adaptor.http.HttpAdaptor"	TokenNameStringLiteral	mx4j.tools.adaptor.http.HttpAdaptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
httpAdaptor	TokenNameIdentifier	 http Adaptor
=	TokenNameEQUAL	
httpAdaptorClass	TokenNameIdentifier	 http Adaptor Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
httpAdaptorClass	TokenNameIdentifier	 http Adaptor Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setHost"	TokenNameStringLiteral	setHost
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
httpAdaptor	TokenNameIdentifier	 http Adaptor
,	TokenNameCOMMA	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
httpAdaptorClass	TokenNameIdentifier	 http Adaptor Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setPort"	TokenNameStringLiteral	setPort
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
httpAdaptor	TokenNameIdentifier	 http Adaptor
,	TokenNameCOMMA	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectName	TokenNameIdentifier	 Object Name
httpName	TokenNameIdentifier	 http Name
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectName	TokenNameIdentifier	 Object Name
(	TokenNameLPAREN	
"system:name=http"	TokenNameStringLiteral	system:name=http
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbs	TokenNameIdentifier	 mbs
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
httpAdaptor	TokenNameIdentifier	 http Adaptor
,	TokenNameCOMMA	
httpName	TokenNameIdentifier	 http Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
xsltProcessorClass	TokenNameIdentifier	 xslt Processor Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"mx4j.tools.adaptor.http.XSLTProcessor"	TokenNameStringLiteral	mx4j.tools.adaptor.http.XSLTProcessor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
xsltProcessor	TokenNameIdentifier	 xslt Processor
=	TokenNameEQUAL	
xsltProcessorClass	TokenNameIdentifier	 xslt Processor Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
httpAdaptorClass	TokenNameIdentifier	 http Adaptor Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setProcessor"	TokenNameStringLiteral	setProcessor
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"mx4j.tools.adaptor.http.ProcessorMBean"	TokenNameStringLiteral	mx4j.tools.adaptor.http.ProcessorMBean
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
httpAdaptor	TokenNameIdentifier	 http Adaptor
,	TokenNameCOMMA	
xsltProcessor	TokenNameIdentifier	 xslt Processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbs	TokenNameIdentifier	 mbs
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
xsltProcessor	TokenNameIdentifier	 xslt Processor
,	TokenNameCOMMA	
processorName	TokenNameIdentifier	 processor Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
httpAdaptorClass	TokenNameIdentifier	 http Adaptor Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"start"	TokenNameStringLiteral	start
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
httpAdaptor	TokenNameIdentifier	 http Adaptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"mx4j successfuly loaded"	TokenNameStringLiteral	mx4j successfuly loaded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Will not load MX4J, mx4j-tools.jar is not in the classpath"	TokenNameStringLiteral	Will not load MX4J, mx4j-tools.jar is not in the classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not start register mbean in JMX"	TokenNameStringLiteral	Could not start register mbean in JMX
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"mx4jaddress"	TokenNameStringLiteral	mx4jaddress
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getBroadcastAddress	TokenNameIdentifier	 get Broadcast Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHostAddress	TokenNameIdentifier	 get Host Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
8081	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sPort	TokenNameIdentifier	 s Port
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"mx4jport"	TokenNameStringLiteral	mx4jport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sPort	TokenNameIdentifier	 s Port
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
sPort	TokenNameIdentifier	 s Port
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
sPort	TokenNameIdentifier	 s Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
