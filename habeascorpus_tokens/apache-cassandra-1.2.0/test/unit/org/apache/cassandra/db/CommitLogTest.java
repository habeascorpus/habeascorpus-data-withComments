/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Checksum	TokenNameIdentifier	 Checksum
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
.	TokenNameDOT	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CommitLogTest	TokenNameIdentifier	 Commit Log Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithEmptyLog	TokenNameIdentifier	 test Recovery With Empty Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpFile	TokenNameIdentifier	 tmp File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithShortLog	TokenNameIdentifier	 test Recovery With Short Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// force EOF while reading log 	TokenNameCOMMENT_LINE	force EOF while reading log 
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithShortSize	TokenNameIdentifier	 test Recovery With Short Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testRecovery	TokenNameIdentifier	 test Recovery
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithShortCheckSum	TokenNameIdentifier	 test Recovery With Short Check Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testRecovery	TokenNameIdentifier	 test Recovery
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithGarbageLog	TokenNameIdentifier	 test Recovery With Garbage Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
garbage	TokenNameIdentifier	 garbage
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextBytes	TokenNameIdentifier	 next Bytes
(	TokenNameLPAREN	
garbage	TokenNameIdentifier	 garbage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRecovery	TokenNameIdentifier	 test Recovery
(	TokenNameLPAREN	
garbage	TokenNameIdentifier	 garbage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithBadSizeChecksum	TokenNameIdentifier	 test Recovery With Bad Size Checksum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Checksum	TokenNameIdentifier	 Checksum
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
~	TokenNameTWIDDLE	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithZeroSegmentSizeArgument	TokenNameIdentifier	 test Recovery With Zero Segment Size Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// many different combinations of 4 bytes (garbage) will be read as zero by readInt() 	TokenNameCOMMENT_LINE	many different combinations of 4 bytes (garbage) will be read as zero by readInt() 
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// zero size, but no EOF 	TokenNameCOMMENT_LINE	zero size, but no EOF 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRecoveryWithNegativeSizeArgument	TokenNameIdentifier	 test Recovery With Negative Size Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// garbage from a partial/bad flush could be read as a negative size even if there is no EOF 	TokenNameCOMMENT_LINE	garbage from a partial/bad flush could be read as a negative size even if there is no EOF 
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// negative size, but no EOF 	TokenNameCOMMENT_LINE	negative size, but no EOF 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDontDeleteIfDirty	TokenNameIdentifier	 test Dont Delete If Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
resetUnsafe	TokenNameIdentifier	 reset Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Roughly 32 MB mutation 	TokenNameCOMMENT_LINE	Roughly 32 MB mutation 
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k"	TokenNameStringLiteral	k
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
"Standard1"	TokenNameStringLiteral	Standard1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getCommitLogSegmentSize	TokenNameIdentifier	 get Commit Log Segment Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adding it 5 times 	TokenNameCOMMENT_LINE	Adding it 5 times 
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adding new mutation on another CF 	TokenNameCOMMENT_LINE	Adding new mutation on another CF 
RowMutation	TokenNameIdentifier	 Row Mutation
rm2	TokenNameIdentifier	 rm2
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k"	TokenNameStringLiteral	k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm2	TokenNameIdentifier	 rm2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Standard2"	TokenNameStringLiteral	Standard2
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm2	TokenNameIdentifier	 rm2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 2 segments, got "	TokenNameStringLiteral	Expecting 2 segments, got 
+	TokenNamePLUS	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
cfid2	TokenNameIdentifier	 cfid2
=	TokenNameEQUAL	
rm2	TokenNameIdentifier	 rm2
.	TokenNameDOT	
getColumnFamilyIds	TokenNameIdentifier	 get Column Family Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
discardCompletedSegments	TokenNameIdentifier	 discard Completed Segments
(	TokenNameLPAREN	
cfid2	TokenNameIdentifier	 cfid2
,	TokenNameCOMMA	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assert we still have both our segment 	TokenNameCOMMENT_LINE	Assert we still have both our segment 
assert	TokenNameassert	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 2 segments, got "	TokenNameStringLiteral	Expecting 2 segments, got 
+	TokenNamePLUS	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDeleteIfNotDirty	TokenNameIdentifier	 test Delete If Not Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
resetUnsafe	TokenNameIdentifier	 reset Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Roughly 32 MB mutation 	TokenNameCOMMENT_LINE	Roughly 32 MB mutation 
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k"	TokenNameStringLiteral	k
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
"Standard1"	TokenNameStringLiteral	Standard1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getCommitLogSegmentSize	TokenNameIdentifier	 get Commit Log Segment Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adding it twice (won't change segment) 	TokenNameCOMMENT_LINE	Adding it twice (won't change segment) 
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 1 segment, got "	TokenNameStringLiteral	Expecting 1 segment, got 
+	TokenNamePLUS	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Flush": this won't delete anything 	TokenNameCOMMENT_LINE	"Flush": this won't delete anything 
UUID	TokenNameIdentifier	 UUID
cfid1	TokenNameIdentifier	 cfid1
=	TokenNameEQUAL	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
getColumnFamilyIds	TokenNameIdentifier	 get Column Family Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
discardCompletedSegments	TokenNameIdentifier	 discard Completed Segments
(	TokenNameLPAREN	
cfid1	TokenNameIdentifier	 cfid1
,	TokenNameCOMMA	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 1 segment, got "	TokenNameStringLiteral	Expecting 1 segment, got 
+	TokenNamePLUS	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adding new mutation on another CF, large enough (including CL entry overhead) that a new segment is created 	TokenNameCOMMENT_LINE	Adding new mutation on another CF, large enough (including CL entry overhead) that a new segment is created 
RowMutation	TokenNameIdentifier	 Row Mutation
rm2	TokenNameIdentifier	 rm2
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k"	TokenNameStringLiteral	k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rm2	TokenNameIdentifier	 rm2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
QueryPath	TokenNameIdentifier	 Query Path
(	TokenNameLPAREN	
"Standard2"	TokenNameStringLiteral	Standard2
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getCommitLogSegmentSize	TokenNameIdentifier	 get Commit Log Segment Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm2	TokenNameIdentifier	 rm2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// also forces a new segment, since each entry-with-overhead is just over half the CL size 	TokenNameCOMMENT_LINE	also forces a new segment, since each entry-with-overhead is just over half the CL size 
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm2	TokenNameIdentifier	 rm2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 3 segments, got "	TokenNameStringLiteral	Expecting 3 segments, got 
+	TokenNamePLUS	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Flush" second cf: The first segment should be deleted since we 	TokenNameCOMMENT_LINE	"Flush" second cf: The first segment should be deleted since we 
// didn't write anything on cf1 since last flush (and we flush cf2) 	TokenNameCOMMENT_LINE	didn't write anything on cf1 since last flush (and we flush cf2) 
UUID	TokenNameIdentifier	 UUID
cfid2	TokenNameIdentifier	 cfid2
=	TokenNameEQUAL	
rm2	TokenNameIdentifier	 rm2
.	TokenNameDOT	
getColumnFamilyIds	TokenNameIdentifier	 get Column Family Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
discardCompletedSegments	TokenNameIdentifier	 discard Completed Segments
(	TokenNameLPAREN	
cfid2	TokenNameIdentifier	 cfid2
,	TokenNameCOMMA	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assert we still have both our segment 	TokenNameCOMMENT_LINE	Assert we still have both our segment 
assert	TokenNameassert	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Expecting 1 segment, got "	TokenNameStringLiteral	Expecting 1 segment, got 
+	TokenNamePLUS	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
activeSegments	TokenNameIdentifier	 active Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CASSANDRA-3615 	TokenNameCOMMENT_LINE	CASSANDRA-3615 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExceedSegmentSizeWithOverhead	TokenNameIdentifier	 test Exceed Segment Size With Overhead
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
resetUnsafe	TokenNameIdentifier	 reset Unsafe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RowMutation	TokenNameIdentifier	 Row Mutation
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
new	TokenNamenew	
RowMutation	TokenNameIdentifier	 Row Mutation
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"k"	TokenNameStringLiteral	k
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
"Standard1"	TokenNameStringLiteral	Standard1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"c1"	TokenNameStringLiteral	c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getCommitLogSegmentSize	TokenNameIdentifier	 get Commit Log Segment Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
dataSize	TokenNameIdentifier	 data Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Checksum	TokenNameIdentifier	 Checksum
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
testRecoveryWithBadSizeArgument	TokenNameIdentifier	 test Recovery With Bad Size Argument
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
long	TokenNamelong	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
dout	TokenNameIdentifier	 dout
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dout	TokenNameIdentifier	 dout
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dout	TokenNameIdentifier	 dout
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dout	TokenNameIdentifier	 dout
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
dataSize	TokenNameIdentifier	 data Size
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dout	TokenNameIdentifier	 dout
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRecovery	TokenNameIdentifier	 test Recovery
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
tmpFile	TokenNameIdentifier	 tmp File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
logFile	TokenNameIdentifier	 log File
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"CommitLog-"	TokenNameStringLiteral	CommitLog-
+	TokenNamePLUS	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
,	TokenNameCOMMA	
".log"	TokenNameStringLiteral	.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
logFile	TokenNameIdentifier	 log File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
logFile	TokenNameIdentifier	 log File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
testRecovery	TokenNameIdentifier	 test Recovery
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logData	TokenNameIdentifier	 log Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
logFile	TokenNameIdentifier	 log File
=	TokenNameEQUAL	
tmpFile	TokenNameIdentifier	 tmp File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OutputStream	TokenNameIdentifier	 Output Stream
lout	TokenNameIdentifier	 lout
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
logFile	TokenNameIdentifier	 log File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lout	TokenNameIdentifier	 lout
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
logData	TokenNameIdentifier	 log Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//statics make it annoying to test things correctly 	TokenNameCOMMENT_LINE	statics make it annoying to test things correctly 
CommitLog	TokenNameIdentifier	 Commit Log
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
logFile	TokenNameIdentifier	 log File
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//CASSANDRA-1119 / CASSANDRA-1179 throw on failure*/ 	TokenNameCOMMENT_LINE	CASSANDRA-1119 / CASSANDRA-1179 throw on failure*/ 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testVersions	TokenNameIdentifier	 test Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
"CommitLog-1340512736956320000.log"	TokenNameStringLiteral	CommitLog-1340512736956320000.log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
"CommitLog-2-1340512736956320000.log"	TokenNameStringLiteral	CommitLog-2-1340512736956320000.log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
"CommitLog--1340512736956320000.log"	TokenNameStringLiteral	CommitLog--1340512736956320000.log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
"CommitLog--2-1340512736956320000.log"	TokenNameStringLiteral	CommitLog--2-1340512736956320000.log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
"CommitLog-2-1340512736956320000-123.log"	TokenNameStringLiteral	CommitLog-2-1340512736956320000-123.log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1340512736956320000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
fromFileName	TokenNameIdentifier	 from File Name
(	TokenNameLPAREN	
"CommitLog-2-1340512736956320000.log"	TokenNameStringLiteral	CommitLog-2-1340512736956320000.log
)	TokenNameRPAREN	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1340512736956320000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
fromFileName	TokenNameIdentifier	 from File Name
(	TokenNameLPAREN	
"CommitLog-1340512736956320000.log"	TokenNameStringLiteral	CommitLog-1340512736956320000.log
)	TokenNameRPAREN	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
,	TokenNameCOMMA	
new	TokenNamenew	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
(	TokenNameLPAREN	
1340512736956320000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessagingVersion	TokenNameIdentifier	 get Messaging Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newCLName	TokenNameIdentifier	 new CL Name
=	TokenNameEQUAL	
"CommitLog-"	TokenNameStringLiteral	CommitLog-
+	TokenNamePLUS	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
+	TokenNamePLUS	
"-1340512736956320000.log"	TokenNameStringLiteral	-1340512736956320000.log
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
,	TokenNameCOMMA	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
fromFileName	TokenNameIdentifier	 from File Name
(	TokenNameLPAREN	
newCLName	TokenNameIdentifier	 new CL Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessagingVersion	TokenNameIdentifier	 get Messaging Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
,	TokenNameCOMMA	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
.	TokenNameDOT	
fromFileName	TokenNameIdentifier	 from File Name
(	TokenNameLPAREN	
"CommitLog-1340512736956320000.log"	TokenNameStringLiteral	CommitLog-1340512736956320000.log
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessagingVersion	TokenNameIdentifier	 get Messaging Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
