/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
/** * This handler interface contains methods necessary to receive * information about document elements and content. * <p> * <strong>Note:</strong> Some of these methods overlap methods * found in the XMLDocumentHandler interface. * * @see XMLDocumentHandler * * @author Andy Clark, IBM * @version $Id: XMLDocumentFragmentHandler.java 447247 2006-09-18 05:23:52Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This handler interface contains methods necessary to receive information about document elements and content. <p> <strong>Note:</strong> Some of these methods overlap methods found in the XMLDocumentHandler interface. * @see XMLDocumentHandler * @author Andy Clark, IBM @version $Id: XMLDocumentFragmentHandler.java 447247 2006-09-18 05:23:52Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDocumentFragmentHandler	TokenNameIdentifier	 XML Document Fragment Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentFragmentHandler methods 	TokenNameCOMMENT_LINE	XMLDocumentFragmentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of the document fragment. * * @param locator The document locator, or null if the * document location cannot be reported * during the parsing of this fragment. * However, it is <em>strongly</em> * recommended that a locator be supplied * that can at least report the base * system identifier. * @param namespaceContext The namespace context in effect at the * start of this document fragment. This * object only represents the current context. * Implementors of this class are responsible * for copying the namespace bindings from the * the current context (and its parent contexts) * if that information is important. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of the document fragment. * @param locator The document locator, or null if the document location cannot be reported during the parsing of this fragment. However, it is <em>strongly</em> recommended that a locator be supplied that can at least report the base system identifier. @param namespaceContext The namespace context in effect at the start of this document fragment. This object only represents the current context. Implementors of this class are responsible for copying the namespace bindings from the the current context (and its parent contexts) if that information is important. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocumentFragment	TokenNameIdentifier	 start Document Fragment
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * This method notifies the start of a general entity. * <p> * <strong>Note:</strong> This method is not called for entity references * appearing as part of attribute values. * * @param name The name of the general entity. * @param identifier The resource identifier. * @param encoding The auto-detected IANA encoding name of the entity * stream. This value will be null in those situations * where the entity encoding is not auto-detected (e.g. * internal entities or a document entity that is * parsed from a java.io.Reader). * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the start of a general entity. <p> <strong>Note:</strong> This method is not called for entity references appearing as part of attribute values. * @param name The name of the general entity. @param identifier The resource identifier. @param encoding The auto-detected IANA encoding name of the entity stream. This value will be null in those situations where the entity encoding is not auto-detected (e.g. internal entities or a document entity that is parsed from a java.io.Reader). @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Notifies of the presence of a TextDecl line in an entity. If present, * this method will be called immediately following the startEntity call. * <p> * <strong>Note:</strong> This method will never be called for the * document entity; it is only called for external general entities * referenced in document content. * <p> * <strong>Note:</strong> This method is not called for entity references * appearing as part of attribute values. * * @param version The XML version, or null if not specified. * @param encoding The IANA encoding name of the entity. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Notifies of the presence of a TextDecl line in an entity. If present, this method will be called immediately following the startEntity call. <p> <strong>Note:</strong> This method will never be called for the document entity; it is only called for external general entities referenced in document content. <p> <strong>Note:</strong> This method is not called for entity references appearing as part of attribute values. * @param version The XML version, or null if not specified. @param encoding The IANA encoding name of the entity. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * This method notifies the end of a general entity. * <p> * <strong>Note:</strong> This method is not called for entity references * appearing as part of attribute values. * * @param name The name of the general entity. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the end of a general entity. <p> <strong>Note:</strong> This method is not called for entity references appearing as part of attribute values. * @param name The name of the general entity. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endGeneralEntity	TokenNameIdentifier	 end General Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A comment. * * @param text The text in the comment. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by application to signal an error. */	TokenNameCOMMENT_JAVADOC	 A comment. * @param text The text in the comment. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by application to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A processing instruction. Processing instructions consist of a * target name and, optionally, text data. The data is only meaningful * to the application. * <p> * Typically, a processing instruction's data will contain a series * of pseudo-attributes. These pseudo-attributes follow the form of * element attributes but are <strong>not</strong> parsed or presented * to the application as anything other than text. The application is * responsible for parsing the data. * * @param target The target. * @param data The data or null if none specified. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A processing instruction. Processing instructions consist of a target name and, optionally, text data. The data is only meaningful to the application. <p> Typically, a processing instruction's data will contain a series of pseudo-attributes. These pseudo-attributes follow the form of element attributes but are <strong>not</strong> parsed or presented to the application as anything other than text. The application is responsible for parsing the data. * @param target The target. @param data The data or null if none specified. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The start of an element. * * @param element The name of the element. * @param attributes The element attributes. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of an element. * @param element The name of the element. @param attributes The element attributes. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * An empty element. * * @param element The name of the element. * @param attributes The element attributes. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An empty element. * @param element The name of the element. @param attributes The element attributes. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Character content. * * @param text The content. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Character content. * @param text The content. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Ignorable whitespace. For this method to be called, the document * source must have some way of determining that the text containing * only whitespace characters should be considered ignorable. For * example, the validator can determine if a length of whitespace * characters in the document are ignorable based on the element * content model. * * @param text The ignorable whitespace. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Ignorable whitespace. For this method to be called, the document source must have some way of determining that the text containing only whitespace characters should be considered ignorable. For example, the validator can determine if a length of whitespace characters in the document are ignorable based on the element content model. * @param text The ignorable whitespace. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of an element. * * @param element The name of the element. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of an element. * @param element The name of the element. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The start of a CDATA section. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of a CDATA section. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of a CDATA section. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a CDATA section. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of the document fragment. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the document fragment. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endDocumentFragment	TokenNameIdentifier	 end Document Fragment
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDocumentFragmentHandler 	TokenNameCOMMENT_LINE	interface XMLDocumentFragmentHandler 
