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
Comparator	TokenNameIdentifier	 Comparator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitUtil	TokenNameIdentifier	 Bit Util
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
BytesRef	TokenNameIdentifier	 Bytes Ref
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
PagedBytes	TokenNameIdentifier	 Paged Bytes
.	TokenNameDOT	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
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
PagedBytes	TokenNameIdentifier	 Paged Bytes
.	TokenNameDOT	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
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
PagedBytes	TokenNameIdentifier	 Paged Bytes
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
packed	TokenNameIdentifier	 packed
.	TokenNameDOT	
GrowableWriter	TokenNameIdentifier	 Growable Writer
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
packed	TokenNameIdentifier	 packed
.	TokenNameDOT	
PackedInts	TokenNameIdentifier	 Packed Ints
;	TokenNameSEMICOLON	
/** * This stores a monotonically increasing set of <Term, TermInfo> pairs in an * index segment. Pairs are accessed either by Term or by ordinal position the * set. The Terms and TermInfo are actually serialized and stored into a byte * array and pointers to the position of each are stored in a int array. */	TokenNameCOMMENT_JAVADOC	 This stores a monotonically increasing set of <Term, TermInfo> pairs in an index segment. Pairs are accessed either by Term or by ordinal position the set. The Terms and TermInfo are actually serialized and stored into a byte array and pointers to the position of each are stored in a int array. 
class	TokenNameclass	
TermInfosReaderIndex	TokenNameIdentifier	 Term Infos Reader Index
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_PAGE_BITS	TokenNameIdentifier	 MAX  PAGE  BITS
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 256 KB block 	TokenNameCOMMENT_LINE	256 KB block 
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
getUTF8SortedAsUTF16Comparator	TokenNameIdentifier	 get UT F8 Sorted As UT F16 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
dataInput	TokenNameIdentifier	 data Input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
indexToDataOffset	TokenNameIdentifier	 index To Data Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
indexSize	TokenNameIdentifier	 index Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
/** * Loads the segment information at segment load time. * * @param indexEnum * the term enum. * @param indexDivisor * the index divisor. * @param tiiFileLength * the size of the tii file, used to approximate the size of the * buffer. * @param totalIndexInterval * the total index interval. */	TokenNameCOMMENT_JAVADOC	 Loads the segment information at segment load time. * @param indexEnum the term enum. @param indexDivisor the index divisor. @param tiiFileLength the size of the tii file, used to approximate the size of the buffer. @param totalIndexInterval the total index interval. 
TermInfosReaderIndex	TokenNameIdentifier	 Term Infos Reader Index
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
indexEnum	TokenNameIdentifier	 index Enum
,	TokenNameCOMMA	
int	TokenNameint	
indexDivisor	TokenNameIdentifier	 index Divisor
,	TokenNameCOMMA	
long	TokenNamelong	
tiiFileLength	TokenNameIdentifier	 tii File Length
,	TokenNameCOMMA	
int	TokenNameint	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
=	TokenNameEQUAL	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
;	TokenNameSEMICOLON	
indexSize	TokenNameIdentifier	 index Size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
indexDivisor	TokenNameIdentifier	 index Divisor
;	TokenNameSEMICOLON	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
// this is only an inital size, it will be GCed once the build is complete 	TokenNameCOMMENT_LINE	this is only an inital size, it will be GCed once the build is complete 
long	TokenNamelong	
initialSize	TokenNameIdentifier	 initial Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tiiFileLength	TokenNameIdentifier	 tii File Length
*	TokenNameMULTIPLY	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
indexDivisor	TokenNameIdentifier	 index Divisor
;	TokenNameSEMICOLON	
PagedBytes	TokenNameIdentifier	 Paged Bytes
dataPagedBytes	TokenNameIdentifier	 data Paged Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
PagedBytes	TokenNameIdentifier	 Paged Bytes
(	TokenNameLPAREN	
estimatePageBits	TokenNameIdentifier	 estimate Page Bits
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
dataOutput	TokenNameIdentifier	 data Output
=	TokenNameEQUAL	
dataPagedBytes	TokenNameIdentifier	 data Paged Bytes
.	TokenNameDOT	
getDataOutput	TokenNameIdentifier	 get Data Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GrowableWriter	TokenNameIdentifier	 Growable Writer
indexToTerms	TokenNameIdentifier	 index To Terms
=	TokenNameEQUAL	
new	TokenNamenew	
GrowableWriter	TokenNameIdentifier	 Growable Writer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexSize	TokenNameIdentifier	 index Size
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
currentField	TokenNameIdentifier	 current Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldStrs	TokenNameIdentifier	 field Strs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldCounter	TokenNameIdentifier	 field Counter
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
fieldStrs	TokenNameIdentifier	 field Strs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentField	TokenNameIdentifier	 current Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldCounter	TokenNameIdentifier	 field Counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermInfo	TokenNameIdentifier	 Term Info
termInfo	TokenNameIdentifier	 term Info
=	TokenNameEQUAL	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
termInfo	TokenNameIdentifier	 term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexToTerms	TokenNameIdentifier	 index To Terms
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
fieldCounter	TokenNameIdentifier	 field Counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>=	TokenNameGREATER_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
indexPointer	TokenNameIdentifier	 index Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
indexDivisor	TokenNameIdentifier	 index Divisor
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
fieldStrs	TokenNameIdentifier	 field Strs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldStrs	TokenNameIdentifier	 field Strs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dataPagedBytes	TokenNameIdentifier	 data Paged Bytes
.	TokenNameDOT	
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataInput	TokenNameIdentifier	 data Input
=	TokenNameEQUAL	
dataPagedBytes	TokenNameIdentifier	 data Paged Bytes
.	TokenNameDOT	
getDataInput	TokenNameIdentifier	 get Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexToDataOffset	TokenNameIdentifier	 index To Data Offset
=	TokenNameEQUAL	
indexToTerms	TokenNameIdentifier	 index To Terms
.	TokenNameDOT	
getMutable	TokenNameIdentifier	 get Mutable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
estimatePageBits	TokenNameIdentifier	 estimate Page Bits
(	TokenNameLPAREN	
long	TokenNamelong	
estSize	TokenNameIdentifier	 est Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
-	TokenNameMINUS	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
estSize	TokenNameIdentifier	 est Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MAX_PAGE_BITS	TokenNameIdentifier	 MAX  PAGE  BITS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
seekEnum	TokenNameIdentifier	 seek Enum
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
enumerator	TokenNameIdentifier	 enumerator
,	TokenNameCOMMA	
int	TokenNameint	
indexOffset	TokenNameIdentifier	 index Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
)	TokenNameRPAREN	
dataInput	TokenNameIdentifier	 data Input
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
indexToDataOffset	TokenNameIdentifier	 index To Data Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
indexOffset	TokenNameIdentifier	 index Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the term 	TokenNameCOMMENT_LINE	read the term 
int	TokenNameint	
fieldId	TokenNameIdentifier	 field Id
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
fieldId	TokenNameIdentifier	 field Id
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the terminfo 	TokenNameCOMMENT_LINE	read the terminfo 
TermInfo	TokenNameIdentifier	 Term Info
termInfo	TokenNameIdentifier	 term Info
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>=	TokenNameGREATER_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// perform the seek 	TokenNameCOMMENT_LINE	perform the seek 
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
indexOffset	TokenNameIdentifier	 index Offset
*	TokenNameMULTIPLY	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termInfo	TokenNameIdentifier	 term Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Binary search for the given term. * * @param term * the term to locate. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Binary search for the given term. * @param term the term to locate. @throws IOException 
int	TokenNameint	
getIndexOffset	TokenNameIdentifier	 get Index Offset
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
indexSize	TokenNameIdentifier	 index Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
)	TokenNameRPAREN	
dataInput	TokenNameIdentifier	 data Input
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the term at the given position. For testing. * * @param termIndex * the position to read the term from the index. * @return the term. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Gets the term at the given position. For testing. * @param termIndex the position to read the term from the index. @return the term. @throws IOException 
Term	TokenNameIdentifier	 Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
int	TokenNameint	
termIndex	TokenNameIdentifier	 term Index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
)	TokenNameRPAREN	
dataInput	TokenNameIdentifier	 data Input
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
indexToDataOffset	TokenNameIdentifier	 index To Data Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termIndex	TokenNameIdentifier	 term Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the term 	TokenNameCOMMENT_LINE	read the term 
int	TokenNameint	
fieldId	TokenNameIdentifier	 field Id
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
fieldId	TokenNameIdentifier	 field Id
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of terms. * * @return int. */	TokenNameCOMMENT_JAVADOC	 Returns the number of terms. * @return int. 
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexSize	TokenNameIdentifier	 index Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The compares the given term against the term in the index specified by the * term index. ie It returns negative N when term is less than index term; * * @param term * the given term. * @param termIndex * the index of the of term to compare. * @return int. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 The compares the given term against the term in the index specified by the term index. ie It returns negative N when term is less than index term; * @param term the given term. @param termIndex the index of the of term to compare. @return int. @throws IOException 
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
,	TokenNameCOMMA	
int	TokenNameint	
termIndex	TokenNameIdentifier	 term Index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
,	TokenNameCOMMA	
termIndex	TokenNameIdentifier	 term Index
,	TokenNameCOMMA	
(	TokenNameLPAREN	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
)	TokenNameRPAREN	
dataInput	TokenNameIdentifier	 data Input
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare the fields of the terms first, and if not equals return from * compare. If equal compare terms. * * @param term * the term to compare. * @param termIndex * the position of the term in the input to compare * @param input * the input buffer. * @return int. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Compare the fields of the terms first, and if not equals return from compare. If equal compare terms. * @param term the term to compare. @param termIndex the position of the term in the input to compare @param input the input buffer. @return int. @throws IOException 
private	TokenNameprivate	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
,	TokenNameCOMMA	
int	TokenNameint	
termIndex	TokenNameIdentifier	 term Index
,	TokenNameCOMMA	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
reuse	TokenNameIdentifier	 reuse
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// if term field does not equal mid's field index, then compare fields 	TokenNameCOMMENT_LINE	if term field does not equal mid's field index, then compare fields 
// else if they are equal, compare term's string values... 	TokenNameCOMMENT_LINE	else if they are equal, compare term's string values... 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termIndex	TokenNameIdentifier	 term Index
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reuse	TokenNameIdentifier	 reuse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reuse	TokenNameIdentifier	 reuse
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
reuse	TokenNameIdentifier	 reuse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
reuse	TokenNameIdentifier	 reuse
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reuse	TokenNameIdentifier	 reuse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
,	TokenNameCOMMA	
reuse	TokenNameIdentifier	 reuse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares the fields before checking the text of the terms. * * @param term * the given term. * @param termIndex * the term that exists in the data block. * @param input * the data block. * @return int. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Compares the fields before checking the text of the terms. * @param term the given term. @param termIndex the term that exists in the data block. @param input the data block. @return int. @throws IOException 
private	TokenNameprivate	
int	TokenNameint	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
termIndex	TokenNameIdentifier	 term Index
,	TokenNameCOMMA	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
indexToDataOffset	TokenNameIdentifier	 index To Data Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termIndex	TokenNameIdentifier	 term Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
