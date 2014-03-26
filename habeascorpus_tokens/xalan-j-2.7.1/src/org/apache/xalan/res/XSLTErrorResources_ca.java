/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTErrorResources_ca.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTErrorResources_ca.java 468641 2006-10-28 06:54:42Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
/** * Set up error messages. * We build a two dimensional array of message keys and * message strings. In order to add a new message here, * you need to first add a String constant. And * you need to enter key , value pair as part of contents * Array. You also need to update MAX_CODE for error strings * and MAX_WARNING for warnings ( Needed for only information * purpose ) */	TokenNameCOMMENT_JAVADOC	 Set up error messages. We build a two dimensional array of message keys and message strings. In order to add a new message here, you need to first add a String constant. And you need to enter key , value pair as part of contents Array. You also need to update MAX_CODE for error strings and MAX_WARNING for warnings ( Needed for only information purpose ) 
public	TokenNamepublic	
class	TokenNameclass	
XSLTErrorResources_ca	TokenNameIdentifier	 XSLT Error Resources ca
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/* * This file contains error and warning messages related to Xalan Error * Handling. * * General notes to translators: * * 1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of * components. * XSLT is an acronym for "XML Stylesheet Language: Transformations". * XSLTC is an acronym for XSLT Compiler. * * 2) A stylesheet is a description of how to transform an input XML document * into a resultant XML document (or HTML document or text). The * stylesheet itself is described in the form of an XML document. * * 3) A template is a component of a stylesheet that is used to match a * particular portion of an input document and specifies the form of the * corresponding portion of the output document. * * 4) An element is a mark-up tag in an XML document; an attribute is a * modifier on the tag. For example, in <elem attr='val' attr2='val2'> * "elem" is an element name, "attr" and "attr2" are attribute names with * the values "val" and "val2", respectively. * * 5) A namespace declaration is a special attribute that is used to associate * a prefix with a URI (the namespace). The meanings of element names and * attribute names that use that prefix are defined with respect to that * namespace. * * 6) "Translet" is an invented term that describes the class file that * results from compiling an XML stylesheet into a Java class. * * 7) XPath is a specification that describes a notation for identifying * nodes in a tree-structured representation of an XML document. An * instance of that notation is referred to as an XPath expression. * */	TokenNameCOMMENT_BLOCK	 This file contains error and warning messages related to Xalan Error Handling. * General notes to translators: * 1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of components. XSLT is an acronym for "XML Stylesheet Language: Transformations". XSLTC is an acronym for XSLT Compiler. * 2) A stylesheet is a description of how to transform an input XML document into a resultant XML document (or HTML document or text). The stylesheet itself is described in the form of an XML document. * 3) A template is a component of a stylesheet that is used to match a particular portion of an input document and specifies the form of the corresponding portion of the output document. * 4) An element is a mark-up tag in an XML document; an attribute is a modifier on the tag. For example, in <elem attr='val' attr2='val2'> "elem" is an element name, "attr" and "attr2" are attribute names with the values "val" and "val2", respectively. * 5) A namespace declaration is a special attribute that is used to associate a prefix with a URI (the namespace). The meanings of element names and attribute names that use that prefix are defined with respect to that namespace. * 6) "Translet" is an invented term that describes the class file that results from compiling an XML stylesheet into a Java class. * 7) XPath is a specification that describes a notation for identifying nodes in a tree-structured representation of an XML document. An instance of that notation is referred to as an XPath expression. 
/** Maximum error messages, this is needed to keep track of the number of messages. */	TokenNameCOMMENT_JAVADOC	 Maximum error messages, this is needed to keep track of the number of messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
=	TokenNameEQUAL	
201	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum warnings, this is needed to keep track of the number of warnings. */	TokenNameCOMMENT_JAVADOC	 Maximum warnings, this is needed to keep track of the number of warnings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum misc strings. */	TokenNameCOMMENT_JAVADOC	 Maximum misc strings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_OTHERS	TokenNameIdentifier	 MAX  OTHERS
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum total warnings and error messages. */	TokenNameCOMMENT_JAVADOC	 Maximum total warnings and error messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_MESSAGES	TokenNameIdentifier	 MAX  MESSAGES
=	TokenNameEQUAL	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
+	TokenNamePLUS	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Static variables */	TokenNameCOMMENT_BLOCK	 Static variables 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
=	TokenNameEQUAL	
"ER_INVALID_SET_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX"	TokenNameStringLiteral	ER_INVALID_SET_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
=	TokenNameEQUAL	
"ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT"	TokenNameStringLiteral	ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_CURLYBRACE	TokenNameIdentifier	 ER  NO  CURLYBRACE
=	TokenNameEQUAL	
"ER_NO_CURLYBRACE"	TokenNameStringLiteral	ER_NO_CURLYBRACE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_FUNCTION_NOT_SUPPORTED"	TokenNameStringLiteral	ER_FUNCTION_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
=	TokenNameEQUAL	
"ER_ILLEGAL_ATTRIBUTE"	TokenNameStringLiteral	ER_ILLEGAL_ATTRIBUTE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
=	TokenNameEQUAL	
"ER_NULL_SOURCENODE_APPLYIMPORTS"	TokenNameStringLiteral	ER_NULL_SOURCENODE_APPLYIMPORTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
=	TokenNameEQUAL	
"ER_CANNOT_ADD"	TokenNameStringLiteral	ER_CANNOT_ADD
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
=	TokenNameEQUAL	
"ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES"	TokenNameStringLiteral	ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
=	TokenNameEQUAL	
"ER_NO_NAME_ATTRIB"	TokenNameStringLiteral	ER_NO_NAME_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
=	TokenNameEQUAL	
"ER_TEMPLATE_NOT_FOUND"	TokenNameStringLiteral	ER_TEMPLATE_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
=	TokenNameEQUAL	
"ER_CANT_RESOLVE_NAME_AVT"	TokenNameStringLiteral	ER_CANT_RESOLVE_NAME_AVT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
=	TokenNameEQUAL	
"ER_REQUIRES_ATTRIB"	TokenNameStringLiteral	ER_REQUIRES_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
=	TokenNameEQUAL	
"ER_MUST_HAVE_TEST_ATTRIB"	TokenNameStringLiteral	ER_MUST_HAVE_TEST_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
=	TokenNameEQUAL	
"ER_BAD_VAL_ON_LEVEL_ATTRIB"	TokenNameStringLiteral	ER_BAD_VAL_ON_LEVEL_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
=	TokenNameEQUAL	
"ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML"	TokenNameStringLiteral	ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
=	TokenNameEQUAL	
"ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME"	TokenNameStringLiteral	ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
=	TokenNameEQUAL	
"ER_NEED_MATCH_ATTRIB"	TokenNameStringLiteral	ER_NEED_MATCH_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
=	TokenNameEQUAL	
"ER_NEED_NAME_OR_MATCH_ATTRIB"	TokenNameStringLiteral	ER_NEED_NAME_OR_MATCH_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
=	TokenNameEQUAL	
"ER_CANT_RESOLVE_NSPREFIX"	TokenNameStringLiteral	ER_CANT_RESOLVE_NSPREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
=	TokenNameEQUAL	
"ER_ILLEGAL_VALUE"	TokenNameStringLiteral	ER_ILLEGAL_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
=	TokenNameEQUAL	
"ER_NO_OWNERDOC"	TokenNameStringLiteral	ER_NO_OWNERDOC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
=	TokenNameEQUAL	
"ER_ELEMTEMPLATEELEM_ERR"	TokenNameStringLiteral	ER_ELEMTEMPLATEELEM_ERR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
=	TokenNameEQUAL	
"ER_NULL_CHILD"	TokenNameStringLiteral	ER_NULL_CHILD
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
=	TokenNameEQUAL	
"ER_NEED_SELECT_ATTRIB"	TokenNameStringLiteral	ER_NEED_SELECT_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
=	TokenNameEQUAL	
"ER_NEED_TEST_ATTRIB"	TokenNameStringLiteral	ER_NEED_TEST_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
=	TokenNameEQUAL	
"ER_NEED_NAME_ATTRIB"	TokenNameStringLiteral	ER_NEED_NAME_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
=	TokenNameEQUAL	
"ER_NO_CONTEXT_OWNERDOC"	TokenNameStringLiteral	ER_NO_CONTEXT_OWNERDOC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
=	TokenNameEQUAL	
"ER_COULD_NOT_CREATE_XML_PROC_LIAISON"	TokenNameStringLiteral	ER_COULD_NOT_CREATE_XML_PROC_LIAISON
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
=	TokenNameEQUAL	
"ER_PROCESS_NOT_SUCCESSFUL"	TokenNameStringLiteral	ER_PROCESS_NOT_SUCCESSFUL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
=	TokenNameEQUAL	
"ER_NOT_SUCCESSFUL"	TokenNameStringLiteral	ER_NOT_SUCCESSFUL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_ENCODING_NOT_SUPPORTED"	TokenNameStringLiteral	ER_ENCODING_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
=	TokenNameEQUAL	
"ER_COULD_NOT_CREATE_TRACELISTENER"	TokenNameStringLiteral	ER_COULD_NOT_CREATE_TRACELISTENER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
=	TokenNameEQUAL	
"ER_KEY_REQUIRES_NAME_ATTRIB"	TokenNameStringLiteral	ER_KEY_REQUIRES_NAME_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
=	TokenNameEQUAL	
"ER_KEY_REQUIRES_MATCH_ATTRIB"	TokenNameStringLiteral	ER_KEY_REQUIRES_MATCH_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
=	TokenNameEQUAL	
"ER_KEY_REQUIRES_USE_ATTRIB"	TokenNameStringLiteral	ER_KEY_REQUIRES_USE_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
=	TokenNameEQUAL	
"ER_REQUIRES_ELEMENTS_ATTRIB"	TokenNameStringLiteral	ER_REQUIRES_ELEMENTS_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
=	TokenNameEQUAL	
"ER_MISSING_PREFIX_ATTRIB"	TokenNameStringLiteral	ER_MISSING_PREFIX_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
=	TokenNameEQUAL	
"ER_BAD_STYLESHEET_URL"	TokenNameStringLiteral	ER_BAD_STYLESHEET_URL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
=	TokenNameEQUAL	
"ER_FILE_NOT_FOUND"	TokenNameStringLiteral	ER_FILE_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
=	TokenNameEQUAL	
"ER_IOEXCEPTION"	TokenNameStringLiteral	ER_IOEXCEPTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
=	TokenNameEQUAL	
"ER_NO_HREF_ATTRIB"	TokenNameStringLiteral	ER_NO_HREF_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
=	TokenNameEQUAL	
"ER_STYLESHEET_INCLUDES_ITSELF"	TokenNameStringLiteral	ER_STYLESHEET_INCLUDES_ITSELF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESSINCLUDE_ERROR	TokenNameIdentifier	 ER  PROCESSINCLUDE  ERROR
=	TokenNameEQUAL	
"ER_PROCESSINCLUDE_ERROR"	TokenNameStringLiteral	ER_PROCESSINCLUDE_ERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISSING_LANG_ATTRIB	TokenNameIdentifier	 ER  MISSING  LANG  ATTRIB
=	TokenNameEQUAL	
"ER_MISSING_LANG_ATTRIB"	TokenNameStringLiteral	ER_MISSING_LANG_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
=	TokenNameEQUAL	
"ER_MISSING_CONTAINER_ELEMENT_COMPONENT"	TokenNameStringLiteral	ER_MISSING_CONTAINER_ELEMENT_COMPONENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
=	TokenNameEQUAL	
"ER_CAN_ONLY_OUTPUT_TO_ELEMENT"	TokenNameStringLiteral	ER_CAN_ONLY_OUTPUT_TO_ELEMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESS_ERROR	TokenNameIdentifier	 ER  PROCESS  ERROR
=	TokenNameEQUAL	
"ER_PROCESS_ERROR"	TokenNameStringLiteral	ER_PROCESS_ERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNIMPLNODE_ERROR	TokenNameIdentifier	 ER  UNIMPLNODE  ERROR
=	TokenNameEQUAL	
"ER_UNIMPLNODE_ERROR"	TokenNameStringLiteral	ER_UNIMPLNODE_ERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
=	TokenNameEQUAL	
"ER_NO_SELECT_EXPRESSION"	TokenNameStringLiteral	ER_NO_SELECT_EXPRESSION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
=	TokenNameEQUAL	
"ER_CANNOT_SERIALIZE_XSLPROCESSOR"	TokenNameStringLiteral	ER_CANNOT_SERIALIZE_XSLPROCESSOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
=	TokenNameEQUAL	
"ER_NO_INPUT_STYLESHEET"	TokenNameStringLiteral	ER_NO_INPUT_STYLESHEET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
=	TokenNameEQUAL	
"ER_FAILED_PROCESS_STYLESHEET"	TokenNameStringLiteral	ER_FAILED_PROCESS_STYLESHEET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
=	TokenNameEQUAL	
"ER_COULDNT_PARSE_DOC"	TokenNameStringLiteral	ER_COULDNT_PARSE_DOC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
=	TokenNameEQUAL	
"ER_COULDNT_FIND_FRAGMENT"	TokenNameStringLiteral	ER_COULDNT_FIND_FRAGMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
=	TokenNameEQUAL	
"ER_NODE_NOT_ELEMENT"	TokenNameStringLiteral	ER_NODE_NOT_ELEMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
=	TokenNameEQUAL	
"ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB"	TokenNameStringLiteral	ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
=	TokenNameEQUAL	
"ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB"	TokenNameStringLiteral	ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
=	TokenNameEQUAL	
"ER_NO_CLONE_OF_DOCUMENT_FRAG"	TokenNameStringLiteral	ER_NO_CLONE_OF_DOCUMENT_FRAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
=	TokenNameEQUAL	
"ER_CANT_CREATE_ITEM"	TokenNameStringLiteral	ER_CANT_CREATE_ITEM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
=	TokenNameEQUAL	
"ER_XMLSPACE_ILLEGAL_VALUE"	TokenNameStringLiteral	ER_XMLSPACE_ILLEGAL_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
=	TokenNameEQUAL	
"ER_NO_XSLKEY_DECLARATION"	TokenNameStringLiteral	ER_NO_XSLKEY_DECLARATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
=	TokenNameEQUAL	
"ER_CANT_CREATE_URL"	TokenNameStringLiteral	ER_CANT_CREATE_URL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
=	TokenNameEQUAL	
"ER_XSLFUNCTIONS_UNSUPPORTED"	TokenNameStringLiteral	ER_XSLFUNCTIONS_UNSUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
=	TokenNameEQUAL	
"ER_PROCESSOR_ERROR"	TokenNameStringLiteral	ER_PROCESSOR_ERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
=	TokenNameEQUAL	
"ER_NOT_ALLOWED_INSIDE_STYLESHEET"	TokenNameStringLiteral	ER_NOT_ALLOWED_INSIDE_STYLESHEET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_RESULTNS_NOT_SUPPORTED"	TokenNameStringLiteral	ER_RESULTNS_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_DEFAULTSPACE_NOT_SUPPORTED"	TokenNameStringLiteral	ER_DEFAULTSPACE_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_INDENTRESULT_NOT_SUPPORTED"	TokenNameStringLiteral	ER_INDENTRESULT_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
=	TokenNameEQUAL	
"ER_ILLEGAL_ATTRIB"	TokenNameStringLiteral	ER_ILLEGAL_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
=	TokenNameEQUAL	
"ER_UNKNOWN_XSL_ELEM"	TokenNameStringLiteral	ER_UNKNOWN_XSL_ELEM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
=	TokenNameEQUAL	
"ER_BAD_XSLSORT_USE"	TokenNameStringLiteral	ER_BAD_XSLSORT_USE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
=	TokenNameEQUAL	
"ER_MISPLACED_XSLWHEN"	TokenNameStringLiteral	ER_MISPLACED_XSLWHEN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
=	TokenNameEQUAL	
"ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE"	TokenNameStringLiteral	ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
=	TokenNameEQUAL	
"ER_MISPLACED_XSLOTHERWISE"	TokenNameStringLiteral	ER_MISPLACED_XSLOTHERWISE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
=	TokenNameEQUAL	
"ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE"	TokenNameStringLiteral	ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
=	TokenNameEQUAL	
"ER_NOT_ALLOWED_INSIDE_TEMPLATE"	TokenNameStringLiteral	ER_NOT_ALLOWED_INSIDE_TEMPLATE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
=	TokenNameEQUAL	
"ER_UNKNOWN_EXT_NS_PREFIX"	TokenNameStringLiteral	ER_UNKNOWN_EXT_NS_PREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
=	TokenNameEQUAL	
"ER_IMPORTS_AS_FIRST_ELEM"	TokenNameStringLiteral	ER_IMPORTS_AS_FIRST_ELEM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
=	TokenNameEQUAL	
"ER_IMPORTING_ITSELF"	TokenNameStringLiteral	ER_IMPORTING_ITSELF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
=	TokenNameEQUAL	
"ER_XMLSPACE_ILLEGAL_VAL"	TokenNameStringLiteral	ER_XMLSPACE_ILLEGAL_VAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
=	TokenNameEQUAL	
"ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL"	TokenNameStringLiteral	ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
=	TokenNameEQUAL	
"ER_SAX_EXCEPTION"	TokenNameStringLiteral	ER_SAX_EXCEPTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
=	TokenNameEQUAL	
"ER_XSLT_ERROR"	TokenNameStringLiteral	ER_XSLT_ERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
=	TokenNameEQUAL	
"ER_CURRENCY_SIGN_ILLEGAL"	TokenNameStringLiteral	ER_CURRENCY_SIGN_ILLEGAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
=	TokenNameEQUAL	
"ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM"	TokenNameStringLiteral	ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
=	TokenNameEQUAL	
"ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER"	TokenNameStringLiteral	ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
=	TokenNameEQUAL	
"ER_REDIRECT_COULDNT_GET_FILENAME"	TokenNameStringLiteral	ER_REDIRECT_COULDNT_GET_FILENAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
=	TokenNameEQUAL	
"ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT"	TokenNameStringLiteral	ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
=	TokenNameEQUAL	
"ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX"	TokenNameStringLiteral	ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
=	TokenNameEQUAL	
"ER_MISSING_NS_URI"	TokenNameStringLiteral	ER_MISSING_NS_URI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
=	TokenNameEQUAL	
"ER_MISSING_ARG_FOR_OPTION"	TokenNameStringLiteral	ER_MISSING_ARG_FOR_OPTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
=	TokenNameEQUAL	
"ER_INVALID_OPTION"	TokenNameStringLiteral	ER_INVALID_OPTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
=	TokenNameEQUAL	
"ER_MALFORMED_FORMAT_STRING"	TokenNameStringLiteral	ER_MALFORMED_FORMAT_STRING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
=	TokenNameEQUAL	
"ER_STYLESHEET_REQUIRES_VERSION_ATTRIB"	TokenNameStringLiteral	ER_STYLESHEET_REQUIRES_VERSION_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
=	TokenNameEQUAL	
"ER_ILLEGAL_ATTRIBUTE_VALUE"	TokenNameStringLiteral	ER_ILLEGAL_ATTRIBUTE_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
=	TokenNameEQUAL	
"ER_CHOOSE_REQUIRES_WHEN"	TokenNameStringLiteral	ER_CHOOSE_REQUIRES_WHEN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
=	TokenNameEQUAL	
"ER_NO_APPLY_IMPORT_IN_FOR_EACH"	TokenNameStringLiteral	ER_NO_APPLY_IMPORT_IN_FOR_EACH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
=	TokenNameEQUAL	
"ER_CANT_USE_DTM_FOR_OUTPUT"	TokenNameStringLiteral	ER_CANT_USE_DTM_FOR_OUTPUT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
=	TokenNameEQUAL	
"ER_CANT_USE_DTM_FOR_INPUT"	TokenNameStringLiteral	ER_CANT_USE_DTM_FOR_INPUT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
=	TokenNameEQUAL	
"ER_CALL_TO_EXT_FAILED"	TokenNameStringLiteral	ER_CALL_TO_EXT_FAILED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
=	TokenNameEQUAL	
"ER_PREFIX_MUST_RESOLVE"	TokenNameStringLiteral	ER_PREFIX_MUST_RESOLVE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
=	TokenNameEQUAL	
"ER_INVALID_UTF16_SURROGATE"	TokenNameStringLiteral	ER_INVALID_UTF16_SURROGATE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
=	TokenNameEQUAL	
"ER_XSLATTRSET_USED_ITSELF"	TokenNameStringLiteral	ER_XSLATTRSET_USED_ITSELF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
=	TokenNameEQUAL	
"ER_CANNOT_MIX_XERCESDOM"	TokenNameStringLiteral	ER_CANNOT_MIX_XERCESDOM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TOO_MANY_LISTENERS	TokenNameIdentifier	 ER  TOO  MANY  LISTENERS
=	TokenNameEQUAL	
"ER_TOO_MANY_LISTENERS"	TokenNameStringLiteral	ER_TOO_MANY_LISTENERS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_IN_ELEMTEMPLATEELEM_READOBJECT	TokenNameIdentifier	 ER  IN  ELEMTEMPLATEELEM  READOBJECT
=	TokenNameEQUAL	
"ER_IN_ELEMTEMPLATEELEM_READOBJECT"	TokenNameStringLiteral	ER_IN_ELEMTEMPLATEELEM_READOBJECT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
=	TokenNameEQUAL	
"ER_DUPLICATE_NAMED_TEMPLATE"	TokenNameStringLiteral	ER_DUPLICATE_NAMED_TEMPLATE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
=	TokenNameEQUAL	
"ER_INVALID_KEY_CALL"	TokenNameStringLiteral	ER_INVALID_KEY_CALL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
=	TokenNameEQUAL	
"ER_REFERENCING_ITSELF"	TokenNameStringLiteral	ER_REFERENCING_ITSELF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
=	TokenNameEQUAL	
"ER_ILLEGAL_DOMSOURCE_INPUT"	TokenNameStringLiteral	ER_ILLEGAL_DOMSOURCE_INPUT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
=	TokenNameEQUAL	
"ER_CLASS_NOT_FOUND_FOR_OPTION"	TokenNameStringLiteral	ER_CLASS_NOT_FOUND_FOR_OPTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
=	TokenNameEQUAL	
"ER_REQUIRED_ELEM_NOT_FOUND"	TokenNameStringLiteral	ER_REQUIRED_ELEM_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_INPUT_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_INPUT_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_URI_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_URI_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_FILE_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_FILE_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_SOURCE_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_SOURCE_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
=	TokenNameEQUAL	
"ER_CANNOT_INIT_BSFMGR"	TokenNameStringLiteral	ER_CANNOT_INIT_BSFMGR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
=	TokenNameEQUAL	
"ER_CANNOT_CMPL_EXTENSN"	TokenNameStringLiteral	ER_CANNOT_CMPL_EXTENSN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
=	TokenNameEQUAL	
"ER_CANNOT_CREATE_EXTENSN"	TokenNameStringLiteral	ER_CANNOT_CREATE_EXTENSN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
=	TokenNameEQUAL	
"ER_INSTANCE_MTHD_CALL_REQUIRES"	TokenNameStringLiteral	ER_INSTANCE_MTHD_CALL_REQUIRES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
=	TokenNameEQUAL	
"ER_INVALID_ELEMENT_NAME"	TokenNameStringLiteral	ER_INVALID_ELEMENT_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
=	TokenNameEQUAL	
"ER_ELEMENT_NAME_METHOD_STATIC"	TokenNameStringLiteral	ER_ELEMENT_NAME_METHOD_STATIC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
=	TokenNameEQUAL	
"ER_EXTENSION_FUNC_UNKNOWN"	TokenNameStringLiteral	ER_EXTENSION_FUNC_UNKNOWN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
=	TokenNameEQUAL	
"ER_MORE_MATCH_CONSTRUCTOR"	TokenNameStringLiteral	ER_MORE_MATCH_CONSTRUCTOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
=	TokenNameEQUAL	
"ER_MORE_MATCH_METHOD"	TokenNameStringLiteral	ER_MORE_MATCH_METHOD
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
=	TokenNameEQUAL	
"ER_MORE_MATCH_ELEMENT"	TokenNameStringLiteral	ER_MORE_MATCH_ELEMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
=	TokenNameEQUAL	
"ER_INVALID_CONTEXT_PASSED"	TokenNameStringLiteral	ER_INVALID_CONTEXT_PASSED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
=	TokenNameEQUAL	
"ER_POOL_EXISTS"	TokenNameStringLiteral	ER_POOL_EXISTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
=	TokenNameEQUAL	
"ER_NO_DRIVER_NAME"	TokenNameStringLiteral	ER_NO_DRIVER_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
=	TokenNameEQUAL	
"ER_NO_URL"	TokenNameStringLiteral	ER_NO_URL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
=	TokenNameEQUAL	
"ER_POOL_SIZE_LESSTHAN_ONE"	TokenNameStringLiteral	ER_POOL_SIZE_LESSTHAN_ONE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
=	TokenNameEQUAL	
"ER_INVALID_DRIVER"	TokenNameStringLiteral	ER_INVALID_DRIVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
=	TokenNameEQUAL	
"ER_NO_STYLESHEETROOT"	TokenNameStringLiteral	ER_NO_STYLESHEETROOT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
=	TokenNameEQUAL	
"ER_ILLEGAL_XMLSPACE_VALUE"	TokenNameStringLiteral	ER_ILLEGAL_XMLSPACE_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
=	TokenNameEQUAL	
"ER_PROCESSFROMNODE_FAILED"	TokenNameStringLiteral	ER_PROCESSFROMNODE_FAILED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
=	TokenNameEQUAL	
"ER_RESOURCE_COULD_NOT_LOAD"	TokenNameStringLiteral	ER_RESOURCE_COULD_NOT_LOAD
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
=	TokenNameEQUAL	
"ER_BUFFER_SIZE_LESSTHAN_ZERO"	TokenNameStringLiteral	ER_BUFFER_SIZE_LESSTHAN_ZERO
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
=	TokenNameEQUAL	
"ER_UNKNOWN_ERROR_CALLING_EXTENSION"	TokenNameStringLiteral	ER_UNKNOWN_ERROR_CALLING_EXTENSION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
=	TokenNameEQUAL	
"ER_NO_NAMESPACE_DECL"	TokenNameStringLiteral	ER_NO_NAMESPACE_DECL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
=	TokenNameEQUAL	
"ER_ELEM_CONTENT_NOT_ALLOWED"	TokenNameStringLiteral	ER_ELEM_CONTENT_NOT_ALLOWED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
=	TokenNameEQUAL	
"ER_STYLESHEET_DIRECTED_TERMINATION"	TokenNameStringLiteral	ER_STYLESHEET_DIRECTED_TERMINATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
=	TokenNameEQUAL	
"ER_ONE_OR_TWO"	TokenNameStringLiteral	ER_ONE_OR_TWO
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
=	TokenNameEQUAL	
"ER_TWO_OR_THREE"	TokenNameStringLiteral	ER_TWO_OR_THREE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
=	TokenNameEQUAL	
"ER_COULD_NOT_LOAD_RESOURCE"	TokenNameStringLiteral	ER_COULD_NOT_LOAD_RESOURCE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
=	TokenNameEQUAL	
"ER_CANNOT_INIT_DEFAULT_TEMPLATES"	TokenNameStringLiteral	ER_CANNOT_INIT_DEFAULT_TEMPLATES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
=	TokenNameEQUAL	
"ER_RESULT_NULL"	TokenNameStringLiteral	ER_RESULT_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
=	TokenNameEQUAL	
"ER_RESULT_COULD_NOT_BE_SET"	TokenNameStringLiteral	ER_RESULT_COULD_NOT_BE_SET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
=	TokenNameEQUAL	
"ER_NO_OUTPUT_SPECIFIED"	TokenNameStringLiteral	ER_NO_OUTPUT_SPECIFIED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
=	TokenNameEQUAL	
"ER_CANNOT_TRANSFORM_TO_RESULT_TYPE"	TokenNameStringLiteral	ER_CANNOT_TRANSFORM_TO_RESULT_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
=	TokenNameEQUAL	
"ER_CANNOT_TRANSFORM_SOURCE_TYPE"	TokenNameStringLiteral	ER_CANNOT_TRANSFORM_SOURCE_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
=	TokenNameEQUAL	
"ER_NULL_CONTENT_HANDLER"	TokenNameStringLiteral	ER_NULL_CONTENT_HANDLER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
=	TokenNameEQUAL	
"ER_NULL_ERROR_HANDLER"	TokenNameStringLiteral	ER_NULL_ERROR_HANDLER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
=	TokenNameEQUAL	
"ER_CANNOT_CALL_PARSE"	TokenNameStringLiteral	ER_CANNOT_CALL_PARSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
=	TokenNameEQUAL	
"ER_NO_PARENT_FOR_FILTER"	TokenNameStringLiteral	ER_NO_PARENT_FOR_FILTER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
=	TokenNameEQUAL	
"ER_NO_STYLESHEET_IN_MEDIA"	TokenNameStringLiteral	ER_NO_STYLESHEET_IN_MEDIA
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
=	TokenNameEQUAL	
"ER_NO_STYLESHEET_PI"	TokenNameStringLiteral	ER_NO_STYLESHEET_PI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_NOT_SUPPORTED"	TokenNameStringLiteral	ER_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
=	TokenNameEQUAL	
"ER_PROPERTY_VALUE_BOOLEAN"	TokenNameStringLiteral	ER_PROPERTY_VALUE_BOOLEAN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
=	TokenNameEQUAL	
"ER_COULD_NOT_FIND_EXTERN_SCRIPT"	TokenNameStringLiteral	ER_COULD_NOT_FIND_EXTERN_SCRIPT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
=	TokenNameEQUAL	
"ER_RESOURCE_COULD_NOT_FIND"	TokenNameStringLiteral	ER_RESOURCE_COULD_NOT_FIND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
=	TokenNameEQUAL	
"ER_OUTPUT_PROPERTY_NOT_RECOGNIZED"	TokenNameStringLiteral	ER_OUTPUT_PROPERTY_NOT_RECOGNIZED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
=	TokenNameEQUAL	
"ER_FAILED_CREATING_ELEMLITRSLT"	TokenNameStringLiteral	ER_FAILED_CREATING_ELEMLITRSLT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
=	TokenNameEQUAL	
"ER_VALUE_SHOULD_BE_NUMBER"	TokenNameStringLiteral	ER_VALUE_SHOULD_BE_NUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
=	TokenNameEQUAL	
"ER_VALUE_SHOULD_EQUAL"	TokenNameStringLiteral	ER_VALUE_SHOULD_EQUAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
=	TokenNameEQUAL	
"ER_FAILED_CALLING_METHOD"	TokenNameStringLiteral	ER_FAILED_CALLING_METHOD
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
=	TokenNameEQUAL	
"ER_FAILED_CREATING_ELEMTMPL"	TokenNameStringLiteral	ER_FAILED_CREATING_ELEMTMPL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
=	TokenNameEQUAL	
"ER_CHARS_NOT_ALLOWED"	TokenNameStringLiteral	ER_CHARS_NOT_ALLOWED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
=	TokenNameEQUAL	
"ER_ATTR_NOT_ALLOWED"	TokenNameStringLiteral	ER_ATTR_NOT_ALLOWED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
=	TokenNameEQUAL	
"ER_BAD_VALUE"	TokenNameStringLiteral	ER_BAD_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
=	TokenNameEQUAL	
"ER_ATTRIB_VALUE_NOT_FOUND"	TokenNameStringLiteral	ER_ATTRIB_VALUE_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
=	TokenNameEQUAL	
"ER_ATTRIB_VALUE_NOT_RECOGNIZED"	TokenNameStringLiteral	ER_ATTRIB_VALUE_NOT_RECOGNIZED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
=	TokenNameEQUAL	
"ER_NULL_URI_NAMESPACE"	TokenNameStringLiteral	ER_NULL_URI_NAMESPACE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
=	TokenNameEQUAL	
"ER_NUMBER_TOO_BIG"	TokenNameStringLiteral	ER_NUMBER_TOO_BIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
=	TokenNameEQUAL	
"ER_CANNOT_FIND_SAX1_DRIVER"	TokenNameStringLiteral	ER_CANNOT_FIND_SAX1_DRIVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
=	TokenNameEQUAL	
"ER_SAX1_DRIVER_NOT_LOADED"	TokenNameStringLiteral	ER_SAX1_DRIVER_NOT_LOADED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
=	TokenNameEQUAL	
"ER_SAX1_DRIVER_NOT_INSTANTIATED"	TokenNameStringLiteral	ER_SAX1_DRIVER_NOT_INSTANTIATED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
=	TokenNameEQUAL	
"ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER"	TokenNameStringLiteral	ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
=	TokenNameEQUAL	
"ER_PARSER_PROPERTY_NOT_SPECIFIED"	TokenNameStringLiteral	ER_PARSER_PROPERTY_NOT_SPECIFIED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_PARSER_ARG_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_PARSER_ARG_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
=	TokenNameEQUAL	
"ER_FEATURE"	TokenNameStringLiteral	ER_FEATURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
=	TokenNameEQUAL	
"ER_PROPERTY"	TokenNameStringLiteral	ER_PROPERTY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
=	TokenNameEQUAL	
"ER_NULL_ENTITY_RESOLVER"	TokenNameStringLiteral	ER_NULL_ENTITY_RESOLVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
=	TokenNameEQUAL	
"ER_NULL_DTD_HANDLER"	TokenNameStringLiteral	ER_NULL_DTD_HANDLER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
=	TokenNameEQUAL	
"ER_NO_DRIVER_NAME_SPECIFIED"	TokenNameStringLiteral	ER_NO_DRIVER_NAME_SPECIFIED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
=	TokenNameEQUAL	
"ER_NO_URL_SPECIFIED"	TokenNameStringLiteral	ER_NO_URL_SPECIFIED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
=	TokenNameEQUAL	
"ER_POOLSIZE_LESS_THAN_ONE"	TokenNameStringLiteral	ER_POOLSIZE_LESS_THAN_ONE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
=	TokenNameEQUAL	
"ER_INVALID_DRIVER_NAME"	TokenNameStringLiteral	ER_INVALID_DRIVER_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ERRORLISTENER	TokenNameIdentifier	 ER  ERRORLISTENER
=	TokenNameEQUAL	
"ER_ERRORLISTENER"	TokenNameStringLiteral	ER_ERRORLISTENER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ASSERT_NO_TEMPLATE_PARENT	TokenNameIdentifier	 ER  ASSERT  NO  TEMPLATE  PARENT
=	TokenNameEQUAL	
"ER_ASSERT_NO_TEMPLATE_PARENT"	TokenNameStringLiteral	ER_ASSERT_NO_TEMPLATE_PARENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR	TokenNameIdentifier	 ER  ASSERT  REDUNDENT  EXPR  ELIMINATOR
=	TokenNameEQUAL	
"ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR"	TokenNameStringLiteral	ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
=	TokenNameEQUAL	
"ER_NOT_ALLOWED_IN_POSITION"	TokenNameStringLiteral	ER_NOT_ALLOWED_IN_POSITION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
=	TokenNameEQUAL	
"ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION"	TokenNameStringLiteral	ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
=	TokenNameEQUAL	
"ER_NAMESPACE_CONTEXT_NULL_NAMESPACE"	TokenNameStringLiteral	ER_NAMESPACE_CONTEXT_NULL_NAMESPACE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
=	TokenNameEQUAL	
"ER_NAMESPACE_CONTEXT_NULL_PREFIX"	TokenNameStringLiteral	ER_NAMESPACE_CONTEXT_NULL_PREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
=	TokenNameEQUAL	
"ER_XPATH_RESOLVER_NULL_QNAME"	TokenNameStringLiteral	ER_XPATH_RESOLVER_NULL_QNAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
=	TokenNameEQUAL	
"ER_XPATH_RESOLVER_NEGATIVE_ARITY"	TokenNameStringLiteral	ER_XPATH_RESOLVER_NEGATIVE_ARITY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
=	TokenNameEQUAL	
"INVALID_TCHAR"	TokenNameStringLiteral	INVALID_TCHAR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_QNAME	TokenNameIdentifier	 INVALID  QNAME
=	TokenNameEQUAL	
"INVALID_QNAME"	TokenNameStringLiteral	INVALID_QNAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_ENUM	TokenNameIdentifier	 INVALID  ENUM
=	TokenNameEQUAL	
"INVALID_ENUM"	TokenNameStringLiteral	INVALID_ENUM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
=	TokenNameEQUAL	
"INVALID_NMTOKEN"	TokenNameStringLiteral	INVALID_NMTOKEN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
=	TokenNameEQUAL	
"INVALID_NCNAME"	TokenNameStringLiteral	INVALID_NCNAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
=	TokenNameEQUAL	
"INVALID_BOOLEAN"	TokenNameStringLiteral	INVALID_BOOLEAN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
=	TokenNameEQUAL	
"INVALID_NUMBER"	TokenNameStringLiteral	INVALID_NUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ARG_LITERAL	TokenNameIdentifier	 ER  ARG  LITERAL
=	TokenNameEQUAL	
"ER_ARG_LITERAL"	TokenNameStringLiteral	ER_ARG_LITERAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
=	TokenNameEQUAL	
"ER_DUPLICATE_GLOBAL_VAR"	TokenNameStringLiteral	ER_DUPLICATE_GLOBAL_VAR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
=	TokenNameEQUAL	
"ER_DUPLICATE_VAR"	TokenNameStringLiteral	ER_DUPLICATE_VAR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
=	TokenNameEQUAL	
"ER_TEMPLATE_NAME_MATCH"	TokenNameStringLiteral	ER_TEMPLATE_NAME_MATCH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_PREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX
=	TokenNameEQUAL	
"ER_INVALID_PREFIX"	TokenNameStringLiteral	ER_INVALID_PREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_ATTRIB_SET	TokenNameIdentifier	 ER  NO  ATTRIB  SET
=	TokenNameEQUAL	
"ER_NO_ATTRIB_SET"	TokenNameStringLiteral	ER_NO_ATTRIB_SET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
=	TokenNameEQUAL	
"ER_FUNCTION_NOT_FOUND"	TokenNameStringLiteral	ER_FUNCTION_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
=	TokenNameEQUAL	
"ER_CANT_HAVE_CONTENT_AND_SELECT"	TokenNameStringLiteral	ER_CANT_HAVE_CONTENT_AND_SELECT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
=	TokenNameEQUAL	
"ER_INVALID_SET_PARAM_VALUE"	TokenNameStringLiteral	ER_INVALID_SET_PARAM_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
=	TokenNameEQUAL	
"ER_SET_FEATURE_NULL_NAME"	TokenNameStringLiteral	ER_SET_FEATURE_NULL_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
=	TokenNameEQUAL	
"ER_GET_FEATURE_NULL_NAME"	TokenNameStringLiteral	ER_GET_FEATURE_NULL_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
=	TokenNameEQUAL	
"ER_UNSUPPORTED_FEATURE"	TokenNameStringLiteral	ER_UNSUPPORTED_FEATURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING	TokenNameIdentifier	 ER  EXTENSION  ELEMENT  NOT  ALLOWED  IN  SECURE  PROCESSING
=	TokenNameEQUAL	
"ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING"	TokenNameStringLiteral	ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
=	TokenNameEQUAL	
"WG_FOUND_CURLYBRACE"	TokenNameStringLiteral	WG_FOUND_CURLYBRACE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
=	TokenNameEQUAL	
"WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR"	TokenNameStringLiteral	WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
=	TokenNameEQUAL	
"WG_EXPR_ATTRIB_CHANGED_TO_SELECT"	TokenNameStringLiteral	WG_EXPR_ATTRIB_CHANGED_TO_SELECT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
=	TokenNameEQUAL	
"WG_NO_LOCALE_IN_FORMATNUMBER"	TokenNameStringLiteral	WG_NO_LOCALE_IN_FORMATNUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
=	TokenNameEQUAL	
"WG_LOCALE_NOT_FOUND"	TokenNameStringLiteral	WG_LOCALE_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
=	TokenNameEQUAL	
"WG_CANNOT_MAKE_URL_FROM"	TokenNameStringLiteral	WG_CANNOT_MAKE_URL_FROM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
=	TokenNameEQUAL	
"WG_CANNOT_LOAD_REQUESTED_DOC"	TokenNameStringLiteral	WG_CANNOT_LOAD_REQUESTED_DOC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
=	TokenNameEQUAL	
"WG_CANNOT_FIND_COLLATOR"	TokenNameStringLiteral	WG_CANNOT_FIND_COLLATOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
=	TokenNameEQUAL	
"WG_FUNCTIONS_SHOULD_USE_URL"	TokenNameStringLiteral	WG_FUNCTIONS_SHOULD_USE_URL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
=	TokenNameEQUAL	
"WG_ENCODING_NOT_SUPPORTED_USING_UTF8"	TokenNameStringLiteral	WG_ENCODING_NOT_SUPPORTED_USING_UTF8
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
=	TokenNameEQUAL	
"WG_ENCODING_NOT_SUPPORTED_USING_JAVA"	TokenNameStringLiteral	WG_ENCODING_NOT_SUPPORTED_USING_JAVA
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
=	TokenNameEQUAL	
"WG_SPECIFICITY_CONFLICTS"	TokenNameStringLiteral	WG_SPECIFICITY_CONFLICTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
=	TokenNameEQUAL	
"WG_PARSING_AND_PREPARING"	TokenNameStringLiteral	WG_PARSING_AND_PREPARING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
=	TokenNameEQUAL	
"WG_ATTR_TEMPLATE"	TokenNameStringLiteral	WG_ATTR_TEMPLATE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
=	TokenNameEQUAL	
"WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESP"	TokenNameStringLiteral	WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESP
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
=	TokenNameEQUAL	
"WG_ATTRIB_NOT_HANDLED"	TokenNameStringLiteral	WG_ATTRIB_NOT_HANDLED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
=	TokenNameEQUAL	
"WG_NO_DECIMALFORMAT_DECLARATION"	TokenNameStringLiteral	WG_NO_DECIMALFORMAT_DECLARATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
=	TokenNameEQUAL	
"WG_OLD_XSLT_NS"	TokenNameStringLiteral	WG_OLD_XSLT_NS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
=	TokenNameEQUAL	
"WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED"	TokenNameStringLiteral	WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
=	TokenNameEQUAL	
"WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE"	TokenNameStringLiteral	WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
=	TokenNameEQUAL	
"WG_ILLEGAL_ATTRIBUTE"	TokenNameStringLiteral	WG_ILLEGAL_ATTRIBUTE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
=	TokenNameEQUAL	
"WG_COULD_NOT_RESOLVE_PREFIX"	TokenNameStringLiteral	WG_COULD_NOT_RESOLVE_PREFIX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
=	TokenNameEQUAL	
"WG_STYLESHEET_REQUIRES_VERSION_ATTRIB"	TokenNameStringLiteral	WG_STYLESHEET_REQUIRES_VERSION_ATTRIB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
=	TokenNameEQUAL	
"WG_ILLEGAL_ATTRIBUTE_NAME"	TokenNameStringLiteral	WG_ILLEGAL_ATTRIBUTE_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
=	TokenNameEQUAL	
"WG_ILLEGAL_ATTRIBUTE_VALUE"	TokenNameStringLiteral	WG_ILLEGAL_ATTRIBUTE_VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
=	TokenNameEQUAL	
"WG_EMPTY_SECOND_ARG"	TokenNameStringLiteral	WG_EMPTY_SECOND_ARG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
=	TokenNameEQUAL	
"WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML"	TokenNameStringLiteral	WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
=	TokenNameEQUAL	
"WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME"	TokenNameStringLiteral	WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
=	TokenNameEQUAL	
"WG_ILLEGAL_ATTRIBUTE_POSITION"	TokenNameStringLiteral	WG_ILLEGAL_ATTRIBUTE_POSITION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
=	TokenNameEQUAL	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
;	TokenNameSEMICOLON	
/* * Now fill in the message text. * Then fill in the message text for that message code in the * array. Use the new error code as the index into the array. */	TokenNameCOMMENT_BLOCK	 Now fill in the message text. Then fill in the message text for that message code in the array. Use the new error code as the index into the array. 
// Error messages... 	TokenNameCOMMENT_LINE	Error messages... 
/** Get the lookup table for error messages. * * @return The message lookup table. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages. * @return The message lookup table. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getContents	TokenNameIdentifier	 get Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
/** Error message ID that has a null message, but takes in a single object. */	TokenNameCOMMENT_JAVADOC	 Error message ID that has a null message, but takes in a single object. 
{	TokenNameLBRACE	
"ER0000"	TokenNameStringLiteral	ER0000
,	TokenNameCOMMA	
"{0}"	TokenNameStringLiteral	{0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CURLYBRACE	TokenNameIdentifier	 ER  NO  CURLYBRACE
,	TokenNameCOMMA	
"Error: no hi pot haver un caràcter '{' dins l'expressió"	TokenNameStringLiteral	Error: no hi pot haver un caràcter '{' dins l'expressió
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} té un atribut no permès: {1}"	TokenNameStringLiteral	{0} té un atribut no permès: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
,	TokenNameCOMMA	
"sourceNode és nul en xsl:apply-imports."	TokenNameStringLiteral	sourceNode és nul en xsl:apply-imports.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
"No es pot afegir {0} a {1}"	TokenNameStringLiteral	No es pot afegir {0} a {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
,	TokenNameCOMMA	
"sourceNode és nul en handleApplyTemplatesInstruction."	TokenNameStringLiteral	sourceNode és nul en handleApplyTemplatesInstruction.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
,	TokenNameCOMMA	
"{0} ha de tenir un atribut de nom."	TokenNameStringLiteral	{0} ha de tenir un atribut de nom.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
"No s''ha trobat la plantilla anomenada: {0}"	TokenNameStringLiteral	No s''ha trobat la plantilla anomenada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
,	TokenNameCOMMA	
"No s'ha pogut resoldre l'AVT de noms a xsl:call-template."	TokenNameStringLiteral	No s'ha pogut resoldre l'AVT de noms a xsl:call-template.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
"{0} necessita l''atribut: {1}"	TokenNameStringLiteral	{0} necessita l''atribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
,	TokenNameCOMMA	
"{0} ha de tenir un atribut ''test''. "	TokenNameStringLiteral	{0} ha de tenir un atribut ''test''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
,	TokenNameCOMMA	
"Valor incorrecte a l''atribut de nivell: {0}"	TokenNameStringLiteral	Valor incorrecte a l''atribut de nivell: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"El nom processing-instruction no pot ser 'xml'"	TokenNameStringLiteral	El nom processing-instruction no pot ser 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"El nom processing-instruction ha de ser un NCName vàlid: {0}"	TokenNameStringLiteral	El nom processing-instruction ha de ser un NCName vàlid: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} ha de tenir un atribut que hi coincideixi si té una modalitat."	TokenNameStringLiteral	{0} ha de tenir un atribut que hi coincideixi si té una modalitat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} necessita un nom o un atribut que hi coincideixi."	TokenNameStringLiteral	{0} necessita un nom o un atribut que hi coincideixi.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
,	TokenNameCOMMA	
"No s''ha pogut resoldre el prefix d''espai de noms: {0}"	TokenNameStringLiteral	No s''ha pogut resoldre el prefix d''espai de noms: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space té un valor no vàlid: {0}"	TokenNameStringLiteral	xml:space té un valor no vàlid: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
,	TokenNameCOMMA	
"El node subordinat no té un document de propietari."	TokenNameStringLiteral	El node subordinat no té un document de propietari.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
"Error d''ElemTemplateElement: {0}"	TokenNameStringLiteral	Error d''ElemTemplateElement: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
,	TokenNameCOMMA	
"S'està intentant afegir un subordinat nul."	TokenNameStringLiteral	S'està intentant afegir un subordinat nul.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
,	TokenNameCOMMA	
"{0} necessita un atribut de selecció."	TokenNameStringLiteral	{0} necessita un atribut de selecció.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
,	TokenNameCOMMA	
"xsl:when ha de tenir un atribut 'test'."	TokenNameStringLiteral	xsl:when ha de tenir un atribut 'test'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:with-param ha de tenir un atribut 'name'."	TokenNameStringLiteral	xsl:with-param ha de tenir un atribut 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
,	TokenNameCOMMA	
"El context no té un document de propietari."	TokenNameStringLiteral	El context no té un document de propietari.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
,	TokenNameCOMMA	
"No s''ha pogut crear la relació XML TransformerFactory: {0}"	TokenNameStringLiteral	No s''ha pogut crear la relació XML TransformerFactory: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan: el procés no ha estat correcte."	TokenNameStringLiteral	Xalan: el procés no ha estat correcte.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan no ha estat correcte."	TokenNameStringLiteral	Xalan no ha estat correcte.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"La codificació no té suport: {0}"	TokenNameStringLiteral	La codificació no té suport: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
,	TokenNameCOMMA	
"No s''ha pogut crear TraceListener: {0}"	TokenNameStringLiteral	No s''ha pogut crear TraceListener: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:key necessita un atribut 'name'."	TokenNameStringLiteral	xsl:key necessita un atribut 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
,	TokenNameCOMMA	
"xsl:key necessita un atribut 'match'."	TokenNameStringLiteral	xsl:key necessita un atribut 'match'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
,	TokenNameCOMMA	
"xsl:key necessita un atribut 'use'."	TokenNameStringLiteral	xsl:key necessita un atribut 'use'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} necessita un atribut ''elements''. "	TokenNameStringLiteral	(StylesheetHandler) {0} necessita un atribut ''elements''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) falta l''atribut ''prefix'' {0}. "	TokenNameStringLiteral	(StylesheetHandler) falta l''atribut ''prefix'' {0}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
,	TokenNameCOMMA	
"La URL del full d''estils és incorrecta: {0}"	TokenNameStringLiteral	La URL del full d''estils és incorrecta: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
,	TokenNameCOMMA	
"No s''ha trobat el fitxer del full d''estils: {0}"	TokenNameStringLiteral	No s''ha trobat el fitxer del full d''estils: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
,	TokenNameCOMMA	
"S''ha produït una excepció d''E/S amb el fitxer de full d''estils: {0}"	TokenNameStringLiteral	S''ha produït una excepció d''E/S amb el fitxer de full d''estils: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) No s''ha trobat l''atribut href de {0}"	TokenNameStringLiteral	(StylesheetHandler) No s''ha trobat l''atribut href de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0} s''està incloent a ell mateix directament o indirecta."	TokenNameStringLiteral	(StylesheetHandler) {0} s''està incloent a ell mateix directament o indirecta.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINCLUDE_ERROR	TokenNameIdentifier	 ER  PROCESSINCLUDE  ERROR
,	TokenNameCOMMA	
"Error de StylesheetHandler.processInclude, {0}"	TokenNameStringLiteral	Error de StylesheetHandler.processInclude, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_LANG_ATTRIB	TokenNameIdentifier	 ER  MISSING  LANG  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) falta l''atribut ''lang'' {0}. "	TokenNameStringLiteral	(StylesheetHandler) falta l''atribut ''lang'' {0}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
,	TokenNameCOMMA	
"(StylesheetHandler) L''element {0} és fora de lloc? Falta l''element de contenidor ''component''"	TokenNameStringLiteral	(StylesheetHandler) L''element {0} és fora de lloc? Falta l''element de contenidor ''component''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
,	TokenNameCOMMA	
"La sortida només pot ser cap a un Element, Fragment de document, Document o Transcriptor de documents."	TokenNameStringLiteral	La sortida només pot ser cap a un Element, Fragment de document, Document o Transcriptor de documents.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_ERROR	TokenNameIdentifier	 ER  PROCESS  ERROR
,	TokenNameCOMMA	
"Error de StylesheetRoot.process"	TokenNameStringLiteral	Error de StylesheetRoot.process
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNIMPLNODE_ERROR	TokenNameIdentifier	 ER  UNIMPLNODE  ERROR
,	TokenNameCOMMA	
"Error d''UnImplNode: {0}"	TokenNameStringLiteral	Error d''UnImplNode: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
,	TokenNameCOMMA	
"Error. No s'ha trobat l'expressió select d'xpath (-select)."	TokenNameStringLiteral	Error. No s'ha trobat l'expressió select d'xpath (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
,	TokenNameCOMMA	
"No es pot serialitzar un XSLProcessor."	TokenNameStringLiteral	No es pot serialitzar un XSLProcessor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
,	TokenNameCOMMA	
"No s'ha especificat l'entrada del full d'estils."	TokenNameStringLiteral	No s'ha especificat l'entrada del full d'estils.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
,	TokenNameCOMMA	
"No s'ha pogut processar el full d'estils."	TokenNameStringLiteral	No s'ha pogut processar el full d'estils.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
,	TokenNameCOMMA	
"No s''ha pogut analitzar el document {0}."	TokenNameStringLiteral	No s''ha pogut analitzar el document {0}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
,	TokenNameCOMMA	
"No s''ha pogut trobar el fragment: {0}"	TokenNameStringLiteral	No s''ha pogut trobar el fragment: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
,	TokenNameCOMMA	
"El node al qual apuntava l''identificador de fragments no era un element: {0}"	TokenNameStringLiteral	El node al qual apuntava l''identificador de fragments no era un element: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"for-each ha de tenir o bé una coincidència o bé un atribut de nom."	TokenNameStringLiteral	for-each ha de tenir o bé una coincidència o bé un atribut de nom.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"Les plantilles han de tenir o bé una coincidència o bé un atribut de nom."	TokenNameStringLiteral	Les plantilles han de tenir o bé una coincidència o bé un atribut de nom.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
,	TokenNameCOMMA	
"No hi ha cap clonatge d'un fragment de document."	TokenNameStringLiteral	No hi ha cap clonatge d'un fragment de document.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
,	TokenNameCOMMA	
"No es pot crear un element a l''arbre de resultats: {0}"	TokenNameStringLiteral	No es pot crear un element a l''arbre de resultats: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space de l''XML d''origen té un valor no permès: {0}"	TokenNameStringLiteral	xml:space de l''XML d''origen té un valor no permès: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
"No hi ha cap declaració d''xls:key per a {0}."	TokenNameStringLiteral	No hi ha cap declaració d''xls:key per a {0}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
,	TokenNameCOMMA	
"Error. No es pot crear la URL de: {0}"	TokenNameStringLiteral	Error. No es pot crear la URL de: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
,	TokenNameCOMMA	
"xsl:functions no té suport."	TokenNameStringLiteral	xsl:functions no té suport.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
,	TokenNameCOMMA	
"Error d'XSLT TransformerFactory"	TokenNameStringLiteral	Error d'XSLT TransformerFactory
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
,	TokenNameCOMMA	
"(StylesheetHandler) {0} no està permès dins d''un full d''estils."	TokenNameStringLiteral	(StylesheetHandler) {0} no està permès dins d''un full d''estils.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
,	TokenNameCOMMA	
"result-ns ja no té suport. En comptes d'això, feu servir xsl:output."	TokenNameStringLiteral	result-ns ja no té suport. En comptes d'això, feu servir xsl:output.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
,	TokenNameCOMMA	
"default-space ja no té suport. En comptes d'això, feu servir xsl:strip-space o xsl:preserve-space."	TokenNameStringLiteral	default-space ja no té suport. En comptes d'això, feu servir xsl:strip-space o xsl:preserve-space.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
,	TokenNameCOMMA	
"indent-result ja no té suport. En comptes d'això, feu servir xsl:output."	TokenNameStringLiteral	indent-result ja no té suport. En comptes d'això, feu servir xsl:output.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} té un atribut no permès: {1}"	TokenNameStringLiteral	(StylesheetHandler) {0} té un atribut no permès: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
,	TokenNameCOMMA	
"Element XSL desconegut: {0}"	TokenNameStringLiteral	Element XSL desconegut: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:sort només es pot utilitzar amb xsl:apply-templates o xsl:for-each."	TokenNameStringLiteral	(StylesheetHandler) xsl:sort només es pot utilitzar amb xsl:apply-templates o xsl:for-each.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when està mal col·locat."	TokenNameStringLiteral	(StylesheetHandler) xsl:when està mal col·locat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when no ha estat analitzat per xsl:choose."	TokenNameStringLiteral	(StylesheetHandler) xsl:when no ha estat analitzat per xsl:choose.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise està mal col·locat."	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise està mal col·locat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise no té com a superior xsl:choose."	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise no té com a superior xsl:choose.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
,	TokenNameCOMMA	
"(StylesheetHandler) {0} no està permès dins d''una plantilla."	TokenNameStringLiteral	(StylesheetHandler) {0} no està permès dins d''una plantilla.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
,	TokenNameCOMMA	
"(StylesheetHandler) {0} prefix d''espai de noms d''extensió {1} desconegut"	TokenNameStringLiteral	(StylesheetHandler) {0} prefix d''espai de noms d''extensió {1} desconegut
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
,	TokenNameCOMMA	
"(StylesheetHandler) Les importacions només es poden produir com els primers elements del full d'estils."	TokenNameStringLiteral	(StylesheetHandler) Les importacions només es poden produir com els primers elements del full d'estils.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0} s''està important a ell mateix directament o indirecta."	TokenNameStringLiteral	(StylesheetHandler) {0} s''està important a ell mateix directament o indirecta.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
,	TokenNameCOMMA	
"(StylesheetHandler) xml:space té un valor no permès: {0}"	TokenNameStringLiteral	(StylesheetHandler) xml:space té un valor no permès: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"processStylesheet no ha estat correcte."	TokenNameStringLiteral	processStylesheet no ha estat correcte.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
,	TokenNameCOMMA	
"Excepció SAX"	TokenNameStringLiteral	Excepció SAX
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// add this message to fix bug 21478 	TokenNameCOMMENT_LINE	add this message to fix bug 21478 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Aquesta funció no té suport."	TokenNameStringLiteral	Aquesta funció no té suport.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
,	TokenNameCOMMA	
"Error d'XSLT"	TokenNameStringLiteral	Error d'XSLT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
,	TokenNameCOMMA	
"El signe de moneda no està permès en una cadena de patró de format."	TokenNameStringLiteral	El signe de moneda no està permès en una cadena de patró de format.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
,	TokenNameCOMMA	
"La funció document no té suport al DOM de full d'estils."	TokenNameStringLiteral	La funció document no té suport al DOM de full d'estils.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
,	TokenNameCOMMA	
"No es pot resoldre el prefix del solucionador sense prefix."	TokenNameStringLiteral	No es pot resoldre el prefix del solucionador sense prefix.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
,	TokenNameCOMMA	
"Extensió de redirecció: No s'ha pogut obtenir el nom del fitxer - els atributs file o select han de retornar una cadena vàlida."	TokenNameStringLiteral	Extensió de redirecció: No s'ha pogut obtenir el nom del fitxer - els atributs file o select han de retornar una cadena vàlida.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
,	TokenNameCOMMA	
"No es pot crear build FormatterListener en l'extensió de redirecció."	TokenNameStringLiteral	No es pot crear build FormatterListener en l'extensió de redirecció.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
,	TokenNameCOMMA	
"El prefix d''exclude-result-prefixes no és vàlid: {0}"	TokenNameStringLiteral	El prefix d''exclude-result-prefixes no és vàlid: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
,	TokenNameCOMMA	
"Falta l'URI d'espai de noms del prefix especificat."	TokenNameStringLiteral	Falta l'URI d'espai de noms del prefix especificat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
,	TokenNameCOMMA	
"Falta un argument de l''opció: {0}"	TokenNameStringLiteral	Falta un argument de l''opció: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
,	TokenNameCOMMA	
"Opció no vàlida: {0}"	TokenNameStringLiteral	Opció no vàlida: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
"Cadena de format mal formada: {0}"	TokenNameStringLiteral	Cadena de format mal formada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet necessita un atribut 'version'."	TokenNameStringLiteral	xsl:stylesheet necessita un atribut 'version'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"L''atribut {0} té un valor no permès {1}"	TokenNameStringLiteral	L''atribut {0} té un valor no permès {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
,	TokenNameCOMMA	
"xsl:choose necessita un xsl:when"	TokenNameStringLiteral	xsl:choose necessita un xsl:when
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
,	TokenNameCOMMA	
"xsl:apply-imports no es permeten en un xsl:for-each"	TokenNameStringLiteral	xsl:apply-imports no es permeten en un xsl:for-each
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
,	TokenNameCOMMA	
"No es pot utilitzar una DTMLiaison per a un node DOM de sortida. En lloc d'això, utilitzeu org.apache.xpath.DOM2Helper."	TokenNameStringLiteral	No es pot utilitzar una DTMLiaison per a un node DOM de sortida. En lloc d'això, utilitzeu org.apache.xpath.DOM2Helper.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
,	TokenNameCOMMA	
"No es pot utilitzar una DTMLiaison per a un node DOM d'entrada. En lloc d'això, utilitzeu org.apache.xpath.DOM2Helper."	TokenNameStringLiteral	No es pot utilitzar una DTMLiaison per a un node DOM d'entrada. En lloc d'això, utilitzeu org.apache.xpath.DOM2Helper.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
,	TokenNameCOMMA	
"S''ha produït un error en la crida de l''element d''extensió {0}"	TokenNameStringLiteral	S''ha produït un error en la crida de l''element d''extensió {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"El prefix s''ha de resoldre en un espai de noms: {0}"	TokenNameStringLiteral	El prefix s''ha de resoldre en un espai de noms: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"S''ha detectat un suplent UTF-16 no vàlid: {0} ?"	TokenNameStringLiteral	S''ha detectat un suplent UTF-16 no vàlid: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
,	TokenNameCOMMA	
"xsl:attribute-set {0} s''ha utilitzat a ell mateix; això crearà un bucle infinit."	TokenNameStringLiteral	xsl:attribute-set {0} s''ha utilitzat a ell mateix; això crearà un bucle infinit.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
,	TokenNameCOMMA	
"No es pot barrejar entrada no Xerces-DOM amb sortida Xerces-DOM."	TokenNameStringLiteral	No es pot barrejar entrada no Xerces-DOM amb sortida Xerces-DOM.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TOO_MANY_LISTENERS	TokenNameIdentifier	 ER  TOO  MANY  LISTENERS
,	TokenNameCOMMA	
"addTraceListenersToStylesheet - TooManyListenersException"	TokenNameStringLiteral	addTraceListenersToStylesheet - TooManyListenersException
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IN_ELEMTEMPLATEELEM_READOBJECT	TokenNameIdentifier	 ER  IN  ELEMTEMPLATEELEM  READOBJECT
,	TokenNameCOMMA	
"En ElemTemplateElement.readObject: {0}"	TokenNameStringLiteral	En ElemTemplateElement.readObject: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
,	TokenNameCOMMA	
"S''ha trobat més d''una plantilla anomenada {0}"	TokenNameStringLiteral	S''ha trobat més d''una plantilla anomenada {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
,	TokenNameCOMMA	
"Crida de funció no vàlida: les crides key() recursives no estan permeses."	TokenNameStringLiteral	Crida de funció no vàlida: les crides key() recursives no estan permeses.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
"La variable {0} està fent referència a ella mateixa directa o indirectament."	TokenNameStringLiteral	La variable {0} està fent referència a ella mateixa directa o indirectament.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
"El node d'entrada no pot ser nul per a DOMSource de newTemplates."	TokenNameStringLiteral	El node d'entrada no pot ser nul per a DOMSource de newTemplates.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
,	TokenNameCOMMA	
"No s''ha trobat el fitxer de classe per a l''opció {0}"	TokenNameStringLiteral	No s''ha trobat el fitxer de classe per a l''opció {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
"L''element necessari no s''ha trobat: {0}"	TokenNameStringLiteral	L''element necessari no s''ha trobat: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputStream no pot ser nul."	TokenNameStringLiteral	InputStream no pot ser nul.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
,	TokenNameCOMMA	
"L'URI no pot ser nul."	TokenNameStringLiteral	L'URI no pot ser nul.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"El fitxer no pot ser nul."	TokenNameStringLiteral	El fitxer no pot ser nul.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputSource no pot ser nul."	TokenNameStringLiteral	InputSource no pot ser nul.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
"No s'ha pogut inicialitzar BSF Manager"	TokenNameStringLiteral	No s'ha pogut inicialitzar BSF Manager
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
"No s'ha pogut compilar l'extensió"	TokenNameStringLiteral	No s'ha pogut compilar l'extensió
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
"No s''ha pogut crear l''extensió {0} a causa de {1}"	TokenNameStringLiteral	No s''ha pogut crear l''extensió {0} a causa de {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
,	TokenNameCOMMA	
"La crida del mètode d''instància {0} necessita una instància d''objecte com a primer argument"	TokenNameStringLiteral	La crida del mètode d''instància {0} necessita una instància d''objecte com a primer argument
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
,	TokenNameCOMMA	
"S''ha especificat un nom d''element no vàlid {0}"	TokenNameStringLiteral	S''ha especificat un nom d''element no vàlid {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
,	TokenNameCOMMA	
"El mètode del nom de l''element ha de ser estàtic {0}"	TokenNameStringLiteral	El mètode del nom de l''element ha de ser estàtic {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
"No es coneix la funció d''extensió {0} : {1}."	TokenNameStringLiteral	No es coneix la funció d''extensió {0} : {1}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
,	TokenNameCOMMA	
"Hi ha més d''una millor coincidència per al constructor de {0}"	TokenNameStringLiteral	Hi ha més d''una millor coincidència per al constructor de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
,	TokenNameCOMMA	
"Hi ha més d''una millor coincidència per al mètode {0}"	TokenNameStringLiteral	Hi ha més d''una millor coincidència per al mètode {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
"Hi ha més d''una millor coincidència per al mètode d''element {0}"	TokenNameStringLiteral	Hi ha més d''una millor coincidència per al mètode d''element {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
,	TokenNameCOMMA	
"S''ha donat un context no vàlid per avaluar {0}"	TokenNameStringLiteral	S''ha donat un context no vàlid per avaluar {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
"L'agrupació ja existeix"	TokenNameStringLiteral	L'agrupació ja existeix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
,	TokenNameCOMMA	
"No s'ha especificat cap nom de controlador"	TokenNameStringLiteral	No s'ha especificat cap nom de controlador
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
,	TokenNameCOMMA	
"No s'ha especificat cap URL"	TokenNameStringLiteral	No s'ha especificat cap URL
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
,	TokenNameCOMMA	
"La grandària de l'agrupació és inferior a u"	TokenNameStringLiteral	La grandària de l'agrupació és inferior a u
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
,	TokenNameCOMMA	
"S'ha especificat un nom de controlador no vàlid"	TokenNameStringLiteral	S'ha especificat un nom de controlador no vàlid
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
"No s'ha trobat l'arrel del full d'estils"	TokenNameStringLiteral	No s'ha trobat l'arrel del full d'estils
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
"Valor no permès per a xml:space"	TokenNameStringLiteral	Valor no permès per a xml:space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
"S'ha produït un error a processFromNode"	TokenNameStringLiteral	S'ha produït un error a processFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"No s''ha pogut carregar el recurs [ {0} ]: {1} {2} {3}"	TokenNameStringLiteral	No s''ha pogut carregar el recurs [ {0} ]: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Grandària del buffer <=0"	TokenNameStringLiteral	Grandària del buffer <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
,	TokenNameCOMMA	
"S'ha produït un error desconegut en cridar l'extensió"	TokenNameStringLiteral	S'ha produït un error desconegut en cridar l'extensió
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
"El prefix {0} no té una declaració d''espai de noms corresponent"	TokenNameStringLiteral	El prefix {0} no té una declaració d''espai de noms corresponent
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
"El contingut de l''element no està permès per a lang=javaclass {0}"	TokenNameStringLiteral	El contingut de l''element no està permès per a lang=javaclass {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
"El full d'estils ha ordenat l'acabament"	TokenNameStringLiteral	El full d'estils ha ordenat l'acabament
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
,	TokenNameCOMMA	
"1 o 2"	TokenNameStringLiteral	1 o 2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 o 3"	TokenNameStringLiteral	2 o 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"No s''ha pogut carregar {0} (comproveu la CLASSPATH); ara s''estan fent servir els valors per defecte."	TokenNameStringLiteral	No s''ha pogut carregar {0} (comproveu la CLASSPATH); ara s''estan fent servir els valors per defecte.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
,	TokenNameCOMMA	
"No es poden inicialitzar les plantilles per defecte"	TokenNameStringLiteral	No es poden inicialitzar les plantilles per defecte
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"El resultat no ha de ser nul"	TokenNameStringLiteral	El resultat no ha de ser nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
"No s'ha pogut establir el resultat"	TokenNameStringLiteral	No s'ha pogut establir el resultat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"No s'ha especificat cap sortida"	TokenNameStringLiteral	No s'ha especificat cap sortida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
"No s''ha pogut transformar en un resultat del tipus {0}"	TokenNameStringLiteral	No s''ha pogut transformar en un resultat del tipus {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
"No s''ha pogut transformar en un origen del tipus {0}"	TokenNameStringLiteral	No s''ha pogut transformar en un origen del tipus {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
"Manejador de contingut nul"	TokenNameStringLiteral	Manejador de contingut nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Manejador d'error nul"	TokenNameStringLiteral	Manejador d'error nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
,	TokenNameCOMMA	
"L'anàlisi no es pot cridar si no s'ha establert ContentHandler"	TokenNameStringLiteral	L'anàlisi no es pot cridar si no s'ha establert ContentHandler
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
,	TokenNameCOMMA	
"El filtre no té superior"	TokenNameStringLiteral	El filtre no té superior
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
,	TokenNameCOMMA	
"No s''ha trobat cap full d''estils a {0}, suport= {1}"	TokenNameStringLiteral	No s''ha trobat cap full d''estils a {0}, suport= {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
,	TokenNameCOMMA	
"No s''ha trobat cap PI d''xml-stylesheet a {0}"	TokenNameStringLiteral	No s''ha trobat cap PI d''xml-stylesheet a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"No té suport: {0}"	TokenNameStringLiteral	No té suport: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
,	TokenNameCOMMA	
"El valor de la propietat {0} ha de ser una instància booleana"	TokenNameStringLiteral	El valor de la propietat {0} ha de ser una instància booleana
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
"No s''ha pogut arribar a l''script extern a {0}"	TokenNameStringLiteral	No s''ha pogut arribar a l''script extern a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"No s''ha trobat el recurs [ {0} ]. {1}"	TokenNameStringLiteral	No s''ha trobat el recurs [ {0} ]. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
"La propietat de sortida no es reconeix: {0}"	TokenNameStringLiteral	La propietat de sortida no es reconeix: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
,	TokenNameCOMMA	
"S'ha produït un error en crear la instància ElemLiteralResult"	TokenNameStringLiteral	S'ha produït un error en crear la instància ElemLiteralResult
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 	TokenNameCOMMENT_LINE	Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 
// In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 	TokenNameCOMMENT_LINE	In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 
//in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 	TokenNameCOMMENT_LINE	in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 
//NOTE: Not only the key name but message has also been changed. 	TokenNameCOMMENT_LINE	NOTE: Not only the key name but message has also been changed. 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
,	TokenNameCOMMA	
"El valor de {0} ha de contenir un número que es pugui analitzar"	TokenNameStringLiteral	El valor de {0} ha de contenir un número que es pugui analitzar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
,	TokenNameCOMMA	
"El valor de {0} ha de ser igual a yes o no"	TokenNameStringLiteral	El valor de {0} ha de ser igual a yes o no
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
,	TokenNameCOMMA	
"No s''ha pogut cridar el mètode {0}"	TokenNameStringLiteral	No s''ha pogut cridar el mètode {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
,	TokenNameCOMMA	
"No s'ha pogut crear la instància ElemTemplateElement"	TokenNameStringLiteral	No s'ha pogut crear la instància ElemTemplateElement
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
"En aquest punt del document no es permeten els caràcters"	TokenNameStringLiteral	En aquest punt del document no es permeten els caràcters
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
"L''atribut "{0}" no es permet en l''element {1}"	TokenNameStringLiteral	L''atribut "{0}" no es permet en l''element {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
"{0} valor erroni {1} "	TokenNameStringLiteral	{0} valor erroni {1} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
,	TokenNameCOMMA	
"No s''ha trobat el valor de l''atribut {0} "	TokenNameStringLiteral	No s''ha trobat el valor de l''atribut {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
,	TokenNameCOMMA	
"No es reconeix el valor de l''atribut {0} "	TokenNameStringLiteral	No es reconeix el valor de l''atribut {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
,	TokenNameCOMMA	
"S'intenta generar un prefix d'espai de noms amb un URI nul"	TokenNameStringLiteral	S'intenta generar un prefix d'espai de noms amb un URI nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
,	TokenNameCOMMA	
"S'intenta formatar un número més gran que l'enter llarg més gran"	TokenNameStringLiteral	S'intenta formatar un número més gran que l'enter llarg més gran
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
,	TokenNameCOMMA	
"No es pot trobar la classe de controlador SAX1 {0}"	TokenNameStringLiteral	No es pot trobar la classe de controlador SAX1 {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
,	TokenNameCOMMA	
"S''ha trobat la classe de controlador SAX1 {0} però no es pot carregar"	TokenNameStringLiteral	S''ha trobat la classe de controlador SAX1 {0} però no es pot carregar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
,	TokenNameCOMMA	
"S''ha carregat la classe de controlador SAX1 {0} però no es pot particularitzar"	TokenNameStringLiteral	S''ha carregat la classe de controlador SAX1 {0} però no es pot particularitzar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
,	TokenNameCOMMA	
"La classe de controlador SAX1 {0} no implementa org.xml.sax.Parser"	TokenNameStringLiteral	La classe de controlador SAX1 {0} no implementa org.xml.sax.Parser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
,	TokenNameCOMMA	
"No s'ha identificat la propietat del sistema org.xml.sax.parser"	TokenNameStringLiteral	No s'ha identificat la propietat del sistema org.xml.sax.parser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"L'argument d'analitzador ha de ser nul"	TokenNameStringLiteral	L'argument d'analitzador ha de ser nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
,	TokenNameCOMMA	
"Característica: {0}"	TokenNameStringLiteral	Característica: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
,	TokenNameCOMMA	
"Propietat: {0}"	TokenNameStringLiteral	Propietat: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
,	TokenNameCOMMA	
"Solucionador d'entitat nul"	TokenNameStringLiteral	Solucionador d'entitat nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
,	TokenNameCOMMA	
"Manejador de DTD nul"	TokenNameStringLiteral	Manejador de DTD nul
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
"No s'ha especificat cap nom de controlador"	TokenNameStringLiteral	No s'ha especificat cap nom de controlador
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
"No s'ha especificat cap URL"	TokenNameStringLiteral	No s'ha especificat cap URL
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
"La grandària de l'agrupació és inferior a 1"	TokenNameStringLiteral	La grandària de l'agrupació és inferior a 1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
"S'ha especificat un nom de controlador no vàlid"	TokenNameStringLiteral	S'ha especificat un nom de controlador no vàlid
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ERRORLISTENER	TokenNameIdentifier	 ER  ERRORLISTENER
,	TokenNameCOMMA	
"ErrorListener"	TokenNameStringLiteral	ErrorListener
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message should not normally be displayed 	TokenNameCOMMENT_LINE	Note to translators: The following message should not normally be displayed 
// to users. It describes a situation in which the processor has detected 	TokenNameCOMMENT_LINE	to users. It describes a situation in which the processor has detected 
// an internal consistency problem in itself, and it provides this message 	TokenNameCOMMENT_LINE	an internal consistency problem in itself, and it provides this message 
// for the developer to help diagnose the problem. The name 	TokenNameCOMMENT_LINE	for the developer to help diagnose the problem. The name 
// 'ElemTemplateElement' is the name of a class, and should not be 	TokenNameCOMMENT_LINE	'ElemTemplateElement' is the name of a class, and should not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
ER_ASSERT_NO_TEMPLATE_PARENT	TokenNameIdentifier	 ER  ASSERT  NO  TEMPLATE  PARENT
,	TokenNameCOMMA	
"Error del programador. L'expressió no té cap superior ElemTemplateElement "	TokenNameStringLiteral	Error del programador. L'expressió no té cap superior ElemTemplateElement 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message should not normally be displayed 	TokenNameCOMMENT_LINE	Note to translators: The following message should not normally be displayed 
// to users. It describes a situation in which the processor has detected 	TokenNameCOMMENT_LINE	to users. It describes a situation in which the processor has detected 
// an internal consistency problem in itself, and it provides this message 	TokenNameCOMMENT_LINE	an internal consistency problem in itself, and it provides this message 
// for the developer to help diagnose the problem. The substitution text 	TokenNameCOMMENT_LINE	for the developer to help diagnose the problem. The substitution text 
// provides further information in order to diagnose the problem. The name 	TokenNameCOMMENT_LINE	provides further information in order to diagnose the problem. The name 
// 'RedundentExprEliminator' is the name of a class, and should not be 	TokenNameCOMMENT_LINE	'RedundentExprEliminator' is the name of a class, and should not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR	TokenNameIdentifier	 ER  ASSERT  REDUNDENT  EXPR  ELIMINATOR
,	TokenNameCOMMA	
"L''afirmació del programador a RedundentExprEliminator: {0}"	TokenNameStringLiteral	L''afirmació del programador a RedundentExprEliminator: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"{0} no es permet en aquesta posició del full d''estil"	TokenNameStringLiteral	{0} no es permet en aquesta posició del full d''estil
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"No es permet text sense espais en blanc en aquesta posició del full d'estil"	TokenNameStringLiteral	No es permet text sense espais en blanc en aquesta posició del full d'estil
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// This code is shared with warning codes. 	TokenNameCOMMENT_LINE	This code is shared with warning codes. 
// SystemId Unknown 	TokenNameCOMMENT_LINE	SystemId Unknown 
{	TokenNameLBRACE	
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut CHAR {0}. Un atribut de tipus CHAR només ha de contenir un caràcter."	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut CHAR {0}. Un atribut de tipus CHAR només ha de contenir un caràcter.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "QNAME" is the XML data-type of 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "QNAME" is the XML data-type of 
// the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
//The following codes are shared with the warning codes... 	TokenNameCOMMENT_LINE	The following codes are shared with the warning codes... 
{	TokenNameLBRACE	
INVALID_QNAME	TokenNameIdentifier	 INVALID  QNAME
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut QNAME {0}"	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut QNAME {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "ENUM" is the XML data-type of 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "ENUM" is the XML data-type of 
// the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	the attribute, and should not be translated. The substitution text {1} is 
// the attribute value, {0} is the attribute name, and {2} is a list of valid 	TokenNameCOMMENT_LINE	the attribute value, {0} is the attribute name, and {2} is a list of valid 
// values. 	TokenNameCOMMENT_LINE	values. 
{	TokenNameLBRACE	
INVALID_ENUM	TokenNameIdentifier	 INVALID  ENUM
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut ENUM {0}. Els valors vàlids són {2}."	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut ENUM {0}. Els valors vàlids són {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut NMTOKEN {0} "	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut NMTOKEN {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut NCNAME {0} "	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut NCNAME {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut boolean {0} "	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut boolean {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "number" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "number" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès {1} per a l''atribut number {0} "	TokenNameStringLiteral	S''ha utilitzat un valor no permès {1} per a l''atribut number {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// End of shared codes... 	TokenNameCOMMENT_LINE	End of shared codes... 
// Note to translators: A "match pattern" is a special form of XPath expression 	TokenNameCOMMENT_LINE	Note to translators: A "match pattern" is a special form of XPath expression 
// that is used for matching patterns. The substitution text is the name of 	TokenNameCOMMENT_LINE	that is used for matching patterns. The substitution text is the name of 
// a function. The message indicates that when this function is referenced in 	TokenNameCOMMENT_LINE	a function. The message indicates that when this function is referenced in 
// a match pattern, its argument must be a string literal (or constant.) 	TokenNameCOMMENT_LINE	a match pattern, its argument must be a string literal (or constant.) 
// ER_ARG_LITERAL - new error message for bugzilla //5202 	TokenNameCOMMENT_LINE	ER_ARG_LITERAL - new error message for bugzilla //5202 
{	TokenNameLBRACE	
ER_ARG_LITERAL	TokenNameIdentifier	 ER  ARG  LITERAL
,	TokenNameCOMMA	
"L''argument de {0} del patró de coincidència ha de ser un literal."	TokenNameStringLiteral	L''argument de {0} del patró de coincidència ha de ser un literal.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable. A "global variable" is a variable that is accessible everywher 	TokenNameCOMMENT_LINE	a variable. A "global variable" is a variable that is accessible everywher 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
// ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
,	TokenNameCOMMA	
"La declaració de variable global està duplicada."	TokenNameStringLiteral	La declaració de variable global està duplicada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable were encountered. 	TokenNameCOMMENT_LINE	a variable were encountered. 
// ER_DUPLICATE_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
,	TokenNameCOMMA	
"La declaració de variable està duplicada."	TokenNameStringLiteral	La declaració de variable està duplicada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "xsl:template, "name" and "match" are XSLT keywords 	TokenNameCOMMENT_LINE	Note to translators: "xsl:template, "name" and "match" are XSLT keywords 
// which must not be translated. 	TokenNameCOMMENT_LINE	which must not be translated. 
// ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 	TokenNameCOMMENT_LINE	ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 
{	TokenNameLBRACE	
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
,	TokenNameCOMMA	
"xsl:template ha de tenir un nom o un atribut de coincidència (o tots dos)"	TokenNameStringLiteral	xsl:template ha de tenir un nom o un atribut de coincidència (o tots dos)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "exclude-result-prefixes" is an XSLT keyword which 	TokenNameCOMMENT_LINE	Note to translators: "exclude-result-prefixes" is an XSLT keyword which 
// should not be translated. The message indicates that a namespace prefix 	TokenNameCOMMENT_LINE	should not be translated. The message indicates that a namespace prefix 
// encountered as part of the value of the exclude-result-prefixes attribute 	TokenNameCOMMENT_LINE	encountered as part of the value of the exclude-result-prefixes attribute 
// was in error. 	TokenNameCOMMENT_LINE	was in error. 
// ER_INVALID_PREFIX - new error message for bugzilla #788 	TokenNameCOMMENT_LINE	ER_INVALID_PREFIX - new error message for bugzilla #788 
{	TokenNameLBRACE	
ER_INVALID_PREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX
,	TokenNameCOMMA	
"El prefix d''exclude-result-prefixes no és vàlid: {0}"	TokenNameStringLiteral	El prefix d''exclude-result-prefixes no és vàlid: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: An "attribute set" is a set of attributes that can 	TokenNameCOMMENT_LINE	Note to translators: An "attribute set" is a set of attributes that can 
// be added to an element in the output document as a group. The message 	TokenNameCOMMENT_LINE	be added to an element in the output document as a group. The message 
// indicates that there was a reference to an attribute set named {0} that 	TokenNameCOMMENT_LINE	indicates that there was a reference to an attribute set named {0} that 
// was never defined. 	TokenNameCOMMENT_LINE	was never defined. 
// ER_NO_ATTRIB_SET - new error message for bugzilla #782 	TokenNameCOMMENT_LINE	ER_NO_ATTRIB_SET - new error message for bugzilla #782 
{	TokenNameLBRACE	
ER_NO_ATTRIB_SET	TokenNameIdentifier	 ER  NO  ATTRIB  SET
,	TokenNameCOMMA	
"attribute-set anomenat {0} no existeix"	TokenNameStringLiteral	attribute-set anomenat {0} no existeix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that there was a reference 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that there was a reference 
// to a function named {0} for which no function definition could be found. 	TokenNameCOMMENT_LINE	to a function named {0} for which no function definition could be found. 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
,	TokenNameCOMMA	
"La funció anomenada {0} no existeix"	TokenNameStringLiteral	La funció anomenada {0} no existeix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the XSLT instruction 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the XSLT instruction 
// that is named by the substitution text {0} must not contain other XSLT 	TokenNameCOMMENT_LINE	that is named by the substitution text {0} must not contain other XSLT 
// instructions (content) or a "select" attribute. The word "select" is 	TokenNameCOMMENT_LINE	instructions (content) or a "select" attribute. The word "select" is 
// an XSLT keyword in this case and must not be translated. 	TokenNameCOMMENT_LINE	an XSLT keyword in this case and must not be translated. 
{	TokenNameLBRACE	
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
,	TokenNameCOMMA	
"L''element {0} no ha de tenir ni l''atribut content ni el select. "	TokenNameStringLiteral	L''element {0} no ha de tenir ni l''atribut content ni el select. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the value argument 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the value argument 
// of setParameter must be a valid Java Object. 	TokenNameCOMMENT_LINE	of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"El valor del paràmetre {0} ha de ser un objecte Java vàlid "	TokenNameStringLiteral	El valor del paràmetre {0} ha de ser un objecte Java vàlid 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
,	TokenNameCOMMA	
"L'atribut result-prefix d'un element xsl:namespace-alias té el valor '#default', però no hi ha cap declaració de l'espai de noms per defecte en l'àmbit de l'element "	TokenNameStringLiteral	L'atribut result-prefix d'un element xsl:namespace-alias té el valor '#default', però no hi ha cap declaració de l'espai de noms per defecte en l'àmbit de l'element 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
,	TokenNameCOMMA	
"L''atribut result-prefix d''un element xsl:namespace-alias té el valor ''{0}'', però no hi ha cap declaració d''espai de noms per al prefix ''{0}'' en l''àmbit de l''element. "	TokenNameStringLiteral	L''atribut result-prefix d''un element xsl:namespace-alias té el valor ''{0}'', però no hi ha cap declaració d''espai de noms per al prefix ''{0}'' en l''àmbit de l''element. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"El nom de la característica no pot ser nul a TransformerFactory.setFeature(nom de la cadena, valor booleà). "	TokenNameStringLiteral	El nom de la característica no pot ser nul a TransformerFactory.setFeature(nom de la cadena, valor booleà). 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"El nom de la característica no pot ser nul a TransformerFactory.getFeature(nom de cadena). "	TokenNameStringLiteral	El nom de la característica no pot ser nul a TransformerFactory.getFeature(nom de cadena). 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"No es pot establir la característica ''{0}'' en aquesta TransformerFactory."	TokenNameStringLiteral	No es pot establir la característica ''{0}'' en aquesta TransformerFactory.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING	TokenNameIdentifier	 ER  EXTENSION  ELEMENT  NOT  ALLOWED  IN  SECURE  PROCESSING
,	TokenNameCOMMA	
"L''ús de l''element d''extensió ''{0}'' no està permès, si la característica de procés segur s''ha establert en true."	TokenNameStringLiteral	L''ús de l''element d''extensió ''{0}'' no està permès, si la característica de procés segur s''ha establert en true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
,	TokenNameCOMMA	
"No es pot obtenir el prefix per a un URI de nom d'espais nul. "	TokenNameStringLiteral	No es pot obtenir el prefix per a un URI de nom d'espais nul. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
,	TokenNameCOMMA	
"No es pot obtenir l'URI del nom d'espais per a un prefix nul. "	TokenNameStringLiteral	No es pot obtenir l'URI del nom d'espais per a un prefix nul. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
,	TokenNameCOMMA	
"El nom de la funció no pot ser nul. "	TokenNameStringLiteral	El nom de la funció no pot ser nul. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
,	TokenNameCOMMA	
"L'aritat no pot ser negativa."	TokenNameStringLiteral	L'aritat no pot ser negativa.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
"S'ha trobat '}' però no hi ha cap plantilla d'atribut oberta"	TokenNameStringLiteral	S'ha trobat '}' però no hi ha cap plantilla d'atribut oberta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
,	TokenNameCOMMA	
"Avís: l''atribut de recompte no coincideix amb un antecessor d''xsl:number. Destinació = {0}"	TokenNameStringLiteral	Avís: l''atribut de recompte no coincideix amb un antecessor d''xsl:number. Destinació = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
,	TokenNameCOMMA	
"Sintaxi antiga: El nom de l'atribut 'expr' s'ha canviat per 'select'."	TokenNameStringLiteral	Sintaxi antiga: El nom de l'atribut 'expr' s'ha canviat per 'select'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
,	TokenNameCOMMA	
"Xalan encara no pot gestionar el nom de l'entorn nacional a la funció format-number."	TokenNameStringLiteral	Xalan encara no pot gestionar el nom de l'entorn nacional a la funció format-number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
,	TokenNameCOMMA	
"Avís: no s''ha trobat l''entorn nacional d''xml:lang={0}"	TokenNameStringLiteral	Avís: no s''ha trobat l''entorn nacional d''xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"No es pot crear la URL de: {0}"	TokenNameStringLiteral	No es pot crear la URL de: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
,	TokenNameCOMMA	
"No es pot carregar el document sol·licitat: {0}"	TokenNameStringLiteral	No es pot carregar el document sol·licitat: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
"No s''ha trobat el classificador de <sort xml:lang={0}"	TokenNameStringLiteral	No s''ha trobat el classificador de <sort xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
,	TokenNameCOMMA	
"Sintaxi antiga: la instrucció de funcions ha d''utilitzar una URL de {0}"	TokenNameStringLiteral	Sintaxi antiga: la instrucció de funcions ha d''utilitzar una URL de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
,	TokenNameCOMMA	
"Codificació sense suport: {0}, s''utilitza UTF-8"	TokenNameStringLiteral	Codificació sense suport: {0}, s''utilitza UTF-8
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
,	TokenNameCOMMA	
"Codificació sense suport: {0}, s''utilitza Java {1}"	TokenNameStringLiteral	Codificació sense suport: {0}, s''utilitza Java {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
,	TokenNameCOMMA	
"S''han trobat conflictes d''especificitat: {0} S''utilitzarà el darrer trobat al full d''estils."	TokenNameStringLiteral	S''han trobat conflictes d''especificitat: {0} S''utilitzarà el darrer trobat al full d''estils.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
,	TokenNameCOMMA	
"========= S''està analitzant i preparant {0} =========="	TokenNameStringLiteral	========= S''està analitzant i preparant {0} ==========
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
"Plantilla Attr, {0}"	TokenNameStringLiteral	Plantilla Attr, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
,	TokenNameCOMMA	
"S'ha produït un conflicte de coincidència entre xsl:strip-space i xsl:preserve-space"	TokenNameStringLiteral	S'ha produït un conflicte de coincidència entre xsl:strip-space i xsl:preserve-space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
,	TokenNameCOMMA	
"Xalan encara no pot gestionar l''atribut {0}"	TokenNameStringLiteral	Xalan encara no pot gestionar l''atribut {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
"No s''ha trobat cap declaració per al format decimal: {0}"	TokenNameStringLiteral	No s''ha trobat cap declaració per al format decimal: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
,	TokenNameCOMMA	
"Falta l'espai de noms XSLT o és incorrecte. "	TokenNameStringLiteral	Falta l'espai de noms XSLT o és incorrecte. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
,	TokenNameCOMMA	
"Només es permet una declaració xsl:decimal-format per defecte."	TokenNameStringLiteral	Només es permet una declaració xsl:decimal-format per defecte.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
,	TokenNameCOMMA	
"Els noms d''xsl:decimal-format han de ser exclusius. El nom "{0}" està duplicat."	TokenNameStringLiteral	Els noms d''xsl:decimal-format han de ser exclusius. El nom "{0}" està duplicat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} té un atribut no permès: {1}"	TokenNameStringLiteral	{0} té un atribut no permès: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
"No s''ha pogut resoldre el prefix d''espai de noms: {0}. Es passarà per alt el node."	TokenNameStringLiteral	No s''ha pogut resoldre el prefix d''espai de noms: {0}. Es passarà per alt el node.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet necessita un atribut 'version'."	TokenNameStringLiteral	xsl:stylesheet necessita un atribut 'version'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
,	TokenNameCOMMA	
"El nom d''atribut no és permès: {0}"	TokenNameStringLiteral	El nom d''atribut no és permès: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"S''ha utilitzat un valor no permès a l''atribut {0}: {1}"	TokenNameStringLiteral	S''ha utilitzat un valor no permès a l''atribut {0}: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
,	TokenNameCOMMA	
"El conjunt de nodes resultant del segon argument de la funció document està buit. Torna un conjunt de nodes buit."	TokenNameStringLiteral	El conjunt de nodes resultant del segon argument de la funció document està buit. Torna un conjunt de nodes buit.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. 	TokenNameCOMMENT_LINE	and must not be translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"El valor de l'atribut 'name' del nom xsl:processing-instruction no ha de ser 'xml'"	TokenNameStringLiteral	El valor de l'atribut 'name' del nom xsl:processing-instruction no ha de ser 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. "NCName" is an XML data-type and must not be 	TokenNameCOMMENT_LINE	and must not be translated. "NCName" is an XML data-type and must not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"El valor de l''atribut ''name'' de xsl:processing-instruction ha de ser un NCName vàlid: {0}"	TokenNameStringLiteral	El valor de l''atribut ''name'' de xsl:processing-instruction ha de ser un NCName vàlid: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message is reported if the stylesheet that is 	TokenNameCOMMENT_LINE	Note to translators: This message is reported if the stylesheet that is 
// being processed attempted to construct an XML document with an attribute in a 	TokenNameCOMMENT_LINE	being processed attempted to construct an XML document with an attribute in a 
// place other than on an element. The substitution text specifies the name of 	TokenNameCOMMENT_LINE	place other than on an element. The substitution text specifies the name of 
// the attribute. 	TokenNameCOMMENT_LINE	the attribute. 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"No es pot afegir l''atribut {0} després dels nodes subordinats o abans que es produeixi un element. Es passarà per alt l''atribut."	TokenNameStringLiteral	No es pot afegir l''atribut {0} després dels nodes subordinats o abans que es produeixi un element. Es passarà per alt l''atribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"S'ha intentat modificar un objecte on no es permeten modificacions. "	TokenNameStringLiteral	S'ha intentat modificar un objecte on no es permeten modificacions. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 	TokenNameCOMMENT_LINE	Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"ca"	TokenNameStringLiteral	ca
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"ca"	TokenNameStringLiteral	ca
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"ca"	TokenNameStringLiteral	ca
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"El paràmetre de createMessage estava fora dels límits."	TokenNameStringLiteral	El paràmetre de createMessage estava fora dels límits.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"S'ha generat una excepció durant la crida messageFormat."	TokenNameStringLiteral	S'ha generat una excepció durant la crida messageFormat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Versió Xalan "	TokenNameStringLiteral	>>>>>>> Versió Xalan 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version2"	TokenNameStringLiteral	version2
,	TokenNameCOMMA	
"<<<<<<<"	TokenNameStringLiteral	<<<<<<<
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"yes"	TokenNameStringLiteral	yes
,	TokenNameCOMMA	
"sí"	TokenNameStringLiteral	sí
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Línia núm."	TokenNameStringLiteral	Línia núm.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Columna núm."	TokenNameStringLiteral	Columna núm.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: fet"	TokenNameStringLiteral	XSLProcessor: fet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following messages provide usage information 	TokenNameCOMMENT_LINE	Note to translators: The following messages provide usage information 
// for the Xalan Process command line. "Process" is the name of a Java class, 	TokenNameCOMMENT_LINE	for the Xalan Process command line. "Process" is the name of a Java class, 
// and should not be translated. 	TokenNameCOMMENT_LINE	and should not be translated. 
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Opcions de classe del procés de línia d'ordres de Xalan-J:"	TokenNameStringLiteral	Opcions de classe del procés de línia d'ordres de Xalan-J:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Opcions de classe del procés de línia d'ordres de Xalan-J:"	TokenNameStringLiteral	Opcions de classe del procés de línia d'ordres de Xalan-J:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xsltc_option"	TokenNameStringLiteral	xslProc_invalid_xsltc_option
,	TokenNameCOMMA	
"L''opció {0} no té suport en modalitat XSLTC."	TokenNameStringLiteral	L''opció {0} no té suport en modalitat XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xalan_option"	TokenNameStringLiteral	xslProc_invalid_xalan_option
,	TokenNameCOMMA	
"L''opció {0} només es pot fer servir amb -XSLTC."	TokenNameStringLiteral	L''opció {0} només es pot fer servir amb -XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_no_input"	TokenNameStringLiteral	xslProc_no_input
,	TokenNameCOMMA	
"Error: no s'ha especificat cap full d'estils o xml d'entrada. Per obtenir les instruccions d'ús, executeu aquesta ordre sense opcions."	TokenNameStringLiteral	Error: no s'ha especificat cap full d'estils o xml d'entrada. Per obtenir les instruccions d'ús, executeu aquesta ordre sense opcions.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_common_options"	TokenNameStringLiteral	xslProc_common_options
,	TokenNameCOMMA	
"-Opcions comuns-"	TokenNameStringLiteral	-Opcions comuns-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xalan_options"	TokenNameStringLiteral	xslProc_xalan_options
,	TokenNameCOMMA	
"-Opcions per a Xalan-"	TokenNameStringLiteral	-Opcions per a Xalan-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xsltc_options"	TokenNameStringLiteral	xslProc_xsltc_options
,	TokenNameCOMMA	
"-Opcions per a XSLTC-"	TokenNameStringLiteral	-Opcions per a XSLTC-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_return_to_continue"	TokenNameStringLiteral	xslProc_return_to_continue
,	TokenNameCOMMA	
"(premeu <retorn> per continuar)"	TokenNameStringLiteral	(premeu <retorn> per continuar)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The option name and the parameter name do not need to 	TokenNameCOMMENT_LINE	Note to translators: The option name and the parameter name do not need to 
// be translated. Only translate the messages in parentheses. Note also that 	TokenNameCOMMENT_LINE	be translated. Only translate the messages in parentheses. Note also that 
// leading whitespace in the messages is used to indent the usage information 	TokenNameCOMMENT_LINE	leading whitespace in the messages is used to indent the usage information 
// for each option in the English messages. 	TokenNameCOMMENT_LINE	for each option in the English messages. 
// Do not translate the keywords: XSLTC, SAX, DOM and DTM. 	TokenNameCOMMENT_LINE	Do not translate the keywords: XSLTC, SAX, DOM and DTM. 
{	TokenNameLBRACE	
"optionXSLTC"	TokenNameStringLiteral	optionXSLTC
,	TokenNameCOMMA	
" [-XSLTC (Utilitza XSLTC per a la transformació)]"	TokenNameStringLiteral	 [-XSLTC (Utilitza XSLTC per a la transformació)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
" [-IN URL_XML_entrada]"	TokenNameStringLiteral	 [-IN URL_XML_entrada]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXSL"	TokenNameStringLiteral	optionXSL
,	TokenNameCOMMA	
" [-XSL URL_transformació_XSL]"	TokenNameStringLiteral	 [-XSL URL_transformació_XSL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionOUT"	TokenNameStringLiteral	optionOUT
,	TokenNameCOMMA	
" [-OUT nom_fitxer_sortida]"	TokenNameStringLiteral	 [-OUT nom_fitxer_sortida]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCIN"	TokenNameStringLiteral	optionLXCIN
,	TokenNameCOMMA	
" [-LXCIN entrada_nom_fitxer_full_estil_compilat]"	TokenNameStringLiteral	 [-LXCIN entrada_nom_fitxer_full_estil_compilat]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCOUT"	TokenNameStringLiteral	optionLXCOUT
,	TokenNameCOMMA	
" [-LXCOUT sortida_nom_fitxer_full_estil_compilat]"	TokenNameStringLiteral	 [-LXCOUT sortida_nom_fitxer_full_estil_compilat]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARSER"	TokenNameStringLiteral	optionPARSER
,	TokenNameCOMMA	
" [-PARSER nom de classe completament qualificat de la relació de l'analitzador]"	TokenNameStringLiteral	 [-PARSER nom de classe completament qualificat de la relació de l'analitzador]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionE"	TokenNameStringLiteral	optionE
,	TokenNameCOMMA	
" [-E (No amplia les referències d'entitat)]"	TokenNameStringLiteral	 [-E (No amplia les referències d'entitat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionV"	TokenNameStringLiteral	optionV
,	TokenNameCOMMA	
" [-E (No amplia les referències d'entitat)]"	TokenNameStringLiteral	 [-E (No amplia les referències d'entitat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQC"	TokenNameStringLiteral	optionQC
,	TokenNameCOMMA	
" [-QC (Avisos de conflictes de patró reduït)]"	TokenNameStringLiteral	 [-QC (Avisos de conflictes de patró reduït)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQ"	TokenNameStringLiteral	optionQ
,	TokenNameCOMMA	
" [-Q (Modalitat reduïda)]"	TokenNameStringLiteral	 [-Q (Modalitat reduïda)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLF"	TokenNameStringLiteral	optionLF
,	TokenNameCOMMA	
" [-LF (Utilitza salts de línia només a la sortida {el valor per defecte és CR/LF})]"	TokenNameStringLiteral	 [-LF (Utilitza salts de línia només a la sortida {el valor per defecte és CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCR"	TokenNameStringLiteral	optionCR
,	TokenNameCOMMA	
" [-CR (Utilitza retorns de carro només a la sortida {el valor per defecte és CR/LF})]"	TokenNameStringLiteral	 [-CR (Utilitza retorns de carro només a la sortida {el valor per defecte és CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionESCAPE"	TokenNameStringLiteral	optionESCAPE
,	TokenNameCOMMA	
" [-ESCAPE (Caràcters per aplicar un escapament {el valor per defecte és <>&"'\r\n}]"	TokenNameStringLiteral	 [-ESCAPE (Caràcters per aplicar un escapament {el valor per defecte és <>&"'\r\n}]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINDENT"	TokenNameStringLiteral	optionINDENT
,	TokenNameCOMMA	
" [-INDENT (Controla quants espais tindrà el sagnat {el valor per defecte és 0})]"	TokenNameStringLiteral	 [-INDENT (Controla quants espais tindrà el sagnat {el valor per defecte és 0})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTT"	TokenNameStringLiteral	optionTT
,	TokenNameCOMMA	
" [-TT (Fa un rastreig de les plantilles a mesura que es criden.)]"	TokenNameStringLiteral	 [-TT (Fa un rastreig de les plantilles a mesura que es criden.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTG"	TokenNameStringLiteral	optionTG
,	TokenNameCOMMA	
" [-TG (Fa un rastreig de cada un dels esdeveniments de generació.)]"	TokenNameStringLiteral	 [-TG (Fa un rastreig de cada un dels esdeveniments de generació.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTS"	TokenNameStringLiteral	optionTS
,	TokenNameCOMMA	
" [-TS (Fa un rastreig de cada un dels esdeveniments de selecció.)]"	TokenNameStringLiteral	 [-TS (Fa un rastreig de cada un dels esdeveniments de selecció.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTTC"	TokenNameStringLiteral	optionTTC
,	TokenNameCOMMA	
" [-TTC (Fa un rastreig dels subordinats de plantilla a mesura que es processen.)]"	TokenNameStringLiteral	 [-TTC (Fa un rastreig dels subordinats de plantilla a mesura que es processen.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTCLASS"	TokenNameStringLiteral	optionTCLASS
,	TokenNameCOMMA	
" [-TCLASS (Classe TraceListener per a extensions de rastreig.)]"	TokenNameStringLiteral	 [-TCLASS (Classe TraceListener per a extensions de rastreig.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionVALIDATE"	TokenNameStringLiteral	optionVALIDATE
,	TokenNameCOMMA	
" [-VALIDATE (Estableix si es produeix la validació. Per defecte no està activada.)]"	TokenNameStringLiteral	 [-VALIDATE (Estableix si es produeix la validació. Per defecte no està activada.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionEDUMP"	TokenNameStringLiteral	optionEDUMP
,	TokenNameCOMMA	
" [-EDUMP {nom de fitxer opcional} (Fer el buidatge de la pila si es produeix un error.)]"	TokenNameStringLiteral	 [-EDUMP {nom de fitxer opcional} (Fer el buidatge de la pila si es produeix un error.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXML"	TokenNameStringLiteral	optionXML
,	TokenNameCOMMA	
" [-XML (Utilitza el formatador XML i afegeix la capçalera XML.)]"	TokenNameStringLiteral	 [-XML (Utilitza el formatador XML i afegeix la capçalera XML.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTEXT"	TokenNameStringLiteral	optionTEXT
,	TokenNameCOMMA	
" [-TEXT (Utilitza el formatador de text simple.)]"	TokenNameStringLiteral	 [-TEXT (Utilitza el formatador de text simple.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionHTML"	TokenNameStringLiteral	optionHTML
,	TokenNameCOMMA	
" [-HTML (Utilitza el formatador HTML.)]"	TokenNameStringLiteral	 [-HTML (Utilitza el formatador HTML.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARAM"	TokenNameStringLiteral	optionPARAM
,	TokenNameCOMMA	
" [-PARAM expressió del nom (Estableix un paràmetre de full d'estils)]"	TokenNameStringLiteral	 [-PARAM expressió del nom (Estableix un paràmetre de full d'estils)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"El procés XSL no ha estat correcte."	TokenNameStringLiteral	El procés XSL no ha estat correcte.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** No s'ha trobat l'analitzador **"	TokenNameStringLiteral	** No s'ha trobat l'analitzador **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Comproveu la vostra classpath."	TokenNameStringLiteral	Comproveu la vostra classpath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Si no teniu XML Parser for Java d'IBM, el podeu baixar de l'indret web"	TokenNameStringLiteral	Si no teniu XML Parser for Java d'IBM, el podeu baixar de l'indret web
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"AlphaWorks d'IBM: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	AlphaWorks d'IBM: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionURIRESOLVER"	TokenNameStringLiteral	optionURIRESOLVER
,	TokenNameCOMMA	
" [-URIRESOLVER nom de classe complet (URIResolver que s'ha d'utilitzar per resoldre URI)]"	TokenNameStringLiteral	 [-URIRESOLVER nom de classe complet (URIResolver que s'ha d'utilitzar per resoldre URI)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionENTITYRESOLVER"	TokenNameStringLiteral	optionENTITYRESOLVER
,	TokenNameCOMMA	
" [-ENTITYRESOLVER nom de classe complet (EntityResolver que s'ha d'utilitzar per resoldre entitats)]"	TokenNameStringLiteral	 [-ENTITYRESOLVER nom de classe complet (EntityResolver que s'ha d'utilitzar per resoldre entitats)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCONTENTHANDLER"	TokenNameStringLiteral	optionCONTENTHANDLER
,	TokenNameCOMMA	
" [-CONTENTHANDLER nom de classe complet (ContentHandler que s'ha d'utilitzar per serialitzar la sortida)]"	TokenNameStringLiteral	 [-CONTENTHANDLER nom de classe complet (ContentHandler que s'ha d'utilitzar per serialitzar la sortida)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLINENUMBERS"	TokenNameStringLiteral	optionLINENUMBERS
,	TokenNameCOMMA	
" [-L utilitza els números de línia del document origen]"	TokenNameStringLiteral	 [-L utilitza els números de línia del document origen]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSECUREPROCESSING"	TokenNameStringLiteral	optionSECUREPROCESSING
,	TokenNameCOMMA	
" [-SECURE (estableix la característica de procés segur en true.)]"	TokenNameStringLiteral	 [-SECURE (estableix la característica de procés segur en true.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
"optionMEDIA"	TokenNameStringLiteral	optionMEDIA
,	TokenNameCOMMA	
" [-MEDIA mediaType (utilitza l'atribut media per trobar un full d'estils relacionat amb un document.)]"	TokenNameStringLiteral	 [-MEDIA mediaType (utilitza l'atribut media per trobar un full d'estils relacionat amb un document.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionFLAVOR"	TokenNameStringLiteral	optionFLAVOR
,	TokenNameCOMMA	
" [-FLAVOR nom_flavor (utilitza explícitament s2s=SAX o d2d=DOM per fer una transformació.)] "	TokenNameStringLiteral	 [-FLAVOR nom_flavor (utilitza explícitament s2s=SAX o d2d=DOM per fer una transformació.)] 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Added by sboag/scurcuru; experimental 	TokenNameCOMMENT_LINE	Added by sboag/scurcuru; experimental 
{	TokenNameLBRACE	
"optionDIAG"	TokenNameStringLiteral	optionDIAG
,	TokenNameCOMMA	
" [-DIAG (Imprimex els mil·lisegons en total que ha trigat la transformació.)]"	TokenNameStringLiteral	 [-DIAG (Imprimex els mil·lisegons en total que ha trigat la transformació.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINCREMENTAL"	TokenNameStringLiteral	optionINCREMENTAL
,	TokenNameCOMMA	
" [-INCREMENTAL (sol·licita la construcció de DTM incremental establint http://xml.apache.org/xalan/features/incremental en true.)]"	TokenNameStringLiteral	 [-INCREMENTAL (sol·licita la construcció de DTM incremental establint http://xml.apache.org/xalan/features/incremental en true.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionNOOPTIMIMIZE"	TokenNameStringLiteral	optionNOOPTIMIMIZE
,	TokenNameCOMMA	
" [-NOOPTIMIMIZE (sol·licita que no es processi l'optimització de full d'estils establint http://xml.apache.org/xalan/features/optimize en false.)]"	TokenNameStringLiteral	 [-NOOPTIMIMIZE (sol·licita que no es processi l'optimització de full d'estils establint http://xml.apache.org/xalan/features/optimize en false.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionRL"	TokenNameStringLiteral	optionRL
,	TokenNameCOMMA	
" [-RL recursionlimit (confirma el límit numèric de la profunditat de recursivitat del full d'estils.)]"	TokenNameStringLiteral	 [-RL recursionlimit (confirma el límit numèric de la profunditat de recursivitat del full d'estils.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXO"	TokenNameStringLiteral	optionXO
,	TokenNameCOMMA	
" [-XO [nom_translet] (assigna el nom al translet generat)]"	TokenNameStringLiteral	 [-XO [nom_translet] (assigna el nom al translet generat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXD"	TokenNameStringLiteral	optionXD
,	TokenNameCOMMA	
" [-XD directori_destinació (especifica un directori de destinació per al translet)]"	TokenNameStringLiteral	 [-XD directori_destinació (especifica un directori de destinació per al translet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXJ"	TokenNameStringLiteral	optionXJ
,	TokenNameCOMMA	
" [-XJ fitxer_jar (empaqueta les classes de translet en un fitxer jar amb el nom <fitxer_jar>)]"	TokenNameStringLiteral	 [-XJ fitxer_jar (empaqueta les classes de translet en un fitxer jar amb el nom <fitxer_jar>)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXP"	TokenNameStringLiteral	optionXP
,	TokenNameCOMMA	
" [-XP paquet (especifica un prefix de nom de paquet per a totes les classes de translet generades)]"	TokenNameStringLiteral	 [-XP paquet (especifica un prefix de nom de paquet per a totes les classes de translet generades)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//AddITIONAL STRINGS that need L10n 	TokenNameCOMMENT_LINE	AddITIONAL STRINGS that need L10n 
// Note to translators: The following message describes usage of a particular 	TokenNameCOMMENT_LINE	Note to translators: The following message describes usage of a particular 
// command-line option that is used to enable the "template inlining" 	TokenNameCOMMENT_LINE	command-line option that is used to enable the "template inlining" 
// optimization. The optimization involves making a copy of the code 	TokenNameCOMMENT_LINE	optimization. The optimization involves making a copy of the code 
// generated for a template in another template that refers to it. 	TokenNameCOMMENT_LINE	generated for a template in another template that refers to it. 
{	TokenNameLBRACE	
"optionXN"	TokenNameStringLiteral	optionXN
,	TokenNameCOMMA	
" [-XN (habilita l'inlining de plantilles)]"	TokenNameStringLiteral	 [-XN (habilita l'inlining de plantilles)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXX"	TokenNameStringLiteral	optionXX
,	TokenNameCOMMA	
" [-XX (activa la sortida de missatges de depuració addicionals)]"	TokenNameStringLiteral	 [-XX (activa la sortida de missatges de depuració addicionals)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXT"	TokenNameStringLiteral	optionXT
,	TokenNameCOMMA	
" [-XT (utilitza el translet per a la transformació si és possible)]"	TokenNameStringLiteral	 [-XT (utilitza el translet per a la transformació si és possible)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"diagTiming"	TokenNameStringLiteral	diagTiming
,	TokenNameCOMMA	
" --------- La transformació de {0} mitjançant {1} ha trigat {2} ms"	TokenNameStringLiteral	 --------- La transformació de {0} mitjançant {1} ha trigat {2} ms
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"recursionTooDeep"	TokenNameStringLiteral	recursionTooDeep
,	TokenNameCOMMA	
"La imbricació de plantilles té massa nivells. Imbricació = {0}, plantilla{1} {2}"	TokenNameStringLiteral	La imbricació de plantilles té massa nivells. Imbricació = {0}, plantilla{1} {2}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nameIs"	TokenNameStringLiteral	nameIs
,	TokenNameCOMMA	
"el nom és"	TokenNameStringLiteral	el nom és
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"matchPatternIs"	TokenNameStringLiteral	matchPatternIs
,	TokenNameCOMMA	
"el patró de coincidència és"	TokenNameStringLiteral	el patró de coincidència és
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================= INFRASTRUCTURE ====================== 	TokenNameCOMMENT_LINE	================= INFRASTRUCTURE ====================== 
/** String for use when a bad error code was encountered. */	TokenNameCOMMENT_JAVADOC	 String for use when a bad error code was encountered. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_CODE	TokenNameIdentifier	 BAD  CODE
=	TokenNameEQUAL	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
;	TokenNameSEMICOLON	
/** String for use when formatting of the error string failed. */	TokenNameCOMMENT_JAVADOC	 String for use when formatting of the error string failed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORMAT_FAILED	TokenNameIdentifier	 FORMAT  FAILED
=	TokenNameEQUAL	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
;	TokenNameSEMICOLON	
/** General error string. */	TokenNameCOMMENT_JAVADOC	 General error string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_STRING	TokenNameIdentifier	 ERROR  STRING
=	TokenNameEQUAL	
"#error"	TokenNameStringLiteral	#error
;	TokenNameSEMICOLON	
/** String to prepend to error messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to error messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HEADER	TokenNameIdentifier	 ERROR  HEADER
=	TokenNameEQUAL	
"Error: "	TokenNameStringLiteral	Error: 
;	TokenNameSEMICOLON	
/** String to prepend to warning messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to warning messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Avís: "	TokenNameStringLiteral	Avís: 
;	TokenNameSEMICOLON	
/** String to specify the XSLT module. */	TokenNameCOMMENT_JAVADOC	 String to specify the XSLT module. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSL_HEADER	TokenNameIdentifier	 XSL  HEADER
=	TokenNameEQUAL	
"XSLT "	TokenNameStringLiteral	XSLT 
;	TokenNameSEMICOLON	
/** String to specify the XML parser module. */	TokenNameCOMMENT_JAVADOC	 String to specify the XML parser module. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_HEADER	TokenNameIdentifier	 XML  HEADER
=	TokenNameEQUAL	
"XML "	TokenNameStringLiteral	XML 
;	TokenNameSEMICOLON	
/** I don't think this is used any more. * @deprecated */	TokenNameCOMMENT_JAVADOC	 I don't think this is used any more. @deprecated 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
QUERY_HEADER	TokenNameIdentifier	 QUERY  HEADER
=	TokenNameEQUAL	
"PATTERN "	TokenNameStringLiteral	PATTERN 
;	TokenNameSEMICOLON	
/** * Return a named ResourceBundle for a particular locale. This method mimics the behavior * of ResourceBundle.getBundle(). * * @param className the name of the class that implements the resource bundle. * @return the ResourceBundle * @throws MissingResourceException */	TokenNameCOMMENT_JAVADOC	 Return a named ResourceBundle for a particular locale. This method mimics the behavior of ResourceBundle.getBundle(). * @param className the name of the class that implements the resource bundle. @return the ResourceBundle @throws MissingResourceException 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
loadResourceBundle	TokenNameIdentifier	 load Resource Bundle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
getResourceSuffix	TokenNameIdentifier	 get Resource Suffix
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// first try with the given locale 	TokenNameCOMMENT_LINE	first try with the given locale 
return	TokenNamereturn	
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
)	TokenNameRPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
// try to fall back to en_US if we can't load 	TokenNameCOMMENT_LINE	try to fall back to en_US if we can't load 
{	TokenNameLBRACE	
// Since we can't find the localized property file, 	TokenNameCOMMENT_LINE	Since we can't find the localized property file, 
// fall back to en_US. 	TokenNameCOMMENT_LINE	fall back to en_US. 
return	TokenNamereturn	
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
)	TokenNameRPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"ca"	TokenNameStringLiteral	ca
,	TokenNameCOMMA	
"ES"	TokenNameStringLiteral	ES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now we are really in trouble. 	TokenNameCOMMENT_LINE	Now we are really in trouble. 
// very bad, definitely very bad...not going to get very far 	TokenNameCOMMENT_LINE	very bad, definitely very bad...not going to get very far 
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
"Could not load any resource bundles."	TokenNameStringLiteral	Could not load any resource bundles.
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the resource file suffic for the indicated locale * For most locales, this will be based the language code. However * for Chinese, we do distinguish between Taiwan and PRC * * @param locale the locale * @return an String suffix which canbe appended to a resource name */	TokenNameCOMMENT_JAVADOC	 Return the resource file suffic for the indicated locale For most locales, this will be based the language code. However for Chinese, we do distinguish between Taiwan and PRC * @param locale the locale @return an String suffix which canbe appended to a resource name 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getResourceSuffix	TokenNameIdentifier	 get Resource Suffix
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
.	TokenNameDOT	
getCountry	TokenNameIdentifier	 get Country
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
country	TokenNameIdentifier	 country
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"TW"	TokenNameStringLiteral	TW
)	TokenNameRPAREN	
)	TokenNameRPAREN	
suffix	TokenNameIdentifier	 suffix
+=	TokenNamePLUS_EQUAL	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
country	TokenNameIdentifier	 country
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
