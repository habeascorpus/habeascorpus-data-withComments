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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
;	TokenNameSEMICOLON	
/** A memory-resident {@link IndexInput} implementation. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A memory-resident {@link IndexInput} implementation. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
RAMInputStream	TokenNameIdentifier	 RAM Input Stream
extends	TokenNameextends	
IndexInput	TokenNameIdentifier	 Index Input
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RAMFile	TokenNameIdentifier	 RAM File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
length	TokenNameIdentifier	 length
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
/** Please pass String name */	TokenNameCOMMENT_JAVADOC	 Please pass String name 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
RAMInputStream	TokenNameIdentifier	 RAM Input Stream
(	TokenNameLPAREN	
RAMFile	TokenNameIdentifier	 RAM File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
"anonymous"	TokenNameStringLiteral	anonymous
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RAMInputStream	TokenNameIdentifier	 RAM Input Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
RAMFile	TokenNameIdentifier	 RAM File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"RAMInputStream(name="	TokenNameStringLiteral	RAMInputStream(name=
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
>=	TokenNameGREATER_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"RAMInputStream too large length="	TokenNameStringLiteral	RAMInputStream too large length=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to do here 	TokenNameCOMMENT_LINE	nothing to do here 
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferPosition	TokenNameIdentifier	 buffer Position
>=	TokenNameGREATER_EQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentBuffer	TokenNameIdentifier	 current Buffer
[	TokenNameLBRACKET	
bufferPosition	TokenNameIdentifier	 buffer Position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
readBytes	TokenNameIdentifier	 read Bytes
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
>=	TokenNameGREATER_EQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
remainInBuffer	TokenNameIdentifier	 remain In Buffer
=	TokenNameEQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
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
currentBuffer	TokenNameIdentifier	 current Buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
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
boolean	TokenNameboolean	
enforceEOF	TokenNameIdentifier	 enforce EOF
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
>=	TokenNameGREATER_EQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
numBuffers	TokenNameIdentifier	 num Buffers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// end of file reached, no more buffers left 	TokenNameCOMMENT_LINE	end of file reached, no more buffers left 
if	TokenNameif	
(	TokenNameLPAREN	
enforceEOF	TokenNameIdentifier	 enforce EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"read past EOF: "	TokenNameStringLiteral	read past EOF: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Force EOF if a read takes place at this position 	TokenNameCOMMENT_LINE	Force EOF if a read takes place at this position 
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
buflen	TokenNameIdentifier	 buflen
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferStart	TokenNameIdentifier	 buffer Start
;	TokenNameSEMICOLON	
bufferLength	TokenNameIdentifier	 buffer Length
=	TokenNameEQUAL	
buflen	TokenNameIdentifier	 buflen
>	TokenNameGREATER	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
?	TokenNameQUESTION	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
buflen	TokenNameIdentifier	 buflen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
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
long	TokenNamelong	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
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
++	TokenNamePLUS_PLUS	
currentBufferIndex	TokenNameIdentifier	 current Buffer Index
;	TokenNameSEMICOLON	
switchCurrentBuffer	TokenNameIdentifier	 switch Current Buffer
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
bytesInBuffer	TokenNameIdentifier	 bytes In Buffer
=	TokenNameEQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
-	TokenNameMINUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bytesInBuffer	TokenNameIdentifier	 bytes In Buffer
<	TokenNameLESS	
left	TokenNameIdentifier	 left
?	TokenNameQUESTION	
bytesInBuffer	TokenNameIdentifier	 bytes In Buffer
:	TokenNameCOLON	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
currentBuffer	TokenNameIdentifier	 current Buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferPosition	TokenNameIdentifier	 buffer Position
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
-=	TokenNameMINUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
left	TokenNameIdentifier	 left
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Insufficient bytes to copy: numBytes="	TokenNameStringLiteral	Insufficient bytes to copy: numBytes=
+	TokenNamePLUS	
numBytes	TokenNameIdentifier	 num Bytes
+	TokenNamePLUS	
" copied="	TokenNameStringLiteral	 copied=
+	TokenNamePLUS	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
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
if	TokenNameif	
(	TokenNameLPAREN	
currentBuffer	TokenNameIdentifier	 current Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
bufferStart	TokenNameIdentifier	 buffer Start
||	TokenNameOR_OR	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
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
false	TokenNamefalse	
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
}	TokenNameRBRACE	
