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
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
models	TokenNameIdentifier	 models
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
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * MixedContentModel is a derivative of the abstract content model base * class that handles the special case of mixed model elements. If an element * is mixed model, it has PCDATA as its first possible content, followed * by an alternation of the possible children. The children cannot have any * numeration or order, so it must look like this: * <pre> * &lt;!ELEMENT Foo ((#PCDATA|a|b|c|)*)&gt; * </pre> * So, all we have to do is to keep an array of the possible children and * validate by just looking up each child being validated by looking it up * in the list. * * @xerces.internal * * @version $Id: MixedContentModel.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 MixedContentModel is a derivative of the abstract content model base class that handles the special case of mixed model elements. If an element is mixed model, it has PCDATA as its first possible content, followed by an alternation of the possible children. The children cannot have any numeration or order, so it must look like this: <pre> &lt;!ELEMENT Foo ((#PCDATA|a|b|c|)*)&gt; </pre> So, all we have to do is to keep an array of the possible children and validate by just looking up each child being validated by looking it up in the list. * @xerces.internal * @version $Id: MixedContentModel.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
MixedContentModel	TokenNameIdentifier	 Mixed Content Model
implements	TokenNameimplements	
ContentModelValidator	TokenNameIdentifier	 Content Model Validator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The count of possible children that we have to deal with. */	TokenNameCOMMENT_JAVADOC	 The count of possible children that we have to deal with. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
/** The list of possible children that we have to accept. */	TokenNameCOMMENT_JAVADOC	 The list of possible children that we have to accept. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The type of the children to support ANY. */	TokenNameCOMMENT_JAVADOC	 The type of the children to support ANY. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fChildrenType	TokenNameIdentifier	 f Children Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/* this is the EquivClassComparator object */	TokenNameCOMMENT_BLOCK	 this is the EquivClassComparator object 
//private EquivClassComparator comparator = null; 	TokenNameCOMMENT_LINE	private EquivClassComparator comparator = null; 
/** * True if mixed content model is ordered. DTD mixed content models * are <em>always</em> unordered. */	TokenNameCOMMENT_JAVADOC	 True if mixed content model is ordered. DTD mixed content models are <em>always</em> unordered. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fOrdered	TokenNameIdentifier	 f Ordered
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a mixed content model. * * @param children The list of allowed children. * @param type The list of the types of the children. * @param offset The start offset position in the children. * @param length The child count. * @param ordered True if content must be ordered. */	TokenNameCOMMENT_JAVADOC	 Constructs a mixed content model. * @param children The list of allowed children. @param type The list of the types of the children. @param offset The start offset position in the children. @param length The child count. @param ordered True if content must be ordered. 
public	TokenNamepublic	
MixedContentModel	TokenNameIdentifier	 Mixed Content Model
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make our own copy now, which is exactly the right size 	TokenNameCOMMENT_LINE	Make our own copy now, which is exactly the right size 
fCount	TokenNameIdentifier	 f Count
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
fChildren	TokenNameIdentifier	 f Children
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
fCount	TokenNameIdentifier	 f Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fChildrenType	TokenNameIdentifier	 f Children Type
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fCount	TokenNameIdentifier	 f Count
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
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fChildrenType	TokenNameIdentifier	 f Children Type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fOrdered	TokenNameIdentifier	 f Ordered
=	TokenNameEQUAL	
ordered	TokenNameIdentifier	 ordered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// ContentModelValidator methods 	TokenNameCOMMENT_LINE	ContentModelValidator methods 
// 	TokenNameCOMMENT_LINE	 
/** * Check that the specified content is valid according to this * content model. This method can also be called to do 'what if' * testing of content models just to see if they would be valid. * <p> * A value of -1 in the children array indicates a PCDATA node. All other * indexes will be positive and represent child elements. The count can be * zero, since some elements have the EMPTY content model and that must be * confirmed. * * @param children The children of this element. Each integer is an index within * the <code>StringPool</code> of the child element name. An index * of -1 is used to indicate an occurrence of non-whitespace character * data. * @param offset Offset into the array where the children starts. * @param length The number of entries in the <code>children</code> array. * * @return The value -1 if fully valid, else the 0 based index of the child * that first failed. If the value returned is equal to the number * of children, then the specified children are valid but additional * content is required to reach a valid ending state. * */	TokenNameCOMMENT_JAVADOC	 Check that the specified content is valid according to this content model. This method can also be called to do 'what if' testing of content models just to see if they would be valid. <p> A value of -1 in the children array indicates a PCDATA node. All other indexes will be positive and represent child elements. The count can be zero, since some elements have the EMPTY content model and that must be confirmed. * @param children The children of this element. Each integer is an index within the <code>StringPool</code> of the child element name. An index of -1 is used to indicate an occurrence of non-whitespace character data. @param offset Offset into the array where the children starts. @param length The number of entries in the <code>children</code> array. * @return The value -1 if fully valid, else the 0 based index of the child that first failed. If the value returned is equal to the number of children, then the specified children are valid but additional content is required to reach a valid ending state. 
public	TokenNamepublic	
int	TokenNameint	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// must match order 	TokenNameCOMMENT_LINE	must match order 
if	TokenNameif	
(	TokenNameLPAREN	
fOrdered	TokenNameIdentifier	 f Ordered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
inIndex	TokenNameIdentifier	 in Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
outIndex	TokenNameIdentifier	 out Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
outIndex	TokenNameIdentifier	 out Index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore mixed text 	TokenNameCOMMENT_LINE	ignore mixed text 
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
curChild	TokenNameIdentifier	 cur Child
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curChild	TokenNameIdentifier	 cur Child
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// element must match 	TokenNameCOMMENT_LINE	element must match 
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
fChildrenType	TokenNameIdentifier	 f Children Type
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outIndex	TokenNameIdentifier	 out Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY	TokenNameIdentifier	 CONTENTSPECNODE  ANY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outIndex	TokenNameIdentifier	 out Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_LOCAL	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outIndex	TokenNameIdentifier	 out Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_OTHER	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outIndex	TokenNameIdentifier	 out Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// advance index 	TokenNameCOMMENT_LINE	advance index 
inIndex	TokenNameIdentifier	 in Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// can appear in any order 	TokenNameCOMMENT_LINE	can appear in any order 
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
outIndex	TokenNameIdentifier	 out Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
outIndex	TokenNameIdentifier	 out Index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the current child out of the source index 	TokenNameCOMMENT_LINE	Get the current child out of the source index 
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
curChild	TokenNameIdentifier	 cur Child
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// If its PCDATA, then we just accept that 	TokenNameCOMMENT_LINE	If its PCDATA, then we just accept that 
if	TokenNameif	
(	TokenNameLPAREN	
curChild	TokenNameIdentifier	 cur Child
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// And try to find it in our list 	TokenNameCOMMENT_LINE	And try to find it in our list 
int	TokenNameint	
inIndex	TokenNameIdentifier	 in Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
inIndex	TokenNameIdentifier	 in Index
<	TokenNameLESS	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
inIndex	TokenNameIdentifier	 in Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
fChildrenType	TokenNameIdentifier	 f Children Type
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curChild	TokenNameIdentifier	 cur Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
==	TokenNameEQUAL_EQUAL	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY	TokenNameIdentifier	 CONTENTSPECNODE  ANY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_LOCAL	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_OTHER	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fChildren	TokenNameIdentifier	 f Children
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// REVISIT: What about checking for multiple ANY matches? 	TokenNameCOMMENT_LINE	REVISIT: What about checking for multiple ANY matches? 
// The content model ambiguity *could* be checked 	TokenNameCOMMENT_LINE	The content model ambiguity *could* be checked 
// by the caller before constructing the mixed 	TokenNameCOMMENT_LINE	by the caller before constructing the mixed 
// content model. 	TokenNameCOMMENT_LINE	content model. 
}	TokenNameRBRACE	
// We did not find this one, so the validation failed 	TokenNameCOMMENT_LINE	We did not find this one, so the validation failed 
if	TokenNameif	
(	TokenNameLPAREN	
inIndex	TokenNameIdentifier	 in Index
==	TokenNameEQUAL_EQUAL	
fCount	TokenNameIdentifier	 f Count
)	TokenNameRPAREN	
return	TokenNamereturn	
outIndex	TokenNameIdentifier	 out Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Everything seems to be in order, so return success 	TokenNameCOMMENT_LINE	Everything seems to be in order, so return success 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// validate 	TokenNameCOMMENT_LINE	validate 
}	TokenNameRBRACE	
// class MixedContentModel 	TokenNameCOMMENT_LINE	class MixedContentModel 
