/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ServerSocket	TokenNameIdentifier	 Server Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
LogManager	TokenNameIdentifier	 Log Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
DOMConfigurator	TokenNameIdentifier	 DOM Configurator
;	TokenNameSEMICOLON	
/** * A simple {@link SocketNode} based server. * <pre> <b>Usage:</b> java org.apache.log4j.net.SimpleSocketServer port configFile where <em>port</em> is a part number where the server listens and <em>configFile</em> is a configuration file fed to the {@link PropertyConfigurator} or to {@link DOMConfigurator} if an XML file. </pre> * * @author Ceki G&uuml;lc&uuml; * * @since 0.8.4 * */	TokenNameCOMMENT_JAVADOC	 A simple {@link SocketNode} based server. <pre> <b>Usage:</b> java org.apache.log4j.net.SimpleSocketServer port configFile where <em>port</em> is a part number where the server listens and <em>configFile</em> is a configuration file fed to the {@link PropertyConfigurator} or to {@link DOMConfigurator} if an XML file. </pre> * @author Ceki G&uuml;lc&uuml; * @since 0.8.4 
public	TokenNamepublic	
class	TokenNameclass	
SimpleSocketServer	TokenNameIdentifier	 Simple Socket Server
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SimpleSocketServer	TokenNameIdentifier	 Simple Socket Server
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Wrong number of arguments."	TokenNameStringLiteral	Wrong number of arguments.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Listening on port "	TokenNameStringLiteral	Listening on port 
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ServerSocket	TokenNameIdentifier	 Server Socket
serverSocket	TokenNameIdentifier	 server Socket
=	TokenNameEQUAL	
new	TokenNamenew	
ServerSocket	TokenNameIdentifier	 Server Socket
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Waiting to accept a new client."	TokenNameStringLiteral	Waiting to accept a new client.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
serverSocket	TokenNameIdentifier	 server Socket
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Connected to client at "	TokenNameStringLiteral	Connected to client at 
+	TokenNamePLUS	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInetAddress	TokenNameIdentifier	 get Inet Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Starting new socket node."	TokenNameStringLiteral	Starting new socket node.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
SocketNode	TokenNameIdentifier	 Socket Node
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"SimpleSocketServer-"	TokenNameStringLiteral	SimpleSocketServer-
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: java "	TokenNameStringLiteral	Usage: java 
+	TokenNamePLUS	
SimpleSocketServer	TokenNameIdentifier	 Simple Socket Server
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" port configFile"	TokenNameStringLiteral	 port configFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
portStr	TokenNameIdentifier	 port Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
configFile	TokenNameIdentifier	 config File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
portStr	TokenNameIdentifier	 port Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Could not interpret port number ["	TokenNameStringLiteral	Could not interpret port number [
+	TokenNamePLUS	
portStr	TokenNameIdentifier	 port Str
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
configFile	TokenNameIdentifier	 config File
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMConfigurator	TokenNameIdentifier	 DOM Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
configFile	TokenNameIdentifier	 config File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
configFile	TokenNameIdentifier	 config File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
