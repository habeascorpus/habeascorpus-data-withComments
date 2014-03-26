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
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
/** Abstract base class for input from a file in a {@link Directory}. A * random-access input stream. Used for all Lucene index input operations. * @see Directory */	TokenNameCOMMENT_JAVADOC	 Abstract base class for input from a file in a {@link Directory}. A random-access input stream. Used for all Lucene index input operations. @see Directory 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IndexInput	TokenNameIdentifier	 Index Input
extends	TokenNameextends	
DataInput	TokenNameIdentifier	 Data Input
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** * Expert * * Similar to {@link #readChars(char[], int, int)} but does not do any conversion operations on the bytes it is reading in. It still * has to invoke {@link #readByte()} just as {@link #readChars(char[], int, int)} does, but it does not need a buffer to store anything * and it does not have to do any of the bitwise operations, since we don't actually care what is in the byte except to determine * how many more bytes to read * @param length The number of chars to read * @deprecated this method operates on old "modified utf8" encoded * strings */	TokenNameCOMMENT_JAVADOC	 Expert * Similar to {@link #readChars(char[], int, int)} but does not do any conversion operations on the bytes it is reading in. It still has to invoke {@link #readByte()} just as {@link #readChars(char[], int, int)} does, but it does not need a buffer to store anything and it does not have to do any of the bitwise operations, since we don't actually care what is in the byte except to determine how many more bytes to read @param length The number of chars to read @deprecated this method operates on old "modified utf8" encoded strings 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
skipChars	TokenNameIdentifier	 skip Chars
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//do nothing, we only need one byte 	TokenNameCOMMENT_LINE	do nothing, we only need one byte 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xE0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0xE0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//read an additional byte 	TokenNameCOMMENT_LINE	read an additional byte 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//read two additional bytes. 	TokenNameCOMMENT_LINE	read two additional bytes. 
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
resourceDescription	TokenNameIdentifier	 resource Description
;	TokenNameSEMICOLON	
/** @deprecated please pass resourceDescription */	TokenNameCOMMENT_JAVADOC	 @deprecated please pass resourceDescription 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
IndexInput	TokenNameIdentifier	 Index Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
"anonymous IndexInput"	TokenNameStringLiteral	anonymous IndexInput
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** resourceDescription should be a non-null, opaque string * describing this resource; it's returned from * {@link #toString}. */	TokenNameCOMMENT_JAVADOC	 resourceDescription should be a non-null, opaque string describing this resource; it's returned from {@link #toString}. 
protected	TokenNameprotected	
IndexInput	TokenNameIdentifier	 Index Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceDescription	TokenNameIdentifier	 resource Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resourceDescription	TokenNameIdentifier	 resource Description
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"resourceDescription must not be null"	TokenNameStringLiteral	resourceDescription must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resourceDescription	TokenNameIdentifier	 resource Description
=	TokenNameEQUAL	
resourceDescription	TokenNameIdentifier	 resource Description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Closes the stream to further operations. */	TokenNameCOMMENT_JAVADOC	 Closes the stream to further operations. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the current position in this file, where the next read will * occur. * @see #seek(long) */	TokenNameCOMMENT_JAVADOC	 Returns the current position in this file, where the next read will occur. @see #seek(long) 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets current position in this file, where the next read will occur. * @see #getFilePointer() */	TokenNameCOMMENT_JAVADOC	 Sets current position in this file, where the next read will occur. @see #getFilePointer() 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** The number of bytes in the file. */	TokenNameCOMMENT_JAVADOC	 The number of bytes in the file. 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Copies <code>numBytes</code> bytes to the given {@link IndexOutput}. * <p> * <b>NOTE:</b> this method uses an intermediate buffer to copy the bytes. * Consider overriding it in your implementation, if you can make a better, * optimized copy. * <p> * <b>NOTE</b> ensure that there are enough bytes in the input to copy to * output. Otherwise, different exceptions may be thrown, depending on the * implementation. */	TokenNameCOMMENT_JAVADOC	 Copies <code>numBytes</code> bytes to the given {@link IndexOutput}. <p> <b>NOTE:</b> this method uses an intermediate buffer to copy the bytes. Consider overriding it in your implementation, if you can make a better, optimized copy. <p> <b>NOTE</b> ensure that there are enough bytes in the input to copy to output. Otherwise, different exceptions may be thrown, depending on the implementation. 
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
byte	TokenNamebyte	
copyBuf	TokenNameIdentifier	 copy Buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
numBytes	TokenNameIdentifier	 num Bytes
>	TokenNameGREATER	
copyBuf	TokenNameIdentifier	 copy Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
copyBuf	TokenNameIdentifier	 copy Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
copyBuf	TokenNameIdentifier	 copy Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
copyBuf	TokenNameIdentifier	 copy Buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numBytes	TokenNameIdentifier	 num Bytes
-=	TokenNameMINUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resourceDescription	TokenNameIdentifier	 resource Description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
