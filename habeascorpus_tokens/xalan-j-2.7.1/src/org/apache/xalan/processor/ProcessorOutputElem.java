/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorOutputElem.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorOutputElem.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
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
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
OutputProperties	TokenNameIdentifier	 Output Properties
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
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
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
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
/** * TransformerFactory for xsl:output markup. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 TransformerFactory for xsl:output markup. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> 
class	TokenNameclass	
ProcessorOutputElem	TokenNameIdentifier	 Processor Output Elem
extends	TokenNameextends	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3513742319582547590L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The output properties, set temporarily while the properties are * being set from the attributes, and then nulled after that operation * is completed. */	TokenNameCOMMENT_JAVADOC	 The output properties, set temporarily while the properties are being set from the attributes, and then nulled after that operation is completed. 
private	TokenNameprivate	
OutputProperties	TokenNameIdentifier	 Output Properties
m_outputProperties	TokenNameIdentifier	 m output Properties
;	TokenNameSEMICOLON	
/** * Set the cdata-section-elements property from the attribute value. * @see javax.xml.transform.OutputKeys#CDATA_SECTION_ELEMENTS * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the cdata-section-elements property from the attribute value. @see javax.xml.transform.OutputKeys#CDATA_SECTION_ELEMENTS @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setQNameProperties	TokenNameIdentifier	 set Q Name Properties
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the doctype-public property from the attribute value. * @see javax.xml.transform.OutputKeys#DOCTYPE_PUBLIC * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the doctype-public property from the attribute value. @see javax.xml.transform.OutputKeys#DOCTYPE_PUBLIC @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the doctype-system property from the attribute value. * @see javax.xml.transform.OutputKeys#DOCTYPE_SYSTEM * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the doctype-system property from the attribute value. @see javax.xml.transform.OutputKeys#DOCTYPE_SYSTEM @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the encoding property from the attribute value. * @see javax.xml.transform.OutputKeys#ENCODING * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the encoding property from the attribute value. @see javax.xml.transform.OutputKeys#ENCODING @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the indent property from the attribute value. * @see javax.xml.transform.OutputKeys#INDENT * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the indent property from the attribute value. @see javax.xml.transform.OutputKeys#INDENT @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setBooleanProperty	TokenNameIdentifier	 set Boolean Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the media type property from the attribute value. * @see javax.xml.transform.OutputKeys#MEDIA_TYPE * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the media type property from the attribute value. @see javax.xml.transform.OutputKeys#MEDIA_TYPE @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the method property from the attribute value. * @see javax.xml.transform.OutputKeys#METHOD * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the method property from the attribute value. @see javax.xml.transform.OutputKeys#METHOD @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setQNameProperty	TokenNameIdentifier	 set Q Name Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the omit-xml-declaration property from the attribute value. * @see javax.xml.transform.OutputKeys#OMIT_XML_DECLARATION * @param newValue processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the omit-xml-declaration property from the attribute value. @see javax.xml.transform.OutputKeys#OMIT_XML_DECLARATION @param newValue processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitXmlDeclaration	TokenNameIdentifier	 set Omit Xml Declaration
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setBooleanProperty	TokenNameIdentifier	 set Boolean Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the standalone property from the attribute value. * @see javax.xml.transform.OutputKeys#STANDALONE * @param newValue processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the standalone property from the attribute value. @see javax.xml.transform.OutputKeys#STANDALONE @param newValue processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setBooleanProperty	TokenNameIdentifier	 set Boolean Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the version property from the attribute value. * @see javax.xml.transform.OutputKeys#VERSION * @param newValue non-null reference to processed attribute value. */	TokenNameCOMMENT_JAVADOC	 Set the version property from the attribute value. @see javax.xml.transform.OutputKeys#VERSION @param newValue non-null reference to processed attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a foreign property from the attribute value. * @param newValue non-null reference to attribute value. */	TokenNameCOMMENT_JAVADOC	 Set a foreign property from the attribute value. @param newValue non-null reference to attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setForeignAttr	TokenNameIdentifier	 set Foreign Attr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrLocalName	TokenNameIdentifier	 attr Local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrRawName	TokenNameIdentifier	 attr Raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a foreign property from the attribute value. * @param newValue non-null reference to attribute value. */	TokenNameCOMMENT_JAVADOC	 Set a foreign property from the attribute value. @param newValue non-null reference to attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
addLiteralResultAttribute	TokenNameIdentifier	 add Literal Result Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrLocalName	TokenNameIdentifier	 attr Local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrRawName	TokenNameIdentifier	 attr Raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the start of an xsl:output element. * * @param handler The calling StylesheetHandler/TemplatesBuilder. * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param rawName The raw XML 1.0 name (with prefix), or the * empty string if raw names are not available. * @param attributes The attributes attached to the element. If * there are no attributes, it shall be an empty * Attributes object. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an xsl:output element. * @param handler The calling StylesheetHandler/TemplatesBuilder. @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param rawName The raw XML 1.0 name (with prefix), or the empty string if raw names are not available. @param attributes The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Hmmm... for the moment I don't think I'll have default properties set for this. -sb 	TokenNameCOMMENT_LINE	Hmmm... for the moment I don't think I'll have default properties set for this. -sb 
m_outputProperties	TokenNameIdentifier	 m output Properties
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setDOMBackPointer	TokenNameIdentifier	 set DOM Back Pointer
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getOriginatingNode	TokenNameIdentifier	 get Originating Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
setUid	TokenNameIdentifier	 set Uid
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
nextUid	TokenNameIdentifier	 next Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPropertiesFromAttributes	TokenNameIdentifier	 set Properties From Attributes
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Access this only from the Hashtable level... we don't want to 	TokenNameCOMMENT_LINE	Access this only from the Hashtable level... we don't want to 
// get default properties. 	TokenNameCOMMENT_LINE	get default properties. 
String	TokenNameIdentifier	 String
entitiesFileName	TokenNameIdentifier	 entities File Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_ENTITIES	TokenNameIdentifier	 S  KEY  ENTITIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
entitiesFileName	TokenNameIdentifier	 entities File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
absURL	TokenNameIdentifier	 abs URL
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
entitiesFileName	TokenNameIdentifier	 entities File Name
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_ENTITIES	TokenNameIdentifier	 S  KEY  ENTITIES
,	TokenNameCOMMA	
absURL	TokenNameIdentifier	 abs URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
m_outputProperties	TokenNameIdentifier	 m output Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getElemTemplateElement	TokenNameIdentifier	 get Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
m_outputProperties	TokenNameIdentifier	 m output Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputProperties	TokenNameIdentifier	 m output Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
