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
InputStream	TokenNameIdentifier	 Input Stream
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * The TarBuffer class implements the tar archive concept * of a buffered input stream. This concept goes back to the * days of blocked tape drives and special io devices. In the * Java universe, the only real function that this class * performs is to ensure that files have the correct "block" * size, or other tars will complain. * <p> * You should never have a need to access this class directly. * TarBuffers are created by Tar IO Streams. * */	TokenNameCOMMENT_JAVADOC	 The TarBuffer class implements the tar archive concept of a buffered input stream. This concept goes back to the days of blocked tape drives and special io devices. In the Java universe, the only real function that this class performs is to ensure that files have the correct "block" size, or other tars will complain. <p> You should never have a need to access this class directly. TarBuffers are created by Tar IO Streams. 
public	TokenNamepublic	
class	TokenNameclass	
TarBuffer	TokenNameIdentifier	 Tar Buffer
{	TokenNameLBRACE	
/** Default record size */	TokenNameCOMMENT_JAVADOC	 Default record size 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
512	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Default block size */	TokenNameCOMMENT_JAVADOC	 Default block size 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BLKSIZE	TokenNameIdentifier	 DEFAULT  BLKSIZE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
*	TokenNameMULTIPLY	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
inStream	TokenNameIdentifier	 in Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
outStream	TokenNameIdentifier	 out Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blockBuffer	TokenNameIdentifier	 block Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
recordSize	TokenNameIdentifier	 record Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
recsPerBlock	TokenNameIdentifier	 recs Per Block
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
/** * Constructor for a TarBuffer on an input stream. * @param inStream the input stream to use */	TokenNameCOMMENT_JAVADOC	 Constructor for a TarBuffer on an input stream. @param inStream the input stream to use 
public	TokenNamepublic	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inStream	TokenNameIdentifier	 in Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_BLKSIZE	TokenNameIdentifier	 DEFAULT  BLKSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a TarBuffer on an input stream. * @param inStream the input stream to use * @param blockSize the block size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for a TarBuffer on an input stream. @param inStream the input stream to use @param blockSize the block size to use 
public	TokenNamepublic	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inStream	TokenNameIdentifier	 in Stream
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a TarBuffer on an input stream. * @param inStream the input stream to use * @param blockSize the block size to use * @param recordSize the record size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for a TarBuffer on an input stream. @param inStream the input stream to use @param blockSize the block size to use @param recordSize the record size to use 
public	TokenNamepublic	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inStream	TokenNameIdentifier	 in Stream
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
int	TokenNameint	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inStream	TokenNameIdentifier	 in Stream
=	TokenNameEQUAL	
inStream	TokenNameIdentifier	 in Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a TarBuffer on an output stream. * @param outStream the output stream to use */	TokenNameCOMMENT_JAVADOC	 Constructor for a TarBuffer on an output stream. @param outStream the output stream to use 
public	TokenNamepublic	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
outStream	TokenNameIdentifier	 out Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_BLKSIZE	TokenNameIdentifier	 DEFAULT  BLKSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a TarBuffer on an output stream. * @param outStream the output stream to use * @param blockSize the block size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for a TarBuffer on an output stream. @param outStream the output stream to use @param blockSize the block size to use 
public	TokenNamepublic	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
outStream	TokenNameIdentifier	 out Stream
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a TarBuffer on an output stream. * @param outStream the output stream to use * @param blockSize the block size to use * @param recordSize the record size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for a TarBuffer on an output stream. @param outStream the output stream to use @param blockSize the block size to use @param recordSize the record size to use 
public	TokenNamepublic	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
outStream	TokenNameIdentifier	 out Stream
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
int	TokenNameint	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inStream	TokenNameIdentifier	 in Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
outStream	TokenNameIdentifier	 out Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialization common to all constructors. */	TokenNameCOMMENT_JAVADOC	 Initialization common to all constructors. 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
int	TokenNameint	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recordSize	TokenNameIdentifier	 record Size
=	TokenNameEQUAL	
recordSize	TokenNameIdentifier	 record Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recsPerBlock	TokenNameIdentifier	 recs Per Block
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
/	TokenNameDIVIDE	
this	TokenNamethis	
.	TokenNameDOT	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockBuffer	TokenNameIdentifier	 block Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
inStream	TokenNameIdentifier	 in Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
recsPerBlock	TokenNameIdentifier	 recs Per Block
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the TAR Buffer's block size. Blocks consist of multiple records. * @return the block size */	TokenNameCOMMENT_JAVADOC	 Get the TAR Buffer's block size. Blocks consist of multiple records. @return the block size 
public	TokenNamepublic	
int	TokenNameint	
getBlockSize	TokenNameIdentifier	 get Block Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the TAR Buffer's record size. * @return the record size */	TokenNameCOMMENT_JAVADOC	 Get the TAR Buffer's record size. @return the record size 
public	TokenNamepublic	
int	TokenNameint	
getRecordSize	TokenNameIdentifier	 get Record Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
recordSize	TokenNameIdentifier	 record Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the debugging flag for the buffer. * * @param debug If true, print debugging output. */	TokenNameCOMMENT_JAVADOC	 Set the debugging flag for the buffer. * @param debug If true, print debugging output. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if an archive record indicate End of Archive. End of * archive is indicated by a record that consists entirely of null bytes. * * @param record The record data to check. * @return true if the record data is an End of Archive */	TokenNameCOMMENT_JAVADOC	 Determine if an archive record indicate End of Archive. End of archive is indicated by a record that consists entirely of null bytes. * @param record The record data to check. @return true if the record data is an End of Archive 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEOFRecord	TokenNameIdentifier	 is EOF Record
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
getRecordSize	TokenNameIdentifier	 get Record Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skip over a record on the input stream. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Skip over a record on the input stream. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
skipRecord	TokenNameIdentifier	 skip Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"SkipRecord: recIdx = "	TokenNameStringLiteral	SkipRecord: recIdx = 
+	TokenNamePLUS	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
+	TokenNamePLUS	
" blkIdx = "	TokenNameStringLiteral	 blkIdx = 
+	TokenNamePLUS	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"reading (via skip) from an output buffer"	TokenNameStringLiteral	reading (via skip) from an output buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
>=	TokenNameGREATER_EQUAL	
recsPerBlock	TokenNameIdentifier	 recs Per Block
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
readBlock	TokenNameIdentifier	 read Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// UNDONE 	TokenNameCOMMENT_LINE	UNDONE 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a record from the input stream and return the data. * * @return The record data. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Read a record from the input stream and return the data. * @return The record data. @throws IOException on error 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readRecord	TokenNameIdentifier	 read Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ReadRecord: recIdx = "	TokenNameStringLiteral	ReadRecord: recIdx = 
+	TokenNamePLUS	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
+	TokenNamePLUS	
" blkIdx = "	TokenNameStringLiteral	 blkIdx = 
+	TokenNamePLUS	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"reading from an output buffer"	TokenNameStringLiteral	reading from an output buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
>=	TokenNameGREATER_EQUAL	
recsPerBlock	TokenNameIdentifier	 recs Per Block
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
readBlock	TokenNameIdentifier	 read Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
recordSize	TokenNameIdentifier	 record Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
*	TokenNameMULTIPLY	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return false if End-Of-File, else true */	TokenNameCOMMENT_JAVADOC	 @return false if End-Of-File, else true 
private	TokenNameprivate	
boolean	TokenNameboolean	
readBlock	TokenNameIdentifier	 read Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ReadBlock: blkIdx = "	TokenNameStringLiteral	ReadBlock: blkIdx = 
+	TokenNamePLUS	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"reading from an output buffer"	TokenNameStringLiteral	reading from an output buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesNeeded	TokenNameIdentifier	 bytes Needed
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bytesNeeded	TokenNameIdentifier	 bytes Needed
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
inStream	TokenNameIdentifier	 in Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytesNeeded	TokenNameIdentifier	 bytes Needed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// NOTE 	TokenNameCOMMENT_LINE	NOTE 
// We have fit EOF, and the block is not full! 	TokenNameCOMMENT_LINE	We have fit EOF, and the block is not full! 
// 	TokenNameCOMMENT_LINE	 
// This is a broken archive. It does not follow the standard 	TokenNameCOMMENT_LINE	This is a broken archive. It does not follow the standard 
// blocking algorithm. However, because we are generous, and 	TokenNameCOMMENT_LINE	blocking algorithm. However, because we are generous, and 
// it requires little effort, we will simply ignore the error 	TokenNameCOMMENT_LINE	it requires little effort, we will simply ignore the error 
// and continue as if the entire block were read. This does 	TokenNameCOMMENT_LINE	and continue as if the entire block were read. This does 
// not appear to break anything upstream. We used to return 	TokenNameCOMMENT_LINE	not appear to break anything upstream. We used to return 
// false in this case. 	TokenNameCOMMENT_LINE	false in this case. 
// 	TokenNameCOMMENT_LINE	 
// Thanks to 'Yohann.Roussel@alcatel.fr' for this fix. 	TokenNameCOMMENT_LINE	Thanks to 'Yohann.Roussel@alcatel.fr' for this fix. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ensure that we do not read gigabytes of zeros 	TokenNameCOMMENT_LINE	Ensure that we do not read gigabytes of zeros 
// for a corrupt tar file. 	TokenNameCOMMENT_LINE	for a corrupt tar file. 
// See http://issues.apache.org/bugzilla/show_bug.cgi?id=39924 	TokenNameCOMMENT_LINE	See http://issues.apache.org/bugzilla/show_bug.cgi?id=39924 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// However, just leaving the unread portion of the buffer dirty does 	TokenNameCOMMENT_LINE	However, just leaving the unread portion of the buffer dirty does 
// cause problems in some cases. This problem is described in 	TokenNameCOMMENT_LINE	cause problems in some cases. This problem is described in 
// http://issues.apache.org/bugzilla/show_bug.cgi?id=29877 	TokenNameCOMMENT_LINE	http://issues.apache.org/bugzilla/show_bug.cgi?id=29877 
// 	TokenNameCOMMENT_LINE	 
// The solution is to fill the unused portion of the buffer with zeros. 	TokenNameCOMMENT_LINE	The solution is to fill the unused portion of the buffer with zeros. 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
bytesNeeded	TokenNameIdentifier	 bytes Needed
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
bytesNeeded	TokenNameIdentifier	 bytes Needed
-=	TokenNameMINUS_EQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
!=	TokenNameNOT_EQUAL	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ReadBlock: INCOMPLETE READ "	TokenNameStringLiteral	ReadBlock: INCOMPLETE READ 
+	TokenNamePLUS	
numBytes	TokenNameIdentifier	 num Bytes
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
blockSize	TokenNameIdentifier	 block Size
+	TokenNamePLUS	
" bytes read."	TokenNameStringLiteral	 bytes read.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current block number, zero based. * * @return The current zero based block number. */	TokenNameCOMMENT_JAVADOC	 Get the current block number, zero based. * @return The current zero based block number. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentBlockNum	TokenNameIdentifier	 get Current Block Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current record number, within the current block, zero based. * Thus, current offset = (currentBlockNum * recsPerBlk) + currentRecNum. * * @return The current zero based record number. */	TokenNameCOMMENT_JAVADOC	 Get the current record number, within the current block, zero based. Thus, current offset = (currentBlockNum recsPerBlk) + currentRecNum. * @return The current zero based record number. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentRecordNum	TokenNameIdentifier	 get Current Record Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write an archive record to the archive. * * @param record The record data to write to the archive. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Write an archive record to the archive. * @param record The record data to write to the archive. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WriteRecord: recIdx = "	TokenNameStringLiteral	WriteRecord: recIdx = 
+	TokenNamePLUS	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
+	TokenNamePLUS	
" blkIdx = "	TokenNameStringLiteral	 blkIdx = 
+	TokenNamePLUS	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"writing to an input buffer"	TokenNameStringLiteral	writing to an input buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"record to write has length '"	TokenNameStringLiteral	record to write has length '
+	TokenNamePLUS	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
"' which is not the record size of '"	TokenNameStringLiteral	' which is not the record size of '
+	TokenNamePLUS	
recordSize	TokenNameIdentifier	 record Size
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
>=	TokenNameGREATER_EQUAL	
recsPerBlock	TokenNameIdentifier	 recs Per Block
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeBlock	TokenNameIdentifier	 write Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
*	TokenNameMULTIPLY	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write an archive record to the archive, where the record may be * inside of a larger array buffer. The buffer must be "offset plus * record size" long. * * @param buf The buffer containing the record data to write. * @param offset The offset of the record data within buf. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Write an archive record to the archive, where the record may be inside of a larger array buffer. The buffer must be "offset plus record size" long. * @param buf The buffer containing the record data to write. @param offset The offset of the record data within buf. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
writeRecord	TokenNameIdentifier	 write Record
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WriteRecord: recIdx = "	TokenNameStringLiteral	WriteRecord: recIdx = 
+	TokenNamePLUS	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
+	TokenNamePLUS	
" blkIdx = "	TokenNameStringLiteral	 blkIdx = 
+	TokenNamePLUS	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"writing to an input buffer"	TokenNameStringLiteral	writing to an input buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
>	TokenNameGREATER	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"record has length '"	TokenNameStringLiteral	record has length '
+	TokenNamePLUS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
"' with offset '"	TokenNameStringLiteral	' with offset '
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
"' which is less than the record size of '"	TokenNameStringLiteral	' which is less than the record size of '
+	TokenNamePLUS	
recordSize	TokenNameIdentifier	 record Size
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
>=	TokenNameGREATER_EQUAL	
recsPerBlock	TokenNameIdentifier	 recs Per Block
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeBlock	TokenNameIdentifier	 write Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
*	TokenNameMULTIPLY	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a TarBuffer block to the archive. */	TokenNameCOMMENT_JAVADOC	 Write a TarBuffer block to the archive. 
private	TokenNameprivate	
void	TokenNamevoid	
writeBlock	TokenNameIdentifier	 write Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WriteBlock: blkIdx = "	TokenNameStringLiteral	WriteBlock: blkIdx = 
+	TokenNamePLUS	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"writing to an input buffer"	TokenNameStringLiteral	writing to an input buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currBlkIdx	TokenNameIdentifier	 curr Blk Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
blockBuffer	TokenNameIdentifier	 block Buffer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush the current data block if it has any data in it. */	TokenNameCOMMENT_JAVADOC	 Flush the current data block if it has any data in it. 
void	TokenNamevoid	
flushBlock	TokenNameIdentifier	 flush Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TarBuffer.flushBlock() called."	TokenNameStringLiteral	TarBuffer.flushBlock() called.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"writing to an input buffer"	TokenNameStringLiteral	writing to an input buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currRecIdx	TokenNameIdentifier	 curr Rec Idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeBlock	TokenNameIdentifier	 write Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close the TarBuffer. If this is an output buffer, also flush the * current block before closing. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Close the TarBuffer. If this is an output buffer, also flush the current block before closing. @throws IOException on error 
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
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TarBuffer.closeBuffer()."	TokenNameStringLiteral	TarBuffer.closeBuffer().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushBlock	TokenNameIdentifier	 flush Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
!=	TokenNameNOT_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
&&	TokenNameAND_AND	
outStream	TokenNameIdentifier	 out Stream
!=	TokenNameNOT_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
!=	TokenNameNOT_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inStream	TokenNameIdentifier	 in Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inStream	TokenNameIdentifier	 in Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
