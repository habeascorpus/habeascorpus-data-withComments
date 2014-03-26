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
StringHelper	TokenNameIdentifier	 String Helper
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
TermVectorsWriter	TokenNameIdentifier	 Term Vectors Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
tvx	TokenNameIdentifier	 tvx
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
tvd	TokenNameIdentifier	 tvd
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
utf8Results	TokenNameIdentifier	 utf8 Results
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// used only by assert/checks 	TokenNameCOMMENT_LINE	used only by assert/checks 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermVectorsWriter	TokenNameIdentifier	 Term Vectors Writer
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Open files for TermVector storage 	TokenNameCOMMENT_LINE	Open files for TermVector storage 
tvx	TokenNameIdentifier	 tvx
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
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
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
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
)	TokenNameRPAREN	
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
VECTORS_FIELDS_EXTENSION	TokenNameIdentifier	 VECTORS  FIELDS  EXTENSION
)	TokenNameRPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a complete document specified by all its term vectors. If document has no * term vectors, add value for tvx. * * @param vectors * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Add a complete document specified by all its term vectors. If document has no term vectors, add value for tvx. * @param vectors @throws IOException 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addAllDocVectors	TokenNameIdentifier	 add All Doc Vectors
(	TokenNameLPAREN	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vectors	TokenNameIdentifier	 vectors
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
if	TokenNameif	
(	TokenNameLPAREN	
vectors	TokenNameIdentifier	 vectors
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numFields	TokenNameIdentifier	 num Fields
=	TokenNameEQUAL	
vectors	TokenNameIdentifier	 vectors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
numFields	TokenNameIdentifier	 num Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldPointers	TokenNameIdentifier	 field Pointers
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
numFields	TokenNameIdentifier	 num Fields
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
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldPointers	TokenNameIdentifier	 field Pointers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldNumber	TokenNameIdentifier	 field Number
(	TokenNameLPAREN	
vectors	TokenNameIdentifier	 vectors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1st pass: write field numbers to tvd 	TokenNameCOMMENT_LINE	1st pass: write field numbers to tvd 
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
vectors	TokenNameIdentifier	 vectors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
tpVector	TokenNameIdentifier	 tp Vector
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
storePositions	TokenNameIdentifier	 store Positions
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vectors	TokenNameIdentifier	 vectors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// May have positions & offsets 	TokenNameCOMMENT_LINE	May have positions & offsets 
tpVector	TokenNameIdentifier	 tp Vector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
)	TokenNameRPAREN	
vectors	TokenNameIdentifier	 vectors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
storePositions	TokenNameIdentifier	 store Positions
=	TokenNameEQUAL	
tpVector	TokenNameIdentifier	 tp Vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tpVector	TokenNameIdentifier	 tp Vector
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
storeOffsets	TokenNameIdentifier	 store Offsets
=	TokenNameEQUAL	
tpVector	TokenNameIdentifier	 tp Vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tpVector	TokenNameIdentifier	 tp Vector
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
storePositions	TokenNameIdentifier	 store Positions
?	TokenNameQUESTION	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
STORE_POSITIONS_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  POSITIONS  WITH  TERMVECTOR
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
?	TokenNameQUESTION	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
.	TokenNameDOT	
STORE_OFFSET_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  OFFSET  WITH  TERMVECTOR
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tpVector	TokenNameIdentifier	 tp Vector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
storePositions	TokenNameIdentifier	 store Positions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
storeOffsets	TokenNameIdentifier	 store Offsets
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
vectors	TokenNameIdentifier	 vectors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
=	TokenNameEQUAL	
vectors	TokenNameIdentifier	 vectors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFrequencies	TokenNameIdentifier	 get Term Frequencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
utf8Upto	TokenNameIdentifier	 utf8 Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
numTerms	TokenNameIdentifier	 num Terms
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
bytesDifference	TokenNameIdentifier	 bytes Difference
(	TokenNameLPAREN	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write shared prefix length 	TokenNameCOMMENT_LINE	write shared prefix length 
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write delta length 	TokenNameCOMMENT_LINE	write delta length 
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
utf8Upto	TokenNameIdentifier	 utf8 Upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write delta bytes 	TokenNameCOMMENT_LINE	write delta bytes 
utf8Upto	TokenNameIdentifier	 utf8 Upto
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
utf8Upto	TokenNameIdentifier	 utf8 Upto
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
termFreq	TokenNameIdentifier	 term Freq
=	TokenNameEQUAL	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
termFreq	TokenNameIdentifier	 term Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
tpVector	TokenNameIdentifier	 tp Vector
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Trying to write positions that are null!"	TokenNameStringLiteral	Trying to write positions that are null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
termFreq	TokenNameIdentifier	 term Freq
;	TokenNameSEMICOLON	
// use delta encoding for positions 	TokenNameCOMMENT_LINE	use delta encoding for positions 
int	TokenNameint	
lastPosition	TokenNameIdentifier	 last Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
lastPosition	TokenNameIdentifier	 last Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastPosition	TokenNameIdentifier	 last Position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
tpVector	TokenNameIdentifier	 tp Vector
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Trying to write offsets that are null!"	TokenNameStringLiteral	Trying to write offsets that are null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
termFreq	TokenNameIdentifier	 term Freq
;	TokenNameSEMICOLON	
// use delta encoding for offsets 	TokenNameCOMMENT_LINE	use delta encoding for offsets 
int	TokenNameint	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
-	TokenNameMINUS	
lastEndOffset	TokenNameIdentifier	 last End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 2nd pass: write field pointers to tvd 	TokenNameCOMMENT_LINE	2nd pass: write field pointers to tvd 
if	TokenNameif	
(	TokenNameLPAREN	
numFields	TokenNameIdentifier	 num Fields
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
lastFieldPointer	TokenNameIdentifier	 last Field Pointer
=	TokenNameEQUAL	
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
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
fieldPointer	TokenNameIdentifier	 field Pointer
=	TokenNameEQUAL	
fieldPointers	TokenNameIdentifier	 field Pointers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
fieldPointer	TokenNameIdentifier	 field Pointer
-	TokenNameMINUS	
lastFieldPointer	TokenNameIdentifier	 last Field Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastFieldPointer	TokenNameIdentifier	 last Field Pointer
=	TokenNameEQUAL	
fieldPointer	TokenNameIdentifier	 field Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do a bulk copy of numDocs documents from reader to our * streams. This is used to expedite merging, if the * field numbers are congruent. */	TokenNameCOMMENT_JAVADOC	 Do a bulk copy of numDocs documents from reader to our streams. This is used to expedite merging, if the field numbers are congruent. 
final	TokenNamefinal	
void	TokenNamevoid	
addRawDocuments	TokenNameIdentifier	 add Raw Documents
(	TokenNameLPAREN	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tvdLengths	TokenNameIdentifier	 tvd Lengths
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tvfLengths	TokenNameIdentifier	 tvf Lengths
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvfPosition	TokenNameIdentifier	 tvf Position
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvdStart	TokenNameIdentifier	 tvd Start
=	TokenNameEQUAL	
tvdPosition	TokenNameIdentifier	 tvd Position
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvfStart	TokenNameIdentifier	 tvf Start
=	TokenNameEQUAL	
tvfPosition	TokenNameIdentifier	 tvf Position
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
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
tvdPosition	TokenNameIdentifier	 tvd Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvdPosition	TokenNameIdentifier	 tvd Position
+=	TokenNamePLUS_EQUAL	
tvdLengths	TokenNameIdentifier	 tvd Lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
tvfPosition	TokenNameIdentifier	 tvf Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvfPosition	TokenNameIdentifier	 tvf Position
+=	TokenNamePLUS_EQUAL	
tvfLengths	TokenNameIdentifier	 tvf Lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTvdStream	TokenNameIdentifier	 get Tvd Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tvdPosition	TokenNameIdentifier	 tvd Position
-	TokenNameMINUS	
tvdStart	TokenNameIdentifier	 tvd Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTvfStream	TokenNameIdentifier	 get Tvf Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tvfPosition	TokenNameIdentifier	 tvf Position
-	TokenNameMINUS	
tvfStart	TokenNameIdentifier	 tvf Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
tvdPosition	TokenNameIdentifier	 tvd Position
;	TokenNameSEMICOLON	
assert	TokenNameassert	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
tvfPosition	TokenNameIdentifier	 tvf Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
idxName	TokenNameIdentifier	 idx Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This is most likely a bug in Sun JRE 1.6.0_04/_05; 	TokenNameCOMMENT_LINE	This is most likely a bug in Sun JRE 1.6.0_04/_05; 
// we detect that the bug has struck, here, and 	TokenNameCOMMENT_LINE	we detect that the bug has struck, here, and 
// throw an exception to prevent the corruption from 	TokenNameCOMMENT_LINE	throw an exception to prevent the corruption from 
// entering the index. See LUCENE-1282 for 	TokenNameCOMMENT_LINE	entering the index. See LUCENE-1282 for 
// details. 	TokenNameCOMMENT_LINE	details. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"tvx size mismatch: "	TokenNameStringLiteral	tvx size mismatch: 
+	TokenNamePLUS	
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
/** Close all streams. */	TokenNameCOMMENT_JAVADOC	 Close all streams. 
final	TokenNamefinal	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// make an effort to close all streams we can but remember and re-throw 	TokenNameCOMMENT_LINE	make an effort to close all streams we can but remember and re-throw 
// the first exception encountered in this process 	TokenNameCOMMENT_LINE	the first exception encountered in this process 
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
