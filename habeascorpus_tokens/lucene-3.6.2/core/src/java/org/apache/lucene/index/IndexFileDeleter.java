package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
NoSuchDirectoryException	TokenNameIdentifier	 No Such Directory Exception
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
CollectionUtil	TokenNameIdentifier	 Collection Util
;	TokenNameSEMICOLON	
/* * This class keeps track of each SegmentInfos instance that * is still "live", either because it corresponds to a * segments_N file in the Directory (a "commit", i.e. a * committed SegmentInfos) or because it's an in-memory * SegmentInfos that a writer is actively updating but has * not yet committed. This class uses simple reference * counting to map the live SegmentInfos instances to * individual files in the Directory. * * The same directory file may be referenced by more than * one IndexCommit, i.e. more than one SegmentInfos. * Therefore we count how many commits reference each file. * When all the commits referencing a certain file have been * deleted, the refcount for that file becomes zero, and the * file is deleted. * * A separate deletion policy interface * (IndexDeletionPolicy) is consulted on creation (onInit) * and once per commit (onCommit), to decide when a commit * should be removed. * * It is the business of the IndexDeletionPolicy to choose * when to delete commit points. The actual mechanics of * file deletion, retrying, etc, derived from the deletion * of commit points is the business of the IndexFileDeleter. * * The current default deletion policy is {@link * KeepOnlyLastCommitDeletionPolicy}, which removes all * prior commits when a new commit has completed. This * matches the behavior before 2.2. * * Note that you must hold the write.lock before * instantiating this class. It opens segments_N file(s) * directly with no retry logic. */	TokenNameCOMMENT_BLOCK	 This class keeps track of each SegmentInfos instance that is still "live", either because it corresponds to a segments_N file in the Directory (a "commit", i.e. a committed SegmentInfos) or because it's an in-memory SegmentInfos that a writer is actively updating but has not yet committed. This class uses simple reference counting to map the live SegmentInfos instances to individual files in the Directory. * The same directory file may be referenced by more than one IndexCommit, i.e. more than one SegmentInfos. Therefore we count how many commits reference each file. When all the commits referencing a certain file have been deleted, the refcount for that file becomes zero, and the file is deleted. * A separate deletion policy interface (IndexDeletionPolicy) is consulted on creation (onInit) and once per commit (onCommit), to decide when a commit should be removed. * It is the business of the IndexDeletionPolicy to choose when to delete commit points. The actual mechanics of file deletion, retrying, etc, derived from the deletion of commit points is the business of the IndexFileDeleter. * The current default deletion policy is {@link KeepOnlyLastCommitDeletionPolicy}, which removes all prior commits when a new commit has completed. This matches the behavior before 2.2. * Note that you must hold the write.lock before instantiating this class. It opens segments_N file(s) directly with no retry logic. 
final	TokenNamefinal	
class	TokenNameclass	
IndexFileDeleter	TokenNameIdentifier	 Index File Deleter
{	TokenNameLBRACE	
/* Files that we tried to delete but failed (likely * because they are open and we are running on Windows), * so we will retry them again later: */	TokenNameCOMMENT_BLOCK	 Files that we tried to delete but failed (likely because they are open and we are running on Windows), so we will retry them again later: 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
deletable	TokenNameIdentifier	 deletable
;	TokenNameSEMICOLON	
/* Reference count for all files in the index. * Counts how many existing commits reference a file. **/	TokenNameCOMMENT_BLOCK	 Reference count for all files in the index. Counts how many existing commits reference a file. *
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
RefCount	TokenNameIdentifier	 Ref Count
>	TokenNameGREATER	
refCounts	TokenNameIdentifier	 ref Counts
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
RefCount	TokenNameIdentifier	 Ref Count
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Holds all commits (segments_N) currently in the index. * This will have just 1 commit if you are using the * default delete policy (KeepOnlyLastCommitDeletionPolicy). * Other policies may leave commit points live for longer * in which case this list would be longer than 1: */	TokenNameCOMMENT_BLOCK	 Holds all commits (segments_N) currently in the index. This will have just 1 commit if you are using the default delete policy (KeepOnlyLastCommitDeletionPolicy). Other policies may leave commit points live for longer in which case this list would be longer than 1: 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CommitPoint	TokenNameIdentifier	 Commit Point
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CommitPoint	TokenNameIdentifier	 Commit Point
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Holds files we had incref'd from the previous * non-commit checkpoint: */	TokenNameCOMMENT_BLOCK	 Holds files we had incref'd from the previous non-commit checkpoint: 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
lastFiles	TokenNameIdentifier	 last Files
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Commits that the IndexDeletionPolicy have decided to delete: */	TokenNameCOMMENT_BLOCK	 Commits that the IndexDeletionPolicy have decided to delete: 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CommitPoint	TokenNameIdentifier	 Commit Point
>	TokenNameGREATER	
commitsToDelete	TokenNameIdentifier	 commits To Delete
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CommitPoint	TokenNameIdentifier	 Commit Point
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
startingCommitDeleted	TokenNameIdentifier	 starting Commit Deleted
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegmentInfos	TokenNameIdentifier	 Segment Infos
lastSegmentInfos	TokenNameIdentifier	 last Segment Infos
;	TokenNameSEMICOLON	
/** Change to true to see details of reference counts when * infoStream != null */	TokenNameCOMMENT_JAVADOC	 Change to true to see details of reference counts when infoStream != null 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
VERBOSE_REF_COUNTS	TokenNameIdentifier	 VERBOSE  REF  COUNTS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Used only for assert 	TokenNameCOMMENT_LINE	Used only for assert 
private	TokenNameprivate	
final	TokenNamefinal	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
=	TokenNameEQUAL	
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"setInfoStream deletionPolicy="	TokenNameStringLiteral	setInfoStream deletionPolicy=
+	TokenNamePLUS	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
infoStream	TokenNameIdentifier	 info Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IFD ["	TokenNameStringLiteral	IFD [
+	TokenNamePLUS	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// called only from assert 	TokenNameCOMMENT_LINE	called only from assert 
private	TokenNameprivate	
boolean	TokenNameboolean	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
holdsLock	TokenNameIdentifier	 holds Lock
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the deleter: find all previous commits in * the Directory, incref the files they reference, call * the policy to let it delete commits. This will remove * any files not referenced by any of the commits. * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Initialize the deleter: find all previous commits in the Directory, incref the files they reference, call the policy to let it delete commits. This will remove any files not referenced by any of the commits. @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
IndexFileDeleter	TokenNameIdentifier	 Index File Deleter
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
policy	TokenNameIdentifier	 policy
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
,	TokenNameCOMMA	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
=	TokenNameEQUAL	
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
currentSegmentsFile	TokenNameIdentifier	 current Segments File
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"init: current segments file is ""	TokenNameStringLiteral	init: current segments file is "
+	TokenNamePLUS	
currentSegmentsFile	TokenNameIdentifier	 current Segments File
+	TokenNamePLUS	
""; deletionPolicy="	TokenNameStringLiteral	"; deletionPolicy=
+	TokenNamePLUS	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
policy	TokenNameIdentifier	 policy
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
// First pass: walk the files and initialize our ref 	TokenNameCOMMENT_LINE	First pass: walk the files and initialize our ref 
// counts: 	TokenNameCOMMENT_LINE	counts: 
long	TokenNamelong	
currentGen	TokenNameIdentifier	 current Gen
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommitPoint	TokenNameIdentifier	 Commit Point
currentCommitPoint	TokenNameIdentifier	 current Commit Point
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchDirectoryException	TokenNameIdentifier	 No Such Directory Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it means the directory is empty, so ignore it. 	TokenNameCOMMENT_LINE	it means the directory is empty, so ignore it. 
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEGMENTS_GEN	TokenNameIdentifier	 SEGMENTS  GEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add this file to refCounts with initial count 0: 	TokenNameCOMMENT_LINE	Add this file to refCounts with initial count 0: 
getRefCount	TokenNameIdentifier	 get Ref Count
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEGMENTS	TokenNameIdentifier	 SEGMENTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is a commit (segments or segments_N), and 	TokenNameCOMMENT_LINE	This is a commit (segments or segments_N), and 
// it's valid (<= the max gen). Load it, then 	TokenNameCOMMENT_LINE	it's valid (<= the max gen). Load it, then 
// incref all files it refers to: 	TokenNameCOMMENT_LINE	incref all files it refers to: 
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"init: load commit ""	TokenNameStringLiteral	init: load commit "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-948: on NFS (and maybe others), if 	TokenNameCOMMENT_LINE	LUCENE-948: on NFS (and maybe others), if 
// you have writers switching back and forth 	TokenNameCOMMENT_LINE	you have writers switching back and forth 
// between machines, it's very likely that the 	TokenNameCOMMENT_LINE	between machines, it's very likely that the 
// dir listing will be stale and will claim a 	TokenNameCOMMENT_LINE	dir listing will be stale and will claim a 
// file segments_X exists when in fact it 	TokenNameCOMMENT_LINE	file segments_X exists when in fact it 
// doesn't. So, we catch this and handle it 	TokenNameCOMMENT_LINE	doesn't. So, we catch this and handle it 
// as if the file does not exist 	TokenNameCOMMENT_LINE	as if the file does not exist 
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"init: hit FileNotFoundException when loading commit ""	TokenNameStringLiteral	init: hit FileNotFoundException when loading commit "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
""; skipping this commit point"	TokenNameStringLiteral	"; skipping this commit point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
.	TokenNameDOT	
generationFromSegmentsFileName	TokenNameIdentifier	 generation From Segments File Name
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
currentGen	TokenNameIdentifier	 current Gen
&&	TokenNameAND_AND	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Most likely we are opening an index that 	TokenNameCOMMENT_LINE	Most likely we are opening an index that 
// has an aborted "future" commit, so suppress 	TokenNameCOMMENT_LINE	has an aborted "future" commit, so suppress 
// exc in this case 	TokenNameCOMMENT_LINE	exc in this case 
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CommitPoint	TokenNameIdentifier	 Commit Point
commitPoint	TokenNameIdentifier	 commit Point
=	TokenNameEQUAL	
new	TokenNamenew	
CommitPoint	TokenNameIdentifier	 Commit Point
(	TokenNameLPAREN	
commitsToDelete	TokenNameIdentifier	 commits To Delete
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentCommitPoint	TokenNameIdentifier	 current Commit Point
=	TokenNameEQUAL	
commitPoint	TokenNameIdentifier	 commit Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
commitPoint	TokenNameIdentifier	 commit Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastSegmentInfos	TokenNameIdentifier	 last Segment Infos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
lastSegmentInfos	TokenNameIdentifier	 last Segment Infos
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastSegmentInfos	TokenNameIdentifier	 last Segment Infos
=	TokenNameEQUAL	
sis	TokenNameIdentifier	 sis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentCommitPoint	TokenNameIdentifier	 current Commit Point
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
currentSegmentsFile	TokenNameIdentifier	 current Segments File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We did not in fact see the segments_N file 	TokenNameCOMMENT_LINE	We did not in fact see the segments_N file 
// corresponding to the segmentInfos that was passed 	TokenNameCOMMENT_LINE	corresponding to the segmentInfos that was passed 
// in. Yet, it must exist, because our caller holds 	TokenNameCOMMENT_LINE	in. Yet, it must exist, because our caller holds 
// the write lock. This can happen when the directory 	TokenNameCOMMENT_LINE	the write lock. This can happen when the directory 
// listing was stale (eg when index accessed via NFS 	TokenNameCOMMENT_LINE	listing was stale (eg when index accessed via NFS 
// client with stale directory listing cache). So we 	TokenNameCOMMENT_LINE	client with stale directory listing cache). So we 
// try now to explicitly open this commit point: 	TokenNameCOMMENT_LINE	try now to explicitly open this commit point: 
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfos	TokenNameIdentifier	 Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
currentSegmentsFile	TokenNameIdentifier	 current Segments File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"failed to locate current segments_N file"	TokenNameStringLiteral	failed to locate current segments_N file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"forced open of current segments file "	TokenNameStringLiteral	forced open of current segments file 
+	TokenNamePLUS	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentCommitPoint	TokenNameIdentifier	 current Commit Point
=	TokenNameEQUAL	
new	TokenNamenew	
CommitPoint	TokenNameIdentifier	 Commit Point
(	TokenNameLPAREN	
commitsToDelete	TokenNameIdentifier	 commits To Delete
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentCommitPoint	TokenNameIdentifier	 current Commit Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We keep commits list in sorted order (oldest to newest): 	TokenNameCOMMENT_LINE	We keep commits list in sorted order (oldest to newest): 
CollectionUtil	TokenNameIdentifier	 Collection Util
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now delete anything with ref count at 0. These are 	TokenNameCOMMENT_LINE	Now delete anything with ref count at 0. These are 
// presumably abandoned files eg due to crash of 	TokenNameCOMMENT_LINE	presumably abandoned files eg due to crash of 
// IndexWriter. 	TokenNameCOMMENT_LINE	IndexWriter. 
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
RefCount	TokenNameIdentifier	 Ref Count
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RefCount	TokenNameIdentifier	 Ref Count
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"init: removing unreferenced file ""	TokenNameStringLiteral	init: removing unreferenced file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Finally, give policy a chance to remove things on 	TokenNameCOMMENT_LINE	Finally, give policy a chance to remove things on 
// startup: 	TokenNameCOMMENT_LINE	startup: 
if	TokenNameif	
(	TokenNameLPAREN	
currentSegmentsFile	TokenNameIdentifier	 current Segments File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
onInit	TokenNameIdentifier	 on Init
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Always protect the incoming segmentInfos since 	TokenNameCOMMENT_LINE	Always protect the incoming segmentInfos since 
// sometime it may not be the most recent commit 	TokenNameCOMMENT_LINE	sometime it may not be the most recent commit 
checkpoint	TokenNameIdentifier	 checkpoint
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startingCommitDeleted	TokenNameIdentifier	 starting Commit Deleted
=	TokenNameEQUAL	
currentCommitPoint	TokenNameIdentifier	 current Commit Point
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
currentCommitPoint	TokenNameIdentifier	 current Commit Point
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteCommits	TokenNameIdentifier	 delete Commits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentInfos	TokenNameIdentifier	 Segment Infos
getLastSegmentInfos	TokenNameIdentifier	 get Last Segment Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastSegmentInfos	TokenNameIdentifier	 last Segment Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove the CommitPoints in the commitsToDelete List by * DecRef'ing all files from each SegmentInfos. */	TokenNameCOMMENT_JAVADOC	 Remove the CommitPoints in the commitsToDelete List by DecRef'ing all files from each SegmentInfos. 
private	TokenNameprivate	
void	TokenNamevoid	
deleteCommits	TokenNameIdentifier	 delete Commits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
commitsToDelete	TokenNameIdentifier	 commits To Delete
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First decref all files that had been referred to by 	TokenNameCOMMENT_LINE	First decref all files that had been referred to by 
// the now-deleted commits: 	TokenNameCOMMENT_LINE	the now-deleted commits: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CommitPoint	TokenNameIdentifier	 Commit Point
commit	TokenNameIdentifier	 commit
=	TokenNameEQUAL	
commitsToDelete	TokenNameIdentifier	 commits To Delete
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"deleteCommits: now decRef commit ""	TokenNameStringLiteral	deleteCommits: now decRef commit "
+	TokenNamePLUS	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
commitsToDelete	TokenNameIdentifier	 commits To Delete
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now compact commits to remove deleted ones (preserving the sort): 	TokenNameCOMMENT_LINE	Now compact commits to remove deleted ones (preserving the sort): 
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
readFrom	TokenNameIdentifier	 read From
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
writeTo	TokenNameIdentifier	 write To
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
readFrom	TokenNameIdentifier	 read From
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CommitPoint	TokenNameIdentifier	 Commit Point
commit	TokenNameIdentifier	 commit
=	TokenNameEQUAL	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
readFrom	TokenNameIdentifier	 read From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
deleted	TokenNameIdentifier	 deleted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writeTo	TokenNameIdentifier	 write To
!=	TokenNameNOT_EQUAL	
readFrom	TokenNameIdentifier	 read From
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
writeTo	TokenNameIdentifier	 write To
,	TokenNameCOMMA	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
readFrom	TokenNameIdentifier	 read From
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeTo	TokenNameIdentifier	 write To
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readFrom	TokenNameIdentifier	 read From
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
writeTo	TokenNameIdentifier	 write To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writer calls this when it has hit an error and had to * roll back, to tell us that there may now be * unreferenced files in the filesystem. So we re-list * the filesystem and delete such files. If segmentName * is non-null, we will only delete files corresponding to * that segment. */	TokenNameCOMMENT_JAVADOC	 Writer calls this when it has hit an error and had to roll back, to tell us that there may now be unreferenced files in the filesystem. So we re-list the filesystem and delete such files. If segmentName is non-null, we will only delete files corresponding to that segment. 
public	TokenNamepublic	
void	TokenNamevoid	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segmentName	TokenNameIdentifier	 segment Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
segmentPrefix1	TokenNameIdentifier	 segment Prefix1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
segmentPrefix2	TokenNameIdentifier	 segment Prefix2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segmentName	TokenNameIdentifier	 segment Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segmentPrefix1	TokenNameIdentifier	 segment Prefix1
=	TokenNameEQUAL	
segmentName	TokenNameIdentifier	 segment Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
segmentPrefix2	TokenNameIdentifier	 segment Prefix2
=	TokenNameEQUAL	
segmentName	TokenNameIdentifier	 segment Name
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
segmentPrefix1	TokenNameIdentifier	 segment Prefix1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
segmentPrefix2	TokenNameIdentifier	 segment Prefix2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
segmentName	TokenNameIdentifier	 segment Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
segmentPrefix1	TokenNameIdentifier	 segment Prefix1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
segmentPrefix2	TokenNameIdentifier	 segment Prefix2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
SEGMENTS_GEN	TokenNameIdentifier	 SEGMENTS  GEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Unreferenced file, so remove it 	TokenNameCOMMENT_LINE	Unreferenced file, so remove it 
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"refresh [prefix="	TokenNameStringLiteral	refresh [prefix=
+	TokenNamePLUS	
segmentName	TokenNameIdentifier	 segment Name
+	TokenNamePLUS	
"]: removing newly created unreferenced file ""	TokenNameStringLiteral	]: removing newly created unreferenced file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Set to null so that we regenerate the list of pending 	TokenNameCOMMENT_LINE	Set to null so that we regenerate the list of pending 
// files; else we can accumulate same file more than 	TokenNameCOMMENT_LINE	files; else we can accumulate same file more than 
// once 	TokenNameCOMMENT_LINE	once 
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deletable	TokenNameIdentifier	 deletable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// DecRef old files from the last checkpoint, if any: 	TokenNameCOMMENT_LINE	DecRef old files from the last checkpoint, if any: 
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
lastFiles	TokenNameIdentifier	 last Files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
lastFiles	TokenNameIdentifier	 last Files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastFiles	TokenNameIdentifier	 last Files
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deletePendingFiles	TokenNameIdentifier	 delete Pending Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Revisits the {@link IndexDeletionPolicy} by calling its * {@link IndexDeletionPolicy#onCommit(List)} again with the known commits. * This is useful in cases where a deletion policy which holds onto index * commits is used. The application may know that some commits are not held by * the deletion policy anymore and call * {@link IndexWriter#deleteUnusedFiles()}, which will attempt to delete the * unused commits again. */	TokenNameCOMMENT_JAVADOC	 Revisits the {@link IndexDeletionPolicy} by calling its {@link IndexDeletionPolicy#onCommit(List)} again with the known commits. This is useful in cases where a deletion policy which holds onto index commits is used. The application may know that some commits are not held by the deletion policy anymore and call {@link IndexWriter#deleteUnusedFiles()}, which will attempt to delete the unused commits again. 
void	TokenNamevoid	
revisitPolicy	TokenNameIdentifier	 revisit Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"now revisitPolicy"	TokenNameStringLiteral	now revisitPolicy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
onCommit	TokenNameIdentifier	 on Commit
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteCommits	TokenNameIdentifier	 delete Commits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deletePendingFiles	TokenNameIdentifier	 delete Pending Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletable	TokenNameIdentifier	 deletable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
oldDeletable	TokenNameIdentifier	 old Deletable
=	TokenNameEQUAL	
deletable	TokenNameIdentifier	 deletable
;	TokenNameSEMICOLON	
deletable	TokenNameIdentifier	 deletable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
oldDeletable	TokenNameIdentifier	 old Deletable
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"delete pending file "	TokenNameStringLiteral	delete pending file 
+	TokenNamePLUS	
oldDeletable	TokenNameIdentifier	 old Deletable
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
oldDeletable	TokenNameIdentifier	 old Deletable
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * For definition of "check point" see IndexWriter comments: * "Clarification: Check Points (and commits)". * * Writer calls this when it has made a "consistent * change" to the index, meaning new files are written to * the index and the in-memory SegmentInfos have been * modified to point to those files. * * This may or may not be a commit (segments_N may or may * not have been written). * * We simply incref the files referenced by the new * SegmentInfos and decref the files we had previously * seen (if any). * * If this is a commit, we also call the policy to give it * a chance to remove other commits. If any commits are * removed, we decref their files as well. */	TokenNameCOMMENT_JAVADOC	 For definition of "check point" see IndexWriter comments: "Clarification: Check Points (and commits)". * Writer calls this when it has made a "consistent change" to the index, meaning new files are written to the index and the in-memory SegmentInfos have been modified to point to those files. * This may or may not be a commit (segments_N may or may not have been written). * We simply incref the files referenced by the new SegmentInfos and decref the files we had previously seen (if any). * If this is a commit, we also call the policy to give it a chance to remove other commits. If any commits are removed, we decref their files as well. 
public	TokenNamepublic	
void	TokenNamevoid	
checkpoint	TokenNameIdentifier	 checkpoint
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCommit	TokenNameIdentifier	 is Commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"now checkpoint ""	TokenNameStringLiteral	now checkpoint "
+	TokenNamePLUS	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" ["	TokenNameStringLiteral	" [
+	TokenNamePLUS	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" segments "	TokenNameStringLiteral	 segments 
+	TokenNamePLUS	
"; isCommit = "	TokenNameStringLiteral	; isCommit = 
+	TokenNamePLUS	
isCommit	TokenNameIdentifier	 is Commit
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Try again now to delete any previously un-deletable 	TokenNameCOMMENT_LINE	Try again now to delete any previously un-deletable 
// files (because they were in use, on Windows): 	TokenNameCOMMENT_LINE	files (because they were in use, on Windows): 
deletePendingFiles	TokenNameIdentifier	 delete Pending Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Incref the files: 	TokenNameCOMMENT_LINE	Incref the files: 
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
isCommit	TokenNameIdentifier	 is Commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isCommit	TokenNameIdentifier	 is Commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Append to our commits list: 	TokenNameCOMMENT_LINE	Append to our commits list: 
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CommitPoint	TokenNameIdentifier	 Commit Point
(	TokenNameLPAREN	
commitsToDelete	TokenNameIdentifier	 commits To Delete
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell policy so it can remove commits: 	TokenNameCOMMENT_LINE	Tell policy so it can remove commits: 
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
onCommit	TokenNameIdentifier	 on Commit
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Decref files for commits that were deleted by the policy: 	TokenNameCOMMENT_LINE	Decref files for commits that were deleted by the policy: 
deleteCommits	TokenNameIdentifier	 delete Commits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// DecRef old files from the last checkpoint, if any: 	TokenNameCOMMENT_LINE	DecRef old files from the last checkpoint, if any: 
for	TokenNamefor	
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
lastFile	TokenNameIdentifier	 last File
:	TokenNameCOLON	
lastFiles	TokenNameIdentifier	 last Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
lastFile	TokenNameIdentifier	 last File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastFiles	TokenNameIdentifier	 last Files
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Save files so we can decr on next checkpoint/commit: 	TokenNameCOMMENT_LINE	Save files so we can decr on next checkpoint/commit: 
lastFiles	TokenNameIdentifier	 last Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCommit	TokenNameIdentifier	 is Commit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If this is a commit point, also incRef the 	TokenNameCOMMENT_LINE	If this is a commit point, also incRef the 
// segments_N file: 	TokenNameCOMMENT_LINE	segments_N file: 
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
:	TokenNameCOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
isCommit	TokenNameIdentifier	 is Commit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RefCount	TokenNameIdentifier	 Ref Count
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
getRefCount	TokenNameIdentifier	 get Ref Count
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
VERBOSE_REF_COUNTS	TokenNameIdentifier	 VERBOSE  REF  COUNTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" IncRef ""	TokenNameStringLiteral	 IncRef "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"": pre-incr count is "	TokenNameStringLiteral	": pre-incr count is 
+	TokenNamePLUS	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
IncRef	TokenNameIdentifier	 Inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RefCount	TokenNameIdentifier	 Ref Count
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
getRefCount	TokenNameIdentifier	 get Ref Count
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
VERBOSE_REF_COUNTS	TokenNameIdentifier	 VERBOSE  REF  COUNTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
" DecRef ""	TokenNameStringLiteral	 DecRef "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"": pre-decr count is "	TokenNameStringLiteral	": pre-decr count is 
+	TokenNamePLUS	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
DecRef	TokenNameIdentifier	 Dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This file is no longer referenced by any past 	TokenNameCOMMENT_LINE	This file is no longer referenced by any past 
// commit points nor by the in-memory SegmentInfos: 	TokenNameCOMMENT_LINE	commit points nor by the in-memory SegmentInfos: 
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRefCount	TokenNameIdentifier	 get Ref Count
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
RefCount	TokenNameIdentifier	 Ref Count
getRefCount	TokenNameIdentifier	 get Ref Count
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RefCount	TokenNameIdentifier	 Ref Count
rc	TokenNameIdentifier	 rc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RefCount	TokenNameIdentifier	 Ref Count
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rc	TokenNameIdentifier	 rc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
deleteFiles	TokenNameIdentifier	 delete Files
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Deletes the specified files, but only if they are new * (have not yet been incref'd). */	TokenNameCOMMENT_JAVADOC	 Deletes the specified files, but only if they are new (have not yet been incref'd). 
void	TokenNamevoid	
deleteNewFiles	TokenNameIdentifier	 delete New Files
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
refCounts	TokenNameIdentifier	 ref Counts
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"delete new file ""	TokenNameStringLiteral	delete new file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
locked	TokenNameIdentifier	 locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"delete ""	TokenNameStringLiteral	delete "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if delete fails 	TokenNameCOMMENT_LINE	if delete fails 
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Some operating systems (e.g. Windows) don't 	TokenNameCOMMENT_LINE	Some operating systems (e.g. Windows) don't 
// permit a file to be deleted while it is opened 	TokenNameCOMMENT_LINE	permit a file to be deleted while it is opened 
// for read (e.g. by another process or thread). So 	TokenNameCOMMENT_LINE	for read (e.g. by another process or thread). So 
// we assume that when a delete fails it is because 	TokenNameCOMMENT_LINE	we assume that when a delete fails it is because 
// the file is open in another process, and queue 	TokenNameCOMMENT_LINE	the file is open in another process, and queue 
// the file for subsequent deletion. 	TokenNameCOMMENT_LINE	the file for subsequent deletion. 
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"unable to remove file ""	TokenNameStringLiteral	unable to remove file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"": "	TokenNameStringLiteral	": 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; Will re-try later."	TokenNameStringLiteral	; Will re-try later.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deletable	TokenNameIdentifier	 deletable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deletable	TokenNameIdentifier	 deletable
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deletable	TokenNameIdentifier	 deletable
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to deletable 	TokenNameCOMMENT_LINE	add to deletable 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tracks the reference count for a single index file: */	TokenNameCOMMENT_JAVADOC	 Tracks the reference count for a single index file: 
final	TokenNamefinal	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RefCount	TokenNameIdentifier	 Ref Count
{	TokenNameLBRACE	
// fileName used only for better assert error messages 	TokenNameCOMMENT_LINE	fileName used only for better assert error messages 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
initDone	TokenNameIdentifier	 init Done
;	TokenNameSEMICOLON	
RefCount	TokenNameIdentifier	 Ref Count
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
IncRef	TokenNameIdentifier	 Inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initDone	TokenNameIdentifier	 init Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initDone	TokenNameIdentifier	 init Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": RefCount is 0 pre-increment for file ""	TokenNameStringLiteral	: RefCount is 0 pre-increment for file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
DecRef	TokenNameIdentifier	 Dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": RefCount is 0 pre-decrement for file ""	TokenNameStringLiteral	: RefCount is 0 pre-decrement for file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
return	TokenNamereturn	
--	TokenNameMINUS_MINUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Holds details for each commit point. This class is * also passed to the deletion policy. Note: this class * has a natural ordering that is inconsistent with * equals. */	TokenNameCOMMENT_JAVADOC	 Holds details for each commit point. This class is also passed to the deletion policy. Note: this class has a natural ordering that is inconsistent with equals. 
final	TokenNamefinal	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CommitPoint	TokenNameIdentifier	 Commit Point
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
deleted	TokenNameIdentifier	 deleted
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
CommitPoint	TokenNameIdentifier	 Commit Point
>	TokenNameGREATER	
commitsToDelete	TokenNameIdentifier	 commits To Delete
;	TokenNameSEMICOLON	
long	TokenNamelong	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
long	TokenNamelong	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
userData	TokenNameIdentifier	 user Data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
segmentCount	TokenNameIdentifier	 segment Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommitPoint	TokenNameIdentifier	 Commit Point
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
CommitPoint	TokenNameIdentifier	 Commit Point
>	TokenNameGREATER	
commitsToDelete	TokenNameIdentifier	 commits To Delete
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
commitsToDelete	TokenNameIdentifier	 commits To Delete
=	TokenNameEQUAL	
commitsToDelete	TokenNameIdentifier	 commits To Delete
;	TokenNameSEMICOLON	
userData	TokenNameIdentifier	 user Data
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentsFileName	TokenNameIdentifier	 segments File Name
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableCollection	TokenNameIdentifier	 unmodifiable Collection
(	TokenNameLPAREN	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentCount	TokenNameIdentifier	 segment Count
=	TokenNameEQUAL	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"IndexFileDeleter.CommitPoint("	TokenNameStringLiteral	IndexFileDeleter.CommitPoint(
+	TokenNamePLUS	
segmentsFileName	TokenNameIdentifier	 segments File Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getSegmentCount	TokenNameIdentifier	 get Segment Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentCount	TokenNameIdentifier	 segment Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getFileNames	TokenNameIdentifier	 get File Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userData	TokenNameIdentifier	 user Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called only be the deletion policy, to remove this * commit point from the index. */	TokenNameCOMMENT_JAVADOC	 Called only be the deletion policy, to remove this commit point from the index. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deleted	TokenNameIdentifier	 deleted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleted	TokenNameIdentifier	 deleted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
commitsToDelete	TokenNameIdentifier	 commits To Delete
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deleted	TokenNameIdentifier	 deleted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
