/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * This package is based on the work done by Timothy Gerard Endres * (time@ice.com) to whom the Ant project is very grateful for his great code. */	TokenNameCOMMENT_BLOCK	 This package is based on the work done by Timothy Gerard Endres (time@ice.com) to whom the Ant project is very grateful for his great code. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * The TarOutputStream writes a UNIX tar archive as an OutputStream. * Methods are provided to put entries, and then write their contents * by writing to this stream using write(). * */	TokenNameCOMMENT_JAVADOC	 The TarOutputStream writes a UNIX tar archive as an OutputStream. Methods are provided to put entries, and then write their contents by writing to this stream using write(). 
public	TokenNamepublic	
class	TokenNameclass	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
extends	TokenNameextends	
FilterOutputStream	TokenNameIdentifier	 Filter Output Stream
{	TokenNameLBRACE	
/** Fail if a long file name is required in the archive. */	TokenNameCOMMENT_JAVADOC	 Fail if a long file name is required in the archive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LONGFILE_ERROR	TokenNameIdentifier	 LONGFILE  ERROR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Long paths will be truncated in the archive. */	TokenNameCOMMENT_JAVADOC	 Long paths will be truncated in the archive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LONGFILE_TRUNCATE	TokenNameIdentifier	 LONGFILE  TRUNCATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** GNU tar extensions are used to store long file names in the archive. */	TokenNameCOMMENT_JAVADOC	 GNU tar extensions are used to store long file names in the archive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LONGFILE_GNU	TokenNameIdentifier	 LONGFILE  GNU
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
currSize	TokenNameIdentifier	 curr Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
currName	TokenNameIdentifier	 curr Name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
currBytes	TokenNameIdentifier	 curr Bytes
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oneBuf	TokenNameIdentifier	 one Buf
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
recordBuf	TokenNameIdentifier	 record Buf
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
assemLen	TokenNameIdentifier	 assem Len
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
assemBuf	TokenNameIdentifier	 assem Buf
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TarBuffer	TokenNameIdentifier	 Tar Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
longFileMode	TokenNameIdentifier	 long File Mode
=	TokenNameEQUAL	
LONGFILE_ERROR	TokenNameIdentifier	 LONGFILE  ERROR
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor for TarInputStream. * @param os the output stream to use */	TokenNameCOMMENT_JAVADOC	 Constructor for TarInputStream. @param os the output stream to use 
public	TokenNamepublic	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_BLKSIZE	TokenNameIdentifier	 DEFAULT  BLKSIZE
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for TarInputStream. * @param os the output stream to use * @param blockSize the block size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for TarInputStream. @param os the output stream to use @param blockSize the block size to use 
public	TokenNamepublic	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for TarInputStream. * @param os the output stream to use * @param blockSize the block size to use * @param recordSize the record size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for TarInputStream. @param os the output stream to use @param blockSize the block size to use @param recordSize the record size to use 
public	TokenNamepublic	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
int	TokenNameint	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
assemLen	TokenNameIdentifier	 assem Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
assemBuf	TokenNameIdentifier	 assem Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
recordSize	TokenNameIdentifier	 record Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recordBuf	TokenNameIdentifier	 record Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
recordSize	TokenNameIdentifier	 record Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oneBuf	TokenNameIdentifier	 one Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the long file mode. * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2). * This specifies the treatment of long file names (names >= TarConstants.NAMELEN). * Default is LONGFILE_ERROR. * @param longFileMode the mode to use */	TokenNameCOMMENT_JAVADOC	 Set the long file mode. This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2). This specifies the treatment of long file names (names >= TarConstants.NAMELEN). Default is LONGFILE_ERROR. @param longFileMode the mode to use 
public	TokenNamepublic	
void	TokenNamevoid	
setLongFileMode	TokenNameIdentifier	 set Long File Mode
(	TokenNameLPAREN	
int	TokenNameint	
longFileMode	TokenNameIdentifier	 long File Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
longFileMode	TokenNameIdentifier	 long File Mode
=	TokenNameEQUAL	
longFileMode	TokenNameIdentifier	 long File Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the debugging flag. * * @param debugF True to turn on debugging. */	TokenNameCOMMENT_JAVADOC	 Sets the debugging flag. * @param debugF True to turn on debugging. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debugF	TokenNameIdentifier	 debug F
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
debugF	TokenNameIdentifier	 debug F
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the debugging flag in this stream's TarBuffer. * * @param debug True to turn on debugging. */	TokenNameCOMMENT_JAVADOC	 Sets the debugging flag in this stream's TarBuffer. * @param debug True to turn on debugging. 
public	TokenNamepublic	
void	TokenNamevoid	
setBufferDebug	TokenNameIdentifier	 set Buffer Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ends the TAR archive without closing the underlying OutputStream. * The result is that the two EOF records of nulls are written. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Ends the TAR archive without closing the underlying OutputStream. The result is that the two EOF records of nulls are written. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// See Bugzilla 28776 for a discussion on this 	TokenNameCOMMENT_LINE	See Bugzilla 28776 for a discussion on this 
// http://issues.apache.org/bugzilla/show_bug.cgi?id=28776 	TokenNameCOMMENT_LINE	http://issues.apache.org/bugzilla/show_bug.cgi?id=28776 
writeEOFRecord	TokenNameIdentifier	 write EOF Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeEOFRecord	TokenNameIdentifier	 write EOF Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flushBlock	TokenNameIdentifier	 flush Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ends the TAR archive and closes the underlying OutputStream. * This means that finish() is called followed by calling the * TarBuffer's close(). * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Ends the TAR archive and closes the underlying OutputStream. This means that finish() is called followed by calling the TarBuffer's close(). @throws IOException on error 
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
!	TokenNameNOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the record size being used by this stream's TarBuffer. * * @return The TarBuffer record size. */	TokenNameCOMMENT_JAVADOC	 Get the record size being used by this stream's TarBuffer. * @return The TarBuffer record size. 
public	TokenNamepublic	
int	TokenNameint	
getRecordSize	TokenNameIdentifier	 get Record Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
getRecordSize	TokenNameIdentifier	 get Record Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put an entry on the output stream. This writes the entry's * header record and positions the output stream for writing * the contents of the entry. Once this method is called, the * stream is ready for calls to write() to write the entry's * contents. Once the contents are written, closeEntry() * <B>MUST</B> be called to ensure that all buffered data * is completely written to the output stream. * * @param entry The TarEntry to be written to the archive. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Put an entry on the output stream. This writes the entry's header record and positions the output stream for writing the contents of the entry. Once this method is called, the stream is ready for calls to write() to write the entry's contents. Once the contents are written, closeEntry() <B>MUST</B> be called to ensure that all buffered data is completely written to the output stream. * @param entry The TarEntry to be written to the archive. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
TarEntry	TokenNameIdentifier	 Tar Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
TarConstants	TokenNameIdentifier	 Tar Constants
.	TokenNameDOT	
NAMELEN	TokenNameIdentifier	 NAMELEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
longFileMode	TokenNameIdentifier	 long File Mode
==	TokenNameEQUAL_EQUAL	
LONGFILE_GNU	TokenNameIdentifier	 LONGFILE  GNU
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a TarEntry for the LongLink, the contents 	TokenNameCOMMENT_LINE	create a TarEntry for the LongLink, the contents 
// of which are the entry's name 	TokenNameCOMMENT_LINE	of which are the entry's name 
TarEntry	TokenNameIdentifier	 Tar Entry
longLinkEntry	TokenNameIdentifier	 long Link Entry
=	TokenNameEQUAL	
new	TokenNamenew	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
TarConstants	TokenNameIdentifier	 Tar Constants
.	TokenNameDOT	
GNU_LONGLINK	TokenNameIdentifier	 GNU  LONGLINK
,	TokenNameCOMMA	
TarConstants	TokenNameIdentifier	 Tar Constants
.	TokenNameDOT	
LF_GNUTYPE_LONGNAME	TokenNameIdentifier	 LF  GNUTYPE  LONGNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longLinkEntry	TokenNameIdentifier	 long Link Entry
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
longLinkEntry	TokenNameIdentifier	 long Link Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
longFileMode	TokenNameIdentifier	 long File Mode
!=	TokenNameNOT_EQUAL	
LONGFILE_TRUNCATE	TokenNameIdentifier	 LONGFILE  TRUNCATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"file name '"	TokenNameStringLiteral	file name '
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' is too long ( > "	TokenNameStringLiteral	' is too long ( > 
+	TokenNamePLUS	
TarConstants	TokenNameIdentifier	 Tar Constants
.	TokenNameDOT	
NAMELEN	TokenNameIdentifier	 NAMELEN
+	TokenNamePLUS	
" bytes)"	TokenNameStringLiteral	 bytes)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
writeEntryHeader	TokenNameIdentifier	 write Entry Header
(	TokenNameLPAREN	
recordBuf	TokenNameIdentifier	 record Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
recordBuf	TokenNameIdentifier	 record Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currBytes	TokenNameIdentifier	 curr Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currSize	TokenNameIdentifier	 curr Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currSize	TokenNameIdentifier	 curr Size
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currName	TokenNameIdentifier	 curr Name
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close an entry. This method MUST be called for all file * entries that contain data. The reason is that we must * buffer data written to the stream in order to satisfy * the buffer's record based writes. Thus, there may be * data fragments still being assembled that must be written * to the output stream before this entry is closed and the * next entry written. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Close an entry. This method MUST be called for all file entries that contain data. The reason is that we must buffer data written to the stream in order to satisfy the buffer's record based writes. Thus, there may be data fragments still being assembled that must be written to the output stream before this entry is closed and the next entry written. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
assemLen	TokenNameIdentifier	 assem Len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
assemLen	TokenNameIdentifier	 assem Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
assemBuf	TokenNameIdentifier	 assem Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assemBuf	TokenNameIdentifier	 assem Buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
assemBuf	TokenNameIdentifier	 assem Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currBytes	TokenNameIdentifier	 curr Bytes
+=	TokenNamePLUS_EQUAL	
assemLen	TokenNameIdentifier	 assem Len
;	TokenNameSEMICOLON	
assemLen	TokenNameIdentifier	 assem Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currBytes	TokenNameIdentifier	 curr Bytes
<	TokenNameLESS	
currSize	TokenNameIdentifier	 curr Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"entry '"	TokenNameStringLiteral	entry '
+	TokenNamePLUS	
currName	TokenNameIdentifier	 curr Name
+	TokenNamePLUS	
"' closed at '"	TokenNameStringLiteral	' closed at '
+	TokenNamePLUS	
currBytes	TokenNameIdentifier	 curr Bytes
+	TokenNamePLUS	
"' before the '"	TokenNameStringLiteral	' before the '
+	TokenNamePLUS	
currSize	TokenNameIdentifier	 curr Size
+	TokenNamePLUS	
"' bytes specified in the header were written"	TokenNameStringLiteral	' bytes specified in the header were written
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes a byte to the current tar archive entry. * * This method simply calls read( byte[], int, int ). * * @param b The byte written. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Writes a byte to the current tar archive entry. * This method simply calls read( byte[], int, int ). * @param b The byte written. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
oneBuf	TokenNameIdentifier	 one Buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
oneBuf	TokenNameIdentifier	 one Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes bytes to the current tar archive entry. * * This method simply calls write( byte[], int, int ). * * @param wBuf The buffer to write to the archive. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Writes bytes to the current tar archive entry. * This method simply calls write( byte[], int, int ). * @param wBuf The buffer to write to the archive. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wBuf	TokenNameIdentifier	 w Buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
wBuf	TokenNameIdentifier	 w Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wBuf	TokenNameIdentifier	 w Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes bytes to the current tar archive entry. This method * is aware of the current entry and will throw an exception if * you attempt to write bytes past the length specified for the * current entry. The method is also (painfully) aware of the * record buffering required by TarBuffer, and manages buffers * that are not a multiple of recordsize in length, including * assembling records from small buffers. * * @param wBuf The buffer to write to the archive. * @param wOffset The offset in the buffer from which to get bytes. * @param numToWrite The number of bytes to write. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Writes bytes to the current tar archive entry. This method is aware of the current entry and will throw an exception if you attempt to write bytes past the length specified for the current entry. The method is also (painfully) aware of the record buffering required by TarBuffer, and manages buffers that are not a multiple of recordsize in length, including assembling records from small buffers. * @param wBuf The buffer to write to the archive. @param wOffset The offset in the buffer from which to get bytes. @param numToWrite The number of bytes to write. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wBuf	TokenNameIdentifier	 w Buf
,	TokenNameCOMMA	
int	TokenNameint	
wOffset	TokenNameIdentifier	 w Offset
,	TokenNameCOMMA	
int	TokenNameint	
numToWrite	TokenNameIdentifier	 num To Write
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currBytes	TokenNameIdentifier	 curr Bytes
+	TokenNamePLUS	
numToWrite	TokenNameIdentifier	 num To Write
)	TokenNameRPAREN	
>	TokenNameGREATER	
currSize	TokenNameIdentifier	 curr Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"request to write '"	TokenNameStringLiteral	request to write '
+	TokenNamePLUS	
numToWrite	TokenNameIdentifier	 num To Write
+	TokenNamePLUS	
"' bytes exceeds size in header of '"	TokenNameStringLiteral	' bytes exceeds size in header of '
+	TokenNamePLUS	
currSize	TokenNameIdentifier	 curr Size
+	TokenNamePLUS	
"' bytes for entry '"	TokenNameStringLiteral	' bytes for entry '
+	TokenNamePLUS	
currName	TokenNameIdentifier	 curr Name
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// We have to deal with assembly!!! 	TokenNameCOMMENT_LINE	We have to deal with assembly!!! 
// The programmer can be writing little 32 byte chunks for all 	TokenNameCOMMENT_LINE	The programmer can be writing little 32 byte chunks for all 
// we know, and we must assemble complete records for writing. 	TokenNameCOMMENT_LINE	we know, and we must assemble complete records for writing. 
// REVIEW Maybe this should be in TarBuffer? Could that help to 	TokenNameCOMMENT_LINE	REVIEW Maybe this should be in TarBuffer? Could that help to 
// eliminate some of the buffer copying. 	TokenNameCOMMENT_LINE	eliminate some of the buffer copying. 
// 	TokenNameCOMMENT_LINE	 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
assemLen	TokenNameIdentifier	 assem Len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
assemLen	TokenNameIdentifier	 assem Len
+	TokenNamePLUS	
numToWrite	TokenNameIdentifier	 num To Write
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
recordBuf	TokenNameIdentifier	 record Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
aLen	TokenNameIdentifier	 a Len
=	TokenNameEQUAL	
recordBuf	TokenNameIdentifier	 record Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
assemLen	TokenNameIdentifier	 assem Len
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
assemBuf	TokenNameIdentifier	 assem Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
recordBuf	TokenNameIdentifier	 record Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
assemLen	TokenNameIdentifier	 assem Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
wBuf	TokenNameIdentifier	 w Buf
,	TokenNameCOMMA	
wOffset	TokenNameIdentifier	 w Offset
,	TokenNameCOMMA	
recordBuf	TokenNameIdentifier	 record Buf
,	TokenNameCOMMA	
assemLen	TokenNameIdentifier	 assem Len
,	TokenNameCOMMA	
aLen	TokenNameIdentifier	 a Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
recordBuf	TokenNameIdentifier	 record Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currBytes	TokenNameIdentifier	 curr Bytes
+=	TokenNamePLUS_EQUAL	
recordBuf	TokenNameIdentifier	 record Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
wOffset	TokenNameIdentifier	 w Offset
+=	TokenNamePLUS_EQUAL	
aLen	TokenNameIdentifier	 a Len
;	TokenNameSEMICOLON	
numToWrite	TokenNameIdentifier	 num To Write
-=	TokenNameMINUS_EQUAL	
aLen	TokenNameIdentifier	 a Len
;	TokenNameSEMICOLON	
assemLen	TokenNameIdentifier	 assem Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
wBuf	TokenNameIdentifier	 w Buf
,	TokenNameCOMMA	
wOffset	TokenNameIdentifier	 w Offset
,	TokenNameCOMMA	
assemBuf	TokenNameIdentifier	 assem Buf
,	TokenNameCOMMA	
assemLen	TokenNameIdentifier	 assem Len
,	TokenNameCOMMA	
numToWrite	TokenNameIdentifier	 num To Write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wOffset	TokenNameIdentifier	 w Offset
+=	TokenNamePLUS_EQUAL	
numToWrite	TokenNameIdentifier	 num To Write
;	TokenNameSEMICOLON	
assemLen	TokenNameIdentifier	 assem Len
+=	TokenNamePLUS_EQUAL	
numToWrite	TokenNameIdentifier	 num To Write
;	TokenNameSEMICOLON	
numToWrite	TokenNameIdentifier	 num To Write
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// When we get here we have EITHER: 	TokenNameCOMMENT_LINE	When we get here we have EITHER: 
// o An empty "assemble" buffer. 	TokenNameCOMMENT_LINE	o An empty "assemble" buffer. 
// o No bytes to write (numToWrite == 0) 	TokenNameCOMMENT_LINE	o No bytes to write (numToWrite == 0) 
// 	TokenNameCOMMENT_LINE	 
while	TokenNamewhile	
(	TokenNameLPAREN	
numToWrite	TokenNameIdentifier	 num To Write
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numToWrite	TokenNameIdentifier	 num To Write
<	TokenNameLESS	
recordBuf	TokenNameIdentifier	 record Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
wBuf	TokenNameIdentifier	 w Buf
,	TokenNameCOMMA	
wOffset	TokenNameIdentifier	 w Offset
,	TokenNameCOMMA	
assemBuf	TokenNameIdentifier	 assem Buf
,	TokenNameCOMMA	
assemLen	TokenNameIdentifier	 assem Len
,	TokenNameCOMMA	
numToWrite	TokenNameIdentifier	 num To Write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assemLen	TokenNameIdentifier	 assem Len
+=	TokenNamePLUS_EQUAL	
numToWrite	TokenNameIdentifier	 num To Write
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
wBuf	TokenNameIdentifier	 w Buf
,	TokenNameCOMMA	
wOffset	TokenNameIdentifier	 w Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
recordBuf	TokenNameIdentifier	 record Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
currBytes	TokenNameIdentifier	 curr Bytes
+=	TokenNamePLUS_EQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
numToWrite	TokenNameIdentifier	 num To Write
-=	TokenNameMINUS_EQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
wOffset	TokenNameIdentifier	 w Offset
+=	TokenNamePLUS_EQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write an EOF (end of archive) record to the tar archive. * An EOF record consists of a record of all zeros. */	TokenNameCOMMENT_JAVADOC	 Write an EOF (end of archive) record to the tar archive. An EOF record consists of a record of all zeros. 
private	TokenNameprivate	
void	TokenNamevoid	
writeEOFRecord	TokenNameIdentifier	 write EOF Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
recordBuf	TokenNameIdentifier	 record Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recordBuf	TokenNameIdentifier	 record Buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
recordBuf	TokenNameIdentifier	 record Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
