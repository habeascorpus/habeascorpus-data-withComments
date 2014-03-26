/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeVector.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeVector.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
/** * A very simple table that stores a list of Nodes. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A very simple table that stores a list of Nodes. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
NodeVector	TokenNameIdentifier	 Node Vector
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
713473092200731870L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Size of blocks to allocate. * @serial */	TokenNameCOMMENT_JAVADOC	 Size of blocks to allocate. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** * Array of nodes this points to. * @serial */	TokenNameCOMMENT_JAVADOC	 Array of nodes this points to. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Number of nodes in this NodeVector. * @serial */	TokenNameCOMMENT_JAVADOC	 Number of nodes in this NodeVector. @serial 
protected	TokenNameprotected	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Size of the array this points to. * @serial */	TokenNameCOMMENT_JAVADOC	 Size of the array this points to. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
// lazy initialization 	TokenNameCOMMENT_LINE	lazy initialization 
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a NodeVector, using the given block size. * * @param blocksize Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a NodeVector, using the given block size. * @param blocksize Size of blocks to allocate 
public	TokenNamepublic	
NodeVector	TokenNameIdentifier	 Node Vector
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned LocPathIterator. * * @return A clone of this * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned LocPathIterator. * @return A clone of this * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeVector	TokenNameIdentifier	 Node Vector
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
==	TokenNameEQUAL_EQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Number of nodes in this NodeVector */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Number of nodes in this NodeVector 
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
/** * Append a Node onto the vector. * * @param value Node to add to the vector */	TokenNameCOMMENT_JAVADOC	 Append a Node onto the vector. * @param value Node to add to the vector 
public	TokenNamepublic	
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
/** * Append a Node onto the vector. * * @param value Node to add to the vector */	TokenNameCOMMENT_JAVADOC	 Append a Node onto the vector. * @param value Node to add to the vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ff	TokenNameIdentifier	 ff
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ff	TokenNameIdentifier	 ff
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
ff	TokenNameIdentifier	 ff
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
ff	TokenNameIdentifier	 ff
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
ff	TokenNameIdentifier	 ff
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
ff	TokenNameIdentifier	 ff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a node from the tail of the vector and return the result. * * @return the node at the tail of the vector */	TokenNameCOMMENT_JAVADOC	 Pop a node from the tail of the vector and return the result. * @return the node at the tail of the vector 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a node from the tail of the vector and return the * top of the stack after the pop. * * @return The top of the stack after it's been popped */	TokenNameCOMMENT_JAVADOC	 Pop a node from the tail of the vector and return the top of the stack after the pop. * @return The top of the stack after it's been popped 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
popAndTop	TokenNameIdentifier	 pop And Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a node from the tail of the vector. */	TokenNameCOMMENT_JAVADOC	 Pop a node from the tail of the vector. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popQuick	TokenNameIdentifier	 pop Quick
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node at the top of the stack without popping the stack. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @return Node at the top of the stack or null if stack is empty. */	TokenNameCOMMENT_JAVADOC	 Return the node at the top of the stack without popping the stack. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @return Node at the top of the stack or null if stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
peepOrNull	TokenNameIdentifier	 peep Or Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push a pair of nodes into the stack. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @param v1 First node to add to vector * @param v2 Second node to add to vector */	TokenNameCOMMENT_JAVADOC	 Push a pair of nodes into the stack. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @param v1 First node to add to vector @param v2 Second node to add to vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushPair	TokenNameIdentifier	 push Pair
(	TokenNameLPAREN	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
int	TokenNameint	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a pair of nodes from the tail of the stack. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. */	TokenNameCOMMENT_JAVADOC	 Pop a pair of nodes from the tail of the stack. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popPair	TokenNameIdentifier	 pop Pair
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the tail of the stack to the given node. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @param n Node to set at the tail of vector */	TokenNameCOMMENT_JAVADOC	 Set the tail of the stack to the given node. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @param n Node to set at the tail of vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTail	TokenNameIdentifier	 set Tail
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the given node one position from the tail. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @param n Node to set */	TokenNameCOMMENT_JAVADOC	 Set the given node one position from the tail. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @param n Node to set 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTailSub1	TokenNameIdentifier	 set Tail Sub1
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node at the tail of the vector without popping * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @return Node at the tail of the vector */	TokenNameCOMMENT_JAVADOC	 Return the node at the tail of the vector without popping Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @return Node at the tail of the vector 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
peepTail	TokenNameIdentifier	 peep Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node one position from the tail without popping. * Special purpose method for TransformerImpl, pushElemTemplateElement. * Performance critical. * * @return Node one away from the tail */	TokenNameCOMMENT_JAVADOC	 Return the node one position from the tail without popping. Special purpose method for TransformerImpl, pushElemTemplateElement. Performance critical. * @return Node one away from the tail 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
peepTailSub1	TokenNameIdentifier	 peep Tail Sub1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a node in order in the list. * * @param value Node to insert */	TokenNameCOMMENT_JAVADOC	 Insert a node in order in the list. * @param value Node to insert 
public	TokenNamepublic	
void	TokenNamevoid	
insertInOrder	TokenNameIdentifier	 insert In Order
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
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
value	TokenNameIdentifier	 value
<	TokenNameLESS	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * * @param value Node to insert * @param at Position where to insert */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. * @param value Node to insert @param at Position where to insert 
public	TokenNamepublic	
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
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
/** * Append the nodes to the list. * * @param nodes NodeVector to append to this list */	TokenNameCOMMENT_JAVADOC	 Append the nodes to the list. * @param nodes NodeVector to append to this list 
public	TokenNamepublic	
void	TokenNamevoid	
appendNodes	TokenNameIdentifier	 append Nodes
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nNodes	TokenNameIdentifier	 n Nodes
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
nNodes	TokenNameIdentifier	 n Nodes
+	TokenNamePLUS	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
nNodes	TokenNameIdentifier	 n Nodes
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
nNodes	TokenNameIdentifier	 n Nodes
+	TokenNamePLUS	
m_blocksize	TokenNameIdentifier	 m blocksize
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
nNodes	TokenNameIdentifier	 n Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
,	TokenNameCOMMA	
nNodes	TokenNameIdentifier	 n Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
nNodes	TokenNameIdentifier	 n Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
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
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the length to zero, but don't clear the array. */	TokenNameCOMMENT_JAVADOC	 Set the length to zero, but don't clear the array. 
public	TokenNamepublic	
void	TokenNamevoid	
RemoveAllNoClear	TokenNameIdentifier	 Remove All No Clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first occurrence of the argument from this vector. * If the object is found in this vector, each component in the vector * with an index greater or equal to the object's index is shifted * downward to have an index one smaller than the value it had * previously. * * @param s Node to remove from the list * * @return True if the node was successfully removed */	TokenNameCOMMENT_JAVADOC	 Removes the first occurrence of the argument from this vector. If the object is found in this vector, each component in the vector with an index greater or equal to the object's index is shifted downward to have an index one smaller than the value it had previously. * @param s Node to remove from the list * @return True if the node was successfully removed 
public	TokenNamepublic	
boolean	TokenNameboolean	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
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
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
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
/** * Deletes the component at the specified index. Each component in * this vector with an index greater or equal to the specified * index is shifted downward to have an index one smaller than * the value it had previously. * * @param i Index of node to remove */	TokenNameCOMMENT_JAVADOC	 Deletes the component at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted downward to have an index one smaller than the value it had previously. * @param i Index of node to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the component at the specified index of this vector to be the * specified object. The previous component at that position is discarded. * * The index must be a value greater than or equal to 0 and less * than the current size of the vector. * * @param node Node to set * @param index Index of where to set the node */	TokenNameCOMMENT_JAVADOC	 Sets the component at the specified index of this vector to be the specified object. The previous component at that position is discarded. * The index must be a value greater than or equal to 0 and less than the current size of the vector. * @param node Node to set @param index Index of where to set the node 
public	TokenNamepublic	
void	TokenNamevoid	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nth element. * * @param i Index of node to get * * @return Node at specified index */	TokenNameCOMMENT_JAVADOC	 Get the nth element. * @param i Index of node to get * @return Node at specified index 
public	TokenNamepublic	
int	TokenNameint	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given node. * * @param s Node to look for * * @return True if the given node was found. */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given node. * @param s Node to look for * @return True if the given node was found. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
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
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Node to look for * @param index Index of where to start the search * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Node to look for @param index Index of where to start the search @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
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
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Node to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Node to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
int	TokenNameint	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_map	TokenNameIdentifier	 m map
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sort an array using a quicksort algorithm. * * @param a The array to be sorted. * @param lo0 The low index. * @param hi0 The high index. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Sort an array using a quicksort algorithm. * @param a The array to be sorted. @param lo0 The low index. @param hi0 The high index. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
lo0	TokenNameIdentifier	 lo0
,	TokenNameCOMMA	
int	TokenNameint	
hi0	TokenNameIdentifier	 hi0
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
lo0	TokenNameIdentifier	 lo0
;	TokenNameSEMICOLON	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
hi0	TokenNameIdentifier	 hi0
;	TokenNameSEMICOLON	
// pause(lo, hi); 	TokenNameCOMMENT_LINE	pause(lo, hi); 
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
>=	TokenNameGREATER_EQUAL	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
==	TokenNameEQUAL_EQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * sort a two element list by swapping if necessary */	TokenNameCOMMENT_BLOCK	 sort a two element list by swapping if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
T	TokenNameIdentifier	 T
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
T	TokenNameIdentifier	 T
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Pick a pivot and move it out of the way */	TokenNameCOMMENT_BLOCK	 Pick a pivot and move it out of the way 
int	TokenNameint	
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Search forward from a[lo] until an element is found that * is greater than the pivot or lo >= hi */	TokenNameCOMMENT_BLOCK	 Search forward from a[lo] until an element is found that is greater than the pivot or lo >= hi 
while	TokenNamewhile	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
pivot	TokenNameIdentifier	 pivot
&&	TokenNameAND_AND	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Search backward from a[hi] until element is found that * is less than the pivot, or lo >= hi */	TokenNameCOMMENT_BLOCK	 Search backward from a[hi] until element is found that is less than the pivot, or lo >= hi 
while	TokenNamewhile	
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
<=	TokenNameLESS_EQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hi	TokenNameIdentifier	 hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Swap elements a[lo] and a[hi] */	TokenNameCOMMENT_BLOCK	 Swap elements a[lo] and a[hi] 
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
T	TokenNameIdentifier	 T
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
T	TokenNameIdentifier	 T
;	TokenNameSEMICOLON	
// pause(); 	TokenNameCOMMENT_LINE	pause(); 
}	TokenNameRBRACE	
// if (stopRequested) { 	TokenNameCOMMENT_LINE	if (stopRequested) { 
// return; 	TokenNameCOMMENT_LINE	return; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/* * Put the median in the "center" of the list */	TokenNameCOMMENT_BLOCK	 Put the median in the "center" of the list 
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi0	TokenNameIdentifier	 hi0
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
/* * Recursive calls, elements a[lo0] to a[lo-1] are less than or * equal to pivot, elements a[hi+1] to a[hi0] are greater than * pivot. */	TokenNameCOMMENT_BLOCK	 Recursive calls, elements a[lo0] to a[lo-1] are less than or equal to pivot, elements a[hi+1] to a[hi0] are greater than pivot. 
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
lo0	TokenNameIdentifier	 lo0
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hi0	TokenNameIdentifier	 hi0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sort an array using a quicksort algorithm. * * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Sort an array using a quicksort algorithm. * @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
