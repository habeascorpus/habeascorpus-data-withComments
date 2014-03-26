/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Function3Args.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Function3Args.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
/** * Base class for functions that accept three arguments. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Base class for functions that accept three arguments. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
Function3Args	TokenNameIdentifier	 Function3 Args
extends	TokenNameextends	
Function2Args	TokenNameIdentifier	 Function2 Args
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7915240747161506646L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The third argument passed to the function (at index 2). * @serial */	TokenNameCOMMENT_JAVADOC	 The third argument passed to the function (at index 2). @serial 
Expression	TokenNameIdentifier	 Expression
m_arg2	TokenNameIdentifier	 m arg2
;	TokenNameSEMICOLON	
/** * Return the third argument passed to the function (at index 2). * * @return An expression that represents the third argument passed to the * function. */	TokenNameCOMMENT_JAVADOC	 Return the third argument passed to the function (at index 2). * @return An expression that represents the third argument passed to the function. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getArg2	TokenNameIdentifier	 get Arg2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_arg2	TokenNameIdentifier	 m arg2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
super	TokenNamesuper	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_arg2	TokenNameIdentifier	 m arg2
)	TokenNameRPAREN	
m_arg2	TokenNameIdentifier	 m arg2
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an argument expression for a function. This method is called by the * XPath compiler. * * @param arg non-null expression that represents the argument. * @param argNum The argument number index. * * @throws WrongNumberArgsException If the argNum parameter is greater than 2. */	TokenNameCOMMENT_JAVADOC	 Set an argument expression for a function. This method is called by the XPath compiler. * @param arg non-null expression that represents the argument. @param argNum The argument number index. * @throws WrongNumberArgsException If the argNum parameter is greater than 2. 
public	TokenNamepublic	
void	TokenNamevoid	
setArg	TokenNameIdentifier	 set Arg
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
int	TokenNameint	
argNum	TokenNameIdentifier	 arg Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argNum	TokenNameIdentifier	 arg Num
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
setArg	TokenNameIdentifier	 set Arg
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
argNum	TokenNameIdentifier	 arg Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
argNum	TokenNameIdentifier	 arg Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_arg2	TokenNameIdentifier	 m arg2
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that the number of arguments passed to this function is correct. * * * @param argNum The number of arguments that is being passed to the function. * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Check that the number of arguments passed to this function is correct. * @param argNum The number of arguments that is being passed to the function. * @throws WrongNumberArgsException 
public	TokenNamepublic	
void	TokenNamevoid	
checkNumberArgs	TokenNameIdentifier	 check Number Args
(	TokenNameLPAREN	
int	TokenNameint	
argNum	TokenNameIdentifier	 arg Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argNum	TokenNameIdentifier	 arg Num
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs and throws a WrongNumberArgException with the appropriate * message for this function object. * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Constructs and throws a WrongNumberArgException with the appropriate message for this function object. * @throws WrongNumberArgsException 
protected	TokenNameprotected	
void	TokenNamevoid	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
m_arg2	TokenNameIdentifier	 m arg2
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
Arg2Owner	TokenNameIdentifier	 Arg2 Owner
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
m_arg2	TokenNameIdentifier	 m arg2
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
Function3Args	TokenNameIdentifier	 Function3 Args
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_arg2	TokenNameIdentifier	 m arg2
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callArgVisitors	TokenNameIdentifier	 call Arg Visitors
(	TokenNameLPAREN	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
callArgVisitors	TokenNameIdentifier	 call Arg Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_arg2	TokenNameIdentifier	 m arg2
)	TokenNameRPAREN	
m_arg2	TokenNameIdentifier	 m arg2
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
new	TokenNamenew	
Arg2Owner	TokenNameIdentifier	 Arg2 Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
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
super	TokenNamesuper	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_arg2	TokenNameIdentifier	 m arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function3Args	TokenNameIdentifier	 Function3 Args
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_arg2	TokenNameIdentifier	 m arg2
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_arg2	TokenNameIdentifier	 m arg2
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function3Args	TokenNameIdentifier	 Function3 Args
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_arg2	TokenNameIdentifier	 m arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function3Args	TokenNameIdentifier	 Function3 Args
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_arg2	TokenNameIdentifier	 m arg2
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
