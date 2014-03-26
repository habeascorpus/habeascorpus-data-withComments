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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
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
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
;	TokenNameSEMICOLON	
/** * * Used to process, and act upon the arguments passed to the CLI. * */	TokenNameCOMMENT_JAVADOC	 * Used to process, and act upon the arguments passed to the CLI. 
public	TokenNamepublic	
class	TokenNameclass	
CliOptions	TokenNameIdentifier	 Cli Options
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CLIOptions	TokenNameIdentifier	 CLI Options
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
// Info about command line options 	TokenNameCOMMENT_LINE	Info about command line options 
// Name of the command line tool (used for error messages) 	TokenNameCOMMENT_LINE	Name of the command line tool (used for error messages) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOOL_NAME	TokenNameIdentifier	 TOOL  NAME
=	TokenNameEQUAL	
"cassandra-cli"	TokenNameStringLiteral	cassandra-cli
;	TokenNameSEMICOLON	
// Command line options 	TokenNameCOMMENT_LINE	Command line options 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HOST_OPTION	TokenNameIdentifier	 HOST  OPTION
=	TokenNameEQUAL	
"host"	TokenNameStringLiteral	host
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PORT_OPTION	TokenNameIdentifier	 PORT  OPTION
=	TokenNameEQUAL	
"port"	TokenNameStringLiteral	port
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSPORT_FACTORY	TokenNameIdentifier	 TRANSPORT  FACTORY
=	TokenNameEQUAL	
"transport-factory"	TokenNameStringLiteral	transport-factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEBUG_OPTION	TokenNameIdentifier	 DEBUG  OPTION
=	TokenNameEQUAL	
"debug"	TokenNameStringLiteral	debug
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
=	TokenNameEQUAL	
"username"	TokenNameStringLiteral	username
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
=	TokenNameEQUAL	
"password"	TokenNameStringLiteral	password
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEYSPACE_OPTION	TokenNameIdentifier	 KEYSPACE  OPTION
=	TokenNameEQUAL	
"keyspace"	TokenNameStringLiteral	keyspace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BATCH_OPTION	TokenNameIdentifier	 BATCH  OPTION
=	TokenNameEQUAL	
"batch"	TokenNameStringLiteral	batch
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HELP_OPTION	TokenNameIdentifier	 HELP  OPTION
=	TokenNameEQUAL	
"help"	TokenNameStringLiteral	help
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_OPTION	TokenNameIdentifier	 FILE  OPTION
=	TokenNameEQUAL	
"file"	TokenNameStringLiteral	file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JMX_PORT_OPTION	TokenNameIdentifier	 JMX  PORT  OPTION
=	TokenNameEQUAL	
"jmxport"	TokenNameStringLiteral	jmxport
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VERBOSE_OPTION	TokenNameIdentifier	 VERBOSE  OPTION
=	TokenNameEQUAL	
"verbose"	TokenNameStringLiteral	verbose
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_MIGRATION_WAIT_TIME	TokenNameIdentifier	 SCHEMA  MIGRATION  WAIT  TIME
=	TokenNameEQUAL	
"schema-mwt"	TokenNameStringLiteral	schema-mwt
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SSL_TRUSTSTORE	TokenNameIdentifier	 SSL  TRUSTSTORE
=	TokenNameEQUAL	
"truststore"	TokenNameStringLiteral	truststore
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SSL_TRUSTSTORE_PW	TokenNameIdentifier	 SSL  TRUSTSTORE  PW
=	TokenNameEQUAL	
"truststore-password"	TokenNameStringLiteral	truststore-password
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SSL_PROTOCOL	TokenNameIdentifier	 SSL  PROTOCOL
=	TokenNameEQUAL	
"ssl-protocol"	TokenNameStringLiteral	ssl-protocol
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SSL_ALGORITHM	TokenNameIdentifier	 SSL  ALGORITHM
=	TokenNameEQUAL	
"ssl-alg"	TokenNameStringLiteral	ssl-alg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SSL_STORE_TYPE	TokenNameIdentifier	 SSL  STORE  TYPE
=	TokenNameEQUAL	
"store-type"	TokenNameStringLiteral	store-type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SSL_CIPHER_SUITES	TokenNameIdentifier	 SSL  CIPHER  SUITES
=	TokenNameEQUAL	
"ssl-ciphers"	TokenNameStringLiteral	ssl-ciphers
;	TokenNameSEMICOLON	
// Default values for optional command line arguments 	TokenNameCOMMENT_LINE	Default values for optional command line arguments 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
=	TokenNameEQUAL	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_THRIFT_PORT	TokenNameIdentifier	 DEFAULT  THRIFT  PORT
=	TokenNameEQUAL	
9160	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Register the command line options and their properties (such as 	TokenNameCOMMENT_LINE	Register the command line options and their properties (such as 
// whether they take an extra argument, etc. 	TokenNameCOMMENT_LINE	whether they take an extra argument, etc. 
static	TokenNamestatic	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
CLIOptions	TokenNameIdentifier	 CLI Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"h"	TokenNameStringLiteral	h
,	TokenNameCOMMA	
HOST_OPTION	TokenNameIdentifier	 HOST  OPTION
,	TokenNameCOMMA	
"HOSTNAME"	TokenNameStringLiteral	HOSTNAME
,	TokenNameCOMMA	
"cassandra server's host name"	TokenNameStringLiteral	cassandra server's host name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"p"	TokenNameStringLiteral	p
,	TokenNameCOMMA	
PORT_OPTION	TokenNameIdentifier	 PORT  OPTION
,	TokenNameCOMMA	
"PORT"	TokenNameStringLiteral	PORT
,	TokenNameCOMMA	
"cassandra server's thrift port"	TokenNameStringLiteral	cassandra server's thrift port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
,	TokenNameCOMMA	
"USERNAME"	TokenNameStringLiteral	USERNAME
,	TokenNameCOMMA	
"user name for cassandra authentication"	TokenNameStringLiteral	user name for cassandra authentication
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"pw"	TokenNameStringLiteral	pw
,	TokenNameCOMMA	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
,	TokenNameCOMMA	
"PASSWORD"	TokenNameStringLiteral	PASSWORD
,	TokenNameCOMMA	
"password for cassandra authentication"	TokenNameStringLiteral	password for cassandra authentication
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"k"	TokenNameStringLiteral	k
,	TokenNameCOMMA	
KEYSPACE_OPTION	TokenNameIdentifier	 KEYSPACE  OPTION
,	TokenNameCOMMA	
"KEYSPACE"	TokenNameStringLiteral	KEYSPACE
,	TokenNameCOMMA	
"cassandra keyspace user is authenticated against"	TokenNameStringLiteral	cassandra keyspace user is authenticated against
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
FILE_OPTION	TokenNameIdentifier	 FILE  OPTION
,	TokenNameCOMMA	
"FILENAME"	TokenNameStringLiteral	FILENAME
,	TokenNameCOMMA	
"load statements from the specific file"	TokenNameStringLiteral	load statements from the specific file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
JMX_PORT_OPTION	TokenNameIdentifier	 JMX  PORT  OPTION
,	TokenNameCOMMA	
"JMX-PORT"	TokenNameStringLiteral	JMX-PORT
,	TokenNameCOMMA	
"JMX service port"	TokenNameStringLiteral	JMX service port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SCHEMA_MIGRATION_WAIT_TIME	TokenNameIdentifier	 SCHEMA  MIGRATION  WAIT  TIME
,	TokenNameCOMMA	
"TIME"	TokenNameStringLiteral	TIME
,	TokenNameCOMMA	
"Schema migration wait time (secs.), default is 10 secs"	TokenNameStringLiteral	Schema migration wait time (secs.), default is 10 secs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"tf"	TokenNameStringLiteral	tf
,	TokenNameCOMMA	
TRANSPORT_FACTORY	TokenNameIdentifier	 TRANSPORT  FACTORY
,	TokenNameCOMMA	
"TRANSPORT-FACTORY"	TokenNameStringLiteral	TRANSPORT-FACTORY
,	TokenNameCOMMA	
"Fully-qualified TTransportFactory class name for creating a connection to cassandra"	TokenNameStringLiteral	Fully-qualified TTransportFactory class name for creating a connection to cassandra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ssl connection-related options 	TokenNameCOMMENT_LINE	ssl connection-related options 
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"ts"	TokenNameStringLiteral	ts
,	TokenNameCOMMA	
SSL_TRUSTSTORE	TokenNameIdentifier	 SSL  TRUSTSTORE
,	TokenNameCOMMA	
"TRUSTSTORE"	TokenNameStringLiteral	TRUSTSTORE
,	TokenNameCOMMA	
"SSL: full path to truststore"	TokenNameStringLiteral	SSL: full path to truststore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"tspw"	TokenNameStringLiteral	tspw
,	TokenNameCOMMA	
SSL_TRUSTSTORE_PW	TokenNameIdentifier	 SSL  TRUSTSTORE  PW
,	TokenNameCOMMA	
"TRUSTSTORE-PASSWORD"	TokenNameStringLiteral	TRUSTSTORE-PASSWORD
,	TokenNameCOMMA	
"SSL: full path to truststore"	TokenNameStringLiteral	SSL: full path to truststore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"prtcl"	TokenNameStringLiteral	prtcl
,	TokenNameCOMMA	
SSL_PROTOCOL	TokenNameIdentifier	 SSL  PROTOCOL
,	TokenNameCOMMA	
"PROTOCOL"	TokenNameStringLiteral	PROTOCOL
,	TokenNameCOMMA	
"SSL: connections protocol to use (default: TLS)"	TokenNameStringLiteral	SSL: connections protocol to use (default: TLS)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"alg"	TokenNameStringLiteral	alg
,	TokenNameCOMMA	
SSL_ALGORITHM	TokenNameIdentifier	 SSL  ALGORITHM
,	TokenNameCOMMA	
"ALGORITHM"	TokenNameStringLiteral	ALGORITHM
,	TokenNameCOMMA	
"SSL: algorithm (default: SunX509)"	TokenNameStringLiteral	SSL: algorithm (default: SunX509)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"st"	TokenNameStringLiteral	st
,	TokenNameCOMMA	
SSL_STORE_TYPE	TokenNameIdentifier	 SSL  STORE  TYPE
,	TokenNameCOMMA	
"STORE-TYPE"	TokenNameStringLiteral	STORE-TYPE
,	TokenNameCOMMA	
"SSL: type of store"	TokenNameStringLiteral	SSL: type of store
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"ciphers"	TokenNameStringLiteral	ciphers
,	TokenNameCOMMA	
SSL_CIPHER_SUITES	TokenNameIdentifier	 SSL  CIPHER  SUITES
,	TokenNameCOMMA	
"CIPHER-SUITES"	TokenNameStringLiteral	CIPHER-SUITES
,	TokenNameCOMMA	
"SSL: comma-separated list of encryption suites to use"	TokenNameStringLiteral	SSL: comma-separated list of encryption suites to use
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// options without argument 	TokenNameCOMMENT_LINE	options without argument 
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
BATCH_OPTION	TokenNameIdentifier	 BATCH  OPTION
,	TokenNameCOMMA	
"enabled batch mode (suppress output; errors are fatal)"	TokenNameStringLiteral	enabled batch mode (suppress output; errors are fatal)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
DEBUG_OPTION	TokenNameIdentifier	 DEBUG  OPTION
,	TokenNameCOMMA	
"display stack-traces (NOTE: We print strack-traces in the places where it makes sense even without --debug)"	TokenNameStringLiteral	display stack-traces (NOTE: We print strack-traces in the places where it makes sense even without --debug)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
HELP_OPTION	TokenNameIdentifier	 HELP  OPTION
,	TokenNameCOMMA	
"usage help"	TokenNameStringLiteral	usage help
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
,	TokenNameCOMMA	
VERBOSE_OPTION	TokenNameIdentifier	 VERBOSE  OPTION
,	TokenNameCOMMA	
"verbose output when using batch mode"	TokenNameStringLiteral	verbose output when using batch mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
HelpFormatter	TokenNameIdentifier	 Help Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
printHelp	TokenNameIdentifier	 print Help
(	TokenNameLPAREN	
TOOL_NAME	TokenNameIdentifier	 TOOL  NAME
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
processArgs	TokenNameIdentifier	 process Args
(	TokenNameLPAREN	
CliSessionState	TokenNameIdentifier	 Cli Session State
css	TokenNameIdentifier	 css
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CommandLineParser	TokenNameIdentifier	 Command Line Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
GnuParser	TokenNameIdentifier	 Gnu Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
CommandLine	TokenNameIdentifier	 Command Line
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
HOST_OPTION	TokenNameIdentifier	 HOST  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
hostName	TokenNameIdentifier	 host Name
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
HOST_OPTION	TokenNameIdentifier	 HOST  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
hostName	TokenNameIdentifier	 host Name
=	TokenNameEQUAL	
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
TRANSPORT_FACTORY	TokenNameIdentifier	 TRANSPORT  FACTORY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
transportFactory	TokenNameIdentifier	 transport Factory
=	TokenNameEQUAL	
validateAndSetTransportFactory	TokenNameIdentifier	 validate And Set Transport Factory
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
TRANSPORT_FACTORY	TokenNameIdentifier	 TRANSPORT  FACTORY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
DEBUG_OPTION	TokenNameIdentifier	 DEBUG  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look for optional args. 	TokenNameCOMMENT_LINE	Look for optional args. 
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
PORT_OPTION	TokenNameIdentifier	 PORT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
thriftPort	TokenNameIdentifier	 thrift Port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
PORT_OPTION	TokenNameIdentifier	 PORT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
thriftPort	TokenNameIdentifier	 thrift Port
=	TokenNameEQUAL	
DEFAULT_THRIFT_PORT	TokenNameIdentifier	 DEFAULT  THRIFT  PORT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look for authentication credentials (username and password) 	TokenNameCOMMENT_LINE	Look for authentication credentials (username and password) 
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look for keyspace 	TokenNameCOMMENT_LINE	Look for keyspace 
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
KEYSPACE_OPTION	TokenNameIdentifier	 KEYSPACE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
KEYSPACE_OPTION	TokenNameIdentifier	 KEYSPACE  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
BATCH_OPTION	TokenNameIdentifier	 BATCH  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
batch	TokenNameIdentifier	 batch
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
FILE_OPTION	TokenNameIdentifier	 FILE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
FILE_OPTION	TokenNameIdentifier	 FILE  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
JMX_PORT_OPTION	TokenNameIdentifier	 JMX  PORT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
jmxPort	TokenNameIdentifier	 jmx Port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
JMX_PORT_OPTION	TokenNameIdentifier	 JMX  PORT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
HELP_OPTION	TokenNameIdentifier	 HELP  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
VERBOSE_OPTION	TokenNameIdentifier	 VERBOSE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SCHEMA_MIGRATION_WAIT_TIME	TokenNameIdentifier	 SCHEMA  MIGRATION  WAIT  TIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
schema_mwt	TokenNameIdentifier	 schema mwt
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SCHEMA_MIGRATION_WAIT_TIME	TokenNameIdentifier	 SCHEMA  MIGRATION  WAIT  TIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SSL_TRUSTSTORE	TokenNameIdentifier	 SSL  TRUSTSTORE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
truststore	TokenNameIdentifier	 truststore
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SSL_TRUSTSTORE	TokenNameIdentifier	 SSL  TRUSTSTORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SSL_TRUSTSTORE_PW	TokenNameIdentifier	 SSL  TRUSTSTORE  PW
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
truststore_password	TokenNameIdentifier	 truststore password
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SSL_TRUSTSTORE_PW	TokenNameIdentifier	 SSL  TRUSTSTORE  PW
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SSL_PROTOCOL	TokenNameIdentifier	 SSL  PROTOCOL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SSL_PROTOCOL	TokenNameIdentifier	 SSL  PROTOCOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SSL_ALGORITHM	TokenNameIdentifier	 SSL  ALGORITHM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
algorithm	TokenNameIdentifier	 algorithm
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SSL_ALGORITHM	TokenNameIdentifier	 SSL  ALGORITHM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SSL_STORE_TYPE	TokenNameIdentifier	 SSL  STORE  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
store_type	TokenNameIdentifier	 store type
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SSL_STORE_TYPE	TokenNameIdentifier	 SSL  STORE  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
hasOption	TokenNameIdentifier	 has Option
(	TokenNameLPAREN	
SSL_CIPHER_SUITES	TokenNameIdentifier	 SSL  CIPHER  SUITES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
encOptions	TokenNameIdentifier	 enc Options
.	TokenNameDOT	
cipher_suites	TokenNameIdentifier	 cipher suites
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getOptionValue	TokenNameIdentifier	 get Option Value
(	TokenNameLPAREN	
SSL_CIPHER_SUITES	TokenNameIdentifier	 SSL  CIPHER  SUITES
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Abort if there are any unrecognized arguments left 	TokenNameCOMMENT_LINE	Abort if there are any unrecognized arguments left 
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getArgs	TokenNameIdentifier	 get Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
printf	TokenNameIdentifier	 printf
(	TokenNameLPAREN	
"Unknown argument: %s%n"	TokenNameStringLiteral	Unknown argument: %s%n
,	TokenNameCOMMA	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getArgs	TokenNameIdentifier	 get Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CLIOptions	TokenNameIdentifier	 CLI Options
extends	TokenNameextends	
Options	TokenNameIdentifier	 Options
{	TokenNameLBRACE	
/** * Add option with argument and argument name * @param opt shortcut for option name * @param longOpt complete option name * @param argName argument name * @param description description of the option * @return updated Options object */	TokenNameCOMMENT_JAVADOC	 Add option with argument and argument name @param opt shortcut for option name @param longOpt complete option name @param argName argument name @param description description of the option @return updated Options object 
public	TokenNamepublic	
Options	TokenNameIdentifier	 Options
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
opt	TokenNameIdentifier	 opt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
longOpt	TokenNameIdentifier	 long Opt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
argName	TokenNameIdentifier	 arg Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Option	TokenNameIdentifier	 Option
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
new	TokenNamenew	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
,	TokenNameCOMMA	
longOpt	TokenNameIdentifier	 long Opt
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
setArgName	TokenNameIdentifier	 set Arg Name
(	TokenNameLPAREN	
argName	TokenNameIdentifier	 arg Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add option without argument * @param opt shortcut for option name * @param longOpt complete option name * @param description description of the option * @return updated Options object */	TokenNameCOMMENT_JAVADOC	 Add option without argument @param opt shortcut for option name @param longOpt complete option name @param description description of the option @return updated Options object 
public	TokenNamepublic	
Options	TokenNameIdentifier	 Options
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
opt	TokenNameIdentifier	 opt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
longOpt	TokenNameIdentifier	 long Opt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
new	TokenNamenew	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
,	TokenNameCOMMA	
longOpt	TokenNameIdentifier	 long Opt
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
validateAndSetTransportFactory	TokenNameIdentifier	 validate And Set Transport Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
transportFactory	TokenNameIdentifier	 transport Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
transportFactory	TokenNameIdentifier	 transport Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"transport factory '%s' "	TokenNameStringLiteral	transport factory '%s' 
+	TokenNamePLUS	
"not derived from TTransportFactory"	TokenNameStringLiteral	not derived from TTransportFactory
,	TokenNameCOMMA	
transportFactory	TokenNameIdentifier	 transport Factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
TTransportFactory	TokenNameIdentifier	 T Transport Factory
)	TokenNameRPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
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
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Cannot create a transport factory '%s'."	TokenNameStringLiteral	Cannot create a transport factory '%s'.
,	TokenNameCOMMA	
transportFactory	TokenNameIdentifier	 transport Factory
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
