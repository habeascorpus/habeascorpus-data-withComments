/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CompressedRandomAccessReaderTest	TokenNameIdentifier	 Compressed Random Access Reader Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResetAndTruncate	TokenNameIdentifier	 test Reset And Truncate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// test reset in current buffer or previous one 	TokenNameCOMMENT_LINE	test reset in current buffer or previous one 
testResetAndTruncate	TokenNameIdentifier	 test Reset And Truncate
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"normal"	TokenNameStringLiteral	normal
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testResetAndTruncate	TokenNameIdentifier	 test Reset And Truncate
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"normal"	TokenNameStringLiteral	normal
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
DEFAULT_CHUNK_LENGTH	TokenNameIdentifier	 DEFAULT  CHUNK  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testResetAndTruncateCompressed	TokenNameIdentifier	 test Reset And Truncate Compressed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// test reset in current buffer or previous one 	TokenNameCOMMENT_LINE	test reset in current buffer or previous one 
testResetAndTruncate	TokenNameIdentifier	 test Reset And Truncate
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"compressed"	TokenNameStringLiteral	compressed
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testResetAndTruncate	TokenNameIdentifier	 test Reset And Truncate
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"compressed"	TokenNameStringLiteral	compressed
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
DEFAULT_CHUNK_LENGTH	TokenNameIdentifier	 DEFAULT  CHUNK  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testResetAndTruncate	TokenNameIdentifier	 test Reset And Truncate
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
int	TokenNameint	
junkSize	TokenNameIdentifier	 junk Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
=	TokenNameEQUAL	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
createCollector	TokenNameIdentifier	 create Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
compressed	TokenNameIdentifier	 compressed
?	TokenNameQUESTION	
new	TokenNamenew	
CompressedSequentialWriter	TokenNameIdentifier	 Compressed Sequential Writer
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
".metadata"	TokenNameStringLiteral	.metadata
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
new	TokenNamenew	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
(	TokenNameLPAREN	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
DEFAULT_CHUNK_LENGTH	TokenNameIdentifier	 DEFAULT  CHUNK  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"The quick "	TokenNameStringLiteral	The quick 
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"blue fox jumps over the lazy dog"	TokenNameStringLiteral	blue fox jumps over the lazy dog
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write enough to be sure to change chunk 	TokenNameCOMMENT_LINE	write enough to be sure to change chunk 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
junkSize	TokenNameIdentifier	 junk Size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
resetAndTruncate	TokenNameIdentifier	 reset And Truncate
(	TokenNameLPAREN	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"brown fox jumps over the lazy dog"	TokenNameStringLiteral	brown fox jumps over the lazy dog
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
compressed	TokenNameIdentifier	 compressed
?	TokenNameQUESTION	
new	TokenNamenew	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
new	TokenNamenew	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
".metadata"	TokenNameStringLiteral	.metadata
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
DEFAULT_CHUNK_LENGTH	TokenNameIdentifier	 DEFAULT  CHUNK  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
"The quick brown fox jumps over the lazy dog"	TokenNameStringLiteral	The quick brown fox jumps over the lazy dog
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Expecting '"	TokenNameStringLiteral	Expecting '
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
+	TokenNamePLUS	
"', got '"	TokenNameStringLiteral	', got '
+	TokenNamePLUS	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// cleanup 	TokenNameCOMMENT_LINE	cleanup 
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
".metadata"	TokenNameStringLiteral	.metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
&&	TokenNameAND_AND	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDataCorruptionDetection	TokenNameIdentifier	 test Data Corruption Detection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
CONTENT	TokenNameIdentifier	 CONTENT
=	TokenNameEQUAL	
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vitae."	TokenNameStringLiteral	Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vitae.
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"testDataCorruptionDetection"	TokenNameStringLiteral	testDataCorruptionDetection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".meta"	TokenNameStringLiteral	.meta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
=	TokenNameEQUAL	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
.	TokenNameDOT	
createCollector	TokenNameIdentifier	 create Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
CompressedSequentialWriter	TokenNameIdentifier	 Compressed Sequential Writer
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
new	TokenNamenew	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
(	TokenNameLPAREN	
SnappyCompressor	TokenNameIdentifier	 Snappy Compressor
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
CONTENT	TokenNameIdentifier	 CONTENT
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// open compression metadata and get chunk information 	TokenNameCOMMENT_LINE	open compression metadata and get chunk information 
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
meta	TokenNameIdentifier	 meta
=	TokenNameEQUAL	
new	TokenNamenew	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
chunkFor	TokenNameIdentifier	 chunk For
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
meta	TokenNameIdentifier	 meta
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read and verify compressed data 	TokenNameCOMMENT_LINE	read and verify compressed data 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CONTENT	TokenNameIdentifier	 CONTENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close reader 	TokenNameCOMMENT_LINE	close reader 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomAccessFile	TokenNameIdentifier	 Random Access File
checksumModifier	TokenNameIdentifier	 checksum Modifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
checksumModifier	TokenNameIdentifier	 checksum Modifier
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// seek to the end of the compressed chunk 	TokenNameCOMMENT_LINE	seek to the end of the compressed chunk 
checksumModifier	TokenNameIdentifier	 checksum Modifier
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read checksum bytes 	TokenNameCOMMENT_LINE	read checksum bytes 
checksumModifier	TokenNameIdentifier	 checksum Modifier
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// seek back to the chunk end 	TokenNameCOMMENT_LINE	seek back to the chunk end 
checksumModifier	TokenNameIdentifier	 checksum Modifier
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lets modify one byte of the checksum on each iteration 	TokenNameCOMMENT_LINE	lets modify one byte of the checksum on each iteration 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksumModifier	TokenNameIdentifier	 checksum Modifier
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checksumModifier	TokenNameIdentifier	 checksum Modifier
.	TokenNameDOT	
getFD	TokenNameIdentifier	 get FD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// making sure that change was synced with disk 	TokenNameCOMMENT_LINE	making sure that change was synced with disk 
final	TokenNamefinal	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
meta	TokenNameIdentifier	 meta
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// lets write original checksum and check if we can read data 	TokenNameCOMMENT_LINE	lets write original checksum and check if we can read data 
updateChecksum	TokenNameIdentifier	 update Checksum
(	TokenNameLPAREN	
checksumModifier	TokenNameIdentifier	 checksum Modifier
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
CompressedRandomAccessReader	TokenNameIdentifier	 Compressed Random Access Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
meta	TokenNameIdentifier	 meta
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read and verify compressed data 	TokenNameCOMMENT_LINE	read and verify compressed data 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CONTENT	TokenNameIdentifier	 CONTENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close reader 	TokenNameCOMMENT_LINE	close reader 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checksumModifier	TokenNameIdentifier	 checksum Modifier
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
checksumModifier	TokenNameIdentifier	 checksum Modifier
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updateChecksum	TokenNameIdentifier	 update Checksum
(	TokenNameLPAREN	
RandomAccessFile	TokenNameIdentifier	 Random Access File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
long	TokenNamelong	
checksumOffset	TokenNameIdentifier	 checksum Offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
checksumOffset	TokenNameIdentifier	 checksum Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getFD	TokenNameIdentifier	 get FD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
