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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
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
FileProvider	TokenNameIdentifier	 File Provider
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
UnixStat	TokenNameIdentifier	 Unix Stat
;	TokenNameSEMICOLON	
/** * A ArchiveFileSet is a FileSet with extra attributes useful in the * context of archiving tasks. * * It includes a prefix attribute which is prepended to each entry in * the output archive file as well as a fullpath attribute. It also * supports Unix file permissions for files and directories. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 A ArchiveFileSet is a FileSet with extra attributes useful in the context of archiving tasks. * It includes a prefix attribute which is prepended to each entry in the output archive file as well as a fullpath attribute. It also supports Unix file permissions for files and directories. * @since Ant 1.7 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
extends	TokenNameextends	
FileSet	TokenNameIdentifier	 File Set
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BASE_OCTAL	TokenNameIdentifier	 BASE  OCTAL
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default value for the dirmode attribute. * * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Default value for the dirmode attribute. * @since Ant 1.5.2 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_DIR_MODE	TokenNameIdentifier	 DEFAULT  DIR  MODE
=	TokenNameEQUAL	
UnixStat	TokenNameIdentifier	 Unix Stat
.	TokenNameDOT	
DIR_FLAG	TokenNameIdentifier	 DIR  FLAG
|	TokenNameOR	
UnixStat	TokenNameIdentifier	 Unix Stat
.	TokenNameDOT	
DEFAULT_DIR_PERM	TokenNameIdentifier	 DEFAULT  DIR  PERM
;	TokenNameSEMICOLON	
/** * Default value for the filemode attribute. * * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Default value for the filemode attribute. * @since Ant 1.5.2 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_FILE_MODE	TokenNameIdentifier	 DEFAULT  FILE  MODE
=	TokenNameEQUAL	
UnixStat	TokenNameIdentifier	 Unix Stat
.	TokenNameDOT	
FILE_FLAG	TokenNameIdentifier	 FILE  FLAG
|	TokenNameOR	
UnixStat	TokenNameIdentifier	 Unix Stat
.	TokenNameDOT	
DEFAULT_FILE_PERM	TokenNameIdentifier	 DEFAULT  FILE  PERM
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fullpath	TokenNameIdentifier	 fullpath
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasDir	TokenNameIdentifier	 has Dir
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fileMode	TokenNameIdentifier	 file Mode
=	TokenNameEQUAL	
DEFAULT_FILE_MODE	TokenNameIdentifier	 DEFAULT  FILE  MODE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
dirMode	TokenNameIdentifier	 dir Mode
=	TokenNameEQUAL	
DEFAULT_DIR_MODE	TokenNameIdentifier	 DEFAULT  DIR  MODE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_DIR_AND_SRC_ATTRIBUTES	TokenNameIdentifier	 ERROR  DIR  AND  SRC  ATTRIBUTES
=	TokenNameEQUAL	
"Cannot set both dir and src attributes"	TokenNameStringLiteral	Cannot set both dir and src attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_PATH_AND_PREFIX	TokenNameIdentifier	 ERROR  PATH  AND  PREFIX
=	TokenNameEQUAL	
"Cannot set both fullpath and prefix attributes"	TokenNameStringLiteral	Cannot set both fullpath and prefix attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Constructor for ArchiveFileSet */	TokenNameCOMMENT_JAVADOC	 Constructor for ArchiveFileSet 
public	TokenNamepublic	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor using a fileset arguement. * @param fileset the fileset to use */	TokenNameCOMMENT_JAVADOC	 Constructor using a fileset arguement. @param fileset the fileset to use 
protected	TokenNameprotected	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor using a archive fileset arguement. * @param fileset the archivefileset to use */	TokenNameCOMMENT_JAVADOC	 Constructor using a archive fileset arguement. @param fileset the archivefileset to use 
protected	TokenNameprotected	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
fullpath	TokenNameIdentifier	 fullpath
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
fullpath	TokenNameIdentifier	 fullpath
;	TokenNameSEMICOLON	
hasDir	TokenNameIdentifier	 has Dir
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
hasDir	TokenNameIdentifier	 has Dir
;	TokenNameSEMICOLON	
fileMode	TokenNameIdentifier	 file Mode
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
fileMode	TokenNameIdentifier	 file Mode
;	TokenNameSEMICOLON	
dirMode	TokenNameIdentifier	 dir Mode
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
dirMode	TokenNameIdentifier	 dir Mode
;	TokenNameSEMICOLON	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
;	TokenNameSEMICOLON	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
;	TokenNameSEMICOLON	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the directory for the fileset. * @param dir the directory for the fileset * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Set the directory for the fileset. @param dir the directory for the fileset @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_DIR_AND_SRC_ATTRIBUTES	TokenNameIdentifier	 ERROR  DIR  AND  SRC  ATTRIBUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasDir	TokenNameIdentifier	 has Dir
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the source Archive file for the archivefileset. Prevents both * "dir" and "src" from being specified. * @param a the archive as a single element Resource collection. */	TokenNameCOMMENT_JAVADOC	 Set the source Archive file for the archivefileset. Prevents both "dir" and "src" from being specified. @param a the archive as a single element Resource collection. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkChildrenAllowed	TokenNameIdentifier	 check Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"only single argument resource collections"	TokenNameStringLiteral	only single argument resource collections
+	TokenNamePLUS	
" are supported as archives"	TokenNameStringLiteral	 are supported as archives
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setSrcResource	TokenNameIdentifier	 set Src Resource
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the source Archive file for the archivefileset. Prevents both * "dir" and "src" from being specified. * * @param srcFile The archive from which to extract entries. */	TokenNameCOMMENT_JAVADOC	 Set the source Archive file for the archivefileset. Prevents both "dir" and "src" from being specified. * @param srcFile The archive from which to extract entries. 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSrcResource	TokenNameIdentifier	 set Src Resource
(	TokenNameLPAREN	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the source Archive file for the archivefileset. Prevents both * "dir" and "src" from being specified. * * @param src The archive from which to extract entries. */	TokenNameCOMMENT_JAVADOC	 Set the source Archive file for the archivefileset. Prevents both "dir" and "src" from being specified. * @param src The archive from which to extract entries. 
public	TokenNamepublic	
void	TokenNamevoid	
setSrcResource	TokenNameIdentifier	 set Src Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkArchiveAttributesAllowed	TokenNameIdentifier	 check Archive Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasDir	TokenNameIdentifier	 has Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_DIR_AND_SRC_ATTRIBUTES	TokenNameIdentifier	 ERROR  DIR  AND  SRC  ATTRIBUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the archive from which entries will be extracted. * @param p the project to use * @return the source file */	TokenNameCOMMENT_JAVADOC	 Get the archive from which entries will be extracted. @param p the project to use @return the source file 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether an error is thrown if an archive does not exist. * * @param errorOnMissingArchive true if missing archives cause errors, * false if not. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets whether an error is thrown if an archive does not exist. * @param errorOnMissingArchive true if missing archives cause errors, false if not. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorOnMissingArchive	TokenNameIdentifier	 set Error On Missing Archive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
=	TokenNameEQUAL	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the archive file from which entries will be extracted. * @return the archive in case the archive is a file, null otherwise. */	TokenNameCOMMENT_JAVADOC	 Get the archive file from which entries will be extracted. @return the archive in case the archive is a file, null otherwise. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check for circular references and returns the * referenced object. * This is an override which does not delegate to the superclass; instead it invokes * {@link #getRef(Project)}, because that conains the special support for fileset * references, which can be handled by all ArchiveFileSets. * @param p the Ant Project instance against which to resolve references. * @return the dereferenced object. * @throws BuildException if the reference is invalid (circular ref, wrong class, etc). * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced object. This is an override which does not delegate to the superclass; instead it invokes {@link #getRef(Project)}, because that conains the special support for fileset references, which can be handled by all ArchiveFileSets. @param p the Ant Project instance against which to resolve references. @return the dereferenced object. @throws BuildException if the reference is invalid (circular ref, wrong class, etc). @since Ant 1.8 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prepend this prefix to the path for each archive entry. * Prevents both prefix and fullpath from being specified * * @param prefix The prefix to prepend to entries in the archive file. */	TokenNameCOMMENT_JAVADOC	 Prepend this prefix to the path for each archive entry. Prevents both prefix and fullpath from being specified * @param prefix The prefix to prepend to entries in the archive file. 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkArchiveAttributesAllowed	TokenNameIdentifier	 check Archive Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fullpath	TokenNameIdentifier	 fullpath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_PATH_AND_PREFIX	TokenNameIdentifier	 ERROR  PATH  AND  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the prefix prepended to entries in the archive file. * @param p the project to use * @return the prefix */	TokenNameCOMMENT_JAVADOC	 Return the prefix prepended to entries in the archive file. @param p the project to use @return the prefix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the full pathname of the single entry in this fileset. * Prevents both prefix and fullpath from being specified * * @param fullpath the full pathname of the single entry in this fileset. */	TokenNameCOMMENT_JAVADOC	 Set the full pathname of the single entry in this fileset. Prevents both prefix and fullpath from being specified * @param fullpath the full pathname of the single entry in this fileset. 
public	TokenNamepublic	
void	TokenNamevoid	
setFullpath	TokenNameIdentifier	 set Fullpath
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fullpath	TokenNameIdentifier	 fullpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkArchiveAttributesAllowed	TokenNameIdentifier	 check Archive Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fullpath	TokenNameIdentifier	 fullpath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_PATH_AND_PREFIX	TokenNameIdentifier	 ERROR  PATH  AND  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fullpath	TokenNameIdentifier	 fullpath
=	TokenNameEQUAL	
fullpath	TokenNameIdentifier	 fullpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the full pathname of the single entry in this fileset. * @param p the project to use * @return the full path */	TokenNameCOMMENT_JAVADOC	 Return the full pathname of the single entry in this fileset. @param p the project to use @return the full path 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFullpath	TokenNameIdentifier	 get Fullpath
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFullpath	TokenNameIdentifier	 get Fullpath
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fullpath	TokenNameIdentifier	 fullpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a scanner for this type of archive. * @return the scanner. */	TokenNameCOMMENT_JAVADOC	 Creates a scanner for this type of archive. @return the scanner. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
newArchiveScanner	TokenNameIdentifier	 new Archive Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the DirectoryScanner associated with this FileSet. * If the ArchiveFileSet defines a source Archive file, then an ArchiveScanner * is returned instead. * @param p the project to use * @return a directory scanner */	TokenNameCOMMENT_JAVADOC	 Return the DirectoryScanner associated with this FileSet. If the ArchiveFileSet defines a source Archive file, then an ArchiveScanner is returned instead. @param p the project to use @return a directory scanner 
public	TokenNamepublic	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The archive "	TokenNameStringLiteral	The archive 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The archive "	TokenNameStringLiteral	The archive 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" can't be a directory"	TokenNameStringLiteral	 can't be a directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
newArchiveScanner	TokenNameIdentifier	 new Archive Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
setErrorOnMissingArchive	TokenNameIdentifier	 set Error On Missing Archive
(	TokenNameLPAREN	
errorOnMissingArchive	TokenNameIdentifier	 error On Missing Archive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupDirectoryScanner	TokenNameIdentifier	 setup Directory Scanner
(	TokenNameLPAREN	
as	TokenNameIdentifier	 as
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
as	TokenNameIdentifier	 as
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return Iterator of Resources. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return Iterator of Resources. @since Ant 1.7 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
)	TokenNameRPAREN	
(	TokenNameLPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
)	TokenNameRPAREN	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getResourceFiles	TokenNameIdentifier	 get Resource Files
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return size of the collection as int. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return size of the collection as int. @since Ant 1.7 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
)	TokenNameRPAREN	
(	TokenNameLPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
)	TokenNameRPAREN	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate whether this ResourceCollection is composed entirely of * Resources accessible via local filesystem conventions. If true, * all Resources returned from this ResourceCollection should be * instances of FileResource. * @return whether this is a filesystem-only resource collection. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Indicate whether this ResourceCollection is composed entirely of Resources accessible via local filesystem conventions. If true, all Resources returned from this ResourceCollection should be instances of FileResource. @return whether this is a filesystem-only resource collection. @since Ant 1.7 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A 3 digit octal string, specify the user, group and * other modes in the standard Unix fashion; * optional, default=0644 * @param octalString a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 A 3 digit octal string, specify the user, group and other modes in the standard Unix fashion; optional, default=0644 @param octalString a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setFileMode	TokenNameIdentifier	 set File Mode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
octalString	TokenNameIdentifier	 octal String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkArchiveAttributesAllowed	TokenNameIdentifier	 check Archive Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
integerSetFileMode	TokenNameIdentifier	 integer Set File Mode
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
octalString	TokenNameIdentifier	 octal String
,	TokenNameCOMMA	
BASE_OCTAL	TokenNameIdentifier	 BASE  OCTAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * specify the user, group and * other modes in the standard Unix fashion; * optional, default=0644 * * <p>We use the strange name so this method doesn't appear in * IntrospectionHelpers list of attribute setters.</p> * @param mode a <code>int</code> value * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 specify the user, group and other modes in the standard Unix fashion; optional, default=0644 * <p>We use the strange name so this method doesn't appear in IntrospectionHelpers list of attribute setters.</p> @param mode a <code>int</code> value @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
integerSetFileMode	TokenNameIdentifier	 integer Set File Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fileMode	TokenNameIdentifier	 file Mode
=	TokenNameEQUAL	
UnixStat	TokenNameIdentifier	 Unix Stat
.	TokenNameDOT	
FILE_FLAG	TokenNameIdentifier	 FILE  FLAG
|	TokenNameOR	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the mode of the archive fileset * @param p the project to use * @return the mode */	TokenNameCOMMENT_JAVADOC	 Get the mode of the archive fileset @param p the project to use @return the mode 
public	TokenNamepublic	
int	TokenNameint	
getFileMode	TokenNameIdentifier	 get File Mode
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFileMode	TokenNameIdentifier	 get File Mode
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fileMode	TokenNameIdentifier	 file Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the user has specified the mode explicitly. * @return true if it has been set */	TokenNameCOMMENT_JAVADOC	 Whether the user has specified the mode explicitly. @return true if it has been set 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFileModeBeenSet	TokenNameIdentifier	 has File Mode Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasFileModeBeenSet	TokenNameIdentifier	 has File Mode Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A 3 digit octal string, specify the user, group and * other modes in the standard Unix fashion; * optional, default=0755 * @param octalString a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 A 3 digit octal string, specify the user, group and other modes in the standard Unix fashion; optional, default=0755 @param octalString a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setDirMode	TokenNameIdentifier	 set Dir Mode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
octalString	TokenNameIdentifier	 octal String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkArchiveAttributesAllowed	TokenNameIdentifier	 check Archive Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
integerSetDirMode	TokenNameIdentifier	 integer Set Dir Mode
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
octalString	TokenNameIdentifier	 octal String
,	TokenNameCOMMA	
BASE_OCTAL	TokenNameIdentifier	 BASE  OCTAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * specify the user, group and * other modes in the standard Unix fashion; * optional, default=0755 * <p>We use the strange name so this method doesn't appear in * IntrospectionHelpers list of attribute setters.</p> * @param mode a <code>int</code> value * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 specify the user, group and other modes in the standard Unix fashion; optional, default=0755 <p>We use the strange name so this method doesn't appear in IntrospectionHelpers list of attribute setters.</p> @param mode a <code>int</code> value @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
integerSetDirMode	TokenNameIdentifier	 integer Set Dir Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dirMode	TokenNameIdentifier	 dir Mode
=	TokenNameEQUAL	
UnixStat	TokenNameIdentifier	 Unix Stat
.	TokenNameDOT	
DIR_FLAG	TokenNameIdentifier	 DIR  FLAG
|	TokenNameOR	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the dir mode of the archive fileset * @param p the project to use * @return the mode */	TokenNameCOMMENT_JAVADOC	 Get the dir mode of the archive fileset @param p the project to use @return the mode 
public	TokenNamepublic	
int	TokenNameint	
getDirMode	TokenNameIdentifier	 get Dir Mode
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDirMode	TokenNameIdentifier	 get Dir Mode
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dirMode	TokenNameIdentifier	 dir Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the user has specified the mode explicitly. * * @return true if it has been set */	TokenNameCOMMENT_JAVADOC	 Whether the user has specified the mode explicitly. * @return true if it has been set 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDirModeBeenSet	TokenNameIdentifier	 has Dir Mode Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasDirModeBeenSet	TokenNameIdentifier	 has Dir Mode Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A ArchiveFileset accepts another ArchiveFileSet or a FileSet as reference * FileSets are often used by the war task for the lib attribute * @param zfs the project to use */	TokenNameCOMMENT_JAVADOC	 A ArchiveFileset accepts another ArchiveFileSet or a FileSet as reference FileSets are often used by the war task for the lib attribute @param zfs the project to use 
protected	TokenNameprotected	
void	TokenNamevoid	
configureFileSet	TokenNameIdentifier	 configure File Set
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
zfs	TokenNameIdentifier	 zfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zfs	TokenNameIdentifier	 zfs
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zfs	TokenNameIdentifier	 zfs
.	TokenNameDOT	
setFullpath	TokenNameIdentifier	 set Fullpath
(	TokenNameLPAREN	
fullpath	TokenNameIdentifier	 fullpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zfs	TokenNameIdentifier	 zfs
.	TokenNameDOT	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
=	TokenNameEQUAL	
fileModeHasBeenSet	TokenNameIdentifier	 file Mode Has Been Set
;	TokenNameSEMICOLON	
zfs	TokenNameIdentifier	 zfs
.	TokenNameDOT	
fileMode	TokenNameIdentifier	 file Mode
=	TokenNameEQUAL	
fileMode	TokenNameIdentifier	 file Mode
;	TokenNameSEMICOLON	
zfs	TokenNameIdentifier	 zfs
.	TokenNameDOT	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
=	TokenNameEQUAL	
dirModeHasBeenSet	TokenNameIdentifier	 dir Mode Has Been Set
;	TokenNameSEMICOLON	
zfs	TokenNameIdentifier	 zfs
.	TokenNameDOT	
dirMode	TokenNameIdentifier	 dir Mode
=	TokenNameEQUAL	
dirMode	TokenNameIdentifier	 dir Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a ArchiveFileSet that has the same properties * as this one. * @return the cloned archiveFileSet * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Return a ArchiveFileSet that has the same properties as this one. @return the cloned archiveFileSet @since Ant 1.6 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For file-based archivefilesets, return the same as for normal filesets; * else just return the path of the zip. * @return for file based archivefilesets, included files as a list * of semicolon-separated filenames. else just the name of the zip. */	TokenNameCOMMENT_JAVADOC	 For file-based archivefilesets, return the same as for normal filesets; else just return the path of the zip. @return for file based archivefilesets, included files as a list of semicolon-separated filenames. else just the name of the zip. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasDir	TokenNameIdentifier	 has Dir
&&	TokenNameAND_AND	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the prefix prepended to entries in the archive file. * @return the prefix. * @deprecated since 1.7. */	TokenNameCOMMENT_JAVADOC	 Return the prefix prepended to entries in the archive file. @return the prefix. @deprecated since 1.7. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the full pathname of the single entryZ in this fileset. * @return the full pathname. * @deprecated since 1.7. */	TokenNameCOMMENT_JAVADOC	 Return the full pathname of the single entryZ in this fileset. @return the full pathname. @deprecated since 1.7. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFullpath	TokenNameIdentifier	 get Fullpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fullpath	TokenNameIdentifier	 fullpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the file mode. * @deprecated since 1.7. */	TokenNameCOMMENT_JAVADOC	 @return the file mode. @deprecated since 1.7. 
public	TokenNamepublic	
int	TokenNameint	
getFileMode	TokenNameIdentifier	 get File Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileMode	TokenNameIdentifier	 file Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the dir mode. * @deprecated since 1.7. */	TokenNameCOMMENT_JAVADOC	 @return the dir mode. @deprecated since 1.7. 
public	TokenNamepublic	
int	TokenNameint	
getDirMode	TokenNameIdentifier	 get Dir Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dirMode	TokenNameIdentifier	 dir Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A check attributes for archiveFileSet. * If there is a reference, and * it is a ArchiveFileSet, the archive fileset attributes * cannot be used. * (Note, we can only see if the reference is an archive * fileset if the project has been set). */	TokenNameCOMMENT_JAVADOC	 A check attributes for archiveFileSet. If there is a reference, and it is a ArchiveFileSet, the archive fileset attributes cannot be used. (Note, we can only see if the reference is an archive fileset if the project has been set). 
private	TokenNameprivate	
void	TokenNamevoid	
checkArchiveAttributesAllowed	TokenNameIdentifier	 check Archive Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// takes care of nested selectors 	TokenNameCOMMENT_LINE	takes care of nested selectors 
super	TokenNamesuper	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
