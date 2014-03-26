/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
Augmentations	TokenNameIdentifier	 Augmentations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLAttributes	TokenNameIdentifier	 XML Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLLocator	TokenNameIdentifier	 XML Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
;	TokenNameSEMICOLON	
/** * This sample demonstrates how to implement a simple pass-through * filter for the document "streaming" information set using XNI. * This filter could be used in a pipeline of XNI parser components * that communicate document events. * <p> * <strong>Note:</strong> This sample does not contain a * <code>main</code> method and cannot be run. It is only for * demonstration purposes. * * @author Andy Clark, IBM * * @version $Id: PassThroughFilter.java 699895 2008-09-28 21:21:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample demonstrates how to implement a simple pass-through filter for the document "streaming" information set using XNI. This filter could be used in a pipeline of XNI parser components that communicate document events. <p> <strong>Note:</strong> This sample does not contain a <code>main</code> method and cannot be run. It is only for demonstration purposes. * @author Andy Clark, IBM * @version $Id: PassThroughFilter.java 699895 2008-09-28 21:21:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
PassThroughFilter	TokenNameIdentifier	 Pass Through Filter
implements	TokenNameimplements	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The document handler. */	TokenNameCOMMENT_JAVADOC	 The document handler. 
protected	TokenNameprotected	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
fDocumentHandler	TokenNameIdentifier	 f Document Handler
;	TokenNameSEMICOLON	
/** The document source */	TokenNameCOMMENT_JAVADOC	 The document source 
protected	TokenNameprotected	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
fDocumentSource	TokenNameIdentifier	 f Document Source
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the document handler. * * @param handler The new document handler. */	TokenNameCOMMENT_JAVADOC	 Sets the document handler. * @param handler The new document handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setDocumentHandler(XMLDocumentHandler) 	TokenNameCOMMENT_LINE	setDocumentHandler(XMLDocumentHandler) 
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentHandler methods 	TokenNameCOMMENT_LINE	XMLDocumentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of the document. * * @param locator The document locator, or null if the document * location cannot be reported during the parsing * of this document. However, it is <em>strongly</em> * recommended that a locator be supplied that can * at least report the system identifier of the * document. * @param encoding The auto-detected IANA encoding name of the entity * stream. This value will be null in those situations * where the entity encoding is not auto-detected (e.g. * internal entities or a document entity that is * parsed from a java.io.Reader). * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of the document. * @param locator The document locator, or null if the document location cannot be reported during the parsing of this document. However, it is <em>strongly</em> recommended that a locator be supplied that can at least report the system identifier of the document. @param encoding The auto-detected IANA encoding name of the entity stream. This value will be null in those situations where the entity encoding is not auto-detected (e.g. internal entities or a document entity that is parsed from a java.io.Reader). * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startDocument(XMLLocator,String) 	TokenNameCOMMENT_LINE	startDocument(XMLLocator,String) 
/** * Notifies of the presence of an XMLDecl line in the document. If * present, this method will be called immediately following the * startDocument call. * * @param version The XML version. * @param encoding The IANA encoding name of the document, or null if * not specified. * @param standalone The standalone value, or null if not specified. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Notifies of the presence of an XMLDecl line in the document. If present, this method will be called immediately following the startDocument call. * @param version The XML version. @param encoding The IANA encoding name of the document, or null if not specified. @param standalone The standalone value, or null if not specified. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
xmlDecl	TokenNameIdentifier	 xml Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
xmlDecl	TokenNameIdentifier	 xml Decl
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
standalone	TokenNameIdentifier	 standalone
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// xmlDecl(String,String,String 	TokenNameCOMMENT_LINE	xmlDecl(String,String,String 
/** * Notifies of the presence of the DOCTYPE line in the document. * * @param rootElement The name of the root element. * @param publicId The public identifier if an external DTD or null * if the external DTD is specified using SYSTEM. * @param systemId The system identifier if an external DTD, null * otherwise. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Notifies of the presence of the DOCTYPE line in the document. * @param rootElement The name of the root element. @param publicId The public identifier if an external DTD or null if the external DTD is specified using SYSTEM. @param systemId The system identifier if an external DTD, null otherwise. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
doctypeDecl	TokenNameIdentifier	 doctype Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rootElement	TokenNameIdentifier	 root Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
doctypeDecl	TokenNameIdentifier	 doctype Decl
(	TokenNameLPAREN	
rootElement	TokenNameIdentifier	 root Element
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// doctypeDecl(String,String,String) 	TokenNameCOMMENT_LINE	doctypeDecl(String,String,String) 
/** * A comment. * * @param text The text in the comment. * * @throws XNIException Thrown by application to signal an error. */	TokenNameCOMMENT_JAVADOC	 A comment. * @param text The text in the comment. * @throws XNIException Thrown by application to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// comment(XMLString) 	TokenNameCOMMENT_LINE	comment(XMLString) 
/** * A processing instruction. Processing instructions consist of a * target name and, optionally, text data. The data is only meaningful * to the application. * <p> * Typically, a processing instruction's data will contain a series * of pseudo-attributes. These pseudo-attributes follow the form of * element attributes but are <strong>not</strong> parsed or presented * to the application as anything other than text. The application is * responsible for parsing the data. * * @param target The target. * @param data The data or null if none specified. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A processing instruction. Processing instructions consist of a target name and, optionally, text data. The data is only meaningful to the application. <p> Typically, a processing instruction's data will contain a series of pseudo-attributes. These pseudo-attributes follow the form of element attributes but are <strong>not</strong> parsed or presented to the application as anything other than text. The application is responsible for parsing the data. * @param target The target. @param data The data or null if none specified. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// processingInstruction(String,XMLString) 	TokenNameCOMMENT_LINE	processingInstruction(String,XMLString) 
/** * The start of an element. * * @param element The name of the element. * @param attributes The element attributes. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of an element. * @param element The name of the element. @param attributes The element attributes. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startElement(QName,XMLAttributes) 	TokenNameCOMMENT_LINE	startElement(QName,XMLAttributes) 
/** * An empty element. * * @param element The name of the element. * @param attributes The element attributes. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An empty element. * @param element The name of the element. @param attributes The element attributes. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// emptyElement(QName,XMLAttributes) 	TokenNameCOMMENT_LINE	emptyElement(QName,XMLAttributes) 
/** * The end of an element. * * @param element The name of the element. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of an element. * @param element The name of the element. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// endElement(QName) 	TokenNameCOMMENT_LINE	endElement(QName) 
/** * This method notifies the start of an entity. * <p> * <strong>Note:</strong> This method is not called for entity references * appearing as part of attribute values. * * @param name The name of the entity. * @param publicId The public identifier of the entity if the entity * is external, null otherwise. * @param systemId The system identifier of the entity if the entity * is external, null otherwise. * @param baseSystemId The base system identifier of the entity if * the entity is external, null otherwise. * @param encoding The auto-detected IANA encoding name of the entity * stream. This value will be null in those situations * where the entity encoding is not auto-detected (e.g. * internal entities or a document entity that is * parsed from a java.io.Reader). * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the start of an entity. <p> <strong>Note:</strong> This method is not called for entity references appearing as part of attribute values. * @param name The name of the entity. @param publicId The public identifier of the entity if the entity is external, null otherwise. @param systemId The system identifier of the entity if the entity is external, null otherwise. @param baseSystemId The base system identifier of the entity if the entity is external, null otherwise. @param encoding The auto-detected IANA encoding name of the entity stream. This value will be null in those situations where the entity encoding is not auto-detected (e.g. internal entities or a document entity that is parsed from a java.io.Reader). * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startGeneralEntity	TokenNameIdentifier	 start General Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startGeneralEntity	TokenNameIdentifier	 start General Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startGeneralEntity(String,XMLResourceIdentifier,String,Augmentations) 	TokenNameCOMMENT_LINE	startGeneralEntity(String,XMLResourceIdentifier,String,Augmentations) 
/** * Notifies of the presence of a TextDecl line in an entity. If present, * this method will be called immediately following the startEntity call. * <p> * <strong>Note:</strong> This method will never be called for the * document entity; it is only called for external general entities * referenced in document content. * <p> * <strong>Note:</strong> This method is not called for entity references * appearing as part of attribute values. * * @param version The XML version, or null if not specified. * @param encoding The IANA encoding name of the entity. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Notifies of the presence of a TextDecl line in an entity. If present, this method will be called immediately following the startEntity call. <p> <strong>Note:</strong> This method will never be called for the document entity; it is only called for external general entities referenced in document content. <p> <strong>Note:</strong> This method is not called for entity references appearing as part of attribute values. * @param version The XML version, or null if not specified. @param encoding The IANA encoding name of the entity. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
textDecl	TokenNameIdentifier	 text Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
textDecl	TokenNameIdentifier	 text Decl
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// textDecl(String,String) 	TokenNameCOMMENT_LINE	textDecl(String,String) 
/** * This method notifies the end of an entity. * <p> * <strong>Note:</strong> This method is not called for entity references * appearing as part of attribute values. * * @param name The name of the entity. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the end of an entity. <p> <strong>Note:</strong> This method is not called for entity references appearing as part of attribute values. * @param name The name of the entity. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endGeneralEntity	TokenNameIdentifier	 end General Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endGeneralEntity	TokenNameIdentifier	 end General Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// endGeneralEntity(String,Augmentations) 	TokenNameCOMMENT_LINE	endGeneralEntity(String,Augmentations) 
/** * Character content. * * @param text The content. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Character content. * @param text The content. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// characters(XMLString) 	TokenNameCOMMENT_LINE	characters(XMLString) 
/** * Ignorable whitespace. For this method to be called, the document * source must have some way of determining that the text containing * only whitespace characters should be considered ignorable. For * example, the validator can determine if a length of whitespace * characters in the document are ignorable based on the element * content model. * * @param text The ignorable whitespace. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Ignorable whitespace. For this method to be called, the document source must have some way of determining that the text containing only whitespace characters should be considered ignorable. For example, the validator can determine if a length of whitespace characters in the document are ignorable based on the element content model. * @param text The ignorable whitespace. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ignorableWhitespace(XMLString) 	TokenNameCOMMENT_LINE	ignorableWhitespace(XMLString) 
/** * The start of a CDATA section. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of a CDATA section. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startCDATA() 	TokenNameCOMMENT_LINE	startCDATA() 
/** * The end of a CDATA section. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a CDATA section. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// endCDATA() 	TokenNameCOMMENT_LINE	endCDATA() 
/** * The end of the document. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the document. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// endDocument() 	TokenNameCOMMENT_LINE	endDocument() 
/** Sets the document source. */	TokenNameCOMMENT_JAVADOC	 Sets the document source. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentSource	TokenNameIdentifier	 f Document Source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the document source. */	TokenNameCOMMENT_JAVADOC	 Returns the document source. 
public	TokenNamepublic	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
getDocumentSource	TokenNameIdentifier	 get Document Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDocumentSource	TokenNameIdentifier	 f Document Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class PassThroughFilter 	TokenNameCOMMENT_LINE	class PassThroughFilter 
