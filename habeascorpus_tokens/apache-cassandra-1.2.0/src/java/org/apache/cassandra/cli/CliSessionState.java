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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
FramedTransportFactory	TokenNameIdentifier	 Framed Transport Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
.	TokenNameDOT	
ClientEncryptionOptions	TokenNameIdentifier	 Client Encryption Options
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
NodeProbe	TokenNameIdentifier	 Node Probe
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
TTransportFactory	TokenNameIdentifier	 T Transport Factory
;	TokenNameSEMICOLON	
/** * Used to hold the state for the CLI. */	TokenNameCOMMENT_JAVADOC	 Used to hold the state for the CLI. 
public	TokenNamepublic	
class	TokenNameclass	
CliSessionState	TokenNameIdentifier	 Cli Session State
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
hostName	TokenNameIdentifier	 host Name
;	TokenNameSEMICOLON	
// cassandra server name 	TokenNameCOMMENT_LINE	cassandra server name 
public	TokenNamepublic	
int	TokenNameint	
thriftPort	TokenNameIdentifier	 thrift Port
;	TokenNameSEMICOLON	
// cassandra server's thrift port 	TokenNameCOMMENT_LINE	cassandra server's thrift port 
public	TokenNamepublic	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// print stack traces when errors occur in the CLI 	TokenNameCOMMENT_LINE	print stack traces when errors occur in the CLI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
// cassandra login name (if SimpleAuthenticator is used) 	TokenNameCOMMENT_LINE	cassandra login name (if SimpleAuthenticator is used) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
// cassandra login password (if SimpleAuthenticator is used) 	TokenNameCOMMENT_LINE	cassandra login password (if SimpleAuthenticator is used) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
// cassandra keyspace user is authenticating 	TokenNameCOMMENT_LINE	cassandra keyspace user is authenticating 
public	TokenNamepublic	
boolean	TokenNameboolean	
batch	TokenNameIdentifier	 batch
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// enable/disable batch processing mode 	TokenNameCOMMENT_LINE	enable/disable batch processing mode 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// file to read commands from 	TokenNameCOMMENT_LINE	file to read commands from 
public	TokenNamepublic	
int	TokenNameint	
jmxPort	TokenNameIdentifier	 jmx Port
=	TokenNameEQUAL	
7199	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// JMX service port 	TokenNameCOMMENT_LINE	JMX service port 
public	TokenNamepublic	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// verbose output 	TokenNameCOMMENT_LINE	verbose output 
public	TokenNamepublic	
int	TokenNameint	
schema_mwt	TokenNameIdentifier	 schema mwt
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Schema migration wait time (secs.) 	TokenNameCOMMENT_LINE	Schema migration wait time (secs.) 
public	TokenNamepublic	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
transportFactory	TokenNameIdentifier	 transport Factory
=	TokenNameEQUAL	
new	TokenNamenew	
FramedTransportFactory	TokenNameIdentifier	 Framed Transport Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EncryptionOptions	TokenNameIdentifier	 Encryption Options
encOptions	TokenNameIdentifier	 enc Options
=	TokenNameEQUAL	
new	TokenNamenew	
ClientEncryptionOptions	TokenNameIdentifier	 Client Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Streams to read/write from */	TokenNameCOMMENT_BLOCK	 Streams to read/write from 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PrintStream	TokenNameIdentifier	 Print Stream
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CliSessionState	TokenNameIdentifier	 Cli Session State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
newOut	TokenNameIdentifier	 new Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
newOut	TokenNameIdentifier	 new Out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
newErr	TokenNameIdentifier	 new Err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
newErr	TokenNameIdentifier	 new Err
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
inFileMode	TokenNameIdentifier	 in File Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeProbe	TokenNameIdentifier	 Node Probe
getNodeProbe	TokenNameIdentifier	 get Node Probe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeProbe	TokenNameIdentifier	 Node Probe
(	TokenNameLPAREN	
hostName	TokenNameIdentifier	 host Name
,	TokenNameCOMMA	
jmxPort	TokenNameIdentifier	 jmx Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
printf	TokenNameIdentifier	 printf
(	TokenNameLPAREN	
"WARNING: Could not connect to the JMX on %s:%d, information won't be shown.%n%n"	TokenNameStringLiteral	WARNING: Could not connect to the JMX on %s:%d, information won't be shown.%n%n
,	TokenNameCOMMA	
hostName	TokenNameIdentifier	 host Name
,	TokenNameCOMMA	
jmxPort	TokenNameIdentifier	 jmx Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
