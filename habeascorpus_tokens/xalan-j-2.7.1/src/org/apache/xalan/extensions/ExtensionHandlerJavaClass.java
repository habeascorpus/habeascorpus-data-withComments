/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionHandlerJavaClass.java 469672 2006-10-31 21:56:19Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionHandlerJavaClass.java 469672 2006-10-31 21:56:19Z minchau $ 
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Modifier	TokenNameIdentifier	 Modifier
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
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
ExtensionEvent	TokenNameIdentifier	 Extension Event
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
/** * Represents an extension namespace for XPath that handles java classes. * It is recommended that the class URI be of the form: * <pre> * xalan://fully.qualified.class.name * </pre> * However, we do not enforce this. If the class name contains a * a /, we only use the part to the right of the rightmost slash. * In addition, we ignore any "class:" prefix. * Provides functions to test a function's existence and call a function. * Also provides functions to test an element's existence and call an * element. * * @author <a href="mailto:garyp@firstech.com">Gary L Peskin</a> * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Represents an extension namespace for XPath that handles java classes. It is recommended that the class URI be of the form: <pre> xalan://fully.qualified.class.name </pre> However, we do not enforce this. If the class name contains a a /, we only use the part to the right of the rightmost slash. In addition, we ignore any "class:" prefix. Provides functions to test a function's existence and call a function. Also provides functions to test an element's existence and call an element. * @author <a href="mailto:garyp@firstech.com">Gary L Peskin</a> @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionHandlerJavaClass	TokenNameIdentifier	 Extension Handler Java Class
extends	TokenNameextends	
ExtensionHandlerJava	TokenNameIdentifier	 Extension Handler Java
{	TokenNameLBRACE	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
m_classObj	TokenNameIdentifier	 m class Obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Provides a default Instance for use by elements that need to call * an instance method. */	TokenNameCOMMENT_JAVADOC	 Provides a default Instance for use by elements that need to call an instance method. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
m_defaultInstance	TokenNameIdentifier	 m default Instance
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Construct a new extension namespace handler given all the information * needed. * @param namespaceUri the extension namespace URI that I'm implementing * @param scriptLang language of code implementing the extension * @param className the fully qualified class name of the class */	TokenNameCOMMENT_JAVADOC	 Construct a new extension namespace handler given all the information needed. @param namespaceUri the extension namespace URI that I'm implementing @param scriptLang language of code implementing the extension @param className the fully qualified class name of the class 
public	TokenNamepublic	
ExtensionHandlerJavaClass	TokenNameIdentifier	 Extension Handler Java Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scriptLang	TokenNameIdentifier	 script Lang
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
scriptLang	TokenNameIdentifier	 script Lang
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_classObj	TokenNameIdentifier	 m class Obj
=	TokenNameEQUAL	
getClassForName	TokenNameIdentifier	 get Class For Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For now, just let this go. We'll catch it when we try to invoke a method. 	TokenNameCOMMENT_LINE	For now, just let this go. We'll catch it when we try to invoke a method. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests whether a certain function name is known within this namespace. * Simply looks for a method with the appropriate name. There is * no information regarding the arguments to the function call or * whether the method implementing the function is a static method or * an instance method. * @param function name of the function being tested * @return true if its known, false if not. */	TokenNameCOMMENT_JAVADOC	 Tests whether a certain function name is known within this namespace. Simply looks for a method with the appropriate name. There is no information regarding the arguments to the function call or whether the method implementing the function is a static method or an instance method. @param function name of the function being tested @return true if its known, false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFunctionAvailable	TokenNameIdentifier	 is Function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nMethods	TokenNameIdentifier	 n Methods
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
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
nMethods	TokenNameIdentifier	 n Methods
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
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
/** * Tests whether a certain element name is known within this namespace. * Looks for a method with the appropriate name and signature. * This method examines both static and instance methods. * @param element name of the element being tested * @return true if its known, false if not. */	TokenNameCOMMENT_JAVADOC	 Tests whether a certain element name is known within this namespace. Looks for a method with the appropriate name and signature. This method examines both static and instance methods. @param element name of the element being tested @return true if its known, false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementAvailable	TokenNameIdentifier	 is Element Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nMethods	TokenNameIdentifier	 n Methods
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
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
nMethods	TokenNameIdentifier	 n Methods
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a call to a function in the java class represented by * this <code>ExtensionHandlerJavaClass<code>. * There are three possible types of calls: * <pre> * Constructor: * classns:new(arg1, arg2, ...) * * Static method: * classns:method(arg1, arg2, ...) * * Instance method: * classns:method(obj, arg1, arg2, ...) * </pre> * We use the following rules to determine the type of call made: * <ol type="1"> * <li>If the function name is "new", call the best constructor for * class represented by the namespace URI</li> * <li>If the first argument to the function is of the class specified * in the namespace or is a subclass of that class, look for the best * method of the class specified in the namespace with the specified * arguments. Compare all static and instance methods with the correct * method name. For static methods, use all arguments in the compare. * For instance methods, use all arguments after the first.</li> * <li>Otherwise, select the best static or instance method matching * all of the arguments. If the best method is an instance method, * call the function using a default object, creating it if needed.</li> * </ol> * * @param funcName Function name. * @param args The arguments of the function call. * @param methodKey A key that uniquely identifies this class and method call. * @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process a call to a function in the java class represented by this <code>ExtensionHandlerJavaClass<code>. There are three possible types of calls: <pre> Constructor: classns:new(arg1, arg2, ...) * Static method: classns:method(arg1, arg2, ...) * Instance method: classns:method(obj, arg1, arg2, ...) </pre> We use the following rules to determine the type of call made: <ol type="1"> <li>If the function name is "new", call the best constructor for class represented by the namespace URI</li> <li>If the first argument to the function is of the class specified in the namespace or is a subclass of that class, look for the best method of the class specified in the namespace with the specified arguments. Compare all static and instance methods with the correct method name. For static methods, use all arguments in the compare. For instance methods, use all arguments after the first.</li> <li>Otherwise, select the best static or instance method matching all of the arguments. If the best method is an instance method, call the function using a default object, creating it if needed.</li> </ol> * @param funcName Function name. @param args The arguments of the function call. @param methodKey A key that uniquely identifies this class and method call. @param exprContext The context in which this expression is being executed. @return the return value of the function evaluation. @throws TransformerException 
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
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodArgs	TokenNameIdentifier	 method Args
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convertedArgs	TokenNameIdentifier	 converted Args
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
trans	TokenNameIdentifier	 trans
=	TokenNameEQUAL	
(	TokenNameLPAREN	
exprContext	TokenNameIdentifier	 expr Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
exprContext	TokenNameIdentifier	 expr Context
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
funcName	TokenNameIdentifier	 func Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"new"	TokenNameStringLiteral	new
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Handle constructor call 	TokenNameCOMMENT_LINE	Handle constructor call 
methodArgs	TokenNameIdentifier	 method Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
convertedArgs	TokenNameIdentifier	 converted Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Constructor	TokenNameIdentifier	 Constructor
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Constructor	TokenNameIdentifier	 Constructor
)	TokenNameRPAREN	
getFromCache	TokenNameIdentifier	 get From Cache
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
convertParams	TokenNameIdentifier	 convert Params
(	TokenNameLPAREN	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ite	TokenNameIdentifier	 ite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ite	TokenNameIdentifier	 ite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Must not have been the right one 	TokenNameCOMMENT_LINE	Must not have been the right one 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
m_classObj	TokenNameIdentifier	 m class Obj
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
putToCache	TokenNameIdentifier	 put To Cache
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
resolveType	TokenNameIdentifier	 resolve Type
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
targetObject	TokenNameIdentifier	 target Object
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
methodArgs	TokenNameIdentifier	 method Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
convertedArgs	TokenNameIdentifier	 converted Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
)	TokenNameRPAREN	
getFromCache	TokenNameIdentifier	 get From Cache
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
convertParams	TokenNameIdentifier	 convert Params
(	TokenNameLPAREN	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is tricky. We get the actual number of target arguments (excluding any 	TokenNameCOMMENT_LINE	This is tricky. We get the actual number of target arguments (excluding any 
// ExpressionContext). If we passed in the same number, we need the implied object. 	TokenNameCOMMENT_LINE	ExpressionContext). If we passed in the same number, we need the implied object. 
int	TokenNameint	
nTargetArgs	TokenNameIdentifier	 n Target Args
=	TokenNameEQUAL	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
nTargetArgs	TokenNameIdentifier	 n Target Args
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodArgs	TokenNameIdentifier	 method Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
nTargetArgs	TokenNameIdentifier	 n Target Args
)	TokenNameRPAREN	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
targetObject	TokenNameIdentifier	 target Object
=	TokenNameEQUAL	
methodArgs	TokenNameIdentifier	 method Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetObject	TokenNameIdentifier	 target Object
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
targetObject	TokenNameIdentifier	 target Object
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
targetObject	TokenNameIdentifier	 target Object
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
targetObject	TokenNameIdentifier	 target Object
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ite	TokenNameIdentifier	 ite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ite	TokenNameIdentifier	 ite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Must not have been the right one 	TokenNameCOMMENT_LINE	Must not have been the right one 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetObject	TokenNameIdentifier	 target Object
=	TokenNameEQUAL	
methodArgs	TokenNameIdentifier	 method Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetObject	TokenNameIdentifier	 target Object
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
targetObject	TokenNameIdentifier	 target Object
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
targetObject	TokenNameIdentifier	 target Object
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
targetObject	TokenNameIdentifier	 target Object
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
resolveType	TokenNameIdentifier	 resolve Type
=	TokenNameEQUAL	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
;	TokenNameSEMICOLON	
else	TokenNameelse	
resolveType	TokenNameIdentifier	 resolve Type
=	TokenNameEQUAL	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
STATIC_AND_INSTANCE	TokenNameIdentifier	 STATIC  AND  INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
targetObject	TokenNameIdentifier	 target Object
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
resolveType	TokenNameIdentifier	 resolve Type
=	TokenNameEQUAL	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
STATIC_AND_INSTANCE	TokenNameIdentifier	 STATIC  AND  INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
m_classObj	TokenNameIdentifier	 m class Obj
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
,	TokenNameCOMMA	
resolveType	TokenNameIdentifier	 resolve Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
putToCache	TokenNameIdentifier	 put To Cache
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
==	TokenNameEQUAL_EQUAL	
resolveType	TokenNameIdentifier	 resolve Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First argument was object type 	TokenNameCOMMENT_LINE	First argument was object type 
if	TokenNameif	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
targetObject	TokenNameIdentifier	 target Object
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
targetObject	TokenNameIdentifier	 target Object
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
targetObject	TokenNameIdentifier	 target Object
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
targetObject	TokenNameIdentifier	 target Object
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// First arg was not object. See if we need the implied object. 	TokenNameCOMMENT_LINE	First arg was not object. See if we need the implied object. 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_defaultInstance	TokenNameIdentifier	 m default Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
m_classObj	TokenNameIdentifier	 m class Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_defaultInstance	TokenNameIdentifier	 m default Instance
=	TokenNameEQUAL	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
,	TokenNameCOMMA	
m_classObj	TokenNameIdentifier	 m class Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
m_defaultInstance	TokenNameIdentifier	 m default Instance
=	TokenNameEQUAL	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trans	TokenNameIdentifier	 trans
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
convertedArgs	TokenNameIdentifier	 converted Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ite	TokenNameIdentifier	 ite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
resultException	TokenNameIdentifier	 result Exception
=	TokenNameEQUAL	
ite	TokenNameIdentifier	 ite
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
targetException	TokenNameIdentifier	 target Exception
=	TokenNameEQUAL	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetException	TokenNameIdentifier	 target Exception
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
targetException	TokenNameIdentifier	 target Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
targetException	TokenNameIdentifier	 target Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
resultException	TokenNameIdentifier	 result Exception
=	TokenNameEQUAL	
targetException	TokenNameIdentifier	 target Exception
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
resultException	TokenNameIdentifier	 result Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a call to an XPath extension function * * @param extFunction The XPath extension function * @param args The arguments of the function call. * @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process a call to an XPath extension function * @param extFunction The XPath extension function @param args The arguments of the function call. @param exprContext The context in which this expression is being executed. @return the return value of the function evaluation. @throws TransformerException 
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
return	TokenNamereturn	
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getMethodKey	TokenNameIdentifier	 get Method Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a call to this extension namespace via an element. As a side * effect, the results are sent to the TransformerImpl's result tree. * We invoke the static or instance method in the class represented by * by the namespace URI. If we don't already have an instance of this class, * we create one upon the first call. * * @param localPart Element name's local part. * @param element The extension element being processed. * @param transformer Handle to TransformerImpl. * @param stylesheetTree The compiled stylesheet tree. * @param methodKey A key that uniquely identifies this element call. * @throws IOException if loading trouble * @throws TransformerException if parsing trouble */	TokenNameCOMMENT_JAVADOC	 Process a call to this extension namespace via an element. As a side effect, the results are sent to the TransformerImpl's result tree. We invoke the static or instance method in the class represented by by the namespace URI. If we don't already have an instance of this class, we create one upon the first call. * @param localPart Element name's local part. @param element The extension element being processed. @param transformer Handle to TransformerImpl. @param stylesheetTree The compiled stylesheet tree. @param methodKey A key that uniquely identifies this element call. @throws IOException if loading trouble @throws TransformerException if parsing trouble 
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
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
)	TokenNameRPAREN	
getFromCache	TokenNameIdentifier	 get From Cache
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
MethodResolver	TokenNameIdentifier	 Method Resolver
.	TokenNameDOT	
getElementMethod	TokenNameIdentifier	 get Element Method
(	TokenNameLPAREN	
m_classObj	TokenNameIdentifier	 m class Obj
,	TokenNameCOMMA	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_defaultInstance	TokenNameIdentifier	 m default Instance
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
m_classObj	TokenNameIdentifier	 m class Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_defaultInstance	TokenNameIdentifier	 m default Instance
=	TokenNameEQUAL	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
m_classObj	TokenNameIdentifier	 m class Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
m_defaultInstance	TokenNameIdentifier	 m default Instance
=	TokenNameEQUAL	
m_classObj	TokenNameIdentifier	 m class Obj
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// e.printStackTrace (); 	TokenNameCOMMENT_LINE	e.printStackTrace (); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
putToCache	TokenNameIdentifier	 put To Cache
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
xpc	TokenNameIdentifier	 xpc
=	TokenNameEQUAL	
new	TokenNamenew	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
stylesheetTree	TokenNameIdentifier	 stylesheet Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
xpc	TokenNameIdentifier	 xpc
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
xpc	TokenNameIdentifier	 xpc
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
}	TokenNameRBRACE	
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
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
xpc	TokenNameIdentifier	 xpc
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_defaultInstance	TokenNameIdentifier	 m default Instance
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
xpc	TokenNameIdentifier	 xpc
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
targetException	TokenNameIdentifier	 target Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetException	TokenNameIdentifier	 target Exception
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
targetException	TokenNameIdentifier	 target Exception
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
targetException	TokenNameIdentifier	 target Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
targetException	TokenNameIdentifier	 target Exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
targetException	TokenNameIdentifier	 target Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// e.printStackTrace (); 	TokenNameCOMMENT_LINE	e.printStackTrace (); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
outputToResultTree	TokenNameIdentifier	 output To Result Tree
(	TokenNameLPAREN	
stylesheetTree	TokenNameIdentifier	 stylesheet Tree
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
