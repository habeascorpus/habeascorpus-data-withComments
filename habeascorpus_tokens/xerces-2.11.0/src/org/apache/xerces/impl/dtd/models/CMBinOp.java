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
/** * Content model Bin-Op node. * * @xerces.internal * * @version $Id: CMBinOp.java 572057 2007-09-02 18:03:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Content model Bin-Op node. * @xerces.internal * @version $Id: CMBinOp.java 572057 2007-09-02 18:03:20Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CMBinOp	TokenNameIdentifier	 CM Bin Op
extends	TokenNameextends	
CMNode	TokenNameIdentifier	 CM Node
{	TokenNameLBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
CMBinOp	TokenNameIdentifier	 CM Bin Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
CMNode	TokenNameIdentifier	 CM Node
leftNode	TokenNameIdentifier	 left Node
,	TokenNameCOMMA	
CMNode	TokenNameIdentifier	 CM Node
rightNode	TokenNameIdentifier	 right Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insure that its one of the types we require 	TokenNameCOMMENT_LINE	Insure that its one of the types we require 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_BST"	TokenNameStringLiteral	ImplementationMessages.VAL_BST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Store the nodes and init any data that needs it 	TokenNameCOMMENT_LINE	Store the nodes and init any data that needs it 
fLeftChild	TokenNameIdentifier	 f Left Child
=	TokenNameEQUAL	
leftNode	TokenNameIdentifier	 left Node
;	TokenNameSEMICOLON	
fRightChild	TokenNameIdentifier	 f Right Child
=	TokenNameEQUAL	
rightNode	TokenNameIdentifier	 right Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package, final methods 	TokenNameCOMMENT_LINE	Package, final methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
final	TokenNamefinal	
CMNode	TokenNameIdentifier	 CM Node
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLeftChild	TokenNameIdentifier	 f Left Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
CMNode	TokenNameIdentifier	 CM Node
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRightChild	TokenNameIdentifier	 f Right Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package, inherited methods 	TokenNameCOMMENT_LINE	Package, inherited methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If its an alternation, then if either child is nullable then 	TokenNameCOMMENT_LINE	If its an alternation, then if either child is nullable then 
// this node is nullable. If its a concatenation, then both of 	TokenNameCOMMENT_LINE	this node is nullable. If its a concatenation, then both of 
// them have to be nullable. 	TokenNameCOMMENT_LINE	them have to be nullable. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_BST"	TokenNameStringLiteral	ImplementationMessages.VAL_BST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Protected, inherited methods 	TokenNameCOMMENT_LINE	Protected, inherited methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
calcFirstPos	TokenNameIdentifier	 calc First Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Its the the union of the first positions of our children. 	TokenNameCOMMENT_LINE	Its the the union of the first positions of our children. 
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If our left child is nullable, then its the union of our 	TokenNameCOMMENT_LINE	If our left child is nullable, then its the union of our 
// children's first positions. Else is our left child's first 	TokenNameCOMMENT_LINE	children's first positions. Else is our left child's first 
// positions. 	TokenNameCOMMENT_LINE	positions. 
// 	TokenNameCOMMENT_LINE	 
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_BST"	TokenNameStringLiteral	ImplementationMessages.VAL_BST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
calcLastPos	TokenNameIdentifier	 calc Last Pos
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
toSet	TokenNameIdentifier	 to Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Its the the union of the first positions of our children. 	TokenNameCOMMENT_LINE	Its the the union of the first positions of our children. 
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If our right child is nullable, then its the union of our 	TokenNameCOMMENT_LINE	If our right child is nullable, then its the union of our 
// children's last positions. Else is our right child's last 	TokenNameCOMMENT_LINE	children's last positions. Else is our right child's last 
// positions. 	TokenNameCOMMENT_LINE	positions. 
// 	TokenNameCOMMENT_LINE	 
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fRightChild	TokenNameIdentifier	 f Right Child
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
toSet	TokenNameIdentifier	 to Set
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
fLeftChild	TokenNameIdentifier	 f Left Child
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_BST"	TokenNameStringLiteral	ImplementationMessages.VAL_BST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Private data members 	TokenNameCOMMENT_LINE	Private data members 
// 	TokenNameCOMMENT_LINE	 
// fLeftChild 	TokenNameCOMMENT_LINE	fLeftChild 
// fRightChild 	TokenNameCOMMENT_LINE	fRightChild 
// These are the references to the two nodes that are on either 	TokenNameCOMMENT_LINE	These are the references to the two nodes that are on either 
// side of this binary operation. 	TokenNameCOMMENT_LINE	side of this binary operation. 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
private	TokenNameprivate	
final	TokenNamefinal	
CMNode	TokenNameIdentifier	 CM Node
fLeftChild	TokenNameIdentifier	 f Left Child
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CMNode	TokenNameIdentifier	 CM Node
fRightChild	TokenNameIdentifier	 f Right Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
