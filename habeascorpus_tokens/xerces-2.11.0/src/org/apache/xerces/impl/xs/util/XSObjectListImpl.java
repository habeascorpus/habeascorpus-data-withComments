/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Array	TokenNameIdentifier	 Array
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbstractList	TokenNameIdentifier	 Abstract List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObject	TokenNameIdentifier	 XS Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObjectList	TokenNameIdentifier	 XS Object List
;	TokenNameSEMICOLON	
/** * Contains a list of XSObjects. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: XSObjectListImpl.java 776079 2009-05-18 20:22:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Contains a list of XSObjects. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: XSObjectListImpl.java 776079 2009-05-18 20:22:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
extends	TokenNameextends	
AbstractList	TokenNameIdentifier	 Abstract List
implements	TokenNameimplements	
XSObjectList	TokenNameIdentifier	 XS Object List
{	TokenNameLBRACE	
/** * An immutable empty list. */	TokenNameCOMMENT_JAVADOC	 An immutable empty list. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
=	TokenNameEQUAL	
new	TokenNamenew	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ListIterator	TokenNameIdentifier	 List Iterator
EMPTY_ITERATOR	TokenNameIdentifier	 EMPTY  ITERATOR
=	TokenNameEQUAL	
new	TokenNamenew	
ListIterator	TokenNameIdentifier	 List Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasPrevious	TokenNameIdentifier	 has Previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
previousIndex	TokenNameIdentifier	 previous Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The array to hold all data 	TokenNameCOMMENT_LINE	The array to hold all data 
private	TokenNameprivate	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Number of elements in this list 	TokenNameCOMMENT_LINE	Number of elements in this list 
private	TokenNameprivate	
int	TokenNameint	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
DEFAULT_SIZE	TokenNameIdentifier	 DEFAULT  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an XSObjectList implementation * * @param array the data array * @param length the number of elements */	TokenNameCOMMENT_JAVADOC	 Construct an XSObjectList implementation * @param array the data array @param length the number of elements 
public	TokenNamepublic	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of <code>XSObjects</code> in the list. The range of valid * child node indices is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>XSObjects</code> in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code>th item in the collection. The index * starts at 0. If <code>index</code> is greater than or equal to the * number of nodes in the list, this returns <code>null</code>. * @param index index into the collection. * @return The XSObject at the <code>index</code>th position in the * <code>XSObjectList</code>, or <code>null</code> if that is not a * valid index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. The index starts at 0. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. @param index index into the collection. @return The XSObject at the <code>index</code>th position in the <code>XSObjectList</code>, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
XSObject	TokenNameIdentifier	 XS Object
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear this object 	TokenNameCOMMENT_LINE	clear this object 
public	TokenNamepublic	
void	TokenNamevoid	
clearXSObjectList	TokenNameIdentifier	 clear XS Object List
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
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addXSObject	TokenNameIdentifier	 add XS Object
(	TokenNameLPAREN	
XSObject	TokenNameIdentifier	 XS Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
==	TokenNameEQUAL_EQUAL	
fArray	TokenNameIdentifier	 f Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fArray	TokenNameIdentifier	 f Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addXSObject	TokenNameIdentifier	 add XS Object
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
XSObject	TokenNameIdentifier	 XS Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * List methods */	TokenNameCOMMENT_BLOCK	 List methods 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
containsNull	TokenNameIdentifier	 contains Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
containsObject	TokenNameIdentifier	 contains Object
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Index: "	TokenNameStringLiteral	Index: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listIterator0	TokenNameIdentifier	 list Iterator0
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listIterator0	TokenNameIdentifier	 list Iterator0
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listIterator0	TokenNameIdentifier	 list Iterator0
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Index: "	TokenNameStringLiteral	Index: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator0	TokenNameIdentifier	 list Iterator0
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLength	TokenNameIdentifier	 f Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
EMPTY_ITERATOR	TokenNameIdentifier	 EMPTY  ITERATOR
:	TokenNameCOLON	
new	TokenNamenew	
XSObjectListIterator	TokenNameIdentifier	 XS Object List Iterator
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
containsObject	TokenNameIdentifier	 contains Object
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
containsNull	TokenNameIdentifier	 contains Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fLength	TokenNameIdentifier	 f Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
toArray0	TokenNameIdentifier	 to Array0
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
arrayClass	TokenNameIdentifier	 array Class
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
componentType	TokenNameIdentifier	 component Type
=	TokenNameEQUAL	
arrayClass	TokenNameIdentifier	 array Class
.	TokenNameDOT	
getComponentType	TokenNameIdentifier	 get Component Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
componentType	TokenNameIdentifier	 component Type
,	TokenNameCOMMA	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
toArray0	TokenNameIdentifier	 to Array0
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
toArray0	TokenNameIdentifier	 to Array0
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fArray	TokenNameIdentifier	 f Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
XSObjectListIterator	TokenNameIdentifier	 XS Object List Iterator
implements	TokenNameimplements	
ListIterator	TokenNameIdentifier	 List Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSObjectListIterator	TokenNameIdentifier	 XS Object List Iterator
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasPrevious	TokenNameIdentifier	 has Previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
previousIndex	TokenNameIdentifier	 previous Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSObjectListImpl 	TokenNameCOMMENT_LINE	class XSObjectListImpl 
