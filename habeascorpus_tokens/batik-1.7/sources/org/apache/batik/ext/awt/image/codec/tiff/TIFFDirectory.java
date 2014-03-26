/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
tiff	TokenNameIdentifier	 tiff
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
Serializable	TokenNameIdentifier	 Serializable
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
HashMap	TokenNameIdentifier	 Hash Map
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
List	TokenNameIdentifier	 List
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
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SeekableStream	TokenNameIdentifier	 Seekable Stream
;	TokenNameSEMICOLON	
/** * A class representing an Image File Directory (IFD) from a TIFF 6.0 * stream. The TIFF file format is described in more detail in the * comments for the TIFFDescriptor class. * * <p> A TIFF IFD consists of a set of TIFFField tags. Methods are * provided to query the set of tags and to obtain the raw field * array. In addition, convenience methods are provided for acquiring * the values of tags that contain a single value that fits into a * byte, int, long, float, or double. * * <p> Every TIFF file is made up of one or more public IFDs that are * joined in a linked list, rooted in the file header. A file may * also contain so-called private IFDs that are referenced from * tag data and do not appear in the main list. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @see TIFFField * @version $Id: TIFFDirectory.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class representing an Image File Directory (IFD) from a TIFF 6.0 stream. The TIFF file format is described in more detail in the comments for the TIFFDescriptor class. * <p> A TIFF IFD consists of a set of TIFFField tags. Methods are provided to query the set of tags and to obtain the raw field array. In addition, convenience methods are provided for acquiring the values of tags that contain a single value that fits into a byte, int, long, float, or double. * <p> Every TIFF file is made up of one or more public IFDs that are joined in a linked list, rooted in the file header. A file may also contain so-called private IFDs that are referenced from tag data and do not appear in the main list. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @see TIFFField @version $Id: TIFFDirectory.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFDirectory	TokenNameIdentifier	 TIFF Directory
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** A boolean storing the endianness of the stream. */	TokenNameCOMMENT_JAVADOC	 A boolean storing the endianness of the stream. 
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
;	TokenNameSEMICOLON	
/** The number of entries in the IFD. */	TokenNameCOMMENT_JAVADOC	 The number of entries in the IFD. 
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
/** An array of TIFFFields. */	TokenNameCOMMENT_JAVADOC	 An array of TIFFFields. 
TIFFField	TokenNameIdentifier	 TIFF Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
/** A Hashtable indexing the fields by tag number. */	TokenNameCOMMENT_JAVADOC	 A Hashtable indexing the fields by tag number. 
Map	TokenNameIdentifier	 Map
fieldIndex	TokenNameIdentifier	 field Index
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The offset of this IFD. */	TokenNameCOMMENT_JAVADOC	 The offset of this IFD. 
long	TokenNamelong	
IFDOffset	TokenNameIdentifier	 IFD Offset
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The offset of the next IFD. */	TokenNameCOMMENT_JAVADOC	 The offset of the next IFD. 
long	TokenNamelong	
nextIFDOffset	TokenNameIdentifier	 next IFD Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default constructor. */	TokenNameCOMMENT_JAVADOC	 The default constructor. 
TIFFDirectory	TokenNameIdentifier	 TIFF Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidEndianTag	TokenNameIdentifier	 is Valid Endian Tag
(	TokenNameLPAREN	
int	TokenNameint	
endian	TokenNameIdentifier	 endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
==	TokenNameEQUAL_EQUAL	
0x4949	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
==	TokenNameEQUAL_EQUAL	
0x4d4d	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a TIFFDirectory from a SeekableStream. * The directory parameter specifies which directory to read from * the linked list present in the stream; directory 0 is normally * read but it is possible to store multiple images in a single * TIFF file by maintaing multiple directories. * * @param stream a SeekableStream to read from. * @param directory the index of the directory to read. */	TokenNameCOMMENT_JAVADOC	 Constructs a TIFFDirectory from a SeekableStream. The directory parameter specifies which directory to read from the linked list present in the stream; directory 0 is normally read but it is possible to store multiple images in a single TIFF file by maintaing multiple directories. * @param stream a SeekableStream to read from. @param directory the index of the directory to read. 
public	TokenNamepublic	
TIFFDirectory	TokenNameIdentifier	 TIFF Directory
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
int	TokenNameint	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
global_save_offset	TokenNameIdentifier	 global save offset
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ifd_offset	TokenNameIdentifier	 ifd offset
;	TokenNameSEMICOLON	
// Read the TIFF header 	TokenNameCOMMENT_LINE	Read the TIFF header 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endian	TokenNameIdentifier	 endian
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidEndianTag	TokenNameIdentifier	 is Valid Endian Tag
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TIFFDirectory1"	TokenNameStringLiteral	TIFFDirectory1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isBigEndian	TokenNameIdentifier	 is Big Endian
=	TokenNameEQUAL	
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
==	TokenNameEQUAL_EQUAL	
0x4d4d	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
magic	TokenNameIdentifier	 magic
!=	TokenNameNOT_EQUAL	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TIFFDirectory2"	TokenNameStringLiteral	TIFFDirectory2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the initial ifd offset as an unsigned int (using a long) 	TokenNameCOMMENT_LINE	Get the initial ifd offset as an unsigned int (using a long) 
ifd_offset	TokenNameIdentifier	 ifd offset
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
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
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ifd_offset	TokenNameIdentifier	 ifd offset
==	TokenNameEQUAL_EQUAL	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TIFFDirectory3"	TokenNameStringLiteral	TIFFDirectory3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ifd_offset	TokenNameIdentifier	 ifd offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ifd_offset	TokenNameIdentifier	 ifd offset
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ifd_offset	TokenNameIdentifier	 ifd offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
global_save_offset	TokenNameIdentifier	 global save offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a TIFFDirectory by reading a SeekableStream. * The ifd_offset parameter specifies the stream offset from which * to begin reading; this mechanism is sometimes used to store * private IFDs within a TIFF file that are not part of the normal * sequence of IFDs. * * @param stream a SeekableStream to read from. * @param ifd_offset the long byte offset of the directory. * @param directory the index of the directory to read beyond the * one at the current stream offset; zero indicates the IFD * at the current offset. */	TokenNameCOMMENT_JAVADOC	 Constructs a TIFFDirectory by reading a SeekableStream. The ifd_offset parameter specifies the stream offset from which to begin reading; this mechanism is sometimes used to store private IFDs within a TIFF file that are not part of the normal sequence of IFDs. * @param stream a SeekableStream to read from. @param ifd_offset the long byte offset of the directory. @param directory the index of the directory to read beyond the one at the current stream offset; zero indicates the IFD at the current offset. 
public	TokenNamepublic	
TIFFDirectory	TokenNameIdentifier	 TIFF Directory
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
long	TokenNamelong	
ifd_offset	TokenNameIdentifier	 ifd offset
,	TokenNameCOMMA	
int	TokenNameint	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
global_save_offset	TokenNameIdentifier	 global save offset
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endian	TokenNameIdentifier	 endian
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidEndianTag	TokenNameIdentifier	 is Valid Endian Tag
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TIFFDirectory1"	TokenNameStringLiteral	TIFFDirectory1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isBigEndian	TokenNameIdentifier	 is Big Endian
=	TokenNameEQUAL	
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
==	TokenNameEQUAL_EQUAL	
0x4d4d	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Seek to the first IFD. 	TokenNameCOMMENT_LINE	Seek to the first IFD. 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ifd_offset	TokenNameIdentifier	 ifd offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Seek to desired IFD if necessary. 	TokenNameCOMMENT_LINE	Seek to desired IFD if necessary. 
int	TokenNameint	
dirNum	TokenNameIdentifier	 dir Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dirNum	TokenNameIdentifier	 dir Num
<	TokenNameLESS	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the number of fields in the current IFD. 	TokenNameCOMMENT_LINE	Get the number of fields in the current IFD. 
long	TokenNamelong	
numEntries	TokenNameIdentifier	 num Entries
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip to the next IFD offset value field. 	TokenNameCOMMENT_LINE	Skip to the next IFD offset value field. 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ifd_offset	TokenNameIdentifier	 ifd offset
+	TokenNamePLUS	
12	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Read the offset to the next IFD beyond this one. 	TokenNameCOMMENT_LINE	Read the offset to the next IFD beyond this one. 
ifd_offset	TokenNameIdentifier	 ifd offset
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Seek to the next IFD. 	TokenNameCOMMENT_LINE	Seek to the next IFD. 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ifd_offset	TokenNameIdentifier	 ifd offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increment the directory. 	TokenNameCOMMENT_LINE	Increment the directory. 
dirNum	TokenNameIdentifier	 dir Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
global_save_offset	TokenNameIdentifier	 global save offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sizeOfType	TokenNameIdentifier	 size Of Type
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 0 = n/a 	TokenNameCOMMENT_LINE	0 = n/a 
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 1 = byte 	TokenNameCOMMENT_LINE	1 = byte 
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 2 = ascii 	TokenNameCOMMENT_LINE	2 = ascii 
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 3 = short 	TokenNameCOMMENT_LINE	3 = short 
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 4 = long 	TokenNameCOMMENT_LINE	4 = long 
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 5 = rational 	TokenNameCOMMENT_LINE	5 = rational 
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 6 = sbyte 	TokenNameCOMMENT_LINE	6 = sbyte 
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 7 = undefined 	TokenNameCOMMENT_LINE	7 = undefined 
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 8 = sshort 	TokenNameCOMMENT_LINE	8 = sshort 
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 9 = slong 	TokenNameCOMMENT_LINE	9 = slong 
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 10 = srational 	TokenNameCOMMENT_LINE	10 = srational 
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 11 = float 	TokenNameCOMMENT_LINE	11 = float 
8	TokenNameIntegerLiteral	
// 12 = double 	TokenNameCOMMENT_LINE	12 = double 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
nextTagOffset	TokenNameIdentifier	 next Tag Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
IFDOffset	TokenNameIdentifier	 IFD Offset
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numEntries	TokenNameIdentifier	 num Entries
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
TIFFField	TokenNameIdentifier	 TIFF Field
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The place to return to to read the next tag 	TokenNameCOMMENT_LINE	The place to return to to read the next tag 
nextTagOffset	TokenNameIdentifier	 next Tag Offset
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// If the tag data can't fit in 4 bytes, the next 4 bytes 	TokenNameCOMMENT_LINE	If the tag data can't fit in 4 bytes, the next 4 bytes 
// contain the starting offset of the data 	TokenNameCOMMENT_LINE	contain the starting offset of the data 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
*	TokenNameMULTIPLY	
sizeOfType	TokenNameIdentifier	 size Of Type
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
ae	TokenNameIdentifier	 ae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"TIFFDirectory4"	TokenNameStringLiteral	TIFFDirectory4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the data type is unknown we should skip this TIFF Field 	TokenNameCOMMENT_LINE	if the data type is unknown we should skip this TIFF Field 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
nextTagOffset	TokenNameIdentifier	 next Tag Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_BYTE	TokenNameIdentifier	 TIFF  BYTE
:	TokenNameCOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_SBYTE	TokenNameIdentifier	 TIFF  SBYTE
:	TokenNameCOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_UNDEFINED	TokenNameIdentifier	 TIFF  UNDEFINED
:	TokenNameCOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_ASCII	TokenNameIdentifier	 TIFF  ASCII
:	TokenNameCOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bvalues	TokenNameIdentifier	 bvalues
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
bvalues	TokenNameIdentifier	 bvalues
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_ASCII	TokenNameIdentifier	 TIFF  ASCII
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can be multiple strings 	TokenNameCOMMENT_LINE	Can be multiple strings 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prevIndex	TokenNameIdentifier	 prev Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
bvalues	TokenNameIdentifier	 bvalues
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// When we encountered zero, means one string has ended 	TokenNameCOMMENT_LINE	When we encountered zero, means one string has ended 
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bvalues	TokenNameIdentifier	 bvalues
,	TokenNameCOMMA	
prevIndex	TokenNameIdentifier	 prev Index
,	TokenNameCOMMA	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
prevIndex	TokenNameIdentifier	 prev Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevIndex	TokenNameIdentifier	 prev Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strings	TokenNameIdentifier	 strings
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
strings	TokenNameIdentifier	 strings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
strings	TokenNameIdentifier	 strings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
bvalues	TokenNameIdentifier	 bvalues
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_SHORT	TokenNameIdentifier	 TIFF  SHORT
:	TokenNameCOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cvalues	TokenNameIdentifier	 cvalues
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cvalues	TokenNameIdentifier	 cvalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
cvalues	TokenNameIdentifier	 cvalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_LONG	TokenNameIdentifier	 TIFF  LONG
:	TokenNameCOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lvalues	TokenNameIdentifier	 lvalues
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvalues	TokenNameIdentifier	 lvalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
lvalues	TokenNameIdentifier	 lvalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_RATIONAL	TokenNameIdentifier	 TIFF  RATIONAL
:	TokenNameCOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
llvalues	TokenNameIdentifier	 llvalues
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
llvalues	TokenNameIdentifier	 llvalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
llvalues	TokenNameIdentifier	 llvalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
llvalues	TokenNameIdentifier	 llvalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_SSHORT	TokenNameIdentifier	 TIFF  SSHORT
:	TokenNameCOLON	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
svalues	TokenNameIdentifier	 svalues
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svalues	TokenNameIdentifier	 svalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
svalues	TokenNameIdentifier	 svalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_SLONG	TokenNameIdentifier	 TIFF  SLONG
:	TokenNameCOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ivalues	TokenNameIdentifier	 ivalues
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ivalues	TokenNameIdentifier	 ivalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
ivalues	TokenNameIdentifier	 ivalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_SRATIONAL	TokenNameIdentifier	 TIFF  SRATIONAL
:	TokenNameCOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
iivalues	TokenNameIdentifier	 iivalues
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iivalues	TokenNameIdentifier	 iivalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iivalues	TokenNameIdentifier	 iivalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
iivalues	TokenNameIdentifier	 iivalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_FLOAT	TokenNameIdentifier	 TIFF  FLOAT
:	TokenNameCOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fvalues	TokenNameIdentifier	 fvalues
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fvalues	TokenNameIdentifier	 fvalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readFloat	TokenNameIdentifier	 read Float
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
fvalues	TokenNameIdentifier	 fvalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFFField	TokenNameIdentifier	 TIFF Field
.	TokenNameDOT	
TIFF_DOUBLE	TokenNameIdentifier	 TIFF  DOUBLE
:	TokenNameCOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dvalues	TokenNameIdentifier	 dvalues
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dvalues	TokenNameIdentifier	 dvalues
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
dvalues	TokenNameIdentifier	 dvalues
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TIFFDirectory0"	TokenNameStringLiteral	TIFFDirectory0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TIFFField	TokenNameIdentifier	 TIFF Field
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
nextTagOffset	TokenNameIdentifier	 next Tag Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Read the offset of the next IFD. 	TokenNameCOMMENT_LINE	Read the offset of the next IFD. 
nextIFDOffset	TokenNameIdentifier	 next IFD Offset
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of directory entries. */	TokenNameCOMMENT_JAVADOC	 Returns the number of directory entries. 
public	TokenNamepublic	
int	TokenNameint	
getNumEntries	TokenNameIdentifier	 get Num Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a given tag as a TIFFField, * or null if the tag is not present. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a given tag as a TIFFField, or null if the tag is not present. 
public	TokenNamepublic	
TIFFField	TokenNameIdentifier	 TIFF Field
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if a tag appears in the directory. */	TokenNameCOMMENT_JAVADOC	 Returns true if a tag appears in the directory. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isTagPresent	TokenNameIdentifier	 is Tag Present
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an ordered array of ints indicating the tag * values. */	TokenNameCOMMENT_JAVADOC	 Returns an ordered array of ints indicating the tag values. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTags	TokenNameIdentifier	 get Tags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tags	TokenNameIdentifier	 tags
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tags	TokenNameIdentifier	 tags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tags	TokenNameIdentifier	 tags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of TIFFFields containing all the fields * in this directory. */	TokenNameCOMMENT_JAVADOC	 Returns an array of TIFFFields containing all the fields in this directory. 
public	TokenNamepublic	
TIFFField	TokenNameIdentifier	 TIFF Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a particular index of a given tag as a * byte. The caller is responsible for ensuring that the tag is * present and has type TIFFField.TIFF_SBYTE, TIFF_BYTE, or * TIFF_UNDEFINED. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a particular index of a given tag as a byte. The caller is responsible for ensuring that the tag is present and has type TIFFField.TIFF_SBYTE, TIFF_BYTE, or TIFF_UNDEFINED. 
public	TokenNamepublic	
byte	TokenNamebyte	
getFieldAsByte	TokenNameIdentifier	 get Field As Byte
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAsBytes	TokenNameIdentifier	 get As Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of index 0 of a given tag as a * byte. The caller is responsible for ensuring that the tag is * present and has type TIFFField.TIFF_SBYTE, TIFF_BYTE, or * TIFF_UNDEFINED. */	TokenNameCOMMENT_JAVADOC	 Returns the value of index 0 of a given tag as a byte. The caller is responsible for ensuring that the tag is present and has type TIFFField.TIFF_SBYTE, TIFF_BYTE, or TIFF_UNDEFINED. 
public	TokenNamepublic	
byte	TokenNamebyte	
getFieldAsByte	TokenNameIdentifier	 get Field As Byte
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFieldAsByte	TokenNameIdentifier	 get Field As Byte
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a particular index of a given tag as a * long. The caller is responsible for ensuring that the tag is * present and has type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, * TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG or TIFF_LONG. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a particular index of a given tag as a long. The caller is responsible for ensuring that the tag is present and has type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG or TIFF_LONG. 
public	TokenNamepublic	
long	TokenNamelong	
getFieldAsLong	TokenNameIdentifier	 get Field As Long
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAsLong	TokenNameIdentifier	 get As Long
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of index 0 of a given tag as a * long. The caller is responsible for ensuring that the tag is * present and has type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, * TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG or TIFF_LONG. */	TokenNameCOMMENT_JAVADOC	 Returns the value of index 0 of a given tag as a long. The caller is responsible for ensuring that the tag is present and has type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG or TIFF_LONG. 
public	TokenNamepublic	
long	TokenNamelong	
getFieldAsLong	TokenNameIdentifier	 get Field As Long
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFieldAsLong	TokenNameIdentifier	 get Field As Long
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a particular index of a given tag as a * float. The caller is responsible for ensuring that the tag is * present and has numeric type (all but TIFF_UNDEFINED and * TIFF_ASCII). */	TokenNameCOMMENT_JAVADOC	 Returns the value of a particular index of a given tag as a float. The caller is responsible for ensuring that the tag is present and has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII). 
public	TokenNamepublic	
float	TokenNamefloat	
getFieldAsFloat	TokenNameIdentifier	 get Field As Float
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAsFloat	TokenNameIdentifier	 get As Float
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of index 0 of a given tag as a float. The * caller is responsible for ensuring that the tag is present and * has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII). */	TokenNameCOMMENT_JAVADOC	 Returns the value of index 0 of a given tag as a float. The caller is responsible for ensuring that the tag is present and has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII). 
public	TokenNamepublic	
float	TokenNamefloat	
getFieldAsFloat	TokenNameIdentifier	 get Field As Float
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFieldAsFloat	TokenNameIdentifier	 get Field As Float
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a particular index of a given tag as a * double. The caller is responsible for ensuring that the tag is * present and has numeric type (all but TIFF_UNDEFINED and * TIFF_ASCII). */	TokenNameCOMMENT_JAVADOC	 Returns the value of a particular index of a given tag as a double. The caller is responsible for ensuring that the tag is present and has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII). 
public	TokenNamepublic	
double	TokenNamedouble	
getFieldAsDouble	TokenNameIdentifier	 get Field As Double
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fieldIndex	TokenNameIdentifier	 field Index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAsDouble	TokenNameIdentifier	 get As Double
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of index 0 of a given tag as a double. The * caller is responsible for ensuring that the tag is present and * has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII). */	TokenNameCOMMENT_JAVADOC	 Returns the value of index 0 of a given tag as a double. The caller is responsible for ensuring that the tag is present and has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII). 
public	TokenNamepublic	
double	TokenNamedouble	
getFieldAsDouble	TokenNameIdentifier	 get Field As Double
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFieldAsDouble	TokenNameIdentifier	 get Field As Double
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Methods to read primitive data types from the stream 	TokenNameCOMMENT_LINE	Methods to read primitive data types from the stream 
private	TokenNameprivate	
short	TokenNameshort	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readShortLE	TokenNameIdentifier	 read Short LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShortLE	TokenNameIdentifier	 read Unsigned Short LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readIntLE	TokenNameIdentifier	 read Int LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedIntLE	TokenNameIdentifier	 read Unsigned Int LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readLongLE	TokenNameIdentifier	 read Long LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
readFloat	TokenNameIdentifier	 read Float
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readFloat	TokenNameIdentifier	 read Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readFloatLE	TokenNameIdentifier	 read Float LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readDoubleLE	TokenNameIdentifier	 read Double LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShortLE	TokenNameIdentifier	 read Unsigned Short LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedIntLE	TokenNameIdentifier	 read Unsigned Int LE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Utilities 	TokenNameCOMMENT_LINE	Utilities 
/** * Returns the number of image directories (subimages) stored in a * given TIFF file, represented by a <code>SeekableStream</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the number of image directories (subimages) stored in a given TIFF file, represented by a <code>SeekableStream</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNumDirectories	TokenNameIdentifier	 get Num Directories
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Save stream pointer 	TokenNameCOMMENT_LINE	Save stream pointer 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endian	TokenNameIdentifier	 endian
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidEndianTag	TokenNameIdentifier	 is Valid Endian Tag
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TIFFDirectory1"	TokenNameStringLiteral	TIFFDirectory1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
=	TokenNameEQUAL	
(	TokenNameLPAREN	
endian	TokenNameIdentifier	 endian
==	TokenNameEQUAL_EQUAL	
0x4d4d	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
magic	TokenNameIdentifier	 magic
!=	TokenNameNOT_EQUAL	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"TIFFDirectory2"	TokenNameStringLiteral	TIFFDirectory2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
4L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDirectories	TokenNameIdentifier	 num Directories
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
numDirectories	TokenNameIdentifier	 num Directories
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
readUnsignedInt	TokenNameIdentifier	 read Unsigned Int
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
isBigEndian	TokenNameIdentifier	 is Big Endian
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset stream pointer 	TokenNameCOMMENT_LINE	Reset stream pointer 
return	TokenNamereturn	
numDirectories	TokenNameIdentifier	 num Directories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a boolean indicating whether the byte order used in the * the TIFF file is big-endian. That is, whether the byte order is from * the most significant to the least significant. */	TokenNameCOMMENT_JAVADOC	 Returns a boolean indicating whether the byte order used in the the TIFF file is big-endian. That is, whether the byte order is from the most significant to the least significant. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBigEndian	TokenNameIdentifier	 is Big Endian
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isBigEndian	TokenNameIdentifier	 is Big Endian
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the offset of the IFD corresponding to this * <code>TIFFDirectory</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the offset of the IFD corresponding to this <code>TIFFDirectory</code>. 
public	TokenNamepublic	
long	TokenNamelong	
getIFDOffset	TokenNameIdentifier	 get IFD Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IFDOffset	TokenNameIdentifier	 IFD Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the offset of the next IFD after the IFD corresponding to this * <code>TIFFDirectory</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the offset of the next IFD after the IFD corresponding to this <code>TIFFDirectory</code>. 
public	TokenNamepublic	
long	TokenNamelong	
getNextIFDOffset	TokenNameIdentifier	 get Next IFD Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextIFDOffset	TokenNameIdentifier	 next IFD Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
