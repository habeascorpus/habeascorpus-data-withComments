package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
SchemaLoader	TokenNameIdentifier	 Schema Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
CompactionManager	TokenNameIdentifier	 Compaction Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
.	TokenNameDOT	
CommitLog	TokenNameIdentifier	 Commit Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RecoveryManager2Test	TokenNameIdentifier	 Recovery Manager2 Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
RecoveryManager2Test	TokenNameIdentifier	 Recovery Manager2 Test
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
/* test that commit logs do not replay flushed data */	TokenNameCOMMENT_BLOCK	 test that commit logs do not replay flushed data 
public	TokenNamepublic	
void	TokenNamevoid	
testWithFlush	TokenNameIdentifier	 test With Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Flush everything that may be in the commit log now to start fresh 	TokenNameCOMMENT_LINE	Flush everything that may be in the commit log now to start fresh 
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
waitOnFutures	TokenNameIdentifier	 wait On Futures
(	TokenNameLPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
SYSTEM_KS	TokenNameIdentifier	 SYSTEM  KS
)	TokenNameRPAREN	
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
disableAutoCompaction	TokenNameIdentifier	 disable Auto Compaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add a row to another CF so we test skipping mutations within a not-entirely-flushed CF 	TokenNameCOMMENT_LINE	add a row to another CF so we test skipping mutations within a not-entirely-flushed CF 
insertRow	TokenNameIdentifier	 insert Row
(	TokenNameLPAREN	
"Standard2"	TokenNameStringLiteral	Standard2
,	TokenNameCOMMA	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
"key"	TokenNameStringLiteral	key
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
insertRow	TokenNameIdentifier	 insert Row
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Table	TokenNameIdentifier	 Table
table1	TokenNameIdentifier	 table1
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
table1	TokenNameIdentifier	 table1
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"forcing flush"	TokenNameStringLiteral	forcing flush
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"begin manual replay"	TokenNameStringLiteral	begin manual replay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// replay the commit log (nothing on Standard1 should be replayed since everything was flushed, so only the row on Standard2 	TokenNameCOMMENT_LINE	replay the commit log (nothing on Standard1 should be replayed since everything was flushed, so only the row on Standard2 
// will be replayed) 	TokenNameCOMMENT_LINE	will be replayed) 
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
resetUnsafe	TokenNameIdentifier	 reset Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
replayed	TokenNameIdentifier	 replayed
=	TokenNameEQUAL	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
replayed	TokenNameIdentifier	 replayed
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting only 1 replayed mutation, got "	TokenNameStringLiteral	Expecting only 1 replayed mutation, got 
+	TokenNamePLUS	
replayed	TokenNameIdentifier	 replayed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
insertRow	TokenNameIdentifier	 insert Row
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
(	TokenNameLPAREN	
"col1"	TokenNameStringLiteral	col1
,	TokenNameCOMMA	
"val1"	TokenNameStringLiteral	val1
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
