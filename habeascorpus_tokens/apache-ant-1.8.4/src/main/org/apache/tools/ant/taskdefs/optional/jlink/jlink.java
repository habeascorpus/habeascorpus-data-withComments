/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * jlink.java links together multiple .jar files Original code by Patrick * Beard. Modifications to work with ANT by Matthew Kuperus Heun. * */	TokenNameCOMMENT_JAVADOC	 jlink.java links together multiple .jar files Original code by Patrick Beard. Modifications to work with ANT by Matthew Kuperus Heun. 
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
jlink	TokenNameIdentifier	 jlink
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
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
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Deflater	TokenNameIdentifier	 Deflater
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
;	TokenNameSEMICOLON	
// CheckStyle:TypeNameCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:TypeNameCheck OFF - bc 
/** * jlink links together multiple .jar files. */	TokenNameCOMMENT_JAVADOC	 jlink links together multiple .jar files. 
public	TokenNamepublic	
class	TokenNameclass	
jlink	TokenNameIdentifier	 jlink
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
8192	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VECTOR_INIT_SIZE	TokenNameIdentifier	 VECTOR  INIT  SIZE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outfile	TokenNameIdentifier	 outfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
mergefiles	TokenNameIdentifier	 mergefiles
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
VECTOR_INIT_SIZE	TokenNameIdentifier	 VECTOR  INIT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
addfiles	TokenNameIdentifier	 addfiles
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
VECTOR_INIT_SIZE	TokenNameIdentifier	 VECTOR  INIT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** The file that will be created by this instance of jlink. * @param outfile the file to create. */	TokenNameCOMMENT_JAVADOC	 The file that will be created by this instance of jlink. @param outfile the file to create. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutfile	TokenNameIdentifier	 set Outfile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
outfile	TokenNameIdentifier	 outfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outfile	TokenNameIdentifier	 outfile
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outfile	TokenNameIdentifier	 outfile
=	TokenNameEQUAL	
outfile	TokenNameIdentifier	 outfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a file to be merged into the output. * @param fileToMerge the file to merge into the output. */	TokenNameCOMMENT_JAVADOC	 Adds a file to be merged into the output. @param fileToMerge the file to merge into the output. 
public	TokenNamepublic	
void	TokenNamevoid	
addMergeFile	TokenNameIdentifier	 add Merge File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileToMerge	TokenNameIdentifier	 file To Merge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileToMerge	TokenNameIdentifier	 file To Merge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mergefiles	TokenNameIdentifier	 mergefiles
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
fileToMerge	TokenNameIdentifier	 file To Merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds a file to be added into the output. * @param fileToAdd the file to add to the output. */	TokenNameCOMMENT_JAVADOC	 Adds a file to be added into the output. @param fileToAdd the file to add to the output. 
public	TokenNamepublic	
void	TokenNamevoid	
addAddFile	TokenNameIdentifier	 add Add File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileToAdd	TokenNameIdentifier	 file To Add
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileToAdd	TokenNameIdentifier	 file To Add
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addfiles	TokenNameIdentifier	 addfiles
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
fileToAdd	TokenNameIdentifier	 file To Add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds several files to be merged into the output. * @param filesToMerge an array of files to merge into the output. */	TokenNameCOMMENT_JAVADOC	 Adds several files to be merged into the output. @param filesToMerge an array of files to merge into the output. 
public	TokenNamepublic	
void	TokenNamevoid	
addMergeFiles	TokenNameIdentifier	 add Merge Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filesToMerge	TokenNameIdentifier	 files To Merge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filesToMerge	TokenNameIdentifier	 files To Merge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
filesToMerge	TokenNameIdentifier	 files To Merge
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addMergeFile	TokenNameIdentifier	 add Merge File
(	TokenNameLPAREN	
filesToMerge	TokenNameIdentifier	 files To Merge
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds several file to be added into the output. * @param filesToAdd an array of files to add to the output. */	TokenNameCOMMENT_JAVADOC	 Adds several file to be added into the output. @param filesToAdd an array of files to add to the output. 
public	TokenNamepublic	
void	TokenNamevoid	
addAddFiles	TokenNameIdentifier	 add Add Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filesToAdd	TokenNameIdentifier	 files To Add
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filesToAdd	TokenNameIdentifier	 files To Add
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
filesToAdd	TokenNameIdentifier	 files To Add
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAddFile	TokenNameIdentifier	 add Add File
(	TokenNameLPAREN	
filesToAdd	TokenNameIdentifier	 files To Add
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines whether output will be compressed. * @param compress if true use compression. */	TokenNameCOMMENT_JAVADOC	 Determines whether output will be compressed. @param compress if true use compression. 
public	TokenNamepublic	
void	TokenNamevoid	
setCompression	TokenNameIdentifier	 set Compression
(	TokenNameLPAREN	
boolean	TokenNameboolean	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
compress	TokenNameIdentifier	 compress
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the linking of files. Addfiles are added to the output as-is. * For example, a jar file is added to the output as a jar file. However, * mergefiles are first examined for their type. If it is a jar or zip * file, the contents will be extracted from the mergefile and entered * into the output. If a zip or jar file is encountered in a subdirectory * it will be added, not merged. If a directory is encountered, it becomes * the root entry of all the files below it. Thus, you can provide * multiple, disjoint directories, as addfiles: they will all be added in * a rational manner to outfile. * @throws Exception on error. */	TokenNameCOMMENT_JAVADOC	 Performs the linking of files. Addfiles are added to the output as-is. For example, a jar file is added to the output as a jar file. However, mergefiles are first examined for their type. If it is a jar or zip file, the contents will be extracted from the mergefile and entered into the output. If a zip or jar file is encountered in a subdirectory it will be added, not merged. If a directory is encountered, it becomes the root entry of all the files below it. Thus, you can provide multiple, disjoint directories, as addfiles: they will all be added in a rational manner to outfile. @throws Exception on error. 
public	TokenNamepublic	
void	TokenNamevoid	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
outfile	TokenNameIdentifier	 outfile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
DEFLATED	TokenNameIdentifier	 DEFLATED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Deflater	TokenNameIdentifier	 Deflater
.	TokenNameDOT	
DEFAULT_COMPRESSION	TokenNameIdentifier	 DEFAULT  COMPRESSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
STORED	TokenNameIdentifier	 STORED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
merges	TokenNameIdentifier	 merges
=	TokenNameEQUAL	
mergefiles	TokenNameIdentifier	 mergefiles
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".jar"	TokenNameStringLiteral	.jar
)	TokenNameRPAREN	
||	TokenNameOR_OR	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".zip"	TokenNameStringLiteral	.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Do the merge 	TokenNameCOMMENT_LINE	Do the merge 
mergeZipJarContents	TokenNameIdentifier	 merge Zip Jar Contents
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//Add this file to the addfiles Vector and add it 	TokenNameCOMMENT_LINE	Add this file to the addfiles Vector and add it 
//later at the top level of the output file. 	TokenNameCOMMENT_LINE	later at the top level of the output file. 
addAddFile	TokenNameIdentifier	 add Add File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
adds	TokenNameIdentifier	 adds
=	TokenNameEQUAL	
addfiles	TokenNameIdentifier	 addfiles
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
adds	TokenNameIdentifier	 adds
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
adds	TokenNameIdentifier	 adds
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
//System.out.println("in jlink: adding directory contents of " + f.getPath()); 	TokenNameCOMMENT_LINE	System.out.println("in jlink: adding directory contents of " + f.getPath()); 
addDirContents	TokenNameIdentifier	 add Dir Contents
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The command line entry point for jlink. * @param args an array of arguments */	TokenNameCOMMENT_JAVADOC	 The command line entry point for jlink. @param args an array of arguments 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// jlink output input1 ... inputN 	TokenNameCOMMENT_LINE	jlink output input1 ... inputN 
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: jlink output input1 ... inputN"	TokenNameStringLiteral	usage: jlink output input1 ... inputN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
jlink	TokenNameIdentifier	 jlink
linker	TokenNameIdentifier	 linker
=	TokenNameEQUAL	
new	TokenNamenew	
jlink	TokenNameIdentifier	 jlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
setOutfile	TokenNameIdentifier	 set Outfile
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// To maintain compatibility with the command-line version, 	TokenNameCOMMENT_LINE	To maintain compatibility with the command-line version, 
// we will only add files to be merged. 	TokenNameCOMMENT_LINE	we will only add files to be merged. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
addMergeFile	TokenNameIdentifier	 add Merge File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Actually performs the merging of f into the output. * f should be a zip or jar file. */	TokenNameCOMMENT_BLOCK	 Actually performs the merging of f into the output. f should be a zip or jar file. 
private	TokenNameprivate	
void	TokenNamevoid	
mergeZipJarContents	TokenNameIdentifier	 merge Zip Jar Contents
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//Check to see that the file with name "name" exists. 	TokenNameCOMMENT_LINE	Check to see that the file with name "name" exists. 
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ZipFile	TokenNameIdentifier	 Zip File
zipf	TokenNameIdentifier	 zipf
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
zipf	TokenNameIdentifier	 zipf
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
inputEntry	TokenNameIdentifier	 input Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Ignore manifest entries. They're bound to cause conflicts between 	TokenNameCOMMENT_LINE	Ignore manifest entries. They're bound to cause conflicts between 
//files that are being merged. User should supply their own 	TokenNameCOMMENT_LINE	files that are being merged. User should supply their own 
//manifest file when doing the merge. 	TokenNameCOMMENT_LINE	manifest file when doing the merge. 
String	TokenNameIdentifier	 String
inputEntryName	TokenNameIdentifier	 input Entry Name
=	TokenNameEQUAL	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
inputEntryName	TokenNameIdentifier	 input Entry Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"META-INF"	TokenNameStringLiteral	META-INF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//META-INF not found in the name of the entry. Go ahead and process it. 	TokenNameCOMMENT_LINE	META-INF not found in the name of the entry. Go ahead and process it. 
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
processEntry	TokenNameIdentifier	 process Entry
(	TokenNameLPAREN	
zipf	TokenNameIdentifier	 zipf
,	TokenNameCOMMA	
inputEntry	TokenNameIdentifier	 input Entry
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ZipException	TokenNameIdentifier	 Zip Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If we get here, it could be because we are trying to put a 	TokenNameCOMMENT_LINE	If we get here, it could be because we are trying to put a 
//directory entry that already exists. 	TokenNameCOMMENT_LINE	directory entry that already exists. 
//For example, we're trying to write "com", but a previous 	TokenNameCOMMENT_LINE	For example, we're trying to write "com", but a previous 
//entry from another mergefile was called "com". 	TokenNameCOMMENT_LINE	entry from another mergefile was called "com". 
//In that case, just ignore the error and go on to the 	TokenNameCOMMENT_LINE	In that case, just ignore the error and go on to the 
//next entry. 	TokenNameCOMMENT_LINE	next entry. 
String	TokenNameIdentifier	 String
mess	TokenNameIdentifier	 mess
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mess	TokenNameIdentifier	 mess
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"duplicate"	TokenNameStringLiteral	duplicate
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//It was the duplicate entry. 	TokenNameCOMMENT_LINE	It was the duplicate entry. 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// I hate to admit it, but we don't know what happened 	TokenNameCOMMENT_LINE	I hate to admit it, but we don't know what happened 
// here. Throw the Exception. 	TokenNameCOMMENT_LINE	here. Throw the Exception. 
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
zipf	TokenNameIdentifier	 zipf
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
zipf	TokenNameIdentifier	 zipf
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Adds contents of a directory to the output. */	TokenNameCOMMENT_BLOCK	 Adds contents of a directory to the output. 
private	TokenNameprivate	
void	TokenNamevoid	
addDirContents	TokenNameIdentifier	 add Dir Contents
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
list	TokenNameIdentifier	 list
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
contents	TokenNameIdentifier	 contents
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
contents	TokenNameIdentifier	 contents
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
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
addDirContents	TokenNameIdentifier	 add Dir Contents
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Gets the name of an entry in the file. This is the real name * which for a class is the name of the package with the class * name appended. */	TokenNameCOMMENT_BLOCK	 Gets the name of an entry in the file. This is the real name which for a class is the name of the package with the class name appended. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getEntryName	TokenNameIdentifier	 get Entry Name
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// see if the file is in fact a .class file, and determine its actual name. 	TokenNameCOMMENT_LINE	see if the file is in fact a .class file, and determine its actual name. 
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
ClassNameReader	TokenNameIdentifier	 Class Name Reader
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
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
//do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"From "	TokenNameStringLiteral	From 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" and prefix "	TokenNameStringLiteral	 and prefix 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
", creating entry "	TokenNameStringLiteral	, creating entry 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Adds a file to the output stream. */	TokenNameCOMMENT_BLOCK	 Adds a file to the output stream. 
private	TokenNameprivate	
void	TokenNamevoid	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//Make sure file exists 	TokenNameCOMMENT_LINE	Make sure file exists 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
getEntryName	TokenNameIdentifier	 get Entry Name
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setCrc	TokenNameIdentifier	 set Crc
(	TokenNameLPAREN	
calcChecksum	TokenNameIdentifier	 calc Checksum
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addToOutputStream	TokenNameIdentifier	 add To Output Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * A convenience method that several other methods might call. */	TokenNameCOMMENT_BLOCK	 A convenience method that several other methods might call. 
private	TokenNameprivate	
void	TokenNamevoid	
addToOutputStream	TokenNameIdentifier	 add To Output Stream
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ZipException	TokenNameIdentifier	 Zip Exception
zipEx	TokenNameIdentifier	 zip Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//This entry already exists. So, go with the first one. 	TokenNameCOMMENT_LINE	This entry already exists. So, go with the first one. 
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * A method that does the work on a given entry in a mergefile. * The big deal is to set the right parameters in the ZipEntry * on the output stream. */	TokenNameCOMMENT_BLOCK	 A method that does the work on a given entry in a mergefile. The big deal is to set the right parameters in the ZipEntry on the output stream. 
private	TokenNameprivate	
ZipEntry	TokenNameIdentifier	 Zip Entry
processEntry	TokenNameIdentifier	 process Entry
(	TokenNameLPAREN	
ZipFile	TokenNameIdentifier	 Zip File
zip	TokenNameIdentifier	 zip
,	TokenNameCOMMA	
ZipEntry	TokenNameIdentifier	 Zip Entry
inputEntry	TokenNameIdentifier	 input Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* First, some notes. On MRJ 2.2.2, getting the size, compressed size, and CRC32 from the ZipInputStream does not work for compressed (deflated) files. Those calls return -1. For uncompressed (stored) files, those calls do work. However, using ZipFile.getEntries() works for both compressed and uncompressed files. Now, from some simple testing I did, it seems that the value of CRC-32 is independent of the compression setting. So, it should be easy to pass this information on to the output entry. */	TokenNameCOMMENT_BLOCK	 First, some notes. On MRJ 2.2.2, getting the size, compressed size, and CRC32 from the ZipInputStream does not work for compressed (deflated) files. Those calls return -1. For uncompressed (stored) files, those calls do work. However, using ZipFile.getEntries() works for both compressed and uncompressed files. Now, from some simple testing I did, it seems that the value of CRC-32 is independent of the compression setting. So, it should be easy to pass this information on to the output entry. 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
ClassNameReader	TokenNameIdentifier	 Class Name Reader
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
outputEntry	TokenNameIdentifier	 output Entry
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setComment	TokenNameIdentifier	 set Comment
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
DEFLATED	TokenNameIdentifier	 DEFLATED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Note, don't need to specify size or crc for compressed files. 	TokenNameCOMMENT_LINE	Note, don't need to specify size or crc for compressed files. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
.	TokenNameDOT	
STORED	TokenNameIdentifier	 STORED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setCrc	TokenNameIdentifier	 set Crc
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getCrc	TokenNameIdentifier	 get Crc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntry	TokenNameIdentifier	 output Entry
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
inputEntry	TokenNameIdentifier	 input Entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
outputEntry	TokenNameIdentifier	 output Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Necessary in the case where you add a entry that * is not compressed. */	TokenNameCOMMENT_BLOCK	 Necessary in the case where you add a entry that is not compressed. 
private	TokenNameprivate	
long	TokenNamelong	
calcChecksum	TokenNameIdentifier	 calc Checksum
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
calcChecksum	TokenNameIdentifier	 calc Checksum
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Necessary in the case where you add a entry that * is not compressed. */	TokenNameCOMMENT_BLOCK	 Necessary in the case where you add a entry that is not compressed. 
private	TokenNameprivate	
long	TokenNamelong	
calcChecksum	TokenNameIdentifier	 calc Checksum
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CRC32	TokenNameIdentifier	 CR C32
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
haveRead	TokenNameIdentifier	 have Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haveRead	TokenNameIdentifier	 have Read
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
