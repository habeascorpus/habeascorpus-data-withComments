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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XmlConstants	TokenNameIdentifier	 Xml Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
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
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
/** * Validate XML Schema documents. * This task validates XML schema documents. It requires an XML parser * that handles the relevant SAx, Xerces or JAXP options. * * To resolve remote referencies, Ant may need its proxy set up, using the * setproxy task. * * Hands off most of the work to its parent, {@link XMLValidateTask} * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Validate XML Schema documents. This task validates XML schema documents. It requires an XML parser that handles the relevant SAx, Xerces or JAXP options. * To resolve remote referencies, Ant may need its proxy set up, using the setproxy task. * Hands off most of the work to its parent, {@link XMLValidateTask} @since Ant1.7 
public	TokenNamepublic	
class	TokenNameclass	
SchemaValidate	TokenNameIdentifier	 Schema Validate
extends	TokenNameextends	
XMLValidateTask	TokenNameIdentifier	 XML Validate Task
{	TokenNameLBRACE	
/** map of all declared schemas; we catch and complain about redefinitions */	TokenNameCOMMENT_JAVADOC	 map of all declared schemas; we catch and complain about redefinitions 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
schemaLocations	TokenNameIdentifier	 schema Locations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** full checking of a schema */	TokenNameCOMMENT_JAVADOC	 full checking of a schema 
private	TokenNameprivate	
boolean	TokenNameboolean	
fullChecking	TokenNameIdentifier	 full Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * flag to disable DTD support. Best left enabled. */	TokenNameCOMMENT_JAVADOC	 flag to disable DTD support. Best left enabled. 
private	TokenNameprivate	
boolean	TokenNameboolean	
disableDTD	TokenNameIdentifier	 disable DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * default URL for nonamespace schemas */	TokenNameCOMMENT_JAVADOC	 default URL for nonamespace schemas 
private	TokenNameprivate	
SchemaLocation	TokenNameIdentifier	 Schema Location
anonymousSchema	TokenNameIdentifier	 anonymous Schema
;	TokenNameSEMICOLON	
// Error strings 	TokenNameCOMMENT_LINE	Error strings 
/** SAX1 not supported */	TokenNameCOMMENT_JAVADOC	 SAX1 not supported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_SAX_1	TokenNameIdentifier	 ERROR  SAX 1
=	TokenNameEQUAL	
"SAX1 parsers are not supported"	TokenNameStringLiteral	SAX1 parsers are not supported
;	TokenNameSEMICOLON	
/** schema features not supported */	TokenNameCOMMENT_JAVADOC	 schema features not supported 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_XSD_SUPPORT	TokenNameIdentifier	 ERROR  NO  XSD  SUPPORT
=	TokenNameEQUAL	
"Parser does not support Xerces or JAXP schema features"	TokenNameStringLiteral	Parser does not support Xerces or JAXP schema features
;	TokenNameSEMICOLON	
/** too many default schemas */	TokenNameCOMMENT_JAVADOC	 too many default schemas 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_TOO_MANY_DEFAULT_SCHEMAS	TokenNameIdentifier	 ERROR  TOO  MANY  DEFAULT  SCHEMAS
=	TokenNameEQUAL	
"Only one of defaultSchemaFile and defaultSchemaURL allowed"	TokenNameStringLiteral	Only one of defaultSchemaFile and defaultSchemaURL allowed
;	TokenNameSEMICOLON	
/** unable to create parser */	TokenNameCOMMENT_JAVADOC	 unable to create parser 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_PARSER_CREATION_FAILURE	TokenNameIdentifier	 ERROR  PARSER  CREATION  FAILURE
=	TokenNameEQUAL	
"Could not create parser"	TokenNameStringLiteral	Could not create parser
;	TokenNameSEMICOLON	
/** adding schema */	TokenNameCOMMENT_JAVADOC	 adding schema 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MESSAGE_ADDING_SCHEMA	TokenNameIdentifier	 MESSAGE  ADDING  SCHEMA
=	TokenNameEQUAL	
"Adding schema "	TokenNameStringLiteral	Adding schema 
;	TokenNameSEMICOLON	
/** Duplicate declaration of schema */	TokenNameCOMMENT_JAVADOC	 Duplicate declaration of schema 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_DUPLICATE_SCHEMA	TokenNameIdentifier	 ERROR  DUPLICATE  SCHEMA
=	TokenNameEQUAL	
"Duplicate declaration of schema "	TokenNameStringLiteral	Duplicate declaration of schema 
;	TokenNameSEMICOLON	
/** * Called by the project to let the task initialize properly. The default * implementation is a no-op. * * @throws BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Called by the project to let the task initialize properly. The default implementation is a no-op. * @throws BuildException if something goes wrong with the build 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//validating 	TokenNameCOMMENT_LINE	validating 
setLenient	TokenNameIdentifier	 set Lenient
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turn on XSD support in Xerces. * @return true on success, false on failure */	TokenNameCOMMENT_JAVADOC	 Turn on XSD support in Xerces. @return true on success, false on failure 
public	TokenNamepublic	
boolean	TokenNameboolean	
enableXercesSchemaValidation	TokenNameIdentifier	 enable Xerces Schema Validation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
FEATURE_XSD	TokenNameIdentifier	 FEATURE  XSD
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//set the schema source for the doc 	TokenNameCOMMENT_LINE	set the schema source for the doc 
setNoNamespaceSchemaProperty	TokenNameIdentifier	 set No Namespace Schema Property
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
PROPERTY_NO_NAMESPACE_SCHEMA_LOCATION	TokenNameIdentifier	 PROPERTY  NO  NAMESPACE  SCHEMA  LOCATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set nonamespace handling up for xerces or other parsers * @param property name of the property to set */	TokenNameCOMMENT_JAVADOC	 set nonamespace handling up for xerces or other parsers @param property name of the property to set 
private	TokenNameprivate	
void	TokenNamevoid	
setNoNamespaceSchemaProperty	TokenNameIdentifier	 set No Namespace Schema Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
anonSchema	TokenNameIdentifier	 anon Schema
=	TokenNameEQUAL	
getNoNamespaceSchemaURL	TokenNameIdentifier	 get No Namespace Schema URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anonSchema	TokenNameIdentifier	 anon Schema
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
anonSchema	TokenNameIdentifier	 anon Schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set schema attributes in a JAXP 1.2 engine. * @see <A href="http://java.sun.com/xml/jaxp/change-requests-11.html"> * JAXP 1.2 Approved CHANGES</A> * @return true on success, false on failure */	TokenNameCOMMENT_JAVADOC	 Set schema attributes in a JAXP 1.2 engine. @see <A href="http://java.sun.com/xml/jaxp/change-requests-11.html"> JAXP 1.2 Approved CHANGES</A> @return true on success, false on failure 
public	TokenNamepublic	
boolean	TokenNameboolean	
enableJAXP12SchemaValidation	TokenNameIdentifier	 enable JAX P12 Schema Validation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//enable XSD 	TokenNameCOMMENT_LINE	enable XSD 
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
FEATURE_JAXP12_SCHEMA_LANGUAGE	TokenNameIdentifier	 FEATURE  JAX P12  SCHEMA  LANGUAGE
,	TokenNameCOMMA	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
URI_XSD	TokenNameIdentifier	 URI  XSD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//set the schema source for the doc 	TokenNameCOMMENT_LINE	set the schema source for the doc 
setNoNamespaceSchemaProperty	TokenNameIdentifier	 set No Namespace Schema Property
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
FEATURE_JAXP12_SCHEMA_SOURCE	TokenNameIdentifier	 FEATURE  JAX P12  SCHEMA  SOURCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add the schema * @param location the schema location. * @throws BuildException if there is no namespace, or if there already * is a declaration of this schema with a different value */	TokenNameCOMMENT_JAVADOC	 add the schema @param location the schema location. @throws BuildException if there is no namespace, or if there already is a declaration of this schema with a different value 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredSchema	TokenNameIdentifier	 add Configured Schema
(	TokenNameLPAREN	
SchemaLocation	TokenNameIdentifier	 Schema Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"adding schema "	TokenNameStringLiteral	adding schema 
+	TokenNamePLUS	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
validateNamespace	TokenNameIdentifier	 validate Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SchemaLocation	TokenNameIdentifier	 Schema Location
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaLocation	TokenNameIdentifier	 Schema Location
)	TokenNameRPAREN	
schemaLocations	TokenNameIdentifier	 schema Locations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_DUPLICATE_SCHEMA	TokenNameIdentifier	 ERROR  DUPLICATE  SCHEMA
+	TokenNamePLUS	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
schemaLocations	TokenNameIdentifier	 schema Locations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * enable full schema checking. Slower but better. * @param fullChecking a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 enable full schema checking. Slower but better. @param fullChecking a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setFullChecking	TokenNameIdentifier	 set Full Checking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
fullChecking	TokenNameIdentifier	 full Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fullChecking	TokenNameIdentifier	 full Checking
=	TokenNameEQUAL	
fullChecking	TokenNameIdentifier	 full Checking
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * create a schema location to hold the anonymous * schema */	TokenNameCOMMENT_JAVADOC	 create a schema location to hold the anonymous schema 
protected	TokenNameprotected	
void	TokenNamevoid	
createAnonymousSchema	TokenNameIdentifier	 create Anonymous Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
=	TokenNameEQUAL	
new	TokenNamenew	
SchemaLocation	TokenNameIdentifier	 Schema Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
.	TokenNameDOT	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
"(no namespace)"	TokenNameStringLiteral	(no namespace)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * identify the URL of the default schema * @param defaultSchemaURL the URL of the default schema. */	TokenNameCOMMENT_JAVADOC	 identify the URL of the default schema @param defaultSchemaURL the URL of the default schema. 
public	TokenNamepublic	
void	TokenNamevoid	
setNoNamespaceURL	TokenNameIdentifier	 set No Namespace URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultSchemaURL	TokenNameIdentifier	 default Schema URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createAnonymousSchema	TokenNameIdentifier	 create Anonymous Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
defaultSchemaURL	TokenNameIdentifier	 default Schema URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * identify a file containing the default schema * @param defaultSchemaFile the location of the default schema. */	TokenNameCOMMENT_JAVADOC	 identify a file containing the default schema @param defaultSchemaFile the location of the default schema. 
public	TokenNamepublic	
void	TokenNamevoid	
setNoNamespaceFile	TokenNameIdentifier	 set No Namespace File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
defaultSchemaFile	TokenNameIdentifier	 default Schema File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createAnonymousSchema	TokenNameIdentifier	 create Anonymous Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
defaultSchemaFile	TokenNameIdentifier	 default Schema File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * flag to disable DTD support. * @param disableDTD a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 flag to disable DTD support. @param disableDTD a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDisableDTD	TokenNameIdentifier	 set Disable DTD
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableDTD	TokenNameIdentifier	 disable DTD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
disableDTD	TokenNameIdentifier	 disable DTD
=	TokenNameEQUAL	
disableDTD	TokenNameIdentifier	 disable DTD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * init the parser : load the parser class, and set features if necessary It * is only after this that the reader is valid * * @throws BuildException if something went wrong */	TokenNameCOMMENT_JAVADOC	 init the parser : load the parser class, and set features if necessary It is only after this that the reader is valid * @throws BuildException if something went wrong 
protected	TokenNameprotected	
void	TokenNamevoid	
initValidator	TokenNameIdentifier	 init Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
initValidator	TokenNameIdentifier	 init Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//validate the parser type 	TokenNameCOMMENT_LINE	validate the parser type 
if	TokenNameif	
(	TokenNameLPAREN	
isSax1Parser	TokenNameIdentifier	 is Sax1 Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_SAX_1	TokenNameIdentifier	 ERROR  SAX 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//enable schema 	TokenNameCOMMENT_LINE	enable schema 
//setFeature(XmlConstants.FEATURE_VALIDATION, false); 	TokenNameCOMMENT_LINE	setFeature(XmlConstants.FEATURE_VALIDATION, false); 
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
FEATURE_NAMESPACES	TokenNameIdentifier	 FEATURE  NAMESPACES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
enableXercesSchemaValidation	TokenNameIdentifier	 enable Xerces Schema Validation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
enableJAXP12SchemaValidation	TokenNameIdentifier	 enable JAX P12 Schema Validation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//couldnt use the xerces or jaxp calls 	TokenNameCOMMENT_LINE	couldnt use the xerces or jaxp calls 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_XSD_SUPPORT	TokenNameIdentifier	 ERROR  NO  XSD  SUPPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//enable schema checking 	TokenNameCOMMENT_LINE	enable schema checking 
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
FEATURE_XSD_FULL_VALIDATION	TokenNameIdentifier	 FEATURE  XSD  FULL  VALIDATION
,	TokenNameCOMMA	
fullChecking	TokenNameIdentifier	 full Checking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//turn off DTDs if desired 	TokenNameCOMMENT_LINE	turn off DTDs if desired 
setFeatureIfSupported	TokenNameIdentifier	 set Feature If Supported
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
FEATURE_DISALLOW_DTD	TokenNameIdentifier	 FEATURE  DISALLOW  DTD
,	TokenNameCOMMA	
disableDTD	TokenNameIdentifier	 disable DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//schema declarations go in next 	TokenNameCOMMENT_LINE	schema declarations go in next 
addSchemaLocations	TokenNameIdentifier	 add Schema Locations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a reader if the use of the class did not specify another one. * The reason to not use {@link org.apache.tools.ant.util.JAXPUtils#getXMLReader()} was to * create our own factory with our own options. * @return a default XML parser */	TokenNameCOMMENT_JAVADOC	 Create a reader if the use of the class did not specify another one. The reason to not use {@link org.apache.tools.ant.util.JAXPUtils#getXMLReader()} was to create our own factory with our own options. @return a default XML parser 
protected	TokenNameprotected	
XMLReader	TokenNameIdentifier	 XML Reader
createDefaultReader	TokenNameIdentifier	 create Default Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParser	TokenNameIdentifier	 sax Parser
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
saxParser	TokenNameIdentifier	 sax Parser
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_PARSER_CREATION_FAILURE	TokenNameIdentifier	 ERROR  PARSER  CREATION  FAILURE
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_PARSER_CREATION_FAILURE	TokenNameIdentifier	 ERROR  PARSER  CREATION  FAILURE
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * build a string list of all schema locations, then set the relevant * property. */	TokenNameCOMMENT_JAVADOC	 build a string list of all schema locations, then set the relevant property. 
protected	TokenNameprotected	
void	TokenNamevoid	
addSchemaLocations	TokenNameIdentifier	 add Schema Locations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
schemaLocations	TokenNameIdentifier	 schema Locations
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SchemaLocation	TokenNameIdentifier	 Schema Location
schemaLocation	TokenNameIdentifier	 schema Location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaLocation	TokenNameIdentifier	 Schema Location
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tuple	TokenNameIdentifier	 tuple
=	TokenNameEQUAL	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
getURIandLocation	TokenNameIdentifier	 get UR Iand Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tuple	TokenNameIdentifier	 tuple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Adding schema "	TokenNameStringLiteral	Adding schema 
+	TokenNamePLUS	
tuple	TokenNameIdentifier	 tuple
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
XmlConstants	TokenNameIdentifier	 Xml Constants
.	TokenNameDOT	
PROPERTY_SCHEMA_LOCATION	TokenNameIdentifier	 PROPERTY  SCHEMA  LOCATION
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * get the URL of the no namespace schema * @return the schema URL */	TokenNameCOMMENT_JAVADOC	 get the URL of the no namespace schema @return the schema URL 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getNoNamespaceSchemaURL	TokenNameIdentifier	 get No Namespace Schema URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
anonymousSchema	TokenNameIdentifier	 anonymous Schema
.	TokenNameDOT	
getSchemaLocationURL	TokenNameIdentifier	 get Schema Location URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * set a feature if it is supported, log at verbose level if * not * @param feature the feature. * @param value a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 set a feature if it is supported, log at verbose level if not @param feature the feature. @param value a <code>boolean</code> value. 
protected	TokenNameprotected	
void	TokenNamevoid	
setFeatureIfSupported	TokenNameIdentifier	 set Feature If Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
getXmlReader	TokenNameIdentifier	 get Xml Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Not recognizied: "	TokenNameStringLiteral	Not recognizied: 
+	TokenNamePLUS	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Not supported: "	TokenNameStringLiteral	Not supported: 
+	TokenNamePLUS	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * handler called on successful file validation. * * @param fileProcessed number of files processed. */	TokenNameCOMMENT_JAVADOC	 handler called on successful file validation. * @param fileProcessed number of files processed. 
protected	TokenNameprotected	
void	TokenNamevoid	
onSuccessfulValidation	TokenNameIdentifier	 on Successful Validation
(	TokenNameLPAREN	
int	TokenNameint	
fileProcessed	TokenNameIdentifier	 file Processed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
fileProcessed	TokenNameIdentifier	 file Processed
+	TokenNamePLUS	
MESSAGE_FILES_VALIDATED	TokenNameIdentifier	 MESSAGE  FILES  VALIDATED
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * representation of a schema location. This is a URI plus either a file or * a url */	TokenNameCOMMENT_JAVADOC	 representation of a schema location. This is a URI plus either a file or a url 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SchemaLocation	TokenNameIdentifier	 Schema Location
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
/** No namespace URI */	TokenNameCOMMENT_JAVADOC	 No namespace URI 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_URI	TokenNameIdentifier	 ERROR  NO  URI
=	TokenNameEQUAL	
"No namespace URI"	TokenNameStringLiteral	No namespace URI
;	TokenNameSEMICOLON	
/** Both URL and File were given for schema */	TokenNameCOMMENT_JAVADOC	 Both URL and File were given for schema 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_TWO_LOCATIONS	TokenNameIdentifier	 ERROR  TWO  LOCATIONS
=	TokenNameEQUAL	
"Both URL and File were given for schema "	TokenNameStringLiteral	Both URL and File were given for schema 
;	TokenNameSEMICOLON	
/** File not found */	TokenNameCOMMENT_JAVADOC	 File not found 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_FILE	TokenNameIdentifier	 ERROR  NO  FILE
=	TokenNameEQUAL	
"File not found: "	TokenNameStringLiteral	File not found: 
;	TokenNameSEMICOLON	
/** Cannot make URL */	TokenNameCOMMENT_JAVADOC	 Cannot make URL 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_URL_REPRESENTATION	TokenNameIdentifier	 ERROR  NO  URL  REPRESENTATION
=	TokenNameEQUAL	
"Cannot make a URL of "	TokenNameStringLiteral	Cannot make a URL of 
;	TokenNameSEMICOLON	
/** No location provided */	TokenNameCOMMENT_JAVADOC	 No location provided 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_LOCATION	TokenNameIdentifier	 ERROR  NO  LOCATION
=	TokenNameEQUAL	
"No file or URL supplied for the schema "	TokenNameStringLiteral	No file or URL supplied for the schema 
;	TokenNameSEMICOLON	
/** No arg constructor */	TokenNameCOMMENT_JAVADOC	 No arg constructor 
public	TokenNamepublic	
SchemaLocation	TokenNameIdentifier	 Schema Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the namespace. * @return the namespace. */	TokenNameCOMMENT_JAVADOC	 Get the namespace. @return the namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the namespace of this schema. Any URI * @param namespace the namespace to use. */	TokenNameCOMMENT_JAVADOC	 set the namespace of this schema. Any URI @param namespace the namespace to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the file. * @return the file containing the schema. */	TokenNameCOMMENT_JAVADOC	 Get the file. @return the file containing the schema. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * identify a file that contains this namespace's schema. * The file must exist. * @param file the file contains the schema. */	TokenNameCOMMENT_JAVADOC	 identify a file that contains this namespace's schema. The file must exist. @param file the file contains the schema. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The URL containing the schema. * @return the URL string. */	TokenNameCOMMENT_JAVADOC	 The URL containing the schema. @return the URL string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * identify a URL that hosts the schema. * @param url the URL string. */	TokenNameCOMMENT_JAVADOC	 identify a URL that hosts the schema. @param url the URL string. 
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the URL of the schema * @return a URL to the schema * @throws BuildException if not */	TokenNameCOMMENT_JAVADOC	 get the URL of the schema @return a URL to the schema @throws BuildException if not 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaLocationURL	TokenNameIdentifier	 get Schema Location URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
hasFile	TokenNameIdentifier	 has File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasURL	TokenNameIdentifier	 has URL
=	TokenNameEQUAL	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//error if both are empty, or both are set 	TokenNameCOMMENT_LINE	error if both are empty, or both are set 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasFile	TokenNameIdentifier	 has File
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasURL	TokenNameIdentifier	 has URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_LOCATION	TokenNameIdentifier	 ERROR  NO  LOCATION
+	TokenNamePLUS	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasFile	TokenNameIdentifier	 has File
&&	TokenNameAND_AND	
hasURL	TokenNameIdentifier	 has URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_TWO_LOCATIONS	TokenNameIdentifier	 ERROR  TWO  LOCATIONS
+	TokenNamePLUS	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasFile	TokenNameIdentifier	 has File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_FILE	TokenNameIdentifier	 ERROR  NO  FILE
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFileURL	TokenNameIdentifier	 get File URL
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this is almost implausible, but required handling 	TokenNameCOMMENT_LINE	this is almost implausible, but required handling 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_URL_REPRESENTATION	TokenNameIdentifier	 ERROR  NO  URL  REPRESENTATION
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * validate the fields then create a "uri location" string * * @return string of uri and location * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 validate the fields then create a "uri location" string * @return string of uri and location @throws BuildException if there is an error. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURIandLocation	TokenNameIdentifier	 get UR Iand Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validateNamespace	TokenNameIdentifier	 validate Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getSchemaLocationURL	TokenNameIdentifier	 get Schema Location URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a namespace is valid * @throws BuildException if not */	TokenNameCOMMENT_JAVADOC	 assert that a namespace is valid @throws BuildException if not 
public	TokenNamepublic	
void	TokenNamevoid	
validateNamespace	TokenNameIdentifier	 validate Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_URI	TokenNameIdentifier	 ERROR  NO  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * check that a property is set * @param property string to check * @return true if it is not null or empty */	TokenNameCOMMENT_JAVADOC	 check that a property is set @param property string to check @return true if it is not null or empty 
private	TokenNameprivate	
boolean	TokenNameboolean	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
property	TokenNameIdentifier	 property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * equality test checks namespace, location and filename. All must match, * @param o object to compare against * @return true iff the objects are considered equal in value */	TokenNameCOMMENT_JAVADOC	 equality test checks namespace, location and filename. All must match, @param o object to compare against @return true iff the objects are considered equal in value 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
SchemaLocation	TokenNameIdentifier	 Schema Location
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SchemaLocation	TokenNameIdentifier	 Schema Location
schemaLocation	TokenNameIdentifier	 schema Location
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaLocation	TokenNameIdentifier	 Schema Location
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
:	TokenNameCOLON	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
:	TokenNameCOLON	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
:	TokenNameCOLON	
schemaLocation	TokenNameIdentifier	 schema Location
.	TokenNameDOT	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generate a hashcode depending on the namespace, url and file name. * @return the hashcode. */	TokenNameCOMMENT_JAVADOC	 Generate a hashcode depending on the namespace, url and file name. @return the hashcode. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of the object for error messages * and the like * @return a string representation of the object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of the object for error messages and the like @return a string representation of the object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
namespace	TokenNameIdentifier	 namespace
:	TokenNameCOLON	
"(anonymous)"	TokenNameStringLiteral	(anonymous)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//SchemaLocation 	TokenNameCOMMENT_LINE	SchemaLocation 
}	TokenNameRBRACE	
