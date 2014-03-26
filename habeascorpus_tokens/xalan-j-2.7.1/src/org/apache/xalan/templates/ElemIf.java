/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemIf.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemIf.java 468643 2006-10-28 06:56:03Z minchau $ 
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
TransformerException	TokenNameIdentifier	 Transformer Exception
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * Implement xsl:if. * <pre> * <!ELEMENT xsl:if %template;> * <!ATTLIST xsl:if * test %expr; #REQUIRED * %space-att; * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Conditional-Processing-with-xsl:if">XXX in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:if. <pre> <!ELEMENT xsl:if %template;> <!ATTLIST xsl:if test %expr; #REQUIRED %space-att; > </pre> @see <a href="http://www.w3.org/TR/xslt#section-Conditional-Processing-with-xsl:if">XXX in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemIf	TokenNameIdentifier	 Elem If
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2158774632427453022L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The xsl:if element must have a test attribute, which specifies an expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The xsl:if element must have a test attribute, which specifies an expression. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_test	TokenNameIdentifier	 m test
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "test" attribute. * The xsl:if element must have a test attribute, which specifies an expression. * * @param v test attribute to set */	TokenNameCOMMENT_JAVADOC	 Set the "test" attribute. The xsl:if element must have a test attribute, which specifies an expression. * @param v test attribute to set 
public	TokenNamepublic	
void	TokenNamevoid	
setTest	TokenNameIdentifier	 set Test
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_test	TokenNameIdentifier	 m test
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "test" attribute. * The xsl:if element must have a test attribute, which specifies an expression. * * @return the "test" attribute for this element. */	TokenNameCOMMENT_JAVADOC	 Get the "test" attribute. The xsl:if element must have a test attribute, which specifies an expression. * @return the "test" attribute for this element. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_test	TokenNameIdentifier	 m test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. * * @param sroot The root stylesheet. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. * @param sroot The root stylesheet. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vnames	TokenNameIdentifier	 vnames
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVariableNames	TokenNameIdentifier	 get Variable Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_test	TokenNameIdentifier	 m test
)	TokenNameRPAREN	
m_test	TokenNameIdentifier	 m test
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vnames	TokenNameIdentifier	 vnames
,	TokenNameCOMMA	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for this element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for this element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_IF	TokenNameIdentifier	 ELEMNAME  IF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return the element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return the element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_IF_STRING	TokenNameIdentifier	 ELEMNAME  IF  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Conditionally execute a sub-template. * The expression is evaluated and the resulting object is converted * to a boolean as if by a call to the boolean function. If the result * is true, then the content template is instantiated; otherwise, nothing * is created. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Conditionally execute a sub-template. The expression is evaluated and the resulting object is converted to a boolean as if by a call to the boolean function. If the result is true, then the content template is instantiated; otherwise, nothing is created. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
m_test	TokenNameIdentifier	 m test
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
m_test	TokenNameIdentifier	 m test
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// xsl:for-each now fires one trace event + one for every 	TokenNameCOMMENT_LINE	xsl:for-each now fires one trace event + one for every 
// iteration; changing xsl:if to fire one regardless of true/false 	TokenNameCOMMENT_LINE	iteration; changing xsl:if to fire one regardless of true/false 
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// I don't think we want this. -sb 	TokenNameCOMMENT_LINE	I don't think we want this. -sb 
// if (transformer.getDebug()) 	TokenNameCOMMENT_LINE	if (transformer.getDebug()) 
// transformer.getTraceManager().fireSelectedEvent(sourceNode, this, 	TokenNameCOMMENT_LINE	transformer.getTraceManager().fireSelectedEvent(sourceNode, this, 
// "endTest", m_test, test); 	TokenNameCOMMENT_LINE	"endTest", m_test, test); 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_test	TokenNameIdentifier	 m test
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Call the children visitors. * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 Call the children visitors. @param visitor The visitor whose appropriate method will be called. 
protected	TokenNameprotected	
void	TokenNamevoid	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
,	TokenNameCOMMA	
boolean	TokenNameboolean	
callAttrs	TokenNameIdentifier	 call Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callAttrs	TokenNameIdentifier	 call Attrs
)	TokenNameRPAREN	
m_test	TokenNameIdentifier	 m test
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
m_test	TokenNameIdentifier	 m test
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
,	TokenNameCOMMA	
callAttrs	TokenNameIdentifier	 call Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
