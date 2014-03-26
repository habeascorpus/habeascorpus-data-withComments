package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Combines multiple files into a single compound file. * The file format:<br> * <ul> * <li>VInt fileCount</li> * <li>{Directory} * fileCount entries with the following structure:</li> * <ul> * <li>long dataOffset</li> * <li>String fileName</li> * </ul> * <li>{File Data} * fileCount entries with the raw data of the corresponding file</li> * </ul> * * The fileCount integer indicates how many files are contained in this compound * file. The {directory} that follows has that many entries. Each directory entry * contains a long pointer to the start of this file's data section, and a String * with that file's name. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Combines multiple files into a single compound file. The file format:<br> <ul> <li>VInt fileCount</li> <li>{Directory} fileCount entries with the following structure:</li> <ul> <li>long dataOffset</li> <li>String fileName</li> </ul> <li>{File Data} fileCount entries with the raw data of the corresponding file</li> </ul> * The fileCount integer indicates how many files are contained in this compound file. The {directory} that follows has that many entries. Each directory entry contains a long pointer to the start of this file's data section, and a String with that file's name. * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
FileEntry	TokenNameIdentifier	 File Entry
{	TokenNameLBRACE	
/** source file */	TokenNameCOMMENT_JAVADOC	 source file 
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
/** temporary holder for the start of directory entry for this file */	TokenNameCOMMENT_JAVADOC	 temporary holder for the start of directory entry for this file 
long	TokenNamelong	
directoryOffset	TokenNameIdentifier	 directory Offset
;	TokenNameSEMICOLON	
/** temporary holder for the start of this file's data section */	TokenNameCOMMENT_JAVADOC	 temporary holder for the start of this file's data section 
long	TokenNamelong	
dataOffset	TokenNameIdentifier	 data Offset
;	TokenNameSEMICOLON	
/** the directory which contains the file. */	TokenNameCOMMENT_JAVADOC	 the directory which contains the file. 
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Before versioning started. 	TokenNameCOMMENT_LINE	Before versioning started. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_PRE_VERSION	TokenNameIdentifier	 FORMAT  PRE  VERSION
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Segment name is not written in the file names. 	TokenNameCOMMENT_LINE	Segment name is not written in the file names. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_NO_SEGMENT_PREFIX	TokenNameIdentifier	 FORMAT  NO  SEGMENT  PREFIX
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// NOTE: if you introduce a new format, make it 1 lower 	TokenNameCOMMENT_LINE	NOTE: if you introduce a new format, make it 1 lower 
// than the current one, and always change this if you 	TokenNameCOMMENT_LINE	than the current one, and always change this if you 
// switch to a new format! 	TokenNameCOMMENT_LINE	switch to a new format! 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
=	TokenNameEQUAL	
FORMAT_NO_SEGMENT_PREFIX	TokenNameIdentifier	 FORMAT  NO  SEGMENT  PREFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ids	TokenNameIdentifier	 ids
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
FileEntry	TokenNameIdentifier	 File Entry
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegmentMerger	TokenNameIdentifier	 Segment Merger
.	TokenNameDOT	
CheckAbort	TokenNameIdentifier	 Check Abort
checkAbort	TokenNameIdentifier	 check Abort
;	TokenNameSEMICOLON	
/** Create the compound stream in the specified file. The file name is the * entire name (no extensions are added). * @throws NullPointerException if <code>dir</code> or <code>name</code> is null */	TokenNameCOMMENT_JAVADOC	 Create the compound stream in the specified file. The file name is the entire name (no extensions are added). @throws NullPointerException if <code>dir</code> or <code>name</code> is null 
public	TokenNamepublic	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
SegmentMerger	TokenNameIdentifier	 Segment Merger
.	TokenNameDOT	
CheckAbort	TokenNameIdentifier	 Check Abort
checkAbort	TokenNameIdentifier	 check Abort
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"directory cannot be null"	TokenNameStringLiteral	directory cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"name cannot be null"	TokenNameStringLiteral	name cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
checkAbort	TokenNameIdentifier	 check Abort
=	TokenNameEQUAL	
checkAbort	TokenNameIdentifier	 check Abort
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
ids	TokenNameIdentifier	 ids
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
FileEntry	TokenNameIdentifier	 File Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the directory of the compound file. */	TokenNameCOMMENT_JAVADOC	 Returns the directory of the compound file. 
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the name of the compound file. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the compound file. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a source stream. <code>file</code> is the string by which the * sub-stream will be known in the compound stream. * * @throws IllegalStateException if this writer is closed * @throws NullPointerException if <code>file</code> is null * @throws IllegalArgumentException if a file with the same name * has been added already */	TokenNameCOMMENT_JAVADOC	 Add a source stream. <code>file</code> is the string by which the sub-stream will be known in the compound stream. * @throws IllegalStateException if this writer is closed @throws NullPointerException if <code>file</code> is null @throws IllegalArgumentException if a file with the same name has been added already 
public	TokenNamepublic	
void	TokenNamevoid	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Same as {@link #addFile(String)}, only for files that are found in an * external {@link Directory}. */	TokenNameCOMMENT_JAVADOC	 Same as {@link #addFile(String)}, only for files that are found in an external {@link Directory}. 
public	TokenNamepublic	
void	TokenNamevoid	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Can't add extensions after merge has been called"	TokenNameStringLiteral	Can't add extensions after merge has been called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"file cannot be null"	TokenNameStringLiteral	file cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ids	TokenNameIdentifier	 ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" already added"	TokenNameStringLiteral	 already added
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileEntry	TokenNameIdentifier	 File Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
FileEntry	TokenNameIdentifier	 File Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Merge files with the extensions added up to now. * All files with these extensions are combined sequentially into the * compound stream. * @throws IllegalStateException if close() had been called before or * if no file has been added to this object */	TokenNameCOMMENT_JAVADOC	 Merge files with the extensions added up to now. All files with these extensions are combined sequentially into the compound stream. @throws IllegalStateException if close() had been called before or if no file has been added to this object 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Merge already performed"	TokenNameStringLiteral	Merge already performed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No entries to merge have been defined"	TokenNameStringLiteral	No entries to merge have been defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// open the compound stream 	TokenNameCOMMENT_LINE	open the compound stream 
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOException	TokenNameIdentifier	 IO Exception
priorException	TokenNameIdentifier	 prior Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Write the Version info - must be a VInt because CFR reads a VInt 	TokenNameCOMMENT_LINE	Write the Version info - must be a VInt because CFR reads a VInt 
// in older versions! 	TokenNameCOMMENT_LINE	in older versions! 
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write the number of entries 	TokenNameCOMMENT_LINE	Write the number of entries 
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write the directory with all offsets at 0. 	TokenNameCOMMENT_LINE	Write the directory with all offsets at 0. 
// Remember the positions of directory entries so that we can 	TokenNameCOMMENT_LINE	Remember the positions of directory entries so that we can 
// adjust the offsets later 	TokenNameCOMMENT_LINE	adjust the offsets later 
long	TokenNamelong	
totalSize	TokenNameIdentifier	 total Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FileEntry	TokenNameIdentifier	 File Entry
fe	TokenNameIdentifier	 fe
:	TokenNameCOLON	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
directoryOffset	TokenNameIdentifier	 directory Offset
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for now 	TokenNameCOMMENT_LINE	for now 
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
stripSegmentName	TokenNameIdentifier	 strip Segment Name
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalSize	TokenNameIdentifier	 total Size
+=	TokenNamePLUS_EQUAL	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pre-allocate size of file as optimization -- 	TokenNameCOMMENT_LINE	Pre-allocate size of file as optimization -- 
// this can potentially help IO performance as 	TokenNameCOMMENT_LINE	this can potentially help IO performance as 
// we write the file and also later during 	TokenNameCOMMENT_LINE	we write the file and also later during 
// searching. It also uncovers a disk-full 	TokenNameCOMMENT_LINE	searching. It also uncovers a disk-full 
// situation earlier and hopefully without 	TokenNameCOMMENT_LINE	situation earlier and hopefully without 
// actually filling disk to 100%: 	TokenNameCOMMENT_LINE	actually filling disk to 100%: 
final	TokenNamefinal	
long	TokenNamelong	
finalLength	TokenNameIdentifier	 final Length
=	TokenNameEQUAL	
totalSize	TokenNameIdentifier	 total Size
+	TokenNamePLUS	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
finalLength	TokenNameIdentifier	 final Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Open the files and copy their data into the stream. 	TokenNameCOMMENT_LINE	Open the files and copy their data into the stream. 
// Remember the locations of each file's data section. 	TokenNameCOMMENT_LINE	Remember the locations of each file's data section. 
for	TokenNamefor	
(	TokenNameLPAREN	
FileEntry	TokenNameIdentifier	 File Entry
fe	TokenNameIdentifier	 fe
:	TokenNameCOLON	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
dataOffset	TokenNameIdentifier	 data Offset
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Write the data offsets into the directory of the compound stream 	TokenNameCOMMENT_LINE	Write the data offsets into the directory of the compound stream 
for	TokenNamefor	
(	TokenNameLPAREN	
FileEntry	TokenNameIdentifier	 File Entry
fe	TokenNameIdentifier	 fe
:	TokenNameCOLON	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
directoryOffset	TokenNameIdentifier	 directory Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
dataOffset	TokenNameIdentifier	 data Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
finalLength	TokenNameIdentifier	 final Length
==	TokenNameEQUAL_EQUAL	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Close the output stream. Set the os to null before trying to 	TokenNameCOMMENT_LINE	Close the output stream. Set the os to null before trying to 
// close so that if an exception occurs during the close, the 	TokenNameCOMMENT_LINE	close so that if an exception occurs during the close, the 
// finally clause below will not attempt to close the stream 	TokenNameCOMMENT_LINE	finally clause below will not attempt to close the stream 
// the second time. 	TokenNameCOMMENT_LINE	the second time. 
IndexOutput	TokenNameIdentifier	 Index Output
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
priorException	TokenNameIdentifier	 prior Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy the contents of the file with specified extension into the provided * output stream. */	TokenNameCOMMENT_JAVADOC	 Copy the contents of the file with specified extension into the provided output stream. 
private	TokenNameprivate	
void	TokenNamevoid	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
FileEntry	TokenNameIdentifier	 File Entry
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
long	TokenNamelong	
startPtr	TokenNameIdentifier	 start Ptr
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
checkAbort	TokenNameIdentifier	 check Abort
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAbort	TokenNameIdentifier	 check Abort
.	TokenNameDOT	
work	TokenNameIdentifier	 work
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Verify that the output length diff is equal to original file 	TokenNameCOMMENT_LINE	Verify that the output length diff is equal to original file 
long	TokenNamelong	
endPtr	TokenNameIdentifier	 end Ptr
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
endPtr	TokenNameIdentifier	 end Ptr
-	TokenNameMINUS	
startPtr	TokenNameIdentifier	 start Ptr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Difference in the output file offsets "	TokenNameStringLiteral	Difference in the output file offsets 
+	TokenNamePLUS	
diff	TokenNameIdentifier	 diff
+	TokenNamePLUS	
" does not match the original file length "	TokenNameStringLiteral	 does not match the original file length 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
