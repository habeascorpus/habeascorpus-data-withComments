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
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * The TarInputStream reads a UNIX tar archive as an InputStream. * methods are provided to position at each successive entry in * the archive, and the read each entry as a normal input stream * using read(). * */	TokenNameCOMMENT_JAVADOC	 The TarInputStream reads a UNIX tar archive as an InputStream. methods are provided to position at each successive entry in the archive, and the read each entry as a normal input stream using read(). 
public	TokenNamepublic	
class	TokenNameclass	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
extends	TokenNameextends	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SMALL_BUFFER_SIZE	TokenNameIdentifier	 SMALL  BUFFER  SIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LARGE_BUFFER_SIZE	TokenNameIdentifier	 LARGE  BUFFER  SIZE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasHitEOF	TokenNameIdentifier	 has Hit EOF
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
entrySize	TokenNameIdentifier	 entry Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
entryOffset	TokenNameIdentifier	 entry Offset
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readBuf	TokenNameIdentifier	 read Buf
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TarBuffer	TokenNameIdentifier	 Tar Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TarEntry	TokenNameIdentifier	 Tar Entry
currEntry	TokenNameIdentifier	 curr Entry
;	TokenNameSEMICOLON	
/** * This contents of this array is not used at all in this class, * it is only here to avoid repreated object creation during calls * to the no-arg read method. */	TokenNameCOMMENT_JAVADOC	 This contents of this array is not used at all in this class, it is only here to avoid repreated object creation during calls to the no-arg read method. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oneBuf	TokenNameIdentifier	 one Buf
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Constructor for TarInputStream. * @param is the input stream to use */	TokenNameCOMMENT_JAVADOC	 Constructor for TarInputStream. @param is the input stream to use 
public	TokenNamepublic	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
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
/** * Constructor for TarInputStream. * @param is the input stream to use * @param blockSize the block size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for TarInputStream. @param is the input stream to use @param blockSize the block size to use 
public	TokenNamepublic	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
TarBuffer	TokenNameIdentifier	 Tar Buffer
.	TokenNameDOT	
DEFAULT_RCDSIZE	TokenNameIdentifier	 DEFAULT  RCDSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for TarInputStream. * @param is the input stream to use * @param blockSize the block size to use * @param recordSize the record size to use */	TokenNameCOMMENT_JAVADOC	 Constructor for TarInputStream. @param is the input stream to use @param blockSize the block size to use @param recordSize the record size to use 
public	TokenNamepublic	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
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
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
TarBuffer	TokenNameIdentifier	 Tar Buffer
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
,	TokenNameCOMMA	
recordSize	TokenNameIdentifier	 record Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
readBuf	TokenNameIdentifier	 read Buf
=	TokenNameEQUAL	
null	TokenNamenull	
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
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasHitEOF	TokenNameIdentifier	 has Hit EOF
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the debugging flag. * * @param debug True to turn on debugging. */	TokenNameCOMMENT_JAVADOC	 Sets the debugging flag. * @param debug True to turn on debugging. 
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
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes this stream. Calls the TarBuffer's close() method. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Closes this stream. Calls the TarBuffer's close() method. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Get the available data that can be read from the current * entry in the archive. This does not indicate how much data * is left in the entire archive, only in the current entry. * This value is determined from the entry's size header field * and the amount of data already read from the current entry. * Integer.MAX_VALUE is returen in case more than Integer.MAX_VALUE * bytes are left in the current entry in the archive. * * @return The number of available bytes for the current entry. * @throws IOException for signature */	TokenNameCOMMENT_JAVADOC	 Get the available data that can be read from the current entry in the archive. This does not indicate how much data is left in the entire archive, only in the current entry. This value is determined from the entry's size header field and the amount of data already read from the current entry. Integer.MAX_VALUE is returen in case more than Integer.MAX_VALUE bytes are left in the current entry in the archive. * @return The number of available bytes for the current entry. @throws IOException for signature 
public	TokenNamepublic	
int	TokenNameint	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entrySize	TokenNameIdentifier	 entry Size
-	TokenNameMINUS	
entryOffset	TokenNameIdentifier	 entry Offset
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
entrySize	TokenNameIdentifier	 entry Size
-	TokenNameMINUS	
entryOffset	TokenNameIdentifier	 entry Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skip bytes in the input buffer. This skips bytes in the * current entry's data, not the entire archive, and will * stop at the end of the current entry's data if the number * to skip extends beyond that point. * * @param numToSkip The number of bytes to skip. * @return the number actually skipped * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Skip bytes in the input buffer. This skips bytes in the current entry's data, not the entire archive, and will stop at the end of the current entry's data if the number to skip extends beyond that point. * @param numToSkip The number of bytes to skip. @return the number actually skipped @throws IOException on error 
public	TokenNamepublic	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
numToSkip	TokenNameIdentifier	 num To Skip
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// REVIEW 	TokenNameCOMMENT_LINE	REVIEW 
// This is horribly inefficient, but it ensures that we 	TokenNameCOMMENT_LINE	This is horribly inefficient, but it ensures that we 
// properly skip over bytes via the TarBuffer... 	TokenNameCOMMENT_LINE	properly skip over bytes via the TarBuffer... 
// 	TokenNameCOMMENT_LINE	 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skipBuf	TokenNameIdentifier	 skip Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
numToSkip	TokenNameIdentifier	 num To Skip
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
realSkip	TokenNameIdentifier	 real Skip
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
>	TokenNameGREATER	
skipBuf	TokenNameIdentifier	 skip Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
skipBuf	TokenNameIdentifier	 skip Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numRead	TokenNameIdentifier	 num Read
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
skipBuf	TokenNameIdentifier	 skip Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
realSkip	TokenNameIdentifier	 real Skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numRead	TokenNameIdentifier	 num Read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skip	TokenNameIdentifier	 skip
-=	TokenNameMINUS_EQUAL	
numRead	TokenNameIdentifier	 num Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
numToSkip	TokenNameIdentifier	 num To Skip
-	TokenNameMINUS	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Since we do not support marking just yet, we return false. * * @return False. */	TokenNameCOMMENT_JAVADOC	 Since we do not support marking just yet, we return false. * @return False. 
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Since we do not support marking just yet, we do nothing. * * @param markLimit The limit to mark. */	TokenNameCOMMENT_JAVADOC	 Since we do not support marking just yet, we do nothing. * @param markLimit The limit to mark. 
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
markLimit	TokenNameIdentifier	 mark Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Since we do not support marking just yet, we do nothing. */	TokenNameCOMMENT_JAVADOC	 Since we do not support marking just yet, we do nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the next entry in this tar archive. This will skip * over any remaining data in the current entry, if there * is one, and place the input stream at the header of the * next entry, and read the header and instantiate a new * TarEntry from the header bytes and return that entry. * If there are no more entries in the archive, null will * be returned to indicate that the end of the archive has * been reached. * * @return The next TarEntry in the archive, or null. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Get the next entry in this tar archive. This will skip over any remaining data in the current entry, if there is one, and place the input stream at the header of the next entry, and read the header and instantiate a new TarEntry from the header bytes and return that entry. If there are no more entries in the archive, null will be returned to indicate that the end of the archive has been reached. * @return The next TarEntry in the archive, or null. @throws IOException on error 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasHitEOF	TokenNameIdentifier	 has Hit EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currEntry	TokenNameIdentifier	 curr Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
numToSkip	TokenNameIdentifier	 num To Skip
=	TokenNameEQUAL	
entrySize	TokenNameIdentifier	 entry Size
-	TokenNameMINUS	
entryOffset	TokenNameIdentifier	 entry Offset
;	TokenNameSEMICOLON	
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
"TarInputStream: SKIP currENTRY '"	TokenNameStringLiteral	TarInputStream: SKIP currENTRY '
+	TokenNamePLUS	
currEntry	TokenNameIdentifier	 curr Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' SZ "	TokenNameStringLiteral	' SZ 
+	TokenNamePLUS	
entrySize	TokenNameIdentifier	 entry Size
+	TokenNamePLUS	
" OFF "	TokenNameStringLiteral	 OFF 
+	TokenNamePLUS	
entryOffset	TokenNameIdentifier	 entry Offset
+	TokenNamePLUS	
" skipping "	TokenNameStringLiteral	 skipping 
+	TokenNamePLUS	
numToSkip	TokenNameIdentifier	 num To Skip
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
numToSkip	TokenNameIdentifier	 num To Skip
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
skipped	TokenNameIdentifier	 skipped
=	TokenNameEQUAL	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
numToSkip	TokenNameIdentifier	 num To Skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"failed to skip current tar"	TokenNameStringLiteral	failed to skip current tar
+	TokenNamePLUS	
" entry"	TokenNameStringLiteral	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numToSkip	TokenNameIdentifier	 num To Skip
-=	TokenNameMINUS_EQUAL	
skipped	TokenNameIdentifier	 skipped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readBuf	TokenNameIdentifier	 read Buf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
headerBuf	TokenNameIdentifier	 header Buf
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
readRecord	TokenNameIdentifier	 read Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
headerBuf	TokenNameIdentifier	 header Buf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
"READ NULL RECORD"	TokenNameStringLiteral	READ NULL RECORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasHitEOF	TokenNameIdentifier	 has Hit EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
isEOFRecord	TokenNameIdentifier	 is EOF Record
(	TokenNameLPAREN	
headerBuf	TokenNameIdentifier	 header Buf
)	TokenNameRPAREN	
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
"READ EOF RECORD"	TokenNameStringLiteral	READ EOF RECORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasHitEOF	TokenNameIdentifier	 has Hit EOF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasHitEOF	TokenNameIdentifier	 has Hit EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currEntry	TokenNameIdentifier	 curr Entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currEntry	TokenNameIdentifier	 curr Entry
=	TokenNameEQUAL	
new	TokenNamenew	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
headerBuf	TokenNameIdentifier	 header Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"TarInputStream: SET CURRENTRY '"	TokenNameStringLiteral	TarInputStream: SET CURRENTRY '
+	TokenNamePLUS	
currEntry	TokenNameIdentifier	 curr Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' size = "	TokenNameStringLiteral	' size = 
+	TokenNamePLUS	
currEntry	TokenNameIdentifier	 curr Entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entryOffset	TokenNameIdentifier	 entry Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
entrySize	TokenNameIdentifier	 entry Size
=	TokenNameEQUAL	
currEntry	TokenNameIdentifier	 curr Entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currEntry	TokenNameIdentifier	 curr Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
currEntry	TokenNameIdentifier	 curr Entry
.	TokenNameDOT	
isGNULongNameEntry	TokenNameIdentifier	 is GNU Long Name Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read in the name 	TokenNameCOMMENT_LINE	read in the name 
StringBuffer	TokenNameIdentifier	 String Buffer
longName	TokenNameIdentifier	 long Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
SMALL_BUFFER_SIZE	TokenNameIdentifier	 SMALL  BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currEntry	TokenNameIdentifier	 curr Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Bugzilla: 40334 	TokenNameCOMMENT_LINE	Bugzilla: 40334 
// Malformed tar file - long entry name not followed by entry 	TokenNameCOMMENT_LINE	Malformed tar file - long entry name not followed by entry 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// remove trailing null terminator 	TokenNameCOMMENT_LINE	remove trailing null terminator 
if	TokenNameif	
(	TokenNameLPAREN	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currEntry	TokenNameIdentifier	 curr Entry
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
longName	TokenNameIdentifier	 long Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currEntry	TokenNameIdentifier	 curr Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a byte from the current tar archive entry. * * This method simply calls read( byte[], int, int ). * * @return The byte read, or -1 at EOF. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Reads a byte from the current tar archive entry. * This method simply calls read( byte[], int, int ). * @return The byte read, or -1 at EOF. @throws IOException on error 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
oneBuf	TokenNameIdentifier	 one Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
num	TokenNameIdentifier	 num
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
oneBuf	TokenNameIdentifier	 one Buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads bytes from the current tar archive entry. * * This method is aware of the boundaries of the current * entry in the archive and will deal with them as if they * were this stream's start and EOF. * * @param buf The buffer into which to place bytes read. * @param offset The offset at which to place bytes read. * @param numToRead The number of bytes to read. * @return The number of bytes read, or -1 at EOF. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Reads bytes from the current tar archive entry. * This method is aware of the boundaries of the current entry in the archive and will deal with them as if they were this stream's start and EOF. * @param buf The buffer into which to place bytes read. @param offset The offset at which to place bytes read. @param numToRead The number of bytes to read. @return The number of bytes read, or -1 at EOF. @throws IOException on error 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
numToRead	TokenNameIdentifier	 num To Read
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
totalRead	TokenNameIdentifier	 total Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entryOffset	TokenNameIdentifier	 entry Offset
>=	TokenNameGREATER_EQUAL	
entrySize	TokenNameIdentifier	 entry Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numToRead	TokenNameIdentifier	 num To Read
+	TokenNamePLUS	
entryOffset	TokenNameIdentifier	 entry Offset
)	TokenNameRPAREN	
>	TokenNameGREATER	
entrySize	TokenNameIdentifier	 entry Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numToRead	TokenNameIdentifier	 num To Read
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
entrySize	TokenNameIdentifier	 entry Size
-	TokenNameMINUS	
entryOffset	TokenNameIdentifier	 entry Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
readBuf	TokenNameIdentifier	 read Buf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
(	TokenNameLPAREN	
numToRead	TokenNameIdentifier	 num To Read
>	TokenNameGREATER	
readBuf	TokenNameIdentifier	 read Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
readBuf	TokenNameIdentifier	 read Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
numToRead	TokenNameIdentifier	 num To Read
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
readBuf	TokenNameIdentifier	 read Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>=	TokenNameGREATER_EQUAL	
readBuf	TokenNameIdentifier	 read Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readBuf	TokenNameIdentifier	 read Buf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
newLen	TokenNameIdentifier	 new Len
=	TokenNameEQUAL	
readBuf	TokenNameIdentifier	 read Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuf	TokenNameIdentifier	 new Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
readBuf	TokenNameIdentifier	 read Buf
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
,	TokenNameCOMMA	
newBuf	TokenNameIdentifier	 new Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readBuf	TokenNameIdentifier	 read Buf
=	TokenNameEQUAL	
newBuf	TokenNameIdentifier	 new Buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
totalRead	TokenNameIdentifier	 total Read
+=	TokenNamePLUS_EQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
numToRead	TokenNameIdentifier	 num To Read
-=	TokenNameMINUS_EQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
numToRead	TokenNameIdentifier	 num To Read
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rec	TokenNameIdentifier	 rec
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
readRecord	TokenNameIdentifier	 read Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rec	TokenNameIdentifier	 rec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Unexpected EOF! 	TokenNameCOMMENT_LINE	Unexpected EOF! 
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unexpected EOF with "	TokenNameStringLiteral	unexpected EOF with 
+	TokenNamePLUS	
numToRead	TokenNameIdentifier	 num To Read
+	TokenNamePLUS	
" bytes unread"	TokenNameStringLiteral	 bytes unread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
numToRead	TokenNameIdentifier	 num To Read
;	TokenNameSEMICOLON	
int	TokenNameint	
recLen	TokenNameIdentifier	 rec Len
=	TokenNameEQUAL	
rec	TokenNameIdentifier	 rec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recLen	TokenNameIdentifier	 rec Len
>	TokenNameGREATER	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rec	TokenNameIdentifier	 rec
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readBuf	TokenNameIdentifier	 read Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
recLen	TokenNameIdentifier	 rec Len
-	TokenNameMINUS	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rec	TokenNameIdentifier	 rec
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
,	TokenNameCOMMA	
readBuf	TokenNameIdentifier	 read Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
recLen	TokenNameIdentifier	 rec Len
-	TokenNameMINUS	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
recLen	TokenNameIdentifier	 rec Len
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rec	TokenNameIdentifier	 rec
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
recLen	TokenNameIdentifier	 rec Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
totalRead	TokenNameIdentifier	 total Read
+=	TokenNamePLUS_EQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
numToRead	TokenNameIdentifier	 num To Read
-=	TokenNameMINUS_EQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entryOffset	TokenNameIdentifier	 entry Offset
+=	TokenNamePLUS_EQUAL	
totalRead	TokenNameIdentifier	 total Read
;	TokenNameSEMICOLON	
return	TokenNamereturn	
totalRead	TokenNameIdentifier	 total Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the contents of the current tar archive entry directly into * an output stream. * * @param out The OutputStream into which to write the entry's data. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Copies the contents of the current tar archive entry directly into an output stream. * @param out The OutputStream into which to write the entry's data. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
copyEntryContents	TokenNameIdentifier	 copy Entry Contents
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
LARGE_BUFFER_SIZE	TokenNameIdentifier	 LARGE  BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numRead	TokenNameIdentifier	 num Read
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numRead	TokenNameIdentifier	 num Read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numRead	TokenNameIdentifier	 num Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
