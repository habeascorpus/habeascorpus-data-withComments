/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
.	TokenNameDOT	
Unsafe	TokenNameIdentifier	 Unsafe
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
/** * An off-heap region of memory that must be manually free'd when no longer needed. */	TokenNameCOMMENT_JAVADOC	 An off-heap region of memory that must be manually free'd when no longer needed. 
public	TokenNamepublic	
class	TokenNameclass	
Memory	TokenNameIdentifier	 Memory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Unsafe	TokenNameIdentifier	 Unsafe
unsafe	TokenNameIdentifier	 unsafe
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
.	TokenNameDOT	
Unsafe	TokenNameIdentifier	 Unsafe
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"theUnsafe"	TokenNameStringLiteral	theUnsafe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsafe	TokenNameIdentifier	 unsafe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
.	TokenNameDOT	
Unsafe	TokenNameIdentifier	 Unsafe
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
peer	TokenNameIdentifier	 peer
;	TokenNameSEMICOLON	
// size of the memory region 	TokenNameCOMMENT_LINE	size of the memory region 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Memory	TokenNameIdentifier	 Memory
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
peer	TokenNameIdentifier	 peer
=	TokenNameEQUAL	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
allocateMemory	TokenNameIdentifier	 allocate Memory
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Memory	TokenNameIdentifier	 Memory
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Memory	TokenNameIdentifier	 Memory
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setByte	TokenNameIdentifier	 set Byte
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
putByte	TokenNameIdentifier	 put Byte
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMemory	TokenNameIdentifier	 set Memory
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if the last element will fit into the memory 	TokenNameCOMMENT_LINE	check if the last element will fit into the memory 
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
setMemory	TokenNameIdentifier	 set Memory
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLong	TokenNameIdentifier	 set Long
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
long	TokenNamelong	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
putLong	TokenNameIdentifier	 put Long
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transfers count bytes from buffer to Memory * * @param memoryOffset start offset in the memory * @param buffer the data buffer * @param bufferOffset start offset of the buffer * @param count number of bytes to transfer */	TokenNameCOMMENT_JAVADOC	 Transfers count bytes from buffer to Memory * @param memoryOffset start offset in the memory @param buffer the data buffer @param bufferOffset start offset of the buffer @param count number of bytes to transfer 
public	TokenNamepublic	
void	TokenNamevoid	
setBytes	TokenNameIdentifier	 set Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
memoryOffset	TokenNameIdentifier	 memory Offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
bufferOffset	TokenNameIdentifier	 buffer Offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bufferOffset	TokenNameIdentifier	 buffer Offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
bufferOffset	TokenNameIdentifier	 buffer Offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
memoryOffset	TokenNameIdentifier	 memory Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
memoryOffset	TokenNameIdentifier	 memory Offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
memoryOffset	TokenNameIdentifier	 memory Offset
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
putByte	TokenNameIdentifier	 put Byte
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
memoryOffset	TokenNameIdentifier	 memory Offset
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferOffset	TokenNameIdentifier	 buffer Offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transfers count bytes from Memory starting at memoryOffset to buffer starting at bufferOffset * * @param memoryOffset start offset in the memory * @param buffer the data buffer * @param bufferOffset start offset of the buffer * @param count number of bytes to transfer */	TokenNameCOMMENT_JAVADOC	 Transfers count bytes from Memory starting at memoryOffset to buffer starting at bufferOffset * @param memoryOffset start offset in the memory @param buffer the data buffer @param bufferOffset start offset of the buffer @param count number of bytes to transfer 
public	TokenNamepublic	
void	TokenNamevoid	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
memoryOffset	TokenNameIdentifier	 memory Offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
bufferOffset	TokenNameIdentifier	 buffer Offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bufferOffset	TokenNameIdentifier	 buffer Offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
memoryOffset	TokenNameIdentifier	 memory Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
memoryOffset	TokenNameIdentifier	 memory Offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
memoryOffset	TokenNameIdentifier	 memory Offset
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferOffset	TokenNameIdentifier	 buffer Offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
+	TokenNamePLUS	
memoryOffset	TokenNameIdentifier	 memory Offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
peer	TokenNameIdentifier	 peer
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Memory was freed"	TokenNameStringLiteral	Memory was freed
;	TokenNameSEMICOLON	
assert	TokenNameassert	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
size	TokenNameIdentifier	 size
:	TokenNameCOLON	
"Illegal offset: "	TokenNameStringLiteral	Illegal offset: 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", size: "	TokenNameStringLiteral	, size: 
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
free	TokenNameIdentifier	 free
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
peer	TokenNameIdentifier	 peer
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
unsafe	TokenNameIdentifier	 unsafe
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
peer	TokenNameIdentifier	 peer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Memory	TokenNameIdentifier	 Memory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Memory	TokenNameIdentifier	 Memory
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Memory	TokenNameIdentifier	 Memory
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
peer	TokenNameIdentifier	 peer
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
peer	TokenNameIdentifier	 peer
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
