/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncExtFunction.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncExtFunction.java 468655 2006-10-28 07:12:06Z minchau $ 
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
ExpressionNode	TokenNameIdentifier	 Expression Node
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
XPathVisitor	TokenNameIdentifier	 X Path Visitor
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
XNull	TokenNameIdentifier	 X Null
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
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
XPATHMessages	TokenNameIdentifier	 XPATH Messages
;	TokenNameSEMICOLON	
/** * An object of this class represents an extension call expression. When * the expression executes, it calls ExtensionsTable#extFunction, and then * converts the result to the appropriate XObject. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 An object of this class represents an extension call expression. When the expression executes, it calls ExtensionsTable#extFunction, and then converts the result to the appropriate XObject. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
extends	TokenNameextends	
Function	TokenNameIdentifier	 Function
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5196115554693708718L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The namespace for the extension function, which should not normally * be null or empty. * @serial */	TokenNameCOMMENT_JAVADOC	 The namespace for the extension function, which should not normally be null or empty. @serial 
String	TokenNameIdentifier	 String
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
/** * The local name of the extension. * @serial */	TokenNameCOMMENT_JAVADOC	 The local name of the extension. @serial 
String	TokenNameIdentifier	 String
m_extensionName	TokenNameIdentifier	 m extension Name
;	TokenNameSEMICOLON	
/** * Unique method key, which is passed to ExtensionsTable#extFunction in * order to allow caching of the method. * @serial */	TokenNameCOMMENT_JAVADOC	 Unique method key, which is passed to ExtensionsTable#extFunction in order to allow caching of the method. @serial 
Object	TokenNameIdentifier	 Object
m_methodKey	TokenNameIdentifier	 m method Key
;	TokenNameSEMICOLON	
/** * Array of static expressions which represent the parameters to the * function. * @serial */	TokenNameCOMMENT_JAVADOC	 Array of static expressions which represent the parameters to the function. @serial 
Vector	TokenNameIdentifier	 Vector
m_argVec	TokenNameIdentifier	 m arg Vec
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). * NEEDSDOC @param globalsSize */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). NEEDSDOC @param globalsSize 
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_argVec	TokenNameIdentifier	 m arg Vec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nArgs	TokenNameIdentifier	 n Args
=	TokenNameEQUAL	
m_argVec	TokenNameIdentifier	 m arg Vec
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
nArgs	TokenNameIdentifier	 n Args
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
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
/** * Return the namespace of the extension function. * * @return The namespace of the extension function. */	TokenNameCOMMENT_JAVADOC	 Return the namespace of the extension function. * @return The namespace of the extension function. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the name of the extension function. * * @return The name of the extension function. */	TokenNameCOMMENT_JAVADOC	 Return the name of the extension function. * @return The name of the extension function. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_extensionName	TokenNameIdentifier	 m extension Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the method key of the extension function. * * @return The method key of the extension function. */	TokenNameCOMMENT_JAVADOC	 Return the method key of the extension function. * @return The method key of the extension function. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMethodKey	TokenNameIdentifier	 get Method Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_methodKey	TokenNameIdentifier	 m method Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the nth argument passed to the extension function. * * @param n The argument number index. * @return The Expression object at the given index. */	TokenNameCOMMENT_JAVADOC	 Return the nth argument passed to the extension function. * @param n The argument number index. @return The Expression object at the given index. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getArg	TokenNameIdentifier	 get Arg
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of arguments that were passed * into this extension function. * * @return The number of arguments. */	TokenNameCOMMENT_JAVADOC	 Return the number of arguments that were passed into this extension function. * @return The number of arguments. 
public	TokenNamepublic	
int	TokenNameint	
getArgCount	TokenNameIdentifier	 get Arg Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new FuncExtFunction based on the qualified name of the extension, * and a unique method key. * * @param namespace The namespace for the extension function, which should * not normally be null or empty. * @param extensionName The local name of the extension. * @param methodKey Unique method key, which is passed to * ExtensionsTable#extFunction in order to allow caching * of the method. */	TokenNameCOMMENT_JAVADOC	 Create a new FuncExtFunction based on the qualified name of the extension, and a unique method key. * @param namespace The namespace for the extension function, which should not normally be null or empty. @param extensionName The local name of the extension. @param methodKey Unique method key, which is passed to ExtensionsTable#extFunction in order to allow caching of the method. 
public	TokenNamepublic	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
extensionName	TokenNameIdentifier	 extension Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//try{throw new Exception("FuncExtFunction() " + namespace + " " + extensionName);} catch (Exception e){e.printStackTrace();} 	TokenNameCOMMENT_LINE	try{throw new Exception("FuncExtFunction() " + namespace + " " + extensionName);} catch (Exception e){e.printStackTrace();} 
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
m_extensionName	TokenNameIdentifier	 m extension Name
=	TokenNameEQUAL	
extensionName	TokenNameIdentifier	 extension Name
;	TokenNameSEMICOLON	
m_methodKey	TokenNameIdentifier	 m method Key
=	TokenNameEQUAL	
methodKey	TokenNameIdentifier	 method Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the function. The function must return * a valid object. * @param xctxt The current execution context. * @return A valid XObject. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the function. The function must return a valid object. @param xctxt The current execution context. @return A valid XObject. * @throws javax.xml.transform.TransformerException 
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
if	TokenNameif	
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
XPATHMessages	TokenNameIdentifier	 XPATH Messages
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
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
argVec	TokenNameIdentifier	 arg Vec
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nArgs	TokenNameIdentifier	 n Args
=	TokenNameEQUAL	
m_argVec	TokenNameIdentifier	 m arg Vec
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
nArgs	TokenNameIdentifier	 n Args
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Should cache the arguments for func:function */	TokenNameCOMMENT_BLOCK	 Should cache the arguments for func:function 
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argVec	TokenNameIdentifier	 arg Vec
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//dml 	TokenNameCOMMENT_LINE	dml 
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
extProvider	TokenNameIdentifier	 ext Provider
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionsProvider	TokenNameIdentifier	 Extensions Provider
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
extProvider	TokenNameIdentifier	 ext Provider
.	TokenNameDOT	
extFunction	TokenNameIdentifier	 ext Function
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
argVec	TokenNameIdentifier	 arg Vec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
XNull	TokenNameIdentifier	 X Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
class	TokenNameclass	
ArgExtOwner	TokenNameIdentifier	 Arg Ext Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
m_exp	TokenNameIdentifier	 m exp
;	TokenNameSEMICOLON	
ArgExtOwner	TokenNameIdentifier	 Arg Ext Owner
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_exp	TokenNameIdentifier	 m exp
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
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
m_exp	TokenNameIdentifier	 m exp
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
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exp	TokenNameIdentifier	 m exp
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
new	TokenNamenew	
ArgExtOwner	TokenNameIdentifier	 Arg Ext Owner
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the parent node. * For an extension function, we also need to set the parent * node for all argument expressions. * * @param n The parent node */	TokenNameCOMMENT_JAVADOC	 Set the parent node. For an extension function, we also need to set the parent node for all argument expressions. * @param n The parent node 
public	TokenNamepublic	
void	TokenNamevoid	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nArgs	TokenNameIdentifier	 n Args
=	TokenNameEQUAL	
m_argVec	TokenNameIdentifier	 m arg Vec
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
nArgs	TokenNameIdentifier	 n Args
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_argVec	TokenNameIdentifier	 m arg Vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Return the name of the extesion function in string format */	TokenNameCOMMENT_JAVADOC	 Return the name of the extesion function in string format 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_namespace	TokenNameIdentifier	 m namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
m_namespace	TokenNameIdentifier	 m namespace
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
m_extensionName	TokenNameIdentifier	 m extension Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_extensionName	TokenNameIdentifier	 m extension Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
