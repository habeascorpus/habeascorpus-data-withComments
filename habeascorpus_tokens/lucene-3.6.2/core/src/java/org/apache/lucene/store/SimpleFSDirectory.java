package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** A straightforward implementation of {@link FSDirectory} * using java.io.RandomAccessFile. However, this class has * poor concurrent performance (multiple threads will * bottleneck) as it synchronizes when multiple threads * read from the same file. It's usually better to use * {@link NIOFSDirectory} or {@link MMapDirectory} instead. */	TokenNameCOMMENT_JAVADOC	 A straightforward implementation of {@link FSDirectory} using java.io.RandomAccessFile. However, this class has poor concurrent performance (multiple threads will bottleneck) as it synchronizes when multiple threads read from the same file. It's usually better to use {@link NIOFSDirectory} or {@link MMapDirectory} instead. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
{	TokenNameLBRACE	
/** Create a new SimpleFSDirectory for the named location. * * @param path the path of the directory * @param lockFactory the lock factory to use, or null for the default * ({@link NativeFSLockFactory}); * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new SimpleFSDirectory for the named location. * @param path the path of the directory @param lockFactory the lock factory to use, or null for the default ({@link NativeFSLockFactory}); @throws IOException 
public	TokenNamepublic	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
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
/** Create a new SimpleFSDirectory for the named location and {@link NativeFSLockFactory}. * * @param path the path of the directory * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new SimpleFSDirectory for the named location and {@link NativeFSLockFactory}. * @param path the path of the directory @throws IOException 
public	TokenNamepublic	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
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
final	TokenNamefinal	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
(	TokenNameLPAREN	
"SimpleFSIndexInput(path=""	TokenNameStringLiteral	SimpleFSIndexInput(path="
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
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
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
extends	TokenNameextends	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Descriptor	TokenNameIdentifier	 Descriptor
extends	TokenNameextends	
RandomAccessFile	TokenNameIdentifier	 Random Access File
{	TokenNameLBRACE	
// remember if the file is open, so that we don't try to close it 	TokenNameCOMMENT_LINE	remember if the file is open, so that we don't try to close it 
// more than once 	TokenNameCOMMENT_LINE	more than once 
protected	TokenNameprotected	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
;	TokenNameSEMICOLON	
long	TokenNamelong	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
isOpen	TokenNameIdentifier	 is Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Descriptor	TokenNameIdentifier	 Descriptor
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isClone	TokenNameIdentifier	 is Clone
;	TokenNameSEMICOLON	
// LUCENE-1566 - maximum read length on a 32bit JVM to prevent incorrect OOM 	TokenNameCOMMENT_LINE	LUCENE-1566 - maximum read length on a 32bit JVM to prevent incorrect OOM 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
/** @deprecated please pass resourceDesc */	TokenNameCOMMENT_JAVADOC	 @deprecated please pass resourceDesc 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
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
this	TokenNamethis	
(	TokenNameLPAREN	
"anonymous SimpleFSIndexInput"	TokenNameStringLiteral	anonymous SimpleFSIndexInput
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceDesc	TokenNameIdentifier	 resource Desc
,	TokenNameCOMMA	
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
resourceDesc	TokenNameIdentifier	 resource Desc
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunkSize	TokenNameIdentifier	 chunk Size
=	TokenNameEQUAL	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** IndexInput methods */	TokenNameCOMMENT_JAVADOC	 IndexInput methods 
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
readLength	TokenNameIdentifier	 read Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
+	TokenNamePLUS	
chunkSize	TokenNameIdentifier	 chunk Size
>	TokenNameGREATER	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readLength	TokenNameIdentifier	 read Length
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// LUCENE-1566 - work around JVM Bug by breaking very large reads into chunks 	TokenNameCOMMENT_LINE	LUCENE-1566 - work around JVM Bug by breaking very large reads into chunks 
readLength	TokenNameIdentifier	 read Length
=	TokenNameEQUAL	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
total	TokenNameIdentifier	 total
,	TokenNameCOMMA	
readLength	TokenNameIdentifier	 read Length
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
file	TokenNameIdentifier	 file
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// only close the file if this is not a clone 	TokenNameCOMMENT_LINE	only close the file if this is not a clone 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isClone	TokenNameIdentifier	 is Clone
)	TokenNameRPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SimpleFSIndexInput	TokenNameIdentifier	 Simple FS Index Input
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
isClone	TokenNameIdentifier	 is Clone
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Method used for testing. Returns true if the underlying * file descriptor is valid. */	TokenNameCOMMENT_JAVADOC	 Method used for testing. Returns true if the underlying file descriptor is valid. 
boolean	TokenNameboolean	
isFDValid	TokenNameIdentifier	 is FD Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getFD	TokenNameIdentifier	 get FD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
numBytes	TokenNameIdentifier	 num Bytes
-=	TokenNameMINUS_EQUAL	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If out is FSIndexOutput, the copy will be optimized 	TokenNameCOMMENT_LINE	If out is FSIndexOutput, the copy will be optimized 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
