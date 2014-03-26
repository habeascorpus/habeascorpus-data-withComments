/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionHandler.java 468637 2006-10-28 06:51:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionHandler.java 468637 2006-10-28 06:51:02Z minchau $ 
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
/** * Abstract base class for handling an extension namespace for XPath. * Provides functions to test a function's existence and call a function. * Also provides functions for calling an element and testing for * an element's existence. * * @author Sanjiva Weerawarana (sanjiva@watson.ibm.com) * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Abstract base class for handling an extension namespace for XPath. Provides functions to test a function's existence and call a function. Also provides functions for calling an element and testing for an element's existence. * @author Sanjiva Weerawarana (sanjiva@watson.ibm.com) @xsl.usage internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
{	TokenNameLBRACE	
/** uri of the extension namespace */	TokenNameCOMMENT_JAVADOC	 uri of the extension namespace 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_namespaceUri	TokenNameIdentifier	 m namespace Uri
;	TokenNameSEMICOLON	
/** scripting language of implementation */	TokenNameCOMMENT_JAVADOC	 scripting language of implementation 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_scriptLang	TokenNameIdentifier	 m script Lang
;	TokenNameSEMICOLON	
/** * This method loads a class using the context class loader if we're * running under Java2 or higher. * * @param className Name of the class to load */	TokenNameCOMMENT_JAVADOC	 This method loads a class using the context class loader if we're running under Java2 or higher. * @param className Name of the class to load 
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
getClassForName	TokenNameIdentifier	 get Class For Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
// Hack for backwards compatibility with XalanJ1 stylesheets 	TokenNameCOMMENT_LINE	Hack for backwards compatibility with XalanJ1 stylesheets 
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"org.apache.xalan.xslt.extensions.Redirect"	TokenNameStringLiteral	org.apache.xalan.xslt.extensions.Redirect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
"org.apache.xalan.lib.Redirect"	TokenNameStringLiteral	org.apache.xalan.lib.Redirect
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new extension namespace handler given all the information * needed. * * @param namespaceUri the extension namespace URI that I'm implementing * @param scriptLang language of code implementing the extension */	TokenNameCOMMENT_JAVADOC	 Construct a new extension namespace handler given all the information needed. * @param namespaceUri the extension namespace URI that I'm implementing @param scriptLang language of code implementing the extension 
protected	TokenNameprotected	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scriptLang	TokenNameIdentifier	 script Lang
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespaceUri	TokenNameIdentifier	 m namespace Uri
=	TokenNameEQUAL	
namespaceUri	TokenNameIdentifier	 namespace Uri
;	TokenNameSEMICOLON	
m_scriptLang	TokenNameIdentifier	 m script Lang
=	TokenNameEQUAL	
scriptLang	TokenNameIdentifier	 script Lang
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether a certain function name is known within this namespace. * @param function name of the function being tested * @return true if its known, false if not. */	TokenNameCOMMENT_JAVADOC	 Tests whether a certain function name is known within this namespace. @param function name of the function being tested @return true if its known, false if not. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isFunctionAvailable	TokenNameIdentifier	 is Function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tests whether a certain element name is known within this namespace. * @param element Name of element to check * @return true if its known, false if not. */	TokenNameCOMMENT_JAVADOC	 Tests whether a certain element name is known within this namespace. @param element Name of element to check @return true if its known, false if not. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isElementAvailable	TokenNameIdentifier	 is Element Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Process a call to a function. * * @param funcName Function name. * @param args The arguments of the function call. * @param methodKey A key that uniquely identifies this class and method call. * @param exprContext The context in which this expression is being executed. * * @return the return value of the function evaluation. * * @throws TransformerException if parsing trouble */	TokenNameCOMMENT_JAVADOC	 Process a call to a function. * @param funcName Function name. @param args The arguments of the function call. @param methodKey A key that uniquely identifies this class and method call. @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException if parsing trouble 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Process a call to a function. * * @param extFunction The XPath extension function. * @param args The arguments of the function call. * @param exprContext The context in which this expression is being executed. * * @return the return value of the function evaluation. * * @throws TransformerException if parsing trouble */	TokenNameCOMMENT_JAVADOC	 Process a call to a function. * @param extFunction The XPath extension function. @param args The arguments of the function call. @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException if parsing trouble 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Process a call to this extension namespace via an element. As a side * effect, the results are sent to the TransformerImpl's result tree. * * @param localPart Element name's local part. * @param element The extension element being processed. * @param transformer Handle to TransformerImpl. * @param stylesheetTree The compiled stylesheet tree. * @param methodKey A key that uniquely identifies this class and method call. * * @throws XSLProcessorException thrown if something goes wrong * while running the extension handler. * @throws MalformedURLException if loading trouble * @throws FileNotFoundException if loading trouble * @throws IOException if loading trouble * @throws TransformerException if parsing trouble */	TokenNameCOMMENT_JAVADOC	 Process a call to this extension namespace via an element. As a side effect, the results are sent to the TransformerImpl's result tree. * @param localPart Element name's local part. @param element The extension element being processed. @param transformer Handle to TransformerImpl. @param stylesheetTree The compiled stylesheet tree. @param methodKey A key that uniquely identifies this class and method call. * @throws XSLProcessorException thrown if something goes wrong while running the extension handler. @throws MalformedURLException if loading trouble @throws FileNotFoundException if loading trouble @throws IOException if loading trouble @throws TransformerException if parsing trouble 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
