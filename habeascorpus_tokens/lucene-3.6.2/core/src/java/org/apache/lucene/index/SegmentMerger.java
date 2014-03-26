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
IOException	TokenNameIdentifier	 IO Exception
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
List	TokenNameIdentifier	 List
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
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
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
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
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
PayloadProcessorProvider	TokenNameIdentifier	 Payload Processor Provider
.	TokenNameDOT	
PayloadProcessor	TokenNameIdentifier	 Payload Processor
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
IndexInput	TokenNameIdentifier	 Index Input
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
IndexOutput	TokenNameIdentifier	 Index Output
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
IOUtils	TokenNameIdentifier	 IO Utils
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
ReaderUtil	TokenNameIdentifier	 Reader Util
;	TokenNameSEMICOLON	
/** * The SegmentMerger class combines two or more Segments, represented by an IndexReader ({@link #add}, * into a single Segment. After adding the appropriate readers, call the merge method to combine the * segments. * * @see #merge * @see #add */	TokenNameCOMMENT_JAVADOC	 The SegmentMerger class combines two or more Segments, represented by an IndexReader ({@link #add}, into a single Segment. After adding the appropriate readers, call the merge method to combine the segments. * @see #merge @see #add 
final	TokenNamefinal	
class	TokenNameclass	
SegmentMerger	TokenNameIdentifier	 Segment Merger
{	TokenNameLBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
termIndexInterval	TokenNameIdentifier	 term Index Interval
=	TokenNameEQUAL	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier	 DEFAULT  TERM  INDEX  INTERVAL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
mergedDocs	TokenNameIdentifier	 merged Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CheckAbort	TokenNameIdentifier	 Check Abort
checkAbort	TokenNameIdentifier	 check Abort
;	TokenNameSEMICOLON	
/** Maximum number of contiguous documents to bulk-copy when merging stored fields */	TokenNameCOMMENT_JAVADOC	 Maximum number of contiguous documents to bulk-copy when merging stored fields 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
=	TokenNameEQUAL	
4192	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
segmentWriteState	TokenNameIdentifier	 segment Write State
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PayloadProcessorProvider	TokenNameIdentifier	 Payload Processor Provider
payloadProcessorProvider	TokenNameIdentifier	 payload Processor Provider
;	TokenNameSEMICOLON	
SegmentMerger	TokenNameIdentifier	 Segment Merger
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
int	TokenNameint	
termIndexInterval	TokenNameIdentifier	 term Index Interval
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
,	TokenNameCOMMA	
PayloadProcessorProvider	TokenNameIdentifier	 Payload Processor Provider
payloadProcessorProvider	TokenNameIdentifier	 payload Processor Provider
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
payloadProcessorProvider	TokenNameIdentifier	 payload Processor Provider
=	TokenNameEQUAL	
payloadProcessorProvider	TokenNameIdentifier	 payload Processor Provider
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAbort	TokenNameIdentifier	 check Abort
=	TokenNameEQUAL	
new	TokenNamenew	
CheckAbort	TokenNameIdentifier	 Check Abort
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
checkAbort	TokenNameIdentifier	 check Abort
=	TokenNameEQUAL	
new	TokenNamenew	
CheckAbort	TokenNameIdentifier	 Check Abort
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
double	TokenNamedouble	
units	TokenNameIdentifier	 units
)	TokenNameRPAREN	
throws	TokenNamethrows	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termIndexInterval	TokenNameIdentifier	 term Index Interval
=	TokenNameEQUAL	
termIndexInterval	TokenNameIdentifier	 term Index Interval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an IndexReader to the collection of readers that are to be merged * @param reader */	TokenNameCOMMENT_JAVADOC	 Add an IndexReader to the collection of readers that are to be merged @param reader 
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
gatherSubReaders	TokenNameIdentifier	 gather Sub Readers
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merges the readers specified by the {@link #add} method into the directory passed to the constructor * @return The number of documents that were merged * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Merges the readers specified by the {@link #add} method into the directory passed to the constructor @return The number of documents that were merged @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
final	TokenNamefinal	
int	TokenNameint	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: it's important to add calls to 	TokenNameCOMMENT_LINE	NOTE: it's important to add calls to 
// checkAbort.work(...) if you make any changes to this 	TokenNameCOMMENT_LINE	checkAbort.work(...) if you make any changes to this 
// method that will spend alot of time. The frequency 	TokenNameCOMMENT_LINE	method that will spend alot of time. The frequency 
// of this check impacts how long 	TokenNameCOMMENT_LINE	of this check impacts how long 
// IndexWriter.close(false) takes to actually stop the 	TokenNameCOMMENT_LINE	IndexWriter.close(false) takes to actually stop the 
// threads. 	TokenNameCOMMENT_LINE	threads. 
mergedDocs	TokenNameIdentifier	 merged Docs
=	TokenNameEQUAL	
mergeFields	TokenNameIdentifier	 merge Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeTerms	TokenNameIdentifier	 merge Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeNorms	TokenNameIdentifier	 merge Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
hasVectors	TokenNameIdentifier	 has Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
mergeVectors	TokenNameIdentifier	 merge Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mergedDocs	TokenNameIdentifier	 merged Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NOTE: this method creates a compound file for all files returned by * info.files(). While, generally, this may include separate norms and * deletion files, this SegmentInfo must not reference such files when this * method is called, because they are not allowed within a compound file. */	TokenNameCOMMENT_JAVADOC	 NOTE: this method creates a compound file for all files returned by info.files(). While, generally, this may include separate norms and deletion files, this SegmentInfo must not reference such files when this method is called, because they are not allowed within a compound file. 
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
createCompoundFile	TokenNameIdentifier	 create Compound File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Now merge all added files 	TokenNameCOMMENT_LINE	Now merge all added files 
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
files	TokenNameIdentifier	 files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
cfsWriter	TokenNameIdentifier	 cfs Writer
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
checkAbort	TokenNameIdentifier	 check Abort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
matchesExtension	TokenNameIdentifier	 matches Extension
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
DELETES_EXTENSION	TokenNameIdentifier	 DELETES  EXTENSION
)	TokenNameRPAREN	
:	TokenNameCOLON	
".del file is not allowed in .cfs: "	TokenNameStringLiteral	.del file is not allowed in .cfs: 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
isSeparateNormsFile	TokenNameIdentifier	 is Separate Norms File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
:	TokenNameCOLON	
"separate norms file (.s[0-9]+) is not allowed in .cfs: "	TokenNameStringLiteral	separate norms file (.s[0-9]+) is not allowed in .cfs: 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
cfsWriter	TokenNameIdentifier	 cfs Writer
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Perform the merge 	TokenNameCOMMENT_LINE	Perform the merge 
cfsWriter	TokenNameIdentifier	 cfs Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matchingSegmentReaders	TokenNameIdentifier	 matching Segment Readers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rawDocLengths2	TokenNameIdentifier	 raw Doc Lengths2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
matchedCount	TokenNameIdentifier	 matched Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getMatchedSubReaderCount	TokenNameIdentifier	 get Matched Sub Reader Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchedCount	TokenNameIdentifier	 matched Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setMatchingSegmentReaders	TokenNameIdentifier	 set Matching Segment Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the i'th reader is a SegmentReader and has 	TokenNameCOMMENT_LINE	If the i'th reader is a SegmentReader and has 
// identical fieldName -> number mapping, then this 	TokenNameCOMMENT_LINE	identical fieldName -> number mapping, then this 
// array will be non-null at position i: 	TokenNameCOMMENT_LINE	array will be non-null at position i: 
int	TokenNameint	
numReaders	TokenNameIdentifier	 num Readers
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchingSegmentReaders	TokenNameIdentifier	 matching Segment Readers
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
numReaders	TokenNameIdentifier	 num Readers
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// If this reader is a SegmentReader, and all of its 	TokenNameCOMMENT_LINE	If this reader is a SegmentReader, and all of its 
// field name -> number mappings match the "merged" 	TokenNameCOMMENT_LINE	field name -> number mappings match the "merged" 
// FieldInfos, then we can do a bulk copy of the 	TokenNameCOMMENT_LINE	FieldInfos, then we can do a bulk copy of the 
// stored fields: 	TokenNameCOMMENT_LINE	stored fields: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numReaders	TokenNameIdentifier	 num Readers
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we may be able to broaden this to 	TokenNameCOMMENT_LINE	TODO: we may be able to broaden this to 
// non-SegmentReaders, since FieldInfos is now 	TokenNameCOMMENT_LINE	non-SegmentReaders, since FieldInfos is now 
// required? But... this'd also require exposing 	TokenNameCOMMENT_LINE	required? But... this'd also require exposing 
// bulk-copy (TVs and stored fields) API in foreign 	TokenNameCOMMENT_LINE	bulk-copy (TVs and stored fields) API in foreign 
// readers.. 	TokenNameCOMMENT_LINE	readers.. 
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
instanceof	TokenNameinstanceof	
SegmentReader	TokenNameIdentifier	 Segment Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentReader	TokenNameIdentifier	 Segment Reader
segmentReader	TokenNameIdentifier	 segment Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
same	TokenNameIdentifier	 same
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
FieldInfos	TokenNameIdentifier	 Field Infos
segmentFieldInfos	TokenNameIdentifier	 segment Field Infos
=	TokenNameEQUAL	
segmentReader	TokenNameIdentifier	 segment Reader
.	TokenNameDOT	
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numFieldInfos	TokenNameIdentifier	 num Field Infos
=	TokenNameEQUAL	
segmentFieldInfos	TokenNameIdentifier	 segment Field Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numFieldInfos	TokenNameIdentifier	 num Field Infos
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
segmentFieldInfos	TokenNameIdentifier	 segment Field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
same	TokenNameIdentifier	 same
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
same	TokenNameIdentifier	 same
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchingSegmentReaders	TokenNameIdentifier	 matching Segment Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
segmentReader	TokenNameIdentifier	 segment Reader
;	TokenNameSEMICOLON	
matchedCount	TokenNameIdentifier	 matched Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Used for bulk-reading raw bytes for stored fields 	TokenNameCOMMENT_LINE	Used for bulk-reading raw bytes for stored fields 
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rawDocLengths2	TokenNameIdentifier	 raw Doc Lengths2
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return The number of documents in all of the readers * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 * @return The number of documents in all of the readers @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
private	TokenNameprivate	
int	TokenNameint	
mergeFields	TokenNameIdentifier	 merge Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".fnm"	TokenNameStringLiteral	.fnm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setMatchingSegmentReaders	TokenNameIdentifier	 set Matching Segment Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldsWriter	TokenNameIdentifier	 Fields Writer
fieldsWriter	TokenNameIdentifier	 fields Writer
=	TokenNameEQUAL	
new	TokenNamenew	
FieldsWriter	TokenNameIdentifier	 Fields Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentReader	TokenNameIdentifier	 Segment Reader
matchingSegmentReader	TokenNameIdentifier	 matching Segment Reader
=	TokenNameEQUAL	
matchingSegmentReaders	TokenNameIdentifier	 matching Segment Readers
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FieldsReader	TokenNameIdentifier	 Fields Reader
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingSegmentReader	TokenNameIdentifier	 matching Segment Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldsReader	TokenNameIdentifier	 Fields Reader
fieldsReader	TokenNameIdentifier	 fields Reader
=	TokenNameEQUAL	
matchingSegmentReader	TokenNameIdentifier	 matching Segment Reader
.	TokenNameDOT	
getFieldsReader	TokenNameIdentifier	 get Fields Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsReader	TokenNameIdentifier	 fields Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fieldsReader	TokenNameIdentifier	 fields Reader
.	TokenNameDOT	
canReadRawDocs	TokenNameIdentifier	 can Read Raw Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
=	TokenNameEQUAL	
fieldsReader	TokenNameIdentifier	 fields Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docCount	TokenNameIdentifier	 doc Count
+=	TokenNamePLUS_EQUAL	
copyFieldsWithDeletions	TokenNameIdentifier	 copy Fields With Deletions
(	TokenNameLPAREN	
fieldsWriter	TokenNameIdentifier	 fields Writer
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
docCount	TokenNameIdentifier	 doc Count
+=	TokenNamePLUS_EQUAL	
copyFieldsNoDeletions	TokenNameIdentifier	 copy Fields No Deletions
(	TokenNameLPAREN	
fieldsWriter	TokenNameIdentifier	 fields Writer
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
segmentWriteState	TokenNameIdentifier	 segment Write State
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
termIndexInterval	TokenNameIdentifier	 term Index Interval
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
copyFieldsWithDeletions	TokenNameIdentifier	 copy Fields With Deletions
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldsWriter	TokenNameIdentifier	 Fields Writer
fieldsWriter	TokenNameIdentifier	 fields Writer
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldsReader	TokenNameIdentifier	 Fields Reader
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
{	TokenNameLBRACE	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We can bulk-copy because the fieldInfos are "congruent" 	TokenNameCOMMENT_LINE	We can bulk-copy because the fieldInfos are "congruent" 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip deleted docs 	TokenNameCOMMENT_LINE	skip deleted docs 
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We can optimize this case (doing a bulk byte copy) since the field 	TokenNameCOMMENT_LINE	We can optimize this case (doing a bulk byte copy) since the field 
// numbers are identical 	TokenNameCOMMENT_LINE	numbers are identical 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
numDocs	TokenNameIdentifier	 num Docs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
numDocs	TokenNameIdentifier	 num Docs
<	TokenNameLESS	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
.	TokenNameDOT	
rawDocs	TokenNameIdentifier	 raw Docs
(	TokenNameLPAREN	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
addRawDocuments	TokenNameIdentifier	 add Raw Documents
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
+=	TokenNamePLUS_EQUAL	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip deleted docs 	TokenNameCOMMENT_LINE	skip deleted docs 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: it's very important to first assign to doc then pass it to 	TokenNameCOMMENT_LINE	NOTE: it's very important to first assign to doc then pass it to 
// termVectorsWriter.addAllDocVectors; see LUCENE-1282 	TokenNameCOMMENT_LINE	termVectorsWriter.addAllDocVectors; see LUCENE-1282 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
copyFieldsNoDeletions	TokenNameIdentifier	 copy Fields No Deletions
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldsWriter	TokenNameIdentifier	 Fields Writer
fieldsWriter	TokenNameIdentifier	 fields Writer
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldsReader	TokenNameIdentifier	 Fields Reader
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
,	TokenNameCOMMA	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We can bulk-copy because the fieldInfos are "congruent" 	TokenNameCOMMENT_LINE	We can bulk-copy because the fieldInfos are "congruent" 
while	TokenNamewhile	
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
-	TokenNameMINUS	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
matchingFieldsReader	TokenNameIdentifier	 matching Fields Reader
.	TokenNameDOT	
rawDocs	TokenNameIdentifier	 raw Docs
(	TokenNameLPAREN	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
addRawDocuments	TokenNameIdentifier	 add Raw Documents
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: it's very important to first assign to doc then pass it to 	TokenNameCOMMENT_LINE	NOTE: it's very important to first assign to doc then pass it to 
// termVectorsWriter.addAllDocVectors; see LUCENE-1282 	TokenNameCOMMENT_LINE	termVectorsWriter.addAllDocVectors; see LUCENE-1282 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge the TermVectors from each of the segments into the new one. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Merge the TermVectors from each of the segments into the new one. @throws IOException 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
mergeVectors	TokenNameIdentifier	 merge Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermVectorsWriter	TokenNameIdentifier	 Term Vectors Writer
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsWriter	TokenNameIdentifier	 Term Vectors Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SegmentReader	TokenNameIdentifier	 Segment Reader
matchingSegmentReader	TokenNameIdentifier	 matching Segment Reader
=	TokenNameEQUAL	
matchingSegmentReaders	TokenNameIdentifier	 matching Segment Readers
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingSegmentReader	TokenNameIdentifier	 matching Segment Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
vectorsReader	TokenNameIdentifier	 vectors Reader
=	TokenNameEQUAL	
matchingSegmentReader	TokenNameIdentifier	 matching Segment Reader
.	TokenNameDOT	
getTermVectorsReader	TokenNameIdentifier	 get Term Vectors Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the TV* files are an older format then they cannot read raw docs: 	TokenNameCOMMENT_LINE	If the TV* files are an older format then they cannot read raw docs: 
if	TokenNameif	
(	TokenNameLPAREN	
vectorsReader	TokenNameIdentifier	 vectors Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
vectorsReader	TokenNameIdentifier	 vectors Reader
.	TokenNameDOT	
canReadRawDocs	TokenNameIdentifier	 can Read Raw Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
=	TokenNameEQUAL	
vectorsReader	TokenNameIdentifier	 vectors Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copyVectorsWithDeletions	TokenNameIdentifier	 copy Vectors With Deletions
(	TokenNameLPAREN	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
,	TokenNameCOMMA	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
copyVectorsNoDeletions	TokenNameIdentifier	 copy Vectors No Deletions
(	TokenNameLPAREN	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
,	TokenNameCOMMA	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
mergedDocs	TokenNameIdentifier	 merged Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
copyVectorsWithDeletions	TokenNameIdentifier	 copy Vectors With Deletions
(	TokenNameLPAREN	
final	TokenNamefinal	
TermVectorsWriter	TokenNameIdentifier	 Term Vectors Writer
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
,	TokenNameCOMMA	
final	TokenNamefinal	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We can bulk-copy because the fieldInfos are "congruent" 	TokenNameCOMMENT_LINE	We can bulk-copy because the fieldInfos are "congruent" 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docNum	TokenNameIdentifier	 doc Num
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip deleted docs 	TokenNameCOMMENT_LINE	skip deleted docs 
++	TokenNamePLUS_PLUS	
docNum	TokenNameIdentifier	 doc Num
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We can optimize this case (doing a bulk byte copy) since the field 	TokenNameCOMMENT_LINE	We can optimize this case (doing a bulk byte copy) since the field 
// numbers are identical 	TokenNameCOMMENT_LINE	numbers are identical 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
docNum	TokenNameIdentifier	 doc Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
numDocs	TokenNameIdentifier	 num Docs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
>=	TokenNameGREATER_EQUAL	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docNum	TokenNameIdentifier	 doc Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
numDocs	TokenNameIdentifier	 num Docs
<	TokenNameLESS	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
.	TokenNameDOT	
rawDocs	TokenNameIdentifier	 raw Docs
(	TokenNameLPAREN	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
rawDocLengths2	TokenNameIdentifier	 raw Doc Lengths2
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
.	TokenNameDOT	
addRawDocuments	TokenNameIdentifier	 add Raw Documents
(	TokenNameLPAREN	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
,	TokenNameCOMMA	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
rawDocLengths2	TokenNameIdentifier	 raw Doc Lengths2
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docNum	TokenNameIdentifier	 doc Num
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
docNum	TokenNameIdentifier	 doc Num
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip deleted docs 	TokenNameCOMMENT_LINE	skip deleted docs 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: it's very important to first assign to vectors then pass it to 	TokenNameCOMMENT_LINE	NOTE: it's very important to first assign to vectors then pass it to 
// termVectorsWriter.addAllDocVectors; see LUCENE-1282 	TokenNameCOMMENT_LINE	termVectorsWriter.addAllDocVectors; see LUCENE-1282 
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vectors	TokenNameIdentifier	 vectors
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
.	TokenNameDOT	
addAllDocVectors	TokenNameIdentifier	 add All Doc Vectors
(	TokenNameLPAREN	
vectors	TokenNameIdentifier	 vectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
copyVectorsNoDeletions	TokenNameIdentifier	 copy Vectors No Deletions
(	TokenNameLPAREN	
final	TokenNamefinal	
TermVectorsWriter	TokenNameIdentifier	 Term Vectors Writer
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
,	TokenNameCOMMA	
final	TokenNamefinal	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We can bulk-copy because the fieldInfos are "congruent" 	TokenNameCOMMENT_LINE	We can bulk-copy because the fieldInfos are "congruent" 
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
MAX_RAW_MERGE_DOCS	TokenNameIdentifier	 MAX  RAW  MERGE  DOCS
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
-	TokenNameMINUS	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
.	TokenNameDOT	
rawDocs	TokenNameIdentifier	 raw Docs
(	TokenNameLPAREN	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
rawDocLengths2	TokenNameIdentifier	 raw Doc Lengths2
,	TokenNameCOMMA	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
.	TokenNameDOT	
addRawDocuments	TokenNameIdentifier	 add Raw Documents
(	TokenNameLPAREN	
matchingVectorsReader	TokenNameIdentifier	 matching Vectors Reader
,	TokenNameCOMMA	
rawDocLengths	TokenNameIdentifier	 raw Doc Lengths
,	TokenNameCOMMA	
rawDocLengths2	TokenNameIdentifier	 raw Doc Lengths2
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docNum	TokenNameIdentifier	 doc Num
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
docNum	TokenNameIdentifier	 doc Num
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: it's very important to first assign to vectors then pass it to 	TokenNameCOMMENT_LINE	NOTE: it's very important to first assign to vectors then pass it to 
// termVectorsWriter.addAllDocVectors; see LUCENE-1282 	TokenNameCOMMENT_LINE	termVectorsWriter.addAllDocVectors; see LUCENE-1282 
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vectors	TokenNameIdentifier	 vectors
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termVectorsWriter	TokenNameIdentifier	 term Vectors Writer
.	TokenNameDOT	
addAllDocVectors	TokenNameIdentifier	 add All Doc Vectors
(	TokenNameLPAREN	
vectors	TokenNameIdentifier	 vectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
SegmentMergeQueue	TokenNameIdentifier	 Segment Merge Queue
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
mergeTerms	TokenNameIdentifier	 merge Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
FormatPostingsFieldsConsumer	TokenNameIdentifier	 Format Postings Fields Consumer
fieldsConsumer	TokenNameIdentifier	 fields Consumer
=	TokenNameEQUAL	
new	TokenNamenew	
FormatPostingsFieldsWriter	TokenNameIdentifier	 Format Postings Fields Writer
(	TokenNameLPAREN	
segmentWriteState	TokenNameIdentifier	 segment Write State
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMergeQueue	TokenNameIdentifier	 Segment Merge Queue
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeTermInfos	TokenNameIdentifier	 merge Term Infos
(	TokenNameLPAREN	
fieldsConsumer	TokenNameIdentifier	 fields Consumer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fieldsConsumer	TokenNameIdentifier	 fields Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
mergeTermInfos	TokenNameIdentifier	 merge Term Infos
(	TokenNameLPAREN	
final	TokenNamefinal	
FormatPostingsFieldsConsumer	TokenNameIdentifier	 Format Postings Fields Consumer
consumer	TokenNameIdentifier	 consumer
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
readerCount	TokenNameIdentifier	 reader Count
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
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
readerCount	TokenNameIdentifier	 reader Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
termEnum	TokenNameIdentifier	 term Enum
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payloadProcessorProvider	TokenNameIdentifier	 payload Processor Provider
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
readerPayloadProcessor	TokenNameIdentifier	 reader Payload Processor
=	TokenNameEQUAL	
payloadProcessorProvider	TokenNameIdentifier	 payload Processor Provider
.	TokenNameDOT	
getReaderProcessor	TokenNameIdentifier	 get Reader Processor
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docMap	TokenNameIdentifier	 doc Map
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
getDocMap	TokenNameIdentifier	 get Doc Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docMap	TokenNameIdentifier	 doc Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docMaps	TokenNameIdentifier	 doc Maps
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docMaps	TokenNameIdentifier	 doc Maps
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
readerCount	TokenNameIdentifier	 reader Count
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
docMaps	TokenNameIdentifier	 doc Maps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docMap	TokenNameIdentifier	 doc Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base	TokenNameIdentifier	 base
+=	TokenNamePLUS_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize queue 	TokenNameCOMMENT_LINE	initialize queue 
else	TokenNameelse	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
[	TokenNameLBRACKET	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
currentField	TokenNameIdentifier	 current Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FormatPostingsTermsConsumer	TokenNameIdentifier	 Format Postings Terms Consumer
termsConsumer	TokenNameIdentifier	 terms Consumer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
matchSize	TokenNameIdentifier	 match Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// pop matching terms 	TokenNameCOMMENT_LINE	pop matching terms 
match	TokenNameIdentifier	 match
[	TokenNameLBRACKET	
matchSize	TokenNameIdentifier	 match Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
[	TokenNameLBRACKET	
matchSize	TokenNameIdentifier	 match Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentField	TokenNameIdentifier	 current Field
!=	TokenNameNOT_EQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentField	TokenNameIdentifier	 current Field
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termsConsumer	TokenNameIdentifier	 terms Consumer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
termsConsumer	TokenNameIdentifier	 terms Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
currentField	TokenNameIdentifier	 current Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsConsumer	TokenNameIdentifier	 terms Consumer
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
appendPostings	TokenNameIdentifier	 append Postings
(	TokenNameLPAREN	
termsConsumer	TokenNameIdentifier	 terms Consumer
,	TokenNameCOMMA	
match	TokenNameIdentifier	 match
,	TokenNameCOMMA	
matchSize	TokenNameIdentifier	 match Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add new TermInfo 	TokenNameCOMMENT_LINE	add new TermInfo 
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
/	TokenNameDIVIDE	
3.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
matchSize	TokenNameIdentifier	 match Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
matchSize	TokenNameIdentifier	 match Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// restore queue 	TokenNameCOMMENT_LINE	restore queue 
else	TokenNameelse	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// done with a segment 	TokenNameCOMMENT_LINE	done with a segment 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payloadBuffer	TokenNameIdentifier	 payload Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
;	TokenNameSEMICOLON	
/** Process postings from multiple segments all positioned on the * same term. Writes out merged entries into freqOutput and * the proxOutput streams. * * @param smis array of segments * @param n number of cells in the array actually occupied * @return number of documents across all segments where this term was found * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Process postings from multiple segments all positioned on the same term. Writes out merged entries into freqOutput and the proxOutput streams. * @param smis array of segments @param n number of cells in the array actually occupied @return number of documents across all segments where this term was found @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
appendPostings	TokenNameIdentifier	 append Postings
(	TokenNameLPAREN	
final	TokenNamefinal	
FormatPostingsTermsConsumer	TokenNameIdentifier	 Format Postings Terms Consumer
termsConsumer	TokenNameIdentifier	 terms Consumer
,	TokenNameCOMMA	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
smis	TokenNameIdentifier	 smis
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
FormatPostingsDocsConsumer	TokenNameIdentifier	 Format Postings Docs Consumer
docConsumer	TokenNameIdentifier	 doc Consumer
=	TokenNameEQUAL	
termsConsumer	TokenNameIdentifier	 terms Consumer
.	TokenNameDOT	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
smis	TokenNameIdentifier	 smis
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentMergeInfo	TokenNameIdentifier	 Segment Merge Info
smi	TokenNameIdentifier	 smi
=	TokenNameEQUAL	
smis	TokenNameIdentifier	 smis
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TermPositions	TokenNameIdentifier	 Term Positions
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
postings	TokenNameIdentifier	 postings
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docMap	TokenNameIdentifier	 doc Map
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
getDocMap	TokenNameIdentifier	 get Doc Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PayloadProcessor	TokenNameIdentifier	 Payload Processor
payloadProcessor	TokenNameIdentifier	 payload Processor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
readerPayloadProcessor	TokenNameIdentifier	 reader Payload Processor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
payloadProcessor	TokenNameIdentifier	 payload Processor
=	TokenNameEQUAL	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
readerPayloadProcessor	TokenNameIdentifier	 reader Payload Processor
.	TokenNameDOT	
getProcessor	TokenNameIdentifier	 get Processor
(	TokenNameLPAREN	
smi	TokenNameIdentifier	 smi
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docMap	TokenNameIdentifier	 doc Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docMap	TokenNameIdentifier	 doc Map
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// map around deletions 	TokenNameCOMMENT_LINE	map around deletions 
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
// convert to merged space 	TokenNameCOMMENT_LINE	convert to merged space 
final	TokenNamefinal	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FormatPostingsPositionsConsumer	TokenNameIdentifier	 Format Postings Positions Consumer
posConsumer	TokenNameIdentifier	 pos Consumer
=	TokenNameEQUAL	
docConsumer	TokenNameIdentifier	 doc Consumer
.	TokenNameDOT	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payloadLength	TokenNameIdentifier	 payload Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
payloadBuffer	TokenNameIdentifier	 payload Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
payloadLength	TokenNameIdentifier	 payload Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payloadProcessor	TokenNameIdentifier	 payload Processor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
payloadBuffer	TokenNameIdentifier	 payload Buffer
=	TokenNameEQUAL	
payloadProcessor	TokenNameIdentifier	 payload Processor
.	TokenNameDOT	
processPayload	TokenNameIdentifier	 process Payload
(	TokenNameLPAREN	
payloadBuffer	TokenNameIdentifier	 payload Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadLength	TokenNameIdentifier	 payload Length
=	TokenNameEQUAL	
payloadProcessor	TokenNameIdentifier	 payload Processor
.	TokenNameDOT	
payloadLength	TokenNameIdentifier	 payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
posConsumer	TokenNameIdentifier	 pos Consumer
.	TokenNameDOT	
addPosition	TokenNameIdentifier	 add Position
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
payloadBuffer	TokenNameIdentifier	 payload Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
posConsumer	TokenNameIdentifier	 pos Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
docConsumer	TokenNameIdentifier	 doc Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getAnyNonBulkMerges	TokenNameIdentifier	 get Any Non Bulk Merges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
matchedCount	TokenNameIdentifier	 matched Count
<=	TokenNameLESS_EQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchedCount	TokenNameIdentifier	 matched Count
!=	TokenNameNOT_EQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
mergeNorms	TokenNameIdentifier	 merge Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// get needed buffer size by finding the largest segment 	TokenNameCOMMENT_LINE	get needed buffer size by finding the largest segment 
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
normBuffer	TokenNameIdentifier	 norm Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
numFieldInfos	TokenNameIdentifier	 num Field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
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
numFieldInfos	TokenNameIdentifier	 num Field Infos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
&&	TokenNameAND_AND	
!	TokenNameNOT	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
NORMS_EXTENSION	TokenNameIdentifier	 NORMS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
SegmentNorms	TokenNameIdentifier	 Segment Norms
.	TokenNameDOT	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
,	TokenNameCOMMA	
SegmentNorms	TokenNameIdentifier	 Segment Norms
.	TokenNameDOT	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normBuffer	TokenNameIdentifier	 norm Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normBuffer	TokenNameIdentifier	 norm Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
normBuffer	TokenNameIdentifier	 norm Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//optimized case for segments without deleted docs 	TokenNameCOMMENT_LINE	optimized case for segments without deleted docs 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
normBuffer	TokenNameIdentifier	 norm Buffer
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this segment has deleted docs, so we have to 	TokenNameCOMMENT_LINE	this segment has deleted docs, so we have to 
// check for every doc if it is deleted or not 	TokenNameCOMMENT_LINE	check for every doc if it is deleted or not 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
normBuffer	TokenNameIdentifier	 norm Buffer
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
CheckAbort	TokenNameIdentifier	 Check Abort
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
workCount	TokenNameIdentifier	 work Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CheckAbort	TokenNameIdentifier	 Check Abort
(	TokenNameLPAREN	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Records the fact that roughly units amount of work * have been done since this method was last called. * When adding time-consuming code into SegmentMerger, * you should test different values for units to ensure * that the time in between calls to merge.checkAborted * is up to ~ 1 second. */	TokenNameCOMMENT_JAVADOC	 Records the fact that roughly units amount of work have been done since this method was last called. When adding time-consuming code into SegmentMerger, you should test different values for units to ensure that the time in between calls to merge.checkAborted is up to ~ 1 second. 
public	TokenNamepublic	
void	TokenNamevoid	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
double	TokenNamedouble	
units	TokenNameIdentifier	 units
)	TokenNameRPAREN	
throws	TokenNamethrows	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
MergeAbortedException	TokenNameIdentifier	 Merge Aborted Exception
{	TokenNameLBRACE	
workCount	TokenNameIdentifier	 work Count
+=	TokenNamePLUS_EQUAL	
units	TokenNameIdentifier	 units
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
workCount	TokenNameIdentifier	 work Count
>=	TokenNameGREATER_EQUAL	
10000.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
checkAborted	TokenNameIdentifier	 check Aborted
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workCount	TokenNameIdentifier	 work Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
