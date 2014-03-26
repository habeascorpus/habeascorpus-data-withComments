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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileDescriptor	TokenNameIdentifier	 File Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
FileChannel	TokenNameIdentifier	 File Channel
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
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
;	TokenNameSEMICOLON	
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
/** * An {@link Directory} implementation that uses the * Linux-specific O_DIRECT flag to bypass all OS level * caching. To use this you must compile * NativePosixUtil.cpp (exposes Linux-specific APIs through * JNI) for your platform. * * <p><b>WARNING</b>: this code is very new and quite easily * could contain horrible bugs. For example, here's one * known issue: if you use seek in IndexOutput, and then * write more than one buffer's worth of bytes, then the * file will be wrong. Lucene does not do this (only writes * small number of bytes after seek). * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link Directory} implementation that uses the Linux-specific O_DIRECT flag to bypass all OS level caching. To use this you must compile NativePosixUtil.cpp (exposes Linux-specific APIs through JNI) for your platform. * <p><b>WARNING</b>: this code is very new and quite easily could contain horrible bugs. For example, here's one known issue: if you use seek in IndexOutput, and then write more than one buffer's worth of bytes, then the file will be wrong. Lucene does not do this (only writes small number of bytes after seek). @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DirectIOLinuxDirectory	TokenNameIdentifier	 Direct IO Linux Directory
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
ALIGN	TokenNameIdentifier	 ALIGN
=	TokenNameEQUAL	
512	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
ALIGN	TokenNameIdentifier	 ALIGN
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
;	TokenNameSEMICOLON	
/** Create a new NIOFSDirectory for the named location. * * @param path the path of the directory * @param lockFactory the lock factory to use, or null for the default * ({@link NativeFSLockFactory}); * @param forcedBufferSize if this is 0, just use Lucene's * default buffer size; else, force this buffer size. * For best performance, force the buffer size to * something fairly large (eg 1 MB), but note that this * will eat up the JRE's direct buffer storage space * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new NIOFSDirectory for the named location. * @param path the path of the directory @param lockFactory the lock factory to use, or null for the default ({@link NativeFSLockFactory}); @param forcedBufferSize if this is 0, just use Lucene's default buffer size; else, force this buffer size. For best performance, force the buffer size to something fairly large (eg 1 MB), but note that this will eat up the JRE's direct buffer storage space @throws IOException 
public	TokenNamepublic	
DirectIOLinuxDirectory	TokenNameIdentifier	 Direct IO Linux Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
,	TokenNameCOMMA	
int	TokenNameint	
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
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
this	TokenNamethis	
.	TokenNameDOT	
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
=	TokenNameEQUAL	
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
DirectIOLinuxIndexInput	TokenNameIdentifier	 Direct IO Linux Index Input
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
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
bufferSize	TokenNameIdentifier	 buffer Size
:	TokenNameCOLON	
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexOutput	TokenNameIdentifier	 Index Output
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureCanWrite	TokenNameIdentifier	 ensure Can Write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DirectIOLinuxIndexOutput	TokenNameIdentifier	 Direct IO Linux Index Output
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
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
BufferedIndexOutput	TokenNameIdentifier	 Buffered Index Output
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
:	TokenNameCOLON	
forcedBufferSize	TokenNameIdentifier	 forced Buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
DirectIOLinuxIndexOutput	TokenNameIdentifier	 Direct IO Linux Index Output
extends	TokenNameextends	
IndexOutput	TokenNameIdentifier	 Index Output
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FileChannel	TokenNameIdentifier	 File Channel
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
//private final File path; 	TokenNameCOMMENT_LINE	private final File path; 
private	TokenNameprivate	
int	TokenNameint	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
filePos	TokenNameIdentifier	 file Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
fileLength	TokenNameIdentifier	 file Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DirectIOLinuxIndexOutput	TokenNameIdentifier	 Direct IO Linux Index Output
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//this.path = path; 	TokenNameCOMMENT_LINE	this.path = path; 
FileDescriptor	TokenNameIdentifier	 File Descriptor
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
NativePosixUtil	TokenNameIdentifier	 Native Posix Util
.	TokenNameDOT	
open_direct	TokenNameIdentifier	 open direct
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fos = new FileOutputStream(path); 	TokenNameCOMMENT_LINE	fos = new FileOutputStream(path); 
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocateDirect	TokenNameIdentifier	 allocate Direct
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
bufferPos	TokenNameIdentifier	 buffer Pos
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"bufferPos="	TokenNameStringLiteral	bufferPos=
+	TokenNamePLUS	
bufferPos	TokenNameIdentifier	 buffer Pos
+	TokenNamePLUS	
" vs buffer.position()="	TokenNameStringLiteral	 vs buffer.position()=
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
bufferPos	TokenNameIdentifier	 buffer Pos
==	TokenNameEQUAL_EQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src	TokenNameIdentifier	 src
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
int	TokenNameint	
toWrite	TokenNameIdentifier	 to Write
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
-	TokenNameMINUS	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<=	TokenNameLESS_EQUAL	
toWrite	TokenNameIdentifier	 to Write
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toWrite	TokenNameIdentifier	 to Write
-=	TokenNameMINUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
toWrite	TokenNameIdentifier	 to Write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
+=	TokenNamePLUS_EQUAL	
toWrite	TokenNameIdentifier	 to Write
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
//public void setLength() throws IOException { 	TokenNameCOMMENT_LINE	public void setLength() throws IOException { 
// TODO -- how to impl this? neither FOS nor 	TokenNameCOMMENT_LINE	TODO -- how to impl this? neither FOS nor 
// FileChannel provides an API? 	TokenNameCOMMENT_LINE	FileChannel provides an API? 
//} 	TokenNameCOMMENT_LINE	} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO -- I don't think this method is necessary? 	TokenNameCOMMENT_LINE	TODO -- I don't think this method is necessary? 
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
filePos	TokenNameIdentifier	 file Pos
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
>	TokenNameGREATER	
fileLength	TokenNameIdentifier	 file Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this dump extends the file 	TokenNameCOMMENT_LINE	this dump extends the file 
fileLength	TokenNameIdentifier	 file Length
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we had seek'd back & wrote some changes 	TokenNameCOMMENT_LINE	we had seek'd back & wrote some changes 
}	TokenNameRBRACE	
// must always round to next block 	TokenNameCOMMENT_LINE	must always round to next block 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ALIGN	TokenNameIdentifier	 ALIGN
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"limit="	TokenNameStringLiteral	limit=
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
filePos	TokenNameIdentifier	 file Pos
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
filePos	TokenNameIdentifier	 file Pos
;	TokenNameSEMICOLON	
//System.out.println(Thread.currentThread().getName() + ": dump to " + filePos + " limit=" + buffer.limit() + " fos=" + fos); 	TokenNameCOMMENT_LINE	System.out.println(Thread.currentThread().getName() + ": dump to " + filePos + " limit=" + buffer.limit() + " fos=" + fos); 
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
filePos	TokenNameIdentifier	 file Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filePos	TokenNameIdentifier	 file Pos
+=	TokenNamePLUS_EQUAL	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("dump: done"); 	TokenNameCOMMENT_LINE	System.out.println("dump: done"); 
// TODO: the case where we'd seek'd back, wrote an 	TokenNameCOMMENT_LINE	TODO: the case where we'd seek'd back, wrote an 
// entire buffer, we must here read the next buffer; 	TokenNameCOMMENT_LINE	entire buffer, we must here read the next buffer; 
// likely Lucene won't trip on this since we only 	TokenNameCOMMENT_LINE	likely Lucene won't trip on this since we only 
// write smallish amounts on seeking back 	TokenNameCOMMENT_LINE	write smallish amounts on seeking back 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filePos	TokenNameIdentifier	 file Pos
+	TokenNamePLUS	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: seek is fragile at best; it can only properly 	TokenNameCOMMENT_LINE	TODO: seek is fragile at best; it can only properly 
// handle seek & then change bytes that fit entirely 	TokenNameCOMMENT_LINE	handle seek & then change bytes that fit entirely 
// within one buffer 	TokenNameCOMMENT_LINE	within one buffer 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
alignedPos	TokenNameIdentifier	 aligned Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
;	TokenNameSEMICOLON	
filePos	TokenNameIdentifier	 file Pos
=	TokenNameEQUAL	
alignedPos	TokenNameIdentifier	 aligned Pos
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
NativePosixUtil	TokenNameIdentifier	 Native Posix Util
.	TokenNameDOT	
pread	TokenNameIdentifier	 pread
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
getFD	TokenNameIdentifier	 get FD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filePos	TokenNameIdentifier	 file Pos
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("seek refill=" + n); 	TokenNameCOMMENT_LINE	System.out.println("seek refill=" + n); 
final	TokenNamefinal	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
alignedPos	TokenNameIdentifier	 aligned Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
fileLength	TokenNameIdentifier	 file Length
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
try	TokenNametry	
{	TokenNameLBRACE	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//System.out.println("direct close set len=" + fileLength + " vs " + channel.size() + " path=" + path); 	TokenNameCOMMENT_LINE	System.out.println("direct close set len=" + fileLength + " vs " + channel.size() + " path=" + path); 
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
fileLength	TokenNameIdentifier	 file Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" now: " + channel.size()); 	TokenNameCOMMENT_LINE	System.out.println(" now: " + channel.size()); 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
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
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" final len=" + path.length()); 	TokenNameCOMMENT_LINE	System.out.println(" final len=" + path.length()); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
DirectIOLinuxIndexInput	TokenNameIdentifier	 Direct IO Linux Index Input
extends	TokenNameextends	
IndexInput	TokenNameIdentifier	 Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FileChannel	TokenNameIdentifier	 File Channel
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isClone	TokenNameIdentifier	 is Clone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
filePos	TokenNameIdentifier	 file Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DirectIOLinuxIndexInput	TokenNameIdentifier	 Direct IO Linux Index Input
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"DirectIOLinuxIndexInput(path=""	TokenNameStringLiteral	DirectIOLinuxIndexInput(path="
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileDescriptor	TokenNameIdentifier	 File Descriptor
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
NativePosixUtil	TokenNameIdentifier	 Native Posix Util
.	TokenNameDOT	
open_direct	TokenNameIdentifier	 open direct
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocateDirect	TokenNameIdentifier	 allocate Direct
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
isClone	TokenNameIdentifier	 is Clone
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
filePos	TokenNameIdentifier	 file Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
//System.out.println("D open " + path + " this=" + this); 	TokenNameCOMMENT_LINE	System.out.println("D open " + path + " this=" + this); 
}	TokenNameRBRACE	
// for clone 	TokenNameCOMMENT_LINE	for clone 
public	TokenNamepublic	
DirectIOLinuxIndexInput	TokenNameIdentifier	 Direct IO Linux Index Input
(	TokenNameLPAREN	
DirectIOLinuxIndexInput	TokenNameIdentifier	 Direct IO Linux Index Input
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocateDirect	TokenNameIdentifier	 allocate Direct
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filePos	TokenNameIdentifier	 file Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
isClone	TokenNameIdentifier	 is Clone
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//System.out.println("D clone this=" + this); 	TokenNameCOMMENT_LINE	System.out.println("D clone this=" + this); 
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
&&	TokenNameAND_AND	
!	TokenNameNOT	
isClone	TokenNameIdentifier	 is Clone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isClone	TokenNameIdentifier	 is Clone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filePos	TokenNameIdentifier	 file Pos
+	TokenNamePLUS	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
alignedPos	TokenNameIdentifier	 aligned Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
;	TokenNameSEMICOLON	
//System.out.println("seek pos=" + pos + " aligned=" + alignedPos + " bufferSize=" + bufferSize + " this=" + this); 	TokenNameCOMMENT_LINE	System.out.println("seek pos=" + pos + " aligned=" + alignedPos + " bufferSize=" + bufferSize + " this=" + this); 
filePos	TokenNameIdentifier	 file Pos
=	TokenNameEQUAL	
alignedPos	TokenNameIdentifier	 aligned Pos
-	TokenNameMINUS	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
alignedPos	TokenNameIdentifier	 aligned Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"IOException during length(): "	TokenNameStringLiteral	IOException during length(): 
+	TokenNamePLUS	
this	TokenNamethis	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: we don't guard against EOF here... ie the 	TokenNameCOMMENT_LINE	NOTE: we don't guard against EOF here... ie the 
// "final" buffer will typically be filled to less 	TokenNameCOMMENT_LINE	"final" buffer will typically be filled to less 
// than bufferSize 	TokenNameCOMMENT_LINE	than bufferSize 
if	TokenNameif	
(	TokenNameLPAREN	
bufferPos	TokenNameIdentifier	 buffer Pos
==	TokenNameEQUAL_EQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
bufferPos	TokenNameIdentifier	 buffer Pos
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"bufferPos="	TokenNameStringLiteral	bufferPos=
+	TokenNamePLUS	
bufferPos	TokenNameIdentifier	 buffer Pos
+	TokenNamePLUS	
" vs buffer.position()="	TokenNameStringLiteral	 vs buffer.position()=
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filePos	TokenNameIdentifier	 file Pos
+=	TokenNamePLUS_EQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
filePos	TokenNameIdentifier	 file Pos
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
filePos	TokenNameIdentifier	 file Pos
:	TokenNameCOLON	
"filePos="	TokenNameStringLiteral	filePos=
+	TokenNamePLUS	
filePos	TokenNameIdentifier	 file Pos
+	TokenNamePLUS	
" anded="	TokenNameStringLiteral	 anded=
+	TokenNamePLUS	
(	TokenNameLPAREN	
filePos	TokenNameIdentifier	 file Pos
&	TokenNameAND	
ALIGN_NOT_MASK	TokenNameIdentifier	 ALIGN  NOT  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("X refill filePos=" + filePos); 	TokenNameCOMMENT_LINE	System.out.println("X refill filePos=" + filePos); 
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
filePos	TokenNameIdentifier	 file Pos
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dst	TokenNameIdentifier	 dst
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
int	TokenNameint	
toRead	TokenNameIdentifier	 to Read
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
//System.out.println("\nX readBytes len=" + len + " fp=" + getFilePointer() + " size=" + length() + " this=" + this); 	TokenNameCOMMENT_LINE	System.out.println("\nX readBytes len=" + len + " fp=" + getFilePointer() + " size=" + length() + " this=" + this); 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
-	TokenNameMINUS	
bufferPos	TokenNameIdentifier	 buffer Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
toRead	TokenNameIdentifier	 to Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" copy " + left); 	TokenNameCOMMENT_LINE	System.out.println(" copy " + left); 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toRead	TokenNameIdentifier	 to Read
-=	TokenNameMINUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println(" copy " + toRead); 	TokenNameCOMMENT_LINE	System.out.println(" copy " + toRead); 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
toRead	TokenNameIdentifier	 to Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPos	TokenNameIdentifier	 buffer Pos
+=	TokenNamePLUS_EQUAL	
toRead	TokenNameIdentifier	 to Read
;	TokenNameSEMICOLON	
//System.out.println(" readBytes done"); 	TokenNameCOMMENT_LINE	System.out.println(" readBytes done"); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DirectIOLinuxIndexInput	TokenNameIdentifier	 Direct IO Linux Index Input
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"IOException during clone: "	TokenNameStringLiteral	IOException during clone: 
+	TokenNamePLUS	
this	TokenNamethis	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
