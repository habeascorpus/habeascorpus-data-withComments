/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// $Id: JAXPExtensionsProvider.java 468655 2006-10-28 07:12:06Z minchau $ 	TokenNameCOMMENT_LINE	$Id: JAXPExtensionsProvider.java 468655 2006-10-28 07:12:06Z minchau $ 
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
XPathFunction	TokenNameIdentifier	 X Path Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
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
XNodeSet	TokenNameIdentifier	 X Node Set
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
/** * * @author Ramesh Mandava ( ramesh.mandava@sun.com ) */	TokenNameCOMMENT_JAVADOC	 * @author Ramesh Mandava ( ramesh.mandava@sun.com ) 
public	TokenNamepublic	
class	TokenNameclass	
JAXPExtensionsProvider	TokenNameIdentifier	 JAXP Extensions Provider
implements	TokenNameimplements	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
extensionInvocationDisabled	TokenNameIdentifier	 extension Invocation Disabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JAXPExtensionsProvider	TokenNameIdentifier	 JAXP Extensions Provider
(	TokenNameLPAREN	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
extensionInvocationDisabled	TokenNameIdentifier	 extension Invocation Disabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
JAXPExtensionsProvider	TokenNameIdentifier	 JAXP Extensions Provider
(	TokenNameLPAREN	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
boolean	TokenNameboolean	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
extensionInvocationDisabled	TokenNameIdentifier	 extension Invocation Disabled
=	TokenNameEQUAL	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is the extension function available? */	TokenNameCOMMENT_JAVADOC	 Is the extension function available? 
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
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
funcName	TokenNameIdentifier	 func Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
ER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Function Name"	TokenNameStringLiteral	Function Name
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
//Find the XPathFunction corresponding to namespace and funcName 	TokenNameCOMMENT_LINE	Find the XPathFunction corresponding to namespace and funcName 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
myQName	TokenNameIdentifier	 my Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunction	TokenNameIdentifier	 X Path Function
xpathFunction	TokenNameIdentifier	 xpath Function
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolveFunction	TokenNameIdentifier	 resolve Function
(	TokenNameLPAREN	
myQName	TokenNameIdentifier	 my Q Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xpathFunction	TokenNameIdentifier	 xpath Function
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Is the extension element available? */	TokenNameCOMMENT_JAVADOC	 Is the extension element available? 
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the extension function. */	TokenNameCOMMENT_JAVADOC	 Execute the extension function. 
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
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
funcName	TokenNameIdentifier	 func Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
ER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Function Name"	TokenNameStringLiteral	Function Name
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
//Find the XPathFunction corresponding to namespace and funcName 	TokenNameCOMMENT_LINE	Find the XPathFunction corresponding to namespace and funcName 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
myQName	TokenNameIdentifier	 my Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JAXP 1.3 spec says When XMLConstants.FEATURE_SECURE_PROCESSING 	TokenNameCOMMENT_LINE	JAXP 1.3 spec says When XMLConstants.FEATURE_SECURE_PROCESSING 
// feature is set then invocation of extension functions need to 	TokenNameCOMMENT_LINE	feature is set then invocation of extension functions need to 
// throw XPathFunctionException 	TokenNameCOMMENT_LINE	throw XPathFunctionException 
if	TokenNameif	
(	TokenNameLPAREN	
extensionInvocationDisabled	TokenNameIdentifier	 extension Invocation Disabled
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
ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED	TokenNameIdentifier	 ER  EXTENSION  FUNCTION  CANNOT  BE  INVOKED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
myQName	TokenNameIdentifier	 my Q Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assuming user is passing all the needed parameters ( including 	TokenNameCOMMENT_LINE	Assuming user is passing all the needed parameters ( including 
// default values ) 	TokenNameCOMMENT_LINE	default values ) 
int	TokenNameint	
arity	TokenNameIdentifier	 arity
=	TokenNameEQUAL	
argVec	TokenNameIdentifier	 arg Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunction	TokenNameIdentifier	 X Path Function
xpathFunction	TokenNameIdentifier	 xpath Function
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolveFunction	TokenNameIdentifier	 resolve Function
(	TokenNameLPAREN	
myQName	TokenNameIdentifier	 my Q Name
,	TokenNameCOMMA	
arity	TokenNameIdentifier	 arity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not using methodKey 	TokenNameCOMMENT_LINE	not using methodKey 
ArrayList	TokenNameIdentifier	 Array List
argList	TokenNameIdentifier	 arg List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
arity	TokenNameIdentifier	 arity
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
arity	TokenNameIdentifier	 arity
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
argVec	TokenNameIdentifier	 arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XNodeSet object() returns NodeVector and not NodeList 	TokenNameCOMMENT_LINE	XNodeSet object() returns NodeVector and not NodeList 
// Explicitly getting NodeList by using nodelist() 	TokenNameCOMMENT_LINE	Explicitly getting NodeList by using nodelist() 
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
instanceof	TokenNameinstanceof	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
.	TokenNameDOT	
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
passedArgument	TokenNameIdentifier	 passed Argument
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
passedArgument	TokenNameIdentifier	 passed Argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
xpathFunction	TokenNameIdentifier	 xpath Function
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
argList	TokenNameIdentifier	 arg List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
xfe	TokenNameIdentifier	 xfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we get XPathFunctionException then we want to terminate 	TokenNameCOMMENT_LINE	If we get XPathFunctionException then we want to terminate 
// further execution by throwing WrappedRuntimeException 	TokenNameCOMMENT_LINE	further execution by throwing WrappedRuntimeException 
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
xfe	TokenNameIdentifier	 xfe
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
/** * Execute the extension function. */	TokenNameCOMMENT_JAVADOC	 Execute the extension function. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
argVec	TokenNameIdentifier	 arg Vec
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
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
functionName	TokenNameIdentifier	 function Name
=	TokenNameEQUAL	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
arity	TokenNameIdentifier	 arity
=	TokenNameEQUAL	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getArgCount	TokenNameIdentifier	 get Arg Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
myQName	TokenNameIdentifier	 my Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
functionName	TokenNameIdentifier	 function Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// JAXP 1.3 spec says When XMLConstants.FEATURE_SECURE_PROCESSING 	TokenNameCOMMENT_LINE	JAXP 1.3 spec says When XMLConstants.FEATURE_SECURE_PROCESSING 
// feature is set then invocation of extension functions need to 	TokenNameCOMMENT_LINE	feature is set then invocation of extension functions need to 
// throw XPathFunctionException 	TokenNameCOMMENT_LINE	throw XPathFunctionException 
if	TokenNameif	
(	TokenNameLPAREN	
extensionInvocationDisabled	TokenNameIdentifier	 extension Invocation Disabled
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
ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED	TokenNameIdentifier	 ER  EXTENSION  FUNCTION  CANNOT  BE  INVOKED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
myQName	TokenNameIdentifier	 my Q Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XPathFunction	TokenNameIdentifier	 X Path Function
xpathFunction	TokenNameIdentifier	 xpath Function
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolveFunction	TokenNameIdentifier	 resolve Function
(	TokenNameLPAREN	
myQName	TokenNameIdentifier	 my Q Name
,	TokenNameCOMMA	
arity	TokenNameIdentifier	 arity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
argList	TokenNameIdentifier	 arg List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
arity	TokenNameIdentifier	 arity
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
arity	TokenNameIdentifier	 arity
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
argVec	TokenNameIdentifier	 arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XNodeSet object() returns NodeVector and not NodeList 	TokenNameCOMMENT_LINE	XNodeSet object() returns NodeVector and not NodeList 
// Explicitly getting NodeList by using nodelist() 	TokenNameCOMMENT_LINE	Explicitly getting NodeList by using nodelist() 
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
instanceof	TokenNameinstanceof	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
.	TokenNameDOT	
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
passedArgument	TokenNameIdentifier	 passed Argument
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
passedArgument	TokenNameIdentifier	 passed Argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
xpathFunction	TokenNameIdentifier	 xpath Function
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
argList	TokenNameIdentifier	 arg List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
xfe	TokenNameIdentifier	 xfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we get XPathFunctionException then we want to terminate 	TokenNameCOMMENT_LINE	If we get XPathFunctionException then we want to terminate 
// further execution by throwing WrappedRuntimeException 	TokenNameCOMMENT_LINE	further execution by throwing WrappedRuntimeException 
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
xfe	TokenNameIdentifier	 xfe
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
}	TokenNameRBRACE	
