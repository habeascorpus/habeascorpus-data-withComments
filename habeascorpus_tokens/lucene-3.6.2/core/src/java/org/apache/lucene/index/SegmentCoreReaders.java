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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
CoreClosedListener	TokenNameIdentifier	 Core Closed Listener
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
/** Holds core readers that are shared (unchanged) when * SegmentReader is cloned or reopened */	TokenNameCOMMENT_JAVADOC	 Holds core readers that are shared (unchanged) when SegmentReader is cloned or reopened 
final	TokenNamefinal	
class	TokenNameclass	
SegmentCoreReaders	TokenNameIdentifier	 Segment Core Readers
{	TokenNameLBRACE	
// Counts how many other reader share the core objects 	TokenNameCOMMENT_LINE	Counts how many other reader share the core objects 
// (freqStream, proxStream, tis, etc.) of this reader; 	TokenNameCOMMENT_LINE	(freqStream, proxStream, tis, etc.) of this reader; 
// when coreRef drops to 0, these core objects may be 	TokenNameCOMMENT_LINE	when coreRef drops to 0, these core objects may be 
// closed. A given instance of SegmentReader may be 	TokenNameCOMMENT_LINE	closed. A given instance of SegmentReader may be 
// closed, even those it shares core objects with other 	TokenNameCOMMENT_LINE	closed, even those it shares core objects with other 
// SegmentReaders: 	TokenNameCOMMENT_LINE	SegmentReaders: 
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexInput	TokenNameIdentifier	 Index Input
freqStream	TokenNameIdentifier	 freq Stream
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexInput	TokenNameIdentifier	 Index Input
proxStream	TokenNameIdentifier	 prox Stream
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
tisNoIndex	TokenNameIdentifier	 tis No Index
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
cfsDir	TokenNameIdentifier	 cfs Dir
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
readBufferSize	TokenNameIdentifier	 read Buffer Size
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SegmentReader	TokenNameIdentifier	 Segment Reader
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
volatile	TokenNamevolatile	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
tis	TokenNameIdentifier	 tis
;	TokenNameSEMICOLON	
FieldsReader	TokenNameIdentifier	 Fields Reader
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
;	TokenNameSEMICOLON	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
termVectorsReaderOrig	TokenNameIdentifier	 term Vectors Reader Orig
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cfsReader	TokenNameIdentifier	 cfs Reader
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
storeCFSReader	TokenNameIdentifier	 store CFS Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
CoreClosedListener	TokenNameIdentifier	 Core Closed Listener
>	TokenNameGREATER	
coreClosedListeners	TokenNameIdentifier	 core Closed Listeners
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
CoreClosedListener	TokenNameIdentifier	 Core Closed Listener
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentCoreReaders	TokenNameIdentifier	 Segment Core Readers
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
,	TokenNameCOMMA	
int	TokenNameint	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
int	TokenNameint	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
readBufferSize	TokenNameIdentifier	 read Buffer Size
=	TokenNameEQUAL	
readBufferSize	TokenNameIdentifier	 read Buffer Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir0	TokenNameIdentifier	 dir0
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfsReader	TokenNameIdentifier	 cfs Reader
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir0	TokenNameIdentifier	 dir0
=	TokenNameEQUAL	
cfsReader	TokenNameIdentifier	 cfs Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cfsDir	TokenNameIdentifier	 cfs Dir
=	TokenNameEQUAL	
dir0	TokenNameIdentifier	 dir0
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
cfsDir	TokenNameIdentifier	 cfs Dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
=	TokenNameEQUAL	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
;	TokenNameSEMICOLON	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
(	TokenNameLPAREN	
cfsDir	TokenNameIdentifier	 cfs Dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tisNoIndex	TokenNameIdentifier	 tis No Index
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
tisNoIndex	TokenNameIdentifier	 tis No Index
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure that all index files have been read or are kept open 	TokenNameCOMMENT_LINE	make sure that all index files have been read or are kept open 
// so that if an index update removes them we'll still have them 	TokenNameCOMMENT_LINE	so that if an index update removes them we'll still have them 
freqStream	TokenNameIdentifier	 freq Stream
=	TokenNameEQUAL	
cfsDir	TokenNameIdentifier	 cfs Dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FREQ_EXTENSION	TokenNameIdentifier	 FREQ  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxStream	TokenNameIdentifier	 prox Stream
=	TokenNameEQUAL	
cfsDir	TokenNameIdentifier	 cfs Dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
PROX_EXTENSION	TokenNameIdentifier	 PROX  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
proxStream	TokenNameIdentifier	 prox Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Must assign this at the end -- if we hit an 	TokenNameCOMMENT_LINE	Must assign this at the end -- if we hit an 
// exception above core, we don't want to attempt to 	TokenNameCOMMENT_LINE	exception above core, we don't want to attempt to 
// purge the FieldCache (will hit NPE because core is 	TokenNameCOMMENT_LINE	purge the FieldCache (will hit NPE because core is 
// not assigned yet). 	TokenNameCOMMENT_LINE	not assigned yet). 
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
getTermVectorsReaderOrig	TokenNameIdentifier	 get Term Vectors Reader Orig
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termVectorsReaderOrig	TokenNameIdentifier	 term Vectors Reader Orig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
FieldsReader	TokenNameIdentifier	 Fields Reader
getFieldsReaderOrig	TokenNameIdentifier	 get Fields Reader Orig
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
Directory	TokenNameIdentifier	 Directory
getCFSReader	TokenNameIdentifier	 get CFS Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfsReader	TokenNameIdentifier	 cfs Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
getTermsReader	TokenNameIdentifier	 get Terms Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
tis	TokenNameIdentifier	 tis
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tis	TokenNameIdentifier	 tis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
tisNoIndex	TokenNameIdentifier	 tis No Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
termsIndexIsLoaded	TokenNameIdentifier	 terms Index Is Loaded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tis	TokenNameIdentifier	 tis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: only called from IndexWriter when a near 	TokenNameCOMMENT_LINE	NOTE: only called from IndexWriter when a near 
// real-time reader is opened, or applyDeletes is run, 	TokenNameCOMMENT_LINE	real-time reader is opened, or applyDeletes is run, 
// sharing a segment that's still being merged. This 	TokenNameCOMMENT_LINE	sharing a segment that's still being merged. This 
// method is not fully thread safe, and relies on the 	TokenNameCOMMENT_LINE	method is not fully thread safe, and relies on the 
// synchronization in IndexWriter 	TokenNameCOMMENT_LINE	synchronization in IndexWriter 
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
loadTermsIndex	TokenNameIdentifier	 load Terms Index
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
,	TokenNameCOMMA	
int	TokenNameint	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir0	TokenNameIdentifier	 dir0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In some cases, we were originally opened when CFS 	TokenNameCOMMENT_LINE	In some cases, we were originally opened when CFS 
// was not used, but then we are asked to open the 	TokenNameCOMMENT_LINE	was not used, but then we are asked to open the 
// terms reader with index, the segment has switched 	TokenNameCOMMENT_LINE	terms reader with index, the segment has switched 
// to CFS 	TokenNameCOMMENT_LINE	to CFS 
if	TokenNameif	
(	TokenNameLPAREN	
cfsReader	TokenNameIdentifier	 cfs Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfsReader	TokenNameIdentifier	 cfs Reader
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dir0	TokenNameIdentifier	 dir0
=	TokenNameEQUAL	
cfsReader	TokenNameIdentifier	 cfs Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dir0	TokenNameIdentifier	 dir0
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
(	TokenNameLPAREN	
dir0	TokenNameIdentifier	 dir0
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
termsIndexDivisor	TokenNameIdentifier	 terms Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
,	TokenNameCOMMA	
tisNoIndex	TokenNameIdentifier	 tis No Index
,	TokenNameCOMMA	
freqStream	TokenNameIdentifier	 freq Stream
,	TokenNameCOMMA	
proxStream	TokenNameIdentifier	 prox Stream
,	TokenNameCOMMA	
termVectorsReaderOrig	TokenNameIdentifier	 term Vectors Reader Orig
,	TokenNameCOMMA	
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
,	TokenNameCOMMA	
cfsReader	TokenNameIdentifier	 cfs Reader
,	TokenNameCOMMA	
storeCFSReader	TokenNameIdentifier	 store CFS Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Now, notify any ReaderFinished listeners: 	TokenNameCOMMENT_LINE	Now, notify any ReaderFinished listeners: 
notifyCoreClosedListeners	TokenNameIdentifier	 notify Core Closed Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
notifyCoreClosedListeners	TokenNameIdentifier	 notify Core Closed Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
coreClosedListeners	TokenNameIdentifier	 core Closed Listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CoreClosedListener	TokenNameIdentifier	 Core Closed Listener
listener	TokenNameIdentifier	 listener
:	TokenNameCOLON	
coreClosedListeners	TokenNameIdentifier	 core Closed Listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
onClose	TokenNameIdentifier	 on Close
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
addCoreClosedListener	TokenNameIdentifier	 add Core Closed Listener
(	TokenNameLPAREN	
CoreClosedListener	TokenNameIdentifier	 Core Closed Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coreClosedListeners	TokenNameIdentifier	 core Closed Listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
removeCoreClosedListener	TokenNameIdentifier	 remove Core Closed Listener
(	TokenNameLPAREN	
CoreClosedListener	TokenNameIdentifier	 Core Closed Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coreClosedListeners	TokenNameIdentifier	 core Closed Listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
openDocStores	TokenNameIdentifier	 open Doc Stores
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
storeDir	TokenNameIdentifier	 store Dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreOffset	TokenNameIdentifier	 get Doc Store Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreIsCompoundFile	TokenNameIdentifier	 get Doc Store Is Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
storeCFSReader	TokenNameIdentifier	 store CFS Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
storeCFSReader	TokenNameIdentifier	 store CFS Reader
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreSegment	TokenNameIdentifier	 get Doc Store Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_STORE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  STORE  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
storeDir	TokenNameIdentifier	 store Dir
=	TokenNameEQUAL	
storeCFSReader	TokenNameIdentifier	 store CFS Reader
;	TokenNameSEMICOLON	
assert	TokenNameassert	
storeDir	TokenNameIdentifier	 store Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
storeDir	TokenNameIdentifier	 store Dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
assert	TokenNameassert	
storeDir	TokenNameIdentifier	 store Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getUseCompoundFile	TokenNameIdentifier	 get Use Compound File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In some cases, we were originally opened when CFS 	TokenNameCOMMENT_LINE	In some cases, we were originally opened when CFS 
// was not used, but then we are asked to open doc 	TokenNameCOMMENT_LINE	was not used, but then we are asked to open doc 
// stores after the segment has switched to CFS 	TokenNameCOMMENT_LINE	stores after the segment has switched to CFS 
if	TokenNameif	
(	TokenNameLPAREN	
cfsReader	TokenNameIdentifier	 cfs Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfsReader	TokenNameIdentifier	 cfs Reader
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
COMPOUND_FILE_EXTENSION	TokenNameIdentifier	 COMPOUND  FILE  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
storeDir	TokenNameIdentifier	 store Dir
=	TokenNameEQUAL	
cfsReader	TokenNameIdentifier	 cfs Reader
;	TokenNameSEMICOLON	
assert	TokenNameassert	
storeDir	TokenNameIdentifier	 store Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
storeDir	TokenNameIdentifier	 store Dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
assert	TokenNameassert	
storeDir	TokenNameIdentifier	 store Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
storesSegment	TokenNameIdentifier	 stores Segment
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreOffset	TokenNameIdentifier	 get Doc Store Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
storesSegment	TokenNameIdentifier	 stores Segment
=	TokenNameEQUAL	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreSegment	TokenNameIdentifier	 get Doc Store Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
storesSegment	TokenNameIdentifier	 stores Segment
=	TokenNameEQUAL	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
=	TokenNameEQUAL	
new	TokenNamenew	
FieldsReader	TokenNameIdentifier	 Fields Reader
(	TokenNameLPAREN	
storeDir	TokenNameIdentifier	 store Dir
,	TokenNameCOMMA	
storesSegment	TokenNameIdentifier	 stores Segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreOffset	TokenNameIdentifier	 get Doc Store Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Verify two sources of "maxDoc" agree: 	TokenNameCOMMENT_LINE	Verify two sources of "maxDoc" agree: 
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreOffset	TokenNameIdentifier	 get Doc Store Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"doc counts differ for segment "	TokenNameStringLiteral	doc counts differ for segment 
+	TokenNamePLUS	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
": fieldsReader shows "	TokenNameStringLiteral	: fieldsReader shows 
+	TokenNamePLUS	
fieldsReaderOrig	TokenNameIdentifier	 fields Reader Orig
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" but segmentInfo shows "	TokenNameStringLiteral	 but segmentInfo shows 
+	TokenNamePLUS	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getHasVectors	TokenNameIdentifier	 get Has Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// open term vector files only as needed 	TokenNameCOMMENT_LINE	open term vector files only as needed 
termVectorsReaderOrig	TokenNameIdentifier	 term Vectors Reader Orig
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
storeDir	TokenNameIdentifier	 store Dir
,	TokenNameCOMMA	
storesSegment	TokenNameIdentifier	 stores Segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getDocStoreOffset	TokenNameIdentifier	 get Doc Store Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"SegmentCoreReader(owner="	TokenNameStringLiteral	SegmentCoreReader(owner=
+	TokenNamePLUS	
owner	TokenNameIdentifier	 owner
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
