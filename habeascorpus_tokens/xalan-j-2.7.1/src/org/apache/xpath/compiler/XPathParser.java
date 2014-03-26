/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPathParser.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPathParser.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
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
domapi	TokenNameIdentifier	 domapi
.	TokenNameDOT	
XPathStylesheetDOM3Exception	TokenNameIdentifier	 X Path Stylesheet DO M3 Exception
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
XNumber	TokenNameIdentifier	 X Number
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
/** * Tokenizes and parses XPath expressions. This should really be named * XPathParserImpl, and may be renamed in the future. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Tokenizes and parses XPath expressions. This should really be named XPathParserImpl, and may be renamed in the future. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XPathParser	TokenNameIdentifier	 X Path Parser
{	TokenNameLBRACE	
// %REVIEW% Is there a better way of doing this? 	TokenNameCOMMENT_LINE	%REVIEW% Is there a better way of doing this? 
// Upside is minimum object churn. Downside is that we don't have a useful 	TokenNameCOMMENT_LINE	Upside is minimum object churn. Downside is that we don't have a useful 
// backtrace in the exception itself -- but we don't expect to need one. 	TokenNameCOMMENT_LINE	backtrace in the exception itself -- but we don't expect to need one. 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
=	TokenNameEQUAL	
"CONTINUE_AFTER_FATAL_ERROR"	TokenNameStringLiteral	CONTINUE_AFTER_FATAL_ERROR
;	TokenNameSEMICOLON	
/** * The XPath to be processed. */	TokenNameCOMMENT_JAVADOC	 The XPath to be processed. 
private	TokenNameprivate	
OpMap	TokenNameIdentifier	 Op Map
m_ops	TokenNameIdentifier	 m ops
;	TokenNameSEMICOLON	
/** * The next token in the pattern. */	TokenNameCOMMENT_JAVADOC	 The next token in the pattern. 
transient	TokenNametransient	
String	TokenNameIdentifier	 String
m_token	TokenNameIdentifier	 m token
;	TokenNameSEMICOLON	
/** * The first char in m_token, the theory being that this * is an optimization because we won't have to do charAt(0) as * often. */	TokenNameCOMMENT_JAVADOC	 The first char in m_token, the theory being that this is an optimization because we won't have to do charAt(0) as often. 
transient	TokenNametransient	
char	TokenNamechar	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The position in the token queue is tracked by m_queueMark. */	TokenNameCOMMENT_JAVADOC	 The position in the token queue is tracked by m_queueMark. 
int	TokenNameint	
m_queueMark	TokenNameIdentifier	 m queue Mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Results from checking FilterExpr syntax */	TokenNameCOMMENT_JAVADOC	 Results from checking FilterExpr syntax 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
FILTER_MATCH_FAILED	TokenNameIdentifier	 FILTER  MATCH  FAILED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
FILTER_MATCH_PRIMARY	TokenNameIdentifier	 FILTER  MATCH  PRIMARY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
FILTER_MATCH_PREDICATES	TokenNameIdentifier	 FILTER  MATCH  PREDICATES
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The parser constructor. */	TokenNameCOMMENT_JAVADOC	 The parser constructor. 
public	TokenNamepublic	
XPathParser	TokenNameIdentifier	 X Path Parser
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
sourceLocator	TokenNameIdentifier	 source Locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
=	TokenNameEQUAL	
errorListener	TokenNameIdentifier	 error Listener
;	TokenNameSEMICOLON	
m_sourceLocator	TokenNameIdentifier	 m source Locator
=	TokenNameEQUAL	
sourceLocator	TokenNameIdentifier	 source Locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The prefix resolver to map prefixes to namespaces in the OpMap. */	TokenNameCOMMENT_JAVADOC	 The prefix resolver to map prefixes to namespaces in the OpMap. 
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
m_namespaceContext	TokenNameIdentifier	 m namespace Context
;	TokenNameSEMICOLON	
/** * Given an string, init an XPath object for selections, * in order that a parse doesn't * have to be done each time the expression is evaluated. * * @param compiler The compiler object. * @param expression A string conforming to the XPath grammar. * @param namespaceContext An object that is able to resolve prefixes in * the XPath to namespaces. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Given an string, init an XPath object for selections, in order that a parse doesn't have to be done each time the expression is evaluated. * @param compiler The compiler object. @param expression A string conforming to the XPath grammar. @param namespaceContext An object that is able to resolve prefixes in the XPath to namespaces. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
initXPath	TokenNameIdentifier	 init X Path
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
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
m_ops	TokenNameIdentifier	 m ops
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
=	TokenNameEQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
;	TokenNameSEMICOLON	
m_functionTable	TokenNameIdentifier	 m function Table
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getFunctionTable	TokenNameIdentifier	 get Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Lexer	TokenNameIdentifier	 Lexer
lexer	TokenNameIdentifier	 lexer
=	TokenNameEQUAL	
new	TokenNamenew	
Lexer	TokenNameIdentifier	 Lexer
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_XPATH	TokenNameIdentifier	 OP  XPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Patch for Christine's gripe. She wants her errorHandler to return from 	TokenNameCOMMENT_LINE	Patch for Christine's gripe. She wants her errorHandler to return from 
// a fatal error and continue trying to parse, rather than throwing an exception. 	TokenNameCOMMENT_LINE	a fatal error and continue trying to parse, rather than throwing an exception. 
// Without the patch, that put us into an endless loop. 	TokenNameCOMMENT_LINE	Without the patch, that put us into an endless loop. 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Is there a better way of doing this? 	TokenNameCOMMENT_LINE	%REVIEW% Is there a better way of doing this? 
// %REVIEW% Are there any other cases which need the safety net? 	TokenNameCOMMENT_LINE	%REVIEW% Are there any other cases which need the safety net? 
// (and if so do we care right now, or should we rewrite the XPath 	TokenNameCOMMENT_LINE	(and if so do we care right now, or should we rewrite the XPath 
// grammar engine and can fix it at that time?) 	TokenNameCOMMENT_LINE	grammar engine and can fix it at that time?) 
try	TokenNametry	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
extraTokens	TokenNameIdentifier	 extra Tokens
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extraTokens	TokenNameIdentifier	 extra Tokens
+=	TokenNamePLUS_EQUAL	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
m_token	TokenNameIdentifier	 m token
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
extraTokens	TokenNameIdentifier	 extra Tokens
+=	TokenNamePLUS_EQUAL	
", "	TokenNameStringLiteral	, 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXTRA_ILLEGAL_TOKENS	TokenNameIdentifier	 ER  EXTRA  ILLEGAL  TOKENS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
extraTokens	TokenNameIdentifier	 extra Tokens
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Extra illegal tokens: "+extraTokens); 	TokenNameCOMMENT_LINE	"Extra illegal tokens: "+extraTokens); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// What I _want_ to do is null out this XPath. 	TokenNameCOMMENT_LINE	What I _want_ to do is null out this XPath. 
// I doubt this has the desired effect, but I'm not sure what else to do. 	TokenNameCOMMENT_LINE	I doubt this has the desired effect, but I'm not sure what else to do. 
// %REVIEW%!!! 	TokenNameCOMMENT_LINE	%REVIEW%!!! 
initXPath	TokenNameIdentifier	 init X Path
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
"/.."	TokenNameStringLiteral	/..
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an string, init an XPath object for pattern matches, * in order that a parse doesn't * have to be done each time the expression is evaluated. * @param compiler The XPath object to be initialized. * @param expression A String representing the XPath. * @param namespaceContext An object that is able to resolve prefixes in * the XPath to namespaces. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Given an string, init an XPath object for pattern matches, in order that a parse doesn't have to be done each time the expression is evaluated. @param compiler The XPath object to be initialized. @param expression A String representing the XPath. @param namespaceContext An object that is able to resolve prefixes in the XPath to namespaces. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
initMatchPattern	TokenNameIdentifier	 init Match Pattern
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
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
m_ops	TokenNameIdentifier	 m ops
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
=	TokenNameEQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
;	TokenNameSEMICOLON	
m_functionTable	TokenNameIdentifier	 m function Table
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getFunctionTable	TokenNameIdentifier	 get Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Lexer	TokenNameIdentifier	 Lexer
lexer	TokenNameIdentifier	 lexer
=	TokenNameEQUAL	
new	TokenNamenew	
Lexer	TokenNameIdentifier	 Lexer
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lexer	TokenNameIdentifier	 lexer
.	TokenNameDOT	
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_MATCHPATTERN	TokenNameIdentifier	 OP  MATCHPATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pattern	TokenNameIdentifier	 Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
extraTokens	TokenNameIdentifier	 extra Tokens
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extraTokens	TokenNameIdentifier	 extra Tokens
+=	TokenNamePLUS_EQUAL	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
m_token	TokenNameIdentifier	 m token
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
extraTokens	TokenNameIdentifier	 extra Tokens
+=	TokenNamePLUS_EQUAL	
", "	TokenNameStringLiteral	, 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXTRA_ILLEGAL_TOKENS	TokenNameIdentifier	 ER  EXTRA  ILLEGAL  TOKENS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
extraTokens	TokenNameIdentifier	 extra Tokens
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Extra illegal tokens: "+extraTokens); 	TokenNameCOMMENT_LINE	"Extra illegal tokens: "+extraTokens); 
}	TokenNameRBRACE	
// Terminate for safety. 	TokenNameCOMMENT_LINE	Terminate for safety. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The error listener where syntax errors are to be sent. */	TokenNameCOMMENT_JAVADOC	 The error listener where syntax errors are to be sent. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
m_errorListener	TokenNameIdentifier	 m error Listener
;	TokenNameSEMICOLON	
/** The source location of the XPath. */	TokenNameCOMMENT_JAVADOC	 The source location of the XPath. 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
m_sourceLocator	TokenNameIdentifier	 m source Locator
;	TokenNameSEMICOLON	
/** The table contains build-in functions and customized functions */	TokenNameCOMMENT_JAVADOC	 The table contains build-in functions and customized functions 
private	TokenNameprivate	
FunctionTable	TokenNameIdentifier	 Function Table
m_functionTable	TokenNameIdentifier	 m function Table
;	TokenNameSEMICOLON	
/** * Allow an application to register an error event handler, where syntax * errors will be sent. If the error listener is not set, syntax errors * will be sent to System.err. * * @param handler Reference to error listener where syntax errors will be * sent. */	TokenNameCOMMENT_JAVADOC	 Allow an application to register an error event handler, where syntax errors will be sent. If the error listener is not set, syntax errors will be sent to System.err. * @param handler Reference to error listener where syntax errors will be sent. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_errorListener	TokenNameIdentifier	 m error Listener
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the current error listener. * * @return The error listener, which should not normally be null, but may be. */	TokenNameCOMMENT_JAVADOC	 Return the current error listener. * @return The error listener, which should not normally be null, but may be. 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_errorListener	TokenNameIdentifier	 m error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether m_token matches the target string. * * @param s A string reference or null. * * @return If m_token is null, returns false (or true if s is also null), or * return true if the current token matches the string, else false. */	TokenNameCOMMENT_JAVADOC	 Check whether m_token matches the target string. * @param s A string reference or null. * @return If m_token is null, returns false (or true if s is also null), or return true if the current token matches the string, else false. 
final	TokenNamefinal	
boolean	TokenNameboolean	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether m_tokenChar==c. * * @param c A character to be tested. * * @return If m_token is null, returns false, or return true if c matches * the current token. */	TokenNameCOMMENT_JAVADOC	 Check whether m_tokenChar==c. * @param c A character to be tested. * @return If m_token is null, returns false, or return true if c matches the current token. 
final	TokenNamefinal	
boolean	TokenNameboolean	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look ahead of the current token in order to * make a branching decision. * * @param c the character to be tested for. * @param n number of tokens to look ahead. Must be * greater than 1. * * @return true if the next token matches the character argument. */	TokenNameCOMMENT_JAVADOC	 Look ahead of the current token in order to make a branching decision. * @param c the character to be tested for. @param n number of tokens to look ahead. Must be greater than 1. * @return true if the next token matches the character argument. 
final	TokenNamefinal	
boolean	TokenNameboolean	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look behind the first character of the current token in order to * make a branching decision. * * @param c the character to compare it to. * @param n number of tokens to look behind. Must be * greater than 1. Note that the look behind terminates * at either the beginning of the string or on a '|' * character. Because of this, this method should only * be used for pattern matching. * * @return true if the token behind the current token matches the character * argument. */	TokenNameCOMMENT_JAVADOC	 Look behind the first character of the current token in order to make a branching decision. * @param c the character to compare it to. @param n number of tokens to look behind. Must be greater than 1. Note that the look behind terminates at either the beginning of the string or on a '|' character. Because of this, this method should only be used for pattern matching. * @return true if the token behind the current token matches the character argument. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
lookbehind	TokenNameIdentifier	 lookbehind
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isToken	TokenNameIdentifier	 is Token
;	TokenNameSEMICOLON	
int	TokenNameint	
lookBehindPos	TokenNameIdentifier	 look Behind Pos
=	TokenNameEQUAL	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookBehindPos	TokenNameIdentifier	 look Behind Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lookbehind	TokenNameIdentifier	 lookbehind
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
lookBehindPos	TokenNameIdentifier	 look Behind Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookbehind	TokenNameIdentifier	 lookbehind
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lookbehind	TokenNameIdentifier	 lookbehind
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lookbehind	TokenNameIdentifier	 lookbehind
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isToken	TokenNameIdentifier	 is Token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isToken	TokenNameIdentifier	 is Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isToken	TokenNameIdentifier	 is Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isToken	TokenNameIdentifier	 is Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * look behind the current token in order to * see if there is a useable token. * * @param n number of tokens to look behind. Must be * greater than 1. Note that the look behind terminates * at either the beginning of the string or on a '|' * character. Because of this, this method should only * be used for pattern matching. * * @return true if look behind has a token, false otherwise. */	TokenNameCOMMENT_JAVADOC	 look behind the current token in order to see if there is a useable token. * @param n number of tokens to look behind. Must be greater than 1. Note that the look behind terminates at either the beginning of the string or on a '|' character. Because of this, this method should only be used for pattern matching. * @return true if look behind has a token, false otherwise. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
lookbehindHasToken	TokenNameIdentifier	 lookbehind Has Token
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
hasToken	TokenNameIdentifier	 has Token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lookbehind	TokenNameIdentifier	 lookbehind
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lookbehind	TokenNameIdentifier	 lookbehind
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lookbehind	TokenNameIdentifier	 lookbehind
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasToken	TokenNameIdentifier	 has Token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hasToken	TokenNameIdentifier	 has Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hasToken	TokenNameIdentifier	 has Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look ahead of the current token in order to * make a branching decision. * * @param s the string to compare it to. * @param n number of tokens to lookahead. Must be * greater than 1. * * @return true if the token behind the current token matches the string * argument. */	TokenNameCOMMENT_JAVADOC	 Look ahead of the current token in order to make a branching decision. * @param s the string to compare it to. @param n number of tokens to lookahead. Must be greater than 1. * @return true if the token behind the current token matches the string argument. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isToken	TokenNameIdentifier	 is Token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
+	TokenNamePLUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isToken	TokenNameIdentifier	 is Token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lookahead	TokenNameIdentifier	 lookahead
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isToken	TokenNameIdentifier	 is Token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isToken	TokenNameIdentifier	 is Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the next token from the command and * store it in m_token string. */	TokenNameCOMMENT_JAVADOC	 Retrieve the next token from the command and store it in m_token string. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
<	TokenNameLESS	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retrieve a token relative to the current token. * * @param i Position relative to current token. * * @return The string at the given index, or null if the index is out * of range. */	TokenNameCOMMENT_JAVADOC	 Retrieve a token relative to the current token. * @param i Position relative to current token. * @return The string at the given index, or null if the index is out of range. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getTokenRelative	TokenNameIdentifier	 get Token Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
int	TokenNameint	
relative	TokenNameIdentifier	 relative
=	TokenNameEQUAL	
m_queueMark	TokenNameIdentifier	 m queue Mark
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
<	TokenNameLESS	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the previous token from the command and * store it in m_token string. */	TokenNameCOMMENT_JAVADOC	 Retrieve the previous token from the command and store it in m_token string. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
prevToken	TokenNameIdentifier	 prev Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_queueMark	TokenNameIdentifier	 m queue Mark
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
m_token	TokenNameIdentifier	 m token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_queueMark	TokenNameIdentifier	 m queue Mark
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_tokenChar	TokenNameIdentifier	 m token Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Consume an expected token, throwing an exception if it * isn't there. * * @param expected The string to be expected. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Consume an expected token, throwing an exception if it isn't there. * @param expected The string to be expected. * @throws javax.xml.transform.TransformerException 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
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
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_BUT_FOUND	TokenNameIdentifier	 ER  EXPECTED  BUT  FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Expected "+expected+", but found: "+m_token); 	TokenNameCOMMENT_LINE	"Expected "+expected+", but found: "+m_token); 
// Patch for Christina's gripe. She wants her errorHandler to return from 	TokenNameCOMMENT_LINE	Patch for Christina's gripe. She wants her errorHandler to return from 
// this error and continue trying to parse, rather than throwing an exception. 	TokenNameCOMMENT_LINE	this error and continue trying to parse, rather than throwing an exception. 
// Without the patch, that put us into an endless loop. 	TokenNameCOMMENT_LINE	Without the patch, that put us into an endless loop. 
throw	TokenNamethrow	
new	TokenNamenew	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
(	TokenNameLPAREN	
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Consume an expected token, throwing an exception if it * isn't there. * * @param expected the character to be expected. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Consume an expected token, throwing an exception if it isn't there. * @param expected the character to be expected. * @throws javax.xml.transform.TransformerException 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
char	TokenNamechar	
expected	TokenNameIdentifier	 expected
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
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_BUT_FOUND	TokenNameIdentifier	 ER  EXPECTED  BUT  FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Expected "+expected+", but found: "+m_token); 	TokenNameCOMMENT_LINE	"Expected "+expected+", but found: "+m_token); 
// Patch for Christina's gripe. She wants her errorHandler to return from 	TokenNameCOMMENT_LINE	Patch for Christina's gripe. She wants her errorHandler to return from 
// this error and continue trying to parse, rather than throwing an exception. 	TokenNameCOMMENT_LINE	this error and continue trying to parse, rather than throwing an exception. 
// Without the patch, that put us into an endless loop. 	TokenNameCOMMENT_LINE	Without the patch, that put us into an endless loop. 
throw	TokenNamethrow	
new	TokenNamenew	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
(	TokenNameLPAREN	
CONTINUE_AFTER_FATAL_ERROR	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Warn the user of a problem. * * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. * @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. 
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
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
this	TokenNamethis	
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
m_sourceLocator	TokenNameIdentifier	 m source Locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Should never happen. 	TokenNameCOMMENT_LINE	Should never happen. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Notify the user of an assertion error, and probably throw an * exception. * * @param b If false, a runtime exception will be thrown. * @param msg The assertion message, which should be informative. * * @throws RuntimeException if the b argument is false. */	TokenNameCOMMENT_JAVADOC	 Notify the user of an assertion error, and probably throw an exception. * @param b If false, a runtime exception will be thrown. @param msg The assertion message, which should be informative. * @throws RuntimeException if the b argument is false. 
private	TokenNameprivate	
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
/** * Notify the user of an error, and probably throw an * exception. * * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. */	TokenNameCOMMENT_JAVADOC	 Notify the user of an error, and probably throw an exception. * @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. 
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
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
this	TokenNamethis	
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
m_sourceLocator	TokenNameIdentifier	 m source Locator
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
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.err.println(fmsg); 	TokenNameCOMMENT_LINE	System.err.println(fmsg); 
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method is added to support DOM 3 XPath API. * <p> * This method is exactly like error(String, Object[]); except that * the underlying TransformerException is * XpathStylesheetDOM3Exception (which extends TransformerException). * <p> * So older XPath code in Xalan is not affected by this. To older XPath code * the behavior of whether error() or errorForDOM3() is called because it is * always catching TransformerException objects and is oblivious to * the new subclass of XPathStylesheetDOM3Exception. Older XPath code * runs as before. * <p> * However, newer DOM3 XPath code upon catching a TransformerException can * can check if the exception is an instance of XPathStylesheetDOM3Exception * and take appropriate action. * * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. */	TokenNameCOMMENT_JAVADOC	 This method is added to support DOM 3 XPath API. <p> This method is exactly like error(String, Object[]); except that the underlying TransformerException is XpathStylesheetDOM3Exception (which extends TransformerException). <p> So older XPath code in Xalan is not affected by this. To older XPath code the behavior of whether error() or errorForDOM3() is called because it is always catching TransformerException objects and is oblivious to the new subclass of XPathStylesheetDOM3Exception. Older XPath code runs as before. <p> However, newer DOM3 XPath code upon catching a TransformerException can can check if the exception is an instance of XPathStylesheetDOM3Exception and take appropriate action. * @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. 
void	TokenNamevoid	
errorForDOM3	TokenNameIdentifier	 error For DO M3
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
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
this	TokenNamethis	
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
XPathStylesheetDOM3Exception	TokenNameIdentifier	 X Path Stylesheet DO M3 Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
m_sourceLocator	TokenNameIdentifier	 m source Locator
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
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.err.println(fmsg); 	TokenNameCOMMENT_LINE	System.err.println(fmsg); 
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Dump the remaining token queue. * Thanks to Craig for this. * * @return A dump of the remaining token queue, which may be appended to * an error message. */	TokenNameCOMMENT_JAVADOC	 Dump the remaining token queue. Thanks to Craig for this. * @return A dump of the remaining token queue, which may be appended to an error message. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
dumpRemainingTokenQueue	TokenNameIdentifier	 dump Remaining Token Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
m_queueMark	TokenNameIdentifier	 m queue Mark
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
returnMsg	TokenNameIdentifier	 return Msg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
<	TokenNameLESS	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
" Remaining tokens: ("	TokenNameStringLiteral	 Remaining tokens: (
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
<	TokenNameLESS	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getTokenQueueSize	TokenNameIdentifier	 get Token Queue Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
returnMsg	TokenNameIdentifier	 return Msg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
returnMsg	TokenNameIdentifier	 return Msg
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
returnMsg	TokenNameIdentifier	 return Msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a string, return the corresponding function token. * * @param key A local name of a function. * * @return The function ID, which may correspond to one of the FUNC_XXX * values found in {@link org.apache.xpath.compiler.FunctionTable}, but may * be a value installed by an external module. */	TokenNameCOMMENT_JAVADOC	 Given a string, return the corresponding function token. * @param key A local name of a function. * @return The function ID, which may correspond to one of the FUNC_XXX values found in {@link org.apache.xpath.compiler.FunctionTable}, but may be a value installed by an external module. 
final	TokenNamefinal	
int	TokenNameint	
getFunctionToken	TokenNameIdentifier	 get Function Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// These are nodetests, xpathparser treats them as functions when parsing 	TokenNameCOMMENT_LINE	These are nodetests, xpathparser treats them as functions when parsing 
// a FilterExpr. 	TokenNameCOMMENT_LINE	a FilterExpr. 
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
lookupNodeTest	TokenNameIdentifier	 lookup Node Test
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
m_functionTable	TokenNameIdentifier	 m function Table
.	TokenNameDOT	
getFunctionID	TokenNameIdentifier	 get Function ID
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
npe	TokenNameIdentifier	 npe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
cce	TokenNameIdentifier	 cce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert room for operation. This will NOT set * the length value of the operation, but will update * the length value for the total expression. * * @param pos The position where the op is to be inserted. * @param length The length of the operation space in the op map. * @param op The op code to the inserted. */	TokenNameCOMMENT_JAVADOC	 Insert room for operation. This will NOT set the length value of the operation, but will update the length value for the total expression. * @param pos The position where the op is to be inserted. @param length The length of the operation space in the op map. @param op The op code to the inserted. 
void	TokenNamevoid	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
int	TokenNameint	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
totalLen	TokenNameIdentifier	 total Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
totalLen	TokenNameIdentifier	 total Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
totalLen	TokenNameIdentifier	 total Len
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert room for operation. This WILL set * the length value of the operation, and will update * the length value for the total expression. * * @param length The length of the operation. * @param op The op code to the inserted. */	TokenNameCOMMENT_JAVADOC	 Insert room for operation. This WILL set the length value of the operation, and will update the length value for the total expression. * @param length The length of the operation. @param op The op code to the inserted. 
void	TokenNamevoid	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
int	TokenNameint	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
totalLen	TokenNameIdentifier	 total Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
totalLen	TokenNameIdentifier	 total Len
,	TokenNameCOMMA	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
totalLen	TokenNameIdentifier	 total Len
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
totalLen	TokenNameIdentifier	 total Len
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ============= EXPRESSIONS FUNCTIONS ================= 	TokenNameCOMMENT_LINE	============= EXPRESSIONS FUNCTIONS ================= 
/** * * * Expr ::= OrExpr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Expr ::= OrExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
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
OrExpr	TokenNameIdentifier	 Or Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * * OrExpr ::= AndExpr * | OrExpr 'or' AndExpr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * OrExpr ::= AndExpr | OrExpr 'or' AndExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
OrExpr	TokenNameIdentifier	 Or Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AndExpr	TokenNameIdentifier	 And Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"or"	TokenNameStringLiteral	or
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_OR	TokenNameIdentifier	 OP  OR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OrExpr	TokenNameIdentifier	 Or Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * * AndExpr ::= EqualityExpr * | AndExpr 'and' EqualityExpr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * AndExpr ::= EqualityExpr | AndExpr 'and' EqualityExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
AndExpr	TokenNameIdentifier	 And Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EqualityExpr	TokenNameIdentifier	 Equality Expr
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"and"	TokenNameStringLiteral	and
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_AND	TokenNameIdentifier	 OP  AND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AndExpr	TokenNameIdentifier	 And Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * @returns an Object which is either a String, a Number, a Boolean, or a vector * of nodes. * * EqualityExpr ::= RelationalExpr * | EqualityExpr '=' RelationalExpr * * * @param addPos Position where expression is to be added, or -1 for append. * * @return the position at the end of the equality expression. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * @returns an Object which is either a String, a Number, a Boolean, or a vector of nodes. * EqualityExpr ::= RelationalExpr | EqualityExpr '=' RelationalExpr * @param addPos Position where expression is to be added, or -1 for append. * @return the position at the end of the equality expression. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
int	TokenNameint	
EqualityExpr	TokenNameIdentifier	 Equality Expr
(	TokenNameLPAREN	
int	TokenNameint	
addPos	TokenNameIdentifier	 add Pos
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
opPos	TokenNameIdentifier	 op Pos
;	TokenNameSEMICOLON	
RelationalExpr	TokenNameIdentifier	 Relational Expr
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_NOTEQUALS	TokenNameIdentifier	 OP  NOTEQUALS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
EqualityExpr	TokenNameIdentifier	 Equality Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_EQUALS	TokenNameIdentifier	 OP  EQUALS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
EqualityExpr	TokenNameIdentifier	 Equality Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * . * @returns an Object which is either a String, a Number, a Boolean, or a vector * of nodes. * * RelationalExpr ::= AdditiveExpr * | RelationalExpr '<' AdditiveExpr * | RelationalExpr '>' AdditiveExpr * | RelationalExpr '<=' AdditiveExpr * | RelationalExpr '>=' AdditiveExpr * * * @param addPos Position where expression is to be added, or -1 for append. * * @return the position at the end of the relational expression. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 . @returns an Object which is either a String, a Number, a Boolean, or a vector of nodes. * RelationalExpr ::= AdditiveExpr | RelationalExpr '<' AdditiveExpr | RelationalExpr '>' AdditiveExpr | RelationalExpr '<=' AdditiveExpr | RelationalExpr '>=' AdditiveExpr * @param addPos Position where expression is to be added, or -1 for append. * @return the position at the end of the relational expression. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
int	TokenNameint	
RelationalExpr	TokenNameIdentifier	 Relational Expr
(	TokenNameLPAREN	
int	TokenNameint	
addPos	TokenNameIdentifier	 add Pos
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
opPos	TokenNameIdentifier	 op Pos
;	TokenNameSEMICOLON	
AdditiveExpr	TokenNameIdentifier	 Additive Expr
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LTE	TokenNameIdentifier	 OP  LTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LT	TokenNameIdentifier	 OP  LT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
RelationalExpr	TokenNameIdentifier	 Relational Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_GTE	TokenNameIdentifier	 OP  GTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_GT	TokenNameIdentifier	 OP  GT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
RelationalExpr	TokenNameIdentifier	 Relational Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This has to handle construction of the operations so that they are evaluated * in pre-fix order. So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be * evaluated as |-|+|9|7|6|. * * AdditiveExpr ::= MultiplicativeExpr * | AdditiveExpr '+' MultiplicativeExpr * | AdditiveExpr '-' MultiplicativeExpr * * * @param addPos Position where expression is to be added, or -1 for append. * * @return the position at the end of the equality expression. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 This has to handle construction of the operations so that they are evaluated in pre-fix order. So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be evaluated as |-|+|9|7|6|. * AdditiveExpr ::= MultiplicativeExpr | AdditiveExpr '+' MultiplicativeExpr | AdditiveExpr '-' MultiplicativeExpr * @param addPos Position where expression is to be added, or -1 for append. * @return the position at the end of the equality expression. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
int	TokenNameint	
AdditiveExpr	TokenNameIdentifier	 Additive Expr
(	TokenNameLPAREN	
int	TokenNameint	
addPos	TokenNameIdentifier	 add Pos
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
opPos	TokenNameIdentifier	 op Pos
;	TokenNameSEMICOLON	
MultiplicativeExpr	TokenNameIdentifier	 Multiplicative Expr
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_PLUS	TokenNameIdentifier	 OP  PLUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
AdditiveExpr	TokenNameIdentifier	 Additive Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_MINUS	TokenNameIdentifier	 OP  MINUS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
AdditiveExpr	TokenNameIdentifier	 Additive Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This has to handle construction of the operations so that they are evaluated * in pre-fix order. So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be * evaluated as |-|+|9|7|6|. * * MultiplicativeExpr ::= UnaryExpr * | MultiplicativeExpr MultiplyOperator UnaryExpr * | MultiplicativeExpr 'div' UnaryExpr * | MultiplicativeExpr 'mod' UnaryExpr * | MultiplicativeExpr 'quo' UnaryExpr * * @param addPos Position where expression is to be added, or -1 for append. * * @return the position at the end of the equality expression. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 This has to handle construction of the operations so that they are evaluated in pre-fix order. So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be evaluated as |-|+|9|7|6|. * MultiplicativeExpr ::= UnaryExpr | MultiplicativeExpr MultiplyOperator UnaryExpr | MultiplicativeExpr 'div' UnaryExpr | MultiplicativeExpr 'mod' UnaryExpr | MultiplicativeExpr 'quo' UnaryExpr * @param addPos Position where expression is to be added, or -1 for append. * @return the position at the end of the equality expression. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
int	TokenNameint	
MultiplicativeExpr	TokenNameIdentifier	 Multiplicative Expr
(	TokenNameLPAREN	
int	TokenNameint	
addPos	TokenNameIdentifier	 add Pos
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
opPos	TokenNameIdentifier	 op Pos
;	TokenNameSEMICOLON	
UnaryExpr	TokenNameIdentifier	 Unary Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_MULT	TokenNameIdentifier	 OP  MULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
MultiplicativeExpr	TokenNameIdentifier	 Multiplicative Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"div"	TokenNameStringLiteral	div
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_DIV	TokenNameIdentifier	 OP  DIV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
MultiplicativeExpr	TokenNameIdentifier	 Multiplicative Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"mod"	TokenNameStringLiteral	mod
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_MOD	TokenNameIdentifier	 OP  MOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
MultiplicativeExpr	TokenNameIdentifier	 Multiplicative Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"quo"	TokenNameStringLiteral	quo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_QUO	TokenNameIdentifier	 OP  QUO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
=	TokenNameEQUAL	
MultiplicativeExpr	TokenNameIdentifier	 Multiplicative Expr
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
addPos	TokenNameIdentifier	 add Pos
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
opPlusLeftHandLen	TokenNameIdentifier	 op Plus Left Hand Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPos	TokenNameIdentifier	 add Pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPos	TokenNameIdentifier	 add Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * UnaryExpr ::= UnionExpr * | '-' UnaryExpr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * UnaryExpr ::= UnionExpr | '-' UnaryExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
UnaryExpr	TokenNameIdentifier	 Unary Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isNeg	TokenNameIdentifier	 is Neg
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_NEG	TokenNameIdentifier	 OP  NEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isNeg	TokenNameIdentifier	 is Neg
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnionExpr	TokenNameIdentifier	 Union Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isNeg	TokenNameIdentifier	 is Neg
)	TokenNameRPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * StringExpr ::= Expr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * StringExpr ::= Expr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
StringExpr	TokenNameIdentifier	 String Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_STRING	TokenNameIdentifier	 OP  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * * StringExpr ::= Expr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * StringExpr ::= Expr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
BooleanExpr	TokenNameIdentifier	 Boolean Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_BOOL	TokenNameIdentifier	 OP  BOOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opLen	TokenNameIdentifier	 op Len
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
opLen	TokenNameIdentifier	 op Len
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL	TokenNameIdentifier	 ER  BOOLEAN  ARG  NO  LONGER  OPTIONAL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"boolean(...) argument is no longer optional with 19990709 XPath draft."); 	TokenNameCOMMENT_LINE	"boolean(...) argument is no longer optional with 19990709 XPath draft."); 
}	TokenNameRBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
opLen	TokenNameIdentifier	 op Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * * NumberExpr ::= Expr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * NumberExpr ::= Expr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
NumberExpr	TokenNameIdentifier	 Number Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_NUMBER	TokenNameIdentifier	 OP  NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The context of the right hand side expressions is the context of the * left hand side expression. The results of the right hand side expressions * are node sets. The result of the left hand side UnionExpr is the union * of the results of the right hand side expressions. * * * UnionExpr ::= PathExpr * | UnionExpr '|' PathExpr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 The context of the right hand side expressions is the context of the left hand side expression. The results of the right hand side expressions are node sets. The result of the left hand side UnionExpr is the union of the results of the right hand side expressions. * UnionExpr ::= PathExpr | UnionExpr '|' PathExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
UnionExpr	TokenNameIdentifier	 Union Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
continueOrLoop	TokenNameIdentifier	 continue Or Loop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundUnion	TokenNameIdentifier	 found Union
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
PathExpr	TokenNameIdentifier	 Path Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
==	TokenNameEQUAL_EQUAL	
foundUnion	TokenNameIdentifier	 found Union
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundUnion	TokenNameIdentifier	 found Union
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_UNION	TokenNameIdentifier	 OP  UNION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this.m_testForDocOrder = true; 	TokenNameCOMMENT_LINE	this.m_testForDocOrder = true; 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
continueOrLoop	TokenNameIdentifier	 continue Or Loop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * PathExpr ::= LocationPath * | FilterExpr * | FilterExpr '/' RelativeLocationPath * | FilterExpr '//' RelativeLocationPath * * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 PathExpr ::= LocationPath | FilterExpr | FilterExpr '/' RelativeLocationPath | FilterExpr '//' RelativeLocationPath * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
PathExpr	TokenNameIdentifier	 Path Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
filterExprMatch	TokenNameIdentifier	 filter Expr Match
=	TokenNameEQUAL	
FilterExpr	TokenNameIdentifier	 Filter Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filterExprMatch	TokenNameIdentifier	 filter Expr Match
!=	TokenNameNOT_EQUAL	
FILTER_MATCH_FAILED	TokenNameIdentifier	 FILTER  MATCH  FAILED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If FilterExpr had Predicates, a OP_LOCATIONPATH opcode would already 	TokenNameCOMMENT_LINE	If FilterExpr had Predicates, a OP_LOCATIONPATH opcode would already 
// have been inserted. 	TokenNameCOMMENT_LINE	have been inserted. 
boolean	TokenNameboolean	
locationPathStarted	TokenNameIdentifier	 location Path Started
=	TokenNameEQUAL	
(	TokenNameLPAREN	
filterExprMatch	TokenNameIdentifier	 filter Expr Match
==	TokenNameEQUAL_EQUAL	
FILTER_MATCH_PREDICATES	TokenNameIdentifier	 FILTER  MATCH  PREDICATES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
locationPathStarted	TokenNameIdentifier	 location Path Started
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int locationPathOpPos = opPos; 	TokenNameCOMMENT_LINE	int locationPathOpPos = opPos; 
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LOCATIONPATH	TokenNameIdentifier	 OP  LOCATIONPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locationPathStarted	TokenNameIdentifier	 location Path Started
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
RelativeLocationPath	TokenNameIdentifier	 Relative Location Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "Relative location path expected following '/' or '//'" 	TokenNameCOMMENT_LINE	"Relative location path expected following '/' or '//'" 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_REL_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  REL  LOC  PATH
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Terminate for safety. 	TokenNameCOMMENT_LINE	Terminate for safety. 
if	TokenNameif	
(	TokenNameLPAREN	
locationPathStarted	TokenNameIdentifier	 location Path Started
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LocationPath	TokenNameIdentifier	 Location Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * * FilterExpr ::= PrimaryExpr * | FilterExpr Predicate * * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @return FILTER_MATCH_PREDICATES, if this method successfully matched a * FilterExpr with one or more Predicates; * FILTER_MATCH_PRIMARY, if this method successfully matched a * FilterExpr that was just a PrimaryExpr; or * FILTER_MATCH_FAILED, if this method did not match a FilterExpr * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * FilterExpr ::= PrimaryExpr | FilterExpr Predicate * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @return FILTER_MATCH_PREDICATES, if this method successfully matched a FilterExpr with one or more Predicates; FILTER_MATCH_PRIMARY, if this method successfully matched a FilterExpr that was just a PrimaryExpr; or FILTER_MATCH_FAILED, if this method did not match a FilterExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
int	TokenNameint	
FilterExpr	TokenNameIdentifier	 Filter Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
filterMatch	TokenNameIdentifier	 filter Match
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
PrimaryExpr	TokenNameIdentifier	 Primary Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int locationPathOpPos = opPos; 	TokenNameCOMMENT_LINE	int locationPathOpPos = opPos; 
insertOp	TokenNameIdentifier	 insert Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LOCATIONPATH	TokenNameIdentifier	 OP  LOCATIONPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filterMatch	TokenNameIdentifier	 filter Match
=	TokenNameEQUAL	
FILTER_MATCH_PREDICATES	TokenNameIdentifier	 FILTER  MATCH  PREDICATES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filterMatch	TokenNameIdentifier	 filter Match
=	TokenNameEQUAL	
FILTER_MATCH_PRIMARY	TokenNameIdentifier	 FILTER  MATCH  PRIMARY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filterMatch	TokenNameIdentifier	 filter Match
=	TokenNameEQUAL	
FILTER_MATCH_FAILED	TokenNameIdentifier	 FILTER  MATCH  FAILED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filterMatch	TokenNameIdentifier	 filter Match
;	TokenNameSEMICOLON	
/* * if(tokenIs('[')) * { * Predicate(); * m_ops.m_opMap[opPos + OpMap.MAPINDEX_LENGTH] = m_ops.m_opMap[OpMap.MAPINDEX_LENGTH] - opPos; * } */	TokenNameCOMMENT_BLOCK	 if(tokenIs('[')) { Predicate(); m_ops.m_opMap[opPos + OpMap.MAPINDEX_LENGTH] = m_ops.m_opMap[OpMap.MAPINDEX_LENGTH] - opPos; } 
}	TokenNameRBRACE	
/** * * PrimaryExpr ::= VariableReference * | '(' Expr ')' * | Literal * | Number * | FunctionCall * * @return true if this method successfully matched a PrimaryExpr * * @throws javax.xml.transform.TransformerException * */	TokenNameCOMMENT_JAVADOC	 * PrimaryExpr ::= VariableReference | '(' Expr ')' | Literal | Number | FunctionCall * @return true if this method successfully matched a PrimaryExpr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
boolean	TokenNameboolean	
PrimaryExpr	TokenNameIdentifier	 Primary Expr
(	TokenNameLPAREN	
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
matchFound	TokenNameIdentifier	 match Found
;	TokenNameSEMICOLON	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LITERAL	TokenNameIdentifier	 OP  LITERAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Literal	TokenNameIdentifier	 Literal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchFound	TokenNameIdentifier	 match Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
==	TokenNameEQUAL_EQUAL	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// consume '$' 	TokenNameCOMMENT_LINE	consume '$' 
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_VARIABLE	TokenNameIdentifier	 OP  VARIABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchFound	TokenNameIdentifier	 match Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_GROUP	TokenNameIdentifier	 OP  GROUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchFound	TokenNameIdentifier	 match Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
m_tokenChar	TokenNameIdentifier	 m token Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_NUMBERLIT	TokenNameIdentifier	 OP  NUMBERLIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Number	TokenNameIdentifier	 Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchFound	TokenNameIdentifier	 match Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchFound	TokenNameIdentifier	 match Found
=	TokenNameEQUAL	
FunctionCall	TokenNameIdentifier	 Function Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
matchFound	TokenNameIdentifier	 match Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
matchFound	TokenNameIdentifier	 match Found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Argument ::= Expr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Argument ::= Expr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Argument	TokenNameIdentifier	 Argument
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_ARGUMENT	TokenNameIdentifier	 OP  ARGUMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * FunctionCall ::= FunctionName '(' ( Argument ( ',' Argument)*)? ')' * * @return true if, and only if, a FunctionCall was matched * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * FunctionCall ::= FunctionName '(' ( Argument ( ',' Argument)*)? ')' * @return true if, and only if, a FunctionCall was matched * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
boolean	TokenNameboolean	
FunctionCall	TokenNameIdentifier	 Function Call
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_EXTFUNCTION	TokenNameIdentifier	 OP  EXTFUNCTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
funcTok	TokenNameIdentifier	 func Tok
=	TokenNameEQUAL	
getFunctionToken	TokenNameIdentifier	 get Function Token
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
funcTok	TokenNameIdentifier	 func Tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 ER  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not find function: "+m_token+"()"); 	TokenNameCOMMENT_LINE	"Could not find function: "+m_token+"()"); 
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
funcTok	TokenNameIdentifier	 func Tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_PI	TokenNameIdentifier	 NODETYPE  PI
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_COMMENT	TokenNameIdentifier	 NODETYPE  COMMENT
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_TEXT	TokenNameIdentifier	 NODETYPE  TEXT
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
:	TokenNameCOLON	
// Node type tests look like function calls, but they're not 	TokenNameCOMMENT_LINE	Node type tests look like function calls, but they're not 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_FUNCTION	TokenNameIdentifier	 OP  FUNCTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
funcTok	TokenNameIdentifier	 func Tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_token	TokenNameIdentifier	 m token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  PRECEDING  ARG
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Found ',' but no preceding argument!"); 	TokenNameCOMMENT_LINE	"Found ',' but no preceding argument!"); 
}	TokenNameRBRACE	
Argument	TokenNameIdentifier	 Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  FOLLOWING  ARG
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Found ',' but no following argument!"); 	TokenNameCOMMENT_LINE	"Found ',' but no following argument!"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Terminate for safety. 	TokenNameCOMMENT_LINE	Terminate for safety. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ============= GRAMMAR FUNCTIONS ================= 	TokenNameCOMMENT_LINE	============= GRAMMAR FUNCTIONS ================= 
/** * * LocationPath ::= RelativeLocationPath * | AbsoluteLocationPath * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * LocationPath ::= RelativeLocationPath | AbsoluteLocationPath * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
LocationPath	TokenNameIdentifier	 Location Path
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// int locationPathOpPos = opPos; 	TokenNameCOMMENT_LINE	int locationPathOpPos = opPos; 
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LOCATIONPATH	TokenNameIdentifier	 OP  LOCATIONPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
seenSlash	TokenNameIdentifier	 seen Slash
=	TokenNameEQUAL	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
seenSlash	TokenNameIdentifier	 seen Slash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ROOT	TokenNameIdentifier	 FROM  ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_ROOT	TokenNameIdentifier	 NODETYPE  ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_LOC_PATH_AT_END_EXPR	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH  AT  END  EXPR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
RelativeLocationPath	TokenNameIdentifier	 Relative Location Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
seenSlash	TokenNameIdentifier	 seen Slash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Neither a '/' nor a RelativeLocationPath - i.e., matched nothing 	TokenNameCOMMENT_LINE	Neither a '/' nor a RelativeLocationPath - i.e., matched nothing 
// "Location path expected, but found "+m_token+" was encountered." 	TokenNameCOMMENT_LINE	"Location path expected, but found "+m_token+" was encountered." 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Terminate for safety. 	TokenNameCOMMENT_LINE	Terminate for safety. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * RelativeLocationPath ::= Step * | RelativeLocationPath '/' Step * | AbbreviatedRelativeLocationPath * * @returns true if, and only if, a RelativeLocationPath was matched * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * RelativeLocationPath ::= Step | RelativeLocationPath '/' Step | AbbreviatedRelativeLocationPath * @returns true if, and only if, a RelativeLocationPath was matched * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
boolean	TokenNameboolean	
RelativeLocationPath	TokenNameIdentifier	 Relative Location Path
(	TokenNameLPAREN	
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
!	TokenNameNOT	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// RelativeLocationPath can't end with a trailing '/' 	TokenNameCOMMENT_LINE	RelativeLocationPath can't end with a trailing '/' 
// "Location step expected following '/' or '//'" 	TokenNameCOMMENT_LINE	"Location step expected following '/' or '//'" 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_LOC_STEP	TokenNameIdentifier	 ER  EXPECTED  LOC  STEP
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Step ::= Basis Predicate * | AbbreviatedStep * * @returns false if step was empty (or only a '/'); true, otherwise * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Step ::= Basis Predicate | AbbreviatedStep * @returns false if step was empty (or only a '/'); true, otherwise * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
boolean	TokenNameboolean	
Step	TokenNameIdentifier	 Step
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doubleSlash	TokenNameIdentifier	 double Slash
=	TokenNameEQUAL	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// At most a single '/' before each Step is consumed by caller; if the 	TokenNameCOMMENT_LINE	At most a single '/' before each Step is consumed by caller; if the 
// first thing is a '/', that means we had '//' and the Step must not 	TokenNameCOMMENT_LINE	first thing is a '/', that means we had '//' and the Step must not 
// be empty. 	TokenNameCOMMENT_LINE	be empty. 
if	TokenNameif	
(	TokenNameLPAREN	
doubleSlash	TokenNameIdentifier	 double Slash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Have to fix up for patterns such as '//@foo' or '//attribute::foo', 	TokenNameCOMMENT_LINE	Have to fix up for patterns such as '//@foo' or '//attribute::foo', 
// which translate to 'descendant-or-self::node()/attribute::foo'. 	TokenNameCOMMENT_LINE	which translate to 'descendant-or-self::node()/attribute::foo'. 
// notice I leave the '/' on the queue, so the next will be processed 	TokenNameCOMMENT_LINE	notice I leave the '/' on the queue, so the next will be processed 
// by a regular step pattern. 	TokenNameCOMMENT_LINE	by a regular step pattern. 
// Make room for telling how long the step is without the predicate 	TokenNameCOMMENT_LINE	Make room for telling how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is with the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is with the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_PREDICATE_ILLEGAL_SYNTAX	TokenNameIdentifier	 ER  PREDICATE  ILLEGAL  SYNTAX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"'..[predicate]' or '.[predicate]' is illegal syntax. Use 'self::node()[predicate]' instead."); 	TokenNameCOMMENT_LINE	"'..[predicate]' or '.[predicate]' is illegal syntax. Use 'self::node()[predicate]' instead."); 
}	TokenNameRBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_SELF	TokenNameIdentifier	 FROM  SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_PARENT	TokenNameIdentifier	 FROM  PARENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_NODE	TokenNameIdentifier	 NODETYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// There is probably a better way to test for this 	TokenNameCOMMENT_LINE	There is probably a better way to test for this 
// transition... but it gets real hairy if you try 	TokenNameCOMMENT_LINE	transition... but it gets real hairy if you try 
// to do it in basis(). 	TokenNameCOMMENT_LINE	to do it in basis(). 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Basis	TokenNameIdentifier	 Basis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Tell how long the entire step is. 	TokenNameCOMMENT_LINE	Tell how long the entire step is. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No Step matched - that's an error if previous thing was a '//' 	TokenNameCOMMENT_LINE	No Step matched - that's an error if previous thing was a '//' 
if	TokenNameif	
(	TokenNameLPAREN	
doubleSlash	TokenNameIdentifier	 double Slash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "Location step expected following '/' or '//'" 	TokenNameCOMMENT_LINE	"Location step expected following '/' or '//'" 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_LOC_STEP	TokenNameIdentifier	 ER  EXPECTED  LOC  STEP
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Basis ::= AxisName '::' NodeTest * | AbbreviatedBasis * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Basis ::= AxisName '::' NodeTest | AbbreviatedBasis * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Basis	TokenNameIdentifier	 Basis
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
axesType	TokenNameIdentifier	 axes Type
;	TokenNameSEMICOLON	
// The next blocks guarantee that a FROM_XXX will be added. 	TokenNameCOMMENT_LINE	The next blocks guarantee that a FROM_XXX will be added. 
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
"::"	TokenNameStringLiteral	::
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
AxisName	TokenNameIdentifier	 Axis Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ATTRIBUTES	TokenNameIdentifier	 FROM  ATTRIBUTES
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_CHILDREN	TokenNameIdentifier	 FROM  CHILDREN
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make room for telling how long the step is without the predicate 	TokenNameCOMMENT_LINE	Make room for telling how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Basis ::= AxisName '::' NodeTest * | AbbreviatedBasis * * @return FROM_XXX axes type, found in {@link org.apache.xpath.compiler.Keywords}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Basis ::= AxisName '::' NodeTest | AbbreviatedBasis * @return FROM_XXX axes type, found in {@link org.apache.xpath.compiler.Keywords}. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
int	TokenNameint	
AxisName	TokenNameIdentifier	 Axis Name
(	TokenNameLPAREN	
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
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
getAxisName	TokenNameIdentifier	 get Axis Name
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_ILLEGAL_AXIS_NAME	TokenNameIdentifier	 ER  ILLEGAL  AXIS  NAME
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"illegal axis name: "+m_token); 	TokenNameCOMMENT_LINE	"illegal axis name: "+m_token); 
}	TokenNameRBRACE	
int	TokenNameint	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
axesType	TokenNameIdentifier	 axes Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * NodeTest ::= WildcardName * | NodeType '(' ')' * | 'processing-instruction' '(' Literal ')' * * @param axesType FROM_XXX axes type, found in {@link org.apache.xpath.compiler.Keywords}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * NodeTest ::= WildcardName | NodeType '(' ')' | 'processing-instruction' '(' Literal ')' * @param axesType FROM_XXX axes type, found in {@link org.apache.xpath.compiler.Keywords}. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
int	TokenNameint	
axesType	TokenNameIdentifier	 axes Type
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
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
nodeTestOp	TokenNameIdentifier	 node Test Op
=	TokenNameEQUAL	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nodeTestOp	TokenNameIdentifier	 node Test Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_UNKNOWN_NODETYPE	TokenNameIdentifier	 ER  UNKNOWN  NODETYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Unknown nodetype: "+m_token); 	TokenNameCOMMENT_LINE	"Unknown nodetype: "+m_token); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nt	TokenNameIdentifier	 nt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
nodeTestOp	TokenNameIdentifier	 node Test Op
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nt	TokenNameIdentifier	 nt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_PI	TokenNameIdentifier	 NODETYPE  PI
==	TokenNameEQUAL_EQUAL	
nt	TokenNameIdentifier	 nt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Literal	TokenNameIdentifier	 Literal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Assume name of attribute or element. 	TokenNameCOMMENT_LINE	Assume name of attribute or element. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODENAME	TokenNameIdentifier	 NODENAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ELEMWILDCARD	TokenNameIdentifier	 ELEMWILDCARD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Minimalist check for an NCName - just check first character 	TokenNameCOMMENT_LINE	Minimalist check for an NCName - just check first character 
// to distinguish from other possible tokens 	TokenNameCOMMENT_LINE	to distinguish from other possible tokens 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "Node test that matches either NCName:* or QName was expected." 	TokenNameCOMMENT_LINE	"Node test that matches either NCName:* or QName was expected." 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_NODE_TEST	TokenNameIdentifier	 ER  EXPECTED  NODE  TEST
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ELEMWILDCARD	TokenNameIdentifier	 ELEMWILDCARD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Minimalist check for an NCName - just check first character 	TokenNameCOMMENT_LINE	Minimalist check for an NCName - just check first character 
// to distinguish from other possible tokens 	TokenNameCOMMENT_LINE	to distinguish from other possible tokens 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
m_tokenChar	TokenNameIdentifier	 m token Char
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "Node test that matches either NCName:* or QName was expected." 	TokenNameCOMMENT_LINE	"Node test that matches either NCName:* or QName was expected." 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_NODE_TEST	TokenNameIdentifier	 ER  EXPECTED  NODE  TEST
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * Predicate ::= '[' PredicateExpr ']' * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Predicate ::= '[' PredicateExpr ']' * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
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
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PredicateExpr	TokenNameIdentifier	 Predicate Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * PredicateExpr ::= Expr * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * PredicateExpr ::= Expr * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
PredicateExpr	TokenNameIdentifier	 Predicate Expr
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_PREDICATE	TokenNameIdentifier	 OP  PREDICATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Terminate for safety. 	TokenNameCOMMENT_LINE	Terminate for safety. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * QName ::= (Prefix ':')? LocalPart * Prefix ::= NCName * LocalPart ::= NCName * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 QName ::= (Prefix ':')? LocalPart Prefix ::= NCName LocalPart ::= NCName * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
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
// Namespace 	TokenNameCOMMENT_LINE	Namespace 
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumeExpected	TokenNameIdentifier	 consume Expected
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Local name 	TokenNameCOMMENT_LINE	Local name 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NCName ::= (Letter | '_') (NCNameChar) * NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender */	TokenNameCOMMENT_JAVADOC	 NCName ::= (Letter | '_') (NCNameChar) NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender 
protected	TokenNameprotected	
void	TokenNamevoid	
NCName	TokenNameIdentifier	 NC Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value of the Literal is the sequence of characters inside * the " or ' characters>. * * Literal ::= '"' [^"]* '"' * | "'" [^']* "'" * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 The value of the Literal is the sequence of characters inside the " or ' characters>. * Literal ::= '"' [^"]* '"' | "'" [^']* "'" * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Literal	TokenNameIdentifier	 Literal
(	TokenNameLPAREN	
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
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
m_tokenChar	TokenNameIdentifier	 m token Char
;	TokenNameSEMICOLON	
char	TokenNamechar	
cX	TokenNameIdentifier	 c X
=	TokenNameEQUAL	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cX	TokenNameIdentifier	 c X
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cX	TokenNameIdentifier	 c X
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Mutate the token to remove the quotes and have the XString object 	TokenNameCOMMENT_LINE	Mutate the token to remove the quotes and have the XString object 
// already made. 	TokenNameCOMMENT_LINE	already made. 
int	TokenNameint	
tokenQueuePos	TokenNameIdentifier	 token Queue Pos
=	TokenNameEQUAL	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
tokenQueuePos	TokenNameIdentifier	 token Queue Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
tokenQueuePos	TokenNameIdentifier	 token Queue Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lit = m_token.substring(1, last); 	TokenNameCOMMENT_LINE	lit = m_token.substring(1, last); 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokenQueuePos	TokenNameIdentifier	 token Queue Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_PATTERN_LITERAL_NEEDS_BE_QUOTED	TokenNameIdentifier	 ER  PATTERN  LITERAL  NEEDS  BE  QUOTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Pattern literal ("+m_token+") needs to be quoted!"); 	TokenNameCOMMENT_LINE	"Pattern literal ("+m_token+") needs to be quoted!"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * Number ::= [0-9]+('.'[0-9]+)? | '.'[0-9]+ * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Number ::= [0-9]+('.'[0-9]+)? | '.'[0-9]+ * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Number	TokenNameIdentifier	 Number
(	TokenNameLPAREN	
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
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Mutate the token to remove the quotes and have the XNumber object 	TokenNameCOMMENT_LINE	Mutate the token to remove the quotes and have the XNumber object 
// already made. 	TokenNameCOMMENT_LINE	already made. 
double	TokenNamedouble	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// XPath 1.0 does not support number in exp notation 	TokenNameCOMMENT_LINE	XPath 1.0 does not support number in exp notation 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// to shut up compiler. 	TokenNameCOMMENT_LINE	to shut up compiler. 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_COULDNOT_BE_FORMATTED_TO_NUMBER	TokenNameIdentifier	 ER  COULDNOT  BE  FORMATTED  TO  NUMBER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//m_token+" could not be formatted to a number!"); 	TokenNameCOMMENT_LINE	m_token+" could not be formatted to a number!"); 
}	TokenNameRBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
m_tokenQueue	TokenNameIdentifier	 m token Queue
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_queueMark	TokenNameIdentifier	 m queue Mark
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ============= PATTERN FUNCTIONS ================= 	TokenNameCOMMENT_LINE	============= PATTERN FUNCTIONS ================= 
/** * * Pattern ::= LocationPathPattern * | Pattern '|' LocationPathPattern * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * Pattern ::= LocationPathPattern | Pattern '|' LocationPathPattern * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
Pattern	TokenNameIdentifier	 Pattern
(	TokenNameLPAREN	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * * LocationPathPattern ::= '/' RelativePathPattern? * | IdKeyPattern (('/' | '//') RelativePathPattern)? * | '//'? RelativePathPattern * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * LocationPathPattern ::= '/' RelativePathPattern? | IdKeyPattern (('/' | '//') RelativePathPattern)? | '//'? RelativePathPattern * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
(	TokenNameLPAREN	
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
RELATIVE_PATH_NOT_PERMITTED	TokenNameIdentifier	 RELATIVE  PATH  NOT  PERMITTED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
RELATIVE_PATH_PERMITTED	TokenNameIdentifier	 RELATIVE  PATH  PERMITTED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
RELATIVE_PATH_REQUIRED	TokenNameIdentifier	 RELATIVE  PATH  REQUIRED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
relativePathStatus	TokenNameIdentifier	 relative Path Status
=	TokenNameEQUAL	
RELATIVE_PATH_NOT_PERMITTED	TokenNameIdentifier	 RELATIVE  PATH  NOT  PERMITTED
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_LOCATIONPATHPATTERN	TokenNameIdentifier	 OP  LOCATIONPATHPATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_ID_STRING	TokenNameIdentifier	 FUNC  ID  STRING
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_KEY_STRING	TokenNameIdentifier	 FUNC  KEY  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IdKeyPattern	TokenNameIdentifier	 Id Key Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_ANY_ANCESTOR	TokenNameIdentifier	 MATCH  ANY  ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_IMMEDIATE_ANCESTOR	TokenNameIdentifier	 MATCH  IMMEDIATE  ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_FUNCTEST	TokenNameIdentifier	 NODETYPE  FUNCTEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
relativePathStatus	TokenNameIdentifier	 relative Path Status
=	TokenNameEQUAL	
RELATIVE_PATH_REQUIRED	TokenNameIdentifier	 RELATIVE  PATH  REQUIRED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_ANY_ANCESTOR	TokenNameIdentifier	 MATCH  ANY  ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Added this to fix bug reported by Myriam for match="//x/a" 	TokenNameCOMMENT_LINE	Added this to fix bug reported by Myriam for match="//x/a" 
// patterns. If you don't do this, the 'x' step will think it's part 	TokenNameCOMMENT_LINE	patterns. If you don't do this, the 'x' step will think it's part 
// of a '//' pattern, and so will cause 'a' to be matched when it has 	TokenNameCOMMENT_LINE	of a '//' pattern, and so will cause 'a' to be matched when it has 
// any ancestor that is 'x'. 	TokenNameCOMMENT_LINE	any ancestor that is 'x'. 
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
relativePathStatus	TokenNameIdentifier	 relative Path Status
=	TokenNameEQUAL	
RELATIVE_PATH_REQUIRED	TokenNameIdentifier	 RELATIVE  PATH  REQUIRED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ROOT	TokenNameIdentifier	 FROM  ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
relativePathStatus	TokenNameIdentifier	 relative Path Status
=	TokenNameEQUAL	
RELATIVE_PATH_PERMITTED	TokenNameIdentifier	 RELATIVE  PATH  PERMITTED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
NODETYPE_ROOT	TokenNameIdentifier	 NODETYPE  ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
relativePathStatus	TokenNameIdentifier	 relative Path Status
=	TokenNameEQUAL	
RELATIVE_PATH_REQUIRED	TokenNameIdentifier	 RELATIVE  PATH  REQUIRED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
relativePathStatus	TokenNameIdentifier	 relative Path Status
!=	TokenNameNOT_EQUAL	
RELATIVE_PATH_NOT_PERMITTED	TokenNameIdentifier	 RELATIVE  PATH  NOT  PERMITTED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_token	TokenNameIdentifier	 m token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RelativePathPattern	TokenNameIdentifier	 Relative Path Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
relativePathStatus	TokenNameIdentifier	 relative Path Status
==	TokenNameEQUAL_EQUAL	
RELATIVE_PATH_REQUIRED	TokenNameIdentifier	 RELATIVE  PATH  REQUIRED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "A relative path pattern was expected." 	TokenNameCOMMENT_LINE	"A relative path pattern was expected." 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_REL_PATH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  REL  PATH  PATTERN
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Terminate for safety. 	TokenNameCOMMENT_LINE	Terminate for safety. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * IdKeyPattern ::= 'id' '(' Literal ')' * | 'key' '(' Literal ',' Literal ')' * (Also handle doc()) * * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * IdKeyPattern ::= 'id' '(' Literal ')' | 'key' '(' Literal ',' Literal ')' (Also handle doc()) * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
IdKeyPattern	TokenNameIdentifier	 Id Key Pattern
(	TokenNameLPAREN	
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
FunctionCall	TokenNameIdentifier	 Function Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * RelativePathPattern ::= StepPattern * | RelativePathPattern '/' StepPattern * | RelativePathPattern '//' StepPattern * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * RelativePathPattern ::= StepPattern | RelativePathPattern '/' StepPattern | RelativePathPattern '//' StepPattern * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
RelativePathPattern	TokenNameIdentifier	 Relative Path Pattern
(	TokenNameLPAREN	
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
// Caller will have consumed any '/' or '//' preceding the 	TokenNameCOMMENT_LINE	Caller will have consumed any '/' or '//' preceding the 
// RelativePathPattern, so let StepPattern know it can't begin with a '/' 	TokenNameCOMMENT_LINE	RelativePathPattern, so let StepPattern know it can't begin with a '/' 
boolean	TokenNameboolean	
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
=	TokenNameEQUAL	
StepPattern	TokenNameIdentifier	 Step Pattern
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// StepPattern() may consume first slash of pair in "a//b" while 	TokenNameCOMMENT_LINE	StepPattern() may consume first slash of pair in "a//b" while 
// processing StepPattern "a". On next iteration, let StepPattern know 	TokenNameCOMMENT_LINE	processing StepPattern "a". On next iteration, let StepPattern know 
// that happened, so it doesn't match ill-formed patterns like "a///b". 	TokenNameCOMMENT_LINE	that happened, so it doesn't match ill-formed patterns like "a///b". 
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
=	TokenNameEQUAL	
StepPattern	TokenNameIdentifier	 Step Pattern
(	TokenNameLPAREN	
!	TokenNameNOT	
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * StepPattern ::= AbbreviatedNodeTestStep * * @param isLeadingSlashPermitted a boolean indicating whether a slash can * appear at the start of this step * * @return boolean indicating whether a slash following the step was consumed * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * StepPattern ::= AbbreviatedNodeTestStep * @param isLeadingSlashPermitted a boolean indicating whether a slash can appear at the start of this step * @return boolean indicating whether a slash following the step was consumed * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
boolean	TokenNameboolean	
StepPattern	TokenNameIdentifier	 Step Pattern
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isLeadingSlashPermitted	TokenNameIdentifier	 is Leading Slash Permitted
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
AbbreviatedNodeTestStep	TokenNameIdentifier	 Abbreviated Node Test Step
(	TokenNameLPAREN	
isLeadingSlashPermitted	TokenNameIdentifier	 is Leading Slash Permitted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * AbbreviatedNodeTestStep ::= '@'? NodeTest Predicate * * @param isLeadingSlashPermitted a boolean indicating whether a slash can * appear at the start of this step * * @return boolean indicating whether a slash following the step was consumed * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 * AbbreviatedNodeTestStep ::= '@'? NodeTest Predicate * @param isLeadingSlashPermitted a boolean indicating whether a slash can appear at the start of this step * @return boolean indicating whether a slash following the step was consumed * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
boolean	TokenNameboolean	
AbbreviatedNodeTestStep	TokenNameIdentifier	 Abbreviated Node Test Step
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isLeadingSlashPermitted	TokenNameIdentifier	 is Leading Slash Permitted
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
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
axesType	TokenNameIdentifier	 axes Type
;	TokenNameSEMICOLON	
// The next blocks guarantee that a MATCH_XXX will be added. 	TokenNameCOMMENT_LINE	The next blocks guarantee that a MATCH_XXX will be added. 
int	TokenNameint	
matchTypePos	TokenNameIdentifier	 match Type Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_ATTRIBUTE	TokenNameIdentifier	 MATCH  ATTRIBUTE
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
"::"	TokenNameStringLiteral	::
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"attribute"	TokenNameStringLiteral	attribute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_ATTRIBUTE	TokenNameIdentifier	 MATCH  ATTRIBUTE
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
"child"	TokenNameStringLiteral	child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchTypePos	TokenNameIdentifier	 match Type Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_IMMEDIATE_ANCESTOR	TokenNameIdentifier	 MATCH  IMMEDIATE  ANCESTOR
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_AXES_NOT_ALLOWED	TokenNameIdentifier	 ER  AXES  NOT  ALLOWED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_token	TokenNameIdentifier	 m token
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLeadingSlashPermitted	TokenNameIdentifier	 is Leading Slash Permitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "A step was expected in the pattern, but '/' was encountered." 	TokenNameCOMMENT_LINE	"A step was expected in the pattern, but '/' was encountered." 
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_EXPECTED_STEP_PATTERN	TokenNameIdentifier	 ER  EXPECTED  STEP  PATTERN
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_ANY_ANCESTOR	TokenNameIdentifier	 MATCH  ANY  ANCESTOR
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
matchTypePos	TokenNameIdentifier	 match Type Pos
=	TokenNameEQUAL	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
axesType	TokenNameIdentifier	 axes Type
=	TokenNameEQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_IMMEDIATE_ANCESTOR	TokenNameIdentifier	 MATCH  IMMEDIATE  ANCESTOR
;	TokenNameSEMICOLON	
appendOp	TokenNameIdentifier	 append Op
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make room for telling how long the step is without the predicate 	TokenNameCOMMENT_LINE	Make room for telling how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
axesType	TokenNameIdentifier	 axes Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell how long the step is without the predicate 	TokenNameCOMMENT_LINE	Tell how long the step is without the predicate 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
;	TokenNameSEMICOLON	
// For "a//b", where "a" is current step, we need to mark operation of 	TokenNameCOMMENT_LINE	For "a//b", where "a" is current step, we need to mark operation of 
// current step as "MATCH_ANY_ANCESTOR". Then we'll consume the first 	TokenNameCOMMENT_LINE	current step as "MATCH_ANY_ANCESTOR". Then we'll consume the first 
// slash and subsequent step will be treated as a MATCH_IMMEDIATE_ANCESTOR 	TokenNameCOMMENT_LINE	slash and subsequent step will be treated as a MATCH_IMMEDIATE_ANCESTOR 
// (unless it too is followed by '//'.) 	TokenNameCOMMENT_LINE	(unless it too is followed by '//'.) 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% Following is what happens today, but I'm not sure that's 	TokenNameCOMMENT_LINE	%REVIEW% Following is what happens today, but I'm not sure that's 
// %REVIEW% correct behaviour. Perhaps no valid case could be constructed 	TokenNameCOMMENT_LINE	%REVIEW% correct behaviour. Perhaps no valid case could be constructed 
// %REVIEW% where it would matter? 	TokenNameCOMMENT_LINE	%REVIEW% where it would matter? 
// 	TokenNameCOMMENT_LINE	 
// If current step is on the attribute axis (e.g., "@x//b"), we won't 	TokenNameCOMMENT_LINE	If current step is on the attribute axis (e.g., "@x//b"), we won't 
// change the current step, and let following step be marked as 	TokenNameCOMMENT_LINE	change the current step, and let following step be marked as 
// MATCH_ANY_ANCESTOR on next call instead. 	TokenNameCOMMENT_LINE	MATCH_ANY_ANCESTOR on next call instead. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
matchTypePos	TokenNameIdentifier	 match Type Pos
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tokenIs	TokenNameIdentifier	 token Is
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lookahead	TokenNameIdentifier	 lookahead
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
matchTypePos	TokenNameIdentifier	 match Type Pos
,	TokenNameCOMMA	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
MATCH_ANY_ANCESTOR	TokenNameIdentifier	 MATCH  ANY  ANCESTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Tell how long the entire step is. 	TokenNameCOMMENT_LINE	Tell how long the entire step is. 
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
setOp	TokenNameIdentifier	 set Op
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
,	TokenNameCOMMA	
m_ops	TokenNameIdentifier	 m ops
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
MAPINDEX_LENGTH	TokenNameIdentifier	 MAPINDEX  LENGTH
)	TokenNameRPAREN	
-	TokenNameMINUS	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
trailingSlashConsumed	TokenNameIdentifier	 trailing Slash Consumed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
