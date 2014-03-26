/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// $Id: XPathExpressionImpl.java 524813 2007-04-02 15:52:07Z zongaro $ 	TokenNameCOMMENT_LINE	$Id: XPathExpressionImpl.java 524813 2007-04-02 15:52:07Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathConstants	TokenNameIdentifier	 X Path Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathConstants	TokenNameIdentifier	 X Path Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
/** * The XPathExpression interface encapsulates a (compiled) XPath expression. * * @version $Revision$ * @author Ramesh Mandava */	TokenNameCOMMENT_JAVADOC	 The XPathExpression interface encapsulates a (compiled) XPath expression. * @version $Revision$ @author Ramesh Mandava 
public	TokenNamepublic	
class	TokenNameclass	
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
implements	TokenNameimplements	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathExpression	TokenNameIdentifier	 X Path Expression
{	TokenNameLBRACE	
private	TokenNameprivate	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
functionResolver	TokenNameIdentifier	 function Resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
variableResolver	TokenNameIdentifier	 variable Resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JAXPPrefixResolver	TokenNameIdentifier	 JAXP Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
// By default Extension Functions are allowed in XPath Expressions. If 	TokenNameCOMMENT_LINE	By default Extension Functions are allowed in XPath Expressions. If 
// Secure Processing Feature is set on XPathFactory then the invocation of 	TokenNameCOMMENT_LINE	Secure Processing Feature is set on XPathFactory then the invocation of 
// extensions function need to throw XPathFunctionException 	TokenNameCOMMENT_LINE	extensions function need to throw XPathFunctionException 
private	TokenNameprivate	
boolean	TokenNameboolean	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Protected constructor to prevent direct instantiation; use compile() * from the context. */	TokenNameCOMMENT_JAVADOC	 Protected constructor to prevent direct instantiation; use compile() from the context. 
protected	TokenNameprotected	
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
JAXPPrefixResolver	TokenNameIdentifier	 JAXP Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
functionResolver	TokenNameIdentifier	 function Resolver
,	TokenNameCOMMA	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
variableResolver	TokenNameIdentifier	 variable Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefixResolver	TokenNameIdentifier	 prefix Resolver
=	TokenNameEQUAL	
prefixResolver	TokenNameIdentifier	 prefix Resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
functionResolver	TokenNameIdentifier	 function Resolver
=	TokenNameEQUAL	
functionResolver	TokenNameIdentifier	 function Resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
variableResolver	TokenNameIdentifier	 variable Resolver
=	TokenNameEQUAL	
variableResolver	TokenNameIdentifier	 variable Resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XPathExpressionImpl	TokenNameIdentifier	 X Path Expression Impl
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
JAXPPrefixResolver	TokenNameIdentifier	 JAXP Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
functionResolver	TokenNameIdentifier	 function Resolver
,	TokenNameCOMMA	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
variableResolver	TokenNameIdentifier	 variable Resolver
,	TokenNameCOMMA	
boolean	TokenNameboolean	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefixResolver	TokenNameIdentifier	 prefix Resolver
=	TokenNameEQUAL	
prefixResolver	TokenNameIdentifier	 prefix Resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
functionResolver	TokenNameIdentifier	 function Resolver
=	TokenNameEQUAL	
functionResolver	TokenNameIdentifier	 function Resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
variableResolver	TokenNameIdentifier	 variable Resolver
=	TokenNameEQUAL	
variableResolver	TokenNameIdentifier	 variable Resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
=	TokenNameEQUAL	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setXPath	TokenNameIdentifier	 set X Path
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
returnType	TokenNameIdentifier	 return Type
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
resultObject	TokenNameIdentifier	 result Object
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getResultAsType	TokenNameIdentifier	 get Result As Type
(	TokenNameLPAREN	
resultObject	TokenNameIdentifier	 result Object
,	TokenNameCOMMA	
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
XObject	TokenNameIdentifier	 X Object
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
contextItem	TokenNameIdentifier	 context Item
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
xpathSupport	TokenNameIdentifier	 xpath Support
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Create an XPathContext that doesn't support pushing and popping of 	TokenNameCOMMENT_LINE	Create an XPathContext that doesn't support pushing and popping of 
// variable resolution scopes. Sufficient for simple XPath 1.0 	TokenNameCOMMENT_LINE	variable resolution scopes. Sufficient for simple XPath 1.0 
// expressions. 	TokenNameCOMMENT_LINE	expressions. 
if	TokenNameif	
(	TokenNameLPAREN	
functionResolver	TokenNameIdentifier	 function Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JAXPExtensionsProvider	TokenNameIdentifier	 JAXP Extensions Provider
jep	TokenNameIdentifier	 jep
=	TokenNameEQUAL	
new	TokenNamenew	
JAXPExtensionsProvider	TokenNameIdentifier	 JAXP Extensions Provider
(	TokenNameLPAREN	
functionResolver	TokenNameIdentifier	 function Resolver
,	TokenNameCOMMA	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpathSupport	TokenNameIdentifier	 xpath Support
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
jep	TokenNameIdentifier	 jep
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xpathSupport	TokenNameIdentifier	 xpath Support
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xpathSupport	TokenNameIdentifier	 xpath Support
.	TokenNameDOT	
setVarStack	TokenNameIdentifier	 set Var Stack
(	TokenNameLPAREN	
new	TokenNamenew	
JAXPVariableStack	TokenNameIdentifier	 JAXP Variable Stack
(	TokenNameLPAREN	
variableResolver	TokenNameIdentifier	 variable Resolver
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
contextItem	TokenNameIdentifier	 context Item
;	TokenNameSEMICOLON	
// We always need to have a ContextNode with Xalan XPath implementation 	TokenNameCOMMENT_LINE	We always need to have a ContextNode with Xalan XPath implementation 
// To allow simple expression evaluation like 1+1 we are setting 	TokenNameCOMMENT_LINE	To allow simple expression evaluation like 1+1 we are setting 
// dummy Document as Context Node 	TokenNameCOMMENT_LINE	dummy Document as Context Node 
if	TokenNameif	
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
getDummyDocument	TokenNameIdentifier	 get Dummy Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xpathSupport	TokenNameIdentifier	 xpath Support
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Evaluate the compiled XPath expression in the specified context and * return the result as the specified type.</p> * * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec * for context item evaluation, * variable, function and QName resolution and return type conversion.</p> * * <p>If <code>returnType</code> is not one of the types defined * in {@link XPathConstants}, * then an <code>IllegalArgumentException</code> is thrown.</p> * * <p>If a <code>null</code> value is provided for * <code>item</code>, an empty document will be used for the * context. * If <code>returnType</code> is <code>null</code>, then a * <code>NullPointerException</code> is thrown.</p> * * @param item The starting context (node or node list, for example). * @param returnType The desired return type. * * @return The <code>Object</code> that is the result of evaluating the * expression and converting the result to * <code>returnType</code>. * * @throws XPathExpressionException If the expression cannot be evaluated. * @throws IllegalArgumentException If <code>returnType</code> is not one * of the types defined in {@link XPathConstants}. * @throws NullPointerException If <code>returnType</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Evaluate the compiled XPath expression in the specified context and return the result as the specified type.</p> * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec for context item evaluation, variable, function and QName resolution and return type conversion.</p> * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants}, then an <code>IllegalArgumentException</code> is thrown.</p> * <p>If a <code>null</code> value is provided for <code>item</code>, an empty document will be used for the context. If <code>returnType</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p> * @param item The starting context (node or node list, for example). @param returnType The desired return type. * @return The <code>Object</code> that is the result of evaluating the expression and converting the result to <code>returnType</code>. * @throws XPathExpressionException If the expression cannot be evaluated. @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}. @throws NullPointerException If <code>returnType</code> is <code>null</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
{	TokenNameLBRACE	
//Validating parameters to enforce constraints defined by JAXP spec 	TokenNameCOMMENT_LINE	Validating parameters to enforce constraints defined by JAXP spec 
if	TokenNameif	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Throwing NullPointerException as defined in spec 	TokenNameCOMMENT_LINE	Throwing NullPointerException as defined in spec 
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"returnType"	TokenNameStringLiteral	returnType
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Checking if requested returnType is supported. returnType need to be 	TokenNameCOMMENT_LINE	Checking if requested returnType is supported. returnType need to be 
// defined in XPathConstants 	TokenNameCOMMENT_LINE	defined in XPathConstants 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_UNSUPPORTED_RETURN_TYPE	TokenNameIdentifier	 ER  UNSUPPORTED  RETURN  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If VariableResolver returns null Or if we get 	TokenNameCOMMENT_LINE	If VariableResolver returns null Or if we get 
// NullPointerException at this stage for some other reason 	TokenNameCOMMENT_LINE	NullPointerException at this stage for some other reason 
// then we have to reurn XPathException 	TokenNameCOMMENT_LINE	then we have to reurn XPathException 
throw	TokenNamethrow	
new	TokenNamenew	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
(	TokenNameLPAREN	
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
nestedException	TokenNameIdentifier	 nested Exception
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nestedException	TokenNameIdentifier	 nested Exception
instanceof	TokenNameinstanceof	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
)	TokenNameRPAREN	
nestedException	TokenNameIdentifier	 nested Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// For any other exceptions we need to throw 	TokenNameCOMMENT_LINE	For any other exceptions we need to throw 
// XPathExpressionException ( as per spec ) 	TokenNameCOMMENT_LINE	XPathExpressionException ( as per spec ) 
throw	TokenNamethrow	
new	TokenNamenew	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Evaluate the compiled XPath expression in the specified context and * return the result as a <code>String</code>.</p> * * <p>This method calls {@link #evaluate(Object item, QName returnType)} * with a <code>returnType</code> of * {@link XPathConstants#STRING}.</p> * * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec * for context item evaluation, * variable, function and QName resolution and return type conversion.</p> * * <p>If a <code>null</code> value is provided for * <code>item</code>, an empty document will be used for the * context. * * @param item The starting context (node or node list, for example). * * @return The <code>String</code> that is the result of evaluating the * expression and converting the result to a * <code>String</code>. * * @throws XPathExpressionException If the expression cannot be evaluated. */	TokenNameCOMMENT_JAVADOC	 <p>Evaluate the compiled XPath expression in the specified context and return the result as a <code>String</code>.</p> * <p>This method calls {@link #evaluate(Object item, QName returnType)} with a <code>returnType</code> of {@link XPathConstants#STRING}.</p> * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec for context item evaluation, variable, function and QName resolution and return type conversion.</p> * <p>If a <code>null</code> value is provided for <code>item</code>, an empty document will be used for the context. * @param item The starting context (node or node list, for example). * @return The <code>String</code> that is the result of evaluating the expression and converting the result to a <code>String</code>. * @throws XPathExpressionException If the expression cannot be evaluated. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
DocumentBuilder	TokenNameIdentifier	 Document Builder
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * <p>Evaluate the compiled XPath expression in the context of the * specified <code>InputSource</code> and return the result as the * specified type.</p> * * <p>This method builds a data model for the {@link InputSource} and calls * {@link #evaluate(Object item, QName returnType)} on the resulting * document object.</p> * * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec * for context item evaluation, * variable, function and QName resolution and return type conversion.</p> * * <p>If <code>returnType</code> is not one of the types defined in * {@link XPathConstants}, * then an <code>IllegalArgumentException</code> is thrown.</p> * *<p>If <code>source</code> or <code>returnType</code> is <code>null</code>, * then a <code>NullPointerException</code> is thrown.</p> * * @param source The <code>InputSource</code> of the document to evaluate * over. * @param returnType The desired return type. * * @return The <code>Object</code> that is the result of evaluating the * expression and converting the result to * <code>returnType</code>. * * @throws XPathExpressionException If the expression cannot be evaluated. * @throws IllegalArgumentException If <code>returnType</code> is not one * of the types defined in {@link XPathConstants}. * @throws NullPointerException If <code>source</code> or * <code>returnType</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Evaluate the compiled XPath expression in the context of the specified <code>InputSource</code> and return the result as the specified type.</p> * <p>This method builds a data model for the {@link InputSource} and calls {@link #evaluate(Object item, QName returnType)} on the resulting document object.</p> * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec for context item evaluation, variable, function and QName resolution and return type conversion.</p> * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants}, then an <code>IllegalArgumentException</code> is thrown.</p> *<p>If <code>source</code> or <code>returnType</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p> * @param source The <code>InputSource</code> of the document to evaluate over. @param returnType The desired return type. * @return The <code>Object</code> that is the result of evaluating the expression and converting the result to <code>returnType</code>. * @throws XPathExpressionException If the expression cannot be evaluated. @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}. @throws NullPointerException If <code>source</code> or <code>returnType</code> is <code>null</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  RETURN  TYPE  CANNOT  BE  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Checking if requested returnType is supported. returnType need to be 	TokenNameCOMMENT_LINE	Checking if requested returnType is supported. returnType need to be 
// defined in XPathConstants 	TokenNameCOMMENT_LINE	defined in XPathConstants 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_UNSUPPORTED_RETURN_TYPE	TokenNameIdentifier	 ER  UNSUPPORTED  RETURN  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dbf	TokenNameIdentifier	 dbf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
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
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Evaluate the compiled XPath expression in the context of the specified <code>InputSource</code> and return the result as a * <code>String</code>.</p> * * <p>This method calls {@link #evaluate(InputSource source, QName returnType)} with a <code>returnType</code> of * {@link XPathConstants#STRING}.</p> * * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec * for context item evaluation, * variable, function and QName resolution and return type conversion.</p> * * <p>If <code>source</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p> * * @param source The <code>InputSource</code> of the document to evaluate over. * * @return The <code>String</code> that is the result of evaluating the expression and converting the result to a * <code>String</code>. * * @throws XPathExpressionException If the expression cannot be evaluated. * @throws NullPointerException If <code>source</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Evaluate the compiled XPath expression in the context of the specified <code>InputSource</code> and return the result as a <code>String</code>.</p> * <p>This method calls {@link #evaluate(InputSource source, QName returnType)} with a <code>returnType</code> of {@link XPathConstants#STRING}.</p> * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec for context item evaluation, variable, function and QName resolution and return type conversion.</p> * <p>If <code>source</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p> * @param source The <code>InputSource</code> of the document to evaluate over. * @return The <code>String</code> that is the result of evaluating the expression and converting the result to a <code>String</code>. * @throws XPathExpressionException If the expression cannot be evaluated. @throws NullPointerException If <code>source</code> is <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathExpressionException	TokenNameIdentifier	 X Path Expression Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isSupported	TokenNameIdentifier	 is Supported
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XPathConstants.STRING 	TokenNameCOMMENT_LINE	XPathConstants.STRING 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NODESET	TokenNameIdentifier	 NODESET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
getResultAsType	TokenNameIdentifier	 get Result As Type
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
resultObject	TokenNameIdentifier	 result Object
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
returnType	TokenNameIdentifier	 return Type
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
// XPathConstants.STRING 	TokenNameCOMMENT_LINE	XPathConstants.STRING 
if	TokenNameif	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resultObject	TokenNameIdentifier	 result Object
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XPathConstants.NUMBER 	TokenNameCOMMENT_LINE	XPathConstants.NUMBER 
if	TokenNameif	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
resultObject	TokenNameIdentifier	 result Object
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XPathConstants.BOOLEAN 	TokenNameCOMMENT_LINE	XPathConstants.BOOLEAN 
if	TokenNameif	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
resultObject	TokenNameIdentifier	 result Object
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XPathConstants.NODESET ---ORdered, UNOrdered??? 	TokenNameCOMMENT_LINE	XPathConstants.NODESET ---ORdered, UNOrdered??? 
if	TokenNameif	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NODESET	TokenNameIdentifier	 NODESET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resultObject	TokenNameIdentifier	 result Object
.	TokenNameDOT	
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XPathConstants.NODE 	TokenNameCOMMENT_LINE	XPathConstants.NODE 
if	TokenNameif	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeIterator	TokenNameIdentifier	 Node Iterator
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
resultObject	TokenNameIdentifier	 result Object
.	TokenNameDOT	
nodeset	TokenNameIdentifier	 nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Return the first node, or null 	TokenNameCOMMENT_LINE	Return the first node, or null 
return	TokenNamereturn	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If isSupported check is already done then the execution path 	TokenNameCOMMENT_LINE	If isSupported check is already done then the execution path 
// shouldn't come here. Being defensive 	TokenNameCOMMENT_LINE	shouldn't come here. Being defensive 
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_UNSUPPORTED_RETURN_TYPE	TokenNameIdentifier	 ER  UNSUPPORTED  RETURN  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
returnType	TokenNameIdentifier	 return Type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
getDummyDocument	TokenNameIdentifier	 get Dummy Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dbf	TokenNameIdentifier	 dbf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
dim	TokenNameIdentifier	 dim
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
dim	TokenNameIdentifier	 dim
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
"http://java.sun.com/jaxp/xpath"	TokenNameStringLiteral	http://java.sun.com/jaxp/xpath
,	TokenNameCOMMA	
"dummyroot"	TokenNameStringLiteral	dummyroot
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
