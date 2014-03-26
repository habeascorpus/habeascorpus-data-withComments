/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionHandlerExsltFunction.java 469672 2006-10-31 21:56:19Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionHandlerExsltFunction.java 469672 2006-10-31 21:56:19Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExsltFuncResult	TokenNameIdentifier	 Elem Exslt Func Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplate	TokenNameIdentifier	 Elem Template
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionNode	TokenNameIdentifier	 Expression Node
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
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
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
/** * Execute EXSLT functions, determine the availability of EXSLT functions, and the * availability of an EXSLT result element. */	TokenNameCOMMENT_JAVADOC	 Execute EXSLT functions, determine the availability of EXSLT functions, and the availability of an EXSLT result element. 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionHandlerExsltFunction	TokenNameIdentifier	 Extension Handler Exslt Function
extends	TokenNameextends	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
m_stylesheet	TokenNameIdentifier	 m stylesheet
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
RESULTQNAME	TokenNameIdentifier	 RESULTQNAME
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_FUNCTIONS_URL	TokenNameIdentifier	 S  EXSLT  FUNCTIONS  URL
,	TokenNameCOMMA	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EXSLT_ELEMNAME_FUNCRESULT_STRING	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCRESULT  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructor called from ElemExsltFunction runtimeInit(). */	TokenNameCOMMENT_JAVADOC	 Constructor called from ElemExsltFunction runtimeInit(). 
public	TokenNamepublic	
ExtensionHandlerExsltFunction	TokenNameIdentifier	 Extension Handler Exslt Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// required by ExtensionHandler interface. 	TokenNameCOMMENT_LINE	required by ExtensionHandler interface. 
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
m_stylesheet	TokenNameIdentifier	 m stylesheet
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Required by ExtensionHandler (an abstract method). No-op. */	TokenNameCOMMENT_JAVADOC	 Required by ExtensionHandler (an abstract method). No-op. 
public	TokenNamepublic	
void	TokenNamevoid	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheetTree	TokenNameIdentifier	 stylesheet Tree
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the ElemExsltFunction element associated with the * function. * * @param funcName Local name of the function. * @return the ElemExsltFunction element associated with * the function, null if none exists. */	TokenNameCOMMENT_JAVADOC	 Get the ElemExsltFunction element associated with the function. * @param funcName Local name of the function. @return the ElemExsltFunction element associated with the function, null if none exists. 
public	TokenNamepublic	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
getFunction	TokenNameIdentifier	 get Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTemplate	TokenNameIdentifier	 Elem Template
templ	TokenNameIdentifier	 templ
=	TokenNameEQUAL	
m_stylesheet	TokenNameIdentifier	 m stylesheet
.	TokenNameDOT	
getTemplateComposed	TokenNameIdentifier	 get Template Composed
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
templ	TokenNameIdentifier	 templ
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
templ	TokenNameIdentifier	 templ
instanceof	TokenNameinstanceof	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
)	TokenNameRPAREN	
templ	TokenNameIdentifier	 templ
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the EXSLT function exist? * * @param funcName Local name of the function. * @return true if the function exists. */	TokenNameCOMMENT_JAVADOC	 Does the EXSLT function exist? * @param funcName Local name of the function. @return true if the function exists. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFunctionAvailable	TokenNameIdentifier	 is Function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFunction	TokenNameIdentifier	 get Function
(	TokenNameLPAREN	
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If an element-available() call applies to an EXSLT result element within * an EXSLT function element, return true. * * Note: The EXSLT function element is a template-level element, and * element-available() returns false for it. * * @param elemName name of the element. * @return true if the function is available. */	TokenNameCOMMENT_JAVADOC	 If an element-available() call applies to an EXSLT result element within an EXSLT function element, return true. * Note: The EXSLT function element is a template-level element, and element-available() returns false for it. * @param elemName name of the element. @return true if the function is available. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementAvailable	TokenNameIdentifier	 is Element Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
RESULTQNAME	TokenNameIdentifier	 RESULTQNAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
m_stylesheet	TokenNameIdentifier	 m stylesheet
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
elem	TokenNameIdentifier	 elem
!=	TokenNameNOT_EQUAL	
m_stylesheet	TokenNameIdentifier	 m stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
instanceof	TokenNameinstanceof	
ElemExsltFuncResult	TokenNameIdentifier	 Elem Exslt Func Result
&&	TokenNameAND_AND	
ancestorIsFunction	TokenNameIdentifier	 ancestor Is Function
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
nextElem	TokenNameIdentifier	 next Elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextElem	TokenNameIdentifier	 next Elem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextElem	TokenNameIdentifier	 next Elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextElem	TokenNameIdentifier	 next Elem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextElem	TokenNameIdentifier	 next Elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
nextElem	TokenNameIdentifier	 next Elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether the func:result element is within a func:function element. * If not, it is illegal. */	TokenNameCOMMENT_JAVADOC	 Determine whether the func:result element is within a func:function element. If not, it is illegal. 
private	TokenNameprivate	
boolean	TokenNameboolean	
ancestorIsFunction	TokenNameIdentifier	 ancestor Is Function
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the EXSLT function and return the result value. * * @param funcName Name of the EXSLT function. * @param args The arguments of the function call. * @param methodKey Not used. * @param exprContext Used to get the XPathContext. * @return the return value of the function evaluation. * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the EXSLT function and return the result value. * @param funcName Name of the EXSLT function. @param args The arguments of the function call. @param methodKey Not used. @param exprContext Used to get the XPathContext. @return the return value of the function evaluation. @throws TransformerException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
"This method should not be called."	TokenNameStringLiteral	This method should not be called.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the EXSLT function and return the result value. * * @param extFunction The XPath extension function * @param args The arguments of the function call. * @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the EXSLT function and return the result value. * @param extFunction The XPath extension function @param args The arguments of the function call. @param exprContext The context in which this expression is being executed. @return the return value of the function evaluation. @throws TransformerException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Find the template which invokes this EXSLT function. 	TokenNameCOMMENT_LINE	Find the template which invokes this EXSLT function. 
ExpressionNode	TokenNameIdentifier	 Expression Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
callerTemplate	TokenNameIdentifier	 caller Template
=	TokenNameEQUAL	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodArgs	TokenNameIdentifier	 method Args
;	TokenNameSEMICOLON	
methodArgs	TokenNameIdentifier	 method Args
=	TokenNameEQUAL	
new	TokenNamenew	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
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
methodArgs	TokenNameIdentifier	 method Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodArgs	TokenNameIdentifier	 method Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
elemFunc	TokenNameIdentifier	 elem Func
=	TokenNameEQUAL	
getFunction	TokenNameIdentifier	 get Function
(	TokenNameLPAREN	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elemFunc	TokenNameIdentifier	 elem Func
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
exprContext	TokenNameIdentifier	 expr Context
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushCurrentFuncResult	TokenNameIdentifier	 push Current Func Result
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemFunc	TokenNameIdentifier	 elem Func
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popCurrentFuncResult	TokenNameIdentifier	 pop Current Func Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
// value if no result element. 	TokenNameCOMMENT_LINE	value if no result element. 
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
