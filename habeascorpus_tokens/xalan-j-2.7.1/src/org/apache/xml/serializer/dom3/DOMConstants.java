/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: $ */	TokenNameCOMMENT_BLOCK	 $Id: $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
;	TokenNameSEMICOLON	
/** * DOM Constants used by the DOM Level 3 LSSerializer implementation. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 DOM Constants used by the DOM Level 3 LSSerializer implementation. * @xsl.usage internal 
final	TokenNamefinal	
class	TokenNameclass	
DOMConstants	TokenNameIdentifier	 DOM Constants
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants: DOM Level 3 feature ids 	TokenNameCOMMENT_LINE	Constants: DOM Level 3 feature ids 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM3_REC_URL	TokenNameIdentifier	 DO M3  REC  URL
=	TokenNameEQUAL	
"http://www.w3.org/TR/DOM-Level-3-LS"	TokenNameStringLiteral	http://www.w3.org/TR/DOM-Level-3-LS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XERCES_URL	TokenNameIdentifier	 XERCES  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xerces-2j"	TokenNameStringLiteral	http://xml.apache.org/xerces-2j
;	TokenNameSEMICOLON	
// The namespace used to qualified DOM Level 3 DOMConfiguration parameters 	TokenNameCOMMENT_LINE	The namespace used to qualified DOM Level 3 DOMConfiguration parameters 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_DOM3_PROPERTIES_NS	TokenNameIdentifier	 S  DO M3  PROPERTIES  NS
=	TokenNameEQUAL	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
DOMConstants	TokenNameIdentifier	 DOM Constants
.	TokenNameDOT	
DOM3_REC_URL	TokenNameIdentifier	 DO M3  REC  URL
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XERCES_PROPERTIES_NS	TokenNameIdentifier	 S  XERCES  PROPERTIES  NS
=	TokenNameEQUAL	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
DOMConstants	TokenNameIdentifier	 DOM Constants
.	TokenNameDOT	
XERCES_URL	TokenNameIdentifier	 XERCES  URL
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
// xmlns namespaces 	TokenNameCOMMENT_LINE	xmlns namespaces 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
=	TokenNameEQUAL	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
;	TokenNameSEMICOLON	
// namespace prefix 	TokenNameCOMMENT_LINE	namespace prefix 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_PREFIX	TokenNameIdentifier	 XMLNS  PREFIX
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// DOM Level 3 DOM Configuration parameter names 	TokenNameCOMMENT_LINE	DOM Level 3 DOM Configuration parameter names 
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// DOM Level 3 parameters defined in Core 	TokenNameCOMMENT_LINE	DOM Level 3 parameters defined in Core 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CANONICAL_FORM	TokenNameIdentifier	 DOM  CANONICAL  FORM
=	TokenNameEQUAL	
"canonical-form"	TokenNameStringLiteral	canonical-form
;	TokenNameSEMICOLON	
// Unsupported, we only appear to support this 	TokenNameCOMMENT_LINE	Unsupported, we only appear to support this 
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
DOM_CHECK_CHAR_NORMALIZATION	TokenNameIdentifier	 DOM  CHECK  CHAR  NORMALIZATION
=	TokenNameEQUAL	
"check-character-normalization"	TokenNameStringLiteral	check-character-normalization
;	TokenNameSEMICOLON	
// Unsupported 	TokenNameCOMMENT_LINE	Unsupported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_COMMENTS	TokenNameIdentifier	 DOM  COMMENTS
=	TokenNameEQUAL	
"comments"	TokenNameStringLiteral	comments
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_DATATYPE_NORMALIZATION	TokenNameIdentifier	 DOM  DATATYPE  NORMALIZATION
=	TokenNameEQUAL	
"datatype-normalization"	TokenNameStringLiteral	datatype-normalization
;	TokenNameSEMICOLON	
// Unsupported 	TokenNameCOMMENT_LINE	Unsupported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ELEMENT_CONTENT_WHITESPACE	TokenNameIdentifier	 DOM  ELEMENT  CONTENT  WHITESPACE
=	TokenNameEQUAL	
"element-content-whitespace"	TokenNameStringLiteral	element-content-whitespace
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
DOM_NORMALIZE_CHARACTERS	TokenNameIdentifier	 DOM  NORMALIZE  CHARACTERS
=	TokenNameEQUAL	
"normalize-characters"	TokenNameStringLiteral	normalize-characters
;	TokenNameSEMICOLON	
// Unsupported 	TokenNameCOMMENT_LINE	Unsupported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SPLIT_CDATA	TokenNameIdentifier	 DOM  SPLIT  CDATA
=	TokenNameEQUAL	
"split-cdata-sections"	TokenNameStringLiteral	split-cdata-sections
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_VALIDATE_IF_SCHEMA	TokenNameIdentifier	 DOM  VALIDATE  IF  SCHEMA
=	TokenNameEQUAL	
"validate-if-schema"	TokenNameStringLiteral	validate-if-schema
;	TokenNameSEMICOLON	
// Unsopported 	TokenNameCOMMENT_LINE	Unsopported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_VALIDATE	TokenNameIdentifier	 DOM  VALIDATE
=	TokenNameEQUAL	
"validate"	TokenNameStringLiteral	validate
;	TokenNameSEMICOLON	
// Unsopported 	TokenNameCOMMENT_LINE	Unsopported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_WELLFORMED	TokenNameIdentifier	 DOM  WELLFORMED
=	TokenNameEQUAL	
"well-formed"	TokenNameStringLiteral	well-formed
;	TokenNameSEMICOLON	
// DOM Level 3 Save 	TokenNameCOMMENT_LINE	DOM Level 3 Save 
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
DOM_FORMAT_PRETTY_PRINT	TokenNameIdentifier	 DOM  FORMAT  PRETTY  PRINT
=	TokenNameEQUAL	
"format-pretty-print"	TokenNameStringLiteral	format-pretty-print
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_IGNORE_UNKNOWN_CHARACTER_DENORMALIZATIONS	TokenNameIdentifier	 DOM  IGNORE  UNKNOWN  CHARACTER  DENORMALIZATIONS
=	TokenNameEQUAL	
"ignore-unknown-character-denormalizations"	TokenNameStringLiteral	ignore-unknown-character-denormalizations
;	TokenNameSEMICOLON	
// Unsupported 	TokenNameCOMMENT_LINE	Unsupported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_XMLDECL	TokenNameIdentifier	 DOM  XMLDECL
=	TokenNameEQUAL	
"xml-declaration"	TokenNameStringLiteral	xml-declaration
;	TokenNameSEMICOLON	
// DOM Properties 	TokenNameCOMMENT_LINE	DOM Properties 
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
// Unsupported 	TokenNameCOMMENT_LINE	Unsupported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SCHEMA_LOCATION	TokenNameIdentifier	 DOM  SCHEMA  LOCATION
=	TokenNameEQUAL	
"schema-location"	TokenNameStringLiteral	schema-location
;	TokenNameSEMICOLON	
// Unsupported 	TokenNameCOMMENT_LINE	Unsupported 
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// XSL Output properties 	TokenNameCOMMENT_LINE	XSL Output properties 
// The xsl:output 'indent' property used in LSSerializer 	TokenNameCOMMENT_LINE	The xsl:output 'indent' property used in LSSerializer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XSL_OUTPUT_INDENT	TokenNameIdentifier	 S  XSL  OUTPUT  INDENT
=	TokenNameEQUAL	
"indent"	TokenNameStringLiteral	indent
;	TokenNameSEMICOLON	
// The xsl:output 'indent' property used in LSSerializer 	TokenNameCOMMENT_LINE	The xsl:output 'indent' property used in LSSerializer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XSL_OUTPUT_ENCODING	TokenNameIdentifier	 S  XSL  OUTPUT  ENCODING
=	TokenNameEQUAL	
"encoding"	TokenNameStringLiteral	encoding
;	TokenNameSEMICOLON	
// The xsl:output 'omit-xml-declaration' property used in LSSerializer 	TokenNameCOMMENT_LINE	The xsl:output 'omit-xml-declaration' property used in LSSerializer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XSL_OUTPUT_OMIT_XML_DECL	TokenNameIdentifier	 S  XSL  OUTPUT  OMIT  XML  DECL
=	TokenNameEQUAL	
"omit-xml-declaration"	TokenNameStringLiteral	omit-xml-declaration
;	TokenNameSEMICOLON	
// The xerces serializer specific 'omit-xml-declaration' property used in LSSerializer 	TokenNameCOMMENT_LINE	The xerces serializer specific 'omit-xml-declaration' property used in LSSerializer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XML_VERSION	TokenNameIdentifier	 S  XML  VERSION
=	TokenNameEQUAL	
"xml-version"	TokenNameStringLiteral	xml-version
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XSL_VALUE_ENTITIES	TokenNameIdentifier	 S  XSL  VALUE  ENTITIES
=	TokenNameEQUAL	
"org/apache/xml/serializer/XMLEntities"	TokenNameStringLiteral	org/apache/xml/serializer/XMLEntities
;	TokenNameSEMICOLON	
// Parameter values 	TokenNameCOMMENT_LINE	Parameter values 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM3_EXPLICIT_TRUE	TokenNameIdentifier	 DO M3  EXPLICIT  TRUE
=	TokenNameEQUAL	
"explicit:yes"	TokenNameStringLiteral	explicit:yes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM3_DEFAULT_TRUE	TokenNameIdentifier	 DO M3  DEFAULT  TRUE
=	TokenNameEQUAL	
"default:yes"	TokenNameStringLiteral	default:yes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM3_EXPLICIT_FALSE	TokenNameIdentifier	 DO M3  EXPLICIT  FALSE
=	TokenNameEQUAL	
"explicit:no"	TokenNameStringLiteral	explicit:no
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM3_DEFAULT_FALSE	TokenNameIdentifier	 DO M3  DEFAULT  FALSE
=	TokenNameEQUAL	
"default:no"	TokenNameStringLiteral	default:no
;	TokenNameSEMICOLON	
// DOM Exceptions 	TokenNameCOMMENT_LINE	DOM Exceptions 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_EXCEPTION_FEATURE_NOT_FOUND	TokenNameIdentifier	 DOM  EXCEPTION  FEATURE  NOT  FOUND
=	TokenNameEQUAL	
"FEATURE_NOT_FOUND"	TokenNameStringLiteral	FEATURE_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_EXCEPTION_FEATURE_NOT_SUPPORTED	TokenNameIdentifier	 DOM  EXCEPTION  FEATURE  NOT  SUPPORTED
=	TokenNameEQUAL	
"FEATURE_NOT_SUPPORTED"	TokenNameStringLiteral	FEATURE_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LSEXCEPTION_SERIALIZER_ERR	TokenNameIdentifier	 DOM  LSEXCEPTION  SERIALIZER  ERR
=	TokenNameEQUAL	
"SERIALIZER_ERROR"	TokenNameStringLiteral	SERIALIZER_ERROR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
