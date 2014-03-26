/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtendedContentHandler.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtendedContentHandler.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This interface describes extensions to the SAX ContentHandler interface. * It is intended to be used by a serializer. The methods on this interface will * implement SAX- like behavior. This allows the gradual collection of * information rather than having it all up front. For example the call * <pre> * startElement(namespaceURI,localName,qName,atts) * </pre> * could be replaced with the calls * <pre> * startElement(namespaceURI,localName,qName) * addAttributes(atts) * </pre> * If there are no attributes the second call can be dropped. If attributes are * to be added one at a time with calls to * <pre> * addAttribute(namespaceURI, localName, qName, type, value) * </pre> * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This interface describes extensions to the SAX ContentHandler interface. It is intended to be used by a serializer. The methods on this interface will implement SAX- like behavior. This allows the gradual collection of information rather than having it all up front. For example the call <pre> startElement(namespaceURI,localName,qName,atts) </pre> could be replaced with the calls <pre> startElement(namespaceURI,localName,qName) addAttributes(atts) </pre> If there are no attributes the second call can be dropped. If attributes are to be added one at a time with calls to <pre> addAttribute(namespaceURI, localName, qName, type, value) </pre> @xsl.usage internal 
public	TokenNamepublic	
interface	TokenNameinterface	
ExtendedContentHandler	TokenNameIdentifier	 Extended Content Handler
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
{	TokenNameLBRACE	
/** * Add at attribute to the current element * @param uri the namespace URI of the attribute name * @param localName the local name of the attribute (without prefix) * @param rawName the qualified name of the attribute * @param type the attribute type typically character data (CDATA) * @param value the value of the attribute * @param XSLAttribute true if the added attribute is coming from an xsl:attribute element * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Add at attribute to the current element @param uri the namespace URI of the attribute name @param localName the local name of the attribute (without prefix) @param rawName the qualified name of the attribute @param type the attribute type typically character data (CDATA) @param value the value of the attribute @param XSLAttribute true if the added attribute is coming from an xsl:attribute element @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
XSLAttribute	TokenNameIdentifier	 XSL Attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Add attributes to the current element * @param atts the attributes to add. * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Add attributes to the current element @param atts the attributes to add. @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Add an attribute to the current element. The namespace URI of the * attribute will be calculated from the prefix of qName. The local name * will be derived from qName and the type will be assumed to be "CDATA". * @param qName * @param value */	TokenNameCOMMENT_JAVADOC	 Add an attribute to the current element. The namespace URI of the attribute will be calculated from the prefix of qName. The local name will be derived from qName and the type will be assumed to be "CDATA". @param qName @param value 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is used to notify of a character event, but passing the data * as a character String rather than the standard character array. * @param chars the character data * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify of a character event, but passing the data as a character String rather than the standard character array. @param chars the character data @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method is used to notify of a character event, but passing the data * as a DOM Node rather than the standard character array. * @param node a DOM Node containing text. * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify of a character event, but passing the data as a DOM Node rather than the standard character array. @param node a DOM Node containing text. @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method is used to notify that an element has ended. Unlike the * standard SAX method * <pre> * endElement(namespaceURI,localName,qName) * </pre> * only the last parameter is passed. If needed the serializer can derive * the localName from the qualified name and derive the namespaceURI from * its implementation. * @param elemName the fully qualified element name. * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify that an element has ended. Unlike the standard SAX method <pre> endElement(namespaceURI,localName,qName) </pre> only the last parameter is passed. If needed the serializer can derive the localName from the qualified name and derive the namespaceURI from its implementation. @param elemName the fully qualified element name. @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method is used to notify that an element is starting. * This method is just like the standard SAX method * <pre> * startElement(uri,localName,qname,atts) * </pre> * but without the attributes. * @param uri the namespace URI of the element * @param localName the local name (without prefix) of the element * @param qName the qualified name of the element * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify that an element is starting. This method is just like the standard SAX method <pre> startElement(uri,localName,qname,atts) </pre> but without the attributes. @param uri the namespace URI of the element @param localName the local name (without prefix) of the element @param qName the qualified name of the element * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method is used to notify of the start of an element * @param qName the fully qualified name of the element * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify of the start of an element @param qName the fully qualified name of the element @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method is used to notify that a prefix mapping is to start, but * after an element is started. The SAX method call * <pre> * startPrefixMapping(prefix,uri) * </pre> * is used just before an element starts and applies to the element to come, * not to the current element. This method applies to the current element. * For example one could make the calls in this order: * <pre> * startElement("prfx8:elem9") * namespaceAfterStartElement("http://namespace8","prfx8") * </pre> * * @param uri the namespace URI being declared * @param prefix the prefix that maps to the given namespace * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify that a prefix mapping is to start, but after an element is started. The SAX method call <pre> startPrefixMapping(prefix,uri) </pre> is used just before an element starts and applies to the element to come, not to the current element. This method applies to the current element. For example one could make the calls in this order: <pre> startElement("prfx8:elem9") namespaceAfterStartElement("http://namespace8","prfx8") </pre> * @param uri the namespace URI being declared @param prefix the prefix that maps to the given namespace @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method is used to notify that a prefix maping is to start, which can * be for the current element, or for the one to come. * @param prefix the prefix that maps to the given URI * @param uri the namespace URI of the given prefix * @param shouldFlush if true this call is like the SAX * startPrefixMapping(prefix,uri) call and the mapping applies to the * element to come. If false the mapping applies to the current element. * @return boolean false if the prefix mapping was already in effect (in * other words we are just re-declaring), true if this is a new, never * before seen mapping for the element. * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method is used to notify that a prefix maping is to start, which can be for the current element, or for the one to come. @param prefix the prefix that maps to the given URI @param uri the namespace URI of the given prefix @param shouldFlush if true this call is like the SAX startPrefixMapping(prefix,uri) call and the mapping applies to the element to come. If false the mapping applies to the current element. @return boolean false if the prefix mapping was already in effect (in other words we are just re-declaring), true if this is a new, never before seen mapping for the element. @throws SAXException 
public	TokenNamepublic	
boolean	TokenNameboolean	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Notify of an entity reference. * @param entityName the name of the entity * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Notify of an entity reference. @param entityName the name of the entity @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This method returns an object that has the current namespace mappings in * effect. * * @return NamespaceMappings an object that has the current namespace * mappings in effect. */	TokenNameCOMMENT_JAVADOC	 This method returns an object that has the current namespace mappings in effect. * @return NamespaceMappings an object that has the current namespace mappings in effect. 
public	TokenNamepublic	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method returns the prefix that currently maps to the given namespace * URI. * @param uri the namespace URI * @return String the prefix that currently maps to the given URI. */	TokenNameCOMMENT_JAVADOC	 This method returns the prefix that currently maps to the given namespace URI. @param uri the namespace URI @return String the prefix that currently maps to the given URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method gets the prefix associated with a current element or * attribute name. * @param name the qualified name of an element, or attribute * @param isElement true if it is an element name, false if it is an * atttribute name * @return String the namespace URI associated with the element or * attribute. */	TokenNameCOMMENT_JAVADOC	 This method gets the prefix associated with a current element or attribute name. @param name the qualified name of an element, or attribute @param isElement true if it is an element name, false if it is an atttribute name @return String the namespace URI associated with the element or attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method returns the namespace URI currently associated with the * prefix. * @param prefix a prefix of an element or attribute. * @return String the namespace URI currently associated with the prefix. */	TokenNameCOMMENT_JAVADOC	 This method returns the namespace URI currently associated with the prefix. @param prefix a prefix of an element or attribute. @return String the namespace URI currently associated with the prefix. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURIFromPrefix	TokenNameIdentifier	 get Namespace URI From Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is used to set the source locator, which might be used to * generated an error message. * @param locator the source locator */	TokenNameCOMMENT_JAVADOC	 This method is used to set the source locator, which might be used to generated an error message. @param locator the source locator 
public	TokenNamepublic	
void	TokenNamevoid	
setSourceLocator	TokenNameIdentifier	 set Source Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bit constants for addUniqueAttribute(). 	TokenNameCOMMENT_LINE	Bit constants for addUniqueAttribute(). 
// The attribute value contains no bad characters. A "bad" character is one which 	TokenNameCOMMENT_LINE	The attribute value contains no bad characters. A "bad" character is one which 
// is greater than 126 or it is one of '<', '>', '&' or '"'. 	TokenNameCOMMENT_LINE	is greater than 126 or it is one of '<', '>', '&' or '"'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_BAD_CHARS	TokenNameIdentifier	 NO  BAD  CHARS
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// An HTML empty attribute (e.g. <OPTION selected>). 	TokenNameCOMMENT_LINE	An HTML empty attribute (e.g. <OPTION selected>). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HTML_ATTREMPTY	TokenNameIdentifier	 HTML  ATTREMPTY
=	TokenNameEQUAL	
0x2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// An HTML URL attribute 	TokenNameCOMMENT_LINE	An HTML URL attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HTML_ATTRURL	TokenNameIdentifier	 HTML  ATTRURL
=	TokenNameEQUAL	
0x4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Add a unique attribute to the current element. * The attribute is guaranteed to be unique here. The serializer can write * it out immediately without saving it in a table first. The integer * flag contains information about the attribute, which helps the serializer * to decide whether a particular processing is needed. * * @param qName the fully qualified attribute name. * @param value the attribute value * @param flags a bitwise flag */	TokenNameCOMMENT_JAVADOC	 Add a unique attribute to the current element. The attribute is guaranteed to be unique here. The serializer can write it out immediately without saving it in a table first. The integer flag contains information about the attribute, which helps the serializer to decide whether a particular processing is needed. * @param qName the fully qualified attribute name. @param value the attribute value @param flags a bitwise flag 
public	TokenNamepublic	
void	TokenNamevoid	
addUniqueAttribute	TokenNameIdentifier	 add Unique Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Add an attribute from an xsl:attribute element. * @param qName the qualified attribute name (prefix:localName) * @param value the attributes value * @param uri the uri that the prefix of the qName is mapped to. */	TokenNameCOMMENT_JAVADOC	 Add an attribute from an xsl:attribute element. @param qName the qualified attribute name (prefix:localName) @param value the attributes value @param uri the uri that the prefix of the qName is mapped to. 
public	TokenNamepublic	
void	TokenNamevoid	
addXSLAttribute	TokenNameIdentifier	 add XSL Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add at attribute to the current element, not from an xsl:attribute * element. * @param uri the namespace URI of the attribute name * @param localName the local name of the attribute (without prefix) * @param rawName the qualified name of the attribute * @param type the attribute type typically character data (CDATA) * @param value the value of the attribute * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Add at attribute to the current element, not from an xsl:attribute element. @param uri the namespace URI of the attribute name @param localName the local name of the attribute (without prefix) @param rawName the qualified name of the attribute @param type the attribute type typically character data (CDATA) @param value the value of the attribute @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
