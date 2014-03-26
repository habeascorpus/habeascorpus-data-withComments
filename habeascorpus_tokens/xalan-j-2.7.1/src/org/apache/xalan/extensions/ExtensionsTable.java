/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionsTable.java 469672 2006-10-31 21:56:19Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionsTable.java 469672 2006-10-31 21:56:19Z minchau $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
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
/** * Class holding a table registered extension namespace handlers * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Class holding a table registered extension namespace handlers @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionsTable	TokenNameIdentifier	 Extensions Table
{	TokenNameLBRACE	
/** * Table of extensions that may be called from the expression language * via the call(name, ...) function. Objects are keyed on the call * name. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Table of extensions that may be called from the expression language via the call(name, ...) function. Objects are keyed on the call name. @xsl.usage internal 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The StylesheetRoot associated with this extensions table. */	TokenNameCOMMENT_JAVADOC	 The StylesheetRoot associated with this extensions table. 
private	TokenNameprivate	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
m_sroot	TokenNameIdentifier	 m sroot
;	TokenNameSEMICOLON	
/** * The constructor (called from TransformerImpl) registers the * StylesheetRoot for the transformation and instantiates an * ExtensionHandler for each extension namespace. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The constructor (called from TransformerImpl) registers the StylesheetRoot for the transformation and instantiates an ExtensionHandler for each extension namespace. @xsl.usage advanced 
public	TokenNamepublic	
ExtensionsTable	TokenNameIdentifier	 Extensions Table
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
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
m_sroot	TokenNameIdentifier	 m sroot
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
m_sroot	TokenNameIdentifier	 m sroot
.	TokenNameDOT	
getExtensions	TokenNameIdentifier	 get Extensions
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
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
extNamespaceSpt	TokenNameIdentifier	 ext Namespace Spt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
)	TokenNameRPAREN	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extHandler	TokenNameIdentifier	 ext Handler
=	TokenNameEQUAL	
extNamespaceSpt	TokenNameIdentifier	 ext Namespace Spt
.	TokenNameDOT	
launch	TokenNameIdentifier	 launch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extHandler	TokenNameIdentifier	 ext Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addExtensionNamespace	TokenNameIdentifier	 add Extension Namespace
(	TokenNameLPAREN	
extNamespaceSpt	TokenNameIdentifier	 ext Namespace Spt
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
extHandler	TokenNameIdentifier	 ext Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get an ExtensionHandler object that represents the * given namespace. * @param extns A valid extension namespace. * * @return ExtensionHandler object that represents the * given namespace. */	TokenNameCOMMENT_JAVADOC	 Get an ExtensionHandler object that represents the given namespace. @param extns A valid extension namespace. * @return ExtensionHandler object that represents the given namespace. 
public	TokenNamepublic	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
extns	TokenNameIdentifier	 extns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
)	TokenNameRPAREN	
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
extns	TokenNameIdentifier	 extns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register an extension namespace handler. This handler provides * functions for testing whether a function is known within the * namespace and also for invoking the functions. * * @param uri the URI for the extension. * @param extNS the extension handler. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Register an extension namespace handler. This handler provides functions for testing whether a function is known within the namespace and also for invoking the functions. * @param uri the URI for the extension. @param extNS the extension handler. @xsl.usage advanced 
public	TokenNamepublic	
void	TokenNamevoid	
addExtensionNamespace	TokenNameIdentifier	 add Extension Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extNS	TokenNameIdentifier	 ext NS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
extNS	TokenNameIdentifier	 ext NS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the function-available() function. * @param ns the URI of namespace in which the function is needed * @param funcName the function name being tested * * @return whether the given function is available or not. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the function-available() function. @param ns the URI of namespace in which the function is needed @param funcName the function name being tested * @return whether the given function is available or not. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
functionAvailable	TokenNameIdentifier	 function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
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
boolean	TokenNameboolean	
isAvailable	TokenNameIdentifier	 is Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extNS	TokenNameIdentifier	 ext NS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
)	TokenNameRPAREN	
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extNS	TokenNameIdentifier	 ext NS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
isAvailable	TokenNameIdentifier	 is Available
=	TokenNameEQUAL	
extNS	TokenNameIdentifier	 ext NS
.	TokenNameDOT	
isFunctionAvailable	TokenNameIdentifier	 is Function Available
(	TokenNameLPAREN	
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isAvailable	TokenNameIdentifier	 is Available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the element-available() function. * @param ns the URI of namespace in which the function is needed * @param elemName name of element being tested * * @return whether the given element is available or not. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the element-available() function. @param ns the URI of namespace in which the function is needed @param elemName name of element being tested * @return whether the given element is available or not. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
elementAvailable	TokenNameIdentifier	 element Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
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
boolean	TokenNameboolean	
isAvailable	TokenNameIdentifier	 is Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extNS	TokenNameIdentifier	 ext NS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
)	TokenNameRPAREN	
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extNS	TokenNameIdentifier	 ext NS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// defensive 	TokenNameCOMMENT_LINE	defensive 
isAvailable	TokenNameIdentifier	 is Available
=	TokenNameEQUAL	
extNS	TokenNameIdentifier	 ext NS
.	TokenNameDOT	
isElementAvailable	TokenNameIdentifier	 is Element Available
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isAvailable	TokenNameIdentifier	 is Available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handle an extension function. * @param ns the URI of namespace in which the function is needed * @param funcName the function name being called * @param argVec arguments to the function in a vector * @param methodKey a unique key identifying this function instance in the * stylesheet * @param exprContext a context which may be passed to an extension function * and provides callback functions to access various * areas in the environment * * @return result of executing the function * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Handle an extension function. @param ns the URI of namespace in which the function is needed @param funcName the function name being called @param argVec arguments to the function in a vector @param methodKey a unique key identifying this function instance in the stylesheet @param exprContext a context which may be passed to an extension function and provides callback functions to access various areas in the environment * @return result of executing the function * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
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
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extNS	TokenNameIdentifier	 ext NS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
)	TokenNameRPAREN	
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extNS	TokenNameIdentifier	 ext NS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
extNS	TokenNameIdentifier	 ext NS
.	TokenNameDOT	
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Extension function '" + ns + ":" + funcName + "' is unknown"); 	TokenNameCOMMENT_LINE	"Extension function '" + ns + ":" + funcName + "' is unknown"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handle an extension function. * @param extFunction the extension function * @param argVec arguments to the function in a vector * @param exprContext a context which may be passed to an extension function * and provides callback functions to access various * areas in the environment * * @return result of executing the function * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Handle an extension function. @param extFunction the extension function @param argVec arguments to the function in a vector @param exprContext a context which may be passed to an extension function and provides callback functions to access various areas in the environment * @return result of executing the function * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
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
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extNS	TokenNameIdentifier	 ext NS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
)	TokenNameRPAREN	
m_extensionFunctionNamespaces	TokenNameIdentifier	 m extension Function Namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extNS	TokenNameIdentifier	 ext NS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
extNS	TokenNameIdentifier	 ext NS
.	TokenNameDOT	
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
argVec	TokenNameIdentifier	 arg Vec
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
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
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
