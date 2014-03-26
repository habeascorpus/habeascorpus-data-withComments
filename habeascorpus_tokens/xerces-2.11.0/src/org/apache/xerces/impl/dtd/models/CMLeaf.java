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
/** * Content model leaf node. * * @xerces.internal * * @version $Id: CMLeaf.java 572057 2007-09-02 18:03:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Content model leaf node. * @xerces.internal * @version $Id: CMLeaf.java 572057 2007-09-02 18:03:20Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CMLeaf	TokenNameIdentifier	 CM Leaf
extends	TokenNameextends	
CMNode	TokenNameIdentifier	 CM Node
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** This is the element that this leaf represents. */	TokenNameCOMMENT_JAVADOC	 This is the element that this leaf represents. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fElement	TokenNameIdentifier	 f Element
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Part of the algorithm to convert a regex directly to a DFA * numbers each leaf sequentially. If its -1, that means its an * epsilon node. Zero and greater are non-epsilon positions. */	TokenNameCOMMENT_JAVADOC	 Part of the algorithm to convert a regex directly to a DFA numbers each leaf sequentially. If its -1, that means its an epsilon node. Zero and greater are non-epsilon positions. 
private	TokenNameprivate	
int	TokenNameint	
fPosition	TokenNameIdentifier	 f Position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a content model leaf. */	TokenNameCOMMENT_JAVADOC	 Constructs a content model leaf. 
public	TokenNamepublic	
CMLeaf	TokenNameIdentifier	 CM Leaf
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Store the element index and position 	TokenNameCOMMENT_LINE	Store the element index and position 
fElement	TokenNameIdentifier	 f Element
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPosition	TokenNameIdentifier	 f Position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a content model leaf. */	TokenNameCOMMENT_JAVADOC	 Constructs a content model leaf. 
public	TokenNamepublic	
CMLeaf	TokenNameIdentifier	 CM Leaf
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Store the element index and position 	TokenNameCOMMENT_LINE	Store the element index and position 
fElement	TokenNameIdentifier	 f Element
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Package methods 	TokenNameCOMMENT_LINE	Package methods 
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fElement	TokenNameIdentifier	 f Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPosition	TokenNameIdentifier	 f Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
int	TokenNameint	
newPosition	TokenNameIdentifier	 new Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPosition	TokenNameIdentifier	 f Position
=	TokenNameEQUAL	
newPosition	TokenNameIdentifier	 new Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// CMNode methods 	TokenNameCOMMENT_LINE	CMNode methods 
// 	TokenNameCOMMENT_LINE	 
// package 	TokenNameCOMMENT_LINE	package 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Leaf nodes are never nullable unless its an epsilon node 	TokenNameCOMMENT_LINE	Leaf nodes are never nullable unless its an epsilon node 
return	TokenNamereturn	
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
strRet	TokenNameIdentifier	 str Ret
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fElement	TokenNameIdentifier	 f Element
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" ("	TokenNameStringLiteral	 (
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fElement	TokenNameIdentifier	 f Element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fElement	TokenNameIdentifier	 f Element
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" (Pos:"	TokenNameStringLiteral	 (Pos:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// protected 	TokenNameCOMMENT_LINE	protected 
protected	TokenNameprotected	
void	TokenNamevoid	
calcFirstPos	TokenNameIdentifier	 calc First Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we are an epsilon node, then the first pos is an empty set 	TokenNameCOMMENT_LINE	If we are an epsilon node, then the first pos is an empty set 
if	TokenNameif	
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
zeroBits	TokenNameIdentifier	 zero Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Otherwise, its just the one bit of our position 	TokenNameCOMMENT_LINE	Otherwise, its just the one bit of our position 
else	TokenNameelse	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setBit	TokenNameIdentifier	 set Bit
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
calcLastPos	TokenNameIdentifier	 calc Last Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we are an epsilon node, then the last pos is an empty set 	TokenNameCOMMENT_LINE	If we are an epsilon node, then the last pos is an empty set 
if	TokenNameif	
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
zeroBits	TokenNameIdentifier	 zero Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Otherwise, its just the one bit of our position 	TokenNameCOMMENT_LINE	Otherwise, its just the one bit of our position 
else	TokenNameelse	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setBit	TokenNameIdentifier	 set Bit
(	TokenNameLPAREN	
fPosition	TokenNameIdentifier	 f Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class CMLeaf 	TokenNameCOMMENT_LINE	class CMLeaf 
