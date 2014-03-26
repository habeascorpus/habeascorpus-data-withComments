/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPath.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPath.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
SourceLocator	TokenNameIdentifier	 Source Locator
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
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
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
XPathParser	TokenNameIdentifier	 X Path Parser
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
/** * The XPath class wraps an expression object and provides general services * for execution of that expression. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The XPath class wraps an expression object and provides general services for execution of that expression. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
XPath	TokenNameIdentifier	 X Path
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3976493477939110553L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The top of the expression tree. * @serial */	TokenNameCOMMENT_JAVADOC	 The top of the expression tree. @serial 
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
m_mainExp	TokenNameIdentifier	 m main Exp
;	TokenNameSEMICOLON	
/** * The function table for xpath build-in functions */	TokenNameCOMMENT_JAVADOC	 The function table for xpath build-in functions 
private	TokenNameprivate	
transient	TokenNametransient	
FunctionTable	TokenNameIdentifier	 Function Table
m_funcTable	TokenNameIdentifier	 m func Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * initial the function table */	TokenNameCOMMENT_JAVADOC	 initial the function table 
private	TokenNameprivate	
void	TokenNamevoid	
initFunctionTable	TokenNameIdentifier	 init Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_funcTable	TokenNameIdentifier	 m func Table
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionTable	TokenNameIdentifier	 Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the raw Expression object that this class wraps. * * * @return the raw Expression object, which should not normally be null. */	TokenNameCOMMENT_JAVADOC	 Get the raw Expression object that this class wraps. * @return the raw Expression object, which should not normally be null. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mainExp	TokenNameIdentifier	 m main Exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
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
m_mainExp	TokenNameIdentifier	 m main Exp
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the raw expression object for this object. * * * @param exp the raw Expression object, which should not normally be null. */	TokenNameCOMMENT_JAVADOC	 Set the raw expression object for this object. * @param exp the raw Expression object, which should not normally be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_mainExp	TokenNameIdentifier	 m main Exp
)	TokenNameRPAREN	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
m_mainExp	TokenNameIdentifier	 m main Exp
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a bit bogus 	TokenNameCOMMENT_LINE	a bit bogus 
m_mainExp	TokenNameIdentifier	 m main Exp
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the SourceLocator on the expression object. * * * @return the SourceLocator on the expression object, which may be null. */	TokenNameCOMMENT_JAVADOC	 Get the SourceLocator on the expression object. * @return the SourceLocator on the expression object, which may be null. 
public	TokenNamepublic	
SourceLocator	TokenNameIdentifier	 Source Locator
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mainExp	TokenNameIdentifier	 m main Exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Set the SourceLocator on the expression object. 	TokenNameCOMMENT_LINE	* Set the SourceLocator on the expression object. 
// * 	TokenNameCOMMENT_LINE	* 
// * 	TokenNameCOMMENT_LINE	* 
// * @param l the SourceLocator on the expression object, which may be null. 	TokenNameCOMMENT_LINE	* @param l the SourceLocator on the expression object, which may be null. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void setLocator(SourceLocator l) 	TokenNameCOMMENT_LINE	public void setLocator(SourceLocator l) 
// { 	TokenNameCOMMENT_LINE	{ 
// // Note potential hazards -- l may not be serializable, or may be changed 	TokenNameCOMMENT_LINE	// Note potential hazards -- l may not be serializable, or may be changed 
// // after being assigned here. 	TokenNameCOMMENT_LINE	// after being assigned here. 
// m_mainExp.setSourceLocator(l); 	TokenNameCOMMENT_LINE	m_mainExp.setSourceLocator(l); 
// } 	TokenNameCOMMENT_LINE	} 
/** The pattern string, mainly kept around for diagnostic purposes. * @serial */	TokenNameCOMMENT_JAVADOC	 The pattern string, mainly kept around for diagnostic purposes. @serial 
String	TokenNameIdentifier	 String
m_patternString	TokenNameIdentifier	 m pattern String
;	TokenNameSEMICOLON	
/** * Return the XPath string associated with this object. * * * @return the XPath string associated with this object. */	TokenNameCOMMENT_JAVADOC	 Return the XPath string associated with this object. * @return the XPath string associated with this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_patternString	TokenNameIdentifier	 m pattern String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Represents a select type expression. */	TokenNameCOMMENT_JAVADOC	 Represents a select type expression. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECT	TokenNameIdentifier	 SELECT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents a match type expression. */	TokenNameCOMMENT_JAVADOC	 Represents a match type expression. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCH	TokenNameIdentifier	 MATCH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct an XPath object. * * (Needs review -sc) This method initializes an XPathParser/ * Compiler and compiles the expression. * @param exprString The XPath expression. * @param locator The location of the expression, may be null. * @param prefixResolver A prefix resolver to use to resolve prefixes to * namespace URIs. * @param type one of {@link #SELECT} or {@link #MATCH}. * @param errorListener The error listener, or null if default should be used. * * @throws javax.xml.transform.TransformerException if syntax or other error. */	TokenNameCOMMENT_JAVADOC	 Construct an XPath object. * (Needs review -sc) This method initializes an XPathParser/ Compiler and compiles the expression. @param exprString The XPath expression. @param locator The location of the expression, may be null. @param prefixResolver A prefix resolver to use to resolve prefixes to namespace URIs. @param type one of {@link #SELECT} or {@link #MATCH}. @param errorListener The error listener, or null if default should be used. * @throws javax.xml.transform.TransformerException if syntax or other error. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
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
initFunctionTable	TokenNameIdentifier	 init Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_patternString	TokenNameIdentifier	 m pattern String
=	TokenNameEQUAL	
exprString	TokenNameIdentifier	 expr String
;	TokenNameSEMICOLON	
XPathParser	TokenNameIdentifier	 X Path Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
XPathParser	TokenNameIdentifier	 X Path Parser
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
new	TokenNamenew	
Compiler	TokenNameIdentifier	 Compiler
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
m_funcTable	TokenNameIdentifier	 m func Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
SELECT	TokenNameIdentifier	 SELECT
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
initXPath	TokenNameIdentifier	 init X Path
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
MATCH	TokenNameIdentifier	 MATCH
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
initMatchPattern	TokenNameIdentifier	 init Match Pattern
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier	 ER  CANNOT  DEAL  XPATH  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not deal with XPath type: " + type); 	TokenNameCOMMENT_LINE	"Can not deal with XPath type: " + type); 
// System.out.println("----------------"); 	TokenNameCOMMENT_LINE	System.out.println("----------------"); 
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("expr: "+expr); 	TokenNameCOMMENT_LINE	System.out.println("expr: "+expr); 
this	TokenNamethis	
.	TokenNameDOT	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
locator	TokenNameIdentifier	 locator
instanceof	TokenNameinstanceof	
ExpressionNode	TokenNameIdentifier	 Expression Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
)	TokenNameRPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct an XPath object. * * (Needs review -sc) This method initializes an XPathParser/ * Compiler and compiles the expression. * @param exprString The XPath expression. * @param locator The location of the expression, may be null. * @param prefixResolver A prefix resolver to use to resolve prefixes to * namespace URIs. * @param type one of {@link #SELECT} or {@link #MATCH}. * @param errorListener The error listener, or null if default should be used. * * @throws javax.xml.transform.TransformerException if syntax or other error. */	TokenNameCOMMENT_JAVADOC	 Construct an XPath object. * (Needs review -sc) This method initializes an XPathParser/ Compiler and compiles the expression. @param exprString The XPath expression. @param locator The location of the expression, may be null. @param prefixResolver A prefix resolver to use to resolve prefixes to namespace URIs. @param type one of {@link #SELECT} or {@link #MATCH}. @param errorListener The error listener, or null if default should be used. * @throws javax.xml.transform.TransformerException if syntax or other error. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
,	TokenNameCOMMA	
FunctionTable	TokenNameIdentifier	 Function Table
aTable	TokenNameIdentifier	 a Table
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
m_funcTable	TokenNameIdentifier	 m func Table
=	TokenNameEQUAL	
aTable	TokenNameIdentifier	 a Table
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_patternString	TokenNameIdentifier	 m pattern String
=	TokenNameEQUAL	
exprString	TokenNameIdentifier	 expr String
;	TokenNameSEMICOLON	
XPathParser	TokenNameIdentifier	 X Path Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
XPathParser	TokenNameIdentifier	 X Path Parser
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
new	TokenNamenew	
Compiler	TokenNameIdentifier	 Compiler
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
m_funcTable	TokenNameIdentifier	 m func Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
SELECT	TokenNameIdentifier	 SELECT
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
initXPath	TokenNameIdentifier	 init X Path
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
MATCH	TokenNameIdentifier	 MATCH
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
initMatchPattern	TokenNameIdentifier	 init Match Pattern
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier	 ER  CANNOT  DEAL  XPATH  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not deal with XPath type: " + type); 	TokenNameCOMMENT_LINE	"Can not deal with XPath type: " + type); 
// System.out.println("----------------"); 	TokenNameCOMMENT_LINE	System.out.println("----------------"); 
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("expr: "+expr); 	TokenNameCOMMENT_LINE	System.out.println("expr: "+expr); 
this	TokenNamethis	
.	TokenNameDOT	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
locator	TokenNameIdentifier	 locator
instanceof	TokenNameinstanceof	
ExpressionNode	TokenNameIdentifier	 Expression Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
)	TokenNameRPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct an XPath object. * * (Needs review -sc) This method initializes an XPathParser/ * Compiler and compiles the expression. * @param exprString The XPath expression. * @param locator The location of the expression, may be null. * @param prefixResolver A prefix resolver to use to resolve prefixes to * namespace URIs. * @param type one of {@link #SELECT} or {@link #MATCH}. * * @throws javax.xml.transform.TransformerException if syntax or other error. */	TokenNameCOMMENT_JAVADOC	 Construct an XPath object. * (Needs review -sc) This method initializes an XPathParser/ Compiler and compiles the expression. @param exprString The XPath expression. @param locator The location of the expression, may be null. @param prefixResolver A prefix resolver to use to resolve prefixes to namespace URIs. @param type one of {@link #SELECT} or {@link #MATCH}. * @throws javax.xml.transform.TransformerException if syntax or other error. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
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
this	TokenNamethis	
(	TokenNameLPAREN	
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an XPath object. * * @param expr The Expression object. * * @throws javax.xml.transform.TransformerException if syntax or other error. */	TokenNameCOMMENT_JAVADOC	 Construct an XPath object. * @param expr The Expression object. * @throws javax.xml.transform.TransformerException if syntax or other error. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initFunctionTable	TokenNameIdentifier	 init Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expression and a context, evaluate the XPath * and return the result. * * @param xctxt The execution context. * @param contextNode The node that "." expresses. * @param namespaceContext The context in which namespaces in the * XPath are supposed to be expanded. * * @return The result of the XPath or null if callbacks are used. * @throws TransformerException thrown if * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Given an expression and a context, evaluate the XPath and return the result. * @param xctxt The execution context. @param contextNode The node that "." expresses. @param namespaceContext The context in which namespaces in the XPath are supposed to be expanded. * @return The result of the XPath or null if callbacks are used. @throws TransformerException thrown if the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException @xsl.usage experimental 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
namespaceContext	TokenNameIdentifier	 namespace Context
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
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expression and a context, evaluate the XPath * and return the result. * * @param xctxt The execution context. * @param contextNode The node that "." expresses. * @param namespaceContext The context in which namespaces in the * XPath are supposed to be expanded. * * @throws TransformerException thrown if the active ProblemListener decides * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Given an expression and a context, evaluate the XPath and return the result. * @param xctxt The execution context. @param contextNode The node that "." expresses. @param namespaceContext The context in which namespaces in the XPath are supposed to be expanded. * @throws TransformerException thrown if the active ProblemListener decides the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException @xsl.usage experimental 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
namespaceContext	TokenNameIdentifier	 namespace Context
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContext	TokenNameIdentifier	 push Namespace Context
(	TokenNameLPAREN	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
m_mainExp	TokenNameIdentifier	 m main Exp
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
// defensive, should never happen. 	TokenNameCOMMENT_LINE	defensive, should never happen. 
{	TokenNameLBRACE	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_XPATH_ERROR	TokenNameIdentifier	 ER  XPATH  ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// te.printStackTrace(); 	TokenNameCOMMENT_LINE	te.printStackTrace(); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
// defensive, should never happen. 	TokenNameCOMMENT_LINE	defensive, should never happen. 
{	TokenNameLBRACE	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expression and a context, evaluate the XPath * and return the result. * * @param xctxt The execution context. * @param contextNode The node that "." expresses. * @param namespaceContext The context in which namespaces in the * XPath are supposed to be expanded. * * @throws TransformerException thrown if the active ProblemListener decides * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Given an expression and a context, evaluate the XPath and return the result. * @param xctxt The execution context. @param contextNode The node that "." expresses. @param namespaceContext The context in which namespaces in the XPath are supposed to be expanded. * @throws TransformerException thrown if the active ProblemListener decides the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException @xsl.usage experimental 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
namespaceContext	TokenNameIdentifier	 namespace Context
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContext	TokenNameIdentifier	 push Namespace Context
(	TokenNameLPAREN	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mainExp	TokenNameIdentifier	 m main Exp
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
// defensive, should never happen. 	TokenNameCOMMENT_LINE	defensive, should never happen. 
{	TokenNameLBRACE	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// e.printStackTrace(); 	TokenNameCOMMENT_LINE	e.printStackTrace(); 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_XPATH_ERROR	TokenNameIdentifier	 ER  XPATH  ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// te.printStackTrace(); 	TokenNameCOMMENT_LINE	te.printStackTrace(); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
// defensive, should never happen. 	TokenNameCOMMENT_LINE	defensive, should never happen. 
{	TokenNameLBRACE	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set to true to get diagnostic messages about the result of * match pattern testing. */	TokenNameCOMMENT_JAVADOC	 Set to true to get diagnostic messages about the result of match pattern testing. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_MATCHES	TokenNameIdentifier	 DEBUG  MATCHES
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Get the match score of the given node. * * @param xctxt XPath runtime context. * @param context The current source tree context node. * * @return score, one of {@link #MATCH_SCORE_NODETEST}, * {@link #MATCH_SCORE_NONE}, {@link #MATCH_SCORE_OTHER}, * or {@link #MATCH_SCORE_QNAME}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Get the match score of the given node. * @param xctxt XPath runtime context. @param context The current source tree context node. * @return score, one of {@link #MATCH_SCORE_NODETEST}, {@link #MATCH_SCORE_NONE}, {@link #MATCH_SCORE_OTHER}, or {@link #MATCH_SCORE_QNAME}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
double	TokenNamedouble	
getMatchScore	TokenNameIdentifier	 get Match Score
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentExpressionNode	TokenNameIdentifier	 push Current Expression Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
m_mainExp	TokenNameIdentifier	 m main Exp
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCHES	TokenNameIdentifier	 DEBUG  MATCHES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"score: "	TokenNameStringLiteral	score: 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" for "	TokenNameStringLiteral	 for 
+	TokenNamePLUS	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
+	TokenNamePLUS	
" for xpath "	TokenNameStringLiteral	 for xpath 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentExpressionNode	TokenNameIdentifier	 pop Current Expression Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return XPath.MATCH_SCORE_NONE; 	TokenNameCOMMENT_LINE	return XPath.MATCH_SCORE_NONE; 
}	TokenNameRBRACE	
/** * Warn the user of an problem. * * @param xctxt The XPath runtime context. * @param sourceNode Not used. * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. */	TokenNameCOMMENT_JAVADOC	 Warn the user of an problem. * @param xctxt The XPath runtime context. @param sourceNode Not used. @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
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
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHWarning	TokenNameIdentifier	 create XPATH Warning
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
ehandler	TokenNameIdentifier	 ehandler
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ehandler	TokenNameIdentifier	 ehandler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TO DO: Need to get stylesheet Locator from here. 	TokenNameCOMMENT_LINE	TO DO: Need to get stylesheet Locator from here. 
ehandler	TokenNameIdentifier	 ehandler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell the user of an assertion error, and probably throw an * exception. * * @param b If false, a runtime exception will be thrown. * @param msg The assertion message, which should be informative. * * @throws RuntimeException if the b argument is false. */	TokenNameCOMMENT_JAVADOC	 Tell the user of an assertion error, and probably throw an exception. * @param b If false, a runtime exception will be thrown. @param msg The assertion message, which should be informative. * @throws RuntimeException if the b argument is false. 
public	TokenNamepublic	
void	TokenNamevoid	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
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
msg	TokenNameIdentifier	 msg
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
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param xctxt The XPath runtime context. * @param sourceNode Not used. * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param xctxt The XPath runtime context. @param sourceNode Not used. @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
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
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
ehandler	TokenNameIdentifier	 ehandler
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ehandler	TokenNameIdentifier	 ehandler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ehandler	TokenNameIdentifier	 ehandler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
SourceLocator	TokenNameIdentifier	 Source Locator
slocator	TokenNameIdentifier	 slocator
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
+	TokenNamePLUS	
"; file "	TokenNameStringLiteral	; file 
+	TokenNamePLUS	
slocator	TokenNameIdentifier	 slocator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; line "	TokenNameStringLiteral	; line 
+	TokenNamePLUS	
slocator	TokenNameIdentifier	 slocator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; column "	TokenNameStringLiteral	; column 
+	TokenNamePLUS	
slocator	TokenNameIdentifier	 slocator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This will traverse the heararchy, calling the visitor for * each member. If the called visitor method returns * false, the subtree should not be called. * * @param owner The owner of the visitor, where that path may be * rewritten if needed. * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 This will traverse the heararchy, calling the visitor for each member. If the called visitor method returns false, the subtree should not be called. * @param owner The owner of the visitor, where that path may be rewritten if needed. @param visitor The visitor whose appropriate method will be called. 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mainExp	TokenNameIdentifier	 m main Exp
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The match score if no match is made. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The match score if no match is made. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
/** * The match score if the pattern has the form * of a QName optionally preceded by an @ character. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern has the form of a QName optionally preceded by an @ character. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MATCH_SCORE_QNAME	TokenNameIdentifier	 MATCH  SCORE  QNAME
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * The match score if the pattern pattern has the form NCName:*. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern pattern has the form NCName:*. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MATCH_SCORE_NSWILD	TokenNameIdentifier	 MATCH  SCORE  NSWILD
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.25	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * The match score if the pattern consists of just a NodeTest. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern consists of just a NodeTest. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MATCH_SCORE_NODETEST	TokenNameIdentifier	 MATCH  SCORE  NODETEST
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * The match score if the pattern consists of something * other than just a NodeTest or just a qname. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern consists of something other than just a NodeTest or just a qname. @xsl.usage advanced 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MATCH_SCORE_OTHER	TokenNameIdentifier	 MATCH  SCORE  OTHER
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
