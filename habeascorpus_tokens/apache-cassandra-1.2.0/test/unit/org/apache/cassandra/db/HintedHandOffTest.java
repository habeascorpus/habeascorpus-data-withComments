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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeUnit	TokenNameIdentifier	 Time Unit
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
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
QueryPath	TokenNameIdentifier	 Query Path
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
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
HintedHandOffTest	TokenNameIdentifier	 Hinted Hand Off Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TABLE4	TokenNameIdentifier	 TABL E4
=	TokenNameEQUAL	
"Keyspace4"	TokenNameStringLiteral	Keyspace4
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STANDARD1_CF	TokenNameIdentifier	 STANDAR D1  CF
=	TokenNameEQUAL	
"Standard1"	TokenNameStringLiteral	Standard1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COLUMN1	TokenNameIdentifier	 COLUM N1
=	TokenNameEQUAL	
"column1"	TokenNameStringLiteral	column1
;	TokenNameSEMICOLON	
// Test compaction of hints column family. It shouldn't remove all columns on compaction. 	TokenNameCOMMENT_LINE	Test compaction of hints column family. It shouldn't remove all columns on compaction. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCompactionOfHintsCF	TokenNameIdentifier	 test Compaction Of Hints CF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// prepare hints column family 	TokenNameCOMMENT_LINE	prepare hints column family 
Table	TokenNameIdentifier	 Table
systemTable	TokenNameIdentifier	 system Table
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
hintStore	TokenNameIdentifier	 hint Store
=	TokenNameEQUAL	
systemTable	TokenNameIdentifier	 system Table
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
SystemTable	TokenNameIdentifier	 System Table
.	TokenNameDOT	
HINTS_CF	TokenNameIdentifier	 HINTS  CF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
clearUnsafe	TokenNameIdentifier	 clear Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
gcGraceSeconds	TokenNameIdentifier	 gc Grace Seconds
(	TokenNameLPAREN	
36000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 10 hours 	TokenNameCOMMENT_LINE	10 hours 
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
setCompactionStrategyClass	TokenNameIdentifier	 set Compaction Strategy Class
(	TokenNameLPAREN	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
disableAutoCompaction	TokenNameIdentifier	 disable Auto Compaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// insert 1 hint 	TokenNameCOMMENT_LINE	insert 1 hint 
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
TABLE4	TokenNameIdentifier	 TABL E4
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
STANDARD1_CF	TokenNameIdentifier	 STANDAR D1  CF
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
COLUMN1	TokenNameIdentifier	 COLUM N1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RowMutation	TokenNameIdentifier	 Row Mutation
.	TokenNameDOT	
hintFor	TokenNameIdentifier	 hint For
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
randomUUID	TokenNameIdentifier	 random UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// flush data to disk 	TokenNameCOMMENT_LINE	flush data to disk 
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
forceBlockingFlush	TokenNameIdentifier	 force Blocking Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
getSSTables	TokenNameIdentifier	 get SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// submit compaction 	TokenNameCOMMENT_LINE	submit compaction 
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
waitOnFuture	TokenNameIdentifier	 wait On Future
(	TokenNameLPAREN	
HintedHandOffManager	TokenNameIdentifier	 Hinted Hand Off Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
CompactionManager	TokenNameIdentifier	 Compaction Manager
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getActiveCompactions	TokenNameIdentifier	 get Active Compactions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
TimeUnit	TokenNameIdentifier	 Time Unit
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// single row should not be removed because of gc_grace_seconds 	TokenNameCOMMENT_LINE	single row should not be removed because of gc_grace_seconds 
// is 10 hours and there are no any tombstones in sstable 	TokenNameCOMMENT_LINE	is 10 hours and there are no any tombstones in sstable 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hintStore	TokenNameIdentifier	 hint Store
.	TokenNameDOT	
getSSTables	TokenNameIdentifier	 get SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
