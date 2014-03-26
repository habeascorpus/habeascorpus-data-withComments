/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
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
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
Configuration	TokenNameIdentifier	 Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapreduce	TokenNameIdentifier	 mapreduce
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
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
.	TokenNameDOT	
login	TokenNameIdentifier	 login
.	TokenNameDOT	
LoginException	TokenNameIdentifier	 Login Exception
;	TokenNameSEMICOLON	
/** * The <code>ColumnFamilyOutputFormat</code> acts as a Hadoop-specific * OutputFormat that allows reduce tasks to store keys (and corresponding * values) as Cassandra rows (and respective columns) in a given * ColumnFamily. * * <p> * As is the case with the {@link ColumnFamilyInputFormat}, you need to set the * Keyspace and ColumnFamily in your * Hadoop job Configuration. The {@link ConfigHelper} class, through its * {@link ConfigHelper#setOutputColumnFamily} method, is provided to make this * simple. * </p> * * <p> * For the sake of performance, this class employs a lazy write-back caching * mechanism, where its record writer batches mutations created based on the * reduce's inputs (in a task-specific map), and periodically makes the changes * official by sending a batch mutate request to Cassandra. * </p> */	TokenNameCOMMENT_JAVADOC	 The <code>ColumnFamilyOutputFormat</code> acts as a Hadoop-specific OutputFormat that allows reduce tasks to store keys (and corresponding values) as Cassandra rows (and respective columns) in a given ColumnFamily. * <p> As is the case with the {@link ColumnFamilyInputFormat}, you need to set the Keyspace and ColumnFamily in your Hadoop job Configuration. The {@link ConfigHelper} class, through its {@link ConfigHelper#setOutputColumnFamily} method, is provided to make this simple. </p> * <p> For the sake of performance, this class employs a lazy write-back caching mechanism, where its record writer batches mutations created based on the reduce's inputs (in a task-specific map), and periodically makes the changes official by sending a batch mutate request to Cassandra. </p> 
public	TokenNamepublic	
class	TokenNameclass	
ColumnFamilyOutputFormat	TokenNameIdentifier	 Column Family Output Format
extends	TokenNameextends	
OutputFormat	TokenNameIdentifier	 Output Format
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mutation	TokenNameIdentifier	 Mutation
>>	TokenNameRIGHT_SHIFT	
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapred	TokenNameIdentifier	 mapred
.	TokenNameDOT	
OutputFormat	TokenNameIdentifier	 Output Format
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mutation	TokenNameIdentifier	 Mutation
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BATCH_THRESHOLD	TokenNameIdentifier	 BATCH  THRESHOLD
=	TokenNameEQUAL	
"mapreduce.output.columnfamilyoutputformat.batch.threshold"	TokenNameStringLiteral	mapreduce.output.columnfamilyoutputformat.batch.threshold
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
QUEUE_SIZE	TokenNameIdentifier	 QUEUE  SIZE
=	TokenNameEQUAL	
"mapreduce.output.columnfamilyoutputformat.queue.size"	TokenNameStringLiteral	mapreduce.output.columnfamilyoutputformat.queue.size
;	TokenNameSEMICOLON	
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
ColumnFamilyOutputFormat	TokenNameIdentifier	 Column Family Output Format
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Check for validity of the output-specification for the job. * * @param context * information about the job * @throws IOException * when output should not be attempted */	TokenNameCOMMENT_JAVADOC	 Check for validity of the output-specification for the job. * @param context information about the job @throws IOException when output should not be attempted 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
checkOutputSpecs	TokenNameIdentifier	 check Output Specs
(	TokenNameLPAREN	
JobContext	TokenNameIdentifier	 Job Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkOutputSpecs	TokenNameIdentifier	 check Output Specs
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkOutputSpecs	TokenNameIdentifier	 check Output Specs
(	TokenNameLPAREN	
Configuration	TokenNameIdentifier	 Configuration
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputKeyspace	TokenNameIdentifier	 get Output Keyspace
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You must set the keyspace with setOutputKeyspace()"	TokenNameStringLiteral	You must set the keyspace with setOutputKeyspace()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputPartitioner	TokenNameIdentifier	 get Output Partitioner
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You must set the output partitioner to the one used by your Cassandra cluster"	TokenNameStringLiteral	You must set the output partitioner to the one used by your Cassandra cluster
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputInitialAddress	TokenNameIdentifier	 get Output Initial Address
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You must set the initial output address to a Cassandra node"	TokenNameStringLiteral	You must set the initial output address to a Cassandra node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The OutputCommitter for this format does not write any data to the DFS. * * @param context * the task context * @return an output committer * @throws IOException * @throws InterruptedException */	TokenNameCOMMENT_JAVADOC	 The OutputCommitter for this format does not write any data to the DFS. * @param context the task context @return an output committer @throws IOException @throws InterruptedException 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
OutputCommitter	TokenNameIdentifier	 Output Committer
getOutputCommitter	TokenNameIdentifier	 get Output Committer
(	TokenNameLPAREN	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NullOutputCommitter	TokenNameIdentifier	 Null Output Committer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fills the deprecated OutputFormat interface for streaming. */	TokenNameCOMMENT_JAVADOC	 Fills the deprecated OutputFormat interface for streaming. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
checkOutputSpecs	TokenNameIdentifier	 check Output Specs
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
FileSystem	TokenNameIdentifier	 File System
filesystem	TokenNameIdentifier	 filesystem
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapred	TokenNameIdentifier	 mapred
.	TokenNameDOT	
JobConf	TokenNameIdentifier	 Job Conf
job	TokenNameIdentifier	 job
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkOutputSpecs	TokenNameIdentifier	 check Output Specs
(	TokenNameLPAREN	
job	TokenNameIdentifier	 job
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fills the deprecated OutputFormat interface for streaming. */	TokenNameCOMMENT_JAVADOC	 Fills the deprecated OutputFormat interface for streaming. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ColumnFamilyRecordWriter	TokenNameIdentifier	 Column Family Record Writer
getRecordWriter	TokenNameIdentifier	 get Record Writer
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
FileSystem	TokenNameIdentifier	 File System
filesystem	TokenNameIdentifier	 filesystem
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapred	TokenNameIdentifier	 mapred
.	TokenNameDOT	
JobConf	TokenNameIdentifier	 Job Conf
job	TokenNameIdentifier	 job
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Progressable	TokenNameIdentifier	 Progressable
progress	TokenNameIdentifier	 progress
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ColumnFamilyRecordWriter	TokenNameIdentifier	 Column Family Record Writer
(	TokenNameLPAREN	
job	TokenNameIdentifier	 job
,	TokenNameCOMMA	
new	TokenNamenew	
Progressable	TokenNameIdentifier	 Progressable
(	TokenNameLPAREN	
progress	TokenNameIdentifier	 progress
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the {@link RecordWriter} for the given task. * * @param context * the information about the current task. * @return a {@link RecordWriter} to write the output for the job. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Get the {@link RecordWriter} for the given task. * @param context the information about the current task. @return a {@link RecordWriter} to write the output for the job. @throws IOException 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ColumnFamilyRecordWriter	TokenNameIdentifier	 Column Family Record Writer
getRecordWriter	TokenNameIdentifier	 get Record Writer
(	TokenNameLPAREN	
final	TokenNamefinal	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ColumnFamilyRecordWriter	TokenNameIdentifier	 Column Family Record Writer
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a client based on the given socket that points to the configured * keyspace, and is logged in with the configured credentials. * * @param socket a socket pointing to a particular node, seed or otherwise * @param conf a job configuration * @return a cassandra client * @throws InvalidRequestException * @throws TException * @throws AuthenticationException * @throws AuthorizationException */	TokenNameCOMMENT_JAVADOC	 Return a client based on the given socket that points to the configured keyspace, and is logged in with the configured credentials. * @param socket a socket pointing to a particular node, seed or otherwise @param conf a job configuration @return a cassandra client @throws InvalidRequestException @throws TException @throws AuthenticationException @throws AuthorizationException 
public	TokenNamepublic	
static	TokenNamestatic	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Client	TokenNameIdentifier	 Client
createAuthenticatedClient	TokenNameIdentifier	 create Authenticated Client
(	TokenNameLPAREN	
TSocket	TokenNameIdentifier	 T Socket
socket	TokenNameIdentifier	 socket
,	TokenNameCOMMA	
Configuration	TokenNameIdentifier	 Configuration
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
TException	TokenNameIdentifier	 T Exception
,	TokenNameCOMMA	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
,	TokenNameCOMMA	
AuthorizationException	TokenNameIdentifier	 Authorization Exception
,	TokenNameCOMMA	
LoginException	TokenNameIdentifier	 Login Exception
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Creating authenticated client for CF output format"	TokenNameStringLiteral	Creating authenticated client for CF output format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TTransport	TokenNameIdentifier	 T Transport
transport	TokenNameIdentifier	 transport
=	TokenNameEQUAL	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputTransportFactory	TokenNameIdentifier	 get Output Transport Factory
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
.	TokenNameDOT	
openTransport	TokenNameIdentifier	 open Transport
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Client	TokenNameIdentifier	 Client
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Cassandra	TokenNameIdentifier	 Cassandra
.	TokenNameDOT	
Client	TokenNameIdentifier	 Client
(	TokenNameLPAREN	
binaryProtocol	TokenNameIdentifier	 binary Protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
set_keyspace	TokenNameIdentifier	 set keyspace
(	TokenNameLPAREN	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputKeyspace	TokenNameIdentifier	 get Output Keyspace
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputKeyspaceUserName	TokenNameIdentifier	 get Output Keyspace User Name
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
creds	TokenNameIdentifier	 creds
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
creds	TokenNameIdentifier	 creds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IAuthenticator	TokenNameIdentifier	 I Authenticator
.	TokenNameDOT	
USERNAME_KEY	TokenNameIdentifier	 USERNAME  KEY
,	TokenNameCOMMA	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputKeyspaceUserName	TokenNameIdentifier	 get Output Keyspace User Name
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
creds	TokenNameIdentifier	 creds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IAuthenticator	TokenNameIdentifier	 I Authenticator
.	TokenNameDOT	
PASSWORD_KEY	TokenNameIdentifier	 PASSWORD  KEY
,	TokenNameCOMMA	
ConfigHelper	TokenNameIdentifier	 Config Helper
.	TokenNameDOT	
getOutputKeyspacePassword	TokenNameIdentifier	 get Output Keyspace Password
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AuthenticationRequest	TokenNameIdentifier	 Authentication Request
authRequest	TokenNameIdentifier	 auth Request
=	TokenNameEQUAL	
new	TokenNamenew	
AuthenticationRequest	TokenNameIdentifier	 Authentication Request
(	TokenNameLPAREN	
creds	TokenNameIdentifier	 creds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
login	TokenNameIdentifier	 login
(	TokenNameLPAREN	
authRequest	TokenNameIdentifier	 auth Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Authenticated client for CF output format created successfully"	TokenNameStringLiteral	Authenticated client for CF output format created successfully
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An {@link OutputCommitter} that does nothing. */	TokenNameCOMMENT_JAVADOC	 An {@link OutputCommitter} that does nothing. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NullOutputCommitter	TokenNameIdentifier	 Null Output Committer
extends	TokenNameextends	
OutputCommitter	TokenNameIdentifier	 Output Committer
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
abortTask	TokenNameIdentifier	 abort Task
(	TokenNameLPAREN	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
taskContext	TokenNameIdentifier	 task Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleanupJob	TokenNameIdentifier	 cleanup Job
(	TokenNameLPAREN	
JobContext	TokenNameIdentifier	 Job Context
jobContext	TokenNameIdentifier	 job Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
commitTask	TokenNameIdentifier	 commit Task
(	TokenNameLPAREN	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
taskContext	TokenNameIdentifier	 task Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
needsTaskCommit	TokenNameIdentifier	 needs Task Commit
(	TokenNameLPAREN	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
taskContext	TokenNameIdentifier	 task Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setupJob	TokenNameIdentifier	 setup Job
(	TokenNameLPAREN	
JobContext	TokenNameIdentifier	 Job Context
jobContext	TokenNameIdentifier	 job Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setupTask	TokenNameIdentifier	 setup Task
(	TokenNameLPAREN	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
taskContext	TokenNameIdentifier	 task Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
