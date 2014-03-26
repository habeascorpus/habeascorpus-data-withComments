/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: IntVector.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: IntVector.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * A very simple table that stores a list of int. * * This version is based on a "realloc" strategy -- a simle array is * used, and when more storage is needed, a larger array is obtained * and all existing data is recopied into it. As a result, read/write * access to existing nodes is O(1) fast but appending may be O(N**2) * slow. See also SuballocatedIntVector. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A very simple table that stores a list of int. * This version is based on a "realloc" strategy -- a simle array is used, and when more storage is needed, a larger array is obtained and all existing data is recopied into it. As a result, read/write access to existing nodes is O(1) fast but appending may be O(N**2) slow. See also SuballocatedIntVector. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
IntVector	TokenNameIdentifier	 Int Vector
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Size of blocks to allocate 
protected	TokenNameprotected	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** Array of ints */	TokenNameCOMMENT_JAVADOC	 Array of ints 
protected	TokenNameprotected	
int	TokenNameint	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// IntStack is trying to see this directly 	TokenNameCOMMENT_LINE	IntStack is trying to see this directly 
/** Number of ints in array */	TokenNameCOMMENT_JAVADOC	 Number of ints in array 
protected	TokenNameprotected	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Size of array */	TokenNameCOMMENT_JAVADOC	 Size of array 
protected	TokenNameprotected	
int	TokenNameint	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a IntVector, using the given block size. * * @param blocksize Size of block to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size. * @param blocksize Size of block to allocate 
public	TokenNamepublic	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
blocksize	TokenNameIdentifier	 blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a IntVector, using the given block size. * * @param blocksize Size of block to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size. * @param blocksize Size of block to allocate 
public	TokenNamepublic	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
int	TokenNameint	
increaseSize	TokenNameIdentifier	 increase Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
increaseSize	TokenNameIdentifier	 increase Size
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
blocksize	TokenNameIdentifier	 blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy constructor for IntVector * * @param v Existing IntVector to copy */	TokenNameCOMMENT_JAVADOC	 Copy constructor for IntVector * @param v Existing IntVector to copy 
public	TokenNamepublic	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
IntVector	TokenNameIdentifier	 Int Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return length of the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return length of the list 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return length of the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return length of the list 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a int onto the vector. * * @param value Int to add to the list */	TokenNameCOMMENT_JAVADOC	 Append a int onto the vector. * @param value Int to add to the list 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
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
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append several int values onto the vector. * * @param value Int to add to the list */	TokenNameCOMMENT_JAVADOC	 Append several int values onto the vector. * @param value Int to add to the list 
public	TokenNamepublic	
final	TokenNamefinal	
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
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
m_blocksize	TokenNameIdentifier	 m blocksize
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
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
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append several slots onto the vector, but do not set the values. * * @param numberOfElements Int to add to the list */	TokenNameCOMMENT_JAVADOC	 Append several slots onto the vector, but do not set the values. * @param numberOfElements Int to add to the list 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addElements	TokenNameIdentifier	 add Elements
(	TokenNameLPAREN	
int	TokenNameint	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
m_blocksize	TokenNameIdentifier	 m blocksize
+	TokenNamePLUS	
numberOfElements	TokenNameIdentifier	 number Of Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
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
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
numberOfElements	TokenNameIdentifier	 number Of Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * * @param value Int to insert * @param at Index of where to insert */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. * @param value Int to insert @param at Index of where to insert 
public	TokenNamepublic	
final	TokenNamefinal	
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
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
int	TokenNameint	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
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
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
at	TokenNameIdentifier	 at
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first occurrence of the argument from this vector. * If the object is found in this vector, each component in the vector * with an index greater or equal to the object's index is shifted * downward to have an index one smaller than the value it had * previously. * * @param s Int to remove from array * * @return True if the int was removed, false if it was not found */	TokenNameCOMMENT_JAVADOC	 Removes the first occurrence of the argument from this vector. If the object is found in this vector, each component in the vector with an index greater or equal to the object's index is shifted downward to have an index one smaller than the value it had previously. * @param s Int to remove from array * @return True if the int was removed, false if it was not found 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes the component at the specified index. Each component in * this vector with an index greater or equal to the specified * index is shifted downward to have an index one smaller than * the value it had previously. * * @param i index of where to remove and int */	TokenNameCOMMENT_JAVADOC	 Deletes the component at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted downward to have an index one smaller than the value it had previously. * @param i index of where to remove and int 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the component at the specified index of this vector to be the * specified object. The previous component at that position is discarded. * * The index must be a value greater than or equal to 0 and less * than the current size of the vector. * * @param value object to set * @param index Index of where to set the object */	TokenNameCOMMENT_JAVADOC	 Sets the component at the specified index of this vector to be the specified object. The previous component at that position is discarded. * The index must be a value greater than or equal to 0 and less than the current size of the vector. * @param value object to set @param index Index of where to set the object 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nth element. * * @param i index of object to get * * @return object at given index */	TokenNameCOMMENT_JAVADOC	 Get the nth element. * @param i index of object to get * @return object at given index 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given node. * * @param s object to look for * * @return true if the object is in the list */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given node. * @param s object to look for * @return true if the object is in the list 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem object to look for * @param index Index of where to begin search * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem object to look for @param index Index of where to begin search @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
final	TokenNamefinal	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem object to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem object to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
int	TokenNameint	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Object to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Object to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
int	TokenNameint	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns clone of current IntVector * * @return clone of current IntVector */	TokenNameCOMMENT_JAVADOC	 Returns clone of current IntVector * @return clone of current IntVector 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
