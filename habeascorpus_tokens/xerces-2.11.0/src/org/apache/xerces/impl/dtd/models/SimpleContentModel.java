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
/** * SimpleContentModel is a derivative of the abstract content model base * class that handles a small set of simple content models that are just * way overkill to give the DFA treatment. * <p> * This class handles the following scenarios: * <ul> * <li> a * <li> a? * <li> a* * <li> a+ * <li> a,b * <li> a|b * </ul> * <p> * These all involve a unary operation with one element type, or a binary * operation with two elements. These are very simple and can be checked * in a simple way without a DFA and without the overhead of setting up a * DFA for such a simple check. * * @xerces.internal * * @version $Id: SimpleContentModel.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 SimpleContentModel is a derivative of the abstract content model base class that handles a small set of simple content models that are just way overkill to give the DFA treatment. <p> This class handles the following scenarios: <ul> <li> a <li> a? <li> a* <li> a+ <li> a,b <li> a|b </ul> <p> These all involve a unary operation with one element type, or a binary operation with two elements. These are very simple and can be checked in a simple way without a DFA and without the overhead of setting up a DFA for such a simple check. * @xerces.internal * @version $Id: SimpleContentModel.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SimpleContentModel	TokenNameIdentifier	 Simple Content Model
implements	TokenNameimplements	
ContentModelValidator	TokenNameIdentifier	 Content Model Validator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** CHOICE */	TokenNameCOMMENT_JAVADOC	 CHOICE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CHOICE	TokenNameIdentifier	 CHOICE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** SEQUENCE */	TokenNameCOMMENT_JAVADOC	 SEQUENCE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SEQUENCE	TokenNameIdentifier	 SEQUENCE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * The element decl pool indices of the first (and optional second) * child node. The operation code tells us whether the second child * is used or not. */	TokenNameCOMMENT_JAVADOC	 The element decl pool indices of the first (and optional second) child node. The operation code tells us whether the second child is used or not. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fFirstChild	TokenNameIdentifier	 f First Child
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The element decl pool indices of the first (and optional second) * child node. The operation code tells us whether the second child * is used or not. */	TokenNameCOMMENT_JAVADOC	 The element decl pool indices of the first (and optional second) child node. The operation code tells us whether the second child is used or not. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fSecondChild	TokenNameIdentifier	 f Second Child
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The operation that this object represents. Since this class only * does simple contents, there is only ever a single operation * involved (i.e. the children of the operation are always one or * two leafs.) This is one of the XMLDTDParams.CONTENTSPECNODE_XXX values. */	TokenNameCOMMENT_JAVADOC	 The operation that this object represents. Since this class only does simple contents, there is only ever a single operation involved (i.e. the children of the operation are always one or two leafs.) This is one of the XMLDTDParams.CONTENTSPECNODE_XXX values. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
fOperator	TokenNameIdentifier	 f Operator
;	TokenNameSEMICOLON	
/* this is the EquivClassComparator object */	TokenNameCOMMENT_BLOCK	 this is the EquivClassComparator object 
//private EquivClassComparator comparator = null; 	TokenNameCOMMENT_LINE	private EquivClassComparator comparator = null; 
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a simple content model. * * @param operator The content model operator. * @param firstChild qualified name of the first child * @param secondChild qualified name of the second child * */	TokenNameCOMMENT_JAVADOC	 Constructs a simple content model. * @param operator The content model operator. @param firstChild qualified name of the first child @param secondChild qualified name of the second child 
public	TokenNamepublic	
SimpleContentModel	TokenNameIdentifier	 Simple Content Model
(	TokenNameLPAREN	
short	TokenNameshort	
operator	TokenNameIdentifier	 operator
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
firstChild	TokenNameIdentifier	 first Child
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
secondChild	TokenNameIdentifier	 second Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Store away the children and operation. This is all we need to 	TokenNameCOMMENT_LINE	Store away the children and operation. This is all we need to 
// do the content model check. 	TokenNameCOMMENT_LINE	do the content model check. 
// 	TokenNameCOMMENT_LINE	 
// The operation is one of the ContentSpecNode.NODE_XXX values! 	TokenNameCOMMENT_LINE	The operation is one of the ContentSpecNode.NODE_XXX values! 
// 	TokenNameCOMMENT_LINE	 
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
secondChild	TokenNameIdentifier	 second Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSecondChild	TokenNameIdentifier	 f Second Child
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
secondChild	TokenNameIdentifier	 second Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fSecondChild	TokenNameIdentifier	 f Second Child
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fOperator	TokenNameIdentifier	 f Operator
=	TokenNameEQUAL	
operator	TokenNameIdentifier	 operator
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
// 	TokenNameCOMMENT_LINE	 
// According to the type of operation, we do the correct type of 	TokenNameCOMMENT_LINE	According to the type of operation, we do the correct type of 
// content check. 	TokenNameCOMMENT_LINE	content check. 
// 	TokenNameCOMMENT_LINE	 
switch	TokenNameswitch	
(	TokenNameLPAREN	
fOperator	TokenNameIdentifier	 f Operator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
:	TokenNameCOLON	
// If there is not a child, then report an error at index 0 	TokenNameCOMMENT_LINE	If there is not a child, then report an error at index 0 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If the 0th child is not the right kind, report an error at 0 	TokenNameCOMMENT_LINE	If the 0th child is not the right kind, report an error at 0 
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If more than one child, report an error at index 1 	TokenNameCOMMENT_LINE	If more than one child, report an error at index 1 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_ONE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  ONE
:	TokenNameCOLON	
// 	TokenNameCOMMENT_LINE	 
// If there is one child, make sure its the right type. If not, 	TokenNameCOMMENT_LINE	If there is one child, make sure its the right type. If not, 
// then its an error at index 0. 	TokenNameCOMMENT_LINE	then its an error at index 0. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// If the child count is greater than one, then obviously 	TokenNameCOMMENT_LINE	If the child count is greater than one, then obviously 
// bad, so report an error at index 1. 	TokenNameCOMMENT_LINE	bad, so report an error at index 1. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
:	TokenNameCOLON	
// 	TokenNameCOMMENT_LINE	 
// If the child count is zero, that's fine. If its more than 	TokenNameCOMMENT_LINE	If the child count is zero, that's fine. If its more than 
// zero, then make sure that all children are of the element 	TokenNameCOMMENT_LINE	zero, then make sure that all children are of the element 
// type that we stored. If not, report the index of the first 	TokenNameCOMMENT_LINE	type that we stored. If not, report the index of the first 
// failed one. 	TokenNameCOMMENT_LINE	failed one. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
:	TokenNameCOLON	
// 	TokenNameCOMMENT_LINE	 
// If the child count is zero, that's an error so report 	TokenNameCOMMENT_LINE	If the child count is zero, that's an error so report 
// an error at index 0. 	TokenNameCOMMENT_LINE	an error at index 0. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Otherwise we have to check them all to make sure that they 	TokenNameCOMMENT_LINE	Otherwise we have to check them all to make sure that they 
// are of the correct child type. If not, then report the index 	TokenNameCOMMENT_LINE	are of the correct child type. If not, then report the index 
// of the first one that is not. 	TokenNameCOMMENT_LINE	of the first one that is not. 
// 	TokenNameCOMMENT_LINE	 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
:	TokenNameCOLON	
// 	TokenNameCOMMENT_LINE	 
// There must be one and only one child, so if the element count 	TokenNameCOMMENT_LINE	There must be one and only one child, so if the element count 
// is zero, return an error at index 0. 	TokenNameCOMMENT_LINE	is zero, return an error at index 0. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If the zeroth element isn't one of our choices, error at 0 	TokenNameCOMMENT_LINE	If the zeroth element isn't one of our choices, error at 0 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fSecondChild	TokenNameIdentifier	 f Second Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If there is more than one element, then an error at 1 	TokenNameCOMMENT_LINE	If there is more than one element, then an error at 1 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
:	TokenNameCOLON	
// 	TokenNameCOMMENT_LINE	 
// There must be two children and they must be the two values 	TokenNameCOMMENT_LINE	There must be two children and they must be the two values 
// we stored, in the stored order. 	TokenNameCOMMENT_LINE	we stored, in the stored order. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fFirstChild	TokenNameIdentifier	 f First Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
fSecondChild	TokenNameIdentifier	 f Second Child
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_CST"	TokenNameStringLiteral	ImplementationMessages.VAL_CST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We survived, so return success status 	TokenNameCOMMENT_LINE	We survived, so return success status 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// validate 	TokenNameCOMMENT_LINE	validate 
}	TokenNameRBRACE	
// class SimpleContentModel 	TokenNameCOMMENT_LINE	class SimpleContentModel 
