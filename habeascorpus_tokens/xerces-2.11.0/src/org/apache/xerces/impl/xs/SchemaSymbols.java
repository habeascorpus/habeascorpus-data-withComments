/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * Collection of symbols used to parse a Schema Grammar. * * @xerces.internal * * @author jeffrey rodriguez * @version $Id: SchemaSymbols.java 446734 2006-09-15 20:51:23Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Collection of symbols used to parse a Schema Grammar. * @xerces.internal * @author jeffrey rodriguez @version $Id: SchemaSymbols.java 446734 2006-09-15 20:51:23Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
{	TokenNameLBRACE	
// strings that's not added to the schema symbol table, because they 	TokenNameCOMMENT_LINE	strings that's not added to the schema symbol table, because they 
// are not symbols in the schema document. 	TokenNameCOMMENT_LINE	are not symbols in the schema document. 
// the validator can choose to add them by itself. 	TokenNameCOMMENT_LINE	the validator can choose to add them by itself. 
// the following strings (xsi:, xsd) will be added into the 	TokenNameCOMMENT_LINE	the following strings (xsi:, xsd) will be added into the 
// symbol table that comes with the parser 	TokenNameCOMMENT_LINE	symbol table that comes with the parser 
// xsi attributes: in validator 	TokenNameCOMMENT_LINE	xsi attributes: in validator 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URI_XSI	TokenNameIdentifier	 URI  XSI
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema-instance"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema-instance
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSI_SCHEMALOCATION	TokenNameIdentifier	 XSI  SCHEMALOCATION
=	TokenNameEQUAL	
"schemaLocation"	TokenNameStringLiteral	schemaLocation
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSI_NONAMESPACESCHEMALOCATION	TokenNameIdentifier	 XSI  NONAMESPACESCHEMALOCATION
=	TokenNameEQUAL	
"noNamespaceSchemaLocation"	TokenNameStringLiteral	noNamespaceSchemaLocation
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSI_TYPE	TokenNameIdentifier	 XSI  TYPE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSI_NIL	TokenNameIdentifier	 XSI  NIL
=	TokenNameEQUAL	
"nil"	TokenNameStringLiteral	nil
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// schema namespace 	TokenNameCOMMENT_LINE	schema namespace 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// all possible schema element names 	TokenNameCOMMENT_LINE	all possible schema element names 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ALL	TokenNameIdentifier	 ELT  ALL
=	TokenNameEQUAL	
"all"	TokenNameStringLiteral	all
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ANNOTATION	TokenNameIdentifier	 ELT  ANNOTATION
=	TokenNameEQUAL	
"annotation"	TokenNameStringLiteral	annotation
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ANY	TokenNameIdentifier	 ELT  ANY
=	TokenNameEQUAL	
"any"	TokenNameStringLiteral	any
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ANYATTRIBUTE	TokenNameIdentifier	 ELT  ANYATTRIBUTE
=	TokenNameEQUAL	
"anyAttribute"	TokenNameStringLiteral	anyAttribute
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_APPINFO	TokenNameIdentifier	 ELT  APPINFO
=	TokenNameEQUAL	
"appinfo"	TokenNameStringLiteral	appinfo
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ATTRIBUTE	TokenNameIdentifier	 ELT  ATTRIBUTE
=	TokenNameEQUAL	
"attribute"	TokenNameStringLiteral	attribute
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ATTRIBUTEGROUP	TokenNameIdentifier	 ELT  ATTRIBUTEGROUP
=	TokenNameEQUAL	
"attributeGroup"	TokenNameStringLiteral	attributeGroup
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_CHOICE	TokenNameIdentifier	 ELT  CHOICE
=	TokenNameEQUAL	
"choice"	TokenNameStringLiteral	choice
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_COMPLEXCONTENT	TokenNameIdentifier	 ELT  COMPLEXCONTENT
=	TokenNameEQUAL	
"complexContent"	TokenNameStringLiteral	complexContent
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_COMPLEXTYPE	TokenNameIdentifier	 ELT  COMPLEXTYPE
=	TokenNameEQUAL	
"complexType"	TokenNameStringLiteral	complexType
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_DOCUMENTATION	TokenNameIdentifier	 ELT  DOCUMENTATION
=	TokenNameEQUAL	
"documentation"	TokenNameStringLiteral	documentation
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ELEMENT	TokenNameIdentifier	 ELT  ELEMENT
=	TokenNameEQUAL	
"element"	TokenNameStringLiteral	element
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_ENUMERATION	TokenNameIdentifier	 ELT  ENUMERATION
=	TokenNameEQUAL	
"enumeration"	TokenNameStringLiteral	enumeration
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_EXTENSION	TokenNameIdentifier	 ELT  EXTENSION
=	TokenNameEQUAL	
"extension"	TokenNameStringLiteral	extension
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_FIELD	TokenNameIdentifier	 ELT  FIELD
=	TokenNameEQUAL	
"field"	TokenNameStringLiteral	field
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_FRACTIONDIGITS	TokenNameIdentifier	 ELT  FRACTIONDIGITS
=	TokenNameEQUAL	
"fractionDigits"	TokenNameStringLiteral	fractionDigits
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_GROUP	TokenNameIdentifier	 ELT  GROUP
=	TokenNameEQUAL	
"group"	TokenNameStringLiteral	group
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_IMPORT	TokenNameIdentifier	 ELT  IMPORT
=	TokenNameEQUAL	
"import"	TokenNameStringLiteral	import
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_INCLUDE	TokenNameIdentifier	 ELT  INCLUDE
=	TokenNameEQUAL	
"include"	TokenNameStringLiteral	include
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_KEY	TokenNameIdentifier	 ELT  KEY
=	TokenNameEQUAL	
"key"	TokenNameStringLiteral	key
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_KEYREF	TokenNameIdentifier	 ELT  KEYREF
=	TokenNameEQUAL	
"keyref"	TokenNameStringLiteral	keyref
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_LENGTH	TokenNameIdentifier	 ELT  LENGTH
=	TokenNameEQUAL	
"length"	TokenNameStringLiteral	length
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_LIST	TokenNameIdentifier	 ELT  LIST
=	TokenNameEQUAL	
"list"	TokenNameStringLiteral	list
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_MAXEXCLUSIVE	TokenNameIdentifier	 ELT  MAXEXCLUSIVE
=	TokenNameEQUAL	
"maxExclusive"	TokenNameStringLiteral	maxExclusive
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_MAXINCLUSIVE	TokenNameIdentifier	 ELT  MAXINCLUSIVE
=	TokenNameEQUAL	
"maxInclusive"	TokenNameStringLiteral	maxInclusive
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_MAXLENGTH	TokenNameIdentifier	 ELT  MAXLENGTH
=	TokenNameEQUAL	
"maxLength"	TokenNameStringLiteral	maxLength
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_MINEXCLUSIVE	TokenNameIdentifier	 ELT  MINEXCLUSIVE
=	TokenNameEQUAL	
"minExclusive"	TokenNameStringLiteral	minExclusive
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_MININCLUSIVE	TokenNameIdentifier	 ELT  MININCLUSIVE
=	TokenNameEQUAL	
"minInclusive"	TokenNameStringLiteral	minInclusive
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_MINLENGTH	TokenNameIdentifier	 ELT  MINLENGTH
=	TokenNameEQUAL	
"minLength"	TokenNameStringLiteral	minLength
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_NOTATION	TokenNameIdentifier	 ELT  NOTATION
=	TokenNameEQUAL	
"notation"	TokenNameStringLiteral	notation
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_PATTERN	TokenNameIdentifier	 ELT  PATTERN
=	TokenNameEQUAL	
"pattern"	TokenNameStringLiteral	pattern
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_REDEFINE	TokenNameIdentifier	 ELT  REDEFINE
=	TokenNameEQUAL	
"redefine"	TokenNameStringLiteral	redefine
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_RESTRICTION	TokenNameIdentifier	 ELT  RESTRICTION
=	TokenNameEQUAL	
"restriction"	TokenNameStringLiteral	restriction
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_SCHEMA	TokenNameIdentifier	 ELT  SCHEMA
=	TokenNameEQUAL	
"schema"	TokenNameStringLiteral	schema
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_SELECTOR	TokenNameIdentifier	 ELT  SELECTOR
=	TokenNameEQUAL	
"selector"	TokenNameStringLiteral	selector
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_SEQUENCE	TokenNameIdentifier	 ELT  SEQUENCE
=	TokenNameEQUAL	
"sequence"	TokenNameStringLiteral	sequence
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_SIMPLECONTENT	TokenNameIdentifier	 ELT  SIMPLECONTENT
=	TokenNameEQUAL	
"simpleContent"	TokenNameStringLiteral	simpleContent
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_SIMPLETYPE	TokenNameIdentifier	 ELT  SIMPLETYPE
=	TokenNameEQUAL	
"simpleType"	TokenNameStringLiteral	simpleType
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_TOTALDIGITS	TokenNameIdentifier	 ELT  TOTALDIGITS
=	TokenNameEQUAL	
"totalDigits"	TokenNameStringLiteral	totalDigits
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_UNION	TokenNameIdentifier	 ELT  UNION
=	TokenNameEQUAL	
"union"	TokenNameStringLiteral	union
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_UNIQUE	TokenNameIdentifier	 ELT  UNIQUE
=	TokenNameEQUAL	
"unique"	TokenNameStringLiteral	unique
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELT_WHITESPACE	TokenNameIdentifier	 ELT  WHITESPACE
=	TokenNameEQUAL	
"whiteSpace"	TokenNameStringLiteral	whiteSpace
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// all possible schema attribute names (and xml:lang defined on <schema> and <documentation>) 	TokenNameCOMMENT_LINE	all possible schema attribute names (and xml:lang defined on <schema> and <documentation>) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_ABSTRACT	TokenNameIdentifier	 ATT  ABSTRACT
=	TokenNameEQUAL	
"abstract"	TokenNameStringLiteral	abstract
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_ATTRIBUTEFORMDEFAULT	TokenNameIdentifier	 ATT  ATTRIBUTEFORMDEFAULT
=	TokenNameEQUAL	
"attributeFormDefault"	TokenNameStringLiteral	attributeFormDefault
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_BASE	TokenNameIdentifier	 ATT  BASE
=	TokenNameEQUAL	
"base"	TokenNameStringLiteral	base
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_BLOCK	TokenNameIdentifier	 ATT  BLOCK
=	TokenNameEQUAL	
"block"	TokenNameStringLiteral	block
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_BLOCKDEFAULT	TokenNameIdentifier	 ATT  BLOCKDEFAULT
=	TokenNameEQUAL	
"blockDefault"	TokenNameStringLiteral	blockDefault
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_DEFAULT	TokenNameIdentifier	 ATT  DEFAULT
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_ELEMENTFORMDEFAULT	TokenNameIdentifier	 ATT  ELEMENTFORMDEFAULT
=	TokenNameEQUAL	
"elementFormDefault"	TokenNameStringLiteral	elementFormDefault
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_FINAL	TokenNameIdentifier	 ATT  FINAL
=	TokenNameEQUAL	
"final"	TokenNameStringLiteral	final
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_FINALDEFAULT	TokenNameIdentifier	 ATT  FINALDEFAULT
=	TokenNameEQUAL	
"finalDefault"	TokenNameStringLiteral	finalDefault
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_FIXED	TokenNameIdentifier	 ATT  FIXED
=	TokenNameEQUAL	
"fixed"	TokenNameStringLiteral	fixed
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_FORM	TokenNameIdentifier	 ATT  FORM
=	TokenNameEQUAL	
"form"	TokenNameStringLiteral	form
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_ID	TokenNameIdentifier	 ATT  ID
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_ITEMTYPE	TokenNameIdentifier	 ATT  ITEMTYPE
=	TokenNameEQUAL	
"itemType"	TokenNameStringLiteral	itemType
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_MAXOCCURS	TokenNameIdentifier	 ATT  MAXOCCURS
=	TokenNameEQUAL	
"maxOccurs"	TokenNameStringLiteral	maxOccurs
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_MEMBERTYPES	TokenNameIdentifier	 ATT  MEMBERTYPES
=	TokenNameEQUAL	
"memberTypes"	TokenNameStringLiteral	memberTypes
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_MINOCCURS	TokenNameIdentifier	 ATT  MINOCCURS
=	TokenNameEQUAL	
"minOccurs"	TokenNameStringLiteral	minOccurs
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_MIXED	TokenNameIdentifier	 ATT  MIXED
=	TokenNameEQUAL	
"mixed"	TokenNameStringLiteral	mixed
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_NAME	TokenNameIdentifier	 ATT  NAME
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_NAMESPACE	TokenNameIdentifier	 ATT  NAMESPACE
=	TokenNameEQUAL	
"namespace"	TokenNameStringLiteral	namespace
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_NILLABLE	TokenNameIdentifier	 ATT  NILLABLE
=	TokenNameEQUAL	
"nillable"	TokenNameStringLiteral	nillable
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_PROCESSCONTENTS	TokenNameIdentifier	 ATT  PROCESSCONTENTS
=	TokenNameEQUAL	
"processContents"	TokenNameStringLiteral	processContents
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_REF	TokenNameIdentifier	 ATT  REF
=	TokenNameEQUAL	
"ref"	TokenNameStringLiteral	ref
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_REFER	TokenNameIdentifier	 ATT  REFER
=	TokenNameEQUAL	
"refer"	TokenNameStringLiteral	refer
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_SCHEMALOCATION	TokenNameIdentifier	 ATT  SCHEMALOCATION
=	TokenNameEQUAL	
"schemaLocation"	TokenNameStringLiteral	schemaLocation
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_SOURCE	TokenNameIdentifier	 ATT  SOURCE
=	TokenNameEQUAL	
"source"	TokenNameStringLiteral	source
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_SUBSTITUTIONGROUP	TokenNameIdentifier	 ATT  SUBSTITUTIONGROUP
=	TokenNameEQUAL	
"substitutionGroup"	TokenNameStringLiteral	substitutionGroup
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_SYSTEM	TokenNameIdentifier	 ATT  SYSTEM
=	TokenNameEQUAL	
"system"	TokenNameStringLiteral	system
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_PUBLIC	TokenNameIdentifier	 ATT  PUBLIC
=	TokenNameEQUAL	
"public"	TokenNameStringLiteral	public
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_TARGETNAMESPACE	TokenNameIdentifier	 ATT  TARGETNAMESPACE
=	TokenNameEQUAL	
"targetNamespace"	TokenNameStringLiteral	targetNamespace
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_TYPE	TokenNameIdentifier	 ATT  TYPE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_USE	TokenNameIdentifier	 ATT  USE
=	TokenNameEQUAL	
"use"	TokenNameStringLiteral	use
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_VALUE	TokenNameIdentifier	 ATT  VALUE
=	TokenNameEQUAL	
"value"	TokenNameStringLiteral	value
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_VERSION	TokenNameIdentifier	 ATT  VERSION
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_XML_LANG	TokenNameIdentifier	 ATT  XML  LANG
=	TokenNameEQUAL	
"xml:lang"	TokenNameStringLiteral	xml:lang
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATT_XPATH	TokenNameIdentifier	 ATT  XPATH
=	TokenNameEQUAL	
"xpath"	TokenNameStringLiteral	xpath
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// all possible schema attribute values 	TokenNameCOMMENT_LINE	all possible schema attribute values 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TWOPOUNDANY	TokenNameIdentifier	 ATTVAL  TWOPOUNDANY
=	TokenNameEQUAL	
"##any"	TokenNameStringLiteral	##any
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TWOPOUNDLOCAL	TokenNameIdentifier	 ATTVAL  TWOPOUNDLOCAL
=	TokenNameEQUAL	
"##local"	TokenNameStringLiteral	##local
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TWOPOUNDOTHER	TokenNameIdentifier	 ATTVAL  TWOPOUNDOTHER
=	TokenNameEQUAL	
"##other"	TokenNameStringLiteral	##other
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TWOPOUNDTARGETNS	TokenNameIdentifier	 ATTVAL  TWOPOUNDTARGETNS
=	TokenNameEQUAL	
"##targetNamespace"	TokenNameStringLiteral	##targetNamespace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_POUNDALL	TokenNameIdentifier	 ATTVAL  POUNDALL
=	TokenNameEQUAL	
"#all"	TokenNameStringLiteral	#all
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_FALSE_0	TokenNameIdentifier	 ATTVAL  FALSE 0
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TRUE_1	TokenNameIdentifier	 ATTVAL  TRUE 1
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_ANYSIMPLETYPE	TokenNameIdentifier	 ATTVAL  ANYSIMPLETYPE
=	TokenNameEQUAL	
"anySimpleType"	TokenNameStringLiteral	anySimpleType
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_ANYTYPE	TokenNameIdentifier	 ATTVAL  ANYTYPE
=	TokenNameEQUAL	
"anyType"	TokenNameStringLiteral	anyType
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_ANYURI	TokenNameIdentifier	 ATTVAL  ANYURI
=	TokenNameEQUAL	
"anyURI"	TokenNameStringLiteral	anyURI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_BASE64BINARY	TokenNameIdentifier	 ATTVAL  BAS E64 BINARY
=	TokenNameEQUAL	
"base64Binary"	TokenNameStringLiteral	base64Binary
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_BOOLEAN	TokenNameIdentifier	 ATTVAL  BOOLEAN
=	TokenNameEQUAL	
"boolean"	TokenNameStringLiteral	boolean
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_BYTE	TokenNameIdentifier	 ATTVAL  BYTE
=	TokenNameEQUAL	
"byte"	TokenNameStringLiteral	byte
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_COLLAPSE	TokenNameIdentifier	 ATTVAL  COLLAPSE
=	TokenNameEQUAL	
"collapse"	TokenNameStringLiteral	collapse
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_DATE	TokenNameIdentifier	 ATTVAL  DATE
=	TokenNameEQUAL	
"date"	TokenNameStringLiteral	date
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_DATETIME	TokenNameIdentifier	 ATTVAL  DATETIME
=	TokenNameEQUAL	
"dateTime"	TokenNameStringLiteral	dateTime
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_DAY	TokenNameIdentifier	 ATTVAL  DAY
=	TokenNameEQUAL	
"gDay"	TokenNameStringLiteral	gDay
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_DECIMAL	TokenNameIdentifier	 ATTVAL  DECIMAL
=	TokenNameEQUAL	
"decimal"	TokenNameStringLiteral	decimal
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_DOUBLE	TokenNameIdentifier	 ATTVAL  DOUBLE
=	TokenNameEQUAL	
"double"	TokenNameStringLiteral	double
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_DURATION	TokenNameIdentifier	 ATTVAL  DURATION
=	TokenNameEQUAL	
"duration"	TokenNameStringLiteral	duration
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_ENTITY	TokenNameIdentifier	 ATTVAL  ENTITY
=	TokenNameEQUAL	
"ENTITY"	TokenNameStringLiteral	ENTITY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_ENTITIES	TokenNameIdentifier	 ATTVAL  ENTITIES
=	TokenNameEQUAL	
"ENTITIES"	TokenNameStringLiteral	ENTITIES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_EXTENSION	TokenNameIdentifier	 ATTVAL  EXTENSION
=	TokenNameEQUAL	
"extension"	TokenNameStringLiteral	extension
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_FALSE	TokenNameIdentifier	 ATTVAL  FALSE
=	TokenNameEQUAL	
"false"	TokenNameStringLiteral	false
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_FLOAT	TokenNameIdentifier	 ATTVAL  FLOAT
=	TokenNameEQUAL	
"float"	TokenNameStringLiteral	float
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_HEXBINARY	TokenNameIdentifier	 ATTVAL  HEXBINARY
=	TokenNameEQUAL	
"hexBinary"	TokenNameStringLiteral	hexBinary
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_ID	TokenNameIdentifier	 ATTVAL  ID
=	TokenNameEQUAL	
"ID"	TokenNameStringLiteral	ID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_IDREF	TokenNameIdentifier	 ATTVAL  IDREF
=	TokenNameEQUAL	
"IDREF"	TokenNameStringLiteral	IDREF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_IDREFS	TokenNameIdentifier	 ATTVAL  IDREFS
=	TokenNameEQUAL	
"IDREFS"	TokenNameStringLiteral	IDREFS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_INT	TokenNameIdentifier	 ATTVAL  INT
=	TokenNameEQUAL	
"int"	TokenNameStringLiteral	int
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_INTEGER	TokenNameIdentifier	 ATTVAL  INTEGER
=	TokenNameEQUAL	
"integer"	TokenNameStringLiteral	integer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_LANGUAGE	TokenNameIdentifier	 ATTVAL  LANGUAGE
=	TokenNameEQUAL	
"language"	TokenNameStringLiteral	language
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_LAX	TokenNameIdentifier	 ATTVAL  LAX
=	TokenNameEQUAL	
"lax"	TokenNameStringLiteral	lax
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_LIST	TokenNameIdentifier	 ATTVAL  LIST
=	TokenNameEQUAL	
"list"	TokenNameStringLiteral	list
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_LONG	TokenNameIdentifier	 ATTVAL  LONG
=	TokenNameEQUAL	
"long"	TokenNameStringLiteral	long
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NAME	TokenNameIdentifier	 ATTVAL  NAME
=	TokenNameEQUAL	
"Name"	TokenNameStringLiteral	Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NEGATIVEINTEGER	TokenNameIdentifier	 ATTVAL  NEGATIVEINTEGER
=	TokenNameEQUAL	
"negativeInteger"	TokenNameStringLiteral	negativeInteger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_MONTH	TokenNameIdentifier	 ATTVAL  MONTH
=	TokenNameEQUAL	
"gMonth"	TokenNameStringLiteral	gMonth
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_MONTHDAY	TokenNameIdentifier	 ATTVAL  MONTHDAY
=	TokenNameEQUAL	
"gMonthDay"	TokenNameStringLiteral	gMonthDay
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NCNAME	TokenNameIdentifier	 ATTVAL  NCNAME
=	TokenNameEQUAL	
"NCName"	TokenNameStringLiteral	NCName
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NMTOKEN	TokenNameIdentifier	 ATTVAL  NMTOKEN
=	TokenNameEQUAL	
"NMTOKEN"	TokenNameStringLiteral	NMTOKEN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NMTOKENS	TokenNameIdentifier	 ATTVAL  NMTOKENS
=	TokenNameEQUAL	
"NMTOKENS"	TokenNameStringLiteral	NMTOKENS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NONNEGATIVEINTEGER	TokenNameIdentifier	 ATTVAL  NONNEGATIVEINTEGER
=	TokenNameEQUAL	
"nonNegativeInteger"	TokenNameStringLiteral	nonNegativeInteger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NONPOSITIVEINTEGER	TokenNameIdentifier	 ATTVAL  NONPOSITIVEINTEGER
=	TokenNameEQUAL	
"nonPositiveInteger"	TokenNameStringLiteral	nonPositiveInteger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NORMALIZEDSTRING	TokenNameIdentifier	 ATTVAL  NORMALIZEDSTRING
=	TokenNameEQUAL	
"normalizedString"	TokenNameStringLiteral	normalizedString
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_NOTATION	TokenNameIdentifier	 ATTVAL  NOTATION
=	TokenNameEQUAL	
"NOTATION"	TokenNameStringLiteral	NOTATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_OPTIONAL	TokenNameIdentifier	 ATTVAL  OPTIONAL
=	TokenNameEQUAL	
"optional"	TokenNameStringLiteral	optional
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_POSITIVEINTEGER	TokenNameIdentifier	 ATTVAL  POSITIVEINTEGER
=	TokenNameEQUAL	
"positiveInteger"	TokenNameStringLiteral	positiveInteger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_PRESERVE	TokenNameIdentifier	 ATTVAL  PRESERVE
=	TokenNameEQUAL	
"preserve"	TokenNameStringLiteral	preserve
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_PROHIBITED	TokenNameIdentifier	 ATTVAL  PROHIBITED
=	TokenNameEQUAL	
"prohibited"	TokenNameStringLiteral	prohibited
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_QNAME	TokenNameIdentifier	 ATTVAL  QNAME
=	TokenNameEQUAL	
"QName"	TokenNameStringLiteral	QName
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_QUALIFIED	TokenNameIdentifier	 ATTVAL  QUALIFIED
=	TokenNameEQUAL	
"qualified"	TokenNameStringLiteral	qualified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_REPLACE	TokenNameIdentifier	 ATTVAL  REPLACE
=	TokenNameEQUAL	
"replace"	TokenNameStringLiteral	replace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_REQUIRED	TokenNameIdentifier	 ATTVAL  REQUIRED
=	TokenNameEQUAL	
"required"	TokenNameStringLiteral	required
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_RESTRICTION	TokenNameIdentifier	 ATTVAL  RESTRICTION
=	TokenNameEQUAL	
"restriction"	TokenNameStringLiteral	restriction
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_SHORT	TokenNameIdentifier	 ATTVAL  SHORT
=	TokenNameEQUAL	
"short"	TokenNameStringLiteral	short
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_SKIP	TokenNameIdentifier	 ATTVAL  SKIP
=	TokenNameEQUAL	
"skip"	TokenNameStringLiteral	skip
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_STRICT	TokenNameIdentifier	 ATTVAL  STRICT
=	TokenNameEQUAL	
"strict"	TokenNameStringLiteral	strict
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_STRING	TokenNameIdentifier	 ATTVAL  STRING
=	TokenNameEQUAL	
"string"	TokenNameStringLiteral	string
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_SUBSTITUTION	TokenNameIdentifier	 ATTVAL  SUBSTITUTION
=	TokenNameEQUAL	
"substitution"	TokenNameStringLiteral	substitution
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TIME	TokenNameIdentifier	 ATTVAL  TIME
=	TokenNameEQUAL	
"time"	TokenNameStringLiteral	time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TOKEN	TokenNameIdentifier	 ATTVAL  TOKEN
=	TokenNameEQUAL	
"token"	TokenNameStringLiteral	token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_TRUE	TokenNameIdentifier	 ATTVAL  TRUE
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNBOUNDED	TokenNameIdentifier	 ATTVAL  UNBOUNDED
=	TokenNameEQUAL	
"unbounded"	TokenNameStringLiteral	unbounded
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNION	TokenNameIdentifier	 ATTVAL  UNION
=	TokenNameEQUAL	
"union"	TokenNameStringLiteral	union
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNQUALIFIED	TokenNameIdentifier	 ATTVAL  UNQUALIFIED
=	TokenNameEQUAL	
"unqualified"	TokenNameStringLiteral	unqualified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNSIGNEDBYTE	TokenNameIdentifier	 ATTVAL  UNSIGNEDBYTE
=	TokenNameEQUAL	
"unsignedByte"	TokenNameStringLiteral	unsignedByte
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNSIGNEDINT	TokenNameIdentifier	 ATTVAL  UNSIGNEDINT
=	TokenNameEQUAL	
"unsignedInt"	TokenNameStringLiteral	unsignedInt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNSIGNEDLONG	TokenNameIdentifier	 ATTVAL  UNSIGNEDLONG
=	TokenNameEQUAL	
"unsignedLong"	TokenNameStringLiteral	unsignedLong
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_UNSIGNEDSHORT	TokenNameIdentifier	 ATTVAL  UNSIGNEDSHORT
=	TokenNameEQUAL	
"unsignedShort"	TokenNameStringLiteral	unsignedShort
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_YEAR	TokenNameIdentifier	 ATTVAL  YEAR
=	TokenNameEQUAL	
"gYear"	TokenNameStringLiteral	gYear
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTVAL_YEARMONTH	TokenNameIdentifier	 ATTVAL  YEARMONTH
=	TokenNameEQUAL	
"gYearMonth"	TokenNameStringLiteral	gYearMonth
;	TokenNameSEMICOLON	
// form qualified/unqualified 	TokenNameCOMMENT_LINE	form qualified/unqualified 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FORM_UNQUALIFIED	TokenNameIdentifier	 FORM  UNQUALIFIED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FORM_QUALIFIED	TokenNameIdentifier	 FORM  QUALIFIED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// attribute use 	TokenNameCOMMENT_LINE	attribute use 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
USE_OPTIONAL	TokenNameIdentifier	 USE  OPTIONAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
USE_REQUIRED	TokenNameIdentifier	 USE  REQUIRED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
USE_PROHIBITED	TokenNameIdentifier	 USE  PROHIBITED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// maxOccurs = "unbounded" 	TokenNameCOMMENT_LINE	maxOccurs = "unbounded" 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OCCURRENCE_UNBOUNDED	TokenNameIdentifier	 OCCURRENCE  UNBOUNDED
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
