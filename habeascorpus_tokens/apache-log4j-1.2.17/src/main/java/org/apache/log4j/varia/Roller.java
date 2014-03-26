/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
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
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
/** A simple application to send roll over messages to a potentially remote {@link ExternallyRolledFileAppender}. <p>It takes two arguments, the <code>host_name</code> and <code>port_number</code> where the <code>ExternallyRolledFileAppender</code> is listening. @author Ceki G&uuml;lc&uuml; @since version 0.9.0 */	TokenNameCOMMENT_JAVADOC	 A simple application to send roll over messages to a potentially remote {@link ExternallyRolledFileAppender}. <p>It takes two arguments, the <code>host_name</code> and <code>port_number</code> where the <code>ExternallyRolledFileAppender</code> is listening. @author Ceki G&uuml;lc&uuml; @since version 0.9.0 
public	TokenNamepublic	
class	TokenNameclass	
Roller	TokenNameIdentifier	 Roller
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Roller	TokenNameIdentifier	 Roller
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
// Static class. 	TokenNameCOMMENT_LINE	Static class. 
Roller	TokenNameIdentifier	 Roller
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Send a "RollOver" message to <code>ExternallyRolledFileAppender</code> on <code>host</code> and <code>port</code>. */	TokenNameCOMMENT_JAVADOC	 Send a "RollOver" message to <code>ExternallyRolledFileAppender</code> on <code>host</code> and <code>port</code>. 
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
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Wrong number of arguments."	TokenNameStringLiteral	Wrong number of arguments.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
roll	TokenNameIdentifier	 roll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Roller	TokenNameIdentifier	 Roller
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"host_name port_number"	TokenNameStringLiteral	host_name port_number
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
hostArg	TokenNameIdentifier	 host Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
portArg	TokenNameIdentifier	 port Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
hostArg	TokenNameIdentifier	 host Arg
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
portArg	TokenNameIdentifier	 port Arg
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
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Second argument "	TokenNameStringLiteral	Second argument 
+	TokenNamePLUS	
portArg	TokenNameIdentifier	 port Arg
+	TokenNamePLUS	
" is not a valid integer."	TokenNameStringLiteral	 is not a valid integer.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
roll	TokenNameIdentifier	 roll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
dos	TokenNameIdentifier	 dos
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
ExternallyRolledFileAppender	TokenNameIdentifier	 Externally Rolled File Appender
.	TokenNameDOT	
ROLL_OVER	TokenNameIdentifier	 ROLL  OVER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ExternallyRolledFileAppender	TokenNameIdentifier	 Externally Rolled File Appender
.	TokenNameDOT	
OK	TokenNameIdentifier	 OK
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Roll over signal acknowledged by remote appender."	TokenNameStringLiteral	Roll over signal acknowledged by remote appender.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unexpected return code "	TokenNameStringLiteral	Unexpected return code 
+	TokenNamePLUS	
rc	TokenNameIdentifier	 rc
+	TokenNamePLUS	
" from remote entity."	TokenNameStringLiteral	 from remote entity.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not send roll signal on host "	TokenNameStringLiteral	Could not send roll signal on host 
+	TokenNamePLUS	
host	TokenNameIdentifier	 host
+	TokenNamePLUS	
" port "	TokenNameStringLiteral	 port 
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
+	TokenNamePLUS	
" ."	TokenNameStringLiteral	 .
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
