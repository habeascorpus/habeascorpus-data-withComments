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
FileLock	TokenNameIdentifier	 File Lock
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
/** * <p>Implements {@link LockFactory} using native OS file * locks. Note that because this LockFactory relies on * java.nio.* APIs for locking, any problems with those APIs * will cause locking to fail. Specifically, on certain NFS * environments the java.nio.* locks will fail (the lock can * incorrectly be double acquired) whereas {@link * SimpleFSLockFactory} worked perfectly in those same * environments. For NFS based access to an index, it's * recommended that you try {@link SimpleFSLockFactory} * first and work around the one limitation that a lock file * could be left when the JVM exits abnormally.</p> * * <p>The primary benefit of {@link NativeFSLockFactory} is * that lock files will be properly removed (by the OS) if * the JVM has an abnormal exit.</p> * * <p>Note that, unlike {@link SimpleFSLockFactory}, the existence of * leftover lock files in the filesystem on exiting the JVM * is fine because the OS will free the locks held against * these files even though the files still remain.</p> * * <p>If you suspect that this or any other LockFactory is * not working properly in your environment, you can easily * test it by using {@link VerifyingLockFactory}, {@link * LockVerifyServer} and {@link LockStressTest}.</p> * * @see LockFactory */	TokenNameCOMMENT_JAVADOC	 <p>Implements {@link LockFactory} using native OS file locks. Note that because this LockFactory relies on java.nio.* APIs for locking, any problems with those APIs will cause locking to fail. Specifically, on certain NFS environments the java.nio.* locks will fail (the lock can incorrectly be double acquired) whereas {@link SimpleFSLockFactory} worked perfectly in those same environments. For NFS based access to an index, it's recommended that you try {@link SimpleFSLockFactory} first and work around the one limitation that a lock file could be left when the JVM exits abnormally.</p> * <p>The primary benefit of {@link NativeFSLockFactory} is that lock files will be properly removed (by the OS) if the JVM has an abnormal exit.</p> * <p>Note that, unlike {@link SimpleFSLockFactory}, the existence of leftover lock files in the filesystem on exiting the JVM is fine because the OS will free the locks held against these files even though the files still remain.</p> * <p>If you suspect that this or any other LockFactory is not working properly in your environment, you can easily test it by using {@link VerifyingLockFactory}, {@link LockVerifyServer} and {@link LockStressTest}.</p> * @see LockFactory 
public	TokenNamepublic	
class	TokenNameclass	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
extends	TokenNameextends	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
{	TokenNameLBRACE	
/** * Create a NativeFSLockFactory instance, with null (unset) * lock directory. When you pass this factory to a {@link FSDirectory} * subclass, the lock directory is automatically set to the * directory itself. Be sure to create one instance for each directory * your create! */	TokenNameCOMMENT_JAVADOC	 Create a NativeFSLockFactory instance, with null (unset) lock directory. When you pass this factory to a {@link FSDirectory} subclass, the lock directory is automatically set to the directory itself. Be sure to create one instance for each directory your create! 
public	TokenNamepublic	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NativeFSLockFactory instance, storing lock * files into the specified lockDirName: * * @param lockDirName where lock files are created. */	TokenNameCOMMENT_JAVADOC	 Create a NativeFSLockFactory instance, storing lock files into the specified lockDirName: * @param lockDirName where lock files are created. 
public	TokenNamepublic	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockDirName	TokenNameIdentifier	 lock Dir Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
lockDirName	TokenNameIdentifier	 lock Dir Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NativeFSLockFactory instance, storing lock * files into the specified lockDir: * * @param lockDir where lock files are created. */	TokenNameCOMMENT_JAVADOC	 Create a NativeFSLockFactory instance, storing lock files into the specified lockDir: * @param lockDir where lock files are created. 
public	TokenNamepublic	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setLockDir	TokenNameIdentifier	 set Lock Dir
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Lock	TokenNameIdentifier	 Lock
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lockPrefix	TokenNameIdentifier	 lock Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
lockName	TokenNameIdentifier	 lock Name
=	TokenNameEQUAL	
lockPrefix	TokenNameIdentifier	 lock Prefix
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
lockName	TokenNameIdentifier	 lock Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
NativeFSLock	TokenNameIdentifier	 Native FS Lock
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
,	TokenNameCOMMA	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Note that this isn't strictly required anymore 	TokenNameCOMMENT_LINE	Note that this isn't strictly required anymore 
// because the existence of these files does not mean 	TokenNameCOMMENT_LINE	because the existence of these files does not mean 
// they are locked, but, still do this in case people 	TokenNameCOMMENT_LINE	they are locked, but, still do this in case people 
// really want to see the files go away: 	TokenNameCOMMENT_LINE	really want to see the files go away: 
if	TokenNameif	
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Try to release the lock first - if it's held by another process, this 	TokenNameCOMMENT_LINE	Try to release the lock first - if it's held by another process, this 
// method should not silently fail. 	TokenNameCOMMENT_LINE	method should not silently fail. 
// NOTE: makeLock fixes the lock name by prefixing it w/ lockPrefix. 	TokenNameCOMMENT_LINE	NOTE: makeLock fixes the lock name by prefixing it w/ lockPrefix. 
// Therefore it should be called before the code block next which prefixes 	TokenNameCOMMENT_LINE	Therefore it should be called before the code block next which prefixes 
// the given name. 	TokenNameCOMMENT_LINE	the given name. 
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lockPrefix	TokenNameIdentifier	 lock Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockName	TokenNameIdentifier	 lock Name
=	TokenNameEQUAL	
lockPrefix	TokenNameIdentifier	 lock Prefix
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
lockName	TokenNameIdentifier	 lock Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// As mentioned above, we don't care if the deletion of the file failed. 	TokenNameCOMMENT_LINE	As mentioned above, we don't care if the deletion of the file failed. 
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
,	TokenNameCOMMA	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
NativeFSLock	TokenNameIdentifier	 Native FS Lock
extends	TokenNameextends	
Lock	TokenNameIdentifier	 Lock
{	TokenNameLBRACE	
private	TokenNameprivate	
RandomAccessFile	TokenNameIdentifier	 Random Access File
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileChannel	TokenNameIdentifier	 File Channel
channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileLock	TokenNameIdentifier	 File Lock
lock	TokenNameIdentifier	 lock
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
;	TokenNameSEMICOLON	
/* * The javadocs for FileChannel state that you should have * a single instance of a FileChannel (per JVM) for all * locking against a given file (locks are tracked per * FileChannel instance in Java 1.4/1.5). Even using the same * FileChannel instance is not completely thread-safe with Java * 1.4/1.5 though. To work around this, we have a single (static) * HashSet that contains the file paths of all currently * locked locks. This protects against possible cases * where different Directory instances in one JVM (each * with their own NativeFSLockFactory instance) have set * the same lock dir and lock prefix. However, this will not * work when LockFactorys are created by different * classloaders (eg multiple webapps). * * TODO: Java 1.6 tracks system wide locks in a thread safe manner * (same FileChannel instance or not), so we may want to * change this when Lucene moves to Java 1.6. */	TokenNameCOMMENT_BLOCK	 The javadocs for FileChannel state that you should have a single instance of a FileChannel (per JVM) for all locking against a given file (locks are tracked per FileChannel instance in Java 1.4/1.5). Even using the same FileChannel instance is not completely thread-safe with Java 1.4/1.5 though. To work around this, we have a single (static) HashSet that contains the file paths of all currently locked locks. This protects against possible cases where different Directory instances in one JVM (each with their own NativeFSLockFactory instance) have set the same lock dir and lock prefix. However, this will not work when LockFactorys are created by different classloaders (eg multiple webapps). * TODO: Java 1.6 tracks system wide locks in a thread safe manner (same FileChannel instance or not), so we may want to change this when Lucene moves to Java 1.6. 
private	TokenNameprivate	
static	TokenNamestatic	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NativeFSLock	TokenNameIdentifier	 Native FS Lock
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lockFileName	TokenNameIdentifier	 lock File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lockDir	TokenNameIdentifier	 lock Dir
=	TokenNameEQUAL	
lockDir	TokenNameIdentifier	 lock Dir
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
,	TokenNameCOMMA	
lockFileName	TokenNameIdentifier	 lock File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
lockExists	TokenNameIdentifier	 lock Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lock	TokenNameIdentifier	 lock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lockExists	TokenNameIdentifier	 lock Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Our instance is already locked: 	TokenNameCOMMENT_LINE	Our instance is already locked: 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Ensure that lockDir exists and is a directory. 	TokenNameCOMMENT_LINE	Ensure that lockDir exists and is a directory. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lockDir	TokenNameIdentifier	 lock Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lockDir	TokenNameIdentifier	 lock Dir
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
lockDir	TokenNameIdentifier	 lock Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lockDir	TokenNameIdentifier	 lock Dir
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: NoSuchDirectoryException instead? 	TokenNameCOMMENT_LINE	TODO: NoSuchDirectoryException instead? 
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Found regular file where directory expected: "	TokenNameStringLiteral	Found regular file where directory expected: 
+	TokenNamePLUS	
lockDir	TokenNameIdentifier	 lock Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
canonicalPath	TokenNameIdentifier	 canonical Path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
markedHeld	TokenNameIdentifier	 marked Held
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Make sure nobody else in-process has this lock held 	TokenNameCOMMENT_LINE	Make sure nobody else in-process has this lock held 
// already, and, mark it held if not: 	TokenNameCOMMENT_LINE	already, and, mark it held if not: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
canonicalPath	TokenNameIdentifier	 canonical Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Someone else in this JVM already has the lock: 	TokenNameCOMMENT_LINE	Someone else in this JVM already has the lock: 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This "reserves" the fact that we are the one 	TokenNameCOMMENT_LINE	This "reserves" the fact that we are the one 
// thread trying to obtain this lock, so we own 	TokenNameCOMMENT_LINE	thread trying to obtain this lock, so we own 
// the only instance of a channel against this 	TokenNameCOMMENT_LINE	the only instance of a channel against this 
// file: 	TokenNameCOMMENT_LINE	file: 
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
canonicalPath	TokenNameIdentifier	 canonical Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
markedHeld	TokenNameIdentifier	 marked Held
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
"rw"	TokenNameStringLiteral	rw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// On Windows, we can get intermittent "Access 	TokenNameCOMMENT_LINE	On Windows, we can get intermittent "Access 
// Denied" here. So, we treat this as failure to 	TokenNameCOMMENT_LINE	Denied" here. So, we treat this as failure to 
// acquire the lock, but, store the reason in case 	TokenNameCOMMENT_LINE	acquire the lock, but, store the reason in case 
// there is in fact a real error case. 	TokenNameCOMMENT_LINE	there is in fact a real error case. 
failureReason	TokenNameIdentifier	 failure Reason
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
lock	TokenNameIdentifier	 lock
=	TokenNameEQUAL	
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
tryLock	TokenNameIdentifier	 try Lock
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
// At least on OS X, we will sometimes get an 	TokenNameCOMMENT_LINE	At least on OS X, we will sometimes get an 
// intermittent "Permission Denied" IOException, 	TokenNameCOMMENT_LINE	intermittent "Permission Denied" IOException, 
// which seems to simply mean "you failed to get 	TokenNameCOMMENT_LINE	which seems to simply mean "you failed to get 
// the lock". But other IOExceptions could be 	TokenNameCOMMENT_LINE	the lock". But other IOExceptions could be 
// "permanent" (eg, locking is not supported via 	TokenNameCOMMENT_LINE	"permanent" (eg, locking is not supported via 
// the filesystem). So, we record the failure 	TokenNameCOMMENT_LINE	the filesystem). So, we record the failure 
// reason here; the timeout obtain (usually the 	TokenNameCOMMENT_LINE	reason here; the timeout obtain (usually the 
// one calling us) will use this as "root cause" 	TokenNameCOMMENT_LINE	one calling us) will use this as "root cause" 
// if it fails to get the lock. 	TokenNameCOMMENT_LINE	if it fails to get the lock. 
failureReason	TokenNameIdentifier	 failure Reason
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
channel	TokenNameIdentifier	 channel
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markedHeld	TokenNameIdentifier	 marked Held
&&	TokenNameAND_AND	
!	TokenNameNOT	
lockExists	TokenNameIdentifier	 lock Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
canonicalPath	TokenNameIdentifier	 canonical Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
canonicalPath	TokenNameIdentifier	 canonical Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lockExists	TokenNameIdentifier	 lock Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lockExists	TokenNameIdentifier	 lock Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
lock	TokenNameIdentifier	 lock
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lock	TokenNameIdentifier	 lock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOCK_HELD	TokenNameIdentifier	 LOCK  HELD
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// LUCENE-2421: we don't care anymore if the file cannot be deleted 	TokenNameCOMMENT_LINE	LUCENE-2421: we don't care anymore if the file cannot be deleted 
// because it's held up by another process (e.g. AntiVirus). NativeFSLock 	TokenNameCOMMENT_LINE	because it's held up by another process (e.g. AntiVirus). NativeFSLock 
// does not depend on the existence/absence of the lock file 	TokenNameCOMMENT_LINE	does not depend on the existence/absence of the lock file 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if we don't hold the lock, and somebody still called release(), for 	TokenNameCOMMENT_LINE	if we don't hold the lock, and somebody still called release(), for 
// example as a result of calling IndexWriter.unlock(), we should attempt 	TokenNameCOMMENT_LINE	example as a result of calling IndexWriter.unlock(), we should attempt 
// to obtain the lock and release it. If the obtain fails, it means the 	TokenNameCOMMENT_LINE	to obtain the lock and release it. If the obtain fails, it means the 
// lock cannot be released, and we should throw a proper exception rather 	TokenNameCOMMENT_LINE	lock cannot be released, and we should throw a proper exception rather 
// than silently failing/not doing anything. 	TokenNameCOMMENT_LINE	than silently failing/not doing anything. 
boolean	TokenNameboolean	
obtained	TokenNameIdentifier	 obtained
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obtained	TokenNameIdentifier	 obtained
=	TokenNameEQUAL	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LockReleaseFailedException	TokenNameIdentifier	 Lock Release Failed Exception
(	TokenNameLPAREN	
"Cannot forcefully unlock a NativeFSLock which is held by another indexer component: "	TokenNameStringLiteral	Cannot forcefully unlock a NativeFSLock which is held by another indexer component: 
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obtained	TokenNameIdentifier	 obtained
)	TokenNameRPAREN	
{	TokenNameLBRACE	
release	TokenNameIdentifier	 release
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
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isLocked	TokenNameIdentifier	 is Locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The test for is isLocked is not directly possible with native file locks: 	TokenNameCOMMENT_LINE	The test for is isLocked is not directly possible with native file locks: 
// First a shortcut, if a lock reference in this instance is available 	TokenNameCOMMENT_LINE	First a shortcut, if a lock reference in this instance is available 
if	TokenNameif	
(	TokenNameLPAREN	
lockExists	TokenNameIdentifier	 lock Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Look if lock file is present; if not, there can definitely be no lock! 	TokenNameCOMMENT_LINE	Look if lock file is present; if not, there can definitely be no lock! 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Try to obtain and release (if was locked) the lock 	TokenNameCOMMENT_LINE	Try to obtain and release (if was locked) the lock 
try	TokenNametry	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
obtained	TokenNameIdentifier	 obtained
=	TokenNameEQUAL	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obtained	TokenNameIdentifier	 obtained
)	TokenNameRPAREN	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
obtained	TokenNameIdentifier	 obtained
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"NativeFSLock@"	TokenNameStringLiteral	NativeFSLock@
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
