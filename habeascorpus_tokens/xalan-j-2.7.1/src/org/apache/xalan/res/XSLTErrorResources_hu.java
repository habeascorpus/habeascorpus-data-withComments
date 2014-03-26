/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTErrorResources_hu.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTErrorResources_hu.java 468641 2006-10-28 06:54:42Z minchau $ 
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
XSLTErrorResources_hu	TokenNameIdentifier	 XSLT Error Resources hu
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
"Hiba: Nem lehet '{' a kifejezéseken belül"	TokenNameStringLiteral	Hiba: Nem lehet '{' a kifejezéseken belül
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"A(z) {0}-nak érvénytelen attribútuma van: {1}"	TokenNameStringLiteral	A(z) {0}-nak érvénytelen attribútuma van: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
,	TokenNameCOMMA	
"A sourceNode értéke null az xsl:apply-imports metódusban."	TokenNameStringLiteral	A sourceNode értéke null az xsl:apply-imports metódusban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
"Nem lehet a(z) {0}-t felvenni a(z) {1}-ba"	TokenNameStringLiteral	Nem lehet a(z) {0}-t felvenni a(z) {1}-ba
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
,	TokenNameCOMMA	
"A sourceNode null a handleApplyTemplatesInstruction-ban!"	TokenNameStringLiteral	A sourceNode null a handleApplyTemplatesInstruction-ban!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
,	TokenNameCOMMA	
"A(z) {0}-nak kell legyen name attribútuma."	TokenNameStringLiteral	A(z) {0}-nak kell legyen name attribútuma.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
"Nem található {0} nev? sablon"	TokenNameStringLiteral	Nem található {0} nev? sablon
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
,	TokenNameCOMMA	
"Nem lehet feloldani a név AVT-t az xsl:call-template-ben."	TokenNameStringLiteral	Nem lehet feloldani a név AVT-t az xsl:call-template-ben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
"{0}-nek attribútum szükséges: {1}"	TokenNameStringLiteral	{0}-nek attribútum szükséges: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
,	TokenNameCOMMA	
"A(z) {0} -nak kell legyen ''test'' attribútuma. "	TokenNameStringLiteral	A(z) {0} -nak kell legyen ''test'' attribútuma. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
,	TokenNameCOMMA	
"Rossz érték a level attribútumban: {0}"	TokenNameStringLiteral	Rossz érték a level attribútumban: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"A feldolgozási utasítás neve nem lehet 'xml'"	TokenNameStringLiteral	A feldolgozási utasítás neve nem lehet 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"A feldolgozási utasítás neve érvényes NCName kell legyen: {0}"	TokenNameStringLiteral	A feldolgozási utasítás neve érvényes NCName kell legyen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
,	TokenNameCOMMA	
"A(z) {0}-nek kell legyen illeszkedési attribútuma, ha van módja."	TokenNameStringLiteral	A(z) {0}-nek kell legyen illeszkedési attribútuma, ha van módja.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
"A(z) {0}-nak kell vagy név vagy illeszkedési attribútum."	TokenNameStringLiteral	A(z) {0}-nak kell vagy név vagy illeszkedési attribútum.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
,	TokenNameCOMMA	
"Nem lehet feloldani a névtér el?tagot: {0}"	TokenNameStringLiteral	Nem lehet feloldani a névtér el?tagot: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
,	TokenNameCOMMA	
"Az xml:space értéke érvénytelen: {0}"	TokenNameStringLiteral	Az xml:space értéke érvénytelen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
,	TokenNameCOMMA	
"A leszármazott csomópontnak nincs tulajdonos dokumentuma!"	TokenNameStringLiteral	A leszármazott csomópontnak nincs tulajdonos dokumentuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
"ElemTemplateElement hiba: {0}"	TokenNameStringLiteral	ElemTemplateElement hiba: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
,	TokenNameCOMMA	
"Kísérlet null leszármazott felvételére!"	TokenNameStringLiteral	Kísérlet null leszármazott felvételére!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
,	TokenNameCOMMA	
"A(z) {0}-nak kell kiválasztási attribútum."	TokenNameStringLiteral	A(z) {0}-nak kell kiválasztási attribútum.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
,	TokenNameCOMMA	
"Az xsl:when-nek kell legyen 'test' attribútuma."	TokenNameStringLiteral	Az xsl:when-nek kell legyen 'test' attribútuma.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
,	TokenNameCOMMA	
"Az xsl:param-nak kell legyen 'name' attribútuma."	TokenNameStringLiteral	Az xsl:param-nak kell legyen 'name' attribútuma.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
,	TokenNameCOMMA	
"A környezetnek nincs tulajdonos dokumentuma!"	TokenNameStringLiteral	A környezetnek nincs tulajdonos dokumentuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
,	TokenNameCOMMA	
"Nem lehet XML TransformerFactory Liaison-t létrehozni: {0}"	TokenNameStringLiteral	Nem lehet XML TransformerFactory Liaison-t létrehozni: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"A Xalan folyamat sikertelen volt."	TokenNameStringLiteral	A Xalan folyamat sikertelen volt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan: sikertelen volt."	TokenNameStringLiteral	Xalan: sikertelen volt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"A kódolás nem támogatott: {0}"	TokenNameStringLiteral	A kódolás nem támogatott: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
,	TokenNameCOMMA	
"Nem lehet TraceListener-t létrehozni: {0}"	TokenNameStringLiteral	Nem lehet TraceListener-t létrehozni: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
,	TokenNameCOMMA	
"Az xsl:key-nek kell legyen 'name' attribútuma!"	TokenNameStringLiteral	Az xsl:key-nek kell legyen 'name' attribútuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
,	TokenNameCOMMA	
"Az xsl:key-nek kell legyen 'match' attribútuma!"	TokenNameStringLiteral	Az xsl:key-nek kell legyen 'match' attribútuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
,	TokenNameCOMMA	
"Az xsl:key-nek kell legyen 'use' attribútuma!"	TokenNameStringLiteral	Az xsl:key-nek kell legyen 'use' attribútuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0}-nak kell legyen ''elements'' attribútuma! "	TokenNameStringLiteral	(StylesheetHandler) A(z) {0}-nak kell legyen ''elements'' attribútuma! 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0}-nak hiányzik a ''prefix'' attribútuma"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0}-nak hiányzik a ''prefix'' attribútuma
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
,	TokenNameCOMMA	
"A stíluslap URL rossz: {0}"	TokenNameStringLiteral	A stíluslap URL rossz: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
,	TokenNameCOMMA	
"A stíluslap fájl nem található: {0}"	TokenNameStringLiteral	A stíluslap fájl nem található: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
,	TokenNameCOMMA	
"IO kivétel történt a stíluslap fájlnál: {0}"	TokenNameStringLiteral	IO kivétel történt a stíluslap fájlnál: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0} href attribútuma nem található"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0} href attribútuma nem található
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0} közvetlenül vagy közvetetten tartalmazza saját magát!"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0} közvetlenül vagy közvetetten tartalmazza saját magát!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINCLUDE_ERROR	TokenNameIdentifier	 ER  PROCESSINCLUDE  ERROR
,	TokenNameCOMMA	
"StylesheetHandler.processInclude hiba, {0}"	TokenNameStringLiteral	StylesheetHandler.processInclude hiba, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_LANG_ATTRIB	TokenNameIdentifier	 ER  MISSING  LANG  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0}-nak hiányzik a ''lang'' attribútuma "	TokenNameStringLiteral	(StylesheetHandler) A(z) {0}-nak hiányzik a ''lang'' attribútuma 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
,	TokenNameCOMMA	
"(StylesheetHandler) Rosszul elhelyezett {0} elem?? Hiányzik a ''component'' tárolóelem"	TokenNameStringLiteral	(StylesheetHandler) Rosszul elhelyezett {0} elem?? Hiányzik a ''component'' tárolóelem
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
,	TokenNameCOMMA	
"Csak egy Element-be, DocumentFragment-be, Document-be vagy PrintWriter-be lehet kimenetet küldeni."	TokenNameStringLiteral	Csak egy Element-be, DocumentFragment-be, Document-be vagy PrintWriter-be lehet kimenetet küldeni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_ERROR	TokenNameIdentifier	 ER  PROCESS  ERROR
,	TokenNameCOMMA	
"StylesheetRoot.process hiba"	TokenNameStringLiteral	StylesheetRoot.process hiba
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNIMPLNODE_ERROR	TokenNameIdentifier	 ER  UNIMPLNODE  ERROR
,	TokenNameCOMMA	
"UnImplNode hiba: {0}"	TokenNameStringLiteral	UnImplNode hiba: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
,	TokenNameCOMMA	
"Hiba! Az xpath kiválasztási kifejezés nem található (-select)."	TokenNameStringLiteral	Hiba! Az xpath kiválasztási kifejezés nem található (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
,	TokenNameCOMMA	
"Nem lehet sorbarakni az XSLProcessor-t!"	TokenNameStringLiteral	Nem lehet sorbarakni az XSLProcessor-t!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
,	TokenNameCOMMA	
"Nem adott meg stíluslap bemenetet!"	TokenNameStringLiteral	Nem adott meg stíluslap bemenetet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
,	TokenNameCOMMA	
"Nem sikerült feldolgozni a stíluslapot!"	TokenNameStringLiteral	Nem sikerült feldolgozni a stíluslapot!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
,	TokenNameCOMMA	
"Nem lehet elemezni a(z) {0} dokumentumot!"	TokenNameStringLiteral	Nem lehet elemezni a(z) {0} dokumentumot!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
,	TokenNameCOMMA	
"Nem található a darab: {0}"	TokenNameStringLiteral	Nem található a darab: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
,	TokenNameCOMMA	
"A darab azonosító által mutatott csomópont nem elem: {0}"	TokenNameStringLiteral	A darab azonosító által mutatott csomópont nem elem: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"A for-each-nek legalább egy match vagy egy name attribútuma kell legyen"	TokenNameStringLiteral	A for-each-nek legalább egy match vagy egy name attribútuma kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"A sablonoknak vagy match vagy name attribútumuk kell legyen"	TokenNameStringLiteral	A sablonoknak vagy match vagy name attribútumuk kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
,	TokenNameCOMMA	
"Nincs klónja egy dokumentumdarabnak!"	TokenNameStringLiteral	Nincs klónja egy dokumentumdarabnak!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
,	TokenNameCOMMA	
"Nem lehet elemet létrehozni az eredményfában: {0}"	TokenNameStringLiteral	Nem lehet elemet létrehozni az eredményfában: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
,	TokenNameCOMMA	
"Az xml:space-nek a forrás XML-ben tiltott értéke van: {0}"	TokenNameStringLiteral	Az xml:space-nek a forrás XML-ben tiltott értéke van: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
"Nincs xsl:key deklaráció a(z) {0}-hoz!"	TokenNameStringLiteral	Nincs xsl:key deklaráció a(z) {0}-hoz!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
,	TokenNameCOMMA	
"Hiba! Nem lehet URL-t létrehozni ehhez: {0}"	TokenNameStringLiteral	Hiba! Nem lehet URL-t létrehozni ehhez: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
,	TokenNameCOMMA	
"Az xsl:functions nem támogatott"	TokenNameStringLiteral	Az xsl:functions nem támogatott
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
,	TokenNameCOMMA	
"XSLT TransformerFactory hiba"	TokenNameStringLiteral	XSLT TransformerFactory hiba
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0} nem megengedett a stíluslapon belül!"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0} nem megengedett a stíluslapon belül!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
,	TokenNameCOMMA	
"A result-ns többé már nem támogatott! Használja inkább az xsl:output-ot."	TokenNameStringLiteral	A result-ns többé már nem támogatott! Használja inkább az xsl:output-ot.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
,	TokenNameCOMMA	
"A default-space többé már nem támogatott! Használja inkább az xsl:strip-space-t vagy az xsl:preserve-space-t."	TokenNameStringLiteral	A default-space többé már nem támogatott! Használja inkább az xsl:strip-space-t vagy az xsl:preserve-space-t.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
,	TokenNameCOMMA	
"Az indent-result többé már nem támogatott! Használja inkább az xsl:output-ot."	TokenNameStringLiteral	Az indent-result többé már nem támogatott! Használja inkább az xsl:output-ot.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0}-nak tiltott attribútuma van: {1}"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0}-nak tiltott attribútuma van: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
,	TokenNameCOMMA	
"Ismeretlen XSL elem: {0}"	TokenNameStringLiteral	Ismeretlen XSL elem: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
,	TokenNameCOMMA	
"(StylesheetHandler) Az xsl:sort csak az xsl:apply-templates-szel vagy xsl:for-each-el együtt használható."	TokenNameStringLiteral	(StylesheetHandler) Az xsl:sort csak az xsl:apply-templates-szel vagy xsl:for-each-el együtt használható.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
,	TokenNameCOMMA	
"(StylesheetHandler) Rosszul elhelyezett xsl:when!"	TokenNameStringLiteral	(StylesheetHandler) Rosszul elhelyezett xsl:when!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) Az xsl:when szül?je nem xsl:choose!"	TokenNameStringLiteral	(StylesheetHandler) Az xsl:when szül?je nem xsl:choose!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
,	TokenNameCOMMA	
"(StylesheetHandler) Rosszul elhelyezett xsl:otherwise!"	TokenNameStringLiteral	(StylesheetHandler) Rosszul elhelyezett xsl:otherwise!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) Az xsl:otherwise szül?je nem xsl:choose!"	TokenNameStringLiteral	(StylesheetHandler) Az xsl:otherwise szül?je nem xsl:choose!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0} nem megengedett sablonok belsejében!"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0} nem megengedett sablonok belsejében!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0} kiterjesztés névtér el?tag {1} ismeretlen"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0} kiterjesztés névtér el?tag {1} ismeretlen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
,	TokenNameCOMMA	
"(StylesheetHandler) Az importálások csak a stíluslap els? elemei lehetnek!"	TokenNameStringLiteral	(StylesheetHandler) Az importálások csak a stíluslap els? elemei lehetnek!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) A(z) {0} közvetlenül vagy közvetve tartalmazza saját magát!"	TokenNameStringLiteral	(StylesheetHandler) A(z) {0} közvetlenül vagy közvetve tartalmazza saját magát!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
,	TokenNameCOMMA	
"(StylesheetHandler) xml:space értéke nem megengedett: {0}"	TokenNameStringLiteral	(StylesheetHandler) xml:space értéke nem megengedett: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"A processStylesheet sikertelen volt!"	TokenNameStringLiteral	A processStylesheet sikertelen volt!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
,	TokenNameCOMMA	
"SAX kivétel"	TokenNameStringLiteral	SAX kivétel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// add this message to fix bug 21478 	TokenNameCOMMENT_LINE	add this message to fix bug 21478 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"A függvény nem támogatott!"	TokenNameStringLiteral	A függvény nem támogatott!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
,	TokenNameCOMMA	
"XSLT hiba"	TokenNameStringLiteral	XSLT hiba
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
,	TokenNameCOMMA	
"A pénzjel nem megengedett a formátum minta karakterláncban"	TokenNameStringLiteral	A pénzjel nem megengedett a formátum minta karakterláncban
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
,	TokenNameCOMMA	
"A document funkció nem támogatott a Stylesheet DOM-ban!"	TokenNameStringLiteral	A document funkció nem támogatott a Stylesheet DOM-ban!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
,	TokenNameCOMMA	
"Nem lehet feloldani az el?tagot egy nem-el?tag feloldónak!"	TokenNameStringLiteral	Nem lehet feloldani az el?tagot egy nem-el?tag feloldónak!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
,	TokenNameCOMMA	
"Átirányítás kiterjesztés: Nem lehet megkapni a fájlnevet - a file vagy select attribútumnak egy érvényes karakterláncot kell visszaadnia."	TokenNameStringLiteral	Átirányítás kiterjesztés: Nem lehet megkapni a fájlnevet - a file vagy select attribútumnak egy érvényes karakterláncot kell visszaadnia.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
,	TokenNameCOMMA	
"Nem lehet FormatterListener-t építeni az átirányítás kiterjesztésben!"	TokenNameStringLiteral	Nem lehet FormatterListener-t építeni az átirányítás kiterjesztésben!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
,	TokenNameCOMMA	
"Az el?tag az exclude-result-prefixes-ben nem érvényes: {0}"	TokenNameStringLiteral	Az el?tag az exclude-result-prefixes-ben nem érvényes: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
,	TokenNameCOMMA	
"Hiányzik a megadott el?tag névtér URI-ja"	TokenNameStringLiteral	Hiányzik a megadott el?tag névtér URI-ja
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
,	TokenNameCOMMA	
"Hiányzik az opció argumentuma: {0}"	TokenNameStringLiteral	Hiányzik az opció argumentuma: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
,	TokenNameCOMMA	
"Érvénytelen opció: {0}"	TokenNameStringLiteral	Érvénytelen opció: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
"Rossz formátumú karakterlánc: {0}"	TokenNameStringLiteral	Rossz formátumú karakterlánc: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"Az xsl:stylesheet-nek kell legyen 'version' attribútuma!"	TokenNameStringLiteral	Az xsl:stylesheet-nek kell legyen 'version' attribútuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"A(z) {0} attibútum értéke érvénytelen: {1}"	TokenNameStringLiteral	A(z) {0} attibútum értéke érvénytelen: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
,	TokenNameCOMMA	
"Az xsl:choose-hoz egy xsl:when szükséges"	TokenNameStringLiteral	Az xsl:choose-hoz egy xsl:when szükséges
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
,	TokenNameCOMMA	
"Az xsl:apply-imports nem megengedett xsl:for-each-en belül"	TokenNameStringLiteral	Az xsl:apply-imports nem megengedett xsl:for-each-en belül
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
,	TokenNameCOMMA	
"Nem használhat DTMLiaison-t kimeneti DOM csomópontként... adjon át inkább egy org.apache.xpath.DOM2Helper-t!"	TokenNameStringLiteral	Nem használhat DTMLiaison-t kimeneti DOM csomópontként... adjon át inkább egy org.apache.xpath.DOM2Helper-t!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
,	TokenNameCOMMA	
"Nem használhat DTMLiaison-t bemeneti DOM csomópontként... adjon át inkább egy org.apache.xpath.DOM2Helper-t!"	TokenNameStringLiteral	Nem használhat DTMLiaison-t bemeneti DOM csomópontként... adjon át inkább egy org.apache.xpath.DOM2Helper-t!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
,	TokenNameCOMMA	
"A kiterjesztés-elem meghívása sikertelen volt: {0}"	TokenNameStringLiteral	A kiterjesztés-elem meghívása sikertelen volt: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Az el?tagnak egy névtérre kell feloldódnia: {0}"	TokenNameStringLiteral	Az el?tagnak egy névtérre kell feloldódnia: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Érvénytelen UTF-16 helyettesítés: {0} ?"	TokenNameStringLiteral	Érvénytelen UTF-16 helyettesítés: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
,	TokenNameCOMMA	
"A(z) {0} xsl:attribute-set-et saját magával használta, ami végtelen ciklust eredményez."	TokenNameStringLiteral	A(z) {0} xsl:attribute-set-et saját magával használta, ami végtelen ciklust eredményez.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
,	TokenNameCOMMA	
"Nem keverheti a nem Xerces-DOM bemenetet a Xerces-DOM kimenettel!"	TokenNameStringLiteral	Nem keverheti a nem Xerces-DOM bemenetet a Xerces-DOM kimenettel!
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
"Az ElemTemplateElement.readObject metódusban: {0}"	TokenNameStringLiteral	Az ElemTemplateElement.readObject metódusban: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
,	TokenNameCOMMA	
"Egynél több ''{0}'' nev? sablont találtam"	TokenNameStringLiteral	Egynél több ''{0}'' nev? sablont találtam
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
,	TokenNameCOMMA	
"Érvénytelen függvényhívás: rekurzív key() hívások nem megengedettek"	TokenNameStringLiteral	Érvénytelen függvényhívás: rekurzív key() hívások nem megengedettek
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
"A(z) {0} változó közvetlenül vagy közvetve önmagára hivatkozik!"	TokenNameStringLiteral	A(z) {0} változó közvetlenül vagy közvetve önmagára hivatkozik!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
"A bemeneti csomópont nem lehet null egy DOMSource-ban a newTemplates-hez!"	TokenNameStringLiteral	A bemeneti csomópont nem lehet null egy DOMSource-ban a newTemplates-hez!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
,	TokenNameCOMMA	
"Az osztály fájl nem található a(z) {0} opcióhoz"	TokenNameStringLiteral	Az osztály fájl nem található a(z) {0} opcióhoz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
"A szükséges elem nem található: {0}"	TokenNameStringLiteral	A szükséges elem nem található: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Az InputStream nem lehet null"	TokenNameStringLiteral	Az InputStream nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Az URI nem lehet null"	TokenNameStringLiteral	Az URI nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"A fájl nem lehet null"	TokenNameStringLiteral	A fájl nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Az InputSource nem lehet null"	TokenNameStringLiteral	Az InputSource nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
"Nem lehet inicializálni a BSF kezel?t"	TokenNameStringLiteral	Nem lehet inicializálni a BSF kezel?t
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
"Nem lehet lefordítani a kiterjesztést"	TokenNameStringLiteral	Nem lehet lefordítani a kiterjesztést
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
"Nem lehet létrehozni a kiterjesztést ({0}) {1} miatt"	TokenNameStringLiteral	Nem lehet létrehozni a kiterjesztést ({0}) {1} miatt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
,	TokenNameCOMMA	
"Az {0} metódus példány metódushívásához szükség van egy objektumpéldányra els? argumentumként"	TokenNameStringLiteral	Az {0} metódus példány metódushívásához szükség van egy objektumpéldányra els? argumentumként
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
,	TokenNameCOMMA	
"Érvénytelen elemnevet adott meg {0}"	TokenNameStringLiteral	Érvénytelen elemnevet adott meg {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
,	TokenNameCOMMA	
"Az elemnév metódus statikus {0} kell legyen"	TokenNameStringLiteral	Az elemnév metódus statikus {0} kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
"{0} kiterjesztés funkció : A(z) {1} ismeretlen"	TokenNameStringLiteral	{0} kiterjesztés funkció : A(z) {1} ismeretlen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
,	TokenNameCOMMA	
"Több legjobb illeszkedés a(z) {0} konstruktorára"	TokenNameStringLiteral	Több legjobb illeszkedés a(z) {0} konstruktorára
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
,	TokenNameCOMMA	
"Több legjobb illeszkedés a(z) {0} metódusra"	TokenNameStringLiteral	Több legjobb illeszkedés a(z) {0} metódusra
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
"Több legjobb illeszkedés a(z) {0} elem metódusra"	TokenNameStringLiteral	Több legjobb illeszkedés a(z) {0} elem metódusra
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
,	TokenNameCOMMA	
"Érvénytelen környzetet adott át a(z) {0} kiértékeléséhez"	TokenNameStringLiteral	Érvénytelen környzetet adott át a(z) {0} kiértékeléséhez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
"A tároló már létezik"	TokenNameStringLiteral	A tároló már létezik
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
,	TokenNameCOMMA	
"Nem adott meg meghajtónevet"	TokenNameStringLiteral	Nem adott meg meghajtónevet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
,	TokenNameCOMMA	
"Nem adott meg URL-t"	TokenNameStringLiteral	Nem adott meg URL-t
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
,	TokenNameCOMMA	
"A tároló mérete egynél kisebb!"	TokenNameStringLiteral	A tároló mérete egynél kisebb!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
,	TokenNameCOMMA	
"Érvénytelen meghajtónevet adott meg!"	TokenNameStringLiteral	Érvénytelen meghajtónevet adott meg!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
"Nem található a stíluslap gyökere!"	TokenNameStringLiteral	Nem található a stíluslap gyökere!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
"Tiltott érték az xml:space-hez"	TokenNameStringLiteral	Tiltott érték az xml:space-hez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
"A processFromNode nem sikerült"	TokenNameStringLiteral	A processFromNode nem sikerült
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"Az er?forrást [ {0} ] nem lehet betölteni: {1} {2} {3}"	TokenNameStringLiteral	Az er?forrást [ {0} ] nem lehet betölteni: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Pufferméret <= 0"	TokenNameStringLiteral	Pufferméret <= 0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
,	TokenNameCOMMA	
"Ismeretlen hiba a kiterjesztés hívásánál"	TokenNameStringLiteral	Ismeretlen hiba a kiterjesztés hívásánál
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
"A(z) {0} el?taghoz nem tartozik névtér deklaráció"	TokenNameStringLiteral	A(z) {0} el?taghoz nem tartozik névtér deklaráció
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
"Elem tartalom nem megengedett a(z) {0} lang=javaclass-hoz"	TokenNameStringLiteral	Elem tartalom nem megengedett a(z) {0} lang=javaclass-hoz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
"Stíluslap által irányított leállás"	TokenNameStringLiteral	Stíluslap által irányított leállás
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
,	TokenNameCOMMA	
"1 vagy 2"	TokenNameStringLiteral	1 vagy 2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 vagy 3"	TokenNameStringLiteral	2 vagy 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Nem lehet betölteni a(z) {0}-t (ellen?rizze a CLASSPATH-t), most csak az alapértelmezéseket használjuk"	TokenNameStringLiteral	Nem lehet betölteni a(z) {0}-t (ellen?rizze a CLASSPATH-t), most csak az alapértelmezéseket használjuk
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
,	TokenNameCOMMA	
"Nem lehet inicializálni az alapértelmezett sablonokat"	TokenNameStringLiteral	Nem lehet inicializálni az alapértelmezett sablonokat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"Az eredmény nem lehet null"	TokenNameStringLiteral	Az eredmény nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
"Nem lehet beállítani az eredményt"	TokenNameStringLiteral	Nem lehet beállítani az eredményt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Nem adott meg kimenetet"	TokenNameStringLiteral	Nem adott meg kimenetet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
"Nem alakítható át {0} típusú eredménnyé"	TokenNameStringLiteral	Nem alakítható át {0} típusú eredménnyé
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
"A(z) {0} típusú forrás nem alakítható át "	TokenNameStringLiteral	A(z) {0} típusú forrás nem alakítható át 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
"Null tartalomkezel?"	TokenNameStringLiteral	Null tartalomkezel?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Null hibakezel?"	TokenNameStringLiteral	Null hibakezel?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
,	TokenNameCOMMA	
"A parse nem hívható meg, ha a ContentHandler-t nem állította be"	TokenNameStringLiteral	A parse nem hívható meg, ha a ContentHandler-t nem állította be
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
,	TokenNameCOMMA	
"A sz?r?nek nincs szül?je"	TokenNameStringLiteral	A sz?r?nek nincs szül?je
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
,	TokenNameCOMMA	
"Nincs stíluslap ebben: {0}, adathordozó: {1}"	TokenNameStringLiteral	Nincs stíluslap ebben: {0}, adathordozó: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
,	TokenNameCOMMA	
"Nem található xml-stylesheet PI itt: {0}"	TokenNameStringLiteral	Nem található xml-stylesheet PI itt: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Nem támogatott: {0}"	TokenNameStringLiteral	Nem támogatott: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
,	TokenNameCOMMA	
"A(z) {0} tulajdonság értéke Boolean példány kell legyen"	TokenNameStringLiteral	A(z) {0} tulajdonság értéke Boolean példány kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
"Nem lehet eljutni a küls? parancsfájlhoz a(z) {0}-n"	TokenNameStringLiteral	Nem lehet eljutni a küls? parancsfájlhoz a(z) {0}-n
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"A(z) [ {0} ] er?forrás nem található. {1}"	TokenNameStringLiteral	A(z) [ {0} ] er?forrás nem található. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
"A kimeneti tulajdonság nem felismerhet?: {0}"	TokenNameStringLiteral	A kimeneti tulajdonság nem felismerhet?: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
,	TokenNameCOMMA	
"Nem sikerült ElemLiteralResult példányt létrehozni"	TokenNameStringLiteral	Nem sikerült ElemLiteralResult példányt létrehozni
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 	TokenNameCOMMENT_LINE	Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 
// In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 	TokenNameCOMMENT_LINE	In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 
//in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 	TokenNameCOMMENT_LINE	in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 
//NOTE: Not only the key name but message has also been changed. 	TokenNameCOMMENT_LINE	NOTE: Not only the key name but message has also been changed. 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
,	TokenNameCOMMA	
"A(z) {0} tulajdonság értéke értelmezhet? szám kell legyen"	TokenNameStringLiteral	A(z) {0} tulajdonság értéke értelmezhet? szám kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
,	TokenNameCOMMA	
"A(z) {0} értéke igen vagy nem kell legyen"	TokenNameStringLiteral	A(z) {0} értéke igen vagy nem kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
,	TokenNameCOMMA	
"Nem sikerült meghívni a(z) {0} metódust"	TokenNameStringLiteral	Nem sikerült meghívni a(z) {0} metódust
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
,	TokenNameCOMMA	
"Nem sikerült ElemTemplateElement példányt létrehozni"	TokenNameStringLiteral	Nem sikerült ElemTemplateElement példányt létrehozni
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
"Karakterek nem megengedettek a dokumentumnak ezen a pontján"	TokenNameStringLiteral	Karakterek nem megengedettek a dokumentumnak ezen a pontján
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
"A(z) "{0}" attribútum nem megengedett a(z) {1} elemhez!"	TokenNameStringLiteral	A(z) "{0}" attribútum nem megengedett a(z) {1} elemhez!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
"{0} rossz érték {1} "	TokenNameStringLiteral	{0} rossz érték {1} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
,	TokenNameCOMMA	
"{0} attribútum érték nem található "	TokenNameStringLiteral	{0} attribútum érték nem található 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
,	TokenNameCOMMA	
"{0} attribútum érték ismeretlen "	TokenNameStringLiteral	{0} attribútum érték ismeretlen 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
,	TokenNameCOMMA	
"Kísérlet egy névtér el?tag létrehozására null URI-val"	TokenNameStringLiteral	Kísérlet egy névtér el?tag létrehozására null URI-val
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
,	TokenNameCOMMA	
"Kísérlet egy szám megformázására, ami nagyobb, mint a legnagyobb Long egész"	TokenNameStringLiteral	Kísérlet egy szám megformázására, ami nagyobb, mint a legnagyobb Long egész
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
,	TokenNameCOMMA	
"Nem található a(z) {0} SAX1 meghajtóosztály"	TokenNameStringLiteral	Nem található a(z) {0} SAX1 meghajtóosztály
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
,	TokenNameCOMMA	
"A(z) {0} SAX1 meghajtóosztály megvan, de nem tölthet? be"	TokenNameStringLiteral	A(z) {0} SAX1 meghajtóosztály megvan, de nem tölthet? be
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
,	TokenNameCOMMA	
"A(z) {0} SAX1 meghajtóosztály betöltve, de nem lehet példányt létrehozni bel?le"	TokenNameStringLiteral	A(z) {0} SAX1 meghajtóosztály betöltve, de nem lehet példányt létrehozni bel?le
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
,	TokenNameCOMMA	
"A(z) {0} SAX1 meghajtóosztály nem implementálja az org.xml.sax.Parser-t"	TokenNameStringLiteral	A(z) {0} SAX1 meghajtóosztály nem implementálja az org.xml.sax.Parser-t
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
,	TokenNameCOMMA	
"Nem adta meg az org.xml.sax.parser rendszertulajdonságot"	TokenNameStringLiteral	Nem adta meg az org.xml.sax.parser rendszertulajdonságot
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Az értelmez? argumentuma nem lehet null"	TokenNameStringLiteral	Az értelmez? argumentuma nem lehet null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
,	TokenNameCOMMA	
"Képesség: {0}"	TokenNameStringLiteral	Képesség: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
,	TokenNameCOMMA	
"Tulajdonság: {0}"	TokenNameStringLiteral	Tulajdonság: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
,	TokenNameCOMMA	
"Null entitás feloldó"	TokenNameStringLiteral	Null entitás feloldó
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
,	TokenNameCOMMA	
"Null DTD kezel?"	TokenNameStringLiteral	Null DTD kezel?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
"Nem adott meg meghajtónevet!"	TokenNameStringLiteral	Nem adott meg meghajtónevet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
"Nem adott meg URL-t!"	TokenNameStringLiteral	Nem adott meg URL-t!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
"A tároló mérete 1-nél kisebb!"	TokenNameStringLiteral	A tároló mérete 1-nél kisebb!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
"Érvénytelen meghajtónevet adott meg!"	TokenNameStringLiteral	Érvénytelen meghajtónevet adott meg!
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
"Programozói hiba! A kifejezésnek nincs ElemTemplateElement szül?je!"	TokenNameStringLiteral	Programozói hiba! A kifejezésnek nincs ElemTemplateElement szül?je!
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
"Programozói értesítés a RedundentExprEliminator hívásban: {0} "	TokenNameStringLiteral	Programozói értesítés a RedundentExprEliminator hívásban: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"{0} nem engedélyezett a stíluslap ezen helyén!"	TokenNameStringLiteral	{0} nem engedélyezett a stíluslap ezen helyén!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"Nem-szeparátor szöveg nem megengedett a stíluslap ezen helyén!"	TokenNameStringLiteral	Nem-szeparátor szöveg nem megengedett a stíluslap ezen helyén!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// This code is shared with warning codes. 	TokenNameCOMMENT_LINE	This code is shared with warning codes. 
// SystemId Unknown 	TokenNameCOMMENT_LINE	SystemId Unknown 
{	TokenNameLBRACE	
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
,	TokenNameCOMMA	
"Tiltott értéket használt a(z) {0} attribútumhoz: {1}. A CHAR típusú attribútum csak 1 karakter lehet!"	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} attribútumhoz: {1}. A CHAR típusú attribútum csak 1 karakter lehet!
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
"Tiltott értéket használt a(z) {0} CHAR attribútumhoz: {1}."	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} CHAR attribútumhoz: {1}.
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
"Tiltott értéket használt a(z) {0} ENUM attribútumhoz: {1}. Az érvényes értékek: {2}."	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} ENUM attribútumhoz: {1}. Az érvényes értékek: {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
,	TokenNameCOMMA	
"Tiltott értéket használt a(z) {0} NMTOKEN attribútumhoz: {1}. "	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} NMTOKEN attribútumhoz: {1}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
,	TokenNameCOMMA	
"Tiltott értéket használt a(z) {0} NCNAME attribútumhoz: {1}. "	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} NCNAME attribútumhoz: {1}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
,	TokenNameCOMMA	
"Tiltott értéket használt a(z) {0} logikai attribútumhoz: {1}. "	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} logikai attribútumhoz: {1}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "number" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "number" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
,	TokenNameCOMMA	
"Tiltott értéket használt a(z) {0} szám attribútumhoz: {1}. "	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} szám attribútumhoz: {1}. 
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
"A(z) {0} argumentuma az illeszkedési mintában egy literál kell legyen."	TokenNameStringLiteral	A(z) {0} argumentuma az illeszkedési mintában egy literál kell legyen.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable. A "global variable" is a variable that is accessible everywher 	TokenNameCOMMENT_LINE	a variable. A "global variable" is a variable that is accessible everywher 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
// ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
,	TokenNameCOMMA	
"Kétszer szerepel a globális változó-deklaráció."	TokenNameStringLiteral	Kétszer szerepel a globális változó-deklaráció.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable were encountered. 	TokenNameCOMMENT_LINE	a variable were encountered. 
// ER_DUPLICATE_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
,	TokenNameCOMMA	
"Kétszer szerepel a változó-deklaráció."	TokenNameStringLiteral	Kétszer szerepel a változó-deklaráció.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "xsl:template, "name" and "match" are XSLT keywords 	TokenNameCOMMENT_LINE	Note to translators: "xsl:template, "name" and "match" are XSLT keywords 
// which must not be translated. 	TokenNameCOMMENT_LINE	which must not be translated. 
// ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 	TokenNameCOMMENT_LINE	ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 
{	TokenNameLBRACE	
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
,	TokenNameCOMMA	
"Az xsl:template-nek kell legyen neve vagy illeszkedési attribútuma (vagy mindkett?)"	TokenNameStringLiteral	Az xsl:template-nek kell legyen neve vagy illeszkedési attribútuma (vagy mindkett?)
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
"Az el?tag az exclude-result-prefixes-ben nem érvényes: {0}"	TokenNameStringLiteral	Az el?tag az exclude-result-prefixes-ben nem érvényes: {0}
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
"A(z) {0} nev? attribute-set nem létezik"	TokenNameStringLiteral	A(z) {0} nev? attribute-set nem létezik
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that there was a reference 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that there was a reference 
// to a function named {0} for which no function definition could be found. 	TokenNameCOMMENT_LINE	to a function named {0} for which no function definition could be found. 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
,	TokenNameCOMMA	
"A(z) {0} nev? funkció nem létezik"	TokenNameStringLiteral	A(z) {0} nev? funkció nem létezik
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the XSLT instruction 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the XSLT instruction 
// that is named by the substitution text {0} must not contain other XSLT 	TokenNameCOMMENT_LINE	that is named by the substitution text {0} must not contain other XSLT 
// instructions (content) or a "select" attribute. The word "select" is 	TokenNameCOMMENT_LINE	instructions (content) or a "select" attribute. The word "select" is 
// an XSLT keyword in this case and must not be translated. 	TokenNameCOMMENT_LINE	an XSLT keyword in this case and must not be translated. 
{	TokenNameLBRACE	
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
,	TokenNameCOMMA	
"A(z) {0} elemnek nem lehet egyszerre content és select attribútuma."	TokenNameStringLiteral	A(z) {0} elemnek nem lehet egyszerre content és select attribútuma.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the value argument 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the value argument 
// of setParameter must be a valid Java Object. 	TokenNameCOMMENT_LINE	of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"A(z) {0} paraméter értéke egy érvényes Jáva objektum kell legyen"	TokenNameStringLiteral	A(z) {0} paraméter értéke egy érvényes Jáva objektum kell legyen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
,	TokenNameCOMMA	
"Az xsl:namespace-alias elem result-prefix részének értéke '#default', de nincs meghatározva alapértelmezett névtér az elem hatókörében. "	TokenNameStringLiteral	Az xsl:namespace-alias elem result-prefix részének értéke '#default', de nincs meghatározva alapértelmezett névtér az elem hatókörében. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
,	TokenNameCOMMA	
"Egy xsl:namespace-alias elem result-prefix attribútumának értéke ''{0}'', de nincs névtér deklaráció a(z) ''{0}'' el?taghoz az elem hatókörében. "	TokenNameStringLiteral	Egy xsl:namespace-alias elem result-prefix attribútumának értéke ''{0}'', de nincs névtér deklaráció a(z) ''{0}'' el?taghoz az elem hatókörében. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"A szolgáltatás neve nem lehet null a TransformerFactory.setFeature(String name, boolean value) metódusban."	TokenNameStringLiteral	A szolgáltatás neve nem lehet null a TransformerFactory.setFeature(String name, boolean value) metódusban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"A szolgáltatás neve nem lehet null a TransformerFactory.getFeature(String name) metódusban."	TokenNameStringLiteral	A szolgáltatás neve nem lehet null a TransformerFactory.getFeature(String name) metódusban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"A(z) ''{0}'' szolgáltatás nem állítható be ehhez a TransformerFactory osztályhoz."	TokenNameStringLiteral	A(z) ''{0}'' szolgáltatás nem állítható be ehhez a TransformerFactory osztályhoz.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING	TokenNameIdentifier	 ER  EXTENSION  ELEMENT  NOT  ALLOWED  IN  SECURE  PROCESSING
,	TokenNameCOMMA	
"A(z) ''{0}'' kiterjesztési elem használata nem megengedett, ha biztonságos feldolgozás be van kapcsolva. "	TokenNameStringLiteral	A(z) ''{0}'' kiterjesztési elem használata nem megengedett, ha biztonságos feldolgozás be van kapcsolva. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
,	TokenNameCOMMA	
"Nem lehet beolvasni az el?tagot null névtér URI esetén. "	TokenNameStringLiteral	Nem lehet beolvasni az el?tagot null névtér URI esetén. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
,	TokenNameCOMMA	
"Nem olvasható be a névtér null el?tag miatt. "	TokenNameStringLiteral	Nem olvasható be a névtér null el?tag miatt. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
,	TokenNameCOMMA	
"A függvény neve nem lehet null."	TokenNameStringLiteral	A függvény neve nem lehet null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
,	TokenNameCOMMA	
"Az aritás nem lehet negatív."	TokenNameStringLiteral	Az aritás nem lehet negatív.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
"'}'-t találtunk, de nincs attribútumsablon megnyitva!"	TokenNameStringLiteral	'}'-t találtunk, de nincs attribútumsablon megnyitva!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
,	TokenNameCOMMA	
"Figyelmeztetés: A count attribútum nem felel meg a egy felmen?nek az xsl:number-ben! Cél = {0}"	TokenNameStringLiteral	Figyelmeztetés: A count attribútum nem felel meg a egy felmen?nek az xsl:number-ben! Cél = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
,	TokenNameCOMMA	
"Régi szintaktika: Az 'expr' attribútum neve 'select'-re változott."	TokenNameStringLiteral	Régi szintaktika: Az 'expr' attribútum neve 'select'-re változott.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
,	TokenNameCOMMA	
"Az Xalan még nem kezeli a locale nevet a format-number függvényben."	TokenNameStringLiteral	Az Xalan még nem kezeli a locale nevet a format-number függvényben.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
,	TokenNameCOMMA	
"Figyelmeztetés: Nem található az xml:lang={0} értékhez tartozó locale"	TokenNameStringLiteral	Figyelmeztetés: Nem található az xml:lang={0} értékhez tartozó locale
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Nem készíthet? URL ebb?l: {0}"	TokenNameStringLiteral	Nem készíthet? URL ebb?l: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
,	TokenNameCOMMA	
"A kér dokumentum nem tölthet? be: {0}"	TokenNameStringLiteral	A kér dokumentum nem tölthet? be: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
"Nem található Collator a <sort xml:lang={0}-hez"	TokenNameStringLiteral	Nem található Collator a <sort xml:lang={0}-hez
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
,	TokenNameCOMMA	
"Régi szintaktika: a functions utasítás {0} URL-t kell használjon"	TokenNameStringLiteral	Régi szintaktika: a functions utasítás {0} URL-t kell használjon
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
,	TokenNameCOMMA	
"a kódolás nem támogatott: {0}, UTF-8-at használunk"	TokenNameStringLiteral	a kódolás nem támogatott: {0}, UTF-8-at használunk
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
,	TokenNameCOMMA	
"a kódolás nem támogatott: {0}, Java {1}-t használunk"	TokenNameStringLiteral	a kódolás nem támogatott: {0}, Java {1}-t használunk
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
,	TokenNameCOMMA	
"Specifikussági konfliktust találtunk: {0} A stíluslapon legutoljára megtaláltat használjuk."	TokenNameStringLiteral	Specifikussági konfliktust találtunk: {0} A stíluslapon legutoljára megtaláltat használjuk.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
,	TokenNameCOMMA	
"========= {0} elemzése és el?készítése =========="	TokenNameStringLiteral	========= {0} elemzése és el?készítése ==========
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
"Attr sablon, {0}"	TokenNameStringLiteral	Attr sablon, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
,	TokenNameCOMMA	
"Illesztési konfliktus az xsl:strip-space és az xsl:preserve-space között"	TokenNameStringLiteral	Illesztési konfliktus az xsl:strip-space és az xsl:preserve-space között
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
,	TokenNameCOMMA	
"A Xalan még nem kezeli a(z) {0} attribútumot!"	TokenNameStringLiteral	A Xalan még nem kezeli a(z) {0} attribútumot!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
"Nem találtuk meg a deklarációt a decimális formátumhoz: {0}"	TokenNameStringLiteral	Nem találtuk meg a deklarációt a decimális formátumhoz: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
,	TokenNameCOMMA	
"Hiányzó vagy helytelen XSLT névtér. "	TokenNameStringLiteral	Hiányzó vagy helytelen XSLT névtér. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
,	TokenNameCOMMA	
"Csak az alapértelmezett xsl:decimal-format deklaráció megengedett."	TokenNameStringLiteral	Csak az alapértelmezett xsl:decimal-format deklaráció megengedett.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
,	TokenNameCOMMA	
"Az xsl:decimal-format neveknek egyedieknek kell lenniük. A(z) "{0}" név meg lett ismételve."	TokenNameStringLiteral	Az xsl:decimal-format neveknek egyedieknek kell lenniük. A(z) "{0}" név meg lett ismételve.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"A(z) {0}-nak érvénytelen attribútuma van: {1}"	TokenNameStringLiteral	A(z) {0}-nak érvénytelen attribútuma van: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
"Nem lehet feloldani a névtér el?tagot: {0}. A csomópont figyelmen kívül marad."	TokenNameStringLiteral	Nem lehet feloldani a névtér el?tagot: {0}. A csomópont figyelmen kívül marad.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"Az xsl:stylesheet-nek kell legyen 'version' attribútuma!"	TokenNameStringLiteral	Az xsl:stylesheet-nek kell legyen 'version' attribútuma!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
,	TokenNameCOMMA	
"Nem megengedett attribútumnév: {0}"	TokenNameStringLiteral	Nem megengedett attribútumnév: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Tiltott értéket használt a(z) {0} attribútumhoz: {1}"	TokenNameStringLiteral	Tiltott értéket használt a(z) {0} attribútumhoz: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
,	TokenNameCOMMA	
"A document függvény második argumentumából el?álló csomóponthalmaz üres. Üres node-készletetet adok vissza."	TokenNameStringLiteral	A document függvény második argumentumából el?álló csomóponthalmaz üres. Üres node-készletetet adok vissza.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. 	TokenNameCOMMENT_LINE	and must not be translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"A(z) xsl:processing-instruction név 'name' attribútuma nem lehet 'xml'"	TokenNameStringLiteral	A(z) xsl:processing-instruction név 'name' attribútuma nem lehet 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. "NCName" is an XML data-type and must not be 	TokenNameCOMMENT_LINE	and must not be translated. "NCName" is an XML data-type and must not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"A(z) xsl:processing-instruction név ''name'' attribútuma érvényes NCName kell legyen: {0}"	TokenNameStringLiteral	A(z) xsl:processing-instruction név ''name'' attribútuma érvényes NCName kell legyen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message is reported if the stylesheet that is 	TokenNameCOMMENT_LINE	Note to translators: This message is reported if the stylesheet that is 
// being processed attempted to construct an XML document with an attribute in a 	TokenNameCOMMENT_LINE	being processed attempted to construct an XML document with an attribute in a 
// place other than on an element. The substitution text specifies the name of 	TokenNameCOMMENT_LINE	place other than on an element. The substitution text specifies the name of 
// the attribute. 	TokenNameCOMMENT_LINE	the attribute. 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Nem lehet {0} attribútumat felvenni a gyermek node-ok után vagy miel?tt egy elem létrejönne. Az attribútum figyelmen kívül marad."	TokenNameStringLiteral	Nem lehet {0} attribútumat felvenni a gyermek node-ok után vagy miel?tt egy elem létrejönne. Az attribútum figyelmen kívül marad.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"Kísérlet történt egy objektum módosítására, ahol a módosítások nem megengedettek. "	TokenNameStringLiteral	Kísérlet történt egy objektum módosítására, ahol a módosítások nem megengedettek. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 	TokenNameCOMMENT_LINE	Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"hu"	TokenNameStringLiteral	hu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"hu"	TokenNameStringLiteral	hu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"hu"	TokenNameStringLiteral	hu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"A createMessage paramétere nincs a megfelel? tartományban"	TokenNameStringLiteral	A createMessage paramétere nincs a megfelel? tartományban
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Kivétel történt a messageFormat hívás alatt"	TokenNameStringLiteral	Kivétel történt a messageFormat hívás alatt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Xalan verzió "	TokenNameStringLiteral	>>>>>>> Xalan verzió 
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
"igen"	TokenNameStringLiteral	igen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Sor #"	TokenNameStringLiteral	Sor #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Oszlop #"	TokenNameStringLiteral	Oszlop #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: kész"	TokenNameStringLiteral	XSLProcessor: kész
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following messages provide usage information 	TokenNameCOMMENT_LINE	Note to translators: The following messages provide usage information 
// for the Xalan Process command line. "Process" is the name of a Java class, 	TokenNameCOMMENT_LINE	for the Xalan Process command line. "Process" is the name of a Java class, 
// and should not be translated. 	TokenNameCOMMENT_LINE	and should not be translated. 
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Xalan-J parancssori Process osztály opciók:"	TokenNameStringLiteral	Xalan-J parancssori Process osztály opciók:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Xalan-J parancssori Process osztály opciók:"	TokenNameStringLiteral	Xalan-J parancssori Process osztály opciók:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xsltc_option"	TokenNameStringLiteral	xslProc_invalid_xsltc_option
,	TokenNameCOMMA	
"A(z) {0} opció nem támogatott XSLTC módban."	TokenNameStringLiteral	A(z) {0} opció nem támogatott XSLTC módban.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xalan_option"	TokenNameStringLiteral	xslProc_invalid_xalan_option
,	TokenNameCOMMA	
"A(z) {0} opció csak -XSLTC-vel együtt használható."	TokenNameStringLiteral	A(z) {0} opció csak -XSLTC-vel együtt használható.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_no_input"	TokenNameStringLiteral	xslProc_no_input
,	TokenNameCOMMA	
"Hiba: Nem adott meg stíluslapot vagy bemeneti xml-t. Futtassa ezt a parancsot kapcsolók nélkül a használati utasítások megjelenítésére."	TokenNameStringLiteral	Hiba: Nem adott meg stíluslapot vagy bemeneti xml-t. Futtassa ezt a parancsot kapcsolók nélkül a használati utasítások megjelenítésére.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_common_options"	TokenNameStringLiteral	xslProc_common_options
,	TokenNameCOMMA	
"-Általános opciók-"	TokenNameStringLiteral	-Általános opciók-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xalan_options"	TokenNameStringLiteral	xslProc_xalan_options
,	TokenNameCOMMA	
"-Xalan opciók-"	TokenNameStringLiteral	-Xalan opciók-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xsltc_options"	TokenNameStringLiteral	xslProc_xsltc_options
,	TokenNameCOMMA	
"-XSLTC opciók-"	TokenNameStringLiteral	-XSLTC opciók-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_return_to_continue"	TokenNameStringLiteral	xslProc_return_to_continue
,	TokenNameCOMMA	
"(nyomja la a <return> gombot a folytatáshoz)"	TokenNameStringLiteral	(nyomja la a <return> gombot a folytatáshoz)
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
" [-XSLTC (XSLTC-t használ a transzformáláshoz)]"	TokenNameStringLiteral	 [-XSLTC (XSLTC-t használ a transzformáláshoz)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
" [-IN bemenetiXMLURL]"	TokenNameStringLiteral	 [-IN bemenetiXMLURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXSL"	TokenNameStringLiteral	optionXSL
,	TokenNameCOMMA	
" [-XSL XSLTranszformációsURL]"	TokenNameStringLiteral	 [-XSL XSLTranszformációsURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionOUT"	TokenNameStringLiteral	optionOUT
,	TokenNameCOMMA	
" [-OUT kimenetiFájlnév]"	TokenNameStringLiteral	 [-OUT kimenetiFájlnév]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCIN"	TokenNameStringLiteral	optionLXCIN
,	TokenNameCOMMA	
" [-LXCIN lefordítottstíluslapFájlnévBe]"	TokenNameStringLiteral	 [-LXCIN lefordítottstíluslapFájlnévBe]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCOUT"	TokenNameStringLiteral	optionLXCOUT
,	TokenNameCOMMA	
" [-LXCOUT lefordítottStíluslapFájlnévKi]"	TokenNameStringLiteral	 [-LXCOUT lefordítottStíluslapFájlnévKi]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARSER"	TokenNameStringLiteral	optionPARSER
,	TokenNameCOMMA	
" [-PARSER az értelmez?kapcsolat teljesen meghatározott osztályneve]"	TokenNameStringLiteral	 [-PARSER az értelmez?kapcsolat teljesen meghatározott osztályneve]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionE"	TokenNameStringLiteral	optionE
,	TokenNameCOMMA	
" [-E (Nem bontja ki az entitás hivatkozásokat)]"	TokenNameStringLiteral	 [-E (Nem bontja ki az entitás hivatkozásokat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionV"	TokenNameStringLiteral	optionV
,	TokenNameCOMMA	
" [-E (Nem bontja ki az entitás hivatkozásokat)]"	TokenNameStringLiteral	 [-E (Nem bontja ki az entitás hivatkozásokat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQC"	TokenNameStringLiteral	optionQC
,	TokenNameCOMMA	
" [-QC (Csendes mintakonfliktus figyelmeztetések)]"	TokenNameStringLiteral	 [-QC (Csendes mintakonfliktus figyelmeztetések)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQ"	TokenNameStringLiteral	optionQ
,	TokenNameCOMMA	
" [-Q (Csendes mód)]"	TokenNameStringLiteral	 [-Q (Csendes mód)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLF"	TokenNameStringLiteral	optionLF
,	TokenNameCOMMA	
" [-LF (A soremeléseket csak kimenet esetén használja {alapértelmezés: CR/LF})]"	TokenNameStringLiteral	 [-LF (A soremeléseket csak kimenet esetén használja {alapértelmezés: CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCR"	TokenNameStringLiteral	optionCR
,	TokenNameCOMMA	
" [-CR (A kocsivissza karaktert csak kimenet esetén használja {alapértelmezés: CR/LF})]"	TokenNameStringLiteral	 [-CR (A kocsivissza karaktert csak kimenet esetén használja {alapértelmezés: CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionESCAPE"	TokenNameStringLiteral	optionESCAPE
,	TokenNameCOMMA	
" [-ESCAPE (Mely karaktereket kell escape-elni {alapértelmezés: <>&"'\r\n}]"	TokenNameStringLiteral	 [-ESCAPE (Mely karaktereket kell escape-elni {alapértelmezés: <>&"'\r\n}]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINDENT"	TokenNameStringLiteral	optionINDENT
,	TokenNameCOMMA	
" [-INDENT (Meghatározza, hogy hány szóközzel kell beljebb kezdeni {alapértelmezés: 0})]"	TokenNameStringLiteral	 [-INDENT (Meghatározza, hogy hány szóközzel kell beljebb kezdeni {alapértelmezés: 0})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTT"	TokenNameStringLiteral	optionTT
,	TokenNameCOMMA	
" [-TT (Nyomköveti a sablonokat, ahogy azokat meghívják.)]"	TokenNameStringLiteral	 [-TT (Nyomköveti a sablonokat, ahogy azokat meghívják.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTG"	TokenNameStringLiteral	optionTG
,	TokenNameCOMMA	
" [-TG (Nyomköveti az összes generálási eseményt.)]"	TokenNameStringLiteral	 [-TG (Nyomköveti az összes generálási eseményt.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTS"	TokenNameStringLiteral	optionTS
,	TokenNameCOMMA	
" [-TS (Nyomköveti az összes kiválasztási eseményt.)]"	TokenNameStringLiteral	 [-TS (Nyomköveti az összes kiválasztási eseményt.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTTC"	TokenNameStringLiteral	optionTTC
,	TokenNameCOMMA	
" [-TTC (Nyomköveti a sablon-leszármazottakat, ahogy azokat feldolgozzák.)]"	TokenNameStringLiteral	 [-TTC (Nyomköveti a sablon-leszármazottakat, ahogy azokat feldolgozzák.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTCLASS"	TokenNameStringLiteral	optionTCLASS
,	TokenNameCOMMA	
" [-TCLASS (TraceListener osztály a nyomkövetési kiterjesztésekhez.)]"	TokenNameStringLiteral	 [-TCLASS (TraceListener osztály a nyomkövetési kiterjesztésekhez.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionVALIDATE"	TokenNameStringLiteral	optionVALIDATE
,	TokenNameCOMMA	
" [-VALIDATE (Beállítja, hogy legyen-e érvényességvizsgálat. Alapértelmezésben nincs érvényességvizsgálat.)]"	TokenNameStringLiteral	 [-VALIDATE (Beállítja, hogy legyen-e érvényességvizsgálat. Alapértelmezésben nincs érvényességvizsgálat.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionEDUMP"	TokenNameStringLiteral	optionEDUMP
,	TokenNameCOMMA	
" [-EDUMP {opcionális fájlnév} (Hibánál stackdump-ot hajt végre.)]"	TokenNameStringLiteral	 [-EDUMP {opcionális fájlnév} (Hibánál stackdump-ot hajt végre.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXML"	TokenNameStringLiteral	optionXML
,	TokenNameCOMMA	
" [-XML (XML formázó használata és XML fejléc hozzáadása.)]"	TokenNameStringLiteral	 [-XML (XML formázó használata és XML fejléc hozzáadása.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTEXT"	TokenNameStringLiteral	optionTEXT
,	TokenNameCOMMA	
" [-TEXT (Egyszer? szövegformázó használata.)]"	TokenNameStringLiteral	 [-TEXT (Egyszer? szövegformázó használata.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionHTML"	TokenNameStringLiteral	optionHTML
,	TokenNameCOMMA	
" [-HTML (HTML formázó használata.)]"	TokenNameStringLiteral	 [-HTML (HTML formázó használata.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARAM"	TokenNameStringLiteral	optionPARAM
,	TokenNameCOMMA	
" [-PARAM név kifejezés (Beállít egy stíluslap paramétert)]"	TokenNameStringLiteral	 [-PARAM név kifejezés (Beállít egy stíluslap paramétert)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"Az XSL folyamat sikertelen volt."	TokenNameStringLiteral	Az XSL folyamat sikertelen volt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** Az értelmez? nem található **"	TokenNameStringLiteral	** Az értelmez? nem található **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Kérem, ellen?rizze az osztály elérési utat."	TokenNameStringLiteral	Kérem, ellen?rizze az osztály elérési utat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Ha önnek nincs meg az IBM Java XML értelmez?je, akkor letöltheti az"	TokenNameStringLiteral	Ha önnek nincs meg az IBM Java XML értelmez?je, akkor letöltheti az
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"az IBM AlphaWorks weblapról: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	az IBM AlphaWorks weblapról: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionURIRESOLVER"	TokenNameStringLiteral	optionURIRESOLVER
,	TokenNameCOMMA	
" [-URIRESOLVER teljes osztálynév (az URIResolver fogja feloldani az URI-kat)]"	TokenNameStringLiteral	 [-URIRESOLVER teljes osztálynév (az URIResolver fogja feloldani az URI-kat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionENTITYRESOLVER"	TokenNameStringLiteral	optionENTITYRESOLVER
,	TokenNameCOMMA	
" [-ENTITYRESOLVER teljes osztálynév (az EntityResolver fogja feloldani az entitásokat)]"	TokenNameStringLiteral	 [-ENTITYRESOLVER teljes osztálynév (az EntityResolver fogja feloldani az entitásokat)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCONTENTHANDLER"	TokenNameStringLiteral	optionCONTENTHANDLER
,	TokenNameCOMMA	
" [-CONTENTHANDLER teljes osztálynév (a ContentHandler fogja sorosítani a kimenetet)]"	TokenNameStringLiteral	 [-CONTENTHANDLER teljes osztálynév (a ContentHandler fogja sorosítani a kimenetet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLINENUMBERS"	TokenNameStringLiteral	optionLINENUMBERS
,	TokenNameCOMMA	
" [-L sorszámokat használ a forrásdokumentumhoz]"	TokenNameStringLiteral	 [-L sorszámokat használ a forrásdokumentumhoz]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSECUREPROCESSING"	TokenNameStringLiteral	optionSECUREPROCESSING
,	TokenNameCOMMA	
" [-SECURE (biztonságos feldolgozás szolgáltatás igazra állítása.)]"	TokenNameStringLiteral	 [-SECURE (biztonságos feldolgozás szolgáltatás igazra állítása.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
"optionMEDIA"	TokenNameStringLiteral	optionMEDIA
,	TokenNameCOMMA	
" [-MEDIA adathordozóTípus (a media attribútum segítségével megkeresi a dokumentumhoz tartozó stíluslapot.)]"	TokenNameStringLiteral	 [-MEDIA adathordozóTípus (a media attribútum segítségével megkeresi a dokumentumhoz tartozó stíluslapot.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionFLAVOR"	TokenNameStringLiteral	optionFLAVOR
,	TokenNameCOMMA	
" [-FLAVOR ízlésNév (Explicit használja az s2s=SAX-ot vagy d2d=DOM-ot a transzformációhoz.)] "	TokenNameStringLiteral	 [-FLAVOR ízlésNév (Explicit használja az s2s=SAX-ot vagy d2d=DOM-ot a transzformációhoz.)] 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Added by sboag/scurcuru; experimental 	TokenNameCOMMENT_LINE	Added by sboag/scurcuru; experimental 
{	TokenNameLBRACE	
"optionDIAG"	TokenNameStringLiteral	optionDIAG
,	TokenNameCOMMA	
" [-DIAG (Kiírja, hogy összesen hány ezredmásodpercig tartott a transzformáció.)]"	TokenNameStringLiteral	 [-DIAG (Kiírja, hogy összesen hány ezredmásodpercig tartott a transzformáció.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINCREMENTAL"	TokenNameStringLiteral	optionINCREMENTAL
,	TokenNameCOMMA	
" [-INCREMENTAL (növekményes DTM létrehozást igényel a http://xml.apache.org/xalan/features/incremental igazra állításával.)]"	TokenNameStringLiteral	 [-INCREMENTAL (növekményes DTM létrehozást igényel a http://xml.apache.org/xalan/features/incremental igazra állításával.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionNOOPTIMIMIZE"	TokenNameStringLiteral	optionNOOPTIMIMIZE
,	TokenNameCOMMA	
" [-NOOPTIMIMIZE (nem igényel stíluslap optimizálást a http://xml.apache.org/xalan/features/optimize hamisra állítását.)]"	TokenNameStringLiteral	 [-NOOPTIMIMIZE (nem igényel stíluslap optimizálást a http://xml.apache.org/xalan/features/optimize hamisra állítását.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionRL"	TokenNameStringLiteral	optionRL
,	TokenNameCOMMA	
" [-RL rekurziókorlát (numerikusan korlátozza a stíluslap rekurzió mélységét.)]"	TokenNameStringLiteral	 [-RL rekurziókorlát (numerikusan korlátozza a stíluslap rekurzió mélységét.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXO"	TokenNameStringLiteral	optionXO
,	TokenNameCOMMA	
" [-XO [transletNeve] (a nevet rendeli a generált translethez)]"	TokenNameStringLiteral	 [-XO [transletNeve] (a nevet rendeli a generált translethez)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXD"	TokenNameStringLiteral	optionXD
,	TokenNameCOMMA	
" [-XD célAlkönyvtár (a translet cél-alkönyvtára)]"	TokenNameStringLiteral	 [-XD célAlkönyvtár (a translet cél-alkönyvtára)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXJ"	TokenNameStringLiteral	optionXJ
,	TokenNameCOMMA	
" [-XJ jarfájl (a translet osztályokat a megadott <jarfájl>-ba csomagolja)]"	TokenNameStringLiteral	 [-XJ jarfájl (a translet osztályokat a megadott <jarfájl>-ba csomagolja)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXP"	TokenNameStringLiteral	optionXP
,	TokenNameCOMMA	
" [-XP csomag (megadja a generált translet osztályok név-prefixét)]"	TokenNameStringLiteral	 [-XP csomag (megadja a generált translet osztályok név-prefixét)]
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
" [-XN (engedélyezi a template inlining optimalizálást)]"	TokenNameStringLiteral	 [-XN (engedélyezi a template inlining optimalizálást)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXX"	TokenNameStringLiteral	optionXX
,	TokenNameCOMMA	
" [-XX (bekapcsolja a további hibakeresési kimenetet)]"	TokenNameStringLiteral	 [-XX (bekapcsolja a további hibakeresési kimenetet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXT"	TokenNameStringLiteral	optionXT
,	TokenNameCOMMA	
" [-XT (translet-et használt az átalakításhoz, ha lehet)]"	TokenNameStringLiteral	 [-XT (translet-et használt az átalakításhoz, ha lehet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"diagTiming"	TokenNameStringLiteral	diagTiming
,	TokenNameCOMMA	
" --------- A(z) {0} tarnszformációa a(z) {1}-el {2} ms-ig tartott"	TokenNameStringLiteral	 --------- A(z) {0} tarnszformációa a(z) {1}-el {2} ms-ig tartott
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"recursionTooDeep"	TokenNameStringLiteral	recursionTooDeep
,	TokenNameCOMMA	
"A sablonon egymásba ágyazása túl mély. Beágyazás = {0}, sablon: {1} {2}"	TokenNameStringLiteral	A sablonon egymásba ágyazása túl mély. Beágyazás = {0}, sablon: {1} {2}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nameIs"	TokenNameStringLiteral	nameIs
,	TokenNameCOMMA	
"A név:"	TokenNameStringLiteral	A név:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"matchPatternIs"	TokenNameStringLiteral	matchPatternIs
,	TokenNameCOMMA	
"Az illeszkedési minta:"	TokenNameStringLiteral	Az illeszkedési minta:
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
"Hiba: "	TokenNameStringLiteral	Hiba: 
;	TokenNameSEMICOLON	
/** String to prepend to warning messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to warning messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Figyelmeztetés: "	TokenNameStringLiteral	Figyelmeztetés: 
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
"MINTA "	TokenNameStringLiteral	MINTA 
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
"hu"	TokenNameStringLiteral	hu
,	TokenNameCOMMA	
"HU"	TokenNameStringLiteral	HU
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
