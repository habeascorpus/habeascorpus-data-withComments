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
Constants	TokenNameIdentifier	 Constants
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XMLSchemaValidator	TokenNameIdentifier	 XML Schema Validator
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
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
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
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
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * This is the "standard" parser configuration. It extends the DTD * configuration with the standard set of parser components. * The standard set of parser components include those needed * to parse and validate with DTD's, and those needed for XML * Schema.</p> * <p> * In addition to the features and properties recognized by the base * parser configuration, this class recognizes these additional * features and properties: * <ul> * <li>Features * <ul> * <li>http://apache.org/xml/features/validation/schema</li> * <li>http://apache.org/xml/features/validation/schema-full-checking</li> * <li>http://apache.org/xml/features/validation/schema/normalized-value</li> * <li>http://apache.org/xml/features/validation/schema/element-default</li> * </ul> * <li>Properties * <ul> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/entity-manager</li> * <li>http://apache.org/xml/properties/internal/document-scanner</li> * <li>http://apache.org/xml/properties/internal/dtd-scanner</li> * <li>http://apache.org/xml/properties/internal/grammar-pool</li> * <li>http://apache.org/xml/properties/internal/validator/dtd</li> * <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li> * </ul> * </ul> * * @author Arnaud Le Hors, IBM * @author Andy Clark, IBM * * @version $Id: StandardParserConfiguration.java 805582 2009-08-18 21:13:20Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 This is the "standard" parser configuration. It extends the DTD configuration with the standard set of parser components. The standard set of parser components include those needed to parse and validate with DTD's, and those needed for XML Schema.</p> <p> In addition to the features and properties recognized by the base parser configuration, this class recognizes these additional features and properties: <ul> <li>Features <ul> <li>http://apache.org/xml/features/validation/schema</li> <li>http://apache.org/xml/features/validation/schema-full-checking</li> <li>http://apache.org/xml/features/validation/schema/normalized-value</li> <li>http://apache.org/xml/features/validation/schema/element-default</li> </ul> <li>Properties <ul> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/entity-manager</li> <li>http://apache.org/xml/properties/internal/document-scanner</li> <li>http://apache.org/xml/properties/internal/dtd-scanner</li> <li>http://apache.org/xml/properties/internal/grammar-pool</li> <li>http://apache.org/xml/properties/internal/validator/dtd</li> <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li> </ul> </ul> * @author Arnaud Le Hors, IBM @author Andy Clark, IBM * @version $Id: StandardParserConfiguration.java 805582 2009-08-18 21:13:20Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
extends	TokenNameextends	
DTDConfiguration	TokenNameIdentifier	 DTD Configuration
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// feature identifiers 	TokenNameCOMMENT_LINE	feature identifiers 
/** Feature identifier: expose schema normalized value */	TokenNameCOMMENT_JAVADOC	 Feature identifier: expose schema normalized value 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NORMALIZE_DATA	TokenNameIdentifier	 NORMALIZE  DATA
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_NORMALIZED_VALUE	TokenNameIdentifier	 SCHEMA  NORMALIZED  VALUE
;	TokenNameSEMICOLON	
/** Feature identifier: send element default value via characters() */	TokenNameCOMMENT_JAVADOC	 Feature identifier: send element default value via characters() 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
;	TokenNameSEMICOLON	
/** Feature identifier: augment PSVI */	TokenNameCOMMENT_JAVADOC	 Feature identifier: augment PSVI 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_AUGMENT_PSVI	TokenNameIdentifier	 SCHEMA  AUGMENT  PSVI
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_AUGMENT_PSVI	TokenNameIdentifier	 SCHEMA  AUGMENT  PSVI
;	TokenNameSEMICOLON	
/** feature identifier: XML Schema validation */	TokenNameCOMMENT_JAVADOC	 feature identifier: XML Schema validation 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLSCHEMA_VALIDATION	TokenNameIdentifier	 XMLSCHEMA  VALIDATION
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_VALIDATION_FEATURE	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE
;	TokenNameSEMICOLON	
/** feature identifier: XML Schema validation -- full checking */	TokenNameCOMMENT_JAVADOC	 feature identifier: XML Schema validation -- full checking 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLSCHEMA_FULL_CHECKING	TokenNameIdentifier	 XMLSCHEMA  FULL  CHECKING
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_FULL_CHECKING	TokenNameIdentifier	 SCHEMA  FULL  CHECKING
;	TokenNameSEMICOLON	
/** Feature: generate synthetic annotations */	TokenNameCOMMENT_JAVADOC	 Feature: generate synthetic annotations 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GENERATE_SYNTHETIC_ANNOTATIONS	TokenNameIdentifier	 GENERATE  SYNTHETIC  ANNOTATIONS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
GENERATE_SYNTHETIC_ANNOTATIONS_FEATURE	TokenNameIdentifier	 GENERATE  SYNTHETIC  ANNOTATIONS  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: validate annotations */	TokenNameCOMMENT_JAVADOC	 Feature identifier: validate annotations 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATE_ANNOTATIONS	TokenNameIdentifier	 VALIDATE  ANNOTATIONS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
VALIDATE_ANNOTATIONS_FEATURE	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: honour all schemaLocations */	TokenNameCOMMENT_JAVADOC	 Feature identifier: honour all schemaLocations 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HONOUR_ALL_SCHEMALOCATIONS	TokenNameIdentifier	 HONOUR  ALL  SCHEMALOCATIONS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
HONOUR_ALL_SCHEMALOCATIONS_FEATURE	TokenNameIdentifier	 HONOUR  ALL  SCHEMALOCATIONS  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: namespace growth */	TokenNameCOMMENT_JAVADOC	 Feature identifier: namespace growth 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_GROWTH	TokenNameIdentifier	 NAMESPACE  GROWTH
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NAMESPACE_GROWTH_FEATURE	TokenNameIdentifier	 NAMESPACE  GROWTH  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: tolerate duplicates */	TokenNameCOMMENT_JAVADOC	 Feature identifier: tolerate duplicates 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOLERATE_DUPLICATES	TokenNameIdentifier	 TOLERATE  DUPLICATES
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
TOLERATE_DUPLICATES_FEATURE	TokenNameIdentifier	 TOLERATE  DUPLICATES  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: whether to ignore xsi:type attributes until a global element declaration is encountered */	TokenNameCOMMENT_JAVADOC	 Feature identifier: whether to ignore xsi:type attributes until a global element declaration is encountered 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IGNORE_XSI_TYPE	TokenNameIdentifier	 IGNORE  XSI  TYPE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IGNORE_XSI_TYPE_FEATURE	TokenNameIdentifier	 IGNORE  XSI  TYPE  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: whether to ignore ID/IDREF errors */	TokenNameCOMMENT_JAVADOC	 Feature identifier: whether to ignore ID/IDREF errors 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ID_IDREF_CHECKING	TokenNameIdentifier	 ID  IDREF  CHECKING
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ID_IDREF_CHECKING_FEATURE	TokenNameIdentifier	 ID  IDREF  CHECKING  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: whether to ignore unparsed entity errors */	TokenNameCOMMENT_JAVADOC	 Feature identifier: whether to ignore unparsed entity errors 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNPARSED_ENTITY_CHECKING	TokenNameIdentifier	 UNPARSED  ENTITY  CHECKING
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
UNPARSED_ENTITY_CHECKING_FEATURE	TokenNameIdentifier	 UNPARSED  ENTITY  CHECKING  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: whether to ignore identity constraint errors */	TokenNameCOMMENT_JAVADOC	 Feature identifier: whether to ignore identity constraint errors 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IDENTITY_CONSTRAINT_CHECKING	TokenNameIdentifier	 IDENTITY  CONSTRAINT  CHECKING
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IDC_CHECKING_FEATURE	TokenNameIdentifier	 IDC  CHECKING  FEATURE
;	TokenNameSEMICOLON	
// property identifiers 	TokenNameCOMMENT_LINE	property identifiers 
/** Property identifier: XML Schema validator. */	TokenNameCOMMENT_JAVADOC	 Property identifier: XML Schema validator. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATOR	TokenNameIdentifier	 SCHEMA  VALIDATOR
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_VALIDATOR_PROPERTY	TokenNameIdentifier	 SCHEMA  VALIDATOR  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: schema location. */	TokenNameCOMMENT_JAVADOC	 Property identifier: schema location. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
;	TokenNameSEMICOLON	
/** Property identifier: no namespace schema location. */	TokenNameCOMMENT_JAVADOC	 Property identifier: no namespace schema location. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
;	TokenNameSEMICOLON	
/** Property identifier: root type definition. */	TokenNameCOMMENT_JAVADOC	 Property identifier: root type definition. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROOT_TYPE_DEF	TokenNameIdentifier	 ROOT  TYPE  DEF
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ROOT_TYPE_DEFINITION_PROPERTY	TokenNameIdentifier	 ROOT  TYPE  DEFINITION  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: root element declaration. */	TokenNameCOMMENT_JAVADOC	 Property identifier: root element declaration. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROOT_ELEMENT_DECL	TokenNameIdentifier	 ROOT  ELEMENT  DECL
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ROOT_ELEMENT_DECLARATION_PROPERTY	TokenNameIdentifier	 ROOT  ELEMENT  DECLARATION  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: Schema DV Factory */	TokenNameCOMMENT_JAVADOC	 Property identifier: Schema DV Factory 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_DV_FACTORY	TokenNameIdentifier	 SCHEMA  DV  FACTORY
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_DV_FACTORY_PROPERTY	TokenNameIdentifier	 SCHEMA  DV  FACTORY  PROPERTY
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// components (non-configurable) 	TokenNameCOMMENT_LINE	components (non-configurable) 
/** XML Schema Validator. */	TokenNameCOMMENT_JAVADOC	 XML Schema Validator. 
protected	TokenNameprotected	
XMLSchemaValidator	TokenNameIdentifier	 XML Schema Validator
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a parser configuration using the specified symbol table. * * @param symbolTable The symbol table to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table. * @param symbolTable The symbol table to use. 
public	TokenNamepublic	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
/** * Constructs a parser configuration using the specified symbol table and * grammar pool. * <p> * <strong>REVISIT:</strong> * Grammar pool will be updated when the new validation engine is * implemented. * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table and grammar pool. <p> <strong>REVISIT:</strong> Grammar pool will be updated when the new validation engine is implemented. * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. 
public	TokenNamepublic	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
/** * Constructs a parser configuration using the specified symbol table, * grammar pool, and parent settings. * <p> * <strong>REVISIT:</strong> * Grammar pool will be updated when the new validation engine is * implemented. * * @param symbolTable The symbol table to use. * @param grammarPool The grammar pool to use. * @param parentSettings The parent settings. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration using the specified symbol table, grammar pool, and parent settings. <p> <strong>REVISIT:</strong> Grammar pool will be updated when the new validation engine is implemented. * @param symbolTable The symbol table to use. @param grammarPool The grammar pool to use. @param parentSettings The parent settings. 
public	TokenNamepublic	
StandardParserConfiguration	TokenNameIdentifier	 Standard Parser Configuration
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
parentSettings	TokenNameIdentifier	 parent Settings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
,	TokenNameCOMMA	
parentSettings	TokenNameIdentifier	 parent Settings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add default recognized features 	TokenNameCOMMENT_LINE	add default recognized features 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
recognizedFeatures	TokenNameIdentifier	 recognized Features
=	TokenNameEQUAL	
{	TokenNameLBRACE	
NORMALIZE_DATA	TokenNameIdentifier	 NORMALIZE  DATA
,	TokenNameCOMMA	
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
,	TokenNameCOMMA	
SCHEMA_AUGMENT_PSVI	TokenNameIdentifier	 SCHEMA  AUGMENT  PSVI
,	TokenNameCOMMA	
GENERATE_SYNTHETIC_ANNOTATIONS	TokenNameIdentifier	 GENERATE  SYNTHETIC  ANNOTATIONS
,	TokenNameCOMMA	
VALIDATE_ANNOTATIONS	TokenNameIdentifier	 VALIDATE  ANNOTATIONS
,	TokenNameCOMMA	
HONOUR_ALL_SCHEMALOCATIONS	TokenNameIdentifier	 HONOUR  ALL  SCHEMALOCATIONS
,	TokenNameCOMMA	
NAMESPACE_GROWTH	TokenNameIdentifier	 NAMESPACE  GROWTH
,	TokenNameCOMMA	
TOLERATE_DUPLICATES	TokenNameIdentifier	 TOLERATE  DUPLICATES
,	TokenNameCOMMA	
// NOTE: These shouldn't really be here but since the XML Schema 	TokenNameCOMMENT_LINE	NOTE: These shouldn't really be here but since the XML Schema 
// validator is constructed dynamically, its recognized 	TokenNameCOMMENT_LINE	validator is constructed dynamically, its recognized 
// features might not have been set and it would cause a 	TokenNameCOMMENT_LINE	features might not have been set and it would cause a 
// not-recognized exception to be thrown. -Ac 	TokenNameCOMMENT_LINE	not-recognized exception to be thrown. -Ac 
XMLSCHEMA_VALIDATION	TokenNameIdentifier	 XMLSCHEMA  VALIDATION
,	TokenNameCOMMA	
XMLSCHEMA_FULL_CHECKING	TokenNameIdentifier	 XMLSCHEMA  FULL  CHECKING
,	TokenNameCOMMA	
IGNORE_XSI_TYPE	TokenNameIdentifier	 IGNORE  XSI  TYPE
,	TokenNameCOMMA	
ID_IDREF_CHECKING	TokenNameIdentifier	 ID  IDREF  CHECKING
,	TokenNameCOMMA	
IDENTITY_CONSTRAINT_CHECKING	TokenNameIdentifier	 IDENTITY  CONSTRAINT  CHECKING
,	TokenNameCOMMA	
UNPARSED_ENTITY_CHECKING	TokenNameIdentifier	 UNPARSED  ENTITY  CHECKING
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
addRecognizedFeatures	TokenNameIdentifier	 add Recognized Features
(	TokenNameLPAREN	
recognizedFeatures	TokenNameIdentifier	 recognized Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set state for default features 	TokenNameCOMMENT_LINE	set state for default features 
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NORMALIZE_DATA	TokenNameIdentifier	 NORMALIZE  DATA
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_AUGMENT_PSVI	TokenNameIdentifier	 SCHEMA  AUGMENT  PSVI
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
GENERATE_SYNTHETIC_ANNOTATIONS	TokenNameIdentifier	 GENERATE  SYNTHETIC  ANNOTATIONS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
VALIDATE_ANNOTATIONS	TokenNameIdentifier	 VALIDATE  ANNOTATIONS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
HONOUR_ALL_SCHEMALOCATIONS	TokenNameIdentifier	 HONOUR  ALL  SCHEMALOCATIONS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACE_GROWTH	TokenNameIdentifier	 NAMESPACE  GROWTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
TOLERATE_DUPLICATES	TokenNameIdentifier	 TOLERATE  DUPLICATES
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
IGNORE_XSI_TYPE	TokenNameIdentifier	 IGNORE  XSI  TYPE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
ID_IDREF_CHECKING	TokenNameIdentifier	 ID  IDREF  CHECKING
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
IDENTITY_CONSTRAINT_CHECKING	TokenNameIdentifier	 IDENTITY  CONSTRAINT  CHECKING
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
UNPARSED_ENTITY_CHECKING	TokenNameIdentifier	 UNPARSED  ENTITY  CHECKING
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add default recognized properties 	TokenNameCOMMENT_LINE	add default recognized properties 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
recognizedProperties	TokenNameIdentifier	 recognized Properties
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// NOTE: These shouldn't really be here but since the XML Schema 	TokenNameCOMMENT_LINE	NOTE: These shouldn't really be here but since the XML Schema 
// validator is constructed dynamically, its recognized 	TokenNameCOMMENT_LINE	validator is constructed dynamically, its recognized 
// properties might not have been set and it would cause a 	TokenNameCOMMENT_LINE	properties might not have been set and it would cause a 
// not-recognized exception to be thrown. -Ac 	TokenNameCOMMENT_LINE	not-recognized exception to be thrown. -Ac 
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
,	TokenNameCOMMA	
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
,	TokenNameCOMMA	
ROOT_TYPE_DEF	TokenNameIdentifier	 ROOT  TYPE  DEF
,	TokenNameCOMMA	
ROOT_ELEMENT_DECL	TokenNameIdentifier	 ROOT  ELEMENT  DECL
,	TokenNameCOMMA	
SCHEMA_DV_FACTORY	TokenNameIdentifier	 SCHEMA  DV  FACTORY
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
addRecognizedProperties	TokenNameIdentifier	 add Recognized Properties
(	TokenNameLPAREN	
recognizedProperties	TokenNameIdentifier	 recognized Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable,XMLGrammarPool) 	TokenNameCOMMENT_LINE	<init>(SymbolTable,XMLGrammarPool) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Configures the pipeline. */	TokenNameCOMMENT_JAVADOC	 Configures the pipeline. 
protected	TokenNameprotected	
void	TokenNamevoid	
configurePipeline	TokenNameIdentifier	 configure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
configurePipeline	TokenNameIdentifier	 configure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
XMLSCHEMA_VALIDATION	TokenNameIdentifier	 XMLSCHEMA  VALIDATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If schema validator was not in the pipeline insert it. 	TokenNameCOMMENT_LINE	If schema validator was not in the pipeline insert it. 
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
=	TokenNameEQUAL	
new	TokenNamenew	
XMLSchemaValidator	TokenNameIdentifier	 XML Schema Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add schema component 	TokenNameCOMMENT_LINE	add schema component 
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SCHEMA_VALIDATOR	TokenNameIdentifier	 SCHEMA  VALIDATOR
,	TokenNameCOMMA	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addComponent	TokenNameIdentifier	 add Component
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add schema message formatter 	TokenNameCOMMENT_LINE	add schema message formatter 
if	TokenNameif	
(	TokenNameLPAREN	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
getMessageFormatter	TokenNameIdentifier	 get Message Formatter
(	TokenNameLPAREN	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
.	TokenNameDOT	
SCHEMA_DOMAIN	TokenNameIdentifier	 SCHEMA  DOMAIN
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
xmft	TokenNameIdentifier	 xmft
=	TokenNameEQUAL	
new	TokenNamenew	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
putMessageFormatter	TokenNameIdentifier	 put Message Formatter
(	TokenNameLPAREN	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
.	TokenNameDOT	
SCHEMA_DOMAIN	TokenNameIdentifier	 SCHEMA  DOMAIN
,	TokenNameCOMMA	
xmft	TokenNameIdentifier	 xmft
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fLastComponent	TokenNameIdentifier	 f Last Component
=	TokenNameEQUAL	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
;	TokenNameSEMICOLON	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaValidator	TokenNameIdentifier	 f Schema Validator
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
fNamespaceBinder	TokenNameIdentifier	 f Namespace Binder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// configurePipeline() 	TokenNameCOMMENT_LINE	configurePipeline() 
// features and properties 	TokenNameCOMMENT_LINE	features and properties 
/** * Check a feature. If feature is know and supported, this method simply * returns. Otherwise, the appropriate exception is thrown. * * @param featureId The unique identifier (URI) of the feature. * * @throws XMLConfigurationException Thrown for configuration error. * In general, components should * only throw this exception if * it is <strong>really</strong> * a critical error. */	TokenNameCOMMENT_JAVADOC	 Check a feature. If feature is know and supported, this method simply returns. Otherwise, the appropriate exception is thrown. * @param featureId The unique identifier (URI) of the feature. * @throws XMLConfigurationException Thrown for configuration error. In general, components should only throw this exception if it is <strong>really</strong> a critical error. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkFeature	TokenNameIdentifier	 check Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Xerces Features 	TokenNameCOMMENT_LINE	Xerces Features 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// http://apache.org/xml/features/validation/schema 	TokenNameCOMMENT_LINE	http://apache.org/xml/features/validation/schema 
// Lets the user turn Schema validation support on/off. 	TokenNameCOMMENT_LINE	Lets the user turn Schema validation support on/off. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_VALIDATION_FEATURE	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_VALIDATION_FEATURE	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// activate full schema checking 	TokenNameCOMMENT_LINE	activate full schema checking 
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_FULL_CHECKING	TokenNameIdentifier	 SCHEMA  FULL  CHECKING
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_FULL_CHECKING	TokenNameIdentifier	 SCHEMA  FULL  CHECKING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Feature identifier: expose schema normalized value 	TokenNameCOMMENT_LINE	Feature identifier: expose schema normalized value 
// http://apache.org/xml/features/validation/schema/normalized-value 	TokenNameCOMMENT_LINE	http://apache.org/xml/features/validation/schema/normalized-value 
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_NORMALIZED_VALUE	TokenNameIdentifier	 SCHEMA  NORMALIZED  VALUE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_NORMALIZED_VALUE	TokenNameIdentifier	 SCHEMA  NORMALIZED  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Feature identifier: send element default value via characters() 	TokenNameCOMMENT_LINE	Feature identifier: send element default value via characters() 
// http://apache.org/xml/features/validation/schema/element-default 	TokenNameCOMMENT_LINE	http://apache.org/xml/features/validation/schema/element-default 
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
featureId	TokenNameIdentifier	 feature Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_ELEMENT_DEFAULT	TokenNameIdentifier	 SCHEMA  ELEMENT  DEFAULT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Not recognized 	TokenNameCOMMENT_LINE	Not recognized 
// 	TokenNameCOMMENT_LINE	 
super	TokenNamesuper	
.	TokenNameDOT	
checkFeature	TokenNameIdentifier	 check Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// checkFeature(String) 	TokenNameCOMMENT_LINE	checkFeature(String) 
/** * Check a property. If the property is know and supported, this method * simply returns. Otherwise, the appropriate exception is thrown. * * @param propertyId The unique identifier (URI) of the property * being set. * * @throws XMLConfigurationException Thrown for configuration error. * In general, components should * only throw this exception if * it is <strong>really</strong> * a critical error. */	TokenNameCOMMENT_JAVADOC	 Check a property. If the property is know and supported, this method simply returns. Otherwise, the appropriate exception is thrown. * @param propertyId The unique identifier (URI) of the property being set. * @throws XMLConfigurationException Thrown for configuration error. In general, components should only throw this exception if it is <strong>really</strong> a critical error. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkProperty	TokenNameIdentifier	 check Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Xerces Properties 	TokenNameCOMMENT_LINE	Xerces Properties 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_LOCATION	TokenNameIdentifier	 SCHEMA  LOCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_NONS_LOCATION	TokenNameIdentifier	 SCHEMA  NONS  LOCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JAXP_PROPERTY_PREFIX	TokenNameIdentifier	 JAXP  PROPERTY  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JAXP_PROPERTY_PREFIX	TokenNameIdentifier	 JAXP  PROPERTY  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_SOURCE	TokenNameIdentifier	 SCHEMA  SOURCE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_SOURCE	TokenNameIdentifier	 SCHEMA  SOURCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Not recognized 	TokenNameCOMMENT_LINE	Not recognized 
// 	TokenNameCOMMENT_LINE	 
super	TokenNamesuper	
.	TokenNameDOT	
checkProperty	TokenNameIdentifier	 check Property
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// checkProperty(String) 	TokenNameCOMMENT_LINE	checkProperty(String) 
}	TokenNameRBRACE	
// class StandardParserConfiguration 	TokenNameCOMMENT_LINE	class StandardParserConfiguration 
