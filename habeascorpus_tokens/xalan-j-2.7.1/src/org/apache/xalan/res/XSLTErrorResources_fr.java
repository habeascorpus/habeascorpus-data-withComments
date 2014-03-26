/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTErrorResources_fr.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTErrorResources_fr.java 468641 2006-10-28 06:54:42Z minchau $ 
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
XSLTErrorResources_fr	TokenNameIdentifier	 XSLT Error Resources fr
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
"Erreur : '{' interdit dans une expression"	TokenNameStringLiteral	Erreur : '{' interdit dans une expression
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} comporte un attribut incorrect : {1}"	TokenNameStringLiteral	{0} comporte un attribut incorrect : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
,	TokenNameCOMMA	
"sourceNode est vide dans xsl:apply-imports !"	TokenNameStringLiteral	sourceNode est vide dans xsl:apply-imports !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
"Impossible d''ajouter {0} à {1}"	TokenNameStringLiteral	Impossible d''ajouter {0} à {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
,	TokenNameCOMMA	
"sourceNode est vide dans handleApplyTemplatesInstruction !"	TokenNameStringLiteral	sourceNode est vide dans handleApplyTemplatesInstruction !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
,	TokenNameCOMMA	
"{0} doit posséder un attribut de nom."	TokenNameStringLiteral	{0} doit posséder un attribut de nom.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
"Impossible de trouver le modèle : {0}"	TokenNameStringLiteral	Impossible de trouver le modèle : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
,	TokenNameCOMMA	
"Impossible de convertir l'AVT du nom dans xsl:call-template."	TokenNameStringLiteral	Impossible de convertir l'AVT du nom dans xsl:call-template.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
"{0} requiert l''attribut : {1}"	TokenNameStringLiteral	{0} requiert l''attribut : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
,	TokenNameCOMMA	
"{0} doit avoir un attribut ''test''."	TokenNameStringLiteral	{0} doit avoir un attribut ''test''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
,	TokenNameCOMMA	
"Valeur erronée dans l''attribut de niveau : {0}"	TokenNameStringLiteral	Valeur erronée dans l''attribut de niveau : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"Le nom de l'instruction de traitement ne peut être 'xml'"	TokenNameStringLiteral	Le nom de l'instruction de traitement ne peut être 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"Le nom de l''instruction de traitement doit être un NCName valide : {0}"	TokenNameStringLiteral	Le nom de l''instruction de traitement doit être un NCName valide : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} doit posséder un attribut de correspondance s''il possède un mode."	TokenNameStringLiteral	{0} doit posséder un attribut de correspondance s''il possède un mode.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} requiert un nom ou un attribut de correspondance."	TokenNameStringLiteral	{0} requiert un nom ou un attribut de correspondance.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
,	TokenNameCOMMA	
"Impossible de résoudre le préfixe de l''espace de noms : {0}"	TokenNameStringLiteral	Impossible de résoudre le préfixe de l''espace de noms : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space comporte une valeur non valide : {0}"	TokenNameStringLiteral	xml:space comporte une valeur non valide : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
,	TokenNameCOMMA	
"Le noeud enfant ne possède pas de document propriétaire !"	TokenNameStringLiteral	Le noeud enfant ne possède pas de document propriétaire !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
"Erreur de ElemTemplateElement : {0}"	TokenNameStringLiteral	Erreur de ElemTemplateElement : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
,	TokenNameCOMMA	
"Tentative d'ajout d'un enfant vide !"	TokenNameStringLiteral	Tentative d'ajout d'un enfant vide !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
,	TokenNameCOMMA	
"{0} requiert un attribut de sélection."	TokenNameStringLiteral	{0} requiert un attribut de sélection.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
,	TokenNameCOMMA	
"xsl:when doit posséder un attribut 'test'."	TokenNameStringLiteral	xsl:when doit posséder un attribut 'test'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:with-param doit posséder un attribut 'name'."	TokenNameStringLiteral	xsl:with-param doit posséder un attribut 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
,	TokenNameCOMMA	
"Le contexte ne possède pas de document propriétaire !"	TokenNameStringLiteral	Le contexte ne possède pas de document propriétaire !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
,	TokenNameCOMMA	
"Impossible de créer XML TransformerFactory Liaison : {0}"	TokenNameStringLiteral	Impossible de créer XML TransformerFactory Liaison : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Echec du processus Xalan."	TokenNameStringLiteral	Echec du processus Xalan.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Echec de Xalan."	TokenNameStringLiteral	Echec de Xalan.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Encodage non pris en charge : {0}"	TokenNameStringLiteral	Encodage non pris en charge : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
,	TokenNameCOMMA	
"Impossible de créer TraceListener : {0}"	TokenNameStringLiteral	Impossible de créer TraceListener : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:key requiert un attribut 'name' !"	TokenNameStringLiteral	xsl:key requiert un attribut 'name' !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
,	TokenNameCOMMA	
"xsl:key requiert un attribut 'match' !"	TokenNameStringLiteral	xsl:key requiert un attribut 'match' !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
,	TokenNameCOMMA	
"xsl:key requiert un attribut 'use' !"	TokenNameStringLiteral	xsl:key requiert un attribut 'use' !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} requiert un attribut ''elements''"	TokenNameStringLiteral	(StylesheetHandler) {0} requiert un attribut ''elements''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
,	TokenNameCOMMA	
"L''attribut ''prefix'' de (StylesheetHandler) {0} est manquant"	TokenNameStringLiteral	L''attribut ''prefix'' de (StylesheetHandler) {0} est manquant
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
,	TokenNameCOMMA	
"URL de la feuille de style erroné : {0}"	TokenNameStringLiteral	URL de la feuille de style erroné : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
,	TokenNameCOMMA	
"Fichier de la feuille de style introuvable : {0}"	TokenNameStringLiteral	Fichier de la feuille de style introuvable : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
,	TokenNameCOMMA	
"Exception d''E-S avec le fichier de la feuille de style : {0}"	TokenNameStringLiteral	Exception d''E-S avec le fichier de la feuille de style : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) Impossible de trouver d''attribut href pour {0}"	TokenNameStringLiteral	(StylesheetHandler) Impossible de trouver d''attribut href pour {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0} est directement ou indirectement inclus dans lui-même !"	TokenNameStringLiteral	(StylesheetHandler) {0} est directement ou indirectement inclus dans lui-même !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINCLUDE_ERROR	TokenNameIdentifier	 ER  PROCESSINCLUDE  ERROR
,	TokenNameCOMMA	
"Erreur de StylesheetHandler.processInclude, {0}"	TokenNameStringLiteral	Erreur de StylesheetHandler.processInclude, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_LANG_ATTRIB	TokenNameIdentifier	 ER  MISSING  LANG  ATTRIB
,	TokenNameCOMMA	
"L''attribut ''lang'' de (StylesheetHandler) {0} est manquant"	TokenNameStringLiteral	L''attribut ''lang'' de (StylesheetHandler) {0} est manquant
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
,	TokenNameCOMMA	
"(StylesheetHandler) position de l''élément {0} inadéquate ? Elément ''component'' de conteneur manquant"	TokenNameStringLiteral	(StylesheetHandler) position de l''élément {0} inadéquate ? Elément ''component'' de conteneur manquant
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
,	TokenNameCOMMA	
"Seule sortie possible vers Element, DocumentFragment, Document ou PrintWriter."	TokenNameStringLiteral	Seule sortie possible vers Element, DocumentFragment, Document ou PrintWriter.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_ERROR	TokenNameIdentifier	 ER  PROCESS  ERROR
,	TokenNameCOMMA	
"Erreur de StylesheetRoot.process"	TokenNameStringLiteral	Erreur de StylesheetRoot.process
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNIMPLNODE_ERROR	TokenNameIdentifier	 ER  UNIMPLNODE  ERROR
,	TokenNameCOMMA	
"Erreur de UnImplNode : {0}"	TokenNameStringLiteral	Erreur de UnImplNode : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
,	TokenNameCOMMA	
"Erreur ! Impossible de trouver l'expression de sélection xpath (-select)."	TokenNameStringLiteral	Erreur ! Impossible de trouver l'expression de sélection xpath (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
,	TokenNameCOMMA	
"Impossible de sérialiser un XSLProcessor !"	TokenNameStringLiteral	Impossible de sérialiser un XSLProcessor !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
,	TokenNameCOMMA	
"Entrée de feuille de style non spécifiée !"	TokenNameStringLiteral	Entrée de feuille de style non spécifiée !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
,	TokenNameCOMMA	
"Impossible de traiter la feuille de style !"	TokenNameStringLiteral	Impossible de traiter la feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
,	TokenNameCOMMA	
"Impossible d''analyser le document {0} !"	TokenNameStringLiteral	Impossible d''analyser le document {0} !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
,	TokenNameCOMMA	
"Impossible de trouver le fragment : {0}"	TokenNameStringLiteral	Impossible de trouver le fragment : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
,	TokenNameCOMMA	
"Le noeud désigné par l''identificateur de fragment n''est pas un élément : {0}"	TokenNameStringLiteral	Le noeud désigné par l''identificateur de fragment n''est pas un élément : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"for-each doit posséder un attribut de correspondance ou de nom"	TokenNameStringLiteral	for-each doit posséder un attribut de correspondance ou de nom
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"Les modèles doivent posséder un attribut de correspondance ou de nom"	TokenNameStringLiteral	Les modèles doivent posséder un attribut de correspondance ou de nom
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
,	TokenNameCOMMA	
"Pas de clone dans un fragment de document !"	TokenNameStringLiteral	Pas de clone dans un fragment de document !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
,	TokenNameCOMMA	
"Impossible de créer l''élément dans l''arborescence de résultats : {0}"	TokenNameStringLiteral	Impossible de créer l''élément dans l''arborescence de résultats : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space du source XML possède une valeur incorrecte : {0}"	TokenNameStringLiteral	xml:space du source XML possède une valeur incorrecte : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
"Aucune déclaration xsl:key pour {0} !"	TokenNameStringLiteral	Aucune déclaration xsl:key pour {0} !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
,	TokenNameCOMMA	
"Erreur ! Impossible de créer une URL pour : {0}"	TokenNameStringLiteral	Erreur ! Impossible de créer une URL pour : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
,	TokenNameCOMMA	
"xsl:functions n'est pas pris en charge"	TokenNameStringLiteral	xsl:functions n'est pas pris en charge
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
,	TokenNameCOMMA	
"Erreur TransformerFactory de XSLT"	TokenNameStringLiteral	Erreur TransformerFactory de XSLT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
,	TokenNameCOMMA	
"(StylesheetHandler) {0} n''est pas pris en charge dans une feuille de style !"	TokenNameStringLiteral	(StylesheetHandler) {0} n''est pas pris en charge dans une feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
,	TokenNameCOMMA	
"result-ns n'est plus pris en charge ! Préférez xsl:output."	TokenNameStringLiteral	result-ns n'est plus pris en charge ! Préférez xsl:output.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
,	TokenNameCOMMA	
"default-space n'est plus pris en charge ! Préférez xsl:strip-space ou xsl:preserve-space."	TokenNameStringLiteral	default-space n'est plus pris en charge ! Préférez xsl:strip-space ou xsl:preserve-space.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
,	TokenNameCOMMA	
"indent-result n'est plus pris en charge ! Préférez xsl:output."	TokenNameStringLiteral	indent-result n'est plus pris en charge ! Préférez xsl:output.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} comporte un attribut incorrect : {1}"	TokenNameStringLiteral	(StylesheetHandler) {0} comporte un attribut incorrect : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
,	TokenNameCOMMA	
"Elément XSL inconnu : {0}"	TokenNameStringLiteral	Elément XSL inconnu : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:sort ne peut être utilisé qu'avec xsl:apply-templates ou xsl:for-each."	TokenNameStringLiteral	(StylesheetHandler) xsl:sort ne peut être utilisé qu'avec xsl:apply-templates ou xsl:for-each.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when ne figure pas à la bonne position !"	TokenNameStringLiteral	(StylesheetHandler) xsl:when ne figure pas à la bonne position !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when sans rapport avec xsl:choose !"	TokenNameStringLiteral	(StylesheetHandler) xsl:when sans rapport avec xsl:choose !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise ne figure pas à la bonne position !"	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise ne figure pas à la bonne position !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise sans rapport avec xsl:choose !"	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise sans rapport avec xsl:choose !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
,	TokenNameCOMMA	
"(StylesheetHandler) {0} n''est pas admis dans un modèle !"	TokenNameStringLiteral	(StylesheetHandler) {0} n''est pas admis dans un modèle !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
,	TokenNameCOMMA	
"(StylesheetHandler) {0} préfixe de l''espace de noms de l''extension {1} inconnu"	TokenNameStringLiteral	(StylesheetHandler) {0} préfixe de l''espace de noms de l''extension {1} inconnu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
,	TokenNameCOMMA	
"(StylesheetHandler) Les importations peuvent être effectuées uniquement en tant que premiers éléments de la feuille de style !"	TokenNameStringLiteral	(StylesheetHandler) Les importations peuvent être effectuées uniquement en tant que premiers éléments de la feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0} s''importe lui-même directement ou indirectement !"	TokenNameStringLiteral	(StylesheetHandler) {0} s''importe lui-même directement ou indirectement !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
,	TokenNameCOMMA	
"(StylesheetHandler) xml:space possède une valeur incorrecte : {0}"	TokenNameStringLiteral	(StylesheetHandler) xml:space possède une valeur incorrecte : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Echec de processStylesheet !"	TokenNameStringLiteral	Echec de processStylesheet !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
,	TokenNameCOMMA	
"Exception SAX"	TokenNameStringLiteral	Exception SAX
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// add this message to fix bug 21478 	TokenNameCOMMENT_LINE	add this message to fix bug 21478 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Fonction non prise en charge !"	TokenNameStringLiteral	Fonction non prise en charge !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
,	TokenNameCOMMA	
"Erreur XSLT"	TokenNameStringLiteral	Erreur XSLT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
,	TokenNameCOMMA	
"Tout symbole monétaire est interdit dans une chaîne de motif de correspondance"	TokenNameStringLiteral	Tout symbole monétaire est interdit dans une chaîne de motif de correspondance
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
,	TokenNameCOMMA	
"Fonction de document non prise en charge dans le DOM de la feuille de style !"	TokenNameStringLiteral	Fonction de document non prise en charge dans le DOM de la feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
,	TokenNameCOMMA	
"Impossible de résoudre le préfixe du solveur !"	TokenNameStringLiteral	Impossible de résoudre le préfixe du solveur !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
,	TokenNameCOMMA	
"Extension de redirection : Impossible d'extraire le nom du fichier - l'attribut de fichier ou de sélection doit retourner une chaîne valide."	TokenNameStringLiteral	Extension de redirection : Impossible d'extraire le nom du fichier - l'attribut de fichier ou de sélection doit retourner une chaîne valide.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
,	TokenNameCOMMA	
"Impossible de créer FormatterListener dans une extension Redirect !"	TokenNameStringLiteral	Impossible de créer FormatterListener dans une extension Redirect !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
,	TokenNameCOMMA	
"Préfixe de exclude-result-prefixes non valide : {0}"	TokenNameStringLiteral	Préfixe de exclude-result-prefixes non valide : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
,	TokenNameCOMMA	
"URI de l'espace de noms manquant pour le préfixe indiqué"	TokenNameStringLiteral	URI de l'espace de noms manquant pour le préfixe indiqué
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
,	TokenNameCOMMA	
"Argument manquant pour l''option : {0}"	TokenNameStringLiteral	Argument manquant pour l''option : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
,	TokenNameCOMMA	
"Option incorrecte : {0}"	TokenNameStringLiteral	Option incorrecte : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
"Chaîne de format mal formée : {0}"	TokenNameStringLiteral	Chaîne de format mal formée : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet requiert un attribut 'version' !"	TokenNameStringLiteral	xsl:stylesheet requiert un attribut 'version' !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"L''attribut : {0} possède une valeur non valide : {1}"	TokenNameStringLiteral	L''attribut : {0} possède une valeur non valide : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
,	TokenNameCOMMA	
"xsl:choose requiert xsl:when"	TokenNameStringLiteral	xsl:choose requiert xsl:when
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
,	TokenNameCOMMA	
"xsl:apply-imports interdit dans un xsl:for-each"	TokenNameStringLiteral	xsl:apply-imports interdit dans un xsl:for-each
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
,	TokenNameCOMMA	
"Impossible d'utiliser DTMLiaison pour un noeud de DOM en sortie... Transmettez org.apache.xpath.DOM2Helper à la place !"	TokenNameStringLiteral	Impossible d'utiliser DTMLiaison pour un noeud de DOM en sortie... Transmettez org.apache.xpath.DOM2Helper à la place !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
,	TokenNameCOMMA	
"Impossible d'utiliser DTMLiaison pour un noeud de DOM en entrée... Transmettez org.apache.xpath.DOM2Helper à la place !"	TokenNameStringLiteral	Impossible d'utiliser DTMLiaison pour un noeud de DOM en entrée... Transmettez org.apache.xpath.DOM2Helper à la place !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
,	TokenNameCOMMA	
"Echec de l''appel de l''élément d''extension : {0}"	TokenNameStringLiteral	Echec de l''appel de l''élément d''extension : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Le préfixe doit se convertir en espace de noms : {0}"	TokenNameStringLiteral	Le préfixe doit se convertir en espace de noms : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Substitut UTF-16 non valide détecté : {0} ?"	TokenNameStringLiteral	Substitut UTF-16 non valide détecté : {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
,	TokenNameCOMMA	
"xsl:attribute-set {0} s''utilise lui-même, ce qui provoque une boucle infinie."	TokenNameStringLiteral	xsl:attribute-set {0} s''utilise lui-même, ce qui provoque une boucle infinie.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
,	TokenNameCOMMA	
"Impossible de mélanger une entrée autre que Xerces-DOM avec une sortie Xerces-DOM !"	TokenNameStringLiteral	Impossible de mélanger une entrée autre que Xerces-DOM avec une sortie Xerces-DOM !
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
"Dans ElemTemplateElement.readObject : {0}"	TokenNameStringLiteral	Dans ElemTemplateElement.readObject : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
,	TokenNameCOMMA	
"Plusieurs modèles s''appellent : {0}"	TokenNameStringLiteral	Plusieurs modèles s''appellent : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
,	TokenNameCOMMA	
"Appel de fonction non valide : appels de key() récursifs interdits"	TokenNameStringLiteral	Appel de fonction non valide : appels de key() récursifs interdits
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
"La variable {0} fait référence à elle-même directement ou indirectement !"	TokenNameStringLiteral	La variable {0} fait référence à elle-même directement ou indirectement !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
"Le noeud d'entrée ne peut être vide pour un DOMSource de newTemplates !"	TokenNameStringLiteral	Le noeud d'entrée ne peut être vide pour un DOMSource de newTemplates !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
,	TokenNameCOMMA	
"Fichier de classe introuvable pour l''option {0}"	TokenNameStringLiteral	Fichier de classe introuvable pour l''option {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
"Elément requis introuvable : {0}"	TokenNameStringLiteral	Elément requis introuvable : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputStream ne doit pas être vide"	TokenNameStringLiteral	InputStream ne doit pas être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
,	TokenNameCOMMA	
"L'URI ne doit pas être vide"	TokenNameStringLiteral	L'URI ne doit pas être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Le fichier ne doit pas être vide"	TokenNameStringLiteral	Le fichier ne doit pas être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputSource ne doit pas être vide"	TokenNameStringLiteral	InputSource ne doit pas être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
"Impossible d'initialiser le gestionnaire de BSF"	TokenNameStringLiteral	Impossible d'initialiser le gestionnaire de BSF
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
"Impossible de compiler l'extension"	TokenNameStringLiteral	Impossible de compiler l'extension
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
"Impossible de créer l''extension : {0} en raison de : {1}"	TokenNameStringLiteral	Impossible de créer l''extension : {0} en raison de : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
,	TokenNameCOMMA	
"L''appel de la méthode d''instance de la méthode {0} requiert une instance d''Object comme premier argument"	TokenNameStringLiteral	L''appel de la méthode d''instance de la méthode {0} requiert une instance d''Object comme premier argument
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
,	TokenNameCOMMA	
"Nom d''élément non valide spécifié {0}"	TokenNameStringLiteral	Nom d''élément non valide spécifié {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
,	TokenNameCOMMA	
"La méthode de nom d''élément doit être statique {0}"	TokenNameStringLiteral	La méthode de nom d''élément doit être statique {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
"La fonction d''extension {0} : {1} est inconnue"	TokenNameStringLiteral	La fonction d''extension {0} : {1} est inconnue
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
,	TokenNameCOMMA	
"Plusieurs occurrences proches pour le constructeur de {0}"	TokenNameStringLiteral	Plusieurs occurrences proches pour le constructeur de {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
,	TokenNameCOMMA	
"Plusieurs occurrences proches pour la méthode {0}"	TokenNameStringLiteral	Plusieurs occurrences proches pour la méthode {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
"Plusieurs occurrences proches pour la méthode d''élément {0}"	TokenNameStringLiteral	Plusieurs occurrences proches pour la méthode d''élément {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
,	TokenNameCOMMA	
"Contexte non valide transmis pour évaluer {0}"	TokenNameStringLiteral	Contexte non valide transmis pour évaluer {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
"Pool déjà existant"	TokenNameStringLiteral	Pool déjà existant
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
,	TokenNameCOMMA	
"Aucun nom de périphérique indiqué"	TokenNameStringLiteral	Aucun nom de périphérique indiqué
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
,	TokenNameCOMMA	
"Aucune URL spécifiée"	TokenNameStringLiteral	Aucune URL spécifiée
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
,	TokenNameCOMMA	
"La taille du pool est inférieure à 1 !"	TokenNameStringLiteral	La taille du pool est inférieure à 1 !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
,	TokenNameCOMMA	
"Nom de pilote non valide spécifié !"	TokenNameStringLiteral	Nom de pilote non valide spécifié !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
"Impossible de trouver la racine de la feuille de style !"	TokenNameStringLiteral	Impossible de trouver la racine de la feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
"Valeur incorrecte pour xml:space"	TokenNameStringLiteral	Valeur incorrecte pour xml:space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
"Echec de processFromNode"	TokenNameStringLiteral	Echec de processFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"La ressource [ {0} ] n''a pas pu charger : {1} {2} {3}"	TokenNameStringLiteral	La ressource [ {0} ] n''a pas pu charger : {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Taille du tampon <=0"	TokenNameStringLiteral	Taille du tampon <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
,	TokenNameCOMMA	
"Erreur inconnue lors de l'appel de l'extension"	TokenNameStringLiteral	Erreur inconnue lors de l'appel de l'extension
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
"Le préfixe {0} ne possède pas de déclaration d''espace de noms correspondante"	TokenNameStringLiteral	Le préfixe {0} ne possède pas de déclaration d''espace de noms correspondante
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
"Contenu d''élément interdit pour lang=javaclass {0}"	TokenNameStringLiteral	Contenu d''élément interdit pour lang=javaclass {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
"La feuille de style a provoqué l'arrêt"	TokenNameStringLiteral	La feuille de style a provoqué l'arrêt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
,	TokenNameCOMMA	
"1 ou 2"	TokenNameStringLiteral	1 ou 2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 ou 3"	TokenNameStringLiteral	2 ou 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Impossible de charger {0} (vérifier CLASSPATH), les valeurs par défaut sont donc employées"	TokenNameStringLiteral	Impossible de charger {0} (vérifier CLASSPATH), les valeurs par défaut sont donc employées
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
,	TokenNameCOMMA	
"Impossible d'initialiser les modèles par défaut"	TokenNameStringLiteral	Impossible d'initialiser les modèles par défaut
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"Le résultat doit être vide"	TokenNameStringLiteral	Le résultat doit être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
"Le résultat ne peut être défini"	TokenNameStringLiteral	Le résultat ne peut être défini
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Aucune sortie spécifiée"	TokenNameStringLiteral	Aucune sortie spécifiée
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
"Transformation impossible vers un résultat de type {0}"	TokenNameStringLiteral	Transformation impossible vers un résultat de type {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
"Impossible de transformer une source de type {0}"	TokenNameStringLiteral	Impossible de transformer une source de type {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
"Gestionnaire de contenu vide"	TokenNameStringLiteral	Gestionnaire de contenu vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Gestionnaire d'erreurs vide"	TokenNameStringLiteral	Gestionnaire d'erreurs vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
,	TokenNameCOMMA	
"L'analyse ne peut être appelée si le ContentHandler n'a pas été défini"	TokenNameStringLiteral	L'analyse ne peut être appelée si le ContentHandler n'a pas été défini
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
,	TokenNameCOMMA	
"Pas de parent pour le filtre"	TokenNameStringLiteral	Pas de parent pour le filtre
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
,	TokenNameCOMMA	
"Aucune feuille de style dans : {0}, support = {1}"	TokenNameStringLiteral	Aucune feuille de style dans : {0}, support = {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
,	TokenNameCOMMA	
"Pas de PI xml-stylesheet dans : {0}"	TokenNameStringLiteral	Pas de PI xml-stylesheet dans : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Non pris en charge : {0}"	TokenNameStringLiteral	Non pris en charge : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
,	TokenNameCOMMA	
"La valeur de la propriété {0} doit être une instance booléenne"	TokenNameStringLiteral	La valeur de la propriété {0} doit être une instance booléenne
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
"Impossible d''extraire le script externe à {0}"	TokenNameStringLiteral	Impossible d''extraire le script externe à {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"La ressource [ {0} ] est introuvable. {1}"	TokenNameStringLiteral	La ressource [ {0} ] est introuvable. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
"Propriété de sortie non identifiée : {0}"	TokenNameStringLiteral	Propriété de sortie non identifiée : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
,	TokenNameCOMMA	
"Impossible de créer une instance de ElemLiteralResult"	TokenNameStringLiteral	Impossible de créer une instance de ElemLiteralResult
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 	TokenNameCOMMENT_LINE	Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 
// In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 	TokenNameCOMMENT_LINE	In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 
//in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 	TokenNameCOMMENT_LINE	in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 
//NOTE: Not only the key name but message has also been changed. 	TokenNameCOMMENT_LINE	NOTE: Not only the key name but message has also been changed. 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
,	TokenNameCOMMA	
"La valeur de {0} doit contenir un nombre analysable"	TokenNameStringLiteral	La valeur de {0} doit contenir un nombre analysable
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
,	TokenNameCOMMA	
"La valeur de {0} doit être oui ou non"	TokenNameStringLiteral	La valeur de {0} doit être oui ou non
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
,	TokenNameCOMMA	
"Echec de l''appel de la méthode {0}"	TokenNameStringLiteral	Echec de l''appel de la méthode {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
,	TokenNameCOMMA	
"Echec de la création de l'instance de ElemTemplateElement"	TokenNameStringLiteral	Echec de la création de l'instance de ElemTemplateElement
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
"La présence de caractères n'est pas admise à cet endroit du document"	TokenNameStringLiteral	La présence de caractères n'est pas admise à cet endroit du document
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
"L''attribut "{0}" n''est pas admis sur l''élément {1} !"	TokenNameStringLiteral	L''attribut "{0}" n''est pas admis sur l''élément {1} !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
"{0} valeur erronée {1} "	TokenNameStringLiteral	{0} valeur erronée {1} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
,	TokenNameCOMMA	
"Impossible de trouver la valeur de l''attribut {0} "	TokenNameStringLiteral	Impossible de trouver la valeur de l''attribut {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
,	TokenNameCOMMA	
"Valeur de l''attribut {0} non identifiée "	TokenNameStringLiteral	Valeur de l''attribut {0} non identifiée 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
,	TokenNameCOMMA	
"Tentative de création d'un préfixe d'espace de noms avec un URI vide"	TokenNameStringLiteral	Tentative de création d'un préfixe d'espace de noms avec un URI vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
,	TokenNameCOMMA	
"Tentative de formatage d'un nombre supérieur à l'entier Long le plus élevé"	TokenNameStringLiteral	Tentative de formatage d'un nombre supérieur à l'entier Long le plus élevé
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
,	TokenNameCOMMA	
"Impossible de trouver la classe {0} du pilote SAX1"	TokenNameStringLiteral	Impossible de trouver la classe {0} du pilote SAX1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
,	TokenNameCOMMA	
"Classe {0} du pilote SAX1 trouvée mais non chargée"	TokenNameStringLiteral	Classe {0} du pilote SAX1 trouvée mais non chargée
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
,	TokenNameCOMMA	
"Classe {0} du pilote SAX1 trouvée mais non instanciée"	TokenNameStringLiteral	Classe {0} du pilote SAX1 trouvée mais non instanciée
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
,	TokenNameCOMMA	
"La classe {0} du pilote SAX1 n''implémente pas org.xml.sax.Parser"	TokenNameStringLiteral	La classe {0} du pilote SAX1 n''implémente pas org.xml.sax.Parser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
,	TokenNameCOMMA	
"Propriété système org.xml.sax.parser non spécifiée"	TokenNameStringLiteral	Propriété système org.xml.sax.parser non spécifiée
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"L'argument de l'analyseur ne doit pas être vide"	TokenNameStringLiteral	L'argument de l'analyseur ne doit pas être vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
,	TokenNameCOMMA	
"Fonction : {0}"	TokenNameStringLiteral	Fonction : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
,	TokenNameCOMMA	
"Propriété : {0}"	TokenNameStringLiteral	Propriété : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
,	TokenNameCOMMA	
"Solveur d'entité vide"	TokenNameStringLiteral	Solveur d'entité vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
,	TokenNameCOMMA	
"Gestionnaire de DT vide"	TokenNameStringLiteral	Gestionnaire de DT vide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
"Aucun nom de pilote spécifié !"	TokenNameStringLiteral	Aucun nom de pilote spécifié !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
"Aucune URL spécifiée !"	TokenNameStringLiteral	Aucune URL spécifiée !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
"La taille du pool est inférieure à 1 !"	TokenNameStringLiteral	La taille du pool est inférieure à 1 !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
"Nom de pilote non valide spécifié !"	TokenNameStringLiteral	Nom de pilote non valide spécifié !
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
"Erreur de programme ! L'expression n'a pas de parent ElemTemplateElement !"	TokenNameStringLiteral	Erreur de programme ! L'expression n'a pas de parent ElemTemplateElement !
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
"Assertion du programmeur dans RedundentExprEliminator : {0}"	TokenNameStringLiteral	Assertion du programmeur dans RedundentExprEliminator : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"{0} ne peut pas figurer à cette position dans la feuille de style !"	TokenNameStringLiteral	{0} ne peut pas figurer à cette position dans la feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"Seul de l'espace est accepté à cette position dans la feuille de style !"	TokenNameStringLiteral	Seul de l'espace est accepté à cette position dans la feuille de style !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// This code is shared with warning codes. 	TokenNameCOMMENT_LINE	This code is shared with warning codes. 
// SystemId Unknown 	TokenNameCOMMENT_LINE	SystemId Unknown 
{	TokenNameLBRACE	
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
,	TokenNameCOMMA	
"Valeur incorrecte : {1} utilisée pour l''attribut CHAR : {0}. Un attribut de type CHAR ne peut comporter qu''un seul caractère !"	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut CHAR : {0}. Un attribut de type CHAR ne peut comporter qu''un seul caractère !
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
"Valeur incorrecte : {1} utilisée pour l''attribut QNAME : {0}"	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut QNAME : {0}
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
"Valeur incorrecte : {1} utilisée pour l''attribut ENUM : {0}. Les valeurs autorisées sont : {2}."	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut ENUM : {0}. Les valeurs autorisées sont : {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
,	TokenNameCOMMA	
"Valeur incorrecte : {1} utilisée pour l''attribut NMTOKEN : {0}. "	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut NMTOKEN : {0}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
,	TokenNameCOMMA	
"Valeur incorrecte : {1} utilisée pour l''attribut NCNAME : {0}. "	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut NCNAME : {0}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
,	TokenNameCOMMA	
"Valeur incorrecte : {1} utilisée pour l''attribut booléen : {0}. "	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut booléen : {0}. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "number" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "number" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
,	TokenNameCOMMA	
"Valeur incorrecte : {1} utilisée pour l''attribut number : {0}. "	TokenNameStringLiteral	Valeur incorrecte : {1} utilisée pour l''attribut number : {0}. 
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
"L''argument de {0} dans le motif de correspondance doit être un littéral."	TokenNameStringLiteral	L''argument de {0} dans le motif de correspondance doit être un littéral.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable. A "global variable" is a variable that is accessible everywher 	TokenNameCOMMENT_LINE	a variable. A "global variable" is a variable that is accessible everywher 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
// ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
,	TokenNameCOMMA	
"Déclaration de variable globale en double."	TokenNameStringLiteral	Déclaration de variable globale en double.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable were encountered. 	TokenNameCOMMENT_LINE	a variable were encountered. 
// ER_DUPLICATE_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
,	TokenNameCOMMA	
"Déclaration de variable en double."	TokenNameStringLiteral	Déclaration de variable en double.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "xsl:template, "name" and "match" are XSLT keywords 	TokenNameCOMMENT_LINE	Note to translators: "xsl:template, "name" and "match" are XSLT keywords 
// which must not be translated. 	TokenNameCOMMENT_LINE	which must not be translated. 
// ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 	TokenNameCOMMENT_LINE	ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 
{	TokenNameLBRACE	
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
,	TokenNameCOMMA	
"xsl:template doit comporter un attribut name et/ou match"	TokenNameStringLiteral	xsl:template doit comporter un attribut name et/ou match
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
"Préfixe de exclude-result-prefixes non valide : {0}"	TokenNameStringLiteral	Préfixe de exclude-result-prefixes non valide : {0}
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
"attribute-set {0} n''existe pas"	TokenNameStringLiteral	attribute-set {0} n''existe pas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that there was a reference 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that there was a reference 
// to a function named {0} for which no function definition could be found. 	TokenNameCOMMENT_LINE	to a function named {0} for which no function definition could be found. 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
,	TokenNameCOMMA	
"La fonction {0} n''existe pas"	TokenNameStringLiteral	La fonction {0} n''existe pas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the XSLT instruction 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the XSLT instruction 
// that is named by the substitution text {0} must not contain other XSLT 	TokenNameCOMMENT_LINE	that is named by the substitution text {0} must not contain other XSLT 
// instructions (content) or a "select" attribute. The word "select" is 	TokenNameCOMMENT_LINE	instructions (content) or a "select" attribute. The word "select" is 
// an XSLT keyword in this case and must not be translated. 	TokenNameCOMMENT_LINE	an XSLT keyword in this case and must not be translated. 
{	TokenNameLBRACE	
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
,	TokenNameCOMMA	
"L''élément {0} ne peut posséder un attribut content et un attribut select."	TokenNameStringLiteral	L''élément {0} ne peut posséder un attribut content et un attribut select.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the value argument 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the value argument 
// of setParameter must be a valid Java Object. 	TokenNameCOMMENT_LINE	of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"La valeur du paramètre {0} doit être un objet Java valide"	TokenNameStringLiteral	La valeur du paramètre {0} doit être un objet Java valide
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
,	TokenNameCOMMA	
"L'attribut result-prefix d'un élément xsl:namespace-alias a la valeur '#default', mais il n'existe aucune déclaration de l'espace de noms par défaut dans la portée de l'élément"	TokenNameStringLiteral	L'attribut result-prefix d'un élément xsl:namespace-alias a la valeur '#default', mais il n'existe aucune déclaration de l'espace de noms par défaut dans la portée de l'élément
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
,	TokenNameCOMMA	
"L''attribut result-prefix d''un élément xsl:namespace-alias a la valeur ''{0}'', mais il n''existe aucune déclaration d''espace de noms pour le préfixe ''{0}'' dans la portée de l''élément."	TokenNameStringLiteral	L''attribut result-prefix d''un élément xsl:namespace-alias a la valeur ''{0}'', mais il n''existe aucune déclaration d''espace de noms pour le préfixe ''{0}'' dans la portée de l''élément.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.setFeature (nom chaîne, valeur boolénne)."	TokenNameStringLiteral	Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.setFeature (nom chaîne, valeur boolénne).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.getFeature (nom chaîne)."	TokenNameStringLiteral	Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.getFeature (nom chaîne).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"Impossible de définir la fonction ''{0}'' sur cet élément TransformerFactory."	TokenNameStringLiteral	Impossible de définir la fonction ''{0}'' sur cet élément TransformerFactory.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING	TokenNameIdentifier	 ER  EXTENSION  ELEMENT  NOT  ALLOWED  IN  SECURE  PROCESSING
,	TokenNameCOMMA	
"L''utilisation de l''élément d''extension ''{0}'' n''est pas admise lorsque la fonction de traitement sécurisée a la valeur true."	TokenNameStringLiteral	L''utilisation de l''élément d''extension ''{0}'' n''est pas admise lorsque la fonction de traitement sécurisée a la valeur true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
,	TokenNameCOMMA	
"Impossible d'obtenir le préfixe pour un uri d'espace de noms null."	TokenNameStringLiteral	Impossible d'obtenir le préfixe pour un uri d'espace de noms null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
,	TokenNameCOMMA	
"Impossible d'obtenir l'uri d'espace de noms pour le préfixe null."	TokenNameStringLiteral	Impossible d'obtenir l'uri d'espace de noms pour le préfixe null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
,	TokenNameCOMMA	
"Le nom de la fonction ne peut pas avoir une valeur null."	TokenNameStringLiteral	Le nom de la fonction ne peut pas avoir une valeur null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
,	TokenNameCOMMA	
"La parité ne peut pas être négative."	TokenNameStringLiteral	La parité ne peut pas être négative.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
"Une accolade ('}') a été trouvée alors qu'aucun modèle d'attribut n'est ouvert !"	TokenNameStringLiteral	Une accolade ('}') a été trouvée alors qu'aucun modèle d'attribut n'est ouvert !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
,	TokenNameCOMMA	
"Avertissement : L''attribut de count n''a pas d''ascendant dans xsl:number ! Cible = {0}"	TokenNameStringLiteral	Avertissement : L''attribut de count n''a pas d''ascendant dans xsl:number ! Cible = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
,	TokenNameCOMMA	
"Syntaxe obsolète : Le nom de l'attribut 'expr' a été remplacé par 'select'."	TokenNameStringLiteral	Syntaxe obsolète : Le nom de l'attribut 'expr' a été remplacé par 'select'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
,	TokenNameCOMMA	
"Xalan ne gère pas encore le nom d'environnement local de la fonction format-number."	TokenNameStringLiteral	Xalan ne gère pas encore le nom d'environnement local de la fonction format-number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
,	TokenNameCOMMA	
"Avertissement : Impossible de trouver un environnement local pour xml:lang={0}"	TokenNameStringLiteral	Avertissement : Impossible de trouver un environnement local pour xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Impossible de créer l''URL à partir de : {0}"	TokenNameStringLiteral	Impossible de créer l''URL à partir de : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
,	TokenNameCOMMA	
"Impossible de charger le document demandé : {0}"	TokenNameStringLiteral	Impossible de charger le document demandé : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
"Impossible de trouver une fonction de regroupement pour <sort xml:lang= {0}"	TokenNameStringLiteral	Impossible de trouver une fonction de regroupement pour <sort xml:lang= {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
,	TokenNameCOMMA	
"Syntaxe obsolète : L''instruction de fonction doit utiliser une URL {0}"	TokenNameStringLiteral	Syntaxe obsolète : L''instruction de fonction doit utiliser une URL {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
,	TokenNameCOMMA	
"encodage non pris en charge : {0}, en utilisant UTF-8"	TokenNameStringLiteral	encodage non pris en charge : {0}, en utilisant UTF-8
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
,	TokenNameCOMMA	
"encodage non pris en charge : {0}, en utilisant Java {1}"	TokenNameStringLiteral	encodage non pris en charge : {0}, en utilisant Java {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
,	TokenNameCOMMA	
"Conflits de spécificités trouvés : {0} La dernière de la feuille de style sera employée."	TokenNameStringLiteral	Conflits de spécificités trouvés : {0} La dernière de la feuille de style sera employée.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
,	TokenNameCOMMA	
"========= Analyse et préparation de {0} =========="	TokenNameStringLiteral	========= Analyse et préparation de {0} ==========
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
"Modèle d''attribut, {0}"	TokenNameStringLiteral	Modèle d''attribut, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
,	TokenNameCOMMA	
"Conflit de correspondances entre xsl:strip-space et xsl:preserve-space"	TokenNameStringLiteral	Conflit de correspondances entre xsl:strip-space et xsl:preserve-space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
,	TokenNameCOMMA	
"Xalan ne gère pas encore l''attribut {0} !"	TokenNameStringLiteral	Xalan ne gère pas encore l''attribut {0} !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
"Pas de déclaration pour le format décimal : {0}"	TokenNameStringLiteral	Pas de déclaration pour le format décimal : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
,	TokenNameCOMMA	
"Espace de noms XSLT manquant ou incorrect. "	TokenNameStringLiteral	Espace de noms XSLT manquant ou incorrect. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
,	TokenNameCOMMA	
"Une seule déclaration xsl:decimal-format par défaut est admise."	TokenNameStringLiteral	Une seule déclaration xsl:decimal-format par défaut est admise.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
,	TokenNameCOMMA	
"Les noms xsl:decimal-format doivent être uniques. Le nom "{0}" a été dupliqué."	TokenNameStringLiteral	Les noms xsl:decimal-format doivent être uniques. Le nom "{0}" a été dupliqué.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} comporte un attribut incorrect : {1}"	TokenNameStringLiteral	{0} comporte un attribut incorrect : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
"Impossible de convertir le préfixe de l''espace de noms : {0}. Le noeud n''est pas traité."	TokenNameStringLiteral	Impossible de convertir le préfixe de l''espace de noms : {0}. Le noeud n''est pas traité.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet requiert un attribut 'version' !"	TokenNameStringLiteral	xsl:stylesheet requiert un attribut 'version' !
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
,	TokenNameCOMMA	
"Nom d''attribut incorrect : {0}"	TokenNameStringLiteral	Nom d''attribut incorrect : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Valeur incorrecte pour l''attribut {0} : {1}"	TokenNameStringLiteral	Valeur incorrecte pour l''attribut {0} : {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
,	TokenNameCOMMA	
"L'ensemble de noeuds résultant du second argument de la fonction du document est vide. Un ensemble de noeuds vide est retourné."	TokenNameStringLiteral	L'ensemble de noeuds résultant du second argument de la fonction du document est vide. Un ensemble de noeuds vide est retourné.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. 	TokenNameCOMMENT_LINE	and must not be translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"La valeur de l'attribut 'name' de xsl:processing-instruction doit être différente de 'xml'"	TokenNameStringLiteral	La valeur de l'attribut 'name' de xsl:processing-instruction doit être différente de 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. "NCName" is an XML data-type and must not be 	TokenNameCOMMENT_LINE	and must not be translated. "NCName" is an XML data-type and must not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"La valeur de l''attribut ''name'' de xsl:processing-instruction doit être un nom NCName valide : {0}"	TokenNameStringLiteral	La valeur de l''attribut ''name'' de xsl:processing-instruction doit être un nom NCName valide : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message is reported if the stylesheet that is 	TokenNameCOMMENT_LINE	Note to translators: This message is reported if the stylesheet that is 
// being processed attempted to construct an XML document with an attribute in a 	TokenNameCOMMENT_LINE	being processed attempted to construct an XML document with an attribute in a 
// place other than on an element. The substitution text specifies the name of 	TokenNameCOMMENT_LINE	place other than on an element. The substitution text specifies the name of 
// the attribute. 	TokenNameCOMMENT_LINE	the attribute. 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Ajout impossible de l''attribut {0} après des noeuds enfants ou avant la production d''un élément. L''attribut est ignoré."	TokenNameStringLiteral	Ajout impossible de l''attribut {0} après des noeuds enfants ou avant la production d''un élément. L''attribut est ignoré.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"Tentative de modification d'un objet qui n'accepte pas les modifications."	TokenNameStringLiteral	Tentative de modification d'un objet qui n'accepte pas les modifications.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 	TokenNameCOMMENT_LINE	Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"en"	TokenNameStringLiteral	en
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"en"	TokenNameStringLiteral	en
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"en"	TokenNameStringLiteral	en
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"Le paramètre de createMessage se trouve hors limites"	TokenNameStringLiteral	Le paramètre de createMessage se trouve hors limites
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Exception soulevée lors de l'appel de messageFormat"	TokenNameStringLiteral	Exception soulevée lors de l'appel de messageFormat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Version de Xalan "	TokenNameStringLiteral	>>>>>>> Version de Xalan 
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
"oui"	TokenNameStringLiteral	oui
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Ligne #"	TokenNameStringLiteral	Ligne #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Colonne #"	TokenNameStringLiteral	Colonne #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor : terminé"	TokenNameStringLiteral	XSLProcessor : terminé
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following messages provide usage information 	TokenNameCOMMENT_LINE	Note to translators: The following messages provide usage information 
// for the Xalan Process command line. "Process" is the name of a Java class, 	TokenNameCOMMENT_LINE	for the Xalan Process command line. "Process" is the name of a Java class, 
// and should not be translated. 	TokenNameCOMMENT_LINE	and should not be translated. 
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Options de classe Process de ligne de commande Xalan-J :"	TokenNameStringLiteral	Options de classe Process de ligne de commande Xalan-J :
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Options de classe Process de ligne de commande Xalan-J:"	TokenNameStringLiteral	Options de classe Process de ligne de commande Xalan-J:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xsltc_option"	TokenNameStringLiteral	xslProc_invalid_xsltc_option
,	TokenNameCOMMA	
"L''option {0} n''est pas prise en charge en mode XSLTC."	TokenNameStringLiteral	L''option {0} n''est pas prise en charge en mode XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xalan_option"	TokenNameStringLiteral	xslProc_invalid_xalan_option
,	TokenNameCOMMA	
"L''option {0} s''utilise uniquement avec -XSLTC."	TokenNameStringLiteral	L''option {0} s''utilise uniquement avec -XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_no_input"	TokenNameStringLiteral	xslProc_no_input
,	TokenNameCOMMA	
"Erreur : Aucun xml de feuille de style ou d'entrée n'est spécifié. Exécutez cette commande sans option pour les instructions d'utilisation."	TokenNameStringLiteral	Erreur : Aucun xml de feuille de style ou d'entrée n'est spécifié. Exécutez cette commande sans option pour les instructions d'utilisation.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_common_options"	TokenNameStringLiteral	xslProc_common_options
,	TokenNameCOMMA	
"-Options courantes-"	TokenNameStringLiteral	-Options courantes-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xalan_options"	TokenNameStringLiteral	xslProc_xalan_options
,	TokenNameCOMMA	
"-Options pour Xalan-"	TokenNameStringLiteral	-Options pour Xalan-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xsltc_options"	TokenNameStringLiteral	xslProc_xsltc_options
,	TokenNameCOMMA	
"-Options pour XSLTC-"	TokenNameStringLiteral	-Options pour XSLTC-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_return_to_continue"	TokenNameStringLiteral	xslProc_return_to_continue
,	TokenNameCOMMA	
"(appuyez sur <Retour> pour continuer)"	TokenNameStringLiteral	(appuyez sur <Retour> pour continuer)
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
" [-XSLTC (utilisez XSLTC pour la transformation)]"	TokenNameStringLiteral	 [-XSLTC (utilisez XSLTC pour la transformation)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
" [-IN inputXMLURL]"	TokenNameStringLiteral	 [-IN inputXMLURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXSL"	TokenNameStringLiteral	optionXSL
,	TokenNameCOMMA	
" [-XSL URLXSLTransformation]"	TokenNameStringLiteral	 [-XSL URLXSLTransformation]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionOUT"	TokenNameStringLiteral	optionOUT
,	TokenNameCOMMA	
" [-OUT nomFichierSortie]"	TokenNameStringLiteral	 [-OUT nomFichierSortie]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCIN"	TokenNameStringLiteral	optionLXCIN
,	TokenNameCOMMA	
" [-LXCIN NomFichierFeuilleDeStylesCompiléEntrée]"	TokenNameStringLiteral	 [-LXCIN NomFichierFeuilleDeStylesCompiléEntrée]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCOUT"	TokenNameStringLiteral	optionLXCOUT
,	TokenNameCOMMA	
" [-LXCOUT NomFichierFeuilleDeStylesCompiléSortie]"	TokenNameStringLiteral	 [-LXCOUT NomFichierFeuilleDeStylesCompiléSortie]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARSER"	TokenNameStringLiteral	optionPARSER
,	TokenNameCOMMA	
" [-PARSER nom de classe pleinement qualifié pour la liaison de l'analyseur]"	TokenNameStringLiteral	 [-PARSER nom de classe pleinement qualifié pour la liaison de l'analyseur]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionE"	TokenNameStringLiteral	optionE
,	TokenNameCOMMA	
" [-E (Ne pas développer les réf. d'entité)]"	TokenNameStringLiteral	 [-E (Ne pas développer les réf. d'entité)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionV"	TokenNameStringLiteral	optionV
,	TokenNameCOMMA	
" [-E (Ne pas développer les réf. d'entité)]"	TokenNameStringLiteral	 [-E (Ne pas développer les réf. d'entité)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQC"	TokenNameStringLiteral	optionQC
,	TokenNameCOMMA	
" [-QC (Avertissements brefs de conflits de motifs)]"	TokenNameStringLiteral	 [-QC (Avertissements brefs de conflits de motifs)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQ"	TokenNameStringLiteral	optionQ
,	TokenNameCOMMA	
" [-Q (Mode bref)]"	TokenNameStringLiteral	 [-Q (Mode bref)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLF"	TokenNameStringLiteral	optionLF
,	TokenNameCOMMA	
" [-LF (Utilise des sauts de ligne uniquement dans la sortie {CR/LF par défaut})]"	TokenNameStringLiteral	 [-LF (Utilise des sauts de ligne uniquement dans la sortie {CR/LF par défaut})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCR"	TokenNameStringLiteral	optionCR
,	TokenNameCOMMA	
" [-LF (Utilise des retours chariot uniquement dans la sortie {CR/LF par défaut})]"	TokenNameStringLiteral	 [-LF (Utilise des retours chariot uniquement dans la sortie {CR/LF par défaut})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionESCAPE"	TokenNameStringLiteral	optionESCAPE
,	TokenNameCOMMA	
" [-ESCAPE (Caractères d'échappement {<>&"'\r\n par défaut}]"	TokenNameStringLiteral	 [-ESCAPE (Caractères d'échappement {<>&"'\r\n par défaut}]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINDENT"	TokenNameStringLiteral	optionINDENT
,	TokenNameCOMMA	
" [-INDENT (Nombre d'espaces pour le retrait {par défaut 0})]"	TokenNameStringLiteral	 [-INDENT (Nombre d'espaces pour le retrait {par défaut 0})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTT"	TokenNameStringLiteral	optionTT
,	TokenNameCOMMA	
" [-TT (Contrôle les appels de modèles - fonction de trace.)]"	TokenNameStringLiteral	 [-TT (Contrôle les appels de modèles - fonction de trace.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTG"	TokenNameStringLiteral	optionTG
,	TokenNameCOMMA	
" [-TG (Contrôle chaque événement de génération - fonction de trace.)]"	TokenNameStringLiteral	 [-TG (Contrôle chaque événement de génération - fonction de trace.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTS"	TokenNameStringLiteral	optionTS
,	TokenNameCOMMA	
" [-TS (Contrôle chaque événement de sélection - fonction de trace.)]"	TokenNameStringLiteral	 [-TS (Contrôle chaque événement de sélection - fonction de trace.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTTC"	TokenNameStringLiteral	optionTTC
,	TokenNameCOMMA	
" [-TTC (Contrôle les enfants du modèle lors de leur traitement - fonction de trace.)]"	TokenNameStringLiteral	 [-TTC (Contrôle les enfants du modèle lors de leur traitement - fonction de trace.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTCLASS"	TokenNameStringLiteral	optionTCLASS
,	TokenNameCOMMA	
" [-TCLASS (Classe TraceListener pour les extensions de trace.)]"	TokenNameStringLiteral	 [-TCLASS (Classe TraceListener pour les extensions de trace.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionVALIDATE"	TokenNameStringLiteral	optionVALIDATE
,	TokenNameCOMMA	
" [-VALIDATE (Indique si la validation se produit. La validation est désactivée par défaut.)]"	TokenNameStringLiteral	 [-VALIDATE (Indique si la validation se produit. La validation est désactivée par défaut.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionEDUMP"	TokenNameStringLiteral	optionEDUMP
,	TokenNameCOMMA	
" [-EDUMP {nom de fichier optionnel} (Crée un vidage de pile en cas d'erreur.)]"	TokenNameStringLiteral	 [-EDUMP {nom de fichier optionnel} (Crée un vidage de pile en cas d'erreur.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXML"	TokenNameStringLiteral	optionXML
,	TokenNameCOMMA	
" [-XML (Utilise un formateur XML et ajoute un en-tête XML.)]"	TokenNameStringLiteral	 [-XML (Utilise un formateur XML et ajoute un en-tête XML.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTEXT"	TokenNameStringLiteral	optionTEXT
,	TokenNameCOMMA	
" [-TEXT (Utilise un formateur de texte simple.)]"	TokenNameStringLiteral	 [-TEXT (Utilise un formateur de texte simple.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionHTML"	TokenNameStringLiteral	optionHTML
,	TokenNameCOMMA	
" [-HTML (Utilise un formateur HTML.)]"	TokenNameStringLiteral	 [-HTML (Utilise un formateur HTML.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARAM"	TokenNameStringLiteral	optionPARAM
,	TokenNameCOMMA	
" [-PARAM nom expression (Définit un paramètre de feuille de style)]"	TokenNameStringLiteral	 [-PARAM nom expression (Définit un paramètre de feuille de style)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"Echec du processus XSL."	TokenNameStringLiteral	Echec du processus XSL.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** Analyseur introuvable **"	TokenNameStringLiteral	** Analyseur introuvable **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Vérifiez le chemin d'accès des classes."	TokenNameStringLiteral	Vérifiez le chemin d'accès des classes.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"XML Parser for Java disponible en téléchargement sur le site"	TokenNameStringLiteral	XML Parser for Java disponible en téléchargement sur le site
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"AlphaWorks de IBM : http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	AlphaWorks de IBM : http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionURIRESOLVER"	TokenNameStringLiteral	optionURIRESOLVER
,	TokenNameCOMMA	
" [-URIRESOLVER nom de classe complet (Les URI sont résolus par URIResolver)]"	TokenNameStringLiteral	 [-URIRESOLVER nom de classe complet (Les URI sont résolus par URIResolver)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionENTITYRESOLVER"	TokenNameStringLiteral	optionENTITYRESOLVER
,	TokenNameCOMMA	
" [-ENTITYRESOLVER nom de classe complet (Les URI sont résolus par EntityResolver)]"	TokenNameStringLiteral	 [-ENTITYRESOLVER nom de classe complet (Les URI sont résolus par EntityResolver)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCONTENTHANDLER"	TokenNameStringLiteral	optionCONTENTHANDLER
,	TokenNameCOMMA	
" [-CONTENTHANDLER nom de classe complet (La sérialisation de la sortie est effectuée par ContentHandler)]"	TokenNameStringLiteral	 [-CONTENTHANDLER nom de classe complet (La sérialisation de la sortie est effectuée par ContentHandler)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLINENUMBERS"	TokenNameStringLiteral	optionLINENUMBERS
,	TokenNameCOMMA	
" [-L utilisation des numéros de ligne pour le document source]"	TokenNameStringLiteral	 [-L utilisation des numéros de ligne pour le document source]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSECUREPROCESSING"	TokenNameStringLiteral	optionSECUREPROCESSING
,	TokenNameCOMMA	
" [-SECURE (attribuez la valeur true à la fonction de traitement sécurisé.)]"	TokenNameStringLiteral	 [-SECURE (attribuez la valeur true à la fonction de traitement sécurisé.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
"optionMEDIA"	TokenNameStringLiteral	optionMEDIA
,	TokenNameCOMMA	
" [-MEDIA type_de_support (Utilise un attribut de support pour trouver la feuille de style associée à un document.)]"	TokenNameStringLiteral	 [-MEDIA type_de_support (Utilise un attribut de support pour trouver la feuille de style associée à un document.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionFLAVOR"	TokenNameStringLiteral	optionFLAVOR
,	TokenNameCOMMA	
" [-FLAVOR sax_ou_dom (effectue la transformation à l'aide de SAX (s2s) ou de DOM (d2d).)] "	TokenNameStringLiteral	 [-FLAVOR sax_ou_dom (effectue la transformation à l'aide de SAX (s2s) ou de DOM (d2d).)] 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Added by sboag/scurcuru; experimental 	TokenNameCOMMENT_LINE	Added by sboag/scurcuru; experimental 
{	TokenNameLBRACE	
"optionDIAG"	TokenNameStringLiteral	optionDIAG
,	TokenNameCOMMA	
" [-DIAG (affiche la durée globale de la transformation - en millisecondes.)]"	TokenNameStringLiteral	 [-DIAG (affiche la durée globale de la transformation - en millisecondes.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINCREMENTAL"	TokenNameStringLiteral	optionINCREMENTAL
,	TokenNameCOMMA	
" [-INCREMENTAL (construction incrémentielle du DTM en définissant http://xml.apache.org/xalan/features/incremental true.)]"	TokenNameStringLiteral	 [-INCREMENTAL (construction incrémentielle du DTM en définissant http://xml.apache.org/xalan/features/incremental true.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionNOOPTIMIMIZE"	TokenNameStringLiteral	optionNOOPTIMIMIZE
,	TokenNameCOMMA	
" [-NOOPTIMIMIZE (pas de traitement d'optimisation des feuilles de style en définissant http://xml.apache.org/xalan/features/optimize false.)]"	TokenNameStringLiteral	 [-NOOPTIMIMIZE (pas de traitement d'optimisation des feuilles de style en définissant http://xml.apache.org/xalan/features/optimize false.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionRL"	TokenNameStringLiteral	optionRL
,	TokenNameCOMMA	
" [-RL récursivité_maxi (limite de la profondeur de la récursivité pour les feuilles de style.)]"	TokenNameStringLiteral	 [-RL récursivité_maxi (limite de la profondeur de la récursivité pour les feuilles de style.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXO"	TokenNameStringLiteral	optionXO
,	TokenNameCOMMA	
" [-XO [nom_translet] (assignation du nom au translet généré)]"	TokenNameStringLiteral	 [-XO [nom_translet] (assignation du nom au translet généré)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXD"	TokenNameStringLiteral	optionXD
,	TokenNameCOMMA	
" [-XD répertoire_cible (spécification d'un répertoire de destination pour translet)]"	TokenNameStringLiteral	 [-XD répertoire_cible (spécification d'un répertoire de destination pour translet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXJ"	TokenNameStringLiteral	optionXJ
,	TokenNameCOMMA	
" [-XJ fichier_jar (réunion des classes translet dans un fichier jar appelé <fichier_jar>)]"	TokenNameStringLiteral	 [-XJ fichier_jar (réunion des classes translet dans un fichier jar appelé <fichier_jar>)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXP"	TokenNameStringLiteral	optionXP
,	TokenNameCOMMA	
" [-XP module (spécification d'un préfixe de nom de module pour toutes les classes translet générées)]"	TokenNameStringLiteral	 [-XP module (spécification d'un préfixe de nom de module pour toutes les classes translet générées)]
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
" [-XN (activation de la mise en ligne de modèle)]"	TokenNameStringLiteral	 [-XN (activation de la mise en ligne de modèle)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXX"	TokenNameStringLiteral	optionXX
,	TokenNameCOMMA	
" [-XX (activation du débogage supplémentaire de sortie de message)]"	TokenNameStringLiteral	 [-XX (activation du débogage supplémentaire de sortie de message)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXT"	TokenNameStringLiteral	optionXT
,	TokenNameCOMMA	
" [-XT (utilisation de translet pour la transformation si possible)]"	TokenNameStringLiteral	 [-XT (utilisation de translet pour la transformation si possible)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"diagTiming"	TokenNameStringLiteral	diagTiming
,	TokenNameCOMMA	
" --------- La transformation de {0} via {1} a pris {2} ms"	TokenNameStringLiteral	 --------- La transformation de {0} via {1} a pris {2} ms
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"recursionTooDeep"	TokenNameStringLiteral	recursionTooDeep
,	TokenNameCOMMA	
"Trop grande imbrication de modèle. imbrication = {0}, modèle {1} {2}"	TokenNameStringLiteral	Trop grande imbrication de modèle. imbrication = {0}, modèle {1} {2}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nameIs"	TokenNameStringLiteral	nameIs
,	TokenNameCOMMA	
"le nom est"	TokenNameStringLiteral	le nom est
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"matchPatternIs"	TokenNameStringLiteral	matchPatternIs
,	TokenNameCOMMA	
"le motif de correspondance est"	TokenNameStringLiteral	le motif de correspondance est
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
"Erreur : "	TokenNameStringLiteral	Erreur : 
;	TokenNameSEMICOLON	
/** String to prepend to warning messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to warning messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Avertissement : "	TokenNameStringLiteral	Avertissement : 
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
"en"	TokenNameStringLiteral	en
,	TokenNameCOMMA	
"US"	TokenNameStringLiteral	US
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
