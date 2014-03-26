/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
/** * Commonly used constants. * * @xerces.internal * * @author Andy Clark, IBM * * @version $Id: Constants.java 915483 2010-02-23 19:00:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Commonly used constants. * @xerces.internal * @author Andy Clark, IBM * @version $Id: Constants.java 915483 2010-02-23 19:00:14Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// Schema Types: 	TokenNameCOMMENT_LINE	Schema Types: 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NS_XMLSCHEMA	TokenNameIdentifier	 NS  XMLSCHEMA
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NS_DTD	TokenNameIdentifier	 NS  DTD
=	TokenNameEQUAL	
"http://www.w3.org/TR/REC-xml"	TokenNameStringLiteral	http://www.w3.org/TR/REC-xml
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sax features 	TokenNameCOMMENT_LINE	sax features 
/** SAX feature prefix ("http://xml.org/sax/features/"). */	TokenNameCOMMENT_JAVADOC	 SAX feature prefix ("http://xml.org/sax/features/"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
=	TokenNameEQUAL	
"http://xml.org/sax/features/"	TokenNameStringLiteral	http://xml.org/sax/features/
;	TokenNameSEMICOLON	
/** Namespaces feature ("namespaces"). */	TokenNameCOMMENT_JAVADOC	 Namespaces feature ("namespaces"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
=	TokenNameEQUAL	
"namespaces"	TokenNameStringLiteral	namespaces
;	TokenNameSEMICOLON	
/** Namespace prefixes feature ("namespace-prefixes"). */	TokenNameCOMMENT_JAVADOC	 Namespace prefixes feature ("namespace-prefixes"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_PREFIXES_FEATURE	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE
=	TokenNameEQUAL	
"namespace-prefixes"	TokenNameStringLiteral	namespace-prefixes
;	TokenNameSEMICOLON	
/** String interning feature ("string-interning"). */	TokenNameCOMMENT_JAVADOC	 String interning feature ("string-interning"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_INTERNING_FEATURE	TokenNameIdentifier	 STRING  INTERNING  FEATURE
=	TokenNameEQUAL	
"string-interning"	TokenNameStringLiteral	string-interning
;	TokenNameSEMICOLON	
/** Validation feature ("validation"). */	TokenNameCOMMENT_JAVADOC	 Validation feature ("validation"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
=	TokenNameEQUAL	
"validation"	TokenNameStringLiteral	validation
;	TokenNameSEMICOLON	
/** External general entities feature ("external-general-entities "). */	TokenNameCOMMENT_JAVADOC	 External general entities feature ("external-general-entities "). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXTERNAL_GENERAL_ENTITIES_FEATURE	TokenNameIdentifier	 EXTERNAL  GENERAL  ENTITIES  FEATURE
=	TokenNameEQUAL	
"external-general-entities"	TokenNameStringLiteral	external-general-entities
;	TokenNameSEMICOLON	
/** External parameter entities feature ("external-parameter-entities "). */	TokenNameCOMMENT_JAVADOC	 External parameter entities feature ("external-parameter-entities "). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXTERNAL_PARAMETER_ENTITIES_FEATURE	TokenNameIdentifier	 EXTERNAL  PARAMETER  ENTITIES  FEATURE
=	TokenNameEQUAL	
"external-parameter-entities"	TokenNameStringLiteral	external-parameter-entities
;	TokenNameSEMICOLON	
/** Lexical handler parameter entities feature ("lexical-handler/parameter-entities"). */	TokenNameCOMMENT_JAVADOC	 Lexical handler parameter entities feature ("lexical-handler/parameter-entities"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LEXICAL_HANDLER_PARAMETER_ENTITIES_FEATURE	TokenNameIdentifier	 LEXICAL  HANDLER  PARAMETER  ENTITIES  FEATURE
=	TokenNameEQUAL	
"lexical-handler/parameter-entities"	TokenNameStringLiteral	lexical-handler/parameter-entities
;	TokenNameSEMICOLON	
/** Is standalone feature ("is-standalone"). */	TokenNameCOMMENT_JAVADOC	 Is standalone feature ("is-standalone"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IS_STANDALONE_FEATURE	TokenNameIdentifier	 IS  STANDALONE  FEATURE
=	TokenNameEQUAL	
"is-standalone"	TokenNameStringLiteral	is-standalone
;	TokenNameSEMICOLON	
/** Resolve DTD URIs feature ("resolve-dtd-uris"). */	TokenNameCOMMENT_JAVADOC	 Resolve DTD URIs feature ("resolve-dtd-uris"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESOLVE_DTD_URIS_FEATURE	TokenNameIdentifier	 RESOLVE  DTD  URIS  FEATURE
=	TokenNameEQUAL	
"resolve-dtd-uris"	TokenNameStringLiteral	resolve-dtd-uris
;	TokenNameSEMICOLON	
/** Use Attributes2 feature ("use-attributes2"). */	TokenNameCOMMENT_JAVADOC	 Use Attributes2 feature ("use-attributes2"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USE_ATTRIBUTES2_FEATURE	TokenNameIdentifier	 USE  ATTRIBUTE S2  FEATURE
=	TokenNameEQUAL	
"use-attributes2"	TokenNameStringLiteral	use-attributes2
;	TokenNameSEMICOLON	
/** Use Locator2 feature ("use-locator2"). */	TokenNameCOMMENT_JAVADOC	 Use Locator2 feature ("use-locator2"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USE_LOCATOR2_FEATURE	TokenNameIdentifier	 USE  LOCATO R2  FEATURE
=	TokenNameEQUAL	
"use-locator2"	TokenNameStringLiteral	use-locator2
;	TokenNameSEMICOLON	
/** Use EntityResolver2 feature ("use-entity-resolver2"). */	TokenNameCOMMENT_JAVADOC	 Use EntityResolver2 feature ("use-entity-resolver2"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USE_ENTITY_RESOLVER2_FEATURE	TokenNameIdentifier	 USE  ENTITY  RESOLVE R2  FEATURE
=	TokenNameEQUAL	
"use-entity-resolver2"	TokenNameStringLiteral	use-entity-resolver2
;	TokenNameSEMICOLON	
/** Unicode normalization checking feature ("unicode-normalization-checking"). */	TokenNameCOMMENT_JAVADOC	 Unicode normalization checking feature ("unicode-normalization-checking"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNICODE_NORMALIZATION_CHECKING_FEATURE	TokenNameIdentifier	 UNICODE  NORMALIZATION  CHECKING  FEATURE
=	TokenNameEQUAL	
"unicode-normalization-checking"	TokenNameStringLiteral	unicode-normalization-checking
;	TokenNameSEMICOLON	
/** xmlns URIs feature ("xmlns-uris"). */	TokenNameCOMMENT_JAVADOC	 xmlns URIs feature ("xmlns-uris"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_URIS_FEATURE	TokenNameIdentifier	 XMLNS  URIS  FEATURE
=	TokenNameEQUAL	
"xmlns-uris"	TokenNameStringLiteral	xmlns-uris
;	TokenNameSEMICOLON	
/** XML 1.1 feature ("xml-1.1"). */	TokenNameCOMMENT_JAVADOC	 XML 1.1 feature ("xml-1.1"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_11_FEATURE	TokenNameIdentifier	 XML 11  FEATURE
=	TokenNameEQUAL	
"xml-1.1"	TokenNameStringLiteral	xml-1.1
;	TokenNameSEMICOLON	
/** Allow unparsed entity and notation declaration events to be sent after the end DTD event ("allow-dtd-events-after-endDTD") */	TokenNameCOMMENT_JAVADOC	 Allow unparsed entity and notation declaration events to be sent after the end DTD event ("allow-dtd-events-after-endDTD") 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALLOW_DTD_EVENTS_AFTER_ENDDTD_FEATURE	TokenNameIdentifier	 ALLOW  DTD  EVENTS  AFTER  ENDDTD  FEATURE
=	TokenNameEQUAL	
"allow-dtd-events-after-endDTD"	TokenNameStringLiteral	allow-dtd-events-after-endDTD
;	TokenNameSEMICOLON	
// sax properties 	TokenNameCOMMENT_LINE	sax properties 
/** SAX property prefix ("http://xml.org/sax/properties/"). */	TokenNameCOMMENT_JAVADOC	 SAX property prefix ("http://xml.org/sax/properties/"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_PROPERTY_PREFIX	TokenNameIdentifier	 SAX  PROPERTY  PREFIX
=	TokenNameEQUAL	
"http://xml.org/sax/properties/"	TokenNameStringLiteral	http://xml.org/sax/properties/
;	TokenNameSEMICOLON	
/** Declaration handler property ("declaration-handler"). */	TokenNameCOMMENT_JAVADOC	 Declaration handler property ("declaration-handler"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DECLARATION_HANDLER_PROPERTY	TokenNameIdentifier	 DECLARATION  HANDLER  PROPERTY
=	TokenNameEQUAL	
"declaration-handler"	TokenNameStringLiteral	declaration-handler
;	TokenNameSEMICOLON	
/** Lexical handler property ("lexical-handler"). */	TokenNameCOMMENT_JAVADOC	 Lexical handler property ("lexical-handler"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LEXICAL_HANDLER_PROPERTY	TokenNameIdentifier	 LEXICAL  HANDLER  PROPERTY
=	TokenNameEQUAL	
"lexical-handler"	TokenNameStringLiteral	lexical-handler
;	TokenNameSEMICOLON	
/** DOM node property ("dom-node"). */	TokenNameCOMMENT_JAVADOC	 DOM node property ("dom-node"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NODE_PROPERTY	TokenNameIdentifier	 DOM  NODE  PROPERTY
=	TokenNameEQUAL	
"dom-node"	TokenNameStringLiteral	dom-node
;	TokenNameSEMICOLON	
/** XML string property ("xml-string"). */	TokenNameCOMMENT_JAVADOC	 XML string property ("xml-string"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_STRING_PROPERTY	TokenNameIdentifier	 XML  STRING  PROPERTY
=	TokenNameEQUAL	
"xml-string"	TokenNameStringLiteral	xml-string
;	TokenNameSEMICOLON	
/** Document XML version property ("document-xml-version"). */	TokenNameCOMMENT_JAVADOC	 Document XML version property ("document-xml-version"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCUMENT_XML_VERSION_PROPERTY	TokenNameIdentifier	 DOCUMENT  XML  VERSION  PROPERTY
=	TokenNameEQUAL	
"document-xml-version"	TokenNameStringLiteral	document-xml-version
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// JAXP properties 	TokenNameCOMMENT_LINE	JAXP properties 
// 	TokenNameCOMMENT_LINE	 
/** JAXP property prefix ("http://java.sun.com/xml/jaxp/properties/"). */	TokenNameCOMMENT_JAVADOC	 JAXP property prefix ("http://java.sun.com/xml/jaxp/properties/"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP_PROPERTY_PREFIX	TokenNameIdentifier	 JAXP  PROPERTY  PREFIX
=	TokenNameEQUAL	
"http://java.sun.com/xml/jaxp/properties/"	TokenNameStringLiteral	http://java.sun.com/xml/jaxp/properties/
;	TokenNameSEMICOLON	
/** JAXP schemaSource property: when used internally may include DTD sources (DOM) */	TokenNameCOMMENT_JAVADOC	 JAXP schemaSource property: when used internally may include DTD sources (DOM) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_SOURCE	TokenNameIdentifier	 SCHEMA  SOURCE
=	TokenNameEQUAL	
"schemaSource"	TokenNameStringLiteral	schemaSource
;	TokenNameSEMICOLON	
/** JAXP schemaSource language: when used internally may include DTD namespace (DOM) */	TokenNameCOMMENT_JAVADOC	 JAXP schemaSource language: when used internally may include DTD namespace (DOM) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_LANGUAGE	TokenNameIdentifier	 SCHEMA  LANGUAGE
=	TokenNameEQUAL	
"schemaLanguage"	TokenNameStringLiteral	schemaLanguage
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// DOM features 	TokenNameCOMMENT_LINE	DOM features 
// 	TokenNameCOMMENT_LINE	 
/** Comments feature ("include-comments"). */	TokenNameCOMMENT_JAVADOC	 Comments feature ("include-comments"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INCLUDE_COMMENTS_FEATURE	TokenNameIdentifier	 INCLUDE  COMMENTS  FEATURE
=	TokenNameEQUAL	
"include-comments"	TokenNameStringLiteral	include-comments
;	TokenNameSEMICOLON	
/** Create cdata nodes feature ("create-cdata-nodes"). */	TokenNameCOMMENT_JAVADOC	 Create cdata nodes feature ("create-cdata-nodes"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CREATE_CDATA_NODES_FEATURE	TokenNameIdentifier	 CREATE  CDATA  NODES  FEATURE
=	TokenNameEQUAL	
"create-cdata-nodes"	TokenNameStringLiteral	create-cdata-nodes
;	TokenNameSEMICOLON	
/** Feature id: load as infoset. */	TokenNameCOMMENT_JAVADOC	 Feature id: load as infoset. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOAD_AS_INFOSET	TokenNameIdentifier	 LOAD  AS  INFOSET
=	TokenNameEQUAL	
"load-as-infoset"	TokenNameStringLiteral	load-as-infoset
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constants: DOM Level 3 feature ids 	TokenNameCOMMENT_LINE	Constants: DOM Level 3 feature ids 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CANONICAL_FORM	TokenNameIdentifier	 DOM  CANONICAL  FORM
=	TokenNameEQUAL	
"canonical-form"	TokenNameStringLiteral	canonical-form
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CDATA_SECTIONS	TokenNameIdentifier	 DOM  CDATA  SECTIONS
=	TokenNameEQUAL	
"cdata-sections"	TokenNameStringLiteral	cdata-sections
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_COMMENTS	TokenNameIdentifier	 DOM  COMMENTS
=	TokenNameEQUAL	
"comments"	TokenNameStringLiteral	comments
;	TokenNameSEMICOLON	
// REVISIT: this feature seems to have no effect for Xerces 	TokenNameCOMMENT_LINE	REVISIT: this feature seems to have no effect for Xerces 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CHARSET_OVERRIDES_XML_ENCODING	TokenNameIdentifier	 DOM  CHARSET  OVERRIDES  XML  ENCODING
=	TokenNameEQUAL	
"charset-overrides-xml-encoding"	TokenNameStringLiteral	charset-overrides-xml-encoding
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_DATATYPE_NORMALIZATION	TokenNameIdentifier	 DOM  DATATYPE  NORMALIZATION
=	TokenNameEQUAL	
"datatype-normalization"	TokenNameStringLiteral	datatype-normalization
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ENTITIES	TokenNameIdentifier	 DOM  ENTITIES
=	TokenNameEQUAL	
"entities"	TokenNameStringLiteral	entities
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_INFOSET	TokenNameIdentifier	 DOM  INFOSET
=	TokenNameEQUAL	
"infoset"	TokenNameStringLiteral	infoset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NAMESPACES	TokenNameIdentifier	 DOM  NAMESPACES
=	TokenNameEQUAL	
"namespaces"	TokenNameStringLiteral	namespaces
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NAMESPACE_DECLARATIONS	TokenNameIdentifier	 DOM  NAMESPACE  DECLARATIONS
=	TokenNameEQUAL	
"namespace-declarations"	TokenNameStringLiteral	namespace-declarations
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SUPPORTED_MEDIATYPES_ONLY	TokenNameIdentifier	 DOM  SUPPORTED  MEDIATYPES  ONLY
=	TokenNameEQUAL	
"supported-media-types-only"	TokenNameStringLiteral	supported-media-types-only
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_VALIDATE_IF_SCHEMA	TokenNameIdentifier	 DOM  VALIDATE  IF  SCHEMA
=	TokenNameEQUAL	
"validate-if-schema"	TokenNameStringLiteral	validate-if-schema
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_VALIDATE	TokenNameIdentifier	 DOM  VALIDATE
=	TokenNameEQUAL	
"validate"	TokenNameStringLiteral	validate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ELEMENT_CONTENT_WHITESPACE	TokenNameIdentifier	 DOM  ELEMENT  CONTENT  WHITESPACE
=	TokenNameEQUAL	
"element-content-whitespace"	TokenNameStringLiteral	element-content-whitespace
;	TokenNameSEMICOLON	
// DOM Level 3 features defined in Core: 	TokenNameCOMMENT_LINE	DOM Level 3 features defined in Core: 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_DISCARD_DEFAULT_CONTENT	TokenNameIdentifier	 DOM  DISCARD  DEFAULT  CONTENT
=	TokenNameEQUAL	
"discard-default-content"	TokenNameStringLiteral	discard-default-content
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NORMALIZE_CHARACTERS	TokenNameIdentifier	 DOM  NORMALIZE  CHARACTERS
=	TokenNameEQUAL	
"normalize-characters"	TokenNameStringLiteral	normalize-characters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CHECK_CHAR_NORMALIZATION	TokenNameIdentifier	 DOM  CHECK  CHAR  NORMALIZATION
=	TokenNameEQUAL	
"check-character-normalization"	TokenNameStringLiteral	check-character-normalization
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_WELLFORMED	TokenNameIdentifier	 DOM  WELLFORMED
=	TokenNameEQUAL	
"well-formed"	TokenNameStringLiteral	well-formed
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SPLIT_CDATA	TokenNameIdentifier	 DOM  SPLIT  CDATA
=	TokenNameEQUAL	
"split-cdata-sections"	TokenNameStringLiteral	split-cdata-sections
;	TokenNameSEMICOLON	
// Load and Save 	TokenNameCOMMENT_LINE	Load and Save 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_FORMAT_PRETTY_PRINT	TokenNameIdentifier	 DOM  FORMAT  PRETTY  PRINT
=	TokenNameEQUAL	
"format-pretty-print"	TokenNameStringLiteral	format-pretty-print
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_XMLDECL	TokenNameIdentifier	 DOM  XMLDECL
=	TokenNameEQUAL	
"xml-declaration"	TokenNameStringLiteral	xml-declaration
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_UNKNOWNCHARS	TokenNameIdentifier	 DOM  UNKNOWNCHARS
=	TokenNameEQUAL	
"unknown-characters"	TokenNameStringLiteral	unknown-characters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CERTIFIED	TokenNameIdentifier	 DOM  CERTIFIED
=	TokenNameEQUAL	
"certified"	TokenNameStringLiteral	certified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_DISALLOW_DOCTYPE	TokenNameIdentifier	 DOM  DISALLOW  DOCTYPE
=	TokenNameEQUAL	
"disallow-doctype"	TokenNameStringLiteral	disallow-doctype
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_IGNORE_UNKNOWN_CHARACTER_DENORMALIZATIONS	TokenNameIdentifier	 DOM  IGNORE  UNKNOWN  CHARACTER  DENORMALIZATIONS
=	TokenNameEQUAL	
"ignore-unknown-character-denormalizations"	TokenNameStringLiteral	ignore-unknown-character-denormalizations
;	TokenNameSEMICOLON	
// DOM Properties 	TokenNameCOMMENT_LINE	DOM Properties 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_RESOURCE_RESOLVER	TokenNameIdentifier	 DOM  RESOURCE  RESOLVER
=	TokenNameEQUAL	
"resource-resolver"	TokenNameStringLiteral	resource-resolver
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ERROR_HANDLER	TokenNameIdentifier	 DOM  ERROR  HANDLER
=	TokenNameEQUAL	
"error-handler"	TokenNameStringLiteral	error-handler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SCHEMA_TYPE	TokenNameIdentifier	 DOM  SCHEMA  TYPE
=	TokenNameEQUAL	
"schema-type"	TokenNameStringLiteral	schema-type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SCHEMA_LOCATION	TokenNameIdentifier	 DOM  SCHEMA  LOCATION
=	TokenNameEQUAL	
"schema-location"	TokenNameStringLiteral	schema-location
;	TokenNameSEMICOLON	
// XSModel 	TokenNameCOMMENT_LINE	XSModel 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_PSVI	TokenNameIdentifier	 DOM  PSVI
=	TokenNameEQUAL	
"psvi"	TokenNameStringLiteral	psvi
;	TokenNameSEMICOLON	
// xerces features 	TokenNameCOMMENT_LINE	xerces features 
/** Xerces features prefix ("http://apache.org/xml/features/"). */	TokenNameCOMMENT_JAVADOC	 Xerces features prefix ("http://apache.org/xml/features/"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
=	TokenNameEQUAL	
"http://apache.org/xml/features/"	TokenNameStringLiteral	http://apache.org/xml/features/
;	TokenNameSEMICOLON	
/** Schema validation feature ("validation/schema"). */	TokenNameCOMMENT_JAVADOC	 Schema validation feature ("validation/schema"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATION_FEATURE	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE
=	TokenNameEQUAL	
"validation/schema"	TokenNameStringLiteral	validation/schema
;	TokenNameSEMICOLON	
/** Expose schema normalized values */	TokenNameCOMMENT_JAVADOC	 Expose schema normalized values 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_NORMALIZED_VALUE	TokenNameIdentifier	 SCHEMA  NORMALIZED  VALUE
=	TokenNameEQUAL	
"validation/schema/normalized-value"	TokenNameStringLiteral	validation/schema/normalized-value
;	TokenNameSEMICOLON	
/** Send schema default value via characters() */	TokenNameCOMMENT_JAVADOC	 Send schema default value via characters() 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
=	TokenNameEQUAL	
"validation/schema/element-default"	TokenNameStringLiteral	validation/schema/element-default
;	TokenNameSEMICOLON	
/** Schema full constraint checking ("validation/schema-full-checking"). */	TokenNameCOMMENT_JAVADOC	 Schema full constraint checking ("validation/schema-full-checking"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_FULL_CHECKING	TokenNameIdentifier	 SCHEMA  FULL  CHECKING
=	TokenNameEQUAL	
"validation/schema-full-checking"	TokenNameStringLiteral	validation/schema-full-checking
;	TokenNameSEMICOLON	
/** Augment Post-Schema-Validation-Infoset */	TokenNameCOMMENT_JAVADOC	 Augment Post-Schema-Validation-Infoset 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_AUGMENT_PSVI	TokenNameIdentifier	 SCHEMA  AUGMENT  PSVI
=	TokenNameEQUAL	
"validation/schema/augment-psvi"	TokenNameStringLiteral	validation/schema/augment-psvi
;	TokenNameSEMICOLON	
/** Dynamic validation feature ("validation/dynamic"). */	TokenNameCOMMENT_JAVADOC	 Dynamic validation feature ("validation/dynamic"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DYNAMIC_VALIDATION_FEATURE	TokenNameIdentifier	 DYNAMIC  VALIDATION  FEATURE
=	TokenNameEQUAL	
"validation/dynamic"	TokenNameStringLiteral	validation/dynamic
;	TokenNameSEMICOLON	
/** Warn on duplicate attribute declaration feature ("validation/warn-on-duplicate-attdef"). */	TokenNameCOMMENT_JAVADOC	 Warn on duplicate attribute declaration feature ("validation/warn-on-duplicate-attdef"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARN_ON_DUPLICATE_ATTDEF_FEATURE	TokenNameIdentifier	 WARN  ON  DUPLICATE  ATTDEF  FEATURE
=	TokenNameEQUAL	
"validation/warn-on-duplicate-attdef"	TokenNameStringLiteral	validation/warn-on-duplicate-attdef
;	TokenNameSEMICOLON	
/** Warn on undeclared element feature ("validation/warn-on-undeclared-elemdef"). */	TokenNameCOMMENT_JAVADOC	 Warn on undeclared element feature ("validation/warn-on-undeclared-elemdef"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARN_ON_UNDECLARED_ELEMDEF_FEATURE	TokenNameIdentifier	 WARN  ON  UNDECLARED  ELEMDEF  FEATURE
=	TokenNameEQUAL	
"validation/warn-on-undeclared-elemdef"	TokenNameStringLiteral	validation/warn-on-undeclared-elemdef
;	TokenNameSEMICOLON	
/** Warn on duplicate entity declaration feature ("warn-on-duplicate-entitydef"). */	TokenNameCOMMENT_JAVADOC	 Warn on duplicate entity declaration feature ("warn-on-duplicate-entitydef"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARN_ON_DUPLICATE_ENTITYDEF_FEATURE	TokenNameIdentifier	 WARN  ON  DUPLICATE  ENTITYDEF  FEATURE
=	TokenNameEQUAL	
"warn-on-duplicate-entitydef"	TokenNameStringLiteral	warn-on-duplicate-entitydef
;	TokenNameSEMICOLON	
/** Allow Java encoding names feature ("allow-java-encodings"). */	TokenNameCOMMENT_JAVADOC	 Allow Java encoding names feature ("allow-java-encodings"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALLOW_JAVA_ENCODINGS_FEATURE	TokenNameIdentifier	 ALLOW  JAVA  ENCODINGS  FEATURE
=	TokenNameEQUAL	
"allow-java-encodings"	TokenNameStringLiteral	allow-java-encodings
;	TokenNameSEMICOLON	
/** Disallow DOCTYPE declaration feature ("disallow-doctype-decl"). */	TokenNameCOMMENT_JAVADOC	 Disallow DOCTYPE declaration feature ("disallow-doctype-decl"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DISALLOW_DOCTYPE_DECL_FEATURE	TokenNameIdentifier	 DISALLOW  DOCTYPE  DECL  FEATURE
=	TokenNameEQUAL	
"disallow-doctype-decl"	TokenNameStringLiteral	disallow-doctype-decl
;	TokenNameSEMICOLON	
/** Continue after fatal error feature ("continue-after-fatal-error"). */	TokenNameCOMMENT_JAVADOC	 Continue after fatal error feature ("continue-after-fatal-error"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
=	TokenNameEQUAL	
"continue-after-fatal-error"	TokenNameStringLiteral	continue-after-fatal-error
;	TokenNameSEMICOLON	
/** Load dtd grammar when nonvalidating feature ("nonvalidating/load-dtd-grammar"). */	TokenNameCOMMENT_JAVADOC	 Load dtd grammar when nonvalidating feature ("nonvalidating/load-dtd-grammar"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOAD_DTD_GRAMMAR_FEATURE	TokenNameIdentifier	 LOAD  DTD  GRAMMAR  FEATURE
=	TokenNameEQUAL	
"nonvalidating/load-dtd-grammar"	TokenNameStringLiteral	nonvalidating/load-dtd-grammar
;	TokenNameSEMICOLON	
/** Load external dtd when nonvalidating feature ("nonvalidating/load-external-dtd"). */	TokenNameCOMMENT_JAVADOC	 Load external dtd when nonvalidating feature ("nonvalidating/load-external-dtd"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOAD_EXTERNAL_DTD_FEATURE	TokenNameIdentifier	 LOAD  EXTERNAL  DTD  FEATURE
=	TokenNameEQUAL	
"nonvalidating/load-external-dtd"	TokenNameStringLiteral	nonvalidating/load-external-dtd
;	TokenNameSEMICOLON	
/** Defer node expansion feature ("dom/defer-node-expansion"). */	TokenNameCOMMENT_JAVADOC	 Defer node expansion feature ("dom/defer-node-expansion"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFER_NODE_EXPANSION_FEATURE	TokenNameIdentifier	 DEFER  NODE  EXPANSION  FEATURE
=	TokenNameEQUAL	
"dom/defer-node-expansion"	TokenNameStringLiteral	dom/defer-node-expansion
;	TokenNameSEMICOLON	
/** Create entity reference nodes feature ("dom/create-entity-ref-nodes"). */	TokenNameCOMMENT_JAVADOC	 Create entity reference nodes feature ("dom/create-entity-ref-nodes"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CREATE_ENTITY_REF_NODES_FEATURE	TokenNameIdentifier	 CREATE  ENTITY  REF  NODES  FEATURE
=	TokenNameEQUAL	
"dom/create-entity-ref-nodes"	TokenNameStringLiteral	dom/create-entity-ref-nodes
;	TokenNameSEMICOLON	
/** Include ignorable whitespace feature ("dom/include-ignorable-whitespace"). */	TokenNameCOMMENT_JAVADOC	 Include ignorable whitespace feature ("dom/include-ignorable-whitespace"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INCLUDE_IGNORABLE_WHITESPACE	TokenNameIdentifier	 INCLUDE  IGNORABLE  WHITESPACE
=	TokenNameEQUAL	
"dom/include-ignorable-whitespace"	TokenNameStringLiteral	dom/include-ignorable-whitespace
;	TokenNameSEMICOLON	
/** Default attribute values feature ("validation/default-attribute-values"). */	TokenNameCOMMENT_JAVADOC	 Default attribute values feature ("validation/default-attribute-values"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ATTRIBUTE_VALUES_FEATURE	TokenNameIdentifier	 DEFAULT  ATTRIBUTE  VALUES  FEATURE
=	TokenNameEQUAL	
"validation/default-attribute-values"	TokenNameStringLiteral	validation/default-attribute-values
;	TokenNameSEMICOLON	
/** Validate content models feature ("validation/validate-content-models"). */	TokenNameCOMMENT_JAVADOC	 Validate content models feature ("validation/validate-content-models"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATE_CONTENT_MODELS_FEATURE	TokenNameIdentifier	 VALIDATE  CONTENT  MODELS  FEATURE
=	TokenNameEQUAL	
"validation/validate-content-models"	TokenNameStringLiteral	validation/validate-content-models
;	TokenNameSEMICOLON	
/** Validate datatypes feature ("validation/validate-datatypes"). */	TokenNameCOMMENT_JAVADOC	 Validate datatypes feature ("validation/validate-datatypes"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATE_DATATYPES_FEATURE	TokenNameIdentifier	 VALIDATE  DATATYPES  FEATURE
=	TokenNameEQUAL	
"validation/validate-datatypes"	TokenNameStringLiteral	validation/validate-datatypes
;	TokenNameSEMICOLON	
/** Balance syntax trees feature ("validation/balance-syntax-trees"). */	TokenNameCOMMENT_JAVADOC	 Balance syntax trees feature ("validation/balance-syntax-trees"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BALANCE_SYNTAX_TREES	TokenNameIdentifier	 BALANCE  SYNTAX  TREES
=	TokenNameEQUAL	
"validation/balance-syntax-trees"	TokenNameStringLiteral	validation/balance-syntax-trees
;	TokenNameSEMICOLON	
/** Notify character references feature (scanner/notify-char-refs"). */	TokenNameCOMMENT_JAVADOC	 Notify character references feature (scanner/notify-char-refs"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOTIFY_CHAR_REFS_FEATURE	TokenNameIdentifier	 NOTIFY  CHAR  REFS  FEATURE
=	TokenNameEQUAL	
"scanner/notify-char-refs"	TokenNameStringLiteral	scanner/notify-char-refs
;	TokenNameSEMICOLON	
/** Notify built-in (&amp;amp;, etc.) references feature (scanner/notify-builtin-refs"). */	TokenNameCOMMENT_JAVADOC	 Notify built-in (&amp;amp;, etc.) references feature (scanner/notify-builtin-refs"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOTIFY_BUILTIN_REFS_FEATURE	TokenNameIdentifier	 NOTIFY  BUILTIN  REFS  FEATURE
=	TokenNameEQUAL	
"scanner/notify-builtin-refs"	TokenNameStringLiteral	scanner/notify-builtin-refs
;	TokenNameSEMICOLON	
/** Standard URI conformant feature ("standard-uri-conformant"). */	TokenNameCOMMENT_JAVADOC	 Standard URI conformant feature ("standard-uri-conformant"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STANDARD_URI_CONFORMANT_FEATURE	TokenNameIdentifier	 STANDARD  URI  CONFORMANT  FEATURE
=	TokenNameEQUAL	
"standard-uri-conformant"	TokenNameStringLiteral	standard-uri-conformant
;	TokenNameSEMICOLON	
/** Generate synthetic annotations feature ("generate-synthetic-annotations"). */	TokenNameCOMMENT_JAVADOC	 Generate synthetic annotations feature ("generate-synthetic-annotations"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GENERATE_SYNTHETIC_ANNOTATIONS_FEATURE	TokenNameIdentifier	 GENERATE  SYNTHETIC  ANNOTATIONS  FEATURE
=	TokenNameEQUAL	
"generate-synthetic-annotations"	TokenNameStringLiteral	generate-synthetic-annotations
;	TokenNameSEMICOLON	
/** Validate annotations feature ("validate-annotations"). */	TokenNameCOMMENT_JAVADOC	 Validate annotations feature ("validate-annotations"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATE_ANNOTATIONS_FEATURE	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  FEATURE
=	TokenNameEQUAL	
"validate-annotations"	TokenNameStringLiteral	validate-annotations
;	TokenNameSEMICOLON	
/** Honour all schemaLocations feature ("honour-all-schemaLocations"). */	TokenNameCOMMENT_JAVADOC	 Honour all schemaLocations feature ("honour-all-schemaLocations"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HONOUR_ALL_SCHEMALOCATIONS_FEATURE	TokenNameIdentifier	 HONOUR  ALL  SCHEMALOCATIONS  FEATURE
=	TokenNameEQUAL	
"honour-all-schemaLocations"	TokenNameStringLiteral	honour-all-schemaLocations
;	TokenNameSEMICOLON	
/** Namespace growth feature ("namespace-growth"). */	TokenNameCOMMENT_JAVADOC	 Namespace growth feature ("namespace-growth"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_GROWTH_FEATURE	TokenNameIdentifier	 NAMESPACE  GROWTH  FEATURE
=	TokenNameEQUAL	
"namespace-growth"	TokenNameStringLiteral	namespace-growth
;	TokenNameSEMICOLON	
/** Tolerate duplicates feature ("internal/tolerate-duplicates"). */	TokenNameCOMMENT_JAVADOC	 Tolerate duplicates feature ("internal/tolerate-duplicates"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOLERATE_DUPLICATES_FEATURE	TokenNameIdentifier	 TOLERATE  DUPLICATES  FEATURE
=	TokenNameEQUAL	
"internal/tolerate-duplicates"	TokenNameStringLiteral	internal/tolerate-duplicates
;	TokenNameSEMICOLON	
/** String interned feature ("internal/strings-interned"). */	TokenNameCOMMENT_JAVADOC	 String interned feature ("internal/strings-interned"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRINGS_INTERNED_FEATURE	TokenNameIdentifier	 STRINGS  INTERNED  FEATURE
=	TokenNameEQUAL	
"internal/strings-interned"	TokenNameStringLiteral	internal/strings-interned
;	TokenNameSEMICOLON	
/** XInclude processing feature ("xinclude"). */	TokenNameCOMMENT_JAVADOC	 XInclude processing feature ("xinclude"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
=	TokenNameEQUAL	
"xinclude"	TokenNameStringLiteral	xinclude
;	TokenNameSEMICOLON	
/** XInclude fixup base URIs feature ("xinclude/fixup-base-uris"). */	TokenNameCOMMENT_JAVADOC	 XInclude fixup base URIs feature ("xinclude/fixup-base-uris"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FIXUP_BASE_URIS_FEATURE	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE
=	TokenNameEQUAL	
"xinclude/fixup-base-uris"	TokenNameStringLiteral	xinclude/fixup-base-uris
;	TokenNameSEMICOLON	
/** XInclude fixup language feature ("xinclude/fixup-language"). */	TokenNameCOMMENT_JAVADOC	 XInclude fixup language feature ("xinclude/fixup-language"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FIXUP_LANGUAGE_FEATURE	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE
=	TokenNameEQUAL	
"xinclude/fixup-language"	TokenNameStringLiteral	xinclude/fixup-language
;	TokenNameSEMICOLON	
/** * Feature to ignore xsi:type attributes on elements during validation, * until a global element declaration is found. ("validation/schema/ignore-xsi-type-until-elemdecl") * If this feature is on when validating a document, then beginning at the validation root * element, xsi:type attributes are ignored until a global element declaration is * found for an element. Once a global element declaration has been found, xsi:type * attributes will start being processed for the sub-tree beginning at the element for * which the declaration was found. * * Suppose an element A has two element children, B and C. * * If a global element declaration is found for A, xsi:type attributes on A, B and C, * and all of B and C's descendents, will be processed. * * If no global element declaration is found for A or B, but one is found for C, * then xsi:type attributes will be ignored on A and B (and any descendents of B, * until a global element declaration is found), but xsi:type attributes will be * processed for C and all of C's descendents. * * Once xsi:type attributes stop being ignored for a subtree, they do not start * being ignored again, even if more elements are encountered for which no global * element declaration can be found. */	TokenNameCOMMENT_JAVADOC	 Feature to ignore xsi:type attributes on elements during validation, until a global element declaration is found. ("validation/schema/ignore-xsi-type-until-elemdecl") If this feature is on when validating a document, then beginning at the validation root element, xsi:type attributes are ignored until a global element declaration is found for an element. Once a global element declaration has been found, xsi:type attributes will start being processed for the sub-tree beginning at the element for which the declaration was found. * Suppose an element A has two element children, B and C. * If a global element declaration is found for A, xsi:type attributes on A, B and C, and all of B and C's descendents, will be processed. * If no global element declaration is found for A or B, but one is found for C, then xsi:type attributes will be ignored on A and B (and any descendents of B, until a global element declaration is found), but xsi:type attributes will be processed for C and all of C's descendents. * Once xsi:type attributes stop being ignored for a subtree, they do not start being ignored again, even if more elements are encountered for which no global element declaration can be found. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IGNORE_XSI_TYPE_FEATURE	TokenNameIdentifier	 IGNORE  XSI  TYPE  FEATURE
=	TokenNameEQUAL	
"validation/schema/ignore-xsi-type-until-elemdecl"	TokenNameStringLiteral	validation/schema/ignore-xsi-type-until-elemdecl
;	TokenNameSEMICOLON	
/** Perform checking of ID/IDREFs ("validation/id-idref-checking") */	TokenNameCOMMENT_JAVADOC	 Perform checking of ID/IDREFs ("validation/id-idref-checking") 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ID_IDREF_CHECKING_FEATURE	TokenNameIdentifier	 ID  IDREF  CHECKING  FEATURE
=	TokenNameEQUAL	
"validation/id-idref-checking"	TokenNameStringLiteral	validation/id-idref-checking
;	TokenNameSEMICOLON	
/** Feature to ignore errors caused by identity constraints ("validation/identity-constraint-checking") */	TokenNameCOMMENT_JAVADOC	 Feature to ignore errors caused by identity constraints ("validation/identity-constraint-checking") 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IDC_CHECKING_FEATURE	TokenNameIdentifier	 IDC  CHECKING  FEATURE
=	TokenNameEQUAL	
"validation/identity-constraint-checking"	TokenNameStringLiteral	validation/identity-constraint-checking
;	TokenNameSEMICOLON	
/** Feature to ignore errors caused by unparsed entities ("validation/unparsed-entity-checking") */	TokenNameCOMMENT_JAVADOC	 Feature to ignore errors caused by unparsed entities ("validation/unparsed-entity-checking") 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNPARSED_ENTITY_CHECKING_FEATURE	TokenNameIdentifier	 UNPARSED  ENTITY  CHECKING  FEATURE
=	TokenNameEQUAL	
"validation/unparsed-entity-checking"	TokenNameStringLiteral	validation/unparsed-entity-checking
;	TokenNameSEMICOLON	
/** * Internal feature. When set to true the schema validator will only use * schema components from the grammar pool provided. */	TokenNameCOMMENT_JAVADOC	 Internal feature. When set to true the schema validator will only use schema components from the grammar pool provided. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USE_GRAMMAR_POOL_ONLY_FEATURE	TokenNameIdentifier	 USE  GRAMMAR  POOL  ONLY  FEATURE
=	TokenNameEQUAL	
"internal/validation/schema/use-grammar-pool-only"	TokenNameStringLiteral	internal/validation/schema/use-grammar-pool-only
;	TokenNameSEMICOLON	
/** Internal performance related feature: * false - the parser settings (features/properties) have not changed between 2 parses * true - the parser settings have changed between 2 parses * NOTE: this feature should only be set by the parser configuration. */	TokenNameCOMMENT_JAVADOC	 Internal performance related feature: false - the parser settings (features/properties) have not changed between 2 parses true - the parser settings have changed between 2 parses NOTE: this feature should only be set by the parser configuration. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
=	TokenNameEQUAL	
"internal/parser-settings"	TokenNameStringLiteral	internal/parser-settings
;	TokenNameSEMICOLON	
// xerces properties 	TokenNameCOMMENT_LINE	xerces properties 
/** Xerces properties prefix ("http://apache.org/xml/properties/"). */	TokenNameCOMMENT_JAVADOC	 Xerces properties prefix ("http://apache.org/xml/properties/"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
=	TokenNameEQUAL	
"http://apache.org/xml/properties/"	TokenNameStringLiteral	http://apache.org/xml/properties/
;	TokenNameSEMICOLON	
/** Current element node property ("dom/current-element-node"). */	TokenNameCOMMENT_JAVADOC	 Current element node property ("dom/current-element-node"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CURRENT_ELEMENT_NODE_PROPERTY	TokenNameIdentifier	 CURRENT  ELEMENT  NODE  PROPERTY
=	TokenNameEQUAL	
"dom/current-element-node"	TokenNameStringLiteral	dom/current-element-node
;	TokenNameSEMICOLON	
/** Document class name property ("dom/document-class-name"). */	TokenNameCOMMENT_JAVADOC	 Document class name property ("dom/document-class-name"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCUMENT_CLASS_NAME_PROPERTY	TokenNameIdentifier	 DOCUMENT  CLASS  NAME  PROPERTY
=	TokenNameEQUAL	
"dom/document-class-name"	TokenNameStringLiteral	dom/document-class-name
;	TokenNameSEMICOLON	
/** Symbol table property ("internal/symbol-table"). */	TokenNameCOMMENT_JAVADOC	 Symbol table property ("internal/symbol-table"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
=	TokenNameEQUAL	
"internal/symbol-table"	TokenNameStringLiteral	internal/symbol-table
;	TokenNameSEMICOLON	
/** Error reporter property ("internal/error-reporter"). */	TokenNameCOMMENT_JAVADOC	 Error reporter property ("internal/error-reporter"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
=	TokenNameEQUAL	
"internal/error-reporter"	TokenNameStringLiteral	internal/error-reporter
;	TokenNameSEMICOLON	
/** Error handler property ("internal/error-handler"). */	TokenNameCOMMENT_JAVADOC	 Error handler property ("internal/error-handler"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HANDLER_PROPERTY	TokenNameIdentifier	 ERROR  HANDLER  PROPERTY
=	TokenNameEQUAL	
"internal/error-handler"	TokenNameStringLiteral	internal/error-handler
;	TokenNameSEMICOLON	
/** XInclude handler property ("internal/xinclude-handler"). */	TokenNameCOMMENT_JAVADOC	 XInclude handler property ("internal/xinclude-handler"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_HANDLER_PROPERTY	TokenNameIdentifier	 XINCLUDE  HANDLER  PROPERTY
=	TokenNameEQUAL	
"internal/xinclude-handler"	TokenNameStringLiteral	internal/xinclude-handler
;	TokenNameSEMICOLON	
/** XPointer handler property ("internal/xpointer-handler"). */	TokenNameCOMMENT_JAVADOC	 XPointer handler property ("internal/xpointer-handler"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XPOINTER_HANDLER_PROPERTY	TokenNameIdentifier	 XPOINTER  HANDLER  PROPERTY
=	TokenNameEQUAL	
"internal/xpointer-handler"	TokenNameStringLiteral	internal/xpointer-handler
;	TokenNameSEMICOLON	
/** Entity manager property ("internal/entity-manager"). */	TokenNameCOMMENT_JAVADOC	 Entity manager property ("internal/entity-manager"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_MANAGER_PROPERTY	TokenNameIdentifier	 ENTITY  MANAGER  PROPERTY
=	TokenNameEQUAL	
"internal/entity-manager"	TokenNameStringLiteral	internal/entity-manager
;	TokenNameSEMICOLON	
/** Input buffer size property ("input-buffer-size"). */	TokenNameCOMMENT_JAVADOC	 Input buffer size property ("input-buffer-size"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUFFER_SIZE_PROPERTY	TokenNameIdentifier	 BUFFER  SIZE  PROPERTY
=	TokenNameEQUAL	
"input-buffer-size"	TokenNameStringLiteral	input-buffer-size
;	TokenNameSEMICOLON	
/** Security manager property ("security-manager"). */	TokenNameCOMMENT_JAVADOC	 Security manager property ("security-manager"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier	 SECURITY  MANAGER  PROPERTY
=	TokenNameEQUAL	
"security-manager"	TokenNameStringLiteral	security-manager
;	TokenNameSEMICOLON	
/** Locale property ("locale"). */	TokenNameCOMMENT_JAVADOC	 Locale property ("locale"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOCALE_PROPERTY	TokenNameIdentifier	 LOCALE  PROPERTY
=	TokenNameEQUAL	
"locale"	TokenNameStringLiteral	locale
;	TokenNameSEMICOLON	
/** Entity resolver property ("internal/entity-resolver"). */	TokenNameCOMMENT_JAVADOC	 Entity resolver property ("internal/entity-resolver"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_RESOLVER_PROPERTY	TokenNameIdentifier	 ENTITY  RESOLVER  PROPERTY
=	TokenNameEQUAL	
"internal/entity-resolver"	TokenNameStringLiteral	internal/entity-resolver
;	TokenNameSEMICOLON	
/** Grammar pool property ("internal/grammar-pool"). */	TokenNameCOMMENT_JAVADOC	 Grammar pool property ("internal/grammar-pool"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier	 XMLGRAMMAR  POOL  PROPERTY
=	TokenNameEQUAL	
"internal/grammar-pool"	TokenNameStringLiteral	internal/grammar-pool
;	TokenNameSEMICOLON	
/** Datatype validator factory ("internal/datatype-validator-factory"). */	TokenNameCOMMENT_JAVADOC	 Datatype validator factory ("internal/datatype-validator-factory"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATATYPE_VALIDATOR_FACTORY_PROPERTY	TokenNameIdentifier	 DATATYPE  VALIDATOR  FACTORY  PROPERTY
=	TokenNameEQUAL	
"internal/datatype-validator-factory"	TokenNameStringLiteral	internal/datatype-validator-factory
;	TokenNameSEMICOLON	
/** Document scanner property ("internal/document-scanner"). */	TokenNameCOMMENT_JAVADOC	 Document scanner property ("internal/document-scanner"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCUMENT_SCANNER_PROPERTY	TokenNameIdentifier	 DOCUMENT  SCANNER  PROPERTY
=	TokenNameEQUAL	
"internal/document-scanner"	TokenNameStringLiteral	internal/document-scanner
;	TokenNameSEMICOLON	
/** DTD scanner property ("internal/dtd-scanner"). */	TokenNameCOMMENT_JAVADOC	 DTD scanner property ("internal/dtd-scanner"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DTD_SCANNER_PROPERTY	TokenNameIdentifier	 DTD  SCANNER  PROPERTY
=	TokenNameEQUAL	
"internal/dtd-scanner"	TokenNameStringLiteral	internal/dtd-scanner
;	TokenNameSEMICOLON	
/** DTD processor property ("internal/dtd-processor"). */	TokenNameCOMMENT_JAVADOC	 DTD processor property ("internal/dtd-processor"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DTD_PROCESSOR_PROPERTY	TokenNameIdentifier	 DTD  PROCESSOR  PROPERTY
=	TokenNameEQUAL	
"internal/dtd-processor"	TokenNameStringLiteral	internal/dtd-processor
;	TokenNameSEMICOLON	
/** Validator property ("internal/validator"). */	TokenNameCOMMENT_JAVADOC	 Validator property ("internal/validator"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATOR_PROPERTY	TokenNameIdentifier	 VALIDATOR  PROPERTY
=	TokenNameEQUAL	
"internal/validator"	TokenNameStringLiteral	internal/validator
;	TokenNameSEMICOLON	
/** Validator property ("internal/validator/dtd"). */	TokenNameCOMMENT_JAVADOC	 Validator property ("internal/validator/dtd"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DTD_VALIDATOR_PROPERTY	TokenNameIdentifier	 DTD  VALIDATOR  PROPERTY
=	TokenNameEQUAL	
"internal/validator/dtd"	TokenNameStringLiteral	internal/validator/dtd
;	TokenNameSEMICOLON	
/** Validator property ("internal/validator/schema"). */	TokenNameCOMMENT_JAVADOC	 Validator property ("internal/validator/schema"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATOR_PROPERTY	TokenNameIdentifier	 SCHEMA  VALIDATOR  PROPERTY
=	TokenNameEQUAL	
"internal/validator/schema"	TokenNameStringLiteral	internal/validator/schema
;	TokenNameSEMICOLON	
/** No namespace schema location property ("schema/external-schemaLocation"). */	TokenNameCOMMENT_JAVADOC	 No namespace schema location property ("schema/external-schemaLocation"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
=	TokenNameEQUAL	
"schema/external-schemaLocation"	TokenNameStringLiteral	schema/external-schemaLocation
;	TokenNameSEMICOLON	
/** Schema location property ("schema/external-noNamespaceSchemaLocation"). */	TokenNameCOMMENT_JAVADOC	 Schema location property ("schema/external-noNamespaceSchemaLocation"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
=	TokenNameEQUAL	
"schema/external-noNamespaceSchemaLocation"	TokenNameStringLiteral	schema/external-noNamespaceSchemaLocation
;	TokenNameSEMICOLON	
/** Namespace binder property ("internal/namespace-binder"). */	TokenNameCOMMENT_JAVADOC	 Namespace binder property ("internal/namespace-binder"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_BINDER_PROPERTY	TokenNameIdentifier	 NAMESPACE  BINDER  PROPERTY
=	TokenNameEQUAL	
"internal/namespace-binder"	TokenNameStringLiteral	internal/namespace-binder
;	TokenNameSEMICOLON	
/** Namespace context property ("internal/namespace-context"). */	TokenNameCOMMENT_JAVADOC	 Namespace context property ("internal/namespace-context"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_CONTEXT_PROPERTY	TokenNameIdentifier	 NAMESPACE  CONTEXT  PROPERTY
=	TokenNameEQUAL	
"internal/namespace-context"	TokenNameStringLiteral	internal/namespace-context
;	TokenNameSEMICOLON	
/** Validation manager property ("internal/validation-manager"). */	TokenNameCOMMENT_JAVADOC	 Validation manager property ("internal/validation-manager"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_MANAGER_PROPERTY	TokenNameIdentifier	 VALIDATION  MANAGER  PROPERTY
=	TokenNameEQUAL	
"internal/validation-manager"	TokenNameStringLiteral	internal/validation-manager
;	TokenNameSEMICOLON	
/** Schema type for the root element in a document ("validation/schema/root-type-definition"). */	TokenNameCOMMENT_JAVADOC	 Schema type for the root element in a document ("validation/schema/root-type-definition"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROOT_TYPE_DEFINITION_PROPERTY	TokenNameIdentifier	 ROOT  TYPE  DEFINITION  PROPERTY
=	TokenNameEQUAL	
"validation/schema/root-type-definition"	TokenNameStringLiteral	validation/schema/root-type-definition
;	TokenNameSEMICOLON	
/** Schema element declaration for the root element in a document ("validation/schema/root-element-declaration"). */	TokenNameCOMMENT_JAVADOC	 Schema element declaration for the root element in a document ("validation/schema/root-element-declaration"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROOT_ELEMENT_DECLARATION_PROPERTY	TokenNameIdentifier	 ROOT  ELEMENT  DECLARATION  PROPERTY
=	TokenNameEQUAL	
"validation/schema/root-element-declaration"	TokenNameStringLiteral	validation/schema/root-element-declaration
;	TokenNameSEMICOLON	
/** Schema element declaration for the root element in a document ("internal/validation/schema/dv-factory"). */	TokenNameCOMMENT_JAVADOC	 Schema element declaration for the root element in a document ("internal/validation/schema/dv-factory"). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_DV_FACTORY_PROPERTY	TokenNameIdentifier	 SCHEMA  DV  FACTORY  PROPERTY
=	TokenNameEQUAL	
"internal/validation/schema/dv-factory"	TokenNameStringLiteral	internal/validation/schema/dv-factory
;	TokenNameSEMICOLON	
// general constants 	TokenNameCOMMENT_LINE	general constants 
/** Element PSVI is stored in augmentations using string "ELEMENT_PSVI" */	TokenNameCOMMENT_JAVADOC	 Element PSVI is stored in augmentations using string "ELEMENT_PSVI" 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ELEMENT_PSVI	TokenNameIdentifier	 ELEMENT  PSVI
=	TokenNameEQUAL	
"ELEMENT_PSVI"	TokenNameStringLiteral	ELEMENT_PSVI
;	TokenNameSEMICOLON	
/** Attribute PSVI is stored in augmentations using string "ATTRIBUTE_PSVI" */	TokenNameCOMMENT_JAVADOC	 Attribute PSVI is stored in augmentations using string "ATTRIBUTE_PSVI" 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ATTRIBUTE_PSVI	TokenNameIdentifier	 ATTRIBUTE  PSVI
=	TokenNameEQUAL	
"ATTRIBUTE_PSVI"	TokenNameStringLiteral	ATTRIBUTE_PSVI
;	TokenNameSEMICOLON	
/** * Boolean indicating whether an attribute is declared in the DTD is stored * in augmentations using the string "ATTRIBUTE_DECLARED". The absence of this * augmentation indicates that the attribute was not declared in the DTD. */	TokenNameCOMMENT_JAVADOC	 Boolean indicating whether an attribute is declared in the DTD is stored in augmentations using the string "ATTRIBUTE_DECLARED". The absence of this augmentation indicates that the attribute was not declared in the DTD. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ATTRIBUTE_DECLARED	TokenNameIdentifier	 ATTRIBUTE  DECLARED
=	TokenNameEQUAL	
"ATTRIBUTE_DECLARED"	TokenNameStringLiteral	ATTRIBUTE_DECLARED
;	TokenNameSEMICOLON	
/** * Boolean indicating whether an entity referenced in the document has * not been read is stored in augmentations using the string "ENTITY_SKIPPED". * The absence of this augmentation indicates that the entity had a * declaration and was expanded. */	TokenNameCOMMENT_JAVADOC	 Boolean indicating whether an entity referenced in the document has not been read is stored in augmentations using the string "ENTITY_SKIPPED". The absence of this augmentation indicates that the entity had a declaration and was expanded. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ENTITY_SKIPPED	TokenNameIdentifier	 ENTITY  SKIPPED
=	TokenNameEQUAL	
"ENTITY_SKIPPED"	TokenNameStringLiteral	ENTITY_SKIPPED
;	TokenNameSEMICOLON	
/** * Boolean indicating whether a character is a probable white space * character (ch <= 0x20) that was the replacement text of a character * reference is stored in augmentations using the string "CHAR_REF_PROBABLE_WS". * The absence of this augmentation indicates that the character is not * probable white space and/or was not included from a character reference. */	TokenNameCOMMENT_JAVADOC	 Boolean indicating whether a character is a probable white space character (ch <= 0x20) that was the replacement text of a character reference is stored in augmentations using the string "CHAR_REF_PROBABLE_WS". The absence of this augmentation indicates that the character is not probable white space and/or was not included from a character reference. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CHAR_REF_PROBABLE_WS	TokenNameIdentifier	 CHAR  REF  PROBABLE  WS
=	TokenNameEQUAL	
"CHAR_REF_PROBABLE_WS"	TokenNameStringLiteral	CHAR_REF_PROBABLE_WS
;	TokenNameSEMICOLON	
// XML version constants 	TokenNameCOMMENT_LINE	XML version constants 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
XML_VERSION_ERROR	TokenNameIdentifier	 XML  VERSION  ERROR
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
XML_VERSION_1_1	TokenNameIdentifier	 XML  VERSION 1 1
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Constant to enable Schema 1.1 support 	TokenNameCOMMENT_LINE	Constant to enable Schema 1.1 support 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
SCHEMA_1_1_SUPPORT	TokenNameIdentifier	 SCHEMA 1 1  SUPPORT
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
SCHEMA_VERSION_1_0	TokenNameIdentifier	 SCHEMA  VERSION 1 0
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
SCHEMA_VERSION_1_0_EXTENDED	TokenNameIdentifier	 SCHEMA  VERSION 1 0  EXTENDED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// private 	TokenNameCOMMENT_LINE	private 
/** SAX features. */	TokenNameCOMMENT_JAVADOC	 SAX features. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgSAXFeatures	TokenNameIdentifier	 fg SAX Features
=	TokenNameEQUAL	
{	TokenNameLBRACE	
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
,	TokenNameCOMMA	
NAMESPACE_PREFIXES_FEATURE	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE
,	TokenNameCOMMA	
STRING_INTERNING_FEATURE	TokenNameIdentifier	 STRING  INTERNING  FEATURE
,	TokenNameCOMMA	
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
,	TokenNameCOMMA	
EXTERNAL_GENERAL_ENTITIES_FEATURE	TokenNameIdentifier	 EXTERNAL  GENERAL  ENTITIES  FEATURE
,	TokenNameCOMMA	
EXTERNAL_PARAMETER_ENTITIES_FEATURE	TokenNameIdentifier	 EXTERNAL  PARAMETER  ENTITIES  FEATURE
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** SAX properties. */	TokenNameCOMMENT_JAVADOC	 SAX properties. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgSAXProperties	TokenNameIdentifier	 fg SAX Properties
=	TokenNameEQUAL	
{	TokenNameLBRACE	
DECLARATION_HANDLER_PROPERTY	TokenNameIdentifier	 DECLARATION  HANDLER  PROPERTY
,	TokenNameCOMMA	
LEXICAL_HANDLER_PROPERTY	TokenNameIdentifier	 LEXICAL  HANDLER  PROPERTY
,	TokenNameCOMMA	
DOM_NODE_PROPERTY	TokenNameIdentifier	 DOM  NODE  PROPERTY
,	TokenNameCOMMA	
XML_STRING_PROPERTY	TokenNameIdentifier	 XML  STRING  PROPERTY
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Xerces features. */	TokenNameCOMMENT_JAVADOC	 Xerces features. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgXercesFeatures	TokenNameIdentifier	 fg Xerces Features
=	TokenNameEQUAL	
{	TokenNameLBRACE	
SCHEMA_VALIDATION_FEATURE	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE
,	TokenNameCOMMA	
SCHEMA_FULL_CHECKING	TokenNameIdentifier	 SCHEMA  FULL  CHECKING
,	TokenNameCOMMA	
DYNAMIC_VALIDATION_FEATURE	TokenNameIdentifier	 DYNAMIC  VALIDATION  FEATURE
,	TokenNameCOMMA	
WARN_ON_DUPLICATE_ATTDEF_FEATURE	TokenNameIdentifier	 WARN  ON  DUPLICATE  ATTDEF  FEATURE
,	TokenNameCOMMA	
WARN_ON_UNDECLARED_ELEMDEF_FEATURE	TokenNameIdentifier	 WARN  ON  UNDECLARED  ELEMDEF  FEATURE
,	TokenNameCOMMA	
ALLOW_JAVA_ENCODINGS_FEATURE	TokenNameIdentifier	 ALLOW  JAVA  ENCODINGS  FEATURE
,	TokenNameCOMMA	
CONTINUE_AFTER_FATAL_ERROR_FEATURE	TokenNameIdentifier	 CONTINUE  AFTER  FATAL  ERROR  FEATURE
,	TokenNameCOMMA	
LOAD_DTD_GRAMMAR_FEATURE	TokenNameIdentifier	 LOAD  DTD  GRAMMAR  FEATURE
,	TokenNameCOMMA	
LOAD_EXTERNAL_DTD_FEATURE	TokenNameIdentifier	 LOAD  EXTERNAL  DTD  FEATURE
,	TokenNameCOMMA	
//DEFER_NODE_EXPANSION_FEATURE, 	TokenNameCOMMENT_LINE	DEFER_NODE_EXPANSION_FEATURE, 
CREATE_ENTITY_REF_NODES_FEATURE	TokenNameIdentifier	 CREATE  ENTITY  REF  NODES  FEATURE
,	TokenNameCOMMA	
INCLUDE_IGNORABLE_WHITESPACE	TokenNameIdentifier	 INCLUDE  IGNORABLE  WHITESPACE
,	TokenNameCOMMA	
//GRAMMAR_ACCESS_FEATURE, 	TokenNameCOMMENT_LINE	GRAMMAR_ACCESS_FEATURE, 
DEFAULT_ATTRIBUTE_VALUES_FEATURE	TokenNameIdentifier	 DEFAULT  ATTRIBUTE  VALUES  FEATURE
,	TokenNameCOMMA	
VALIDATE_CONTENT_MODELS_FEATURE	TokenNameIdentifier	 VALIDATE  CONTENT  MODELS  FEATURE
,	TokenNameCOMMA	
VALIDATE_DATATYPES_FEATURE	TokenNameIdentifier	 VALIDATE  DATATYPES  FEATURE
,	TokenNameCOMMA	
BALANCE_SYNTAX_TREES	TokenNameIdentifier	 BALANCE  SYNTAX  TREES
,	TokenNameCOMMA	
NOTIFY_CHAR_REFS_FEATURE	TokenNameIdentifier	 NOTIFY  CHAR  REFS  FEATURE
,	TokenNameCOMMA	
NOTIFY_BUILTIN_REFS_FEATURE	TokenNameIdentifier	 NOTIFY  BUILTIN  REFS  FEATURE
,	TokenNameCOMMA	
DISALLOW_DOCTYPE_DECL_FEATURE	TokenNameIdentifier	 DISALLOW  DOCTYPE  DECL  FEATURE
,	TokenNameCOMMA	
STANDARD_URI_CONFORMANT_FEATURE	TokenNameIdentifier	 STANDARD  URI  CONFORMANT  FEATURE
,	TokenNameCOMMA	
GENERATE_SYNTHETIC_ANNOTATIONS_FEATURE	TokenNameIdentifier	 GENERATE  SYNTHETIC  ANNOTATIONS  FEATURE
,	TokenNameCOMMA	
VALIDATE_ANNOTATIONS_FEATURE	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  FEATURE
,	TokenNameCOMMA	
HONOUR_ALL_SCHEMALOCATIONS_FEATURE	TokenNameIdentifier	 HONOUR  ALL  SCHEMALOCATIONS  FEATURE
,	TokenNameCOMMA	
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
,	TokenNameCOMMA	
XINCLUDE_FIXUP_BASE_URIS_FEATURE	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE
,	TokenNameCOMMA	
XINCLUDE_FIXUP_LANGUAGE_FEATURE	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE
,	TokenNameCOMMA	
IGNORE_XSI_TYPE_FEATURE	TokenNameIdentifier	 IGNORE  XSI  TYPE  FEATURE
,	TokenNameCOMMA	
ID_IDREF_CHECKING_FEATURE	TokenNameIdentifier	 ID  IDREF  CHECKING  FEATURE
,	TokenNameCOMMA	
IDC_CHECKING_FEATURE	TokenNameIdentifier	 IDC  CHECKING  FEATURE
,	TokenNameCOMMA	
UNPARSED_ENTITY_CHECKING_FEATURE	TokenNameIdentifier	 UNPARSED  ENTITY  CHECKING  FEATURE
,	TokenNameCOMMA	
NAMESPACE_GROWTH_FEATURE	TokenNameIdentifier	 NAMESPACE  GROWTH  FEATURE
,	TokenNameCOMMA	
TOLERATE_DUPLICATES_FEATURE	TokenNameIdentifier	 TOLERATE  DUPLICATES  FEATURE
,	TokenNameCOMMA	
STRINGS_INTERNED_FEATURE	TokenNameIdentifier	 STRINGS  INTERNED  FEATURE
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Xerces properties. */	TokenNameCOMMENT_JAVADOC	 Xerces properties. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgXercesProperties	TokenNameIdentifier	 fg Xerces Properties
=	TokenNameEQUAL	
{	TokenNameLBRACE	
CURRENT_ELEMENT_NODE_PROPERTY	TokenNameIdentifier	 CURRENT  ELEMENT  NODE  PROPERTY
,	TokenNameCOMMA	
DOCUMENT_CLASS_NAME_PROPERTY	TokenNameIdentifier	 DOCUMENT  CLASS  NAME  PROPERTY
,	TokenNameCOMMA	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
,	TokenNameCOMMA	
ERROR_HANDLER_PROPERTY	TokenNameIdentifier	 ERROR  HANDLER  PROPERTY
,	TokenNameCOMMA	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
,	TokenNameCOMMA	
ENTITY_MANAGER_PROPERTY	TokenNameIdentifier	 ENTITY  MANAGER  PROPERTY
,	TokenNameCOMMA	
ENTITY_RESOLVER_PROPERTY	TokenNameIdentifier	 ENTITY  RESOLVER  PROPERTY
,	TokenNameCOMMA	
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier	 XMLGRAMMAR  POOL  PROPERTY
,	TokenNameCOMMA	
DATATYPE_VALIDATOR_FACTORY_PROPERTY	TokenNameIdentifier	 DATATYPE  VALIDATOR  FACTORY  PROPERTY
,	TokenNameCOMMA	
DOCUMENT_SCANNER_PROPERTY	TokenNameIdentifier	 DOCUMENT  SCANNER  PROPERTY
,	TokenNameCOMMA	
DTD_SCANNER_PROPERTY	TokenNameIdentifier	 DTD  SCANNER  PROPERTY
,	TokenNameCOMMA	
VALIDATOR_PROPERTY	TokenNameIdentifier	 VALIDATOR  PROPERTY
,	TokenNameCOMMA	
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
,	TokenNameCOMMA	
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
,	TokenNameCOMMA	
VALIDATION_MANAGER_PROPERTY	TokenNameIdentifier	 VALIDATION  MANAGER  PROPERTY
,	TokenNameCOMMA	
BUFFER_SIZE_PROPERTY	TokenNameIdentifier	 BUFFER  SIZE  PROPERTY
,	TokenNameCOMMA	
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier	 SECURITY  MANAGER  PROPERTY
,	TokenNameCOMMA	
LOCALE_PROPERTY	TokenNameIdentifier	 LOCALE  PROPERTY
,	TokenNameCOMMA	
ROOT_TYPE_DEFINITION_PROPERTY	TokenNameIdentifier	 ROOT  TYPE  DEFINITION  PROPERTY
,	TokenNameCOMMA	
ROOT_ELEMENT_DECLARATION_PROPERTY	TokenNameIdentifier	 ROOT  ELEMENT  DECLARATION  PROPERTY
,	TokenNameCOMMA	
SCHEMA_DV_FACTORY_PROPERTY	TokenNameIdentifier	 SCHEMA  DV  FACTORY  PROPERTY
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Empty enumeration. */	TokenNameCOMMENT_JAVADOC	 Empty enumeration. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
fgEmptyEnumeration	TokenNameIdentifier	 fg Empty Enumeration
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** This class cannot be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class cannot be instantiated. 
private	TokenNameprivate	
Constants	TokenNameIdentifier	 Constants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
// sax 	TokenNameCOMMENT_LINE	sax 
/** Returns an enumeration of the SAX features. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the SAX features. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
getSAXFeatures	TokenNameIdentifier	 get SAX Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fgSAXFeatures	TokenNameIdentifier	 fg SAX Features
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
fgSAXFeatures	TokenNameIdentifier	 fg SAX Features
)	TokenNameRPAREN	
:	TokenNameCOLON	
fgEmptyEnumeration	TokenNameIdentifier	 fg Empty Enumeration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSAXFeatures():Enumeration 	TokenNameCOMMENT_LINE	getSAXFeatures():Enumeration 
/** Returns an enumeration of the SAX properties. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the SAX properties. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
getSAXProperties	TokenNameIdentifier	 get SAX Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fgSAXProperties	TokenNameIdentifier	 fg SAX Properties
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
fgSAXProperties	TokenNameIdentifier	 fg SAX Properties
)	TokenNameRPAREN	
:	TokenNameCOLON	
fgEmptyEnumeration	TokenNameIdentifier	 fg Empty Enumeration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getSAXProperties():Enumeration 	TokenNameCOMMENT_LINE	getSAXProperties():Enumeration 
// xerces 	TokenNameCOMMENT_LINE	xerces 
/** Returns an enumeration of the Xerces features. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the Xerces features. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
getXercesFeatures	TokenNameIdentifier	 get Xerces Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fgXercesFeatures	TokenNameIdentifier	 fg Xerces Features
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
fgXercesFeatures	TokenNameIdentifier	 fg Xerces Features
)	TokenNameRPAREN	
:	TokenNameCOLON	
fgEmptyEnumeration	TokenNameIdentifier	 fg Empty Enumeration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXercesFeatures():Enumeration 	TokenNameCOMMENT_LINE	getXercesFeatures():Enumeration 
/** Returns an enumeration of the Xerces properties. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the Xerces properties. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
getXercesProperties	TokenNameIdentifier	 get Xerces Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fgXercesProperties	TokenNameIdentifier	 fg Xerces Properties
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
fgXercesProperties	TokenNameIdentifier	 fg Xerces Properties
)	TokenNameRPAREN	
:	TokenNameCOLON	
fgEmptyEnumeration	TokenNameIdentifier	 fg Empty Enumeration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXercesProperties():Enumeration 	TokenNameCOMMENT_LINE	getXercesProperties():Enumeration 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * An array enumeration. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 An array enumeration. * @author Andy Clark, IBM 
static	TokenNamestatic	
class	TokenNameclass	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Array. */	TokenNameCOMMENT_JAVADOC	 Array. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
/** Index. */	TokenNameCOMMENT_JAVADOC	 Index. 
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs an array enumeration. */	TokenNameCOMMENT_JAVADOC	 Constructs an array enumeration. 
public	TokenNamepublic	
ArrayEnumeration	TokenNameIdentifier	 Array Enumeration
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Object[]) 	TokenNameCOMMENT_LINE	<init>(Object[]) 
// 	TokenNameCOMMENT_LINE	 
// Enumeration methods 	TokenNameCOMMENT_LINE	Enumeration methods 
// 	TokenNameCOMMENT_LINE	 
/** * Tests if this enumeration contains more elements. * * @return <code>true</code> if this enumeration contains more elements; * <code>false</code> otherwise. * @since JDK1.0 */	TokenNameCOMMENT_JAVADOC	 Tests if this enumeration contains more elements. * @return <code>true</code> if this enumeration contains more elements; <code>false</code> otherwise. @since JDK1.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hasMoreElement():boolean 	TokenNameCOMMENT_LINE	hasMoreElement():boolean 
/** * Returns the next element of this enumeration. * * @return the next element of this enumeration. * @exception NoSuchElementException if no more elements exist. * @since JDK1.0 */	TokenNameCOMMENT_JAVADOC	 Returns the next element of this enumeration. * @return the next element of this enumeration. @exception NoSuchElementException if no more elements exist. @since JDK1.0 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// nextElement():Object 	TokenNameCOMMENT_LINE	nextElement():Object 
}	TokenNameRBRACE	
// class ArrayEnumeration 	TokenNameCOMMENT_LINE	class ArrayEnumeration 
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** Prints all of the constants to standard output. */	TokenNameCOMMENT_JAVADOC	 Prints all of the constants to standard output. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"SAX features:"	TokenNameStringLiteral	SAX features:
,	TokenNameCOMMA	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
,	TokenNameCOMMA	
fgSAXFeatures	TokenNameIdentifier	 fg SAX Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"SAX properties:"	TokenNameStringLiteral	SAX properties:
,	TokenNameCOMMA	
SAX_PROPERTY_PREFIX	TokenNameIdentifier	 SAX  PROPERTY  PREFIX
,	TokenNameCOMMA	
fgSAXProperties	TokenNameIdentifier	 fg SAX Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Xerces features:"	TokenNameStringLiteral	Xerces features:
,	TokenNameCOMMA	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
,	TokenNameCOMMA	
fgXercesFeatures	TokenNameIdentifier	 fg Xerces Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Xerces properties:"	TokenNameStringLiteral	Xerces properties:
,	TokenNameCOMMA	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
,	TokenNameCOMMA	
fgXercesProperties	TokenNameIdentifier	 fg Xerces Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
/** Prints a list of features/properties. */	TokenNameCOMMENT_JAVADOC	 Prints a list of features/properties. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" none."	TokenNameStringLiteral	 none.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// print(String,String,Object[]) 	TokenNameCOMMENT_LINE	print(String,String,Object[]) 
}	TokenNameRBRACE	
// class Constants 	TokenNameCOMMENT_LINE	class Constants 
