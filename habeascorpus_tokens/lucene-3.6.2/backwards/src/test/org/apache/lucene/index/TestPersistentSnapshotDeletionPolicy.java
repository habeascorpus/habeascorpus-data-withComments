package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with this * work for additional information regarding copyright ownership. The ASF * licenses this file to You under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
After	TokenNameIdentifier	 After
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Before	TokenNameIdentifier	 Before
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Test Persistent Snapshot Deletion Policy
extends	TokenNameextends	
TestSnapshotDeletionPolicy	TokenNameIdentifier	 Test Snapshot Deletion Policy
{	TokenNameLBRACE	
// Keep it a class member so that getDeletionPolicy can use it 	TokenNameCOMMENT_LINE	Keep it a class member so that getDeletionPolicy can use it 
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
snapshotDir	TokenNameIdentifier	 snapshot Dir
;	TokenNameSEMICOLON	
// so we can close it if called by SDP tests 	TokenNameCOMMENT_LINE	so we can close it if called by SDP tests 
private	TokenNameprivate	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
psdp	TokenNameIdentifier	 psdp
;	TokenNameSEMICOLON	
@	TokenNameAT	
Before	TokenNameIdentifier	 Before
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotDir	TokenNameIdentifier	 snapshot Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
After	TokenNameIdentifier	 After
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
psdp	TokenNameIdentifier	 psdp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotDir	TokenNameIdentifier	 snapshot Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
psdp	TokenNameIdentifier	 psdp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotDir	TokenNameIdentifier	 snapshot Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotDir	TokenNameIdentifier	 snapshot Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
psdp	TokenNameIdentifier	 psdp
=	TokenNameEQUAL	
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
snapshots	TokenNameIdentifier	 snapshots
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
sdp	TokenNameIdentifier	 sdp
=	TokenNameEQUAL	
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshots	TokenNameIdentifier	 snapshots
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sdp	TokenNameIdentifier	 sdp
.	TokenNameDOT	
registerSnapshotInfo	TokenNameIdentifier	 register Snapshot Info
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sdp	TokenNameIdentifier	 sdp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testExistingSnapshots	TokenNameIdentifier	 test Existing Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
numSnapshots	TokenNameIdentifier	 num Snapshots
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
psdp	TokenNameIdentifier	 psdp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
)	TokenNameRPAREN	
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prepareIndexAndSnapshots	TokenNameIdentifier	 prepare Index And Snapshots
(	TokenNameLPAREN	
psdp	TokenNameIdentifier	 psdp
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
numSnapshots	TokenNameIdentifier	 num Snapshots
,	TokenNameCOMMA	
"snapshot"	TokenNameStringLiteral	snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Re-initialize and verify snapshots were persisted 	TokenNameCOMMENT_LINE	Re-initialize and verify snapshots were persisted 
psdp	TokenNameIdentifier	 psdp
=	TokenNameEQUAL	
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSnapshotExists	TokenNameIdentifier	 assert Snapshot Exists
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
,	TokenNameCOMMA	
numSnapshots	TokenNameIdentifier	 num Snapshots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
numSnapshots	TokenNameIdentifier	 num Snapshots
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalSnapshotId	TokenNameIdentifier	 test Illegal Snapshot Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
snapshot	TokenNameIdentifier	 snapshot
(	TokenNameLPAREN	
"$SNAPSHOTS_DOC$"	TokenNameStringLiteral	$SNAPSHOTS_DOC$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidSnapshotInfos	TokenNameIdentifier	 test Invalid Snapshot Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Add the correct number of documents (1), but without snapshot information 	TokenNameCOMMENT_LINE	Add the correct number of documents (1), but without snapshot information 
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should not have succeeded to read from an invalid Directory"	TokenNameStringLiteral	should not have succeeded to read from an invalid Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNoSnapshotInfos	TokenNameIdentifier	 test No Snapshot Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Initialize an empty index in snapshotDir - PSDP should initialize successfully. 	TokenNameCOMMENT_LINE	Initialize an empty index in snapshotDir - PSDP should initialize successfully. 
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testTooManySnapshotInfos	TokenNameIdentifier	 test Too Many Snapshot Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Write two documents to the snapshots directory - illegal. 	TokenNameCOMMENT_LINE	Write two documents to the snapshots directory - illegal. 
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should not have succeeded to open an invalid directory"	TokenNameStringLiteral	should not have succeeded to open an invalid directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSnapshotRelease	TokenNameIdentifier	 test Snapshot Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
psdp	TokenNameIdentifier	 psdp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
)	TokenNameRPAREN	
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prepareIndexAndSnapshots	TokenNameIdentifier	 prepare Index And Snapshots
(	TokenNameLPAREN	
psdp	TokenNameIdentifier	 psdp
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"snapshot"	TokenNameStringLiteral	snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
"snapshot0"	TokenNameStringLiteral	snapshot0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psdp	TokenNameIdentifier	 psdp
=	TokenNameEQUAL	
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Should have no snapshots !"	TokenNameStringLiteral	Should have no snapshots !
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testStaticRead	TokenNameIdentifier	 test Static Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// While PSDP is open, it keeps a lock on the snapshots directory and thus 	TokenNameCOMMENT_LINE	While PSDP is open, it keeps a lock on the snapshots directory and thus 
// prevents reading the snapshots information. This test checks that the 	TokenNameCOMMENT_LINE	prevents reading the snapshots information. This test checks that the 
// static read method works. 	TokenNameCOMMENT_LINE	static read method works. 
int	TokenNameint	
numSnapshots	TokenNameIdentifier	 num Snapshots
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
psdp	TokenNameIdentifier	 psdp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
)	TokenNameRPAREN	
getDeletionPolicy	TokenNameIdentifier	 get Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
psdp	TokenNameIdentifier	 psdp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prepareIndexAndSnapshots	TokenNameIdentifier	 prepare Index And Snapshots
(	TokenNameLPAREN	
psdp	TokenNameIdentifier	 psdp
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
numSnapshots	TokenNameIdentifier	 num Snapshots
,	TokenNameCOMMA	
"snapshot"	TokenNameStringLiteral	snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// This should fail, since the snapshots directory is locked - we didn't close it ! 	TokenNameCOMMENT_LINE	This should fail, since the snapshots directory is locked - we didn't close it ! 
new	TokenNamenew	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should not have reached here - the snapshots directory should be locked!"	TokenNameStringLiteral	should not have reached here - the snapshots directory should be locked!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
psdp	TokenNameIdentifier	 psdp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reading the snapshots info should succeed though 	TokenNameCOMMENT_LINE	Reading the snapshots info should succeed though 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
snapshots	TokenNameIdentifier	 snapshots
=	TokenNameEQUAL	
PersistentSnapshotDeletionPolicy	TokenNameIdentifier	 Persistent Snapshot Deletion Policy
.	TokenNameDOT	
readSnapshotsInfo	TokenNameIdentifier	 read Snapshots Info
(	TokenNameLPAREN	
snapshotDir	TokenNameIdentifier	 snapshot Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
numSnapshots	TokenNameIdentifier	 num Snapshots
+	TokenNamePLUS	
" snapshots, got "	TokenNameStringLiteral	 snapshots, got 
+	TokenNamePLUS	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numSnapshots	TokenNameIdentifier	 num Snapshots
,	TokenNameCOMMA	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
