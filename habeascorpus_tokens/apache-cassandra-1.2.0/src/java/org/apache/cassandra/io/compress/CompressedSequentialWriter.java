/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
EOFException	TokenNameIdentifier	 EOF Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Checksum	TokenNameIdentifier	 Checksum
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
FSReadError	TokenNameIdentifier	 FS Read Error
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
FSWriteError	TokenNameIdentifier	 FS Write Error
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
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
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
FileMark	TokenNameIdentifier	 File Mark
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
SequentialWriter	TokenNameIdentifier	 Sequential Writer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CompressedSequentialWriter	TokenNameIdentifier	 Compressed Sequential Writer
extends	TokenNameextends	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequentialWriter	TokenNameIdentifier	 Sequential Writer
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dataFilePath	TokenNameIdentifier	 data File Path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
indexFilePath	TokenNameIdentifier	 index File Path
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompressedSequentialWriter	TokenNameIdentifier	 Compressed Sequential Writer
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dataFilePath	TokenNameIdentifier	 data File Path
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexFilePath	TokenNameIdentifier	 index File Path
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// holds offset in the file where current chunk should be written 	TokenNameCOMMENT_LINE	holds offset in the file where current chunk should be written 
// changed only by flush() method where data buffer gets compressed and stored to the file 	TokenNameCOMMENT_LINE	changed only by flush() method where data buffer gets compressed and stored to the file 
private	TokenNameprivate	
long	TokenNamelong	
chunkOffset	TokenNameIdentifier	 chunk Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// index file writer (random I/O) 	TokenNameCOMMENT_LINE	index file writer (random I/O) 
private	TokenNameprivate	
final	TokenNamefinal	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
metadataWriter	TokenNameIdentifier	 metadata Writer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ICompressor	TokenNameIdentifier	 I Compressor
compressor	TokenNameIdentifier	 compressor
;	TokenNameSEMICOLON	
// used to store compressed data 	TokenNameCOMMENT_LINE	used to store compressed data 
private	TokenNameprivate	
final	TokenNamefinal	
ICompressor	TokenNameIdentifier	 I Compressor
.	TokenNameDOT	
WrappedArray	TokenNameIdentifier	 Wrapped Array
compressed	TokenNameIdentifier	 compressed
;	TokenNameSEMICOLON	
// holds a number of already written chunks 	TokenNameCOMMENT_LINE	holds a number of already written chunks 
private	TokenNameprivate	
int	TokenNameint	
chunkCount	TokenNameIdentifier	 chunk Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Checksum	TokenNameIdentifier	 Checksum
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
originalSize	TokenNameIdentifier	 original Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
compressedSize	TokenNameIdentifier	 compressed Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompressedSequentialWriter	TokenNameIdentifier	 Compressed Sequential Writer
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
indexFilePath	TokenNameIdentifier	 index File Path
,	TokenNameCOMMA	
boolean	TokenNameboolean	
skipIOCache	TokenNameIdentifier	 skip IO Cache
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
chunkLength	TokenNameIdentifier	 chunk Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
skipIOCache	TokenNameIdentifier	 skip IO Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compressor	TokenNameIdentifier	 compressor
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
sstableCompressor	TokenNameIdentifier	 sstable Compressor
;	TokenNameSEMICOLON	
// buffer for compression should be the same size as buffer itself 	TokenNameCOMMENT_LINE	buffer for compression should be the same size as buffer itself 
compressed	TokenNameIdentifier	 compressed
=	TokenNameEQUAL	
new	TokenNamenew	
ICompressor	TokenNameIdentifier	 I Compressor
.	TokenNameDOT	
WrappedArray	TokenNameIdentifier	 Wrapped Array
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
compressor	TokenNameIdentifier	 compressor
.	TokenNameDOT	
initialCompressedBufferLength	TokenNameIdentifier	 initial Compressed Buffer Length
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Index File (-CompressionInfo.db component) and it's header */	TokenNameCOMMENT_BLOCK	 Index File (-CompressionInfo.db component) and it's header 
metadataWriter	TokenNameIdentifier	 metadata Writer
=	TokenNameEQUAL	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
indexFilePath	TokenNameIdentifier	 index File Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadataWriter	TokenNameIdentifier	 metadata Writer
.	TokenNameDOT	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
=	TokenNameEQUAL	
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getOnDiskFilePointer	TokenNameIdentifier	 get On Disk File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSReadError	TokenNameIdentifier	 FS Read Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
flushData	TokenNameIdentifier	 flush Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seekToChunkStart	TokenNameIdentifier	 seek To Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
compressedLength	TokenNameIdentifier	 compressed Length
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// compressing data with buffer re-use 	TokenNameCOMMENT_LINE	compressing data with buffer re-use 
compressedLength	TokenNameIdentifier	 compressed Length
=	TokenNameEQUAL	
compressor	TokenNameIdentifier	 compressor
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
,	TokenNameCOMMA	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Compression exception"	TokenNameStringLiteral	Compression exception
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// shouldn't happen 	TokenNameCOMMENT_LINE	shouldn't happen 
}	TokenNameRBRACE	
originalSize	TokenNameIdentifier	 original Size
+=	TokenNamePLUS_EQUAL	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
compressedSize	TokenNameIdentifier	 compressed Size
+=	TokenNamePLUS_EQUAL	
compressedLength	TokenNameIdentifier	 compressed Length
;	TokenNameSEMICOLON	
// update checksum 	TokenNameCOMMENT_LINE	update checksum 
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// write an offset of the newly written chunk to the index file 	TokenNameCOMMENT_LINE	write an offset of the newly written chunk to the index file 
metadataWriter	TokenNameIdentifier	 metadata Writer
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
chunkOffset	TokenNameIdentifier	 chunk Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkCount	TokenNameIdentifier	 chunk Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
compressedLength	TokenNameIdentifier	 compressed Length
<=	TokenNameLESS_EQUAL	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// write data itself 	TokenNameCOMMENT_LINE	write data itself 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
compressedLength	TokenNameIdentifier	 compressed Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write corresponding checksum 	TokenNameCOMMENT_LINE	write corresponding checksum 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSWriteError	TokenNameIdentifier	 FS Write Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset checksum object to the blank state for re-use 	TokenNameCOMMENT_LINE	reset checksum object to the blank state for re-use 
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next chunk should be written right after current + length of the checksum (int) 	TokenNameCOMMENT_LINE	next chunk should be written right after current + length of the checksum (int) 
chunkOffset	TokenNameIdentifier	 chunk Offset
+=	TokenNamePLUS_EQUAL	
compressedLength	TokenNameIdentifier	 compressed Length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompressedFileWriterMark	TokenNameIdentifier	 Compressed File Writer Mark
(	TokenNameLPAREN	
chunkOffset	TokenNameIdentifier	 chunk Offset
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
,	TokenNameCOMMA	
chunkCount	TokenNameIdentifier	 chunk Count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
resetAndTruncate	TokenNameIdentifier	 reset And Truncate
(	TokenNameLPAREN	
FileMark	TokenNameIdentifier	 File Mark
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
mark	TokenNameIdentifier	 mark
instanceof	TokenNameinstanceof	
CompressedFileWriterMark	TokenNameIdentifier	 Compressed File Writer Mark
;	TokenNameSEMICOLON	
CompressedFileWriterMark	TokenNameIdentifier	 Compressed File Writer Mark
realMark	TokenNameIdentifier	 real Mark
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompressedFileWriterMark	TokenNameIdentifier	 Compressed File Writer Mark
)	TokenNameRPAREN	
mark	TokenNameIdentifier	 mark
;	TokenNameSEMICOLON	
// reset position 	TokenNameCOMMENT_LINE	reset position 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
uncDataOffset	TokenNameIdentifier	 unc Data Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
chunkOffset	TokenNameIdentifier	 chunk Offset
==	TokenNameEQUAL_EQUAL	
chunkOffset	TokenNameIdentifier	 chunk Offset
)	TokenNameRPAREN	
// current buffer 	TokenNameCOMMENT_LINE	current buffer 
{	TokenNameLBRACE	
// just reset a buffer offset and return 	TokenNameCOMMENT_LINE	just reset a buffer offset and return 
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// synchronize current buffer with disk 	TokenNameCOMMENT_LINE	synchronize current buffer with disk 
// because we don't want any data loss 	TokenNameCOMMENT_LINE	because we don't want any data loss 
syncInternal	TokenNameIdentifier	 sync Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setting marker as a current offset 	TokenNameCOMMENT_LINE	setting marker as a current offset 
chunkOffset	TokenNameIdentifier	 chunk Offset
=	TokenNameEQUAL	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
chunkOffset	TokenNameIdentifier	 chunk Offset
;	TokenNameSEMICOLON	
// compressed chunk size (- 4 bytes reserved for checksum) 	TokenNameCOMMENT_LINE	compressed chunk size (- 4 bytes reserved for checksum) 
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
metadataWriter	TokenNameIdentifier	 metadata Writer
.	TokenNameDOT	
chunkOffsetBy	TokenNameIdentifier	 chunk Offset By
(	TokenNameLPAREN	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
)	TokenNameRPAREN	
-	TokenNameMINUS	
chunkOffset	TokenNameIdentifier	 chunk Offset
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
chunkSize	TokenNameIdentifier	 chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
chunkOffset	TokenNameIdentifier	 chunk Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
validBytes	TokenNameIdentifier	 valid Bytes
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// decompress data chunk and store its length 	TokenNameCOMMENT_LINE	decompress data chunk and store its length 
validBytes	TokenNameIdentifier	 valid Bytes
=	TokenNameEQUAL	
compressor	TokenNameIdentifier	 compressor
.	TokenNameDOT	
uncompress	TokenNameIdentifier	 uncompress
(	TokenNameLPAREN	
compressed	TokenNameIdentifier	 compressed
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunkOffset	TokenNameIdentifier	 chunk Offset
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
validBytes	TokenNameIdentifier	 valid Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunkOffset	TokenNameIdentifier	 chunk Offset
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
new	TokenNamenew	
CorruptBlockException	TokenNameIdentifier	 Corrupt Block Exception
(	TokenNameLPAREN	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunkOffset	TokenNameIdentifier	 chunk Offset
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSReadError	TokenNameIdentifier	 FS Read Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checksum	TokenNameIdentifier	 checksum
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset buffer 	TokenNameCOMMENT_LINE	reset buffer 
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
=	TokenNameEQUAL	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
validBufferBytes	TokenNameIdentifier	 valid Buffer Bytes
;	TokenNameSEMICOLON	
chunkCount	TokenNameIdentifier	 chunk Count
=	TokenNameEQUAL	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// truncate data and index file 	TokenNameCOMMENT_LINE	truncate data and index file 
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
chunkOffset	TokenNameIdentifier	 chunk Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadataWriter	TokenNameIdentifier	 metadata Writer
.	TokenNameDOT	
resetAndTruncate	TokenNameIdentifier	 reset And Truncate
(	TokenNameLPAREN	
realMark	TokenNameIdentifier	 real Mark
.	TokenNameDOT	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Seek to the offset where next compressed data chunk should be stored. */	TokenNameCOMMENT_JAVADOC	 Seek to the offset where next compressed data chunk should be stored. 
private	TokenNameprivate	
void	TokenNamevoid	
seekToChunkStart	TokenNameIdentifier	 seek To Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getOnDiskFilePointer	TokenNameIdentifier	 get On Disk File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
chunkOffset	TokenNameIdentifier	 chunk Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
chunkOffset	TokenNameIdentifier	 chunk Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSReadError	TokenNameIdentifier	 FS Read Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// already closed 	TokenNameCOMMENT_LINE	already closed 
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sstableMetadataCollector	TokenNameIdentifier	 sstable Metadata Collector
.	TokenNameDOT	
addCompressionRatio	TokenNameIdentifier	 add Compression Ratio
(	TokenNameLPAREN	
compressedSize	TokenNameIdentifier	 compressed Size
,	TokenNameCOMMA	
originalSize	TokenNameIdentifier	 original Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metadataWriter	TokenNameIdentifier	 metadata Writer
.	TokenNameDOT	
finalizeHeader	TokenNameIdentifier	 finalize Header
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
chunkCount	TokenNameIdentifier	 chunk Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
metadataWriter	TokenNameIdentifier	 metadata Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FSWriteError	TokenNameIdentifier	 FS Write Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Class to hold a mark to the position of the file */	TokenNameCOMMENT_JAVADOC	 Class to hold a mark to the position of the file 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
CompressedFileWriterMark	TokenNameIdentifier	 Compressed File Writer Mark
implements	TokenNameimplements	
FileMark	TokenNameIdentifier	 File Mark
{	TokenNameLBRACE	
// chunk offset in the compressed file 	TokenNameCOMMENT_LINE	chunk offset in the compressed file 
final	TokenNamefinal	
long	TokenNamelong	
chunkOffset	TokenNameIdentifier	 chunk Offset
;	TokenNameSEMICOLON	
// uncompressed data offset (real data offset) 	TokenNameCOMMENT_LINE	uncompressed data offset (real data offset) 
final	TokenNamefinal	
long	TokenNamelong	
uncDataOffset	TokenNameIdentifier	 unc Data Offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompressedFileWriterMark	TokenNameIdentifier	 Compressed File Writer Mark
(	TokenNameLPAREN	
long	TokenNamelong	
chunkOffset	TokenNameIdentifier	 chunk Offset
,	TokenNameCOMMA	
long	TokenNamelong	
uncDataOffset	TokenNameIdentifier	 unc Data Offset
,	TokenNameCOMMA	
int	TokenNameint	
bufferOffset	TokenNameIdentifier	 buffer Offset
,	TokenNameCOMMA	
int	TokenNameint	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chunkOffset	TokenNameIdentifier	 chunk Offset
=	TokenNameEQUAL	
chunkOffset	TokenNameIdentifier	 chunk Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uncDataOffset	TokenNameIdentifier	 unc Data Offset
=	TokenNameEQUAL	
uncDataOffset	TokenNameIdentifier	 unc Data Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
=	TokenNameEQUAL	
nextChunkIndex	TokenNameIdentifier	 next Chunk Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
