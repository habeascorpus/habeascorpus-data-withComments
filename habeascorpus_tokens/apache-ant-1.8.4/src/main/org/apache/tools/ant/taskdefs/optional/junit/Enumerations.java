/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
/** * A couple of methods related to enumerations that might be useful. * This class should probably disappear once the required JDK is set to 1.2 * instead of 1.1. * */	TokenNameCOMMENT_JAVADOC	 A couple of methods related to enumerations that might be useful. This class should probably disappear once the required JDK is set to 1.2 instead of 1.1. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Enumerations	TokenNameIdentifier	 Enumerations
{	TokenNameLBRACE	
private	TokenNameprivate	
Enumerations	TokenNameIdentifier	 Enumerations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * creates an enumeration from an array of objects. * @param array the array of object to enumerate. * @return the enumeration over the array of objects. */	TokenNameCOMMENT_JAVADOC	 creates an enumeration from an array of objects. @param array the array of object to enumerate. @return the enumeration over the array of objects. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
fromArray	TokenNameIdentifier	 from Array
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * creates an enumeration from an array of enumeration. The created enumeration * will sequentially enumerate over all elements of each enumeration and skip * <tt>null</tt> enumeration elements in the array. * @param enums the array of enumerations. * @return the enumeration over the array of enumerations. */	TokenNameCOMMENT_JAVADOC	 creates an enumeration from an array of enumeration. The created enumeration will sequentially enumerate over all elements of each enumeration and skip <tt>null</tt> enumeration elements in the array. @param enums the array of enumerations. @return the enumeration over the array of enumerations. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
fromCompound	TokenNameIdentifier	 from Compound
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enums	TokenNameIdentifier	 enums
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompoundEnumeration	TokenNameIdentifier	 Compound Enumeration
(	TokenNameLPAREN	
enums	TokenNameIdentifier	 enums
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Convenient enumeration over an array of objects. */	TokenNameCOMMENT_JAVADOC	 Convenient enumeration over an array of objects. 
class	TokenNameclass	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
/** object array */	TokenNameCOMMENT_JAVADOC	 object array 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
/** current index */	TokenNameCOMMENT_JAVADOC	 current index 
private	TokenNameprivate	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
/** * Initialize a new enumeration that wraps an array. * @param array the array of object to enumerate. */	TokenNameCOMMENT_JAVADOC	 Initialize a new enumeration that wraps an array. @param array the array of object to enumerate. 
public	TokenNamepublic	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this enumeration contains more elements. * * @return <code>true</code> if and only if this enumeration object * contains at least one more element to provide; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if this enumeration contains more elements. * @return <code>true</code> if and only if this enumeration object contains at least one more element to provide; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next element of this enumeration if this enumeration * object has at least one more element to provide. * * @return the next element of this enumeration. * @throws NoSuchElementException if no more elements exist. */	TokenNameCOMMENT_JAVADOC	 Returns the next element of this enumeration if this enumeration object has at least one more element to provide. * @return the next element of this enumeration. @throws NoSuchElementException if no more elements exist. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Convenient enumeration over an array of enumeration. For example: * <pre> * Enumeration e1 = v1.elements(); * while (e1.hasMoreElements()) { * // do something * } * Enumeration e2 = v2.elements(); * while (e2.hasMoreElements()) { * // do the same thing * } * </pre> * can be written as: * <pre> * Enumeration[] enums = { v1.elements(), v2.elements() }; * Enumeration e = Enumerations.fromCompound(enums); * while (e.hasMoreElements()) { * // do something * } * </pre> * Note that the enumeration will skip null elements in the array. The following is * thus possible: * <pre> * Enumeration[] enums = { v1.elements(), null, v2.elements() }; // a null enumeration in the array * Enumeration e = Enumerations.fromCompound(enums); * while (e.hasMoreElements()) { * // do something * } * </pre> */	TokenNameCOMMENT_JAVADOC	 Convenient enumeration over an array of enumeration. For example: <pre> Enumeration e1 = v1.elements(); while (e1.hasMoreElements()) { // do something } Enumeration e2 = v2.elements(); while (e2.hasMoreElements()) { // do the same thing } </pre> can be written as: <pre> Enumeration[] enums = { v1.elements(), v2.elements() }; Enumeration e = Enumerations.fromCompound(enums); while (e.hasMoreElements()) { // do something } </pre> Note that the enumeration will skip null elements in the array. The following is thus possible: <pre> Enumeration[] enums = { v1.elements(), null, v2.elements() }; // a null enumeration in the array Enumeration e = Enumerations.fromCompound(enums); while (e.hasMoreElements()) { // do something } </pre> 
class	TokenNameclass	
CompoundEnumeration	TokenNameIdentifier	 Compound Enumeration
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
/** enumeration array */	TokenNameCOMMENT_JAVADOC	 enumeration array 
private	TokenNameprivate	
Enumeration	TokenNameIdentifier	 Enumeration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumArray	TokenNameIdentifier	 enum Array
;	TokenNameSEMICOLON	
/** index in the enums array */	TokenNameCOMMENT_JAVADOC	 index in the enums array 
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompoundEnumeration	TokenNameIdentifier	 Compound Enumeration
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumarray	TokenNameIdentifier	 enumarray
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enumArray	TokenNameIdentifier	 enum Array
=	TokenNameEQUAL	
enumarray	TokenNameIdentifier	 enumarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this enumeration contains more elements. * * @return <code>true</code> if and only if this enumeration object * contains at least one more element to provide; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if this enumeration contains more elements. * @return <code>true</code> if and only if this enumeration object contains at least one more element to provide; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
enumArray	TokenNameIdentifier	 enum Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enumArray	TokenNameIdentifier	 enum Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
enumArray	TokenNameIdentifier	 enum Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next element of this enumeration if this enumeration * object has at least one more element to provide. * * @return the next element of this enumeration. * @throws NoSuchElementException if no more elements exist. */	TokenNameCOMMENT_JAVADOC	 Returns the next element of this enumeration if this enumeration object has at least one more element to provide. * @return the next element of this enumeration. @throws NoSuchElementException if no more elements exist. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enumArray	TokenNameIdentifier	 enum Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
