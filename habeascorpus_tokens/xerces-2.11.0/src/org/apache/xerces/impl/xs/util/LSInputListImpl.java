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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
LSInputList	TokenNameIdentifier	 LS Input List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSInput	TokenNameIdentifier	 LS Input
;	TokenNameSEMICOLON	
/** * Contains a list of LSInputs. * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: LSInputListImpl.java 776326 2009-05-19 14:27:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Contains a list of LSInputs. * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: LSInputListImpl.java 776326 2009-05-19 14:27:24Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LSInputListImpl	TokenNameIdentifier	 LS Input List Impl
extends	TokenNameextends	
AbstractList	TokenNameIdentifier	 Abstract List
implements	TokenNameimplements	
LSInputList	TokenNameIdentifier	 LS Input List
{	TokenNameLBRACE	
/** * An immutable empty list. */	TokenNameCOMMENT_JAVADOC	 An immutable empty list. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LSInputListImpl	TokenNameIdentifier	 LS Input List Impl
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
=	TokenNameEQUAL	
new	TokenNamenew	
LSInputListImpl	TokenNameIdentifier	 LS Input List Impl
(	TokenNameLPAREN	
new	TokenNamenew	
LSInput	TokenNameIdentifier	 LS Input
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The array to hold all data 	TokenNameCOMMENT_LINE	The array to hold all data 
private	TokenNameprivate	
final	TokenNamefinal	
LSInput	TokenNameIdentifier	 LS Input
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fArray	TokenNameIdentifier	 f Array
;	TokenNameSEMICOLON	
// Number of elements in this list 	TokenNameCOMMENT_LINE	Number of elements in this list 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
/** * Construct an LSInputList implementation * * @param array the data array * @param length the number of elements */	TokenNameCOMMENT_JAVADOC	 Construct an LSInputList implementation * @param array the data array @param length the number of elements 
public	TokenNamepublic	
LSInputListImpl	TokenNameIdentifier	 LS Input List Impl
(	TokenNameLPAREN	
LSInput	TokenNameIdentifier	 LS Input
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
/** * The number of <code>LSInput</code>s in the list. The range of valid * child object indices is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>LSInput</code>s in the list. The range of valid child object indices is 0 to <code>length-1</code> inclusive. 
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
/** * Returns the <code>index</code>th item in the collection or * <code>null</code> if <code>index</code> is greater than or equal to * the number of objects in the list. The index starts at 0. * @param index index into the collection. * @return The <code>LSInput</code> at the <code>index</code>th * position in the <code>LSInputList</code>, or <code>null</code> if * the index specified is not valid. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection or <code>null</code> if <code>index</code> is greater than or equal to the number of objects in the list. The index starts at 0. @param index index into the collection. @return The <code>LSInput</code> at the <code>index</code>th position in the <code>LSInputList</code>, or <code>null</code> if the index specified is not valid. 
public	TokenNamepublic	
LSInput	TokenNameIdentifier	 LS Input
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
/* * List methods */	TokenNameCOMMENT_BLOCK	 List methods 
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
}	TokenNameRBRACE	
// LSInputListImpl 	TokenNameCOMMENT_LINE	LSInputListImpl 
