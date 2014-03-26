package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
Channels	TokenNameIdentifier	 Channels
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
ReadableByteChannel	TokenNameIdentifier	 Readable Byte Channel
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
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
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
CodecUtil	TokenNameIdentifier	 Codec Util
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
IntsRef	TokenNameIdentifier	 Ints Ref
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
/** * Base class for a binary-encoded in-memory dictionary. */	TokenNameCOMMENT_JAVADOC	 Base class for a binary-encoded in-memory dictionary. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
implements	TokenNameimplements	
Dictionary	TokenNameIdentifier	 Dictionary
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DICT_FILENAME_SUFFIX	TokenNameIdentifier	 DICT  FILENAME  SUFFIX
=	TokenNameEQUAL	
"$buffer.dat"	TokenNameStringLiteral	$buffer.dat
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TARGETMAP_FILENAME_SUFFIX	TokenNameIdentifier	 TARGETMAP  FILENAME  SUFFIX
=	TokenNameEQUAL	
"$targetMap.dat"	TokenNameStringLiteral	$targetMap.dat
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
POSDICT_FILENAME_SUFFIX	TokenNameIdentifier	 POSDICT  FILENAME  SUFFIX
=	TokenNameEQUAL	
"$posDict.dat"	TokenNameStringLiteral	$posDict.dat
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DICT_HEADER	TokenNameIdentifier	 DICT  HEADER
=	TokenNameEQUAL	
"kuromoji_dict"	TokenNameStringLiteral	kuromoji_dict
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TARGETMAP_HEADER	TokenNameIdentifier	 TARGETMAP  HEADER
=	TokenNameEQUAL	
"kuromoji_dict_map"	TokenNameStringLiteral	kuromoji_dict_map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
POSDICT_HEADER	TokenNameIdentifier	 POSDICT  HEADER
=	TokenNameEQUAL	
"kuromoji_dict_pos"	TokenNameStringLiteral	kuromoji_dict_pos
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
,	TokenNameCOMMA	
targetMap	TokenNameIdentifier	 target Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posDict	TokenNameIdentifier	 pos Dict
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inflFormDict	TokenNameIdentifier	 infl Form Dict
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
mapIS	TokenNameIdentifier	 map IS
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
dictIS	TokenNameIdentifier	 dict IS
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
posIS	TokenNameIdentifier	 pos IS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IOException	TokenNameIdentifier	 IO Exception
priorE	TokenNameIdentifier	 prior E
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
targetMap	TokenNameIdentifier	 target Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posDict	TokenNameIdentifier	 pos Dict
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inflFormDict	TokenNameIdentifier	 infl Form Dict
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mapIS	TokenNameIdentifier	 map IS
=	TokenNameEQUAL	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
TARGETMAP_FILENAME_SUFFIX	TokenNameIdentifier	 TARGETMAP  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapIS	TokenNameIdentifier	 map IS
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
mapIS	TokenNameIdentifier	 map IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
(	TokenNameLPAREN	
mapIS	TokenNameIdentifier	 map IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
checkHeader	TokenNameIdentifier	 check Header
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
TARGETMAP_HEADER	TokenNameIdentifier	 TARGETMAP  HEADER
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetMap	TokenNameIdentifier	 target Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sourceId	TokenNameIdentifier	 source Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ofs	TokenNameIdentifier	 ofs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ofs	TokenNameIdentifier	 ofs
<	TokenNameLESS	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
ofs	TokenNameIdentifier	 ofs
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
[	TokenNameLBRACKET	
sourceId	TokenNameIdentifier	 source Id
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ofs	TokenNameIdentifier	 ofs
;	TokenNameSEMICOLON	
sourceId	TokenNameIdentifier	 source Id
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
accum	TokenNameIdentifier	 accum
+=	TokenNamePLUS_EQUAL	
val	TokenNameIdentifier	 val
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
targetMap	TokenNameIdentifier	 target Map
[	TokenNameLBRACKET	
ofs	TokenNameIdentifier	 ofs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
accum	TokenNameIdentifier	 accum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourceId	TokenNameIdentifier	 source Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"targetMap file format broken"	TokenNameStringLiteral	targetMap file format broken
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
[	TokenNameLBRACKET	
sourceId	TokenNameIdentifier	 source Id
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
mapIS	TokenNameIdentifier	 map IS
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapIS	TokenNameIdentifier	 map IS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
posIS	TokenNameIdentifier	 pos IS
=	TokenNameEQUAL	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
POSDICT_FILENAME_SUFFIX	TokenNameIdentifier	 POSDICT  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIS	TokenNameIdentifier	 pos IS
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
posIS	TokenNameIdentifier	 pos IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
(	TokenNameLPAREN	
posIS	TokenNameIdentifier	 pos IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
checkHeader	TokenNameIdentifier	 check Header
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
POSDICT_HEADER	TokenNameIdentifier	 POSDICT  HEADER
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
posSize	TokenNameIdentifier	 pos Size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posDict	TokenNameIdentifier	 pos Dict
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
posSize	TokenNameIdentifier	 pos Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
posSize	TokenNameIdentifier	 pos Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
inflFormDict	TokenNameIdentifier	 infl Form Dict
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
posSize	TokenNameIdentifier	 pos Size
]	TokenNameRBRACKET	
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
posSize	TokenNameIdentifier	 pos Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posDict	TokenNameIdentifier	 pos Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inflFormDict	TokenNameIdentifier	 infl Form Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this is how we encode null inflections 	TokenNameCOMMENT_LINE	this is how we encode null inflections 
if	TokenNameif	
(	TokenNameLPAREN	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inflFormDict	TokenNameIdentifier	 infl Form Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inflFormDict	TokenNameIdentifier	 infl Form Dict
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
posIS	TokenNameIdentifier	 pos IS
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIS	TokenNameIdentifier	 pos IS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
dictIS	TokenNameIdentifier	 dict IS
=	TokenNameEQUAL	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
DICT_FILENAME_SUFFIX	TokenNameIdentifier	 DICT  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no buffering here, as we load in one large buffer 	TokenNameCOMMENT_LINE	no buffering here, as we load in one large buffer 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
(	TokenNameLPAREN	
dictIS	TokenNameIdentifier	 dict IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
checkHeader	TokenNameIdentifier	 check Header
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
DICT_HEADER	TokenNameIdentifier	 DICT  HEADER
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
tmpBuffer	TokenNameIdentifier	 tmp Buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocateDirect	TokenNameIdentifier	 allocate Direct
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ReadableByteChannel	TokenNameIdentifier	 Readable Byte Channel
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
Channels	TokenNameIdentifier	 Channels
.	TokenNameDOT	
newChannel	TokenNameIdentifier	 new Channel
(	TokenNameLPAREN	
dictIS	TokenNameIdentifier	 dict IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
tmpBuffer	TokenNameIdentifier	 tmp Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
!=	TokenNameNOT_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"Cannot read whole dictionary"	TokenNameStringLiteral	Cannot read whole dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dictIS	TokenNameIdentifier	 dict IS
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dictIS	TokenNameIdentifier	 dict IS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
tmpBuffer	TokenNameIdentifier	 tmp Buffer
.	TokenNameDOT	
asReadOnlyBuffer	TokenNameIdentifier	 as Read Only Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
priorE	TokenNameIdentifier	 prior E
=	TokenNameEQUAL	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
priorE	TokenNameIdentifier	 prior E
,	TokenNameCOMMA	
mapIS	TokenNameIdentifier	 map IS
,	TokenNameCOMMA	
posIS	TokenNameIdentifier	 pos IS
,	TokenNameCOMMA	
dictIS	TokenNameIdentifier	 dict IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
targetMap	TokenNameIdentifier	 target Map
=	TokenNameEQUAL	
targetMap	TokenNameIdentifier	 target Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
=	TokenNameEQUAL	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
posDict	TokenNameIdentifier	 pos Dict
=	TokenNameEQUAL	
posDict	TokenNameIdentifier	 pos Dict
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
=	TokenNameEQUAL	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inflFormDict	TokenNameIdentifier	 infl Form Dict
=	TokenNameEQUAL	
inflFormDict	TokenNameIdentifier	 infl Form Dict
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassResource	TokenNameIdentifier	 get Class Resource
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// util, reused by ConnectionCosts and CharacterDefinition 	TokenNameCOMMENT_LINE	util, reused by ConnectionCosts and CharacterDefinition 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
getClassResource	TokenNameIdentifier	 get Class Resource
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
(	TokenNameLPAREN	
"Not in classpath: "	TokenNameStringLiteral	Not in classpath: 
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
lookupWordIds	TokenNameIdentifier	 lookup Word Ids
(	TokenNameLPAREN	
int	TokenNameint	
sourceId	TokenNameIdentifier	 source Id
,	TokenNameCOMMA	
IntsRef	TokenNameIdentifier	 Ints Ref
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
=	TokenNameEQUAL	
targetMap	TokenNameIdentifier	 target Map
;	TokenNameSEMICOLON	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
[	TokenNameLBRACKET	
sourceId	TokenNameIdentifier	 source Id
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// targetMapOffsets always has one more entry pointing behind last: 	TokenNameCOMMENT_LINE	targetMapOffsets always has one more entry pointing behind last: 
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
[	TokenNameLBRACKET	
sourceId	TokenNameIdentifier	 source Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
getRightId	TokenNameIdentifier	 get Right Id
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
getWordCost	TokenNameIdentifier	 get Word Cost
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip id 	TokenNameCOMMENT_LINE	Skip id 
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseForm	TokenNameIdentifier	 get Base Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surfaceForm	TokenNameIdentifier	 surface Form
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasBaseFormData	TokenNameIdentifier	 has Base Form Data
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
baseFormOffset	TokenNameIdentifier	 base Form Offset
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
&	TokenNameAND	
0xF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
surfaceForm	TokenNameIdentifier	 surface Form
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
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
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasReadingData	TokenNameIdentifier	 has Reading Data
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
readingOffset	TokenNameIdentifier	 reading Offset
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
readingData	TokenNameIdentifier	 reading Data
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
readingData	TokenNameIdentifier	 reading Data
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
readingData	TokenNameIdentifier	 reading Data
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the reading is the surface form, with hiragana shifted to katakana 	TokenNameCOMMENT_LINE	the reading is the surface form, with hiragana shifted to katakana 
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0x3040	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x3097	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
0x60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPartOfSpeech	TokenNameIdentifier	 get Part Of Speech
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
posDict	TokenNameIdentifier	 pos Dict
[	TokenNameLBRACKET	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasPronunciationData	TokenNameIdentifier	 has Pronunciation Data
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
pronunciationOffset	TokenNameIdentifier	 pronunciation Offset
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pronunciationData	TokenNameIdentifier	 pronunciation Data
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
pronunciationData	TokenNameIdentifier	 pronunciation Data
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
pronunciationData	TokenNameIdentifier	 pronunciation Data
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
surface	TokenNameIdentifier	 surface
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same as the reading 	TokenNameCOMMENT_LINE	same as the reading 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inflTypeDict	TokenNameIdentifier	 infl Type Dict
[	TokenNameLBRACKET	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inflFormDict	TokenNameIdentifier	 infl Form Dict
[	TokenNameLBRACKET	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
baseFormOffset	TokenNameIdentifier	 base Form Offset
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wordId	TokenNameIdentifier	 word Id
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
readingOffset	TokenNameIdentifier	 reading Offset
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
baseFormOffset	TokenNameIdentifier	 base Form Offset
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasBaseFormData	TokenNameIdentifier	 has Base Form Data
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
baseFormLength	TokenNameIdentifier	 base Form Length
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
baseFormLength	TokenNameIdentifier	 base Form Length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
pronunciationOffset	TokenNameIdentifier	 pronunciation Offset
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasReadingData	TokenNameIdentifier	 has Reading Data
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
readingOffset	TokenNameIdentifier	 reading Offset
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
readingData	TokenNameIdentifier	 reading Data
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
readingLength	TokenNameIdentifier	 reading Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
readingData	TokenNameIdentifier	 reading Data
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readingLength	TokenNameIdentifier	 reading Length
=	TokenNameEQUAL	
readingData	TokenNameIdentifier	 reading Data
&	TokenNameAND	
0xfe	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// UTF-16: mask off kana bit 	TokenNameCOMMENT_LINE	UTF-16: mask off kana bit 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
readingLength	TokenNameIdentifier	 reading Length
=	TokenNameEQUAL	
readingData	TokenNameIdentifier	 reading Data
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
readingLength	TokenNameIdentifier	 reading Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
readingOffset	TokenNameIdentifier	 reading Offset
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasBaseFormData	TokenNameIdentifier	 has Base Form Data
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
&	TokenNameAND	
HAS_BASEFORM	TokenNameIdentifier	 HAS  BASEFORM
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasReadingData	TokenNameIdentifier	 has Reading Data
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
&	TokenNameAND	
HAS_READING	TokenNameIdentifier	 HAS  READING
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasPronunciationData	TokenNameIdentifier	 has Pronunciation Data
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
&	TokenNameAND	
HAS_PRONUNCIATION	TokenNameIdentifier	 HAS  PRONUNCIATION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
boolean	TokenNameboolean	
kana	TokenNameIdentifier	 kana
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kana	TokenNameIdentifier	 kana
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x30A0	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** flag that the entry has baseform data. otherwise its not inflected (same as surface form) */	TokenNameCOMMENT_JAVADOC	 flag that the entry has baseform data. otherwise its not inflected (same as surface form) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HAS_BASEFORM	TokenNameIdentifier	 HAS  BASEFORM
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** flag that the entry has reading data. otherwise reading is surface form converted to katakana */	TokenNameCOMMENT_JAVADOC	 flag that the entry has reading data. otherwise reading is surface form converted to katakana 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HAS_READING	TokenNameIdentifier	 HAS  READING
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** flag that the entry has pronunciation data. otherwise pronunciation is the reading */	TokenNameCOMMENT_JAVADOC	 flag that the entry has pronunciation data. otherwise pronunciation is the reading 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HAS_PRONUNCIATION	TokenNameIdentifier	 HAS  PRONUNCIATION
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
