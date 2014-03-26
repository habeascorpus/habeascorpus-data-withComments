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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
HashSet	TokenNameIdentifier	 Hash Set
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
ArrayList	TokenNameIdentifier	 Array List
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
Set	TokenNameIdentifier	 Set
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
/** * An {@link IndexDeletionPolicy} that wraps around any other * {@link IndexDeletionPolicy} and adds the ability to hold and later release * snapshots of an index. While a snapshot is held, the {@link IndexWriter} will * not remove any files associated with it even if the index is otherwise being * actively, arbitrarily changed. Because we wrap another arbitrary * {@link IndexDeletionPolicy}, this gives you the freedom to continue using * whatever {@link IndexDeletionPolicy} you would normally want to use with your * index. * * <p> * This class maintains all snapshots in-memory, and so the information is not * persisted and not protected against system failures. If persistency is * important, you can use {@link PersistentSnapshotDeletionPolicy} (or your own * extension) and when creating a new instance of this deletion policy, pass the * persistent snapshots information to * {@link #SnapshotDeletionPolicy(IndexDeletionPolicy, Map)}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link IndexDeletionPolicy} that wraps around any other {@link IndexDeletionPolicy} and adds the ability to hold and later release snapshots of an index. While a snapshot is held, the {@link IndexWriter} will not remove any files associated with it even if the index is otherwise being actively, arbitrarily changed. Because we wrap another arbitrary {@link IndexDeletionPolicy}, this gives you the freedom to continue using whatever {@link IndexDeletionPolicy} you would normally want to use with your index. * <p> This class maintains all snapshots in-memory, and so the information is not persisted and not protected against system failures. If persistency is important, you can use {@link PersistentSnapshotDeletionPolicy} (or your own extension) and when creating a new instance of this deletion policy, pass the persistent snapshots information to {@link #SnapshotDeletionPolicy(IndexDeletionPolicy, Map)}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
implements	TokenNameimplements	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
{	TokenNameLBRACE	
/** Holds a Snapshot's information. */	TokenNameCOMMENT_JAVADOC	 Holds a Snapshot's information. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segmentsFileName	TokenNameIdentifier	 segments File Name
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segmentsFileName	TokenNameIdentifier	 segments File Name
=	TokenNameEQUAL	
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
=	TokenNameEQUAL	
commit	TokenNameIdentifier	 commit
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
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
segmentsFileName	TokenNameIdentifier	 segments File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
SnapshotCommitPoint	TokenNameIdentifier	 Snapshot Commit Point
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
{	TokenNameLBRACE	
protected	TokenNameprotected	
IndexCommit	TokenNameIdentifier	 Index Commit
cp	TokenNameIdentifier	 cp
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SnapshotCommitPoint	TokenNameIdentifier	 Snapshot Commit Point
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
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
"SnapshotDeletionPolicy.SnapshotCommitPoint("	TokenNameStringLiteral	SnapshotDeletionPolicy.SnapshotCommitPoint(
+	TokenNamePLUS	
cp	TokenNameIdentifier	 cp
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this segment can be deleted. The default implementation * returns false if this segment is currently held as snapshot. */	TokenNameCOMMENT_JAVADOC	 Returns true if this segment can be deleted. The default implementation returns false if this segment is currently held as snapshot. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldDelete	TokenNameIdentifier	 should Delete
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
segmentsFileName	TokenNameIdentifier	 segments File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
segmentsFileName	TokenNameIdentifier	 segments File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Suppress the delete request if this commit point is 	TokenNameCOMMENT_LINE	Suppress the delete request if this commit point is 
// currently snapshotted. 	TokenNameCOMMENT_LINE	currently snapshotted. 
if	TokenNameif	
(	TokenNameLPAREN	
shouldDelete	TokenNameIdentifier	 should Delete
(	TokenNameLPAREN	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getFileNames	TokenNameIdentifier	 get File Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getSegmentCount	TokenNameIdentifier	 get Segment Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Snapshots info */	TokenNameCOMMENT_JAVADOC	 Snapshots info 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
>	TokenNameGREATER	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// multiple IDs could point to the same commit point (segments file name) 	TokenNameCOMMENT_LINE	multiple IDs could point to the same commit point (segments file name) 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexCommit	TokenNameIdentifier	 Index Commit
lastCommit	TokenNameIdentifier	 last Commit
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
(	TokenNameLPAREN	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
primary	TokenNameIdentifier	 primary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@link SnapshotDeletionPolicy} wraps another {@link IndexDeletionPolicy} to * enable flexible snapshotting. * * @param primary * the {@link IndexDeletionPolicy} that is used on non-snapshotted * commits. Snapshotted commits, are not deleted until explicitly * released via {@link #release(String)} * @param snapshotsInfo * A mapping of snapshot ID to the segments filename that is being * snapshotted. The expected input would be the output of * {@link #getSnapshots()}. A null value signals that there are no * initial snapshots to maintain. */	TokenNameCOMMENT_JAVADOC	 {@link SnapshotDeletionPolicy} wraps another {@link IndexDeletionPolicy} to enable flexible snapshotting. * @param primary the {@link IndexDeletionPolicy} that is used on non-snapshotted commits. Snapshotted commits, are not deleted until explicitly released via {@link #release(String)} @param snapshotsInfo A mapping of snapshot ID to the segments filename that is being snapshotted. The expected input would be the output of {@link #getSnapshots()}. A null value signals that there are no initial snapshots to maintain. 
public	TokenNamepublic	
SnapshotDeletionPolicy	TokenNameIdentifier	 Snapshot Deletion Policy
(	TokenNameLPAREN	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
primary	TokenNameIdentifier	 primary
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
snapshotsInfo	TokenNameIdentifier	 snapshots Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
primary	TokenNameIdentifier	 primary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshotsInfo	TokenNameIdentifier	 snapshots Info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add the ID->segmentIDs here - the actual IndexCommits will be 	TokenNameCOMMENT_LINE	Add the ID->segmentIDs here - the actual IndexCommits will be 
// reconciled on the call to onInit() 	TokenNameCOMMENT_LINE	reconciled on the call to onInit() 
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
snapshotsInfo	TokenNameIdentifier	 snapshots Info
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
/** * Checks if the given id is already used by another snapshot, and throws * {@link IllegalStateException} if it is. */	TokenNameCOMMENT_JAVADOC	 Checks if the given id is already used by another snapshot, and throws {@link IllegalStateException} if it is. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkSnapshotted	TokenNameIdentifier	 check Snapshotted
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSnapshotted	TokenNameIdentifier	 is Snapshotted
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Snapshot ID "	TokenNameStringLiteral	Snapshot ID 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" is already used - must be unique"	TokenNameStringLiteral	 is already used - must be unique
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Registers the given snapshot information. */	TokenNameCOMMENT_JAVADOC	 Registers the given snapshot information. 
protected	TokenNameprotected	
void	TokenNamevoid	
registerSnapshotInfo	TokenNameIdentifier	 register Snapshot Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ids	TokenNameIdentifier	 ids
=	TokenNameEQUAL	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ids	TokenNameIdentifier	 ids
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ids	TokenNameIdentifier	 ids
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
ids	TokenNameIdentifier	 ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ids	TokenNameIdentifier	 ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
wrapCommits	TokenNameIdentifier	 wrap Commits
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
wrappedCommits	TokenNameIdentifier	 wrapped Commits
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
ic	TokenNameIdentifier	 ic
:	TokenNameCOLON	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrappedCommits	TokenNameIdentifier	 wrapped Commits
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SnapshotCommitPoint	TokenNameIdentifier	 Snapshot Commit Point
(	TokenNameLPAREN	
ic	TokenNameIdentifier	 ic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wrappedCommits	TokenNameIdentifier	 wrapped Commits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a snapshotted IndexCommit by ID. The IndexCommit can then be used to * open an IndexReader on a specific commit point, or rollback the index by * opening an IndexWriter with the IndexCommit specified in its * {@link IndexWriterConfig}. * * @param id * a unique identifier of the commit that was snapshotted. * @throws IllegalStateException * if no snapshot exists by the specified ID. * @return The {@link IndexCommit} for this particular snapshot. */	TokenNameCOMMENT_JAVADOC	 Get a snapshotted IndexCommit by ID. The IndexCommit can then be used to open an IndexReader on a specific commit point, or rollback the index by opening an IndexWriter with the IndexCommit specified in its {@link IndexWriterConfig}. * @param id a unique identifier of the commit that was snapshotted. @throws IllegalStateException if no snapshot exists by the specified ID. @return The {@link IndexCommit} for this particular snapshot. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
IndexCommit	TokenNameIdentifier	 Index Commit
getSnapshot	TokenNameIdentifier	 get Snapshot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
snapshotInfo	TokenNameIdentifier	 snapshot Info
=	TokenNameEQUAL	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
snapshotInfo	TokenNameIdentifier	 snapshot Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No snapshot exists by ID: "	TokenNameStringLiteral	No snapshot exists by ID: 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
snapshotInfo	TokenNameIdentifier	 snapshot Info
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get all the snapshots in a map of snapshot IDs to the segments they * 'cover.' This can be passed to * {@link #SnapshotDeletionPolicy(IndexDeletionPolicy, Map)} in order to * initialize snapshots at construction. */	TokenNameCOMMENT_JAVADOC	 Get all the snapshots in a map of snapshot IDs to the segments they 'cover.' This can be passed to {@link #SnapshotDeletionPolicy(IndexDeletionPolicy, Map)} in order to initialize snapshots at construction. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSnapshots	TokenNameIdentifier	 get Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
snapshots	TokenNameIdentifier	 snapshots
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
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
snapshots	TokenNameIdentifier	 snapshots
.	TokenNameDOT	
put	TokenNameIdentifier	 put
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
.	TokenNameDOT	
segmentsFileName	TokenNameIdentifier	 segments File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
snapshots	TokenNameIdentifier	 snapshots
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the given ID is already used by a snapshot. You can call * this method before {@link #snapshot(String)} if you are not sure whether * the ID is already used or not. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given ID is already used by a snapshot. You can call this method before {@link #snapshot(String)} if you are not sure whether the ID is already used or not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSnapshotted	TokenNameIdentifier	 is Snapshotted
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
onCommit	TokenNameIdentifier	 on Commit
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
onCommit	TokenNameIdentifier	 on Commit
(	TokenNameLPAREN	
wrapCommits	TokenNameIdentifier	 wrap Commits
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastCommit	TokenNameIdentifier	 last Commit
=	TokenNameEQUAL	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
onInit	TokenNameIdentifier	 on Init
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
onInit	TokenNameIdentifier	 on Init
(	TokenNameLPAREN	
wrapCommits	TokenNameIdentifier	 wrap Commits
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastCommit	TokenNameIdentifier	 last Commit
=	TokenNameEQUAL	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Assign snapshotted IndexCommits to their correct snapshot IDs as * specified in the constructor. */	TokenNameCOMMENT_BLOCK	 Assign snapshotted IndexCommits to their correct snapshot IDs as specified in the constructor. 
for	TokenNamefor	
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
:	TokenNameCOLON	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ids	TokenNameIdentifier	 ids
=	TokenNameEQUAL	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ids	TokenNameIdentifier	 ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
:	TokenNameCOLON	
ids	TokenNameIdentifier	 ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
=	TokenNameEQUAL	
commit	TokenNameIdentifier	 commit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Second, see if there are any instances where a snapshot ID was specified * in the constructor but an IndexCommit doesn't exist. In this case, the ID * should be removed. * * Note: This code is protective for extreme cases where IDs point to * non-existent segments. As the constructor should have received its * information via a call to getSnapshots(), the data should be well-formed. */	TokenNameCOMMENT_BLOCK	 Second, see if there are any instances where a snapshot ID was specified in the constructor but an IndexCommit doesn't exist. In this case, the ID should be removed. * Note: This code is protective for extreme cases where IDs point to non-existent segments. As the constructor should have received its information via a call to getSnapshots(), the data should be well-formed. 
// Find lost snapshots 	TokenNameCOMMENT_LINE	Find lost snapshots 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
idsToRemove	TokenNameIdentifier	 ids To Remove
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idsToRemove	TokenNameIdentifier	 ids To Remove
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idsToRemove	TokenNameIdentifier	 ids To Remove
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
idsToRemove	TokenNameIdentifier	 ids To Remove
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Finally, remove those 'lost' snapshots. 	TokenNameCOMMENT_LINE	Finally, remove those 'lost' snapshots. 
if	TokenNameif	
(	TokenNameLPAREN	
idsToRemove	TokenNameIdentifier	 ids To Remove
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
:	TokenNameCOLON	
idsToRemove	TokenNameIdentifier	 ids To Remove
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
segmentsFileName	TokenNameIdentifier	 segments File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Release a snapshotted commit by ID. * * @param id * a unique identifier of the commit that is un-snapshotted. * @throws IllegalStateException * if no snapshot exists by this ID. */	TokenNameCOMMENT_JAVADOC	 Release a snapshotted commit by ID. * @param id a unique identifier of the commit that is un-snapshotted. @throws IllegalStateException if no snapshot exists by this ID. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SnapshotInfo	TokenNameIdentifier	 Snapshot Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
idToSnapshot	TokenNameIdentifier	 id To Snapshot
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Snapshot doesn't exist: "	TokenNameStringLiteral	Snapshot doesn't exist: 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ids	TokenNameIdentifier	 ids
=	TokenNameEQUAL	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
segmentsFileName	TokenNameIdentifier	 segments File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ids	TokenNameIdentifier	 ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ids	TokenNameIdentifier	 ids
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ids	TokenNameIdentifier	 ids
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segmentsFileToIDs	TokenNameIdentifier	 segments File To I Ds
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
segmentsFileName	TokenNameIdentifier	 segments File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Snapshots the last commit. Once a commit is 'snapshotted,' it is protected * from deletion (as long as this {@link IndexDeletionPolicy} is used). The * commit can be removed by calling {@link #release(String)} using the same ID * parameter followed by a call to {@link IndexWriter#deleteUnusedFiles()}. * <p> * <b>NOTE:</b> ID must be unique in the system. If the same ID is used twice, * an {@link IllegalStateException} is thrown. * <p> * <b>NOTE:</b> while the snapshot is held, the files it references will not * be deleted, which will consume additional disk space in your index. If you * take a snapshot at a particularly bad time (say just before you call * forceMerge) then in the worst case this could consume an extra 1X of your * total index size, until you release the snapshot. * * @param id * a unique identifier of the commit that is being snapshotted. * @throws IllegalStateException * if either there is no 'last commit' to snapshot, or if the * parameter 'ID' refers to an already snapshotted commit. * @return the {@link IndexCommit} that was snapshotted. */	TokenNameCOMMENT_JAVADOC	 Snapshots the last commit. Once a commit is 'snapshotted,' it is protected from deletion (as long as this {@link IndexDeletionPolicy} is used). The commit can be removed by calling {@link #release(String)} using the same ID parameter followed by a call to {@link IndexWriter#deleteUnusedFiles()}. <p> <b>NOTE:</b> ID must be unique in the system. If the same ID is used twice, an {@link IllegalStateException} is thrown. <p> <b>NOTE:</b> while the snapshot is held, the files it references will not be deleted, which will consume additional disk space in your index. If you take a snapshot at a particularly bad time (say just before you call forceMerge) then in the worst case this could consume an extra 1X of your total index size, until you release the snapshot. * @param id a unique identifier of the commit that is being snapshotted. @throws IllegalStateException if either there is no 'last commit' to snapshot, or if the parameter 'ID' refers to an already snapshotted commit. @return the {@link IndexCommit} that was snapshotted. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
IndexCommit	TokenNameIdentifier	 Index Commit
snapshot	TokenNameIdentifier	 snapshot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastCommit	TokenNameIdentifier	 last Commit
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no commit exists. Really shouldn't happen, but might be if SDP is 	TokenNameCOMMENT_LINE	no commit exists. Really shouldn't happen, but might be if SDP is 
// accessed before onInit or onCommit were called. 	TokenNameCOMMENT_LINE	accessed before onInit or onCommit were called. 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No index commit to snapshot"	TokenNameStringLiteral	No index commit to snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Can't use the same snapshot ID twice... 	TokenNameCOMMENT_LINE	Can't use the same snapshot ID twice... 
checkSnapshotted	TokenNameIdentifier	 check Snapshotted
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerSnapshotInfo	TokenNameIdentifier	 register Snapshot Info
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
lastCommit	TokenNameIdentifier	 last Commit
.	TokenNameDOT	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastCommit	TokenNameIdentifier	 last Commit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastCommit	TokenNameIdentifier	 last Commit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
