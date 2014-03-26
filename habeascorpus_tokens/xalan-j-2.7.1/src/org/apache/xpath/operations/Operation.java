/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Operation.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Operation.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * The baseclass for a binary operation. */	TokenNameCOMMENT_JAVADOC	 The baseclass for a binary operation. 
public	TokenNamepublic	
class	TokenNameclass	
Operation	TokenNameIdentifier	 Operation
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3037139537171050430L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The left operand expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The left operand expression. @serial 
protected	TokenNameprotected	
Expression	TokenNameIdentifier	 Expression
m_left	TokenNameIdentifier	 m left
;	TokenNameSEMICOLON	
/** The right operand expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The right operand expression. @serial 
protected	TokenNameprotected	
Expression	TokenNameIdentifier	 Expression
m_right	TokenNameIdentifier	 m right
;	TokenNameSEMICOLON	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_left	TokenNameIdentifier	 m left
&&	TokenNameAND_AND	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_right	TokenNameIdentifier	 m right
&&	TokenNameAND_AND	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the left and right operand expressions for this operation. * * * @param l The left expression operand. * @param r The right expression operand. */	TokenNameCOMMENT_JAVADOC	 Set the left and right operand expressions for this operation. * @param l The left expression operand. @param r The right expression operand. 
public	TokenNamepublic	
void	TokenNamevoid	
setLeftRight	TokenNameIdentifier	 set Left Right
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
Expression	TokenNameIdentifier	 Expression
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_left	TokenNameIdentifier	 m left
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
m_right	TokenNameIdentifier	 m right
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute a binary operation by calling execute on each of the operands, * and then calling the operate method on the derived class. * * * @param xctxt The runtime execution context. * * @return The XObject result of the operation. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute a binary operation by calling execute on each of the operands, and then calling the operate method on the derived class. * @param xctxt The runtime execution context. * @return The XObject result of the operation. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
operate	TokenNameIdentifier	 operate
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Apply the operation to two operands, and return the result. * * * @param left non-null reference to the evaluated left operand. * @param right non-null reference to the evaluated right operand. * * @return non-null reference to the XObject that represents the result of the operation. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Apply the operation to two operands, and return the result. * @param left non-null reference to the evaluated left operand. @param right non-null reference to the evaluated right operand. * @return non-null reference to the XObject that represents the result of the operation. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
operate	TokenNameIdentifier	 operate
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
/** @return the left operand of binary operation, as an Expression. */	TokenNameCOMMENT_JAVADOC	 @return the left operand of binary operation, as an Expression. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getLeftOperand	TokenNameIdentifier	 get Left Operand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_left	TokenNameIdentifier	 m left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the right operand of binary operation, as an Expression. */	TokenNameCOMMENT_JAVADOC	 @return the right operand of binary operation, as an Expression. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getRightOperand	TokenNameIdentifier	 get Right Operand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_right	TokenNameIdentifier	 m right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
LeftExprOwner	TokenNameIdentifier	 Left Expr Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_left	TokenNameIdentifier	 m left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#setExpression(Expression) */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#setExpression(Expression) 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
Operation	TokenNameIdentifier	 Operation
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_left	TokenNameIdentifier	 m left
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitBinaryOperation	TokenNameIdentifier	 visit Binary Operation
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
new	TokenNamenew	
LeftExprOwner	TokenNameIdentifier	 Left Expr Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_right	TokenNameIdentifier	 m right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#setExpression(Expression) */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#setExpression(Expression) 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_right	TokenNameIdentifier	 m right
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Expression#deepEquals(Expression) */	TokenNameCOMMENT_JAVADOC	 @see Expression#deepEquals(Expression) 
public	TokenNamepublic	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSameClass	TokenNameIdentifier	 is Same Class
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_left	TokenNameIdentifier	 m left
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Operation	TokenNameIdentifier	 Operation
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_left	TokenNameIdentifier	 m left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_right	TokenNameIdentifier	 m right
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Operation	TokenNameIdentifier	 Operation
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_right	TokenNameIdentifier	 m right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
