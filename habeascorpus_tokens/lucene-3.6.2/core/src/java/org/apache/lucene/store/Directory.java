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
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
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
/** A Directory is a flat list of files. Files may be written once, when they * are created. Once a file is created it may only be opened for read, or * deleted. Random access is permitted both when reading and writing. * * <p> Java's i/o APIs not used directly, but rather all i/o is * through this API. This permits things such as: <ul> * <li> implementation of RAM-based indices; * <li> implementation indices stored in a database, via JDBC; * <li> implementation of an index as a single file; * </ul> * * Directory locking is implemented by an instance of {@link * LockFactory}, and can be changed for each Directory * instance using {@link #setLockFactory}. * */	TokenNameCOMMENT_JAVADOC	 A Directory is a flat list of files. Files may be written once, when they are created. Once a file is created it may only be opened for read, or deleted. Random access is permitted both when reading and writing. * <p> Java's i/o APIs not used directly, but rather all i/o is through this API. This permits things such as: <ul> <li> implementation of RAM-based indices; <li> implementation indices stored in a database, via JDBC; <li> implementation of an index as a single file; </ul> * Directory locking is implemented by an instance of {@link LockFactory}, and can be changed for each Directory instance using {@link #setLockFactory}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Directory	TokenNameIdentifier	 Directory
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
volatile	TokenNamevolatile	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Holds the LockFactory instance (implements locking for * this Directory instance). */	TokenNameCOMMENT_JAVADOC	 Holds the LockFactory instance (implements locking for this Directory instance). 
protected	TokenNameprotected	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
;	TokenNameSEMICOLON	
/** * Returns an array of strings, one for each file in the directory. * * @throws NoSuchDirectoryException if the directory is not prepared for any * write operations (such as {@link #createOutput(String)}). * @throws IOException in case of other IO errors */	TokenNameCOMMENT_JAVADOC	 Returns an array of strings, one for each file in the directory. * @throws NoSuchDirectoryException if the directory is not prepared for any write operations (such as {@link #createOutput(String)}). @throws IOException in case of other IO errors 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns true iff a file with the given name exists. */	TokenNameCOMMENT_JAVADOC	 Returns true iff a file with the given name exists. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the time the named file was last modified. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Returns the time the named file was last modified. @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Set the modified time of an existing file to now. * * @deprecated Lucene never uses this API; it will be * removed in 4.0. */	TokenNameCOMMENT_JAVADOC	 Set the modified time of an existing file to now. * @deprecated Lucene never uses this API; it will be removed in 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Removes an existing file in the directory. */	TokenNameCOMMENT_JAVADOC	 Removes an existing file in the directory. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns the length of a file in the directory. This method follows the * following contract: * <ul> * <li>Throws {@link FileNotFoundException} if the file does not exist * <li>Returns a value &ge;0 if the file exists, which specifies its length. * </ul> * * @param name the name of the file for which to return the length. * @throws FileNotFoundException if the file does not exist. * @throws IOException if there was an IO error while retrieving the file's * length. */	TokenNameCOMMENT_JAVADOC	 Returns the length of a file in the directory. This method follows the following contract: <ul> <li>Throws {@link FileNotFoundException} if the file does not exist <li>Returns a value &ge;0 if the file exists, which specifies its length. </ul> * @param name the name of the file for which to return the length. @throws FileNotFoundException if the file does not exist. @throws IOException if there was an IO error while retrieving the file's length. 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Creates a new, empty file in the directory with the given name. Returns a stream writing this file. */	TokenNameCOMMENT_JAVADOC	 Creates a new, empty file in the directory with the given name. Returns a stream writing this file. 
public	TokenNamepublic	
abstract	TokenNameabstract	
IndexOutput	TokenNameIdentifier	 Index Output
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Ensure that any writes to this file are moved to * stable storage. Lucene uses this to properly commit * changes to the index, to prevent a machine/OS crash * from corrupting the index. * @deprecated use {@link #sync(Collection)} instead. * For easy migration you can change your code to call * sync(Collections.singleton(name)) */	TokenNameCOMMENT_JAVADOC	 Ensure that any writes to this file are moved to stable storage. Lucene uses this to properly commit changes to the index, to prevent a machine/OS crash from corrupting the index. @deprecated use {@link #sync(Collection)} instead. For easy migration you can change your code to call sync(Collections.singleton(name)) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
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
// TODO 4.0 kill me 	TokenNameCOMMENT_LINE	TODO 4.0 kill me 
}	TokenNameRBRACE	
/** * Ensure that any writes to these files are moved to * stable storage. Lucene uses this to properly commit * changes to the index, to prevent a machine/OS crash * from corrupting the index.<br/> * <br/> * NOTE: Clients may call this method for same files over * and over again, so some impls might optimize for that. * For other impls the operation can be a noop, for various * reasons. */	TokenNameCOMMENT_JAVADOC	 Ensure that any writes to these files are moved to stable storage. Lucene uses this to properly commit changes to the index, to prevent a machine/OS crash from corrupting the index.<br/> <br/> NOTE: Clients may call this method for same files over and over again, so some impls might optimize for that. For other impls the operation can be a noop, for various reasons. 
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
// TODO 4.0 make me abstract 	TokenNameCOMMENT_LINE	TODO 4.0 make me abstract 
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a stream reading an existing file. */	TokenNameCOMMENT_JAVADOC	 Returns a stream reading an existing file. 
public	TokenNamepublic	
abstract	TokenNameabstract	
IndexInput	TokenNameIdentifier	 Index Input
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns a stream reading an existing file, with the * specified read buffer size. The particular Directory * implementation may ignore the buffer size. Currently * the only Directory implementations that respect this * parameter are {@link FSDirectory} and {@link * org.apache.lucene.index.CompoundFileReader}. */	TokenNameCOMMENT_JAVADOC	 Returns a stream reading an existing file, with the specified read buffer size. The particular Directory implementation may ignore the buffer size. Currently the only Directory implementations that respect this parameter are {@link FSDirectory} and {@link org.apache.lucene.index.CompoundFileReader}. 
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
return	TokenNamereturn	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a {@link Lock}. * @param name the name of the lock file */	TokenNameCOMMENT_JAVADOC	 Construct a {@link Lock}. @param name the name of the lock file 
public	TokenNamepublic	
Lock	TokenNameIdentifier	 Lock
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lockFactory	TokenNameIdentifier	 lock Factory
.	TokenNameDOT	
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to clear (forcefully unlock and remove) the * specified lock. Only call this at a time when you are * certain this lock is no longer in use. * @param name name of the lock to be cleared. */	TokenNameCOMMENT_JAVADOC	 Attempt to clear (forcefully unlock and remove) the specified lock. Only call this at a time when you are certain this lock is no longer in use. @param name name of the lock to be cleared. 
public	TokenNamepublic	
void	TokenNamevoid	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lockFactory	TokenNameIdentifier	 lock Factory
.	TokenNameDOT	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Closes the store. */	TokenNameCOMMENT_JAVADOC	 Closes the store. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Set the LockFactory that this Directory instance should * use for its locking implementation. Each * instance of * LockFactory should only be used for one directory (ie, * do not share a single instance across multiple * Directories). * * @param lockFactory instance of {@link LockFactory}. */	TokenNameCOMMENT_JAVADOC	 Set the LockFactory that this Directory instance should use for its locking implementation. Each instance of LockFactory should only be used for one directory (ie, do not share a single instance across multiple Directories). * @param lockFactory instance of {@link LockFactory}. 
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
assert	TokenNameassert	
lockFactory	TokenNameIdentifier	 lock Factory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lockFactory	TokenNameIdentifier	 lock Factory
=	TokenNameEQUAL	
lockFactory	TokenNameIdentifier	 lock Factory
;	TokenNameSEMICOLON	
lockFactory	TokenNameIdentifier	 lock Factory
.	TokenNameDOT	
setLockPrefix	TokenNameIdentifier	 set Lock Prefix
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getLockID	TokenNameIdentifier	 get Lock ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the LockFactory that this Directory instance is * using for its locking implementation. Note that this * may be null for Directory implementations that provide * their own locking implementation. */	TokenNameCOMMENT_JAVADOC	 Get the LockFactory that this Directory instance is using for its locking implementation. Note that this may be null for Directory implementations that provide their own locking implementation. 
public	TokenNamepublic	
LockFactory	TokenNameIdentifier	 Lock Factory
getLockFactory	TokenNameIdentifier	 get Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
lockFactory	TokenNameIdentifier	 lock Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string identifier that uniquely differentiates * this Directory instance from other Directory instances. * This ID should be the same if two Directory instances * (even in different JVMs and/or on different machines) * are considered "the same index". This is how locking * "scopes" to the right index. */	TokenNameCOMMENT_JAVADOC	 Return a string identifier that uniquely differentiates this Directory instance from other Directory instances. This ID should be the same if two Directory instances (even in different JVMs and/or on different machines) are considered "the same index". This is how locking "scopes" to the right index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLockID	TokenNameIdentifier	 get Lock ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
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
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" lockFactory="	TokenNameStringLiteral	 lockFactory=
+	TokenNamePLUS	
getLockFactory	TokenNameIdentifier	 get Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the file <i>src</i> to {@link Directory} <i>to</i> under the new * file name <i>dest</i>. * <p> * If you want to copy the entire source directory to the destination one, you * can do so like this: * * <pre> * Directory to; // the directory to copy to * for (String file : dir.listAll()) { * dir.copy(to, file, newFile); // newFile can be either file, or a new name * } * </pre> * <p> * <b>NOTE:</b> this method does not check whether <i>dest<i> exist and will * overwrite it if it does. */	TokenNameCOMMENT_JAVADOC	 Copies the file <i>src</i> to {@link Directory} <i>to</i> under the new file name <i>dest</i>. <p> If you want to copy the entire source directory to the destination one, you can do so like this: * <pre> Directory to; // the directory to copy to for (String file : dir.listAll()) { dir.copy(to, file, newFile); // newFile can be either file, or a new name } </pre> <p> <b>NOTE:</b> this method does not check whether <i>dest<i> exist and will overwrite it if it does. 
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IOException	TokenNameIdentifier	 IO Exception
priorException	TokenNameIdentifier	 prior Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
priorException	TokenNameIdentifier	 prior Exception
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
priorException	TokenNameIdentifier	 prior Exception
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy contents of a directory src to a directory dest. If a file in src * already exists in dest then the one in dest will be blindly overwritten. * <p> * <b>NOTE:</b> the source directory cannot change while this method is * running. Otherwise the results are undefined and you could easily hit a * FileNotFoundException. * <p> * <b>NOTE:</b> this method only copies files that look like index files (ie, * have extensions matching the known extensions of index files). * * @param src source directory * @param dest destination directory * @param closeDirSrc if <code>true</code>, call {@link #close()} method on * source directory * @deprecated should be replaced with calls to * {@link #copy(Directory, String, String)} for every file that * needs copying. You can use the following code: * * <pre> * IndexFileNameFilter filter = IndexFileNameFilter.getFilter(); * for (String file : src.listAll()) { * if (filter.accept(null, file)) { * src.copy(dest, file, file); * } * } * </pre> */	TokenNameCOMMENT_JAVADOC	 Copy contents of a directory src to a directory dest. If a file in src already exists in dest then the one in dest will be blindly overwritten. <p> <b>NOTE:</b> the source directory cannot change while this method is running. Otherwise the results are undefined and you could easily hit a FileNotFoundException. <p> <b>NOTE:</b> this method only copies files that look like index files (ie, have extensions matching the known extensions of index files). * @param src source directory @param dest destination directory @param closeDirSrc if <code>true</code>, call {@link #close()} method on source directory @deprecated should be replaced with calls to {@link #copy(Directory, String, String)} for every file that needs copying. You can use the following code: * <pre> IndexFileNameFilter filter = IndexFileNameFilter.getFilter(); for (String file : src.listAll()) { if (filter.accept(null, file)) { src.copy(dest, file, file); } } </pre> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
boolean	TokenNameboolean	
closeDirSrc	TokenNameIdentifier	 close Dir Src
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
IndexFileNameFilter	TokenNameIdentifier	 Index File Name Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closeDirSrc	TokenNameIdentifier	 close Dir Src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @throws AlreadyClosedException if this Directory is closed */	TokenNameCOMMENT_JAVADOC	 @throws AlreadyClosedException if this Directory is closed 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isOpen	TokenNameIdentifier	 is Open
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadyClosedException	TokenNameIdentifier	 Already Closed Exception
(	TokenNameLPAREN	
"this Directory is closed"	TokenNameStringLiteral	this Directory is closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
