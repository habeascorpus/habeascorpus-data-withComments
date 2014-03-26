/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemAttribute.java 469304 2006-10-30 22:29:47Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemAttribute.java 469304 2006-10-30 22:29:47Z minchau $ 
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
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
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
XML11Char	TokenNameIdentifier	 XM L11 Char
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
/** * Implement xsl:attribute. * <pre> * &amp;!ELEMENT xsl:attribute %char-template;> * &amp;!ATTLIST xsl:attribute * name %avt; #REQUIRED * namespace %avt; #IMPLIED * %space-att; * &amp; * </pre> * @see <a href="http://www.w3.org/TR/xslt#creating-attributes">creating-attributes in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:attribute. <pre> &amp;!ELEMENT xsl:attribute %char-template;> &amp;!ATTLIST xsl:attribute name %avt; #REQUIRED namespace %avt; #IMPLIED %space-att; &amp; </pre> @see <a href="http://www.w3.org/TR/xslt#creating-attributes">creating-attributes in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemAttribute	TokenNameIdentifier	 Elem Attribute
extends	TokenNameextends	
ElemElement	TokenNameIdentifier	 Elem Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8817220961566919187L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
ELEMNAME_ATTRIBUTE	TokenNameIdentifier	 ELEMNAME  ATTRIBUTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The element name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The element name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_ATTRIBUTE_STRING	TokenNameIdentifier	 ELEMNAME  ATTRIBUTE  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an attribute in the result tree. * @see <a href="http://www.w3.org/TR/xslt#creating-attributes">creating-attributes in XSLT Specification</a> * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Create an attribute in the result tree. @see <a href="http://www.w3.org/TR/xslt#creating-attributes">creating-attributes in XSLT Specification</a> * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
// public void execute( 	TokenNameCOMMENT_LINE	public void execute( 
// TransformerImpl transformer) 	TokenNameCOMMENT_LINE	TransformerImpl transformer) 
// throws TransformerException 	TokenNameCOMMENT_LINE	throws TransformerException 
// { 	TokenNameCOMMENT_LINE	{ 
//SerializationHandler rhandler = transformer.getSerializationHandler(); 	TokenNameCOMMENT_LINE	SerializationHandler rhandler = transformer.getSerializationHandler(); 
// If they are trying to add an attribute when there isn't an 	TokenNameCOMMENT_LINE	If they are trying to add an attribute when there isn't an 
// element pending, it is an error. 	TokenNameCOMMENT_LINE	element pending, it is an error. 
// I don't think we need this check here because it is checked in 	TokenNameCOMMENT_LINE	I don't think we need this check here because it is checked in 
// ResultTreeHandler.addAttribute. (is) 	TokenNameCOMMENT_LINE	ResultTreeHandler.addAttribute. (is) 
// if (!rhandler.isElementPending()) 	TokenNameCOMMENT_LINE	if (!rhandler.isElementPending()) 
// { 	TokenNameCOMMENT_LINE	{ 
// // Make sure the trace event is sent. 	TokenNameCOMMENT_LINE	// Make sure the trace event is sent. 
// if (TransformerImpl.S_DEBUG) 	TokenNameCOMMENT_LINE	if (TransformerImpl.S_DEBUG) 
// transformer.getTraceManager().fireTraceEvent(this); 	TokenNameCOMMENT_LINE	transformer.getTraceManager().fireTraceEvent(this); 
// 	TokenNameCOMMENT_LINE	 
// XPathContext xctxt = transformer.getXPathContext(); 	TokenNameCOMMENT_LINE	XPathContext xctxt = transformer.getXPathContext(); 
// int sourceNode = xctxt.getCurrentNode(); 	TokenNameCOMMENT_LINE	int sourceNode = xctxt.getCurrentNode(); 
// String attrName = m_name_avt.evaluate(xctxt, sourceNode, this); 	TokenNameCOMMENT_LINE	String attrName = m_name_avt.evaluate(xctxt, sourceNode, this); 
// transformer.getMsgMgr().warn(this, 	TokenNameCOMMENT_LINE	transformer.getMsgMgr().warn(this, 
// XSLTErrorResources.WG_ILLEGAL_ATTRIBUTE_POSITION, 	TokenNameCOMMENT_LINE	XSLTErrorResources.WG_ILLEGAL_ATTRIBUTE_POSITION, 
// new Object[]{ attrName }); 	TokenNameCOMMENT_LINE	new Object[]{ attrName }); 
// 	TokenNameCOMMENT_LINE	 
// if (TransformerImpl.S_DEBUG) 	TokenNameCOMMENT_LINE	if (TransformerImpl.S_DEBUG) 
// transformer.getTraceManager().fireTraceEndEvent(this); 	TokenNameCOMMENT_LINE	transformer.getTraceManager().fireTraceEndEvent(this); 
// return; 	TokenNameCOMMENT_LINE	return; 
// 	TokenNameCOMMENT_LINE	 
// // warn(templateChild, sourceNode, "Trying to add attribute after element child has been added, ignoring..."); 	TokenNameCOMMENT_LINE	// warn(templateChild, sourceNode, "Trying to add attribute after element child has been added, ignoring..."); 
// } 	TokenNameCOMMENT_LINE	} 
// super.execute(transformer); 	TokenNameCOMMENT_LINE	super.execute(transformer); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Resolve the namespace into a prefix. At this level, if no prefix exists, * then return a manufactured prefix. * * @param rhandler The current result tree handler. * @param prefix The probable prefix if already known. * @param nodeNamespace The namespace, which should not be null. * * @return The prefix to be used. */	TokenNameCOMMENT_JAVADOC	 Resolve the namespace into a prefix. At this level, if no prefix exists, then return a manufactured prefix. * @param rhandler The current result tree handler. @param prefix The probable prefix if already known. @param nodeNamespace The namespace, which should not be null. * @return The prefix to be used. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
resolvePrefix	TokenNameIdentifier	 resolve Prefix
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rhandler	TokenNameIdentifier	 rhandler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nodeNamespace	TokenNameIdentifier	 node Namespace
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we can't use default namespace, in this case we try and 	TokenNameCOMMENT_LINE	Since we can't use default namespace, in this case we try and 
// see if a prefix has already been defined or this namespace. 	TokenNameCOMMENT_LINE	see if a prefix has already been defined or this namespace. 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
nodeNamespace	TokenNameIdentifier	 node Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("nsPrefix: "+nsPrefix); 	TokenNameCOMMENT_LINE	System.out.println("nsPrefix: "+nsPrefix); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeNamespace	TokenNameIdentifier	 node Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
prefixMapping	TokenNameIdentifier	 prefix Mapping
=	TokenNameEQUAL	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefixMapping	TokenNameIdentifier	 prefix Mapping
.	TokenNameDOT	
generateNextPrefix	TokenNameIdentifier	 generate Next Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validate that the node name is good. * * @param nodeName Name of the node being constructed, which may be null. * * @return true if the node name is valid, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Validate that the node name is good. * @param nodeName Name of the node being constructed, which may be null. * @return true if the node name is valid, false otherwise. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
validateNodeName	TokenNameIdentifier	 validate Node Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidQName	TokenNameIdentifier	 is XM L11 Valid Q Name
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a node in the result tree. This method is overloaded by * xsl:attribute. At this class level, this method creates an element. * * @param nodeName The name of the node, which may be null. * @param prefix The prefix for the namespace, which may be null. * @param nodeNamespace The namespace of the node, which may be null. * @param transformer non-null reference to the the current transform-time state. * @param sourceNode non-null reference to the <a href="http://www.w3.org/TR/xslt#dt-current-node">current source node</a>. * @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Construct a node in the result tree. This method is overloaded by xsl:attribute. At this class level, this method creates an element. * @param nodeName The name of the node, which may be null. @param prefix The prefix for the namespace, which may be null. @param nodeNamespace The namespace of the node, which may be null. @param transformer non-null reference to the the current transform-time state. @param sourceNode non-null reference to the <a href="http://www.w3.org/TR/xslt#dt-current-node">current source node</a>. @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. * @throws TransformerException 
void	TokenNamevoid	
constructNode	TokenNameIdentifier	 construct Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nodeNamespace	TokenNameIdentifier	 node Namespace
,	TokenNameCOMMA	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nodeName	TokenNameIdentifier	 node Name
&&	TokenNameAND_AND	
nodeName	TokenNameIdentifier	 node Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rhandler	TokenNameIdentifier	 rhandler
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Evaluate the value of this attribute 	TokenNameCOMMENT_LINE	Evaluate the value of this attribute 
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transformToString	TokenNameIdentifier	 transform To String
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Let the result tree handler add the attribute and its String value. 	TokenNameCOMMENT_LINE	Let the result tree handler add the attribute and its String value. 
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
nodeNamespace	TokenNameIdentifier	 node Namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a child to the child list. * <!ELEMENT xsl:attribute %char-template;> * <!ATTLIST xsl:attribute * name %avt; #REQUIRED * namespace %avt; #IMPLIED * %space-att; * > * * @param newChild Child to append to the list of this node's children * * @return The node we just appended to the children list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. <!ELEMENT xsl:attribute %char-template;> <!ATTLIST xsl:attribute name %avt; #REQUIRED namespace %avt; #IMPLIED %space-att; > * @param newChild Child to append to the list of this node's children * @return The node we just appended to the children list * @throws DOMException 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// char-instructions 	TokenNameCOMMENT_LINE	char-instructions 
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_TEMPLATES	TokenNameIdentifier	 ELEMNAME  APPLY  TEMPLATES
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_IMPORTS	TokenNameIdentifier	 ELEMNAME  APPLY  IMPORTS
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VALUEOF	TokenNameIdentifier	 ELEMNAME  VALUEOF
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_COPY_OF	TokenNameIdentifier	 ELEMNAME  COPY  OF
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_NUMBER	TokenNameIdentifier	 ELEMNAME  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CHOOSE	TokenNameIdentifier	 ELEMNAME  CHOOSE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_IF	TokenNameIdentifier	 ELEMNAME  IF
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXT	TokenNameIdentifier	 ELEMNAME  TEXT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_COPY	TokenNameIdentifier	 ELEMNAME  COPY
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VARIABLE	TokenNameIdentifier	 ELEMNAME  VARIABLE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_MESSAGE	TokenNameIdentifier	 ELEMNAME  MESSAGE
:	TokenNameCOLON	
// instructions 	TokenNameCOMMENT_LINE	instructions 
// case Constants.ELEMNAME_PI: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_PI: 
// case Constants.ELEMNAME_COMMENT: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_COMMENT: 
// case Constants.ELEMNAME_ELEMENT: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_ELEMENT: 
// case Constants.ELEMNAME_ATTRIBUTE: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_ATTRIBUTE: 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
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
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ElemElement#setName(AVT) */	TokenNameCOMMENT_JAVADOC	 @see ElemElement#setName(AVT) 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getSimpleString	TokenNameIdentifier	 get Simple String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
