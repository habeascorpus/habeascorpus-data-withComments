/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FunctionMultiArgs.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FunctionMultiArgs.java 468655 2006-10-28 07:12:06Z minchau $ 
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * Base class for functions that accept an undetermined number of multiple * arguments. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Base class for functions that accept an undetermined number of multiple arguments. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FunctionMultiArgs	TokenNameIdentifier	 Function Multi Args
extends	TokenNameextends	
Function3Args	TokenNameIdentifier	 Function3 Args
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7117257746138417181L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Argument expressions that are at index 3 or greater. * @serial */	TokenNameCOMMENT_JAVADOC	 Argument expressions that are at index 3 or greater. @serial 
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_args	TokenNameIdentifier	 m args
;	TokenNameSEMICOLON	
/** * Return an expression array containing arguments at index 3 or greater. * * @return An array that contains the arguments at index 3 or greater. */	TokenNameCOMMENT_JAVADOC	 Return an expression array containing arguments at index 3 or greater. * @return An array that contains the arguments at index 3 or greater. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getArgs	TokenNameIdentifier	 get Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_args	TokenNameIdentifier	 m args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an argument expression for a function. This method is called by the * XPath compiler. * * @param arg non-null expression that represents the argument. * @param argNum The argument number index. * * @throws WrongNumberArgsException If a derived class determines that the * number of arguments is incorrect. */	TokenNameCOMMENT_JAVADOC	 Set an argument expression for a function. This method is called by the XPath compiler. * @param arg non-null expression that represents the argument. @param argNum The argument number index. * @throws WrongNumberArgsException If a derived class determines that the number of arguments is incorrect. 
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
3	TokenNameIntegerLiteral	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_args	TokenNameIdentifier	 m args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_args	TokenNameIdentifier	 m args
=	TokenNameEQUAL	
new	TokenNamenew	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Slow but space conservative. 	TokenNameCOMMENT_LINE	Slow but space conservative. 
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_args	TokenNameIdentifier	 m args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
m_args	TokenNameIdentifier	 m args
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_args	TokenNameIdentifier	 m args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
/** * Constructs and throws a WrongNumberArgException with the appropriate * message for this function object. This class supports an arbitrary * number of arguments, so this method must never be called. * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Constructs and throws a WrongNumberArgException with the appropriate message for this function object. This class supports an arbitrary number of arguments, so this method must never be called. * @throws WrongNumberArgsException 
protected	TokenNameprotected	
void	TokenNamevoid	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fMsg	TokenNameIdentifier	 f Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Programmer's assertion: the method FunctionMultiArgs.reportWrongNumberArgs() should never be called."	TokenNameStringLiteral	Programmer's assertion: the method FunctionMultiArgs.reportWrongNumberArgs() should never be called.
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
fMsg	TokenNameIdentifier	 f Msg
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
super	TokenNamesuper	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
ArgMultiOwner	TokenNameIdentifier	 Arg Multi Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
int	TokenNameint	
m_argIndex	TokenNameIdentifier	 m arg Index
;	TokenNameSEMICOLON	
ArgMultiOwner	TokenNameIdentifier	 Arg Multi Owner
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_argIndex	TokenNameIdentifier	 m arg Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
m_argIndex	TokenNameIdentifier	 m arg Index
]	TokenNameRBRACKET	
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
FunctionMultiArgs	TokenNameIdentifier	 Function Multi Args
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
m_argIndex	TokenNameIdentifier	 m arg Index
]	TokenNameRBRACKET	
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
m_args	TokenNameIdentifier	 m args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
new	TokenNamenew	
ArgMultiOwner	TokenNameIdentifier	 Arg Multi Owner
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
FunctionMultiArgs	TokenNameIdentifier	 Function Multi Args
fma	TokenNameIdentifier	 fma
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FunctionMultiArgs	TokenNameIdentifier	 Function Multi Args
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_args	TokenNameIdentifier	 m args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
fma	TokenNameIdentifier	 fma
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fma	TokenNameIdentifier	 fma
.	TokenNameDOT	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
fma	TokenNameIdentifier	 fma
.	TokenNameDOT	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
fma	TokenNameIdentifier	 fma
.	TokenNameDOT	
m_args	TokenNameIdentifier	 m args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
