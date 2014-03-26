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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * <p>Implements {@link LockFactory} using {@link * File#createNewFile()}.</p> * * <p><b>NOTE:</b> the <a target="_top" * href="http://java.sun.com/j2se/1.4.2/docs/api/java/io/File.html#createNewFile()">javadocs * for <code>File.createNewFile</code></a> contain a vague * yet spooky warning about not using the API for file * locking. This warning was added due to <a target="_top" * href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4676183">this * bug</a>, and in fact the only known problem with using * this API for locking is that the Lucene write lock may * not be released when the JVM exits abnormally.</p> * <p>When this happens, a {@link LockObtainFailedException} * is hit when trying to create a writer, in which case you * need to explicitly clear the lock file first. You can * either manually remove the file, or use the {@link * org.apache.lucene.index.IndexWriter#unlock(Directory)} * API. But, first be certain that no writer is in fact * writing to the index otherwise you can easily corrupt * your index.</p> * * <p>If you suspect that this or any other LockFactory is * not working properly in your environment, you can easily * test it by using {@link VerifyingLockFactory}, {@link * LockVerifyServer} and {@link LockStressTest}.</p> * * @see LockFactory */	TokenNameCOMMENT_JAVADOC	 <p>Implements {@link LockFactory} using {@link File#createNewFile()}.</p> * <p><b>NOTE:</b> the <a target="_top" href="http://java.sun.com/j2se/1.4.2/docs/api/java/io/File.html#createNewFile()">javadocs for <code>File.createNewFile</code></a> contain a vague yet spooky warning about not using the API for file locking. This warning was added due to <a target="_top" href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4676183">this bug</a>, and in fact the only known problem with using this API for locking is that the Lucene write lock may not be released when the JVM exits abnormally.</p> <p>When this happens, a {@link LockObtainFailedException} is hit when trying to create a writer, in which case you need to explicitly clear the lock file first. You can either manually remove the file, or use the {@link org.apache.lucene.index.IndexWriter#unlock(Directory)} API. But, first be certain that no writer is in fact writing to the index otherwise you can easily corrupt your index.</p> * <p>If you suspect that this or any other LockFactory is not working properly in your environment, you can easily test it by using {@link VerifyingLockFactory}, {@link LockVerifyServer} and {@link LockStressTest}.</p> * @see LockFactory 
public	TokenNamepublic	
class	TokenNameclass	
SimpleFSLockFactory	TokenNameIdentifier	 Simple FS Lock Factory
extends	TokenNameextends	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
{	TokenNameLBRACE	
/** * Create a SimpleFSLockFactory instance, with null (unset) * lock directory. When you pass this factory to a {@link FSDirectory} * subclass, the lock directory is automatically set to the * directory itself. Be sure to create one instance for each directory * your create! */	TokenNameCOMMENT_JAVADOC	 Create a SimpleFSLockFactory instance, with null (unset) lock directory. When you pass this factory to a {@link FSDirectory} subclass, the lock directory is automatically set to the directory itself. Be sure to create one instance for each directory your create! 
public	TokenNamepublic	
SimpleFSLockFactory	TokenNameIdentifier	 Simple FS Lock Factory
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
/** * Instantiate using the provided directory (as a File instance). * @param lockDir where lock files should be created. */	TokenNameCOMMENT_JAVADOC	 Instantiate using the provided directory (as a File instance). @param lockDir where lock files should be created. 
public	TokenNamepublic	
SimpleFSLockFactory	TokenNameIdentifier	 Simple FS Lock Factory
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
/** * Instantiate using the provided directory name (String). * @param lockDirName where lock files should be created. */	TokenNameCOMMENT_JAVADOC	 Instantiate using the provided directory name (String). @param lockDirName where lock files should be created. 
public	TokenNamepublic	
SimpleFSLockFactory	TokenNameIdentifier	 Simple FS Lock Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockDirName	TokenNameIdentifier	 lock Dir Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setLockDir	TokenNameIdentifier	 set Lock Dir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
lockDirName	TokenNameIdentifier	 lock Dir Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
return	TokenNamereturn	
new	TokenNamenew	
SimpleFSLock	TokenNameIdentifier	 Simple FS Lock
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
if	TokenNameif	
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
File	TokenNameIdentifier	 File
lockFile	TokenNameIdentifier	 lock File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
,	TokenNameCOMMA	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lockFile	TokenNameIdentifier	 lock File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
lockFile	TokenNameIdentifier	 lock File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot delete "	TokenNameStringLiteral	Cannot delete 
+	TokenNamePLUS	
lockFile	TokenNameIdentifier	 lock File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
SimpleFSLock	TokenNameIdentifier	 Simple FS Lock
extends	TokenNameextends	
Lock	TokenNameIdentifier	 Lock
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
lockFile	TokenNameIdentifier	 lock File
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleFSLock	TokenNameIdentifier	 Simple FS Lock
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
lockFile	TokenNameIdentifier	 lock File
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Ensure that lockDir exists and is a directory: 	TokenNameCOMMENT_LINE	Ensure that lockDir exists and is a directory: 
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
return	TokenNamereturn	
lockFile	TokenNameIdentifier	 lock File
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
LockReleaseFailedException	TokenNameIdentifier	 Lock Release Failed Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lockFile	TokenNameIdentifier	 lock File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
lockFile	TokenNameIdentifier	 lock File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
LockReleaseFailedException	TokenNameIdentifier	 Lock Release Failed Exception
(	TokenNameLPAREN	
"failed to delete "	TokenNameStringLiteral	failed to delete 
+	TokenNamePLUS	
lockFile	TokenNameIdentifier	 lock File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isLocked	TokenNameIdentifier	 is Locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lockFile	TokenNameIdentifier	 lock File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"SimpleFSLock@"	TokenNameStringLiteral	SimpleFSLock@
+	TokenNamePLUS	
lockFile	TokenNameIdentifier	 lock File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
