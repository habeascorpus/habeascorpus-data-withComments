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
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
;	TokenNameSEMICOLON	
/** * The DTD handler interface defines callback methods to report * information items in the DTD of an XML document. Parser components * interested in DTD information implement this interface and are * registered as the DTD handler on the DTD source. * * @see XMLDTDContentModelHandler * * @author Andy Clark, IBM * * @version $Id: XMLDTDHandler.java 447247 2006-09-18 05:23:52Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The DTD handler interface defines callback methods to report information items in the DTD of an XML document. Parser components interested in DTD information implement this interface and are registered as the DTD handler on the DTD source. * @see XMLDTDContentModelHandler * @author Andy Clark, IBM * @version $Id: XMLDTDHandler.java 447247 2006-09-18 05:23:52Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** * Conditional section: INCLUDE. * * @see #CONDITIONAL_IGNORE */	TokenNameCOMMENT_JAVADOC	 Conditional section: INCLUDE. * @see #CONDITIONAL_IGNORE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONDITIONAL_INCLUDE	TokenNameIdentifier	 CONDITIONAL  INCLUDE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Conditional section: IGNORE. * * @see #CONDITIONAL_INCLUDE */	TokenNameCOMMENT_JAVADOC	 Conditional section: IGNORE. * @see #CONDITIONAL_INCLUDE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONDITIONAL_IGNORE	TokenNameIdentifier	 CONDITIONAL  IGNORE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// XMLDTDHandler methods 	TokenNameCOMMENT_LINE	XMLDTDHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of the DTD. * * @param locator The document locator, or null if the document * location cannot be reported during the parsing of * the document DTD. However, it is <em>strongly</em> * recommended that a locator be supplied that can * at least report the base system identifier of the * DTD. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of the DTD. * @param locator The document locator, or null if the document location cannot be reported during the parsing of the document DTD. However, it is <em>strongly</em> recommended that a locator be supplied that can at least report the base system identifier of the DTD. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
XMLLocator	TokenNameIdentifier	 XML Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * This method notifies of the start of a parameter entity. The parameter * entity name start with a '%' character. * * @param name The name of the parameter entity. * @param identifier The resource identifier. * @param encoding The auto-detected IANA encoding name of the entity * stream. This value will be null in those situations * where the entity encoding is not auto-detected (e.g. * internal parameter entities). * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies of the start of a parameter entity. The parameter entity name start with a '%' character. * @param name The name of the parameter entity. @param identifier The resource identifier. @param encoding The auto-detected IANA encoding name of the entity stream. This value will be null in those situations where the entity encoding is not auto-detected (e.g. internal parameter entities). @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startParameterEntity	TokenNameIdentifier	 start Parameter Entity
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
/** * Notifies of the presence of a TextDecl line in an entity. If present, * this method will be called immediately following the startEntity call. * <p> * <strong>Note:</strong> This method is only called for external * parameter entities referenced in the DTD. * * @param version The XML version, or null if not specified. * @param encoding The IANA encoding name of the entity. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Notifies of the presence of a TextDecl line in an entity. If present, this method will be called immediately following the startEntity call. <p> <strong>Note:</strong> This method is only called for external parameter entities referenced in the DTD. * @param version The XML version, or null if not specified. @param encoding The IANA encoding name of the entity. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
/** * This method notifies the end of a parameter entity. Parameter entity * names begin with a '%' character. * * @param name The name of the parameter entity. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the end of a parameter entity. Parameter entity names begin with a '%' character. * @param name The name of the parameter entity. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endParameterEntity	TokenNameIdentifier	 end Parameter Entity
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
/** * The start of the DTD external subset. * * @param identifier The resource identifier. * @param augmentations * Additional information that may include infoset * augmentations. * @exception XNIException * Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of the DTD external subset. * @param identifier The resource identifier. @param augmentations Additional information that may include infoset augmentations. @exception XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startExternalSubset	TokenNameIdentifier	 start External Subset
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of the DTD external subset. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the DTD external subset. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endExternalSubset	TokenNameIdentifier	 end External Subset
(	TokenNameLPAREN	
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
/** * An element declaration. * * @param name The name of the element. * @param contentModel The element content model. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An element declaration. * @param name The name of the element. @param contentModel The element content model. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contentModel	TokenNameIdentifier	 content Model
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The start of an attribute list. * * @param elementName The name of the element that this attribute * list is associated with. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of an attribute list. * @param elementName The name of the element that this attribute list is associated with. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startAttlist	TokenNameIdentifier	 start Attlist
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * An attribute declaration. * * @param elementName The name of the element that this attribute * is associated with. * @param attributeName The name of the attribute. * @param type The attribute type. This value will be one of * the following: "CDATA", "ENTITY", "ENTITIES", * "ENUMERATION", "ID", "IDREF", "IDREFS", * "NMTOKEN", "NMTOKENS", or "NOTATION". * @param enumeration If the type has the value "ENUMERATION" or * "NOTATION", this array holds the allowed attribute * values; otherwise, this array is null. * @param defaultType The attribute default type. This value will be * one of the following: "#FIXED", "#IMPLIED", * "#REQUIRED", or null. * @param defaultValue The attribute default value, or null if no * default value is specified. * @param nonNormalizedDefaultValue The attribute default value with no normalization * performed, or null if no default value is specified. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An attribute declaration. * @param elementName The name of the element that this attribute is associated with. @param attributeName The name of the attribute. @param type The attribute type. This value will be one of the following: "CDATA", "ENTITY", "ENTITIES", "ENUMERATION", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", or "NOTATION". @param enumeration If the type has the value "ENUMERATION" or "NOTATION", this array holds the allowed attribute values; otherwise, this array is null. @param defaultType The attribute default type. This value will be one of the following: "#FIXED", "#IMPLIED", "#REQUIRED", or null. @param defaultValue The attribute default value, or null if no default value is specified. @param nonNormalizedDefaultValue The attribute default value with no normalization performed, or null if no default value is specified. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumeration	TokenNameIdentifier	 enumeration
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultType	TokenNameIdentifier	 default Type
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
defaultValue	TokenNameIdentifier	 default Value
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
nonNormalizedDefaultValue	TokenNameIdentifier	 non Normalized Default Value
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of an attribute list. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of an attribute list. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endAttlist	TokenNameIdentifier	 end Attlist
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * An internal entity declaration. * * @param name The name of the entity. Parameter entity names start with * '%', whereas the name of a general entity is just the * entity name. * @param text The value of the entity. * @param nonNormalizedText The non-normalized value of the entity. This * value contains the same sequence of characters that was in * the internal entity declaration, without any entity * references expanded. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An internal entity declaration. * @param name The name of the entity. Parameter entity names start with '%', whereas the name of a general entity is just the entity name. @param text The value of the entity. @param nonNormalizedText The non-normalized value of the entity. This value contains the same sequence of characters that was in the internal entity declaration, without any entity references expanded. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
nonNormalizedText	TokenNameIdentifier	 non Normalized Text
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * An external entity declaration. * * @param name The name of the entity. Parameter entity names start * with '%', whereas the name of a general entity is just * the entity name. * @param identifier An object containing all location information * pertinent to this external entity. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An external entity declaration. * @param name The name of the entity. Parameter entity names start with '%', whereas the name of a general entity is just the entity name. @param identifier An object containing all location information pertinent to this external entity. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * An unparsed entity declaration. * * @param name The name of the entity. * @param identifier An object containing all location information * pertinent to this unparsed entity declaration. * @param notation The name of the notation. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An unparsed entity declaration. * @param name The name of the entity. @param identifier An object containing all location information pertinent to this unparsed entity declaration. @param notation The name of the notation. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notation	TokenNameIdentifier	 notation
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A notation declaration * * @param name The name of the notation. * @param identifier An object containing all location information * pertinent to this notation. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A notation declaration * @param name The name of the notation. @param identifier An object containing all location information pertinent to this notation. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The start of a conditional section. * * @param type The type of the conditional section. This value will * either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #CONDITIONAL_INCLUDE * @see #CONDITIONAL_IGNORE */	TokenNameCOMMENT_JAVADOC	 The start of a conditional section. * @param type The type of the conditional section. This value will either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #CONDITIONAL_INCLUDE @see #CONDITIONAL_IGNORE 
public	TokenNamepublic	
void	TokenNamevoid	
startConditional	TokenNameIdentifier	 start Conditional
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Characters within an IGNORE conditional section. * * @param text The ignored text. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Characters within an IGNORE conditional section. * @param text The ignored text. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
ignoredCharacters	TokenNameIdentifier	 ignored Characters
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
/** * The end of a conditional section. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a conditional section. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endConditional	TokenNameIdentifier	 end Conditional
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of the DTD. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the DTD. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
// set the source of this handler 	TokenNameCOMMENT_LINE	set the source of this handler 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDSource	TokenNameIdentifier	 set DTD Source
(	TokenNameLPAREN	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return the source from which this handler derives its events 	TokenNameCOMMENT_LINE	return the source from which this handler derives its events 
public	TokenNamepublic	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
getDTDSource	TokenNameIdentifier	 get DTD Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDTDHandler 	TokenNameCOMMENT_LINE	interface XMLDTDHandler 
