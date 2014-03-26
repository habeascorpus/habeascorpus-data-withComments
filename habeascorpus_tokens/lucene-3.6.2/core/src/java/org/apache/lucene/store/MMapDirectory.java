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
IOException	TokenNameIdentifier	 IO Exception
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
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
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
FileChannel	TokenNameIdentifier	 File Channel
.	TokenNameDOT	
MapMode	TokenNameIdentifier	 Map Mode
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessController	TokenNameIdentifier	 Access Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PrivilegedExceptionAction	TokenNameIdentifier	 Privileged Exception Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PrivilegedActionException	TokenNameIdentifier	 Privileged Action Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
Constants	TokenNameIdentifier	 Constants
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
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
;	TokenNameSEMICOLON	
/** File-based {@link Directory} implementation that uses * mmap for reading, and {@link * FSDirectory.FSIndexOutput} for writing. * * <p><b>NOTE</b>: memory mapping uses up a portion of the * virtual memory address space in your process equal to the * size of the file being mapped. Before using this class, * be sure your have plenty of virtual address space, e.g. by * using a 64 bit JRE, or a 32 bit JRE with indexes that are * guaranteed to fit within the address space. * On 32 bit platforms also consult {@link #setMaxChunkSize} * if you have problems with mmap failing because of fragmented * address space. If you get an OutOfMemoryException, it is recommended * to reduce the chunk size, until it works. * * <p>Due to <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4724038"> * this bug</a> in Sun's JRE, MMapDirectory's {@link IndexInput#close} * is unable to close the underlying OS file handle. Only when GC * finally collects the underlying objects, which could be quite * some time later, will the file handle be closed. * * <p>This will consume additional transient disk usage: on Windows, * attempts to delete or overwrite the files will result in an * exception; on other platforms, which typically have a &quot;delete on * last close&quot; semantics, while such operations will succeed, the bytes * are still consuming space on disk. For many applications this * limitation is not a problem (e.g. if you have plenty of disk space, * and you don't rely on overwriting files on Windows) but it's still * an important limitation to be aware of. * * <p>This class supplies the workaround mentioned in the bug report * (see {@link #setUseUnmap}), which may fail on * non-Sun JVMs. It forcefully unmaps the buffer on close by using * an undocumented internal cleanup functionality. * {@link #UNMAP_SUPPORTED} is <code>true</code>, if the workaround * can be enabled (with no guarantees). * <p> * <b>NOTE:</b> Accessing this class either directly or * indirectly from a thread while it's interrupted can close the * underlying channel immediately if at the same time the thread is * blocked on IO. The channel will remain closed and subsequent access * to {@link MMapDirectory} will throw a {@link ClosedChannelException}. * </p> */	TokenNameCOMMENT_JAVADOC	 File-based {@link Directory} implementation that uses mmap for reading, and {@link FSDirectory.FSIndexOutput} for writing. * <p><b>NOTE</b>: memory mapping uses up a portion of the virtual memory address space in your process equal to the size of the file being mapped. Before using this class, be sure your have plenty of virtual address space, e.g. by using a 64 bit JRE, or a 32 bit JRE with indexes that are guaranteed to fit within the address space. On 32 bit platforms also consult {@link #setMaxChunkSize} if you have problems with mmap failing because of fragmented address space. If you get an OutOfMemoryException, it is recommended to reduce the chunk size, until it works. * <p>Due to <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4724038"> this bug</a> in Sun's JRE, MMapDirectory's {@link IndexInput#close} is unable to close the underlying OS file handle. Only when GC finally collects the underlying objects, which could be quite some time later, will the file handle be closed. * <p>This will consume additional transient disk usage: on Windows, attempts to delete or overwrite the files will result in an exception; on other platforms, which typically have a &quot;delete on last close&quot; semantics, while such operations will succeed, the bytes are still consuming space on disk. For many applications this limitation is not a problem (e.g. if you have plenty of disk space, and you don't rely on overwriting files on Windows) but it's still an important limitation to be aware of. * <p>This class supplies the workaround mentioned in the bug report (see {@link #setUseUnmap}), which may fail on non-Sun JVMs. It forcefully unmaps the buffer on close by using an undocumented internal cleanup functionality. {@link #UNMAP_SUPPORTED} is <code>true</code>, if the workaround can be enabled (with no guarantees). <p> <b>NOTE:</b> Accessing this class either directly or indirectly from a thread while it's interrupted can close the underlying channel immediately if at the same time the thread is blocked on IO. The channel will remain closed and subsequent access to {@link MMapDirectory} will throw a {@link ClosedChannelException}. </p> 
public	TokenNamepublic	
class	TokenNameclass	
MMapDirectory	TokenNameIdentifier	 M Map Directory
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
=	TokenNameEQUAL	
UNMAP_SUPPORTED	TokenNameIdentifier	 UNMAP  SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_BUFF	TokenNameIdentifier	 DEFAULT  MAX  BUFF
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
28	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
;	TokenNameSEMICOLON	
/** Create a new MMapDirectory for the named location. * * @param path the path of the directory * @param lockFactory the lock factory to use, or null for the default * ({@link NativeFSLockFactory}); * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new MMapDirectory for the named location. * @param path the path of the directory @param lockFactory the lock factory to use, or null for the default ({@link NativeFSLockFactory}); @throws IOException 
public	TokenNamepublic	
MMapDirectory	TokenNameIdentifier	 M Map Directory
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
setMaxChunkSize	TokenNameIdentifier	 set Max Chunk Size
(	TokenNameLPAREN	
DEFAULT_MAX_BUFF	TokenNameIdentifier	 DEFAULT  MAX  BUFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new MMapDirectory for the named location and {@link NativeFSLockFactory}. * * @param path the path of the directory * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new MMapDirectory for the named location and {@link NativeFSLockFactory}. * @param path the path of the directory @throws IOException 
public	TokenNamepublic	
MMapDirectory	TokenNameIdentifier	 M Map Directory
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
setMaxChunkSize	TokenNameIdentifier	 set Max Chunk Size
(	TokenNameLPAREN	
DEFAULT_MAX_BUFF	TokenNameIdentifier	 DEFAULT  MAX  BUFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <code>true</code>, if this platform supports unmapping mmapped files. */	TokenNameCOMMENT_JAVADOC	 <code>true</code>, if this platform supports unmapping mmapped files. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
UNMAP_SUPPORTED	TokenNameIdentifier	 UNMAP  SUPPORTED
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"sun.misc.Cleaner"	TokenNameStringLiteral	sun.misc.Cleaner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.nio.DirectByteBuffer"	TokenNameStringLiteral	java.nio.DirectByteBuffer
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"cleaner"	TokenNameStringLiteral	cleaner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UNMAP_SUPPORTED	TokenNameIdentifier	 UNMAP  SUPPORTED
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method enables the workaround for unmapping the buffers * from address space after closing {@link IndexInput}, that is * mentioned in the bug report. This hack may fail on non-Sun JVMs. * It forcefully unmaps the buffer on close by using * an undocumented internal cleanup functionality. * <p><b>NOTE:</b> Enabling this is completely unsupported * by Java and may lead to JVM crashes if <code>IndexInput</code> * is closed while another thread is still accessing it (SIGSEGV). * @throws IllegalArgumentException if {@link #UNMAP_SUPPORTED} * is <code>false</code> and the workaround cannot be enabled. */	TokenNameCOMMENT_JAVADOC	 This method enables the workaround for unmapping the buffers from address space after closing {@link IndexInput}, that is mentioned in the bug report. This hack may fail on non-Sun JVMs. It forcefully unmaps the buffer on close by using an undocumented internal cleanup functionality. <p><b>NOTE:</b> Enabling this is completely unsupported by Java and may lead to JVM crashes if <code>IndexInput</code> is closed while another thread is still accessing it (SIGSEGV). @throws IllegalArgumentException if {@link #UNMAP_SUPPORTED} is <code>false</code> and the workaround cannot be enabled. 
public	TokenNamepublic	
void	TokenNamevoid	
setUseUnmap	TokenNameIdentifier	 set Use Unmap
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
&&	TokenNameAND_AND	
!	TokenNameNOT	
UNMAP_SUPPORTED	TokenNameIdentifier	 UNMAP  SUPPORTED
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unmap hack not supported on this platform!"	TokenNameStringLiteral	Unmap hack not supported on this platform!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
=	TokenNameEQUAL	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code>, if the unmap workaround is enabled. * @see #setUseUnmap */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code>, if the unmap workaround is enabled. @see #setUseUnmap 
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseUnmap	TokenNameIdentifier	 get Use Unmap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try to unmap the buffer, this method silently fails if no support * for that in the JVM. On Windows, this leads to the fact, * that mmapped files cannot be modified or deleted. */	TokenNameCOMMENT_JAVADOC	 Try to unmap the buffer, this method silently fails if no support for that in the JVM. On Windows, this leads to the fact, that mmapped files cannot be modified or deleted. 
final	TokenNamefinal	
void	TokenNamevoid	
cleanMapping	TokenNameIdentifier	 clean Mapping
(	TokenNameLPAREN	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useUnmapHack	TokenNameIdentifier	 use Unmap Hack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedExceptionAction	TokenNameIdentifier	 Privileged Exception Action
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
getCleanerMethod	TokenNameIdentifier	 get Cleaner Method
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"cleaner"	TokenNameStringLiteral	cleaner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getCleanerMethod	TokenNameIdentifier	 get Cleaner Method
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
cleaner	TokenNameIdentifier	 cleaner
=	TokenNameEQUAL	
getCleanerMethod	TokenNameIdentifier	 get Cleaner Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cleaner	TokenNameIdentifier	 cleaner
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleaner	TokenNameIdentifier	 cleaner
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"clean"	TokenNameStringLiteral	clean
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
cleaner	TokenNameIdentifier	 cleaner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
PrivilegedActionException	TokenNameIdentifier	 Privileged Action Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unable to unmap the mapped buffer"	TokenNameStringLiteral	unable to unmap the mapped buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the maximum chunk size (default is 1 GiBytes for * 64 bit JVMs and 256 MiBytes for 32 bit JVMs) used for memory mapping. * Especially on 32 bit platform, the address space can be very fragmented, * so large index files cannot be mapped. * Using a lower chunk size makes the directory implementation a little * bit slower (as the correct chunk may be resolved on lots of seeks) * but the chance is higher that mmap does not fail. On 64 bit * Java platforms, this parameter should always be {@code 1 << 30}, * as the address space is big enough. * <b>Please note:</b> This method always rounds down the chunk size * to a power of 2. */	TokenNameCOMMENT_JAVADOC	 Sets the maximum chunk size (default is 1 GiBytes for 64 bit JVMs and 256 MiBytes for 32 bit JVMs) used for memory mapping. Especially on 32 bit platform, the address space can be very fragmented, so large index files cannot be mapped. Using a lower chunk size makes the directory implementation a little bit slower (as the correct chunk may be resolved on lots of seeks) but the chance is higher that mmap does not fail. On 64 bit Java platforms, this parameter should always be {@code 1 << 30}, as the address space is big enough. <b>Please note:</b> This method always rounds down the chunk size to a power of 2. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setMaxChunkSize	TokenNameIdentifier	 set Max Chunk Size
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
maxChunkSize	TokenNameIdentifier	 max Chunk Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxChunkSize	TokenNameIdentifier	 max Chunk Size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Maximum chunk size for mmap must be >0"	TokenNameStringLiteral	Maximum chunk size for mmap must be >0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Requested chunk size: "+maxChunkSize); 	TokenNameCOMMENT_LINE	System.out.println("Requested chunk size: "+maxChunkSize); 
this	TokenNamethis	
.	TokenNameDOT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
-	TokenNameMINUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
maxChunkSize	TokenNameIdentifier	 max Chunk Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
this	TokenNamethis	
.	TokenNameDOT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
<=	TokenNameLESS_EQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("Got chunk size: "+getMaxChunkSize()); 	TokenNameCOMMENT_LINE	System.out.println("Got chunk size: "+getMaxChunkSize()); 
}	TokenNameRBRACE	
/** * Returns the current mmap chunk size. * @see #setMaxChunkSize */	TokenNameCOMMENT_JAVADOC	 Returns the current mmap chunk size. @see #setMaxChunkSize 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getMaxChunkSize	TokenNameIdentifier	 get Max Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
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
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
(	TokenNameLPAREN	
"MMapIndexInput(path=""	TokenNameStringLiteral	MMapIndexInput(path="
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Because Java's ByteBuffer uses an int to address the 	TokenNameCOMMENT_LINE	Because Java's ByteBuffer uses an int to address the 
// values, it's necessary to access a file > 	TokenNameCOMMENT_LINE	values, it's necessary to access a file > 
// Integer.MAX_VALUE in size using multiple byte buffers. 	TokenNameCOMMENT_LINE	Integer.MAX_VALUE in size using multiple byte buffers. 
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
extends	TokenNameextends	
IndexInput	TokenNameIdentifier	 Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffers	TokenNameIdentifier	 buffers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
chunkSizeMask	TokenNameIdentifier	 chunk Size Mask
,	TokenNameCOMMA	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curBufIndex	TokenNameIdentifier	 cur Buf Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
curBuf	TokenNameIdentifier	 cur Buf
;	TokenNameSEMICOLON	
// redundant for speed: buffers[curBufIndex] 	TokenNameCOMMENT_LINE	redundant for speed: buffers[curBufIndex] 
private	TokenNameprivate	
boolean	TokenNameboolean	
isClone	TokenNameIdentifier	 is Clone
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
<	TokenNameLESS	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
clones	TokenNameIdentifier	 clones
=	TokenNameEQUAL	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
.	TokenNameDOT	
newConcurrentHashMap	TokenNameIdentifier	 new Concurrent Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceDescription	TokenNameIdentifier	 resource Description
,	TokenNameCOMMA	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
int	TokenNameint	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
resourceDescription	TokenNameIdentifier	 resource Description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
=	TokenNameEQUAL	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunkSize	TokenNameIdentifier	 chunk Size
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunkSizeMask	TokenNameIdentifier	 chunk Size Mask
=	TokenNameEQUAL	
chunkSize	TokenNameIdentifier	 chunk Size
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
>	TokenNameGREATER	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid chunkSizePower used for ByteBuffer size: "	TokenNameStringLiteral	Invalid chunkSizePower used for ByteBuffer size: 
+	TokenNamePLUS	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"RandomAccessFile too big for chunk size: "	TokenNameStringLiteral	RandomAccessFile too big for chunk size: 
+	TokenNamePLUS	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we always allocate one more buffer, the last one may be a 0 byte one 	TokenNameCOMMENT_LINE	we always allocate one more buffer, the last one may be a 0 byte one 
final	TokenNamefinal	
int	TokenNameint	
nrBuffers	TokenNameIdentifier	 nr Buffers
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("length="+length+", chunkSizePower=" + chunkSizePower + ", chunkSizeMask=" + chunkSizeMask + ", nrBuffers=" + nrBuffers); 	TokenNameCOMMENT_LINE	System.out.println("length="+length+", chunkSizePower=" + chunkSizePower + ", chunkSizeMask=" + chunkSizeMask + ", nrBuffers=" + nrBuffers); 
this	TokenNamethis	
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
nrBuffers	TokenNameIdentifier	 nr Buffers
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bufferStart	TokenNameIdentifier	 buffer Start
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
FileChannel	TokenNameIdentifier	 File Channel
rafc	TokenNameIdentifier	 rafc
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bufNr	TokenNameIdentifier	 buf Nr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufNr	TokenNameIdentifier	 buf Nr
<	TokenNameLESS	
nrBuffers	TokenNameIdentifier	 nr Buffers
;	TokenNameSEMICOLON	
bufNr	TokenNameIdentifier	 buf Nr
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bufSize	TokenNameIdentifier	 buf Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
(	TokenNameLPAREN	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
chunkSize	TokenNameIdentifier	 chunk Size
:	TokenNameCOLON	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferStart	TokenNameIdentifier	 buffer Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufNr	TokenNameIdentifier	 buf Nr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rafc	TokenNameIdentifier	 rafc
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
MapMode	TokenNameIdentifier	 Map Mode
.	TokenNameDOT	
READ_ONLY	TokenNameIdentifier	 READ  ONLY
,	TokenNameCOMMA	
bufferStart	TokenNameIdentifier	 buffer Start
,	TokenNameCOMMA	
bufSize	TokenNameIdentifier	 buf Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
+=	TokenNamePLUS_EQUAL	
bufSize	TokenNameIdentifier	 buf Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
curBufIndex	TokenNameIdentifier	 cur Buf Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curBufIndex	TokenNameIdentifier	 cur Buf Index
>=	TokenNameGREATER_EQUAL	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
curBuf	TokenNameIdentifier	 cur Buf
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
curBufIndex	TokenNameIdentifier	 cur Buf Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
hasRemaining	TokenNameIdentifier	 has Remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
try	TokenNametry	
{	TokenNameLBRACE	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
curAvail	TokenNameIdentifier	 cur Avail
=	TokenNameEQUAL	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
curAvail	TokenNameIdentifier	 cur Avail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
curAvail	TokenNameIdentifier	 cur Avail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
curAvail	TokenNameIdentifier	 cur Avail
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
curAvail	TokenNameIdentifier	 cur Avail
;	TokenNameSEMICOLON	
curBufIndex	TokenNameIdentifier	 cur Buf Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curBufIndex	TokenNameIdentifier	 cur Buf Index
>=	TokenNameGREATER_EQUAL	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
curBuf	TokenNameIdentifier	 cur Buf
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
curBufIndex	TokenNameIdentifier	 cur Buf Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curAvail	TokenNameIdentifier	 cur Avail
=	TokenNameEQUAL	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
short	TokenNameshort	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
curBufIndex	TokenNameIdentifier	 cur Buf Index
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
+	TokenNamePLUS	
curBuf	TokenNameIdentifier	 cur Buf
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// we use >> here to preserve negative, so we will catch AIOOBE: 	TokenNameCOMMENT_LINE	we use >> here to preserve negative, so we will catch AIOOBE: 
final	TokenNamefinal	
int	TokenNameint	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>>	TokenNameRIGHT_SHIFT	
chunkSizePower	TokenNameIdentifier	 chunk Size Power
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bi	TokenNameIdentifier	 bi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
&	TokenNameAND	
chunkSizeMask	TokenNameIdentifier	 chunk Size Mask
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write values, on exception all is unchanged 	TokenNameCOMMENT_LINE	write values, on exception all is unchanged 
this	TokenNamethis	
.	TokenNameDOT	
curBufIndex	TokenNameIdentifier	 cur Buf Index
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
curBuf	TokenNameIdentifier	 cur Buf
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
aioobe	TokenNameIdentifier	 aioobe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Seeking to negative position: "	TokenNameStringLiteral	Seeking to negative position: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"seek past EOF: "	TokenNameStringLiteral	seek past EOF: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Seeking to negative position: "	TokenNameStringLiteral	Seeking to negative position: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"seek past EOF: "	TokenNameStringLiteral	seek past EOF: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"MMapIndexInput already closed: "	TokenNameStringLiteral	MMapIndexInput already closed: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
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
// we keep clone.clones, so it shares the same map with original and we have no additional cost on clones 	TokenNameCOMMENT_LINE	we keep clone.clones, so it shares the same map with original and we have no additional cost on clones 
assert	TokenNameassert	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
clones	TokenNameIdentifier	 clones
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
clones	TokenNameIdentifier	 clones
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
bufNr	TokenNameIdentifier	 buf Nr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufNr	TokenNameIdentifier	 buf Nr
<	TokenNameLESS	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
bufNr	TokenNameIdentifier	 buf Nr
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufNr	TokenNameIdentifier	 buf Nr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufNr	TokenNameIdentifier	 buf Nr
]	TokenNameRBRACKET	
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"Should never happen: "	TokenNameStringLiteral	Should never happen: 
+	TokenNamePLUS	
this	TokenNamethis	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// register the new clone in our clone list to clean it up on closing: 	TokenNameCOMMENT_LINE	register the new clone in our clone list to clean it up on closing: 
this	TokenNamethis	
.	TokenNameDOT	
clones	TokenNameIdentifier	 clones
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
unsetBuffers	TokenNameIdentifier	 unset Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
curBuf	TokenNameIdentifier	 cur Buf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
curBufIndex	TokenNameIdentifier	 cur Buf Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isClone	TokenNameIdentifier	 is Clone
||	TokenNameOR_OR	
buffers	TokenNameIdentifier	 buffers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// make local copy, then un-set early 	TokenNameCOMMENT_LINE	make local copy, then un-set early 
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bufs	TokenNameIdentifier	 bufs
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
;	TokenNameSEMICOLON	
unsetBuffers	TokenNameIdentifier	 unset Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for extra safety unset also all clones' buffers: 	TokenNameCOMMENT_LINE	for extra safety unset also all clones' buffers: 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
clones	TokenNameIdentifier	 clones
.	TokenNameDOT	
keyIterator	TokenNameIdentifier	 key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MMapIndexInput	TokenNameIdentifier	 M Map Index Input
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
isClone	TokenNameIdentifier	 is Clone
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
unsetBuffers	TokenNameIdentifier	 unset Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clones	TokenNameIdentifier	 clones
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
:	TokenNameCOLON	
bufs	TokenNameIdentifier	 bufs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanMapping	TokenNameIdentifier	 clean Mapping
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
unsetBuffers	TokenNameIdentifier	 unset Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
