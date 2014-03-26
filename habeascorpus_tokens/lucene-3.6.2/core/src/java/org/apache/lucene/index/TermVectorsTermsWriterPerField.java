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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
Fieldable	TokenNameIdentifier	 Fieldable
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
UnicodeUtil	TokenNameIdentifier	 Unicode Util
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
final	TokenNamefinal	
class	TokenNameclass	
TermVectorsTermsWriterPerField	TokenNameIdentifier	 Term Vectors Terms Writer Per Field
extends	TokenNameextends	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
{	TokenNameLBRACE	
final	TokenNamefinal	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermVectorsTermsWriter	TokenNameIdentifier	 Term Vectors Terms Writer
termsWriter	TokenNameIdentifier	 terms Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInvertState	TokenNameIdentifier	 Field Invert State
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doVectors	TokenNameIdentifier	 do Vectors
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
;	TokenNameSEMICOLON	
int	TokenNameint	
maxNumPostings	TokenNameIdentifier	 max Num Postings
;	TokenNameSEMICOLON	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAttribute	TokenNameIdentifier	 offset Attribute
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermVectorsTermsWriterPerField	TokenNameIdentifier	 Term Vectors Terms Writer Per Field
(	TokenNameLPAREN	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
,	TokenNameCOMMA	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termsWriter	TokenNameIdentifier	 terms Writer
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsWriter	TokenNameIdentifier	 terms Writer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
getStreamCount	TokenNameIdentifier	 get Stream Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
boolean	TokenNameboolean	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doVectors	TokenNameIdentifier	 do Vectors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
=	TokenNameEQUAL	
false	TokenNamefalse	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTermVectorStored	TokenNameIdentifier	 is Term Vector Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doVectors	TokenNameIdentifier	 do Vectors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
|=	TokenNameOR_EQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isStorePositionWithTermVector	TokenNameIdentifier	 is Store Position With Term Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
|=	TokenNameOR_EQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isStoreOffsetWithTermVector	TokenNameIdentifier	 is Store Offset With Term Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doVectors	TokenNameIdentifier	 do Vectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
termsWriter	TokenNameIdentifier	 terms Writer
.	TokenNameDOT	
getPerDoc	TokenNameIdentifier	 get Per Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
assert	TokenNameassert	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
numVectorFields	TokenNameIdentifier	 num Vector Fields
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
perDocTvf	TokenNameIdentifier	 per Doc Tvf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
perDocTvf	TokenNameIdentifier	 per Doc Tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
==	TokenNameEQUAL_EQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only necessary if previous doc hit a 	TokenNameCOMMENT_LINE	Only necessary if previous doc hit a 
// non-aborting exception while writing vectors in 	TokenNameCOMMENT_LINE	non-aborting exception while writing vectors in 
// this field: 	TokenNameCOMMENT_LINE	this field: 
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: only if needed for performance 	TokenNameCOMMENT_LINE	TODO: only if needed for performance 
//perThread.postingsCount = 0; 	TokenNameCOMMENT_LINE	perThread.postingsCount = 0; 
return	TokenNamereturn	
doVectors	TokenNameIdentifier	 do Vectors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Called once per field per document if term vectors * are enabled, to write the vectors to * RAMOutputStream, which is then quickly flushed to * the real term vectors files in the Directory. */	TokenNameCOMMENT_JAVADOC	 Called once per field per document if term vectors are enabled, to write the vectors to RAMOutputStream, which is then quickly flushed to the real term vectors files in the Directory. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"TermVectorsTermsWriterPerField.finish start"	TokenNameStringLiteral	TermVectorsTermsWriterPerField.finish start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numPostings	TokenNameIdentifier	 num Postings
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
assert	TokenNameassert	
numPostings	TokenNameIdentifier	 num Postings
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
doVectors	TokenNameIdentifier	 do Vectors
||	TokenNameOR_OR	
numPostings	TokenNameIdentifier	 num Postings
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numPostings	TokenNameIdentifier	 num Postings
>	TokenNameGREATER	
maxNumPostings	TokenNameIdentifier	 max Num Postings
)	TokenNameRPAREN	
maxNumPostings	TokenNameIdentifier	 max Num Postings
=	TokenNameEQUAL	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexOutput	TokenNameIdentifier	 Index Output
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
perDocTvf	TokenNameIdentifier	 per Doc Tvf
;	TokenNameSEMICOLON	
// This is called once, after inverting all occurrences 	TokenNameCOMMENT_LINE	This is called once, after inverting all occurrences 
// of a given field in the doc. At this point we flush 	TokenNameCOMMENT_LINE	of a given field in the doc. At this point we flush 
// our hash into the DocWriter. 	TokenNameCOMMENT_LINE	our hash into the DocWriter. 
assert	TokenNameassert	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
;	TokenNameSEMICOLON	
assert	TokenNameassert	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
vectorFieldsInOrder	TokenNameIdentifier	 vector Fields In Order
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termIDs	TokenNameIdentifier	 term I Ds
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
sortPostings	TokenNameIdentifier	 sort Postings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
numPostings	TokenNameIdentifier	 num Postings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0x0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
STORE_POSITIONS_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  POSITIONS  WITH  TERMVECTOR
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
STORE_OFFSET_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  OFFSET  WITH  TERMVECTOR
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
encoderUpto	TokenNameIdentifier	 encoder Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastTermBytesCount	TokenNameIdentifier	 last Term Bytes Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
vectorSliceReader	TokenNameIdentifier	 vector Slice Reader
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charBuffers	TokenNameIdentifier	 char Buffers
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
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
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
termIDs	TokenNameIdentifier	 term I Ds
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
=	TokenNameEQUAL	
charBuffers	TokenNameIdentifier	 char Buffers
[	TokenNameLBRACKET	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
start2	TokenNameIdentifier	 start2
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
// We swap between two encoders to save copying 	TokenNameCOMMENT_LINE	We swap between two encoders to save copying 
// last Term's byte array 	TokenNameCOMMENT_LINE	last Term's byte array 
final	TokenNamefinal	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8Result	TokenNameIdentifier	 utf8 Result
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
encoderUpto	TokenNameIdentifier	 encoder Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// TODO: we could do this incrementally 	TokenNameCOMMENT_LINE	TODO: we could do this incrementally 
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
text2	TokenNameIdentifier	 text2
,	TokenNameCOMMA	
start2	TokenNameIdentifier	 start2
,	TokenNameCOMMA	
utf8Result	TokenNameIdentifier	 utf8 Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
termBytesCount	TokenNameIdentifier	 term Bytes Count
=	TokenNameEQUAL	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// TODO: UTF16toUTF8 could tell us this prefix 	TokenNameCOMMENT_LINE	TODO: UTF16toUTF8 could tell us this prefix 
// Compute common prefix between last term and 	TokenNameCOMMENT_LINE	Compute common prefix between last term and 
// this term 	TokenNameCOMMENT_LINE	this term 
int	TokenNameint	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
encoderUpto	TokenNameIdentifier	 encoder Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termBytes	TokenNameIdentifier	 term Bytes
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
encoderUpto	TokenNameIdentifier	 encoder Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
<	TokenNameLESS	
lastTermBytesCount	TokenNameIdentifier	 last Term Bytes Count
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
<	TokenNameLESS	
termBytesCount	TokenNameIdentifier	 term Bytes Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
[	TokenNameLBRACKET	
prefix	TokenNameIdentifier	 prefix
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
termBytes	TokenNameIdentifier	 term Bytes
[	TokenNameLBRACKET	
prefix	TokenNameIdentifier	 prefix
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
encoderUpto	TokenNameIdentifier	 encoder Upto
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
encoderUpto	TokenNameIdentifier	 encoder Upto
;	TokenNameSEMICOLON	
lastTermBytesCount	TokenNameIdentifier	 last Term Bytes Count
=	TokenNameEQUAL	
termBytesCount	TokenNameIdentifier	 term Bytes Count
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
termBytesCount	TokenNameIdentifier	 term Bytes Count
-	TokenNameMINUS	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
tvf	TokenNameIdentifier	 tvf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
tvf	TokenNameIdentifier	 tvf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: we clear, per-field, at the thread level, 	TokenNameCOMMENT_LINE	NOTE: we clear, per-field, at the thread level, 
// because term vectors fully write themselves on each 	TokenNameCOMMENT_LINE	because term vectors fully write themselves on each 
// field; this saves RAM (eg if large doc has two large 	TokenNameCOMMENT_LINE	field; this saves RAM (eg if large doc has two large 
// fields w/ term vectors on) because we recycle/reuse 	TokenNameCOMMENT_LINE	fields w/ term vectors on) because we recycle/reuse 
// all RAM after each field: 	TokenNameCOMMENT_LINE	all RAM after each field: 
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
shrinkHash	TokenNameIdentifier	 shrink Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
shrinkHash	TokenNameIdentifier	 shrink Hash
(	TokenNameLPAREN	
maxNumPostings	TokenNameIdentifier	 max Num Postings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxNumPostings	TokenNameIdentifier	 max Num Postings
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsetAttribute	TokenNameIdentifier	 offset Attribute
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offsetAttribute	TokenNameIdentifier	 offset Attribute
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"TermVectorsTermsWriterPerField.newTerm start"	TokenNameStringLiteral	TermVectorsTermsWriterPerField.newTerm start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
offsetAttribute	TokenNameIdentifier	 offset Attribute
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
offsetAttribute	TokenNameIdentifier	 offset Attribute
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastOffsets	TokenNameIdentifier	 last Offsets
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"TermVectorsTermsWriterPerField.addTerm start"	TokenNameStringLiteral	TermVectorsTermsWriterPerField.addTerm start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorOffsets	TokenNameIdentifier	 do Vector Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
offsetAttribute	TokenNameIdentifier	 offset Attribute
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
offsetAttribute	TokenNameIdentifier	 offset Attribute
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
-	TokenNameMINUS	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastOffsets	TokenNameIdentifier	 last Offsets
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastOffsets	TokenNameIdentifier	 last Offsets
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doVectorPositions	TokenNameIdentifier	 do Vector Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
skippingLongTerm	TokenNameIdentifier	 skipping Long Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
createPostingsArray	TokenNameIdentifier	 create Postings Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
extends	TokenNameextends	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
{	TokenNameLBRACE	
public	TokenNamepublic	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freqs	TokenNameIdentifier	 freqs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastOffsets	TokenNameIdentifier	 last Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastPositions	TokenNameIdentifier	 last Positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
;	TokenNameSEMICOLON	
// How many times this term occurred in the current doc 	TokenNameCOMMENT_LINE	How many times this term occurred in the current doc 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastOffsets	TokenNameIdentifier	 last Offsets
;	TokenNameSEMICOLON	
// Last offset we saw 	TokenNameCOMMENT_LINE	Last offset we saw 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastPositions	TokenNameIdentifier	 last Positions
;	TokenNameSEMICOLON	
// Last position where this term occurred 	TokenNameCOMMENT_LINE	Last position where this term occurred 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
toArray	TokenNameIdentifier	 to Array
,	TokenNameCOMMA	
int	TokenNameint	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
toArray	TokenNameIdentifier	 to Array
instanceof	TokenNameinstanceof	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
;	TokenNameSEMICOLON	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsPostingsArray	TokenNameIdentifier	 Term Vectors Postings Array
)	TokenNameRPAREN	
toArray	TokenNameIdentifier	 to Array
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
toArray	TokenNameIdentifier	 to Array
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
freqs	TokenNameIdentifier	 freqs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
freqs	TokenNameIdentifier	 freqs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
lastOffsets	TokenNameIdentifier	 last Offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
lastOffsets	TokenNameIdentifier	 last Offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
lastPositions	TokenNameIdentifier	 last Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
