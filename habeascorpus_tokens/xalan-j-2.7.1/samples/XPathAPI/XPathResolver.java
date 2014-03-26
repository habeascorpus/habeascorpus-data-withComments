/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * JAXP 1.3 XPath API sample. * * This sample demonstrates the use of NamespaceContext, XPathFunctionResolver * and XPathVariableResolver. The evaluated XPath expression ("ex:addFunc(2, 3) + $xyz") * contains an extension function and a variable reference. The extension function * and variable are evaluated using our customized XPathFunctionResolver and * XPathVariableResolver respectively. A NamespaceContext implementation is also * needed to map the prefix in the extension function to a valid namespace uri. */	TokenNameCOMMENT_JAVADOC	 JAXP 1.3 XPath API sample. * This sample demonstrates the use of NamespaceContext, XPathFunctionResolver and XPathVariableResolver. The evaluated XPath expression ("ex:addFunc(2, 3) + $xyz") contains an extension function and a variable reference. The extension function and variable are evaluated using our customized XPathFunctionResolver and XPathVariableResolver respectively. A NamespaceContext implementation is also needed to map the prefix in the extension function to a valid namespace uri. 
public	TokenNamepublic	
class	TokenNameclass	
XPathResolver	TokenNameIdentifier	 X Path Resolver
{	TokenNameLBRACE	
/** * The XPath expression to evaluate, which contains an extension * function and a variable reference. */	TokenNameCOMMENT_JAVADOC	 The XPath expression to evaluate, which contains an extension function and a variable reference. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPR	TokenNameIdentifier	 EXPR
=	TokenNameEQUAL	
"ex:addFunc(2, 3) + $xyz"	TokenNameStringLiteral	ex:addFunc(2, 3) + $xyz
;	TokenNameSEMICOLON	
/** * The NamespaceContext implementation is used to map the prefix "ex" * to the namespace uri "http://ex.com". */	TokenNameCOMMENT_JAVADOC	 The NamespaceContext implementation is used to map the prefix "ex" to the namespace uri "http://ex.com". 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MyNamespaceContext	TokenNameIdentifier	 My Namespace Context
implements	TokenNameimplements	
NamespaceContext	TokenNameIdentifier	 Namespace Context
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The prefix cannot be null."	TokenNameStringLiteral	The prefix cannot be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ex"	TokenNameStringLiteral	ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"http://ex.com"	TokenNameStringLiteral	http://ex.com
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The namespace uri cannot be null."	TokenNameStringLiteral	The namespace uri cannot be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"http://ex.com"	TokenNameStringLiteral	http://ex.com
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"ex"	TokenNameStringLiteral	ex
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The XPathFunctionResolver implementation is used to evaluate * the extension function "ex:addFunc(2, 3)". */	TokenNameCOMMENT_JAVADOC	 The XPathFunctionResolver implementation is used to evaluate the extension function "ex:addFunc(2, 3)". 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MyFunctionResolver	TokenNameIdentifier	 My Function Resolver
implements	TokenNameimplements	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
{	TokenNameLBRACE	
/** * This method returns a customized XPathFunction implementation * for the extension function "ex:addFunc()". */	TokenNameCOMMENT_JAVADOC	 This method returns a customized XPathFunction implementation for the extension function "ex:addFunc()". 
public	TokenNamepublic	
XPathFunction	TokenNameIdentifier	 X Path Function
resolveFunction	TokenNameIdentifier	 resolve Function
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
fname	TokenNameIdentifier	 fname
,	TokenNameCOMMA	
int	TokenNameint	
arity	TokenNameIdentifier	 arity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fname	TokenNameIdentifier	 fname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"The function name cannot be null."	TokenNameStringLiteral	The function name cannot be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We only recognize one function, i.e. ex:addFunc(). 	TokenNameCOMMENT_LINE	We only recognize one function, i.e. ex:addFunc(). 
if	TokenNameif	
(	TokenNameLPAREN	
fname	TokenNameIdentifier	 fname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
"http://ex.com"	TokenNameStringLiteral	http://ex.com
,	TokenNameCOMMA	
"addFunc"	TokenNameStringLiteral	addFunc
,	TokenNameCOMMA	
"ex"	TokenNameStringLiteral	ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/** * Return a customized implementation of XPathFunction. We need * to implement the evaluate(List) method. */	TokenNameCOMMENT_JAVADOC	 Return a customized implementation of XPathFunction. We need to implement the evaluate(List) method. 
return	TokenNamereturn	
new	TokenNamenew	
XPathFunction	TokenNameIdentifier	 X Path Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** * The actual implementation of the extension function. * Just cast two arguments to Double and add them together. */	TokenNameCOMMENT_JAVADOC	 The actual implementation of the extension function. Just cast two arguments to Double and add them together. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Double	TokenNameIdentifier	 Double
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
arg2	TokenNameIdentifier	 arg2
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Our own implementation of XPathVariableResolver, which resolves the * variable "xyz" to a double value 4.0. */	TokenNameCOMMENT_JAVADOC	 Our own implementation of XPathVariableResolver, which resolves the variable "xyz" to a double value 4.0. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MyVariableResolver	TokenNameIdentifier	 My Variable Resolver
implements	TokenNameimplements	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
resolveVariable	TokenNameIdentifier	 resolve Variable
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
varName	TokenNameIdentifier	 var Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
varName	TokenNameIdentifier	 var Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"The variable name cannot be null."	TokenNameStringLiteral	The variable name cannot be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
varName	TokenNameIdentifier	 var Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"xyz"	TokenNameStringLiteral	xyz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
4.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathFactory	TokenNameIdentifier	 X Path Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
XPathFactory	TokenNameIdentifier	 X Path Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newXPath	TokenNameIdentifier	 new X Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the NamespaceContext 	TokenNameCOMMENT_LINE	Set the NamespaceContext 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
new	TokenNamenew	
MyNamespaceContext	TokenNameIdentifier	 My Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the function resolver 	TokenNameCOMMENT_LINE	Set the function resolver 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
setXPathFunctionResolver	TokenNameIdentifier	 set X Path Function Resolver
(	TokenNameLPAREN	
new	TokenNamenew	
MyFunctionResolver	TokenNameIdentifier	 My Function Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the variable resolver 	TokenNameCOMMENT_LINE	Set the variable resolver 
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
setXPathVariableResolver	TokenNameIdentifier	 set X Path Variable Resolver
(	TokenNameLPAREN	
new	TokenNamenew	
MyVariableResolver	TokenNameIdentifier	 My Variable Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
EXPR	TokenNameIdentifier	 EXPR
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
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
// The evaluation result is 9.0. 	TokenNameCOMMENT_LINE	The evaluation result is 9.0. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The evaluation result: "	TokenNameStringLiteral	The evaluation result: 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
