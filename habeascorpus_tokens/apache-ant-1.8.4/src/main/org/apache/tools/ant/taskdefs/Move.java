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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
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
FilterSet	TokenNameIdentifier	 Filter Set
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
FilterSetCollection	TokenNameIdentifier	 Filter Set Collection
;	TokenNameSEMICOLON	
/** * Moves a file or directory to a new file or directory. * By default, the * destination file is overwritten if it already exists. * When <i>overwrite</i> is * turned off, then files are only moved if the source file is * newer than the destination file, or when the destination file does * not exist. * * <p>Source files and directories are only deleted when the file or * directory has been copied to the destination successfully. Filtering * also works.</p> * * <p>This implementation is based on Arnout Kuiper's initial design * document, the following mailing list discussions, and the * copyfile/copydir tasks.</p> * * @since Ant 1.2 * * @ant.task category="filesystem" */	TokenNameCOMMENT_JAVADOC	 Moves a file or directory to a new file or directory. By default, the destination file is overwritten if it already exists. When <i>overwrite</i> is turned off, then files are only moved if the source file is newer than the destination file, or when the destination file does not exist. * <p>Source files and directories are only deleted when the file or directory has been copied to the destination successfully. Filtering also works.</p> * <p>This implementation is based on Arnout Kuiper's initial design document, the following mailing list discussions, and the copyfile/copydir tasks.</p> * @since Ant 1.2 * @ant.task category="filesystem" 
public	TokenNamepublic	
class	TokenNameclass	
Move	TokenNameIdentifier	 Move
extends	TokenNameextends	
Copy	TokenNameIdentifier	 Copy
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
performGc	TokenNameIdentifier	 perform Gc
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructor of object. * This sets the forceOverwrite attribute of the Copy parent class * to true. * */	TokenNameCOMMENT_JAVADOC	 Constructor of object. This sets the forceOverwrite attribute of the Copy parent class to true. 
public	TokenNamepublic	
Move	TokenNameIdentifier	 Move
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOverwrite	TokenNameIdentifier	 set Overwrite
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to perform a garbage collection before retrying a failed delete. * * <p>This may be required on Windows (where it is set to true by * default) but also on other operating systems, for example when * deleting directories from an NFS share.</p> * * @since Ant 1.8.3 */	TokenNameCOMMENT_JAVADOC	 Whether to perform a garbage collection before retrying a failed delete. * <p>This may be required on Windows (where it is set to true by default) but also on other operating systems, for example when deleting directories from an NFS share.</p> * @since Ant 1.8.3 
public	TokenNamepublic	
void	TokenNamevoid	
setPerformGcOnFailedDelete	TokenNameIdentifier	 set Perform Gc On Failed Delete
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
performGc	TokenNameIdentifier	 perform Gc
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
void	TokenNamevoid	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
destDir	TokenNameIdentifier	 dest Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
destDir	TokenNameIdentifier	 dest Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"One and only one of tofile and todir must be set."	TokenNameStringLiteral	One and only one of tofile and todir must be set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
destFile	TokenNameIdentifier	 dest File
=	TokenNameEQUAL	
destFile	TokenNameIdentifier	 dest File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
destFile	TokenNameIdentifier	 dest File
;	TokenNameSEMICOLON	
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
destDir	TokenNameIdentifier	 dest Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
destDir	TokenNameIdentifier	 dest Dir
;	TokenNameSEMICOLON	
completeDirMap	TokenNameIdentifier	 complete Dir Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
validateAttributes	TokenNameIdentifier	 validate Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// protected and private methods 	TokenNameCOMMENT_LINE	protected and private methods 
//************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
/** * Override copy's doFileOperations to move the files instead of copying them. */	TokenNameCOMMENT_JAVADOC	 Override copy's doFileOperations to move the files instead of copying them. 
protected	TokenNameprotected	
void	TokenNamevoid	
doFileOperations	TokenNameIdentifier	 do File Operations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Attempt complete directory renames, if any, first. 	TokenNameCOMMENT_LINE	Attempt complete directory renames, if any, first. 
if	TokenNameif	
(	TokenNameLPAREN	
completeDirMap	TokenNameIdentifier	 complete Dir Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
fromDirs	TokenNameIdentifier	 from Dirs
=	TokenNameEQUAL	
completeDirMap	TokenNameIdentifier	 complete Dir Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromDirs	TokenNameIdentifier	 from Dirs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
fromDir	TokenNameIdentifier	 from Dir
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
fromDirs	TokenNameIdentifier	 from Dirs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
toDir	TokenNameIdentifier	 to Dir
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
completeDirMap	TokenNameIdentifier	 complete Dir Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fromDir	TokenNameIdentifier	 from Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
renamed	TokenNameIdentifier	 renamed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Attempting to rename dir: "	TokenNameStringLiteral	Attempting to rename dir: 
+	TokenNamePLUS	
fromDir	TokenNameIdentifier	 from Dir
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
toDir	TokenNameIdentifier	 to Dir
,	TokenNameCOMMA	
verbosity	TokenNameIdentifier	 verbosity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renamed	TokenNameIdentifier	 renamed
=	TokenNameEQUAL	
renameFile	TokenNameIdentifier	 rename File
(	TokenNameLPAREN	
fromDir	TokenNameIdentifier	 from Dir
,	TokenNameCOMMA	
toDir	TokenNameIdentifier	 to Dir
,	TokenNameCOMMA	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
forceOverwrite	TokenNameIdentifier	 force Overwrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed to rename dir "	TokenNameStringLiteral	Failed to rename dir 
+	TokenNamePLUS	
fromDir	TokenNameIdentifier	 from Dir
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
toDir	TokenNameIdentifier	 to Dir
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
renamed	TokenNameIdentifier	 renamed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
fromDir	TokenNameIdentifier	 from Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
fromDir	TokenNameIdentifier	 from Dir
,	TokenNameCOMMA	
toDir	TokenNameIdentifier	 to Dir
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
moveCount	TokenNameIdentifier	 move Count
=	TokenNameEQUAL	
fileCopyMap	TokenNameIdentifier	 file Copy Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
moveCount	TokenNameIdentifier	 move Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// files to move 	TokenNameCOMMENT_LINE	files to move 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Moving "	TokenNameStringLiteral	Moving 
+	TokenNamePLUS	
moveCount	TokenNameIdentifier	 move Count
+	TokenNamePLUS	
" file"	TokenNameStringLiteral	 file
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
moveCount	TokenNameIdentifier	 move Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
destDir	TokenNameIdentifier	 dest Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
fromFiles	TokenNameIdentifier	 from Files
=	TokenNameEQUAL	
fileCopyMap	TokenNameIdentifier	 file Copy Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromFiles	TokenNameIdentifier	 from Files
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fromFile	TokenNameIdentifier	 from File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fromFiles	TokenNameIdentifier	 from Files
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
selfMove	TokenNameIdentifier	 self Move
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Is this file still available to be moved? 	TokenNameCOMMENT_LINE	Is this file still available to be moved? 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toFiles	TokenNameIdentifier	 to Files
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
fileCopyMap	TokenNameIdentifier	 file Copy Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
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
toFiles	TokenNameIdentifier	 to Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
toFile	TokenNameIdentifier	 to File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
toFiles	TokenNameIdentifier	 to Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
toFile	TokenNameIdentifier	 to File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Skipping self-move of "	TokenNameStringLiteral	Skipping self-move of 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
verbosity	TokenNameIdentifier	 verbosity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selfMove	TokenNameIdentifier	 self Move
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// if this is the last time through the loop then 	TokenNameCOMMENT_LINE	if this is the last time through the loop then 
// move will not occur, but that's what we want 	TokenNameCOMMENT_LINE	move will not occur, but that's what we want 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
toFile	TokenNameIdentifier	 to File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
toFiles	TokenNameIdentifier	 to Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
selfMove	TokenNameIdentifier	 self Move
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only try to move if this is the last mapped file 	TokenNameCOMMENT_LINE	Only try to move if this is the last mapped file 
// and one of the mappings isn't to itself 	TokenNameCOMMENT_LINE	and one of the mappings isn't to itself 
moveFile	TokenNameIdentifier	 move File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
forceOverwrite	TokenNameIdentifier	 force Overwrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
forceOverwrite	TokenNameIdentifier	 force Overwrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includeEmpty	TokenNameIdentifier	 include Empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
createCount	TokenNameIdentifier	 create Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
fromDirNames	TokenNameIdentifier	 from Dir Names
=	TokenNameEQUAL	
dirCopyMap	TokenNameIdentifier	 dir Copy Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromDirNames	TokenNameIdentifier	 from Dir Names
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fromDirName	TokenNameIdentifier	 from Dir Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fromDirNames	TokenNameIdentifier	 from Dir Names
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toDirNames	TokenNameIdentifier	 to Dir Names
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
dirCopyMap	TokenNameIdentifier	 dir Copy Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fromDirName	TokenNameIdentifier	 from Dir Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
selfMove	TokenNameIdentifier	 self Move
=	TokenNameEQUAL	
false	TokenNamefalse	
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
toDirNames	TokenNameIdentifier	 to Dir Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromDirName	TokenNameIdentifier	 from Dir Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
toDirNames	TokenNameIdentifier	 to Dir Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Skipping self-move of "	TokenNameStringLiteral	Skipping self-move of 
+	TokenNamePLUS	
fromDirName	TokenNameIdentifier	 from Dir Name
,	TokenNameCOMMA	
verbosity	TokenNameIdentifier	 verbosity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selfMove	TokenNameIdentifier	 self Move
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
toDirNames	TokenNameIdentifier	 to Dir Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to create directory "	TokenNameStringLiteral	Unable to create directory 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
createCount	TokenNameIdentifier	 create Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
fromDir	TokenNameIdentifier	 from Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fromDirName	TokenNameIdentifier	 from Dir Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
selfMove	TokenNameIdentifier	 self Move
&&	TokenNameAND_AND	
okToDelete	TokenNameIdentifier	 ok To Delete
(	TokenNameLPAREN	
fromDir	TokenNameIdentifier	 from Dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteDir	TokenNameIdentifier	 delete Dir
(	TokenNameLPAREN	
fromDir	TokenNameIdentifier	 from Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
createCount	TokenNameIdentifier	 create Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Moved "	TokenNameStringLiteral	Moved 
+	TokenNamePLUS	
dirCopyMap	TokenNameIdentifier	 dir Copy Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" empty director"	TokenNameStringLiteral	 empty director
+	TokenNamePLUS	
(	TokenNameLPAREN	
dirCopyMap	TokenNameIdentifier	 dir Copy Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"y"	TokenNameStringLiteral	y
:	TokenNameCOLON	
"ies"	TokenNameStringLiteral	ies
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
createCount	TokenNameIdentifier	 create Count
+	TokenNamePLUS	
" empty director"	TokenNameStringLiteral	 empty director
+	TokenNamePLUS	
(	TokenNameLPAREN	
createCount	TokenNameIdentifier	 create Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"y"	TokenNameStringLiteral	y
:	TokenNameCOLON	
"ies"	TokenNameStringLiteral	ies
)	TokenNameRPAREN	
+	TokenNamePLUS	
" under "	TokenNameStringLiteral	 under 
+	TokenNamePLUS	
destDir	TokenNameIdentifier	 dest Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Try to move the file via a rename, but if this fails or filtering * is enabled, copy the file then delete the sourceFile. */	TokenNameCOMMENT_JAVADOC	 Try to move the file via a rename, but if this fails or filtering is enabled, copy the file then delete the sourceFile. 
private	TokenNameprivate	
void	TokenNamevoid	
moveFile	TokenNameIdentifier	 move File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
boolean	TokenNameboolean	
overwrite	TokenNameIdentifier	 overwrite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
moved	TokenNameIdentifier	 moved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Attempting to rename: "	TokenNameStringLiteral	Attempting to rename: 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
verbosity	TokenNameIdentifier	 verbosity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
moved	TokenNameIdentifier	 moved
=	TokenNameEQUAL	
renameFile	TokenNameIdentifier	 rename File
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
forceOverwrite	TokenNameIdentifier	 force Overwrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed to rename "	TokenNameStringLiteral	Failed to rename 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
toFile	TokenNameIdentifier	 to File
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
moved	TokenNameIdentifier	 moved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
overwrite	TokenNameIdentifier	 overwrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryHardToDelete	TokenNameIdentifier	 try Hard To Delete
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
performGc	TokenNameIdentifier	 perform Gc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to delete "	TokenNameStringLiteral	Unable to delete 
+	TokenNamePLUS	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy fromFile to toFile. * @param fromFile * @param toFile * @param filtering * @param overwrite */	TokenNameCOMMENT_JAVADOC	 Copy fromFile to toFile. @param fromFile @param toFile @param filtering @param overwrite 
private	TokenNameprivate	
void	TokenNamevoid	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
boolean	TokenNameboolean	
overwrite	TokenNameIdentifier	 overwrite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Copying "	TokenNameStringLiteral	Copying 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
verbosity	TokenNameIdentifier	 verbosity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterSetCollection	TokenNameIdentifier	 Filter Set Collection
executionFilters	TokenNameIdentifier	 execution Filters
=	TokenNameEQUAL	
new	TokenNamenew	
FilterSetCollection	TokenNameIdentifier	 Filter Set Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filtering	TokenNameIdentifier	 filtering
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executionFilters	TokenNameIdentifier	 execution Filters
.	TokenNameDOT	
addFilterSet	TokenNameIdentifier	 add Filter Set
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalFilterSet	TokenNameIdentifier	 get Global Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
filterIter	TokenNameIdentifier	 filter Iter
=	TokenNameEQUAL	
getFilterSets	TokenNameIdentifier	 get Filter Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterIter	TokenNameIdentifier	 filter Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executionFilters	TokenNameIdentifier	 execution Filters
.	TokenNameDOT	
addFilterSet	TokenNameIdentifier	 add Filter Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
filterIter	TokenNameIdentifier	 filter Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
,	TokenNameCOMMA	
toFile	TokenNameIdentifier	 to File
,	TokenNameCOMMA	
executionFilters	TokenNameIdentifier	 execution Filters
,	TokenNameCOMMA	
getFilterChains	TokenNameIdentifier	 get Filter Chains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
forceOverwrite	TokenNameIdentifier	 force Overwrite
,	TokenNameCOMMA	
getPreserveLastModified	TokenNameIdentifier	 get Preserve Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/* append: */	TokenNameCOMMENT_BLOCK	 append: 
false	TokenNamefalse	
,	TokenNameCOMMA	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getOutputEncoding	TokenNameIdentifier	 get Output Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getForce	TokenNameIdentifier	 get Force
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
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed to copy "	TokenNameStringLiteral	Failed to copy 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
toFile	TokenNameIdentifier	 to File
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Its only ok to delete a directory tree if there are no files in it. * @param d the directory to check * @return true if a deletion can go ahead */	TokenNameCOMMENT_JAVADOC	 Its only ok to delete a directory tree if there are no files in it. @param d the directory to check @return true if a deletion can go ahead 
protected	TokenNameprotected	
boolean	TokenNameboolean	
okToDelete	TokenNameIdentifier	 ok To Delete
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// maybe io error? 	TokenNameCOMMENT_LINE	maybe io error? 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
okToDelete	TokenNameIdentifier	 ok To Delete
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// found a file 	TokenNameCOMMENT_LINE	found a file 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Go and delete the directory tree. * @param d the directory to delete */	TokenNameCOMMENT_JAVADOC	 Go and delete the directory tree. @param d the directory to delete 
protected	TokenNameprotected	
void	TokenNamevoid	
deleteDir	TokenNameIdentifier	 delete Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteDir	TokenNameIdentifier	 delete Dir
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Go and delete the directory tree. * @param d the directory to delete * @param deleteFiles whether to delete files */	TokenNameCOMMENT_JAVADOC	 Go and delete the directory tree. @param d the directory to delete @param deleteFiles whether to delete files 
protected	TokenNameprotected	
void	TokenNamevoid	
deleteDir	TokenNameIdentifier	 delete Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deleteFiles	TokenNameIdentifier	 delete Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// on an io error list() can return null 	TokenNameCOMMENT_LINE	on an io error list() can return null 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteDir	TokenNameIdentifier	 delete Dir
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
deleteFiles	TokenNameIdentifier	 delete Files
&&	TokenNameAND_AND	
!	TokenNameNOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryHardToDelete	TokenNameIdentifier	 try Hard To Delete
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
performGc	TokenNameIdentifier	 perform Gc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to delete file "	TokenNameStringLiteral	Unable to delete file 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
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
"UNEXPECTED ERROR - The file "	TokenNameStringLiteral	UNEXPECTED ERROR - The file 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should not exist!"	TokenNameStringLiteral	 should not exist!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Deleting directory "	TokenNameStringLiteral	Deleting directory 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
verbosity	TokenNameIdentifier	 verbosity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryHardToDelete	TokenNameIdentifier	 try Hard To Delete
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
performGc	TokenNameIdentifier	 perform Gc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to delete directory "	TokenNameStringLiteral	Unable to delete directory 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Attempts to rename a file from a source to a destination. * If overwrite is set to true, this method overwrites existing file * even if the destination file is newer. Otherwise, the source file is * renamed only if the destination file is older than it. * Method then checks if token filtering is used. If it is, this method * returns false assuming it is the responsibility to the copyFile method. * * @param sourceFile the file to rename * @param destFile the destination file * @param filtering if true, filtering is in operation, file will * be copied/deleted instead of renamed * @param overwrite if true force overwrite even if destination file * is newer than source file * @return true if the file was renamed * @exception IOException if an error occurs * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Attempts to rename a file from a source to a destination. If overwrite is set to true, this method overwrites existing file even if the destination file is newer. Otherwise, the source file is renamed only if the destination file is older than it. Method then checks if token filtering is used. If it is, this method returns false assuming it is the responsibility to the copyFile method. * @param sourceFile the file to rename @param destFile the destination file @param filtering if true, filtering is in operation, file will be copied/deleted instead of renamed @param overwrite if true force overwrite even if destination file is newer than source file @return true if the file was renamed @exception IOException if an error occurs @exception BuildException if an error occurs 
protected	TokenNameprotected	
boolean	TokenNameboolean	
renameFile	TokenNameIdentifier	 rename File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filtering	TokenNameIdentifier	 filtering
,	TokenNameCOMMA	
boolean	TokenNameboolean	
overwrite	TokenNameIdentifier	 overwrite
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
filtering	TokenNameIdentifier	 filtering
||	TokenNameOR_OR	
getFilterSets	TokenNameIdentifier	 get Filter Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
getFilterChains	TokenNameIdentifier	 get Filter Chains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// identical logic lives in ResourceUtils.copyResource(): 	TokenNameCOMMENT_LINE	identical logic lives in ResourceUtils.copyResource(): 
if	TokenNameif	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getForce	TokenNameIdentifier	 get Force
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"can't replace read-only destination "	TokenNameStringLiteral	can't replace read-only destination 
+	TokenNamePLUS	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryHardToDelete	TokenNameIdentifier	 try Hard To Delete
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"failed to delete read-only "	TokenNameStringLiteral	failed to delete read-only 
+	TokenNamePLUS	
"destination file "	TokenNameStringLiteral	destination file 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// identical logic lives in FileUtils.rename(): 	TokenNameCOMMENT_LINE	identical logic lives in FileUtils.rename(): 
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sourceFile	TokenNameIdentifier	 source File
=	TokenNameEQUAL	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalFile	TokenNameIdentifier	 get Canonical File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destFile	TokenNameIdentifier	 dest File
=	TokenNameEQUAL	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//no point in renaming a file to its own canonical version... 	TokenNameCOMMENT_LINE	no point in renaming a file to its own canonical version... 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Rename of "	TokenNameStringLiteral	Rename of 
+	TokenNamePLUS	
sourceFile	TokenNameIdentifier	 source File
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
+	TokenNamePLUS	
" is a no-op."	TokenNameStringLiteral	 is a no-op.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
areSame	TokenNameIdentifier	 are Same
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
||	TokenNameOR_OR	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tryHardToDelete	TokenNameIdentifier	 try Hard To Delete
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
,	TokenNameCOMMA	
performGc	TokenNameIdentifier	 perform Gc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to remove existing file "	TokenNameStringLiteral	Unable to remove existing file 
+	TokenNamePLUS	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
