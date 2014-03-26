package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with this * work for additional information regarding copyright ownership. The ASF * licenses this file to You under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
ClosedChannelException	TokenNameIdentifier	 Closed Channel Exception
;	TokenNameSEMICOLON	
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
FileChannel	TokenNameIdentifier	 File Channel
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
Future	TokenNameIdentifier	 Future
;	TokenNameSEMICOLON	
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
/** * An {@link FSDirectory} implementation that uses java.nio's FileChannel's * positional read, which allows multiple threads to read from the same file * without synchronizing. * <p> * This class only uses FileChannel when reading; writing is achieved with * {@link FSDirectory.FSIndexOutput}. * <p> * <b>NOTE</b>: NIOFSDirectory is not recommended on Windows because of a bug in * how FileChannel.read is implemented in Sun's JRE. Inside of the * implementation the position is apparently synchronized. See <a * href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6265734">here</a> * for details. * </p> * <p> * <font color="red"><b>NOTE:</b> Accessing this class either directly or * indirectly from a thread while it's interrupted can close the * underlying file descriptor immediately if at the same time the thread is * blocked on IO. The file descriptor will remain closed and subsequent access * to {@link NIOFSDirectory} will throw a {@link ClosedChannelException}. If * your application uses either {@link Thread#interrupt()} or * {@link Future#cancel(boolean)} you should use {@link SimpleFSDirectory} in * favor of {@link NIOFSDirectory}.</font> * </p> */	TokenNameCOMMENT_JAVADOC	 An {@link FSDirectory} implementation that uses java.nio's FileChannel's positional read, which allows multiple threads to read from the same file without synchronizing. <p> This class only uses FileChannel when reading; writing is achieved with {@link FSDirectory.FSIndexOutput}. <p> <b>NOTE</b>: NIOFSDirectory is not recommended on Windows because of a bug in how FileChannel.read is implemented in Sun's JRE. Inside of the implementation the position is apparently synchronized. See <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6265734">here</a> for details. </p> <p> <font color="red"><b>NOTE:</b> Accessing this class either directly or indirectly from a thread while it's interrupted can close the underlying file descriptor immediately if at the same time the thread is blocked on IO. The file descriptor will remain closed and subsequent access to {@link NIOFSDirectory} will throw a {@link ClosedChannelException}. If your application uses either {@link Thread#interrupt()} or {@link Future#cancel(boolean)} you should use {@link SimpleFSDirectory} in favor of {@link NIOFSDirectory}.</font> </p> 
public	TokenNamepublic	
class	TokenNameclass	
NIOFSDirectory	TokenNameIdentifier	 NIOFS Directory
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
{	TokenNameLBRACE	
/** Create a new NIOFSDirectory for the named location. * * @param path the path of the directory * @param lockFactory the lock factory to use, or null for the default * ({@link NativeFSLockFactory}); * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new NIOFSDirectory for the named location. * @param path the path of the directory @param lockFactory the lock factory to use, or null for the default ({@link NativeFSLockFactory}); @throws IOException 
public	TokenNamepublic	
NIOFSDirectory	TokenNameIdentifier	 NIOFS Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new NIOFSDirectory for the named location and {@link NativeFSLockFactory}. * * @param path the path of the directory * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new NIOFSDirectory for the named location and {@link NativeFSLockFactory}. * @param path the path of the directory @throws IOException 
public	TokenNamepublic	
NIOFSDirectory	TokenNameIdentifier	 NIOFS Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates an IndexInput for the file with the given name. */	TokenNameCOMMENT_JAVADOC	 Creates an IndexInput for the file with the given name. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexInput	TokenNameIdentifier	 Index Input
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
NIOFSIndexInput	TokenNameIdentifier	 NIOFS Index Input
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
getReadChunkSize	TokenNameIdentifier	 get Read Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
NIOFSIndexInput	TokenNameIdentifier	 NIOFS Index Input
extends	TokenNameextends	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
.	TokenNameDOT	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
byteBuf	TokenNameIdentifier	 byte Buf
;	TokenNameSEMICOLON	
// wraps the buffer for NIO 	TokenNameCOMMENT_LINE	wraps the buffer for NIO 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherBuffer	TokenNameIdentifier	 other Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
otherByteBuf	TokenNameIdentifier	 other Byte Buf
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FileChannel	TokenNameIdentifier	 File Channel
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NIOFSIndexInput	TokenNameIdentifier	 NIOFS Index Input
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"NIOFSIndexInput(path=""	TokenNameStringLiteral	NIOFSIndexInput(path="
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
newBuffer	TokenNameIdentifier	 new Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byteBuf	TokenNameIdentifier	 byte Buf
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
newBuffer	TokenNameIdentifier	 new Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isClone	TokenNameIdentifier	 is Clone
&&	TokenNameAND_AND	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isOpen	TokenNameIdentifier	 is Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Close the channel & file 	TokenNameCOMMENT_LINE	Close the channel & file 
try	TokenNametry	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
readInternal	TokenNameIdentifier	 read Internal
(	TokenNameLPAREN	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
;	TokenNameSEMICOLON	
// Determine the ByteBuffer we should use 	TokenNameCOMMENT_LINE	Determine the ByteBuffer we should use 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
&&	TokenNameAND_AND	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use our own pre-wrapped byteBuf: 	TokenNameCOMMENT_LINE	Use our own pre-wrapped byteBuf: 
assert	TokenNameassert	
byteBuf	TokenNameIdentifier	 byte Buf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byteBuf	TokenNameIdentifier	 byte Buf
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byteBuf	TokenNameIdentifier	 byte Buf
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
byteBuf	TokenNameIdentifier	 byte Buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherBuffer	TokenNameIdentifier	 other Buffer
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now wrap this other buffer; with compound 	TokenNameCOMMENT_LINE	Now wrap this other buffer; with compound 
// file, we are repeatedly called with its 	TokenNameCOMMENT_LINE	file, we are repeatedly called with its 
// buffer, so we wrap it once and then re-use it 	TokenNameCOMMENT_LINE	buffer, so we wrap it once and then re-use it 
// on subsequent calls 	TokenNameCOMMENT_LINE	on subsequent calls 
otherBuffer	TokenNameIdentifier	 other Buffer
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
otherByteBuf	TokenNameIdentifier	 other Byte Buf
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
otherByteBuf	TokenNameIdentifier	 other Byte Buf
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherByteBuf	TokenNameIdentifier	 other Byte Buf
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
otherByteBuf	TokenNameIdentifier	 other Byte Buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Always wrap when offset != 0 	TokenNameCOMMENT_LINE	Always wrap when offset != 0 
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
readOffset	TokenNameIdentifier	 read Offset
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
readLength	TokenNameIdentifier	 read Length
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
readOffset	TokenNameIdentifier	 read Offset
;	TokenNameSEMICOLON	
assert	TokenNameassert	
readLength	TokenNameIdentifier	 read Length
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
readLength	TokenNameIdentifier	 read Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readLength	TokenNameIdentifier	 read Length
>	TokenNameGREATER	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-1566 - work around JVM Bug by breaking 	TokenNameCOMMENT_LINE	LUCENE-1566 - work around JVM Bug by breaking 
// very large reads into chunks 	TokenNameCOMMENT_LINE	very large reads into chunks 
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
readOffset	TokenNameIdentifier	 read Offset
+	TokenNamePLUS	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
readOffset	TokenNameIdentifier	 read Offset
+	TokenNamePLUS	
readLength	TokenNameIdentifier	 read Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"read past EOF: "	TokenNameStringLiteral	read past EOF: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
readOffset	TokenNameIdentifier	 read Offset
+=	TokenNamePLUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
readLength	TokenNameIdentifier	 read Length
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
OutOfMemoryError	TokenNameIdentifier	 Out Of Memory Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// propagate OOM up and add a hint for 32bit VM Users hitting the bug 	TokenNameCOMMENT_LINE	propagate OOM up and add a hint for 32bit VM Users hitting the bug 
// with a large chunk size in the fast path. 	TokenNameCOMMENT_LINE	with a large chunk size in the fast path. 
final	TokenNamefinal	
OutOfMemoryError	TokenNameIdentifier	 Out Of Memory Error
outOfMemoryError	TokenNameIdentifier	 out Of Memory Error
=	TokenNameEQUAL	
new	TokenNamenew	
OutOfMemoryError	TokenNameIdentifier	 Out Of Memory Error
(	TokenNameLPAREN	
"OutOfMemoryError likely caused by the Sun VM Bug described in "	TokenNameStringLiteral	OutOfMemoryError likely caused by the Sun VM Bug described in 
+	TokenNamePLUS	
"https://issues.apache.org/jira/browse/LUCENE-1566; try calling FSDirectory.setReadChunkSize "	TokenNameStringLiteral	https://issues.apache.org/jira/browse/LUCENE-1566; try calling FSDirectory.setReadChunkSize 
+	TokenNamePLUS	
"with a value smaller than the current chunk size ("	TokenNameStringLiteral	with a value smaller than the current chunk size (
+	TokenNamePLUS	
chunkSize	TokenNameIdentifier	 chunk Size
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outOfMemoryError	TokenNameIdentifier	 out Of Memory Error
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
outOfMemoryError	TokenNameIdentifier	 out Of Memory Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
newIOE	TokenNameIdentifier	 new IOE
=	TokenNameEQUAL	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIOE	TokenNameIdentifier	 new IOE
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
newIOE	TokenNameIdentifier	 new IOE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
