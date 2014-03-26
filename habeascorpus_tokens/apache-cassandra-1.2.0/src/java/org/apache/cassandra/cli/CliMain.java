/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
jline	TokenNameIdentifier	 jline
.	TokenNameDOT	
ConsoleReader	TokenNameIdentifier	 Console Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
jline	TokenNameIdentifier	 jline
.	TokenNameDOT	
History	TokenNameIdentifier	 History
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
.	TokenNameDOT	
IAuthenticator	TokenNameIdentifier	 I Authenticator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
TException	TokenNameIdentifier	 T Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TSocket	TokenNameIdentifier	 T Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransport	TokenNameIdentifier	 T Transport
;	TokenNameSEMICOLON	
/** * Cassandra Command Line Interface (CLI) Main */	TokenNameCOMMENT_JAVADOC	 Cassandra Command Line Interface (CLI) Main 
public	TokenNamepublic	
class	TokenNameclass	
CliMain	TokenNameIdentifier	 Cli Main
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
HISTORYFILE	TokenNameIdentifier	 HISTORYFILE
=	TokenNameEQUAL	
".cassandra.history"	TokenNameStringLiteral	.cassandra.history
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
TTransport	TokenNameIdentifier	 T Transport
transport	TokenNameIdentifier	 transport
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Client	TokenNameIdentifier	 Client
thriftClient	TokenNameIdentifier	 thrift Client
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CliSessionState	TokenNameIdentifier	 Cli Session State
sessionState	TokenNameIdentifier	 session State
=	TokenNameEQUAL	
new	TokenNamenew	
CliSessionState	TokenNameIdentifier	 Cli Session State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
CliClient	TokenNameIdentifier	 Cli Client
cliClient	TokenNameIdentifier	 cli Client
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CliCompleter	TokenNameIdentifier	 Cli Completer
completer	TokenNameIdentifier	 completer
=	TokenNameEQUAL	
new	TokenNamenew	
CliCompleter	TokenNameIdentifier	 Cli Completer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Establish a thrift connection to cassandra instance * * @param server - hostname or IP of the server * @param port - Thrift port number */	TokenNameCOMMENT_JAVADOC	 Establish a thrift connection to cassandra instance * @param server - hostname or IP of the server @param port - Thrift port number 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TSocket	TokenNameIdentifier	 T Socket
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
TSocket	TokenNameIdentifier	 T Socket
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transport	TokenNameIdentifier	 transport
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transport	TokenNameIdentifier	 transport
=	TokenNameEQUAL	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
transportFactory	TokenNameIdentifier	 transport Factory
.	TokenNameDOT	
getTransport	TokenNameIdentifier	 get Transport
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
binaryProtocol	TokenNameIdentifier	 binary Protocol
=	TokenNameEQUAL	
new	TokenNamenew	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
(	TokenNameLPAREN	
transport	TokenNameIdentifier	 transport
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Client	TokenNameIdentifier	 Client
cassandraClient	TokenNameIdentifier	 cassandra Client
=	TokenNameEQUAL	
new	TokenNamenew	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Client	TokenNameIdentifier	 Client
(	TokenNameLPAREN	
binaryProtocol	TokenNameIdentifier	 binary Protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
isOpen	TokenNameIdentifier	 is Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Exception connecting to "	TokenNameStringLiteral	Exception connecting to 
+	TokenNamePLUS	
server	TokenNameIdentifier	 server
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
+	TokenNamePLUS	
". Reason: "	TokenNameStringLiteral	. Reason: 
+	TokenNamePLUS	
error	TokenNameIdentifier	 error
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
thriftClient	TokenNameIdentifier	 thrift Client
=	TokenNameEQUAL	
cassandraClient	TokenNameIdentifier	 cassandra Client
;	TokenNameSEMICOLON	
cliClient	TokenNameIdentifier	 cli Client
=	TokenNameEQUAL	
new	TokenNamenew	
CliClient	TokenNameIdentifier	 Cli Client
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
,	TokenNameCOMMA	
thriftClient	TokenNameIdentifier	 thrift Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
username	TokenNameIdentifier	 username
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
password	TokenNameIdentifier	 password
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Authenticate 	TokenNameCOMMENT_LINE	Authenticate 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
credentials	TokenNameIdentifier	 credentials
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
credentials	TokenNameIdentifier	 credentials
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IAuthenticator	TokenNameIdentifier	 I Authenticator
.	TokenNameDOT	
USERNAME_KEY	TokenNameIdentifier	 USERNAME  KEY
,	TokenNameCOMMA	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
credentials	TokenNameIdentifier	 credentials
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IAuthenticator	TokenNameIdentifier	 I Authenticator
.	TokenNameDOT	
PASSWORD_KEY	TokenNameIdentifier	 PASSWORD  KEY
,	TokenNameCOMMA	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AuthenticationRequest	TokenNameIdentifier	 Authentication Request
authRequest	TokenNameIdentifier	 auth Request
=	TokenNameEQUAL	
new	TokenNamenew	
AuthenticationRequest	TokenNameIdentifier	 Authentication Request
(	TokenNameLPAREN	
credentials	TokenNameIdentifier	 credentials
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
thriftClient	TokenNameIdentifier	 thrift Client
.	TokenNameDOT	
login	TokenNameIdentifier	 login
(	TokenNameLPAREN	
authRequest	TokenNameIdentifier	 auth Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cliClient	TokenNameIdentifier	 cli Client
.	TokenNameDOT	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
username	TokenNameIdentifier	 username
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thriftClient	TokenNameIdentifier	 thrift Client
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Exception during authentication to the cassandra node, "	TokenNameStringLiteral	Exception during authentication to the cassandra node, 
+	TokenNamePLUS	
"Verify the keyspace exists, and that you are using the correct credentials."	TokenNameStringLiteral	Verify the keyspace exists, and that you are using the correct credentials.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AuthorizationException	TokenNameIdentifier	 Authorization Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thriftClient	TokenNameIdentifier	 thrift Client
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"You are not authorized to use keyspace: "	TokenNameStringLiteral	You are not authorized to use keyspace: 
+	TokenNamePLUS	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TException	TokenNameIdentifier	 T Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thriftClient	TokenNameIdentifier	 thrift Client
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Login failure. Did you specify 'keyspace', 'username' and 'password'?"	TokenNameStringLiteral	Login failure. Did you specify 'keyspace', 'username' and 'password'?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
CliCompiler	TokenNameIdentifier	 Cli Compiler
.	TokenNameDOT	
getKeySpace	TokenNameIdentifier	 get Key Space
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
thriftClient	TokenNameIdentifier	 thrift Client
.	TokenNameDOT	
describe_keyspaces	TokenNameIdentifier	 describe keyspaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
thriftClient	TokenNameIdentifier	 thrift Client
.	TokenNameDOT	
set_keyspace	TokenNameIdentifier	 set keyspace
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cliClient	TokenNameIdentifier	 cli Client
.	TokenNameDOT	
setKeySpace	TokenNameIdentifier	 set Key Space
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateCompletor	TokenNameIdentifier	 update Completor
(	TokenNameLPAREN	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
getCfNamesByKeySpace	TokenNameIdentifier	 get Cf Names By Key Space
(	TokenNameLPAREN	
cliClient	TokenNameIdentifier	 cli Client
.	TokenNameDOT	
getKSMetaData	TokenNameIdentifier	 get KS Meta Data
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Keyspace "	TokenNameStringLiteral	Keyspace 
+	TokenNamePLUS	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
" not found"	TokenNameStringLiteral	 not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TException	TokenNameIdentifier	 T Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Did you specify 'keyspace'?"	TokenNameStringLiteral	Did you specify 'keyspace'?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NotFoundException	TokenNameIdentifier	 Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Keyspace "	TokenNameStringLiteral	Keyspace 
+	TokenNamePLUS	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
" not found"	TokenNameStringLiteral	 not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Lookup the cluster name, this is to make it clear which cluster the user is connected to 	TokenNameCOMMENT_LINE	Lookup the cluster name, this is to make it clear which cluster the user is connected to 
String	TokenNameIdentifier	 String
clusterName	TokenNameIdentifier	 cluster Name
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clusterName	TokenNameIdentifier	 cluster Name
=	TokenNameEQUAL	
thriftClient	TokenNameIdentifier	 thrift Client
.	TokenNameDOT	
describe_cluster_name	TokenNameIdentifier	 describe cluster name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Exception retrieving information about the cassandra node, check you have connected to the thrift port."	TokenNameStringLiteral	Exception retrieving information about the cassandra node, check you have connected to the thrift port.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
printf	TokenNameIdentifier	 printf
(	TokenNameLPAREN	
"Connected to: "%s" on %s/%d%n"	TokenNameStringLiteral	Connected to: "%s" on %s/%d%n
,	TokenNameCOMMA	
clusterName	TokenNameIdentifier	 cluster Name
,	TokenNameCOMMA	
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Disconnect thrift connection to cassandra instance */	TokenNameCOMMENT_JAVADOC	 Disconnect thrift connection to cassandra instance 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transport	TokenNameIdentifier	 transport
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transport	TokenNameIdentifier	 transport
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks whether the thrift client is connected. * @return boolean - true when connected, false otherwise */	TokenNameCOMMENT_JAVADOC	 Checks whether the thrift client is connected. @return boolean - true when connected, false otherwise 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thriftClient	TokenNameIdentifier	 thrift Client
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Not connected to a cassandra instance."	TokenNameStringLiteral	Not connected to a cassandra instance.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
updateCompletor	TokenNameIdentifier	 update Completor
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
candidates	TokenNameIdentifier	 candidates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
actions	TokenNameIdentifier	 actions
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
candidates	TokenNameIdentifier	 candidates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cmd	TokenNameIdentifier	 cmd
:	TokenNameCOLON	
completer	TokenNameIdentifier	 completer
.	TokenNameDOT	
getKeyspaceCommands	TokenNameIdentifier	 get Keyspace Commands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
actions	TokenNameIdentifier	 actions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s %s"	TokenNameStringLiteral	%s %s
,	TokenNameCOMMA	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strs	TokenNameIdentifier	 strs
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
copyOf	TokenNameIdentifier	 copy Of
(	TokenNameLPAREN	
actions	TokenNameIdentifier	 actions
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actions	TokenNameIdentifier	 actions
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
completer	TokenNameIdentifier	 completer
.	TokenNameDOT	
setCandidateStrings	TokenNameIdentifier	 set Candidate Strings
(	TokenNameLPAREN	
strs	TokenNameIdentifier	 strs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
processStatement	TokenNameIdentifier	 process Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
,	TokenNameCOMMA	
TException	TokenNameIdentifier	 T Exception
,	TokenNameCOMMA	
TimedOutException	TokenNameIdentifier	 Timed Out Exception
,	TokenNameCOMMA	
NotFoundException	TokenNameIdentifier	 Not Found Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
NoSuchFieldException	TokenNameIdentifier	 No Such Field Exception
,	TokenNameCOMMA	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
{	TokenNameLBRACE	
cliClient	TokenNameIdentifier	 cli Client
.	TokenNameDOT	
executeCLIStatement	TokenNameIdentifier	 execute CLI Statement
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
processStatementInteractive	TokenNameIdentifier	 process Statement Interactive
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cliClient	TokenNameIdentifier	 cli Client
.	TokenNameDOT	
executeCLIStatement	TokenNameIdentifier	 execute CLI Statement
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
errorTemplate	TokenNameIdentifier	 error Template
=	TokenNameEQUAL	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
inFileMode	TokenNameIdentifier	 in File Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"Line "	TokenNameStringLiteral	Line 
+	TokenNamePLUS	
lineNumber	TokenNameIdentifier	 line Number
+	TokenNamePLUS	
" => "	TokenNameStringLiteral	 => 
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
instanceof	TokenNameinstanceof	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
)	TokenNameRPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
.	TokenNameDOT	
getWhy	TokenNameIdentifier	 get Why
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
errorTemplate	TokenNameIdentifier	 error Template
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
batch	TokenNameIdentifier	 batch
||	TokenNameOR_OR	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
inFileMode	TokenNameIdentifier	 in File Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// process command line arguments 	TokenNameCOMMENT_LINE	process command line arguments 
CliOptions	TokenNameIdentifier	 Cli Options
cliOptions	TokenNameIdentifier	 cli Options
=	TokenNameEQUAL	
new	TokenNamenew	
CliOptions	TokenNameIdentifier	 Cli Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cliOptions	TokenNameIdentifier	 cli Options
.	TokenNameDOT	
processArgs	TokenNameIdentifier	 process Args
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// connect to cassandra server if host argument specified. 	TokenNameCOMMENT_LINE	connect to cassandra server if host argument specified. 
if	TokenNameif	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
hostName	TokenNameIdentifier	 host Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
hostName	TokenNameIdentifier	 host Name
,	TokenNameCOMMA	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
thriftPort	TokenNameIdentifier	 thrift Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cliClient	TokenNameIdentifier	 cli Client
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Connection parameter was either invalid or not present. 	TokenNameCOMMENT_LINE	Connection parameter was either invalid or not present. 
// User must connect explicitly using the "connect" CLI statement. 	TokenNameCOMMENT_LINE	User must connect explicitly using the "connect" CLI statement. 
cliClient	TokenNameIdentifier	 cli Client
=	TokenNameEQUAL	
new	TokenNamenew	
CliClient	TokenNameIdentifier	 Cli Client
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load statements from file and process them 	TokenNameCOMMENT_LINE	load statements from file and process them 
if	TokenNameif	
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
inFileMode	TokenNameIdentifier	 in File Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileReader	TokenNameIdentifier	 File Reader
fileReader	TokenNameIdentifier	 file Reader
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fileReader	TokenNameIdentifier	 file Reader
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
evaluateFileStatements	TokenNameIdentifier	 evaluate File Statements
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
fileReader	TokenNameIdentifier	 file Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ConsoleReader	TokenNameIdentifier	 Console Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
ConsoleReader	TokenNameIdentifier	 Console Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
batch	TokenNameIdentifier	 batch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
addCompletor	TokenNameIdentifier	 add Completor
(	TokenNameLPAREN	
completer	TokenNameIdentifier	 completer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setBellEnabled	TokenNameIdentifier	 set Bell Enabled
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
historyFile	TokenNameIdentifier	 history File
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
HISTORYFILE	TokenNameIdentifier	 HISTORYFILE
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
History	TokenNameIdentifier	 History
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
History	TokenNameIdentifier	 History
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
historyFile	TokenNameIdentifier	 history File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setHistory	TokenNameIdentifier	 set History
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
printf	TokenNameIdentifier	 printf
(	TokenNameLPAREN	
"Unable to open %s for writing %n"	TokenNameStringLiteral	Unable to open %s for writing %n
,	TokenNameCOMMA	
historyFile	TokenNameIdentifier	 history File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
// if in batch mode but no verbose flag 	TokenNameCOMMENT_LINE	if in batch mode but no verbose flag 
{	TokenNameLBRACE	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cliClient	TokenNameIdentifier	 cli Client
.	TokenNameDOT	
printBanner	TokenNameIdentifier	 print Banner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
currentStatement	TokenNameIdentifier	 current Statement
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inCompoundStatement	TokenNameIdentifier	 in Compound Statement
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prompt	TokenNameIdentifier	 prompt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
inCompoundStatement	TokenNameIdentifier	 in Compound Statement
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"... "	TokenNameStringLiteral	... 
:	TokenNameCOLON	
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
cliClient	TokenNameIdentifier	 cli Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
prompt	TokenNameIdentifier	 prompt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// retry on I/O Exception 	TokenNameCOMMENT_LINE	retry on I/O Exception 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skipping empty and comment lines 	TokenNameCOMMENT_LINE	skipping empty and comment lines 
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
currentStatement	TokenNameIdentifier	 current Statement
+=	TokenNamePLUS_EQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processStatementInteractive	TokenNameIdentifier	 process Statement Interactive
(	TokenNameLPAREN	
currentStatement	TokenNameIdentifier	 current Statement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStatement	TokenNameIdentifier	 current Statement
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
inCompoundStatement	TokenNameIdentifier	 in Compound Statement
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentStatement	TokenNameIdentifier	 current Statement
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// ready for new line 	TokenNameCOMMENT_LINE	ready for new line 
inCompoundStatement	TokenNameIdentifier	 in Compound Statement
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
evaluateFileStatements	TokenNameIdentifier	 evaluate File Statements
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
currentStatement	TokenNameIdentifier	 current Statement
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
commentedBlock	TokenNameIdentifier	 commented Block
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skipping empty and comment lines 	TokenNameCOMMENT_LINE	skipping empty and comment lines 
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/*"	TokenNameStringLiteral	/*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
commentedBlock	TokenNameIdentifier	 commented Block
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"*/"	TokenNameStringLiteral	*/
)	TokenNameRPAREN	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"*/"	TokenNameStringLiteral	*/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commentedBlock	TokenNameIdentifier	 commented Block
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
commentedBlock	TokenNameIdentifier	 commented Block
)	TokenNameRPAREN	
// skip commented lines 	TokenNameCOMMENT_LINE	skip commented lines 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
currentStatement	TokenNameIdentifier	 current Statement
+=	TokenNamePLUS_EQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processStatementInteractive	TokenNameIdentifier	 process Statement Interactive
(	TokenNameLPAREN	
currentStatement	TokenNameIdentifier	 current Statement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStatement	TokenNameIdentifier	 current Statement
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentStatement	TokenNameIdentifier	 current Statement
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// ready for new line 	TokenNameCOMMENT_LINE	ready for new line 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns prompt for current connection * @param client - currently connected client * @return String - prompt with username and keyspace (if any) */	TokenNameCOMMENT_JAVADOC	 Returns prompt for current connection @param client - currently connected client @return String - prompt with username and keyspace (if any) 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
CliClient	TokenNameIdentifier	 Cli Client
client	TokenNameIdentifier	 client
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getUsername	TokenNameIdentifier	 get Username
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
getKeySpace	TokenNameIdentifier	 get Key Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
