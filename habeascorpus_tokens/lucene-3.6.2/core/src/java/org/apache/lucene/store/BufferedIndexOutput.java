package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Base implementation class for buffered {@link IndexOutput}. */	TokenNameCOMMENT_JAVADOC	 Base implementation class for buffered {@link IndexOutput}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BufferedIndexOutput	TokenNameIdentifier	 Buffered Index Output
extends	TokenNameextends	
IndexOutput	TokenNameIdentifier	 Index Output
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
16384	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
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
private	TokenNameprivate	
long	TokenNamelong	
bufferStart	TokenNameIdentifier	 buffer Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// position in file of buffer 	TokenNameCOMMENT_LINE	position in file of buffer 
private	TokenNameprivate	
int	TokenNameint	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// position in buffer 	TokenNameCOMMENT_LINE	position in buffer 
/** Writes a single byte. * @see IndexInput#readByte() */	TokenNameCOMMENT_JAVADOC	 Writes a single byte. @see IndexInput#readByte() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferPosition	TokenNameIdentifier	 buffer Position
>=	TokenNameGREATER_EQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferPosition	TokenNameIdentifier	 buffer Position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes an array of bytes. * @param b the bytes to write * @param length the number of bytes to write * @see IndexInput#readBytes(byte[],int,int) */	TokenNameCOMMENT_JAVADOC	 Writes an array of bytes. @param b the bytes to write @param length the number of bytes to write @see IndexInput#readBytes(byte[],int,int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bytesLeft	TokenNameIdentifier	 bytes Left
=	TokenNameEQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
-	TokenNameMINUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
// is there enough space in the buffer? 	TokenNameCOMMENT_LINE	is there enough space in the buffer? 
if	TokenNameif	
(	TokenNameLPAREN	
bytesLeft	TokenNameIdentifier	 bytes Left
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we add the data to the end of the buffer 	TokenNameCOMMENT_LINE	we add the data to the end of the buffer 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// if the buffer is full, flush it 	TokenNameCOMMENT_LINE	if the buffer is full, flush it 
if	TokenNameif	
(	TokenNameLPAREN	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
-	TokenNameMINUS	
bufferPosition	TokenNameIdentifier	 buffer Position
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// is data larger then buffer? 	TokenNameCOMMENT_LINE	is data larger then buffer? 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we flush the buffer 	TokenNameCOMMENT_LINE	we flush the buffer 
if	TokenNameif	
(	TokenNameLPAREN	
bufferPosition	TokenNameIdentifier	 buffer Position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and write data at once 	TokenNameCOMMENT_LINE	and write data at once 
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we fill/flush the buffer (until the input is written) 	TokenNameCOMMENT_LINE	we fill/flush the buffer (until the input is written) 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// position in the input data 	TokenNameCOMMENT_LINE	position in the input data 
int	TokenNameint	
pieceLength	TokenNameIdentifier	 piece Length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pieceLength	TokenNameIdentifier	 piece Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
bytesLeft	TokenNameIdentifier	 bytes Left
)	TokenNameRPAREN	
?	TokenNameQUESTION	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
:	TokenNameCOLON	
bytesLeft	TokenNameIdentifier	 bytes Left
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
,	TokenNameCOMMA	
pieceLength	TokenNameIdentifier	 piece Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
pieceLength	TokenNameIdentifier	 piece Length
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
+=	TokenNamePLUS_EQUAL	
pieceLength	TokenNameIdentifier	 piece Length
;	TokenNameSEMICOLON	
// if the buffer is full, flush it 	TokenNameCOMMENT_LINE	if the buffer is full, flush it 
bytesLeft	TokenNameIdentifier	 bytes Left
=	TokenNameEQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
-	TokenNameMINUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesLeft	TokenNameIdentifier	 bytes Left
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesLeft	TokenNameIdentifier	 bytes Left
=	TokenNameEQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Forces any buffered output to be written. */	TokenNameCOMMENT_JAVADOC	 Forces any buffered output to be written. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
+=	TokenNamePLUS_EQUAL	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: implements buffer write. Writes bytes at the current position in * the output. * @param b the bytes to write * @param len the number of bytes to write */	TokenNameCOMMENT_JAVADOC	 Expert: implements buffer write. Writes bytes at the current position in the output. @param b the bytes to write @param len the number of bytes to write 
private	TokenNameprivate	
void	TokenNamevoid	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: implements buffer write. Writes bytes at the current position in * the output. * @param b the bytes to write * @param offset the offset in the byte array * @param len the number of bytes to write */	TokenNameCOMMENT_JAVADOC	 Expert: implements buffer write. Writes bytes at the current position in the output. @param b the bytes to write @param offset the offset in the byte array @param len the number of bytes to write 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Closes this stream to further operations. */	TokenNameCOMMENT_JAVADOC	 Closes this stream to further operations. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current position in this file, where the next write will * occur. * @see #seek(long) */	TokenNameCOMMENT_JAVADOC	 Returns the current position in this file, where the next write will occur. @see #seek(long) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets current position in this file, where the next write will occur. * @see #getFilePointer() */	TokenNameCOMMENT_JAVADOC	 Sets current position in this file, where the next write will occur. @see #getFilePointer() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The number of bytes in the file. */	TokenNameCOMMENT_JAVADOC	 The number of bytes in the file. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
