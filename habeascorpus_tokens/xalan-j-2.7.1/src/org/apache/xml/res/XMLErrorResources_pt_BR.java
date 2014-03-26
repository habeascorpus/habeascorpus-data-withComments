/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLErrorResources_pt_BR.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLErrorResources_pt_BR.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
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
/** * Set up error messages. * We build a two dimensional array of message keys and * message strings. In order to add a new message here, * you need to first add a String constant. And you need * to enter key, value pair as part of the contents * array. You also need to update MAX_CODE for error strings * and MAX_WARNING for warnings ( Needed for only information * purpose ) */	TokenNameCOMMENT_JAVADOC	 Set up error messages. We build a two dimensional array of message keys and message strings. In order to add a new message here, you need to first add a String constant. And you need to enter key, value pair as part of the contents array. You also need to update MAX_CODE for error strings and MAX_WARNING for warnings ( Needed for only information purpose ) 
public	TokenNamepublic	
class	TokenNameclass	
XMLErrorResources_pt_BR	TokenNameIdentifier	 XML Error Resources pt  BR
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/* * This file contains error and warning messages related to Xalan Error * Handling. * * General notes to translators: * * 1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of * components. * XSLT is an acronym for "XML Stylesheet Language: Transformations". * XSLTC is an acronym for XSLT Compiler. * * 2) A stylesheet is a description of how to transform an input XML document * into a resultant XML document (or HTML document or text). The * stylesheet itself is described in the form of an XML document. * * 3) A template is a component of a stylesheet that is used to match a * particular portion of an input document and specifies the form of the * corresponding portion of the output document. * * 4) An element is a mark-up tag in an XML document; an attribute is a * modifier on the tag. For example, in <elem attr='val' attr2='val2'> * "elem" is an element name, "attr" and "attr2" are attribute names with * the values "val" and "val2", respectively. * * 5) A namespace declaration is a special attribute that is used to associate * a prefix with a URI (the namespace). The meanings of element names and * attribute names that use that prefix are defined with respect to that * namespace. * * 6) "Translet" is an invented term that describes the class file that * results from compiling an XML stylesheet into a Java class. * * 7) XPath is a specification that describes a notation for identifying * nodes in a tree-structured representation of an XML document. An * instance of that notation is referred to as an XPath expression. * */	TokenNameCOMMENT_BLOCK	 This file contains error and warning messages related to Xalan Error Handling. * General notes to translators: * 1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of components. XSLT is an acronym for "XML Stylesheet Language: Transformations". XSLTC is an acronym for XSLT Compiler. * 2) A stylesheet is a description of how to transform an input XML document into a resultant XML document (or HTML document or text). The stylesheet itself is described in the form of an XML document. * 3) A template is a component of a stylesheet that is used to match a particular portion of an input document and specifies the form of the corresponding portion of the output document. * 4) An element is a mark-up tag in an XML document; an attribute is a modifier on the tag. For example, in <elem attr='val' attr2='val2'> "elem" is an element name, "attr" and "attr2" are attribute names with the values "val" and "val2", respectively. * 5) A namespace declaration is a special attribute that is used to associate a prefix with a URI (the namespace). The meanings of element names and attribute names that use that prefix are defined with respect to that namespace. * 6) "Translet" is an invented term that describes the class file that results from compiling an XML stylesheet into a Java class. * 7) XPath is a specification that describes a notation for identifying nodes in a tree-structured representation of an XML document. An instance of that notation is referred to as an XPath expression. 
/* * Message keys */	TokenNameCOMMENT_BLOCK	 Message keys 
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
ER_CANNOT_OVERWRITE_CAUSE	TokenNameIdentifier	 ER  CANNOT  OVERWRITE  CAUSE
=	TokenNameEQUAL	
"ER_CANNOT_OVERWRITE_CAUSE"	TokenNameStringLiteral	ER_CANNOT_OVERWRITE_CAUSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_DEFAULT_IMPL	TokenNameIdentifier	 ER  NO  DEFAULT  IMPL
=	TokenNameEQUAL	
"ER_NO_DEFAULT_IMPL"	TokenNameStringLiteral	ER_NO_DEFAULT_IMPL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CHUNKEDINTARRAY_NOT_SUPPORTED	TokenNameIdentifier	 ER  CHUNKEDINTARRAY  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_CHUNKEDINTARRAY_NOT_SUPPORTED"	TokenNameStringLiteral	ER_CHUNKEDINTARRAY_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier	 ER  OFFSET  BIGGER  THAN  SLOT
=	TokenNameEQUAL	
"ER_OFFSET_BIGGER_THAN_SLOT"	TokenNameStringLiteral	ER_OFFSET_BIGGER_THAN_SLOT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier	 ER  COROUTINE  NOT  AVAIL
=	TokenNameEQUAL	
"ER_COROUTINE_NOT_AVAIL"	TokenNameStringLiteral	ER_COROUTINE_NOT_AVAIL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COROUTINE_CO_EXIT	TokenNameIdentifier	 ER  COROUTINE  CO  EXIT
=	TokenNameEQUAL	
"ER_COROUTINE_CO_EXIT"	TokenNameStringLiteral	ER_COROUTINE_CO_EXIT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COJOINROUTINESET_FAILED	TokenNameIdentifier	 ER  COJOINROUTINESET  FAILED
=	TokenNameEQUAL	
"ER_COJOINROUTINESET_FAILED"	TokenNameStringLiteral	ER_COJOINROUTINESET_FAILED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COROUTINE_PARAM	TokenNameIdentifier	 ER  COROUTINE  PARAM
=	TokenNameEQUAL	
"ER_COROUTINE_PARAM"	TokenNameStringLiteral	ER_COROUTINE_PARAM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PARSER_DOTERMINATE_ANSWERS	TokenNameIdentifier	 ER  PARSER  DOTERMINATE  ANSWERS
=	TokenNameEQUAL	
"ER_PARSER_DOTERMINATE_ANSWERS"	TokenNameStringLiteral	ER_PARSER_DOTERMINATE_ANSWERS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_PARSE_CALL_WHILE_PARSING	TokenNameIdentifier	 ER  NO  PARSE  CALL  WHILE  PARSING
=	TokenNameEQUAL	
"ER_NO_PARSE_CALL_WHILE_PARSING"	TokenNameStringLiteral	ER_NO_PARSE_CALL_WHILE_PARSING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  TYPED  ITERATOR  AXIS  NOT  IMPLEMENTED
=	TokenNameEQUAL	
"ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED"	TokenNameStringLiteral	ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  ITERATOR  AXIS  NOT  IMPLEMENTED
=	TokenNameEQUAL	
"ER_ITERATOR_AXIS_NOT_IMPLEMENTED"	TokenNameStringLiteral	ER_ITERATOR_AXIS_NOT_IMPLEMENTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ITERATOR_CLONE_NOT_SUPPORTED	TokenNameIdentifier	 ER  ITERATOR  CLONE  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_ITERATOR_CLONE_NOT_SUPPORTED"	TokenNameStringLiteral	ER_ITERATOR_CLONE_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_AXIS_TYPE	TokenNameIdentifier	 ER  UNKNOWN  AXIS  TYPE
=	TokenNameEQUAL	
"ER_UNKNOWN_AXIS_TYPE"	TokenNameStringLiteral	ER_UNKNOWN_AXIS_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_AXIS_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_AXIS_NOT_SUPPORTED"	TokenNameStringLiteral	ER_AXIS_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_DTMIDS_AVAIL	TokenNameIdentifier	 ER  NO  DTMIDS  AVAIL
=	TokenNameEQUAL	
"ER_NO_DTMIDS_AVAIL"	TokenNameStringLiteral	ER_NO_DTMIDS_AVAIL
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
ER_NODE_NON_NULL	TokenNameIdentifier	 ER  NODE  NON  NULL
=	TokenNameEQUAL	
"ER_NODE_NON_NULL"	TokenNameStringLiteral	ER_NODE_NON_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_RESOLVE_NODE	TokenNameIdentifier	 ER  COULD  NOT  RESOLVE  NODE
=	TokenNameEQUAL	
"ER_COULD_NOT_RESOLVE_NODE"	TokenNameStringLiteral	ER_COULD_NOT_RESOLVE_NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STARTPARSE_WHILE_PARSING	TokenNameIdentifier	 ER  STARTPARSE  WHILE  PARSING
=	TokenNameEQUAL	
"ER_STARTPARSE_WHILE_PARSING"	TokenNameStringLiteral	ER_STARTPARSE_WHILE_PARSING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STARTPARSE_NEEDS_SAXPARSER	TokenNameIdentifier	 ER  STARTPARSE  NEEDS  SAXPARSER
=	TokenNameEQUAL	
"ER_STARTPARSE_NEEDS_SAXPARSER"	TokenNameStringLiteral	ER_STARTPARSE_NEEDS_SAXPARSER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_INIT_PARSER	TokenNameIdentifier	 ER  COULD  NOT  INIT  PARSER
=	TokenNameEQUAL	
"ER_COULD_NOT_INIT_PARSER"	TokenNameStringLiteral	ER_COULD_NOT_INIT_PARSER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXCEPTION_CREATING_POOL	TokenNameIdentifier	 ER  EXCEPTION  CREATING  POOL
=	TokenNameEQUAL	
"ER_EXCEPTION_CREATING_POOL"	TokenNameStringLiteral	ER_EXCEPTION_CREATING_POOL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
=	TokenNameEQUAL	
"ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE"	TokenNameStringLiteral	ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
=	TokenNameEQUAL	
"ER_SCHEME_REQUIRED"	TokenNameStringLiteral	ER_SCHEME_REQUIRED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
=	TokenNameEQUAL	
"ER_NO_SCHEME_IN_URI"	TokenNameStringLiteral	ER_NO_SCHEME_IN_URI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_SCHEME_INURI	TokenNameIdentifier	 ER  NO  SCHEME  INURI
=	TokenNameEQUAL	
"ER_NO_SCHEME_INURI"	TokenNameStringLiteral	ER_NO_SCHEME_INURI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
=	TokenNameEQUAL	
"ER_PATH_INVALID_CHAR"	TokenNameStringLiteral	ER_PATH_INVALID_CHAR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
=	TokenNameEQUAL	
"ER_SCHEME_FROM_NULL_STRING"	TokenNameStringLiteral	ER_SCHEME_FROM_NULL_STRING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
=	TokenNameEQUAL	
"ER_SCHEME_NOT_CONFORMANT"	TokenNameStringLiteral	ER_SCHEME_NOT_CONFORMANT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
=	TokenNameEQUAL	
"ER_HOST_ADDRESS_NOT_WELLFORMED"	TokenNameStringLiteral	ER_HOST_ADDRESS_NOT_WELLFORMED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
=	TokenNameEQUAL	
"ER_PORT_WHEN_HOST_NULL"	TokenNameStringLiteral	ER_PORT_WHEN_HOST_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
=	TokenNameEQUAL	
"ER_INVALID_PORT"	TokenNameStringLiteral	ER_INVALID_PORT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
=	TokenNameEQUAL	
"ER_FRAG_FOR_GENERIC_URI"	TokenNameStringLiteral	ER_FRAG_FOR_GENERIC_URI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
=	TokenNameEQUAL	
"ER_FRAG_WHEN_PATH_NULL"	TokenNameStringLiteral	ER_FRAG_WHEN_PATH_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
=	TokenNameEQUAL	
"ER_FRAG_INVALID_CHAR"	TokenNameStringLiteral	ER_FRAG_INVALID_CHAR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PARSER_IN_USE	TokenNameIdentifier	 ER  PARSER  IN  USE
=	TokenNameEQUAL	
"ER_PARSER_IN_USE"	TokenNameStringLiteral	ER_PARSER_IN_USE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_CHANGE_WHILE_PARSING	TokenNameIdentifier	 ER  CANNOT  CHANGE  WHILE  PARSING
=	TokenNameEQUAL	
"ER_CANNOT_CHANGE_WHILE_PARSING"	TokenNameStringLiteral	ER_CANNOT_CHANGE_WHILE_PARSING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SELF_CAUSATION_NOT_PERMITTED	TokenNameIdentifier	 ER  SELF  CAUSATION  NOT  PERMITTED
=	TokenNameEQUAL	
"ER_SELF_CAUSATION_NOT_PERMITTED"	TokenNameStringLiteral	ER_SELF_CAUSATION_NOT_PERMITTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
=	TokenNameEQUAL	
"ER_NO_USERINFO_IF_NO_HOST"	TokenNameStringLiteral	ER_NO_USERINFO_IF_NO_HOST
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
=	TokenNameEQUAL	
"ER_NO_PORT_IF_NO_HOST"	TokenNameStringLiteral	ER_NO_PORT_IF_NO_HOST
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
=	TokenNameEQUAL	
"ER_NO_QUERY_STRING_IN_PATH"	TokenNameStringLiteral	ER_NO_QUERY_STRING_IN_PATH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
=	TokenNameEQUAL	
"ER_NO_FRAGMENT_STRING_IN_PATH"	TokenNameStringLiteral	ER_NO_FRAGMENT_STRING_IN_PATH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
=	TokenNameEQUAL	
"ER_CANNOT_INIT_URI_EMPTY_PARMS"	TokenNameStringLiteral	ER_CANNOT_INIT_URI_EMPTY_PARMS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_METHOD_NOT_SUPPORTED"	TokenNameStringLiteral	ER_METHOD_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INCRSAXSRCFILTER_NOT_RESTARTABLE	TokenNameIdentifier	 ER  INCRSAXSRCFILTER  NOT  RESTARTABLE
=	TokenNameEQUAL	
"ER_INCRSAXSRCFILTER_NOT_RESTARTABLE"	TokenNameStringLiteral	ER_INCRSAXSRCFILTER_NOT_RESTARTABLE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XMLRDR_NOT_BEFORE_STARTPARSE	TokenNameIdentifier	 ER  XMLRDR  NOT  BEFORE  STARTPARSE
=	TokenNameEQUAL	
"ER_XMLRDR_NOT_BEFORE_STARTPARSE"	TokenNameStringLiteral	ER_XMLRDR_NOT_BEFORE_STARTPARSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_AXIS_TRAVERSER_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  TRAVERSER  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_AXIS_TRAVERSER_NOT_SUPPORTED"	TokenNameStringLiteral	ER_AXIS_TRAVERSER_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER	TokenNameIdentifier	 ER  ERRORHANDLER  CREATED  WITH  NULL  PRINTWRITER
=	TokenNameEQUAL	
"ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER"	TokenNameStringLiteral	ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SYSTEMID_UNKNOWN	TokenNameIdentifier	 ER  SYSTEMID  UNKNOWN
=	TokenNameEQUAL	
"ER_SYSTEMID_UNKNOWN"	TokenNameStringLiteral	ER_SYSTEMID_UNKNOWN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_LOCATION_UNKNOWN	TokenNameIdentifier	 ER  LOCATION  UNKNOWN
=	TokenNameEQUAL	
"ER_LOCATION_UNKNOWN"	TokenNameStringLiteral	ER_LOCATION_UNKNOWN
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
ER_CREATEDOCUMENT_NOT_SUPPORTED	TokenNameIdentifier	 ER  CREATEDOCUMENT  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_CREATEDOCUMENT_NOT_SUPPORTED"	TokenNameStringLiteral	ER_CREATEDOCUMENT_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CHILD_HAS_NO_OWNER_DOCUMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT
=	TokenNameEQUAL	
"ER_CHILD_HAS_NO_OWNER_DOCUMENT"	TokenNameStringLiteral	ER_CHILD_HAS_NO_OWNER_DOCUMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT  ELEMENT
=	TokenNameEQUAL	
"ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT"	TokenNameStringLiteral	ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_OUTPUT_TEXT_BEFORE_DOC	TokenNameIdentifier	 ER  CANT  OUTPUT  TEXT  BEFORE  DOC
=	TokenNameEQUAL	
"ER_CANT_OUTPUT_TEXT_BEFORE_DOC"	TokenNameStringLiteral	ER_CANT_OUTPUT_TEXT_BEFORE_DOC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_HAVE_MORE_THAN_ONE_ROOT	TokenNameIdentifier	 ER  CANT  HAVE  MORE  THAN  ONE  ROOT
=	TokenNameEQUAL	
"ER_CANT_HAVE_MORE_THAN_ONE_ROOT"	TokenNameStringLiteral	ER_CANT_HAVE_MORE_THAN_ONE_ROOT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
=	TokenNameEQUAL	
"ER_ARG_LOCALNAME_NULL"	TokenNameStringLiteral	ER_ARG_LOCALNAME_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
=	TokenNameEQUAL	
"ER_ARG_LOCALNAME_INVALID"	TokenNameStringLiteral	ER_ARG_LOCALNAME_INVALID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ARG_PREFIX_INVALID	TokenNameIdentifier	 ER  ARG  PREFIX  INVALID
=	TokenNameEQUAL	
"ER_ARG_PREFIX_INVALID"	TokenNameStringLiteral	ER_ARG_PREFIX_INVALID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NAME_CANT_START_WITH_COLON	TokenNameIdentifier	 ER  NAME  CANT  START  WITH  COLON
=	TokenNameEQUAL	
"ER_NAME_CANT_START_WITH_COLON"	TokenNameStringLiteral	ER_NAME_CANT_START_WITH_COLON
;	TokenNameSEMICOLON	
/* * Now fill in the message text. * Then fill in the message text for that message code in the * array. Use the new error code as the index into the array. */	TokenNameCOMMENT_BLOCK	 Now fill in the message text. Then fill in the message text for that message code in the array. Use the new error code as the index into the array. 
// Error messages... 	TokenNameCOMMENT_LINE	Error messages... 
/** * Get the lookup table for error messages * * @return The association list. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages * @return The association list. 
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
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Função não suportada!"	TokenNameStringLiteral	Função não suportada!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_OVERWRITE_CAUSE	TokenNameIdentifier	 ER  CANNOT  OVERWRITE  CAUSE
,	TokenNameCOMMA	
"Impossível sobrepor causa"	TokenNameStringLiteral	Impossível sobrepor causa
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DEFAULT_IMPL	TokenNameIdentifier	 ER  NO  DEFAULT  IMPL
,	TokenNameCOMMA	
"Nenhuma implementação padrão encontrada"	TokenNameStringLiteral	Nenhuma implementação padrão encontrada
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHUNKEDINTARRAY_NOT_SUPPORTED	TokenNameIdentifier	 ER  CHUNKEDINTARRAY  NOT  SUPPORTED
,	TokenNameCOMMA	
"ChunkedIntArray({0}) não suportado atualmente"	TokenNameStringLiteral	ChunkedIntArray({0}) não suportado atualmente
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier	 ER  OFFSET  BIGGER  THAN  SLOT
,	TokenNameCOMMA	
"Deslocamento maior que slot"	TokenNameStringLiteral	Deslocamento maior que slot
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier	 ER  COROUTINE  NOT  AVAIL
,	TokenNameCOMMA	
"Co-rotina não disponível, id={0}"	TokenNameStringLiteral	Co-rotina não disponível, id={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COROUTINE_CO_EXIT	TokenNameIdentifier	 ER  COROUTINE  CO  EXIT
,	TokenNameCOMMA	
"CoroutineManager recebido para pedido co_exit()"	TokenNameStringLiteral	CoroutineManager recebido para pedido co_exit()
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COJOINROUTINESET_FAILED	TokenNameIdentifier	 ER  COJOINROUTINESET  FAILED
,	TokenNameCOMMA	
"Falha de co_joinCoroutineSet()"	TokenNameStringLiteral	Falha de co_joinCoroutineSet()
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COROUTINE_PARAM	TokenNameIdentifier	 ER  COROUTINE  PARAM
,	TokenNameCOMMA	
"Erro de parâmetro coroutine ({0})"	TokenNameStringLiteral	Erro de parâmetro coroutine ({0})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_DOTERMINATE_ANSWERS	TokenNameIdentifier	 ER  PARSER  DOTERMINATE  ANSWERS
,	TokenNameCOMMA	
" INESPERADO: doTerminate do analisador respondeu {0}"	TokenNameStringLiteral	 INESPERADO: doTerminate do analisador respondeu {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARSE_CALL_WHILE_PARSING	TokenNameIdentifier	 ER  NO  PARSE  CALL  WHILE  PARSING
,	TokenNameCOMMA	
"parse não pode ser chamado durante análise"	TokenNameStringLiteral	parse não pode ser chamado durante análise
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  TYPED  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"Erro: digitado repetidor para eixo {0} não implementado"	TokenNameStringLiteral	Erro: digitado repetidor para eixo {0} não implementado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"Erro: repetidor para eixo {0} não implementado"	TokenNameStringLiteral	Erro: repetidor para eixo {0} não implementado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ITERATOR_CLONE_NOT_SUPPORTED	TokenNameIdentifier	 ER  ITERATOR  CLONE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Clone de repetidor não suportado"	TokenNameStringLiteral	Clone de repetidor não suportado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_AXIS_TYPE	TokenNameIdentifier	 ER  UNKNOWN  AXIS  TYPE
,	TokenNameCOMMA	
"Tipo de passagem de eixo desconhecida: {0}"	TokenNameStringLiteral	Tipo de passagem de eixo desconhecida: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_AXIS_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  NOT  SUPPORTED
,	TokenNameCOMMA	
"Atravessador de eixo não suportado: {0}"	TokenNameStringLiteral	Atravessador de eixo não suportado: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DTMIDS_AVAIL	TokenNameIdentifier	 ER  NO  DTMIDS  AVAIL
,	TokenNameCOMMA	
"Não existem mais IDs de DTM disponíveis"	TokenNameStringLiteral	Não existem mais IDs de DTM disponíveis
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Não suportado: {0}"	TokenNameStringLiteral	Não suportado: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NON_NULL	TokenNameIdentifier	 ER  NODE  NON  NULL
,	TokenNameCOMMA	
"O nó não deve ser nulo para getDTMHandleFromNode"	TokenNameStringLiteral	O nó não deve ser nulo para getDTMHandleFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_RESOLVE_NODE	TokenNameIdentifier	 ER  COULD  NOT  RESOLVE  NODE
,	TokenNameCOMMA	
"Não foi possível resolver o nó para um identificador"	TokenNameStringLiteral	Não foi possível resolver o nó para um identificador
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STARTPARSE_WHILE_PARSING	TokenNameIdentifier	 ER  STARTPARSE  WHILE  PARSING
,	TokenNameCOMMA	
"startParse não pode ser chamado durante análise"	TokenNameStringLiteral	startParse não pode ser chamado durante análise
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STARTPARSE_NEEDS_SAXPARSER	TokenNameIdentifier	 ER  STARTPARSE  NEEDS  SAXPARSER
,	TokenNameCOMMA	
"startParse precisa de um SAXParser não-nulo"	TokenNameStringLiteral	startParse precisa de um SAXParser não-nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_INIT_PARSER	TokenNameIdentifier	 ER  COULD  NOT  INIT  PARSER
,	TokenNameCOMMA	
"não foi possível inicializar analisador com"	TokenNameStringLiteral	não foi possível inicializar analisador com
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXCEPTION_CREATING_POOL	TokenNameIdentifier	 ER  EXCEPTION  CREATING  POOL
,	TokenNameCOMMA	
"exceção ao criar nova instância para o conjunto"	TokenNameStringLiteral	exceção ao criar nova instância para o conjunto
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"O caminho contém seqüência de escape inválida"	TokenNameStringLiteral	O caminho contém seqüência de escape inválida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"O esquema é obrigatório!"	TokenNameStringLiteral	O esquema é obrigatório!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"Nenhum esquema encontrado no URI: {0}"	TokenNameStringLiteral	Nenhum esquema encontrado no URI: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SCHEME_INURI	TokenNameIdentifier	 ER  NO  SCHEME  INURI
,	TokenNameCOMMA	
"Nenhum esquema encontrado no URI"	TokenNameStringLiteral	Nenhum esquema encontrado no URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"O caminho contém caractere inválido: {0}"	TokenNameStringLiteral	O caminho contém caractere inválido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Impossível definir esquema a partir da cadeia nula"	TokenNameStringLiteral	Impossível definir esquema a partir da cadeia nula
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"O esquema não está em conformidade."	TokenNameStringLiteral	O esquema não está em conformidade.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"O host não é um endereço formado corretamente"	TokenNameStringLiteral	O host não é um endereço formado corretamente
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"A porta não pode ser definida quando o host é nulo"	TokenNameStringLiteral	A porta não pode ser definida quando o host é nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"Número de porta inválido"	TokenNameStringLiteral	Número de porta inválido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"O fragmento só pode ser definido para um URI genérico"	TokenNameStringLiteral	O fragmento só pode ser definido para um URI genérico
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"O fragmento não pode ser definido quando o caminho é nulo"	TokenNameStringLiteral	O fragmento não pode ser definido quando o caminho é nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"O fragmento contém caractere inválido"	TokenNameStringLiteral	O fragmento contém caractere inválido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_IN_USE	TokenNameIdentifier	 ER  PARSER  IN  USE
,	TokenNameCOMMA	
"O analisador já está sendo utilizado"	TokenNameStringLiteral	O analisador já está sendo utilizado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CHANGE_WHILE_PARSING	TokenNameIdentifier	 ER  CANNOT  CHANGE  WHILE  PARSING
,	TokenNameCOMMA	
"Impossível alterar {0} {1} durante análise"	TokenNameStringLiteral	Impossível alterar {0} {1} durante análise
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SELF_CAUSATION_NOT_PERMITTED	TokenNameIdentifier	 ER  SELF  CAUSATION  NOT  PERMITTED
,	TokenNameCOMMA	
"Auto-causação não permitida"	TokenNameStringLiteral	Auto-causação não permitida
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Userinfo não pode ser especificado se host não for especificado"	TokenNameStringLiteral	Userinfo não pode ser especificado se host não for especificado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Port não pode ser especificado se host não for especificado"	TokenNameStringLiteral	Port não pode ser especificado se host não for especificado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"A cadeia de consulta não pode ser especificada na cadeia de consulta e caminho"	TokenNameStringLiteral	A cadeia de consulta não pode ser especificada na cadeia de consulta e caminho
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"O fragmento não pode ser especificado no caminho e fragmento"	TokenNameStringLiteral	O fragmento não pode ser especificado no caminho e fragmento
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Impossível inicializar URI com parâmetros vazios"	TokenNameStringLiteral	Impossível inicializar URI com parâmetros vazios
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
"Método ainda não suportado"	TokenNameStringLiteral	Método ainda não suportado
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCRSAXSRCFILTER_NOT_RESTARTABLE	TokenNameIdentifier	 ER  INCRSAXSRCFILTER  NOT  RESTARTABLE
,	TokenNameCOMMA	
"IncrementalSAXSource_Filter atualmente não reinicializável"	TokenNameStringLiteral	IncrementalSAXSource_Filter atualmente não reinicializável
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLRDR_NOT_BEFORE_STARTPARSE	TokenNameIdentifier	 ER  XMLRDR  NOT  BEFORE  STARTPARSE
,	TokenNameCOMMA	
"XMLReader não antes do pedido startParse"	TokenNameStringLiteral	XMLReader não antes do pedido startParse
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_AXIS_TRAVERSER_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  TRAVERSER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Atravessador de eixo não suportado: {0}"	TokenNameStringLiteral	Atravessador de eixo não suportado: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER	TokenNameIdentifier	 ER  ERRORHANDLER  CREATED  WITH  NULL  PRINTWRITER
,	TokenNameCOMMA	
"ListingErrorHandler criado com nulo PrintWriter!"	TokenNameStringLiteral	ListingErrorHandler criado com nulo PrintWriter!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SYSTEMID_UNKNOWN	TokenNameIdentifier	 ER  SYSTEMID  UNKNOWN
,	TokenNameCOMMA	
"SystemId Desconhecido"	TokenNameStringLiteral	SystemId Desconhecido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_LOCATION_UNKNOWN	TokenNameIdentifier	 ER  LOCATION  UNKNOWN
,	TokenNameCOMMA	
"Localização de erro desconhecido"	TokenNameStringLiteral	Localização de erro desconhecido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"O prefixo deve ser resolvido para um espaço de nomes: {0}"	TokenNameStringLiteral	O prefixo deve ser resolvido para um espaço de nomes: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CREATEDOCUMENT_NOT_SUPPORTED	TokenNameIdentifier	 ER  CREATEDOCUMENT  NOT  SUPPORTED
,	TokenNameCOMMA	
"createDocument() não suportado em XPathContext!"	TokenNameStringLiteral	createDocument() não suportado em XPathContext!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHILD_HAS_NO_OWNER_DOCUMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT
,	TokenNameCOMMA	
"O atributo child não possui um documento do proprietário!"	TokenNameStringLiteral	O atributo child não possui um documento do proprietário!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT  ELEMENT
,	TokenNameCOMMA	
"O atributo child não possui um elemento de documento do proprietário!"	TokenNameStringLiteral	O atributo child não possui um elemento de documento do proprietário!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_OUTPUT_TEXT_BEFORE_DOC	TokenNameIdentifier	 ER  CANT  OUTPUT  TEXT  BEFORE  DOC
,	TokenNameCOMMA	
"Aviso: impossível emitir texto antes do elemento document! Ignorando..."	TokenNameStringLiteral	Aviso: impossível emitir texto antes do elemento document! Ignorando...
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_HAVE_MORE_THAN_ONE_ROOT	TokenNameIdentifier	 ER  CANT  HAVE  MORE  THAN  ONE  ROOT
,	TokenNameCOMMA	
"Impossível ter mais de uma raiz em um DOM!"	TokenNameStringLiteral	Impossível ter mais de uma raiz em um DOM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
,	TokenNameCOMMA	
"O argumento 'localName' é nulo"	TokenNameStringLiteral	O argumento 'localName' é nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A QNAME has the syntactic form [NCName:]NCName 	TokenNameCOMMENT_LINE	Note to translators: A QNAME has the syntactic form [NCName:]NCName 
// The localname is the portion after the optional colon; the message indicates 	TokenNameCOMMENT_LINE	The localname is the portion after the optional colon; the message indicates 
// that there is a problem with that part of the QNAME. 	TokenNameCOMMENT_LINE	that there is a problem with that part of the QNAME. 
{	TokenNameLBRACE	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
"Localname em QNAME deve ser um NCName válido"	TokenNameStringLiteral	Localname em QNAME deve ser um NCName válido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A QNAME has the syntactic form [NCName:]NCName 	TokenNameCOMMENT_LINE	Note to translators: A QNAME has the syntactic form [NCName:]NCName 
// The prefix is the portion before the optional colon; the message indicates 	TokenNameCOMMENT_LINE	The prefix is the portion before the optional colon; the message indicates 
// that there is a problem with that part of the QNAME. 	TokenNameCOMMENT_LINE	that there is a problem with that part of the QNAME. 
{	TokenNameLBRACE	
ER_ARG_PREFIX_INVALID	TokenNameIdentifier	 ER  ARG  PREFIX  INVALID
,	TokenNameCOMMA	
"O prefixo em QNAME deve ser um NCName válido"	TokenNameStringLiteral	O prefixo em QNAME deve ser um NCName válido
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAME_CANT_START_WITH_COLON	TokenNameIdentifier	 ER  NAME  CANT  START  WITH  COLON
,	TokenNameCOMMA	
"O nome não pode começar com um caractere de dois pontos (:)"	TokenNameStringLiteral	O nome não pode começar com um caractere de dois pontos (:)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"O parâmetro para createMessage estava fora dos limites"	TokenNameStringLiteral	O parâmetro para createMessage estava fora dos limites
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Exceção emitida durante chamada messageFormat"	TokenNameStringLiteral	Exceção emitida durante chamada messageFormat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Linha n°"	TokenNameStringLiteral	Linha n°
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Coluna n°"	TokenNameStringLiteral	Coluna n°
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a named ResourceBundle for a particular locale. This method mimics the behavior * of ResourceBundle.getBundle(). * * @param className the name of the class that implements the resource bundle. * @return the ResourceBundle * @throws MissingResourceException */	TokenNameCOMMENT_JAVADOC	 Return a named ResourceBundle for a particular locale. This method mimics the behavior of ResourceBundle.getBundle(). * @param className the name of the class that implements the resource bundle. @return the ResourceBundle @throws MissingResourceException 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
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
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
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
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
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
"pt"	TokenNameStringLiteral	pt
,	TokenNameCOMMA	
"BR"	TokenNameStringLiteral	BR
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
