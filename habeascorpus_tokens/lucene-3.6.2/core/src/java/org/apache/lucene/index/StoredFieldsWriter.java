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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
/** This is a DocFieldConsumer that writes stored fields. */	TokenNameCOMMENT_JAVADOC	 This is a DocFieldConsumer that writes stored fields. 
final	TokenNamefinal	
class	TokenNameclass	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
{	TokenNameLBRACE	
FieldsWriter	TokenNameIdentifier	 Fields Writer
fieldsWriter	TokenNameIdentifier	 fields Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDocID	TokenNameIdentifier	 last Doc ID
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
public	TokenNamepublic	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StoredFieldsWriterPerThread	TokenNameIdentifier	 Stored Fields Writer Per Thread
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StoredFieldsWriterPerThread	TokenNameIdentifier	 Stored Fields Writer Per Thread
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
>	TokenNameGREATER	
lastDocID	TokenNameIdentifier	 last Doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initFieldsWriter	TokenNameIdentifier	 init Fields Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsWriter	TokenNameIdentifier	 fields Writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
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
fieldsWriter	TokenNameIdentifier	 fields Writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
initFieldsWriter	TokenNameIdentifier	 init Fields Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsWriter	TokenNameIdentifier	 fields Writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
=	TokenNameEQUAL	
new	TokenNamenew	
FieldsWriter	TokenNameIdentifier	 Fields Writer
(	TokenNameLPAREN	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsWriter	TokenNameIdentifier	 fields Writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Fills in any hole in the docIDs */	TokenNameCOMMENT_JAVADOC	 Fills in any hole in the docIDs 
void	TokenNamevoid	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// We must "catch up" for all docs before us 	TokenNameCOMMENT_LINE	We must "catch up" for all docs before us 
// that had no stored fields: 	TokenNameCOMMENT_LINE	that had no stored fields: 
while	TokenNamewhile	
(	TokenNameLPAREN	
lastDocID	TokenNameIdentifier	 last Doc ID
<	TokenNameLESS	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
skipDocument	TokenNameIdentifier	 skip Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDocID	TokenNameIdentifier	 last Doc ID
++	TokenNamePLUS_PLUS	
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
"StoredFieldsWriter.finishDocument start"	TokenNameStringLiteral	StoredFieldsWriter.finishDocument start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initFieldsWriter	TokenNameIdentifier	 init Fields Writer
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
// Append stored fields to the real FieldsWriter: 	TokenNameCOMMENT_LINE	Append stored fields to the real FieldsWriter: 
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
flushDocument	TokenNameIdentifier	 flush Document
(	TokenNameLPAREN	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numStoredFields	TokenNameIdentifier	 num Stored Fields
,	TokenNameCOMMA	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fdt	TokenNameIdentifier	 fdt
)	TokenNameRPAREN	
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
"StoredFieldsWriter.finishDocument end"	TokenNameStringLiteral	StoredFieldsWriter.finishDocument end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
PerDoc	TokenNameIdentifier	 Per Doc
perDoc	TokenNameIdentifier	 per Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
freeCount	TokenNameIdentifier	 free Count
<	TokenNameLESS	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
numStoredFields	TokenNameIdentifier	 num Stored Fields
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fdt	TokenNameIdentifier	 fdt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
perDoc	TokenNameIdentifier	 per Doc
.	TokenNameDOT	
fdt	TokenNameIdentifier	 fdt
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFreeList	TokenNameIdentifier	 doc Free List
[	TokenNameLBRACKET	
freeCount	TokenNameIdentifier	 free Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
perDoc	TokenNameIdentifier	 per Doc
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
fdt	TokenNameIdentifier	 fdt
=	TokenNameEQUAL	
new	TokenNamenew	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numStoredFields	TokenNameIdentifier	 num Stored Fields
;	TokenNameSEMICOLON	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fdt	TokenNameIdentifier	 fdt
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
numStoredFields	TokenNameIdentifier	 num Stored Fields
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
