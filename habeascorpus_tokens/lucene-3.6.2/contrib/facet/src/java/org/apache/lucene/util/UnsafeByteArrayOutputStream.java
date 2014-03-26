package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This class is used as a wrapper to a byte array, extending * {@link OutputStream}. Data is written in the given byte[] buffer, until its * length is insufficient. Than the buffer size is doubled and the data is * written. * * This class is Unsafe as it is using a buffer which potentially can be changed * from the outside. Moreover, when {@link #toByteArray()} is called, the buffer * itself is returned, and not a copy. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This class is used as a wrapper to a byte array, extending {@link OutputStream}. Data is written in the given byte[] buffer, until its length is insufficient. Than the buffer size is doubled and the data is written. * This class is Unsafe as it is using a buffer which potentially can be changed from the outside. Moreover, when {@link #toByteArray()} is called, the buffer itself is returned, and not a copy. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
UnsafeByteArrayOutputStream	TokenNameIdentifier	 Unsafe Byte Array Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
/** * Constructs a new output stream, with a default allocated buffer which can * later be obtained via {@link #toByteArray()}. */	TokenNameCOMMENT_JAVADOC	 Constructs a new output stream, with a default allocated buffer which can later be obtained via {@link #toByteArray()}. 
public	TokenNamepublic	
UnsafeByteArrayOutputStream	TokenNameIdentifier	 Unsafe Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new output stream, with a given buffer. Writing will start * at index 0 as a default. * * @param buffer * some space to which writing will be made */	TokenNameCOMMENT_JAVADOC	 Constructs a new output stream, with a given buffer. Writing will start at index 0 as a default. * @param buffer some space to which writing will be made 
public	TokenNamepublic	
UnsafeByteArrayOutputStream	TokenNameIdentifier	 Unsafe Byte Array Output Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new output stream, with a given buffer. Writing will start * at a given index. * * @param buffer * some space to which writing will be made. * @param startPos * an index (inclusive) from white data will be written. */	TokenNameCOMMENT_JAVADOC	 Constructs a new output stream, with a given buffer. Writing will start at a given index. * @param buffer some space to which writing will be made. @param startPos an index (inclusive) from white data will be written. 
public	TokenNamepublic	
UnsafeByteArrayOutputStream	TokenNameIdentifier	 Unsafe Byte Array Output Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It actually should be: (Java 1.6) 	TokenNameCOMMENT_LINE	It actually should be: (Java 1.6) 
// buffer = Arrays.copyOf(buffer, newLength); 	TokenNameCOMMENT_LINE	buffer = Arrays.copyOf(buffer, newLength); 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newLength	TokenNameIdentifier	 new Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reuse-ability, this stream object can be re-initialized with another * given buffer and starting position. * * @param buffer some space to which writing will be made. * @param startPos an index (inclusive) from white data will be written. */	TokenNameCOMMENT_JAVADOC	 For reuse-ability, this stream object can be re-initialized with another given buffer and starting position. * @param buffer some space to which writing will be made. @param startPos an index (inclusive) from white data will be written. 
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"initial buffer length must be greater than 0."	TokenNameStringLiteral	initial buffer length must be greater than 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reuse-ability, this stream object can be re-initialized with another * given buffer, using 0 as default starting position. * * @param buffer some space to which writing will be made. */	TokenNameCOMMENT_JAVADOC	 For reuse-ability, this stream object can be re-initialized with another given buffer, using 0 as default starting position. * @param buffer some space to which writing will be made. 
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * writes a given byte(at the form of an int) to the buffer. If the buffer's * empty space is insufficient, the buffer is doubled. * * @param value byte value to be written */	TokenNameCOMMENT_JAVADOC	 writes a given byte(at the form of an int) to the buffer. If the buffer's empty space is insufficient, the buffer is doubled. * @param value byte value to be written 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * writes a given byte[], with offset and length to the buffer. If the * buffer's empty space is insufficient, the buffer is doubled until it * could contain all the data. * * @param b * byte buffer, containing the source data to be written * @param off * index from which data from the buffer b should be written * @param len * number of bytes that should be written */	TokenNameCOMMENT_JAVADOC	 writes a given byte[], with offset and length to the buffer. If the buffer's empty space is insufficient, the buffer is doubled until it could contain all the data. * @param b byte buffer, containing the source data to be written @param off index from which data from the buffer b should be written @param len number of bytes that should be written 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// If there's not enough space for the data 	TokenNameCOMMENT_LINE	If there's not enough space for the data 
int	TokenNameint	
targetLength	TokenNameIdentifier	 target Length
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetLength	TokenNameIdentifier	 target Length
>=	TokenNameGREATER_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calculating the new required length of the array, keeping the array 	TokenNameCOMMENT_LINE	Calculating the new required length of the array, keeping the array 
// size a power of 2 if it was initialized like that. 	TokenNameCOMMENT_LINE	size a power of 2 if it was initialized like that. 
int	TokenNameint	
newlen	TokenNameIdentifier	 newlen
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
newlen	TokenNameIdentifier	 newlen
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
targetLength	TokenNameIdentifier	 target Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
newlen	TokenNameIdentifier	 newlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now that we have enough spare space, we could copy the rest of the 	TokenNameCOMMENT_LINE	Now that we have enough spare space, we could copy the rest of the 
// data 	TokenNameCOMMENT_LINE	data 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Updating the index to next available index. 	TokenNameCOMMENT_LINE	Updating the index to next available index. 
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the byte array saved within the buffer AS IS. * * @return the actual inner buffer - not a copy of it. */	TokenNameCOMMENT_JAVADOC	 Returns the byte array saved within the buffer AS IS. * @return the actual inner buffer - not a copy of it. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of relevant bytes. This objects makes sure the buffer * is at least the size of it's data. But it can also be twice as big. The * user would want to process the relevant bytes only. For that he would * need the count. * * @return number of relevant bytes */	TokenNameCOMMENT_JAVADOC	 Returns the number of relevant bytes. This objects makes sure the buffer is at least the size of it's data. But it can also be twice as big. The user would want to process the relevant bytes only. For that he would need the count. * @return number of relevant bytes 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the start position data was written to. This is useful in case you * used {@link #reInit(byte[], int)} or * {@link #UnsafeByteArrayOutputStream(byte[], int)} and passed a start * position which is not 0. */	TokenNameCOMMENT_JAVADOC	 Returns the start position data was written to. This is useful in case you used {@link #reInit(byte[], int)} or {@link #UnsafeByteArrayOutputStream(byte[], int)} and passed a start position which is not 0. 
public	TokenNamepublic	
int	TokenNameint	
getStartPos	TokenNameIdentifier	 get Start Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
