/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolTable	TokenNameIdentifier	 Symbol Table
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
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
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
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
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
XMLDTDScanner	TokenNameIdentifier	 XMLDTD Scanner
;	TokenNameSEMICOLON	
/** * @version $Id: DTDParser.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @version $Id: DTDParser.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTDParser	TokenNameIdentifier	 DTD Parser
extends	TokenNameextends	
XMLGrammarParser	TokenNameIdentifier	 XML Grammar Parser
implements	TokenNameimplements	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
,	TokenNameCOMMA	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** fDTDScanner */	TokenNameCOMMENT_JAVADOC	 fDTDScanner 
protected	TokenNameprotected	
XMLDTDScanner	TokenNameIdentifier	 XMLDTD Scanner
fDTDScanner	TokenNameIdentifier	 f DTD Scanner
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * * * @param symbolTable */	TokenNameCOMMENT_JAVADOC	 * @param symbolTable 
public	TokenNamepublic	
DTDParser	TokenNameIdentifier	 DTD Parser
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Methods 	TokenNameCOMMENT_LINE	Methods 
// 	TokenNameCOMMENT_LINE	 
/** * getDTDGrammar * * @return the grammar created by this parser */	TokenNameCOMMENT_JAVADOC	 getDTDGrammar * @return the grammar created by this parser 
public	TokenNamepublic	
DTDGrammar	TokenNameIdentifier	 DTD Grammar
getDTDGrammar	TokenNameIdentifier	 get DTD Grammar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getDTDGrammar 	TokenNameCOMMENT_LINE	getDTDGrammar 
// 	TokenNameCOMMENT_LINE	 
// XMLDTDHandler methods 	TokenNameCOMMENT_LINE	XMLDTDHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * This method notifies of the start of an entity. The DTD has the * pseudo-name of "[dtd]" and parameter entity names start with '%'. * <p> * <strong>Note:</strong> Since the DTD is an entity, the handler * will be notified of the start of the DTD entity by calling the * startEntity method with the entity name "[dtd]" <em>before</em> calling * the startDTD method. * * @param name The name of the entity. * @param publicId The public identifier of the entity if the entity * is external, null otherwise. * @param systemId The system identifier of the entity if the entity * is external, null otherwise. * @param encoding The auto-detected IANA encoding name of the entity * stream. This value will be null in those situations * where the entity encoding is not auto-detected (e.g. * internal parameter entities). * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies of the start of an entity. The DTD has the pseudo-name of "[dtd]" and parameter entity names start with '%'. <p> <strong>Note:</strong> Since the DTD is an entity, the handler will be notified of the start of the DTD entity by calling the startEntity method with the entity name "[dtd]" <em>before</em> calling the startDTD method. * @param name The name of the entity. @param publicId The public identifier of the entity if the entity is external, null otherwise. @param systemId The system identifier of the entity if the entity is external, null otherwise. @param encoding The auto-detected IANA encoding name of the entity stream. This value will be null in those situations where the entity encoding is not auto-detected (e.g. internal parameter entities). * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Notifies of the presence of a TextDecl line in an entity. If present, * this method will be called immediately following the startEntity call. * <p> * <strong>Note:</strong> This method is only called for external * parameter entities referenced in the DTD. * * @param version The XML version, or null if not specified. * @param encoding The IANA encoding name of the entity. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 Notifies of the presence of a TextDecl line in an entity. If present, this method will be called immediately following the startEntity call. <p> <strong>Note:</strong> This method is only called for external parameter entities referenced in the DTD. * @param version The XML version, or null if not specified. @param encoding The IANA encoding name of the entity. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
textDecl	TokenNameIdentifier	 text Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The start of the DTD. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of the DTD. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * A comment. * * @param text The text in the comment. * * @throws XNIException Thrown by application to signal an error. */	TokenNameCOMMENT_JAVADOC	 A comment. * @param text The text in the comment. * @throws XNIException Thrown by application to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// comment 	TokenNameCOMMENT_LINE	comment 
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
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// processingInstruction 	TokenNameCOMMENT_LINE	processingInstruction 
/** * The start of the external subset. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of the external subset. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// startExternalSubset 	TokenNameCOMMENT_LINE	startExternalSubset 
/** * The end of the external subset. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the external subset. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endExternalSubset	TokenNameIdentifier	 end External Subset
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// endExternalSubset 	TokenNameCOMMENT_LINE	endExternalSubset 
/** * An element declaration. * * @param name The name of the element. * @param contentModel The element content model. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An element declaration. * @param name The name of the element. @param contentModel The element content model. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// elementDecl 	TokenNameCOMMENT_LINE	elementDecl 
/** * The start of an attribute list. * * @param elementName The name of the element that this attribute * list is associated with. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of an attribute list. * @param elementName The name of the element that this attribute list is associated with. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// startAttlist 	TokenNameCOMMENT_LINE	startAttlist 
/** * An attribute declaration. * * @param elementName The name of the element that this attribute * is associated with. * @param attributeName The name of the attribute. * @param type The attribute type. This value will be one of * the following: "CDATA", "ENTITY", "ENTITIES", * "ENUMERATION", "ID", "IDREF", "IDREFS", * "NMTOKEN", "NMTOKENS", or "NOTATION". * @param enumeration If the type has the value "ENUMERATION", this * array holds the allowed attribute values; * otherwise, this array is null. * @param defaultType The attribute default type. This value will be * one of the following: "#FIXED", "#IMPLIED", * "#REQUIRED", or null. * @param defaultValue The attribute default value, or null if no * default value is specified. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An attribute declaration. * @param elementName The name of the element that this attribute is associated with. @param attributeName The name of the attribute. @param type The attribute type. This value will be one of the following: "CDATA", "ENTITY", "ENTITIES", "ENUMERATION", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", or "NOTATION". @param enumeration If the type has the value "ENUMERATION", this array holds the allowed attribute values; otherwise, this array is null. @param defaultType The attribute default type. This value will be one of the following: "#FIXED", "#IMPLIED", "#REQUIRED", or null. @param defaultValue The attribute default value, or null if no default value is specified. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// attributeDecl 	TokenNameCOMMENT_LINE	attributeDecl 
/** * The end of an attribute list. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of an attribute list. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endAttlist	TokenNameIdentifier	 end Attlist
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// endAttlist 	TokenNameCOMMENT_LINE	endAttlist 
/** * An internal entity declaration. * * @param name The name of the entity. Parameter entity names start with * '%', whereas the name of a general entity is just the * entity name. * @param text The value of the entity. * @param nonNormalizedText The non-normalized value of the entity. This * value contains the same sequence of characters that was in * the internal entity declaration, without any entity * references expanded. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An internal entity declaration. * @param name The name of the entity. Parameter entity names start with '%', whereas the name of a general entity is just the entity name. @param text The value of the entity. @param nonNormalizedText The non-normalized value of the entity. This value contains the same sequence of characters that was in the internal entity declaration, without any entity references expanded. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// internalEntityDecl(String,XMLString,XMLString) 	TokenNameCOMMENT_LINE	internalEntityDecl(String,XMLString,XMLString) 
/** * An external entity declaration. * * @param name The name of the entity. Parameter entity names start * with '%', whereas the name of a general entity is just * the entity name. * @param identifier An object containing all location information * pertinent to this entity. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An external entity declaration. * @param name The name of the entity. Parameter entity names start with '%', whereas the name of a general entity is just the entity name. @param identifier An object containing all location information pertinent to this entity. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// externalEntityDecl 	TokenNameCOMMENT_LINE	externalEntityDecl 
/** * An unparsed entity declaration. * * @param name The name of the entity. * @param identifier An object containing all location information * pertinent to this entity. * @param notation The name of the notation. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An unparsed entity declaration. * @param name The name of the entity. @param identifier An object containing all location information pertinent to this entity. @param notation The name of the notation. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// unparsedEntityDecl 	TokenNameCOMMENT_LINE	unparsedEntityDecl 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// notationDecl 	TokenNameCOMMENT_LINE	notationDecl 
/** * The start of a conditional section. * * @param type The type of the conditional section. This value will * either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE. * * @throws XNIException Thrown by handler to signal an error. * * @see XMLDTDHandler#CONDITIONAL_INCLUDE * @see XMLDTDHandler#CONDITIONAL_IGNORE */	TokenNameCOMMENT_JAVADOC	 The start of a conditional section. * @param type The type of the conditional section. This value will either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE. * @throws XNIException Thrown by handler to signal an error. * @see XMLDTDHandler#CONDITIONAL_INCLUDE @see XMLDTDHandler#CONDITIONAL_IGNORE 
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
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// startConditional 	TokenNameCOMMENT_LINE	startConditional 
/** * The end of a conditional section. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a conditional section. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endConditional	TokenNameIdentifier	 end Conditional
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// endConditional 	TokenNameCOMMENT_LINE	endConditional 
/** * The end of the DTD. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of the DTD. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// endDTD 	TokenNameCOMMENT_LINE	endDTD 
/** * This method notifies the end of an entity. The DTD has the pseudo-name * of "[dtd]" and parameter entity names start with '%'. * <p> * <strong>Note:</strong> Since the DTD is an entity, the handler * will be notified of the end of the DTD entity by calling the * endEntity method with the entity name "[dtd]" <em>after</em> calling * the endDTD method. * * @param name The name of the entity. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the end of an entity. The DTD has the pseudo-name of "[dtd]" and parameter entity names start with '%'. <p> <strong>Note:</strong> Since the DTD is an entity, the handler will be notified of the end of the DTD entity by calling the endEntity method with the entity name "[dtd]" <em>after</em> calling the endDTD method. * @param name The name of the entity. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDTDContentModelHandler methods 	TokenNameCOMMENT_LINE	XMLDTDContentModelHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of a content model. Depending on the type of the content * model, specific methods may be called between the call to the * startContentModel method and the call to the endContentModel method. * * @param elementName The name of the element. * @param type The content model type. * * @throws XNIException Thrown by handler to signal an error. * * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_EMPTY * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_ANY * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_MIXED * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 The start of a content model. Depending on the type of the content model, specific methods may be called between the call to the startContentModel method and the call to the endContentModel method. * @param elementName The name of the element. @param type The content model type. * @throws XNIException Thrown by handler to signal an error. * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_EMPTY @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_ANY @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_MIXED @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN 
public	TokenNamepublic	
void	TokenNamevoid	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// startContentModel 	TokenNameCOMMENT_LINE	startContentModel 
/** * A referenced element in a mixed content model. If the mixed content * model only allows text content, then this method will not be called * for that model. However, if this method is called for a mixed * content model, then the zero or more occurrence count is implied. * <p> * <strong>Note:</strong> This method is only called after a call to * the startContentModel method where the type is TYPE_MIXED. * * @param elementName The name of the referenced element. * * @throws XNIException Thrown by handler to signal an error. * * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_MIXED */	TokenNameCOMMENT_JAVADOC	 A referenced element in a mixed content model. If the mixed content model only allows text content, then this method will not be called for that model. However, if this method is called for a mixed content model, then the zero or more occurrence count is implied. <p> <strong>Note:</strong> This method is only called after a call to the startContentModel method where the type is TYPE_MIXED. * @param elementName The name of the referenced element. * @throws XNIException Thrown by handler to signal an error. * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_MIXED 
public	TokenNamepublic	
void	TokenNamevoid	
mixedElement	TokenNameIdentifier	 mixed Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// mixedElement 	TokenNameCOMMENT_LINE	mixedElement 
/** * The start of a children group. * <p> * <strong>Note:</strong> This method is only called after a call to * the startContentModel method where the type is TYPE_CHILDREN. * <p> * <strong>Note:</strong> Children groups can be nested and have * associated occurrence counts. * * @throws XNIException Thrown by handler to signal an error. * * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 The start of a children group. <p> <strong>Note:</strong> This method is only called after a call to the startContentModel method where the type is TYPE_CHILDREN. <p> <strong>Note:</strong> Children groups can be nested and have associated occurrence counts. * @throws XNIException Thrown by handler to signal an error. * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN 
public	TokenNamepublic	
void	TokenNamevoid	
childrenStartGroup	TokenNameIdentifier	 children Start Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// childrenStartGroup 	TokenNameCOMMENT_LINE	childrenStartGroup 
/** * A referenced element in a children content model. * * @param elementName The name of the referenced element. * * @throws XNIException Thrown by handler to signal an error. * * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 A referenced element in a children content model. * @param elementName The name of the referenced element. * @throws XNIException Thrown by handler to signal an error. * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN 
public	TokenNamepublic	
void	TokenNamevoid	
childrenElement	TokenNameIdentifier	 children Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// childrenElement 	TokenNameCOMMENT_LINE	childrenElement 
/** * The separator between choices or sequences of a children content * model. * <p> * <strong>Note:</strong> This method is only called after a call to * the startContentModel method where the type is TYPE_CHILDREN. * * @param separator The type of children separator. * * @throws XNIException Thrown by handler to signal an error. * * @see XMLDTDContentModelHandler#SEPARATOR_CHOICE * @see XMLDTDContentModelHandler#SEPARATOR_SEQUENCE * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 The separator between choices or sequences of a children content model. <p> <strong>Note:</strong> This method is only called after a call to the startContentModel method where the type is TYPE_CHILDREN. * @param separator The type of children separator. * @throws XNIException Thrown by handler to signal an error. * @see XMLDTDContentModelHandler#SEPARATOR_CHOICE @see XMLDTDContentModelHandler#SEPARATOR_SEQUENCE @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN 
public	TokenNamepublic	
void	TokenNamevoid	
childrenSeparator	TokenNameIdentifier	 children Separator
(	TokenNameLPAREN	
short	TokenNameshort	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// childrenSeparator 	TokenNameCOMMENT_LINE	childrenSeparator 
/** * The occurrence count for a child in a children content model. * <p> * <strong>Note:</strong> This method is only called after a call to * the startContentModel method where the type is TYPE_CHILDREN. * * @param occurrence The occurrence count for the last children element * or children group. * * @throws XNIException Thrown by handler to signal an error. * * @see XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE * @see XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE * @see XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 The occurrence count for a child in a children content model. <p> <strong>Note:</strong> This method is only called after a call to the startContentModel method where the type is TYPE_CHILDREN. * @param occurrence The occurrence count for the last children element or children group. * @throws XNIException Thrown by handler to signal an error. * @see XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE @see XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE @see XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN 
public	TokenNamepublic	
void	TokenNamevoid	
childrenOccurrence	TokenNameIdentifier	 children Occurrence
(	TokenNameLPAREN	
short	TokenNameshort	
occurrence	TokenNameIdentifier	 occurrence
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// childrenOccurrence 	TokenNameCOMMENT_LINE	childrenOccurrence 
/** * The end of a children group. * <p> * <strong>Note:</strong> This method is only called after a call to * the startContentModel method where the type is TYPE_CHILDREN. * * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN */	TokenNameCOMMENT_JAVADOC	 The end of a children group. <p> <strong>Note:</strong> This method is only called after a call to the startContentModel method where the type is TYPE_CHILDREN. * @see org.apache.xerces.impl.dtd.XMLElementDecl#TYPE_CHILDREN 
public	TokenNamepublic	
void	TokenNamevoid	
childrenEndGroup	TokenNameIdentifier	 children End Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// childrenEndGroup 	TokenNameCOMMENT_LINE	childrenEndGroup 
/** * The end of a content model. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a content model. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// endContentModel 	TokenNameCOMMENT_LINE	endContentModel 
}	TokenNameRBRACE	
// class DTDParser 	TokenNameCOMMENT_LINE	class DTDParser 
