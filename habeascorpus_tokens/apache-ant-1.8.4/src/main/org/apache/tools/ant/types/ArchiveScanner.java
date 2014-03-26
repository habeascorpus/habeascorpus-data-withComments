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
types	TokenNameIdentifier	 types
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
Map	TokenNameIdentifier	 Map
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
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResource	TokenNameIdentifier	 File Resource
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResourceIterator	TokenNameIdentifier	 File Resource Iterator
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileProvider	TokenNameIdentifier	 File Provider
;	TokenNameSEMICOLON	
/** * ArchiveScanner accesses the pattern matching algorithm in DirectoryScanner, * which are protected methods that can only be accessed by subclassing. * * This implementation of FileScanner defines getIncludedFiles to return * the matching archive entries. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 ArchiveScanner accesses the pattern matching algorithm in DirectoryScanner, which are protected methods that can only be accessed by subclassing. * This implementation of FileScanner defines getIncludedFiles to return the matching archive entries. * @since Ant 1.7 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
extends	TokenNameextends	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * The archive file which should be scanned. */	TokenNameCOMMENT_JAVADOC	 The archive file which should be scanned. 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * The archive resource which should be scanned. */	TokenNameCOMMENT_JAVADOC	 The archive resource which should be scanned. 
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
/** * to record the last scanned zip file with its modification date */	TokenNameCOMMENT_JAVADOC	 to record the last scanned zip file with its modification date 
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
lastScannedResource	TokenNameIdentifier	 last Scanned Resource
;	TokenNameSEMICOLON	
/** * record list of all file zip entries */	TokenNameCOMMENT_JAVADOC	 record list of all file zip entries 
private	TokenNameprivate	
TreeMap	TokenNameIdentifier	 Tree Map
fileEntries	TokenNameIdentifier	 file Entries
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * record list of all directory zip entries */	TokenNameCOMMENT_JAVADOC	 record list of all directory zip entries 
private	TokenNameprivate	
TreeMap	TokenNameIdentifier	 Tree Map
dirEntries	TokenNameIdentifier	 dir Entries
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * record list of matching file zip entries */	TokenNameCOMMENT_JAVADOC	 record list of matching file zip entries 
private	TokenNameprivate	
TreeMap	TokenNameIdentifier	 Tree Map
matchFileEntries	TokenNameIdentifier	 match File Entries
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * record list of matching directory zip entries */	TokenNameCOMMENT_JAVADOC	 record list of matching directory zip entries 
private	TokenNameprivate	
TreeMap	TokenNameIdentifier	 Tree Map
matchDirEntries	TokenNameIdentifier	 match Dir Entries
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * encoding of file names. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 encoding of file names. * @since Ant 1.6 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
/** * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.8.0 
private	TokenNameprivate	
boolean	TokenNameboolean	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Sets whether an error is thrown if an archive does not exist. * * @param errorOnMissingArchive true if missing archives cause errors, * false if not. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets whether an error is thrown if an archive does not exist. * @param errorOnMissingArchive true if missing archives cause errors, false if not. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorOnMissingArchive	TokenNameIdentifier	 set Error On Missing Archive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
=	TokenNameEQUAL	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Don't scan when we have no zipfile. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Don't scan when we have no zipfile. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the srcFile for scanning. This is the jar or zip file that * is scanned for matching entries. * * @param srcFile the (non-null) archive file name for scanning */	TokenNameCOMMENT_JAVADOC	 Sets the srcFile for scanning. This is the jar or zip file that is scanned for matching entries. * @param srcFile the (non-null) archive file name for scanning 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the src for scanning. This is the jar or zip file that * is scanned for matching entries. * * @param src the (non-null) archive resource */	TokenNameCOMMENT_JAVADOC	 Sets the src for scanning. This is the jar or zip file that is scanned for matching entries. * @param src the (non-null) archive resource 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
FileProvider	TokenNameIdentifier	 File Provider
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcFile	TokenNameIdentifier	 src File
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets encoding of file names. * @param encoding the encoding format * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Sets encoding of file names. @param encoding the encoding format @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the names of the files which matched at least one of the * include patterns and none of the exclude patterns. * The names are relative to the base directory. * * @return the names of the files which matched at least one of the * include patterns and none of the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the files which matched at least one of the include patterns and none of the exclude patterns. The names are relative to the base directory. * @return the names of the files which matched at least one of the include patterns and none of the exclude patterns. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
matchFileEntries	TokenNameIdentifier	 match File Entries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override parent implementation. * @return count of included files. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Override parent implementation. @return count of included files. @since Ant 1.7 
public	TokenNamepublic	
int	TokenNameint	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchFileEntries	TokenNameIdentifier	 match File Entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the names of the directories which matched at least one of the * include patterns and none of the exclude patterns. * The names are relative to the base directory. * * @return the names of the directories which matched at least one of the * include patterns and none of the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the directories which matched at least one of the include patterns and none of the exclude patterns. The names are relative to the base directory. * @return the names of the directories which matched at least one of the include patterns and none of the exclude patterns. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
matchDirEntries	TokenNameIdentifier	 match Dir Entries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override parent implementation. * @return count of included directories. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Override parent implementation. @return count of included directories. @since Ant 1.7 
public	TokenNamepublic	
int	TokenNameint	
getIncludedDirsCount	TokenNameIdentifier	 get Included Dirs Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getIncludedDirsCount	TokenNameIdentifier	 get Included Dirs Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchDirEntries	TokenNameIdentifier	 match Dir Entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the set of Resources that represent files. * @param project since Ant 1.8 * @return an Iterator of Resources. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the set of Resources that represent files. @param project since Ant 1.8 @return an Iterator of Resources. @since Ant 1.7 
/* package-private for now */	TokenNameCOMMENT_BLOCK	 package-private for now 
Iterator	TokenNameIdentifier	 Iterator
getResourceFiles	TokenNameIdentifier	 get Resource Files
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FileResourceIterator	TokenNameIdentifier	 File Resource Iterator
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchFileEntries	TokenNameIdentifier	 match File Entries
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the set of Resources that represent directories. * @param project since Ant 1.8 * @return an Iterator of Resources. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the set of Resources that represent directories. @param project since Ant 1.8 @return an Iterator of Resources. @since Ant 1.7 
/* package-private for now */	TokenNameCOMMENT_BLOCK	 package-private for now 
Iterator	TokenNameIdentifier	 Iterator
getResourceDirectories	TokenNameIdentifier	 get Resource Directories
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FileResourceIterator	TokenNameIdentifier	 File Resource Iterator
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchDirEntries	TokenNameIdentifier	 match Dir Entries
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize DirectoryScanner data structures. */	TokenNameCOMMENT_JAVADOC	 Initialize DirectoryScanner data structures. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No includes supplied, so set it to 'matches all' 	TokenNameCOMMENT_LINE	No includes supplied, so set it to 'matches all' 
includes	TokenNameIdentifier	 includes
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
includes	TokenNameIdentifier	 includes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"**"	TokenNameStringLiteral	**
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
excludes	TokenNameIdentifier	 excludes
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Matches a jar entry against the includes/excludes list, * normalizing the path separator. * * @param path the (non-null) path name to test for inclusion * * @return <code>true</code> if the path should be included * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Matches a jar entry against the includes/excludes list, normalizing the path separator. * @param path the (non-null) path name to test for inclusion * @return <code>true</code> if the path should be included <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
vpath	TokenNameIdentifier	 vpath
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
isIncluded	TokenNameIdentifier	 is Included
(	TokenNameLPAREN	
vpath	TokenNameIdentifier	 vpath
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isExcluded	TokenNameIdentifier	 is Excluded
(	TokenNameLPAREN	
vpath	TokenNameIdentifier	 vpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the named Resource. * @param name path name of the file sought in the archive * @return the resource * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Get the named Resource. @param name path name of the file sought in the archive @return the resource @since Ant 1.5.2 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// special case in ZIPs, we do not want this thing included 	TokenNameCOMMENT_LINE	special case in ZIPs, we do not want this thing included 
return	TokenNamereturn	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// first check if the archive needs to be scanned again 	TokenNameCOMMENT_LINE	first check if the archive needs to be scanned again 
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileEntries	TokenNameIdentifier	 file Entries
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
fileEntries	TokenNameIdentifier	 file Entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
trimSeparator	TokenNameIdentifier	 trim Separator
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dirEntries	TokenNameIdentifier	 dir Entries
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
dirEntries	TokenNameIdentifier	 dir Entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fills the file and directory maps with resources read from the archive. * * @param archive the archive to scan. * @param encoding encoding used to encode file names inside the archive. * @param fileEntries Map (name to resource) of non-directory * resources found inside the archive. * @param matchFileEntries Map (name to resource) of non-directory * resources found inside the archive that matched all include * patterns and didn't match any exclude patterns. * @param dirEntries Map (name to resource) of directory * resources found inside the archive. * @param matchDirEntries Map (name to resource) of directory * resources found inside the archive that matched all include * patterns and didn't match any exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Fills the file and directory maps with resources read from the archive. * @param archive the archive to scan. @param encoding encoding used to encode file names inside the archive. @param fileEntries Map (name to resource) of non-directory resources found inside the archive. @param matchFileEntries Map (name to resource) of non-directory resources found inside the archive that matched all include patterns and didn't match any exclude patterns. @param dirEntries Map (name to resource) of directory resources found inside the archive. @param matchDirEntries Map (name to resource) of directory resources found inside the archive that matched all include patterns and didn't match any exclude patterns. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
fillMapsFromArchive	TokenNameIdentifier	 fill Maps From Archive
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
archive	TokenNameIdentifier	 archive
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
fileEntries	TokenNameIdentifier	 file Entries
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
matchFileEntries	TokenNameIdentifier	 match File Entries
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
dirEntries	TokenNameIdentifier	 dir Entries
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
matchDirEntries	TokenNameIdentifier	 match Dir Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * if the datetime of the archive did not change since * lastScannedResource was initialized returns immediately else if * the archive has not been scanned yet, then all the zip entries * are put into the appropriate tables. */	TokenNameCOMMENT_JAVADOC	 if the datetime of the archive did not change since lastScannedResource was initialized returns immediately else if the archive has not been scanned yet, then all the zip entries are put into the appropriate tables. 
private	TokenNameprivate	
void	TokenNamevoid	
scanme	TokenNameIdentifier	 scanme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//do not use a FileResource b/c it pulls File info from the filesystem: 	TokenNameCOMMENT_LINE	do not use a FileResource b/c it pulls File info from the filesystem: 
Resource	TokenNameIdentifier	 Resource
thisresource	TokenNameIdentifier	 thisresource
=	TokenNameEQUAL	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// spare scanning again and again 	TokenNameCOMMENT_LINE	spare scanning again and again 
if	TokenNameif	
(	TokenNameLPAREN	
lastScannedResource	TokenNameIdentifier	 last Scanned Resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lastScannedResource	TokenNameIdentifier	 last Scanned Resource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
thisresource	TokenNameIdentifier	 thisresource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lastScannedResource	TokenNameIdentifier	 last Scanned Resource
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
thisresource	TokenNameIdentifier	 thisresource
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileEntries	TokenNameIdentifier	 file Entries
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirEntries	TokenNameIdentifier	 dir Entries
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchFileEntries	TokenNameIdentifier	 match File Entries
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchDirEntries	TokenNameIdentifier	 match Dir Entries
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fillMapsFromArchive	TokenNameIdentifier	 fill Maps From Archive
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
fileEntries	TokenNameIdentifier	 file Entries
,	TokenNameCOMMA	
matchFileEntries	TokenNameIdentifier	 match File Entries
,	TokenNameCOMMA	
dirEntries	TokenNameIdentifier	 dir Entries
,	TokenNameCOMMA	
matchDirEntries	TokenNameIdentifier	 match Dir Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// record data about the last scanned resource 	TokenNameCOMMENT_LINE	record data about the last scanned resource 
lastScannedResource	TokenNameIdentifier	 last Scanned Resource
=	TokenNameEQUAL	
thisresource	TokenNameIdentifier	 thisresource
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove trailing slash if present. * @param s the file name to trim. * @return the trimed file name. */	TokenNameCOMMENT_JAVADOC	 Remove trailing slash if present. @param s the file name to trim. @return the trimed file name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
trimSeparator	TokenNameIdentifier	 trim Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
?	TokenNameQUESTION	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
