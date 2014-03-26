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
/** * Class to write byte streams into slices of shared * byte[]. This is used by DocumentsWriter to hold the * posting list for many terms in RAM. */	TokenNameCOMMENT_JAVADOC	 Class to write byte streams into slices of shared byte[]. This is used by DocumentsWriter to hold the posting list for many terms in RAM. 
final	TokenNamefinal	
class	TokenNameclass	
ByteSliceWriter	TokenNameIdentifier	 Byte Slice Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slice	TokenNameIdentifier	 slice
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
int	TokenNameint	
offset0	TokenNameIdentifier	 offset0
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteSliceWriter	TokenNameIdentifier	 Byte Slice Writer
(	TokenNameLPAREN	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set up the writer to write at address. */	TokenNameCOMMENT_JAVADOC	 Set up the writer to write at address. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice	TokenNameIdentifier	 slice
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
address	TokenNameIdentifier	 address
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_SHIFT	TokenNameIdentifier	 BYTE  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
slice	TokenNameIdentifier	 slice
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_MASK	TokenNameIdentifier	 BYTE  BLOCK  MASK
;	TokenNameSEMICOLON	
offset0	TokenNameIdentifier	 offset0
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Write byte into byte slice stream */	TokenNameCOMMENT_JAVADOC	 Write byte into byte slice stream 
public	TokenNamepublic	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
slice	TokenNameIdentifier	 slice
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
allocSlice	TokenNameIdentifier	 alloc Slice
(	TokenNameLPAREN	
slice	TokenNameIdentifier	 slice
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
slice	TokenNameIdentifier	 slice
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
offset0	TokenNameIdentifier	 offset0
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
assert	TokenNameassert	
slice	TokenNameIdentifier	 slice
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
!=	TokenNameNOT_EQUAL	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
offsetEnd	TokenNameIdentifier	 offset End
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
offsetEnd	TokenNameIdentifier	 offset End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// End marker 	TokenNameCOMMENT_LINE	End marker 
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
allocSlice	TokenNameIdentifier	 alloc Slice
(	TokenNameLPAREN	
slice	TokenNameIdentifier	 slice
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
slice	TokenNameIdentifier	 slice
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
offset0	TokenNameIdentifier	 offset0
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
byteOffset	TokenNameIdentifier	 byte Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
slice	TokenNameIdentifier	 slice
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
!=	TokenNameNOT_EQUAL	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
(	TokenNameLPAREN	
offset0	TokenNameIdentifier	 offset0
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
BYTE_BLOCK_NOT_MASK	TokenNameIdentifier	 BYTE  BLOCK  NOT  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
~	TokenNameTWIDDLE	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
