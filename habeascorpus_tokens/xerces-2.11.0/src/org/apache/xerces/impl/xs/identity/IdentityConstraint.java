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
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
StringListImpl	TokenNameIdentifier	 String List Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
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
StringList	TokenNameIdentifier	 String List
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
XSConstants	TokenNameIdentifier	 XS Constants
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
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
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
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
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
/** * Base class of Schema identity constraint. * * @xerces.internal * * @author Andy Clark, IBM * @version $Id: IdentityConstraint.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Base class of Schema identity constraint. * @xerces.internal * @author Andy Clark, IBM @version $Id: IdentityConstraint.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
implements	TokenNameimplements	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** type */	TokenNameCOMMENT_JAVADOC	 type 
protected	TokenNameprotected	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** target namespace */	TokenNameCOMMENT_JAVADOC	 target namespace 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fNamespace	TokenNameIdentifier	 f Namespace
;	TokenNameSEMICOLON	
/** Identity constraint name. */	TokenNameCOMMENT_JAVADOC	 Identity constraint name. 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fIdentityConstraintName	TokenNameIdentifier	 f Identity Constraint Name
;	TokenNameSEMICOLON	
/** name of owning element */	TokenNameCOMMENT_JAVADOC	 name of owning element 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fElementName	TokenNameIdentifier	 f Element Name
;	TokenNameSEMICOLON	
/** Selector. */	TokenNameCOMMENT_JAVADOC	 Selector. 
protected	TokenNameprotected	
Selector	TokenNameIdentifier	 Selector
fSelector	TokenNameIdentifier	 f Selector
;	TokenNameSEMICOLON	
/** Field count. */	TokenNameCOMMENT_JAVADOC	 Field count. 
protected	TokenNameprotected	
int	TokenNameint	
fFieldCount	TokenNameIdentifier	 f Field Count
;	TokenNameSEMICOLON	
/** Fields. */	TokenNameCOMMENT_JAVADOC	 Fields. 
protected	TokenNameprotected	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fFields	TokenNameIdentifier	 f Fields
;	TokenNameSEMICOLON	
// optional annotations 	TokenNameCOMMENT_LINE	optional annotations 
protected	TokenNameprotected	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// number of annotations in this identity constraint 	TokenNameCOMMENT_LINE	number of annotations in this identity constraint 
protected	TokenNameprotected	
int	TokenNameint	
fNumAnnotations	TokenNameIdentifier	 f Num Annotations
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
protected	TokenNameprotected	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
identityConstraintName	TokenNameIdentifier	 identity Constraint Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
fIdentityConstraintName	TokenNameIdentifier	 f Identity Constraint Name
=	TokenNameEQUAL	
identityConstraintName	TokenNameIdentifier	 identity Constraint Name
;	TokenNameSEMICOLON	
fElementName	TokenNameIdentifier	 f Element Name
=	TokenNameEQUAL	
elemName	TokenNameIdentifier	 elem Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String) 	TokenNameCOMMENT_LINE	<init>(String,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the identity constraint name. */	TokenNameCOMMENT_JAVADOC	 Returns the identity constraint name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIdentityConstraintName	TokenNameIdentifier	 get Identity Constraint Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIdentityConstraintName	TokenNameIdentifier	 f Identity Constraint Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIdentityConstraintName():String 	TokenNameCOMMENT_LINE	getIdentityConstraintName():String 
/** Sets the selector. */	TokenNameCOMMENT_JAVADOC	 Sets the selector. 
public	TokenNamepublic	
void	TokenNamevoid	
setSelector	TokenNameIdentifier	 set Selector
(	TokenNameLPAREN	
Selector	TokenNameIdentifier	 Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSelector	TokenNameIdentifier	 f Selector
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setSelector(Selector) 	TokenNameCOMMENT_LINE	setSelector(Selector) 
/** Returns the selector. */	TokenNameCOMMENT_JAVADOC	 Returns the selector. 
public	TokenNamepublic	
Selector	TokenNameIdentifier	 Selector
getSelector	TokenNameIdentifier	 get Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSelector	TokenNameIdentifier	 f Selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSelector():Selector 	TokenNameCOMMENT_LINE	getSelector():Selector 
/** Adds a field. */	TokenNameCOMMENT_JAVADOC	 Adds a field. 
public	TokenNamepublic	
void	TokenNamevoid	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fFields	TokenNameIdentifier	 f Fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fFields	TokenNameIdentifier	 f Fields
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fFieldCount	TokenNameIdentifier	 f Field Count
==	TokenNameEQUAL_EQUAL	
fFields	TokenNameIdentifier	 f Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
fFields	TokenNameIdentifier	 f Fields
=	TokenNameEQUAL	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
fFields	TokenNameIdentifier	 f Fields
,	TokenNameCOMMA	
fFieldCount	TokenNameIdentifier	 f Field Count
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fFields	TokenNameIdentifier	 f Fields
[	TokenNameLBRACKET	
fFieldCount	TokenNameIdentifier	 f Field Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addField(Field) 	TokenNameCOMMENT_LINE	addField(Field) 
/** Returns the field count. */	TokenNameCOMMENT_JAVADOC	 Returns the field count. 
public	TokenNamepublic	
int	TokenNameint	
getFieldCount	TokenNameIdentifier	 get Field Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fFieldCount	TokenNameIdentifier	 f Field Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFieldCount():int 	TokenNameCOMMENT_LINE	getFieldCount():int 
/** Returns the field at the specified index. */	TokenNameCOMMENT_JAVADOC	 Returns the field at the specified index. 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
getFieldAt	TokenNameIdentifier	 get Field At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fFields	TokenNameIdentifier	 f Fields
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFieldAt(int):Field 	TokenNameCOMMENT_LINE	getFieldAt(int):Field 
// get the name of the owning element 	TokenNameCOMMENT_LINE	get the name of the owning element 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getElementName	TokenNameIdentifier	 get Element Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fElementName	TokenNameIdentifier	 f Element Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getElementName(): String 	TokenNameCOMMENT_LINE	getElementName(): String 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index1	TokenNameIdentifier	 index1
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index1	TokenNameIdentifier	 index1
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index1	TokenNameIdentifier	 index1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
// equals: returns true if and only if the String 	TokenNameCOMMENT_LINE	equals: returns true if and only if the String 
// representations of all members of both objects (except for 	TokenNameCOMMENT_LINE	representations of all members of both objects (except for 
// the elenemtName field) are equal. 	TokenNameCOMMENT_LINE	the elenemtName field) are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
areEqual	TokenNameIdentifier	 are Equal
=	TokenNameEQUAL	
fIdentityConstraintName	TokenNameIdentifier	 f Identity Constraint Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
fIdentityConstraintName	TokenNameIdentifier	 f Identity Constraint Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
areEqual	TokenNameIdentifier	 are Equal
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
areEqual	TokenNameIdentifier	 are Equal
=	TokenNameEQUAL	
fSelector	TokenNameIdentifier	 f Selector
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
fSelector	TokenNameIdentifier	 f Selector
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
areEqual	TokenNameIdentifier	 are Equal
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
areEqual	TokenNameIdentifier	 are Equal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fFieldCount	TokenNameIdentifier	 f Field Count
==	TokenNameEQUAL_EQUAL	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
fFieldCount	TokenNameIdentifier	 f Field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
areEqual	TokenNameIdentifier	 are Equal
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
fFieldCount	TokenNameIdentifier	 f Field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fFields	TokenNameIdentifier	 f Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
fFields	TokenNameIdentifier	 f Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// equals 	TokenNameCOMMENT_LINE	equals 
static	TokenNamestatic	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldArray	TokenNameIdentifier	 old Array
,	TokenNameCOMMA	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldArray	TokenNameIdentifier	 old Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
oldArray	TokenNameIdentifier	 old Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type of the object, i.e ELEMENT_DECLARATION. */	TokenNameCOMMENT_JAVADOC	 Get the type of the object, i.e ELEMENT_DECLARATION. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
IDENTITY_CONSTRAINT	TokenNameIdentifier	 IDENTITY  CONSTRAINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <code>name</code> of this <code>XSObject</code> depending on the * <code>XSObject</code> type. */	TokenNameCOMMENT_JAVADOC	 The <code>name</code> of this <code>XSObject</code> depending on the <code>XSObject</code> type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIdentityConstraintName	TokenNameIdentifier	 f Identity Constraint Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace URI of this node, or <code>null</code> if it is * unspecified. defines how a namespace URI is attached to schema * components. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of this node, or <code>null</code> if it is unspecified. defines how a namespace URI is attached to schema components. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {identity-constraint category} One of key, keyref or unique. */	TokenNameCOMMENT_JAVADOC	 {identity-constraint category} One of key, keyref or unique. 
public	TokenNamepublic	
short	TokenNameshort	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {selector} A restricted XPath ([XPath]) expression */	TokenNameCOMMENT_JAVADOC	 {selector} A restricted XPath ([XPath]) expression 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSelectorStr	TokenNameIdentifier	 get Selector Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fSelector	TokenNameIdentifier	 f Selector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSelector	TokenNameIdentifier	 f Selector
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {fields} A non-empty list of restricted XPath ([XPath]) expressions. */	TokenNameCOMMENT_JAVADOC	 {fields} A non-empty list of restricted XPath ([XPath]) expressions. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getFieldStrs	TokenNameIdentifier	 get Field Strs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strs	TokenNameIdentifier	 strs
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fFieldCount	TokenNameIdentifier	 f Field Count
]	TokenNameRBRACKET	
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
fFieldCount	TokenNameIdentifier	 f Field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
strs	TokenNameIdentifier	 strs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fFields	TokenNameIdentifier	 f Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StringListImpl	TokenNameIdentifier	 String List Impl
(	TokenNameLPAREN	
strs	TokenNameIdentifier	 strs
,	TokenNameCOMMA	
fFieldCount	TokenNameIdentifier	 f Field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {referenced key} Required if {identity-constraint category} is keyref, * forbidden otherwise. An identity-constraint definition with * {identity-constraint category} equal to key or unique. */	TokenNameCOMMENT_JAVADOC	 {referenced key} Required if {identity-constraint category} is keyref, forbidden otherwise. An identity-constraint definition with {identity-constraint category} equal to key or unique. 
public	TokenNamepublic	
XSIDCDefinition	TokenNameIdentifier	 XSIDC Definition
getRefKey	TokenNameIdentifier	 get Ref Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optional. Annotation. */	TokenNameCOMMENT_JAVADOC	 Optional. Annotation. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
,	TokenNameCOMMA	
fNumAnnotations	TokenNameIdentifier	 f Num Annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xs.XSObject#getNamespaceItem() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xs.XSObject#getNamespaceItem() 
public	TokenNamepublic	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
getNamespaceItem	TokenNameIdentifier	 get Namespace Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: implement 	TokenNameCOMMENT_LINE	REVISIT: implement 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAnnotation	TokenNameIdentifier	 add Annotation
(	TokenNameLPAREN	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
annotation	TokenNameIdentifier	 annotation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
annotation	TokenNameIdentifier	 annotation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
new	TokenNamenew	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fNumAnnotations	TokenNameIdentifier	 f Num Annotations
==	TokenNameEQUAL_EQUAL	
fAnnotations	TokenNameIdentifier	 f Annotations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
[	TokenNameLBRACKET	
fNumAnnotations	TokenNameIdentifier	 f Num Annotations
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNumAnnotations	TokenNameIdentifier	 f Num Annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAnnotations	TokenNameIdentifier	 f Annotations
[	TokenNameLBRACKET	
fNumAnnotations	TokenNameIdentifier	 f Num Annotations
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
annotation	TokenNameIdentifier	 annotation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class IdentityConstraint 	TokenNameCOMMENT_LINE	class IdentityConstraint 
