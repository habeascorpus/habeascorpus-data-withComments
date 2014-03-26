/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SuballocatedByteVector.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SuballocatedByteVector.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * A very simple table that stores a list of byte. Very similar API to our * IntVector class (same API); different internal storage. * * This version uses an array-of-arrays solution. Read/write access is thus * a bit slower than the simple IntVector, and basic storage is a trifle * higher due to the top-level array -- but appending is O(1) fast rather * than O(N**2) slow, which will swamp those costs in situations where * long vectors are being built up. * * Known issues: * * Some methods are private because they haven't yet been tested properly. * * If an element has not been set (because we skipped it), its value will * initially be 0. Shortening the vector does not clear old storage; if you * then skip values and setElementAt a higher index again, you may see old data * reappear in the truncated-and-restored section. Doing anything else would * have performance costs. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A very simple table that stores a list of byte. Very similar API to our IntVector class (same API); different internal storage. * This version uses an array-of-arrays solution. Read/write access is thus a bit slower than the simple IntVector, and basic storage is a trifle higher due to the top-level array -- but appending is O(1) fast rather than O(N**2) slow, which will swamp those costs in situations where long vectors are being built up. * Known issues: * Some methods are private because they haven't yet been tested properly. * If an element has not been set (because we skipped it), its value will initially be 0. Shortening the vector does not clear old storage; if you then skip values and setElementAt a higher index again, you may see old data reappear in the truncated-and-restored section. Doing anything else would have performance costs. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
SuballocatedByteVector	TokenNameIdentifier	 Suballocated Byte Vector
{	TokenNameLBRACE	
/** Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Size of blocks to allocate 
protected	TokenNameprotected	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** Number of blocks to (over)allocate by */	TokenNameCOMMENT_JAVADOC	 Number of blocks to (over)allocate by 
protected	TokenNameprotected	
int	TokenNameint	
m_numblocks	TokenNameIdentifier	 m numblocks
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Array of arrays of bytes */	TokenNameCOMMENT_JAVADOC	 Array of arrays of bytes 
protected	TokenNameprotected	
byte	TokenNamebyte	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Number of bytes in array */	TokenNameCOMMENT_JAVADOC	 Number of bytes in array 
protected	TokenNameprotected	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "Shortcut" handle to m_map[0] */	TokenNameCOMMENT_JAVADOC	 "Shortcut" handle to m_map[0] 
protected	TokenNameprotected	
byte	TokenNamebyte	
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
SuballocatedByteVector	TokenNameIdentifier	 Suballocated Byte Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
2048	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ByteVector, using the given block size. * * @param blocksize Size of block to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a ByteVector, using the given block size. * @param blocksize Size of block to allocate 
public	TokenNamepublic	
SuballocatedByteVector	TokenNameIdentifier	 Suballocated Byte Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_map0	TokenNameIdentifier	 m map0
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blocksize	TokenNameIdentifier	 blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_numblocks	TokenNameIdentifier	 m numblocks
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m_map0	TokenNameIdentifier	 m map0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ByteVector, using the given block size. * * @param blocksize Size of block to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a ByteVector, using the given block size. * @param blocksize Size of block to allocate 
public	TokenNamepublic	
SuballocatedByteVector	TokenNameIdentifier	 Suballocated Byte Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
int	TokenNameint	
increaseSize	TokenNameIdentifier	 increase Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// increaseSize not currently used. 	TokenNameCOMMENT_LINE	increaseSize not currently used. 
this	TokenNamethis	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return length of the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return length of the list 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the length of the list. * * @return length of the list */	TokenNameCOMMENT_JAVADOC	 Set the length of the list. * @return length of the list 
private	TokenNameprivate	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
<	TokenNameLESS	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a byte onto the vector. * * @param value Byte to add to the list */	TokenNameCOMMENT_JAVADOC	 Append a byte onto the vector. * @param value Byte to add to the list 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
m_numblocks	TokenNameIdentifier	 m numblocks
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append several byte values onto the vector. * * @param value Byte to add to the list */	TokenNameCOMMENT_JAVADOC	 Append several byte values onto the vector. * @param value Byte to add to the list 
private	TokenNameprivate	
void	TokenNamevoid	
addElements	TokenNameIdentifier	 add Elements
(	TokenNameLPAREN	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberOfElements	TokenNameIdentifier	 number Of Elements
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
numberOfElements	TokenNameIdentifier	 number Of Elements
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numberOfElements	TokenNameIdentifier	 number Of Elements
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
m_numblocks	TokenNameIdentifier	 m numblocks
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
copied	TokenNameIdentifier	 copied
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
:	TokenNameCOLON	
numberOfElements	TokenNameIdentifier	 number Of Elements
;	TokenNameSEMICOLON	
numberOfElements	TokenNameIdentifier	 number Of Elements
-=	TokenNameMINUS_EQUAL	
copied	TokenNameIdentifier	 copied
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
copied	TokenNameIdentifier	 copied
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append several slots onto the vector, but do not set the values. * Note: "Not Set" means the value is unspecified. * * @param numberOfElements */	TokenNameCOMMENT_JAVADOC	 Append several slots onto the vector, but do not set the values. Note: "Not Set" means the value is unspecified. * @param numberOfElements 
private	TokenNameprivate	
void	TokenNamevoid	
addElements	TokenNameIdentifier	 add Elements
(	TokenNameLPAREN	
int	TokenNameint	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newlen	TokenNameIdentifier	 newlen
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newlen	TokenNameIdentifier	 newlen
>	TokenNameGREATER	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
newindex	TokenNameIdentifier	 newindex
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
newindex	TokenNameIdentifier	 newindex
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
newlen	TokenNameIdentifier	 newlen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * * Insertion may be an EXPENSIVE operation! * * @param value Byte to insert * @param at Index of where to insert */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. * Insertion may be an EXPENSIVE operation! * @param value Byte to insert @param at Index of where to insert 
private	TokenNameprivate	
void	TokenNamevoid	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
==	TokenNameEQUAL_EQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
>	TokenNameGREATER	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
m_numblocks	TokenNameIdentifier	 m numblocks
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
maxindex	TokenNameIdentifier	 maxindex
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
push	TokenNameIdentifier	 push
;	TokenNameSEMICOLON	
// ***** Easier to work down from top? 	TokenNameCOMMENT_LINE	***** Easier to work down from top? 
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
maxindex	TokenNameIdentifier	 maxindex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
copylen	TokenNameIdentifier	 copylen
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
copylen	TokenNameIdentifier	 copylen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
push	TokenNameIdentifier	 push
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wipe it out. */	TokenNameCOMMENT_JAVADOC	 Wipe it out. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first occurrence of the argument from this vector. * If the object is found in this vector, each component in the vector * with an index greater or equal to the object's index is shifted * downward to have an index one smaller than the value it had * previously. * * @param s Byte to remove from array * * @return True if the byte was removed, false if it was not found */	TokenNameCOMMENT_JAVADOC	 Removes the first occurrence of the argument from this vector. If the object is found in this vector, each component in the vector with an index greater or equal to the object's index is shifted downward to have an index one smaller than the value it had previously. * @param s Byte to remove from array * @return True if the byte was removed, false if it was not found 
private	TokenNameprivate	
boolean	TokenNameboolean	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
byte	TokenNamebyte	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes the component at the specified index. Each component in * this vector with an index greater or equal to the specified * index is shifted downward to have an index one smaller than * the value it had previously. * * @param at index of where to remove a byte */	TokenNameCOMMENT_JAVADOC	 Deletes the component at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted downward to have an index one smaller than the value it had previously. * @param at index of where to remove a byte 
private	TokenNameprivate	
void	TokenNamevoid	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
int	TokenNameint	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No point in removing elements that "don't exist"... 	TokenNameCOMMENT_LINE	No point in removing elements that "don't exist"... 
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
maxindex	TokenNameIdentifier	 maxindex
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
maxindex	TokenNameIdentifier	 maxindex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
copylen	TokenNameIdentifier	 copylen
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
copylen	TokenNameIdentifier	 copylen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
maxindex	TokenNameIdentifier	 maxindex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the component at the specified index of this vector to be the * specified object. The previous component at that position is discarded. * * The index must be a value greater than or equal to 0 and less * than the current size of the vector. * * @param value * @param at Index of where to set the object */	TokenNameCOMMENT_JAVADOC	 Sets the component at the specified index of this vector to be the specified object. The previous component at that position is discarded. * The index must be a value greater than or equal to 0 and less than the current size of the vector. * @param value @param at Index of where to set the object 
public	TokenNamepublic	
void	TokenNamevoid	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
at	TokenNameIdentifier	 at
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
m_numblocks	TokenNameIdentifier	 m numblocks
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
>=	TokenNameGREATER_EQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nth element. This is often at the innermost loop of an * application, so performance is critical. * * @param i index of value to get * * @return value at given index. If that value wasn't previously set, * the result is undefined for performance reasons. It may throw an * exception (see below), may return zero, or (if setSize has previously * been used) may return stale data. * * @throws ArrayIndexOutOfBoundsException if the index was _clearly_ * unreasonable (negative, or past the highest block). * * @throws NullPointerException if the index points to a block that could * have existed (based on the highest index used) but has never had anything * set into it. * %REVIEW% Could add a catch to create the block in that case, or return 0. * Try/Catch is _supposed_ to be nearly free when not thrown to. Do we * believe that? Should we have a separate safeElementAt? */	TokenNameCOMMENT_JAVADOC	 Get the nth element. This is often at the innermost loop of an application, so performance is critical. * @param i index of value to get * @return value at given index. If that value wasn't previously set, the result is undefined for performance reasons. It may throw an exception (see below), may return zero, or (if setSize has previously been used) may return stale data. * @throws ArrayIndexOutOfBoundsException if the index was _clearly_ unreasonable (negative, or past the highest block). * @throws NullPointerException if the index points to a block that could have existed (based on the highest index used) but has never had anything set into it. %REVIEW% Could add a catch to create the block in that case, or return 0. Try/Catch is _supposed_ to be nearly free when not thrown to. Do we believe that? Should we have a separate safeElementAt? 
public	TokenNamepublic	
byte	TokenNamebyte	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% Does this really buy us anything? Test versus division for small, 	TokenNameCOMMENT_LINE	%OPT% Does this really buy us anything? Test versus division for small, 
// test _plus_ division for big docs. 	TokenNameCOMMENT_LINE	test _plus_ division for big docs. 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
return	TokenNamereturn	
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given node. * * @param s object to look for * * @return true if the object is in the list */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given node. * @param s object to look for * @return true if the object is in the list 
private	TokenNameprivate	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
byte	TokenNamebyte	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem object to look for * @param index Index of where to begin search * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem object to look for @param index Index of where to begin search @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
byte	TokenNamebyte	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bindex	TokenNameIdentifier	 bindex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
boffset	TokenNameIdentifier	 boffset
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
maxindex	TokenNameIdentifier	 maxindex
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
bindex	TokenNameIdentifier	 bindex
<	TokenNameLESS	
maxindex	TokenNameIdentifier	 maxindex
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
bindex	TokenNameIdentifier	 bindex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
bindex	TokenNameIdentifier	 bindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
boffset	TokenNameIdentifier	 boffset
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
bindex	TokenNameIdentifier	 bindex
*	TokenNameMULTIPLY	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
boffset	TokenNameIdentifier	 boffset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// after first 	TokenNameCOMMENT_LINE	after first 
}	TokenNameRBRACE	
// Last block may need to stop before end 	TokenNameCOMMENT_LINE	Last block may need to stop before end 
int	TokenNameint	
maxoffset	TokenNameIdentifier	 maxoffset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
maxindex	TokenNameIdentifier	 maxindex
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
boffset	TokenNameIdentifier	 boffset
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
maxoffset	TokenNameIdentifier	 maxoffset
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
maxindex	TokenNameIdentifier	 maxindex
*	TokenNameMULTIPLY	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem object to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem object to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
byte	TokenNamebyte	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Object to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Object to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
private	TokenNameprivate	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
byte	TokenNamebyte	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
boffset	TokenNameIdentifier	 boffset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
%	TokenNameREMAINDER	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
/	TokenNameDIVIDE	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
boffset	TokenNameIdentifier	 boffset
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
*	TokenNameMULTIPLY	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
boffset	TokenNameIdentifier	 boffset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// after first 	TokenNameCOMMENT_LINE	after first 
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
