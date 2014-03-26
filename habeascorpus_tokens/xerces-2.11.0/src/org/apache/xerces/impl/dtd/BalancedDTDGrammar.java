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
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolTable	TokenNameIdentifier	 Symbol Table
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
Augmentations	TokenNameIdentifier	 Augmentations
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
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
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
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * <p>A DTD grammar that produces balanced syntax trees.</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * @version $Id: BalancedDTDGrammar.java 965320 2010-07-18 23:25:54Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>A DTD grammar that produces balanced syntax trees.</p> * @xerces.internal * @author Michael Glavassevich, IBM @version $Id: BalancedDTDGrammar.java 965320 2010-07-18 23:25:54Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
BalancedDTDGrammar	TokenNameIdentifier	 Balanced DTD Grammar
extends	TokenNameextends	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Mixed. */	TokenNameCOMMENT_JAVADOC	 Mixed. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fMixed	TokenNameIdentifier	 f Mixed
;	TokenNameSEMICOLON	
/** Stack depth */	TokenNameCOMMENT_JAVADOC	 Stack depth 
private	TokenNameprivate	
int	TokenNameint	
fDepth	TokenNameIdentifier	 f Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Children content model operation stack. */	TokenNameCOMMENT_JAVADOC	 Children content model operation stack. 
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fOpStack	TokenNameIdentifier	 f Op Stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Holder for choice/sequence/leaf groups at each depth. */	TokenNameCOMMENT_JAVADOC	 Holder for choice/sequence/leaf groups at each depth. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
;	TokenNameSEMICOLON	
/** Sizes of the allocated portions of each int[] in fGroupIndexStack. */	TokenNameCOMMENT_JAVADOC	 Sizes of the allocated portions of each int[] in fGroupIndexStack. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
BalancedDTDGrammar	TokenNameIdentifier	 Balanced DTD Grammar
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// BalancedDTDGrammar(SymbolTable,XMLDTDDescription) 	TokenNameCOMMENT_LINE	BalancedDTDGrammar(SymbolTable,XMLDTDDescription) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of a content model. Depending on the type of the content * model, specific methods may be called between the call to the * startContentModel method and the call to the endContentModel method. * * @param elementName The name of the element. * @param augs Additional information that may include infoset * augmentations. * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of a content model. Depending on the type of the content model, specific methods may be called between the call to the startContentModel method and the call to the endContentModel method. * @param elementName The name of the element. @param augs Additional information that may include infoset augmentations. @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
fDepth	TokenNameIdentifier	 f Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
initializeContentModelStacks	TokenNameIdentifier	 initialize Content Model Stacks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startContentModel(String) 	TokenNameCOMMENT_LINE	startContentModel(String) 
/** * A start of either a mixed or children content model. A mixed * content model will immediately be followed by a call to the * <code>pcdata()</code> method. A children content model will * contain additional groups and/or elements. * * @param augs Additional information that may include infoset * augmentations. * @throws XNIException Thrown by handler to signal an error. * * @see #any * @see #empty */	TokenNameCOMMENT_JAVADOC	 A start of either a mixed or children content model. A mixed content model will immediately be followed by a call to the <code>pcdata()</code> method. A children content model will contain additional groups and/or elements. * @param augs Additional information that may include infoset augmentations. @throws XNIException Thrown by handler to signal an error. * @see #any @see #empty 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
startGroup	TokenNameIdentifier	 start Group
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
fDepth	TokenNameIdentifier	 f Depth
;	TokenNameSEMICOLON	
initializeContentModelStacks	TokenNameIdentifier	 initialize Content Model Stacks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fMixed	TokenNameIdentifier	 f Mixed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startGroup() 	TokenNameCOMMENT_LINE	startGroup() 
/** * The appearance of "#PCDATA" within a group signifying a * mixed content model. This method will be the first called * following the content model's <code>startGroup()</code>. * *@param augs Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #startGroup */	TokenNameCOMMENT_JAVADOC	 The appearance of "#PCDATA" within a group signifying a mixed content model. This method will be the first called following the content model's <code>startGroup()</code>. *@param augs Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #startGroup 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pcdata	TokenNameIdentifier	 pcdata
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
fMixed	TokenNameIdentifier	 f Mixed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pcdata() 	TokenNameCOMMENT_LINE	pcdata() 
/** * A referenced element in a mixed or children content model. * * @param elementName The name of the referenced element. * @param augs Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A referenced element in a mixed or children content model. * @param elementName The name of the referenced element. @param augs Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
element	TokenNameIdentifier	 element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
addToCurrentGroup	TokenNameIdentifier	 add To Current Group
(	TokenNameLPAREN	
addUniqueLeafNode	TokenNameIdentifier	 add Unique Leaf Node
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// element(String) 	TokenNameCOMMENT_LINE	element(String) 
/** * The separator between choices or sequences of a mixed or children * content model. * * @param separator The type of children separator. * @param augs Additional information that may include infoset * augmentations. * @throws XNIException Thrown by handler to signal an error. * * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_CHOICE * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_SEQUENCE */	TokenNameCOMMENT_JAVADOC	 The separator between choices or sequences of a mixed or children content model. * @param separator The type of children separator. @param augs Additional information that may include infoset augmentations. @throws XNIException Thrown by handler to signal an error. * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_CHOICE @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_SEQUENCE 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
separator	TokenNameIdentifier	 separator
(	TokenNameLPAREN	
short	TokenNameshort	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
==	TokenNameEQUAL_EQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
SEPARATOR_CHOICE	TokenNameIdentifier	 SEPARATOR  CHOICE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOpStack	TokenNameIdentifier	 f Op Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
==	TokenNameEQUAL_EQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
SEPARATOR_SEQUENCE	TokenNameIdentifier	 SEPARATOR  SEQUENCE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOpStack	TokenNameIdentifier	 f Op Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// separator(short) 	TokenNameCOMMENT_LINE	separator(short) 
/** * The occurrence count for a child in a children content model or * for the mixed content model group. * * @param occurrence The occurrence count for the last element * or group. * @param augs Additional information that may include infoset * augmentations. * @throws XNIException Thrown by handler to signal an error. * * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE */	TokenNameCOMMENT_JAVADOC	 The occurrence count for a child in a children content model or for the mixed content model group. * @param occurrence The occurrence count for the last element or group. @param augs Additional information that may include infoset augmentations. @throws XNIException Thrown by handler to signal an error. * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
occurrence	TokenNameIdentifier	 occurrence
(	TokenNameLPAREN	
short	TokenNameshort	
occurrence	TokenNameIdentifier	 occurrence
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fMixed	TokenNameIdentifier	 f Mixed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
occurrence	TokenNameIdentifier	 occurrence
==	TokenNameEQUAL_EQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
OCCURS_ZERO_OR_ONE	TokenNameIdentifier	 OCCURS  ZERO  OR  ONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
addContentSpecNode	TokenNameIdentifier	 add Content Spec Node
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_ONE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  ONE
,	TokenNameCOMMA	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
occurrence	TokenNameIdentifier	 occurrence
==	TokenNameEQUAL_EQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
OCCURS_ZERO_OR_MORE	TokenNameIdentifier	 OCCURS  ZERO  OR  MORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
addContentSpecNode	TokenNameIdentifier	 add Content Spec Node
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
,	TokenNameCOMMA	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
occurrence	TokenNameIdentifier	 occurrence
==	TokenNameEQUAL_EQUAL	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
.	TokenNameDOT	
OCCURS_ONE_OR_MORE	TokenNameIdentifier	 OCCURS  ONE  OR  MORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
addContentSpecNode	TokenNameIdentifier	 add Content Spec Node
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
,	TokenNameCOMMA	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// occurrence(short) 	TokenNameCOMMENT_LINE	occurrence(short) 
/** * The end of a group for mixed or children content models. * * @param augs Additional information that may include infoset * augmentations. * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a group for mixed or children content models. * @param augs Additional information that may include infoset augmentations. @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
endGroup	TokenNameIdentifier	 end Group
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
addContentSpecNodes	TokenNameIdentifier	 add Content Spec Nodes
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
addUniqueLeafNode	TokenNameIdentifier	 add Unique Leaf Node
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
fDepth	TokenNameIdentifier	 f Depth
;	TokenNameSEMICOLON	
addToCurrentGroup	TokenNameIdentifier	 add To Current Group
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endGroup() 	TokenNameCOMMENT_LINE	endGroup() 
/** * The end of the DTD. * * @param augs Additional information that may include infoset * augmentations. * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the DTD. * @param augs Additional information that may include infoset augmentations. @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOpStack	TokenNameIdentifier	 f Op Stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endDTD() 	TokenNameCOMMENT_LINE	endDTD() 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the content spec to the given element declaration. */	TokenNameCOMMENT_JAVADOC	 Adds the content spec to the given element declaration. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
addContentSpecToElement	TokenNameIdentifier	 add Content Spec To Element
(	TokenNameLPAREN	
XMLElementDecl	TokenNameIdentifier	 XML Element Decl
elementDecl	TokenNameIdentifier	 element Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
contentSpec	TokenNameIdentifier	 content Spec
=	TokenNameEQUAL	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setContentSpecIndex	TokenNameIdentifier	 set Content Spec Index
(	TokenNameLPAREN	
fCurrentElementIndex	TokenNameIdentifier	 f Current Element Index
,	TokenNameCOMMA	
contentSpec	TokenNameIdentifier	 content Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** * Creates a subtree from the leaf nodes at the current depth. */	TokenNameCOMMENT_JAVADOC	 Creates a subtree from the leaf nodes at the current depth. 
private	TokenNameprivate	
int	TokenNameint	
addContentSpecNodes	TokenNameIdentifier	 add Content Spec Nodes
(	TokenNameLPAREN	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
begin	TokenNameIdentifier	 begin
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
addContentSpecNode	TokenNameIdentifier	 add Content Spec Node
(	TokenNameLPAREN	
fOpStack	TokenNameIdentifier	 f Op Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
addContentSpecNodes	TokenNameIdentifier	 add Content Spec Nodes
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
addContentSpecNodes	TokenNameIdentifier	 add Content Spec Nodes
(	TokenNameLPAREN	
middle	TokenNameIdentifier	 middle
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addContentSpecNodes(int,int) 	TokenNameCOMMENT_LINE	addContentSpecNodes(int,int) 
/** * Initialize the stacks which temporarily hold content models. */	TokenNameCOMMENT_JAVADOC	 Initialize the stacks which temporarily hold content models. 
private	TokenNameprivate	
void	TokenNamevoid	
initializeContentModelStacks	TokenNameIdentifier	 initialize Content Model Stacks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fOpStack	TokenNameIdentifier	 f Op Stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOpStack	TokenNameIdentifier	 f Op Stack
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fDepth	TokenNameIdentifier	 f Depth
==	TokenNameEQUAL_EQUAL	
fOpStack	TokenNameIdentifier	 f Op Stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newOpStack	TokenNameIdentifier	 new Op Stack
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fOpStack	TokenNameIdentifier	 f Op Stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newOpStack	TokenNameIdentifier	 new Op Stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fDepth	TokenNameIdentifier	 f Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fOpStack	TokenNameIdentifier	 f Op Stack
=	TokenNameEQUAL	
newOpStack	TokenNameIdentifier	 new Op Stack
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newGroupIndexStack	TokenNameIdentifier	 new Group Index Stack
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newGroupIndexStack	TokenNameIdentifier	 new Group Index Stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fDepth	TokenNameIdentifier	 f Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
=	TokenNameEQUAL	
newGroupIndexStack	TokenNameIdentifier	 new Group Index Stack
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newGroupIndexStackLengths	TokenNameIdentifier	 new Group Index Stack Lengths
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newGroupIndexStackLengths	TokenNameIdentifier	 new Group Index Stack Lengths
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fDepth	TokenNameIdentifier	 f Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
=	TokenNameEQUAL	
newGroupIndexStackLengths	TokenNameIdentifier	 new Group Index Stack Lengths
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fOpStack	TokenNameIdentifier	 f Op Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// initializeContentModelStacks() 	TokenNameCOMMENT_LINE	initializeContentModelStacks() 
/** * Add XMLContentSpec to the current group. * * @param contentSpec handle to the XMLContentSpec to add to the current group */	TokenNameCOMMENT_JAVADOC	 Add XMLContentSpec to the current group. * @param contentSpec handle to the XMLContentSpec to add to the current group 
private	TokenNameprivate	
void	TokenNamevoid	
addToCurrentGroup	TokenNameIdentifier	 add To Current Group
(	TokenNameLPAREN	
int	TokenNameint	
contentSpec	TokenNameIdentifier	 content Spec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fGroupIndexStackSizes	TokenNameIdentifier	 f Group Index Stack Sizes
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentGroup	TokenNameIdentifier	 current Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newGroup	TokenNameIdentifier	 new Group
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newGroup	TokenNameIdentifier	 new Group
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
newGroup	TokenNameIdentifier	 new Group
;	TokenNameSEMICOLON	
fGroupIndexStack	TokenNameIdentifier	 f Group Index Stack
[	TokenNameLBRACKET	
fDepth	TokenNameIdentifier	 f Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentGroup	TokenNameIdentifier	 current Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentGroup	TokenNameIdentifier	 current Group
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
contentSpec	TokenNameIdentifier	 content Spec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addToCurrentGroup(int) 	TokenNameCOMMENT_LINE	addToCurrentGroup(int) 
}	TokenNameRBRACE	
// class BalancedDTDGrammar 	TokenNameCOMMENT_LINE	class BalancedDTDGrammar 
