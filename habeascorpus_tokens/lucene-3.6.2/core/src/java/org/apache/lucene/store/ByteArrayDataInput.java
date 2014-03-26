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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
/** * DataInput backed by a byte array. * <b>WARNING:</b> This class omits all low-level checks. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 DataInput backed by a byte array. <b>WARNING:</b> This class omits all low-level checks. @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
extends	TokenNameextends	
DataInput	TokenNameIdentifier	 Data Input
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
EMPTY_BYTES	TokenNameIdentifier	 EMPTY  BYTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
eof	TokenNameIdentifier	 eof
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
skipBytes	TokenNameIdentifier	 skip Bytes
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
short	TokenNameshort	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
&	TokenNameAND	
0xFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
7	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
14	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
21	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Warning: the next ands use 0x0F / 0xF0 - beware copy/paste errors: 	TokenNameCOMMENT_LINE	Warning: the next ands use 0x0F / 0xF0 - beware copy/paste errors: 
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xF0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid vInt detected (too many bits)"	TokenNameStringLiteral	Invalid vInt detected (too many bits)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
7	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
14	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
21	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
28	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
35	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
42	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
49	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x7FL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
56	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid vLong detected (negative values disallowed)"	TokenNameStringLiteral	Invalid vLong detected (negative values disallowed)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: AIOOBE not EOF if you read too much 	TokenNameCOMMENT_LINE	NOTE: AIOOBE not EOF if you read too much 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: AIOOBE not EOF if you read too much 	TokenNameCOMMENT_LINE	NOTE: AIOOBE not EOF if you read too much 
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
