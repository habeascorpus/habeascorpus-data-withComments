/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: BoolStack.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: BoolStack.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Simple stack for boolean values. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Simple stack for boolean values. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BoolStack	TokenNameIdentifier	 Bool Stack
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** Array of boolean values */	TokenNameCOMMENT_JAVADOC	 Array of boolean values 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Array size allocated */	TokenNameCOMMENT_JAVADOC	 Array size allocated 
private	TokenNameprivate	
int	TokenNameint	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
;	TokenNameSEMICOLON	
/** Index into the array of booleans */	TokenNameCOMMENT_JAVADOC	 Index into the array of booleans 
private	TokenNameprivate	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a IntVector, using the given block size. * * @param size array size to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size. * @param size array size to allocate 
public	TokenNamepublic	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Current length of the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Current length of the list 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_index	TokenNameIdentifier	 m index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the stack. * */	TokenNameCOMMENT_JAVADOC	 Clears the stack. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pushes an item onto the top of this stack. * * * @param val the boolean to be pushed onto this stack. * @return the <code>item</code> argument. */	TokenNameCOMMENT_JAVADOC	 Pushes an item onto the top of this stack. * @param val the boolean to be pushed onto this stack. @return the <code>item</code> argument. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
==	TokenNameEQUAL_EQUAL	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the object at the top of this stack and returns that * object as the value of this function. * * @return The object at the top of this stack. * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Removes the object at the top of this stack and returns that object as the value of this function. * @return The object at the top of this stack. @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the object at the top of this stack and returns the * next object at the top as the value of this function. * * * @return Next object to the top or false if none there */	TokenNameCOMMENT_JAVADOC	 Removes the object at the top of this stack and returns the next object at the top as the value of this function. * @return Next object to the top or false if none there 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
popAndTop	TokenNameIdentifier	 pop And Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the item at the top of this stack * * * @param b Object to set at the top of this stack */	TokenNameCOMMENT_JAVADOC	 Set the item at the top of this stack * @param b Object to set at the top of this stack 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. * * @return the object at the top of this stack. * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. * @return the object at the top of this stack. @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. If the stack is empty, it returns false. * * @return the object at the top of this stack. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. If the stack is empty, it returns false. * @return the object at the top of this stack. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
peekOrFalse	TokenNameIdentifier	 peek Or False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. If the stack is empty, it returns true. * * @return the object at the top of this stack. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. If the stack is empty, it returns true. * @return the object at the top of this stack. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
peekOrTrue	TokenNameIdentifier	 peek Or True
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this stack is empty. * * @return <code>true</code> if this stack is empty; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if this stack is empty. * @return <code>true</code> if this stack is empty; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Grows the size of the stack * */	TokenNameCOMMENT_JAVADOC	 Grows the size of the stack 
private	TokenNameprivate	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
newVector	TokenNameIdentifier	 new Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_values	TokenNameIdentifier	 m values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newVector	TokenNameIdentifier	 new Vector
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_index	TokenNameIdentifier	 m index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
=	TokenNameEQUAL	
newVector	TokenNameIdentifier	 new Vector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
