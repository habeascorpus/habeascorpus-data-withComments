/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: IntStack.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: IntStack.java 468655 2006-10-28 07:12:06Z minchau $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
;	TokenNameSEMICOLON	
/** * Implement a stack of simple integers. * * %OPT% * This is currently based on IntVector, which permits fast acess but pays a * heavy recopying penalty if/when its size is increased. If we expect deep * stacks, we should consider a version based on ChunkedIntVector. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Implement a stack of simple integers. * %OPT% This is currently based on IntVector, which permits fast acess but pays a heavy recopying penalty if/when its size is increased. If we expect deep stacks, we should consider a version based on ChunkedIntVector. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
IntStack	TokenNameIdentifier	 Int Stack
extends	TokenNameextends	
IntVector	TokenNameIdentifier	 Int Vector
{	TokenNameLBRACE	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a IntVector, using the given block size. * * @param blocksize Size of block to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size. * @param blocksize Size of block to allocate 
public	TokenNamepublic	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy constructor for IntStack * * @param v IntStack to copy */	TokenNameCOMMENT_JAVADOC	 Copy constructor for IntStack * @param v IntStack to copy 
public	TokenNamepublic	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pushes an item onto the top of this stack. * * @param i the int to be pushed onto this stack. * @return the <code>item</code> argument. */	TokenNameCOMMENT_JAVADOC	 Pushes an item onto the top of this stack. * @param i the int to be pushed onto this stack. @return the <code>item</code> argument. 
public	TokenNamepublic	
int	TokenNameint	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
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
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the object at the top of this stack and returns that * object as the value of this function. * * @return The object at the top of this stack. */	TokenNameCOMMENT_JAVADOC	 Removes the object at the top of this stack and returns that object as the value of this function. * @return The object at the top of this stack. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Quickly pops a number of items from the stack. */	TokenNameCOMMENT_JAVADOC	 Quickly pops a number of items from the stack. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
-=	TokenNameMINUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. * * @return the object at the top of this stack. * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. * @return the object at the top of this stack. @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Looks at the object at the position the stack counting down n items. * * @param n The number of items down, indexed from zero. * @return the object at n items down. * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the position the stack counting down n items. * @param n The number of items down, indexed from zero. @return the object at n items down. @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
int	TokenNameint	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets an object at a the top of the statck * * * @param val object to set at the top * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Sets an object at a the top of the statck * @param val object to set at the top @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
void	TokenNamevoid	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests if this stack is empty. * * @return <code>true</code> if this stack is empty; * <code>false</code> otherwise. * @since JDK1.0 */	TokenNameCOMMENT_JAVADOC	 Tests if this stack is empty. * @return <code>true</code> if this stack is empty; <code>false</code> otherwise. @since JDK1.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns where an object is on this stack. * * @param o the desired object. * @return the distance from the top of the stack where the object is] * located; the return value <code>-1</code> indicates that the * object is not on the stack. * @since JDK1.0 */	TokenNameCOMMENT_JAVADOC	 Returns where an object is on this stack. * @param o the desired object. @return the distance from the top of the stack where the object is] located; the return value <code>-1</code> indicates that the object is not on the stack. @since JDK1.0 
public	TokenNamepublic	
int	TokenNameint	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
int	TokenNameint	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns clone of current IntStack * * @return clone of current IntStack */	TokenNameCOMMENT_JAVADOC	 Returns clone of current IntStack * @return clone of current IntStack 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
