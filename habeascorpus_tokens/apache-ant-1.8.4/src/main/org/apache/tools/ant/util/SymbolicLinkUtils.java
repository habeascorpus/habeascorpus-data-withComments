/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Execute	TokenNameIdentifier	 Execute
;	TokenNameSEMICOLON	
/** * Contains methods related to symbolic links - or what Ant thinks is * a symbolic link based on the absent support for them in Java. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Contains methods related to symbolic links - or what Ant thinks is a symbolic link based on the absent support for them in Java. * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Shared instance. */	TokenNameCOMMENT_JAVADOC	 Shared instance. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
PRIMARY_INSTANCE	TokenNameIdentifier	 PRIMARY  INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Method to retrieve The SymbolicLinkUtils, which is shared by * all users of this method. * @return an instance of SymbolicLinkUtils. */	TokenNameCOMMENT_JAVADOC	 Method to retrieve The SymbolicLinkUtils, which is shared by all users of this method. @return an instance of SymbolicLinkUtils. 
public	TokenNamepublic	
static	TokenNamestatic	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
getSymbolicLinkUtils	TokenNameIdentifier	 get Symbolic Link Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// keep the door open for Java X.Y specific subclass if symbolic 	TokenNameCOMMENT_LINE	keep the door open for Java X.Y specific subclass if symbolic 
// links ever become supported in the classlib 	TokenNameCOMMENT_LINE	links ever become supported in the classlib 
return	TokenNamereturn	
PRIMARY_INSTANCE	TokenNameIdentifier	 PRIMARY  INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empty constructor. */	TokenNameCOMMENT_JAVADOC	 Empty constructor. 
protected	TokenNameprotected	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Checks whether a given file is a symbolic link. * * <p>It doesn't really test for symbolic links but whether the * canonical and absolute paths of the file are identical--this * may lead to false positives on some platforms.</p> * * @param file the file to test. Must not be null. * * @return true if the file is a symbolic link. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Checks whether a given file is a symbolic link. * <p>It doesn't really test for symbolic links but whether the canonical and absolute paths of the file are identical--this may lead to false positives on some platforms.</p> * @param file the file to test. Must not be null. * @return true if the file is a symbolic link. @throws IOException on error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether a given file is a symbolic link. * * <p>It doesn't really test for symbolic links but whether the * canonical and absolute paths of the file are identical--this * may lead to false positives on some platforms.</p> * * @param name the name of the file to test. * * @return true if the file is a symbolic link. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Checks whether a given file is a symbolic link. * <p>It doesn't really test for symbolic links but whether the canonical and absolute paths of the file are identical--this may lead to false positives on some platforms.</p> * @param name the name of the file to test. * @return true if the file is a symbolic link. @throws IOException on error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether a given file is a symbolic link. * * <p>It doesn't really test for symbolic links but whether the * canonical and absolute paths of the file are identical--this * may lead to false positives on some platforms.</p> * * @param parent the parent directory of the file to test * @param name the name of the file to test. * * @return true if the file is a symbolic link. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Checks whether a given file is a symbolic link. * <p>It doesn't really test for symbolic links but whether the canonical and absolute paths of the file are identical--this may lead to false positives on some platforms.</p> * @param parent the parent directory of the file to test @param name the name of the file to test. * @return true if the file is a symbolic link. @throws IOException on error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
toTest	TokenNameIdentifier	 to Test
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
toTest	TokenNameIdentifier	 to Test
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
toTest	TokenNameIdentifier	 to Test
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether a given file is a broken symbolic link. * * <p>It doesn't really test for symbolic links but whether Java * reports that the File doesn't exist but its parent's child list * contains it--this may lead to false positives on some * platforms.</p> * * <p>Note that #isSymbolicLink returns false if this method * returns true since Java won't produce a canonical name * different from the abolute one if the link is broken.</p> * * @param name the name of the file to test. * * @return true if the file is a broken symbolic link. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Checks whether a given file is a broken symbolic link. * <p>It doesn't really test for symbolic links but whether Java reports that the File doesn't exist but its parent's child list contains it--this may lead to false positives on some platforms.</p> * <p>Note that #isSymbolicLink returns false if this method returns true since Java won't produce a canonical name different from the abolute one if the link is broken.</p> * @param name the name of the file to test. * @return true if the file is a broken symbolic link. @throws IOException on error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDanglingSymbolicLink	TokenNameIdentifier	 is Dangling Symbolic Link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
isDanglingSymbolicLink	TokenNameIdentifier	 is Dangling Symbolic Link
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether a given file is a broken symbolic link. * * <p>It doesn't really test for symbolic links but whether Java * reports that the File doesn't exist but its parent's child list * contains it--this may lead to false positives on some * platforms.</p> * * <p>Note that #isSymbolicLink returns false if this method * returns true since Java won't produce a canonical name * different from the abolute one if the link is broken.</p> * * @param file the file to test. * * @return true if the file is a broken symbolic link. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Checks whether a given file is a broken symbolic link. * <p>It doesn't really test for symbolic links but whether Java reports that the File doesn't exist but its parent's child list contains it--this may lead to false positives on some platforms.</p> * <p>Note that #isSymbolicLink returns false if this method returns true since Java won't produce a canonical name different from the abolute one if the link is broken.</p> * @param file the file to test. * @return true if the file is a broken symbolic link. @throws IOException on error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDanglingSymbolicLink	TokenNameIdentifier	 is Dangling Symbolic Link
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
isDanglingSymbolicLink	TokenNameIdentifier	 is Dangling Symbolic Link
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether a given file is a broken symbolic link. * * <p>It doesn't really test for symbolic links but whether Java * reports that the File doesn't exist but its parent's child list * contains it--this may lead to false positives on some * platforms.</p> * * <p>Note that #isSymbolicLink returns false if this method * returns true since Java won't produce a canonical name * different from the abolute one if the link is broken.</p> * * @param parent the parent directory of the file to test * @param name the name of the file to test. * * @return true if the file is a broken symbolic link. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Checks whether a given file is a broken symbolic link. * <p>It doesn't really test for symbolic links but whether Java reports that the File doesn't exist but its parent's child list contains it--this may lead to false positives on some platforms.</p> * <p>Note that #isSymbolicLink returns false if this method returns true since Java won't produce a canonical name different from the abolute one if the link is broken.</p> * @param parent the parent directory of the file to test @param name the name of the file to test. * @return true if the file is a broken symbolic link. @throws IOException on error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDanglingSymbolicLink	TokenNameIdentifier	 is Dangling Symbolic Link
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
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
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delete a symlink (without deleting the associated resource). * * <p>This is a utility method that removes a unix symlink without * removing the resource that the symlink points to. If it is * accidentally invoked on a real file, the real file will not be * harmed, but silently ignored.</p> * * <p>Normaly this method works by * getting the canonical path of the link, using the canonical path to * rename the resource (breaking the link) and then deleting the link. * The resource is then returned to its original name inside a finally * block to ensure that the resource is unharmed even in the event of * an exception.</p> * * <p>There may be cases where the algorithm described above doesn't work, * in that case the method tries to use the native "rm" command on * the symlink instead.</p> * * @param link A <code>File</code> object of the symlink to delete. * @param task An Ant Task required if "rm" needs to be invoked. * * @throws IOException If calls to <code>File.rename</code>, * <code>File.delete</code> or <code>File.getCanonicalPath</code> * fail. * @throws BuildException if the execution of "rm" failed. */	TokenNameCOMMENT_JAVADOC	 Delete a symlink (without deleting the associated resource). * <p>This is a utility method that removes a unix symlink without removing the resource that the symlink points to. If it is accidentally invoked on a real file, the real file will not be harmed, but silently ignored.</p> * <p>Normaly this method works by getting the canonical path of the link, using the canonical path to rename the resource (breaking the link) and then deleting the link. The resource is then returned to its original name inside a finally block to ensure that the resource is unharmed even in the event of an exception.</p> * <p>There may be cases where the algorithm described above doesn't work, in that case the method tries to use the native "rm" command on the symlink instead.</p> * @param link A <code>File</code> object of the symlink to delete. @param task An Ant Task required if "rm" needs to be invoked. * @throws IOException If calls to <code>File.rename</code>, <code>File.delete</code> or <code>File.getCanonicalPath</code> fail. @throws BuildException if the execution of "rm" failed. 
public	TokenNamepublic	
void	TokenNamevoid	
deleteSymbolicLink	TokenNameIdentifier	 delete Symbolic Link
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
link	TokenNameIdentifier	 link
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDanglingSymbolicLink	TokenNameIdentifier	 is Dangling Symbolic Link
(	TokenNameLPAREN	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
link	TokenNameIdentifier	 link
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
"failed to remove dangling symbolic link "	TokenNameStringLiteral	failed to remove dangling symbolic link 
+	TokenNamePLUS	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// plain file, not a link 	TokenNameCOMMENT_LINE	plain file, not a link 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
link	TokenNameIdentifier	 link
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
"No such symbolic link: "	TokenNameStringLiteral	No such symbolic link: 
+	TokenNamePLUS	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find the resource of the existing link: 	TokenNameCOMMENT_LINE	find the resource of the existing link: 
File	TokenNameIdentifier	 File
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
link	TokenNameIdentifier	 link
.	TokenNameDOT	
getCanonicalFile	TokenNameIdentifier	 get Canonical File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no reason to try the renaming algorithm if we aren't allowed to 	TokenNameCOMMENT_LINE	no reason to try the renaming algorithm if we aren't allowed to 
// write to the target's parent directory. Let's hope that 	TokenNameCOMMENT_LINE	write to the target's parent directory. Let's hope that 
// File.canWrite works on all platforms. 	TokenNameCOMMENT_LINE	File.canWrite works on all platforms. 
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// rename the resource, thus breaking the link: 	TokenNameCOMMENT_LINE	rename the resource, thus breaking the link: 
File	TokenNameIdentifier	 File
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"symlink"	TokenNameStringLiteral	symlink
,	TokenNameCOMMA	
".tmp"	TokenNameStringLiteral	.tmp
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
isLeadingPath	TokenNameIdentifier	 is Leading Path
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// link points to a parent directory, renaming the parent 	TokenNameCOMMENT_LINE	link points to a parent directory, renaming the parent 
// will rename the file 	TokenNameCOMMENT_LINE	will rename the file 
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
link	TokenNameIdentifier	 link
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
renamedTarget	TokenNameIdentifier	 renamed Target
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
rename	TokenNameIdentifier	 rename
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renamedTarget	TokenNameIdentifier	 renamed Target
=	TokenNameEQUAL	
true	TokenNametrue	
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
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Couldn't rename resource when "	TokenNameStringLiteral	Couldn't rename resource when 
+	TokenNamePLUS	
"attempting to delete '"	TokenNameStringLiteral	attempting to delete '
+	TokenNamePLUS	
link	TokenNameIdentifier	 link
+	TokenNamePLUS	
"'. Reason: "	TokenNameStringLiteral	'. Reason: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// delete the (now) broken link: 	TokenNameCOMMENT_LINE	delete the (now) broken link: 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
link	TokenNameIdentifier	 link
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
"Couldn't delete symlink: "	TokenNameStringLiteral	Couldn't delete symlink: 
+	TokenNamePLUS	
link	TokenNameIdentifier	 link
+	TokenNamePLUS	
" (was it a real file? is this "	TokenNameStringLiteral	 (was it a real file? is this 
+	TokenNamePLUS	
"not a UNIX system?)"	TokenNameStringLiteral	not a UNIX system?)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
renamedTarget	TokenNameIdentifier	 renamed Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// return the resource to its original name: 	TokenNameCOMMENT_LINE	return the resource to its original name: 
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
rename	TokenNameIdentifier	 rename
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
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
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Couldn't return resource "	TokenNameStringLiteral	Couldn't return resource 
+	TokenNamePLUS	
temp	TokenNameIdentifier	 temp
+	TokenNamePLUS	
" to its original name: "	TokenNameStringLiteral	 to its original name: 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
". Reason: "	TokenNameStringLiteral	. Reason: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" THE RESOURCE'S NAME ON DISK"	TokenNameStringLiteral	 THE RESOURCE'S NAME ON DISK
+	TokenNamePLUS	
" HAS BEEN CHANGED BY THIS"	TokenNameStringLiteral	 HAS BEEN CHANGED BY THIS
+	TokenNamePLUS	
" ERROR! "	TokenNameStringLiteral	 ERROR! 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Execute	TokenNameIdentifier	 Execute
.	TokenNameDOT	
runCommand	TokenNameIdentifier	 run Command
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"rm"	TokenNameStringLiteral	rm
,	TokenNameCOMMA	
link	TokenNameIdentifier	 link
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
