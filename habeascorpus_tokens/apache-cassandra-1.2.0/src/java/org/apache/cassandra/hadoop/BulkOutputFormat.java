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
List	TokenNameIdentifier	 List
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
Mutation	TokenNameIdentifier	 Mutation
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
public	TokenNamepublic	
class	TokenNameclass	
BulkOutputFormat	TokenNameIdentifier	 Bulk Output Format
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"you must set the keyspace with setColumnFamily()"	TokenNameStringLiteral	you must set the keyspace with setColumnFamily()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
BulkRecordWriter	TokenNameIdentifier	 Bulk Record Writer
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
BulkRecordWriter	TokenNameIdentifier	 Bulk Record Writer
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BulkRecordWriter	TokenNameIdentifier	 Bulk Record Writer
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
BulkRecordWriter	TokenNameIdentifier	 Bulk Record Writer
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
