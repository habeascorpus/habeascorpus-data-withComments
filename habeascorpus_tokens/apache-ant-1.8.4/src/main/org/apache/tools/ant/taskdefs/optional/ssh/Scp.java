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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ssh	TokenNameIdentifier	 ssh
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
JSchException	TokenNameIdentifier	 J Sch Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
Session	TokenNameIdentifier	 Session
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
BuildException	TokenNameIdentifier	 Build Exception
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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
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
Project	TokenNameIdentifier	 Project
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * Ant task for sending files to remote machine over ssh/scp. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Ant task for sending files to remote machine over ssh/scp. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
Scp	TokenNameIdentifier	 Scp
extends	TokenNameextends	
SSHBase	TokenNameIdentifier	 SSH Base
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FROM_ATTRS	TokenNameIdentifier	 FROM  ATTRS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
"localfile"	TokenNameStringLiteral	localfile
,	TokenNameCOMMA	
"remotefile"	TokenNameStringLiteral	remotefile
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TO_ATTRS	TokenNameIdentifier	 TO  ATTRS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"todir"	TokenNameStringLiteral	todir
,	TokenNameCOMMA	
"localtodir"	TokenNameStringLiteral	localtodir
,	TokenNameCOMMA	
"remotetodir"	TokenNameStringLiteral	remotetodir
,	TokenNameCOMMA	
"localtofile"	TokenNameStringLiteral	localtofile
,	TokenNameCOMMA	
"remotetofile"	TokenNameStringLiteral	remotetofile
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fromUri	TokenNameIdentifier	 from Uri
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toUri	TokenNameIdentifier	 to Uri
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
fileSets	TokenNameIdentifier	 file Sets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isFromRemote	TokenNameIdentifier	 is From Remote
,	TokenNameCOMMA	
isToRemote	TokenNameIdentifier	 is To Remote
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isSftp	TokenNameIdentifier	 is Sftp
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the file to be transferred. This can either be a remote * file or a local file. Remote files take the form:<br> * <i>user:password@host:/directory/path/file.example</i><br> * Files to transfer can also include a wildcard to include all * files in a remote directory. For example:<br> * <i>user:password@host:/directory/path/*</i><br> * @param aFromUri a string representing the file to transfer. */	TokenNameCOMMENT_JAVADOC	 Sets the file to be transferred. This can either be a remote file or a local file. Remote files take the form:<br> <i>user:password@host:/directory/path/file.example</i><br> Files to transfer can also include a wildcard to include all files in a remote directory. For example:<br> <i>user:password@host:/directory/path/*</i><br> @param aFromUri a string representing the file to transfer. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFromUri	TokenNameIdentifier	 set From Uri
(	TokenNameLPAREN	
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isFromRemote	TokenNameIdentifier	 is From Remote
=	TokenNameEQUAL	
isRemoteUri	TokenNameIdentifier	 is Remote Uri
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fromUri	TokenNameIdentifier	 from Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the location where files will be transferred to. * This can either be a remote directory or a local directory. * Remote directories take the form of:<br> * <i>user:password@host:/directory/path/</i><br> * This parameter is required. * @param aToUri a string representing the target of the copy. */	TokenNameCOMMENT_JAVADOC	 Sets the location where files will be transferred to. This can either be a remote directory or a local directory. Remote directories take the form of:<br> <i>user:password@host:/directory/path/</i><br> This parameter is required. @param aToUri a string representing the target of the copy. 
public	TokenNamepublic	
void	TokenNamevoid	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToUri	TokenNameIdentifier	 set To Uri
(	TokenNameLPAREN	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isToRemote	TokenNameIdentifier	 is To Remote
=	TokenNameEQUAL	
isRemoteUri	TokenNameIdentifier	 is Remote Uri
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
toUri	TokenNameIdentifier	 to Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similiar to {@link #setFile setFile} but explicitly states that * the file is a local file. This is the only way to specify a * local file with a @ character. * @param aFromUri a string representing the source of the copy. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Similiar to {@link #setFile setFile} but explicitly states that the file is a local file. This is the only way to specify a local file with a @ character. @param aFromUri a string representing the source of the copy. @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalFile	TokenNameIdentifier	 set Local File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFromUri	TokenNameIdentifier	 set From Uri
(	TokenNameLPAREN	
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isFromRemote	TokenNameIdentifier	 is From Remote
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similiar to {@link #setFile setFile} but explicitly states that * the file is a remote file. * @param aFromUri a string representing the source of the copy. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Similiar to {@link #setFile setFile} but explicitly states that the file is a remote file. @param aFromUri a string representing the source of the copy. @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setRemoteFile	TokenNameIdentifier	 set Remote File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateRemoteUri	TokenNameIdentifier	 validate Remote Uri
(	TokenNameLPAREN	
"remoteFile"	TokenNameStringLiteral	remoteFile
,	TokenNameCOMMA	
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFromUri	TokenNameIdentifier	 set From Uri
(	TokenNameLPAREN	
aFromUri	TokenNameIdentifier	 a From Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isFromRemote	TokenNameIdentifier	 is From Remote
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similiar to {@link #setTodir setTodir} but explicitly states * that the directory is a local. This is the only way to specify * a local directory with a @ character. * @param aToUri a string representing the target of the copy. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Similiar to {@link #setTodir setTodir} but explicitly states that the directory is a local. This is the only way to specify a local directory with a @ character. @param aToUri a string representing the target of the copy. @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalTodir	TokenNameIdentifier	 set Local Todir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToUri	TokenNameIdentifier	 set To Uri
(	TokenNameLPAREN	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isToRemote	TokenNameIdentifier	 is To Remote
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets flag to determine if file timestamp from * remote system is to be preserved during copy. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets flag to determine if file timestamp from remote system is to be preserved during copy. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setPreservelastmodified	TokenNameIdentifier	 set Preservelastmodified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
yesOrNo	TokenNameIdentifier	 yes Or No
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
=	TokenNameEQUAL	
yesOrNo	TokenNameIdentifier	 yes Or No
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similiar to {@link #setTodir setTodir} but explicitly states * that the directory is a remote. * @param aToUri a string representing the target of the copy. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Similiar to {@link #setTodir setTodir} but explicitly states that the directory is a remote. @param aToUri a string representing the target of the copy. @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setRemoteTodir	TokenNameIdentifier	 set Remote Todir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateRemoteUri	TokenNameIdentifier	 validate Remote Uri
(	TokenNameLPAREN	
"remoteToDir"	TokenNameStringLiteral	remoteToDir
,	TokenNameCOMMA	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToUri	TokenNameIdentifier	 set To Uri
(	TokenNameLPAREN	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isToRemote	TokenNameIdentifier	 is To Remote
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
validateRemoteUri	TokenNameIdentifier	 validate Remote Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isRemoteUri	TokenNameIdentifier	 is Remote Uri
(	TokenNameLPAREN	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
aToUri	TokenNameIdentifier	 a To Uri
+	TokenNamePLUS	
"' is invalid. "	TokenNameStringLiteral	' is invalid. 
+	TokenNamePLUS	
"The 'remoteToDir' attribute must "	TokenNameStringLiteral	The 'remoteToDir' attribute must 
+	TokenNamePLUS	
"have syntax like the "	TokenNameStringLiteral	have syntax like the 
+	TokenNamePLUS	
"following: user:password@host:/path"	TokenNameStringLiteral	following: user:password@host:/path
+	TokenNamePLUS	
" - the :password part is optional"	TokenNameStringLiteral	 - the :password part is optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Changes the file name to the given name while receiving it, * only useful if receiving a single file. * @param aToUri a string representing the target of the copy. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Changes the file name to the given name while receiving it, only useful if receiving a single file. @param aToUri a string representing the target of the copy. @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalTofile	TokenNameIdentifier	 set Local Tofile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToUri	TokenNameIdentifier	 set To Uri
(	TokenNameLPAREN	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isToRemote	TokenNameIdentifier	 is To Remote
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Changes the file name to the given name while sending it, * only useful if sending a single file. * @param aToUri a string representing the target of the copy. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Changes the file name to the given name while sending it, only useful if sending a single file. @param aToUri a string representing the target of the copy. @since Ant 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setRemoteTofile	TokenNameIdentifier	 set Remote Tofile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateRemoteUri	TokenNameIdentifier	 validate Remote Uri
(	TokenNameLPAREN	
"remoteToFile"	TokenNameStringLiteral	remoteToFile
,	TokenNameCOMMA	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToUri	TokenNameIdentifier	 set To Uri
(	TokenNameLPAREN	
aToUri	TokenNameIdentifier	 a To Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isToRemote	TokenNameIdentifier	 is To Remote
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setting this to true to use sftp protocol. * * @param yesOrNo if true sftp protocol will be used. */	TokenNameCOMMENT_JAVADOC	 Setting this to true to use sftp protocol. * @param yesOrNo if true sftp protocol will be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setSftp	TokenNameIdentifier	 set Sftp
(	TokenNameLPAREN	
boolean	TokenNameboolean	
yesOrNo	TokenNameIdentifier	 yes Or No
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isSftp	TokenNameIdentifier	 is Sftp
=	TokenNameEQUAL	
yesOrNo	TokenNameIdentifier	 yes Or No
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a FileSet tranfer to remote host. NOTE: Either * addFileSet() or setFile() are required. But, not both. * * @param set FileSet to send to remote host. */	TokenNameCOMMENT_JAVADOC	 Adds a FileSet tranfer to remote host. NOTE: Either addFileSet() or setFile() are required. But, not both. * @param set FileSet to send to remote host. 
public	TokenNamepublic	
void	TokenNamevoid	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileSets	TokenNameIdentifier	 file Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileSets	TokenNameIdentifier	 file Sets
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fileSets	TokenNameIdentifier	 file Sets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize this task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Initialize this task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
toUri	TokenNameIdentifier	 to Uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fromUri	TokenNameIdentifier	 from Uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fileSets	TokenNameIdentifier	 file Sets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute this task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute this task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toUri	TokenNameIdentifier	 to Uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
TO_ATTRS	TokenNameIdentifier	 TO  ATTRS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromUri	TokenNameIdentifier	 from Uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fileSets	TokenNameIdentifier	 file Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
FROM_ATTRS	TokenNameIdentifier	 FROM  ATTRS
,	TokenNameCOMMA	
"one or more nested filesets"	TokenNameStringLiteral	one or more nested filesets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFromRemote	TokenNameIdentifier	 is From Remote
&&	TokenNameAND_AND	
!	TokenNameNOT	
isToRemote	TokenNameIdentifier	 is To Remote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
download	TokenNameIdentifier	 download
(	TokenNameLPAREN	
fromUri	TokenNameIdentifier	 from Uri
,	TokenNameCOMMA	
toUri	TokenNameIdentifier	 to Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFromRemote	TokenNameIdentifier	 is From Remote
&&	TokenNameAND_AND	
isToRemote	TokenNameIdentifier	 is To Remote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileSets	TokenNameIdentifier	 file Sets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upload	TokenNameIdentifier	 upload
(	TokenNameLPAREN	
fileSets	TokenNameIdentifier	 file Sets
,	TokenNameCOMMA	
toUri	TokenNameIdentifier	 to Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
upload	TokenNameIdentifier	 upload
(	TokenNameLPAREN	
fromUri	TokenNameIdentifier	 from Uri
,	TokenNameCOMMA	
toUri	TokenNameIdentifier	 to Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isFromRemote	TokenNameIdentifier	 is From Remote
&&	TokenNameAND_AND	
isToRemote	TokenNameIdentifier	 is To Remote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Copying from a remote server to a remote server is not supported."	TokenNameStringLiteral	Copying from a remote server to a remote server is not supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"'todir' and 'file' attributes "	TokenNameStringLiteral	'todir' and 'file' attributes 
+	TokenNamePLUS	
"must have syntax like the following: "	TokenNameStringLiteral	must have syntax like the following: 
+	TokenNamePLUS	
"user:password@host:/path"	TokenNameStringLiteral	user:password@host:/path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getFailonerror	TokenNameIdentifier	 get Failonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Caught exception: "	TokenNameStringLiteral	Caught exception: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
download	TokenNameIdentifier	 download
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromSshUri	TokenNameIdentifier	 from Ssh Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
toPath	TokenNameIdentifier	 to Path
)	TokenNameRPAREN	
throws	TokenNamethrows	
JSchException	TokenNameIdentifier	 J Sch Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
parseUri	TokenNameIdentifier	 parse Uri
(	TokenNameLPAREN	
fromSshUri	TokenNameIdentifier	 from Ssh Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
openSession	TokenNameIdentifier	 open Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSftp	TokenNameIdentifier	 is Sftp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
ScpFromMessage	TokenNameIdentifier	 Scp From Message
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
toPath	TokenNameIdentifier	 to Path
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fromSshUri	TokenNameIdentifier	 from Ssh Uri
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
,	TokenNameCOMMA	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
ScpFromMessageBySftp	TokenNameIdentifier	 Scp From Message By Sftp
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
toPath	TokenNameIdentifier	 to Path
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fromSshUri	TokenNameIdentifier	 from Ssh Uri
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
,	TokenNameCOMMA	
preserveLastModified	TokenNameIdentifier	 preserve Last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Receiving file: "	TokenNameStringLiteral	Receiving file: 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setLogListener	TokenNameIdentifier	 set Log Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
upload	TokenNameIdentifier	 upload
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
fileSet	TokenNameIdentifier	 file Set
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
toSshUri	TokenNameIdentifier	 to Ssh Uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
parseUri	TokenNameIdentifier	 parse Uri
(	TokenNameLPAREN	
toSshUri	TokenNameIdentifier	 to Ssh Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
fileSet	TokenNameIdentifier	 file Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fileSet	TokenNameIdentifier	 file Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
createDirectory	TokenNameIdentifier	 create Directory
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
openSession	TokenNameIdentifier	 open Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScpToMessage	TokenNameIdentifier	 Scp To Message
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSftp	TokenNameIdentifier	 is Sftp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
ScpToMessage	TokenNameIdentifier	 Scp To Message
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setLogListener	TokenNameIdentifier	 set Log Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
upload	TokenNameIdentifier	 upload
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromPath	TokenNameIdentifier	 from Path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
toSshUri	TokenNameIdentifier	 to Ssh Uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
JSchException	TokenNameIdentifier	 J Sch Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
parseUri	TokenNameIdentifier	 parse Uri
(	TokenNameLPAREN	
toSshUri	TokenNameIdentifier	 to Ssh Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Session	TokenNameIdentifier	 Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
openSession	TokenNameIdentifier	 open Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScpToMessage	TokenNameIdentifier	 Scp To Message
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSftp	TokenNameIdentifier	 is Sftp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
ScpToMessage	TokenNameIdentifier	 Scp To Message
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
fromPath	TokenNameIdentifier	 from Path
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
ScpToMessageBySftp	TokenNameIdentifier	 Scp To Message By Sftp
(	TokenNameLPAREN	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
fromPath	TokenNameIdentifier	 from Path
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setLogListener	TokenNameIdentifier	 set Log Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
parseUri	TokenNameIdentifier	 parse Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexOfAt	TokenNameIdentifier	 index Of At
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfColon	TokenNameIdentifier	 index Of Colon
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfColon	TokenNameIdentifier	 index Of Colon
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
indexOfColon	TokenNameIdentifier	 index Of Colon
<	TokenNameLESS	
indexOfAt	TokenNameIdentifier	 index Of At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// user:password@host:/path notation 	TokenNameCOMMENT_LINE	user:password@host:/path notation 
// everything upto the last @ before the last : is considered 	TokenNameCOMMENT_LINE	everything upto the last @ before the last : is considered 
// password. (so if the path contains an @ and a : it will not work) 	TokenNameCOMMENT_LINE	password. (so if the path contains an @ and a : it will not work) 
int	TokenNameint	
indexOfCurrentAt	TokenNameIdentifier	 index Of Current At
=	TokenNameEQUAL	
indexOfAt	TokenNameIdentifier	 index Of At
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfLastColon	TokenNameIdentifier	 index Of Last Colon
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
indexOfCurrentAt	TokenNameIdentifier	 index Of Current At
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
indexOfCurrentAt	TokenNameIdentifier	 index Of Current At
<	TokenNameLESS	
indexOfLastColon	TokenNameIdentifier	 index Of Last Colon
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexOfAt	TokenNameIdentifier	 index Of At
=	TokenNameEQUAL	
indexOfCurrentAt	TokenNameIdentifier	 index Of Current At
;	TokenNameSEMICOLON	
indexOfCurrentAt	TokenNameIdentifier	 index Of Current At
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
indexOfCurrentAt	TokenNameIdentifier	 index Of Current At
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfColon	TokenNameIdentifier	 index Of Colon
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfColon	TokenNameIdentifier	 index Of Colon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfAt	TokenNameIdentifier	 index Of At
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfAt	TokenNameIdentifier	 index Of At
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no password, will require keyfile 	TokenNameCOMMENT_LINE	no password, will require keyfile 
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfAt	TokenNameIdentifier	 index Of At
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"no username was given. Can't authenticate."	TokenNameStringLiteral	no username was given. Can't authenticate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeyfile	TokenNameIdentifier	 get Keyfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"neither password nor keyfile for user "	TokenNameStringLiteral	neither password nor keyfile for user 
+	TokenNamePLUS	
getUserInfo	TokenNameIdentifier	 get User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" has been "	TokenNameStringLiteral	 has been 
+	TokenNamePLUS	
"given. Can't authenticate."	TokenNameStringLiteral	given. Can't authenticate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
indexOfPath	TokenNameIdentifier	 index Of Path
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
indexOfAt	TokenNameIdentifier	 index Of At
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfPath	TokenNameIdentifier	 index Of Path
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"no remote path in "	TokenNameStringLiteral	no remote path in 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfAt	TokenNameIdentifier	 index Of At
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfPath	TokenNameIdentifier	 index Of Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
remotePath	TokenNameIdentifier	 remote Path
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfPath	TokenNameIdentifier	 index Of Path
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remotePath	TokenNameIdentifier	 remote Path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remotePath	TokenNameIdentifier	 remote Path
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
remotePath	TokenNameIdentifier	 remote Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isRemoteUri	TokenNameIdentifier	 is Remote Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isRemote	TokenNameIdentifier	 is Remote
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfAt	TokenNameIdentifier	 index Of At
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfAt	TokenNameIdentifier	 index Of At
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isRemote	TokenNameIdentifier	 is Remote
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isRemote	TokenNameIdentifier	 is Remote
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
createDirectory	TokenNameIdentifier	 create Directory
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
new	TokenNamenew	
Directory	TokenNameIdentifier	 Directory
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
Directory	TokenNameIdentifier	 Directory
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
currentParent	TokenNameIdentifier	 current Parent
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
currentParent	TokenNameIdentifier	 current Parent
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
addDirectory	TokenNameIdentifier	 add Directory
(	TokenNameLPAREN	
new	TokenNamenew	
Directory	TokenNameIdentifier	 Directory
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentParent	TokenNameIdentifier	 current Parent
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// skip 	TokenNameCOMMENT_LINE	skip 
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setFromUri	TokenNameIdentifier	 set From Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fromUri	TokenNameIdentifier	 from Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fromUri	TokenNameIdentifier	 from Uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
FROM_ATTRS	TokenNameIdentifier	 FROM  ATTRS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fromUri	TokenNameIdentifier	 from Uri
=	TokenNameEQUAL	
fromUri	TokenNameIdentifier	 from Uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setToUri	TokenNameIdentifier	 set To Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toUri	TokenNameIdentifier	 to Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
toUri	TokenNameIdentifier	 to Uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
TO_ATTRS	TokenNameIdentifier	 TO  ATTRS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toUri	TokenNameIdentifier	 to Uri
=	TokenNameEQUAL	
toUri	TokenNameIdentifier	 to Uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
exactlyOne	TokenNameIdentifier	 exactly One
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrs	TokenNameIdentifier	 attrs
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
alt	TokenNameIdentifier	 alt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Exactly one of "	TokenNameStringLiteral	Exactly one of 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alt	TokenNameIdentifier	 alt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" or "	TokenNameStringLiteral	 or 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
alt	TokenNameIdentifier	 alt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" is required."	TokenNameStringLiteral	 is required.
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
