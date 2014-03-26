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
IndexInput	TokenNameIdentifier	 Index Input
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/* IndexInput that knows how to read the byte slices written * by Posting and PostingVector. We read the bytes in * each slice until we hit the end of that slice at which * point we read the forwarding address of the next slice * and then jump to it.*/	TokenNameCOMMENT_BLOCK	 IndexInput that knows how to read the byte slices written by Posting and PostingVector. We read the bytes in each slice until we hit the end of that slice at which point we read the forwarding address of the next slice and then jump to it.
final	TokenNamefinal	
class	TokenNameclass	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
extends	TokenNameextends	
IndexInput	TokenNameIdentifier	 Index Input
{	TokenNameLBRACE	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferUpto	TokenNameIdentifier	 buffer Upto
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
int	TokenNameint	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
,	TokenNameCOMMA	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
startIndex	TokenNameIdentifier	 start Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
startIndex	TokenNameIdentifier	 start Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endIndex	TokenNameIdentifier	 end Index
=	TokenNameEQUAL	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
/	TokenNameDIVIDE	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
bufferUpto	TokenNameIdentifier	 buffer Upto
*	TokenNameMULTIPLY	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
firstSize	TokenNameIdentifier	 first Size
=	TokenNameEQUAL	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
levelSizeArray	TokenNameIdentifier	 level Size Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
+	TokenNamePLUS	
firstSize	TokenNameIdentifier	 first Size
>=	TokenNameGREATER_EQUAL	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There is only this one slice to read 	TokenNameCOMMENT_LINE	There is only this one slice to read 
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
endIndex	TokenNameIdentifier	 end Index
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
firstSize	TokenNameIdentifier	 first Size
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
eof	TokenNameIdentifier	 eof
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
<=	TokenNameLESS_EQUAL	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
==	TokenNameEQUAL_EQUAL	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
eof	TokenNameIdentifier	 eof
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
nextSlice	TokenNameIdentifier	 next Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
+	TokenNamePLUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
==	TokenNameEQUAL_EQUAL	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
>=	TokenNameGREATER_EQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
nextSlice	TokenNameIdentifier	 next Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
nextSlice	TokenNameIdentifier	 next Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Skip to our next slice 	TokenNameCOMMENT_LINE	Skip to our next slice 
final	TokenNamefinal	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
limit	TokenNameIdentifier	 limit
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
limit	TokenNameIdentifier	 limit
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
limit	TokenNameIdentifier	 limit
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
limit	TokenNameIdentifier	 limit
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
nextLevelArray	TokenNameIdentifier	 next Level Array
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
levelSizeArray	TokenNameIdentifier	 level Size Array
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
nextIndex	TokenNameIdentifier	 next Index
/	TokenNameDIVIDE	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
bufferUpto	TokenNameIdentifier	 buffer Upto
*	TokenNameMULTIPLY	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SIZE	TokenNameIdentifier	 BYTE  BLOCK  SIZE
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
nextIndex	TokenNameIdentifier	 next Index
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextIndex	TokenNameIdentifier	 next Index
+	TokenNamePLUS	
newSize	TokenNameIdentifier	 new Size
>=	TokenNameGREATER_EQUAL	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are advancing to the final slice 	TokenNameCOMMENT_LINE	We are advancing to the final slice 
assert	TokenNameassert	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
nextIndex	TokenNameIdentifier	 next Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
endIndex	TokenNameIdentifier	 end Index
-	TokenNameMINUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is not the final slice (subtract 4 for the 	TokenNameCOMMENT_LINE	This is not the final slice (subtract 4 for the 
// forwarding address at the end of this new slice) 	TokenNameCOMMENT_LINE	forwarding address at the end of this new slice) 
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numLeft	TokenNameIdentifier	 num Left
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numLeft	TokenNameIdentifier	 num Left
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Read entire slice 	TokenNameCOMMENT_LINE	Read entire slice 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
numLeft	TokenNameIdentifier	 num Left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
numLeft	TokenNameIdentifier	 num Left
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
numLeft	TokenNameIdentifier	 num Left
;	TokenNameSEMICOLON	
nextSlice	TokenNameIdentifier	 next Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This slice is the last one 	TokenNameCOMMENT_LINE	This slice is the last one 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
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
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
