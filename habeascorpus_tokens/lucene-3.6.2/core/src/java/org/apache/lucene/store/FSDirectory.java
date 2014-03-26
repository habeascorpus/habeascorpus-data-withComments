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
File	TokenNameIdentifier	 File
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
FilenameFilter	TokenNameIdentifier	 Filename Filter
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
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
/** * <a name="subclasses"/> * Base class for Directory implementations that store index * files in the file system. There are currently three core * subclasses: * * <ul> * * <li> {@link SimpleFSDirectory} is a straightforward * implementation using java.io.RandomAccessFile. * However, it has poor concurrent performance * (multiple threads will bottleneck) as it * synchronizes when multiple threads read from the * same file. * * <li> {@link NIOFSDirectory} uses java.nio's * FileChannel's positional io when reading to avoid * synchronization when reading from the same file. * Unfortunately, due to a Windows-only <a * href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6265734">Sun * JRE bug</a> this is a poor choice for Windows, but * on all other platforms this is the preferred * choice. Applications using {@link Thread#interrupt()} or * {@link Future#cancel(boolean)} should use * {@link SimpleFSDirectory} instead. See {@link NIOFSDirectory} java doc * for details. * * * * <li> {@link MMapDirectory} uses memory-mapped IO when * reading. This is a good choice if you have plenty * of virtual memory relative to your index size, eg * if you are running on a 64 bit JRE, or you are * running on a 32 bit JRE but your index sizes are * small enough to fit into the virtual memory space. * Java has currently the limitation of not being able to * unmap files from user code. The files are unmapped, when GC * releases the byte buffers. Due to * <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4724038"> * this bug</a> in Sun's JRE, MMapDirectory's {@link IndexInput#close} * is unable to close the underlying OS file handle. Only when * GC finally collects the underlying objects, which could be * quite some time later, will the file handle be closed. * This will consume additional transient disk usage: on Windows, * attempts to delete or overwrite the files will result in an * exception; on other platforms, which typically have a &quot;delete on * last close&quot; semantics, while such operations will succeed, the bytes * are still consuming space on disk. For many applications this * limitation is not a problem (e.g. if you have plenty of disk space, * and you don't rely on overwriting files on Windows) but it's still * an important limitation to be aware of. This class supplies a * (possibly dangerous) workaround mentioned in the bug report, * which may fail on non-Sun JVMs. * * Applications using {@link Thread#interrupt()} or * {@link Future#cancel(boolean)} should use * {@link SimpleFSDirectory} instead. See {@link MMapDirectory} * java doc for details. * </ul> * * Unfortunately, because of system peculiarities, there is * no single overall best implementation. Therefore, we've * added the {@link #open} method, to allow Lucene to choose * the best FSDirectory implementation given your * environment, and the known limitations of each * implementation. For users who have no reason to prefer a * specific implementation, it's best to simply use {@link * #open}. For all others, you should instantiate the * desired implementation directly. * * <p>The locking implementation is by default {@link * NativeFSLockFactory}, but can be changed by * passing in a custom {@link LockFactory} instance. * * @see Directory */	TokenNameCOMMENT_JAVADOC	 <a name="subclasses"/> Base class for Directory implementations that store index files in the file system. There are currently three core subclasses: * <ul> * <li> {@link SimpleFSDirectory} is a straightforward implementation using java.io.RandomAccessFile. However, it has poor concurrent performance (multiple threads will bottleneck) as it synchronizes when multiple threads read from the same file. * <li> {@link NIOFSDirectory} uses java.nio's FileChannel's positional io when reading to avoid synchronization when reading from the same file. Unfortunately, due to a Windows-only <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6265734">Sun JRE bug</a> this is a poor choice for Windows, but on all other platforms this is the preferred choice. Applications using {@link Thread#interrupt()} or {@link Future#cancel(boolean)} should use {@link SimpleFSDirectory} instead. See {@link NIOFSDirectory} java doc for details. * * <li> {@link MMapDirectory} uses memory-mapped IO when reading. This is a good choice if you have plenty of virtual memory relative to your index size, eg if you are running on a 64 bit JRE, or you are running on a 32 bit JRE but your index sizes are small enough to fit into the virtual memory space. Java has currently the limitation of not being able to unmap files from user code. The files are unmapped, when GC releases the byte buffers. Due to <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4724038"> this bug</a> in Sun's JRE, MMapDirectory's {@link IndexInput#close} is unable to close the underlying OS file handle. Only when GC finally collects the underlying objects, which could be quite some time later, will the file handle be closed. This will consume additional transient disk usage: on Windows, attempts to delete or overwrite the files will result in an exception; on other platforms, which typically have a &quot;delete on last close&quot; semantics, while such operations will succeed, the bytes are still consuming space on disk. For many applications this limitation is not a problem (e.g. if you have plenty of disk space, and you don't rely on overwriting files on Windows) but it's still an important limitation to be aware of. This class supplies a (possibly dangerous) workaround mentioned in the bug report, which may fail on non-Sun JVMs. * Applications using {@link Thread#interrupt()} or {@link Future#cancel(boolean)} should use {@link SimpleFSDirectory} instead. See {@link MMapDirectory} java doc for details. </ul> * Unfortunately, because of system peculiarities, there is no single overall best implementation. Therefore, we've added the {@link #open} method, to allow Lucene to choose the best FSDirectory implementation given your environment, and the known limitations of each implementation. For users who have no reason to prefer a specific implementation, it's best to simply use {@link #open}. For all others, you should instantiate the desired implementation directly. * <p>The locking implementation is by default {@link NativeFSLockFactory}, but can be changed by passing in a custom {@link LockFactory} instance. * @see Directory 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FSDirectory	TokenNameIdentifier	 FS Directory
extends	TokenNameextends	
Directory	TokenNameIdentifier	 Directory
{	TokenNameLBRACE	
/** * Default read chunk size. This is a conditional default: on 32bit JVMs, it defaults to 100 MB. On 64bit JVMs, it's * <code>Integer.MAX_VALUE</code>. * * @see #setReadChunkSize */	TokenNameCOMMENT_JAVADOC	 Default read chunk size. This is a conditional default: on 32bit JVMs, it defaults to 100 MB. On 64bit JVMs, it's <code>Integer.MAX_VALUE</code>. * @see #setReadChunkSize 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_READ_CHUNK_SIZE	TokenNameIdentifier	 DEFAULT  READ  CHUNK  SIZE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
100	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
// The underlying filesystem directory 	TokenNameCOMMENT_LINE	The underlying filesystem directory 
protected	TokenNameprotected	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
staleFiles	TokenNameIdentifier	 stale Files
=	TokenNameEQUAL	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Files written, but not yet sync'ed 	TokenNameCOMMENT_LINE	Files written, but not yet sync'ed 
private	TokenNameprivate	
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
=	TokenNameEQUAL	
DEFAULT_READ_CHUNK_SIZE	TokenNameIdentifier	 DEFAULT  READ  CHUNK  SIZE
;	TokenNameSEMICOLON	
// LUCENE-1566 	TokenNameCOMMENT_LINE	LUCENE-1566 
// returns the canonical version of the directory, creating it if it doesn't exist. 	TokenNameCOMMENT_LINE	returns the canonical version of the directory, creating it if it doesn't exist. 
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new FSDirectory for the named location (ctor for subclasses). * @param path the path of the directory * @param lockFactory the lock factory to use, or null for the default * ({@link NativeFSLockFactory}); * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new FSDirectory for the named location (ctor for subclasses). @param path the path of the directory @param lockFactory the lock factory to use, or null for the default ({@link NativeFSLockFactory}); @throws IOException 
protected	TokenNameprotected	
FSDirectory	TokenNameIdentifier	 FS Directory
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
// new ctors use always NativeFSLockFactory as default: 	TokenNameCOMMENT_LINE	new ctors use always NativeFSLockFactory as default: 
if	TokenNameif	
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockFactory	TokenNameIdentifier	 lock Factory
=	TokenNameEQUAL	
new	TokenNamenew	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchDirectoryException	TokenNameIdentifier	 No Such Directory Exception
(	TokenNameLPAREN	
"file '"	TokenNameStringLiteral	file '
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
+	TokenNamePLUS	
"' exists but is not a directory"	TokenNameStringLiteral	' exists but is not a directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLockFactory	TokenNameIdentifier	 set Lock Factory
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates an FSDirectory instance, trying to pick the * best implementation given the current environment. * The directory returned uses the {@link NativeFSLockFactory}. * * <p>Currently this returns {@link MMapDirectory} for most Solaris * and Windows 64-bit JREs, {@link NIOFSDirectory} for other * non-Windows JREs, and {@link SimpleFSDirectory} for other * JREs on Windows. It is highly recommended that you consult the * implementation's documentation for your platform before * using this method. * * <p><b>NOTE</b>: this method may suddenly change which * implementation is returned from release to release, in * the event that higher performance defaults become * possible; if the precise implementation is important to * your application, please instantiate it directly, * instead. For optimal performance you should consider using * {@link MMapDirectory} on 64 bit JVMs. * * <p>See <a href="#subclasses">above</a> */	TokenNameCOMMENT_JAVADOC	 Creates an FSDirectory instance, trying to pick the best implementation given the current environment. The directory returned uses the {@link NativeFSLockFactory}. * <p>Currently this returns {@link MMapDirectory} for most Solaris and Windows 64-bit JREs, {@link NIOFSDirectory} for other non-Windows JREs, and {@link SimpleFSDirectory} for other JREs on Windows. It is highly recommended that you consult the implementation's documentation for your platform before using this method. * <p><b>NOTE</b>: this method may suddenly change which implementation is returned from release to release, in the event that higher performance defaults become possible; if the precise implementation is important to your application, please instantiate it directly, instead. For optimal performance you should consider using {@link MMapDirectory} on 64 bit JVMs. * <p>See <a href="#subclasses">above</a> 
public	TokenNamepublic	
static	TokenNamestatic	
FSDirectory	TokenNameIdentifier	 FS Directory
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Just like {@link #open(File)}, but allows you to * also specify a custom {@link LockFactory}. */	TokenNameCOMMENT_JAVADOC	 Just like {@link #open(File)}, but allows you to also specify a custom {@link LockFactory}. 
public	TokenNamepublic	
static	TokenNamestatic	
FSDirectory	TokenNameIdentifier	 FS Directory
open	TokenNameIdentifier	 open
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
WINDOWS	TokenNameIdentifier	 WINDOWS
||	TokenNameOR_OR	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SUN_OS	TokenNameIdentifier	 SUN  OS
||	TokenNameOR_OR	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LINUX	TokenNameIdentifier	 LINUX
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
&&	TokenNameAND_AND	
MMapDirectory	TokenNameIdentifier	 M Map Directory
.	TokenNameDOT	
UNMAP_SUPPORTED	TokenNameIdentifier	 UNMAP  SUPPORTED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MMapDirectory	TokenNameIdentifier	 M Map Directory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
WINDOWS	TokenNameIdentifier	 WINDOWS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NIOFSDirectory	TokenNameIdentifier	 NIOFS Directory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setLockFactory	TokenNameIdentifier	 set Lock Factory
(	TokenNameLPAREN	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setLockFactory	TokenNameIdentifier	 set Lock Factory
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for filesystem based LockFactory, delete the lockPrefix, if the locks are placed 	TokenNameCOMMENT_LINE	for filesystem based LockFactory, delete the lockPrefix, if the locks are placed 
// in index dir. If no index dir is given, set ourselves 	TokenNameCOMMENT_LINE	in index dir. If no index dir is given, set ourselves 
if	TokenNameif	
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
instanceof	TokenNameinstanceof	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
lf	TokenNameIdentifier	 lf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
)	TokenNameRPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
;	TokenNameSEMICOLON	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
lf	TokenNameIdentifier	 lf
.	TokenNameDOT	
getLockDir	TokenNameIdentifier	 get Lock Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the lock factory has no lockDir set, use the this directory as lockDir 	TokenNameCOMMENT_LINE	if the lock factory has no lockDir set, use the this directory as lockDir 
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lf	TokenNameIdentifier	 lf
.	TokenNameDOT	
setLockDir	TokenNameIdentifier	 set Lock Dir
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lf	TokenNameIdentifier	 lf
.	TokenNameDOT	
setLockPrefix	TokenNameIdentifier	 set Lock Prefix
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lf	TokenNameIdentifier	 lf
.	TokenNameDOT	
setLockPrefix	TokenNameIdentifier	 set Lock Prefix
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Lists all files (not subdirectories) in the * directory. This method never returns null (throws * {@link IOException} instead). * * @throws NoSuchDirectoryException if the directory * does not exist, or does exist but is not a * directory. * @throws IOException if list() returns null */	TokenNameCOMMENT_JAVADOC	 Lists all files (not subdirectories) in the directory. This method never returns null (throws {@link IOException} instead). * @throws NoSuchDirectoryException if the directory does not exist, or does exist but is not a directory. @throws IOException if list() returns null 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchDirectoryException	TokenNameIdentifier	 No Such Directory Exception
(	TokenNameLPAREN	
"directory '"	TokenNameStringLiteral	directory '
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"' does not exist"	TokenNameStringLiteral	' does not exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchDirectoryException	TokenNameIdentifier	 No Such Directory Exception
(	TokenNameLPAREN	
"file '"	TokenNameStringLiteral	file '
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"' exists but is not a directory"	TokenNameStringLiteral	' exists but is not a directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Exclude subdirs 	TokenNameCOMMENT_LINE	Exclude subdirs 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
new	TokenNamenew	
FilenameFilter	TokenNameIdentifier	 Filename Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"directory '"	TokenNameStringLiteral	directory '
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"' exists and is a directory, but cannot be listed: list() returned null"	TokenNameStringLiteral	' exists and is a directory, but cannot be listed: list() returned null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Lists all files (not subdirectories) in the * directory. * @see #listAll(File) */	TokenNameCOMMENT_JAVADOC	 Lists all files (not subdirectories) in the directory. @see #listAll(File) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true iff a file with the given name exists. */	TokenNameCOMMENT_JAVADOC	 Returns true iff a file with the given name exists. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
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
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the time the named file was last modified. */	TokenNameCOMMENT_JAVADOC	 Returns the time the named file was last modified. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
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
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the time the named file was last modified. */	TokenNameCOMMENT_JAVADOC	 Returns the time the named file was last modified. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
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
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the modified time of an existing file to now. * @deprecated Lucene never uses this API; it will be * removed in 4.0. */	TokenNameCOMMENT_JAVADOC	 Set the modified time of an existing file to now. @deprecated Lucene never uses this API; it will be removed in 4.0. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the length in bytes of a file in the directory. */	TokenNameCOMMENT_JAVADOC	 Returns the length in bytes of a file in the directory. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
fileLength	TokenNameIdentifier	 file Length
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
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Removes an existing file in the directory. */	TokenNameCOMMENT_JAVADOC	 Removes an existing file in the directory. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
deleteFile	TokenNameIdentifier	 delete File
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
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot delete "	TokenNameStringLiteral	Cannot delete 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
staleFiles	TokenNameIdentifier	 stale Files
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates an IndexOutput for the file with the given name. */	TokenNameCOMMENT_JAVADOC	 Creates an IndexOutput for the file with the given name. 
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
FSIndexOutput	TokenNameIdentifier	 FS Index Output
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
ensureCanWrite	TokenNameIdentifier	 ensure Can Write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot create directory: "	TokenNameStringLiteral	Cannot create directory: 
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// delete existing, if any 	TokenNameCOMMENT_LINE	delete existing, if any 
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot overwrite: "	TokenNameStringLiteral	Cannot overwrite: 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
onIndexOutputClosed	TokenNameIdentifier	 on Index Output Closed
(	TokenNameLPAREN	
FSIndexOutput	TokenNameIdentifier	 FS Index Output
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
{	TokenNameLBRACE	
staleFiles	TokenNameIdentifier	 stale Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
toSync	TokenNameIdentifier	 to Sync
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toSync	TokenNameIdentifier	 to Sync
.	TokenNameDOT	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
staleFiles	TokenNameIdentifier	 stale Files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
toSync	TokenNameIdentifier	 to Sync
)	TokenNameRPAREN	
fsync	TokenNameIdentifier	 fsync
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
staleFiles	TokenNameIdentifier	 stale Files
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
toSync	TokenNameIdentifier	 to Sync
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Inherit javadoc 	TokenNameCOMMENT_LINE	Inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexInput	TokenNameIdentifier	 Index Input
openInput	TokenNameIdentifier	 open Input
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
return	TokenNamereturn	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLockID	TokenNameIdentifier	 get Lock ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dirName	TokenNameIdentifier	 dir Name
;	TokenNameSEMICOLON	
// name to be hashed 	TokenNameCOMMENT_LINE	name to be hashed 
try	TokenNametry	
{	TokenNameLBRACE	
dirName	TokenNameIdentifier	 dir Name
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
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
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
charIDX	TokenNameIdentifier	 char IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
charIDX	TokenNameIdentifier	 char IDX
<	TokenNameLESS	
dirName	TokenNameIdentifier	 dir Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charIDX	TokenNameIdentifier	 char IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
dirName	TokenNameIdentifier	 dir Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIDX	TokenNameIdentifier	 char IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
digest	TokenNameIdentifier	 digest
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"lucene-"	TokenNameStringLiteral	lucene-
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Closes the store to future operations. */	TokenNameCOMMENT_JAVADOC	 Closes the store to future operations. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Use {@link #getDirectory} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link #getDirectory} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the underlying filesystem directory */	TokenNameCOMMENT_JAVADOC	 @return the underlying filesystem directory 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** For debug output. */	TokenNameCOMMENT_JAVADOC	 For debug output. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
directory	TokenNameIdentifier	 directory
+	TokenNamePLUS	
" lockFactory="	TokenNameStringLiteral	 lockFactory=
+	TokenNamePLUS	
getLockFactory	TokenNameIdentifier	 get Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the maximum number of bytes read at once from the * underlying file during {@link IndexInput#readBytes}. * The default value is {@link #DEFAULT_READ_CHUNK_SIZE}; * * <p> This was introduced due to <a * href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6478546">Sun * JVM Bug 6478546</a>, which throws an incorrect * OutOfMemoryError when attempting to read too many bytes * at once. It only happens on 32bit JVMs with a large * maximum heap size.</p> * * <p>Changes to this value will not impact any * already-opened {@link IndexInput}s. You should call * this before attempting to open an index on the * directory.</p> * * <p> <b>NOTE</b>: This value should be as large as * possible to reduce any possible performance impact. If * you still encounter an incorrect OutOfMemoryError, * trying lowering the chunk size.</p> */	TokenNameCOMMENT_JAVADOC	 Sets the maximum number of bytes read at once from the underlying file during {@link IndexInput#readBytes}. The default value is {@link #DEFAULT_READ_CHUNK_SIZE}; * <p> This was introduced due to <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6478546">Sun JVM Bug 6478546</a>, which throws an incorrect OutOfMemoryError when attempting to read too many bytes at once. It only happens on 32bit JVMs with a large maximum heap size.</p> * <p>Changes to this value will not impact any already-opened {@link IndexInput}s. You should call this before attempting to open an index on the directory.</p> * <p> <b>NOTE</b>: This value should be as large as possible to reduce any possible performance impact. If you still encounter an incorrect OutOfMemoryError, trying lowering the chunk size.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setReadChunkSize	TokenNameIdentifier	 set Read Chunk Size
(	TokenNameLPAREN	
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-1566 	TokenNameCOMMENT_LINE	LUCENE-1566 
if	TokenNameif	
(	TokenNameLPAREN	
chunkSize	TokenNameIdentifier	 chunk Size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"chunkSize must be positive"	TokenNameStringLiteral	chunkSize must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chunkSize	TokenNameIdentifier	 chunk Size
=	TokenNameEQUAL	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The maximum number of bytes to read at once from the * underlying file during {@link IndexInput#readBytes}. * @see #setReadChunkSize */	TokenNameCOMMENT_JAVADOC	 The maximum number of bytes to read at once from the underlying file during {@link IndexInput#readBytes}. @see #setReadChunkSize 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getReadChunkSize	TokenNameIdentifier	 get Read Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-1566 	TokenNameCOMMENT_LINE	LUCENE-1566 
return	TokenNamereturn	
chunkSize	TokenNameIdentifier	 chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FSIndexOutput	TokenNameIdentifier	 FS Index Output
extends	TokenNameextends	
BufferedIndexOutput	TokenNameIdentifier	 Buffered Index Output
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FSDirectory	TokenNameIdentifier	 FS Directory
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RandomAccessFile	TokenNameIdentifier	 Random Access File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
;	TokenNameSEMICOLON	
// remember if the file is open, so that we don't try to close it more than once 	TokenNameCOMMENT_LINE	remember if the file is open, so that we don't try to close it more than once 
public	TokenNamepublic	
FSIndexOutput	TokenNameIdentifier	 FS Index Output
(	TokenNameLPAREN	
FSDirectory	TokenNameIdentifier	 FS Directory
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** output methods: */	TokenNameCOMMENT_JAVADOC	 output methods: 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flushBuffer	TokenNameIdentifier	 flush Buffer
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
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
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
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
onIndexOutputClosed	TokenNameIdentifier	 on Index Output Closed
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only close the file if it has not been closed yet 	TokenNameCOMMENT_LINE	only close the file if it has not been closed yet 
if	TokenNameif	
(	TokenNameLPAREN	
isOpen	TokenNameIdentifier	 is Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
// Suppress so we don't mask original exception 	TokenNameCOMMENT_LINE	Suppress so we don't mask original exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
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
}	TokenNameRBRACE	
/** Random-access methods */	TokenNameCOMMENT_JAVADOC	 Random-access methods 
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
super	TokenNamesuper	
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
long	TokenNamelong	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fsync	TokenNameIdentifier	 fsync
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
fullFile	TokenNameIdentifier	 full File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
retryCount	TokenNameIdentifier	 retry Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
IOException	TokenNameIdentifier	 IO Exception
exc	TokenNameIdentifier	 exc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
&&	TokenNameAND_AND	
retryCount	TokenNameIdentifier	 retry Count
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retryCount	TokenNameIdentifier	 retry Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
RandomAccessFile	TokenNameIdentifier	 Random Access File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
fullFile	TokenNameIdentifier	 full File
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
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
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
exc	TokenNameIdentifier	 exc
=	TokenNameEQUAL	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Pause 5 msec 	TokenNameCOMMENT_LINE	Pause 5 msec 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ThreadInterruptedException	TokenNameIdentifier	 Thread Interrupted Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
// Throw original exception 	TokenNameCOMMENT_LINE	Throw original exception 
throw	TokenNamethrow	
exc	TokenNameIdentifier	 exc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
