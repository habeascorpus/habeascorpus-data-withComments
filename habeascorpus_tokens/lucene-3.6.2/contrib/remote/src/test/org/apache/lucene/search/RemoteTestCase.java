package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
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
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
Naming	TokenNameIdentifier	 Naming
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
NotBoundException	TokenNameIdentifier	 Not Bound Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
RemoteException	TokenNameIdentifier	 Remote Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
registry	TokenNameIdentifier	 registry
.	TokenNameDOT	
LocateRegistry	TokenNameIdentifier	 Locate Registry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
RMIClientSocketFactory	TokenNameIdentifier	 RMI Client Socket Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
rmi	TokenNameIdentifier	 rmi
.	TokenNameDOT	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
RMIServerSocketFactory	TokenNameIdentifier	 RMI Server Socket Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
;	TokenNameSEMICOLON	
/** * Base class for remote tests. * <p> * Call {@link #startServer(Searchable)} in a {@link #BeforeClass} annotated method * to start the server. * Call {@link #lookupRemote} to get a RemoteSearchable. */	TokenNameCOMMENT_JAVADOC	 Base class for remote tests. <p> Call {@link #startServer(Searchable)} in a {@link #BeforeClass} annotated method to start the server. Call {@link #lookupRemote} to get a RemoteSearchable. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
RemoteTestCase	TokenNameIdentifier	 Remote Test Case
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
startServer	TokenNameIdentifier	 start Server
(	TokenNameLPAREN	
Searchable	TokenNameIdentifier	 Searchable
searchable	TokenNameIdentifier	 searchable
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// publish it 	TokenNameCOMMENT_LINE	publish it 
// use our own factories for testing, so we can bind to an ephemeral port. 	TokenNameCOMMENT_LINE	use our own factories for testing, so we can bind to an ephemeral port. 
RMIClientSocketFactory	TokenNameIdentifier	 RMI Client Socket Factory
clientFactory	TokenNameIdentifier	 client Factory
=	TokenNameEQUAL	
new	TokenNamenew	
RMIClientSocketFactory	TokenNameIdentifier	 RMI Client Socket Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Socket	TokenNameIdentifier	 Socket
createSocket	TokenNameIdentifier	 create Socket
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
class	TokenNameclass	
TestRMIServerSocketFactory	TokenNameIdentifier	 Test RMI Server Socket Factory
implements	TokenNameimplements	
RMIServerSocketFactory	TokenNameIdentifier	 RMI Server Socket Factory
{	TokenNameLBRACE	
ServerSocket	TokenNameIdentifier	 Server Socket
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ServerSocket	TokenNameIdentifier	 Server Socket
createServerSocket	TokenNameIdentifier	 create Server Socket
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
ServerSocket	TokenNameIdentifier	 Server Socket
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
TestRMIServerSocketFactory	TokenNameIdentifier	 Test RMI Server Socket Factory
serverFactory	TokenNameIdentifier	 server Factory
=	TokenNameEQUAL	
new	TokenNamenew	
TestRMIServerSocketFactory	TokenNameIdentifier	 Test RMI Server Socket Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocateRegistry	TokenNameIdentifier	 Locate Registry
.	TokenNameDOT	
createRegistry	TokenNameIdentifier	 create Registry
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clientFactory	TokenNameIdentifier	 client Factory
,	TokenNameCOMMA	
serverFactory	TokenNameIdentifier	 server Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RemoteSearchable	TokenNameIdentifier	 Remote Searchable
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
new	TokenNamenew	
RemoteSearchable	TokenNameIdentifier	 Remote Searchable
(	TokenNameLPAREN	
searchable	TokenNameIdentifier	 searchable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
serverFactory	TokenNameIdentifier	 server Factory
.	TokenNameDOT	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getLocalPort	TokenNameIdentifier	 get Local Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Naming	TokenNameIdentifier	 Naming
.	TokenNameDOT	
rebind	TokenNameIdentifier	 rebind
(	TokenNameLPAREN	
"//localhost:"	TokenNameStringLiteral	//localhost:
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
+	TokenNamePLUS	
"/Searchable"	TokenNameStringLiteral	/Searchable
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
stopServer	TokenNameIdentifier	 stop Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Naming	TokenNameIdentifier	 Naming
.	TokenNameDOT	
unbind	TokenNameIdentifier	 unbind
(	TokenNameLPAREN	
"//localhost:"	TokenNameStringLiteral	//localhost:
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
+	TokenNamePLUS	
"/Searchable"	TokenNameStringLiteral	/Searchable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RemoteException	TokenNameIdentifier	 Remote Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NotBoundException	TokenNameIdentifier	 Not Bound Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Searchable	TokenNameIdentifier	 Searchable
lookupRemote	TokenNameIdentifier	 lookup Remote
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Searchable	TokenNameIdentifier	 Searchable
)	TokenNameRPAREN	
Naming	TokenNameIdentifier	 Naming
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"//localhost:"	TokenNameStringLiteral	//localhost:
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
+	TokenNamePLUS	
"/Searchable"	TokenNameStringLiteral	/Searchable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
