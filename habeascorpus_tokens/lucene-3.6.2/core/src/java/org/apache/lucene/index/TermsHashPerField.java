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
Arrays	TokenNameIdentifier	 Arrays
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SorterTemplate	TokenNameIdentifier	 Sorter Template
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
extends	TokenNameextends	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
{	TokenNameLBRACE	
final	TokenNamefinal	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
nextPerField	TokenNameIdentifier	 next Per Field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
perThread	TokenNameIdentifier	 per Thread
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
// Copied from our perThread 	TokenNameCOMMENT_LINE	Copied from our perThread 
final	TokenNamefinal	
CharBlockPool	TokenNameIdentifier	 Char Block Pool
charPool	TokenNameIdentifier	 char Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IntBlockPool	TokenNameIdentifier	 Int Block Pool
intPool	TokenNameIdentifier	 int Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
bytePool	TokenNameIdentifier	 byte Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numPostingInt	TokenNameIdentifier	 num Posting Int
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
postingsCompacted	TokenNameIdentifier	 postings Compacted
;	TokenNameSEMICOLON	
int	TokenNameint	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
postingsHashHalfSize	TokenNameIdentifier	 postings Hash Half Size
=	TokenNameEQUAL	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
=	TokenNameEQUAL	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postingsHash	TokenNameIdentifier	 postings Hash
;	TokenNameSEMICOLON	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
(	TokenNameLPAREN	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
perThread	TokenNameIdentifier	 per Thread
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
nextPerThread	TokenNameIdentifier	 next Per Thread
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
intPool	TokenNameIdentifier	 int Pool
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
intPool	TokenNameIdentifier	 int Pool
;	TokenNameSEMICOLON	
charPool	TokenNameIdentifier	 char Pool
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
charPool	TokenNameIdentifier	 char Pool
;	TokenNameSEMICOLON	
bytePool	TokenNameIdentifier	 byte Pool
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
bytePool	TokenNameIdentifier	 byte Pool
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
postingsHash	TokenNameIdentifier	 postings Hash
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
=	TokenNameEQUAL	
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
.	TokenNameDOT	
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initPostingsArray	TokenNameIdentifier	 init Postings Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streamCount	TokenNameIdentifier	 stream Count
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
getStreamCount	TokenNameIdentifier	 get Stream Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPostingInt	TokenNameIdentifier	 num Posting Int
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
)	TokenNameRPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nextPerField	TokenNameIdentifier	 next Per Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
trackAllocations	TokenNameIdentifier	 track Allocations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
postingsHash	TokenNameIdentifier	 postings Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
-	TokenNameMINUS	
postingsHash	TokenNameIdentifier	 postings Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
-	TokenNameMINUS	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postingsArray	TokenNameIdentifier	 postings Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initPostingsArray	TokenNameIdentifier	 init Postings Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
postingsArray	TokenNameIdentifier	 postings Array
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
createPostingsArray	TokenNameIdentifier	 create Postings Array
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
*	TokenNameMULTIPLY	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sugar: just forwards to DW 	TokenNameCOMMENT_LINE	sugar: just forwards to DW 
private	TokenNameprivate	
void	TokenNamevoid	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
trackAllocations	TokenNameIdentifier	 track Allocations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
shrinkHash	TokenNameIdentifier	 shrink Hash
(	TokenNameLPAREN	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
postingsCompacted	TokenNameIdentifier	 postings Compacted
||	TokenNameOR_OR	
numPostings	TokenNameIdentifier	 num Postings
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
previousSize	TokenNameIdentifier	 previous Size
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
previousSize	TokenNameIdentifier	 previous Size
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
postingsHash	TokenNameIdentifier	 postings Hash
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
postingsHashHalfSize	TokenNameIdentifier	 postings Hash Half Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fully free the postings array on each flush: 	TokenNameCOMMENT_LINE	Fully free the postings array on each flush: 
if	TokenNameif	
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
-	TokenNameMINUS	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postingsArray	TokenNameIdentifier	 postings Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
postingsCompacted	TokenNameIdentifier	 postings Compacted
)	TokenNameRPAREN	
compactPostings	TokenNameIdentifier	 compact Postings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
numPostings	TokenNameIdentifier	 num Postings
<=	TokenNameLESS_EQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numPostings	TokenNameIdentifier	 num Postings
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
postingsHash	TokenNameIdentifier	 postings Hash
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numPostings	TokenNameIdentifier	 num Postings
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPostings	TokenNameIdentifier	 num Postings
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
postingsCompacted	TokenNameIdentifier	 postings Compacted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
growParallelPostingsArray	TokenNameIdentifier	 grow Parallel Postings Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldSize	TokenNameIdentifier	 old Size
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
oldSize	TokenNameIdentifier	 old Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
int	TokenNameint	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
stream	TokenNameIdentifier	 stream
<	TokenNameLESS	
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
int	TokenNameint	
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
intStarts	TokenNameIdentifier	 int Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
intStart	TokenNameIdentifier	 int Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SHIFT	TokenNameIdentifier	 INT  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
intStart	TokenNameIdentifier	 int Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_MASK	TokenNameIdentifier	 INT  BLOCK  MASK
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
bytePool	TokenNameIdentifier	 byte Pool
,	TokenNameCOMMA	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
byteStarts	TokenNameIdentifier	 byte Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
*	TokenNameMULTIPLY	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
,	TokenNameCOMMA	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
compactPostings	TokenNameIdentifier	 compact Postings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
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
postingsHashSize	TokenNameIdentifier	 postings Hash Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
numPostings	TokenNameIdentifier	 num Postings
:	TokenNameCOLON	
"upto="	TokenNameStringLiteral	upto=
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
" numPostings="	TokenNameStringLiteral	 numPostings=
+	TokenNamePLUS	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
postingsCompacted	TokenNameIdentifier	 postings Compacted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Collapse the hash table & sort in-place. */	TokenNameCOMMENT_JAVADOC	 Collapse the hash table & sort in-place. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortPostings	TokenNameIdentifier	 sort Postings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compactPostings	TokenNameIdentifier	 compact Postings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postingsHash	TokenNameIdentifier	 postings Hash
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
postingsHash	TokenNameIdentifier	 postings Hash
;	TokenNameSEMICOLON	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
term1	TokenNameIdentifier	 term1
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
term2	TokenNameIdentifier	 term2
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term1	TokenNameIdentifier	 term1
==	TokenNameEQUAL_EQUAL	
term2	TokenNameIdentifier	 term2
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textStart1	TokenNameIdentifier	 text Start1
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
term1	TokenNameIdentifier	 term1
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
textStart2	TokenNameIdentifier	 text Start2
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
term2	TokenNameIdentifier	 term2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text1	TokenNameIdentifier	 text1
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart1	TokenNameIdentifier	 text Start1
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
=	TokenNameEQUAL	
textStart1	TokenNameIdentifier	 text Start1
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart2	TokenNameIdentifier	 text Start2
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
=	TokenNameEQUAL	
textStart2	TokenNameIdentifier	 text Start2
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comparePostings	TokenNameIdentifier	 compare Postings
(	TokenNameLPAREN	
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
pos1	TokenNameIdentifier	 pos1
,	TokenNameCOMMA	
text2	TokenNameIdentifier	 text2
,	TokenNameCOMMA	
pos2	TokenNameIdentifier	 pos2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pivotTerm	TokenNameIdentifier	 pivot Term
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
pivotTerm	TokenNameIdentifier	 pivot Term
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pivotBuf	TokenNameIdentifier	 pivot Buf
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart	TokenNameIdentifier	 text Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pivotBufPos	TokenNameIdentifier	 pivot Buf Pos
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pivotTerm	TokenNameIdentifier	 pivot Term
==	TokenNameEQUAL_EQUAL	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
term	TokenNameIdentifier	 term
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart	TokenNameIdentifier	 text Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comparePostings	TokenNameIdentifier	 compare Postings
(	TokenNameLPAREN	
pivotBuf	TokenNameIdentifier	 pivot Buf
,	TokenNameCOMMA	
pivotBufPos	TokenNameIdentifier	 pivot Buf Pos
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
pivotTerm	TokenNameIdentifier	 pivot Term
,	TokenNameCOMMA	
pivotBufPos	TokenNameIdentifier	 pivot Buf Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pivotBuf	TokenNameIdentifier	 pivot Buf
;	TokenNameSEMICOLON	
/** Compares term text for two Posting instance and * returns -1 if p1 < p2; 1 if p1 > p2; else 0. */	TokenNameCOMMENT_JAVADOC	 Compares term text for two Posting instance and returns -1 if p1 < p2; 1 if p1 > p2; else 0. 
private	TokenNameprivate	
int	TokenNameint	
comparePostings	TokenNameIdentifier	 compare Postings
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text1	TokenNameIdentifier	 text1
,	TokenNameCOMMA	
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text2	TokenNameIdentifier	 text2
,	TokenNameCOMMA	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
text1	TokenNameIdentifier	 text1
!=	TokenNameNOT_EQUAL	
text2	TokenNameIdentifier	 text2
||	TokenNameOR_OR	
pos1	TokenNameIdentifier	 pos1
!=	TokenNameNOT_EQUAL	
pos2	TokenNameIdentifier	 pos2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
text1	TokenNameIdentifier	 text1
[	TokenNameLBRACKET	
pos1	TokenNameIdentifier	 pos1
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
text2	TokenNameIdentifier	 text2
[	TokenNameLBRACKET	
pos2	TokenNameIdentifier	 pos2
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// This method should never compare equal postings 	TokenNameCOMMENT_LINE	This method should never compare equal postings 
// unless p1==p2 	TokenNameCOMMENT_LINE	unless p1==p2 
assert	TokenNameassert	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numPostings	TokenNameIdentifier	 num Postings
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
postingsHash	TokenNameIdentifier	 postings Hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test whether the text for current RawPostingList p equals * current tokenText. */	TokenNameCOMMENT_JAVADOC	 Test whether the text for current RawPostingList p equals current tokenText. 
private	TokenNameprivate	
boolean	TokenNameboolean	
postingEquals	TokenNameIdentifier	 posting Equals
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenText	TokenNameIdentifier	 token Text
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
tokenTextLen	TokenNameIdentifier	 token Text Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart	TokenNameIdentifier	 text Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
tokenPos	TokenNameIdentifier	 token Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
tokenPos	TokenNameIdentifier	 token Pos
<	TokenNameLESS	
tokenTextLen	TokenNameIdentifier	 token Text Len
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
tokenPos	TokenNameIdentifier	 token Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
tokenText	TokenNameIdentifier	 token Text
[	TokenNameLBRACKET	
tokenPos	TokenNameIdentifier	 token Pos
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0xffff	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
doCall	TokenNameIdentifier	 do Call
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
doNextCall	TokenNameIdentifier	 do Next Call
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doCall	TokenNameIdentifier	 do Call
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initPostingsArray	TokenNameIdentifier	 init Postings Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
doNextCall	TokenNameIdentifier	 do Next Call
=	TokenNameEQUAL	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doCall	TokenNameIdentifier	 do Call
||	TokenNameOR_OR	
doNextCall	TokenNameIdentifier	 do Next Call
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Secondary entry point (for 2nd & subsequent TermsHash), 	TokenNameCOMMENT_LINE	Secondary entry point (for 2nd & subsequent TermsHash), 
// because token text has already been "interned" into 	TokenNameCOMMENT_LINE	because token text has already been "interned" into 
// textStart, so we hash by textStart 	TokenNameCOMMENT_LINE	textStart, so we hash by textStart 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
;	TokenNameSEMICOLON	
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
postingsCompacted	TokenNameIdentifier	 postings Compacted
;	TokenNameSEMICOLON	
// Locate RawPostingList in hash 	TokenNameCOMMENT_LINE	Locate RawPostingList in hash 
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
textStart	TokenNameIdentifier	 text Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Conflict: keep searching different locations in 	TokenNameCOMMENT_LINE	Conflict: keep searching different locations in 
// the hash table. 	TokenNameCOMMENT_LINE	the hash table. 
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
;	TokenNameSEMICOLON	
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
textStart	TokenNameIdentifier	 text Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we are seeing this token since we last 	TokenNameCOMMENT_LINE	First time we are seeing this token since we last 
// flushed the hash. 	TokenNameCOMMENT_LINE	flushed the hash. 
// New posting 	TokenNameCOMMENT_LINE	New posting 
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
numPostings	TokenNameIdentifier	 num Postings
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
>=	TokenNameGREATER_EQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
growParallelPostingsArray	TokenNameIdentifier	 grow Parallel Postings Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
termID	TokenNameIdentifier	 term ID
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
;	TokenNameSEMICOLON	
assert	TokenNameassert	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termID	TokenNameIdentifier	 term ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numPostings	TokenNameIdentifier	 num Postings
==	TokenNameEQUAL_EQUAL	
postingsHashHalfSize	TokenNameIdentifier	 postings Hash Half Size
)	TokenNameRPAREN	
rehashPostings	TokenNameIdentifier	 rehash Postings
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Init stream slices 	TokenNameCOMMENT_LINE	Init stream slices 
if	TokenNameif	
(	TokenNameLPAREN	
numPostingInt	TokenNameIdentifier	 num Posting Int
+	TokenNamePLUS	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intUpto	TokenNameIdentifier	 int Upto
>	TokenNameGREATER	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SIZE	TokenNameIdentifier	 INT  BLOCK  SIZE
)	TokenNameRPAREN	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
-	TokenNameMINUS	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
byteUpto	TokenNameIdentifier	 byte Upto
<	TokenNameLESS	
numPostingInt	TokenNameIdentifier	 num Posting Int
*	TokenNameMULTIPLY	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
)	TokenNameRPAREN	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
intUptoStart	TokenNameIdentifier	 int Upto Start
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intUpto	TokenNameIdentifier	 int Upto
;	TokenNameSEMICOLON	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intUpto	TokenNameIdentifier	 int Upto
+=	TokenNamePLUS_EQUAL	
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
intStarts	TokenNameIdentifier	 int Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intOffset	TokenNameIdentifier	 int Offset
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
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
newSlice	TokenNameIdentifier	 new Slice
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
byteStarts	TokenNameIdentifier	 byte Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
intStarts	TokenNameIdentifier	 int Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
intStart	TokenNameIdentifier	 int Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SHIFT	TokenNameIdentifier	 INT  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
intUptoStart	TokenNameIdentifier	 int Upto Start
=	TokenNameEQUAL	
intStart	TokenNameIdentifier	 int Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_MASK	TokenNameIdentifier	 INT  BLOCK  MASK
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Primary entry point (for first TermsHash) 	TokenNameCOMMENT_LINE	Primary entry point (for first TermsHash) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
postingsCompacted	TokenNameIdentifier	 postings Compacted
;	TokenNameSEMICOLON	
// We are first in the chain so we must "intern" the 	TokenNameCOMMENT_LINE	We are first in the chain so we must "intern" the 
// term text into textStart address 	TokenNameCOMMENT_LINE	term text into textStart address 
// Get the text of this term. 	TokenNameCOMMENT_LINE	Get the text of this term. 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenText	TokenNameIdentifier	 token Text
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
tokenTextLen	TokenNameIdentifier	 token Text Len
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute hashcode & replace any invalid UTF16 sequences 	TokenNameCOMMENT_LINE	Compute hashcode & replace any invalid UTF16 sequences 
int	TokenNameint	
downto	TokenNameIdentifier	 downto
=	TokenNameEQUAL	
tokenTextLen	TokenNameIdentifier	 token Text Len
;	TokenNameSEMICOLON	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
downto	TokenNameIdentifier	 downto
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tokenText	TokenNameIdentifier	 token Text
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
downto	TokenNameIdentifier	 downto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_LOW_END	TokenNameIdentifier	 UNI  SUR  LOW  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
downto	TokenNameIdentifier	 downto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Unpaired 	TokenNameCOMMENT_LINE	Unpaired 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tokenText	TokenNameIdentifier	 token Text
[	TokenNameLBRACKET	
downto	TokenNameIdentifier	 downto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_REPLACEMENT_CHAR	TokenNameIdentifier	 UNI  REPLACEMENT  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
tokenText	TokenNameIdentifier	 token Text
[	TokenNameLBRACKET	
downto	TokenNameIdentifier	 downto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
>=	TokenNameGREATER_EQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
&&	TokenNameAND_AND	
ch2	TokenNameIdentifier	 ch2
<=	TokenNameLESS_EQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_HIGH_END	TokenNameIdentifier	 UNI  SUR  HIGH  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OK: high followed by low. This is a valid 	TokenNameCOMMENT_LINE	OK: high followed by low. This is a valid 
// surrogate pair. 	TokenNameCOMMENT_LINE	surrogate pair. 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
downto	TokenNameIdentifier	 downto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Unpaired 	TokenNameCOMMENT_LINE	Unpaired 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tokenText	TokenNameIdentifier	 token Text
[	TokenNameLBRACKET	
downto	TokenNameIdentifier	 downto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_REPLACEMENT_CHAR	TokenNameIdentifier	 UNI  REPLACEMENT  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_HIGH_END	TokenNameIdentifier	 UNI  SUR  HIGH  END
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Unpaired or 0xffff 	TokenNameCOMMENT_LINE	Unpaired or 0xffff 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tokenText	TokenNameIdentifier	 token Text
[	TokenNameLBRACKET	
downto	TokenNameIdentifier	 downto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_REPLACEMENT_CHAR	TokenNameIdentifier	 UNI  REPLACEMENT  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
;	TokenNameSEMICOLON	
// Locate RawPostingList in hash 	TokenNameCOMMENT_LINE	Locate RawPostingList in hash 
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
postingEquals	TokenNameIdentifier	 posting Equals
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
tokenText	TokenNameIdentifier	 token Text
,	TokenNameCOMMA	
tokenTextLen	TokenNameIdentifier	 token Text Len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Conflict: keep searching different locations in 	TokenNameCOMMENT_LINE	Conflict: keep searching different locations in 
// the hash table. 	TokenNameCOMMENT_LINE	the hash table. 
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
;	TokenNameSEMICOLON	
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
postingEquals	TokenNameIdentifier	 posting Equals
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
tokenText	TokenNameIdentifier	 token Text
,	TokenNameCOMMA	
tokenTextLen	TokenNameIdentifier	 token Text Len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we are seeing this token since we last 	TokenNameCOMMENT_LINE	First time we are seeing this token since we last 
// flushed the hash. 	TokenNameCOMMENT_LINE	flushed the hash. 
final	TokenNamefinal	
int	TokenNameint	
textLen1	TokenNameIdentifier	 text Len1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
tokenTextLen	TokenNameIdentifier	 token Text Len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textLen1	TokenNameIdentifier	 text Len1
+	TokenNamePLUS	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
charUpto	TokenNameIdentifier	 char Upto
>	TokenNameGREATER	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
textLen1	TokenNameIdentifier	 text Len1
>	TokenNameGREATER	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just skip this term, to remain as robust as 	TokenNameCOMMENT_LINE	Just skip this term, to remain as robust as 
// possible during indexing. A TokenFilter 	TokenNameCOMMENT_LINE	possible during indexing. A TokenFilter 
// can be inserted into the analyzer chain if 	TokenNameCOMMENT_LINE	can be inserted into the analyzer chain if 
// other behavior is wanted (pruning the term 	TokenNameCOMMENT_LINE	other behavior is wanted (pruning the term 
// to a prefix, throwing an exception, etc). 	TokenNameCOMMENT_LINE	to a prefix, throwing an exception, etc). 
if	TokenNameif	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxTermPrefix	TokenNameIdentifier	 max Term Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxTermPrefix	TokenNameIdentifier	 max Term Prefix
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
tokenText	TokenNameIdentifier	 token Text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
skippingLongTerm	TokenNameIdentifier	 skipping Long Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// New posting 	TokenNameCOMMENT_LINE	New posting 
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
numPostings	TokenNameIdentifier	 num Postings
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
>=	TokenNameGREATER_EQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
growParallelPostingsArray	TokenNameIdentifier	 grow Parallel Postings Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
termID	TokenNameIdentifier	 term ID
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textUpto	TokenNameIdentifier	 text Upto
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
charUpto	TokenNameIdentifier	 char Upto
;	TokenNameSEMICOLON	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
textUpto	TokenNameIdentifier	 text Upto
+	TokenNamePLUS	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
charUpto	TokenNameIdentifier	 char Upto
+=	TokenNamePLUS_EQUAL	
textLen1	TokenNameIdentifier	 text Len1
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tokenText	TokenNameIdentifier	 token Text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
textUpto	TokenNameIdentifier	 text Upto
,	TokenNameCOMMA	
tokenTextLen	TokenNameIdentifier	 token Text Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
textUpto	TokenNameIdentifier	 text Upto
+	TokenNamePLUS	
tokenTextLen	TokenNameIdentifier	 token Text Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termID	TokenNameIdentifier	 term ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numPostings	TokenNameIdentifier	 num Postings
==	TokenNameEQUAL_EQUAL	
postingsHashHalfSize	TokenNameIdentifier	 postings Hash Half Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehashPostings	TokenNameIdentifier	 rehash Postings
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
numPostings	TokenNameIdentifier	 num Postings
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Init stream slices 	TokenNameCOMMENT_LINE	Init stream slices 
if	TokenNameif	
(	TokenNameLPAREN	
numPostingInt	TokenNameIdentifier	 num Posting Int
+	TokenNamePLUS	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intUpto	TokenNameIdentifier	 int Upto
>	TokenNameGREATER	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SIZE	TokenNameIdentifier	 INT  BLOCK  SIZE
)	TokenNameRPAREN	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
-	TokenNameMINUS	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
byteUpto	TokenNameIdentifier	 byte Upto
<	TokenNameLESS	
numPostingInt	TokenNameIdentifier	 num Posting Int
*	TokenNameMULTIPLY	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
)	TokenNameRPAREN	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
intUptoStart	TokenNameIdentifier	 int Upto Start
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intUpto	TokenNameIdentifier	 int Upto
;	TokenNameSEMICOLON	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intUpto	TokenNameIdentifier	 int Upto
+=	TokenNamePLUS_EQUAL	
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
intStarts	TokenNameIdentifier	 int Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
intOffset	TokenNameIdentifier	 int Offset
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
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
newSlice	TokenNameIdentifier	 new Slice
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
FIRST_LEVEL_SIZE	TokenNameIdentifier	 FIRST  LEVEL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
byteStarts	TokenNameIdentifier	 byte Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
intStarts	TokenNameIdentifier	 int Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
=	TokenNameEQUAL	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
intStart	TokenNameIdentifier	 int Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SHIFT	TokenNameIdentifier	 INT  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
intUptoStart	TokenNameIdentifier	 int Upto Start
=	TokenNameEQUAL	
intStart	TokenNameIdentifier	 int Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_MASK	TokenNameIdentifier	 INT  BLOCK  MASK
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doNextCall	TokenNameIdentifier	 do Next Call
)	TokenNameRPAREN	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intUptos	TokenNameIdentifier	 int Uptos
;	TokenNameSEMICOLON	
int	TokenNameint	
intUptoStart	TokenNameIdentifier	 int Upto Start
;	TokenNameSEMICOLON	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
int	TokenNameint	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// End of slice; allocate a new one 	TokenNameCOMMENT_LINE	End of slice; allocate a new one 
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
allocSlice	TokenNameIdentifier	 alloc Slice
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
intUptos	TokenNameIdentifier	 int Uptos
[	TokenNameLBRACKET	
intUptoStart	TokenNameIdentifier	 int Upto Start
+	TokenNamePLUS	
stream	TokenNameIdentifier	 stream
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
int	TokenNameint	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: optimize 	TokenNameCOMMENT_LINE	TODO: optimize 
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
int	TokenNameint	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
stream	TokenNameIdentifier	 stream
<	TokenNameLESS	
streamCount	TokenNameIdentifier	 stream Count
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
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
nextPerField	TokenNameIdentifier	 next Per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextPerField	TokenNameIdentifier	 next Per Field
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Called when postings hash is too small (> 50% * occupied) or too large (< 20% occupied). */	TokenNameCOMMENT_JAVADOC	 Called when postings hash is too small (> 50% occupied) or too large (< 20% occupied). 
void	TokenNamevoid	
rehashPostings	TokenNameIdentifier	 rehash Postings
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
newMask	TokenNameIdentifier	 new Mask
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newHash	TokenNameIdentifier	 new Hash
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
newHash	TokenNameIdentifier	 new Hash
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
postingsHashSize	TokenNameIdentifier	 postings Hash Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
=	TokenNameEQUAL	
postingsHash	TokenNameIdentifier	 postings Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
primary	TokenNameIdentifier	 primary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart	TokenNameIdentifier	 text Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
postingsArray	TokenNameIdentifier	 postings Array
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
newMask	TokenNameIdentifier	 new Mask
;	TokenNameSEMICOLON	
assert	TokenNameassert	
hashPos	TokenNameIdentifier	 hash Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newHash	TokenNameIdentifier	 new Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
&	TokenNameAND	
newMask	TokenNameIdentifier	 new Mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
newHash	TokenNameIdentifier	 new Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newHash	TokenNameIdentifier	 new Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termID	TokenNameIdentifier	 term ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
postingsHashMask	TokenNameIdentifier	 postings Hash Mask
=	TokenNameEQUAL	
newMask	TokenNameIdentifier	 new Mask
;	TokenNameSEMICOLON	
postingsHash	TokenNameIdentifier	 postings Hash
=	TokenNameEQUAL	
newHash	TokenNameIdentifier	 new Hash
;	TokenNameSEMICOLON	
postingsHashSize	TokenNameIdentifier	 postings Hash Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
postingsHashHalfSize	TokenNameIdentifier	 postings Hash Half Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
