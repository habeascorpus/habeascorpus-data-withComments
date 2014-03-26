/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemTextLiteral.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemTextLiteral.java 468643 2006-10-28 06:56:03Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
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
/** * Implement a text literal. * @see <a href="http://www.w3.org/TR/xslt#section-Creating-Text">section-Creating-Text in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement a text literal. @see <a href="http://www.w3.org/TR/xslt#section-Creating-Text">section-Creating-Text in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
7872620006767660088L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Tell if space should be preserved. * @serial */	TokenNameCOMMENT_JAVADOC	 Tell if space should be preserved. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_preserveSpace	TokenNameIdentifier	 m preserve Space
;	TokenNameSEMICOLON	
/** * Set whether or not space should be preserved. * * @param v Boolean flag indicating whether * or not space should be preserved */	TokenNameCOMMENT_JAVADOC	 Set whether or not space should be preserved. * @param v Boolean flag indicating whether or not space should be preserved 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveSpace	TokenNameIdentifier	 set Preserve Space
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_preserveSpace	TokenNameIdentifier	 m preserve Space
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether or not space should be preserved. * * @return Boolean flag indicating whether * or not space should be preserved */	TokenNameCOMMENT_JAVADOC	 Get whether or not space should be preserved. * @return Boolean flag indicating whether or not space should be preserved 
public	TokenNamepublic	
boolean	TokenNameboolean	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_preserveSpace	TokenNameIdentifier	 m preserve Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The character array. * @serial */	TokenNameCOMMENT_JAVADOC	 The character array. @serial 
private	TokenNameprivate	
char	TokenNamechar	
m_ch	TokenNameIdentifier	 m ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The character array as a string. * @serial */	TokenNameCOMMENT_JAVADOC	 The character array as a string. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_str	TokenNameIdentifier	 m str
;	TokenNameSEMICOLON	
/** * Set the characters that will be output to the result tree.. * * @param v Array of characters that will be output to the result tree */	TokenNameCOMMENT_JAVADOC	 Set the characters that will be output to the result tree.. * @param v Array of characters that will be output to the result tree 
public	TokenNamepublic	
void	TokenNamevoid	
setChars	TokenNameIdentifier	 set Chars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ch	TokenNameIdentifier	 m ch
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the characters that will be output to the result tree.. * * @return Array of characters that will be output to the result tree */	TokenNameCOMMENT_JAVADOC	 Get the characters that will be output to the result tree.. * @return Array of characters that will be output to the result tree 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_ch	TokenNameIdentifier	 m ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of the node as a string. * * @return null */	TokenNameCOMMENT_JAVADOC	 Get the value of the node as a string. * @return null 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_str	TokenNameIdentifier	 m str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_str	TokenNameIdentifier	 m str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
m_ch	TokenNameIdentifier	 m ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_str	TokenNameIdentifier	 m str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this element should disable escaping. * @serial */	TokenNameCOMMENT_JAVADOC	 Tells if this element should disable escaping. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the "disable-output-escaping" attribute. * Normally, the xml output method escapes & and < (and * possibly other characters) when outputting text nodes. * This ensures that the output is well-formed XML. However, * it is sometimes convenient to be able to produce output * that is almost, but not quite well-formed XML; for * example, the output may include ill-formed sections * which are intended to be transformed into well-formed * XML by a subsequent non-XML aware process. For this reason, * XSLT provides a mechanism for disabling output escaping. * An xsl:value-of or xsl:text element may have a * disable-output-escaping attribute; the allowed values * are yes or no; the default is no; if the value is yes, * then a text node generated by instantiating the xsl:value-of * or xsl:text element should be output without any escaping. * @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * * @param v Boolean value for "disable-output-escaping" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "disable-output-escaping" attribute. Normally, the xml output method escapes & and < (and possibly other characters) when outputting text nodes. This ensures that the output is well-formed XML. However, it is sometimes convenient to be able to produce output that is almost, but not quite well-formed XML; for example, the output may include ill-formed sections which are intended to be transformed into well-formed XML by a subsequent non-XML aware process. For this reason, XSLT provides a mechanism for disabling output escaping. An xsl:value-of or xsl:text element may have a disable-output-escaping attribute; the allowed values are yes or no; the default is no; if the value is yes, then a text node generated by instantiating the xsl:value-of or xsl:text element should be output without any escaping. @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * @param v Boolean value for "disable-output-escaping" attribute. 
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
/** * Get the "disable-output-escaping" attribute. * Normally, the xml output method escapes & and < (and * possibly other characters) when outputting text nodes. * This ensures that the output is well-formed XML. However, * it is sometimes convenient to be able to produce output * that is almost, but not quite well-formed XML; for * example, the output may include ill-formed sections * which are intended to be transformed into well-formed * XML by a subsequent non-XML aware process. For this reason, * XSLT provides a mechanism for disabling output escaping. * An xsl:value-of or xsl:text element may have a * disable-output-escaping attribute; the allowed values * are yes or no; the default is no; if the value is yes, * then a text node generated by instantiating the xsl:value-of * or xsl:text element should be output without any escaping. * @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * * @return Boolean value of "disable-output-escaping" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "disable-output-escaping" attribute. Normally, the xml output method escapes & and < (and possibly other characters) when outputting text nodes. This ensures that the output is well-formed XML. However, it is sometimes convenient to be able to produce output that is almost, but not quite well-formed XML; for example, the output may include ill-formed sections which are intended to be transformed into well-formed XML by a subsequent non-XML aware process. For this reason, XSLT provides a mechanism for disabling output escaping. An xsl:value-of or xsl:text element may have a disable-output-escaping attribute; the allowed values are yes or no; the default is no; if the value is yes, then a text node generated by instantiating the xsl:value-of or xsl:text element should be output without any escaping. @see <a href="http://www.w3.org/TR/xslt#disable-output-escaping">disable-output-escaping in XSLT Specification</a> * @return Boolean value of "disable-output-escaping" attribute. 
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
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#Text"	TokenNameStringLiteral	#Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the text literal to the result tree. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Copy the text literal to the result tree. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
try	TokenNametry	
{	TokenNameLBRACE	
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
{	TokenNameLBRACE	
// flush any pending cached processing before the trace event. 	TokenNameCOMMENT_LINE	flush any pending cached processing before the trace event. 
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
rth	TokenNameIdentifier	 rth
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
m_ch	TokenNameIdentifier	 m ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ch	TokenNameIdentifier	 m ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscaping	TokenNameIdentifier	 m disable Output Escaping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// flush any pending cached processing before sending the trace event 	TokenNameCOMMENT_LINE	flush any pending cached processing before sending the trace event 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
