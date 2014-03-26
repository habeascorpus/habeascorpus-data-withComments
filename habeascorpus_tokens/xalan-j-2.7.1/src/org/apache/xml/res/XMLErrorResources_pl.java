/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLErrorResources_pl.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLErrorResources_pl.java 468653 2006-10-28 07:07:05Z minchau $ 
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
XMLErrorResources_pl	TokenNameIdentifier	 XML Error Resources pl
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
"Nieobs?ugiwana funkcja!"	TokenNameStringLiteral	Nieobs?ugiwana funkcja!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_OVERWRITE_CAUSE	TokenNameIdentifier	 ER  CANNOT  OVERWRITE  CAUSE
,	TokenNameCOMMA	
"Nie mo?na nadpisa? przyczyny"	TokenNameStringLiteral	Nie mo?na nadpisa? przyczyny
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DEFAULT_IMPL	TokenNameIdentifier	 ER  NO  DEFAULT  IMPL
,	TokenNameCOMMA	
"Nie znaleziono domy?lnej implementacji"	TokenNameStringLiteral	Nie znaleziono domy?lnej implementacji
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHUNKEDINTARRAY_NOT_SUPPORTED	TokenNameIdentifier	 ER  CHUNKEDINTARRAY  NOT  SUPPORTED
,	TokenNameCOMMA	
"ChunkedIntArray({0}) nie jest obecnie obs?ugiwane"	TokenNameStringLiteral	ChunkedIntArray({0}) nie jest obecnie obs?ugiwane
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier	 ER  OFFSET  BIGGER  THAN  SLOT
,	TokenNameCOMMA	
"Przesuni?cie wi?ksze ni? szczelina"	TokenNameStringLiteral	Przesuni?cie wi?ksze ni? szczelina
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier	 ER  COROUTINE  NOT  AVAIL
,	TokenNameCOMMA	
"Koprocedura niedost?pna, id={0}"	TokenNameStringLiteral	Koprocedura niedost?pna, id={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COROUTINE_CO_EXIT	TokenNameIdentifier	 ER  COROUTINE  CO  EXIT
,	TokenNameCOMMA	
"CoroutineManager otrzyma? ??danie co_exit()"	TokenNameStringLiteral	CoroutineManager otrzyma? ??danie co_exit()
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COJOINROUTINESET_FAILED	TokenNameIdentifier	 ER  COJOINROUTINESET  FAILED
,	TokenNameCOMMA	
"co_joinCoroutineSet() nie powiod?o si?"	TokenNameStringLiteral	co_joinCoroutineSet() nie powiod?o si?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COROUTINE_PARAM	TokenNameIdentifier	 ER  COROUTINE  PARAM
,	TokenNameCOMMA	
"B??d parametru koprocedury ({0})"	TokenNameStringLiteral	B??d parametru koprocedury ({0})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_DOTERMINATE_ANSWERS	TokenNameIdentifier	 ER  PARSER  DOTERMINATE  ANSWERS
,	TokenNameCOMMA	
" NIEOCZEKIWANE: Analizator doTerminate odpowiada {0}"	TokenNameStringLiteral	 NIEOCZEKIWANE: Analizator doTerminate odpowiada {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PARSE_CALL_WHILE_PARSING	TokenNameIdentifier	 ER  NO  PARSE  CALL  WHILE  PARSING
,	TokenNameCOMMA	
"Nie mo?na wywo?a? parse podczas analizowania"	TokenNameStringLiteral	Nie mo?na wywo?a? parse podczas analizowania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  TYPED  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"B??d: Iterator okre?lonego typu dla osi {0} nie jest zaimplementowany"	TokenNameStringLiteral	B??d: Iterator okre?lonego typu dla osi {0} nie jest zaimplementowany
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"B??d: Iterator dla osi {0} nie jest zaimplementowany"	TokenNameStringLiteral	B??d: Iterator dla osi {0} nie jest zaimplementowany
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ITERATOR_CLONE_NOT_SUPPORTED	TokenNameIdentifier	 ER  ITERATOR  CLONE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Kopia iteratora nie jest obs?ugiwana"	TokenNameStringLiteral	Kopia iteratora nie jest obs?ugiwana
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_AXIS_TYPE	TokenNameIdentifier	 ER  UNKNOWN  AXIS  TYPE
,	TokenNameCOMMA	
"Nieznany typ przej?cia osi {0}"	TokenNameStringLiteral	Nieznany typ przej?cia osi {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_AXIS_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  NOT  SUPPORTED
,	TokenNameCOMMA	
"Nieobs?ugiwane przej?cie osi: {0}"	TokenNameStringLiteral	Nieobs?ugiwane przej?cie osi: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_DTMIDS_AVAIL	TokenNameIdentifier	 ER  NO  DTMIDS  AVAIL
,	TokenNameCOMMA	
"Nie ma wi?cej dost?pnych identyfikator—w DTM"	TokenNameStringLiteral	Nie ma wi?cej dost?pnych identyfikator—w DTM
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Nieobs?ugiwane: {0}"	TokenNameStringLiteral	Nieobs?ugiwane: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODE_NON_NULL	TokenNameIdentifier	 ER  NODE  NON  NULL
,	TokenNameCOMMA	
"W?ze? musi by? niepusty dla getDTMHandleFromNode"	TokenNameStringLiteral	W?ze? musi by? niepusty dla getDTMHandleFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_RESOLVE_NODE	TokenNameIdentifier	 ER  COULD  NOT  RESOLVE  NODE
,	TokenNameCOMMA	
"Nie mo?na przet?umaczy? w?z?a na uchwyt"	TokenNameStringLiteral	Nie mo?na przet?umaczy? w?z?a na uchwyt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STARTPARSE_WHILE_PARSING	TokenNameIdentifier	 ER  STARTPARSE  WHILE  PARSING
,	TokenNameCOMMA	
"Nie mo?na wywo?a? startParse podczas analizowania"	TokenNameStringLiteral	Nie mo?na wywo?a? startParse podczas analizowania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STARTPARSE_NEEDS_SAXPARSER	TokenNameIdentifier	 ER  STARTPARSE  NEEDS  SAXPARSER
,	TokenNameCOMMA	
"startParse potrzebuje niepustego SAXParser"	TokenNameStringLiteral	startParse potrzebuje niepustego SAXParser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_INIT_PARSER	TokenNameIdentifier	 ER  COULD  NOT  INIT  PARSER
,	TokenNameCOMMA	
"nie mo?na zainicjowa? analizatora"	TokenNameStringLiteral	nie mo?na zainicjowa? analizatora
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXCEPTION_CREATING_POOL	TokenNameIdentifier	 ER  EXCEPTION  CREATING  POOL
,	TokenNameCOMMA	
"wyj?tek podczas tworzenia nowej instancji dla puli"	TokenNameStringLiteral	wyj?tek podczas tworzenia nowej instancji dla puli
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"?cie?ka zawiera nieznan? sekwencj? o zmienionym znaczeniu"	TokenNameStringLiteral	?cie?ka zawiera nieznan? sekwencj? o zmienionym znaczeniu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"Schemat jest wymagany!"	TokenNameStringLiteral	Schemat jest wymagany!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"Nie znaleziono schematu w URI {0}"	TokenNameStringLiteral	Nie znaleziono schematu w URI {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_SCHEME_INURI	TokenNameIdentifier	 ER  NO  SCHEME  INURI
,	TokenNameCOMMA	
"Nie znaleziono schematu w URI"	TokenNameStringLiteral	Nie znaleziono schematu w URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"?cie?ka zawiera niepoprawny znak {0}"	TokenNameStringLiteral	?cie?ka zawiera niepoprawny znak {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Nie mo?na ustawi? schematu z pustego ci?gu znak—w"	TokenNameStringLiteral	Nie mo?na ustawi? schematu z pustego ci?gu znak—w
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"Schemat nie jest zgodny."	TokenNameStringLiteral	Schemat nie jest zgodny.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"Host nie jest poprawnie skonstruowanym adresem"	TokenNameStringLiteral	Host nie jest poprawnie skonstruowanym adresem
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"Nie mo?na ustawi? portu, kiedy host jest pusty"	TokenNameStringLiteral	Nie mo?na ustawi? portu, kiedy host jest pusty
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"Niepoprawny numer portu"	TokenNameStringLiteral	Niepoprawny numer portu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"Fragment mo?na ustawi? tylko dla og—lnego URI"	TokenNameStringLiteral	Fragment mo?na ustawi? tylko dla og—lnego URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"Nie mo?na ustawi? fragmentu, kiedy ?cie?ka jest pusta"	TokenNameStringLiteral	Nie mo?na ustawi? fragmentu, kiedy ?cie?ka jest pusta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"Fragment zawiera niepoprawny znak"	TokenNameStringLiteral	Fragment zawiera niepoprawny znak
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSER_IN_USE	TokenNameIdentifier	 ER  PARSER  IN  USE
,	TokenNameCOMMA	
"Analizator jest ju? u?ywany"	TokenNameStringLiteral	Analizator jest ju? u?ywany
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CHANGE_WHILE_PARSING	TokenNameIdentifier	 ER  CANNOT  CHANGE  WHILE  PARSING
,	TokenNameCOMMA	
"Nie mo?na zmieni? {0} {1} podczas analizowania"	TokenNameStringLiteral	Nie mo?na zmieni? {0} {1} podczas analizowania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SELF_CAUSATION_NOT_PERMITTED	TokenNameIdentifier	 ER  SELF  CAUSATION  NOT  PERMITTED
,	TokenNameCOMMA	
"Bycie w?asn? przyczyn? jest niedozwolone"	TokenNameStringLiteral	Bycie w?asn? przyczyn? jest niedozwolone
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Nie mo?na poda? informacji o u?ytkowniku, je?li nie podano hosta"	TokenNameStringLiteral	Nie mo?na poda? informacji o u?ytkowniku, je?li nie podano hosta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Nie mo?na poda? portu, je?li nie podano hosta"	TokenNameStringLiteral	Nie mo?na poda? portu, je?li nie podano hosta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"Tekstu zapytania nie mo?na poda? w tek?cie ?cie?ki i zapytania"	TokenNameStringLiteral	Tekstu zapytania nie mo?na poda? w tek?cie ?cie?ki i zapytania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"Nie mo?na poda? fragmentu jednocze?nie w ?cie?ce i fragmencie"	TokenNameStringLiteral	Nie mo?na poda? fragmentu jednocze?nie w ?cie?ce i fragmencie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Nie mo?na zainicjowa? URI z pustymi parametrami"	TokenNameStringLiteral	Nie mo?na zainicjowa? URI z pustymi parametrami
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
"Metoda nie jest jeszcze obs?ugiwana"	TokenNameStringLiteral	Metoda nie jest jeszcze obs?ugiwana
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCRSAXSRCFILTER_NOT_RESTARTABLE	TokenNameIdentifier	 ER  INCRSAXSRCFILTER  NOT  RESTARTABLE
,	TokenNameCOMMA	
"IncrementalSAXSource_Filter nie jest obecnie mo?liwy do ponownego uruchomienia"	TokenNameStringLiteral	IncrementalSAXSource_Filter nie jest obecnie mo?liwy do ponownego uruchomienia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XMLRDR_NOT_BEFORE_STARTPARSE	TokenNameIdentifier	 ER  XMLRDR  NOT  BEFORE  STARTPARSE
,	TokenNameCOMMA	
"XMLReader nie mo?e wyst?pi? przed ??daniem startParse"	TokenNameStringLiteral	XMLReader nie mo?e wyst?pi? przed ??daniem startParse
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_AXIS_TRAVERSER_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  TRAVERSER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Nieobs?ugiwane przej?cie osi: {0}"	TokenNameStringLiteral	Nieobs?ugiwane przej?cie osi: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER	TokenNameIdentifier	 ER  ERRORHANDLER  CREATED  WITH  NULL  PRINTWRITER
,	TokenNameCOMMA	
"Utworzono ListingErrorHandler z pustym PrintWriter!"	TokenNameStringLiteral	Utworzono ListingErrorHandler z pustym PrintWriter!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SYSTEMID_UNKNOWN	TokenNameIdentifier	 ER  SYSTEMID  UNKNOWN
,	TokenNameCOMMA	
"Nieznany identyfikator systemu"	TokenNameStringLiteral	Nieznany identyfikator systemu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_LOCATION_UNKNOWN	TokenNameIdentifier	 ER  LOCATION  UNKNOWN
,	TokenNameCOMMA	
"Po?o?enie b??du jest nieznane"	TokenNameStringLiteral	Po?o?enie b??du jest nieznane
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Przedrostek musi da? si? przet?umaczy? na przestrze? nazw: {0}"	TokenNameStringLiteral	Przedrostek musi da? si? przet?umaczy? na przestrze? nazw: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CREATEDOCUMENT_NOT_SUPPORTED	TokenNameIdentifier	 ER  CREATEDOCUMENT  NOT  SUPPORTED
,	TokenNameCOMMA	
"Funkcja createDocument() nie jest obs?ugiwana w XPathContext!"	TokenNameStringLiteral	Funkcja createDocument() nie jest obs?ugiwana w XPathContext!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHILD_HAS_NO_OWNER_DOCUMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT
,	TokenNameCOMMA	
"Bezpo?redni element potomny atrybutu nie ma dokumentu w?a?ciciela!"	TokenNameStringLiteral	Bezpo?redni element potomny atrybutu nie ma dokumentu w?a?ciciela!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT  ELEMENT
,	TokenNameCOMMA	
"Bezpo?redni element potomny atrybutu nie ma elementu dokumentu w?a?ciciela!"	TokenNameStringLiteral	Bezpo?redni element potomny atrybutu nie ma elementu dokumentu w?a?ciciela!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_OUTPUT_TEXT_BEFORE_DOC	TokenNameIdentifier	 ER  CANT  OUTPUT  TEXT  BEFORE  DOC
,	TokenNameCOMMA	
"Ostrze?enie: Nie mo?na wyprowadzi? tekstu przed elementem dokumentu! Ignorowanie..."	TokenNameStringLiteral	Ostrze?enie: Nie mo?na wyprowadzi? tekstu przed elementem dokumentu! Ignorowanie...
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_HAVE_MORE_THAN_ONE_ROOT	TokenNameIdentifier	 ER  CANT  HAVE  MORE  THAN  ONE  ROOT
,	TokenNameCOMMA	
"Nie mo?na mie? wi?cej ni? jeden element g?—wny w DOM!"	TokenNameStringLiteral	Nie mo?na mie? wi?cej ni? jeden element g?—wny w DOM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
,	TokenNameCOMMA	
"Argument 'localName' jest pusty"	TokenNameStringLiteral	Argument 'localName' jest pusty
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A QNAME has the syntactic form [NCName:]NCName 	TokenNameCOMMENT_LINE	Note to translators: A QNAME has the syntactic form [NCName:]NCName 
// The localname is the portion after the optional colon; the message indicates 	TokenNameCOMMENT_LINE	The localname is the portion after the optional colon; the message indicates 
// that there is a problem with that part of the QNAME. 	TokenNameCOMMENT_LINE	that there is a problem with that part of the QNAME. 
{	TokenNameLBRACE	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
"Nazwa lokalna w QNAME powinna by? poprawn? nazw? NCName"	TokenNameStringLiteral	Nazwa lokalna w QNAME powinna by? poprawn? nazw? NCName
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A QNAME has the syntactic form [NCName:]NCName 	TokenNameCOMMENT_LINE	Note to translators: A QNAME has the syntactic form [NCName:]NCName 
// The prefix is the portion before the optional colon; the message indicates 	TokenNameCOMMENT_LINE	The prefix is the portion before the optional colon; the message indicates 
// that there is a problem with that part of the QNAME. 	TokenNameCOMMENT_LINE	that there is a problem with that part of the QNAME. 
{	TokenNameLBRACE	
ER_ARG_PREFIX_INVALID	TokenNameIdentifier	 ER  ARG  PREFIX  INVALID
,	TokenNameCOMMA	
"Przedrostek w QNAME powinien by? poprawn? nazw? NCName"	TokenNameStringLiteral	Przedrostek w QNAME powinien by? poprawn? nazw? NCName
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAME_CANT_START_WITH_COLON	TokenNameIdentifier	 ER  NAME  CANT  START  WITH  COLON
,	TokenNameCOMMA	
"Nazwa nie mo?e rozpoczyna? si? od dwukropka"	TokenNameStringLiteral	Nazwa nie mo?e rozpoczyna? si? od dwukropka
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"Parametr createMessage by? spoza zakresu"	TokenNameStringLiteral	Parametr createMessage by? spoza zakresu
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Podczas wywo?ania messageFormat zg?oszony zosta? wyj?tek"	TokenNameStringLiteral	Podczas wywo?ania messageFormat zg?oszony zosta? wyj?tek
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Nr wiersza: "	TokenNameStringLiteral	Nr wiersza: 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Nr kolumny: "	TokenNameStringLiteral	Nr kolumny: 
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
"pl"	TokenNameStringLiteral	pl
,	TokenNameCOMMA	
"PL"	TokenNameStringLiteral	PL
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
