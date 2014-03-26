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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
TermVectorsTermsWriter	TokenNameIdentifier	 Term Vectors Terms Writer
extends	TokenNameextends	
TermsHashConsumer	TokenNameIdentifier	 Terms Hash Consumer
{	TokenNameLBRACE	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
PerDoc	TokenNameIdentifier	 Per Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docFreeList	TokenNameIdentifier	 doc Free List
=	TokenNameEQUAL	
new	TokenNamenew	
PerDoc	TokenNameIdentifier	 Per Doc
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
freeCount	TokenNameIdentifier	 free Count
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
tvx	TokenNameIdentifier	 tvx
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
tvd	TokenNameIdentifier	 tvd
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
tvf	TokenNameIdentifier	 tvf
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDocID	TokenNameIdentifier	 last Doc ID
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermVectorsTermsWriter	TokenNameIdentifier	 Term Vectors Terms Writer
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
(	TokenNameLPAREN	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
threadsAndFields	TokenNameIdentifier	 threads And Fields
,	TokenNameCOMMA	
final	TokenNamefinal	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// At least one doc in this run had term vectors enabled 	TokenNameCOMMENT_LINE	At least one doc in this run had term vectors enabled 
assert	TokenNameassert	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segmentName	TokenNameIdentifier	 segment Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is most likely a bug in Sun JRE 1.6.0_04/_05; 	TokenNameCOMMENT_LINE	This is most likely a bug in Sun JRE 1.6.0_04/_05; 
// we detect that the bug has struck, here, and 	TokenNameCOMMENT_LINE	we detect that the bug has struck, here, and 
// throw an exception to prevent the corruption from 	TokenNameCOMMENT_LINE	throw an exception to prevent the corruption from 
// entering the index. See LUCENE-1282 for 	TokenNameCOMMENT_LINE	entering the index. See LUCENE-1282 for 
// details 	TokenNameCOMMENT_LINE	details 
String	TokenNameIdentifier	 String
idxName	TokenNameIdentifier	 idx Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segmentName	TokenNameIdentifier	 segment Name
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"tvx size mismatch: "	TokenNameStringLiteral	tvx size mismatch: 
+	TokenNamePLUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
+	TokenNamePLUS	
" docs vs "	TokenNameStringLiteral	 docs vs 
+	TokenNamePLUS	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" length in bytes of "	TokenNameStringLiteral	 length in bytes of 
+	TokenNamePLUS	
idxName	TokenNameIdentifier	 idx Name
+	TokenNamePLUS	
" file exists?="	TokenNameStringLiteral	 file exists?=
+	TokenNamePLUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
idxName	TokenNameIdentifier	 idx Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
,	TokenNameCOMMA	
tvf	TokenNameIdentifier	 tvf
,	TokenNameCOMMA	
tvd	TokenNameIdentifier	 tvd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvx	TokenNameIdentifier	 tvx
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
threadsAndFields	TokenNameIdentifier	 threads And Fields
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorsTermsWriterPerField	TokenNameIdentifier	 Term Vectors Terms Writer Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsTermsWriterPerField	TokenNameIdentifier	 Term Vectors Terms Writer Per Field
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
shrinkHash	TokenNameIdentifier	 shrink Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
allocCount	TokenNameIdentifier	 alloc Count
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
PerDoc	TokenNameIdentifier	 Per Doc
getPerDoc	TokenNameIdentifier	 get Per Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freeCount	TokenNameIdentifier	 free Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allocCount	TokenNameIdentifier	 alloc Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
allocCount	TokenNameIdentifier	 alloc Count
>	TokenNameGREATER	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Grow our free list up front to make sure we have 	TokenNameCOMMENT_LINE	Grow our free list up front to make sure we have 
// enough space to recycle all outstanding PerDoc 	TokenNameCOMMENT_LINE	enough space to recycle all outstanding PerDoc 
// instances 	TokenNameCOMMENT_LINE	instances 
assert	TokenNameassert	
allocCount	TokenNameIdentifier	 alloc Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
docFreeList	TokenNameIdentifier	 doc Free List
=	TokenNameEQUAL	
new	TokenNamenew	
PerDoc	TokenNameIdentifier	 Per Doc
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
allocCount	TokenNameIdentifier	 alloc Count
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PerDoc	TokenNameIdentifier	 Per Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
docFreeList	TokenNameIdentifier	 doc Free List
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
freeCount	TokenNameIdentifier	 free Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Fills in no-term-vectors for all docs we haven't seen * since the last doc that had term vectors. */	TokenNameCOMMENT_JAVADOC	 Fills in no-term-vectors for all docs we haven't seen since the last doc that had term vectors. 
void	TokenNamevoid	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastDocID	TokenNameIdentifier	 last Doc ID
<	TokenNameLESS	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
tvfPosition	TokenNameIdentifier	 tvf Position
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lastDocID	TokenNameIdentifier	 last Doc ID
<	TokenNameLESS	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
tvfPosition	TokenNameIdentifier	 tvf Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
initTermVectorsWriter	TokenNameIdentifier	 init Term Vectors Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// If we hit an exception while init'ing the term 	TokenNameCOMMENT_LINE	If we hit an exception while init'ing the term 
// vector output files, we must abort this segment 	TokenNameCOMMENT_LINE	vector output files, we must abort this segment 
// because those files will be in an unknown 	TokenNameCOMMENT_LINE	because those files will be in an unknown 
// state: 	TokenNameCOMMENT_LINE	state: 
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tvx	TokenNameIdentifier	 tvx
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
,	TokenNameCOMMA	
tvd	TokenNameIdentifier	 tvd
,	TokenNameCOMMA	
tvf	TokenNameIdentifier	 tvf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
PerDoc	TokenNameIdentifier	 Per Doc
perDoc	TokenNameIdentifier	 per Doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"TermVectorsTermsWriter.finishDocument start"	TokenNameStringLiteral	TermVectorsTermsWriter.finishDocument start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initTermVectorsWriter	TokenNameIdentifier	 init Term Vectors Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append term vectors to the real outputs: 	TokenNameCOMMENT_LINE	Append term vectors to the real outputs: 
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numVectorFields	TokenNameIdentifier	 num Vector Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numVectorFields	TokenNameIdentifier	 num Vector Fields
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
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numVectorFields	TokenNameIdentifier	 num Vector Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fieldNumbers	TokenNameIdentifier	 field Numbers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fieldPointers	TokenNameIdentifier	 field Pointers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fieldPointers	TokenNameIdentifier	 field Pointers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numVectorFields	TokenNameIdentifier	 num Vector Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fieldPointers	TokenNameIdentifier	 field Pointers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
lastPos	TokenNameIdentifier	 last Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastPos	TokenNameIdentifier	 last Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
perDocTvf	TokenNameIdentifier	 per Doc Tvf
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
tvf	TokenNameIdentifier	 tvf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numVectorFields	TokenNameIdentifier	 num Vector Fields
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
lastDocID	TokenNameIdentifier	 last Doc ID
==	TokenNameEQUAL_EQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
:	TokenNameCOLON	
"lastDocID="	TokenNameStringLiteral	lastDocID=
+	TokenNamePLUS	
lastDocID	TokenNameIdentifier	 last Doc ID
+	TokenNamePLUS	
" perDoc.docID="	TokenNameStringLiteral	 perDoc.docID=
+	TokenNamePLUS	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
perDoc	TokenNameIdentifier	 per Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"TermVectorsTermsWriter.finishDocument end"	TokenNameStringLiteral	TermVectorsTermsWriter.finishDocument end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
,	TokenNameCOMMA	
tvd	TokenNameIdentifier	 tvd
,	TokenNameCOMMA	
tvf	TokenNameIdentifier	 tvf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cannot happen since we suppress exceptions 	TokenNameCOMMENT_LINE	cannot happen since we suppress exceptions 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ignored	TokenNameIdentifier	 ignored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ignored	TokenNameIdentifier	 ignored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ignored	TokenNameIdentifier	 ignored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
tvx	TokenNameIdentifier	 tvx
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
PerDoc	TokenNameIdentifier	 Per Doc
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
freeCount	TokenNameIdentifier	 free Count
<	TokenNameLESS	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
docFreeList	TokenNameIdentifier	 doc Free List
[	TokenNameLBRACKET	
freeCount	TokenNameIdentifier	 free Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
PerDoc	TokenNameIdentifier	 Per Doc
extends	TokenNameextends	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
{	TokenNameLBRACE	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
PerDocBuffer	TokenNameIdentifier	 Per Doc Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
newPerDocBuffer	TokenNameIdentifier	 new Per Doc Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
perDocTvf	TokenNameIdentifier	 per Doc Tvf
=	TokenNameEQUAL	
new	TokenNamenew	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numVectorFields	TokenNameIdentifier	 num Vector Fields
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldNumbers	TokenNameIdentifier	 field Numbers
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldPointers	TokenNameIdentifier	 field Pointers
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perDocTvf	TokenNameIdentifier	 per Doc Tvf
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
recycle	TokenNameIdentifier	 recycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numVectorFields	TokenNameIdentifier	 num Vector Fields
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numVectorFields	TokenNameIdentifier	 num Vector Fields
==	TokenNameEQUAL_EQUAL	
fieldNumbers	TokenNameIdentifier	 field Numbers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldNumbers	TokenNameIdentifier	 field Numbers
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
fieldNumbers	TokenNameIdentifier	 field Numbers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numVectorFields	TokenNameIdentifier	 num Vector Fields
==	TokenNameEQUAL_EQUAL	
fieldPointers	TokenNameIdentifier	 field Pointers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldPointers	TokenNameIdentifier	 field Pointers
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
fieldPointers	TokenNameIdentifier	 field Pointers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldNumbers	TokenNameIdentifier	 field Numbers
[	TokenNameLBRACKET	
numVectorFields	TokenNameIdentifier	 num Vector Fields
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fieldNumber	TokenNameIdentifier	 field Number
;	TokenNameSEMICOLON	
fieldPointers	TokenNameIdentifier	 field Pointers
[	TokenNameLBRACKET	
numVectorFields	TokenNameIdentifier	 num Vector Fields
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
perDocTvf	TokenNameIdentifier	 per Doc Tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numVectorFields	TokenNameIdentifier	 num Vector Fields
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getSizeInBytes	TokenNameIdentifier	 get Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
