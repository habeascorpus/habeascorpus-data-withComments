/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTErrorResources_es.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTErrorResources_es.java 468641 2006-10-28 06:54:42Z minchau $ 
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
XSLTErrorResources_es	TokenNameIdentifier	 XSLT Error Resources es
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
"Error: No puede haber '{' dentro de la expresi�n"	TokenNameStringLiteral	Error: No puede haber '{' dentro de la expresi�n
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} tiene un atributo no permitido: {1}"	TokenNameStringLiteral	{0} tiene un atributo no permitido: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
,	TokenNameCOMMA	
"sourceNode es nulo en xsl:apply-imports."	TokenNameStringLiteral	sourceNode es nulo en xsl:apply-imports.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
"No se puede a�adir {0} a {1}"	TokenNameStringLiteral	No se puede a�adir {0} a {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
,	TokenNameCOMMA	
"sourceNode es nulo en handleApplyTemplatesInstruction."	TokenNameStringLiteral	sourceNode es nulo en handleApplyTemplatesInstruction.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
,	TokenNameCOMMA	
"{0} debe tener un atributo de nombre."	TokenNameStringLiteral	{0} debe tener un atributo de nombre.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
"No se ha podido encontrar la plantilla: {0}"	TokenNameStringLiteral	No se ha podido encontrar la plantilla: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
,	TokenNameCOMMA	
"No se ha podido resolver AVT de nombre en xsl:call-template."	TokenNameStringLiteral	No se ha podido resolver AVT de nombre en xsl:call-template.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
"{0} necesita un atributo: {1}"	TokenNameStringLiteral	{0} necesita un atributo: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
,	TokenNameCOMMA	
"{0} debe tener un atributo ''test''."	TokenNameStringLiteral	{0} debe tener un atributo ''test''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
,	TokenNameCOMMA	
"Valor incorrecto en atributo de nivel: {0}"	TokenNameStringLiteral	Valor incorrecto en atributo de nivel: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"Nombre de processing-instruction no puede ser 'xml'"	TokenNameStringLiteral	Nombre de processing-instruction no puede ser 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"Nombre de processing-instruction debe ser un NCName v�lido: {0}"	TokenNameStringLiteral	Nombre de processing-instruction debe ser un NCName v�lido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} debe tener un atributo de coincidencia si tiene una modalidad."	TokenNameStringLiteral	{0} debe tener un atributo de coincidencia si tiene una modalidad.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} necesita un atributo de nombre o de coincidencia."	TokenNameStringLiteral	{0} necesita un atributo de nombre o de coincidencia.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
,	TokenNameCOMMA	
"No se puede resolver el prefijo del espacio de nombres: {0}"	TokenNameStringLiteral	No se puede resolver el prefijo del espacio de nombres: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space tiene un valor no permitido: {0}"	TokenNameStringLiteral	xml:space tiene un valor no permitido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
,	TokenNameCOMMA	
"El nodo hijo no tiene un documento propietario."	TokenNameStringLiteral	El nodo hijo no tiene un documento propietario.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
"Error de ElemTemplateElement: {0}"	TokenNameStringLiteral	Error de ElemTemplateElement: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
,	TokenNameCOMMA	
"Intentando a�adir un hijo nulo"	TokenNameStringLiteral	Intentando a�adir un hijo nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
,	TokenNameCOMMA	
"{0} necesita un atributo de selecci�n."	TokenNameStringLiteral	{0} necesita un atributo de selecci�n.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
,	TokenNameCOMMA	
"xsl:when debe tener un atributo 'test'."	TokenNameStringLiteral	xsl:when debe tener un atributo 'test'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:with-param debe tener un atributo 'name'."	TokenNameStringLiteral	xsl:with-param debe tener un atributo 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
,	TokenNameCOMMA	
"El contexto no tiene un documento propietario."	TokenNameStringLiteral	El contexto no tiene un documento propietario.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
,	TokenNameCOMMA	
"No se ha podido crear Liaison TransformerFactory XML: {0}"	TokenNameStringLiteral	No se ha podido crear Liaison TransformerFactory XML: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"El proceso Xalan no ha sido satisfactorio."	TokenNameStringLiteral	El proceso Xalan no ha sido satisfactorio.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan no ha sido satisfactorio."	TokenNameStringLiteral	Xalan no ha sido satisfactorio.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Codificaci�n no soportada: {0}"	TokenNameStringLiteral	Codificaci�n no soportada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
,	TokenNameCOMMA	
"No se ha podido crear TraceListener: {0}"	TokenNameStringLiteral	No se ha podido crear TraceListener: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:key necesita un atributo 'name'."	TokenNameStringLiteral	xsl:key necesita un atributo 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
,	TokenNameCOMMA	
"xsl:key necesita un atributo 'match'."	TokenNameStringLiteral	xsl:key necesita un atributo 'match'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
,	TokenNameCOMMA	
"xsl:key necesita un atributo 'use'."	TokenNameStringLiteral	xsl:key necesita un atributo 'use'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} necesita un atributo ''elements'' "	TokenNameStringLiteral	(StylesheetHandler) {0} necesita un atributo ''elements'' 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) Falta el atributo ''prefix'' de {0} "	TokenNameStringLiteral	(StylesheetHandler) Falta el atributo ''prefix'' de {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
,	TokenNameCOMMA	
"El URL de la hoja de estilos es incorrecto: {0}"	TokenNameStringLiteral	El URL de la hoja de estilos es incorrecto: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
,	TokenNameCOMMA	
"No se ha encontrado el archivo de hoja de estilos: {0}"	TokenNameStringLiteral	No se ha encontrado el archivo de hoja de estilos: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
,	TokenNameCOMMA	
"Se ha producido una excepci�n de ES con el archivo de hoja de estilos: {0}"	TokenNameStringLiteral	Se ha producido una excepci�n de ES con el archivo de hoja de estilos: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) No se ha podido encontrar el atributo href para {0}"	TokenNameStringLiteral	(StylesheetHandler) No se ha podido encontrar el atributo href para {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) Inclusi�n propia de {0} directa o indirectamente."	TokenNameStringLiteral	(StylesheetHandler) Inclusi�n propia de {0} directa o indirectamente.
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
"(StylesheetHandler) Falta el atributo ''lang'' de {0}"	TokenNameStringLiteral	(StylesheetHandler) Falta el atributo ''lang'' de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
,	TokenNameCOMMA	
"(StylesheetHandler) Elemento {0} incorrecto. Falta el elemento de contenedor ''component''."	TokenNameStringLiteral	(StylesheetHandler) Elemento {0} incorrecto. Falta el elemento de contenedor ''component''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
,	TokenNameCOMMA	
"S�lo se puede dar salida hacia Element, DocumentFragment, Document o PrintWriter."	TokenNameStringLiteral	S�lo se puede dar salida hacia Element, DocumentFragment, Document o PrintWriter.
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
"Error de UnImplNode: {0}"	TokenNameStringLiteral	Error de UnImplNode: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
,	TokenNameCOMMA	
"Error. No se ha encontrado la expresi�n de selecci�n (-select) de xpath."	TokenNameStringLiteral	Error. No se ha encontrado la expresi�n de selecci�n (-select) de xpath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
,	TokenNameCOMMA	
"No se puede serializar un XSLProcessor."	TokenNameStringLiteral	No se puede serializar un XSLProcessor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
,	TokenNameCOMMA	
"No se ha especificado la entrada de hoja de estilos."	TokenNameStringLiteral	No se ha especificado la entrada de hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
,	TokenNameCOMMA	
"No se ha podido procesar la hoja de estilos."	TokenNameStringLiteral	No se ha podido procesar la hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
,	TokenNameCOMMA	
"No se ha podido analizar el documento {0}."	TokenNameStringLiteral	No se ha podido analizar el documento {0}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
,	TokenNameCOMMA	
"No se ha podido encontrar el fragmento: {0}"	TokenNameStringLiteral	No se ha podido encontrar el fragmento: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
,	TokenNameCOMMA	
"El nodo se�alado por un identificador de fragmento no es un elemento: {0}"	TokenNameStringLiteral	El nodo se�alado por un identificador de fragmento no es un elemento: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"for-each debe tener un atributo de coincidencia o de nombre."	TokenNameStringLiteral	for-each debe tener un atributo de coincidencia o de nombre.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"templates debe tener un atributo de coincidencia o de nombre."	TokenNameStringLiteral	templates debe tener un atributo de coincidencia o de nombre.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
,	TokenNameCOMMA	
"No es r�plica de un fragmento de documento."	TokenNameStringLiteral	No es r�plica de un fragmento de documento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
,	TokenNameCOMMA	
"No se puede crear el elemento en el �rbol de resultados: {0}"	TokenNameStringLiteral	No se puede crear el elemento en el �rbol de resultados: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space en el XML fuente tiene un valor no permitido: {0}"	TokenNameStringLiteral	xml:space en el XML fuente tiene un valor no permitido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
"No hay declaraci�n xsl:key para {0}."	TokenNameStringLiteral	No hay declaraci�n xsl:key para {0}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
,	TokenNameCOMMA	
"Error. No se puede crear url para: {0}"	TokenNameStringLiteral	Error. No se puede crear url para: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
,	TokenNameCOMMA	
"xsl:functions no est� soportado"	TokenNameStringLiteral	xsl:functions no est� soportado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
,	TokenNameCOMMA	
"Error de XSLT TransformerFactory"	TokenNameStringLiteral	Error de XSLT TransformerFactory
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
,	TokenNameCOMMA	
"(StylesheetHandler) {0} no permitido dentro de una hoja de estilos."	TokenNameStringLiteral	(StylesheetHandler) {0} no permitido dentro de una hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
,	TokenNameCOMMA	
"Ya no se soporta result-ns. Utilice xsl:output en su lugar."	TokenNameStringLiteral	Ya no se soporta result-ns. Utilice xsl:output en su lugar.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Ya no se soporta default-space. Utilice xsl:strip-space o xsl:preserve-space en su lugar."	TokenNameStringLiteral	Ya no se soporta default-space. Utilice xsl:strip-space o xsl:preserve-space en su lugar.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
,	TokenNameCOMMA	
"Ya no se soporta indent-result. Utilice xsl:output en su lugar."	TokenNameStringLiteral	Ya no se soporta indent-result. Utilice xsl:output en su lugar.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} tiene un atributo no permitido: {1}"	TokenNameStringLiteral	(StylesheetHandler) {0} tiene un atributo no permitido: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
,	TokenNameCOMMA	
"Elemento XSL desconocido: {0}"	TokenNameStringLiteral	Elemento XSL desconocido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:sort s�lo puede utilizarse con xsl:apply-templates o xsl:for-each."	TokenNameStringLiteral	(StylesheetHandler) xsl:sort s�lo puede utilizarse con xsl:apply-templates o xsl:for-each.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when equivocado."	TokenNameStringLiteral	(StylesheetHandler) xsl:when equivocado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when no emparentado por xsl:choose."	TokenNameStringLiteral	(StylesheetHandler) xsl:when no emparentado por xsl:choose.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise equivocado."	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise equivocado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise no emparentado por xsl:choose."	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise no emparentado por xsl:choose.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
,	TokenNameCOMMA	
"(StylesheetHandler) {0} no permitido dentro de una plantilla."	TokenNameStringLiteral	(StylesheetHandler) {0} no permitido dentro de una plantilla.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
,	TokenNameCOMMA	
"(StylesheetHandler) Prefijo {1} de espacio de nombres de extensi�n {0} desconocido"	TokenNameStringLiteral	(StylesheetHandler) Prefijo {1} de espacio de nombres de extensi�n {0} desconocido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
,	TokenNameCOMMA	
"(StylesheetHandler) Las importaciones s�lo pueden aparecer como primeros elementos de la hoja de estilos."	TokenNameStringLiteral	(StylesheetHandler) Las importaciones s�lo pueden aparecer como primeros elementos de la hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) Importaci�n propia de {0} directa o indirectamente."	TokenNameStringLiteral	(StylesheetHandler) Importaci�n propia de {0} directa o indirectamente.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
,	TokenNameCOMMA	
"(StylesheetHandler) xml:space tiene un valor no permitido: {0}"	TokenNameStringLiteral	(StylesheetHandler) xml:space tiene un valor no permitido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"processStylesheet no satisfactorio."	TokenNameStringLiteral	processStylesheet no satisfactorio.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
,	TokenNameCOMMA	
"Excepci�n SAX"	TokenNameStringLiteral	Excepci�n SAX
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// add this message to fix bug 21478 	TokenNameCOMMENT_LINE	add this message to fix bug 21478 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Funci�n no soportada."	TokenNameStringLiteral	Funci�n no soportada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
,	TokenNameCOMMA	
"Error de XSLT"	TokenNameStringLiteral	Error de XSLT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
,	TokenNameCOMMA	
"El signo monetario no est� permitido en la serie del patr�n de formato"	TokenNameStringLiteral	El signo monetario no est� permitido en la serie del patr�n de formato
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
,	TokenNameCOMMA	
"La funci�n de documento no est� soportada en DOM de hoja de estilos."	TokenNameStringLiteral	La funci�n de documento no est� soportada en DOM de hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
,	TokenNameCOMMA	
"No se puede resolver el prefijo de un resolucionador sin prefijo."	TokenNameStringLiteral	No se puede resolver el prefijo de un resolucionador sin prefijo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
,	TokenNameCOMMA	
"Extensi�n Redirect: No se ha podido obtener el nombre de archivo - el atributo de archivo o de selecci�n debe devolver una serie v�lida."	TokenNameStringLiteral	Extensi�n Redirect: No se ha podido obtener el nombre de archivo - el atributo de archivo o de selecci�n debe devolver una serie v�lida.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
,	TokenNameCOMMA	
"No se puede crear FormatterListener en extensi�n Redirect."	TokenNameStringLiteral	No se puede crear FormatterListener en extensi�n Redirect.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
,	TokenNameCOMMA	
"El prefijo en exclude-result-prefixes no es v�lido: {0}"	TokenNameStringLiteral	El prefijo en exclude-result-prefixes no es v�lido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
,	TokenNameCOMMA	
"Falta el URI del espacio de nombres para el prefijo especificado"	TokenNameStringLiteral	Falta el URI del espacio de nombres para el prefijo especificado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
,	TokenNameCOMMA	
"Falta un argumento para la opci�n: {0}"	TokenNameStringLiteral	Falta un argumento para la opci�n: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
,	TokenNameCOMMA	
"Opci�n no v�lida: {0}"	TokenNameStringLiteral	Opci�n no v�lida: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
"Serie de formato mal formada: {0}"	TokenNameStringLiteral	Serie de formato mal formada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet necesita un atributo 'version'."	TokenNameStringLiteral	xsl:stylesheet necesita un atributo 'version'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Atributo: {0} tiene un valor no permitido: {1}"	TokenNameStringLiteral	Atributo: {0} tiene un valor no permitido: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
,	TokenNameCOMMA	
"xsl:choose necesita un xsl:when"	TokenNameStringLiteral	xsl:choose necesita un xsl:when
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
,	TokenNameCOMMA	
"xsl:apply-imports no permitido en xsl:for-each"	TokenNameStringLiteral	xsl:apply-imports no permitido en xsl:for-each
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
,	TokenNameCOMMA	
"No se puede utilizar DTMLiaison para un nodo DOM de salida... Pase org.apache.xpath.DOM2Helper en su lugar."	TokenNameStringLiteral	No se puede utilizar DTMLiaison para un nodo DOM de salida... Pase org.apache.xpath.DOM2Helper en su lugar.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
,	TokenNameCOMMA	
"No se puede utilizar DTMLiaison para un nodo DOM de entrada... Pase org.apache.xpath.DOM2Helper en su lugar."	TokenNameStringLiteral	No se puede utilizar DTMLiaison para un nodo DOM de entrada... Pase org.apache.xpath.DOM2Helper en su lugar.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
,	TokenNameCOMMA	
"Anomal�a al llamar al elemento de extensi�n: {0}"	TokenNameStringLiteral	Anomal�a al llamar al elemento de extensi�n: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"El prefijo debe resolverse como un espacio de nombres: {0}"	TokenNameStringLiteral	El prefijo debe resolverse como un espacio de nombres: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"�Se ha detectado un sustituto UTF-16 no v�lido: {0}?"	TokenNameStringLiteral	�Se ha detectado un sustituto UTF-16 no v�lido: {0}?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
,	TokenNameCOMMA	
"xsl:attribute-set {0} se ha utilizado a s� mismo lo que puede provocar un bucle infinito."	TokenNameStringLiteral	xsl:attribute-set {0} se ha utilizado a s� mismo lo que puede provocar un bucle infinito.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
,	TokenNameCOMMA	
"No se puede mezclar la entrada Xerces-DOM con la salida Xerces-DOM."	TokenNameStringLiteral	No se puede mezclar la entrada Xerces-DOM con la salida Xerces-DOM.
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
"Se ha encontrado m�s de una plantilla con el nombre: {0}"	TokenNameStringLiteral	Se ha encontrado m�s de una plantilla con el nombre: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
,	TokenNameCOMMA	
"Llamada de funci�n no v�lida: no est�n permitidas las llamadas key() recursivas"	TokenNameStringLiteral	Llamada de funci�n no v�lida: no est�n permitidas las llamadas key() recursivas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
"La variable {0} se est� referenciando a s� misma directa o indirectamente."	TokenNameStringLiteral	La variable {0} se est� referenciando a s� misma directa o indirectamente.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
"El nodo de entrada no puede ser nulo para DOMSource de newTemplates."	TokenNameStringLiteral	El nodo de entrada no puede ser nulo para DOMSource de newTemplates.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
,	TokenNameCOMMA	
"No se ha encontrado el archivo de clase para la opci�n {0}"	TokenNameStringLiteral	No se ha encontrado el archivo de clase para la opci�n {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
"No se ha encontrado un elemento necesario: {0}"	TokenNameStringLiteral	No se ha encontrado un elemento necesario: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputStream no puede ser nulo"	TokenNameStringLiteral	InputStream no puede ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
,	TokenNameCOMMA	
"URI no puede ser nulo"	TokenNameStringLiteral	URI no puede ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Archivo no puede ser nulo"	TokenNameStringLiteral	Archivo no puede ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputSource no puede ser nulo"	TokenNameStringLiteral	InputSource no puede ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
"No se ha podido inicializar el Gestor BSF"	TokenNameStringLiteral	No se ha podido inicializar el Gestor BSF
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
"No se ha podido compilar la extensi�n"	TokenNameStringLiteral	No se ha podido compilar la extensi�n
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
"No se ha podido crear la extensi�n: {0} como consecuencia de: {1}"	TokenNameStringLiteral	No se ha podido crear la extensi�n: {0} como consecuencia de: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
,	TokenNameCOMMA	
"La llamada del m�todo de instancia al m�todo {0} necesita una instancia Object como primer argumento"	TokenNameStringLiteral	La llamada del m�todo de instancia al m�todo {0} necesita una instancia Object como primer argumento
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
,	TokenNameCOMMA	
"Se ha especificado un nombre de elemento no v�lido {0}"	TokenNameStringLiteral	Se ha especificado un nombre de elemento no v�lido {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
,	TokenNameCOMMA	
"El m�todo del nombre de elemento debe ser est�tico {0}"	TokenNameStringLiteral	El m�todo del nombre de elemento debe ser est�tico {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
"Funci�n de extensi�n {0} : {1} desconocida"	TokenNameStringLiteral	Funci�n de extensi�n {0} : {1} desconocida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
,	TokenNameCOMMA	
"Hay m�s de una coincidencia m�xima para el constructor de {0}"	TokenNameStringLiteral	Hay m�s de una coincidencia m�xima para el constructor de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
,	TokenNameCOMMA	
"Hay m�s de una coincidencia m�xima para el m�todo {0}"	TokenNameStringLiteral	Hay m�s de una coincidencia m�xima para el m�todo {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
"Hay m�s de una coincidencia m�xima para el m�todo de elemento {0}"	TokenNameStringLiteral	Hay m�s de una coincidencia m�xima para el m�todo de elemento {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
,	TokenNameCOMMA	
"Se ha pasado un contexto no v�lido para evaluar {0}"	TokenNameStringLiteral	Se ha pasado un contexto no v�lido para evaluar {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
"La agrupaci�n ya existe"	TokenNameStringLiteral	La agrupaci�n ya existe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
,	TokenNameCOMMA	
"No se ha especificado un nombre de controlador"	TokenNameStringLiteral	No se ha especificado un nombre de controlador
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
,	TokenNameCOMMA	
"No se ha especificado un URL"	TokenNameStringLiteral	No se ha especificado un URL
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
,	TokenNameCOMMA	
"El tama�o de la agrupaci�n es menor que uno."	TokenNameStringLiteral	El tama�o de la agrupaci�n es menor que uno.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
,	TokenNameCOMMA	
"Se ha especificado un nombre de controlador no v�lido."	TokenNameStringLiteral	Se ha especificado un nombre de controlador no v�lido.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
"No se ha encontrado la ra�z de la hoja de estilos."	TokenNameStringLiteral	No se ha encontrado la ra�z de la hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
"Valor no permitido para xml:space"	TokenNameStringLiteral	Valor no permitido para xml:space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
"Anomal�a de processFromNode"	TokenNameStringLiteral	Anomal�a de processFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"No se ha podido cargar el recurso [ {0} ]: {1} {2} {3}"	TokenNameStringLiteral	No se ha podido cargar el recurso [ {0} ]: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Tama�o de almacenamiento intermedio <=0"	TokenNameStringLiteral	Tama�o de almacenamiento intermedio <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
,	TokenNameCOMMA	
"Error desconocido al llamar a la extensi�n"	TokenNameStringLiteral	Error desconocido al llamar a la extensi�n
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
"El prefijo {0} no tiene una declaraci�n de espacio de nombres correspondiente"	TokenNameStringLiteral	El prefijo {0} no tiene una declaraci�n de espacio de nombres correspondiente
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
"No se permite el contenido del elemento para lang=javaclass {0}"	TokenNameStringLiteral	No se permite el contenido del elemento para lang=javaclass {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
"Terminaci�n de hoja de estilos dirigida"	TokenNameStringLiteral	Terminaci�n de hoja de estilos dirigida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
,	TokenNameCOMMA	
"1 � 2"	TokenNameStringLiteral	1 � 2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 � 3"	TokenNameStringLiteral	2 � 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"No se ha podido cargar {0} (compruebe la CLASSPATH), ahora s�lo se est�n utilizando los valores predeterminados"	TokenNameStringLiteral	No se ha podido cargar {0} (compruebe la CLASSPATH), ahora s�lo se est�n utilizando los valores predeterminados
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
,	TokenNameCOMMA	
"No se han podido inicializar las plantillas predeterminadas"	TokenNameStringLiteral	No se han podido inicializar las plantillas predeterminadas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"El resultado no deber�a ser nulo"	TokenNameStringLiteral	El resultado no deber�a ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
"No se ha podido establecer el resultado"	TokenNameStringLiteral	No se ha podido establecer el resultado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"No se ha especificado salida"	TokenNameStringLiteral	No se ha especificado salida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
"No se puede transformar un resultado de tipo {0} "	TokenNameStringLiteral	No se puede transformar un resultado de tipo {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
"No se puede transformar un fuente de tipo {0} "	TokenNameStringLiteral	No se puede transformar un fuente de tipo {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
"Manejador de contenido nulo"	TokenNameStringLiteral	Manejador de contenido nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Manejador de error nulo"	TokenNameStringLiteral	Manejador de error nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
,	TokenNameCOMMA	
"No se puede llamar a parse si no se ha establecido ContentHandler"	TokenNameStringLiteral	No se puede llamar a parse si no se ha establecido ContentHandler
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
,	TokenNameCOMMA	
"No hay padre para el filtro"	TokenNameStringLiteral	No hay padre para el filtro
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
,	TokenNameCOMMA	
"No se han encontrado hojas de estilos en: {0}, soporte= {1}"	TokenNameStringLiteral	No se han encontrado hojas de estilos en: {0}, soporte= {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
,	TokenNameCOMMA	
"No se ha encontrado xml-stylesheet PI en: {0}"	TokenNameStringLiteral	No se ha encontrado xml-stylesheet PI en: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"No soportado: {0}"	TokenNameStringLiteral	No soportado: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
,	TokenNameCOMMA	
"El valor de la propiedad {0} deber�a ser una instancia Boolean"	TokenNameStringLiteral	El valor de la propiedad {0} deber�a ser una instancia Boolean
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
"No se ha podido encontrar el script externo en {0}"	TokenNameStringLiteral	No se ha podido encontrar el script externo en {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"No se ha podido encontrar el recurso [ {0} ]. {1}"	TokenNameStringLiteral	No se ha podido encontrar el recurso [ {0} ]. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
"No se reconoce la propiedad de salida: {0}"	TokenNameStringLiteral	No se reconoce la propiedad de salida: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
,	TokenNameCOMMA	
"Anomal�a al crear la instancia ElemLiteralResult"	TokenNameStringLiteral	Anomal�a al crear la instancia ElemLiteralResult
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 	TokenNameCOMMENT_LINE	Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 
// In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 	TokenNameCOMMENT_LINE	In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 
//in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 	TokenNameCOMMENT_LINE	in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 
//NOTE: Not only the key name but message has also been changed. 	TokenNameCOMMENT_LINE	NOTE: Not only the key name but message has also been changed. 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
,	TokenNameCOMMA	
"El valor para {0} deber�a contener un n�mero analizable"	TokenNameStringLiteral	El valor para {0} deber�a contener un n�mero analizable
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
,	TokenNameCOMMA	
"El valor de {0} deber�a ser s� o no"	TokenNameStringLiteral	El valor de {0} deber�a ser s� o no
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
,	TokenNameCOMMA	
"Anomal�a al llamar al m�todo {0}"	TokenNameStringLiteral	Anomal�a al llamar al m�todo {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
,	TokenNameCOMMA	
"Anomal�a al crear la instancia ElemTemplateElement"	TokenNameStringLiteral	Anomal�a al crear la instancia ElemTemplateElement
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
"No se permiten caracteres en este punto del documento"	TokenNameStringLiteral	No se permiten caracteres en este punto del documento
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
"El atributo "{0}" no est� permitido en el elemento {1}."	TokenNameStringLiteral	El atributo "{0}" no est� permitido en el elemento {1}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
"{0} valor incorrecto {1} "	TokenNameStringLiteral	{0} valor incorrecto {1} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
,	TokenNameCOMMA	
"No se ha encontrado el valor del atributo {0} "	TokenNameStringLiteral	No se ha encontrado el valor del atributo {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
,	TokenNameCOMMA	
"No se ha reconocido el valor del atributo {0} "	TokenNameStringLiteral	No se ha reconocido el valor del atributo {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
,	TokenNameCOMMA	
"Se ha intentado generar un prefijo de espacio de nombres con un URI nulo"	TokenNameStringLiteral	Se ha intentado generar un prefijo de espacio de nombres con un URI nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
,	TokenNameCOMMA	
"Se ha intentado formatear un n�mero mayor que el entero largo m�s grande"	TokenNameStringLiteral	Se ha intentado formatear un n�mero mayor que el entero largo m�s grande
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
,	TokenNameCOMMA	
"No se ha podido encontrar la clase de controlador SAX1 {0}"	TokenNameStringLiteral	No se ha podido encontrar la clase de controlador SAX1 {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
,	TokenNameCOMMA	
"Se ha encontrado la clase de controlador SAX1 {0} pero no se ha podido cargar"	TokenNameStringLiteral	Se ha encontrado la clase de controlador SAX1 {0} pero no se ha podido cargar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
,	TokenNameCOMMA	
"Se ha cargado la clase de controlador SAX1 {0} pero no se ha podido crear una instancia"	TokenNameStringLiteral	Se ha cargado la clase de controlador SAX1 {0} pero no se ha podido crear una instancia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
,	TokenNameCOMMA	
"La clase de controlador SAX1 {0} no implementa org.xml.sax.Parser"	TokenNameStringLiteral	La clase de controlador SAX1 {0} no implementa org.xml.sax.Parser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
,	TokenNameCOMMA	
"No se ha especificado la propiedad del sistema org.xml.sax.parser"	TokenNameStringLiteral	No se ha especificado la propiedad del sistema org.xml.sax.parser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"El argumento del analizador no debe ser nulo"	TokenNameStringLiteral	El argumento del analizador no debe ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
,	TokenNameCOMMA	
"Caracter�stica: {0}"	TokenNameStringLiteral	Caracter�stica: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
,	TokenNameCOMMA	
"Propiedad: {0}"	TokenNameStringLiteral	Propiedad: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
,	TokenNameCOMMA	
"Resolucionador de entidad nulo"	TokenNameStringLiteral	Resolucionador de entidad nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
,	TokenNameCOMMA	
"Manejador DTD nulo"	TokenNameStringLiteral	Manejador DTD nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
"No se ha especificado un nombre de controlador."	TokenNameStringLiteral	No se ha especificado un nombre de controlador.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
"No se ha especificado un URL."	TokenNameStringLiteral	No se ha especificado un URL.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
"El tama�o de la agrupaci�n es menor que 1."	TokenNameStringLiteral	El tama�o de la agrupaci�n es menor que 1.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
"Se ha especificado un nombre de controlador no v�lido."	TokenNameStringLiteral	Se ha especificado un nombre de controlador no v�lido.
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
"Error del programador. La expresi�n no tiene un padre ElemTemplateElement."	TokenNameStringLiteral	Error del programador. La expresi�n no tiene un padre ElemTemplateElement.
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
"Aserci�n del programador en RedundentExprEliminator: {0} "	TokenNameStringLiteral	Aserci�n del programador en RedundentExprEliminator: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"{0} no est� permitido en esta posici�n de la hoja de estilos."	TokenNameStringLiteral	{0} no est� permitido en esta posici�n de la hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"No est� permitido texto sin espacios en blanco en esta posici�n de la hoja de estilos."	TokenNameStringLiteral	No est� permitido texto sin espacios en blanco en esta posici�n de la hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// This code is shared with warning codes. 	TokenNameCOMMENT_LINE	This code is shared with warning codes. 
// SystemId Unknown 	TokenNameCOMMENT_LINE	SystemId Unknown 
{	TokenNameLBRACE	
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
,	TokenNameCOMMA	
"Valor no permitido: se ha utilizado {1} para el atributo CHAR: {0}. Un atributo de tipo CHAR debe ser de un solo car�cter."	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo CHAR: {0}. Un atributo de tipo CHAR debe ser de un solo car�cter.
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
"Valor no permitido: se ha utilizado {1} para el atributo QNAME: {0}"	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo QNAME: {0}
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
"Valor no permitido: se ha utilizado {1} para el atributo ENUM: {0}. Los valores v�lidos son: {2}."	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo ENUM: {0}. Los valores v�lidos son: {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
,	TokenNameCOMMA	
"Valor no permitido: se ha utilizado {1} para el atributo NMTOKEN: {0} "	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo NMTOKEN: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
,	TokenNameCOMMA	
"Valor no permitido: se ha utilizado {1} para el atributo NCNAME: {0} "	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo NCNAME: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
,	TokenNameCOMMA	
"Valor no permitido: se ha utilizado {1} para el atributo boolean: {0} "	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo boolean: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "number" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "number" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
,	TokenNameCOMMA	
"Valor no permitido: se ha utilizado {1} para el atributo number: {0} "	TokenNameStringLiteral	Valor no permitido: se ha utilizado {1} para el atributo number: {0} 
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
"El argumento para {0} en el patr�n de coincidencia debe ser un literal."	TokenNameStringLiteral	El argumento para {0} en el patr�n de coincidencia debe ser un literal.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable. A "global variable" is a variable that is accessible everywher 	TokenNameCOMMENT_LINE	a variable. A "global variable" is a variable that is accessible everywher 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
// ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
,	TokenNameCOMMA	
"Declaraci�n de variable global duplicada."	TokenNameStringLiteral	Declaraci�n de variable global duplicada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable were encountered. 	TokenNameCOMMENT_LINE	a variable were encountered. 
// ER_DUPLICATE_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
,	TokenNameCOMMA	
"Declaraci�n de variable duplicada."	TokenNameStringLiteral	Declaraci�n de variable duplicada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "xsl:template, "name" and "match" are XSLT keywords 	TokenNameCOMMENT_LINE	Note to translators: "xsl:template, "name" and "match" are XSLT keywords 
// which must not be translated. 	TokenNameCOMMENT_LINE	which must not be translated. 
// ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 	TokenNameCOMMENT_LINE	ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 
{	TokenNameLBRACE	
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
,	TokenNameCOMMA	
"xsl:template debe tener un atributo name o match (o ambos)."	TokenNameStringLiteral	xsl:template debe tener un atributo name o match (o ambos).
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
"El prefijo en exclude-result-prefixes no es v�lido: {0}"	TokenNameStringLiteral	El prefijo en exclude-result-prefixes no es v�lido: {0}
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
"attribute-set de nombre {0} no existe"	TokenNameStringLiteral	attribute-set de nombre {0} no existe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that there was a reference 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that there was a reference 
// to a function named {0} for which no function definition could be found. 	TokenNameCOMMENT_LINE	to a function named {0} for which no function definition could be found. 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
,	TokenNameCOMMA	
"La funci�n de nombre {0} no existe"	TokenNameStringLiteral	La funci�n de nombre {0} no existe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the XSLT instruction 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the XSLT instruction 
// that is named by the substitution text {0} must not contain other XSLT 	TokenNameCOMMENT_LINE	that is named by the substitution text {0} must not contain other XSLT 
// instructions (content) or a "select" attribute. The word "select" is 	TokenNameCOMMENT_LINE	instructions (content) or a "select" attribute. The word "select" is 
// an XSLT keyword in this case and must not be translated. 	TokenNameCOMMENT_LINE	an XSLT keyword in this case and must not be translated. 
{	TokenNameLBRACE	
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
,	TokenNameCOMMA	
"El elemento {0} no debe tener contenido y un atributo select."	TokenNameStringLiteral	El elemento {0} no debe tener contenido y un atributo select.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the value argument 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the value argument 
// of setParameter must be a valid Java Object. 	TokenNameCOMMENT_LINE	of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"El valor del par�metro {0} debe ser un objeto Java v�lido"	TokenNameStringLiteral	El valor del par�metro {0} debe ser un objeto Java v�lido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
,	TokenNameCOMMA	
"El atributo result-prefix de un elemento xsl:namespace-alias tiene el valor '#default', pero no hay declaraci�n de espacio de nombres predeterminado en el �mbito del elemento."	TokenNameStringLiteral	El atributo result-prefix de un elemento xsl:namespace-alias tiene el valor '#default', pero no hay declaraci�n de espacio de nombres predeterminado en el �mbito del elemento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
,	TokenNameCOMMA	
"El atributo result-prefix de un elemento xsl:namespace-alias tiene el valor ''{0}'', pero no hay declaraci�n de espacio de nombres para el prefijo ''{0}'' en el �mbito del elemento."	TokenNameStringLiteral	El atributo result-prefix de un elemento xsl:namespace-alias tiene el valor ''{0}'', pero no hay declaraci�n de espacio de nombres para el prefijo ''{0}'' en el �mbito del elemento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"El nombre de caracter�stica no puede ser nulo en TransformerFactory.setFeature(nombre de tipo String, valor booleano)."	TokenNameStringLiteral	El nombre de caracter�stica no puede ser nulo en TransformerFactory.setFeature(nombre de tipo String, valor booleano).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"El nombre de caracter�stica no puede ser nulo en TransformerFactory.getFeature(nombre de tipo String)."	TokenNameStringLiteral	El nombre de caracter�stica no puede ser nulo en TransformerFactory.getFeature(nombre de tipo String).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"No se puede establecer la caracter�stica ''{0}'' en esta TransformerFactory."	TokenNameStringLiteral	No se puede establecer la caracter�stica ''{0}'' en esta TransformerFactory.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING	TokenNameIdentifier	 ER  EXTENSION  ELEMENT  NOT  ALLOWED  IN  SECURE  PROCESSING
,	TokenNameCOMMA	
"No se permite el uso del elemento de extensi�n ''{0}'' cuando la caracter�stica de proceso seguro est� establecida en true."	TokenNameStringLiteral	No se permite el uso del elemento de extensi�n ''{0}'' cuando la caracter�stica de proceso seguro est� establecida en true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
,	TokenNameCOMMA	
"No se puede obtener el prefijo de un uri de espacio de nombres nulo."	TokenNameStringLiteral	No se puede obtener el prefijo de un uri de espacio de nombres nulo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
,	TokenNameCOMMA	
"No se puede obtener el uri de espacio de nombres para un prefijo nulo."	TokenNameStringLiteral	No se puede obtener el uri de espacio de nombres para un prefijo nulo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
,	TokenNameCOMMA	
"El nombre de funci�n no puede ser nulo."	TokenNameStringLiteral	El nombre de funci�n no puede ser nulo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
,	TokenNameCOMMA	
"La aridad no puede ser negativa."	TokenNameStringLiteral	La aridad no puede ser negativa.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
"Se ha encontrado '}' pero no se ha abierto una plantilla de atributos."	TokenNameStringLiteral	Se ha encontrado '}' pero no se ha abierto una plantilla de atributos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
,	TokenNameCOMMA	
"Aviso: El atributo count no coincide con un antecesor en xsl:number. Destino = {0}"	TokenNameStringLiteral	Aviso: El atributo count no coincide con un antecesor en xsl:number. Destino = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
,	TokenNameCOMMA	
"Sintaxis antigua: El nombre del atributo 'expr' se ha cambiado por 'select'."	TokenNameStringLiteral	Sintaxis antigua: El nombre del atributo 'expr' se ha cambiado por 'select'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
,	TokenNameCOMMA	
"Xalan no maneja a�n el nombre de entorno local en la funci�n format-number."	TokenNameStringLiteral	Xalan no maneja a�n el nombre de entorno local en la funci�n format-number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
,	TokenNameCOMMA	
"Aviso: No se ha podido encontrar el entorno local para xml:lang={0}"	TokenNameStringLiteral	Aviso: No se ha podido encontrar el entorno local para xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"No se puede crear URL desde: {0}"	TokenNameStringLiteral	No se puede crear URL desde: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
,	TokenNameCOMMA	
"No se puede cargar el doc solicitado: {0}"	TokenNameStringLiteral	No se puede cargar el doc solicitado: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
"No se ha podido encontrar clasificador para <sort xml:lang={0}"	TokenNameStringLiteral	No se ha podido encontrar clasificador para <sort xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
,	TokenNameCOMMA	
"Sintaxis antigua: La instrucci�n functions deber�a utilizar un url de {0}"	TokenNameStringLiteral	Sintaxis antigua: La instrucci�n functions deber�a utilizar un url de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
,	TokenNameCOMMA	
"Codificaci�n no soportada: {0}, se utiliza UTF-8"	TokenNameStringLiteral	Codificaci�n no soportada: {0}, se utiliza UTF-8
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
,	TokenNameCOMMA	
"Codificaci�n no soportada: {0}, se utiliza Java {1}"	TokenNameStringLiteral	Codificaci�n no soportada: {0}, se utiliza Java {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
,	TokenNameCOMMA	
"Se han encontrado conflictos de especificaci�n: {0} Se utilizar� lo �ltimo encontrado en la hoja de estilos."	TokenNameStringLiteral	Se han encontrado conflictos de especificaci�n: {0} Se utilizar� lo �ltimo encontrado en la hoja de estilos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
,	TokenNameCOMMA	
"========= Analizando y preparando {0} =========="	TokenNameStringLiteral	========= Analizando y preparando {0} ==========
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
"Plantilla de atributos, {0}"	TokenNameStringLiteral	Plantilla de atributos, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
,	TokenNameCOMMA	
"Conflicto de coincidencia entre xsl:strip-space y xsl:preserve-space"	TokenNameStringLiteral	Conflicto de coincidencia entre xsl:strip-space y xsl:preserve-space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
,	TokenNameCOMMA	
"Xalan no maneja a�n el atributo {0}."	TokenNameStringLiteral	Xalan no maneja a�n el atributo {0}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
"No se ha encontrado declaraci�n para el formato decimal: {0}"	TokenNameStringLiteral	No se ha encontrado declaraci�n para el formato decimal: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
,	TokenNameCOMMA	
"Falta el espacio de nombres XSLT o es incorrecto. "	TokenNameStringLiteral	Falta el espacio de nombres XSLT o es incorrecto. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
,	TokenNameCOMMA	
"S�lo se permite una declaraci�n xsl:decimal-format predeterminada."	TokenNameStringLiteral	S�lo se permite una declaraci�n xsl:decimal-format predeterminada.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
,	TokenNameCOMMA	
"Los nombres de xsl:decimal-format deben ser �nicos. El nombre "{0}" se ha duplicado."	TokenNameStringLiteral	Los nombres de xsl:decimal-format deben ser �nicos. El nombre "{0}" se ha duplicado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} tiene un atributo no permitido: {1}"	TokenNameStringLiteral	{0} tiene un atributo no permitido: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
"No se ha podido resolver el prefijo del espacio de nombres: {0}. Se ignorar� el nodo."	TokenNameStringLiteral	No se ha podido resolver el prefijo del espacio de nombres: {0}. Se ignorar� el nodo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet necesita un atributo 'version'."	TokenNameStringLiteral	xsl:stylesheet necesita un atributo 'version'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
,	TokenNameCOMMA	
"Nombre de atributo no permitido: {0}"	TokenNameStringLiteral	Nombre de atributo no permitido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Se ha utilizado un valor no permitido para el atributo {0}: {1}"	TokenNameStringLiteral	Se ha utilizado un valor no permitido para el atributo {0}: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
,	TokenNameCOMMA	
"El NodeSet resultante del segundo argumento de la funci�n del documento est� vac�o. Devuelve un conjunto de nodos vac�o."	TokenNameStringLiteral	El NodeSet resultante del segundo argumento de la funci�n del documento est� vac�o. Devuelve un conjunto de nodos vac�o.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. 	TokenNameCOMMENT_LINE	and must not be translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"El valor del atributo 'name' de nombre xsl:processing-instruction no debe ser 'xml'"	TokenNameStringLiteral	El valor del atributo 'name' de nombre xsl:processing-instruction no debe ser 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. "NCName" is an XML data-type and must not be 	TokenNameCOMMENT_LINE	and must not be translated. "NCName" is an XML data-type and must not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"El valor del atributo ''name'' de xsl:processing-instruction debe ser un NCName v�lido: {0}"	TokenNameStringLiteral	El valor del atributo ''name'' de xsl:processing-instruction debe ser un NCName v�lido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message is reported if the stylesheet that is 	TokenNameCOMMENT_LINE	Note to translators: This message is reported if the stylesheet that is 
// being processed attempted to construct an XML document with an attribute in a 	TokenNameCOMMENT_LINE	being processed attempted to construct an XML document with an attribute in a 
// place other than on an element. The substitution text specifies the name of 	TokenNameCOMMENT_LINE	place other than on an element. The substitution text specifies the name of 
// the attribute. 	TokenNameCOMMENT_LINE	the attribute. 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"No se puede a�adir el atributo {0} despu�s de nodos hijo o antes de que se produzca un elemento. Se ignorar� el atributo."	TokenNameStringLiteral	No se puede a�adir el atributo {0} despu�s de nodos hijo o antes de que se produzca un elemento. Se ignorar� el atributo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"Se ha intentado modificar un objeto que no admite modificaciones. "	TokenNameStringLiteral	Se ha intentado modificar un objeto que no admite modificaciones. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 	TokenNameCOMMENT_LINE	Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"es"	TokenNameStringLiteral	es
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"es"	TokenNameStringLiteral	es
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"es"	TokenNameStringLiteral	es
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"El par�metro para createMessage estaba fuera de los l�mites"	TokenNameStringLiteral	El par�metro para createMessage estaba fuera de los l�mites
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Se ha generado una excepci�n durante la llamada messageFormat"	TokenNameStringLiteral	Se ha generado una excepci�n durante la llamada messageFormat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Xalan versi�n "	TokenNameStringLiteral	>>>>>>> Xalan versi�n 
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
"s�"	TokenNameStringLiteral	s�
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"L�nea n�m."	TokenNameStringLiteral	L�nea n�m.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Columna n�m."	TokenNameStringLiteral	Columna n�m.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: terminado"	TokenNameStringLiteral	XSLProcessor: terminado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following messages provide usage information 	TokenNameCOMMENT_LINE	Note to translators: The following messages provide usage information 
// for the Xalan Process command line. "Process" is the name of a Java class, 	TokenNameCOMMENT_LINE	for the Xalan Process command line. "Process" is the name of a Java class, 
// and should not be translated. 	TokenNameCOMMENT_LINE	and should not be translated. 
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Opciones de la clase Process de la l�nea de mandatos Xalan-J:"	TokenNameStringLiteral	Opciones de la clase Process de la l�nea de mandatos Xalan-J:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Opciones de la clase Process de la l�nea de mandatos Xalan-J:"	TokenNameStringLiteral	Opciones de la clase Process de la l�nea de mandatos Xalan-J:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xsltc_option"	TokenNameStringLiteral	xslProc_invalid_xsltc_option
,	TokenNameCOMMA	
"La opci�n {0} no est� soportada en modalidad XSLTC."	TokenNameStringLiteral	La opci�n {0} no est� soportada en modalidad XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xalan_option"	TokenNameStringLiteral	xslProc_invalid_xalan_option
,	TokenNameCOMMA	
"La opci�n {0} s�lo puede utilizarse con -XSLTC."	TokenNameStringLiteral	La opci�n {0} s�lo puede utilizarse con -XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_no_input"	TokenNameStringLiteral	xslProc_no_input
,	TokenNameCOMMA	
"Error: No se ha especificado ninguna hoja de estilos ni xml de entrada. Ejecute este mandato sin opciones para ver las instrucciones de uso."	TokenNameStringLiteral	Error: No se ha especificado ninguna hoja de estilos ni xml de entrada. Ejecute este mandato sin opciones para ver las instrucciones de uso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_common_options"	TokenNameStringLiteral	xslProc_common_options
,	TokenNameCOMMA	
"-Opciones comunes-"	TokenNameStringLiteral	-Opciones comunes-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xalan_options"	TokenNameStringLiteral	xslProc_xalan_options
,	TokenNameCOMMA	
"-Opciones para Xalan-"	TokenNameStringLiteral	-Opciones para Xalan-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xsltc_options"	TokenNameStringLiteral	xslProc_xsltc_options
,	TokenNameCOMMA	
"-Opciones para XSLTC-"	TokenNameStringLiteral	-Opciones para XSLTC-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_return_to_continue"	TokenNameStringLiteral	xslProc_return_to_continue
,	TokenNameCOMMA	
"(pulse <Intro> para continuar)"	TokenNameStringLiteral	(pulse <Intro> para continuar)
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
"[-XSLTC (Utilizar XSLTC para transformaci�n)]"	TokenNameStringLiteral	[-XSLTC (Utilizar XSLTC para transformaci�n)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
"[-IN URL_XML_entrada]"	TokenNameStringLiteral	[-IN URL_XML_entrada]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXSL"	TokenNameStringLiteral	optionXSL
,	TokenNameCOMMA	
"[-XSL URL_transformaci�n_XSL]"	TokenNameStringLiteral	[-XSL URL_transformaci�n_XSL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionOUT"	TokenNameStringLiteral	optionOUT
,	TokenNameCOMMA	
"[-OUT nombre_archivo_salida]"	TokenNameStringLiteral	[-OUT nombre_archivo_salida]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCIN"	TokenNameStringLiteral	optionLXCIN
,	TokenNameCOMMA	
"[-LXCIN entrada_nombre_archivo_hoja_estilos_compilada]"	TokenNameStringLiteral	[-LXCIN entrada_nombre_archivo_hoja_estilos_compilada]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCOUT"	TokenNameStringLiteral	optionLXCOUT
,	TokenNameCOMMA	
"[-LXCOUT salida_nombre_archivo_hoja_estilos_compilada]"	TokenNameStringLiteral	[-LXCOUT salida_nombre_archivo_hoja_estilos_compilada]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARSER"	TokenNameStringLiteral	optionPARSER
,	TokenNameCOMMA	
"[-PARSER nombre de clase completamente cualificado del enlace del analizador]"	TokenNameStringLiteral	[-PARSER nombre de clase completamente cualificado del enlace del analizador]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionE"	TokenNameStringLiteral	optionE
,	TokenNameCOMMA	
"[-E (No expandir referencias de entidades)]"	TokenNameStringLiteral	[-E (No expandir referencias de entidades)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionV"	TokenNameStringLiteral	optionV
,	TokenNameCOMMA	
"[-E (No expandir referencias de entidades)]"	TokenNameStringLiteral	[-E (No expandir referencias de entidades)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQC"	TokenNameStringLiteral	optionQC
,	TokenNameCOMMA	
"[-QC (Avisos silenciosos de conflictos de patrones)]"	TokenNameStringLiteral	[-QC (Avisos silenciosos de conflictos de patrones)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQ"	TokenNameStringLiteral	optionQ
,	TokenNameCOMMA	
"[-Q (Modalidad silenciosa)]"	TokenNameStringLiteral	[-Q (Modalidad silenciosa)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLF"	TokenNameStringLiteral	optionLF
,	TokenNameCOMMA	
"[-LF (Utilizar s�lo avances de l�nea en la salida {el valor predeterminado es CR/LF})]"	TokenNameStringLiteral	[-LF (Utilizar s�lo avances de l�nea en la salida {el valor predeterminado es CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCR"	TokenNameStringLiteral	optionCR
,	TokenNameCOMMA	
"[-CR (Utilizar s�lo retornos de carro en la salida {el valor predeterminado es CR/LF})]"	TokenNameStringLiteral	[-CR (Utilizar s�lo retornos de carro en la salida {el valor predeterminado es CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionESCAPE"	TokenNameStringLiteral	optionESCAPE
,	TokenNameCOMMA	
"[-ESCAPE (Caracteres con escape {el valor predeterminado es <>&"'\r\n}]"	TokenNameStringLiteral	[-ESCAPE (Caracteres con escape {el valor predeterminado es <>&"'\r\n}]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINDENT"	TokenNameStringLiteral	optionINDENT
,	TokenNameCOMMA	
"[-INDENT (Controlar el n�mero de espacios de sangrado {el valor predeterminado es 0})]"	TokenNameStringLiteral	[-INDENT (Controlar el n�mero de espacios de sangrado {el valor predeterminado es 0})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTT"	TokenNameStringLiteral	optionTT
,	TokenNameCOMMA	
"[-TT (Rastrear las plantillas a medida que se llaman.)]"	TokenNameStringLiteral	[-TT (Rastrear las plantillas a medida que se llaman.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTG"	TokenNameStringLiteral	optionTG
,	TokenNameCOMMA	
"[-TG (Rastrear cada suceso de generaci�n.)]"	TokenNameStringLiteral	[-TG (Rastrear cada suceso de generaci�n.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTS"	TokenNameStringLiteral	optionTS
,	TokenNameCOMMA	
"[-TS (Rastrear cada suceso de selecci�n.)]"	TokenNameStringLiteral	[-TS (Rastrear cada suceso de selecci�n.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTTC"	TokenNameStringLiteral	optionTTC
,	TokenNameCOMMA	
"[-TTC (Rastrear los hijos de plantillas a medida que se procesan.)]"	TokenNameStringLiteral	[-TTC (Rastrear los hijos de plantillas a medida que se procesan.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTCLASS"	TokenNameStringLiteral	optionTCLASS
,	TokenNameCOMMA	
"[-TCLASS (Clase TraceListener para extensiones de rastreo.)]"	TokenNameStringLiteral	[-TCLASS (Clase TraceListener para extensiones de rastreo.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionVALIDATE"	TokenNameStringLiteral	optionVALIDATE
,	TokenNameCOMMA	
"[-VALIDATE (Establecer si se realiza la validaci�n. De forma predeterminada la validaci�n est� desactivada.)]"	TokenNameStringLiteral	[-VALIDATE (Establecer si se realiza la validaci�n. De forma predeterminada la validaci�n est� desactivada.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionEDUMP"	TokenNameStringLiteral	optionEDUMP
,	TokenNameCOMMA	
"[-EDUMP {nombre de archivo opcional} (Realizar vuelco de pila si se produce un error.)]"	TokenNameStringLiteral	[-EDUMP {nombre de archivo opcional} (Realizar vuelco de pila si se produce un error.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXML"	TokenNameStringLiteral	optionXML
,	TokenNameCOMMA	
"[-XML (Utilizar el formateador XML y a�adir la cabecera XML.)]"	TokenNameStringLiteral	[-XML (Utilizar el formateador XML y a�adir la cabecera XML.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTEXT"	TokenNameStringLiteral	optionTEXT
,	TokenNameCOMMA	
"[-TEXT (Utilizar el formateador de texto sencillo.)]"	TokenNameStringLiteral	[-TEXT (Utilizar el formateador de texto sencillo.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionHTML"	TokenNameStringLiteral	optionHTML
,	TokenNameCOMMA	
"[-HTML (Utilizar el formateador HTML.)]"	TokenNameStringLiteral	[-HTML (Utilizar el formateador HTML.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARAM"	TokenNameStringLiteral	optionPARAM
,	TokenNameCOMMA	
"[-PARAM expresi�n de nombre (Establecer un par�metro de hoja de estilos)]"	TokenNameStringLiteral	[-PARAM expresi�n de nombre (Establecer un par�metro de hoja de estilos)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"El proceso XSL no ha sido satisfactorio."	TokenNameStringLiteral	El proceso XSL no ha sido satisfactorio.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** No se ha podido encontrar el analizador **"	TokenNameStringLiteral	** No se ha podido encontrar el analizador **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Compruebe la classpath."	TokenNameStringLiteral	Compruebe la classpath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Si no dispone del analizador XML para Java de IBM, puede descargarlo de"	TokenNameStringLiteral	Si no dispone del analizador XML para Java de IBM, puede descargarlo de
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"IBM AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	IBM AlphaWorks: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionURIRESOLVER"	TokenNameStringLiteral	optionURIRESOLVER
,	TokenNameCOMMA	
"[-URIRESOLVER nombre de clase completo (URIResolver a utilizar para resolver URI)]"	TokenNameStringLiteral	[-URIRESOLVER nombre de clase completo (URIResolver a utilizar para resolver URI)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionENTITYRESOLVER"	TokenNameStringLiteral	optionENTITYRESOLVER
,	TokenNameCOMMA	
"[-ENTITYRESOLVER nombre de clase completo (EntityResolver a utilizar para resolver entidades)]"	TokenNameStringLiteral	[-ENTITYRESOLVER nombre de clase completo (EntityResolver a utilizar para resolver entidades)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCONTENTHANDLER"	TokenNameStringLiteral	optionCONTENTHANDLER
,	TokenNameCOMMA	
"[-CONTENTHANDLER nombre de clase completo (ContentHandler a utilizar para serializar la salida)]"	TokenNameStringLiteral	[-CONTENTHANDLER nombre de clase completo (ContentHandler a utilizar para serializar la salida)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLINENUMBERS"	TokenNameStringLiteral	optionLINENUMBERS
,	TokenNameCOMMA	
"[-L utilizar n�meros de l�nea para el documento fuente]"	TokenNameStringLiteral	[-L utilizar n�meros de l�nea para el documento fuente]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSECUREPROCESSING"	TokenNameStringLiteral	optionSECUREPROCESSING
,	TokenNameCOMMA	
" [-SECURE (establecer la caracter�stica de proceso seguro en true.)]"	TokenNameStringLiteral	 [-SECURE (establecer la caracter�stica de proceso seguro en true.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
"optionMEDIA"	TokenNameStringLiteral	optionMEDIA
,	TokenNameCOMMA	
"[-MEDIA tipo_soporte (Utilizar el atributo de soporte para encontrar la hoja de estilos asociada con un documento.)]"	TokenNameStringLiteral	[-MEDIA tipo_soporte (Utilizar el atributo de soporte para encontrar la hoja de estilos asociada con un documento.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionFLAVOR"	TokenNameStringLiteral	optionFLAVOR
,	TokenNameCOMMA	
"[-FLAVOR nombre_estilo (Utilizar expl�citamente s2s=SAX o d2d=DOM para realizar la transformaci�n.)] "	TokenNameStringLiteral	[-FLAVOR nombre_estilo (Utilizar expl�citamente s2s=SAX o d2d=DOM para realizar la transformaci�n.)] 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Added by sboag/scurcuru; experimental 	TokenNameCOMMENT_LINE	Added by sboag/scurcuru; experimental 
{	TokenNameLBRACE	
"optionDIAG"	TokenNameStringLiteral	optionDIAG
,	TokenNameCOMMA	
"[-DIAG (Imprimir el total de milisegundos que lleva la transformaci�n.)]"	TokenNameStringLiteral	[-DIAG (Imprimir el total de milisegundos que lleva la transformaci�n.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINCREMENTAL"	TokenNameStringLiteral	optionINCREMENTAL
,	TokenNameCOMMA	
"[-INCREMENTAL (Solicitar construcci�n DTM incremental estableciendo http://xml.apache.org/xalan/features/incremental como verdadero.)]"	TokenNameStringLiteral	[-INCREMENTAL (Solicitar construcci�n DTM incremental estableciendo http://xml.apache.org/xalan/features/incremental como verdadero.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionNOOPTIMIMIZE"	TokenNameStringLiteral	optionNOOPTIMIMIZE
,	TokenNameCOMMA	
"[-NOOPTIMIMIZE (Solicitar proceso de optimizaci�n de hoja de estilos estableciendo http://xml.apache.org/xalan/features/optimize como falso.)]"	TokenNameStringLiteral	[-NOOPTIMIMIZE (Solicitar proceso de optimizaci�n de hoja de estilos estableciendo http://xml.apache.org/xalan/features/optimize como falso.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionRL"	TokenNameStringLiteral	optionRL
,	TokenNameCOMMA	
"[-RL l�mite_recursi�n (L�mite num�rico de aserci�n sobre profundidad de recursi�n de hoja de estilos.)]"	TokenNameStringLiteral	[-RL l�mite_recursi�n (L�mite num�rico de aserci�n sobre profundidad de recursi�n de hoja de estilos.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXO"	TokenNameStringLiteral	optionXO
,	TokenNameCOMMA	
"[-XO [nombreTranslet] (Asignar el nombre al translet generado)]"	TokenNameStringLiteral	[-XO [nombreTranslet] (Asignar el nombre al translet generado)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXD"	TokenNameStringLiteral	optionXD
,	TokenNameCOMMA	
"[-XD directorioDestino (Especificar un directorio de destino para translet)]"	TokenNameStringLiteral	[-XD directorioDestino (Especificar un directorio de destino para translet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXJ"	TokenNameStringLiteral	optionXJ
,	TokenNameCOMMA	
"[-XJ archivoJar (Empaqueta las clases translet en un archivo jar de nombre <archivoJar>)]"	TokenNameStringLiteral	[-XJ archivoJar (Empaqueta las clases translet en un archivo jar de nombre <archivoJar>)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXP"	TokenNameStringLiteral	optionXP
,	TokenNameCOMMA	
"[-XP paquete (Especifica un prefijo para el nombre del paquete de todas las clases translet generadas)]"	TokenNameStringLiteral	[-XP paquete (Especifica un prefijo para el nombre del paquete de todas las clases translet generadas)]
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
"[-XN (habilita la inclusi�n en l�nea de plantillas)]"	TokenNameStringLiteral	[-XN (habilita la inclusi�n en l�nea de plantillas)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXX"	TokenNameStringLiteral	optionXX
,	TokenNameCOMMA	
"[-XX (activa la salida de mensajes de depuraci�n adicionales)]"	TokenNameStringLiteral	[-XX (activa la salida de mensajes de depuraci�n adicionales)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXT"	TokenNameStringLiteral	optionXT
,	TokenNameCOMMA	
"[-XT (utilizar translet para transformar si es posible)]"	TokenNameStringLiteral	[-XT (utilizar translet para transformar si es posible)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"diagTiming"	TokenNameStringLiteral	diagTiming
,	TokenNameCOMMA	
"--------- La transformaci�n de {0} mediante {1} ha durado {2} ms"	TokenNameStringLiteral	--------- La transformaci�n de {0} mediante {1} ha durado {2} ms
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"recursionTooDeep"	TokenNameStringLiteral	recursionTooDeep
,	TokenNameCOMMA	
"Anidado de plantilla demasiado profundo. anidado = {0}, plantilla {1} {2}"	TokenNameStringLiteral	Anidado de plantilla demasiado profundo. anidado = {0}, plantilla {1} {2}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nameIs"	TokenNameStringLiteral	nameIs
,	TokenNameCOMMA	
"el nombre es"	TokenNameStringLiteral	el nombre es
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"matchPatternIs"	TokenNameStringLiteral	matchPatternIs
,	TokenNameCOMMA	
"el patr�n de coincidencia es"	TokenNameStringLiteral	el patr�n de coincidencia es
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
"Aviso: "	TokenNameStringLiteral	Aviso: 
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
"es"	TokenNameStringLiteral	es
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