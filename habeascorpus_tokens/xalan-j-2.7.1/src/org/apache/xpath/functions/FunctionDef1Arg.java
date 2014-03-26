/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FunctionDef1Arg.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FunctionDef1Arg.java 468655 2006-10-28 07:12:06Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XString	TokenNameIdentifier	 X String
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
/** * Base class for functions that accept one argument that can be defaulted if * not specified. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Base class for functions that accept one argument that can be defaulted if not specified. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FunctionDef1Arg	TokenNameIdentifier	 Function Def1 Arg
extends	TokenNameextends	
FunctionOneArg	TokenNameIdentifier	 Function One Arg
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2325189412814149264L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Execute the first argument expression that is expected to return a * nodeset. If the argument is null, then return the current context node. * * @param xctxt Runtime XPath context. * * @return The first node of the executed nodeset, or the current context * node if the first argument is null. * * @throws javax.xml.transform.TransformerException if an error occurs while * executing the argument expression. */	TokenNameCOMMENT_JAVADOC	 Execute the first argument expression that is expected to return a nodeset. If the argument is null, then return the current context node. * @param xctxt Runtime XPath context. * @return The first node of the executed nodeset, or the current context node if the first argument is null. * @throws javax.xml.transform.TransformerException if an error occurs while executing the argument expression. 
protected	TokenNameprotected	
int	TokenNameint	
getArg0AsNode	TokenNameIdentifier	 get Arg0 As Node
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
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_arg0	TokenNameIdentifier	 m arg0
)	TokenNameRPAREN	
?	TokenNameQUESTION	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_arg0	TokenNameIdentifier	 m arg0
.	TokenNameDOT	
asNode	TokenNameIdentifier	 as Node
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the expression is a nodeset expression. * @return true if the expression can be represented as a nodeset. */	TokenNameCOMMENT_JAVADOC	 Tell if the expression is a nodeset expression. @return true if the expression can be represented as a nodeset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
Arg0IsNodesetExpr	TokenNameIdentifier	 Arg0 Is Nodeset Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_arg0	TokenNameIdentifier	 m arg0
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
m_arg0	TokenNameIdentifier	 m arg0
.	TokenNameDOT	
isNodesetExpr	TokenNameIdentifier	 is Nodeset Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the first argument expression that is expected to return a * string. If the argument is null, then get the string value from the * current context node. * * @param xctxt Runtime XPath context. * * @return The string value of the first argument, or the string value of the * current context node if the first argument is null. * * @throws javax.xml.transform.TransformerException if an error occurs while * executing the argument expression. */	TokenNameCOMMENT_JAVADOC	 Execute the first argument expression that is expected to return a string. If the argument is null, then get the string value from the current context node. * @param xctxt Runtime XPath context. * @return The string value of the first argument, or the string value of the current context node if the first argument is null. * @throws javax.xml.transform.TransformerException if an error occurs while executing the argument expression. 
protected	TokenNameprotected	
XMLString	TokenNameIdentifier	 XML String
getArg0AsString	TokenNameIdentifier	 get Arg0 As String
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_arg0	TokenNameIdentifier	 m arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
return	TokenNamereturn	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m_arg0	TokenNameIdentifier	 m arg0
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the first argument expression that is expected to return a * number. If the argument is null, then get the number value from the * current context node. * * @param xctxt Runtime XPath context. * * @return The number value of the first argument, or the number value of the * current context node if the first argument is null. * * @throws javax.xml.transform.TransformerException if an error occurs while * executing the argument expression. */	TokenNameCOMMENT_JAVADOC	 Execute the first argument expression that is expected to return a number. If the argument is null, then get the number value from the current context node. * @param xctxt Runtime XPath context. * @return The number value of the first argument, or the number value of the current context node if the first argument is null. * @throws javax.xml.transform.TransformerException if an error occurs while executing the argument expression. 
protected	TokenNameprotected	
double	TokenNamedouble	
getArg0AsNumber	TokenNameIdentifier	 get Arg0 As Number
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_arg0	TokenNameIdentifier	 m arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLString	TokenNameIdentifier	 XML String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toDouble	TokenNameIdentifier	 to Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m_arg0	TokenNameIdentifier	 m arg0
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that the number of arguments passed to this function is correct. * * @param argNum The number of arguments that is being passed to the function. * * @throws WrongNumberArgsException if the number of arguments is not 0 or 1. */	TokenNameCOMMENT_JAVADOC	 Check that the number of arguments passed to this function is correct. * @param argNum The number of arguments that is being passed to the function. * @throws WrongNumberArgsException if the number of arguments is not 0 or 1. 
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
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
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
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_ZERO_OR_ONE	TokenNameIdentifier	 ER  ZERO  OR  ONE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"0 or 1"); 	TokenNameCOMMENT_LINE	"0 or 1"); 
}	TokenNameRBRACE	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_arg0	TokenNameIdentifier	 m arg0
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
