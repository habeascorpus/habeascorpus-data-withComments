package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
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
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
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
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
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
DataInput	TokenNameIdentifier	 Data Input
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
DataOutput	TokenNameIdentifier	 Data Output
;	TokenNameSEMICOLON	
/** * Utility class for reading and writing versioned headers. * This is useful to ensure that a file is in the format * you think it is. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utility class for reading and writing versioned headers. This is useful to ensure that a file is in the format you think it is. @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CodecUtil	TokenNameIdentifier	 Codec Util
{	TokenNameLBRACE	
private	TokenNameprivate	
CodecUtil	TokenNameIdentifier	 Codec Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance 	TokenNameCOMMENT_LINE	no instance 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
CODEC_MAGIC	TokenNameIdentifier	 CODEC  MAGIC
=	TokenNameEQUAL	
0x3fd76c17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
DataOutput	TokenNameIdentifier	 Data Output
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
codec	TokenNameIdentifier	 codec
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"codec must be simple ASCII, less than 128 characters in length [got "	TokenNameStringLiteral	codec must be simple ASCII, less than 128 characters in length [got 
+	TokenNamePLUS	
codec	TokenNameIdentifier	 codec
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
CODEC_MAGIC	TokenNameIdentifier	 CODEC  MAGIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
headerLength	TokenNameIdentifier	 header Length
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
9	TokenNameIntegerLiteral	
+	TokenNamePLUS	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
checkHeader	TokenNameIdentifier	 check Header
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
codec	TokenNameIdentifier	 codec
,	TokenNameCOMMA	
int	TokenNameint	
minVersion	TokenNameIdentifier	 min Version
,	TokenNameCOMMA	
int	TokenNameint	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Safety to guard against reading a bogus string: 	TokenNameCOMMENT_LINE	Safety to guard against reading a bogus string: 
final	TokenNamefinal	
int	TokenNameint	
actualHeader	TokenNameIdentifier	 actual Header
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
actualHeader	TokenNameIdentifier	 actual Header
!=	TokenNameNOT_EQUAL	
CODEC_MAGIC	TokenNameIdentifier	 CODEC  MAGIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"codec header mismatch: actual header="	TokenNameStringLiteral	codec header mismatch: actual header=
+	TokenNamePLUS	
actualHeader	TokenNameIdentifier	 actual Header
+	TokenNamePLUS	
" vs expected header="	TokenNameStringLiteral	 vs expected header=
+	TokenNamePLUS	
CODEC_MAGIC	TokenNameIdentifier	 CODEC  MAGIC
+	TokenNamePLUS	
" (resource: "	TokenNameStringLiteral	 (resource: 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
actualCodec	TokenNameIdentifier	 actual Codec
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
actualCodec	TokenNameIdentifier	 actual Codec
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
codec	TokenNameIdentifier	 codec
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"codec mismatch: actual codec="	TokenNameStringLiteral	codec mismatch: actual codec=
+	TokenNamePLUS	
actualCodec	TokenNameIdentifier	 actual Codec
+	TokenNamePLUS	
" vs expected codec="	TokenNameStringLiteral	 vs expected codec=
+	TokenNamePLUS	
codec	TokenNameIdentifier	 codec
+	TokenNamePLUS	
" (resource: "	TokenNameStringLiteral	 (resource: 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
actualVersion	TokenNameIdentifier	 actual Version
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
actualVersion	TokenNameIdentifier	 actual Version
<	TokenNameLESS	
minVersion	TokenNameIdentifier	 min Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexFormatTooOldException	TokenNameIdentifier	 Index Format Too Old Exception
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
,	TokenNameCOMMA	
minVersion	TokenNameIdentifier	 min Version
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
actualVersion	TokenNameIdentifier	 actual Version
>	TokenNameGREATER	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
,	TokenNameCOMMA	
minVersion	TokenNameIdentifier	 min Version
,	TokenNameCOMMA	
maxVersion	TokenNameIdentifier	 max Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
actualVersion	TokenNameIdentifier	 actual Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
