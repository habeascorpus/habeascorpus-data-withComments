/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolTable	TokenNameIdentifier	 Symbol Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLChar	TokenNameIdentifier	 XML Char
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSymbols	TokenNameIdentifier	 XML Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * Bare minimum XPath parser. * * @xerces.internal * * @author Andy Clark, IBM * @version $Id: XPath.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Bare minimum XPath parser. * @xerces.internal * @author Andy Clark, IBM @version $Id: XPath.java 965250 2010-07-18 16:04:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XPath	TokenNameIdentifier	 X Path
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_XPATH_PARSE	TokenNameIdentifier	 DEBUG  XPATH  PARSE
=	TokenNameEQUAL	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
||	TokenNameOR_OR	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_ANY	TokenNameIdentifier	 DEBUG  ANY
=	TokenNameEQUAL	
DEBUG_XPATH_PARSE	TokenNameIdentifier	 DEBUG  XPATH  PARSE
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Expression. */	TokenNameCOMMENT_JAVADOC	 Expression. 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fExpression	TokenNameIdentifier	 f Expression
;	TokenNameSEMICOLON	
/** Symbol table. */	TokenNameCOMMENT_JAVADOC	 Symbol table. 
protected	TokenNameprotected	
final	TokenNamefinal	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
/** Location paths. */	TokenNameCOMMENT_JAVADOC	 Location paths. 
protected	TokenNameprotected	
final	TokenNamefinal	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an XPath object from the specified expression. */	TokenNameCOMMENT_JAVADOC	 Constructs an XPath object from the specified expression. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
fExpression	TokenNameIdentifier	 f Expression
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
fLocationPaths	TokenNameIdentifier	 f Location Paths
=	TokenNameEQUAL	
parseExpression	TokenNameIdentifier	 parse Expression
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_XPATH_PARSE	TokenNameIdentifier	 DEBUG  XPATH  PARSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
">>> "	TokenNameStringLiteral	>>> 
+	TokenNamePLUS	
fLocationPaths	TokenNameIdentifier	 f Location Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>(String,SymbolTable,NamespaceContext) 	TokenNameCOMMENT_LINE	<init>(String,SymbolTable,NamespaceContext) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns a representation of all location paths for this XPath. * XPath = locationPath ( '|' locationPath) */	TokenNameCOMMENT_JAVADOC	 Returns a representation of all location paths for this XPath. XPath = locationPath ( '|' locationPath) 
public	TokenNamepublic	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocationPaths	TokenNameIdentifier	 get Location Paths
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocationPath	TokenNameIdentifier	 Location Path
)	TokenNameRPAREN	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocationPath(LocationPath) 	TokenNameCOMMENT_LINE	getLocationPath(LocationPath) 
/** Returns a representation of the first location path for this XPath. */	TokenNameCOMMENT_JAVADOC	 Returns a representation of the first location path for this XPath. 
public	TokenNamepublic	
LocationPath	TokenNameIdentifier	 Location Path
getLocationPath	TokenNameIdentifier	 get Location Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
LocationPath	TokenNameIdentifier	 Location Path
)	TokenNameRPAREN	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocationPath(LocationPath) 	TokenNameCOMMENT_LINE	getLocationPath(LocationPath) 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** * Used by the {@link #parseExpression(NamespaceContext)} method * to verify the assumption. * * If <tt>b</tt> is false, this method throws XPathException * to report the error. */	TokenNameCOMMENT_JAVADOC	 Used by the {@link #parseExpression(NamespaceContext)} method to verify the assumption. * If <tt>b</tt> is false, this method throws XPathException to report the error. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used by the {@link #parseExpression(NamespaceContext)} method * to build a {@link LocationPath} object from the accumulated * {@link Step}s. */	TokenNameCOMMENT_JAVADOC	 Used by the {@link #parseExpression(NamespaceContext)} method to build a {@link LocationPath} object from the accumulated {@link Step}s. 
private	TokenNameprivate	
LocationPath	TokenNameIdentifier	 Location Path
buildLocationPath	TokenNameIdentifier	 build Location Path
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
stepsVector	TokenNameIdentifier	 steps Vector
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
steps	TokenNameIdentifier	 steps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
LocationPath	TokenNameIdentifier	 Location Path
(	TokenNameLPAREN	
steps	TokenNameIdentifier	 steps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is implemented by using the XPathExprScanner and * examining the list of tokens that it returns. */	TokenNameCOMMENT_JAVADOC	 This method is implemented by using the XPathExprScanner and examining the list of tokens that it returns. 
private	TokenNameprivate	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseExpression	TokenNameIdentifier	 parse Expression
(	TokenNameLPAREN	
final	TokenNamefinal	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
// tokens 	TokenNameCOMMENT_LINE	tokens 
final	TokenNamefinal	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
xtokens	TokenNameIdentifier	 xtokens
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// scanner 	TokenNameCOMMENT_LINE	scanner 
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Scanner	TokenNameIdentifier	 Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_ATSIGN	TokenNameIdentifier	 EXPRTOKEN  ATSIGN
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_UNION	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  UNION
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_CHILD	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  CHILD
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_ATTRIBUTE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ATTRIBUTE
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
// 	TokenNameCOMMENT_LINE	 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fExpression	TokenNameIdentifier	 f Expression
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
scanExpr	TokenNameIdentifier	 scan Expr
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
,	TokenNameCOMMA	
xtokens	TokenNameIdentifier	 xtokens
,	TokenNameCOMMA	
fExpression	TokenNameIdentifier	 f Expression
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fTokens.dumpTokens(); 	TokenNameCOMMENT_LINE	fTokens.dumpTokens(); 
Vector	TokenNameIdentifier	 Vector
stepsVector	TokenNameIdentifier	 steps Vector
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
locationPathsVector	TokenNameIdentifier	 location Paths Vector
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// true when the next token should be 'Step' (as defined in 	TokenNameCOMMENT_LINE	true when the next token should be 'Step' (as defined in 
// the production rule [3] of XML Schema P1 section 3.11.6 	TokenNameCOMMENT_LINE	the production rule [3] of XML Schema P1 section 3.11.6 
// if false, we are expecting either '|' or '/'. 	TokenNameCOMMENT_LINE	if false, we are expecting either '|' or '/'. 
// 	TokenNameCOMMENT_LINE	 
// this is to make sure we can detect a token list like 	TokenNameCOMMENT_LINE	this is to make sure we can detect a token list like 
// 'abc' '/' '/' 'def' 'ghi' 	TokenNameCOMMENT_LINE	'abc' '/' '/' 'def' 'ghi' 
boolean	TokenNameboolean	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
hasMore	TokenNameIdentifier	 has More
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_UNION	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  UNION
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
!	TokenNameNOT	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locationPathsVector	TokenNameIdentifier	 location Paths Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
buildLocationPath	TokenNameIdentifier	 build Location Path
(	TokenNameLPAREN	
stepsVector	TokenNameIdentifier	 steps Vector
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_ATSIGN	TokenNameIdentifier	 EXPRTOKEN  ATSIGN
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseNodeTest	TokenNameIdentifier	 parse Node Test
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xtokens	TokenNameIdentifier	 xtokens
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_ATTRIBUTE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ATTRIBUTE
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we got here we're expecting attribute:: 	TokenNameCOMMENT_LINE	If we got here we're expecting attribute:: 
if	TokenNameif	
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseNodeTest	TokenNameIdentifier	 parse Node Test
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xtokens	TokenNameIdentifier	 xtokens
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
:	TokenNameCOLON	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
:	TokenNameCOLON	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseNodeTest	TokenNameIdentifier	 parse Node Test
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
xtokens	TokenNameIdentifier	 xtokens
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_CHILD	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  CHILD
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we got here we're expecting child:: 	TokenNameCOMMENT_LINE	If we got here we're expecting child:: 
if	TokenNameif	
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseNodeTest	TokenNameIdentifier	 parse Node Test
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xtokens	TokenNameIdentifier	 xtokens
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// unless this is the first step in this location path, 	TokenNameCOMMENT_LINE	unless this is the first step in this location path, 
// there's really no reason to keep them in LocationPath. 	TokenNameCOMMENT_LINE	there's really no reason to keep them in LocationPath. 
// This amounts to shorten "a/././b/./c" to "a/b/c". 	TokenNameCOMMENT_LINE	This amounts to shorten "a/././b/./c" to "a/b/c". 
// Also, the matcher fails to work correctly if XPath 	TokenNameCOMMENT_LINE	Also, the matcher fails to work correctly if XPath 
// has those redundant dots. 	TokenNameCOMMENT_LINE	has those redundant dots. 
if	TokenNameif	
(	TokenNameLPAREN	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// build step 	TokenNameCOMMENT_LINE	build step 
Axis	TokenNameIdentifier	 Axis
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
=	TokenNameEQUAL	
new	TokenNamenew	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
nodeTest	TokenNameIdentifier	 node Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
hasMore	TokenNameIdentifier	 has More
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
peekToken	TokenNameIdentifier	 peek Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// consume '//' 	TokenNameCOMMENT_LINE	consume '//' 
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build step 	TokenNameCOMMENT_LINE	build step 
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeTest	TokenNameIdentifier	 node Test
=	TokenNameEQUAL	
new	TokenNamenew	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
nodeTest	TokenNameIdentifier	 node Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stepsVector	TokenNameIdentifier	 steps Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
:	TokenNameCOLON	
{	TokenNameLBRACE	
// this cannot appear in an arbitrary position. 	TokenNameCOMMENT_LINE	this cannot appear in an arbitrary position. 
// it is only allowed right after '.' when 	TokenNameCOMMENT_LINE	it is only allowed right after '.' when 
// '.' is the first token of a location path. 	TokenNameCOMMENT_LINE	'.' is the first token of a location path. 
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
:	TokenNameCOLON	
{	TokenNameLBRACE	
// :: cannot appear in an arbitrary position. 	TokenNameCOMMENT_LINE	:: cannot appear in an arbitrary position. 
// We only expect this token if the xpath 	TokenNameCOMMENT_LINE	We only expect this token if the xpath 
// contains child:: or attribute:: 	TokenNameCOMMENT_LINE	contains child:: or attribute:: 
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
:	TokenNameCOLON	
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
!	TokenNameNOT	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectingStep	TokenNameIdentifier	 expecting Step
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
// we should have covered all the tokens that we can possibly see. 	TokenNameCOMMENT_LINE	we should have covered all the tokens that we can possibly see. 
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
!	TokenNameNOT	
expectingStep	TokenNameIdentifier	 expecting Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locationPathsVector	TokenNameIdentifier	 location Paths Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
buildLocationPath	TokenNameIdentifier	 build Location Path
(	TokenNameLPAREN	
stepsVector	TokenNameIdentifier	 steps Vector
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return location path 	TokenNameCOMMENT_LINE	return location path 
return	TokenNamereturn	
(	TokenNameLPAREN	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
locationPathsVector	TokenNameIdentifier	 location Paths Vector
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
locationPathsVector	TokenNameIdentifier	 location Paths Vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parseExpression(SymbolTable,NamespaceContext) 	TokenNameCOMMENT_LINE	parseExpression(SymbolTable,NamespaceContext) 
/** * Used by {@link #parseExpression} to parse a node test * from the token list. */	TokenNameCOMMENT_JAVADOC	 Used by {@link #parseExpression} to parse a node test from the token list. 
private	TokenNameprivate	
NodeTest	TokenNameIdentifier	 Node Test
parseNodeTest	TokenNameIdentifier	 parse Node Test
(	TokenNameLPAREN	
int	TokenNameint	
typeToken	TokenNameIdentifier	 type Token
,	TokenNameCOMMA	
Tokens	TokenNameIdentifier	 Tokens
xtokens	TokenNameIdentifier	 xtokens
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
typeToken	TokenNameIdentifier	 type Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILDCARD	TokenNameIdentifier	 WILDCARD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
:	TokenNameCOLON	
case	TokenNamecase	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
:	TokenNameCOLON	
// consume QName token 	TokenNameCOMMENT_LINE	consume QName token 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextTokenAsString	TokenNameIdentifier	 next Token As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
&&	TokenNameAND_AND	
context	TokenNameIdentifier	 context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath-ns"	TokenNameStringLiteral	c-general-xpath-ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typeToken	TokenNameIdentifier	 type Token
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
xtokens	TokenNameIdentifier	 xtokens
.	TokenNameDOT	
nextTokenAsString	TokenNameIdentifier	 next Token As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
:	TokenNameCOLON	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
// location path information 	TokenNameCOMMENT_LINE	location path information 
/** * A location path representation for an XPath expression. * * @xerces.internal * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 A location path representation for an XPath expression. * @xerces.internal * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
LocationPath	TokenNameIdentifier	 Location Path
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** List of steps. */	TokenNameCOMMENT_JAVADOC	 List of steps. 
public	TokenNamepublic	
final	TokenNamefinal	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Creates a location path from a series of steps. */	TokenNameCOMMENT_JAVADOC	 Creates a location path from a series of steps. 
public	TokenNamepublic	
LocationPath	TokenNameIdentifier	 Location Path
(	TokenNameLPAREN	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
steps	TokenNameIdentifier	 steps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Step[]) 	TokenNameCOMMENT_LINE	<init>(Step[]) 
/** Copy constructor. */	TokenNameCOMMENT_JAVADOC	 Copy constructor. 
protected	TokenNameprotected	
LocationPath	TokenNameIdentifier	 Location Path
(	TokenNameLPAREN	
LocationPath	TokenNameIdentifier	 Location Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Step	TokenNameIdentifier	 Step
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>(LocationPath) 	TokenNameCOMMENT_LINE	<init>(LocationPath) 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
&&	TokenNameAND_AND	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DEBUG: This code is just for debugging and should *not* 	TokenNameCOMMENT_LINE	DEBUG: This code is just for debugging and should *not* 
// be left in because it will mess up hashcodes of 	TokenNameCOMMENT_LINE	be left in because it will mess up hashcodes of 
// serialized versions of this object. -Ac 	TokenNameCOMMENT_LINE	serialized versions of this object. -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
/** Returns a clone of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a clone of this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LocationPath	TokenNameIdentifier	 Location Path
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clone():Object 	TokenNameCOMMENT_LINE	clone():Object 
}	TokenNameRBRACE	
// class locationPath 	TokenNameCOMMENT_LINE	class locationPath 
/** * A location path step comprised of an axis and node test. * * @xerces.internal * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 A location path step comprised of an axis and node test. * @xerces.internal * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Step	TokenNameIdentifier	 Step
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Axis. */	TokenNameCOMMENT_JAVADOC	 Axis. 
public	TokenNamepublic	
final	TokenNamefinal	
Axis	TokenNameIdentifier	 Axis
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
/** Node test. */	TokenNameCOMMENT_JAVADOC	 Node test. 
public	TokenNamepublic	
final	TokenNamefinal	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a step from an axis and node test. */	TokenNameCOMMENT_JAVADOC	 Constructs a step from an axis and node test. 
public	TokenNamepublic	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nodeTest	TokenNameIdentifier	 node Test
=	TokenNameEQUAL	
nodeTest	TokenNameIdentifier	 node Test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Axis,NodeTest) 	TokenNameCOMMENT_LINE	<init>(Axis,NodeTest) 
/** Copy constructor. */	TokenNameCOMMENT_JAVADOC	 Copy constructor. 
protected	TokenNameprotected	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
)	TokenNameRPAREN	
step	TokenNameIdentifier	 step
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeTest	TokenNameIdentifier	 node Test
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
)	TokenNameRPAREN	
step	TokenNameIdentifier	 step
.	TokenNameDOT	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Step) 	TokenNameCOMMENT_LINE	<init>(Step) 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"//"	TokenNameStringLiteral	//
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"??? ("	TokenNameStringLiteral	??? (
+	TokenNamePLUS	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
/** Returns a clone of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a clone of this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clone():Object 	TokenNameCOMMENT_LINE	clone():Object 
}	TokenNameRBRACE	
// class Step 	TokenNameCOMMENT_LINE	class Step 
/** * Axis. * * @xerces.internal * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Axis. * @xerces.internal * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Axis	TokenNameIdentifier	 Axis
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Type: child. */	TokenNameCOMMENT_JAVADOC	 Type: child. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CHILD	TokenNameIdentifier	 CHILD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Type: attribute. */	TokenNameCOMMENT_JAVADOC	 Type: attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Type: self. */	TokenNameCOMMENT_JAVADOC	 Type: self. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SELF	TokenNameIdentifier	 SELF
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Type: descendant. */	TokenNameCOMMENT_JAVADOC	 Type: descendant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Axis type. */	TokenNameCOMMENT_JAVADOC	 Axis type. 
public	TokenNamepublic	
final	TokenNamefinal	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an axis with the specified type. */	TokenNameCOMMENT_JAVADOC	 Constructs an axis with the specified type. 
public	TokenNamepublic	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(short) 	TokenNameCOMMENT_LINE	<init>(short) 
/** Copy constructor. */	TokenNameCOMMENT_JAVADOC	 Copy constructor. 
protected	TokenNameprotected	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Axis) 	TokenNameCOMMENT_LINE	<init>(Axis) 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CHILD	TokenNameIdentifier	 CHILD
:	TokenNameCOLON	
return	TokenNamereturn	
"child"	TokenNameStringLiteral	child
;	TokenNameSEMICOLON	
case	TokenNamecase	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
:	TokenNameCOLON	
return	TokenNamereturn	
"attribute"	TokenNameStringLiteral	attribute
;	TokenNameSEMICOLON	
case	TokenNamecase	
SELF	TokenNameIdentifier	 SELF
:	TokenNameCOLON	
return	TokenNamereturn	
"self"	TokenNameStringLiteral	self
;	TokenNameSEMICOLON	
case	TokenNamecase	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
:	TokenNameCOLON	
return	TokenNamereturn	
"descendant"	TokenNameStringLiteral	descendant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"???"	TokenNameStringLiteral	???
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
/** Returns a clone of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a clone of this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Axis	TokenNameIdentifier	 Axis
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clone():Object 	TokenNameCOMMENT_LINE	clone():Object 
}	TokenNameRBRACE	
// class Axis 	TokenNameCOMMENT_LINE	class Axis 
/** * Node test. * * @xerces.internal * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Node test. * @xerces.internal * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NodeTest	TokenNameIdentifier	 Node Test
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Type: qualified name. */	TokenNameCOMMENT_JAVADOC	 Type: qualified name. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
QNAME	TokenNameIdentifier	 QNAME
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Type: wildcard. */	TokenNameCOMMENT_JAVADOC	 Type: wildcard. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WILDCARD	TokenNameIdentifier	 WILDCARD
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Type: node. */	TokenNameCOMMENT_JAVADOC	 Type: node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NODE	TokenNameIdentifier	 NODE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Type: namespace */	TokenNameCOMMENT_JAVADOC	 Type: namespace 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Node test type. */	TokenNameCOMMENT_JAVADOC	 Node test type. 
public	TokenNamepublic	
final	TokenNamefinal	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** Node qualified name. */	TokenNameCOMMENT_JAVADOC	 Node qualified name. 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a node test of type WILDCARD or NODE. */	TokenNameCOMMENT_JAVADOC	 Constructs a node test of type WILDCARD or NODE. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(int) 	TokenNameCOMMENT_LINE	<init>(int) 
/** Constructs a node test of type QName. */	TokenNameCOMMENT_JAVADOC	 Constructs a node test of type QName. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
QNAME	TokenNameIdentifier	 QNAME
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(QName) 	TokenNameCOMMENT_LINE	<init>(QName) 
/** Constructs a node test of type Namespace. */	TokenNameCOMMENT_JAVADOC	 Constructs a node test of type Namespace. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String) 	TokenNameCOMMENT_LINE	<init>(String,String) 
/** Copy constructor. */	TokenNameCOMMENT_JAVADOC	 Copy constructor. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(NodeTest) 	TokenNameCOMMENT_LINE	<init>(NodeTest) 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
QNAME	TokenNameIdentifier	 QNAME
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":*"	TokenNameStringLiteral	:*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":*"	TokenNameStringLiteral	:*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"???:*"	TokenNameStringLiteral	???:*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
WILDCARD	TokenNameIdentifier	 WILDCARD
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
NODE	TokenNameIdentifier	 NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
"node()"	TokenNameStringLiteral	node()
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
"???"	TokenNameStringLiteral	???
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
/** Returns a clone of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a clone of this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clone():Object 	TokenNameCOMMENT_LINE	clone():Object 
}	TokenNameRBRACE	
// class NodeTest 	TokenNameCOMMENT_LINE	class NodeTest 
// xpath implementation 	TokenNameCOMMENT_LINE	xpath implementation 
// NOTE: The XPath implementation classes are kept internal because 	TokenNameCOMMENT_LINE	NOTE: The XPath implementation classes are kept internal because 
// this implementation is just a temporary hack until a better 	TokenNameCOMMENT_LINE	this implementation is just a temporary hack until a better 
// and/or more appropriate implementation can be written. 	TokenNameCOMMENT_LINE	and/or more appropriate implementation can be written. 
// keeping the code in separate source files would "muddy" the 	TokenNameCOMMENT_LINE	keeping the code in separate source files would "muddy" the 
// CVS directory when it's not needed. -Ac 	TokenNameCOMMENT_LINE	CVS directory when it's not needed. -Ac 
/** * List of tokens. * * @xerces.internal * * @author Glenn Marcy, IBM * @author Andy Clark, IBM * * @version $Id: XPath.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 List of tokens. * @xerces.internal * @author Glenn Marcy, IBM @author Andy Clark, IBM * @version $Id: XPath.java 965250 2010-07-18 16:04:58Z mrglavas $ 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Tokens	TokenNameIdentifier	 Tokens
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DUMP_TOKENS	TokenNameIdentifier	 DUMP  TOKENS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * [28] ExprToken ::= '(' | ')' | '[' | ']' | '.' | '..' | '@' | ',' | '::' * | NameTest | NodeType | Operator | FunctionName * | AxisName | Literal | Number | VariableReference */	TokenNameCOMMENT_JAVADOC	 [28] ExprToken ::= '(' | ')' | '[' | ']' | '.' | '..' | '@' | ',' | '::' | NameTest | NodeType | Operator | FunctionName | AxisName | Literal | Number | VariableReference 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXPRTOKEN_OPEN_PAREN	TokenNameIdentifier	 EXPRTOKEN  OPEN  PAREN
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_CLOSE_PAREN	TokenNameIdentifier	 EXPRTOKEN  CLOSE  PAREN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPEN_BRACKET	TokenNameIdentifier	 EXPRTOKEN  OPEN  BRACKET
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_CLOSE_BRACKET	TokenNameIdentifier	 EXPRTOKEN  CLOSE  BRACKET
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_DOUBLE_PERIOD	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  PERIOD
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_ATSIGN	TokenNameIdentifier	 EXPRTOKEN  ATSIGN
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_COMMA	TokenNameIdentifier	 EXPRTOKEN  COMMA
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [37] NameTest ::= '*' | NCName ':' '*' | QName 	TokenNameCOMMENT_LINE	[37] NameTest ::= '*' | NCName ':' '*' | QName 
// 	TokenNameCOMMENT_LINE	 
// followed by symbol handle of NCName or QName 	TokenNameCOMMENT_LINE	followed by symbol handle of NCName or QName 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [38] NodeType ::= 'comment' | 'text' | 'processing-instruction' | 'node' 	TokenNameCOMMENT_LINE	[38] NodeType ::= 'comment' | 'text' | 'processing-instruction' | 'node' 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_NODETYPE_COMMENT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  COMMENT
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_NODETYPE_TEXT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  TEXT
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_NODETYPE_PI	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  PI
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_NODETYPE_NODE	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  NODE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [32] Operator ::= OperatorName 	TokenNameCOMMENT_LINE	[32] Operator ::= OperatorName 
// | MultiplyOperator 	TokenNameCOMMENT_LINE	| MultiplyOperator 
// | '/' | '//' | '|' | '+' | '-' | '=' | '!=' | '<' | '<=' | '>' | '>=' 	TokenNameCOMMENT_LINE	| '/' | '//' | '|' | '+' | '-' | '=' | '!=' | '<' | '<=' | '>' | '>=' 
// [33] OperatorName ::= 'and' | 'or' | 'mod' | 'div' 	TokenNameCOMMENT_LINE	[33] OperatorName ::= 'and' | 'or' | 'mod' | 'div' 
// [34] MultiplyOperator ::= '*' 	TokenNameCOMMENT_LINE	[34] MultiplyOperator ::= '*' 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_OPERATOR_AND	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  AND
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_OR	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  OR
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_MOD	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MOD
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_DIV	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DIV
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_MULT	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MULT
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_UNION	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  UNION
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_PLUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  PLUS
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_MINUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MINUS
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  EQUAL
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_NOT_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  NOT  EQUAL
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_LESS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_LESS_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS  EQUAL
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_GREATER	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_OPERATOR_GREATER_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER  EQUAL
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//EXPRTOKEN_FIRST_OPERATOR = EXPRTOKEN_OPERATOR_AND, 	TokenNameCOMMENT_LINE	EXPRTOKEN_FIRST_OPERATOR = EXPRTOKEN_OPERATOR_AND, 
//EXPRTOKEN_LAST_OPERATOR = EXPRTOKEN_OPERATOR_GREATER_EQUAL, 	TokenNameCOMMENT_LINE	EXPRTOKEN_LAST_OPERATOR = EXPRTOKEN_OPERATOR_GREATER_EQUAL, 
// 	TokenNameCOMMENT_LINE	 
// [35] FunctionName ::= QName - NodeType 	TokenNameCOMMENT_LINE	[35] FunctionName ::= QName - NodeType 
// 	TokenNameCOMMENT_LINE	 
// followed by symbol handle 	TokenNameCOMMENT_LINE	followed by symbol handle 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_FUNCTION_NAME	TokenNameIdentifier	 EXPRTOKEN  FUNCTION  NAME
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [6] AxisName ::= 'ancestor' | 'ancestor-or-self' 	TokenNameCOMMENT_LINE	[6] AxisName ::= 'ancestor' | 'ancestor-or-self' 
// | 'attribute' 	TokenNameCOMMENT_LINE	| 'attribute' 
// | 'child' 	TokenNameCOMMENT_LINE	| 'child' 
// | 'descendant' | 'descendant-or-self' 	TokenNameCOMMENT_LINE	| 'descendant' | 'descendant-or-self' 
// | 'following' | 'following-sibling' 	TokenNameCOMMENT_LINE	| 'following' | 'following-sibling' 
// | 'namespace' 	TokenNameCOMMENT_LINE	| 'namespace' 
// | 'parent' 	TokenNameCOMMENT_LINE	| 'parent' 
// | 'preceding' | 'preceding-sibling' 	TokenNameCOMMENT_LINE	| 'preceding' | 'preceding-sibling' 
// | 'self' 	TokenNameCOMMENT_LINE	| 'self' 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_AXISNAME_ANCESTOR	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR  OR  SELF
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_ATTRIBUTE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ATTRIBUTE
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_CHILD	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  CHILD
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_DESCENDANT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT  OR  SELF
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_FOLLOWING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING  SIBLING
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  NAMESPACE
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_PARENT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PARENT
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_PRECEDING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_PRECEDING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING  SIBLING
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EXPRTOKEN_AXISNAME_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  SELF
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [29] Literal ::= '"' [^"]* '"' | "'" [^']* "'" 	TokenNameCOMMENT_LINE	[29] Literal ::= '"' [^"]* '"' | "'" [^']* "'" 
// 	TokenNameCOMMENT_LINE	 
// followed by symbol handle for literal 	TokenNameCOMMENT_LINE	followed by symbol handle for literal 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_LITERAL	TokenNameIdentifier	 EXPRTOKEN  LITERAL
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [30] Number ::= Digits ('.' Digits?)? | '.' Digits 	TokenNameCOMMENT_LINE	[30] Number ::= Digits ('.' Digits?)? | '.' Digits 
// [31] Digits ::= [0-9]+ 	TokenNameCOMMENT_LINE	[31] Digits ::= [0-9]+ 
// 	TokenNameCOMMENT_LINE	 
// followed by number handle 	TokenNameCOMMENT_LINE	followed by number handle 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_NUMBER	TokenNameIdentifier	 EXPRTOKEN  NUMBER
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 	TokenNameCOMMENT_LINE	 
// [36] VariableReference ::= '$' QName 	TokenNameCOMMENT_LINE	[36] VariableReference ::= '$' QName 
// 	TokenNameCOMMENT_LINE	 
// followed by symbol handle for QName 	TokenNameCOMMENT_LINE	followed by symbol handle for QName 
// 	TokenNameCOMMENT_LINE	 
EXPRTOKEN_VARIABLE_REFERENCE	TokenNameIdentifier	 EXPRTOKEN  VARIABLE  REFERENCE
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgTokenNames	TokenNameIdentifier	 fg Token Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"EXPRTOKEN_OPEN_PAREN"	TokenNameStringLiteral	EXPRTOKEN_OPEN_PAREN
,	TokenNameCOMMA	
"EXPRTOKEN_CLOSE_PAREN"	TokenNameStringLiteral	EXPRTOKEN_CLOSE_PAREN
,	TokenNameCOMMA	
"EXPRTOKEN_OPEN_BRACKET"	TokenNameStringLiteral	EXPRTOKEN_OPEN_BRACKET
,	TokenNameCOMMA	
"EXPRTOKEN_CLOSE_BRACKET"	TokenNameStringLiteral	EXPRTOKEN_CLOSE_BRACKET
,	TokenNameCOMMA	
"EXPRTOKEN_PERIOD"	TokenNameStringLiteral	EXPRTOKEN_PERIOD
,	TokenNameCOMMA	
"EXPRTOKEN_DOUBLE_PERIOD"	TokenNameStringLiteral	EXPRTOKEN_DOUBLE_PERIOD
,	TokenNameCOMMA	
"EXPRTOKEN_ATSIGN"	TokenNameStringLiteral	EXPRTOKEN_ATSIGN
,	TokenNameCOMMA	
"EXPRTOKEN_COMMA"	TokenNameStringLiteral	EXPRTOKEN_COMMA
,	TokenNameCOMMA	
"EXPRTOKEN_DOUBLE_COLON"	TokenNameStringLiteral	EXPRTOKEN_DOUBLE_COLON
,	TokenNameCOMMA	
"EXPRTOKEN_NAMETEST_ANY"	TokenNameStringLiteral	EXPRTOKEN_NAMETEST_ANY
,	TokenNameCOMMA	
"EXPRTOKEN_NAMETEST_NAMESPACE"	TokenNameStringLiteral	EXPRTOKEN_NAMETEST_NAMESPACE
,	TokenNameCOMMA	
"EXPRTOKEN_NAMETEST_QNAME"	TokenNameStringLiteral	EXPRTOKEN_NAMETEST_QNAME
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_COMMENT"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_COMMENT
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_TEXT"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_TEXT
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_PI"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_PI
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_NODE"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_NODE
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_AND"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_AND
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_OR"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_OR
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_MOD"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_MOD
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_DIV"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_DIV
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_MULT"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_MULT
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_SLASH"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_SLASH
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_DOUBLE_SLASH"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_DOUBLE_SLASH
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_UNION"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_UNION
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_PLUS"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_PLUS
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_MINUS"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_MINUS
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_EQUAL
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_NOT_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_NOT_EQUAL
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_LESS"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_LESS
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_LESS_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_LESS_EQUAL
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_GREATER"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_GREATER
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_GREATER_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_GREATER_EQUAL
,	TokenNameCOMMA	
"EXPRTOKEN_FUNCTION_NAME"	TokenNameStringLiteral	EXPRTOKEN_FUNCTION_NAME
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_ANCESTOR"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_ANCESTOR
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_ATTRIBUTE"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_ATTRIBUTE
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_CHILD"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_CHILD
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_DESCENDANT"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_DESCENDANT
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_FOLLOWING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_FOLLOWING
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_NAMESPACE"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_NAMESPACE
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_PARENT"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_PARENT
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_PRECEDING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_PRECEDING
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_PRECEDING_SIBLING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_PRECEDING_SIBLING
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_SELF"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_SELF
,	TokenNameCOMMA	
"EXPRTOKEN_LITERAL"	TokenNameStringLiteral	EXPRTOKEN_LITERAL
,	TokenNameCOMMA	
"EXPRTOKEN_NUMBER"	TokenNameStringLiteral	EXPRTOKEN_NUMBER
,	TokenNameCOMMA	
"EXPRTOKEN_VARIABLE_REFERENCE"	TokenNameStringLiteral	EXPRTOKEN_VARIABLE_REFERENCE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_TOKEN_COUNT	TokenNameIdentifier	 INITIAL  TOKEN  COUNT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fTokens	TokenNameIdentifier	 f Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_TOKEN_COUNT	TokenNameIdentifier	 INITIAL  TOKEN  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fTokenCount	TokenNameIdentifier	 f Token Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for writing 	TokenNameCOMMENT_LINE	for writing 
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
// REVISIT: Code something better here. -Ac 	TokenNameCOMMENT_LINE	REVISIT: Code something better here. -Ac 
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
fSymbolMapping	TokenNameIdentifier	 f Symbol Mapping
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: Code something better here. -Ac 	TokenNameCOMMENT_LINE	REVISIT: Code something better here. -Ac 
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
fTokenNames	TokenNameIdentifier	 f Token Names
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Current position in the token list. */	TokenNameCOMMENT_JAVADOC	 Current position in the token list. 
private	TokenNameprivate	
int	TokenNameint	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
Tokens	TokenNameIdentifier	 Tokens
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
symbols	TokenNameIdentifier	 symbols
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"ancestor"	TokenNameStringLiteral	ancestor
,	TokenNameCOMMA	
"ancestor-or-self"	TokenNameStringLiteral	ancestor-or-self
,	TokenNameCOMMA	
"attribute"	TokenNameStringLiteral	attribute
,	TokenNameCOMMA	
"child"	TokenNameStringLiteral	child
,	TokenNameCOMMA	
"descendant"	TokenNameStringLiteral	descendant
,	TokenNameCOMMA	
"descendant-or-self"	TokenNameStringLiteral	descendant-or-self
,	TokenNameCOMMA	
"following"	TokenNameStringLiteral	following
,	TokenNameCOMMA	
"following-sibling"	TokenNameStringLiteral	following-sibling
,	TokenNameCOMMA	
"namespace"	TokenNameStringLiteral	namespace
,	TokenNameCOMMA	
"parent"	TokenNameStringLiteral	parent
,	TokenNameCOMMA	
"preceding"	TokenNameStringLiteral	preceding
,	TokenNameCOMMA	
"preceding-sibling"	TokenNameStringLiteral	preceding-sibling
,	TokenNameCOMMA	
"self"	TokenNameStringLiteral	self
,	TokenNameCOMMA	
}	TokenNameRBRACE	
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
symbols	TokenNameIdentifier	 symbols
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolMapping	TokenNameIdentifier	 f Symbol Mapping
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
symbols	TokenNameIdentifier	 symbols
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPEN_PAREN	TokenNameIdentifier	 EXPRTOKEN  OPEN  PAREN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPEN_PAREN"	TokenNameStringLiteral	EXPRTOKEN_OPEN_PAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_CLOSE_PAREN	TokenNameIdentifier	 EXPRTOKEN  CLOSE  PAREN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_CLOSE_PAREN"	TokenNameStringLiteral	EXPRTOKEN_CLOSE_PAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPEN_BRACKET	TokenNameIdentifier	 EXPRTOKEN  OPEN  BRACKET
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPEN_BRACKET"	TokenNameStringLiteral	EXPRTOKEN_OPEN_BRACKET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_CLOSE_BRACKET	TokenNameIdentifier	 EXPRTOKEN  CLOSE  BRACKET
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_CLOSE_BRACKET"	TokenNameStringLiteral	EXPRTOKEN_CLOSE_BRACKET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_PERIOD"	TokenNameStringLiteral	EXPRTOKEN_PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_DOUBLE_PERIOD	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  PERIOD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_DOUBLE_PERIOD"	TokenNameStringLiteral	EXPRTOKEN_DOUBLE_PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_ATSIGN	TokenNameIdentifier	 EXPRTOKEN  ATSIGN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_ATSIGN"	TokenNameStringLiteral	EXPRTOKEN_ATSIGN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_COMMA	TokenNameIdentifier	 EXPRTOKEN  COMMA
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_COMMA"	TokenNameStringLiteral	EXPRTOKEN_COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_DOUBLE_COLON"	TokenNameStringLiteral	EXPRTOKEN_DOUBLE_COLON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NAMETEST_ANY"	TokenNameStringLiteral	EXPRTOKEN_NAMETEST_ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NAMETEST_NAMESPACE"	TokenNameStringLiteral	EXPRTOKEN_NAMETEST_NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NAMETEST_QNAME"	TokenNameStringLiteral	EXPRTOKEN_NAMETEST_QNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NODETYPE_COMMENT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  COMMENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_COMMENT"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NODETYPE_TEXT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  TEXT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_TEXT"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NODETYPE_PI	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  PI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_PI"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NODETYPE_NODE	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  NODE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NODETYPE_NODE"	TokenNameStringLiteral	EXPRTOKEN_NODETYPE_NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_AND	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  AND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_AND"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_AND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_OR	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  OR
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_OR"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_OR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_MOD	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MOD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_MOD"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_MOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_DIV	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DIV
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_DIV"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_DIV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_MULT	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MULT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_MULT"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_MULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_SLASH"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_SLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_DOUBLE_SLASH"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_DOUBLE_SLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_UNION	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  UNION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_UNION"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_UNION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_PLUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  PLUS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_PLUS"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_PLUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_MINUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MINUS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_MINUS"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_MINUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  EQUAL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_NOT_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  NOT  EQUAL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_NOT_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_NOT_EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_LESS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_LESS"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_LESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_LESS_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS  EQUAL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_LESS_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_LESS_EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_GREATER	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_GREATER"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_GREATER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_OPERATOR_GREATER_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER  EQUAL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_OPERATOR_GREATER_EQUAL"	TokenNameStringLiteral	EXPRTOKEN_OPERATOR_GREATER_EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_FUNCTION_NAME	TokenNameIdentifier	 EXPRTOKEN  FUNCTION  NAME
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_FUNCTION_NAME"	TokenNameStringLiteral	EXPRTOKEN_FUNCTION_NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_ANCESTOR	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_ANCESTOR"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR  OR  SELF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_ATTRIBUTE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ATTRIBUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_ATTRIBUTE"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_CHILD	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  CHILD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_CHILD"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_DESCENDANT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_DESCENDANT"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_DESCENDANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT  OR  SELF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_FOLLOWING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_FOLLOWING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING  SIBLING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  NAMESPACE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_NAMESPACE"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_PARENT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PARENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_PARENT"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_PARENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_PRECEDING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_PRECEDING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_PRECEDING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING  SIBLING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_PRECEDING_SIBLING"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_PRECEDING_SIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_AXISNAME_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  SELF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_AXISNAME_SELF"	TokenNameStringLiteral	EXPRTOKEN_AXISNAME_SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_LITERAL	TokenNameIdentifier	 EXPRTOKEN  LITERAL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_LITERAL"	TokenNameStringLiteral	EXPRTOKEN_LITERAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_NUMBER	TokenNameIdentifier	 EXPRTOKEN  NUMBER
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_NUMBER"	TokenNameStringLiteral	EXPRTOKEN_NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
EXPRTOKEN_VARIABLE_REFERENCE	TokenNameIdentifier	 EXPRTOKEN  VARIABLE  REFERENCE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"EXPRTOKEN_VARIABLE_REFERENCE"	TokenNameStringLiteral	EXPRTOKEN_VARIABLE_REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
// public String getTokenName(int token) { 	TokenNameCOMMENT_LINE	public String getTokenName(int token) { 
// if (token < 0 || token >= fgTokenNames.length) 	TokenNameCOMMENT_LINE	if (token < 0 || token >= fgTokenNames.length) 
// return null; 	TokenNameCOMMENT_LINE	return null; 
// return fgTokenNames[token]; 	TokenNameCOMMENT_LINE	return fgTokenNames[token]; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tokenStr	TokenNameIdentifier	 token Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
tokenInt	TokenNameIdentifier	 token Int
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tokenStr	TokenNameIdentifier	 token Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenInt	TokenNameIdentifier	 token Int
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenInt	TokenNameIdentifier	 token Int
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tokenInt	TokenNameIdentifier	 token Int
,	TokenNameCOMMA	
tokenStr	TokenNameIdentifier	 token Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokenInt	TokenNameIdentifier	 token Int
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fTokenCount	TokenNameIdentifier	 f Token Count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldList	TokenNameIdentifier	 old List
=	TokenNameEQUAL	
fTokens	TokenNameIdentifier	 f Tokens
;	TokenNameSEMICOLON	
fTokens	TokenNameIdentifier	 f Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fTokenCount	TokenNameIdentifier	 f Token Count
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldList	TokenNameIdentifier	 old List
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fTokens	TokenNameIdentifier	 f Tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fTokenCount	TokenNameIdentifier	 f Token Count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fTokenCount	TokenNameIdentifier	 f Token Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public int getTokenCount() { 	TokenNameCOMMENT_LINE	public int getTokenCount() { 
// return fTokenCount; 	TokenNameCOMMENT_LINE	return fTokenCount; 
// } 	TokenNameCOMMENT_LINE	} 
// public int getToken(int tokenIndex) { 	TokenNameCOMMENT_LINE	public int getToken(int tokenIndex) { 
// return fTokens[tokenIndex]; 	TokenNameCOMMENT_LINE	return fTokens[tokenIndex]; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Resets the current position to the head of the token list. */	TokenNameCOMMENT_JAVADOC	 Resets the current position to the head of the token list. 
public	TokenNamepublic	
void	TokenNamevoid	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the {@link #getNextToken()} method * returns a valid token. */	TokenNameCOMMENT_JAVADOC	 Returns true if the {@link #getNextToken()} method returns a valid token. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMore	TokenNameIdentifier	 has More
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
<	TokenNameLESS	
fTokenCount	TokenNameIdentifier	 f Token Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the token at the current position, then advance * the current position by one. * * If there's no such next token, this method throws * <tt>new XPathException("c-general-xpath");</tt>. */	TokenNameCOMMENT_JAVADOC	 Obtains the token at the current position, then advance the current position by one. * If there's no such next token, this method throws <tt>new XPathException("c-general-xpath");</tt>. 
public	TokenNamepublic	
int	TokenNameint	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
==	TokenNameEQUAL_EQUAL	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the token at the current position, without advancing * the current position. * * If there's no such next token, this method throws * <tt>new XPathException("c-general-xpath");</tt>. */	TokenNameCOMMENT_JAVADOC	 Obtains the token at the current position, without advancing the current position. * If there's no such next token, this method throws <tt>new XPathException("c-general-xpath");</tt>. 
public	TokenNamepublic	
int	TokenNameint	
peekToken	TokenNameIdentifier	 peek Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
==	TokenNameEQUAL_EQUAL	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the token at the current position as a String. * * If there's no current token or if the current token * is not a string token, this method throws * <tt>new XPathException("c-general-xpath");</tt>. */	TokenNameCOMMENT_JAVADOC	 Obtains the token at the current position as a String. * If there's no current token or if the current token is not a string token, this method throws <tt>new XPathException("c-general-xpath");</tt>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nextTokenAsString	TokenNameIdentifier	 next Token As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dumpTokens	TokenNameIdentifier	 dump Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if (DUMP_TOKENS) { 	TokenNameCOMMENT_LINE	if (DUMP_TOKENS) { 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fTokenCount	TokenNameIdentifier	 f Token Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
EXPRTOKEN_OPEN_PAREN	TokenNameIdentifier	 EXPRTOKEN  OPEN  PAREN
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPEN_PAREN/>"	TokenNameStringLiteral	<OPEN_PAREN/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_CLOSE_PAREN	TokenNameIdentifier	 EXPRTOKEN  CLOSE  PAREN
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<CLOSE_PAREN/>"	TokenNameStringLiteral	<CLOSE_PAREN/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPEN_BRACKET	TokenNameIdentifier	 EXPRTOKEN  OPEN  BRACKET
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPEN_BRACKET/>"	TokenNameStringLiteral	<OPEN_BRACKET/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_CLOSE_BRACKET	TokenNameIdentifier	 EXPRTOKEN  CLOSE  BRACKET
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<CLOSE_BRACKET/>"	TokenNameStringLiteral	<CLOSE_BRACKET/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<PERIOD/>"	TokenNameStringLiteral	<PERIOD/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_DOUBLE_PERIOD	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  PERIOD
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<DOUBLE_PERIOD/>"	TokenNameStringLiteral	<DOUBLE_PERIOD/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_ATSIGN	TokenNameIdentifier	 EXPRTOKEN  ATSIGN
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<ATSIGN/>"	TokenNameStringLiteral	<ATSIGN/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_COMMA	TokenNameIdentifier	 EXPRTOKEN  COMMA
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<COMMA/>"	TokenNameStringLiteral	<COMMA/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<DOUBLE_COLON/>"	TokenNameStringLiteral	<DOUBLE_COLON/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NAMETEST_ANY/>"	TokenNameStringLiteral	<NAMETEST_ANY/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NAMETEST_NAMESPACE"	TokenNameStringLiteral	<NAMETEST_NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" prefix=""	TokenNameStringLiteral	 prefix="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NAMETEST_QNAME"	TokenNameStringLiteral	<NAMETEST_QNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" prefix=""	TokenNameStringLiteral	 prefix="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" localpart=""	TokenNameStringLiteral	 localpart="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NODETYPE_COMMENT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  COMMENT
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NODETYPE_COMMENT/>"	TokenNameStringLiteral	<NODETYPE_COMMENT/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NODETYPE_TEXT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  TEXT
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NODETYPE_TEXT/>"	TokenNameStringLiteral	<NODETYPE_TEXT/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NODETYPE_PI	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  PI
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NODETYPE_PI/>"	TokenNameStringLiteral	<NODETYPE_PI/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NODETYPE_NODE	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  NODE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NODETYPE_NODE/>"	TokenNameStringLiteral	<NODETYPE_NODE/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_AND	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  AND
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_AND/>"	TokenNameStringLiteral	<OPERATOR_AND/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_OR	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  OR
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_OR/>"	TokenNameStringLiteral	<OPERATOR_OR/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_MOD	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MOD
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_MOD/>"	TokenNameStringLiteral	<OPERATOR_MOD/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_DIV	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DIV
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_DIV/>"	TokenNameStringLiteral	<OPERATOR_DIV/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_MULT	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MULT
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_MULT/>"	TokenNameStringLiteral	<OPERATOR_MULT/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_SLASH/>"	TokenNameStringLiteral	<OPERATOR_SLASH/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_DOUBLE_SLASH/>"	TokenNameStringLiteral	<OPERATOR_DOUBLE_SLASH/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_UNION	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  UNION
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_UNION/>"	TokenNameStringLiteral	<OPERATOR_UNION/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_PLUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  PLUS
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_PLUS/>"	TokenNameStringLiteral	<OPERATOR_PLUS/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_MINUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MINUS
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_MINUS/>"	TokenNameStringLiteral	<OPERATOR_MINUS/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  EQUAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_EQUAL/>"	TokenNameStringLiteral	<OPERATOR_EQUAL/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_NOT_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  NOT  EQUAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_NOT_EQUAL/>"	TokenNameStringLiteral	<OPERATOR_NOT_EQUAL/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_LESS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_LESS/>"	TokenNameStringLiteral	<OPERATOR_LESS/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_LESS_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS  EQUAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_LESS_EQUAL/>"	TokenNameStringLiteral	<OPERATOR_LESS_EQUAL/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_GREATER	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_GREATER/>"	TokenNameStringLiteral	<OPERATOR_GREATER/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_OPERATOR_GREATER_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER  EQUAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<OPERATOR_GREATER_EQUAL/>"	TokenNameStringLiteral	<OPERATOR_GREATER_EQUAL/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_FUNCTION_NAME	TokenNameIdentifier	 EXPRTOKEN  FUNCTION  NAME
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<FUNCTION_NAME"	TokenNameStringLiteral	<FUNCTION_NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" prefix=""	TokenNameStringLiteral	 prefix="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" localpart=""	TokenNameStringLiteral	 localpart="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_ANCESTOR	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_ANCESTOR/>"	TokenNameStringLiteral	<AXISNAME_ANCESTOR/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR  OR  SELF
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_ANCESTOR_OR_SELF/>"	TokenNameStringLiteral	<AXISNAME_ANCESTOR_OR_SELF/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_ATTRIBUTE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ATTRIBUTE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_ATTRIBUTE/>"	TokenNameStringLiteral	<AXISNAME_ATTRIBUTE/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_CHILD	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  CHILD
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_CHILD/>"	TokenNameStringLiteral	<AXISNAME_CHILD/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_DESCENDANT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_DESCENDANT/>"	TokenNameStringLiteral	<AXISNAME_DESCENDANT/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT  OR  SELF
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_DESCENDANT_OR_SELF/>"	TokenNameStringLiteral	<AXISNAME_DESCENDANT_OR_SELF/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_FOLLOWING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_FOLLOWING/>"	TokenNameStringLiteral	<AXISNAME_FOLLOWING/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING  SIBLING
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_FOLLOWING_SIBLING/>"	TokenNameStringLiteral	<AXISNAME_FOLLOWING_SIBLING/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  NAMESPACE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_NAMESPACE/>"	TokenNameStringLiteral	<AXISNAME_NAMESPACE/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_PARENT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PARENT
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_PARENT/>"	TokenNameStringLiteral	<AXISNAME_PARENT/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_PRECEDING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_PRECEDING/>"	TokenNameStringLiteral	<AXISNAME_PRECEDING/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_PRECEDING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING  SIBLING
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_PRECEDING_SIBLING/>"	TokenNameStringLiteral	<AXISNAME_PRECEDING_SIBLING/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_AXISNAME_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  SELF
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<AXISNAME_SELF/>"	TokenNameStringLiteral	<AXISNAME_SELF/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_LITERAL	TokenNameIdentifier	 EXPRTOKEN  LITERAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<LITERAL"	TokenNameStringLiteral	<LITERAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" value=""	TokenNameStringLiteral	 value="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_NUMBER	TokenNameIdentifier	 EXPRTOKEN  NUMBER
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<NUMBER"	TokenNameStringLiteral	<NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" whole=""	TokenNameStringLiteral	 whole="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" part=""	TokenNameStringLiteral	 part="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXPRTOKEN_VARIABLE_REFERENCE	TokenNameIdentifier	 EXPRTOKEN  VARIABLE  REFERENCE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<VARIABLE_REFERENCE"	TokenNameStringLiteral	<VARIABLE_REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" prefix=""	TokenNameStringLiteral	 prefix="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" localpart=""	TokenNameStringLiteral	 localpart="
+	TokenNamePLUS	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<???/>"	TokenNameStringLiteral	<???/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//} 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class Tokens 	TokenNameCOMMENT_LINE	class Tokens 
/** * @xerces.internal * * @author Glenn Marcy, IBM * @author Andy Clark, IBM * * @version $Id: XPath.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Glenn Marcy, IBM @author Andy Clark, IBM * @version $Id: XPath.java 965250 2010-07-18 16:04:58Z mrglavas $ 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Scanner	TokenNameIdentifier	 Scanner
{	TokenNameLBRACE	
/** * 7-bit ASCII subset * * 0 1 2 3 4 5 6 7 8 9 A B C D E F * 0, 0, 0, 0, 0, 0, 0, 0, 0, HT, LF, 0, 0, CR, 0, 0, // 0 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 1 * SP, !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, // 2 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, :, ;, <, =, >, ?, // 3 * @, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, // 4 * P, Q, R, S, T, U, V, W, X, Y, Z, [, \, ], ^, _, // 5 * `, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, // 6 * p, q, r, s, t, u, v, w, x, y, z, {, |, }, ~, DEL // 7 */	TokenNameCOMMENT_JAVADOC	 7-bit ASCII subset * 0 1 2 3 4 5 6 7 8 9 A B C D E F 0, 0, 0, 0, 0, 0, 0, 0, 0, HT, LF, 0, 0, CR, 0, 0, // 0 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 1 SP, !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, // 2 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, :, ;, <, =, >, ?, // 3 @, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, // 4 P, Q, R, S, T, U, V, W, X, Y, Z, [, \, ], ^, _, // 5 `, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, // 6 p, q, r, s, t, u, v, w, x, y, z, {, |, }, ~, DEL // 7 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHARTYPE_INVALID	TokenNameIdentifier	 CHARTYPE  INVALID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// invalid XML character 	TokenNameCOMMENT_LINE	invalid XML character 
CHARTYPE_OTHER	TokenNameIdentifier	 CHARTYPE  OTHER
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// not special - one of "#%&;?\^`{}~" or DEL 	TokenNameCOMMENT_LINE	not special - one of "#%&;?\^`{}~" or DEL 
CHARTYPE_WHITESPACE	TokenNameIdentifier	 CHARTYPE  WHITESPACE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// one of "\t\n\r " (0x09, 0x0A, 0x0D, 0x20) 	TokenNameCOMMENT_LINE	one of "\t\n\r " (0x09, 0x0A, 0x0D, 0x20) 
CHARTYPE_EXCLAMATION	TokenNameIdentifier	 CHARTYPE  EXCLAMATION
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '!' (0x21) 	TokenNameCOMMENT_LINE	'!' (0x21) 
CHARTYPE_QUOTE	TokenNameIdentifier	 CHARTYPE  QUOTE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '\"' or '\'' (0x22 and 0x27) 	TokenNameCOMMENT_LINE	'\"' or '\'' (0x22 and 0x27) 
CHARTYPE_DOLLAR	TokenNameIdentifier	 CHARTYPE  DOLLAR
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '$' (0x24) 	TokenNameCOMMENT_LINE	'$' (0x24) 
CHARTYPE_OPEN_PAREN	TokenNameIdentifier	 CHARTYPE  OPEN  PAREN
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '(' (0x28) 	TokenNameCOMMENT_LINE	'(' (0x28) 
CHARTYPE_CLOSE_PAREN	TokenNameIdentifier	 CHARTYPE  CLOSE  PAREN
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ')' (0x29) 	TokenNameCOMMENT_LINE	')' (0x29) 
CHARTYPE_STAR	TokenNameIdentifier	 CHARTYPE  STAR
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '*' (0x2A) 	TokenNameCOMMENT_LINE	'*' (0x2A) 
CHARTYPE_PLUS	TokenNameIdentifier	 CHARTYPE  PLUS
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '+' (0x2B) 	TokenNameCOMMENT_LINE	'+' (0x2B) 
CHARTYPE_COMMA	TokenNameIdentifier	 CHARTYPE  COMMA
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ',' (0x2C) 	TokenNameCOMMENT_LINE	',' (0x2C) 
CHARTYPE_MINUS	TokenNameIdentifier	 CHARTYPE  MINUS
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '-' (0x2D) 	TokenNameCOMMENT_LINE	'-' (0x2D) 
CHARTYPE_PERIOD	TokenNameIdentifier	 CHARTYPE  PERIOD
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '.' (0x2E) 	TokenNameCOMMENT_LINE	'.' (0x2E) 
CHARTYPE_SLASH	TokenNameIdentifier	 CHARTYPE  SLASH
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '/' (0x2F) 	TokenNameCOMMENT_LINE	'/' (0x2F) 
CHARTYPE_DIGIT	TokenNameIdentifier	 CHARTYPE  DIGIT
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '0'-'9' (0x30 to 0x39) 	TokenNameCOMMENT_LINE	'0'-'9' (0x30 to 0x39) 
CHARTYPE_COLON	TokenNameIdentifier	 CHARTYPE  COLON
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ':' (0x3A) 	TokenNameCOMMENT_LINE	':' (0x3A) 
CHARTYPE_LESS	TokenNameIdentifier	 CHARTYPE  LESS
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '<' (0x3C) 	TokenNameCOMMENT_LINE	'<' (0x3C) 
CHARTYPE_EQUAL	TokenNameIdentifier	 CHARTYPE  EQUAL
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '=' (0x3D) 	TokenNameCOMMENT_LINE	'=' (0x3D) 
CHARTYPE_GREATER	TokenNameIdentifier	 CHARTYPE  GREATER
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '>' (0x3E) 	TokenNameCOMMENT_LINE	'>' (0x3E) 
CHARTYPE_ATSIGN	TokenNameIdentifier	 CHARTYPE  ATSIGN
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '@' (0x40) 	TokenNameCOMMENT_LINE	'@' (0x40) 
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 'A'-'Z' or 'a'-'z' (0x41 to 0x5A and 0x61 to 0x7A) 	TokenNameCOMMENT_LINE	'A'-'Z' or 'a'-'z' (0x41 to 0x5A and 0x61 to 0x7A) 
CHARTYPE_OPEN_BRACKET	TokenNameIdentifier	 CHARTYPE  OPEN  BRACKET
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '[' (0x5B) 	TokenNameCOMMENT_LINE	'[' (0x5B) 
CHARTYPE_CLOSE_BRACKET	TokenNameIdentifier	 CHARTYPE  CLOSE  BRACKET
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// ']' (0x5D) 	TokenNameCOMMENT_LINE	']' (0x5D) 
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '_' (0x5F) 	TokenNameCOMMENT_LINE	'_' (0x5F) 
CHARTYPE_UNION	TokenNameIdentifier	 CHARTYPE  UNION
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '|' (0x7C) 	TokenNameCOMMENT_LINE	'|' (0x7C) 
CHARTYPE_NONASCII	TokenNameIdentifier	 CHARTYPE  NONASCII
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Non-ASCII Unicode codepoint (>= 0x80) 	TokenNameCOMMENT_LINE	Non-ASCII Unicode codepoint (>= 0x80) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Symbol literals */	TokenNameCOMMENT_JAVADOC	 Symbol literals 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Symbol table. */	TokenNameCOMMENT_JAVADOC	 Symbol table. 
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
// symbols 	TokenNameCOMMENT_LINE	symbols 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fAndSymbol	TokenNameIdentifier	 f And Symbol
=	TokenNameEQUAL	
"and"	TokenNameStringLiteral	and
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fOrSymbol	TokenNameIdentifier	 f Or Symbol
=	TokenNameEQUAL	
"or"	TokenNameStringLiteral	or
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fModSymbol	TokenNameIdentifier	 f Mod Symbol
=	TokenNameEQUAL	
"mod"	TokenNameStringLiteral	mod
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fDivSymbol	TokenNameIdentifier	 f Div Symbol
=	TokenNameEQUAL	
"div"	TokenNameStringLiteral	div
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fCommentSymbol	TokenNameIdentifier	 f Comment Symbol
=	TokenNameEQUAL	
"comment"	TokenNameStringLiteral	comment
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fTextSymbol	TokenNameIdentifier	 f Text Symbol
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fPISymbol	TokenNameIdentifier	 f PI Symbol
=	TokenNameEQUAL	
"processing-instruction"	TokenNameStringLiteral	processing-instruction
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fNodeSymbol	TokenNameIdentifier	 f Node Symbol
=	TokenNameEQUAL	
"node"	TokenNameStringLiteral	node
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fAncestorSymbol	TokenNameIdentifier	 f Ancestor Symbol
=	TokenNameEQUAL	
"ancestor"	TokenNameStringLiteral	ancestor
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fAncestorOrSelfSymbol	TokenNameIdentifier	 f Ancestor Or Self Symbol
=	TokenNameEQUAL	
"ancestor-or-self"	TokenNameStringLiteral	ancestor-or-self
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fAttributeSymbol	TokenNameIdentifier	 f Attribute Symbol
=	TokenNameEQUAL	
"attribute"	TokenNameStringLiteral	attribute
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fChildSymbol	TokenNameIdentifier	 f Child Symbol
=	TokenNameEQUAL	
"child"	TokenNameStringLiteral	child
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fDescendantSymbol	TokenNameIdentifier	 f Descendant Symbol
=	TokenNameEQUAL	
"descendant"	TokenNameStringLiteral	descendant
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fDescendantOrSelfSymbol	TokenNameIdentifier	 f Descendant Or Self Symbol
=	TokenNameEQUAL	
"descendant-or-self"	TokenNameStringLiteral	descendant-or-self
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fFollowingSymbol	TokenNameIdentifier	 f Following Symbol
=	TokenNameEQUAL	
"following"	TokenNameStringLiteral	following
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fFollowingSiblingSymbol	TokenNameIdentifier	 f Following Sibling Symbol
=	TokenNameEQUAL	
"following-sibling"	TokenNameStringLiteral	following-sibling
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fNamespaceSymbol	TokenNameIdentifier	 f Namespace Symbol
=	TokenNameEQUAL	
"namespace"	TokenNameStringLiteral	namespace
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fParentSymbol	TokenNameIdentifier	 f Parent Symbol
=	TokenNameEQUAL	
"parent"	TokenNameStringLiteral	parent
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fPrecedingSymbol	TokenNameIdentifier	 f Preceding Symbol
=	TokenNameEQUAL	
"preceding"	TokenNameStringLiteral	preceding
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fPrecedingSiblingSymbol	TokenNameIdentifier	 f Preceding Sibling Symbol
=	TokenNameEQUAL	
"preceding-sibling"	TokenNameStringLiteral	preceding-sibling
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fSelfSymbol	TokenNameIdentifier	 f Self Symbol
=	TokenNameEQUAL	
"self"	TokenNameStringLiteral	self
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an XPath expression scanner. */	TokenNameCOMMENT_JAVADOC	 Constructs an XPath expression scanner. 
public	TokenNamepublic	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save pool and tokens 	TokenNameCOMMENT_LINE	save pool and tokens 
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanExpr	TokenNameIdentifier	 scan Expr
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
int	TokenNameint	
nameOffset	TokenNameIdentifier	 name Offset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nameHandle	TokenNameIdentifier	 name Handle
,	TokenNameCOMMA	
prefixHandle	TokenNameIdentifier	 prefix Handle
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [39] ExprWhitespace ::= S 	TokenNameCOMMENT_LINE	[39] ExprWhitespace ::= S 
// 	TokenNameCOMMENT_LINE	 
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// [28] ExprToken ::= '(' | ')' | '[' | ']' | '.' | '..' | '@' | ',' | '::' 	TokenNameCOMMENT_LINE	[28] ExprToken ::= '(' | ')' | '[' | ']' | '.' | '..' | '@' | ',' | '::' 
// | NameTest | NodeType | Operator | FunctionName 	TokenNameCOMMENT_LINE	| NameTest | NodeType | Operator | FunctionName 
// | AxisName | Literal | Number | VariableReference 	TokenNameCOMMENT_LINE	| AxisName | Literal | Number | VariableReference 
// 	TokenNameCOMMENT_LINE	 
byte	TokenNamebyte	
chartype	TokenNameIdentifier	 chartype
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
CHARTYPE_NONASCII	TokenNameIdentifier	 CHARTYPE  NONASCII
:	TokenNameCOLON	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
chartype	TokenNameIdentifier	 chartype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CHARTYPE_OPEN_PAREN	TokenNameIdentifier	 CHARTYPE  OPEN  PAREN
:	TokenNameCOLON	
// '(' 	TokenNameCOMMENT_LINE	'(' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPEN_PAREN	TokenNameIdentifier	 EXPRTOKEN  OPEN  PAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_CLOSE_PAREN	TokenNameIdentifier	 CHARTYPE  CLOSE  PAREN
:	TokenNameCOLON	
// ')' 	TokenNameCOMMENT_LINE	')' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_CLOSE_PAREN	TokenNameIdentifier	 EXPRTOKEN  CLOSE  PAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_OPEN_BRACKET	TokenNameIdentifier	 CHARTYPE  OPEN  BRACKET
:	TokenNameCOLON	
// '[' 	TokenNameCOMMENT_LINE	'[' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPEN_BRACKET	TokenNameIdentifier	 EXPRTOKEN  OPEN  BRACKET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_CLOSE_BRACKET	TokenNameIdentifier	 CHARTYPE  CLOSE  BRACKET
:	TokenNameCOLON	
// ']' 	TokenNameCOMMENT_LINE	']' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_CLOSE_BRACKET	TokenNameIdentifier	 EXPRTOKEN  CLOSE  BRACKET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [30] Number ::= Digits ('.' Digits?)? | '.' Digits 	TokenNameCOMMENT_LINE	[30] Number ::= Digits ('.' Digits?)? | '.' Digits 
// ^^^^^^^^^^ 	TokenNameCOMMENT_LINE	^^^^^^^^^^ 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
CHARTYPE_PERIOD	TokenNameIdentifier	 CHARTYPE  PERIOD
:	TokenNameCOLON	
// '.', '..' or '.' Digits 	TokenNameCOMMENT_LINE	'.', '..' or '.' Digits 
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// '..' 	TokenNameCOMMENT_LINE	'..' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_PERIOD	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NUMBER	TokenNameIdentifier	 EXPRTOKEN  NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNumber	TokenNameIdentifier	 scan Number
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
/*, encoding*/	TokenNameCOMMENT_BLOCK	, encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is legal if the next token is non-existent or | 	TokenNameCOMMENT_LINE	this is legal if the next token is non-existent or | 
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_PERIOD	TokenNameIdentifier	 EXPRTOKEN  PERIOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// '.' 	TokenNameCOMMENT_LINE	'.' 
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-general-xpath"	TokenNameStringLiteral	c-general-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_ATSIGN	TokenNameIdentifier	 CHARTYPE  ATSIGN
:	TokenNameCOLON	
// '@' 	TokenNameCOMMENT_LINE	'@' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_ATSIGN	TokenNameIdentifier	 EXPRTOKEN  ATSIGN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_COMMA	TokenNameIdentifier	 CHARTYPE  COMMA
:	TokenNameCOLON	
// ',' 	TokenNameCOMMENT_LINE	',' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_COMMA	TokenNameIdentifier	 EXPRTOKEN  COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_COLON	TokenNameIdentifier	 CHARTYPE  COLON
:	TokenNameCOLON	
// '::' 	TokenNameCOMMENT_LINE	'::' 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 1a"); 	TokenNameCOMMENT_LINE	System.out.println("abort 1a"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 1b"); 	TokenNameCOMMENT_LINE	System.out.println("abort 1b"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_SLASH	TokenNameIdentifier	 CHARTYPE  SLASH
:	TokenNameCOLON	
// '/' and '//' 	TokenNameCOMMENT_LINE	'/' and '//' 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// '//' 	TokenNameCOMMENT_LINE	'//' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_DOUBLE_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DOUBLE  SLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_SLASH	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  SLASH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_UNION	TokenNameIdentifier	 CHARTYPE  UNION
:	TokenNameCOLON	
// '|' 	TokenNameCOMMENT_LINE	'|' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_UNION	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  UNION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_PLUS	TokenNameIdentifier	 CHARTYPE  PLUS
:	TokenNameCOLON	
// '+' 	TokenNameCOMMENT_LINE	'+' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_PLUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  PLUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_MINUS	TokenNameIdentifier	 CHARTYPE  MINUS
:	TokenNameCOLON	
// '-' 	TokenNameCOMMENT_LINE	'-' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_MINUS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MINUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_EQUAL	TokenNameIdentifier	 CHARTYPE  EQUAL
:	TokenNameCOLON	
// '=' 	TokenNameCOMMENT_LINE	'=' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_EXCLAMATION	TokenNameIdentifier	 CHARTYPE  EXCLAMATION
:	TokenNameCOLON	
// '!=' 	TokenNameCOMMENT_LINE	'!=' 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 2a"); 	TokenNameCOMMENT_LINE	System.out.println("abort 2a"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 2b"); 	TokenNameCOMMENT_LINE	System.out.println("abort 2b"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_NOT_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  NOT  EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_LESS	TokenNameIdentifier	 CHARTYPE  LESS
:	TokenNameCOLON	
// '<' and '<=' 	TokenNameCOMMENT_LINE	'<' and '<=' 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_LESS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// '<=' 	TokenNameCOMMENT_LINE	'<=' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_LESS_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS  EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_LESS	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  LESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_GREATER	TokenNameIdentifier	 CHARTYPE  GREATER
:	TokenNameCOLON	
// '>' and '>=' 	TokenNameCOMMENT_LINE	'>' and '>=' 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_GREATER	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// '>=' 	TokenNameCOMMENT_LINE	'>=' 
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_GREATER_EQUAL	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER  EQUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_GREATER	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  GREATER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [29] Literal ::= '"' [^"]* '"' | "'" [^']* "'" 	TokenNameCOMMENT_LINE	[29] Literal ::= '"' [^"]* '"' | "'" [^']* "'" 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
CHARTYPE_QUOTE	TokenNameIdentifier	 CHARTYPE  QUOTE
:	TokenNameCOLON	
// '\"' or '\'' 	TokenNameCOMMENT_LINE	'\"' or '\'' 
int	TokenNameint	
qchar	TokenNameIdentifier	 qchar
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 2c"); 	TokenNameCOMMENT_LINE	System.out.println("abort 2c"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
litOffset	TokenNameIdentifier	 lit Offset
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
qchar	TokenNameIdentifier	 qchar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 2d"); 	TokenNameCOMMENT_LINE	System.out.println("abort 2d"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
litLength	TokenNameIdentifier	 lit Length
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
-	TokenNameMINUS	
litOffset	TokenNameIdentifier	 lit Offset
;	TokenNameSEMICOLON	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_LITERAL	TokenNameIdentifier	 EXPRTOKEN  LITERAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
litOffset	TokenNameIdentifier	 lit Offset
,	TokenNameCOMMA	
litOffset	TokenNameIdentifier	 lit Offset
+	TokenNamePLUS	
litLength	TokenNameIdentifier	 lit Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [30] Number ::= Digits ('.' Digits?)? | '.' Digits 	TokenNameCOMMENT_LINE	[30] Number ::= Digits ('.' Digits?)? | '.' Digits 
// [31] Digits ::= [0-9]+ 	TokenNameCOMMENT_LINE	[31] Digits ::= [0-9]+ 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
CHARTYPE_DIGIT	TokenNameIdentifier	 CHARTYPE  DIGIT
:	TokenNameCOLON	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NUMBER	TokenNameIdentifier	 EXPRTOKEN  NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNumber	TokenNameIdentifier	 scan Number
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
/*, encoding*/	TokenNameCOMMENT_BLOCK	, encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [36] VariableReference ::= '$' QName 	TokenNameCOMMENT_LINE	[36] VariableReference ::= '$' QName 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
CHARTYPE_DOLLAR	TokenNameIdentifier	 CHARTYPE  DOLLAR
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 3a"); 	TokenNameCOMMENT_LINE	System.out.println("abort 3a"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
nameOffset	TokenNameIdentifier	 name Offset
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
nameOffset	TokenNameIdentifier	 name Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 3b"); 	TokenNameCOMMENT_LINE	System.out.println("abort 3b"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nameHandle	TokenNameIdentifier	 name Handle
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nameOffset	TokenNameIdentifier	 name Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixHandle	TokenNameIdentifier	 prefix Handle
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefixHandle	TokenNameIdentifier	 prefix Handle
=	TokenNameEQUAL	
nameHandle	TokenNameIdentifier	 name Handle
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 4a"); 	TokenNameCOMMENT_LINE	System.out.println("abort 4a"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
nameOffset	TokenNameIdentifier	 name Offset
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
nameOffset	TokenNameIdentifier	 name Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 4b"); 	TokenNameCOMMENT_LINE	System.out.println("abort 4b"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nameHandle	TokenNameIdentifier	 name Handle
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nameOffset	TokenNameIdentifier	 name Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_VARIABLE_REFERENCE	TokenNameIdentifier	 EXPRTOKEN  VARIABLE  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
prefixHandle	TokenNameIdentifier	 prefix Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [37] NameTest ::= '*' | NCName ':' '*' | QName 	TokenNameCOMMENT_LINE	[37] NameTest ::= '*' | NCName ':' '*' | QName 
// [34] MultiplyOperator ::= '*' 	TokenNameCOMMENT_LINE	[34] MultiplyOperator ::= '*' 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
CHARTYPE_STAR	TokenNameIdentifier	 CHARTYPE  STAR
:	TokenNameCOLON	
// '*' 	TokenNameCOMMENT_LINE	'*' 
// 	TokenNameCOMMENT_LINE	 
// 3.7 Lexical Structure 	TokenNameCOMMENT_LINE	3.7 Lexical Structure 
// 	TokenNameCOMMENT_LINE	 
// If there is a preceding token and the preceding token is not one of @, ::, (, [, , or 	TokenNameCOMMENT_LINE	If there is a preceding token and the preceding token is not one of @, ::, (, [, , or 
// an Operator, then a * must be recognized as a MultiplyOperator. 	TokenNameCOMMENT_LINE	an Operator, then a * must be recognized as a MultiplyOperator. 
// 	TokenNameCOMMENT_LINE	 
// Otherwise, the token must not be recognized as a MultiplyOperator. 	TokenNameCOMMENT_LINE	Otherwise, the token must not be recognized as a MultiplyOperator. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_MULT	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_ANY	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  ANY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// NCName, QName and non-terminals 	TokenNameCOMMENT_LINE	NCName, QName and non-terminals 
// 	TokenNameCOMMENT_LINE	 
case	TokenNamecase	
CHARTYPE_NONASCII	TokenNameIdentifier	 CHARTYPE  NONASCII
:	TokenNameCOLON	
// possibly a valid non-ascii 'Letter' (BaseChar | Ideographic) 	TokenNameCOMMENT_LINE	possibly a valid non-ascii 'Letter' (BaseChar | Ideographic) 
case	TokenNamecase	
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
:	TokenNameCOLON	
// 	TokenNameCOMMENT_LINE	 
// 3.7 Lexical Structure 	TokenNameCOMMENT_LINE	3.7 Lexical Structure 
// 	TokenNameCOMMENT_LINE	 
// If there is a preceding token and the preceding token is not one of @, ::, (, [, , or 	TokenNameCOMMENT_LINE	If there is a preceding token and the preceding token is not one of @, ::, (, [, , or 
// an Operator, then an NCName must be recognized as an OperatorName. 	TokenNameCOMMENT_LINE	an Operator, then an NCName must be recognized as an OperatorName. 
// 	TokenNameCOMMENT_LINE	 
// If the character following an NCName (possibly after intervening ExprWhitespace) is (, 	TokenNameCOMMENT_LINE	If the character following an NCName (possibly after intervening ExprWhitespace) is (, 
// then the token must be recognized as a NodeType or a FunctionName. 	TokenNameCOMMENT_LINE	then the token must be recognized as a NodeType or a FunctionName. 
// 	TokenNameCOMMENT_LINE	 
// If the two characters following an NCName (possibly after intervening ExprWhitespace) 	TokenNameCOMMENT_LINE	If the two characters following an NCName (possibly after intervening ExprWhitespace) 
// are ::, then the token must be recognized as an AxisName. 	TokenNameCOMMENT_LINE	are ::, then the token must be recognized as an AxisName. 
// 	TokenNameCOMMENT_LINE	 
// Otherwise, the token must not be recognized as an OperatorName, a NodeType, a 	TokenNameCOMMENT_LINE	Otherwise, the token must not be recognized as an OperatorName, a NodeType, a 
// FunctionName, or an AxisName. 	TokenNameCOMMENT_LINE	FunctionName, or an AxisName. 
// 	TokenNameCOMMENT_LINE	 
// [33] OperatorName ::= 'and' | 'or' | 'mod' | 'div' 	TokenNameCOMMENT_LINE	[33] OperatorName ::= 'and' | 'or' | 'mod' | 'div' 
// [38] NodeType ::= 'comment' | 'text' | 'processing-instruction' | 'node' 	TokenNameCOMMENT_LINE	[38] NodeType ::= 'comment' | 'text' | 'processing-instruction' | 'node' 
// [35] FunctionName ::= QName - NodeType 	TokenNameCOMMENT_LINE	[35] FunctionName ::= QName - NodeType 
// [6] AxisName ::= (see above) 	TokenNameCOMMENT_LINE	[6] AxisName ::= (see above) 
// 	TokenNameCOMMENT_LINE	 
// [37] NameTest ::= '*' | NCName ':' '*' | QName 	TokenNameCOMMENT_LINE	[37] NameTest ::= '*' | NCName ':' '*' | QName 
// [5] NCName ::= (Letter | '_') (NCNameChar)* 	TokenNameCOMMENT_LINE	[5] NCName ::= (Letter | '_') (NCNameChar)* 
// [?] NCNameChar ::= Letter | Digit | '.' | '-' | '_' (ascii subset of 'NCNameChar') 	TokenNameCOMMENT_LINE	[?] NCNameChar ::= Letter | Digit | '.' | '-' | '_' (ascii subset of 'NCNameChar') 
// [?] QName ::= (NCName ':')? NCName 	TokenNameCOMMENT_LINE	[?] QName ::= (NCName ':')? NCName 
// [?] Letter ::= [A-Za-z] (ascii subset of 'Letter') 	TokenNameCOMMENT_LINE	[?] Letter ::= [A-Za-z] (ascii subset of 'Letter') 
// [?] Digit ::= [0-9] (ascii subset of 'Digit') 	TokenNameCOMMENT_LINE	[?] Digit ::= [0-9] (ascii subset of 'Digit') 
// 	TokenNameCOMMENT_LINE	 
nameOffset	TokenNameIdentifier	 name Offset
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
nameOffset	TokenNameIdentifier	 name Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 4c"); 	TokenNameCOMMENT_LINE	System.out.println("abort 4c"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nameHandle	TokenNameIdentifier	 name Handle
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nameOffset	TokenNameIdentifier	 name Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isNameTestNCName	TokenNameIdentifier	 is Name Test NC Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isAxisName	TokenNameIdentifier	 is Axis Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
prefixHandle	TokenNameIdentifier	 prefix Handle
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 5"); 	TokenNameCOMMENT_LINE	System.out.println("abort 5"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNameTestNCName	TokenNameIdentifier	 is Name Test NC Name
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isAxisName	TokenNameIdentifier	 is Axis Name
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefixHandle	TokenNameIdentifier	 prefix Handle
=	TokenNameEQUAL	
nameHandle	TokenNameIdentifier	 name Handle
;	TokenNameSEMICOLON	
nameOffset	TokenNameIdentifier	 name Offset
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
nameOffset	TokenNameIdentifier	 name Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 5b"); 	TokenNameCOMMENT_LINE	System.out.println("abort 5b"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nameHandle	TokenNameIdentifier	 name Handle
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nameOffset	TokenNameIdentifier	 name Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// [39] ExprWhitespace ::= S 	TokenNameCOMMENT_LINE	[39] ExprWhitespace ::= S 
// 	TokenNameCOMMENT_LINE	 
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// If there is a preceding token and the preceding token is not one of @, ::, (, [, , or 	TokenNameCOMMENT_LINE	If there is a preceding token and the preceding token is not one of @, ::, (, [, , or 
// an Operator, then an NCName must be recognized as an OperatorName. 	TokenNameCOMMENT_LINE	an Operator, then an NCName must be recognized as an OperatorName. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fAndSymbol	TokenNameIdentifier	 f And Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_AND	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  AND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fOrSymbol	TokenNameIdentifier	 f Or Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_OR	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  OR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fModSymbol	TokenNameIdentifier	 f Mod Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_MOD	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  MOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fDivSymbol	TokenNameIdentifier	 f Div Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPERATOR_DIV	TokenNameIdentifier	 EXPRTOKEN  OPERATOR  DIV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("abort 6"); 	TokenNameCOMMENT_LINE	System.out.println("abort 6"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isNameTestNCName	TokenNameIdentifier	 is Name Test NC Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 7"); 	TokenNameCOMMENT_LINE	System.out.println("abort 7"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT - NCName:* where an OperatorName is required 	TokenNameCOMMENT_LINE	REVISIT - NCName:* where an OperatorName is required 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isAxisName	TokenNameIdentifier	 is Axis Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 8"); 	TokenNameCOMMENT_LINE	System.out.println("abort 8"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT - AxisName:: where an OperatorName is required 	TokenNameCOMMENT_LINE	REVISIT - AxisName:: where an OperatorName is required 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// If the character following an NCName (possibly after intervening ExprWhitespace) is (, 	TokenNameCOMMENT_LINE	If the character following an NCName (possibly after intervening ExprWhitespace) is (, 
// then the token must be recognized as a NodeType or a FunctionName. 	TokenNameCOMMENT_LINE	then the token must be recognized as a NodeType or a FunctionName. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isNameTestNCName	TokenNameIdentifier	 is Name Test NC Name
&&	TokenNameAND_AND	
!	TokenNameNOT	
isAxisName	TokenNameIdentifier	 is Axis Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fCommentSymbol	TokenNameIdentifier	 f Comment Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NODETYPE_COMMENT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fTextSymbol	TokenNameIdentifier	 f Text Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NODETYPE_TEXT	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fPISymbol	TokenNameIdentifier	 f PI Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NODETYPE_PI	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fNodeSymbol	TokenNameIdentifier	 f Node Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NODETYPE_NODE	TokenNameIdentifier	 EXPRTOKEN  NODETYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_FUNCTION_NAME	TokenNameIdentifier	 EXPRTOKEN  FUNCTION  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
prefixHandle	TokenNameIdentifier	 prefix Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_OPEN_PAREN	TokenNameIdentifier	 EXPRTOKEN  OPEN  PAREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// If the two characters following an NCName (possibly after intervening ExprWhitespace) 	TokenNameCOMMENT_LINE	If the two characters following an NCName (possibly after intervening ExprWhitespace) 
// are ::, then the token must be recognized as an AxisName. 	TokenNameCOMMENT_LINE	are ::, then the token must be recognized as an AxisName. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
isAxisName	TokenNameIdentifier	 is Axis Name
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
currentOffset	TokenNameIdentifier	 current Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fAncestorSymbol	TokenNameIdentifier	 f Ancestor Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_ANCESTOR	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fAncestorOrSelfSymbol	TokenNameIdentifier	 f Ancestor Or Self Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ANCESTOR  OR  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fAttributeSymbol	TokenNameIdentifier	 f Attribute Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_ATTRIBUTE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fChildSymbol	TokenNameIdentifier	 f Child Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_CHILD	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fDescendantSymbol	TokenNameIdentifier	 f Descendant Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_DESCENDANT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fDescendantOrSelfSymbol	TokenNameIdentifier	 f Descendant Or Self Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  DESCENDANT  OR  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fFollowingSymbol	TokenNameIdentifier	 f Following Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_FOLLOWING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fFollowingSiblingSymbol	TokenNameIdentifier	 f Following Sibling Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  FOLLOWING  SIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fNamespaceSymbol	TokenNameIdentifier	 f Namespace Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fParentSymbol	TokenNameIdentifier	 f Parent Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_PARENT	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PARENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fPrecedingSymbol	TokenNameIdentifier	 f Preceding Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_PRECEDING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fPrecedingSiblingSymbol	TokenNameIdentifier	 f Preceding Sibling Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_PRECEDING_SIBLING	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  PRECEDING  SIBLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
==	TokenNameEQUAL_EQUAL	
fSelfSymbol	TokenNameIdentifier	 f Self Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_AXISNAME_SELF	TokenNameIdentifier	 EXPRTOKEN  AXISNAME  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("abort 9"); 	TokenNameCOMMENT_LINE	System.out.println("abort 9"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT 	TokenNameCOMMENT_LINE	REVISIT 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isNameTestNCName	TokenNameIdentifier	 is Name Test NC Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("abort 10"); 	TokenNameCOMMENT_LINE	System.out.println("abort 10"); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// REVISIT - "NCName:* ::" where "AxisName ::" is required 	TokenNameCOMMENT_LINE	REVISIT - "NCName:* ::" where "AxisName ::" is required 
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_DOUBLE_COLON	TokenNameIdentifier	 EXPRTOKEN  DOUBLE  COLON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAxisName	TokenNameIdentifier	 is Axis Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentOffset	TokenNameIdentifier	 current Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Otherwise, the token must not be recognized as an OperatorName, a NodeType, a 	TokenNameCOMMENT_LINE	Otherwise, the token must not be recognized as an OperatorName, a NodeType, a 
// FunctionName, or an AxisName. 	TokenNameCOMMENT_LINE	FunctionName, or an AxisName. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
isNameTestNCName	TokenNameIdentifier	 is Name Test NC Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_NAMESPACE	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
EXPRTOKEN_NAMETEST_QNAME	TokenNameIdentifier	 EXPRTOKEN  NAMETEST  QNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
starIsMultiplyOperator	TokenNameIdentifier	 star Is Multiply Operator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
prefixHandle	TokenNameIdentifier	 prefix Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// CHARTYPE_INVALID or CHARTYPE_OTHER 	TokenNameCOMMENT_LINE	CHARTYPE_INVALID or CHARTYPE_OTHER 
// We're not expecting to find either of these in a valid expression. 	TokenNameCOMMENT_LINE	We're not expecting to find either of these in a valid expression. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
DUMP_TOKENS	TokenNameIdentifier	 DUMP  TOKENS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
dumpTokens	TokenNameIdentifier	 dump Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// [5] NCName ::= (Letter | '_') (NCNameChar)* 	TokenNameCOMMENT_LINE	[5] NCName ::= (Letter | '_') (NCNameChar)* 
// [6] NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender 	TokenNameCOMMENT_LINE	[6] NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNameStart	TokenNameIdentifier	 is Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/*** // REVISIT: Make sure this is a negation. *** if ((XMLCharacterProperties.fgCharFlags[ch] & XMLCharacterProperties.E_InitialNameCharFlag) == 0) /***/	TokenNameCOMMENT_JAVADOC	* // REVISIT: Make sure this is a negation. *** if ((XMLCharacterProperties.fgCharFlags[ch] & XMLCharacterProperties.E_InitialNameCharFlag) == 0) /**
{	TokenNameLBRACE	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
chartype	TokenNameIdentifier	 chartype
=	TokenNameEQUAL	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/*** // REVISIT: Make sure this is a negation. *** if ((XMLCharacterProperties.fgCharFlags[ch] & XMLCharacterProperties.E_NameCharFlag) == 0) /***/	TokenNameCOMMENT_JAVADOC	* // REVISIT: Make sure this is a negation. *** if ((XMLCharacterProperties.fgCharFlags[ch] & XMLCharacterProperties.E_NameCharFlag) == 0) /**
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
chartype	TokenNameIdentifier	 chartype
=	TokenNameEQUAL	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_DIGIT	TokenNameIdentifier	 CHARTYPE  DIGIT
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_PERIOD	TokenNameIdentifier	 CHARTYPE  PERIOD
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_MINUS	TokenNameIdentifier	 CHARTYPE  MINUS
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// [30] Number ::= Digits ('.' Digits?)? | '.' Digits 	TokenNameCOMMENT_LINE	[30] Number ::= Digits ('.' Digits?)? | '.' Digits 
// [31] Digits ::= [0-9]+ 	TokenNameCOMMENT_LINE	[31] Digits ::= [0-9]+ 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
int	TokenNameint	
scanNumber	TokenNameIdentifier	 scan Number
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
/*byte[]*/	TokenNameCOMMENT_BLOCK	byte[]
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
/*, EncodingSupport encoding*/	TokenNameCOMMENT_BLOCK	, EncodingSupport encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
whole	TokenNameIdentifier	 whole
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
whole	TokenNameIdentifier	 whole
=	TokenNameEQUAL	
(	TokenNameLPAREN	
whole	TokenNameIdentifier	 whole
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** int start = currentOffset; **/	TokenNameCOMMENT_JAVADOC	 int start = currentOffset; *
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** part = tokens.addSymbol(data, start, currentOffset - start, encoding); /***/	TokenNameCOMMENT_JAVADOC	* part = tokens.addSymbol(data, start, currentOffset - start, encoding); /**
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"find a solution!"	TokenNameStringLiteral	find a solution!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//part = fStringPool.addSymbol(data.substring(start, currentOffset)); 	TokenNameCOMMENT_LINE	part = fStringPool.addSymbol(data.substring(start, currentOffset)); 
/***/	TokenNameCOMMENT_JAVADOC	 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
whole	TokenNameIdentifier	 whole
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * This method adds the specified token to the token list. By * default, this method allows all tokens. However, subclasses * of the XPathExprScanner can override this method in order * to disallow certain tokens from being used in the scanned * XPath expression. This is a convenient way of allowing only * a subset of XPath. */	TokenNameCOMMENT_JAVADOC	 This method adds the specified token to the token list. By default, this method allows all tokens. However, subclasses of the XPathExprScanner can override this method in order to disallow certain tokens from being used in the scanned XPath expression. This is a convenient way of allowing only a subset of XPath. 
protected	TokenNameprotected	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addToken(int) 	TokenNameCOMMENT_LINE	addToken(int) 
}	TokenNameRBRACE	
// class Scanner 	TokenNameCOMMENT_LINE	class Scanner 
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** Main program entry. */	TokenNameCOMMENT_JAVADOC	 Main program entry. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
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
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"# XPath expression: ""	TokenNameStringLiteral	# XPath expression: "
+	TokenNamePLUS	
expression	TokenNameIdentifier	 expression
+	TokenNamePLUS	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolTable	TokenNameIdentifier	 Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"expanded xpath: ""	TokenNameStringLiteral	expanded xpath: "
+	TokenNamePLUS	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: "	TokenNameStringLiteral	error: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
}	TokenNameRBRACE	
// class XPath 	TokenNameCOMMENT_LINE	class XPath 
