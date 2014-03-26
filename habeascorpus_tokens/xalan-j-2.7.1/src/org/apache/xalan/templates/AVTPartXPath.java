/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AVTPartXPath.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AVTPartXPath.java 468643 2006-10-28 06:56:03Z minchau $ 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
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
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFactory	TokenNameIdentifier	 X Path Factory
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * Simple string part of a complex AVT. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Simple string part of a complex AVT. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
AVTPartXPath	TokenNameIdentifier	 AVT Part X Path
extends	TokenNameextends	
AVTPart	TokenNameIdentifier	 AVT Part
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4460373807550527675L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The XPath object contained in this part. * @serial */	TokenNameCOMMENT_JAVADOC	 The XPath object contained in this part. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_xpath	TokenNameIdentifier	 m xpath
;	TokenNameSEMICOLON	
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
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a simple AVT part. * * @param xpath Xpath section of AVT */	TokenNameCOMMENT_JAVADOC	 Construct a simple AVT part. * @param xpath Xpath section of AVT 
public	TokenNamepublic	
AVTPartXPath	TokenNameIdentifier	 AVT Part X Path
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a simple AVT part. * * @param val A pure string section of an AVT. * @param nsNode An object which can be used to determine the * Namespace Name (URI) for any Namespace prefix used in the XPath. * Usually this is based on the context where the XPath was specified, * such as a node within a Stylesheet. * @param xpathProcessor XPath parser * @param factory XPath factory * @param liaison An XPathContext object, providing infomation specific * to this invocation and this thread. Maintains SAX output state, * variables, error handler and so on, so the transformation/XPath * object itself can be simultaneously invoked from multiple threads. * * @throws javax.xml.transform.TransformerException * TODO: Fix or remove this unused c'tor. */	TokenNameCOMMENT_JAVADOC	 Construct a simple AVT part. * @param val A pure string section of an AVT. @param nsNode An object which can be used to determine the Namespace Name (URI) for any Namespace prefix used in the XPath. Usually this is based on the context where the XPath was specified, such as a node within a Stylesheet. @param xpathProcessor XPath parser @param factory XPath factory @param liaison An XPathContext object, providing infomation specific to this invocation and this thread. Maintains SAX output state, variables, error handler and so on, so the transformation/XPath object itself can be simultaneously invoked from multiple threads. * @throws javax.xml.transform.TransformerException TODO: Fix or remove this unused c'tor. 
public	TokenNamepublic	
AVTPartXPath	TokenNameIdentifier	 AVT Part X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nsNode	TokenNameIdentifier	 ns Node
,	TokenNameCOMMA	
XPathParser	TokenNameIdentifier	 X Path Parser
xpathProcessor	TokenNameIdentifier	 xpath Processor
,	TokenNameCOMMA	
XPathFactory	TokenNameIdentifier	 X Path Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
liaison	TokenNameIdentifier	 liaison
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
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
nsNode	TokenNameIdentifier	 ns Node
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the AVT part as the original string. * * @return the AVT part as the original string. */	TokenNameCOMMENT_JAVADOC	 Get the AVT part as the original string. * @return the AVT part as the original string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSimpleString	TokenNameIdentifier	 get Simple String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the value into the buffer. * * @param xctxt An XPathContext object, providing infomation specific * to this invocation and this thread. Maintains SAX state, variables, * error handler and so on, so the transformation/XPath object itself * can be simultaneously invoked from multiple threads. * @param buf Buffer to write into. * @param context The current source tree context. * @param nsNode The current namespace context (stylesheet tree context). * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Write the value into the buffer. * @param xctxt An XPathContext object, providing infomation specific to this invocation and this thread. Maintains SAX state, variables, error handler and so on, so the transformation/XPath object itself can be simultaneously invoked from multiple threads. @param buf Buffer to write into. @param context The current source tree context. @param nsNode The current namespace context (stylesheet tree context). * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nsNode	TokenNameIdentifier	 ns Node
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
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
nsNode	TokenNameIdentifier	 ns Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
appendToFsb	TokenNameIdentifier	 append To Fsb
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see XSLTVisitable#callVisitors(XSLTVisitor) */	TokenNameCOMMENT_JAVADOC	 @see XSLTVisitable#callVisitors(XSLTVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
m_xpath	TokenNameIdentifier	 m xpath
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
