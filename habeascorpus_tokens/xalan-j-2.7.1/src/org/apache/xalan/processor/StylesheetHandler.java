/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StylesheetHandler.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StylesheetHandler.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Templates	TokenNameIdentifier	 Templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExpressionVisitor	TokenNameIdentifier	 Expression Visitor
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
ElemForEach	TokenNameIdentifier	 Elem For Each
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
BoolStack	TokenNameIdentifier	 Bool Stack
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
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
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
NodeConsumer	TokenNameIdentifier	 Node Consumer
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
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
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
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
FunctionTable	TokenNameIdentifier	 Function Table
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
Function	TokenNameIdentifier	 Function
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
;	TokenNameSEMICOLON	
/** * Initializes and processes a stylesheet via SAX events. * This class acts as essentially a state machine, maintaining * a ContentHandler stack, and pushing appropriate content * handlers as parse events occur. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Initializes and processes a stylesheet via SAX events. This class acts as essentially a state machine, maintaining a ContentHandler stack, and pushing appropriate content handlers as parse events occur. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
implements	TokenNameimplements	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
,	TokenNameCOMMA	
NodeConsumer	TokenNameIdentifier	 Node Consumer
{	TokenNameLBRACE	
/** * The function table of XPath and XSLT; */	TokenNameCOMMENT_JAVADOC	 The function table of XPath and XSLT; 
private	TokenNameprivate	
FunctionTable	TokenNameIdentifier	 Function Table
m_funcTable	TokenNameIdentifier	 m func Table
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionTable	TokenNameIdentifier	 Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The flag for the setting of the optimize feature; */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the optimize feature; 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_optimize	TokenNameIdentifier	 m optimize
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The flag for the setting of the incremental feature; */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the incremental feature; 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The flag for the setting of the source_location feature; */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the source_location feature; 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Create a StylesheetHandler object, creating a root stylesheet * as the target. * * @param processor non-null reference to the transformer factory that owns this handler. * * @throws TransformerConfigurationException if a StylesheetRoot * can not be constructed for some reason. */	TokenNameCOMMENT_JAVADOC	 Create a StylesheetHandler object, creating a root stylesheet as the target. * @param processor non-null reference to the transformer factory that owns this handler. * @throws TransformerConfigurationException if a StylesheetRoot can not be constructed for some reason. 
public	TokenNamepublic	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
(	TokenNameLPAREN	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
func	TokenNameIdentifier	 func
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
FuncDocument	TokenNameIdentifier	 Func Document
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_funcTable	TokenNameIdentifier	 m func Table
.	TokenNameDOT	
installFunction	TokenNameIdentifier	 install Function
(	TokenNameLPAREN	
"document"	TokenNameStringLiteral	document
,	TokenNameCOMMA	
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// func = new org.apache.xalan.templates.FuncKey(); 	TokenNameCOMMENT_LINE	func = new org.apache.xalan.templates.FuncKey(); 
// FunctionTable.installFunction("key", func); 	TokenNameCOMMENT_LINE	FunctionTable.installFunction("key", func); 
func	TokenNameIdentifier	 func
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
FuncFormatNumb	TokenNameIdentifier	 Func Format Numb
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_funcTable	TokenNameIdentifier	 m func Table
.	TokenNameDOT	
installFunction	TokenNameIdentifier	 install Function
(	TokenNameLPAREN	
"format-number"	TokenNameStringLiteral	format-number
,	TokenNameCOMMA	
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_optimize	TokenNameIdentifier	 m optimize
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
.	TokenNameDOT	
FEATURE_OPTIMIZE	TokenNameIdentifier	 FEATURE  OPTIMIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
.	TokenNameDOT	
FEATURE_INCREMENTAL	TokenNameIdentifier	 FEATURE  INCREMENTAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
.	TokenNameDOT	
FEATURE_SOURCE_LOCATION	TokenNameIdentifier	 FEATURE  SOURCE  LOCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_schema = new XSLTSchema(); 	TokenNameCOMMENT_LINE	m_schema = new XSLTSchema(); 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do common initialization. * * @param processor non-null reference to the transformer factory that owns this handler. */	TokenNameCOMMENT_JAVADOC	 Do common initialization. * @param processor non-null reference to the transformer factory that owns this handler. 
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
// Set the initial content handler. 	TokenNameCOMMENT_LINE	Set the initial content handler. 
m_processors	TokenNameIdentifier	 m processors
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_schema	TokenNameIdentifier	 m schema
.	TokenNameDOT	
getElementProcessor	TokenNameIdentifier	 get Element Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pushNewNamespaceSupport	TokenNameIdentifier	 push New Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_includeStack.push(SystemIDResolver.getAbsoluteURI(this.getBaseIdentifier(), null)); 	TokenNameCOMMENT_LINE	m_includeStack.push(SystemIDResolver.getAbsoluteURI(this.getBaseIdentifier(), null)); 
// initXPath(processor, null); 	TokenNameCOMMENT_LINE	initXPath(processor, null); 
}	TokenNameRBRACE	
/** * Process an expression string into an XPath. * Must be public for access by the AVT class. * * @param str A non-null reference to a valid or invalid XPath expression string. * * @return A non-null reference to an XPath object that represents the string argument. * * @throws javax.xml.transform.TransformerException if the expression can not be processed. * @see <a href="http://www.w3.org/TR/xslt#section-Expressions">Section 4 Expressions in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 Process an expression string into an XPath. Must be public for access by the AVT class. * @param str A non-null reference to a valid or invalid XPath expression string. * @return A non-null reference to an XPath object that represents the string argument. * @throws javax.xml.transform.TransformerException if the expression can not be processed. @see <a href="http://www.w3.org/TR/xslt#section-Expressions">Section 4 Expressions in XSLT Specification</a> 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
createXPath	TokenNameIdentifier	 create X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
owningTemplate	TokenNameIdentifier	 owning Template
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
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
owningTemplate	TokenNameIdentifier	 owning Template
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
m_funcTable	TokenNameIdentifier	 m func Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Visit the expression, registering namespaces for any extension functions it includes. 	TokenNameCOMMENT_LINE	Visit the expression, registering namespaces for any extension functions it includes. 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
new	TokenNamenew	
ExpressionVisitor	TokenNameIdentifier	 Expression Visitor
(	TokenNameLPAREN	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process an expression string into an XPath. * * @param str A non-null reference to a valid or invalid match pattern string. * * @return A non-null reference to an XPath object that represents the string argument. * * @throws javax.xml.transform.TransformerException if the pattern can not be processed. * @see <a href="http://www.w3.org/TR/xslt#patterns">Section 5.2 Patterns in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 Process an expression string into an XPath. * @param str A non-null reference to a valid or invalid match pattern string. * @return A non-null reference to an XPath object that represents the string argument. * @throws javax.xml.transform.TransformerException if the pattern can not be processed. @see <a href="http://www.w3.org/TR/xslt#patterns">Section 5.2 Patterns in XSLT Specification</a> 
XPath	TokenNameIdentifier	 X Path
createMatchPatternXPath	TokenNameIdentifier	 create Match Pattern X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
owningTemplate	TokenNameIdentifier	 owning Template
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
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
owningTemplate	TokenNameIdentifier	 owning Template
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH	TokenNameIdentifier	 MATCH
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
m_funcTable	TokenNameIdentifier	 m func Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Visit the expression, registering namespaces for any extension functions it includes. 	TokenNameCOMMENT_LINE	Visit the expression, registering namespaces for any extension functions it includes. 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
new	TokenNamenew	
ExpressionVisitor	TokenNameIdentifier	 Expression Visitor
(	TokenNameLPAREN	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace, get the corrisponding prefix from the current * namespace support context. * * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace. * * @return The associated Namespace URI, or null if the prefix * is undeclared in this context. */	TokenNameCOMMENT_JAVADOC	 Given a namespace, get the corrisponding prefix from the current namespace support context. * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace. * @return The associated Namespace URI, or null if the prefix is undeclared in this context. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceSupport	TokenNameIdentifier	 get Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace, get the corrisponding prefix. This is here only * to support the {@link org.apache.xml.utils.PrefixResolver} interface, * and will throw an error if invoked on this object. * * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace. * @param context The node context from which to look up the URI. * * @return The associated Namespace URI, or null if the prefix * is undeclared in this context. */	TokenNameCOMMENT_JAVADOC	 Given a namespace, get the corrisponding prefix. This is here only to support the {@link org.apache.xml.utils.PrefixResolver} interface, and will throw an error if invoked on this object. * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace. @param context The node context from which to look up the URI. * @return The associated Namespace URI, or null if the prefix is undeclared in this context. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't need to support this here. Return the current URI for the prefix, 	TokenNameCOMMENT_LINE	Don't need to support this here. Return the current URI for the prefix, 
// ignoring the context. 	TokenNameCOMMENT_LINE	ignoring the context. 
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
"can't process a context node in StylesheetHandler!"	TokenNameStringLiteral	can't process a context node in StylesheetHandler!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility function to see if the stack contains the given URL. * * @param stack non-null reference to a Stack. * @param url URL string on which an equality test will be performed. * * @return true if the stack contains the url argument. */	TokenNameCOMMENT_JAVADOC	 Utility function to see if the stack contains the given URL. * @param stack non-null reference to a Stack. @param url URL string on which an equality test will be performed. * @return true if the stack contains the url argument. 
private	TokenNameprivate	
boolean	TokenNameboolean	
stackContains	TokenNameIdentifier	 stack Contains
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
=	TokenNameEQUAL	
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
String	TokenNameIdentifier	 String
url2	TokenNameIdentifier	 url2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url2	TokenNameIdentifier	 url2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contains	TokenNameIdentifier	 contains
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
contains	TokenNameIdentifier	 contains
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of the TRAX TemplatesBuilder interface. 	TokenNameCOMMENT_LINE	Implementation of the TRAX TemplatesBuilder interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * When this object is used as a ContentHandler or ContentHandler, it will * create a Templates object, which the caller can get once * the SAX events have been completed. * @return The stylesheet object that was created during * the SAX event process, or null if no stylesheet has * been created. * * Author <a href="mailto:scott_boag@lotus.com">Scott Boag</a> * * */	TokenNameCOMMENT_JAVADOC	 When this object is used as a ContentHandler or ContentHandler, it will create a Templates object, which the caller can get once the SAX events have been completed. @return The stylesheet object that was created during the SAX event process, or null if no stylesheet has been created. * Author <a href="mailto:scott_boag@lotus.com">Scott Boag</a> * 
public	TokenNamepublic	
Templates	TokenNameIdentifier	 Templates
getTemplates	TokenNameIdentifier	 get Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base ID (URL or system ID) for the stylesheet * created by this builder. This must be set in order to * resolve relative URLs in the stylesheet. * * @param baseID Base URL for this stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set the base ID (URL or system ID) for the stylesheet created by this builder. This must be set in order to resolve relative URLs in the stylesheet. * @param baseID Base URL for this stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushBaseIndentifier	TokenNameIdentifier	 push Base Indentifier
(	TokenNameLPAREN	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the base ID (URI or system ID) from where relative * URLs will be resolved. * * @return The systemID that was set with {@link #setSystemId}. */	TokenNameCOMMENT_JAVADOC	 Get the base ID (URI or system ID) from where relative URLs will be resolved. * @return The systemID that was set with {@link #setSystemId}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of the EntityResolver interface. 	TokenNameCOMMENT_LINE	Implementation of the EntityResolver interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Resolve an external entity. * * @param publicId The public identifer, or null if none is * available. * @param systemId The system identifier provided in the XML * document. * @return The new input source, or null to require the * default behaviour. * * @throws org.xml.sax.SAXException if the entity can not be resolved. */	TokenNameCOMMENT_JAVADOC	 Resolve an external entity. * @param publicId The public identifer, or null if none is available. @param systemId The system identifier provided in the XML document. @return The new input source, or null to require the default behaviour. * @throws org.xml.sax.SAXException if the entity can not be resolved. 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of DTDHandler interface. 	TokenNameCOMMENT_LINE	Implementation of DTDHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive notification of a notation declaration. * * <p>By default, do nothing. Application writers may override this * method in a subclass if they wish to keep track of the notations * declared in a document.</p> * * @param name The notation name. * @param publicId The notation public identifier, or null if not * available. * @param systemId The notation system identifier. * @see org.xml.sax.DTDHandler#notationDecl */	TokenNameCOMMENT_JAVADOC	 Receive notification of a notation declaration. * <p>By default, do nothing. Application writers may override this method in a subclass if they wish to keep track of the notations declared in a document.</p> * @param name The notation name. @param publicId The notation public identifier, or null if not available. @param systemId The notation system identifier. @see org.xml.sax.DTDHandler#notationDecl 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of an unparsed entity declaration. * * @param name The entity name. * @param publicId The entity public identifier, or null if not * available. * @param systemId The entity system identifier. * @param notationName The name of the associated notation. * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Receive notification of an unparsed entity declaration. * @param name The entity name. @param publicId The entity public identifier, or null if not available. @param systemId The entity system identifier. @param notationName The name of the associated notation. @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace URI, and a local name or a node type, get the processor * for the element, or return null if not allowed. * * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). * * @return A non-null reference to a element processor. * * @throws org.xml.sax.SAXException if the element is not allowed in the * found position in the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Given a namespace URI, and a local name or a node type, get the processor for the element, or return null if not allowed. * @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). * @return A non-null reference to a element processor. * @throws org.xml.sax.SAXException if the element is not allowed in the found position in the stylesheet. 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
currentProcessor	TokenNameIdentifier	 current Processor
=	TokenNameEQUAL	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
currentProcessor	TokenNameIdentifier	 current Processor
.	TokenNameDOT	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
currentProcessor	TokenNameIdentifier	 current Processor
instanceof	TokenNameinstanceof	
ProcessorStylesheetDoc	TokenNameIdentifier	 Processor Stylesheet Doc
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XSLTVERSUPPORTED	TokenNameIdentifier	 XSLTVERSUPPORTED
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
currentProcessor	TokenNameIdentifier	 current Processor
instanceof	TokenNameinstanceof	
ProcessorStylesheetElement	TokenNameIdentifier	 Processor Stylesheet Element
)	TokenNameRPAREN	
||	TokenNameOR_OR	
getElemVersion	TokenNameIdentifier	 get Elem Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XSLTVERSUPPORTED	TokenNameIdentifier	 XSLTVERSUPPORTED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getProcessorForUnknown	TokenNameIdentifier	 get Processor For Unknown
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
)	TokenNameRPAREN	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawName	TokenNameIdentifier	 raw Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//rawName + " is not allowed in this position in the stylesheet!", 	TokenNameCOMMENT_LINE	rawName + " is not allowed in this position in the stylesheet!", 
return	TokenNamereturn	
elemProcessor	TokenNameIdentifier	 elem Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of ContentHandler interface. 	TokenNameCOMMENT_LINE	Implementation of ContentHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive a Locator object for document events. * This is called by the parser to push a locator for the * stylesheet being parsed. The stack needs to be popped * after the stylesheet has been parsed. We pop in * popStylesheet. * * @param locator A locator for all SAX document events. * @see org.xml.sax.ContentHandler#setDocumentLocator * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive a Locator object for document events. This is called by the parser to push a locator for the stylesheet being parsed. The stack needs to be popped after the stylesheet has been parsed. We pop in popStylesheet. * @param locator A locator for all SAX document events. @see org.xml.sax.ContentHandler#setDocumentLocator @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("pushing locator for: "+locator.getSystemId()); 	TokenNameCOMMENT_LINE	System.out.println("pushing locator for: "+locator.getSystemId()); 
m_stylesheetLocatorStack	TokenNameIdentifier	 m stylesheet Locator Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The level of the stylesheet we are at. */	TokenNameCOMMENT_JAVADOC	 The level of the stylesheet we are at. 
private	TokenNameprivate	
int	TokenNameint	
m_stylesheetLevel	TokenNameIdentifier	 m stylesheet Level
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Receive notification of the beginning of the document. * * @see org.xml.sax.ContentHandler#startDocument * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of the document. * @see org.xml.sax.ContentHandler#startDocument * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_stylesheetLevel	TokenNameIdentifier	 m stylesheet Level
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pushSpaceHandling	TokenNameIdentifier	 push Space Handling
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** m_parsingComplete becomes true when the top-level stylesheet and all * its included/imported stylesheets have been been fully parsed, as an * indication that composition/optimization/compilation can begin. * @see isStylesheetParsingComplete */	TokenNameCOMMENT_JAVADOC	 m_parsingComplete becomes true when the top-level stylesheet and all its included/imported stylesheets have been been fully parsed, as an indication that composition/optimization/compilation can begin. @see isStylesheetParsingComplete 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_parsingComplete	TokenNameIdentifier	 m parsing Complete
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Test whether the _last_ endDocument() has been processed. * This is needed as guidance for stylesheet optimization * and compilation engines, which generally don't want to start * until all included and imported stylesheets have been fully * parsed. * * @return true iff the complete stylesheet tree has been built. */	TokenNameCOMMENT_JAVADOC	 Test whether the _last_ endDocument() has been processed. This is needed as guidance for stylesheet optimization and compilation engines, which generally don't want to start until all included and imported stylesheets have been fully parsed. * @return true iff the complete stylesheet tree has been built. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStylesheetParsingComplete	TokenNameIdentifier	 is Stylesheet Parsing Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_parsingComplete	TokenNameIdentifier	 m parsing Complete
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of the document. * * @see org.xml.sax.ContentHandler#endDocument * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of the document. * @see org.xml.sax.ContentHandler#endDocument * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_stylesheetLevel	TokenNameIdentifier	 m stylesheet Level
)	TokenNameRPAREN	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Did not find the stylesheet root!"); 	TokenNameCOMMENT_LINE	"Did not find the stylesheet root!"); 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
)	TokenNameRPAREN	
elemProcessor	TokenNameIdentifier	 elem Processor
.	TokenNameDOT	
startNonText	TokenNameIdentifier	 start Non Text
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stylesheetLevel	TokenNameIdentifier	 m stylesheet Level
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
popSpaceHandling	TokenNameIdentifier	 pop Space Handling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// WARNING: This test works only as long as stylesheets are parsed 	TokenNameCOMMENT_LINE	WARNING: This test works only as long as stylesheets are parsed 
// more or less recursively. If we switch to an iterative "work-list" 	TokenNameCOMMENT_LINE	more or less recursively. If we switch to an iterative "work-list" 
// model, this will become true prematurely. In that case, 	TokenNameCOMMENT_LINE	model, this will become true prematurely. In that case, 
// isStylesheetParsingComplete() will have to be adjusted to be aware 	TokenNameCOMMENT_LINE	isStylesheetParsingComplete() will have to be adjusted to be aware 
// of the worklist. 	TokenNameCOMMENT_LINE	of the worklist. 
m_parsingComplete	TokenNameIdentifier	 m parsing Complete
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_stylesheetLevel	TokenNameIdentifier	 m stylesheet Level
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Receive notification of the start of a Namespace mapping. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each element (such as allocating a new tree node or writing * output to a file).</p> * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI mapped to the prefix. * @see org.xml.sax.ContentHandler#startPrefixMapping * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of a Namespace mapping. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each element (such as allocating a new tree node or writing output to a file).</p> * @param prefix The Namespace prefix being declared. @param uri The Namespace URI mapped to the prefix. @see org.xml.sax.ContentHandler#startPrefixMapping * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// m_nsSupport.pushContext(); 	TokenNameCOMMENT_LINE	m_nsSupport.pushContext(); 
// this.getNamespaceSupport().declarePrefix(prefix, uri); 	TokenNameCOMMENT_LINE	this.getNamespaceSupport().declarePrefix(prefix, uri); 
//m_prefixMappings.add(prefix); // JDK 1.2+ only -sc 	TokenNameCOMMENT_LINE	m_prefixMappings.add(prefix); // JDK 1.2+ only -sc 
//m_prefixMappings.add(uri); // JDK 1.2+ only -sc 	TokenNameCOMMENT_LINE	m_prefixMappings.add(uri); // JDK 1.2+ only -sc 
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JDK 1.1.x compat -sc 	TokenNameCOMMENT_LINE	JDK 1.1.x compat -sc 
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JDK 1.1.x compat -sc 	TokenNameCOMMENT_LINE	JDK 1.1.x compat -sc 
}	TokenNameRBRACE	
/** * Receive notification of the end of a Namespace mapping. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each element (such as allocating a new tree node or writing * output to a file).</p> * * @param prefix The Namespace prefix being declared. * @see org.xml.sax.ContentHandler#endPrefixMapping * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a Namespace mapping. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each element (such as allocating a new tree node or writing output to a file).</p> * @param prefix The Namespace prefix being declared. @see org.xml.sax.ContentHandler#endPrefixMapping * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// m_nsSupport.popContext(); 	TokenNameCOMMENT_LINE	m_nsSupport.popContext(); 
}	TokenNameRBRACE	
/** * Flush the characters buffer. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Flush the characters buffer. * @throws org.xml.sax.SAXException 
private	TokenNameprivate	
void	TokenNamevoid	
flushCharacters	TokenNameIdentifier	 flush Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
)	TokenNameRPAREN	
elemProcessor	TokenNameIdentifier	 elem Processor
.	TokenNameDOT	
startNonText	TokenNameIdentifier	 start Non Text
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the start of an element. * * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). * @param attributes The specified or defaulted attributes. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an element. * @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). @param attributes The specified or defaulted attributes. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
nssupport	TokenNameIdentifier	 nssupport
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceSupport	TokenNameIdentifier	 get Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nssupport	TokenNameIdentifier	 nssupport
.	TokenNameDOT	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nssupport	TokenNameIdentifier	 nssupport
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
nsURI	TokenNameIdentifier	 ns URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//m_prefixMappings.clear(); // JDK 1.2+ only -sc 	TokenNameCOMMENT_LINE	m_prefixMappings.clear(); // JDK 1.2+ only -sc 
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JDK 1.1.x compat -sc 	TokenNameCOMMENT_LINE	JDK 1.1.x compat -sc 
m_elementID	TokenNameIdentifier	 m element ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// This check is currently done for all elements. We should possibly consider 	TokenNameCOMMENT_LINE	This check is currently done for all elements. We should possibly consider 
// limiting this check to xsl:stylesheet elements only since that is all it really 	TokenNameCOMMENT_LINE	limiting this check to xsl:stylesheet elements only since that is all it really 
// applies to. Also, it could be bypassed if m_shouldProcess is already true. 	TokenNameCOMMENT_LINE	applies to. Also, it could be bypassed if m_shouldProcess is already true. 
// In other words, the next two statements could instead look something like this: 	TokenNameCOMMENT_LINE	In other words, the next two statements could instead look something like this: 
// if (!m_shouldProcess) 	TokenNameCOMMENT_LINE	if (!m_shouldProcess) 
// { 	TokenNameCOMMENT_LINE	{ 
// if (localName.equals(Constants.ELEMNAME_STYLESHEET_STRING) && 	TokenNameCOMMENT_LINE	if (localName.equals(Constants.ELEMNAME_STYLESHEET_STRING) && 
// url.equals(Constants.S_XSLNAMESPACEURL)) 	TokenNameCOMMENT_LINE	url.equals(Constants.S_XSLNAMESPACEURL)) 
// { 	TokenNameCOMMENT_LINE	{ 
// checkForFragmentID(attributes); 	TokenNameCOMMENT_LINE	checkForFragmentID(attributes); 
// if (!m_shouldProcess) 	TokenNameCOMMENT_LINE	if (!m_shouldProcess) 
// return; 	TokenNameCOMMENT_LINE	return; 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// return; 	TokenNameCOMMENT_LINE	return; 
// } 	TokenNameCOMMENT_LINE	} 
// I didn't include this code statement at this time because in practice 	TokenNameCOMMENT_LINE	I didn't include this code statement at this time because in practice 
// it is a small performance hit and I was waiting to see if its absence 	TokenNameCOMMENT_LINE	it is a small performance hit and I was waiting to see if its absence 
// caused a problem. - GLP 	TokenNameCOMMENT_LINE	caused a problem. - GLP 
checkForFragmentID	TokenNameIdentifier	 check For Fragment ID
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
flushCharacters	TokenNameIdentifier	 flush Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushSpaceHandling	TokenNameIdentifier	 push Space Handling
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
)	TokenNameRPAREN	
// defensive, for better multiple error reporting. -sb 	TokenNameCOMMENT_LINE	defensive, for better multiple error reporting. -sb 
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pushProcessor	TokenNameIdentifier	 push Processor
(	TokenNameLPAREN	
elemProcessor	TokenNameIdentifier	 elem Processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemProcessor	TokenNameIdentifier	 elem Processor
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
popSpaceHandling	TokenNameIdentifier	 pop Space Handling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). * @see org.xml.sax.ContentHandler#endElement * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). @see org.xml.sax.ContentHandler#endElement * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_elementID	TokenNameIdentifier	 m element ID
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_elementID	TokenNameIdentifier	 m element ID
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
m_fragmentID	TokenNameIdentifier	 m fragment ID
)	TokenNameRPAREN	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
flushCharacters	TokenNameIdentifier	 flush Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popSpaceHandling	TokenNameIdentifier	 pop Space Handling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
popProcessor	TokenNameIdentifier	 pop Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
getNamespaceSupport	TokenNameIdentifier	 get Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data inside an element. * * @param ch The characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @see org.xml.sax.ContentHandler#characters * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data inside an element. * @param ch The characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @see org.xml.sax.ContentHandler#characters * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
.	TokenNameDOT	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
.	TokenNameDOT	
T_PCDATA	TokenNameIdentifier	 T  PCDATA
)	TokenNameRPAREN	
elemProcessor	TokenNameIdentifier	 elem Processor
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"text()"	TokenNameStringLiteral	text()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
elemProcessor	TokenNameIdentifier	 elem Processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it's whitespace, just ignore it, otherwise flag an error. 	TokenNameCOMMENT_LINE	If it's whitespace, just ignore it, otherwise flag an error. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Non-whitespace text is not allowed in this position in the stylesheet!", 	TokenNameCOMMENT_LINE	"Non-whitespace text is not allowed in this position in the stylesheet!", 
}	TokenNameRBRACE	
else	TokenNameelse	
elemProcessor	TokenNameIdentifier	 elem Processor
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of ignorable whitespace in element content. * * @param ch The whitespace characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @see org.xml.sax.ContentHandler#ignorableWhitespace * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * @param ch The whitespace characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @see org.xml.sax.ContentHandler#ignorableWhitespace * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * <p>The Parser will invoke this method once for each processing * instruction found: note that processing instructions may occur * before or after the main document element.</p> * * <p>A SAX parser should never report an XML declaration (XML 1.0, * section 2.8) or a text declaration (XML 1.0, section 4.3.1) * using this method.</p> * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions for each * processing instruction, such as setting status variables or * invoking other methods.</p> * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none is supplied. * @see org.xml.sax.ContentHandler#processingInstruction * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * <p>The Parser will invoke this method once for each processing instruction found: note that processing instructions may occur before or after the main document element.</p> * <p>A SAX parser should never report an XML declaration (XML 1.0, section 2.8) or a text declaration (XML 1.0, section 4.3.1) using this method.</p> * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions for each processing instruction, such as setting status variables or invoking other methods.</p> * @param target The processing instruction target. @param data The processing instruction data, or null if none is supplied. @see org.xml.sax.ContentHandler#processingInstruction * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Recreating Scott's kluge: 	TokenNameCOMMENT_LINE	Recreating Scott's kluge: 
// A xsl:for-each or xsl:apply-templates may have a special 	TokenNameCOMMENT_LINE	A xsl:for-each or xsl:apply-templates may have a special 
// PI that tells us not to cache the document. This PI 	TokenNameCOMMENT_LINE	PI that tells us not to cache the document. This PI 
// should really be namespaced. 	TokenNameCOMMENT_LINE	should really be namespaced. 
// String localName = getLocalName(target); 	TokenNameCOMMENT_LINE	String localName = getLocalName(target); 
// String ns = m_stylesheet.getNamespaceFromStack(target); 	TokenNameCOMMENT_LINE	String ns = m_stylesheet.getNamespaceFromStack(target); 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW%: We need a better PI architecture 	TokenNameCOMMENT_LINE	%REVIEW%: We need a better PI architecture 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
int	TokenNameint	
colon	TokenNameIdentifier	 colon
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colon	TokenNameIdentifier	 colon
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// A xsl:for-each or xsl:apply-templates may have a special 	TokenNameCOMMENT_LINE	A xsl:for-each or xsl:apply-templates may have a special 
// PI that tells us not to cache the document. This PI 	TokenNameCOMMENT_LINE	PI that tells us not to cache the document. This PI 
// should really be namespaced... but since the XML Namespaces 	TokenNameCOMMENT_LINE	should really be namespaced... but since the XML Namespaces 
// spec never defined namespaces as applying to PI's, and since 	TokenNameCOMMENT_LINE	spec never defined namespaces as applying to PI's, and since 
// the testcase we're trying to support is inconsistant in whether 	TokenNameCOMMENT_LINE	the testcase we're trying to support is inconsistant in whether 
// it binds the prefix, I'm going to make this sloppy for 	TokenNameCOMMENT_LINE	it binds the prefix, I'm going to make this sloppy for 
// testing purposes. 	TokenNameCOMMENT_LINE	testing purposes. 
if	TokenNameif	
(	TokenNameLPAREN	
"xalan-doc-cache-off"	TokenNameStringLiteral	xalan-doc-cache-off
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"xalan:doc-cache-off"	TokenNameStringLiteral	xalan:doc-cache-off
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
"doc-cache-off"	TokenNameStringLiteral	doc-cache-off
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"org.apache.xalan.xslt.extensions.Redirect"	TokenNameStringLiteral	org.apache.xalan.xslt.extensions.Redirect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
m_elems	TokenNameIdentifier	 m elems
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ElemForEach	TokenNameIdentifier	 Elem For Each
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
"xalan:doc-cache-off not allowed here!"	TokenNameStringLiteral	xalan:doc-cache-off not allowed here!
,	TokenNameCOMMA	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemForEach	TokenNameIdentifier	 Elem For Each
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemForEach	TokenNameIdentifier	 Elem For Each
)	TokenNameRPAREN	
m_elems	TokenNameIdentifier	 m elems
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
m_doc_cache_off	TokenNameIdentifier	 m doc cache off
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//System.out.println("JJK***** Recognized <? {"+ns+"}"+prefix+":"+localName+" "+data+"?>"); 	TokenNameCOMMENT_LINE	System.out.println("JJK***** Recognized <? {"+ns+"}"+prefix+":"+localName+" "+data+"?>"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JJK: Officially, unknown PIs can just be ignored. 	TokenNameCOMMENT_LINE	JJK: Officially, unknown PIs can just be ignored. 
// Do we want to issue a warning? 	TokenNameCOMMENT_LINE	Do we want to issue a warning? 
}	TokenNameRBRACE	
flushCharacters	TokenNameIdentifier	 flush Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a skipped entity. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions for each * processing instruction, such as setting status variables or * invoking other methods.</p> * * @param name The name of the skipped entity. * @see org.xml.sax.ContentHandler#processingInstruction * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a skipped entity. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions for each processing instruction, such as setting status variables or invoking other methods.</p> * @param name The name of the skipped entity. @see org.xml.sax.ContentHandler#processingInstruction * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Warn the user of an problem. * * @param msg An key into the {@link org.apache.xalan.res.XSLTErrorResources} * table, that is one of the WG_ prefixed definitions. * @param args An array of arguments for the given warning. * * @throws org.xml.sax.SAXException that wraps a * {@link javax.xml.transform.TransformerException} if the current * {@link javax.xml.transform.ErrorListener#warning} * method chooses to flag this condition as an error. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Warn the user of an problem. * @param msg An key into the {@link org.apache.xalan.res.XSLTErrorResources} table, that is one of the WG_ prefixed definitions. @param args An array of arguments for the given warning. * @throws org.xml.sax.SAXException that wraps a {@link javax.xml.transform.TransformerException} if the current {@link javax.xml.transform.ErrorListener#warning} method chooses to flag this condition as an error. @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createWarning	TokenNameIdentifier	 create Warning
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Assert that a condition is true. If it is not true, throw an error. * * @param condition false if an error should not be thrown, otherwise true. * @param msg Error message to be passed to the RuntimeException as an * argument. * @throws RuntimeException if the condition is not true. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Assert that a condition is true. If it is not true, throw an error. * @param condition false if an error should not be thrown, otherwise true. @param msg Error message to be passed to the RuntimeException as an argument. @throws RuntimeException if the condition is not true. @xsl.usage internal 
private	TokenNameprivate	
void	TokenNamevoid	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg An error message. * @param e An error which the SAXException should wrap. * * @throws org.xml.sax.SAXException that wraps a * {@link javax.xml.transform.TransformerException} if the current * {@link javax.xml.transform.ErrorListener#error} * method chooses to flag this condition as an error. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg An error message. @param e An error which the SAXException should wrap. * @throws org.xml.sax.SAXException that wraps a {@link javax.xml.transform.TransformerException} if the current {@link javax.xml.transform.ErrorListener#error} method chooses to flag this condition as an error. @xsl.usage internal 
protected	TokenNameprotected	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerException	TokenNameIdentifier	 Transformer Exception
pe	TokenNameIdentifier	 pe
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg A key into the {@link org.apache.xalan.res.XSLTErrorResources} * table, that is one of the WG_ prefixed definitions. * @param args An array of arguments for the given warning. * @param e An error which the SAXException should wrap. * * @throws org.xml.sax.SAXException that wraps a * {@link javax.xml.transform.TransformerException} if the current * {@link javax.xml.transform.ErrorListener#error} * method chooses to flag this condition as an error. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg A key into the {@link org.apache.xalan.res.XSLTErrorResources} table, that is one of the WG_ prefixed definitions. @param args An array of arguments for the given warning. @param e An error which the SAXException should wrap. * @throws org.xml.sax.SAXException that wraps a {@link javax.xml.transform.TransformerException} if the current {@link javax.xml.transform.ErrorListener#error} method chooses to flag this condition as an error. @xsl.usage internal 
protected	TokenNameprotected	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a XSLT processing warning. * * @param e The warning information encoded as an exception. * * @throws org.xml.sax.SAXException that wraps a * {@link javax.xml.transform.TransformerException} if the current * {@link javax.xml.transform.ErrorListener#warning} * method chooses to flag this condition as an error. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a XSLT processing warning. * @param e The warning information encoded as an exception. * @throws org.xml.sax.SAXException that wraps a {@link javax.xml.transform.TransformerException} if the current {@link javax.xml.transform.ErrorListener#warning} method chooses to flag this condition as an error. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of a recoverable XSLT processing error. * * @param e The error information encoded as an exception. * * @throws org.xml.sax.SAXException that wraps a * {@link javax.xml.transform.TransformerException} if the current * {@link javax.xml.transform.ErrorListener#error} * method chooses to flag this condition as an error. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable XSLT processing error. * @param e The error information encoded as an exception. * @throws org.xml.sax.SAXException that wraps a {@link javax.xml.transform.TransformerException} if the current {@link javax.xml.transform.ErrorListener#error} method chooses to flag this condition as an error. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report a fatal XSLT processing error. * * @param e The error information encoded as an exception. * * @throws org.xml.sax.SAXException that wraps a * {@link javax.xml.transform.TransformerException} if the current * {@link javax.xml.transform.ErrorListener#fatalError} * method chooses to flag this condition as an error. */	TokenNameCOMMENT_JAVADOC	 Report a fatal XSLT processing error. * @param e The error information encoded as an exception. * @throws org.xml.sax.SAXException that wraps a {@link javax.xml.transform.TransformerException} if the current {@link javax.xml.transform.ErrorListener#fatalError} method chooses to flag this condition as an error. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If we have a URL to a XML fragment, this is set * to false until the ID is found. * (warning: I worry that this should be in a stack). */	TokenNameCOMMENT_JAVADOC	 If we have a URL to a XML fragment, this is set to false until the ID is found. (warning: I worry that this should be in a stack). 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * If we have a URL to a XML fragment, the value is stored * in this string, and the m_shouldProcess flag is set to * false until we match an ID with this string. * (warning: I worry that this should be in a stack). */	TokenNameCOMMENT_JAVADOC	 If we have a URL to a XML fragment, the value is stored in this string, and the m_shouldProcess flag is set to false until we match an ID with this string. (warning: I worry that this should be in a stack). 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_fragmentIDString	TokenNameIdentifier	 m fragment ID String
;	TokenNameSEMICOLON	
/** * Keep track of the elementID, so we can tell when * is has completed. This isn't a real ID, but rather * a nesting level. However, it's good enough for * our purposes. * (warning: I worry that this should be in a stack). */	TokenNameCOMMENT_JAVADOC	 Keep track of the elementID, so we can tell when is has completed. This isn't a real ID, but rather a nesting level. However, it's good enough for our purposes. (warning: I worry that this should be in a stack). 
private	TokenNameprivate	
int	TokenNameint	
m_elementID	TokenNameIdentifier	 m element ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The ID of the fragment that has been found * (warning: I worry that this should be in a stack). */	TokenNameCOMMENT_JAVADOC	 The ID of the fragment that has been found (warning: I worry that this should be in a stack). 
private	TokenNameprivate	
int	TokenNameint	
m_fragmentID	TokenNameIdentifier	 m fragment ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Check to see if an ID attribute matched the #id, called * from startElement. * * @param attributes The specified or defaulted attributes. */	TokenNameCOMMENT_JAVADOC	 Check to see if an ID attribute matched the #id, called from startElement. * @param attributes The specified or defaulted attributes. 
private	TokenNameprivate	
void	TokenNamevoid	
checkForFragmentID	TokenNameIdentifier	 check For Fragment ID
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_shouldProcess	TokenNameIdentifier	 m should Process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_fragmentIDString	TokenNameIdentifier	 m fragment ID String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_ID	TokenNameIdentifier	 ATTRNAME  ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
m_fragmentIDString	TokenNameIdentifier	 m fragment ID String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_fragmentID	TokenNameIdentifier	 m fragment ID
=	TokenNameEQUAL	
m_elementID	TokenNameIdentifier	 m element ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The XSLT TransformerFactory for needed services. */	TokenNameCOMMENT_JAVADOC	 The XSLT TransformerFactory for needed services. 
private	TokenNameprivate	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
;	TokenNameSEMICOLON	
/** * Get the XSLT TransformerFactoryImpl for needed services. * TODO: This method should be renamed. * * @return The TransformerFactoryImpl that owns this handler. */	TokenNameCOMMENT_JAVADOC	 Get the XSLT TransformerFactoryImpl for needed services. TODO: This method should be renamed. * @return The TransformerFactoryImpl that owns this handler. 
public	TokenNamepublic	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
getStylesheetProcessor	TokenNameIdentifier	 get Stylesheet Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If getStylesheetType returns this value, the current stylesheet * is a root stylesheet. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 If getStylesheetType returns this value, the current stylesheet is a root stylesheet. @xsl.usage internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STYPE_ROOT	TokenNameIdentifier	 STYPE  ROOT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If getStylesheetType returns this value, the current stylesheet * is an included stylesheet. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 If getStylesheetType returns this value, the current stylesheet is an included stylesheet. @xsl.usage internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STYPE_INCLUDE	TokenNameIdentifier	 STYPE  INCLUDE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If getStylesheetType returns this value, the current stylesheet * is an imported stylesheet. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 If getStylesheetType returns this value, the current stylesheet is an imported stylesheet. @xsl.usage internal 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STYPE_IMPORT	TokenNameIdentifier	 STYPE  IMPORT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The current stylesheet type. */	TokenNameCOMMENT_JAVADOC	 The current stylesheet type. 
private	TokenNameprivate	
int	TokenNameint	
m_stylesheetType	TokenNameIdentifier	 m stylesheet Type
=	TokenNameEQUAL	
STYPE_ROOT	TokenNameIdentifier	 STYPE  ROOT
;	TokenNameSEMICOLON	
/** * Get the type of stylesheet that should be built * or is being processed. * * @return one of STYPE_ROOT, STYPE_INCLUDE, or STYPE_IMPORT. */	TokenNameCOMMENT_JAVADOC	 Get the type of stylesheet that should be built or is being processed. * @return one of STYPE_ROOT, STYPE_INCLUDE, or STYPE_IMPORT. 
int	TokenNameint	
getStylesheetType	TokenNameIdentifier	 get Stylesheet Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheetType	TokenNameIdentifier	 m stylesheet Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the type of stylesheet that should be built * or is being processed. * * @param type Must be one of STYPE_ROOT, STYPE_INCLUDE, or STYPE_IMPORT. */	TokenNameCOMMENT_JAVADOC	 Set the type of stylesheet that should be built or is being processed. * @param type Must be one of STYPE_ROOT, STYPE_INCLUDE, or STYPE_IMPORT. 
void	TokenNamevoid	
setStylesheetType	TokenNameIdentifier	 set Stylesheet Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetType	TokenNameIdentifier	 m stylesheet Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The stack of stylesheets being processed. */	TokenNameCOMMENT_JAVADOC	 The stack of stylesheets being processed. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_stylesheets	TokenNameIdentifier	 m stylesheets
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the stylesheet that this handler is constructing. * * @return The current stylesheet that is on top of the stylesheets stack, * or null if no stylesheet is on the stylesheets stack. */	TokenNameCOMMENT_JAVADOC	 Return the stylesheet that this handler is constructing. * @return The current stylesheet that is on top of the stylesheets stack, or null if no stylesheet is on the stylesheets stack. 
Stylesheet	TokenNameIdentifier	 Stylesheet
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the last stylesheet that was popped off the stylesheets stack. * * @return The last popped stylesheet, or null. */	TokenNameCOMMENT_JAVADOC	 Return the last stylesheet that was popped off the stylesheets stack. * @return The last popped stylesheet, or null. 
Stylesheet	TokenNameIdentifier	 Stylesheet
getLastPoppedStylesheet	TokenNameIdentifier	 get Last Popped Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lastPoppedStylesheet	TokenNameIdentifier	 m last Popped Stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the stylesheet root that this handler is constructing. * * @return The root stylesheet of the stylesheets tree. */	TokenNameCOMMENT_JAVADOC	 Return the stylesheet root that this handler is constructing. * @return The root stylesheet of the stylesheets tree. 
public	TokenNamepublic	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
setOptimizer	TokenNameIdentifier	 set Optimizer
(	TokenNameLPAREN	
m_optimize	TokenNameIdentifier	 m optimize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
setIncremental	TokenNameIdentifier	 set Incremental
(	TokenNameLPAREN	
m_incremental	TokenNameIdentifier	 m incremental
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
.	TokenNameDOT	
setSource_location	TokenNameIdentifier	 set Source location
(	TokenNameLPAREN	
m_source_location	TokenNameIdentifier	 m source location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The root stylesheet of the stylesheets tree. */	TokenNameCOMMENT_JAVADOC	 The root stylesheet of the stylesheets tree. 
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
;	TokenNameSEMICOLON	
/** The last stylesheet that was popped off the stylesheets stack. */	TokenNameCOMMENT_JAVADOC	 The last stylesheet that was popped off the stylesheets stack. 
Stylesheet	TokenNameIdentifier	 Stylesheet
m_lastPoppedStylesheet	TokenNameIdentifier	 m last Popped Stylesheet
;	TokenNameSEMICOLON	
/** * Push the current stylesheet being constructed. If no other stylesheets * have been pushed onto the stack, assume the argument is a stylesheet * root, and also set the stylesheet root member. * * @param s non-null reference to a stylesheet. */	TokenNameCOMMENT_JAVADOC	 Push the current stylesheet being constructed. If no other stylesheets have been pushed onto the stack, assume the argument is a stylesheet root, and also set the stylesheet root member. * @param s non-null reference to a stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
pushStylesheet	TokenNameIdentifier	 push Stylesheet
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the last stylesheet pushed, and return the stylesheet that this * handler is constructing, and set the last popped stylesheet member. * Also pop the stylesheet locator stack. * * @return The stylesheet popped off the stack, or the last popped stylesheet. */	TokenNameCOMMENT_JAVADOC	 Pop the last stylesheet pushed, and return the stylesheet that this handler is constructing, and set the last popped stylesheet member. Also pop the stylesheet locator stack. * @return The stylesheet popped off the stack, or the last popped stylesheet. 
Stylesheet	TokenNameIdentifier	 Stylesheet
popStylesheet	TokenNameIdentifier	 pop Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The stylesheetLocatorStack needs to be popped because 	TokenNameCOMMENT_LINE	The stylesheetLocatorStack needs to be popped because 
// a locator was pushed in for this stylesheet by the SAXparser by calling 	TokenNameCOMMENT_LINE	a locator was pushed in for this stylesheet by the SAXparser by calling 
// setDocumentLocator(). 	TokenNameCOMMENT_LINE	setDocumentLocator(). 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_stylesheetLocatorStack	TokenNameIdentifier	 m stylesheet Locator Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_stylesheetLocatorStack	TokenNameIdentifier	 m stylesheet Locator Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_lastPoppedStylesheet	TokenNameIdentifier	 m last Popped Stylesheet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Shouldn't this be null if stylesheets is empty? -sb 	TokenNameCOMMENT_LINE	Shouldn't this be null if stylesheets is empty? -sb 
return	TokenNamereturn	
m_lastPoppedStylesheet	TokenNameIdentifier	 m last Popped Stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The stack of current processors. */	TokenNameCOMMENT_JAVADOC	 The stack of current processors. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_processors	TokenNameIdentifier	 m processors
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current XSLTElementProcessor at the top of the stack. * * @return Valid XSLTElementProcessor, which should never be null. */	TokenNameCOMMENT_JAVADOC	 Get the current XSLTElementProcessor at the top of the stack. * @return Valid XSLTElementProcessor, which should never be null. 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
)	TokenNameRPAREN	
m_processors	TokenNameIdentifier	 m processors
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push the current XSLTElementProcessor onto the top of the stack. * * @param processor non-null reference to the current element processor. */	TokenNameCOMMENT_JAVADOC	 Push the current XSLTElementProcessor onto the top of the stack. * @param processor non-null reference to the current element processor. 
void	TokenNamevoid	
pushProcessor	TokenNameIdentifier	 push Processor
(	TokenNameLPAREN	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_processors	TokenNameIdentifier	 m processors
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current XSLTElementProcessor from the top of the stack. * @return the XSLTElementProcessor which was popped. */	TokenNameCOMMENT_JAVADOC	 Pop the current XSLTElementProcessor from the top of the stack. @return the XSLTElementProcessor which was popped. 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
popProcessor	TokenNameIdentifier	 pop Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
)	TokenNameRPAREN	
m_processors	TokenNameIdentifier	 m processors
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The root of the XSLT Schema, which tells us how to * transition content handlers, create elements, etc. * For the moment at least, this can't be static, since * the processors store state. */	TokenNameCOMMENT_JAVADOC	 The root of the XSLT Schema, which tells us how to transition content handlers, create elements, etc. For the moment at least, this can't be static, since the processors store state. 
private	TokenNameprivate	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
m_schema	TokenNameIdentifier	 m schema
=	TokenNameEQUAL	
new	TokenNamenew	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the root of the XSLT Schema, which tells us how to * transition content handlers, create elements, etc. * * @return The root XSLT Schema, which should never be null. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the root of the XSLT Schema, which tells us how to transition content handlers, create elements, etc. * @return The root XSLT Schema, which should never be null. @xsl.usage internal 
public	TokenNamepublic	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_schema	TokenNameIdentifier	 m schema
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The stack of elements, pushed and popped as events occur. */	TokenNameCOMMENT_JAVADOC	 The stack of elements, pushed and popped as events occur. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_elems	TokenNameIdentifier	 m elems
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current ElemTemplateElement at the top of the stack. * @return Valid ElemTemplateElement, which may be null. */	TokenNameCOMMENT_JAVADOC	 Get the current ElemTemplateElement at the top of the stack. @return Valid ElemTemplateElement, which may be null. 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
getElemTemplateElement	TokenNameIdentifier	 get Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
m_elems	TokenNameIdentifier	 m elems
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
ese	TokenNameIdentifier	 ese
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** An increasing number that is used to indicate the order in which this element * was encountered during the parse of the XSLT tree. */	TokenNameCOMMENT_JAVADOC	 An increasing number that is used to indicate the order in which this element was encountered during the parse of the XSLT tree. 
private	TokenNameprivate	
int	TokenNameint	
m_docOrderCount	TokenNameIdentifier	 m doc Order Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns the next m_docOrderCount number and increments the number for future use. */	TokenNameCOMMENT_JAVADOC	 Returns the next m_docOrderCount number and increments the number for future use. 
int	TokenNameint	
nextUid	TokenNameIdentifier	 next Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_docOrderCount	TokenNameIdentifier	 m doc Order Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push the current XSLTElementProcessor to the top of the stack. As a * side-effect, set the document order index (simply because this is a * convenient place to set it). * * @param elem Should be a non-null reference to the intended current * template element. */	TokenNameCOMMENT_JAVADOC	 Push the current XSLTElementProcessor to the top of the stack. As a side-effect, set the document order index (simply because this is a convenient place to set it). * @param elem Should be a non-null reference to the intended current template element. 
void	TokenNamevoid	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setUid	TokenNameIdentifier	 set Uid
(	TokenNameLPAREN	
nextUid	TokenNameIdentifier	 next Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elems	TokenNameIdentifier	 m elems
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current XSLTElementProcessor from the top of the stack. * @return the ElemTemplateElement which was popped. */	TokenNameCOMMENT_JAVADOC	 Get the current XSLTElementProcessor from the top of the stack. @return the ElemTemplateElement which was popped. 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
m_elems	TokenNameIdentifier	 m elems
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will act as a stack to keep track of the * current include base. */	TokenNameCOMMENT_JAVADOC	 This will act as a stack to keep track of the current include base. 
Stack	TokenNameIdentifier	 Stack
m_baseIdentifiers	TokenNameIdentifier	 m base Identifiers
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Push a base identifier onto the base URI stack. * * @param baseID The current base identifier for this position in the * stylesheet, which may be a fragment identifier, or which may be null. * @see <a href="http://www.w3.org/TR/xslt#base-uri"> * Section 3.2 Base URI of XSLT specification.</a> */	TokenNameCOMMENT_JAVADOC	 Push a base identifier onto the base URI stack. * @param baseID The current base identifier for this position in the stylesheet, which may be a fragment identifier, or which may be null. @see <a href="http://www.w3.org/TR/xslt#base-uri"> Section 3.2 Base URI of XSLT specification.</a> 
void	TokenNamevoid	
pushBaseIndentifier	TokenNameIdentifier	 push Base Indentifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
posOfHash	TokenNameIdentifier	 pos Of Hash
=	TokenNameEQUAL	
baseID	TokenNameIdentifier	 base ID
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posOfHash	TokenNameIdentifier	 pos Of Hash
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_fragmentIDString	TokenNameIdentifier	 m fragment ID String
=	TokenNameEQUAL	
baseID	TokenNameIdentifier	 base ID
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
posOfHash	TokenNameIdentifier	 pos Of Hash
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_shouldProcess	TokenNameIdentifier	 m should Process
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_baseIdentifiers	TokenNameIdentifier	 m base Identifiers
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a base URI from the stack. * @return baseIdentifier. */	TokenNameCOMMENT_JAVADOC	 Pop a base URI from the stack. @return baseIdentifier. 
String	TokenNameIdentifier	 String
popBaseIndentifier	TokenNameIdentifier	 pop Base Indentifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_baseIdentifiers	TokenNameIdentifier	 m base Identifiers
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the base identifier. * * @return The base identifier of the current stylesheet. */	TokenNameCOMMENT_JAVADOC	 Return the base identifier. * @return The base identifier of the current stylesheet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Try to get the baseIdentifier from the baseIdentifier's stack, 	TokenNameCOMMENT_LINE	Try to get the baseIdentifier from the baseIdentifier's stack, 
// which may not be the same thing as the value found in the 	TokenNameCOMMENT_LINE	which may not be the same thing as the value found in the 
// SourceLocators stack. 	TokenNameCOMMENT_LINE	SourceLocators stack. 
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_baseIdentifiers	TokenNameIdentifier	 m base Identifiers
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
m_baseIdentifiers	TokenNameIdentifier	 m base Identifiers
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Otherwise try the stylesheet. 	TokenNameCOMMENT_LINE	Otherwise try the stylesheet. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The top of this stack should contain the currently processed * stylesheet SAX locator object. */	TokenNameCOMMENT_JAVADOC	 The top of this stack should contain the currently processed stylesheet SAX locator object. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_stylesheetLocatorStack	TokenNameIdentifier	 m stylesheet Locator Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current stylesheet Locator object. * * @return non-null reference to the current locator object. */	TokenNameCOMMENT_JAVADOC	 Get the current stylesheet Locator object. * @return non-null reference to the current locator object. 
public	TokenNamepublic	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_stylesheetLocatorStack	TokenNameIdentifier	 m stylesheet Locator Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getStylesheetProcessor	TokenNameIdentifier	 get Stylesheet Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDOMsystemID	TokenNameIdentifier	 get DO Msystem ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
// m_stylesheetLocatorStack.push(locator); 	TokenNameCOMMENT_LINE	m_stylesheetLocatorStack.push(locator); 
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
)	TokenNameRPAREN	
m_stylesheetLocatorStack	TokenNameIdentifier	 m stylesheet Locator Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A stack of URL hrefs for imported stylesheets. This is * used to diagnose circular imports. */	TokenNameCOMMENT_JAVADOC	 A stack of URL hrefs for imported stylesheets. This is used to diagnose circular imports. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_importStack	TokenNameIdentifier	 m import Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A stack of Source objects obtained from a URIResolver, * for each element in this stack there is a 1-1 correspondence * with an element in the m_importStack. */	TokenNameCOMMENT_JAVADOC	 A stack of Source objects obtained from a URIResolver, for each element in this stack there is a 1-1 correspondence with an element in the m_importStack. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_importSourceStack	TokenNameIdentifier	 m import Source Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Push an import href onto the stylesheet stack. * * @param hrefUrl non-null reference to the URL for the current imported * stylesheet. */	TokenNameCOMMENT_JAVADOC	 Push an import href onto the stylesheet stack. * @param hrefUrl non-null reference to the URL for the current imported stylesheet. 
void	TokenNamevoid	
pushImportURL	TokenNameIdentifier	 push Import URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hrefUrl	TokenNameIdentifier	 href Url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_importStack	TokenNameIdentifier	 m import Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
hrefUrl	TokenNameIdentifier	 href Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push the Source of an import href onto the stylesheet stack, * obtained from a URIResolver, null if there is no URIResolver, * or if that resolver returned null. */	TokenNameCOMMENT_JAVADOC	 Push the Source of an import href onto the stylesheet stack, obtained from a URIResolver, null if there is no URIResolver, or if that resolver returned null. 
void	TokenNamevoid	
pushImportSource	TokenNameIdentifier	 push Import Source
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
sourceFromURIResolver	TokenNameIdentifier	 source From URI Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_importSourceStack	TokenNameIdentifier	 m import Source Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
sourceFromURIResolver	TokenNameIdentifier	 source From URI Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See if the imported stylesheet stack already contains * the given URL. Used to test for recursive imports. * * @param hrefUrl non-null reference to a URL string. * * @return true if the URL is on the import stack. */	TokenNameCOMMENT_JAVADOC	 See if the imported stylesheet stack already contains the given URL. Used to test for recursive imports. * @param hrefUrl non-null reference to a URL string. * @return true if the URL is on the import stack. 
boolean	TokenNameboolean	
importStackContains	TokenNameIdentifier	 import Stack Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hrefUrl	TokenNameIdentifier	 href Url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stackContains	TokenNameIdentifier	 stack Contains
(	TokenNameLPAREN	
m_importStack	TokenNameIdentifier	 m import Stack
,	TokenNameCOMMA	
hrefUrl	TokenNameIdentifier	 href Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop an import href from the stylesheet stack. * * @return non-null reference to the import URL that was popped. */	TokenNameCOMMENT_JAVADOC	 Pop an import href from the stylesheet stack. * @return non-null reference to the import URL that was popped. 
String	TokenNameIdentifier	 String
popImportURL	TokenNameIdentifier	 pop Import URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_importStack	TokenNameIdentifier	 m import Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
peekImportURL	TokenNameIdentifier	 peek Import URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_importStack	TokenNameIdentifier	 m import Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Source	TokenNameIdentifier	 Source
peekSourceFromURIResolver	TokenNameIdentifier	 peek Source From URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
)	TokenNameRPAREN	
m_importSourceStack	TokenNameIdentifier	 m import Source Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop a Source from a user provided URIResolver, corresponding * to the URL popped from the m_importStack. */	TokenNameCOMMENT_JAVADOC	 Pop a Source from a user provided URIResolver, corresponding to the URL popped from the m_importStack. 
Source	TokenNameIdentifier	 Source
popImportSource	TokenNameIdentifier	 pop Import Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
)	TokenNameRPAREN	
m_importSourceStack	TokenNameIdentifier	 m import Source Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this is set to true, we've already warned about using the * older XSLT namespace URL. */	TokenNameCOMMENT_JAVADOC	 If this is set to true, we've already warned about using the older XSLT namespace URL. 
private	TokenNameprivate	
boolean	TokenNameboolean	
warnedAboutOldXSLTNamespace	TokenNameIdentifier	 warned About Old XSLT Namespace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Stack of NamespaceSupport objects. */	TokenNameCOMMENT_JAVADOC	 Stack of NamespaceSupport objects. 
Stack	TokenNameIdentifier	 Stack
m_nsSupportStack	TokenNameIdentifier	 m ns Support Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Push a new NamespaceSupport instance. */	TokenNameCOMMENT_JAVADOC	 Push a new NamespaceSupport instance. 
void	TokenNamevoid	
pushNewNamespaceSupport	TokenNameIdentifier	 push New Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nsSupportStack	TokenNameIdentifier	 m ns Support Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
new	TokenNamenew	
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current NamespaceSupport object. * */	TokenNameCOMMENT_JAVADOC	 Pop the current NamespaceSupport object. 
void	TokenNamevoid	
popNamespaceSupport	TokenNameIdentifier	 pop Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nsSupportStack	TokenNameIdentifier	 m ns Support Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current NamespaceSupport object. * * @return a non-null reference to the current NamespaceSupport object, * which is the top of the namespace support stack. */	TokenNameCOMMENT_JAVADOC	 Get the current NamespaceSupport object. * @return a non-null reference to the current NamespaceSupport object, which is the top of the namespace support stack. 
NamespaceSupport	TokenNameIdentifier	 Namespace Support
getNamespaceSupport	TokenNameIdentifier	 get Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
)	TokenNameRPAREN	
m_nsSupportStack	TokenNameIdentifier	 m ns Support Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The originating node if the current stylesheet is being created * from a DOM. * @see org.apache.xml.utils.NodeConsumer */	TokenNameCOMMENT_JAVADOC	 The originating node if the current stylesheet is being created from a DOM. @see org.apache.xml.utils.NodeConsumer 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
m_originatingNode	TokenNameIdentifier	 m originating Node
;	TokenNameSEMICOLON	
/** * Set the node that is originating the SAX event. * * @param n Reference to node that originated the current event. * @see org.apache.xml.utils.NodeConsumer */	TokenNameCOMMENT_JAVADOC	 Set the node that is originating the SAX event. * @param n Reference to node that originated the current event. @see org.apache.xml.utils.NodeConsumer 
public	TokenNamepublic	
void	TokenNamevoid	
setOriginatingNode	TokenNameIdentifier	 set Originating Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_originatingNode	TokenNameIdentifier	 m originating Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the node that is originating the SAX event. * * @return Reference to node that originated the current event. * @see org.apache.xml.utils.NodeConsumer */	TokenNameCOMMENT_JAVADOC	 Set the node that is originating the SAX event. * @return Reference to node that originated the current event. @see org.apache.xml.utils.NodeConsumer 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getOriginatingNode	TokenNameIdentifier	 get Originating Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_originatingNode	TokenNameIdentifier	 m originating Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stack of booleans that are pushed and popped in start/endElement depending * on the value of xml:space=default/preserve. */	TokenNameCOMMENT_JAVADOC	 Stack of booleans that are pushed and popped in start/endElement depending on the value of xml:space=default/preserve. 
private	TokenNameprivate	
BoolStack	TokenNameIdentifier	 Bool Stack
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
=	TokenNameEQUAL	
new	TokenNamenew	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return boolean value from the spacePreserve stack depending on the value * of xml:space=default/preserve. * * @return true if space should be preserved, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Return boolean value from the spacePreserve stack depending on the value of xml:space=default/preserve. * @return true if space should be preserved, false otherwise. 
boolean	TokenNameboolean	
isSpacePreserve	TokenNameIdentifier	 is Space Preserve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop boolean value from the spacePreserve stack. */	TokenNameCOMMENT_JAVADOC	 Pop boolean value from the spacePreserve stack. 
void	TokenNamevoid	
popSpaceHandling	TokenNameIdentifier	 pop Space Handling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push boolean value on to the spacePreserve stack. * * @param b true if space should be preserved, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Push boolean value on to the spacePreserve stack. * @param b true if space should be preserved, false otherwise. 
void	TokenNamevoid	
pushSpaceHandling	TokenNameIdentifier	 push Space Handling
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
{	TokenNameLBRACE	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push boolean value on to the spacePreserve stack depending on the value * of xml:space=default/preserve. * * @param attrs list of attributes that were passed to startElement. */	TokenNameCOMMENT_JAVADOC	 Push boolean value on to the spacePreserve stack depending on the value of xml:space=default/preserve. * @param attrs list of attributes that were passed to startElement. 
void	TokenNamevoid	
pushSpaceHandling	TokenNameIdentifier	 push Space Handling
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
peekOrFalse	TokenNameIdentifier	 peek Or False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
m_stylesheetProcessor	TokenNameIdentifier	 m stylesheet Processor
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Illegal value for xml:space", locator)); 	TokenNameCOMMENT_LINE	"Illegal value for xml:space", locator)); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_spacePreserveStack	TokenNameIdentifier	 m space Preserve Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
getElemVersion	TokenNameIdentifier	 get Elem Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
getElemTemplateElement	TokenNameIdentifier	 get Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XSLTVERSUPPORTED	TokenNameIdentifier	 XSLTVERSUPPORTED
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
elem	TokenNameIdentifier	 elem
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXmlVersion	TokenNameIdentifier	 get Xml Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XSLTVERSUPPORTED	TokenNameIdentifier	 XSLTVERSUPPORTED
:	TokenNameCOLON	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see PrefixResolver#handlesNullPrefixes() */	TokenNameCOMMENT_JAVADOC	 @see PrefixResolver#handlesNullPrefixes() 
public	TokenNamepublic	
boolean	TokenNameboolean	
handlesNullPrefixes	TokenNameIdentifier	 handles Null Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Optimization flag */	TokenNameCOMMENT_JAVADOC	 @return Optimization flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOptimize	TokenNameIdentifier	 get Optimize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_optimize	TokenNameIdentifier	 m optimize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Incremental flag */	TokenNameCOMMENT_JAVADOC	 @return Incremental flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIncremental	TokenNameIdentifier	 get Incremental
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_incremental	TokenNameIdentifier	 m incremental
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Source Location flag */	TokenNameCOMMENT_JAVADOC	 @return Source Location flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getSource_location	TokenNameIdentifier	 get Source location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_source_location	TokenNameIdentifier	 m source location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
