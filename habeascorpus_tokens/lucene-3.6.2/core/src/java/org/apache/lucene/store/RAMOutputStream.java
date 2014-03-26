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
/** * A memory-resident {@link IndexOutput} implementation. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A memory-resident {@link IndexOutput} implementation. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
extends	TokenNameextends	
IndexOutput	TokenNameIdentifier	 Index Output
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RAMFile	TokenNameIdentifier	 RAM File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentBuffer	TokenNameIdentifier	 current Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
bufferStart	TokenNameIdentifier	 buffer Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bufferLength	TokenNameIdentifier	 buffer Length
;	TokenNameSEMICOLON	
/** Construct an empty output buffer. */	TokenNameCOMMENT_JAVADOC	 Construct an empty output buffer. 
public	TokenNamepublic	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
RAMFile	TokenNameIdentifier	 RAM File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
(	TokenNameLPAREN	
RAMFile	TokenNameIdentifier	 RAM File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
// make sure that we switch to the 	TokenNameCOMMENT_LINE	make sure that we switch to the 
// first needed buffer lazily 	TokenNameCOMMENT_LINE	first needed buffer lazily 
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentBuffer	TokenNameIdentifier	 current Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Copy the current contents of this buffer to the named output. */	TokenNameCOMMENT_JAVADOC	 Copy the current contents of this buffer to the named output. 
public	TokenNamepublic	
void	TokenNamevoid	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
;	TokenNameSEMICOLON	
long	TokenNamelong	
nextPos	TokenNameIdentifier	 next Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPos	TokenNameIdentifier	 next Pos
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// at the last buffer 	TokenNameCOMMENT_LINE	at the last buffer 
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
nextPos	TokenNameIdentifier	 next Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Resets this to an empty file. */	TokenNameCOMMENT_JAVADOC	 Resets this to an empty file. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBuffer	TokenNameIdentifier	 current Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufferLength	TokenNameIdentifier	 buffer Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// set the file length in case we seek back 	TokenNameCOMMENT_LINE	set the file length in case we seek back 
// and flush() has not been called yet 	TokenNameCOMMENT_LINE	and flush() has not been called yet 
setFileLength	TokenNameIdentifier	 set File Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
bufferStart	TokenNameIdentifier	 buffer Start
||	TokenNameOR_OR	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
/	TokenNameDIVIDE	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
%	TokenNameREMAINDER	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
==	TokenNameEQUAL_EQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBuffer	TokenNameIdentifier	 current Buffer
[	TokenNameLBRACKET	
bufferPosition	TokenNameIdentifier	 buffer Position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferPosition	TokenNameIdentifier	 buffer Position
==	TokenNameEQUAL_EQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
remainInBuffer	TokenNameIdentifier	 remain In Buffer
=	TokenNameEQUAL	
currentBuffer	TokenNameIdentifier	 current Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
remainInBuffer	TokenNameIdentifier	 remain In Buffer
?	TokenNameQUESTION	
len	TokenNameIdentifier	 len
:	TokenNameCOLON	
remainInBuffer	TokenNameIdentifier	 remain In Buffer
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
currentBuffer	TokenNameIdentifier	 current Buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
,	TokenNameCOMMA	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
+=	TokenNamePLUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
==	TokenNameEQUAL_EQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
numBuffers	TokenNameIdentifier	 num Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBuffer	TokenNameIdentifier	 current Buffer
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
addBuffer	TokenNameIdentifier	 add Buffer
(	TokenNameLPAREN	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentBuffer	TokenNameIdentifier	 current Buffer
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
;	TokenNameSEMICOLON	
bufferLength	TokenNameIdentifier	 buffer Length
=	TokenNameEQUAL	
currentBuffer	TokenNameIdentifier	 current Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setFileLength	TokenNameIdentifier	 set File Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
>	TokenNameGREATER	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
file	TokenNameIdentifier	 file
.	TokenNameDOT	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFileLength	TokenNameIdentifier	 set File Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns byte usage of all buffers. */	TokenNameCOMMENT_JAVADOC	 Returns byte usage of all buffers. 
public	TokenNamepublic	
long	TokenNamelong	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
numBuffers	TokenNameIdentifier	 num Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
numBytes	TokenNameIdentifier	 num Bytes
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"numBytes="	TokenNameStringLiteral	numBytes=
+	TokenNamePLUS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferPosition	TokenNameIdentifier	 buffer Position
==	TokenNameEQUAL_EQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
currentBuffer	TokenNameIdentifier	 current Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
<	TokenNameLESS	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
currentBuffer	TokenNameIdentifier	 current Buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numBytes	TokenNameIdentifier	 num Bytes
-=	TokenNameMINUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
