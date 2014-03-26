/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTErrorResources_cs.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTErrorResources_cs.java 468641 2006-10-28 06:54:42Z minchau $ 
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
XSLTErrorResources_cs	TokenNameIdentifier	 XSLT Error Resources cs
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
"Chyba: Ve v?razu nelze pou?ít znak '{'"	TokenNameStringLiteral	Chyba: Ve v?razu nelze pou?ít znak '{'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} má neplatn? atribut: {1}"	TokenNameStringLiteral	{0} má neplatn? atribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
,	TokenNameCOMMA	
"Funkce sourceNode má v prvku xsl:apply-imports hodnotu null!"	TokenNameStringLiteral	Funkce sourceNode má v prvku xsl:apply-imports hodnotu null!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
"Nelze p?idat {0} do {1}"	TokenNameStringLiteral	Nelze p?idat {0} do {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
,	TokenNameCOMMA	
"Funkce sourceNode má v instrukci handleApplyTemplatesInstruction hodnotu null!"	TokenNameStringLiteral	Funkce sourceNode má v instrukci handleApplyTemplatesInstruction hodnotu null!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
,	TokenNameCOMMA	
"{0} musí mít jmenn? atribut"	TokenNameStringLiteral	{0} musí mít jmenn? atribut
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
"Nelze nalézt ?ablonu s názvem: {0}"	TokenNameStringLiteral	Nelze nalézt ?ablonu s názvem: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
,	TokenNameCOMMA	
"Nelze nalézt název AVT v ?ablon? xsl:call-template."	TokenNameStringLiteral	Nelze nalézt název AVT v ?ablon? xsl:call-template.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
"{0} musí mít atribut: {1}"	TokenNameStringLiteral	{0} musí mít atribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
,	TokenNameCOMMA	
"{0} musí mít atribut ''test''. "	TokenNameStringLiteral	{0} musí mít atribut ''test''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
,	TokenNameCOMMA	
"Nesprávná hodnota atributu úrovn?: {0}"	TokenNameStringLiteral	Nesprávná hodnota atributu úrovn?: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"název instrukce processing-instruction nem??e b?t 'xml'"	TokenNameStringLiteral	název instrukce processing-instruction nem??e b?t 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"název instrukce processing-instruction musí b?t platn? název NCName: {0}"	TokenNameStringLiteral	název instrukce processing-instruction musí b?t platn? název NCName: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
,	TokenNameCOMMA	
"Má-li {0} re?im, musí mít vyhovující atribut."	TokenNameStringLiteral	Má-li {0} re?im, musí mít vyhovující atribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} vy?aduje bu? název, nebo vyhovující atribut."	TokenNameStringLiteral	{0} vy?aduje bu? název, nebo vyhovující atribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
,	TokenNameCOMMA	
"Nelze p?elo?it p?edponu oboru názv?: {0}"	TokenNameStringLiteral	Nelze p?elo?it p?edponu oboru názv?: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
,	TokenNameCOMMA	
"Nepovolená hodnota prvku xml:space: {0}"	TokenNameStringLiteral	Nepovolená hodnota prvku xml:space: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
,	TokenNameCOMMA	
"Uzel potomka nemá dokument vlastníka!"	TokenNameStringLiteral	Uzel potomka nemá dokument vlastníka!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
"Chyba funkce ElemTemplateElement: {0}"	TokenNameStringLiteral	Chyba funkce ElemTemplateElement: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
,	TokenNameCOMMA	
"Pokus o p?idání potomka s hodnotou null!"	TokenNameStringLiteral	Pokus o p?idání potomka s hodnotou null!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
,	TokenNameCOMMA	
"{0} vy?aduje atribut select."	TokenNameStringLiteral	{0} vy?aduje atribut select.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:when musí obsahovat atribut 'test'."	TokenNameStringLiteral	Prvek xsl:when musí obsahovat atribut 'test'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:with-param musí obsahovat atribut 'name'."	TokenNameStringLiteral	Prvek xsl:with-param musí obsahovat atribut 'name'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
,	TokenNameCOMMA	
"Parametr context nemá dokument vlastníka!"	TokenNameStringLiteral	Parametr context nemá dokument vlastníka!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
,	TokenNameCOMMA	
"Nelze vytvo?it prvek XML TransformerFactory Liaison: {0}"	TokenNameStringLiteral	Nelze vytvo?it prvek XML TransformerFactory Liaison: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan: Proces nebyl úsp??n?."	TokenNameStringLiteral	Xalan: Proces nebyl úsp??n?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan: nebylo úsp??né."	TokenNameStringLiteral	Xalan: nebylo úsp??né.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Kódování není podporováno: {0}"	TokenNameStringLiteral	Kódování není podporováno: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
,	TokenNameCOMMA	
"Nelze vytvo?it TraceListener: {0}"	TokenNameStringLiteral	Nelze vytvo?it TraceListener: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:key vy?aduje atribut 'name'!"	TokenNameStringLiteral	Prvek xsl:key vy?aduje atribut 'name'!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:key vy?aduje atribut 'match'!"	TokenNameStringLiteral	Prvek xsl:key vy?aduje atribut 'match'!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:key vy?aduje atribut 'use'!"	TokenNameStringLiteral	Prvek xsl:key vy?aduje atribut 'use'!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} vy?aduje atribut ''elements''!"	TokenNameStringLiteral	(StylesheetHandler) {0} vy?aduje atribut ''elements''!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) chybí atribut ''prefix'' objektu {0}"	TokenNameStringLiteral	(StylesheetHandler) chybí atribut ''prefix'' objektu {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
,	TokenNameCOMMA	
"Nesprávná adresa URL p?edlohy se styly: {0}"	TokenNameStringLiteral	Nesprávná adresa URL p?edlohy se styly: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
,	TokenNameCOMMA	
"Soubor p?edlohy se styly nebyl nalezen: {0}"	TokenNameStringLiteral	Soubor p?edlohy se styly nebyl nalezen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
,	TokenNameCOMMA	
"Soubor p?edlohy se styly má v?jimku vstupu/v?stupu: {0}"	TokenNameStringLiteral	Soubor p?edlohy se styly má v?jimku vstupu/v?stupu: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) Pro {0} nelze najít atribut href"	TokenNameStringLiteral	(StylesheetHandler) Pro {0} nelze najít atribut href
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0}: p?ímo nebo nep?ímo zahrnuje sebe sama!"	TokenNameStringLiteral	(StylesheetHandler) {0}: p?ímo nebo nep?ímo zahrnuje sebe sama!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSINCLUDE_ERROR	TokenNameIdentifier	 ER  PROCESSINCLUDE  ERROR
,	TokenNameCOMMA	
"Chyba: StylesheetHandler.processInclude {0}"	TokenNameStringLiteral	Chyba: StylesheetHandler.processInclude {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_LANG_ATTRIB	TokenNameIdentifier	 ER  MISSING  LANG  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) chybí atribut ''lang'' objektu {0}"	TokenNameStringLiteral	(StylesheetHandler) chybí atribut ''lang'' objektu {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
,	TokenNameCOMMA	
"(StylesheetHandler) Nesprávn? umíst?n? prvek {0}?? Chybí prvek po?ada?e ''component''"	TokenNameStringLiteral	(StylesheetHandler) Nesprávn? umíst?n? prvek {0}?? Chybí prvek po?ada?e ''component''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
,	TokenNameCOMMA	
"U atribut? Element, DocumentFragment, Document a PrintWriter lze volat pouze v?stup."	TokenNameStringLiteral	U atribut? Element, DocumentFragment, Document a PrintWriter lze volat pouze v?stup.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESS_ERROR	TokenNameIdentifier	 ER  PROCESS  ERROR
,	TokenNameCOMMA	
"Chyba: StylesheetRoot.process"	TokenNameStringLiteral	Chyba: StylesheetRoot.process
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNIMPLNODE_ERROR	TokenNameIdentifier	 ER  UNIMPLNODE  ERROR
,	TokenNameCOMMA	
"Chyba: UnImplNode: {0}"	TokenNameStringLiteral	Chyba: UnImplNode: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
,	TokenNameCOMMA	
"Chyba! Nebyl nalezen v?raz v?b?ru xpath (-select)."	TokenNameStringLiteral	Chyba! Nebyl nalezen v?raz v?b?ru xpath (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
,	TokenNameCOMMA	
"Nelze serializovat XSLProcessor!"	TokenNameStringLiteral	Nelze serializovat XSLProcessor!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
,	TokenNameCOMMA	
"Nebyl zadán vstup p?edlohy se styly!"	TokenNameStringLiteral	Nebyl zadán vstup p?edlohy se styly!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
,	TokenNameCOMMA	
"Nepoda?ilo se zpracovat p?edlohu se styly!"	TokenNameStringLiteral	Nepoda?ilo se zpracovat p?edlohu se styly!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
,	TokenNameCOMMA	
"Nelze analyzovat dokument {0}!"	TokenNameStringLiteral	Nelze analyzovat dokument {0}!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
,	TokenNameCOMMA	
"Nelze nalézt fragment: {0}"	TokenNameStringLiteral	Nelze nalézt fragment: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
,	TokenNameCOMMA	
"Uzel, na kter? odkazuje identifikátor fragmentu, není prvek: {0}"	TokenNameStringLiteral	Uzel, na kter? odkazuje identifikátor fragmentu, není prvek: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"atribut for-each musí mít bu? shodu, nebo název atributu"	TokenNameStringLiteral	atribut for-each musí mít bu? shodu, nebo název atributu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"atribut templates musí mít bu? shodu, nebo název atributu"	TokenNameStringLiteral	atribut templates musí mít bu? shodu, nebo název atributu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
,	TokenNameCOMMA	
"?ádn? klon fragmentu dokumentu!"	TokenNameStringLiteral	?ádn? klon fragmentu dokumentu!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
,	TokenNameCOMMA	
"Ve stromu v?sledk? nelze vytvo?it polo?ku: {0}"	TokenNameStringLiteral	Ve stromu v?sledk? nelze vytvo?it polo?ku: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
,	TokenNameCOMMA	
"Parametr xml:space ve zdrojovém XML má neplatnou hodnotu: {0}"	TokenNameStringLiteral	Parametr xml:space ve zdrojovém XML má neplatnou hodnotu: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
"{0} nemá deklarován ?ádn? parametr xsl:key!"	TokenNameStringLiteral	{0} nemá deklarován ?ádn? parametr xsl:key!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
,	TokenNameCOMMA	
"Chyba! Nelze vytvo?it url pro: {0}"	TokenNameStringLiteral	Chyba! Nelze vytvo?it url pro: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
,	TokenNameCOMMA	
"Nepodporovaná funkce xsl:functions"	TokenNameStringLiteral	Nepodporovaná funkce xsl:functions
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
,	TokenNameCOMMA	
"Chyba: XSLT TransformerFactory"	TokenNameStringLiteral	Chyba: XSLT TransformerFactory
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
,	TokenNameCOMMA	
"(StylesheetHandler) {0} - není v rámci p?edlohy se styly povoleno!"	TokenNameStringLiteral	(StylesheetHandler) {0} - není v rámci p?edlohy se styly povoleno!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
,	TokenNameCOMMA	
"Parametr result-ns ji? není podporován! Místo toho pou?ijte parametr xsl:output."	TokenNameStringLiteral	Parametr result-ns ji? není podporován! Místo toho pou?ijte parametr xsl:output.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Parametr default-space ji? není podporován! Místo toho pou?ijte parametr xsl:strip-space nebo xsl:preserve-space."	TokenNameStringLiteral	Parametr default-space ji? není podporován! Místo toho pou?ijte parametr xsl:strip-space nebo xsl:preserve-space.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
,	TokenNameCOMMA	
"Parametr indent-result ji? není podporován! Místo toho pou?ijte parametr xsl:output."	TokenNameStringLiteral	Parametr indent-result ji? není podporován! Místo toho pou?ijte parametr xsl:output.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} má neplatn? atribut: {1}"	TokenNameStringLiteral	(StylesheetHandler) {0} má neplatn? atribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
,	TokenNameCOMMA	
"Neznám? prvek XSL: {0}"	TokenNameStringLiteral	Neznám? prvek XSL: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
,	TokenNameCOMMA	
"(StylesheetHandler) Parametr xsl:sort lze pou?ít pouze s parametrem xsl:apply-templates nebo xsl:for-each."	TokenNameStringLiteral	(StylesheetHandler) Parametr xsl:sort lze pou?ít pouze s parametrem xsl:apply-templates nebo xsl:for-each.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
,	TokenNameCOMMA	
"(StylesheetHandler) Nesprávn? umíst?n? prvek xsl:when!"	TokenNameStringLiteral	(StylesheetHandler) Nesprávn? umíst?n? prvek xsl:when!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) Prvkek xsl:when nemá v parametru xsl:choose ?ádného rodi?e!"	TokenNameStringLiteral	(StylesheetHandler) Prvkek xsl:when nemá v parametru xsl:choose ?ádného rodi?e!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
,	TokenNameCOMMA	
"(StylesheetHandler) Nesprávn? umíst?n? prvek xsl:otherwise!"	TokenNameStringLiteral	(StylesheetHandler) Nesprávn? umíst?n? prvek xsl:otherwise!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) Prvek xsl:otherwise nemá v parametru xsl:choose ?ádného rodi?e!"	TokenNameStringLiteral	(StylesheetHandler) Prvek xsl:otherwise nemá v parametru xsl:choose ?ádného rodi?e!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
,	TokenNameCOMMA	
"(StylesheetHandler) {0} - není v rámci ?ablony povoleno!"	TokenNameStringLiteral	(StylesheetHandler) {0} - není v rámci ?ablony povoleno!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
,	TokenNameCOMMA	
"(StylesheetHandler) {0}: neznámá p?edpona {1} p?ípony oboru názv?"	TokenNameStringLiteral	(StylesheetHandler) {0}: neznámá p?edpona {1} p?ípony oboru názv?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
,	TokenNameCOMMA	
"(StylesheetHandler) Importy musí b?t v rámci ?ablony se styly na prvních místech!"	TokenNameStringLiteral	(StylesheetHandler) Importy musí b?t v rámci ?ablony se styly na prvních místech!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0}: p?ímo nebo nep?ímo importuje samo sebe!"	TokenNameStringLiteral	(StylesheetHandler) {0}: p?ímo nebo nep?ímo importuje samo sebe!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
,	TokenNameCOMMA	
"(StylesheetHandler) Parametr xml:space má neplatnou hodnotu: {0}"	TokenNameStringLiteral	(StylesheetHandler) Parametr xml:space má neplatnou hodnotu: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Neúsp??n? proces processStylesheet!"	TokenNameStringLiteral	Neúsp??n? proces processStylesheet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
,	TokenNameCOMMA	
"V?jimka SAX"	TokenNameStringLiteral	V?jimka SAX
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// add this message to fix bug 21478 	TokenNameCOMMENT_LINE	add this message to fix bug 21478 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Nepodporovaná funkce!"	TokenNameStringLiteral	Nepodporovaná funkce!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
,	TokenNameCOMMA	
"Chyba XSLT"	TokenNameStringLiteral	Chyba XSLT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
,	TokenNameCOMMA	
"znak m?ny není v ?et?zci vzorku formátu povolen"	TokenNameStringLiteral	znak m?ny není v ?et?zci vzorku formátu povolen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
,	TokenNameCOMMA	
"Funkce Document není v p?edloze se styly DOM podporována!"	TokenNameStringLiteral	Funkce Document není v p?edloze se styly DOM podporována!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
,	TokenNameCOMMA	
"Nelze p?elo?it p?edponu p?eklada?e non-Prefix!"	TokenNameStringLiteral	Nelze p?elo?it p?edponu p?eklada?e non-Prefix!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
,	TokenNameCOMMA	
"P?esm?rování p?ípony: Nelze získat název souboru - atribut file nebo select musí vrátit platn? ?et?zec."	TokenNameStringLiteral	P?esm?rování p?ípony: Nelze získat název souboru - atribut file nebo select musí vrátit platn? ?et?zec.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
,	TokenNameCOMMA	
"V p?ípon? Redirect nelze vytvo?it FormatterListener!"	TokenNameStringLiteral	V p?ípon? Redirect nelze vytvo?it FormatterListener!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
,	TokenNameCOMMA	
"Neplatná p?edpona ve funkci exclude-result-prefixes: {0}"	TokenNameStringLiteral	Neplatná p?edpona ve funkci exclude-result-prefixes: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
,	TokenNameCOMMA	
"U zadané p?edpony chybí obor názv? URI"	TokenNameStringLiteral	U zadané p?edpony chybí obor názv? URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
,	TokenNameCOMMA	
"Chyb?jící argument volby: {0}"	TokenNameStringLiteral	Chyb?jící argument volby: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
,	TokenNameCOMMA	
"Neplatná volba: {0}"	TokenNameStringLiteral	Neplatná volba: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
"Vadn? formátovací ?et?zec: {0}"	TokenNameStringLiteral	Vadn? formátovací ?et?zec: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:stylesheet vy?aduje atribut 'version'!"	TokenNameStringLiteral	Prvek xsl:stylesheet vy?aduje atribut 'version'!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Parametr Attribute: {0} má neplatnou hodnotu: {1}"	TokenNameStringLiteral	Parametr Attribute: {0} má neplatnou hodnotu: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
,	TokenNameCOMMA	
"Prvek xsl:choose vy?aduje parametr xsl:when"	TokenNameStringLiteral	Prvek xsl:choose vy?aduje parametr xsl:when
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
,	TokenNameCOMMA	
"Parametr xsl:for-each není v xsl:apply-imports povolen"	TokenNameStringLiteral	Parametr xsl:for-each není v xsl:apply-imports povolen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
,	TokenNameCOMMA	
"Nelze pou?ít DTMLiaison u v?stupu uzlu DOM node... Místo toho pou?ijte org.apache.xpath.DOM2Helper!"	TokenNameStringLiteral	Nelze pou?ít DTMLiaison u v?stupu uzlu DOM node... Místo toho pou?ijte org.apache.xpath.DOM2Helper!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
,	TokenNameCOMMA	
"Nelze pou?ít DTMLiaison u vstupu uzlu DOM node... Místo toho pou?ijte org.apache.xpath.DOM2Helper!"	TokenNameStringLiteral	Nelze pou?ít DTMLiaison u vstupu uzlu DOM node... Místo toho pou?ijte org.apache.xpath.DOM2Helper!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
,	TokenNameCOMMA	
"Neúsp??né volání prvku p?ípony: {0}"	TokenNameStringLiteral	Neúsp??né volání prvku p?ípony: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"P?edponu musí b?t mo?no p?elo?it do oboru názv?: {0}"	TokenNameStringLiteral	P?edponu musí b?t mo?no p?elo?it do oboru názv?: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Byla zji?t?na neplatná náhrada UTF-16: {0} ?"	TokenNameStringLiteral	Byla zji?t?na neplatná náhrada UTF-16: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
,	TokenNameCOMMA	
"Prvek xsl:attribute-set {0} pou?ívá sám sebe, co? zp?sobí nekone?nou smy?ku."	TokenNameStringLiteral	Prvek xsl:attribute-set {0} pou?ívá sám sebe, co? zp?sobí nekone?nou smy?ku.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
,	TokenNameCOMMA	
"Vstup Xerces-DOM nelze sm??ovat s v?stupem Xerces-DOM!"	TokenNameStringLiteral	Vstup Xerces-DOM nelze sm??ovat s v?stupem Xerces-DOM!
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
"V ElemTemplateElement.readObject: {0}"	TokenNameStringLiteral	V ElemTemplateElement.readObject: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
,	TokenNameCOMMA	
"Nalezena více ne? jedna ?ablona s názvem: {0}"	TokenNameStringLiteral	Nalezena více ne? jedna ?ablona s názvem: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
,	TokenNameCOMMA	
"Neplatné volání funkce: rekurzivní volání funkce key() není povoleno"	TokenNameStringLiteral	Neplatné volání funkce: rekurzivní volání funkce key() není povoleno
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
"Prom?nná {0} odkazuje p?ímo ?i nep?ímo sama na sebe!"	TokenNameStringLiteral	Prom?nná {0} odkazuje p?ímo ?i nep?ímo sama na sebe!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
"Vstupní uzel DOMSource pro newTemplates nesmí mít hodnotu null!"	TokenNameStringLiteral	Vstupní uzel DOMSource pro newTemplates nesmí mít hodnotu null!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
,	TokenNameCOMMA	
"Nebyl nalezen soubor t?ídy pro volbu {0}"	TokenNameStringLiteral	Nebyl nalezen soubor t?ídy pro volbu {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
"Nebyl nalezen po?adovan? prvek: {0}"	TokenNameStringLiteral	Nebyl nalezen po?adovan? prvek: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Parametr InputStream nesmí mít hodnotu null"	TokenNameStringLiteral	Parametr InputStream nesmí mít hodnotu null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Parametr URI nesmí mít hodnotu null"	TokenNameStringLiteral	Parametr URI nesmí mít hodnotu null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Parametr File nesmí mít hodnotu null"	TokenNameStringLiteral	Parametr File nesmí mít hodnotu null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Parametr InputSource nesmí mít hodnotu null"	TokenNameStringLiteral	Parametr InputSource nesmí mít hodnotu null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
"Nelze inicializovat BSF Manager"	TokenNameStringLiteral	Nelze inicializovat BSF Manager
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
"P?íponu nelze kompilovat"	TokenNameStringLiteral	P?íponu nelze kompilovat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
"Nelze vytvo?it p?íponu: {0}, proto?e: {1}"	TokenNameStringLiteral	Nelze vytvo?it p?íponu: {0}, proto?e: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
,	TokenNameCOMMA	
"Volání metody {0} metodou Instance vy?aduje jako první argument instanci Object"	TokenNameStringLiteral	Volání metody {0} metodou Instance vy?aduje jako první argument instanci Object
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
,	TokenNameCOMMA	
"Byl zadán neplatn? název prvku {0}"	TokenNameStringLiteral	Byl zadán neplatn? název prvku {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
,	TokenNameCOMMA	
"Název metody prvku musí b?t static {0}"	TokenNameStringLiteral	Název metody prvku musí b?t static {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
"Funkce v?jimky {0} : {1} je neznámá"	TokenNameStringLiteral	Funkce v?jimky {0} : {1} je neznámá
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
,	TokenNameCOMMA	
"Konstruktor {0} má více nejlep?ích shod."	TokenNameStringLiteral	Konstruktor {0} má více nejlep?ích shod.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
,	TokenNameCOMMA	
"Metoda {0} má více nejlep?ích shod."	TokenNameStringLiteral	Metoda {0} má více nejlep?ích shod.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
"Metoda prvku {0} má více nejlep?ích shod."	TokenNameStringLiteral	Metoda prvku {0} má více nejlep?ích shod.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
,	TokenNameCOMMA	
"Do vyhodnocení byl p?edán neplatn? kontext {0}."	TokenNameStringLiteral	Do vyhodnocení byl p?edán neplatn? kontext {0}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
"Spole?ná oblast ji? existuje."	TokenNameStringLiteral	Spole?ná oblast ji? existuje.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
,	TokenNameCOMMA	
"Nebylo zadáno ?ádné jméno ovlada?e."	TokenNameStringLiteral	Nebylo zadáno ?ádné jméno ovlada?e.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
,	TokenNameCOMMA	
"Nebyla specifikována ?ádná adresa URL."	TokenNameStringLiteral	Nebyla specifikována ?ádná adresa URL.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
,	TokenNameCOMMA	
"Velikost spole?né oblasti je men?í ne? jedna!"	TokenNameStringLiteral	Velikost spole?né oblasti je men?í ne? jedna!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
,	TokenNameCOMMA	
"Byl zadán neplatn? název ovlada?e!"	TokenNameStringLiteral	Byl zadán neplatn? název ovlada?e!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
"Nebyl nalezen ko?en p?edlohy se styly!"	TokenNameStringLiteral	Nebyl nalezen ko?en p?edlohy se styly!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
"Neplatná hodnota parametru xml:space"	TokenNameStringLiteral	Neplatná hodnota parametru xml:space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
"Selhání procesu processFromNode"	TokenNameStringLiteral	Selhání procesu processFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"Nelze zavést zdroj [ {0} ]: {1} {2} {3}"	TokenNameStringLiteral	Nelze zavést zdroj [ {0} ]: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Velikost vyrovnávací pam?ti <=0"	TokenNameStringLiteral	Velikost vyrovnávací pam?ti <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
,	TokenNameCOMMA	
"P?i volání p?ípony do?lo k neznámé chyb?"	TokenNameStringLiteral	P?i volání p?ípony do?lo k neznámé chyb?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
"P?edpona {0} nemá deklarován odpovídající obor názv?"	TokenNameStringLiteral	P?edpona {0} nemá deklarován odpovídající obor názv?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
"Obsah prvku není povolen pro lang=javaclass {0}"	TokenNameStringLiteral	Obsah prvku není povolen pro lang=javaclass {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
"Ukon?ení sm?rované na p?edlohu se styly."	TokenNameStringLiteral	Ukon?ení sm?rované na p?edlohu se styly.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
,	TokenNameCOMMA	
"1 nebo 2"	TokenNameStringLiteral	1 nebo 2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 nebo 3"	TokenNameStringLiteral	2 nebo 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Nelze zavést {0} (zkontrolujte prom?nnou CLASSPATH) - proto se pou?ívají pouze v?chozí hodnoty"	TokenNameStringLiteral	Nelze zavést {0} (zkontrolujte prom?nnou CLASSPATH) - proto se pou?ívají pouze v?chozí hodnoty
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
,	TokenNameCOMMA	
"Nelze aktualizovat v?chozí ?ablony."	TokenNameStringLiteral	Nelze aktualizovat v?chozí ?ablony.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"V?sledek by nem?l mít hodnotu null"	TokenNameStringLiteral	V?sledek by nem?l mít hodnotu null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
"Nelze nastavit v?sledek"	TokenNameStringLiteral	Nelze nastavit v?sledek
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Nebyl ur?en ?ádn? v?stup"	TokenNameStringLiteral	Nebyl ur?en ?ádn? v?stup
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
"Nelze provést p?evod na v?sledek typu {0}"	TokenNameStringLiteral	Nelze provést p?evod na v?sledek typu {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
"Nelze provést p?evod zdroje typu {0}"	TokenNameStringLiteral	Nelze provést p?evod zdroje typu {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
"Obslu?n? program obsahu hodnoty null"	TokenNameStringLiteral	Obslu?n? program obsahu hodnoty null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Obslu?n? program pro zpracování chyb hodnoty null"	TokenNameStringLiteral	Obslu?n? program pro zpracování chyb hodnoty null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
,	TokenNameCOMMA	
"Není-li nastaven obslu?n? program ContentHandler, nelze volat analyzátor."	TokenNameStringLiteral	Není-li nastaven obslu?n? program ContentHandler, nelze volat analyzátor.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
,	TokenNameCOMMA	
"Filtr nemá rodi?e."	TokenNameStringLiteral	Filtr nemá rodi?e.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
,	TokenNameCOMMA	
"Nebyla nalezena p?edloha se styly v: {0}, médium= {1}"	TokenNameStringLiteral	Nebyla nalezena p?edloha se styly v: {0}, médium= {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
,	TokenNameCOMMA	
"Nebyla nalezena p?edloha se styly xml-stylesheet PI v: {0}"	TokenNameStringLiteral	Nebyla nalezena p?edloha se styly xml-stylesheet PI v: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Nepodporováno: {0}"	TokenNameStringLiteral	Nepodporováno: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
,	TokenNameCOMMA	
"Hodnota vlastnosti {0} by m?la b?t booleovská instance"	TokenNameStringLiteral	Hodnota vlastnosti {0} by m?la b?t booleovská instance
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
"Z {0} nelze získat externí skript."	TokenNameStringLiteral	Z {0} nelze získat externí skript.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"Nelze najít zdroj [ {0} ]. {1}"	TokenNameStringLiteral	Nelze najít zdroj [ {0} ]. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
"Neznámá vlastnost v?stupu: {0}"	TokenNameStringLiteral	Neznámá vlastnost v?stupu: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
,	TokenNameCOMMA	
"Nepoda?ilo se vytvo?it instanci ElemLiteralResult"	TokenNameStringLiteral	Nepoda?ilo se vytvo?it instanci ElemLiteralResult
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 	TokenNameCOMMENT_LINE	Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 
// In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 	TokenNameCOMMENT_LINE	In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 
//in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 	TokenNameCOMMENT_LINE	in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 
//NOTE: Not only the key name but message has also been changed. 	TokenNameCOMMENT_LINE	NOTE: Not only the key name but message has also been changed. 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
,	TokenNameCOMMA	
"Hodnota pro {0} by m?la obsahovat analyzovatelné ?íslo"	TokenNameStringLiteral	Hodnota pro {0} by m?la obsahovat analyzovatelné ?íslo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
,	TokenNameCOMMA	
"Hodnota {0} musí b?t yes nebo no."	TokenNameStringLiteral	Hodnota {0} musí b?t yes nebo no.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
,	TokenNameCOMMA	
"Volání metody {0} selhalo."	TokenNameStringLiteral	Volání metody {0} selhalo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
,	TokenNameCOMMA	
"Nepoda?ilo se vytvo?it instanci ElemTemplateElement."	TokenNameStringLiteral	Nepoda?ilo se vytvo?it instanci ElemTemplateElement.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
"V této ?ásti dokumentu nejsou znaky povoleny."	TokenNameStringLiteral	V této ?ásti dokumentu nejsou znaky povoleny.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
"Atribut "{0}" není u prvku {1} povolen!"	TokenNameStringLiteral	Atribut "{0}" není u prvku {1} povolen!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
"{0}: nesprávná hodnota {1} "	TokenNameStringLiteral	{0}: nesprávná hodnota {1} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
,	TokenNameCOMMA	
"Atribut hodnoty ({0}) nebyl nalezen "	TokenNameStringLiteral	Atribut hodnoty ({0}) nebyl nalezen 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
,	TokenNameCOMMA	
"Atribut hodnoty ({0}) nebyl rozpoznán "	TokenNameStringLiteral	Atribut hodnoty ({0}) nebyl rozpoznán 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
,	TokenNameCOMMA	
"Pokus o generování oboru názv? s URI s hodnotou null."	TokenNameStringLiteral	Pokus o generování oboru názv? s URI s hodnotou null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	New ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
,	TokenNameCOMMA	
"Pokus o formátování v?t?ího ?ísla, ne? je nejv?t?í dlouhé celé ?íslo."	TokenNameStringLiteral	Pokus o formátování v?t?ího ?ísla, ne? je nejv?t?í dlouhé celé ?íslo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
,	TokenNameCOMMA	
"Nelze najít t?ídu ovlada?e SAX1 {0}"	TokenNameStringLiteral	Nelze najít t?ídu ovlada?e SAX1 {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
,	TokenNameCOMMA	
"T?ída ovlada?e SAX1 {0} byla nalezena, ale nebylo mo?no ji zavést."	TokenNameStringLiteral	T?ída ovlada?e SAX1 {0} byla nalezena, ale nebylo mo?no ji zavést.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
,	TokenNameCOMMA	
"T?ída ovlada?e SAX1 {0} byla nalezena, ale nebylo mo?no s ní zalo?it instanci."	TokenNameStringLiteral	T?ída ovlada?e SAX1 {0} byla nalezena, ale nebylo mo?no s ní zalo?it instanci.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
,	TokenNameCOMMA	
"T?ída ovlada?e SAX1 {0} neimplementuje org.xml.sax.Parser."	TokenNameStringLiteral	T?ída ovlada?e SAX1 {0} neimplementuje org.xml.sax.Parser.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
,	TokenNameCOMMA	
"Nebyla ur?ena vlastnost systému org.xml.sax.parser."	TokenNameStringLiteral	Nebyla ur?ena vlastnost systému org.xml.sax.parser.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Argument analyzátoru nesmí mít hodnotu null."	TokenNameStringLiteral	Argument analyzátoru nesmí mít hodnotu null.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
,	TokenNameCOMMA	
"Funkce: {0}"	TokenNameStringLiteral	Funkce: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
,	TokenNameCOMMA	
"Vlastnost: {0}"	TokenNameStringLiteral	Vlastnost: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
,	TokenNameCOMMA	
"?e?itel s hodnotou entity null"	TokenNameStringLiteral	?e?itel s hodnotou entity null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
,	TokenNameCOMMA	
"Obslu?n? program DTD s hodnotou null"	TokenNameStringLiteral	Obslu?n? program DTD s hodnotou null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
"Nebyl zadán název ovlada?e!"	TokenNameStringLiteral	Nebyl zadán název ovlada?e!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
"Nebyla specifikována adresa URL!"	TokenNameStringLiteral	Nebyla specifikována adresa URL!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
"Velikost spole?né oblasti je men?í ne? 1!"	TokenNameStringLiteral	Velikost spole?né oblasti je men?í ne? 1!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
"Zadán neplatn? název ovlada?e!"	TokenNameStringLiteral	Zadán neplatn? název ovlada?e!
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
"Chyba programátora! Ve v?razu chybí nad?azen? ?len ElemTemplateElement."	TokenNameStringLiteral	Chyba programátora! Ve v?razu chybí nad?azen? ?len ElemTemplateElement.
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
"Tvrzení programátora v RedundentExprEliminator: {0}"	TokenNameStringLiteral	Tvrzení programátora v RedundentExprEliminator: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"{0} - není povoleno v tomto stylu na daném míst?!"	TokenNameStringLiteral	{0} - není povoleno v tomto stylu na daném míst?!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"Neprázdn? text není povolen v tomto stylu na daném míst?!"	TokenNameStringLiteral	Neprázdn? text není povolen v tomto stylu na daném míst?!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// This code is shared with warning codes. 	TokenNameCOMMENT_LINE	This code is shared with warning codes. 
// SystemId Unknown 	TokenNameCOMMENT_LINE	SystemId Unknown 
{	TokenNameLBRACE	
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
,	TokenNameCOMMA	
"Neplatná hodnota: {1} pou?ito pro atribut CHAR: {0}. Atribut typu CHAR smí mít pouze jeden znak."	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro atribut CHAR: {0}. Atribut typu CHAR smí mít pouze jeden znak.
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
"Neplatná hodnota: {1} pou?ito pro atribut QNAME: {0}"	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro atribut QNAME: {0}
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
"Neplatná hodnota: {1} pou?ito pro atribut ENUM {0}. Platné hodnoty jsou: {2}."	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro atribut ENUM {0}. Platné hodnoty jsou: {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
,	TokenNameCOMMA	
"Neplatná hodnota: {1} pou?ito pro atribut NMTOKEN: {0} "	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro atribut NMTOKEN: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
,	TokenNameCOMMA	
"Neplatná hodnota: {1} pou?ito pro atribut NCNAME: {0} "	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro atribut NCNAME: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
,	TokenNameCOMMA	
"Neplatná hodnota: {1} pou?ito pro booleovsk? atribut: {0} "	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro booleovsk? atribut: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "number" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "number" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
{	TokenNameLBRACE	
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
,	TokenNameCOMMA	
"Neplatná hodnota: {1} pou?ito pro atribut ?ísla: {0} "	TokenNameStringLiteral	Neplatná hodnota: {1} pou?ito pro atribut ?ísla: {0} 
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
"Argument pro {0} ve vyhovujícím vzorku musí b?t typu literal."	TokenNameStringLiteral	Argument pro {0} ve vyhovujícím vzorku musí b?t typu literal.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable. A "global variable" is a variable that is accessible everywher 	TokenNameCOMMENT_LINE	a variable. A "global variable" is a variable that is accessible everywher 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
// ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
,	TokenNameCOMMA	
"Duplicitní deklarace globální prom?nné."	TokenNameStringLiteral	Duplicitní deklarace globální prom?nné.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable were encountered. 	TokenNameCOMMENT_LINE	a variable were encountered. 
// ER_DUPLICATE_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_VAR - new error message for bugzilla #790 
{	TokenNameLBRACE	
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
,	TokenNameCOMMA	
"Duplicitní deklarace prom?nné."	TokenNameStringLiteral	Duplicitní deklarace prom?nné.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "xsl:template, "name" and "match" are XSLT keywords 	TokenNameCOMMENT_LINE	Note to translators: "xsl:template, "name" and "match" are XSLT keywords 
// which must not be translated. 	TokenNameCOMMENT_LINE	which must not be translated. 
// ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 	TokenNameCOMMENT_LINE	ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 
{	TokenNameLBRACE	
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
,	TokenNameCOMMA	
"Prvek xsl:template musí mít název nebo odpovídající atribut (nebo obojí)"	TokenNameStringLiteral	Prvek xsl:template musí mít název nebo odpovídající atribut (nebo obojí)
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
"Neplatná p?edpona ve funkci exclude-result-prefixes: {0}"	TokenNameStringLiteral	Neplatná p?edpona ve funkci exclude-result-prefixes: {0}
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
"sada atribut? pojmenovaná {0} neexistuje"	TokenNameStringLiteral	sada atribut? pojmenovaná {0} neexistuje
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that there was a reference 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that there was a reference 
// to a function named {0} for which no function definition could be found. 	TokenNameCOMMENT_LINE	to a function named {0} for which no function definition could be found. 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  NOT  FOUND
,	TokenNameCOMMA	
"Funkce se jménem {0} neexistuje."	TokenNameStringLiteral	Funkce se jménem {0} neexistuje.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the XSLT instruction 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the XSLT instruction 
// that is named by the substitution text {0} must not contain other XSLT 	TokenNameCOMMENT_LINE	that is named by the substitution text {0} must not contain other XSLT 
// instructions (content) or a "select" attribute. The word "select" is 	TokenNameCOMMENT_LINE	instructions (content) or a "select" attribute. The word "select" is 
// an XSLT keyword in this case and must not be translated. 	TokenNameCOMMENT_LINE	an XSLT keyword in this case and must not be translated. 
{	TokenNameLBRACE	
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
,	TokenNameCOMMA	
"Prvek {0} nesmí obsahovat sou?asn? obsah i atribut volby."	TokenNameStringLiteral	Prvek {0} nesmí obsahovat sou?asn? obsah i atribut volby.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the value argument 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the value argument 
// of setParameter must be a valid Java Object. 	TokenNameCOMMENT_LINE	of setParameter must be a valid Java Object. 
{	TokenNameLBRACE	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
"Hodnota parametru {0} musí b?t platn?m objektem technologie Java."	TokenNameStringLiteral	Hodnota parametru {0} musí b?t platn?m objektem technologie Java.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
,	TokenNameCOMMA	
"Atribut result-prefix prvku xsl:namespace-alias má hodnotu '#default', neexistuje v?ak ?ádná deklarace v?chozího oboru názv? v rozsahu daného prvku"	TokenNameStringLiteral	Atribut result-prefix prvku xsl:namespace-alias má hodnotu '#default', neexistuje v?ak ?ádná deklarace v?chozího oboru názv? v rozsahu daného prvku
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
,	TokenNameCOMMA	
"Atribut result-prefix prvku xsl:namespace-alias má hodnotu ''{0}'', neexistuje v?ak ?ádná deklarace oboru názv? pro p?edponu ''{0}'' v rozsahu daného prvku. "	TokenNameStringLiteral	Atribut result-prefix prvku xsl:namespace-alias má hodnotu ''{0}'', neexistuje v?ak ?ádná deklarace oboru názv? pro p?edponu ''{0}'' v rozsahu daného prvku. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  SET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"Název funkce pou?it? ve volání TransformerFactory.setFeature(?et?zec názvu, booleovská hodnota) nesmí mít hodnotu Null. "	TokenNameStringLiteral	Název funkce pou?it? ve volání TransformerFactory.setFeature(?et?zec názvu, booleovská hodnota) nesmí mít hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 ER  GET  FEATURE  NULL  NAME
,	TokenNameCOMMA	
"Název funkce pou?it? ve volání TransformerFactory.getFeature(?et?zec názvu) nesmí mít hodnotu Null. "	TokenNameStringLiteral	Název funkce pou?it? ve volání TransformerFactory.getFeature(?et?zec názvu) nesmí mít hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_FEATURE	TokenNameIdentifier	 ER  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
"Nelze nastavit funkci ''{0}'' pro tuto t?ídu TransformerFactory. "	TokenNameStringLiteral	Nelze nastavit funkci ''{0}'' pro tuto t?ídu TransformerFactory. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTENSION_ELEMENT_NOT_ALLOWED_IN_SECURE_PROCESSING	TokenNameIdentifier	 ER  EXTENSION  ELEMENT  NOT  ALLOWED  IN  SECURE  PROCESSING
,	TokenNameCOMMA	
"Je-li funkce zabezpe?eného zpracování nastavena na hodnotu true, není povoleno pou?ití roz?i?ujícího prvku ''{0}''. "	TokenNameStringLiteral	Je-li funkce zabezpe?eného zpracování nastavena na hodnotu true, není povoleno pou?ití roz?i?ujícího prvku ''{0}''. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
,	TokenNameCOMMA	
"Nelze na?íst p?edponu pro identifikátor URI, jeho? obor názv? má hodnotu Null. "	TokenNameStringLiteral	Nelze na?íst p?edponu pro identifikátor URI, jeho? obor názv? má hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
,	TokenNameCOMMA	
"Nelze na?íst identifikátor URI oboru názv? pro p?edponu s hodnotou Null. "	TokenNameStringLiteral	Nelze na?íst identifikátor URI oboru názv? pro p?edponu s hodnotou Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
,	TokenNameCOMMA	
"Název funkce nesmí mít hodnotu Null. "	TokenNameStringLiteral	Název funkce nesmí mít hodnotu Null. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
,	TokenNameCOMMA	
"Arita nesmí mít zápornou hodnotu. "	TokenNameStringLiteral	Arita nesmí mít zápornou hodnotu. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
"Byl nalezen znak '}', ale není otev?ena ?ádná ?ablona atributu!"	TokenNameStringLiteral	Byl nalezen znak '}', ale není otev?ena ?ádná ?ablona atributu!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
,	TokenNameCOMMA	
"Varování: ?íta? atributu se neshoduje s p?edch?dcem v xsl:number! Cíl = {0}"	TokenNameStringLiteral	Varování: ?íta? atributu se neshoduje s p?edch?dcem v xsl:number! Cíl = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
,	TokenNameCOMMA	
"Stará syntaxe: Název atributu 'expr' byl zm?n?n na 'select'."	TokenNameStringLiteral	Stará syntaxe: Název atributu 'expr' byl zm?n?n na 'select'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
,	TokenNameCOMMA	
"Xalan je?t? neobsluhuje název národního prost?edí ve funkci format-number."	TokenNameStringLiteral	Xalan je?t? neobsluhuje název národního prost?edí ve funkci format-number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
,	TokenNameCOMMA	
"Varování: Nebylo nalezeno národní prost?edí pro parametr xml:lang={0}"	TokenNameStringLiteral	Varování: Nebylo nalezeno národní prost?edí pro parametr xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Nelze vytvo?it adresu URL z: {0}"	TokenNameStringLiteral	Nelze vytvo?it adresu URL z: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
,	TokenNameCOMMA	
"Po?adovan? dokument nelze na?íst: {0}"	TokenNameStringLiteral	Po?adovan? dokument nelze na?íst: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
"Nelze najít funkci Collator pro <sort xml:lang={0}"	TokenNameStringLiteral	Nelze najít funkci Collator pro <sort xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
,	TokenNameCOMMA	
"Stará syntaxe: instrukce funkcí by m?la pou?ívat adresu url {0}"	TokenNameStringLiteral	Stará syntaxe: instrukce funkcí by m?la pou?ívat adresu url {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
,	TokenNameCOMMA	
"nepodporované kódování: {0}, pou?ito kódování UTF-8"	TokenNameStringLiteral	nepodporované kódování: {0}, pou?ito kódování UTF-8
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
,	TokenNameCOMMA	
"nepodporované kódování: {0}, pou?ita Java {1}"	TokenNameStringLiteral	nepodporované kódování: {0}, pou?ita Java {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
,	TokenNameCOMMA	
"Byl nalezen konflikt specifi?nosti: {0} Bude pou?it naposledy nalezen? v?skyt z p?edlohy se styly."	TokenNameStringLiteral	Byl nalezen konflikt specifi?nosti: {0} Bude pou?it naposledy nalezen? v?skyt z p?edlohy se styly.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
,	TokenNameCOMMA	
"========= Anal?za a p?íprava {0} =========="	TokenNameStringLiteral	========= Anal?za a p?íprava {0} ==========
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
"?ablona atribut?, {0}"	TokenNameStringLiteral	?ablona atribut?, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
,	TokenNameCOMMA	
"Konflikt souladu funkcí xsl:strip-space a xsl:preserve-space"	TokenNameStringLiteral	Konflikt souladu funkcí xsl:strip-space a xsl:preserve-space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
,	TokenNameCOMMA	
"Xalan prozatím neobsluhuje atribut {0}!"	TokenNameStringLiteral	Xalan prozatím neobsluhuje atribut {0}!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
"U desetinného formátu nebyla nalezena ?ádná deklarace: {0}"	TokenNameStringLiteral	U desetinného formátu nebyla nalezena ?ádná deklarace: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
,	TokenNameCOMMA	
"Chyb?jící nebo nesprávn? obor názv? XSLT. "	TokenNameStringLiteral	Chyb?jící nebo nesprávn? obor názv? XSLT. 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
,	TokenNameCOMMA	
"Povolena je pouze v?chozí deklarace prvku xsl:decimal-format."	TokenNameStringLiteral	Povolena je pouze v?chozí deklarace prvku xsl:decimal-format.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
,	TokenNameCOMMA	
"Názvy prvk? xsl:decimal-format musí b?t jedine?né. Byla vytvo?ena kopie názvu "{0}"."	TokenNameStringLiteral	Názvy prvk? xsl:decimal-format musí b?t jedine?né. Byla vytvo?ena kopie názvu "{0}".
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} má neplatn? atribut: {1}"	TokenNameStringLiteral	{0} má neplatn? atribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
"Nelze p?elo?it p?edponu oboru názv?: {0}. Uzel bude ignorován."	TokenNameStringLiteral	Nelze p?elo?it p?edponu oboru názv?: {0}. Uzel bude ignorován.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"Prvek xsl:stylesheet vy?aduje atribut 'version'!"	TokenNameStringLiteral	Prvek xsl:stylesheet vy?aduje atribut 'version'!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
,	TokenNameCOMMA	
"Neplatn? název atributu: {0}"	TokenNameStringLiteral	Neplatn? název atributu: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"V atributu {0} byla pou?ita neplatná hodnota: {1}"	TokenNameStringLiteral	V atributu {0} byla pou?ita neplatná hodnota: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
,	TokenNameCOMMA	
"V?sledné nastavení uzlu z druhého argumentu dokumentu je prázdné. Vrátí se prázdná sada uzl?."	TokenNameStringLiteral	V?sledné nastavení uzlu z druhého argumentu dokumentu je prázdné. Vrátí se prázdná sada uzl?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. 	TokenNameCOMMENT_LINE	and must not be translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"Hodnota atributu 'name' názvu prvku xsl:processing-instruction nesmí b?t 'xml'"	TokenNameStringLiteral	Hodnota atributu 'name' názvu prvku xsl:processing-instruction nesmí b?t 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. "NCName" is an XML data-type and must not be 	TokenNameCOMMENT_LINE	and must not be translated. "NCName" is an XML data-type and must not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"Hodnota atributu ''name'' instrukce xsl:processing-instruction musí b?t platn?m názvem NCName: {0}"	TokenNameStringLiteral	Hodnota atributu ''name'' instrukce xsl:processing-instruction musí b?t platn?m názvem NCName: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message is reported if the stylesheet that is 	TokenNameCOMMENT_LINE	Note to translators: This message is reported if the stylesheet that is 
// being processed attempted to construct an XML document with an attribute in a 	TokenNameCOMMENT_LINE	being processed attempted to construct an XML document with an attribute in a 
// place other than on an element. The substitution text specifies the name of 	TokenNameCOMMENT_LINE	place other than on an element. The substitution text specifies the name of 
// the attribute. 	TokenNameCOMMENT_LINE	the attribute. 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Nelze p?idat atribut {0} po uzlech potomk? ani p?ed tím, ne? je vytvo?en prvek. Atribut bude ignorován."	TokenNameStringLiteral	Nelze p?idat atribut {0} po uzlech potomk? ani p?ed tím, ne? je vytvo?en prvek. Atribut bude ignorován.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"Pokus o úpravu objektu, u kterého nejsou úpravy povoleny."	TokenNameStringLiteral	Pokus o úpravu objektu, u kterého nejsou úpravy povoleny.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 	TokenNameCOMMENT_LINE	Check: WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"cs"	TokenNameStringLiteral	cs
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"cs"	TokenNameStringLiteral	cs
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"cs"	TokenNameStringLiteral	cs
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"Parametr funkce createMessage je mimo limit"	TokenNameStringLiteral	Parametr funkce createMessage je mimo limit
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"P?i volání funkce messageFormat do?lo k v?jimce"	TokenNameStringLiteral	P?i volání funkce messageFormat do?lo k v?jimce
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Verze Xalan "	TokenNameStringLiteral	>>>>>>> Verze Xalan 
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
"ano"	TokenNameStringLiteral	ano
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"?ádek #"	TokenNameStringLiteral	?ádek #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Sloupec #"	TokenNameStringLiteral	Sloupec #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: hotovo"	TokenNameStringLiteral	XSLProcessor: hotovo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following messages provide usage information 	TokenNameCOMMENT_LINE	Note to translators: The following messages provide usage information 
// for the Xalan Process command line. "Process" is the name of a Java class, 	TokenNameCOMMENT_LINE	for the Xalan Process command line. "Process" is the name of a Java class, 
// and should not be translated. 	TokenNameCOMMENT_LINE	and should not be translated. 
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"P?íkazov? ?ádek Xalan-J: Zpracování voleb t?ídy:"	TokenNameStringLiteral	P?íkazov? ?ádek Xalan-J: Zpracování voleb t?ídy:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"P?íkazov? ?ádek Xalan-J: Zpracování voleb t?ídy:"	TokenNameStringLiteral	P?íkazov? ?ádek Xalan-J: Zpracování voleb t?ídy:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xsltc_option"	TokenNameStringLiteral	xslProc_invalid_xsltc_option
,	TokenNameCOMMA	
"Volba {0} není v re?imu XSLTC podporovaná."	TokenNameStringLiteral	Volba {0} není v re?imu XSLTC podporovaná.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_invalid_xalan_option"	TokenNameStringLiteral	xslProc_invalid_xalan_option
,	TokenNameCOMMA	
"Volba {0} m??e b?t pou?ita pouze s -XSLTC."	TokenNameStringLiteral	Volba {0} m??e b?t pou?ita pouze s -XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_no_input"	TokenNameStringLiteral	xslProc_no_input
,	TokenNameCOMMA	
"Chyba: ?ádná p?edloha stylu ani vstup xml nejsou ur?eny. K zobrazení pokyn? spus?te tento p?íkaz bez jakékoliv volby."	TokenNameStringLiteral	Chyba: ?ádná p?edloha stylu ani vstup xml nejsou ur?eny. K zobrazení pokyn? spus?te tento p?íkaz bez jakékoliv volby.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_common_options"	TokenNameStringLiteral	xslProc_common_options
,	TokenNameCOMMA	
"-Obecné volby-"	TokenNameStringLiteral	-Obecné volby-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xalan_options"	TokenNameStringLiteral	xslProc_xalan_options
,	TokenNameCOMMA	
"-Volby pro Xalan-"	TokenNameStringLiteral	-Volby pro Xalan-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_xsltc_options"	TokenNameStringLiteral	xslProc_xsltc_options
,	TokenNameCOMMA	
"-Volby pro XSLTC-"	TokenNameStringLiteral	-Volby pro XSLTC-
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_return_to_continue"	TokenNameStringLiteral	xslProc_return_to_continue
,	TokenNameCOMMA	
"(pokra?ujte stisknutím klávesy <Enter>)"	TokenNameStringLiteral	(pokra?ujte stisknutím klávesy <Enter>)
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
" [-XSLTC (pou?ije XSLTC pro transformaci)]"	TokenNameStringLiteral	 [-XSLTC (pou?ije XSLTC pro transformaci)]
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
" [-XSL XSLTransformationURL]"	TokenNameStringLiteral	 [-XSL XSLTransformationURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionOUT"	TokenNameStringLiteral	optionOUT
,	TokenNameCOMMA	
" [-OUT outputFileName]"	TokenNameStringLiteral	 [-OUT outputFileName]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCIN"	TokenNameStringLiteral	optionLXCIN
,	TokenNameCOMMA	
" [-LXCIN compiledStylesheetFileNameIn]"	TokenNameStringLiteral	 [-LXCIN compiledStylesheetFileNameIn]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCOUT"	TokenNameStringLiteral	optionLXCOUT
,	TokenNameCOMMA	
" [-LXCOUT compiledStylesheetFileNameOutOut]"	TokenNameStringLiteral	 [-LXCOUT compiledStylesheetFileNameOutOut]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARSER"	TokenNameStringLiteral	optionPARSER
,	TokenNameCOMMA	
" [-PARSER pln? kvalifikovan? název t?ídy spojení analyzátoru]"	TokenNameStringLiteral	 [-PARSER pln? kvalifikovan? název t?ídy spojení analyzátoru]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionE"	TokenNameStringLiteral	optionE
,	TokenNameCOMMA	
" [-E (neroz?i?ovat odkazy entity)]"	TokenNameStringLiteral	 [-E (neroz?i?ovat odkazy entity)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionV"	TokenNameStringLiteral	optionV
,	TokenNameCOMMA	
" [-E (neroz?i?ovat odkazy entity)]"	TokenNameStringLiteral	 [-E (neroz?i?ovat odkazy entity)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQC"	TokenNameStringLiteral	optionQC
,	TokenNameCOMMA	
" [-QC (varování p?ed konflikty vzorkování v tichém re?imu)]"	TokenNameStringLiteral	 [-QC (varování p?ed konflikty vzorkování v tichém re?imu)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQ"	TokenNameStringLiteral	optionQ
,	TokenNameCOMMA	
" [-Q (tich? re?im)]"	TokenNameStringLiteral	 [-Q (tich? re?im)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLF"	TokenNameStringLiteral	optionLF
,	TokenNameCOMMA	
" [-LF (ve v?stupu pou?ít pouze ?ádkování - LF {v?chozí nastavení je CR/LF})]"	TokenNameStringLiteral	 [-LF (ve v?stupu pou?ít pouze ?ádkování - LF {v?chozí nastavení je CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCR"	TokenNameStringLiteral	optionCR
,	TokenNameCOMMA	
" [-CR (ve v?stupu pou?ít pouze znak nov? ?ádek - CR {v?chozí nastavení je CR/LF})]"	TokenNameStringLiteral	 [-CR (ve v?stupu pou?ít pouze znak nov? ?ádek - CR {v?chozí nastavení je CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionESCAPE"	TokenNameStringLiteral	optionESCAPE
,	TokenNameCOMMA	
" [-ESCAPE (nastavení znak? escape sekvence {v?chozí nastavení je <>&"'\r\n}]"	TokenNameStringLiteral	 [-ESCAPE (nastavení znak? escape sekvence {v?chozí nastavení je <>&"'\r\n}]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINDENT"	TokenNameStringLiteral	optionINDENT
,	TokenNameCOMMA	
" [-INDENT (ovliv?uje po?et znak? odsazení {v?chozí nastavení je 0})]"	TokenNameStringLiteral	 [-INDENT (ovliv?uje po?et znak? odsazení {v?chozí nastavení je 0})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTT"	TokenNameStringLiteral	optionTT
,	TokenNameCOMMA	
" [-TT (trasuje ?ablony p?i volání)]"	TokenNameStringLiteral	 [-TT (trasuje ?ablony p?i volání)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTG"	TokenNameStringLiteral	optionTG
,	TokenNameCOMMA	
" [-TG (trasuje v?echny události generování)]"	TokenNameStringLiteral	 [-TG (trasuje v?echny události generování)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTS"	TokenNameStringLiteral	optionTS
,	TokenNameCOMMA	
" [-TS (trasuje v?echny události v?b?ru)]"	TokenNameStringLiteral	 [-TS (trasuje v?echny události v?b?ru)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTTC"	TokenNameStringLiteral	optionTTC
,	TokenNameCOMMA	
" [-TTC (trasuje potomky ?ablony v pr?b?hu jejich zpracování)]"	TokenNameStringLiteral	 [-TTC (trasuje potomky ?ablony v pr?b?hu jejich zpracování)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTCLASS"	TokenNameStringLiteral	optionTCLASS
,	TokenNameCOMMA	
" [-TCLASS (t?ída TraceListener p?ípon trasování)]"	TokenNameStringLiteral	 [-TCLASS (t?ída TraceListener p?ípon trasování)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionVALIDATE"	TokenNameStringLiteral	optionVALIDATE
,	TokenNameCOMMA	
" [-VALIDATE (zapíná/vypíná validaci; v?chozí nastavení je vypnuto)]"	TokenNameStringLiteral	 [-VALIDATE (zapíná/vypíná validaci; v?chozí nastavení je vypnuto)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionEDUMP"	TokenNameStringLiteral	optionEDUMP
,	TokenNameCOMMA	
" [-EDUMP {voliteln? název souboru} (p?i chyb? vypí?e obsah zásobníku)]"	TokenNameStringLiteral	 [-EDUMP {voliteln? název souboru} (p?i chyb? vypí?e obsah zásobníku)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXML"	TokenNameStringLiteral	optionXML
,	TokenNameCOMMA	
" [-XML (pou?ije program pro formátování XML a p?idá záhlaví XML)]"	TokenNameStringLiteral	 [-XML (pou?ije program pro formátování XML a p?idá záhlaví XML)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTEXT"	TokenNameStringLiteral	optionTEXT
,	TokenNameCOMMA	
" [-TEXT (pou?ije jednoduch? program pro formátování textu)]"	TokenNameStringLiteral	 [-TEXT (pou?ije jednoduch? program pro formátování textu)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionHTML"	TokenNameStringLiteral	optionHTML
,	TokenNameCOMMA	
" [-HTML (pou?ije program pro formátování HTML)]"	TokenNameStringLiteral	 [-HTML (pou?ije program pro formátování HTML)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARAM"	TokenNameStringLiteral	optionPARAM
,	TokenNameCOMMA	
" [-PARAM název v?razu (nastaví parametr p?edlohy se styly)]"	TokenNameStringLiteral	 [-PARAM název v?razu (nastaví parametr p?edlohy se styly)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"Proces XSL nebyl úsp??n?."	TokenNameStringLiteral	Proces XSL nebyl úsp??n?.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** Nelze najít analyzátor **"	TokenNameStringLiteral	** Nelze najít analyzátor **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Zkontrolujte cestu classpath."	TokenNameStringLiteral	Zkontrolujte cestu classpath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Nemáte-li analyzátor XML jazyka Java spole?nosti IBM, m??ete si jej stáhnout z adresy:"	TokenNameStringLiteral	Nemáte-li analyzátor XML jazyka Java spole?nosti IBM, m??ete si jej stáhnout z adresy:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	AlphaWorks: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionURIRESOLVER"	TokenNameStringLiteral	optionURIRESOLVER
,	TokenNameCOMMA	
" [-URIRESOLVER celé jméno t?ídy (pro p?eklad URI pou?ije funkci URIResolver)]"	TokenNameStringLiteral	 [-URIRESOLVER celé jméno t?ídy (pro p?eklad URI pou?ije funkci URIResolver)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionENTITYRESOLVER"	TokenNameStringLiteral	optionENTITYRESOLVER
,	TokenNameCOMMA	
" [-ENTITYRESOLVER celé jméno t?ídy (pro p?eklad entit pou?ije funkci EntityResolver)]"	TokenNameStringLiteral	 [-ENTITYRESOLVER celé jméno t?ídy (pro p?eklad entit pou?ije funkci EntityResolver)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCONTENTHANDLER"	TokenNameStringLiteral	optionCONTENTHANDLER
,	TokenNameCOMMA	
" [-CONTENTHANDLER celé jméno t?ídy (pro serializaci v?stupu pou?ije funkci ContentHandler)]"	TokenNameStringLiteral	 [-CONTENTHANDLER celé jméno t?ídy (pro serializaci v?stupu pou?ije funkci ContentHandler)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLINENUMBERS"	TokenNameStringLiteral	optionLINENUMBERS
,	TokenNameCOMMA	
" [-L ve zdrojovém dokumentu pou?ije ?ísla ?ádk?]"	TokenNameStringLiteral	 [-L ve zdrojovém dokumentu pou?ije ?ísla ?ádk?]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSECUREPROCESSING"	TokenNameStringLiteral	optionSECUREPROCESSING
,	TokenNameCOMMA	
" [-SECURE (nastaví funkci zabezpe?eného zpracování na hodnotu True.)]"	TokenNameStringLiteral	 [-SECURE (nastaví funkci zabezpe?eného zpracování na hodnotu True.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
"optionMEDIA"	TokenNameStringLiteral	optionMEDIA
,	TokenNameCOMMA	
" [-MEDIA mediaType (k vyhledání p?edlohy se styly p?i?azené dokumentu pou?ije atribut média)]"	TokenNameStringLiteral	 [-MEDIA mediaType (k vyhledání p?edlohy se styly p?i?azené dokumentu pou?ije atribut média)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionFLAVOR"	TokenNameStringLiteral	optionFLAVOR
,	TokenNameCOMMA	
" [-FLAVOR flavorName (p?i transformaci se explicitn? pou?ije s2s=SAX nebo d2d=DOM)] "	TokenNameStringLiteral	 [-FLAVOR flavorName (p?i transformaci se explicitn? pou?ije s2s=SAX nebo d2d=DOM)] 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Added by sboag/scurcuru; experimental 	TokenNameCOMMENT_LINE	Added by sboag/scurcuru; experimental 
{	TokenNameLBRACE	
"optionDIAG"	TokenNameStringLiteral	optionDIAG
,	TokenNameCOMMA	
" [-DIAG (vytiskne ?as transformace v milisekundách)]"	TokenNameStringLiteral	 [-DIAG (vytiskne ?as transformace v milisekundách)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINCREMENTAL"	TokenNameStringLiteral	optionINCREMENTAL
,	TokenNameCOMMA	
" [-INCREMENTAL (vy?aduje inkrementální konstrukci DTM nastavením hodnoty http://xml.apache.org/xalan/features/incremental na true)]"	TokenNameStringLiteral	 [-INCREMENTAL (vy?aduje inkrementální konstrukci DTM nastavením hodnoty http://xml.apache.org/xalan/features/incremental na true)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionNOOPTIMIMIZE"	TokenNameStringLiteral	optionNOOPTIMIMIZE
,	TokenNameCOMMA	
" [-NOOPTIMIMIZE (vy?aduje optimalizaci p?edlohy se styly nastavením hodnoty http://xml.apache.org/xalan/features/optimize na false)]"	TokenNameStringLiteral	 [-NOOPTIMIMIZE (vy?aduje optimalizaci p?edlohy se styly nastavením hodnoty http://xml.apache.org/xalan/features/optimize na false)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionRL"	TokenNameStringLiteral	optionRL
,	TokenNameCOMMA	
" [-RL recursionlimit (potvrdí ?íseln? limit hloubky p?edlohy se styly)]"	TokenNameStringLiteral	 [-RL recursionlimit (potvrdí ?íseln? limit hloubky p?edlohy se styly)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXO"	TokenNameStringLiteral	optionXO
,	TokenNameCOMMA	
" [-XO [transletName] (p?i?adí název k generovanému transletu)]"	TokenNameStringLiteral	 [-XO [transletName] (p?i?adí název k generovanému transletu)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXD"	TokenNameStringLiteral	optionXD
,	TokenNameCOMMA	
" [-XD destinationDirectory (ur?uje cílov? adresá? pro translet)]"	TokenNameStringLiteral	 [-XD destinationDirectory (ur?uje cílov? adresá? pro translet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXJ"	TokenNameStringLiteral	optionXJ
,	TokenNameCOMMA	
" [-XJ jarfile (zabalí t?ídy transletu do souboru jar s názvem <jarfile>)]"	TokenNameStringLiteral	 [-XJ jarfile (zabalí t?ídy transletu do souboru jar s názvem <jarfile>)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXP"	TokenNameStringLiteral	optionXP
,	TokenNameCOMMA	
" [-XP package (ur?í p?edponu názvu sady pro v?echny generované t?ídy transletu)]"	TokenNameStringLiteral	 [-XP package (ur?í p?edponu názvu sady pro v?echny generované t?ídy transletu)]
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
" [-XN (povolí zarovnání ?ablon)]"	TokenNameStringLiteral	 [-XN (povolí zarovnání ?ablon)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXX"	TokenNameStringLiteral	optionXX
,	TokenNameCOMMA	
" [-XX (zapne dal?í v?stup zpráv lad?ní)]"	TokenNameStringLiteral	 [-XX (zapne dal?í v?stup zpráv lad?ní)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXT"	TokenNameStringLiteral	optionXT
,	TokenNameCOMMA	
" [-XT (Pou?ije translet k transformaci, je-li to mo?né)]"	TokenNameStringLiteral	 [-XT (Pou?ije translet k transformaci, je-li to mo?né)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"diagTiming"	TokenNameStringLiteral	diagTiming
,	TokenNameCOMMA	
" --------- Transformace {0} pomocí {1} trvala {2} ms."	TokenNameStringLiteral	 --------- Transformace {0} pomocí {1} trvala {2} ms.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"recursionTooDeep"	TokenNameStringLiteral	recursionTooDeep
,	TokenNameCOMMA	
"Vno?ení ?ablon je p?íli? hluboké. Vno?ení = {0}, ?ablona {1} {2}"	TokenNameStringLiteral	Vno?ení ?ablon je p?íli? hluboké. Vno?ení = {0}, ?ablona {1} {2}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nameIs"	TokenNameStringLiteral	nameIs
,	TokenNameCOMMA	
"název je"	TokenNameStringLiteral	název je
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"matchPatternIs"	TokenNameStringLiteral	matchPatternIs
,	TokenNameCOMMA	
"vzorek shody je"	TokenNameStringLiteral	vzorek shody je
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
"#chyba"	TokenNameStringLiteral	#chyba
;	TokenNameSEMICOLON	
/** String to prepend to error messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to error messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HEADER	TokenNameIdentifier	 ERROR  HEADER
=	TokenNameEQUAL	
"Chyba: "	TokenNameStringLiteral	Chyba: 
;	TokenNameSEMICOLON	
/** String to prepend to warning messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to warning messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Varování: "	TokenNameStringLiteral	Varování: 
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
"cs"	TokenNameStringLiteral	cs
,	TokenNameCOMMA	
"CZ"	TokenNameStringLiteral	CZ
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
