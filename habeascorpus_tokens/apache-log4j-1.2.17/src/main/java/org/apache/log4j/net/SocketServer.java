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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Hierarchy	TokenNameIdentifier	 Hierarchy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggerRepository	TokenNameIdentifier	 Logger Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
RootLogger	TokenNameIdentifier	 Root Logger
;	TokenNameSEMICOLON	
/** A {@link SocketNode} based server that uses a different hierarchy for each client. <pre> <b>Usage:</b> java org.apache.log4j.net.SocketServer port configFile configDir where <b>port</b> is a part number where the server listens, <b>configFile</b> is a configuration file fed to the {@link PropertyConfigurator} and <b>configDir</b> is a path to a directory containing configuration files, possibly one for each client host. </pre> <p>The <code>configFile</code> is used to configure the log4j default hierarchy that the <code>SocketServer</code> will use to report on its actions. <p>When a new connection is opened from a previously unknown host, say <code>foo.bar.net</code>, then the <code>SocketServer</code> will search for a configuration file called <code>foo.bar.net.lcf</code> under the directory <code>configDir</code> that was passed as the third argument. If the file can be found, then a new hierarchy is instantiated and configured using the configuration file <code>foo.bar.net.lcf</code>. If and when the host <code>foo.bar.net</code> opens another connection to the server, then the previously configured hierarchy is used. <p>In case there is no file called <code>foo.bar.net.lcf</code> under the directory <code>configDir</code>, then the <em>generic</em> hierarchy is used. The generic hierarchy is configured using a configuration file called <code>generic.lcf</code> under the <code>configDir</code> directory. If no such file exists, then the generic hierarchy will be identical to the log4j default hierarchy. <p>Having different client hosts log using different hierarchies ensures the total independence of the clients with respect to their logging settings. <p>Currently, the hierarchy that will be used for a given request depends on the IP address of the client host. For example, two separate applicatons running on the same host and logging to the same server will share the same hierarchy. This is perfectly safe except that it might not provide the right amount of independence between applications. The <code>SocketServer</code> is intended as an example to be enhanced in order to implement more elaborate policies. @author Ceki G&uuml;lc&uuml; @since 1.0 */	TokenNameCOMMENT_JAVADOC	 A {@link SocketNode} based server that uses a different hierarchy for each client. <pre> <b>Usage:</b> java org.apache.log4j.net.SocketServer port configFile configDir where <b>port</b> is a part number where the server listens, <b>configFile</b> is a configuration file fed to the {@link PropertyConfigurator} and <b>configDir</b> is a path to a directory containing configuration files, possibly one for each client host. </pre> <p>The <code>configFile</code> is used to configure the log4j default hierarchy that the <code>SocketServer</code> will use to report on its actions. <p>When a new connection is opened from a previously unknown host, say <code>foo.bar.net</code>, then the <code>SocketServer</code> will search for a configuration file called <code>foo.bar.net.lcf</code> under the directory <code>configDir</code> that was passed as the third argument. If the file can be found, then a new hierarchy is instantiated and configured using the configuration file <code>foo.bar.net.lcf</code>. If and when the host <code>foo.bar.net</code> opens another connection to the server, then the previously configured hierarchy is used. <p>In case there is no file called <code>foo.bar.net.lcf</code> under the directory <code>configDir</code>, then the <em>generic</em> hierarchy is used. The generic hierarchy is configured using a configuration file called <code>generic.lcf</code> under the <code>configDir</code> directory. If no such file exists, then the generic hierarchy will be identical to the log4j default hierarchy. <p>Having different client hosts log using different hierarchies ensures the total independence of the clients with respect to their logging settings. <p>Currently, the hierarchy that will be used for a given request depends on the IP address of the client host. For example, two separate applicatons running on the same host and logging to the same server will share the same hierarchy. This is perfectly safe except that it might not provide the right amount of independence between applications. The <code>SocketServer</code> is intended as an example to be enhanced in order to implement more elaborate policies. @author Ceki G&uuml;lc&uuml; @since 1.0 
public	TokenNamepublic	
class	TokenNameclass	
SocketServer	TokenNameIdentifier	 Socket Server
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
GENERIC	TokenNameIdentifier	 GENERIC
=	TokenNameEQUAL	
"generic"	TokenNameStringLiteral	generic
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CONFIG_FILE_EXT	TokenNameIdentifier	 CONFIG  FILE  EXT
=	TokenNameEQUAL	
".lcf"	TokenNameStringLiteral	.lcf
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SocketServer	TokenNameIdentifier	 Socket Server
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
SocketServer	TokenNameIdentifier	 Socket Server
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
// key=inetAddress, value=hierarchy 	TokenNameCOMMENT_LINE	key=inetAddress, value=hierarchy 
Hashtable	TokenNameIdentifier	 Hashtable
hierarchyMap	TokenNameIdentifier	 hierarchy Map
;	TokenNameSEMICOLON	
LoggerRepository	TokenNameIdentifier	 Logger Repository
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
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
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
,	TokenNameCOMMA	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Wrong number of arguments."	TokenNameStringLiteral	Wrong number of arguments.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
InetAddress	TokenNameIdentifier	 Inet Address
inetAddress	TokenNameIdentifier	 inet Address
=	TokenNameEQUAL	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInetAddress	TokenNameIdentifier	 get Inet Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Connected to client at "	TokenNameStringLiteral	Connected to client at 
+	TokenNamePLUS	
inetAddress	TokenNameIdentifier	 inet Address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggerRepository	TokenNameIdentifier	 Logger Repository
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggerRepository	TokenNameIdentifier	 Logger Repository
)	TokenNameRPAREN	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
hierarchyMap	TokenNameIdentifier	 hierarchy Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
inetAddress	TokenNameIdentifier	 inet Address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
configureHierarchy	TokenNameIdentifier	 configure Hierarchy
(	TokenNameLPAREN	
inetAddress	TokenNameIdentifier	 inet Address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
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
SocketServer	TokenNameIdentifier	 Socket Server
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" port configFile directory"	TokenNameStringLiteral	 port configFile directory
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
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dirStr	TokenNameIdentifier	 dir Str
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
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
configFile	TokenNameIdentifier	 config File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dirStr	TokenNameIdentifier	 dir Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
dirStr	TokenNameIdentifier	 dir Str
+	TokenNamePLUS	
"] is not a directory."	TokenNameStringLiteral	] is not a directory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
SocketServer	TokenNameIdentifier	 Socket Server
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SocketServer	TokenNameIdentifier	 Socket Server
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
hierarchyMap	TokenNameIdentifier	 hierarchy Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This method assumes that there is no hiearchy for inetAddress 	TokenNameCOMMENT_LINE	This method assumes that there is no hiearchy for inetAddress 
// yet. It will configure one and return it. 	TokenNameCOMMENT_LINE	yet. It will configure one and return it. 
LoggerRepository	TokenNameIdentifier	 Logger Repository
configureHierarchy	TokenNameIdentifier	 configure Hierarchy
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
inetAddress	TokenNameIdentifier	 inet Address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Locating configuration file for "	TokenNameStringLiteral	Locating configuration file for 
+	TokenNamePLUS	
inetAddress	TokenNameIdentifier	 inet Address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We assume that the toSting method of InetAddress returns is in 	TokenNameCOMMENT_LINE	We assume that the toSting method of InetAddress returns is in 
// the format hostname/d1.d2.d3.d4 e.g. torino/192.168.1.1 	TokenNameCOMMENT_LINE	the format hostname/d1.d2.d3.d4 e.g. torino/192.168.1.1 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
inetAddress	TokenNameIdentifier	 inet Address
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not parse the inetAddress ["	TokenNameStringLiteral	Could not parse the inetAddress [
+	TokenNamePLUS	
inetAddress	TokenNameIdentifier	 inet Address
+	TokenNamePLUS	
"]. Using default hierarchy."	TokenNameStringLiteral	]. Using default hierarchy.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
configFile	TokenNameIdentifier	 config File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
CONFIG_FILE_EXT	TokenNameIdentifier	 CONFIG  FILE  EXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
configFile	TokenNameIdentifier	 config File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hierarchy	TokenNameIdentifier	 Hierarchy
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hierarchy	TokenNameIdentifier	 Hierarchy
(	TokenNameLPAREN	
new	TokenNamenew	
RootLogger	TokenNameIdentifier	 Root Logger
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hierarchyMap	TokenNameIdentifier	 hierarchy Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
inetAddress	TokenNameIdentifier	 inet Address
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doConfigure	TokenNameIdentifier	 do Configure
(	TokenNameLPAREN	
configFile	TokenNameIdentifier	 config File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not find config file ["	TokenNameStringLiteral	Could not find config file [
+	TokenNamePLUS	
configFile	TokenNameIdentifier	 config File
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
LoggerRepository	TokenNameIdentifier	 Logger Repository
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
GENERIC	TokenNameIdentifier	 GENERIC
+	TokenNamePLUS	
CONFIG_FILE_EXT	TokenNameIdentifier	 CONFIG  FILE  EXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
=	TokenNameEQUAL	
new	TokenNamenew	
Hierarchy	TokenNameIdentifier	 Hierarchy
(	TokenNameLPAREN	
new	TokenNamenew	
RootLogger	TokenNameIdentifier	 Root Logger
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doConfigure	TokenNameIdentifier	 do Configure
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not find config file ["	TokenNameStringLiteral	Could not find config file [
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"]. Will use the default hierarchy."	TokenNameStringLiteral	]. Will use the default hierarchy.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
=	TokenNameEQUAL	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
genericHierarchy	TokenNameIdentifier	 generic Hierarchy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
