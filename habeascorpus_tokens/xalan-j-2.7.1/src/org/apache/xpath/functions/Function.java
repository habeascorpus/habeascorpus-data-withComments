/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Function.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Function.java 468655 2006-10-28 07:12:06Z minchau $ 
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
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
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
/** * This is a superclass of all XPath functions. This allows two * ways for the class to be called. One method is that the * super class processes the arguments and hands the results to * the derived class, the other method is that the derived * class may process it's own arguments, which is faster since * the arguments don't have to be added to an array, but causes * a larger code footprint. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This is a superclass of all XPath functions. This allows two ways for the class to be called. One method is that the super class processes the arguments and hands the results to the derived class, the other method is that the derived class may process it's own arguments, which is faster since the arguments don't have to be added to an array, but causes a larger code footprint. @xsl.usage advanced 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Function	TokenNameIdentifier	 Function
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6927661240854599768L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Set an argument expression for a function. This method is called by the * XPath compiler. * * @param arg non-null expression that represents the argument. * @param argNum The argument number index. * * @throws WrongNumberArgsException If the argNum parameter is beyond what * is specified for this function. */	TokenNameCOMMENT_JAVADOC	 Set an argument expression for a function. This method is called by the XPath compiler. * @param arg non-null expression that represents the argument. @param argNum The argument number index. * @throws WrongNumberArgsException If the argNum parameter is beyond what is specified for this function. 
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
// throw new WrongNumberArgsException(XSLMessages.createXPATHMessage("zero", null)); 	TokenNameCOMMENT_LINE	throw new WrongNumberArgsException(XSLMessages.createXPATHMessage("zero", null)); 
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that the number of arguments passed to this function is correct. * This method is meant to be overloaded by derived classes, to check for * the number of arguments for a specific function type. This method is * called by the compiler for static number of arguments checking. * * @param argNum The number of arguments that is being passed to the function. * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Check that the number of arguments passed to this function is correct. This method is meant to be overloaded by derived classes, to check for the number of arguments for a specific function type. This method is called by the compiler for static number of arguments checking. * @param argNum The number of arguments that is being passed to the function. * @throws WrongNumberArgsException 
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
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs and throws a WrongNumberArgException with the appropriate * message for this function object. This method is meant to be overloaded * by derived classes so that the message will be as specific as possible. * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Constructs and throws a WrongNumberArgException with the appropriate message for this function object. This method is meant to be overloaded by derived classes so that the message will be as specific as possible. * @throws WrongNumberArgsException 
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
"zero"	TokenNameStringLiteral	zero
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an XPath function object. The function must return * a valid object. * @param xctxt The execution current context. * @return A valid XObject. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute an XPath function object. The function must return a valid object. @param xctxt The execution current context. @return A valid XObject. * @throws javax.xml.transform.TransformerException 
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
// Programmer's assert. (And, no, I don't want the method to be abstract). 	TokenNameCOMMENT_LINE	Programmer's assert. (And, no, I don't want the method to be abstract). 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Error! Function.execute should not be called!"	TokenNameStringLiteral	Error! Function.execute should not be called!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call the visitors for the function arguments. */	TokenNameCOMMENT_JAVADOC	 Call the visitors for the function arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
callArgVisitors	TokenNameIdentifier	 call Arg Visitors
(	TokenNameLPAREN	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
visitFunction	TokenNameIdentifier	 visit Function
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callArgVisitors	TokenNameIdentifier	 call Arg Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
isSameClass	TokenNameIdentifier	 is Same Class
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is currently only being used by Position() * and Last(). See respective functions for more detail. */	TokenNameCOMMENT_JAVADOC	 This function is currently only being used by Position() and Last(). See respective functions for more detail. 
public	TokenNamepublic	
void	TokenNamevoid	
postCompileStep	TokenNameIdentifier	 post Compile Step
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no default action 	TokenNameCOMMENT_LINE	no default action 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
