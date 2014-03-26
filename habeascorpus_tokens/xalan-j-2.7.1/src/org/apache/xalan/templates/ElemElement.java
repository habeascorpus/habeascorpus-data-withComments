/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemElement.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemElement.java 468643 2006-10-28 06:56:03Z minchau $ 
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
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
/** * Implement xsl:element * <pre> * <!ELEMENT xsl:element %template;> * <!ATTLIST xsl:element * name %avt; #REQUIRED * namespace %avt; #IMPLIED * use-attribute-sets %qnames; #IMPLIED * %space-att; * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Creating-Elements-with-xsl:element">XXX in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:element <pre> <!ELEMENT xsl:element %template;> <!ATTLIST xsl:element name %avt; #REQUIRED namespace %avt; #IMPLIED use-attribute-sets %qnames; #IMPLIED %space-att; > </pre> @see <a href="http://www.w3.org/TR/xslt#section-Creating-Elements-with-xsl:element">XXX in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemElement	TokenNameIdentifier	 Elem Element
extends	TokenNameextends	
ElemUse	TokenNameIdentifier	 Elem Use
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
324619535592435183L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The name attribute is interpreted as an attribute value template. * It is an error if the string that results from instantiating the * attribute value template is not a QName. * @serial */	TokenNameCOMMENT_JAVADOC	 The name attribute is interpreted as an attribute value template. It is an error if the string that results from instantiating the attribute value template is not a QName. @serial 
protected	TokenNameprotected	
AVT	TokenNameIdentifier	 AVT
m_name_avt	TokenNameIdentifier	 m name avt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * The name attribute is interpreted as an attribute value template. * It is an error if the string that results from instantiating the * attribute value template is not a QName. * * @param v Name attribute to set for this element */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. The name attribute is interpreted as an attribute value template. It is an error if the string that results from instantiating the attribute value template is not a QName. * @param v Name attribute to set for this element 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name_avt	TokenNameIdentifier	 m name avt
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "name" attribute. * The name attribute is interpreted as an attribute value template. * It is an error if the string that results from instantiating the * attribute value template is not a QName. * * @return Name attribute for this element */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. The name attribute is interpreted as an attribute value template. It is an error if the string that results from instantiating the attribute value template is not a QName. * @return Name attribute for this element 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name_avt	TokenNameIdentifier	 m name avt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the namespace attribute is present, then it also is interpreted * as an attribute value template. The string that results from * instantiating the attribute value template should be a URI reference. * It is not an error if the string is not a syntactically legal URI reference. * @serial */	TokenNameCOMMENT_JAVADOC	 If the namespace attribute is present, then it also is interpreted as an attribute value template. The string that results from instantiating the attribute value template should be a URI reference. It is not an error if the string is not a syntactically legal URI reference. @serial 
protected	TokenNameprotected	
AVT	TokenNameIdentifier	 AVT
m_namespace_avt	TokenNameIdentifier	 m namespace avt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "namespace" attribute. * If the namespace attribute is present, then it also is interpreted * as an attribute value template. The string that results from * instantiating the attribute value template should be a URI reference. * It is not an error if the string is not a syntactically legal URI reference. * * @param v NameSpace attribute to set for this element */	TokenNameCOMMENT_JAVADOC	 Set the "namespace" attribute. If the namespace attribute is present, then it also is interpreted as an attribute value template. The string that results from instantiating the attribute value template should be a URI reference. It is not an error if the string is not a syntactically legal URI reference. * @param v NameSpace attribute to set for this element 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "namespace" attribute. * If the namespace attribute is present, then it also is interpreted * as an attribute value template. The string that results from * instantiating the attribute value template should be a URI reference. * It is not an error if the string is not a syntactically legal URI reference. * * @return Namespace attribute for this element */	TokenNameCOMMENT_JAVADOC	 Get the "namespace" attribute. If the namespace attribute is present, then it also is interpreted as an attribute value template. The string that results from instantiating the attribute value template should be a URI reference. It is not an error if the string is not a syntactically legal URI reference. * @return Namespace attribute for this element 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. 
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
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
.	TokenNameDOT	
ComposeState	TokenNameIdentifier	 Compose State
cstate	TokenNameIdentifier	 cstate
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vnames	TokenNameIdentifier	 vnames
=	TokenNameEQUAL	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getVariableNames	TokenNameIdentifier	 get Variable Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_name_avt	TokenNameIdentifier	 m name avt
)	TokenNameRPAREN	
m_name_avt	TokenNameIdentifier	 m name avt
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vnames	TokenNameIdentifier	 vnames
,	TokenNameCOMMA	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
)	TokenNameRPAREN	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vnames	TokenNameIdentifier	 vnames
,	TokenNameCOMMA	
cstate	TokenNameIdentifier	 cstate
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
ELEMNAME_ELEMENT	TokenNameIdentifier	 ELEMNAME  ELEMENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return This element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return This element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_ELEMENT_STRING	TokenNameIdentifier	 ELEMNAME  ELEMENT  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolve the namespace into a prefix. Meant to be * overidded by elemAttribute if this class is derived. * * @param rhandler The current result tree handler. * @param prefix The probable prefix if already known. * @param nodeNamespace The namespace. * * @return The prefix to be used. */	TokenNameCOMMENT_JAVADOC	 Resolve the namespace into a prefix. Meant to be overidded by elemAttribute if this class is derived. * @param rhandler The current result tree handler. @param prefix The probable prefix if already known. @param nodeNamespace The namespace. * @return The prefix to be used. 
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
// if (null != prefix && prefix.length() == 0) 	TokenNameCOMMENT_LINE	if (null != prefix && prefix.length() == 0) 
// { 	TokenNameCOMMENT_LINE	{ 
// String foundPrefix = rhandler.getPrefix(nodeNamespace); 	TokenNameCOMMENT_LINE	String foundPrefix = rhandler.getPrefix(nodeNamespace); 
// 	TokenNameCOMMENT_LINE	 
// // System.out.println("nsPrefix: "+nsPrefix); 	TokenNameCOMMENT_LINE	// System.out.println("nsPrefix: "+nsPrefix); 
// if (null == foundPrefix) 	TokenNameCOMMENT_LINE	if (null == foundPrefix) 
// foundPrefix = ""; 	TokenNameCOMMENT_LINE	foundPrefix = ""; 
// } 	TokenNameCOMMENT_LINE	} 
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an element in the result tree. * The xsl:element element allows an element to be created with a * computed name. The expanded-name of the element to be created * is specified by a required name attribute and an optional namespace * attribute. The content of the xsl:element element is a template * for the attributes and children of the created element. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Create an element in the result tree. The xsl:element element allows an element to be created with a computed name. The expanded-name of the element to be created is specified by a required name attribute and an optional namespace attribute. The content of the xsl:element element is a template for the attributes and children of the created element. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rhandler	TokenNameIdentifier	 rhandler
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
m_name_avt	TokenNameIdentifier	 m name avt
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
m_name_avt	TokenNameIdentifier	 m name avt
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeNamespace	TokenNameIdentifier	 node Namespace
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Only validate if an AVT was used. 	TokenNameCOMMENT_LINE	Only validate if an AVT was used. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_name_avt	TokenNameIdentifier	 m name avt
.	TokenNameDOT	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidQName	TokenNameIdentifier	 is XM L11 Valid Q Name
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_NAME	TokenNameIdentifier	 ATTRNAME  NAME
,	TokenNameCOMMA	
nodeName	TokenNameIdentifier	 node Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeNamespace	TokenNameIdentifier	 node Namespace
=	TokenNameEQUAL	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
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
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nodeNamespace	TokenNameIdentifier	 node Namespace
||	TokenNameOR_OR	
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
&&	TokenNameAND_AND	
nodeNamespace	TokenNameIdentifier	 node Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Determine the actual prefix that we will use for this nodeNamespace 	TokenNameCOMMENT_LINE	Determine the actual prefix that we will use for this nodeNamespace 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
resolvePrefix	TokenNameIdentifier	 resolve Prefix
(	TokenNameLPAREN	
rhandler	TokenNameIdentifier	 rhandler
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
nodeNamespace	TokenNameIdentifier	 node Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// No namespace attribute was supplied. Use the namespace declarations 	TokenNameCOMMENT_LINE	No namespace attribute was supplied. Use the namespace declarations 
// currently in effect for the xsl:element element. 	TokenNameCOMMENT_LINE	currently in effect for the xsl:element element. 
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Maybe temporary, until I get this worked out. test: axes59 	TokenNameCOMMENT_LINE	Maybe temporary, until I get this worked out. test: axes59 
nodeNamespace	TokenNameIdentifier	 node Namespace
=	TokenNameEQUAL	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we get back a null nodeNamespace, that means that this prefix could 	TokenNameCOMMENT_LINE	If we get back a null nodeNamespace, that means that this prefix could 
// not be found in the table. This is okay only for a default namespace 	TokenNameCOMMENT_LINE	not be found in the table. This is okay only for a default namespace 
// that has never been declared. 	TokenNameCOMMENT_LINE	that has never been declared. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nodeNamespace	TokenNameIdentifier	 node Namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
nodeNamespace	TokenNameIdentifier	 node Namespace
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nodeNamespace	TokenNameIdentifier	 node Namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
constructNode	TokenNameIdentifier	 construct Node
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
nodeNamespace	TokenNameIdentifier	 node Namespace
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
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
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a node in the result tree. This method is overloaded by * xsl:attribute. At this class level, this method creates an element. * If the node is null, we instantiate only the content of the node in accordance * with section 7.1.2 of the XSLT 1.0 Recommendation. * * @param nodeName The name of the node, which may be <code>null</code>. If <code>null</code>, * only the non-attribute children of this node will be processed. * @param prefix The prefix for the namespace, which may be <code>null</code>. * If not <code>null</code>, this prefix will be mapped and unmapped. * @param nodeNamespace The namespace of the node, which may be not be <code>null</code>. * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Construct a node in the result tree. This method is overloaded by xsl:attribute. At this class level, this method creates an element. If the node is null, we instantiate only the content of the node in accordance with section 7.1.2 of the XSLT 1.0 Recommendation. * @param nodeName The name of the node, which may be <code>null</code>. If <code>null</code>, only the non-attribute children of this node will be processed. @param prefix The prefix for the namespace, which may be <code>null</code>. If not <code>null</code>, this prefix will be mapped and unmapped. @param nodeNamespace The namespace of the node, which may be not be <code>null</code>. @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
boolean	TokenNameboolean	
shouldAddAttrs	TokenNameIdentifier	 should Add Attrs
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rhandler	TokenNameIdentifier	 rhandler
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shouldAddAttrs	TokenNameIdentifier	 should Add Attrs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
nodeNamespace	TokenNameIdentifier	 node Namespace
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
nodeNamespace	TokenNameIdentifier	 node Namespace
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shouldAddAttrs	TokenNameIdentifier	 should Add Attrs
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
shouldAddAttrs	TokenNameIdentifier	 should Add Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now end the element if name was valid 	TokenNameCOMMENT_LINE	Now end the element if name was valid 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
nodeNamespace	TokenNameIdentifier	 node Namespace
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rhandler	TokenNameIdentifier	 rhandler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_name_avt	TokenNameIdentifier	 m name avt
)	TokenNameRPAREN	
m_name_avt	TokenNameIdentifier	 m name avt
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
)	TokenNameRPAREN	
m_namespace_avt	TokenNameIdentifier	 m namespace avt
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
