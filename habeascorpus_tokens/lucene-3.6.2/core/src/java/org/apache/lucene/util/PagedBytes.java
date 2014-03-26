package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
DataInput	TokenNameIdentifier	 Data Input
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
DataOutput	TokenNameIdentifier	 Data Output
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
IndexInput	TokenNameIdentifier	 Index Input
;	TokenNameSEMICOLON	
/** Represents a logical byte[] as a series of pages. You * can write-once into the logical byte[] (append only), * using copy, and then retrieve slices (BytesRef) into it * using fill. * * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Represents a logical byte[] as a series of pages. You can write-once into the logical byte[] (append only), using copy, and then retrieve slices (BytesRef) into it using fill. * @lucene.internal *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PagedBytes	TokenNameIdentifier	 Paged Bytes
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
blocks	TokenNameIdentifier	 blocks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
blockEnd	TokenNameIdentifier	 block End
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockBits	TokenNameIdentifier	 block Bits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockMask	TokenNameIdentifier	 block Mask
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
didSkipBytes	TokenNameIdentifier	 did Skip Bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
frozen	TokenNameIdentifier	 frozen
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentBlock	TokenNameIdentifier	 current Block
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_BYTES	TokenNameIdentifier	 EMPTY  BYTES
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Provides methods to read BytesRefs from a frozen * PagedBytes. * * @see #freeze */	TokenNameCOMMENT_JAVADOC	 Provides methods to read BytesRefs from a frozen PagedBytes. * @see #freeze 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blocks	TokenNameIdentifier	 blocks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
blockEnds	TokenNameIdentifier	 block Ends
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockBits	TokenNameIdentifier	 block Bits
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockMask	TokenNameIdentifier	 block Mask
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
(	TokenNameLPAREN	
PagedBytes	TokenNameIdentifier	 Paged Bytes
pagedBytes	TokenNameIdentifier	 paged Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
pagedBytes	TokenNameIdentifier	 paged Bytes
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pagedBytes	TokenNameIdentifier	 paged Bytes
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
blockEnds	TokenNameIdentifier	 block Ends
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
blockEnds	TokenNameIdentifier	 block Ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blockEnds	TokenNameIdentifier	 block Ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pagedBytes	TokenNameIdentifier	 paged Bytes
.	TokenNameDOT	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
blockBits	TokenNameIdentifier	 block Bits
=	TokenNameEQUAL	
pagedBytes	TokenNameIdentifier	 paged Bytes
.	TokenNameDOT	
blockBits	TokenNameIdentifier	 block Bits
;	TokenNameSEMICOLON	
blockMask	TokenNameIdentifier	 block Mask
=	TokenNameEQUAL	
pagedBytes	TokenNameIdentifier	 paged Bytes
.	TokenNameDOT	
blockMask	TokenNameIdentifier	 block Mask
;	TokenNameSEMICOLON	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
pagedBytes	TokenNameIdentifier	 paged Bytes
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a slice out of {@link PagedBytes} starting at <i>start</i> with a * given length. Iff the slice spans across a block border this method will * allocate sufficient resources and copy the paged data. * <p> * Slices spanning more than one block are not supported. * </p> * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Gets a slice out of {@link PagedBytes} starting at <i>start</i> with a given length. Iff the slice spans across a block border this method will allocate sufficient resources and copy the paged data. <p> Slices spanning more than one block are not supported. </p> @lucene.internal *
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
fillSlice	TokenNameIdentifier	 fill Slice
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
long	TokenNamelong	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"length="	TokenNameStringLiteral	length=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
blockSize	TokenNameIdentifier	 block Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>>	TokenNameRIGHT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
&	TokenNameAND	
blockMask	TokenNameIdentifier	 block Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Within block 	TokenNameCOMMENT_LINE	Within block 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Split 	TokenNameCOMMENT_LINE	Split 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads length as 1 or 2 byte vInt prefix, starting at <i>start</i>. * <p> * <b>Note:</b> this method does not support slices spanning across block * borders. * </p> * * @return the given {@link BytesRef} * * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Reads length as 1 or 2 byte vInt prefix, starting at <i>start</i>. <p> <b>Note:</b> this method does not support slices spanning across block borders. </p> * @return the given {@link BytesRef} * @lucene.internal *
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
long	TokenNamelong	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>>	TokenNameRIGHT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
&	TokenNameAND	
blockMask	TokenNameIdentifier	 block Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads length as 1 or 2 byte vInt prefix, starting at <i>start</i>. * * <p> * <b>Note:</b> this method does not support slices spanning across block * borders. * </p> * * @return the internal block number of the slice. * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Reads length as 1 or 2 byte vInt prefix, starting at <i>start</i>. * <p> <b>Note:</b> this method does not support slices spanning across block borders. </p> * @return the internal block number of the slice. @lucene.internal *
public	TokenNamepublic	
int	TokenNameint	
fillAndGetIndex	TokenNameIdentifier	 fill And Get Index
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
long	TokenNamelong	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>>	TokenNameRIGHT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
&	TokenNameAND	
blockMask	TokenNameIdentifier	 block Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads length as 1 or 2 byte vInt prefix, starting at <i>start</i> and * returns the start offset of the next part, suitable as start parameter on * next call to sequentially read all {@link BytesRef}. * * <p> * <b>Note:</b> this method does not support slices spanning across block * borders. * </p> * * @return the start offset of the next part, suitable as start parameter on * next call to sequentially read all {@link BytesRef}. * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Reads length as 1 or 2 byte vInt prefix, starting at <i>start</i> and returns the start offset of the next part, suitable as start parameter on next call to sequentially read all {@link BytesRef}. * <p> <b>Note:</b> this method does not support slices spanning across block borders. </p> * @return the start offset of the next part, suitable as start parameter on next call to sequentially read all {@link BytesRef}. @lucene.internal *
public	TokenNamepublic	
long	TokenNamelong	
fillAndGetStart	TokenNameIdentifier	 fill And Get Start
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
long	TokenNamelong	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>>	TokenNameRIGHT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
&	TokenNameAND	
blockMask	TokenNameIdentifier	 block Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
1L	TokenNameLongLiteral	
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
2L	TokenNameLongLiteral	
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a slice out of {@link PagedBytes} starting at <i>start</i>, the * length is read as 1 or 2 byte vInt prefix. Iff the slice spans across a * block border this method will allocate sufficient resources and copy the * paged data. * <p> * Slices spanning more than one block are not supported. * </p> * * @lucene.internal **/	TokenNameCOMMENT_JAVADOC	 Gets a slice out of {@link PagedBytes} starting at <i>start</i>, the length is read as 1 or 2 byte vInt prefix. Iff the slice spans across a block border this method will allocate sufficient resources and copy the paged data. <p> Slices spanning more than one block are not supported. </p> * @lucene.internal *
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
fillSliceWithPrefix	TokenNameIdentifier	 fill Slice With Prefix
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
long	TokenNamelong	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>>	TokenNameRIGHT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
&	TokenNameAND	
blockMask	TokenNameIdentifier	 block Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"length="	TokenNameStringLiteral	length=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// NOTE: even though copyUsingLengthPrefix always 	TokenNameCOMMENT_LINE	NOTE: even though copyUsingLengthPrefix always 
// allocs a new block if the byte[] to be added won't 	TokenNameCOMMENT_LINE	allocs a new block if the byte[] to be added won't 
// fit in current block, callers can write their own 	TokenNameCOMMENT_LINE	fit in current block, callers can write their own 
// prefix that may span two blocks: 	TokenNameCOMMENT_LINE	prefix that may span two blocks: 
if	TokenNameif	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Within block 	TokenNameCOMMENT_LINE	Within block 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Split 	TokenNameCOMMENT_LINE	Split 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBlocks	TokenNameIdentifier	 get Blocks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blocks	TokenNameIdentifier	 blocks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @lucene.internal 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBlockEnds	TokenNameIdentifier	 get Block Ends
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
blockEnds	TokenNameIdentifier	 block Ends
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** 1<<blockBits must be bigger than biggest single * BytesRef slice that will be pulled */	TokenNameCOMMENT_JAVADOC	 1<<blockBits must be bigger than biggest single BytesRef slice that will be pulled 
public	TokenNamepublic	
PagedBytes	TokenNameIdentifier	 Paged Bytes
(	TokenNameLPAREN	
int	TokenNameint	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockBits	TokenNameIdentifier	 block Bits
=	TokenNameEQUAL	
blockBits	TokenNameIdentifier	 block Bits
;	TokenNameSEMICOLON	
blockMask	TokenNameIdentifier	 block Mask
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Read this many bytes from in */	TokenNameCOMMENT_JAVADOC	 Read this many bytes from in 
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
long	TokenNamelong	
byteCount	TokenNameIdentifier	 byte Count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
byteCount	TokenNameIdentifier	 byte Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
byteCount	TokenNameIdentifier	 byte Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
byteCount	TokenNameIdentifier	 byte Count
-=	TokenNameMINUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
byteCount	TokenNameIdentifier	 byte Count
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
byteCount	TokenNameIdentifier	 byte Count
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Copy BytesRef in */	TokenNameCOMMENT_JAVADOC	 Copy BytesRef in 
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
byteCount	TokenNameIdentifier	 byte Count
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesUpto	TokenNameIdentifier	 bytes Upto
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
byteCount	TokenNameIdentifier	 byte Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
byteCount	TokenNameIdentifier	 byte Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytesUpto	TokenNameIdentifier	 bytes Upto
,	TokenNameCOMMA	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
byteCount	TokenNameIdentifier	 byte Count
-=	TokenNameMINUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
bytesUpto	TokenNameIdentifier	 bytes Upto
+=	TokenNamePLUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytesUpto	TokenNameIdentifier	 bytes Upto
,	TokenNameCOMMA	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
byteCount	TokenNameIdentifier	 byte Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
byteCount	TokenNameIdentifier	 byte Count
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Copy BytesRef in, setting BytesRef out to the result. * Do not use this if you will use freeze(true). * This only supports bytes.length <= blockSize */	TokenNameCOMMENT_JAVADOC	 Copy BytesRef in, setting BytesRef out to the result. Do not use this if you will use freeze(true). This only supports bytes.length <= blockSize 
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
left	TokenNameIdentifier	 left
||	TokenNameOR_OR	
currentBlock	TokenNameIdentifier	 current Block
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
didSkipBytes	TokenNameIdentifier	 did Skip Bytes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
// TODO: we could also support variable block sizes 	TokenNameCOMMENT_LINE	TODO: we could also support variable block sizes 
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
currentBlock	TokenNameIdentifier	 current Block
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Commits final byte[], trimming it if necessary and if trim=true */	TokenNameCOMMENT_JAVADOC	 Commits final byte[], trimming it if necessary and if trim=true 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
boolean	TokenNameboolean	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frozen	TokenNameIdentifier	 frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"already frozen"	TokenNameStringLiteral	already frozen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
didSkipBytes	TokenNameIdentifier	 did Skip Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"cannot freeze when copy(BytesRef, BytesRef) was used"	TokenNameStringLiteral	cannot freeze when copy(BytesRef, BytesRef) was used
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trim	TokenNameIdentifier	 trim
&&	TokenNameAND_AND	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBlock	TokenNameIdentifier	 new Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBlock	TokenNameIdentifier	 new Block
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
newBlock	TokenNameIdentifier	 new Block
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
EMPTY_BYTES	TokenNameIdentifier	 EMPTY  BYTES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frozen	TokenNameIdentifier	 frozen
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Reader	TokenNameIdentifier	 Reader
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getPointer	TokenNameIdentifier	 get Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Copy bytes in, writing the length as a 1 or 2 byte * vInt prefix. */	TokenNameCOMMENT_JAVADOC	 Copy bytes in, writing the length as a 1 or 2 byte vInt prefix. 
public	TokenNamepublic	
long	TokenNamelong	
copyUsingLengthPrefix	TokenNameIdentifier	 copy Using Length Prefix
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
32768	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"max length is 32767 (got "	TokenNameStringLiteral	max length is 32767 (got 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>	TokenNameGREATER	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>	TokenNameGREATER	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"block size "	TokenNameStringLiteral	block size 
+	TokenNamePLUS	
blockSize	TokenNameIdentifier	 block Size
+	TokenNamePLUS	
" is too small to store length "	TokenNameStringLiteral	 is too small to store length 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
getPointer	TokenNameIdentifier	 get Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBlock	TokenNameIdentifier	 current Block
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentBlock	TokenNameIdentifier	 current Block
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlock	TokenNameIdentifier	 current Block
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
extends	TokenNameextends	
DataInput	TokenNameIdentifier	 Data Input
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
currentBlockIndex	TokenNameIdentifier	 current Block Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentBlock	TokenNameIdentifier	 current Block
;	TokenNameSEMICOLON	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
getDataInput	TokenNameIdentifier	 get Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current byte position. */	TokenNameCOMMENT_JAVADOC	 Returns the current byte position. 
public	TokenNamepublic	
long	TokenNamelong	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
currentBlockIndex	TokenNameIdentifier	 current Block Index
*	TokenNameMULTIPLY	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Seek to a position previously obtained from * {@link #getPosition}. */	TokenNameCOMMENT_JAVADOC	 Seek to a position previously obtained from {@link #getPosition}. 
public	TokenNamepublic	
void	TokenNamevoid	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBlockIndex	TokenNameIdentifier	 current Block Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>>	TokenNameRIGHT_SHIFT	
blockBits	TokenNameIdentifier	 block Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentBlockIndex	TokenNameIdentifier	 current Block Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
&	TokenNameAND	
blockMask	TokenNameIdentifier	 block Mask
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
==	TokenNameEQUAL_EQUAL	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextBlock	TokenNameIdentifier	 next Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentBlock	TokenNameIdentifier	 current Block
[	TokenNameLBRACKET	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
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
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
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
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
blockLeft	TokenNameIdentifier	 block Left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
offsetEnd	TokenNameIdentifier	 offset End
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blockLeft	TokenNameIdentifier	 block Left
<	TokenNameLESS	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
blockLeft	TokenNameIdentifier	 block Left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextBlock	TokenNameIdentifier	 next Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
blockLeft	TokenNameIdentifier	 block Left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Last block 	TokenNameCOMMENT_LINE	Last block 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
+=	TokenNamePLUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
nextBlock	TokenNameIdentifier	 next Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBlockIndex	TokenNameIdentifier	 current Block Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
currentBlockUpto	TokenNameIdentifier	 current Block Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentBlockIndex	TokenNameIdentifier	 current Block Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
extends	TokenNameextends	
DataOutput	TokenNameIdentifier	 Data Output
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
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
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
offsetEnd	TokenNameIdentifier	 offset End
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
offsetEnd	TokenNameIdentifier	 offset End
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
blockLeft	TokenNameIdentifier	 block Left
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blockLeft	TokenNameIdentifier	 block Left
<	TokenNameLESS	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
blockLeft	TokenNameIdentifier	 block Left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blockEnd	TokenNameIdentifier	 block End
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentBlock	TokenNameIdentifier	 current Block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
blockLeft	TokenNameIdentifier	 block Left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Last block 	TokenNameCOMMENT_LINE	Last block 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
currentBlock	TokenNameIdentifier	 current Block
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return the current byte position. */	TokenNameCOMMENT_JAVADOC	 Return the current byte position. 
public	TokenNamepublic	
long	TokenNamelong	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentBlock	TokenNameIdentifier	 current Block
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns a DataInput to read values from this * PagedBytes instance. */	TokenNameCOMMENT_JAVADOC	 Returns a DataInput to read values from this PagedBytes instance. 
public	TokenNamepublic	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
getDataInput	TokenNameIdentifier	 get Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
frozen	TokenNameIdentifier	 frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"must call freeze() before getDataInput"	TokenNameStringLiteral	must call freeze() before getDataInput
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a DataOutput that you may use to write into * this PagedBytes instance. If you do this, you should * not call the other writing methods (eg, copy); * results are undefined. */	TokenNameCOMMENT_JAVADOC	 Returns a DataOutput that you may use to write into this PagedBytes instance. If you do this, you should not call the other writing methods (eg, copy); results are undefined. 
public	TokenNamepublic	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
getDataOutput	TokenNameIdentifier	 get Data Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frozen	TokenNameIdentifier	 frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"cannot get DataOutput after freeze()"	TokenNameStringLiteral	cannot get DataOutput after freeze()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
