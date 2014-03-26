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
Closeable	TokenNameIdentifier	 Closeable
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
Arrays	TokenNameIdentifier	 Arrays
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
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
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
class	TokenNameclass	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
// NOTE: if you make a new format, it must be larger than 	TokenNameCOMMENT_LINE	NOTE: if you make a new format, it must be larger than 
// the current format 	TokenNameCOMMENT_LINE	the current format 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_VERSION	TokenNameIdentifier	 FORMAT  VERSION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Changes to speed up bulk merging of term vectors: 	TokenNameCOMMENT_LINE	Changes to speed up bulk merging of term vectors: 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_VERSION2	TokenNameIdentifier	 FORMAT  VERSIO N2
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Changed strings to UTF8 with length-in-bytes not length-in-chars 	TokenNameCOMMENT_LINE	Changed strings to UTF8 with length-in-bytes not length-in-chars 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  UT F8  LENGTH  IN  BYTES
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// NOTE: always change this if you switch to a new format! 	TokenNameCOMMENT_LINE	NOTE: always change this if you switch to a new format! 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
=	TokenNameEQUAL	
FORMAT_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  UT F8  LENGTH  IN  BYTES
;	TokenNameSEMICOLON	
//The size in bytes that the FORMAT_VERSION will take up at the beginning of each file 	TokenNameCOMMENT_LINE	The size in bytes that the FORMAT_VERSION will take up at the beginning of each file 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_SIZE	TokenNameIdentifier	 FORMAT  SIZE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
STORE_POSITIONS_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  POSITIONS  WITH  TERMVECTOR
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
STORE_OFFSET_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  OFFSET  WITH  TERMVECTOR
=	TokenNameEQUAL	
0x2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
tvx	TokenNameIdentifier	 tvx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
tvd	TokenNameIdentifier	 tvd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
tvf	TokenNameIdentifier	 tvf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numTotalDocs	TokenNameIdentifier	 num Total Docs
;	TokenNameSEMICOLON	
// The docID offset where our docs begin in the index 	TokenNameCOMMENT_LINE	The docID offset where our docs begin in the index 
// file. This will be 0 if we have our own private file. 	TokenNameCOMMENT_LINE	file. This will be 0 if we have our own private file. 
private	TokenNameprivate	
int	TokenNameint	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
int	TokenNameint	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
int	TokenNameint	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
int	TokenNameint	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
tvx	TokenNameIdentifier	 tvx
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
idxName	TokenNameIdentifier	 idx Name
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
checkValidFormat	TokenNameIdentifier	 check Valid Format
(	TokenNameLPAREN	
idxName	TokenNameIdentifier	 idx Name
,	TokenNameCOMMA	
tvx	TokenNameIdentifier	 tvx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fn	TokenNameIdentifier	 fn
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
tvdFormat	TokenNameIdentifier	 tvd Format
=	TokenNameEQUAL	
checkValidFormat	TokenNameIdentifier	 check Valid Format
(	TokenNameLPAREN	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
tvd	TokenNameIdentifier	 tvd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fn	TokenNameIdentifier	 fn
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
tvfFormat	TokenNameIdentifier	 tvf Format
=	TokenNameEQUAL	
checkValidFormat	TokenNameIdentifier	 check Valid Format
(	TokenNameLPAREN	
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
tvf	TokenNameIdentifier	 tvf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
tvdFormat	TokenNameIdentifier	 tvd Format
;	TokenNameSEMICOLON	
assert	TokenNameassert	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
tvfFormat	TokenNameIdentifier	 tvf Format
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_VERSION2	TokenNameIdentifier	 FORMAT  VERSIO N2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numTotalDocs	TokenNameIdentifier	 num Total Docs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
FORMAT_SIZE	TokenNameIdentifier	 FORMAT  SIZE
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
8	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numTotalDocs	TokenNameIdentifier	 num Total Docs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
numTotalDocs	TokenNameIdentifier	 num Total Docs
;	TokenNameSEMICOLON	
assert	TokenNameassert	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
numTotalDocs	TokenNameIdentifier	 num Total Docs
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
=	TokenNameEQUAL	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
// Verify the file is long enough to hold all of our 	TokenNameCOMMENT_LINE	Verify the file is long enough to hold all of our 
// docs 	TokenNameCOMMENT_LINE	docs 
assert	TokenNameassert	
numTotalDocs	TokenNameIdentifier	 num Total Docs
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
:	TokenNameCOLON	
"numTotalDocs="	TokenNameStringLiteral	numTotalDocs=
+	TokenNamePLUS	
numTotalDocs	TokenNameIdentifier	 num Total Docs
+	TokenNamePLUS	
" size="	TokenNameStringLiteral	 size=
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
" docStoreOffset="	TokenNameStringLiteral	 docStoreOffset=
+	TokenNamePLUS	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// With lock-less commits, it's entirely possible (and 	TokenNameCOMMENT_LINE	With lock-less commits, it's entirely possible (and 
// fine) to hit a FileNotFound exception above. In 	TokenNameCOMMENT_LINE	fine) to hit a FileNotFound exception above. In 
// this case, we want to explicitly close any subset 	TokenNameCOMMENT_LINE	this case, we want to explicitly close any subset 
// of things that were opened so that we don't have to 	TokenNameCOMMENT_LINE	of things that were opened so that we don't have to 
// wait for a GC to do so. 	TokenNameCOMMENT_LINE	wait for a GC to do so. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Used for bulk copy when merging 	TokenNameCOMMENT_LINE	Used for bulk copy when merging 
IndexInput	TokenNameIdentifier	 Index Input
getTvdStream	TokenNameIdentifier	 get Tvd Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tvd	TokenNameIdentifier	 tvd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used for bulk copy when merging 	TokenNameCOMMENT_LINE	Used for bulk copy when merging 
IndexInput	TokenNameIdentifier	 Index Input
getTvfStream	TokenNameIdentifier	 get Tvf Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tvf	TokenNameIdentifier	 tvf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
void	TokenNamevoid	
seekTvx	TokenNameIdentifier	 seek Tvx
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<	TokenNameLESS	
FORMAT_VERSION2	TokenNameIdentifier	 FORMAT  VERSIO N2
)	TokenNameRPAREN	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
+	TokenNamePLUS	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8L	TokenNameLongLiteral	
+	TokenNamePLUS	
FORMAT_SIZE	TokenNameIdentifier	 FORMAT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
+	TokenNamePLUS	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
16L	TokenNameLongLiteral	
+	TokenNamePLUS	
FORMAT_SIZE	TokenNameIdentifier	 FORMAT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
canReadRawDocs	TokenNameIdentifier	 can Read Raw Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  UT F8  LENGTH  IN  BYTES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve the length (in bytes) of the tvd and tvf * entries for the next numDocs starting with * startDocID. This is used for bulk copying when * merging segments, if the field numbers are * congruent. Once this returns, the tvf & tvd streams * are seeked to the startDocID. */	TokenNameCOMMENT_JAVADOC	 Retrieve the length (in bytes) of the tvd and tvf entries for the next numDocs starting with startDocID. This is used for bulk copying when merging segments, if the field numbers are congruent. Once this returns, the tvf & tvd streams are seeked to the startDocID. 
final	TokenNamefinal	
void	TokenNamevoid	
rawDocs	TokenNameIdentifier	 raw Docs
(	TokenNameLPAREN	
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
startDocID	TokenNameIdentifier	 start Doc ID
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
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
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
tvdLengths	TokenNameIdentifier	 tvd Lengths
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
tvfLengths	TokenNameIdentifier	 tvf Lengths
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SegmentMerger calls canReadRawDocs() first and should 	TokenNameCOMMENT_LINE	SegmentMerger calls canReadRawDocs() first and should 
// not call us if that returns false. 	TokenNameCOMMENT_LINE	not call us if that returns false. 
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<	TokenNameLESS	
FORMAT_VERSION2	TokenNameIdentifier	 FORMAT  VERSIO N2
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"cannot read raw docs with older term vector formats"	TokenNameStringLiteral	cannot read raw docs with older term vector formats
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seekTvx	TokenNameIdentifier	 seek Tvx
(	TokenNameLPAREN	
startDocID	TokenNameIdentifier	 start Doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
tvdPosition	TokenNameIdentifier	 tvd Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvfPosition	TokenNameIdentifier	 tvf Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
tvfPosition	TokenNameIdentifier	 tvf Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastTvdPosition	TokenNameIdentifier	 last Tvd Position
=	TokenNameEQUAL	
tvdPosition	TokenNameIdentifier	 tvd Position
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastTvfPosition	TokenNameIdentifier	 last Tvf Position
=	TokenNameEQUAL	
tvfPosition	TokenNameIdentifier	 tvf Position
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
docStoreOffset	TokenNameIdentifier	 doc Store Offset
+	TokenNamePLUS	
startDocID	TokenNameIdentifier	 start Doc ID
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
docID	TokenNameIdentifier	 doc ID
<=	TokenNameLESS_EQUAL	
numTotalDocs	TokenNameIdentifier	 num Total Docs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
<	TokenNameLESS	
numTotalDocs	TokenNameIdentifier	 num Total Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvfPosition	TokenNameIdentifier	 tvf Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvfPosition	TokenNameIdentifier	 tvf Position
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tvdLengths	TokenNameIdentifier	 tvd Lengths
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tvdPosition	TokenNameIdentifier	 tvd Position
-	TokenNameMINUS	
lastTvdPosition	TokenNameIdentifier	 last Tvd Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvfLengths	TokenNameIdentifier	 tvf Lengths
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tvfPosition	TokenNameIdentifier	 tvf Position
-	TokenNameMINUS	
lastTvfPosition	TokenNameIdentifier	 last Tvf Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastTvdPosition	TokenNameIdentifier	 last Tvd Position
=	TokenNameEQUAL	
tvdPosition	TokenNameIdentifier	 tvd Position
;	TokenNameSEMICOLON	
lastTvfPosition	TokenNameIdentifier	 last Tvf Position
=	TokenNameEQUAL	
tvfPosition	TokenNameIdentifier	 tvf Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
checkValidFormat	TokenNameIdentifier	 check Valid Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fn	TokenNameIdentifier	 fn
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>	TokenNameGREATER	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
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
/** * * @return The number of documents in the reader */	TokenNameCOMMENT_JAVADOC	 * @return The number of documents in the reader 
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
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
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldNumber	TokenNameIdentifier	 field Number
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//We need to account for the FORMAT_SIZE at when seeking in the tvx 	TokenNameCOMMENT_LINE	We need to account for the FORMAT_SIZE at when seeking in the tvx 
//We don't need to do this in other seeks because we already have the 	TokenNameCOMMENT_LINE	We don't need to do this in other seeks because we already have the 
// file pointer 	TokenNameCOMMENT_LINE	file pointer 
//that was written in another file 	TokenNameCOMMENT_LINE	that was written in another file 
seekTvx	TokenNameIdentifier	 seek Tvx
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("TVX Pointer: " + tvx.getFilePointer()); 	TokenNameCOMMENT_LINE	System.out.println("TVX Pointer: " + tvx.getFilePointer()); 
long	TokenNamelong	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
tvdPosition	TokenNameIdentifier	 tvd Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Num Fields: " + fieldCount); 	TokenNameCOMMENT_LINE	System.out.println("Num Fields: " + fieldCount); 
// There are only a few fields per document. We opt for a full scan 	TokenNameCOMMENT_LINE	There are only a few fields per document. We opt for a full scan 
// rather then requiring that they be ordered. We need to read through 	TokenNameCOMMENT_LINE	rather then requiring that they be ordered. We need to read through 
// all of the fields anyway to get to the tvf pointers. 	TokenNameCOMMENT_LINE	all of the fields anyway to get to the tvf pointers. 
int	TokenNameint	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
found	TokenNameIdentifier	 found
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
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fieldCount	TokenNameIdentifier	 field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_VERSION	TokenNameIdentifier	 FORMAT  VERSION
)	TokenNameRPAREN	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
number	TokenNameIdentifier	 number
+=	TokenNamePLUS_EQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
==	TokenNameEQUAL_EQUAL	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This field, although valid in the segment, was not found in this 	TokenNameCOMMENT_LINE	This field, although valid in the segment, was not found in this 
// document 	TokenNameCOMMENT_LINE	document 
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute position in the tvf file 	TokenNameCOMMENT_LINE	Compute position in the tvf file 
long	TokenNamelong	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_VERSION2	TokenNameIdentifier	 FORMAT  VERSIO N2
)	TokenNameRPAREN	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readTermVector	TokenNameIdentifier	 read Term Vector
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println("Fieldable not found"); 	TokenNameCOMMENT_LINE	System.out.println("Fieldable not found"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println("No tvx file"); 	TokenNameCOMMENT_LINE	System.out.println("No tvx file"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retrieve the term vector for the given document and field * @param docNum The document number to retrieve the vector for * @param field The field within the document to retrieve * @return The TermFreqVector for the document and field or null if there is no termVector for this field. * @throws IOException if there is an error reading the term vector files */	TokenNameCOMMENT_JAVADOC	 Retrieve the term vector for the given document and field @param docNum The document number to retrieve the vector for @param field The field within the document to retrieve @return The TermFreqVector for the document and field or null if there is no termVector for this field. @throws IOException if there is an error reading the term vector files 
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Check if no term vectors are available for this segment at all 	TokenNameCOMMENT_LINE	Check if no term vectors are available for this segment at all 
ParallelArrayTermVectorMapper	TokenNameIdentifier	 Parallel Array Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelArrayTermVectorMapper	TokenNameIdentifier	 Parallel Array Term Vector Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
materializeVector	TokenNameIdentifier	 materialize Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reads the String[] fields; you have to pre-seek tvd to 	TokenNameCOMMENT_LINE	Reads the String[] fields; you have to pre-seek tvd to 
// the right point 	TokenNameCOMMENT_LINE	the right point 
final	TokenNamefinal	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readFields	TokenNameIdentifier	 read Fields
(	TokenNameLPAREN	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fieldCount	TokenNameIdentifier	 field Count
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
fieldCount	TokenNameIdentifier	 field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_VERSION	TokenNameIdentifier	 FORMAT  VERSION
)	TokenNameRPAREN	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
number	TokenNameIdentifier	 number
+=	TokenNamePLUS_EQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reads the long[] offsets into TVF; you have to pre-seek 	TokenNameCOMMENT_LINE	Reads the long[] offsets into TVF; you have to pre-seek 
// tvx/tvd to the right point 	TokenNameCOMMENT_LINE	tvx/tvd to the right point 
final	TokenNamefinal	
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readTvfPointers	TokenNameIdentifier	 read Tvf Pointers
(	TokenNameLPAREN	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Compute position in the tvf file 	TokenNameCOMMENT_LINE	Compute position in the tvf file 
long	TokenNamelong	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_VERSION2	TokenNameIdentifier	 FORMAT  VERSIO N2
)	TokenNameRPAREN	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tvfPointers	TokenNameIdentifier	 tvf Pointers
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
fieldCount	TokenNameIdentifier	 field Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tvfPointers	TokenNameIdentifier	 tvf Pointers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
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
fieldCount	TokenNameIdentifier	 field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvfPointers	TokenNameIdentifier	 tvf Pointers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tvfPointers	TokenNameIdentifier	 tvf Pointers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return all term vectors stored for this document or null if the could not be read in. * * @param docNum The document number to retrieve the vector for * @return All term frequency vectors * @throws IOException if there is an error reading the term vector files */	TokenNameCOMMENT_JAVADOC	 Return all term vectors stored for this document or null if the could not be read in. * @param docNum The document number to retrieve the vector for @return All term frequency vectors @throws IOException if there is an error reading the term vector files 
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//We need to offset by 	TokenNameCOMMENT_LINE	We need to offset by 
seekTvx	TokenNameIdentifier	 seek Tvx
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
tvdPosition	TokenNameIdentifier	 tvd Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No fields are vectorized for this document 	TokenNameCOMMENT_LINE	No fields are vectorized for this document 
if	TokenNameif	
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
readFields	TokenNameIdentifier	 read Fields
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tvfPointers	TokenNameIdentifier	 tvf Pointers
=	TokenNameEQUAL	
readTvfPointers	TokenNameIdentifier	 read Tvf Pointers
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
readTermVectors	TokenNameIdentifier	 read Term Vectors
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
tvfPointers	TokenNameIdentifier	 tvf Pointers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println("No tvx file"); 	TokenNameCOMMENT_LINE	System.out.println("No tvx file"); 
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Check if no term vectors are available for this segment at all 	TokenNameCOMMENT_LINE	Check if no term vectors are available for this segment at all 
if	TokenNameif	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//We need to offset by 	TokenNameCOMMENT_LINE	We need to offset by 
seekTvx	TokenNameIdentifier	 seek Tvx
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
tvdPosition	TokenNameIdentifier	 tvd Position
=	TokenNameEQUAL	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
tvdPosition	TokenNameIdentifier	 tvd Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
=	TokenNameEQUAL	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No fields are vectorized for this document 	TokenNameCOMMENT_LINE	No fields are vectorized for this document 
if	TokenNameif	
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
readFields	TokenNameIdentifier	 read Fields
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tvfPointers	TokenNameIdentifier	 tvf Pointers
=	TokenNameEQUAL	
readTvfPointers	TokenNameIdentifier	 read Tvf Pointers
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readTermVectors	TokenNameIdentifier	 read Term Vectors
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
tvfPointers	TokenNameIdentifier	 tvf Pointers
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println("No tvx file"); 	TokenNameCOMMENT_LINE	System.out.println("No tvx file"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
SegmentTermVector	TokenNameIdentifier	 Segment Term Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readTermVectors	TokenNameIdentifier	 read Term Vectors
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
long	TokenNamelong	
tvfPointers	TokenNameIdentifier	 tvf Pointers
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SegmentTermVector	TokenNameIdentifier	 Segment Term Vector
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTermVector	TokenNameIdentifier	 Segment Term Vector
[	TokenNameLBRACKET	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
ParallelArrayTermVectorMapper	TokenNameIdentifier	 Parallel Array Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelArrayTermVectorMapper	TokenNameIdentifier	 Parallel Array Term Vector Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readTermVector	TokenNameIdentifier	 read Term Vector
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tvfPointers	TokenNameIdentifier	 tvf Pointers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentTermVector	TokenNameIdentifier	 Segment Term Vector
)	TokenNameRPAREN	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
materializeVector	TokenNameIdentifier	 materialize Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readTermVectors	TokenNameIdentifier	 read Term Vectors
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
long	TokenNamelong	
tvfPointers	TokenNameIdentifier	 tvf Pointers
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readTermVector	TokenNameIdentifier	 read Term Vector
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tvfPointers	TokenNameIdentifier	 tvf Pointers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * @param field The field to read in * @param tvfPointer The pointer within the tvf file where we should start reading * @param mapper The mapper used to map the TermVector * @throws IOException */	TokenNameCOMMENT_JAVADOC	 * @param field The field to read in @param tvfPointer The pointer within the tvf file where we should start reading @param mapper The mapper used to map the TermVector @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
readTermVector	TokenNameIdentifier	 read Term Vector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
long	TokenNamelong	
tvfPointer	TokenNameIdentifier	 tvf Pointer
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Now read the data from specified position 	TokenNameCOMMENT_LINE	Now read the data from specified position 
//We don't need to offset by the FORMAT here since the pointer already includes the offset 	TokenNameCOMMENT_LINE	We don't need to offset by the FORMAT here since the pointer already includes the offset 
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
tvfPointer	TokenNameIdentifier	 tvf Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Num Terms: " + numTerms); 	TokenNameCOMMENT_LINE	System.out.println("Num Terms: " + numTerms); 
// If no terms - return a constant empty termvector. However, this should never occur! 	TokenNameCOMMENT_LINE	If no terms - return a constant empty termvector. However, this should never occur! 
if	TokenNameif	
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
storePositions	TokenNameIdentifier	 store Positions
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>=	TokenNameGREATER_EQUAL	
FORMAT_VERSION	TokenNameIdentifier	 FORMAT  VERSION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
storePositions	TokenNameIdentifier	 store Positions
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
STORE_POSITIONS_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  POSITIONS  WITH  TERMVECTOR
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
storeOffsets	TokenNameIdentifier	 store Offsets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
STORE_OFFSET_WITH_TERMVECTOR	TokenNameIdentifier	 STORE  OFFSET  WITH  TERMVECTOR
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
storeOffsets	TokenNameIdentifier	 store Offsets
,	TokenNameCOMMA	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
deltaLength	TokenNameIdentifier	 delta Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
byteBuffer	TokenNameIdentifier	 byte Buffer
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charBuffer	TokenNameIdentifier	 char Buffer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
preUTF8	TokenNameIdentifier	 pre UT F8
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
<	TokenNameLESS	
FORMAT_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  UT F8  LENGTH  IN  BYTES
;	TokenNameSEMICOLON	
// init the buffers 	TokenNameCOMMENT_LINE	init the buffers 
if	TokenNameif	
(	TokenNameLPAREN	
preUTF8	TokenNameIdentifier	 pre UT F8
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charBuffer	TokenNameIdentifier	 char Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byteBuffer	TokenNameIdentifier	 byte Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
charBuffer	TokenNameIdentifier	 char Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byteBuffer	TokenNameIdentifier	 byte Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
numTerms	TokenNameIdentifier	 num Terms
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deltaLength	TokenNameIdentifier	 delta Length
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
deltaLength	TokenNameIdentifier	 delta Length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preUTF8	TokenNameIdentifier	 pre UT F8
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Term stored as java chars 	TokenNameCOMMENT_LINE	Term stored as java chars 
if	TokenNameif	
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charBuffer	TokenNameIdentifier	 char Buffer
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readChars	TokenNameIdentifier	 read Chars
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
deltaLength	TokenNameIdentifier	 delta Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Term stored as utf8 bytes 	TokenNameCOMMENT_LINE	Term stored as utf8 bytes 
if	TokenNameif	
(	TokenNameLPAREN	
byteBuffer	TokenNameIdentifier	 byte Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byteBuffer	TokenNameIdentifier	 byte Buffer
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
byteBuffer	TokenNameIdentifier	 byte Buffer
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
byteBuffer	TokenNameIdentifier	 byte Buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
deltaLength	TokenNameIdentifier	 delta Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
byteBuffer	TokenNameIdentifier	 byte Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
totalLength	TokenNameIdentifier	 total Length
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//read in the positions 	TokenNameCOMMENT_LINE	read in the positions 
//does the mapper even care about positions? 	TokenNameCOMMENT_LINE	does the mapper even care about positions? 
if	TokenNameif	
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
isIgnoringPositions	TokenNameIdentifier	 is Ignoring Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
freq	TokenNameIdentifier	 freq
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevPosition	TokenNameIdentifier	 prev Position
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
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prevPosition	TokenNameIdentifier	 prev Position
+	TokenNamePLUS	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevPosition	TokenNameIdentifier	 prev Position
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//we need to skip over the positions. Since these are VInts, I don't believe there is anyway to know for sure how far to skip 	TokenNameCOMMENT_LINE	we need to skip over the positions. Since these are VInts, I don't believe there is anyway to know for sure how far to skip 
// 	TokenNameCOMMENT_LINE	 
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
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//does the mapper even care about offsets? 	TokenNameCOMMENT_LINE	does the mapper even care about offsets? 
if	TokenNameif	
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
isIgnoringOffsets	TokenNameIdentifier	 is Ignoring Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
freq	TokenNameIdentifier	 freq
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevOffset	TokenNameIdentifier	 prev Offset
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
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
prevOffset	TokenNameIdentifier	 prev Offset
+	TokenNamePLUS	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevOffset	TokenNameIdentifier	 prev Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
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
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These are null when a TermVectorsReader was created 	TokenNameCOMMENT_LINE	These are null when a TermVectorsReader was created 
// on a segment that did not have term vectors saved 	TokenNameCOMMENT_LINE	on a segment that did not have term vectors saved 
if	TokenNameif	
(	TokenNameLPAREN	
tvx	TokenNameIdentifier	 tvx
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tvd	TokenNameIdentifier	 tvd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tvf	TokenNameIdentifier	 tvf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
tvx	TokenNameIdentifier	 tvx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
tvx	TokenNameIdentifier	 tvx
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
tvd	TokenNameIdentifier	 tvd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
tvd	TokenNameIdentifier	 tvd
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
tvf	TokenNameIdentifier	 tvf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
tvf	TokenNameIdentifier	 tvf
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Models the existing parallel array structure */	TokenNameCOMMENT_JAVADOC	 Models the existing parallel array structure 
class	TokenNameclass	
ParallelArrayTermVectorMapper	TokenNameIdentifier	 Parallel Array Term Vector Mapper
extends	TokenNameextends	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termFreqs	TokenNameIdentifier	 term Freqs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentPosition	TokenNameIdentifier	 current Position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
storingOffsets	TokenNameIdentifier	 storing Offsets
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
storingPositions	TokenNameIdentifier	 storing Positions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numTerms	TokenNameIdentifier	 num Terms
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
termFreqs	TokenNameIdentifier	 term Freqs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numTerms	TokenNameIdentifier	 num Terms
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storingOffsets	TokenNameIdentifier	 storing Offsets
=	TokenNameEQUAL	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storingPositions	TokenNameIdentifier	 storing Positions
=	TokenNameEQUAL	
storePositions	TokenNameIdentifier	 store Positions
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numTerms	TokenNameIdentifier	 num Terms
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
numTerms	TokenNameIdentifier	 num Terms
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
,	TokenNameCOMMA	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
currentPosition	TokenNameIdentifier	 current Position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
termFreqs	TokenNameIdentifier	 term Freqs
[	TokenNameLBRACKET	
currentPosition	TokenNameIdentifier	 current Position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frequency	TokenNameIdentifier	 frequency
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storingOffsets	TokenNameIdentifier	 storing Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
currentPosition	TokenNameIdentifier	 current Position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storingPositions	TokenNameIdentifier	 storing Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
currentPosition	TokenNameIdentifier	 current Position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentPosition	TokenNameIdentifier	 current Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct the vector * @return The {@link TermFreqVector} based on the mappings. */	TokenNameCOMMENT_JAVADOC	 Construct the vector @return The {@link TermFreqVector} based on the mappings. 
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
materializeVector	TokenNameIdentifier	 materialize Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentTermVector	TokenNameIdentifier	 Segment Term Vector
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storingPositions	TokenNameIdentifier	 storing Positions
||	TokenNameOR_OR	
storingOffsets	TokenNameIdentifier	 storing Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTermPositionVector	TokenNameIdentifier	 Segment Term Position Vector
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
termFreqs	TokenNameIdentifier	 term Freqs
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTermVector	TokenNameIdentifier	 Segment Term Vector
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
termFreqs	TokenNameIdentifier	 term Freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tv	TokenNameIdentifier	 tv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
