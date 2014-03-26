/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemValueOf.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemValueOf.java 468643 2006-10-28 06:56:03Z minchau $ 
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Implement xsl:value-of. * <pre> * <!ELEMENT xsl:value-of EMPTY> * <!ATTLIST xsl:value-of * select %expr; #REQUIRED * disable-output-escaping (yes|no) "no" * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#value-of">value-of in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:value-of. <pre> <!ELEMENT xsl:value-of EMPTY> <!ATTLIST xsl:value-of select %expr; #REQUIRED disable-output-escaping (yes|no) "no" > </pre> @see <a href="http://www.w3.org/TR/xslt#value-of">value-of in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemValueOf	TokenNameIdentifier	 Elem Value Of
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3490728458007586786L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The select expression to be executed. * @serial */	TokenNameCOMMENT_JAVADOC	 The select expression to be executed. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * True if the pattern is a simple ".". * @serial */	TokenNameCOMMENT_JAVADOC	 True if the pattern is a simple ".". @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isDot	TokenNameIdentifier	 m is Dot
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the "select" attribute. * The required select attribute is an expression; this expression * is evaluated and the resulting object is converted to a * string as if by a call to the string function. * * @param v The value to set for the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "select" attribute. The required select attribute is an expression; this expression is evaluated and the resulting object is converted to a string as if by a call to the string function. * @param v The value to set for the "select" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setSelect	TokenNameIdentifier	 set Select
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isDot	TokenNameIdentifier	 m is Dot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "select" attribute. * The required select attribute is an expression; this expression * is evaluated and the resulting object is converted to a * string as if by a call to the string function. * * @return The value of the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "select" attribute. The required select attribute is an expression; this expression is evaluated and the resulting object is converted to a string as if by a call to the string function. * @return The value of the "select" attribute. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_selectExpression	TokenNameIdentifier	 m select Expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this element should disable escaping. * @serial */	TokenNameCOMMENT_JAVADOC	 Tells if this element should disable escaping. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the "disable-output-escaping" attribute. * Normally, the xml output method escapes & and < (and * possibly other characters) when outputting text nodes. * This ensures that the output is well-formed XML. However, * it is sometimes convenient to be able to produce output * that is almost, but not quite well-formed XML; for * example, the output may include ill-formed sections * which are intended to be transformed into well-formed * XML by a subsequent non-XML aware process. For this reason, * XSLT provides a mechanism for disabling output escaping. * An xsl:value-of or xsl:text element may have a * disable-output-escaping attribute; the allowed values * are yes or no; the default is no; if the value is yes, * then a text node generated by instantiating the xsl:value-of * or xsl:text element should be output without any escaping. * @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * * @param v The value to set for the "disable-output-escaping" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "disable-output-escaping" attribute. Normally, the xml output method escapes & and < (and possibly other characters) when outputting text nodes. This ensures that the output is well-formed XML. However, it is sometimes convenient to be able to produce output that is almost, but not quite well-formed XML; for example, the output may include ill-formed sections which are intended to be transformed into well-formed XML by a subsequent non-XML aware process. For this reason, XSLT provides a mechanism for disabling output escaping. An xsl:value-of or xsl:text element may have a disable-output-escaping attribute; the allowed values are yes or no; the default is no; if the value is yes, then a text node generated by instantiating the xsl:value-of or xsl:text element should be output without any escaping. @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * @param v The value to set for the "disable-output-escaping" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setDisableOutputEscaping	TokenNameIdentifier	 set Disable Output Escaping
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "disable-output-escaping" attribute. * Normally, the xml output method escapes & and < (and * possibly other characters) when outputting text nodes. * This ensures that the output is well-formed XML. However, * it is sometimes convenient to be able to produce output * that is almost, but not quite well-formed XML; for * example, the output may include ill-formed sections * which are intended to be transformed into well-formed * XML by a subsequent non-XML aware process. For this reason, * XSLT provides a mechanism for disabling output escaping. * An xsl:value-of or xsl:text element may have a * disable-output-escaping attribute; the allowed values * are yes or no; the default is no; if the value is yes, * then a text node generated by instantiating the xsl:value-of * or xsl:text element should be output without any escaping. * @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * * @return The value of the "disable-output-escaping" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "disable-output-escaping" attribute. Normally, the xml output method escapes & and < (and possibly other characters) when outputting text nodes. This ensures that the output is well-formed XML. However, it is sometimes convenient to be able to produce output that is almost, but not quite well-formed XML; for example, the output may include ill-formed sections which are intended to be transformed into well-formed XML by a subsequent non-XML aware process. For this reason, XSLT provides a mechanism for disabling output escaping. An xsl:value-of or xsl:text element may have a disable-output-escaping attribute; the allowed values are yes or no; the default is no; if the value is yes, then a text node generated by instantiating the xsl:value-of or xsl:text element should be output without any escaping. @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * @return The value of the "disable-output-escaping" attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDisableOutputEscaping	TokenNameIdentifier	 get Disable Output Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an integer representation of the element type. * * @return An integer representation of the element, defined in the * Constants class. * @see org.apache.xalan.templates.Constants */	TokenNameCOMMENT_JAVADOC	 Get an integer representation of the element type. * @return An integer representation of the element, defined in the Constants class. @see org.apache.xalan.templates.Constants 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VALUEOF	TokenNameIdentifier	 ELEMNAME  VALUEOF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. * * NEEDSDOC @param sroot * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. * NEEDSDOC @param sroot * @throws TransformerException 
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
m_selectExpression	TokenNameIdentifier	 m select Expression
)	TokenNameRPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
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
/** * Return the node name. * * @return The node name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The node name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VALUEOF_STRING	TokenNameIdentifier	 ELEMNAME  VALUEOF  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the string expression and copy the text to the * result tree. * The required select attribute is an expression; this expression * is evaluated and the resulting object is converted to a string * as if by a call to the string function. The string specifies * the string-value of the created text node. If the string is * empty, no text node will be created. The created text node will * be merged with any adjacent text nodes. * @see <a href="http://www.w3.org/TR/xslt#value-of">value-of in XSLT Specification</a> * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the string expression and copy the text to the result tree. The required select attribute is an expression; this expression is evaluated and the resulting object is converted to a string as if by a call to the string function. The string specifies the string-value of the created text node. If the string is empty, no text node will be created. The created text node will be merged with any adjacent text nodes. @see <a href="http://www.w3.org/TR/xslt#value-of">value-of in XSLT Specification</a> * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rth	TokenNameIdentifier	 rth
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
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
try	TokenNametry	
{	TokenNameLBRACE	
// Optimize for "." 	TokenNameCOMMENT_LINE	Optimize for "." 
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
&&	TokenNameAND_AND	
m_isDot	TokenNameIdentifier	 m is Dot
&&	TokenNameAND_AND	
!	TokenNameNOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
)	TokenNameRPAREN	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  DISABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
)	TokenNameRPAREN	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_ENABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  ENABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContext	TokenNameIdentifier	 push Namespace Context
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
)	TokenNameRPAREN	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  DISABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
m_selectExpression	TokenNameIdentifier	 m select Expression
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
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
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
m_selectExpression	TokenNameIdentifier	 m select Expression
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
rth	TokenNameIdentifier	 rth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
executeCharsToContentHandler	TokenNameIdentifier	 execute Chars To Content Handler
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
rth	TokenNameIdentifier	 rth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
)	TokenNameRPAREN	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_ENABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  ENABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a child to the child list. * * @param newChild Child to add to children list * * @return Child just added to children list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. * @param newChild Child to add to children list * @return Child just added to children list * @throws DOMException 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not add " +((ElemTemplateElement)newChild).m_elemName + 	TokenNameCOMMENT_LINE	"Can not add " +((ElemTemplateElement)newChild).m_elemName + 
//" to " + this.m_elemName); 	TokenNameCOMMENT_LINE	" to " + this.m_elemName); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
m_selectExpression	TokenNameIdentifier	 m select Expression
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
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
