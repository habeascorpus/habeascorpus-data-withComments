/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SuballocatedIntVector.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SuballocatedIntVector.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * A very simple table that stores a list of int. Very similar API to our * IntVector class (same API); different internal storage. * * This version uses an array-of-arrays solution. Read/write access is thus * a bit slower than the simple IntVector, and basic storage is a trifle * higher due to the top-level array -- but appending is O(1) fast rather * than O(N**2) slow, which will swamp those costs in situations where * long vectors are being built up. * * Known issues: * * Some methods are private because they haven't yet been tested properly. * * Retrieval performance is critical, since this is used at the core * of the DTM model. (Append performance is almost as important.) * That's pushing me toward just letting reads from unset indices * throw exceptions or return stale data; safer behavior would have * performance costs. * */	TokenNameCOMMENT_JAVADOC	 A very simple table that stores a list of int. Very similar API to our IntVector class (same API); different internal storage. * This version uses an array-of-arrays solution. Read/write access is thus a bit slower than the simple IntVector, and basic storage is a trifle higher due to the top-level array -- but appending is O(1) fast rather than O(N**2) slow, which will swamp those costs in situations where long vectors are being built up. * Known issues: * Some methods are private because they haven't yet been tested properly. * Retrieval performance is critical, since this is used at the core of the DTM model. (Append performance is almost as important.) That's pushing me toward just letting reads from unset indices throw exceptions or return stale data; safer behavior would have performance costs. 
public	TokenNamepublic	
class	TokenNameclass	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
{	TokenNameLBRACE	
/** Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Size of blocks to allocate 
protected	TokenNameprotected	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** Bitwise addressing (much faster than div/remainder */	TokenNameCOMMENT_JAVADOC	 Bitwise addressing (much faster than div/remainder 
protected	TokenNameprotected	
int	TokenNameint	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
,	TokenNameCOMMA	
m_MASK	TokenNameIdentifier	 m  MASK
;	TokenNameSEMICOLON	
/** The default number of blocks to (over)allocate by */	TokenNameCOMMENT_JAVADOC	 The default number of blocks to (over)allocate by 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUMBLOCKS_DEFAULT	TokenNameIdentifier	 NUMBLOCKS  DEFAULT
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The number of blocks to (over)allocate by */	TokenNameCOMMENT_JAVADOC	 The number of blocks to (over)allocate by 
protected	TokenNameprotected	
int	TokenNameint	
m_numblocks	TokenNameIdentifier	 m numblocks
=	TokenNameEQUAL	
NUMBLOCKS_DEFAULT	TokenNameIdentifier	 NUMBLOCKS  DEFAULT
;	TokenNameSEMICOLON	
/** Array of arrays of ints */	TokenNameCOMMENT_JAVADOC	 Array of arrays of ints 
protected	TokenNameprotected	
int	TokenNameint	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Number of ints in array */	TokenNameCOMMENT_JAVADOC	 Number of ints in array 
protected	TokenNameprotected	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "Shortcut" handle to m_map[0]. Surprisingly helpful for short vectors. */	TokenNameCOMMENT_JAVADOC	 "Shortcut" handle to m_map[0]. Surprisingly helpful for short vectors. 
protected	TokenNameprotected	
int	TokenNameint	
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** "Shortcut" handle to most recently added row of m_map. * Very helpful during construction. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 "Shortcut" handle to most recently added row of m_map. Very helpful during construction. @xsl.usage internal 
protected	TokenNameprotected	
int	TokenNameint	
m_buildCache	TokenNameIdentifier	 m build Cache
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
m_buildCacheStartIndex	TokenNameIdentifier	 m build Cache Start Index
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is currently 2K, which may be overkill for * small lists and undershootng for large ones. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is currently 2K, which may be overkill for small lists and undershootng for large ones. 
public	TokenNamepublic	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
2048	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a IntVector, using the given block size and number * of blocks. For efficiency, we will round the requested size * off to a power of two. * * @param blocksize Size of block to allocate * @param numblocks Number of blocks to allocate * */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size and number of blocks. For efficiency, we will round the requested size off to a power of two. * @param blocksize Size of block to allocate @param numblocks Number of blocks to allocate 
public	TokenNamepublic	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
int	TokenNameint	
numblocks	TokenNameIdentifier	 numblocks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//m_blocksize = blocksize; 	TokenNameCOMMENT_LINE	m_blocksize = blocksize; 
for	TokenNamefor	
(	TokenNameLPAREN	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
m_MASK	TokenNameIdentifier	 m  MASK
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_numblocks	TokenNameIdentifier	 m numblocks
=	TokenNameEQUAL	
numblocks	TokenNameIdentifier	 numblocks
;	TokenNameSEMICOLON	
m_map0	TokenNameIdentifier	 m map0
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numblocks	TokenNameIdentifier	 numblocks
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
m_buildCache	TokenNameIdentifier	 m build Cache
=	TokenNameEQUAL	
m_map0	TokenNameIdentifier	 m map0
;	TokenNameSEMICOLON	
m_buildCacheStartIndex	TokenNameIdentifier	 m build Cache Start Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a IntVector, using the given block size and * the default number of blocks (32). * * @param blocksize Size of block to allocate * */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size and the default number of blocks (32). * @param blocksize Size of block to allocate 
public	TokenNamepublic	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
NUMBLOCKS_DEFAULT	TokenNameIdentifier	 NUMBLOCKS  DEFAULT
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
/** * Set the length of the list. This will only work to truncate the list, and * even then it has not been heavily tested and may not be trustworthy. * * @return length of the list */	TokenNameCOMMENT_JAVADOC	 Set the length of the list. This will only work to truncate the list, and even then it has not been heavily tested and may not be trustworthy. * @return length of the list 
public	TokenNamepublic	
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
>	TokenNameGREATER	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
// Whups; had that backward! 	TokenNameCOMMENT_LINE	Whups; had that backward! 
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a int onto the vector. * * @param value Int to add to the list */	TokenNameCOMMENT_JAVADOC	 Append a int onto the vector. * @param value Int to add to the list 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexRelativeToCache	TokenNameIdentifier	 index Relative To Cache
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
m_buildCacheStartIndex	TokenNameIdentifier	 m build Cache Start Index
;	TokenNameSEMICOLON	
// Is the new index an index into the cache row of m_map? 	TokenNameCOMMENT_LINE	Is the new index an index into the cache row of m_map? 
if	TokenNameif	
(	TokenNameLPAREN	
indexRelativeToCache	TokenNameIdentifier	 index Relative To Cache
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
indexRelativeToCache	TokenNameIdentifier	 index Relative To Cache
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_buildCache	TokenNameIdentifier	 m build Cache
[	TokenNameLBRACKET	
indexRelativeToCache	TokenNameIdentifier	 index Relative To Cache
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Growing the outer array should be rare. We initialize to a 	TokenNameCOMMENT_LINE	Growing the outer array should be rare. We initialize to a 
// total of m_blocksize squared elements, which at the default 	TokenNameCOMMENT_LINE	total of m_blocksize squared elements, which at the default 
// size is 4M integers... and we grow by at least that much each 	TokenNameCOMMENT_LINE	size is 4M integers... and we grow by at least that much each 
// time. However, attempts to microoptimize for this (assume 	TokenNameCOMMENT_LINE	time. However, attempts to microoptimize for this (assume 
// long enough and catch exceptions) yield no noticable 	TokenNameCOMMENT_LINE	long enough and catch exceptions) yield no noticable 
// improvement. 	TokenNameCOMMENT_LINE	improvement. 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
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
// Cache the current row of m_map. Next m_blocksize-1 	TokenNameCOMMENT_LINE	Cache the current row of m_map. Next m_blocksize-1 
// values added will go to this row. 	TokenNameCOMMENT_LINE	values added will go to this row. 
m_buildCache	TokenNameIdentifier	 m build Cache
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
m_buildCacheStartIndex	TokenNameIdentifier	 m build Cache Start Index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append several int values onto the vector. * * @param value Int to add to the list */	TokenNameCOMMENT_JAVADOC	 Append several int values onto the vector. * @param value Int to add to the list 
private	TokenNameprivate	
void	TokenNamevoid	
addElements	TokenNameIdentifier	 add Elements
(	TokenNameLPAREN	
int	TokenNameint	
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
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
/** * Append several slots onto the vector, but do not set the values. * Note: "Not Set" means the value is unspecified. * * @param numberOfElements Int to add to the list */	TokenNameCOMMENT_JAVADOC	 Append several slots onto the vector, but do not set the values. Note: "Not Set" means the value is unspecified. * @param numberOfElements Int to add to the list 
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
newindex	TokenNameIdentifier	 newindex
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
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
int	TokenNameint	
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
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * * Insertion may be an EXPENSIVE operation! * * @param value Int to insert * @param at Index of where to insert */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. * Insertion may be an EXPENSIVE operation! * @param value Int to insert @param at Index of where to insert 
private	TokenNameprivate	
void	TokenNamevoid	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
int	TokenNameint	
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
maxindex	TokenNameIdentifier	 maxindex
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
// %REVIEW% (m_firstFree+1?) 	TokenNameCOMMENT_LINE	%REVIEW% (m_firstFree+1?) 
++	TokenNamePLUS_PLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
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
/** * Wipe it out. Currently defined as equivalent to setSize(0). */	TokenNameCOMMENT_JAVADOC	 Wipe it out. Currently defined as equivalent to setSize(0). 
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
m_buildCache	TokenNameIdentifier	 m build Cache
=	TokenNameEQUAL	
m_map0	TokenNameIdentifier	 m map0
;	TokenNameSEMICOLON	
m_buildCacheStartIndex	TokenNameIdentifier	 m build Cache Start Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first occurrence of the argument from this vector. * If the object is found in this vector, each component in the vector * with an index greater or equal to the object's index is shifted * downward to have an index one smaller than the value it had * previously. * * @param s Int to remove from array * * @return True if the int was removed, false if it was not found */	TokenNameCOMMENT_JAVADOC	 Removes the first occurrence of the argument from this vector. If the object is found in this vector, each component in the vector with an index greater or equal to the object's index is shifted downward to have an index one smaller than the value it had previously. * @param s Int to remove from array * @return True if the int was removed, false if it was not found 
private	TokenNameprivate	
boolean	TokenNameboolean	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
int	TokenNameint	
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
/** * Deletes the component at the specified index. Each component in * this vector with an index greater or equal to the specified * index is shifted downward to have an index one smaller than * the value it had previously. * * @param i index of where to remove and int */	TokenNameCOMMENT_JAVADOC	 Deletes the component at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted downward to have an index one smaller than the value it had previously. * @param i index of where to remove and int 
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
maxindex	TokenNameIdentifier	 maxindex
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
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
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
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
/** * Sets the component at the specified index of this vector to be the * specified object. The previous component at that position is discarded. * * The index must be a value greater than or equal to 0 and less * than the current size of the vector. * * @param value object to set * @param at Index of where to set the object */	TokenNameCOMMENT_JAVADOC	 Sets the component at the specified index of this vector to be the specified object. The previous component at that position is discarded. * The index must be a value greater than or equal to 0 and less than the current size of the vector. * @param value object to set @param at Index of where to set the object 
public	TokenNamepublic	
void	TokenNamevoid	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
int	TokenNameint	
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
m_map0	TokenNameIdentifier	 m map0
[	TokenNameLBRACKET	
at	TokenNameIdentifier	 at
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
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
int	TokenNameint	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is actually a significant optimization! 	TokenNameCOMMENT_LINE	This is actually a significant optimization! 
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given node. * * @param s object to look for * * @return true if the object is in the list */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given node. * @param s object to look for * @return true if the object is in the list 
private	TokenNameprivate	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
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
int	TokenNameint	
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
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
boffset	TokenNameIdentifier	 boffset
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
;	TokenNameSEMICOLON	
int	TokenNameint	
maxindex	TokenNameIdentifier	 maxindex
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
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
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
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
int	TokenNameint	
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
int	TokenNameint	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
boffset	TokenNameIdentifier	 boffset
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
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
/** * Return the internal m_map0 array * @return the m_map0 array */	TokenNameCOMMENT_JAVADOC	 Return the internal m_map0 array @return the m_map0 array 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMap0	TokenNameIdentifier	 get Map0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map0	TokenNameIdentifier	 m map0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the m_map double array * @return the internal map of array of arrays */	TokenNameCOMMENT_JAVADOC	 Return the m_map double array @return the internal map of array of arrays 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
