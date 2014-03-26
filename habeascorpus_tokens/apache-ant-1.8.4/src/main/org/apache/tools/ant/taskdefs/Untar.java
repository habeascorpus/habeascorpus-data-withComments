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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
Resource	TokenNameIdentifier	 Resource
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
FileNameMapper	TokenNameIdentifier	 File Name Mapper
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
bzip2	TokenNameIdentifier	 bzip2
.	TokenNameDOT	
CBZip2InputStream	TokenNameIdentifier	 CB Zip2 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
.	TokenNameDOT	
TarEntry	TokenNameIdentifier	 Tar Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
.	TokenNameDOT	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
;	TokenNameSEMICOLON	
/** * Untar a file. * <p>PatternSets are used to select files to extract * <I>from</I> the archive. If no patternset is used, all files are extracted. * </p> * <p>FileSets may be used to select archived files * to perform unarchival upon. * </p> * <p>File permissions will not be restored on extracted files.</p> * <p>The untar task recognizes the long pathname entries used by GNU tar.<p> * * @since Ant 1.1 * * @ant.task category="packaging" */	TokenNameCOMMENT_JAVADOC	 Untar a file. <p>PatternSets are used to select files to extract <I>from</I> the archive. If no patternset is used, all files are extracted. </p> <p>FileSets may be used to select archived files to perform unarchival upon. </p> <p>File permissions will not be restored on extracted files.</p> <p>The untar task recognizes the long pathname entries used by GNU tar.<p> * @since Ant 1.1 * @ant.task category="packaging" 
public	TokenNamepublic	
class	TokenNameclass	
Untar	TokenNameIdentifier	 Untar
extends	TokenNameextends	
Expand	TokenNameIdentifier	 Expand
{	TokenNameLBRACE	
/** * compression method */	TokenNameCOMMENT_JAVADOC	 compression method 
private	TokenNameprivate	
UntarCompressionMethod	TokenNameIdentifier	 Untar Compression Method
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
new	TokenNamenew	
UntarCompressionMethod	TokenNameIdentifier	 Untar Compression Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set decompression algorithm to use; default=none. * * Allowable values are * <ul> * <li>none - no compression * <li>gzip - Gzip compression * <li>bzip2 - Bzip2 compression * </ul> * * @param method compression method */	TokenNameCOMMENT_JAVADOC	 Set decompression algorithm to use; default=none. * Allowable values are <ul> <li>none - no compression <li>gzip - Gzip compression <li>bzip2 - Bzip2 compression </ul> * @param method compression method 
public	TokenNamepublic	
void	TokenNamevoid	
setCompression	TokenNameIdentifier	 set Compression
(	TokenNameLPAREN	
UntarCompressionMethod	TokenNameIdentifier	 Untar Compression Method
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No encoding support in Untar. * @param encoding not used * @throws BuildException always * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 No encoding support in Untar. @param encoding not used @throws BuildException always @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The "	TokenNameStringLiteral	The 
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" task doesn't support the encoding"	TokenNameStringLiteral	 task doesn't support the encoding
+	TokenNamePLUS	
" attribute"	TokenNameStringLiteral	 attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No unicode extra fields in tar. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 No unicode extra fields in tar. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setScanForUnicodeExtraFields	TokenNameIdentifier	 set Scan For Unicode Extra Fields
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The "	TokenNameStringLiteral	The 
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" task doesn't support the encoding"	TokenNameStringLiteral	 task doesn't support the encoding
+	TokenNamePLUS	
" attribute"	TokenNameStringLiteral	 attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Expand#expandFile(FileUtils, File, File) */	TokenNameCOMMENT_JAVADOC	 @see Expand#expandFile(FileUtils, File, File) 
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
void	TokenNamevoid	
expandFile	TokenNameIdentifier	 expand File
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
fileUtils	TokenNameIdentifier	 file Utils
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcF	TokenNameIdentifier	 src F
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
srcF	TokenNameIdentifier	 src F
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to untar "	TokenNameStringLiteral	Unable to untar 
+	TokenNamePLUS	
srcF	TokenNameIdentifier	 src F
+	TokenNamePLUS	
" as the file does not exist"	TokenNameStringLiteral	 as the file does not exist
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
srcF	TokenNameIdentifier	 src F
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expandStream	TokenNameIdentifier	 expand Stream
(	TokenNameLPAREN	
srcF	TokenNameIdentifier	 src F
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Error while expanding "	TokenNameStringLiteral	Error while expanding 
+	TokenNamePLUS	
srcF	TokenNameIdentifier	 src F
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method is to be overridden by extending unarchival tasks. * * @param srcR the source resource * @param dir the destination directory * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 This method is to be overridden by extending unarchival tasks. * @param srcR the source resource @param dir the destination directory @since Ant 1.7 
protected	TokenNameprotected	
void	TokenNamevoid	
expandResource	TokenNameIdentifier	 expand Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
srcR	TokenNameIdentifier	 src R
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to untar "	TokenNameStringLiteral	Unable to untar 
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" as the it does not exist"	TokenNameStringLiteral	 as the it does not exist
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expandStream	TokenNameIdentifier	 expand Stream
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Error while expanding "	TokenNameStringLiteral	Error while expanding 
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.7 
private	TokenNameprivate	
void	TokenNamevoid	
expandStream	TokenNameIdentifier	 expand Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
new	TokenNamenew	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
.	TokenNameDOT	
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Expanding: "	TokenNameStringLiteral	Expanding: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" into "	TokenNameStringLiteral	 into 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TarEntry	TokenNameIdentifier	 Tar Entry
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
getMapper	TokenNameIdentifier	 get Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
extractFile	TokenNameIdentifier	 extract File
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
tis	TokenNameIdentifier	 tis
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getModTime	TokenNameIdentifier	 get Mod Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
empty	TokenNameIdentifier	 empty
&&	TokenNameAND_AND	
getFailOnEmptyArchive	TokenNameIdentifier	 get Fail On Empty Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"archive '"	TokenNameStringLiteral	archive '
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"' is empty"	TokenNameStringLiteral	' is empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"expand complete"	TokenNameStringLiteral	expand complete
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Valid Modes for Compression attribute to Untar Task * */	TokenNameCOMMENT_JAVADOC	 Valid Modes for Compression attribute to Untar Task 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UntarCompressionMethod	TokenNameIdentifier	 Untar Compression Method
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
// permissible values for compression attribute 	TokenNameCOMMENT_LINE	permissible values for compression attribute 
/** * No compression */	TokenNameCOMMENT_JAVADOC	 No compression 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
"none"	TokenNameStringLiteral	none
;	TokenNameSEMICOLON	
/** * GZIP compression */	TokenNameCOMMENT_JAVADOC	 GZIP compression 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GZIP	TokenNameIdentifier	 GZIP
=	TokenNameEQUAL	
"gzip"	TokenNameStringLiteral	gzip
;	TokenNameSEMICOLON	
/** * BZIP2 compression */	TokenNameCOMMENT_JAVADOC	 BZIP2 compression 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BZIP2	TokenNameIdentifier	 BZI P2
=	TokenNameEQUAL	
"bzip2"	TokenNameStringLiteral	bzip2
;	TokenNameSEMICOLON	
/** * Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
UntarCompressionMethod	TokenNameIdentifier	 Untar Compression Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
NONE	TokenNameIdentifier	 NONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get valid enumeration values * * @return valid values */	TokenNameCOMMENT_JAVADOC	 Get valid enumeration values * @return valid values 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
NONE	TokenNameIdentifier	 NONE
,	TokenNameCOMMA	
GZIP	TokenNameIdentifier	 GZIP
,	TokenNameCOMMA	
BZIP2	TokenNameIdentifier	 BZI P2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method wraps the input stream with the * corresponding decompression method * * @param name provides location information for BuildException * @param istream input stream * @return input stream with on-the-fly decompression * @exception IOException thrown by GZIPInputStream constructor * @exception BuildException thrown if bzip stream does not * start with expected magic values */	TokenNameCOMMENT_JAVADOC	 This method wraps the input stream with the corresponding decompression method * @param name provides location information for BuildException @param istream input stream @return input stream with on-the-fly decompression @exception IOException thrown by GZIPInputStream constructor @exception BuildException thrown if bzip stream does not start with expected magic values 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
decompress	TokenNameIdentifier	 decompress
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
istream	TokenNameIdentifier	 istream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
GZIP	TokenNameIdentifier	 GZIP
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
(	TokenNameLPAREN	
istream	TokenNameIdentifier	 istream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
BZIP2	TokenNameIdentifier	 BZI P2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
'B'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
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
magic	TokenNameIdentifier	 magic
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
istream	TokenNameIdentifier	 istream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
magic	TokenNameIdentifier	 magic
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid bz2 file."	TokenNameStringLiteral	Invalid bz2 file.
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CBZip2InputStream	TokenNameIdentifier	 CB Zip2 Input Stream
(	TokenNameLPAREN	
istream	TokenNameIdentifier	 istream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
istream	TokenNameIdentifier	 istream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
