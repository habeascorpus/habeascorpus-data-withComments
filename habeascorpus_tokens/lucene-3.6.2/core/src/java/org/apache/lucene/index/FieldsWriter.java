package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); you may not * use this file except in compliance with the License. You may obtain a copy of * the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
NumericField	TokenNameIdentifier	 Numeric Field
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
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
FieldsWriter	TokenNameIdentifier	 Fields Writer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_TOKENIZED	TokenNameIdentifier	 FIELD  IS  TOKENIZED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_BINARY	TokenNameIdentifier	 FIELD  IS  BINARY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @deprecated Kept for backwards-compatibility with <3.0 indexes; will be removed in 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated Kept for backwards-compatibility with <3.0 indexes; will be removed in 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_COMPRESSED	TokenNameIdentifier	 FIELD  IS  COMPRESSED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
_NUMERIC_BIT_SHIFT	TokenNameIdentifier	 NUMERIC  BIT  SHIFT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_NUMERIC_MASK	TokenNameIdentifier	 FIELD  IS  NUMERIC  MASK
=	TokenNameEQUAL	
0x07	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
_NUMERIC_BIT_SHIFT	TokenNameIdentifier	 NUMERIC  BIT  SHIFT
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_NUMERIC_INT	TokenNameIdentifier	 FIELD  IS  NUMERIC  INT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
_NUMERIC_BIT_SHIFT	TokenNameIdentifier	 NUMERIC  BIT  SHIFT
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_NUMERIC_LONG	TokenNameIdentifier	 FIELD  IS  NUMERIC  LONG
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
_NUMERIC_BIT_SHIFT	TokenNameIdentifier	 NUMERIC  BIT  SHIFT
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_NUMERIC_FLOAT	TokenNameIdentifier	 FIELD  IS  NUMERIC  FLOAT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
_NUMERIC_BIT_SHIFT	TokenNameIdentifier	 NUMERIC  BIT  SHIFT
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIELD_IS_NUMERIC_DOUBLE	TokenNameIdentifier	 FIELD  IS  NUMERIC  DOUBLE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
_NUMERIC_BIT_SHIFT	TokenNameIdentifier	 NUMERIC  BIT  SHIFT
;	TokenNameSEMICOLON	
// currently unused: static final int FIELD_IS_NUMERIC_SHORT = 5 << _NUMERIC_BIT_SHIFT; 	TokenNameCOMMENT_LINE	currently unused: static final int FIELD_IS_NUMERIC_SHORT = 5 << _NUMERIC_BIT_SHIFT; 
// currently unused: static final int FIELD_IS_NUMERIC_BYTE = 6 << _NUMERIC_BIT_SHIFT; 	TokenNameCOMMENT_LINE	currently unused: static final int FIELD_IS_NUMERIC_BYTE = 6 << _NUMERIC_BIT_SHIFT; 
// the next possible bits are: 1 << 6; 1 << 7 	TokenNameCOMMENT_LINE	the next possible bits are: 1 << 6; 1 << 7 
// Original format 	TokenNameCOMMENT_LINE	Original format 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT	TokenNameIdentifier	 FORMAT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Changed strings to UTF8 	TokenNameCOMMENT_LINE	Changed strings to UTF8 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_VERSION_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  VERSION  UT F8  LENGTH  IN  BYTES
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Lucene 3.0: Removal of compressed fields 	TokenNameCOMMENT_LINE	Lucene 3.0: Removal of compressed fields 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_LUCENE_3_0_NO_COMPRESSED_FIELDS	TokenNameIdentifier	 FORMAT  LUCENE 3 0  NO  COMPRESSED  FIELDS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Lucene 3.2: NumericFields are stored in binary format 	TokenNameCOMMENT_LINE	Lucene 3.2: NumericFields are stored in binary format 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_LUCENE_3_2_NUMERIC_FIELDS	TokenNameIdentifier	 FORMAT  LUCENE 3 2  NUMERIC  FIELDS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// NOTE: if you introduce a new format, make it 1 higher 	TokenNameCOMMENT_LINE	NOTE: if you introduce a new format, make it 1 higher 
// than the current one, and always change this if you 	TokenNameCOMMENT_LINE	than the current one, and always change this if you 
// switch to a new format! 	TokenNameCOMMENT_LINE	switch to a new format! 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
=	TokenNameEQUAL	
FORMAT_LUCENE_3_2_NUMERIC_FIELDS	TokenNameIdentifier	 FORMAT  LUCENE 3 2  NUMERIC  FIELDS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
// If null - we were supplied with streams, if notnull - we manage them ourselves 	TokenNameCOMMENT_LINE	If null - we were supplied with streams, if notnull - we manage them ourselves 
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
fieldsStream	TokenNameIdentifier	 fields Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
indexStream	TokenNameIdentifier	 index Stream
;	TokenNameSEMICOLON	
FieldsWriter	TokenNameIdentifier	 Fields Writer
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fn	TokenNameIdentifier	 fn
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fn	TokenNameIdentifier	 fn
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
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
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexStream	TokenNameIdentifier	 index Stream
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
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexStream	TokenNameIdentifier	 index Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
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
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
FieldsWriter	TokenNameIdentifier	 Fields Writer
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
fdx	TokenNameIdentifier	 fdx
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
fdt	TokenNameIdentifier	 fdt
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fn	TokenNameIdentifier	 fn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fn	TokenNameIdentifier	 fn
;	TokenNameSEMICOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
=	TokenNameEQUAL	
fdt	TokenNameIdentifier	 fdt
;	TokenNameSEMICOLON	
indexStream	TokenNameIdentifier	 index Stream
=	TokenNameEQUAL	
fdx	TokenNameIdentifier	 fdx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setFieldsStream	TokenNameIdentifier	 set Fields Stream
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldsStream	TokenNameIdentifier	 fields Stream
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Writes the contents of buffer into the fields stream 	TokenNameCOMMENT_LINE	Writes the contents of buffer into the fields stream 
// and adds a new entry for this document into the index 	TokenNameCOMMENT_LINE	and adds a new entry for this document into the index 
// stream. This assumes the buffer was already written 	TokenNameCOMMENT_LINE	stream. This assumes the buffer was already written 
// in the correct fields format. 	TokenNameCOMMENT_LINE	in the correct fields format. 
void	TokenNamevoid	
flushDocument	TokenNameIdentifier	 flush Document
(	TokenNameLPAREN	
int	TokenNameint	
numStoredFields	TokenNameIdentifier	 num Stored Fields
,	TokenNameCOMMA	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
indexStream	TokenNameIdentifier	 index Stream
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
numStoredFields	TokenNameIdentifier	 num Stored Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
fieldsStream	TokenNameIdentifier	 fields Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
skipDocument	TokenNameIdentifier	 skip Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
indexStream	TokenNameIdentifier	 index Stream
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
8	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
indexStream	TokenNameIdentifier	 index Stream
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
fieldsIdxName	TokenNameIdentifier	 fields Idx Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"fdx size mismatch: "	TokenNameStringLiteral	fdx size mismatch: 
+	TokenNamePLUS	
numDocs	TokenNameIdentifier	 num Docs
+	TokenNamePLUS	
" docs vs "	TokenNameStringLiteral	 docs vs 
+	TokenNamePLUS	
indexStream	TokenNameIdentifier	 index Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" length in bytes of "	TokenNameStringLiteral	 length in bytes of 
+	TokenNamePLUS	
fieldsIdxName	TokenNameIdentifier	 fields Idx Name
+	TokenNamePLUS	
" file exists?="	TokenNameStringLiteral	 file exists?=
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
fieldsIdxName	TokenNameIdentifier	 fields Idx Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fieldsStream	TokenNameIdentifier	 fields Stream
,	TokenNameCOMMA	
indexStream	TokenNameIdentifier	 index Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
=	TokenNameEQUAL	
indexStream	TokenNameIdentifier	 index Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
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
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_EXTENSION	TokenNameIdentifier	 FIELDS  EXTENSION
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
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELDS_INDEX_EXTENSION	TokenNameIdentifier	 FIELDS  INDEX  EXTENSION
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
writeField	TokenNameIdentifier	 write Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
,	TokenNameCOMMA	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
FIELD_IS_TOKENIZED	TokenNameIdentifier	 FIELD  IS  TOKENIZED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
FIELD_IS_BINARY	TokenNameIdentifier	 FIELD  IS  BINARY
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
instanceof	TokenNameinstanceof	
NumericField	TokenNameIdentifier	 Numeric Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NumericField	TokenNameIdentifier	 Numeric Field
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
FIELD_IS_NUMERIC_INT	TokenNameIdentifier	 FIELD  IS  NUMERIC  INT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
FIELD_IS_NUMERIC_LONG	TokenNameIdentifier	 FIELD  IS  NUMERIC  LONG
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
FIELD_IS_NUMERIC_FLOAT	TokenNameIdentifier	 FIELD  IS  NUMERIC  FLOAT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
FIELD_IS_NUMERIC_DOUBLE	TokenNameIdentifier	 FIELD  IS  NUMERIC  DOUBLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
assert	TokenNameassert	
false	TokenNamefalse	
:	TokenNameCOLON	
"Should never get here"	TokenNameStringLiteral	Should never get here
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getBinaryLength	TokenNameIdentifier	 get Binary Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getBinaryOffset	TokenNameIdentifier	 get Binary Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
instanceof	TokenNameinstanceof	
NumericField	TokenNameIdentifier	 Numeric Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
NumericField	TokenNameIdentifier	 Numeric Field
nf	TokenNameIdentifier	 nf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericField	TokenNameIdentifier	 Numeric Field
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Number	TokenNameIdentifier	 Number
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
getNumericValue	TokenNameIdentifier	 get Numeric Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
assert	TokenNameassert	
false	TokenNamefalse	
:	TokenNameCOLON	
"Should never get here"	TokenNameStringLiteral	Should never get here
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Bulk write a contiguous series of documents. The * lengths array is the length (in bytes) of each raw * document. The stream IndexInput is the * fieldsStream from which we should bulk-copy all * bytes. */	TokenNameCOMMENT_JAVADOC	 Bulk write a contiguous series of documents. The lengths array is the length (in bytes) of each raw document. The stream IndexInput is the fieldsStream from which we should bulk-copy all bytes. 
final	TokenNamefinal	
void	TokenNamevoid	
addRawDocuments	TokenNameIdentifier	 add Raw Documents
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lengths	TokenNameIdentifier	 lengths
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
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
indexStream	TokenNameIdentifier	 index Stream
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
lengths	TokenNameIdentifier	 lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
indexStream	TokenNameIdentifier	 index Stream
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
storedCount	TokenNameIdentifier	 stored Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
storedCount	TokenNameIdentifier	 stored Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsStream	TokenNameIdentifier	 fields Stream
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
storedCount	TokenNameIdentifier	 stored Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
writeField	TokenNameIdentifier	 write Field
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
