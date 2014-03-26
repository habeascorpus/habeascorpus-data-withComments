/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncFormatNumb.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncFormatNumb.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
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
Expression	TokenNameIdentifier	 Expression
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
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
Function3Args	TokenNameIdentifier	 Function3 Args
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
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
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
XString	TokenNameIdentifier	 X String
;	TokenNameSEMICOLON	
/** * Execute the FormatNumber() function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute the FormatNumber() function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncFormatNumb	TokenNameIdentifier	 Func Format Numb
extends	TokenNameextends	
Function3Args	TokenNameIdentifier	 Function3 Args
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8869935264870858636L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
// A bit of an ugly hack to get our context. 	TokenNameCOMMENT_LINE	A bit of an ugly hack to get our context. 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
templElem	TokenNameIdentifier	 templ Elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
templElem	TokenNameIdentifier	 templ Elem
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
dfs	TokenNameIdentifier	 dfs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
getArg0	TokenNameIdentifier	 get Arg0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
patternStr	TokenNameIdentifier	 pattern Str
=	TokenNameEQUAL	
getArg1	TokenNameIdentifier	 get Arg1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: what should be the behavior here?? 	TokenNameCOMMENT_LINE	TODO: what should be the behavior here?? 
if	TokenNameif	
(	TokenNameLPAREN	
patternStr	TokenNameIdentifier	 pattern Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
0x00A4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// currency sign not allowed 	TokenNameCOMMENT_LINE	currency sign not allowed 
// this third argument is not a locale name. It is the name of a 	TokenNameCOMMENT_LINE	this third argument is not a locale name. It is the name of a 
// decimal-format declared in the stylesheet!(xsl:decimal-format 	TokenNameCOMMENT_LINE	decimal-format declared in the stylesheet!(xsl:decimal-format 
try	TokenNametry	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
arg2Expr	TokenNameIdentifier	 arg2 Expr
=	TokenNameEQUAL	
getArg2	TokenNameIdentifier	 get Arg2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
arg2Expr	TokenNameIdentifier	 arg2 Expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dfName	TokenNameIdentifier	 df Name
=	TokenNameEQUAL	
arg2Expr	TokenNameIdentifier	 arg2 Expr
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
dfName	TokenNameIdentifier	 df Name
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dfs	TokenNameIdentifier	 dfs
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
getDecimalFormatComposed	TokenNameIdentifier	 get Decimal Format Composed
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
dfs	TokenNameIdentifier	 dfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dfName	TokenNameIdentifier	 df Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"not found!!! 	TokenNameCOMMENT_LINE	"not found!!! 
//formatter = new java.text.DecimalFormat(patternStr); 	TokenNameCOMMENT_LINE	formatter = new java.text.DecimalFormat(patternStr); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//formatter = new java.text.DecimalFormat(patternStr, dfs); 	TokenNameCOMMENT_LINE	formatter = new java.text.DecimalFormat(patternStr, dfs); 
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
setDecimalFormatSymbols	TokenNameIdentifier	 set Decimal Format Symbols
(	TokenNameLPAREN	
dfs	TokenNameIdentifier	 dfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
applyLocalizedPattern	TokenNameIdentifier	 apply Localized Pattern
(	TokenNameLPAREN	
patternStr	TokenNameIdentifier	 pattern Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//else 	TokenNameCOMMENT_LINE	else 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
formatter	TokenNameIdentifier	 formatter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for a possible default decimal-format 	TokenNameCOMMENT_LINE	look for a possible default decimal-format 
dfs	TokenNameIdentifier	 dfs
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
getDecimalFormatComposed	TokenNameIdentifier	 get Decimal Format Composed
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dfs	TokenNameIdentifier	 dfs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
setDecimalFormatSymbols	TokenNameIdentifier	 set Decimal Format Symbols
(	TokenNameLPAREN	
dfs	TokenNameIdentifier	 dfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
applyLocalizedPattern	TokenNameIdentifier	 apply Localized Pattern
(	TokenNameLPAREN	
patternStr	TokenNameIdentifier	 pattern Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dfs	TokenNameIdentifier	 dfs
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dfs	TokenNameIdentifier	 dfs
.	TokenNameDOT	
setInfinity	TokenNameIdentifier	 set Infinity
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_INFINITY	TokenNameIdentifier	 ATTRVAL  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dfs	TokenNameIdentifier	 dfs
.	TokenNameDOT	
setNaN	TokenNameIdentifier	 set Na N
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_NAN	TokenNameIdentifier	 ATTRVAL  NAN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
setDecimalFormatSymbols	TokenNameIdentifier	 set Decimal Format Symbols
(	TokenNameLPAREN	
dfs	TokenNameIdentifier	 dfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
patternStr	TokenNameIdentifier	 pattern Str
)	TokenNameRPAREN	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
applyLocalizedPattern	TokenNameIdentifier	 apply Localized Pattern
(	TokenNameLPAREN	
patternStr	TokenNameIdentifier	 pattern Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
templElem	TokenNameIdentifier	 templ Elem
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
patternStr	TokenNameIdentifier	 pattern Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
//throw new XSLProcessorException(iae); 	TokenNameCOMMENT_LINE	throw new XSLProcessorException(iae); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Warn the user of a problem. * * @param xctxt The XPath runtime state. * @param msg Warning message key * @param args Arguments to be used in warning message * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. * @param xctxt The XPath runtime state. @param msg Warning message key @param args Arguments to be used in warning message @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
ErrorListener	TokenNameIdentifier	 Error Listener
errHandler	TokenNameIdentifier	 err Handler
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
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
/** * Overide the superclass method to allow one or two arguments. * * * @param argNum Number of arguments passed in * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Overide the superclass method to allow one or two arguments. * @param argNum Number of arguments passed in * @throws WrongNumberArgsException 
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
argNum	TokenNameIdentifier	 arg Num
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
argNum	TokenNameIdentifier	 arg Num
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs and throws a WrongNumberArgException with the appropriate * message for this function object. * * @throws WrongNumberArgsException */	TokenNameCOMMENT_JAVADOC	 Constructs and throws a WrongNumberArgException with the appropriate message for this function object. * @throws WrongNumberArgsException 
protected	TokenNameprotected	
void	TokenNamevoid	
reportWrongNumberArgs	TokenNameIdentifier	 report Wrong Number Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrongNumberArgsException	TokenNameIdentifier	 Wrong Number Args Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"2 or 3"); 	TokenNameCOMMENT_LINE	"2 or 3"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
