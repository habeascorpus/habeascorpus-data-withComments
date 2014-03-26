/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * XML Parser constants, all kept in one place for ease of reuse * @see <a href="http://xml.apache.org/xerces-j/features.html">Xerces features</a> * @see <a href="http://xml.apache.org/xerces-j/properties.html">Xerces properties</a> * @see <a href= * "http://www.saxproject.org/apidoc/org/xml/sax/package-summary.html#package_description" * >SAX.</a> */	TokenNameCOMMENT_JAVADOC	 XML Parser constants, all kept in one place for ease of reuse @see <a href="http://xml.apache.org/xerces-j/features.html">Xerces features</a> @see <a href="http://xml.apache.org/xerces-j/properties.html">Xerces properties</a> @see <a href= "http://www.saxproject.org/apidoc/org/xml/sax/package-summary.html#package_description" >SAX.</a> 
public	TokenNamepublic	
class	TokenNameclass	
XmlConstants	TokenNameIdentifier	 Xml Constants
{	TokenNameLBRACE	
/** property for location of xml schema */	TokenNameCOMMENT_JAVADOC	 property for location of xml schema 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROPERTY_SCHEMA_LOCATION	TokenNameIdentifier	 PROPERTY  SCHEMA  LOCATION
=	TokenNameEQUAL	
"http://apache.org/xml/properties/schema/external-schemaLocation"	TokenNameStringLiteral	http://apache.org/xml/properties/schema/external-schemaLocation
;	TokenNameSEMICOLON	
/** property for location of no-name schema */	TokenNameCOMMENT_JAVADOC	 property for location of no-name schema 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROPERTY_NO_NAMESPACE_SCHEMA_LOCATION	TokenNameIdentifier	 PROPERTY  NO  NAMESPACE  SCHEMA  LOCATION
=	TokenNameEQUAL	
"http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation"	TokenNameStringLiteral	http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation
;	TokenNameSEMICOLON	
/** property for full validation */	TokenNameCOMMENT_JAVADOC	 property for full validation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_XSD_FULL_VALIDATION	TokenNameIdentifier	 FEATURE  XSD  FULL  VALIDATION
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema-full-checking"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema-full-checking
;	TokenNameSEMICOLON	
/** property for xsd */	TokenNameCOMMENT_JAVADOC	 property for xsd 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_XSD	TokenNameIdentifier	 FEATURE  XSD
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema
;	TokenNameSEMICOLON	
/** property for validation */	TokenNameCOMMENT_JAVADOC	 property for validation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_VALIDATION	TokenNameIdentifier	 FEATURE  VALIDATION
=	TokenNameEQUAL	
"http://xml.org/sax/features/validation"	TokenNameStringLiteral	http://xml.org/sax/features/validation
;	TokenNameSEMICOLON	
/** property for namespace support */	TokenNameCOMMENT_JAVADOC	 property for namespace support 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_NAMESPACES	TokenNameIdentifier	 FEATURE  NAMESPACES
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
/** property for schema language */	TokenNameCOMMENT_JAVADOC	 property for schema language 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_JAXP12_SCHEMA_LANGUAGE	TokenNameIdentifier	 FEATURE  JAX P12  SCHEMA  LANGUAGE
=	TokenNameEQUAL	
"http://java.sun.com/xml/jaxp/properties/schemaLanguage"	TokenNameStringLiteral	http://java.sun.com/xml/jaxp/properties/schemaLanguage
;	TokenNameSEMICOLON	
/** property for schema source */	TokenNameCOMMENT_JAVADOC	 property for schema source 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_JAXP12_SCHEMA_SOURCE	TokenNameIdentifier	 FEATURE  JAX P12  SCHEMA  SOURCE
=	TokenNameEQUAL	
"http://java.sun.com/xml/jaxp/properties/schemaSource"	TokenNameStringLiteral	http://java.sun.com/xml/jaxp/properties/schemaSource
;	TokenNameSEMICOLON	
/** the namespace for XML schema */	TokenNameCOMMENT_JAVADOC	 the namespace for XML schema 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URI_XSD	TokenNameIdentifier	 URI  XSD
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
;	TokenNameSEMICOLON	
/** the sax external entities feature */	TokenNameCOMMENT_JAVADOC	 the sax external entities feature 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_EXTERNAL_ENTITIES	TokenNameIdentifier	 FEATURE  EXTERNAL  ENTITIES
=	TokenNameEQUAL	
"http://xml.org/sax/features/external-general-entities"	TokenNameStringLiteral	http://xml.org/sax/features/external-general-entities
;	TokenNameSEMICOLON	
/** the apache.org/xml disalllow doctype decl feature */	TokenNameCOMMENT_JAVADOC	 the apache.org/xml disalllow doctype decl feature 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FEATURE_DISALLOW_DTD	TokenNameIdentifier	 FEATURE  DISALLOW  DTD
=	TokenNameEQUAL	
"http://apache.org/xml/features/disallow-doctype-decl"	TokenNameStringLiteral	http://apache.org/xml/features/disallow-doctype-decl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
