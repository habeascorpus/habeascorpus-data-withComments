/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPATHErrorResources_pt_BR.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPATHErrorResources_pt_BR.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
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
/** * Set up error messages. * We build a two dimensional array of message keys and * message strings. In order to add a new message here, * you need to first add a Static string constant for the * Key and update the contents array with Key, Value pair * Also you need to update the count of messages(MAX_CODE)or * the count of warnings(MAX_WARNING) [ Information purpose only] * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Set up error messages. We build a two dimensional array of message keys and message strings. In order to add a new message here, you need to first add a Static string constant for the Key and update the contents array with Key, Value pair Also you need to update the count of messages(MAX_CODE)or the count of warnings(MAX_WARNING) [ Information purpose only] @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
XPATHErrorResources_pt_BR	TokenNameIdentifier	 XPATH Error Resources pt  BR
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/* * General notes to translators: * * This file contains error and warning messages related to XPath Error * Handling. * * 1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of * components. * XSLT is an acronym for "XML Stylesheet Language: Transformations". * XSLTC is an acronym for XSLT Compiler. * * 2) A stylesheet is a description of how to transform an input XML document * into a resultant XML document (or HTML document or text). The * stylesheet itself is described in the form of an XML document. * * 3) A template is a component of a stylesheet that is used to match a * particular portion of an input document and specifies the form of the * corresponding portion of the output document. * * 4) An element is a mark-up tag in an XML document; an attribute is a * modifier on the tag. For example, in <elem attr='val' attr2='val2'> * "elem" is an element name, "attr" and "attr2" are attribute names with * the values "val" and "val2", respectively. * * 5) A namespace declaration is a special attribute that is used to associate * a prefix with a URI (the namespace). The meanings of element names and * attribute names that use that prefix are defined with respect to that * namespace. * * 6) "Translet" is an invented term that describes the class file that * results from compiling an XML stylesheet into a Java class. * * 7) XPath is a specification that describes a notation for identifying * nodes in a tree-structured representation of an XML document. An * instance of that notation is referred to as an XPath expression. * * 8) The context node is the node in the document with respect to which an * XPath expression is being evaluated. * * 9) An iterator is an object that traverses nodes in the tree, one at a time. * * 10) NCName is an XML term used to describe a name that does not contain a * colon (a "no-colon name"). * * 11) QName is an XML term meaning "qualified name". */	TokenNameCOMMENT_BLOCK	 General notes to translators: * This file contains error and warning messages related to XPath Error Handling. * 1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of components. XSLT is an acronym for "XML Stylesheet Language: Transformations". XSLTC is an acronym for XSLT Compiler. * 2) A stylesheet is a description of how to transform an input XML document into a resultant XML document (or HTML document or text). The stylesheet itself is described in the form of an XML document. * 3) A template is a component of a stylesheet that is used to match a particular portion of an input document and specifies the form of the corresponding portion of the output document. * 4) An element is a mark-up tag in an XML document; an attribute is a modifier on the tag. For example, in <elem attr='val' attr2='val2'> "elem" is an element name, "attr" and "attr2" are attribute names with the values "val" and "val2", respectively. * 5) A namespace declaration is a special attribute that is used to associate a prefix with a URI (the namespace). The meanings of element names and attribute names that use that prefix are defined with respect to that namespace. * 6) "Translet" is an invented term that describes the class file that results from compiling an XML stylesheet into a Java class. * 7) XPath is a specification that describes a notation for identifying nodes in a tree-structured representation of an XML document. An instance of that notation is referred to as an XPath expression. * 8) The context node is the node in the document with respect to which an XPath expression is being evaluated. * 9) An iterator is an object that traverses nodes in the tree, one at a time. * 10) NCName is an XML term used to describe a name that does not contain a colon (a "no-colon name"). * 11) QName is an XML term meaning "qualified name". 
/* * static variables */	TokenNameCOMMENT_BLOCK	 static variables 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR0000	TokenNameIdentifier	 ERRO R0000
=	TokenNameEQUAL	
"ERROR0000"	TokenNameStringLiteral	ERROR0000
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CURRENT_NOT_ALLOWED_IN_MATCH	TokenNameIdentifier	 ER  CURRENT  NOT  ALLOWED  IN  MATCH
=	TokenNameEQUAL	
"ER_CURRENT_NOT_ALLOWED_IN_MATCH"	TokenNameStringLiteral	ER_CURRENT_NOT_ALLOWED_IN_MATCH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CURRENT_TAKES_NO_ARGS	TokenNameIdentifier	 ER  CURRENT  TAKES  NO  ARGS
=	TokenNameEQUAL	
"ER_CURRENT_TAKES_NO_ARGS"	TokenNameStringLiteral	ER_CURRENT_TAKES_NO_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DOCUMENT_REPLACED	TokenNameIdentifier	 ER  DOCUMENT  REPLACED
=	TokenNameEQUAL	
"ER_DOCUMENT_REPLACED"	TokenNameStringLiteral	ER_DOCUMENT_REPLACED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CONTEXT_HAS_NO_OWNERDOC	TokenNameIdentifier	 ER  CONTEXT  HAS  NO  OWNERDOC
=	TokenNameEQUAL	
"ER_CONTEXT_HAS_NO_OWNERDOC"	TokenNameStringLiteral	ER_CONTEXT_HAS_NO_OWNERDOC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_LOCALNAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  LOCALNAME  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_LOCALNAME_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_LOCALNAME_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NAMESPACEURI_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAMESPACEURI  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_NAMESPACEURI_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_NAMESPACEURI_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NORMALIZESPACE  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NUMBER_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NUMBER  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_NUMBER_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_NUMBER_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAME  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_NAME_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_NAME_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STRING_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRING  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_STRING_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_STRING_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STRINGLENGTH_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRINGLENGTH  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_STRINGLENGTH_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_STRINGLENGTH_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TRANSLATE_TAKES_3_ARGS	TokenNameIdentifier	 ER  TRANSLATE  TAKES 3  ARGS
=	TokenNameEQUAL	
"ER_TRANSLATE_TAKES_3_ARGS"	TokenNameStringLiteral	ER_TRANSLATE_TAKES_3_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNPARSEDENTITYURI_TAKES_1_ARG	TokenNameIdentifier	 ER  UNPARSEDENTITYURI  TAKES 1  ARG
=	TokenNameEQUAL	
"ER_UNPARSEDENTITYURI_TAKES_1_ARG"	TokenNameStringLiteral	ER_UNPARSEDENTITYURI_TAKES_1_ARG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NAMESPACEAXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  NAMESPACEAXIS  NOT  IMPLEMENTED
=	TokenNameEQUAL	
"ER_NAMESPACEAXIS_NOT_IMPLEMENTED"	TokenNameStringLiteral	ER_NAMESPACEAXIS_NOT_IMPLEMENTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_AXIS	TokenNameIdentifier	 ER  UNKNOWN  AXIS
=	TokenNameEQUAL	
"ER_UNKNOWN_AXIS"	TokenNameStringLiteral	ER_UNKNOWN_AXIS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_MATCH_OPERATION	TokenNameIdentifier	 ER  UNKNOWN  MATCH  OPERATION
=	TokenNameEQUAL	
"ER_UNKNOWN_MATCH_OPERATION"	TokenNameStringLiteral	ER_UNKNOWN_MATCH_OPERATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INCORRECT_ARG_LENGTH	TokenNameIdentifier	 ER  INCORRECT  ARG  LENGTH
=	TokenNameEQUAL	
"ER_INCORRECT_ARG_LENGTH"	TokenNameStringLiteral	ER_INCORRECT_ARG_LENGTH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NUMBER
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_NUMBER"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_NUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  XPATHRESULTTYPE  TO  NUMBER
=	TokenNameEQUAL	
"ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER"	TokenNameStringLiteral	ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_NODELIST"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_NODELIST
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_MUTABLENODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  MUTABLENODELIST
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_MUTABLENODELIST"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_MUTABLENODELIST
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_TYPE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  TYPE
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_TYPE"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_MATCH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  MATCH  PATTERN
=	TokenNameEQUAL	
"ER_EXPECTED_MATCH_PATTERN"	TokenNameStringLiteral	ER_EXPECTED_MATCH_PATTERN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNOT_GET_VAR_NAMED	TokenNameIdentifier	 ER  COULDNOT  GET  VAR  NAMED
=	TokenNameEQUAL	
"ER_COULDNOT_GET_VAR_NAMED"	TokenNameStringLiteral	ER_COULDNOT_GET_VAR_NAMED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  UNKNOWN  OPCODE
=	TokenNameEQUAL	
"ER_UNKNOWN_OPCODE"	TokenNameStringLiteral	ER_UNKNOWN_OPCODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXTRA_ILLEGAL_TOKENS	TokenNameIdentifier	 ER  EXTRA  ILLEGAL  TOKENS
=	TokenNameEQUAL	
"ER_EXTRA_ILLEGAL_TOKENS"	TokenNameStringLiteral	ER_EXTRA_ILLEGAL_TOKENS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_DOUBLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  DOUBLE  QUOTE
=	TokenNameEQUAL	
"ER_EXPECTED_DOUBLE_QUOTE"	TokenNameStringLiteral	ER_EXPECTED_DOUBLE_QUOTE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_SINGLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  SINGLE  QUOTE
=	TokenNameEQUAL	
"ER_EXPECTED_SINGLE_QUOTE"	TokenNameStringLiteral	ER_EXPECTED_SINGLE_QUOTE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EMPTY_EXPRESSION	TokenNameIdentifier	 ER  EMPTY  EXPRESSION
=	TokenNameEQUAL	
"ER_EMPTY_EXPRESSION"	TokenNameStringLiteral	ER_EMPTY_EXPRESSION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_BUT_FOUND	TokenNameIdentifier	 ER  EXPECTED  BUT  FOUND
=	TokenNameEQUAL	
"ER_EXPECTED_BUT_FOUND"	TokenNameStringLiteral	ER_EXPECTED_BUT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
=	TokenNameEQUAL	
"ER_INCORRECT_PROGRAMMER_ASSERTION"	TokenNameStringLiteral	ER_INCORRECT_PROGRAMMER_ASSERTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL	TokenNameIdentifier	 ER  BOOLEAN  ARG  NO  LONGER  OPTIONAL
=	TokenNameEQUAL	
"ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL"	TokenNameStringLiteral	ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  PRECEDING  ARG
=	TokenNameEQUAL	
"ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG"	TokenNameStringLiteral	ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  FOLLOWING  ARG
=	TokenNameEQUAL	
"ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG"	TokenNameStringLiteral	ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PREDICATE_ILLEGAL_SYNTAX	TokenNameIdentifier	 ER  PREDICATE  ILLEGAL  SYNTAX
=	TokenNameEQUAL	
"ER_PREDICATE_ILLEGAL_SYNTAX"	TokenNameStringLiteral	ER_PREDICATE_ILLEGAL_SYNTAX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_AXIS_NAME	TokenNameIdentifier	 ER  ILLEGAL  AXIS  NAME
=	TokenNameEQUAL	
"ER_ILLEGAL_AXIS_NAME"	TokenNameStringLiteral	ER_ILLEGAL_AXIS_NAME
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_NODETYPE	TokenNameIdentifier	 ER  UNKNOWN  NODETYPE
=	TokenNameEQUAL	
"ER_UNKNOWN_NODETYPE"	TokenNameStringLiteral	ER_UNKNOWN_NODETYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PATTERN_LITERAL_NEEDS_BE_QUOTED	TokenNameIdentifier	 ER  PATTERN  LITERAL  NEEDS  BE  QUOTED
=	TokenNameEQUAL	
"ER_PATTERN_LITERAL_NEEDS_BE_QUOTED"	TokenNameStringLiteral	ER_PATTERN_LITERAL_NEEDS_BE_QUOTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNOT_BE_FORMATTED_TO_NUMBER	TokenNameIdentifier	 ER  COULDNOT  BE  FORMATTED  TO  NUMBER
=	TokenNameEQUAL	
"ER_COULDNOT_BE_FORMATTED_TO_NUMBER"	TokenNameStringLiteral	ER_COULDNOT_BE_FORMATTED_TO_NUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNOT_CREATE_XMLPROCESSORLIAISON	TokenNameIdentifier	 ER  COULDNOT  CREATE  XMLPROCESSORLIAISON
=	TokenNameEQUAL	
"ER_COULDNOT_CREATE_XMLPROCESSORLIAISON"	TokenNameStringLiteral	ER_COULDNOT_CREATE_XMLPROCESSORLIAISON
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DIDNOT_FIND_XPATH_SELECT_EXP	TokenNameIdentifier	 ER  DIDNOT  FIND  XPATH  SELECT  EXP
=	TokenNameEQUAL	
"ER_DIDNOT_FIND_XPATH_SELECT_EXP"	TokenNameStringLiteral	ER_DIDNOT_FIND_XPATH_SELECT_EXP
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH	TokenNameIdentifier	 ER  COULDNOT  FIND  ENDOP  AFTER  OPLOCATIONPATH
=	TokenNameEQUAL	
"ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH"	TokenNameStringLiteral	ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ERROR_OCCURED	TokenNameIdentifier	 ER  ERROR  OCCURED
=	TokenNameEQUAL	
"ER_ERROR_OCCURED"	TokenNameStringLiteral	ER_ERROR_OCCURED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 ER  ILLEGAL  VARIABLE  REFERENCE
=	TokenNameEQUAL	
"ER_ILLEGAL_VARIABLE_REFERENCE"	TokenNameStringLiteral	ER_ILLEGAL_VARIABLE_REFERENCE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_AXES_NOT_ALLOWED	TokenNameIdentifier	 ER  AXES  NOT  ALLOWED
=	TokenNameEQUAL	
"ER_AXES_NOT_ALLOWED"	TokenNameStringLiteral	ER_AXES_NOT_ALLOWED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_KEY_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  KEY  HAS  TOO  MANY  ARGS
=	TokenNameEQUAL	
"ER_KEY_HAS_TOO_MANY_ARGS"	TokenNameStringLiteral	ER_KEY_HAS_TOO_MANY_ARGS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COUNT_TAKES_1_ARG	TokenNameIdentifier	 ER  COUNT  TAKES 1  ARG
=	TokenNameEQUAL	
"ER_COUNT_TAKES_1_ARG"	TokenNameStringLiteral	ER_COUNT_TAKES_1_ARG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 ER  COULDNOT  FIND  FUNCTION
=	TokenNameEQUAL	
"ER_COULDNOT_FIND_FUNCTION"	TokenNameStringLiteral	ER_COULDNOT_FIND_FUNCTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
=	TokenNameEQUAL	
"ER_UNSUPPORTED_ENCODING"	TokenNameStringLiteral	ER_UNSUPPORTED_ENCODING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROBLEM_IN_DTM_NEXTSIBLING	TokenNameIdentifier	 ER  PROBLEM  IN  DTM  NEXTSIBLING
=	TokenNameEQUAL	
"ER_PROBLEM_IN_DTM_NEXTSIBLING"	TokenNameStringLiteral	ER_PROBLEM_IN_DTM_NEXTSIBLING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL	TokenNameIdentifier	 ER  CANNOT  WRITE  TO  EMPTYNODELISTIMPL
=	TokenNameEQUAL	
"ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL"	TokenNameStringLiteral	ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SETDOMFACTORY_NOT_SUPPORTED	TokenNameIdentifier	 ER  SETDOMFACTORY  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_SETDOMFACTORY_NOT_SUPPORTED"	TokenNameStringLiteral	ER_SETDOMFACTORY_NOT_SUPPORTED
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
ER_PARSE_NOT_SUPPORTED	TokenNameIdentifier	 ER  PARSE  NOT  SUPPORTED
=	TokenNameEQUAL	
"ER_PARSE_NOT_SUPPORTED"	TokenNameStringLiteral	ER_PARSE_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SAX_API_NOT_HANDLED	TokenNameIdentifier	 ER  SAX  API  NOT  HANDLED
=	TokenNameEQUAL	
"ER_SAX_API_NOT_HANDLED"	TokenNameStringLiteral	ER_SAX_API_NOT_HANDLED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_IGNORABLE_WHITESPACE_NOT_HANDLED	TokenNameIdentifier	 ER  IGNORABLE  WHITESPACE  NOT  HANDLED
=	TokenNameEQUAL	
"ER_IGNORABLE_WHITESPACE_NOT_HANDLED"	TokenNameStringLiteral	ER_IGNORABLE_WHITESPACE_NOT_HANDLED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DTM_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  DTM  CANNOT  HANDLE  NODES
=	TokenNameEQUAL	
"ER_DTM_CANNOT_HANDLE_NODES"	TokenNameStringLiteral	ER_DTM_CANNOT_HANDLE_NODES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XERCES_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  XERCES  CANNOT  HANDLE  NODES
=	TokenNameEQUAL	
"ER_XERCES_CANNOT_HANDLE_NODES"	TokenNameStringLiteral	ER_XERCES_CANNOT_HANDLE_NODES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XERCES_PARSE_ERROR_DETAILS	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR  DETAILS
=	TokenNameEQUAL	
"ER_XERCES_PARSE_ERROR_DETAILS"	TokenNameStringLiteral	ER_XERCES_PARSE_ERROR_DETAILS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XERCES_PARSE_ERROR	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR
=	TokenNameEQUAL	
"ER_XERCES_PARSE_ERROR"	TokenNameStringLiteral	ER_XERCES_PARSE_ERROR
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
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
=	TokenNameEQUAL	
"ER_OIERROR"	TokenNameStringLiteral	ER_OIERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_CREATE_URL	TokenNameIdentifier	 ER  CANNOT  CREATE  URL
=	TokenNameEQUAL	
"ER_CANNOT_CREATE_URL"	TokenNameStringLiteral	ER_CANNOT_CREATE_URL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XPATH_READOBJECT	TokenNameIdentifier	 ER  XPATH  READOBJECT
=	TokenNameEQUAL	
"ER_XPATH_READOBJECT"	TokenNameStringLiteral	ER_XPATH_READOBJECT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  TOKEN  NOT  FOUND
=	TokenNameEQUAL	
"ER_FUNCTION_TOKEN_NOT_FOUND"	TokenNameStringLiteral	ER_FUNCTION_TOKEN_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier	 ER  CANNOT  DEAL  XPATH  TYPE
=	TokenNameEQUAL	
"ER_CANNOT_DEAL_XPATH_TYPE"	TokenNameStringLiteral	ER_CANNOT_DEAL_XPATH_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
=	TokenNameEQUAL	
"ER_NODESET_NOT_MUTABLE"	TokenNameStringLiteral	ER_NODESET_NOT_MUTABLE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
=	TokenNameEQUAL	
"ER_NODESETDTM_NOT_MUTABLE"	TokenNameStringLiteral	ER_NODESETDTM_NOT_MUTABLE
;	TokenNameSEMICOLON	
/** Variable not resolvable: */	TokenNameCOMMENT_JAVADOC	 Variable not resolvable: 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_VAR_NOT_RESOLVABLE	TokenNameIdentifier	 ER  VAR  NOT  RESOLVABLE
=	TokenNameEQUAL	
"ER_VAR_NOT_RESOLVABLE"	TokenNameStringLiteral	ER_VAR_NOT_RESOLVABLE
;	TokenNameSEMICOLON	
/** Null error handler */	TokenNameCOMMENT_JAVADOC	 Null error handler 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
=	TokenNameEQUAL	
"ER_NULL_ERROR_HANDLER"	TokenNameStringLiteral	ER_NULL_ERROR_HANDLER
;	TokenNameSEMICOLON	
/** Programmer's assertion: unknown opcode */	TokenNameCOMMENT_JAVADOC	 Programmer's assertion: unknown opcode 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_PROG_ASSERT_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  PROG  ASSERT  UNKNOWN  OPCODE
=	TokenNameEQUAL	
"ER_PROG_ASSERT_UNKNOWN_OPCODE"	TokenNameStringLiteral	ER_PROG_ASSERT_UNKNOWN_OPCODE
;	TokenNameSEMICOLON	
/** 0 or 1 */	TokenNameCOMMENT_JAVADOC	 0 or 1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ZERO_OR_ONE	TokenNameIdentifier	 ER  ZERO  OR  ONE
=	TokenNameEQUAL	
"ER_ZERO_OR_ONE"	TokenNameStringLiteral	ER_ZERO_OR_ONE
;	TokenNameSEMICOLON	
/** rtf() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 rtf() not supported by XRTreeFragSelectWrapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
=	TokenNameEQUAL	
"ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"	TokenNameStringLiteral	ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER
;	TokenNameSEMICOLON	
/** asNodeIterator() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 asNodeIterator() not supported by XRTreeFragSelectWrapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  ASNODEITERATOR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
=	TokenNameEQUAL	
"ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"	TokenNameStringLiteral	ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER
;	TokenNameSEMICOLON	
/** fsb() not supported for XStringForChars */	TokenNameCOMMENT_JAVADOC	 fsb() not supported for XStringForChars 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS	TokenNameIdentifier	 ER  FSB  NOT  SUPPORTED  XSTRINGFORCHARS
=	TokenNameEQUAL	
"ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS"	TokenNameStringLiteral	ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS
;	TokenNameSEMICOLON	
/** Could not find variable with the name of */	TokenNameCOMMENT_JAVADOC	 Could not find variable with the name of 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_COULD_NOT_FIND_VAR	TokenNameIdentifier	 ER  COULD  NOT  FIND  VAR
=	TokenNameEQUAL	
"ER_COULD_NOT_FIND_VAR"	TokenNameStringLiteral	ER_COULD_NOT_FIND_VAR
;	TokenNameSEMICOLON	
/** XStringForChars can not take a string for an argument */	TokenNameCOMMENT_JAVADOC	 XStringForChars can not take a string for an argument 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  XSTRINGFORCHARS  CANNOT  TAKE  STRING
=	TokenNameEQUAL	
"ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING"	TokenNameStringLiteral	ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING
;	TokenNameSEMICOLON	
/** The FastStringBuffer argument can not be null */	TokenNameCOMMENT_JAVADOC	 The FastStringBuffer argument can not be null 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FASTSTRINGBUFFER_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FASTSTRINGBUFFER  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_FASTSTRINGBUFFER_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_FASTSTRINGBUFFER_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
/** 2 or 3 */	TokenNameCOMMENT_JAVADOC	 2 or 3 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
=	TokenNameEQUAL	
"ER_TWO_OR_THREE"	TokenNameStringLiteral	ER_TWO_OR_THREE
;	TokenNameSEMICOLON	
/** Variable accessed before it is bound! */	TokenNameCOMMENT_JAVADOC	 Variable accessed before it is bound! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_VARIABLE_ACCESSED_BEFORE_BIND	TokenNameIdentifier	 ER  VARIABLE  ACCESSED  BEFORE  BIND
=	TokenNameEQUAL	
"ER_VARIABLE_ACCESSED_BEFORE_BIND"	TokenNameStringLiteral	ER_VARIABLE_ACCESSED_BEFORE_BIND
;	TokenNameSEMICOLON	
/** XStringForFSB can not take a string for an argument! */	TokenNameCOMMENT_JAVADOC	 XStringForFSB can not take a string for an argument! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FSB_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  FSB  CANNOT  TAKE  STRING
=	TokenNameEQUAL	
"ER_FSB_CANNOT_TAKE_STRING"	TokenNameStringLiteral	ER_FSB_CANNOT_TAKE_STRING
;	TokenNameSEMICOLON	
/** Error! Setting the root of a walker to null! */	TokenNameCOMMENT_JAVADOC	 Error! Setting the root of a walker to null! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SETTING_WALKER_ROOT_TO_NULL	TokenNameIdentifier	 ER  SETTING  WALKER  ROOT  TO  NULL
=	TokenNameEQUAL	
"ER_SETTING_WALKER_ROOT_TO_NULL"	TokenNameStringLiteral	ER_SETTING_WALKER_ROOT_TO_NULL
;	TokenNameSEMICOLON	
/** This NodeSetDTM can not iterate to a previous node! */	TokenNameCOMMENT_JAVADOC	 This NodeSetDTM can not iterate to a previous node! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODESETDTM_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  ITERATE
=	TokenNameEQUAL	
"ER_NODESETDTM_CANNOT_ITERATE"	TokenNameStringLiteral	ER_NODESETDTM_CANNOT_ITERATE
;	TokenNameSEMICOLON	
/** This NodeSet can not iterate to a previous node! */	TokenNameCOMMENT_JAVADOC	 This NodeSet can not iterate to a previous node! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODESET_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESET  CANNOT  ITERATE
=	TokenNameEQUAL	
"ER_NODESET_CANNOT_ITERATE"	TokenNameStringLiteral	ER_NODESET_CANNOT_ITERATE
;	TokenNameSEMICOLON	
/** This NodeSetDTM can not do indexing or counting functions! */	TokenNameCOMMENT_JAVADOC	 This NodeSetDTM can not do indexing or counting functions! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODESETDTM_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  INDEX
=	TokenNameEQUAL	
"ER_NODESETDTM_CANNOT_INDEX"	TokenNameStringLiteral	ER_NODESETDTM_CANNOT_INDEX
;	TokenNameSEMICOLON	
/** This NodeSet can not do indexing or counting functions! */	TokenNameCOMMENT_JAVADOC	 This NodeSet can not do indexing or counting functions! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
=	TokenNameEQUAL	
"ER_NODESET_CANNOT_INDEX"	TokenNameStringLiteral	ER_NODESET_CANNOT_INDEX
;	TokenNameSEMICOLON	
/** Can not call setShouldCacheNodes after nextNode has been called! */	TokenNameCOMMENT_JAVADOC	 Can not call setShouldCacheNodes after nextNode has been called! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANNOT_CALL_SETSHOULDCACHENODE	TokenNameIdentifier	 ER  CANNOT  CALL  SETSHOULDCACHENODE
=	TokenNameEQUAL	
"ER_CANNOT_CALL_SETSHOULDCACHENODE"	TokenNameStringLiteral	ER_CANNOT_CALL_SETSHOULDCACHENODE
;	TokenNameSEMICOLON	
/** {0} only allows {1} arguments */	TokenNameCOMMENT_JAVADOC	 {0} only allows {1} arguments 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ONLY_ALLOWS	TokenNameIdentifier	 ER  ONLY  ALLOWS
=	TokenNameEQUAL	
"ER_ONLY_ALLOWS"	TokenNameStringLiteral	ER_ONLY_ALLOWS
;	TokenNameSEMICOLON	
/** Programmer's assertion in getNextStepPos: unknown stepType: {0} */	TokenNameCOMMENT_JAVADOC	 Programmer's assertion in getNextStepPos: unknown stepType: {0} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNKNOWN_STEP	TokenNameIdentifier	 ER  UNKNOWN  STEP
=	TokenNameEQUAL	
"ER_UNKNOWN_STEP"	TokenNameStringLiteral	ER_UNKNOWN_STEP
;	TokenNameSEMICOLON	
/** Problem with RelativeLocationPath */	TokenNameCOMMENT_JAVADOC	 Problem with RelativeLocationPath 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_REL_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  REL  LOC  PATH
=	TokenNameEQUAL	
"ER_EXPECTED_REL_LOC_PATH"	TokenNameStringLiteral	ER_EXPECTED_REL_LOC_PATH
;	TokenNameSEMICOLON	
/** Problem with LocationPath */	TokenNameCOMMENT_JAVADOC	 Problem with LocationPath 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH
=	TokenNameEQUAL	
"ER_EXPECTED_LOC_PATH"	TokenNameStringLiteral	ER_EXPECTED_LOC_PATH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_LOC_PATH_AT_END_EXPR	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH  AT  END  EXPR
=	TokenNameEQUAL	
"ER_EXPECTED_LOC_PATH_AT_END_EXPR"	TokenNameStringLiteral	ER_EXPECTED_LOC_PATH_AT_END_EXPR
;	TokenNameSEMICOLON	
/** Problem with Step */	TokenNameCOMMENT_JAVADOC	 Problem with Step 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_LOC_STEP	TokenNameIdentifier	 ER  EXPECTED  LOC  STEP
=	TokenNameEQUAL	
"ER_EXPECTED_LOC_STEP"	TokenNameStringLiteral	ER_EXPECTED_LOC_STEP
;	TokenNameSEMICOLON	
/** Problem with NodeTest */	TokenNameCOMMENT_JAVADOC	 Problem with NodeTest 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_NODE_TEST	TokenNameIdentifier	 ER  EXPECTED  NODE  TEST
=	TokenNameEQUAL	
"ER_EXPECTED_NODE_TEST"	TokenNameStringLiteral	ER_EXPECTED_NODE_TEST
;	TokenNameSEMICOLON	
/** Expected step pattern */	TokenNameCOMMENT_JAVADOC	 Expected step pattern 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_STEP_PATTERN	TokenNameIdentifier	 ER  EXPECTED  STEP  PATTERN
=	TokenNameEQUAL	
"ER_EXPECTED_STEP_PATTERN"	TokenNameStringLiteral	ER_EXPECTED_STEP_PATTERN
;	TokenNameSEMICOLON	
/** Expected relative path pattern */	TokenNameCOMMENT_JAVADOC	 Expected relative path pattern 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXPECTED_REL_PATH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  REL  PATH  PATTERN
=	TokenNameEQUAL	
"ER_EXPECTED_REL_PATH_PATTERN"	TokenNameStringLiteral	ER_EXPECTED_REL_PATH_PATTERN
;	TokenNameSEMICOLON	
/** ER_CANT_CONVERT_XPATHRESULTTYPE_TO_BOOLEAN */	TokenNameCOMMENT_JAVADOC	 ER_CANT_CONVERT_XPATHRESULTTYPE_TO_BOOLEAN 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_BOOLEAN	TokenNameIdentifier	 ER  CANT  CONVERT  TO  BOOLEAN
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_BOOLEAN"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_BOOLEAN
;	TokenNameSEMICOLON	
/** Field ER_CANT_CONVERT_TO_SINGLENODE */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_SINGLENODE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_SINGLENODE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  SINGLENODE
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_SINGLENODE"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_SINGLENODE
;	TokenNameSEMICOLON	
/** Field ER_CANT_GET_SNAPSHOT_LENGTH */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_GET_SNAPSHOT_LENGTH 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_GET_SNAPSHOT_LENGTH	TokenNameIdentifier	 ER  CANT  GET  SNAPSHOT  LENGTH
=	TokenNameEQUAL	
"ER_CANT_GET_SNAPSHOT_LENGTH"	TokenNameStringLiteral	ER_CANT_GET_SNAPSHOT_LENGTH
;	TokenNameSEMICOLON	
/** Field ER_NON_ITERATOR_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_NON_ITERATOR_TYPE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NON_ITERATOR_TYPE	TokenNameIdentifier	 ER  NON  ITERATOR  TYPE
=	TokenNameEQUAL	
"ER_NON_ITERATOR_TYPE"	TokenNameStringLiteral	ER_NON_ITERATOR_TYPE
;	TokenNameSEMICOLON	
/** Field ER_DOC_MUTATED */	TokenNameCOMMENT_JAVADOC	 Field ER_DOC_MUTATED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DOC_MUTATED	TokenNameIdentifier	 ER  DOC  MUTATED
=	TokenNameEQUAL	
"ER_DOC_MUTATED"	TokenNameStringLiteral	ER_DOC_MUTATED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INVALID_XPATH_TYPE	TokenNameIdentifier	 ER  INVALID  XPATH  TYPE
=	TokenNameEQUAL	
"ER_INVALID_XPATH_TYPE"	TokenNameStringLiteral	ER_INVALID_XPATH_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EMPTY_XPATH_RESULT	TokenNameIdentifier	 ER  EMPTY  XPATH  RESULT
=	TokenNameEQUAL	
"ER_EMPTY_XPATH_RESULT"	TokenNameStringLiteral	ER_EMPTY_XPATH_RESULT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_INCOMPATIBLE_TYPES	TokenNameIdentifier	 ER  INCOMPATIBLE  TYPES
=	TokenNameEQUAL	
"ER_INCOMPATIBLE_TYPES"	TokenNameStringLiteral	ER_INCOMPATIBLE_TYPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_RESOLVER	TokenNameIdentifier	 ER  NULL  RESOLVER
=	TokenNameEQUAL	
"ER_NULL_RESOLVER"	TokenNameStringLiteral	ER_NULL_RESOLVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_CANT_CONVERT_TO_STRING	TokenNameIdentifier	 ER  CANT  CONVERT  TO  STRING
=	TokenNameEQUAL	
"ER_CANT_CONVERT_TO_STRING"	TokenNameStringLiteral	ER_CANT_CONVERT_TO_STRING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NON_SNAPSHOT_TYPE	TokenNameIdentifier	 ER  NON  SNAPSHOT  TYPE
=	TokenNameEQUAL	
"ER_NON_SNAPSHOT_TYPE"	TokenNameStringLiteral	ER_NON_SNAPSHOT_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WRONG_DOCUMENT	TokenNameIdentifier	 ER  WRONG  DOCUMENT
=	TokenNameEQUAL	
"ER_WRONG_DOCUMENT"	TokenNameStringLiteral	ER_WRONG_DOCUMENT
;	TokenNameSEMICOLON	
/* Note to translators: The XPath expression cannot be evaluated with respect * to this type of node. */	TokenNameCOMMENT_BLOCK	 Note to translators: The XPath expression cannot be evaluated with respect to this type of node. 
/** Field ER_WRONG_NODETYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_WRONG_NODETYPE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_WRONG_NODETYPE	TokenNameIdentifier	 ER  WRONG  NODETYPE
=	TokenNameEQUAL	
"ER_WRONG_NODETYPE"	TokenNameStringLiteral	ER_WRONG_NODETYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XPATH_ERROR	TokenNameIdentifier	 ER  XPATH  ERROR
=	TokenNameEQUAL	
"ER_XPATH_ERROR"	TokenNameStringLiteral	ER_XPATH_ERROR
;	TokenNameSEMICOLON	
//BEGIN: Keys needed for exception messages of JAXP 1.3 XPath API implementation 	TokenNameCOMMENT_LINE	BEGIN: Keys needed for exception messages of JAXP 1.3 XPath API implementation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED	TokenNameIdentifier	 ER  EXTENSION  FUNCTION  CANNOT  BE  INVOKED
=	TokenNameEQUAL	
"ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED"	TokenNameStringLiteral	ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_RESOLVE_VARIABLE_RETURNS_NULL	TokenNameIdentifier	 ER  RESOLVE  VARIABLE  RETURNS  NULL
=	TokenNameEQUAL	
"ER_RESOLVE_VARIABLE_RETURNS_NULL"	TokenNameStringLiteral	ER_RESOLVE_VARIABLE_RETURNS_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_UNSUPPORTED_RETURN_TYPE	TokenNameIdentifier	 ER  UNSUPPORTED  RETURN  TYPE
=	TokenNameEQUAL	
"ER_UNSUPPORTED_RETURN_TYPE"	TokenNameStringLiteral	ER_UNSUPPORTED_RETURN_TYPE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  RETURN  TYPE  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  ARG  CANNOT  BE  NULL
=	TokenNameEQUAL	
"ER_ARG_CANNOT_BE_NULL"	TokenNameStringLiteral	ER_ARG_CANNOT_BE_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_OBJECT_MODEL_NULL	TokenNameIdentifier	 ER  OBJECT  MODEL  NULL
=	TokenNameEQUAL	
"ER_OBJECT_MODEL_NULL"	TokenNameStringLiteral	ER_OBJECT_MODEL_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_OBJECT_MODEL_EMPTY	TokenNameIdentifier	 ER  OBJECT  MODEL  EMPTY
=	TokenNameEQUAL	
"ER_OBJECT_MODEL_EMPTY"	TokenNameStringLiteral	ER_OBJECT_MODEL_EMPTY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FEATURE_NAME_NULL	TokenNameIdentifier	 ER  FEATURE  NAME  NULL
=	TokenNameEQUAL	
"ER_FEATURE_NAME_NULL"	TokenNameStringLiteral	ER_FEATURE_NAME_NULL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_FEATURE_UNKNOWN	TokenNameIdentifier	 ER  FEATURE  UNKNOWN
=	TokenNameEQUAL	
"ER_FEATURE_UNKNOWN"	TokenNameStringLiteral	ER_FEATURE_UNKNOWN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_GETTING_NULL_FEATURE	TokenNameIdentifier	 ER  GETTING  NULL  FEATURE
=	TokenNameEQUAL	
"ER_GETTING_NULL_FEATURE"	TokenNameStringLiteral	ER_GETTING_NULL_FEATURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_GETTING_UNKNOWN_FEATURE	TokenNameIdentifier	 ER  GETTING  UNKNOWN  FEATURE
=	TokenNameEQUAL	
"ER_GETTING_UNKNOWN_FEATURE"	TokenNameStringLiteral	ER_GETTING_UNKNOWN_FEATURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_XPATH_FUNCTION_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  FUNCTION  RESOLVER
=	TokenNameEQUAL	
"ER_NULL_XPATH_FUNCTION_RESOLVER"	TokenNameStringLiteral	ER_NULL_XPATH_FUNCTION_RESOLVER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NULL_XPATH_VARIABLE_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  VARIABLE  RESOLVER
=	TokenNameEQUAL	
"ER_NULL_XPATH_VARIABLE_RESOLVER"	TokenNameStringLiteral	ER_NULL_XPATH_VARIABLE_RESOLVER
;	TokenNameSEMICOLON	
//END: Keys needed for exception messages of JAXP 1.3 XPath API implementation 	TokenNameCOMMENT_LINE	END: Keys needed for exception messages of JAXP 1.3 XPath API implementation 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_LOCALE_NAME_NOT_HANDLED	TokenNameIdentifier	 WG  LOCALE  NAME  NOT  HANDLED
=	TokenNameEQUAL	
"WG_LOCALE_NAME_NOT_HANDLED"	TokenNameStringLiteral	WG_LOCALE_NAME_NOT_HANDLED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_PROPERTY_NOT_SUPPORTED	TokenNameIdentifier	 WG  PROPERTY  NOT  SUPPORTED
=	TokenNameEQUAL	
"WG_PROPERTY_NOT_SUPPORTED"	TokenNameStringLiteral	WG_PROPERTY_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_DONT_DO_ANYTHING_WITH_NS	TokenNameIdentifier	 WG  DONT  DO  ANYTHING  WITH  NS
=	TokenNameEQUAL	
"WG_DONT_DO_ANYTHING_WITH_NS"	TokenNameStringLiteral	WG_DONT_DO_ANYTHING_WITH_NS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_SECURITY_EXCEPTION	TokenNameIdentifier	 WG  SECURITY  EXCEPTION
=	TokenNameEQUAL	
"WG_SECURITY_EXCEPTION"	TokenNameStringLiteral	WG_SECURITY_EXCEPTION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_QUO_NO_LONGER_DEFINED	TokenNameIdentifier	 WG  QUO  NO  LONGER  DEFINED
=	TokenNameEQUAL	
"WG_QUO_NO_LONGER_DEFINED"	TokenNameStringLiteral	WG_QUO_NO_LONGER_DEFINED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST	TokenNameIdentifier	 WG  NEED  DERIVED  OBJECT  TO  IMPLEMENT  NODETEST
=	TokenNameEQUAL	
"WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST"	TokenNameStringLiteral	WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 WG  FUNCTION  TOKEN  NOT  FOUND
=	TokenNameEQUAL	
"WG_FUNCTION_TOKEN_NOT_FOUND"	TokenNameStringLiteral	WG_FUNCTION_TOKEN_NOT_FOUND
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 WG  COULDNOT  FIND  FUNCTION
=	TokenNameEQUAL	
"WG_COULDNOT_FIND_FUNCTION"	TokenNameStringLiteral	WG_COULDNOT_FIND_FUNCTION
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
WG_EXPAND_ENTITIES_NOT_SUPPORTED	TokenNameIdentifier	 WG  EXPAND  ENTITIES  NOT  SUPPORTED
=	TokenNameEQUAL	
"WG_EXPAND_ENTITIES_NOT_SUPPORTED"	TokenNameStringLiteral	WG_EXPAND_ENTITIES_NOT_SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 WG  ILLEGAL  VARIABLE  REFERENCE
=	TokenNameEQUAL	
"WG_ILLEGAL_VARIABLE_REFERENCE"	TokenNameStringLiteral	WG_ILLEGAL_VARIABLE_REFERENCE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WG_UNSUPPORTED_ENCODING	TokenNameIdentifier	 WG  UNSUPPORTED  ENCODING
=	TokenNameEQUAL	
"WG_UNSUPPORTED_ENCODING"	TokenNameStringLiteral	WG_UNSUPPORTED_ENCODING
;	TokenNameSEMICOLON	
/** detach() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 detach() not supported by XRTreeFragSelectWrapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  DETACH  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
=	TokenNameEQUAL	
"ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"	TokenNameStringLiteral	ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER
;	TokenNameSEMICOLON	
/** num() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 num() not supported by XRTreeFragSelectWrapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  NUM  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
=	TokenNameEQUAL	
"ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"	TokenNameStringLiteral	ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER
;	TokenNameSEMICOLON	
/** xstr() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 xstr() not supported by XRTreeFragSelectWrapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  XSTR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
=	TokenNameEQUAL	
"ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"	TokenNameStringLiteral	ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER
;	TokenNameSEMICOLON	
/** str() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 str() not supported by XRTreeFragSelectWrapper 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  STR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
=	TokenNameEQUAL	
"ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"	TokenNameStringLiteral	ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER
;	TokenNameSEMICOLON	
// Error messages... 	TokenNameCOMMENT_LINE	Error messages... 
/** * Get the association list. * * @return The association list. */	TokenNameCOMMENT_JAVADOC	 Get the association list. * @return The association list. 
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
{	TokenNameLBRACE	
"ERROR0000"	TokenNameStringLiteral	ERROR0000
,	TokenNameCOMMA	
"{0}"	TokenNameStringLiteral	{0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENT_NOT_ALLOWED_IN_MATCH	TokenNameIdentifier	 ER  CURRENT  NOT  ALLOWED  IN  MATCH
,	TokenNameCOMMA	
"A fun‹o current() n‹o Ž permitida em um padr‹o de correspondncia!"	TokenNameStringLiteral	A fun‹o current() n‹o Ž permitida em um padr‹o de correspondncia!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENT_TAKES_NO_ARGS	TokenNameIdentifier	 ER  CURRENT  TAKES  NO  ARGS
,	TokenNameCOMMA	
"A fun‹o current() n‹o aceita argumentos!"	TokenNameStringLiteral	A fun‹o current() n‹o aceita argumentos!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_REPLACED	TokenNameIdentifier	 ER  DOCUMENT  REPLACED
,	TokenNameCOMMA	
"A implementa‹o da fun‹o document() foi substitu’da por org.apache.xalan.xslt.FuncDocument!"	TokenNameStringLiteral	A implementa‹o da fun‹o document() foi substitu’da por org.apache.xalan.xslt.FuncDocument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CONTEXT_HAS_NO_OWNERDOC	TokenNameIdentifier	 ER  CONTEXT  HAS  NO  OWNERDOC
,	TokenNameCOMMA	
"context n‹o possui um documento do propriet‡rio!"	TokenNameStringLiteral	context n‹o possui um documento do propriet‡rio!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_LOCALNAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  LOCALNAME  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"local-name() possui argumentos em excesso."	TokenNameStringLiteral	local-name() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACEURI_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAMESPACEURI  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"namespace-uri() possui argumentos em excesso."	TokenNameStringLiteral	namespace-uri() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NORMALIZESPACE  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"normalize-space() possui argumentos em excesso."	TokenNameStringLiteral	normalize-space() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NUMBER_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NUMBER  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"number() possui argumentos em excesso."	TokenNameStringLiteral	number() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAME  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"name() possui argumentos em excesso."	TokenNameStringLiteral	name() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STRING_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRING  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"string() possui argumentos em excesso."	TokenNameStringLiteral	string() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STRINGLENGTH_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRINGLENGTH  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"string-length() possui argumentos em excesso."	TokenNameStringLiteral	string-length() possui argumentos em excesso.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TRANSLATE_TAKES_3_ARGS	TokenNameIdentifier	 ER  TRANSLATE  TAKES 3  ARGS
,	TokenNameCOMMA	
"A fun‹o translate() tem trs argumentos!"	TokenNameStringLiteral	A fun‹o translate() tem trs argumentos!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNPARSEDENTITYURI_TAKES_1_ARG	TokenNameIdentifier	 ER  UNPARSEDENTITYURI  TAKES 1  ARG
,	TokenNameCOMMA	
"A fun‹o unparsed-entity-uri deve ter um argumento!"	TokenNameStringLiteral	A fun‹o unparsed-entity-uri deve ter um argumento!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACEAXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  NAMESPACEAXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"eixo do espao de nomes ainda n‹o implementado!"	TokenNameStringLiteral	eixo do espao de nomes ainda n‹o implementado!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_AXIS	TokenNameIdentifier	 ER  UNKNOWN  AXIS
,	TokenNameCOMMA	
"eixo desconhecido: {0}"	TokenNameStringLiteral	eixo desconhecido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_MATCH_OPERATION	TokenNameIdentifier	 ER  UNKNOWN  MATCH  OPERATION
,	TokenNameCOMMA	
"opera‹o de correspondncia desconhecida!"	TokenNameStringLiteral	opera‹o de correspondncia desconhecida!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCORRECT_ARG_LENGTH	TokenNameIdentifier	 ER  INCORRECT  ARG  LENGTH
,	TokenNameCOMMA	
"O comprimento de arg do teste de n— de processing-instruction() est‡ incorreto! "	TokenNameStringLiteral	O comprimento de arg do teste de n— de processing-instruction() est‡ incorreto! 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NUMBER
,	TokenNameCOMMA	
"Imposs’vel converter {0} em um nœmero"	TokenNameStringLiteral	Imposs’vel converter {0} em um nœmero
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
,	TokenNameCOMMA	
"Imposs’vel converter {0} em um NodeList!"	TokenNameStringLiteral	Imposs’vel converter {0} em um NodeList!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_MUTABLENODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  MUTABLENODELIST
,	TokenNameCOMMA	
"Imposs’vel converter {0} em um NodeSetDTM!"	TokenNameStringLiteral	Imposs’vel converter {0} em um NodeSetDTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_TYPE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  TYPE
,	TokenNameCOMMA	
"Imposs’vel converter {0} em um tipo {1}"	TokenNameStringLiteral	Imposs’vel converter {0} em um tipo {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_MATCH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  MATCH  PATTERN
,	TokenNameCOMMA	
"Padr‹o de correspondncia esperado em getMatchScore!"	TokenNameStringLiteral	Padr‹o de correspondncia esperado em getMatchScore!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_GET_VAR_NAMED	TokenNameIdentifier	 ER  COULDNOT  GET  VAR  NAMED
,	TokenNameCOMMA	
"N‹o foi poss’vel obter a vari‡vel {0}"	TokenNameStringLiteral	N‹o foi poss’vel obter a vari‡vel {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  UNKNOWN  OPCODE
,	TokenNameCOMMA	
"ERRO! C—digo op desconhecido: {0}"	TokenNameStringLiteral	ERRO! C—digo op desconhecido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTRA_ILLEGAL_TOKENS	TokenNameIdentifier	 ER  EXTRA  ILLEGAL  TOKENS
,	TokenNameCOMMA	
"Tokens inv‡lidos extras: {0}"	TokenNameStringLiteral	Tokens inv‡lidos extras: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_DOUBLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  DOUBLE  QUOTE
,	TokenNameCOMMA	
"literal com aspa incorreta... era esperada aspa dupla!"	TokenNameStringLiteral	literal com aspa incorreta... era esperada aspa dupla!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_SINGLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  SINGLE  QUOTE
,	TokenNameCOMMA	
"literal com aspa incorreta... era esperada aspa simples!"	TokenNameStringLiteral	literal com aspa incorreta... era esperada aspa simples!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EMPTY_EXPRESSION	TokenNameIdentifier	 ER  EMPTY  EXPRESSION
,	TokenNameCOMMA	
"Express‹o vazia!"	TokenNameStringLiteral	Express‹o vazia!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_BUT_FOUND	TokenNameIdentifier	 ER  EXPECTED  BUT  FOUND
,	TokenNameCOMMA	
"Esperado {0}, mas encontrado: {1}"	TokenNameStringLiteral	Esperado {0}, mas encontrado: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
,	TokenNameCOMMA	
"A declara‹o do programador est‡ incorreta! - {0}"	TokenNameStringLiteral	A declara‹o do programador est‡ incorreta! - {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL	TokenNameIdentifier	 ER  BOOLEAN  ARG  NO  LONGER  OPTIONAL
,	TokenNameCOMMA	
"O argumento boolean(...) n‹o Ž mais opcional com o rascunho 19990709 XPath."	TokenNameStringLiteral	O argumento boolean(...) n‹o Ž mais opcional com o rascunho 19990709 XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  PRECEDING  ARG
,	TokenNameCOMMA	
"Encontrado ',' mas sem argumento precedente!"	TokenNameStringLiteral	Encontrado ',' mas sem argumento precedente!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  FOLLOWING  ARG
,	TokenNameCOMMA	
"Encontrado ',' mas sem argumento seguinte!"	TokenNameStringLiteral	Encontrado ',' mas sem argumento seguinte!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREDICATE_ILLEGAL_SYNTAX	TokenNameIdentifier	 ER  PREDICATE  ILLEGAL  SYNTAX
,	TokenNameCOMMA	
"'..[predicate]' ou '.[predicate]' Ž sintaxe inv‡lida. Utilize ent‹o 'self::node()[predicate]'."	TokenNameStringLiteral	'..[predicate]' ou '.[predicate]' Ž sintaxe inv‡lida. Utilize ent‹o 'self::node()[predicate]'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_AXIS_NAME	TokenNameIdentifier	 ER  ILLEGAL  AXIS  NAME
,	TokenNameCOMMA	
"nome de eixo inv‡lido: {0}"	TokenNameStringLiteral	nome de eixo inv‡lido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_NODETYPE	TokenNameIdentifier	 ER  UNKNOWN  NODETYPE
,	TokenNameCOMMA	
"Tipo de n— desconhecido: {0}"	TokenNameStringLiteral	Tipo de n— desconhecido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PATTERN_LITERAL_NEEDS_BE_QUOTED	TokenNameIdentifier	 ER  PATTERN  LITERAL  NEEDS  BE  QUOTED
,	TokenNameCOMMA	
"O literal de padr‹o ({0}) precisa ser colocado entre aspas!"	TokenNameStringLiteral	O literal de padr‹o ({0}) precisa ser colocado entre aspas!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_BE_FORMATTED_TO_NUMBER	TokenNameIdentifier	 ER  COULDNOT  BE  FORMATTED  TO  NUMBER
,	TokenNameCOMMA	
"{0} n‹o p™de ser formatado para um nœmero!"	TokenNameStringLiteral	{0} n‹o p™de ser formatado para um nœmero!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_CREATE_XMLPROCESSORLIAISON	TokenNameIdentifier	 ER  COULDNOT  CREATE  XMLPROCESSORLIAISON
,	TokenNameCOMMA	
"N‹o foi poss’vel criar XML TransformerFactory Liaison: {0}"	TokenNameStringLiteral	N‹o foi poss’vel criar XML TransformerFactory Liaison: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DIDNOT_FIND_XPATH_SELECT_EXP	TokenNameIdentifier	 ER  DIDNOT  FIND  XPATH  SELECT  EXP
,	TokenNameCOMMA	
"Erro! N‹o encontrada a express‹o xpath select (-select)."	TokenNameStringLiteral	Erro! N‹o encontrada a express‹o xpath select (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH	TokenNameIdentifier	 ER  COULDNOT  FIND  ENDOP  AFTER  OPLOCATIONPATH
,	TokenNameCOMMA	
"ERRO! N‹o foi poss’vel encontrar ENDOP ap—s OP_LOCATIONPATH"	TokenNameStringLiteral	ERRO! N‹o foi poss’vel encontrar ENDOP ap—s OP_LOCATIONPATH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ERROR_OCCURED	TokenNameIdentifier	 ER  ERROR  OCCURED
,	TokenNameCOMMA	
"Ocorreu um erro!"	TokenNameStringLiteral	Ocorreu um erro!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 ER  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
"VariableReference fornecido para a vari‡vel fora de contexto ou sem defini‹o! Nome = {0}"	TokenNameStringLiteral	VariableReference fornecido para a vari‡vel fora de contexto ou sem defini‹o! Nome = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_AXES_NOT_ALLOWED	TokenNameIdentifier	 ER  AXES  NOT  ALLOWED
,	TokenNameCOMMA	
"Apenas os eixos child:: e attribute:: s‹o permitidos em padr›es de correspondncia! Eixos transgredidos = {0}"	TokenNameStringLiteral	Apenas os eixos child:: e attribute:: s‹o permitidos em padr›es de correspondncia! Eixos transgredidos = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  KEY  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"key() possui um nœmero incorreto de argumentos."	TokenNameStringLiteral	key() possui um nœmero incorreto de argumentos.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COUNT_TAKES_1_ARG	TokenNameIdentifier	 ER  COUNT  TAKES 1  ARG
,	TokenNameCOMMA	
"A fun‹o count deve ter um argumento!"	TokenNameStringLiteral	A fun‹o count deve ter um argumento!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 ER  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
"N‹o foi poss’vel localizar a fun‹o: {0}"	TokenNameStringLiteral	N‹o foi poss’vel localizar a fun‹o: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Codifica‹o n‹o suportada: {0}"	TokenNameStringLiteral	Codifica‹o n‹o suportada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROBLEM_IN_DTM_NEXTSIBLING	TokenNameIdentifier	 ER  PROBLEM  IN  DTM  NEXTSIBLING
,	TokenNameCOMMA	
"Ocorreu um problema no DTM em getNextSibling... tentando recuperar"	TokenNameStringLiteral	Ocorreu um problema no DTM em getNextSibling... tentando recuperar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL	TokenNameIdentifier	 ER  CANNOT  WRITE  TO  EMPTYNODELISTIMPL
,	TokenNameCOMMA	
"Erro do programador: EmptyNodeList n‹o pode ser gravado."	TokenNameStringLiteral	Erro do programador: EmptyNodeList n‹o pode ser gravado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SETDOMFACTORY_NOT_SUPPORTED	TokenNameIdentifier	 ER  SETDOMFACTORY  NOT  SUPPORTED
,	TokenNameCOMMA	
"setDOMFactory n‹o Ž suportado por XPathContext!"	TokenNameStringLiteral	setDOMFactory n‹o Ž suportado por XPathContext!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"O prefixo deve ser resolvido para um espao de nomes: {0}"	TokenNameStringLiteral	O prefixo deve ser resolvido para um espao de nomes: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSE_NOT_SUPPORTED	TokenNameIdentifier	 ER  PARSE  NOT  SUPPORTED
,	TokenNameCOMMA	
"parse (origem InputSource) n‹o suportada no XPathContext! Imposs’vel abrir {0}"	TokenNameStringLiteral	parse (origem InputSource) n‹o suportada no XPathContext! Imposs’vel abrir {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_API_NOT_HANDLED	TokenNameIdentifier	 ER  SAX  API  NOT  HANDLED
,	TokenNameCOMMA	
"SAX API characters(char ch[]... n‹o tratado pelo DTM!"	TokenNameStringLiteral	SAX API characters(char ch[]... n‹o tratado pelo DTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IGNORABLE_WHITESPACE_NOT_HANDLED	TokenNameIdentifier	 ER  IGNORABLE  WHITESPACE  NOT  HANDLED
,	TokenNameCOMMA	
"ignorableWhitespace(char ch[]... n‹o tratado pelo DTM!"	TokenNameStringLiteral	ignorableWhitespace(char ch[]... n‹o tratado pelo DTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DTM_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  DTM  CANNOT  HANDLE  NODES
,	TokenNameCOMMA	
"DTMLiaison n‹o pode tratar n—s do tipo {0}"	TokenNameStringLiteral	DTMLiaison n‹o pode tratar n—s do tipo {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XERCES_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  XERCES  CANNOT  HANDLE  NODES
,	TokenNameCOMMA	
"DOM2Helper n‹o pode tratar n—s do tipo {0}"	TokenNameStringLiteral	DOM2Helper n‹o pode tratar n—s do tipo {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XERCES_PARSE_ERROR_DETAILS	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR  DETAILS
,	TokenNameCOMMA	
"DOM2Helper.parse error: SystemID - {0} linha - {1}"	TokenNameStringLiteral	DOM2Helper.parse error: SystemID - {0} linha - {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XERCES_PARSE_ERROR	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR
,	TokenNameCOMMA	
"Erro de DOM2Helper.parse"	TokenNameStringLiteral	Erro de DOM2Helper.parse
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Detectado substituto UTF-16 inv‡lido: {0} ?"	TokenNameStringLiteral	Detectado substituto UTF-16 inv‡lido: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"Erro de E/S"	TokenNameStringLiteral	Erro de E/S
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_URL	TokenNameIdentifier	 ER  CANNOT  CREATE  URL
,	TokenNameCOMMA	
"Imposs’vel criar url para: {0}"	TokenNameStringLiteral	Imposs’vel criar url para: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_READOBJECT	TokenNameIdentifier	 ER  XPATH  READOBJECT
,	TokenNameCOMMA	
"Em XPath.readObject: {0}"	TokenNameStringLiteral	Em XPath.readObject: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  TOKEN  NOT  FOUND
,	TokenNameCOMMA	
"Token function n‹o encontrado."	TokenNameStringLiteral	Token function n‹o encontrado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier	 ER  CANNOT  DEAL  XPATH  TYPE
,	TokenNameCOMMA	
"Imposs’vel lidar com o tipo XPath: {0}"	TokenNameStringLiteral	Imposs’vel lidar com o tipo XPath: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
"Este NodeSet n‹o Ž mut‡vel"	TokenNameStringLiteral	Este NodeSet n‹o Ž mut‡vel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
"Este NodeSetDTM n‹o Ž mut‡vel"	TokenNameStringLiteral	Este NodeSetDTM n‹o Ž mut‡vel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VAR_NOT_RESOLVABLE	TokenNameIdentifier	 ER  VAR  NOT  RESOLVABLE
,	TokenNameCOMMA	
"A vari‡vel n‹o pode ser resolvida: {0}"	TokenNameStringLiteral	A vari‡vel n‹o pode ser resolvida: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Rotina de tratamento de erros nula"	TokenNameStringLiteral	Rotina de tratamento de erros nula
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROG_ASSERT_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  PROG  ASSERT  UNKNOWN  OPCODE
,	TokenNameCOMMA	
"Declara‹o do programador: opcode desconhecido: {0} "	TokenNameStringLiteral	Declara‹o do programador: opcode desconhecido: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ZERO_OR_ONE	TokenNameIdentifier	 ER  ZERO  OR  ONE
,	TokenNameCOMMA	
"0 ou 1"	TokenNameStringLiteral	0 ou 1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"rtf() n‹o suportado por XRTreeFragSelectWrapper"	TokenNameStringLiteral	rtf() n‹o suportado por XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"asNodeIterator() n‹o suportado por XRTreeFragSelectWrapper"	TokenNameStringLiteral	asNodeIterator() n‹o suportado por XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  DETACH  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"detach() n‹o suportado por XRTreeFragSelectWrapper "	TokenNameStringLiteral	detach() n‹o suportado por XRTreeFragSelectWrapper 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  NUM  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"num() n‹o suportado por XRTreeFragSelectWrapper"	TokenNameStringLiteral	num() n‹o suportado por XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  XSTR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"xstr() n‹o suportado por XRTreeFragSelectWrapper "	TokenNameStringLiteral	xstr() n‹o suportado por XRTreeFragSelectWrapper 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  STR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"str() n‹o suportado por XRTreeFragSelectWrapper"	TokenNameStringLiteral	str() n‹o suportado por XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS	TokenNameIdentifier	 ER  FSB  NOT  SUPPORTED  XSTRINGFORCHARS
,	TokenNameCOMMA	
"fsb() n‹o suportado para XStringForChars"	TokenNameStringLiteral	fsb() n‹o suportado para XStringForChars
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_VAR	TokenNameIdentifier	 ER  COULD  NOT  FIND  VAR
,	TokenNameCOMMA	
"N‹o foi poss’vel encontrar a vari‡vel com o nome {0}"	TokenNameStringLiteral	N‹o foi poss’vel encontrar a vari‡vel com o nome {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  XSTRINGFORCHARS  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
"XStringForChars n‹o pode obter uma cadeia para um argumento"	TokenNameStringLiteral	XStringForChars n‹o pode obter uma cadeia para um argumento
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FASTSTRINGBUFFER_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FASTSTRINGBUFFER  CANNOT  BE  NULL
,	TokenNameCOMMA	
"O argumento FastStringBuffer n‹o pode ser nulo"	TokenNameStringLiteral	O argumento FastStringBuffer n‹o pode ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 ou 3"	TokenNameStringLiteral	2 ou 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VARIABLE_ACCESSED_BEFORE_BIND	TokenNameIdentifier	 ER  VARIABLE  ACCESSED  BEFORE  BIND
,	TokenNameCOMMA	
"Vari‡vel acessada antes de ser ligada!"	TokenNameStringLiteral	Vari‡vel acessada antes de ser ligada!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FSB_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  FSB  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
"XStringForFSB n‹o pode obter uma cadeia para um argumento!"	TokenNameStringLiteral	XStringForFSB n‹o pode obter uma cadeia para um argumento!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SETTING_WALKER_ROOT_TO_NULL	TokenNameIdentifier	 ER  SETTING  WALKER  ROOT  TO  NULL
,	TokenNameCOMMA	
" !!!! Erro! Definindo a raiz de um transmissor como nula!!!"	TokenNameStringLiteral	 !!!! Erro! Definindo a raiz de um transmissor como nula!!!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESETDTM_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  ITERATE
,	TokenNameCOMMA	
"Este NodeSetDTM n‹o pode iterar em um n— anterior!"	TokenNameStringLiteral	Este NodeSetDTM n‹o pode iterar em um n— anterior!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESET_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESET  CANNOT  ITERATE
,	TokenNameCOMMA	
"Este NodeSet n‹o pode iterar em um n— anterior!"	TokenNameStringLiteral	Este NodeSet n‹o pode iterar em um n— anterior!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESETDTM_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  INDEX
,	TokenNameCOMMA	
"Este NodeSetDTM n‹o pode executar fun›es de indexa‹o ou de contagem!"	TokenNameStringLiteral	Este NodeSetDTM n‹o pode executar fun›es de indexa‹o ou de contagem!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
,	TokenNameCOMMA	
"Este NodeSet n‹o pode executar fun›es de indexa‹o ou de contagem!"	TokenNameStringLiteral	Este NodeSet n‹o pode executar fun›es de indexa‹o ou de contagem!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_SETSHOULDCACHENODE	TokenNameIdentifier	 ER  CANNOT  CALL  SETSHOULDCACHENODE
,	TokenNameCOMMA	
"Imposs’vel chamar setShouldCacheNodes depois de nextNode ter sido chamado!"	TokenNameStringLiteral	Imposs’vel chamar setShouldCacheNodes depois de nextNode ter sido chamado!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONLY_ALLOWS	TokenNameIdentifier	 ER  ONLY  ALLOWS
,	TokenNameCOMMA	
"{0} permite apenas {1} argumento(s)"	TokenNameStringLiteral	{0} permite apenas {1} argumento(s)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_STEP	TokenNameIdentifier	 ER  UNKNOWN  STEP
,	TokenNameCOMMA	
"Declara‹o do programador em getNextStepPos: stepType desconhecido: {0} "	TokenNameStringLiteral	Declara‹o do programador em getNextStepPos: stepType desconhecido: {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Note to translators: A relative location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A relative location path is a form of XPath expression. 
// The message indicates that such an expression was expected following the 	TokenNameCOMMENT_LINE	The message indicates that such an expression was expected following the 
// characters '/' or '//', but was not found. 	TokenNameCOMMENT_LINE	characters '/' or '//', but was not found. 
{	TokenNameLBRACE	
ER_EXPECTED_REL_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  REL  LOC  PATH
,	TokenNameCOMMA	
"Era esperado um caminho de localiza‹o relativo ap—s o token '/' ou '//'."	TokenNameStringLiteral	Era esperado um caminho de localiza‹o relativo ap—s o token '/' ou '//'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location path is a form of XPath expression. 
// The message indicates that syntactically such an expression was expected,but 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected,but 
// the characters specified by the substitution text were encountered instead. 	TokenNameCOMMENT_LINE	the characters specified by the substitution text were encountered instead. 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH
,	TokenNameCOMMA	
"Era esperado um caminho de localiza‹o, mas o seguinte token foi encontrado: {0}"	TokenNameStringLiteral	Era esperado um caminho de localiza‹o, mas o seguinte token foi encontrado: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location path is a form of XPath expression. 
// The message indicates that syntactically such a subexpression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such a subexpression was expected, 
// but no more characters were found in the expression. 	TokenNameCOMMENT_LINE	but no more characters were found in the expression. 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_PATH_AT_END_EXPR	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH  AT  END  EXPR
,	TokenNameCOMMA	
"Era esperado um caminho de local, mas foi encontrado o final da express‹o XPath: "	TokenNameStringLiteral	Era esperado um caminho de local, mas foi encontrado o final da express‹o XPath: 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location step is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location step is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected 
// following the specified characters. 	TokenNameCOMMENT_LINE	following the specified characters. 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_STEP	TokenNameIdentifier	 ER  EXPECTED  LOC  STEP
,	TokenNameCOMMA	
"Era esperada uma etapa de localiza‹o ap—s o token '/' ou '//'."	TokenNameStringLiteral	Era esperada uma etapa de localiza‹o ap—s o token '/' ou '//'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A node test is part of an XPath expression that is 	TokenNameCOMMENT_LINE	Note to translators: A node test is part of an XPath expression that is 
// used to test for particular kinds of nodes. In this case, a node test that 	TokenNameCOMMENT_LINE	used to test for particular kinds of nodes. In this case, a node test that 
// consists of an NCName followed by a colon and an asterisk or that consists 	TokenNameCOMMENT_LINE	consists of an NCName followed by a colon and an asterisk or that consists 
// of a QName was expected, but was not found. 	TokenNameCOMMENT_LINE	of a QName was expected, but was not found. 
{	TokenNameLBRACE	
ER_EXPECTED_NODE_TEST	TokenNameIdentifier	 ER  EXPECTED  NODE  TEST
,	TokenNameCOMMA	
"Era esperado um n— correspondente a NCName:* ou QName."	TokenNameStringLiteral	Era esperado um n— correspondente a NCName:* ou QName.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A step pattern is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A step pattern is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected, 
// but the specified character was found in the expression instead. 	TokenNameCOMMENT_LINE	but the specified character was found in the expression instead. 
{	TokenNameLBRACE	
ER_EXPECTED_STEP_PATTERN	TokenNameIdentifier	 ER  EXPECTED  STEP  PATTERN
,	TokenNameCOMMA	
"Era esperado um padr‹o de etapa, mas foi encontrado '/'."	TokenNameStringLiteral	Era esperado um padr‹o de etapa, mas foi encontrado '/'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A relative path pattern is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A relative path pattern is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected, 
// but was not found. 	TokenNameCOMMENT_LINE	but was not found. 
{	TokenNameLBRACE	
ER_EXPECTED_REL_PATH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  REL  PATH  PATTERN
,	TokenNameCOMMA	
"Era esperado um padr‹o de caminho relativo."	TokenNameStringLiteral	Era esperado um padr‹o de caminho relativo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The substitution text is the name of a data type. The 	TokenNameCOMMENT_LINE	Note to translators: The substitution text is the name of a data type. The 
// message indicates that a value of a particular type could not be converted 	TokenNameCOMMENT_LINE	message indicates that a value of a particular type could not be converted 
// to a value of type boolean. 	TokenNameCOMMENT_LINE	to a value of type boolean. 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_BOOLEAN	TokenNameIdentifier	 ER  CANT  CONVERT  TO  BOOLEAN
,	TokenNameCOMMA	
"O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em um booleano."	TokenNameStringLiteral	O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em um booleano.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and 	TokenNameCOMMENT_LINE	Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and 
// FIRST_ORDERED_NODE_TYPE. 	TokenNameCOMMENT_LINE	FIRST_ORDERED_NODE_TYPE. 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_SINGLENODE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  SINGLENODE
,	TokenNameCOMMA	
"O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em um œnico n—. O mŽtodo getSingleNodeValue aplica-se apenas aos tipos ANY_UNORDERED_NODE_TYPE e FIRST_ORDERED_NODE_TYPE."	TokenNameStringLiteral	O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em um œnico n—. O mŽtodo getSingleNodeValue aplica-se apenas aos tipos ANY_UNORDERED_NODE_TYPE e FIRST_ORDERED_NODE_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and 	TokenNameCOMMENT_LINE	Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and 
// ORDERED_NODE_SNAPSHOT_TYPE. 	TokenNameCOMMENT_LINE	ORDERED_NODE_SNAPSHOT_TYPE. 
{	TokenNameLBRACE	
ER_CANT_GET_SNAPSHOT_LENGTH	TokenNameIdentifier	 ER  CANT  GET  SNAPSHOT  LENGTH
,	TokenNameCOMMA	
"O mŽtodo getSnapshotLength n‹o pode ser chamado no XPathResult da express‹o XPath ''{0}'' porque seu XPathResultType Ž {1}. Este mŽtodo aplica-se apenas aos tipos UNORDERED_NODE_SNAPSHOT_TYPE e ORDERED_NODE_SNAPSHOT_TYPE."	TokenNameStringLiteral	O mŽtodo getSnapshotLength n‹o pode ser chamado no XPathResult da express‹o XPath ''{0}'' porque seu XPathResultType Ž {1}. Este mŽtodo aplica-se apenas aos tipos UNORDERED_NODE_SNAPSHOT_TYPE e ORDERED_NODE_SNAPSHOT_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NON_ITERATOR_TYPE	TokenNameIdentifier	 ER  NON  ITERATOR  TYPE
,	TokenNameCOMMA	
"O mŽtodo iterateNext n‹o pode ser chamado no XPathResult da express‹o XPath ''{0}'' porque seu XPathResultType Ž {1}. Este mŽtodo aplica-se apenas aos tipos UNORDERED_NODE_ITERATOR_TYPE e ORDERED_NODE_ITERATOR_TYPE."	TokenNameStringLiteral	O mŽtodo iterateNext n‹o pode ser chamado no XPathResult da express‹o XPath ''{0}'' porque seu XPathResultType Ž {1}. Este mŽtodo aplica-se apenas aos tipos UNORDERED_NODE_ITERATOR_TYPE e ORDERED_NODE_ITERATOR_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the document being operated 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the document being operated 
// upon changed, so the iterator object that was being used to traverse the 	TokenNameCOMMENT_LINE	upon changed, so the iterator object that was being used to traverse the 
// document has now become invalid. 	TokenNameCOMMENT_LINE	document has now become invalid. 
{	TokenNameLBRACE	
ER_DOC_MUTATED	TokenNameIdentifier	 ER  DOC  MUTATED
,	TokenNameCOMMA	
"Documento alterado desde o retorno do resultado. O iterador Ž inv‡lido."	TokenNameStringLiteral	Documento alterado desde o retorno do resultado. O iterador Ž inv‡lido.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_XPATH_TYPE	TokenNameIdentifier	 ER  INVALID  XPATH  TYPE
,	TokenNameCOMMA	
"Argumento de tipo XPath inv‡lido: {0}"	TokenNameStringLiteral	Argumento de tipo XPath inv‡lido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EMPTY_XPATH_RESULT	TokenNameIdentifier	 ER  EMPTY  XPATH  RESULT
,	TokenNameCOMMA	
"Objeto de resultado XPath vazio"	TokenNameStringLiteral	Objeto de resultado XPath vazio
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCOMPATIBLE_TYPES	TokenNameIdentifier	 ER  INCOMPATIBLE  TYPES
,	TokenNameCOMMA	
"O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser forado no XPathResultType especificado de {2}."	TokenNameStringLiteral	O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser forado no XPathResultType especificado de {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_RESOLVER	TokenNameIdentifier	 ER  NULL  RESOLVER
,	TokenNameCOMMA	
"N‹o foi poss’vel resolver o prefixo com um resolvedor de prefixo nulo."	TokenNameStringLiteral	N‹o foi poss’vel resolver o prefixo com um resolvedor de prefixo nulo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The substitution text is the name of a data type. The 	TokenNameCOMMENT_LINE	Note to translators: The substitution text is the name of a data type. The 
// message indicates that a value of a particular type could not be converted 	TokenNameCOMMENT_LINE	message indicates that a value of a particular type could not be converted 
// to a value of type string. 	TokenNameCOMMENT_LINE	to a value of type string. 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_STRING	TokenNameIdentifier	 ER  CANT  CONVERT  TO  STRING
,	TokenNameCOMMA	
"O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em uma cadeia."	TokenNameStringLiteral	O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em uma cadeia.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate snapshotItem, 	TokenNameCOMMENT_LINE	Note to translators: Do not translate snapshotItem, 
// UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE. 	TokenNameCOMMENT_LINE	UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE. 
{	TokenNameLBRACE	
ER_NON_SNAPSHOT_TYPE	TokenNameIdentifier	 ER  NON  SNAPSHOT  TYPE
,	TokenNameCOMMA	
"O mŽtodo snapshotItem n‹o pode ser chamado no XPathResult da express‹o XPath ''{0}'' porque seu XPathResultType Ž {1}. Este mŽtodo aplica-se apenas aos tipos UNORDERED_NODE_SNAPSHOT_TYPE e ORDERED_NODE_SNAPSHOT_TYPE."	TokenNameStringLiteral	O mŽtodo snapshotItem n‹o pode ser chamado no XPathResult da express‹o XPath ''{0}'' porque seu XPathResultType Ž {1}. Este mŽtodo aplica-se apenas aos tipos UNORDERED_NODE_SNAPSHOT_TYPE e ORDERED_NODE_SNAPSHOT_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: XPathEvaluator is a Java interface name. An 	TokenNameCOMMENT_LINE	Note to translators: XPathEvaluator is a Java interface name. An 
// XPathEvaluator is created with respect to a particular XML document, and in 	TokenNameCOMMENT_LINE	XPathEvaluator is created with respect to a particular XML document, and in 
// this case the expression represented by this object was being evaluated with 	TokenNameCOMMENT_LINE	this case the expression represented by this object was being evaluated with 
// respect to a context node from a different document. 	TokenNameCOMMENT_LINE	respect to a context node from a different document. 
{	TokenNameLBRACE	
ER_WRONG_DOCUMENT	TokenNameIdentifier	 ER  WRONG  DOCUMENT
,	TokenNameCOMMA	
"O n— do contexto n‹o pertence ao documento que est‡ ligado a este XPathEvaluator."	TokenNameStringLiteral	O n— do contexto n‹o pertence ao documento que est‡ ligado a este XPathEvaluator.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The XPath expression cannot be evaluated with respect 	TokenNameCOMMENT_LINE	Note to translators: The XPath expression cannot be evaluated with respect 
// to this type of node. 	TokenNameCOMMENT_LINE	to this type of node. 
{	TokenNameLBRACE	
ER_WRONG_NODETYPE	TokenNameIdentifier	 ER  WRONG  NODETYPE
,	TokenNameCOMMA	
"O tipo de n— de contexto n‹o Ž suportado."	TokenNameStringLiteral	O tipo de n— de contexto n‹o Ž suportado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_ERROR	TokenNameIdentifier	 ER  XPATH  ERROR
,	TokenNameCOMMA	
"Erro desconhecido em XPath."	TokenNameStringLiteral	Erro desconhecido em XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  XPATHRESULTTYPE  TO  NUMBER
,	TokenNameCOMMA	
"O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em um nœmero."	TokenNameStringLiteral	O XPathResult da express‹o XPath ''{0}'' tem um XPathResultType de {1} que n‹o pode ser convertido em um nœmero.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//BEGIN: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 	TokenNameCOMMENT_LINE	BEGIN: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 
/** Field ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED */	TokenNameCOMMENT_JAVADOC	 Field ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED 
{	TokenNameLBRACE	
ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED	TokenNameIdentifier	 ER  EXTENSION  FUNCTION  CANNOT  BE  INVOKED
,	TokenNameCOMMA	
"Fun‹o de extens‹o: ''{0}'' n‹o pode ser chamado quando o recurso XMLConstants.FEATURE_SECURE_PROCESSING est‡ definido como true."	TokenNameStringLiteral	Fun‹o de extens‹o: ''{0}'' n‹o pode ser chamado quando o recurso XMLConstants.FEATURE_SECURE_PROCESSING est‡ definido como true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_RESOLVE_VARIABLE_RETURNS_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_RESOLVE_VARIABLE_RETURNS_NULL 
{	TokenNameLBRACE	
ER_RESOLVE_VARIABLE_RETURNS_NULL	TokenNameIdentifier	 ER  RESOLVE  VARIABLE  RETURNS  NULL
,	TokenNameCOMMA	
"resolveVariable para a vari‡vel {0} retornando nulo"	TokenNameStringLiteral	resolveVariable para a vari‡vel {0} retornando nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNSUPPORTED_RETURN_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_UNSUPPORTED_RETURN_TYPE 
{	TokenNameLBRACE	
ER_UNSUPPORTED_RETURN_TYPE	TokenNameIdentifier	 ER  UNSUPPORTED  RETURN  TYPE
,	TokenNameCOMMA	
"Tipo de Retorno N‹o Suportado : {0}"	TokenNameStringLiteral	Tipo de Retorno N‹o Suportado : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL 
{	TokenNameLBRACE	
ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  RETURN  TYPE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"O Tipo de Origem e/ou Retorno n‹o pode ser nulo"	TokenNameStringLiteral	O Tipo de Origem e/ou Retorno n‹o pode ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_ARG_CANNOT_BE_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_ARG_CANNOT_BE_NULL 
{	TokenNameLBRACE	
ER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"O argumento {0} n‹o pode ser nulo"	TokenNameStringLiteral	O argumento {0} n‹o pode ser nulo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OBJECT_MODEL_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_OBJECT_MODEL_NULL 
{	TokenNameLBRACE	
ER_OBJECT_MODEL_NULL	TokenNameIdentifier	 ER  OBJECT  MODEL  NULL
,	TokenNameCOMMA	
"{0}#isObjectModelSupported( String objectModel ) n‹o pode ser chamado com objectModel == null"	TokenNameStringLiteral	{0}#isObjectModelSupported( String objectModel ) n‹o pode ser chamado com objectModel == null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OBJECT_MODEL_EMPTY */	TokenNameCOMMENT_JAVADOC	 Field ER_OBJECT_MODEL_EMPTY 
{	TokenNameLBRACE	
ER_OBJECT_MODEL_EMPTY	TokenNameIdentifier	 ER  OBJECT  MODEL  EMPTY
,	TokenNameCOMMA	
"{0}#isObjectModelSupported( String objectModel ) n‹o pode ser chamado com objectModel == """	TokenNameStringLiteral	{0}#isObjectModelSupported( String objectModel ) n‹o pode ser chamado com objectModel == ""
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OBJECT_MODEL_EMPTY */	TokenNameCOMMENT_JAVADOC	 Field ER_OBJECT_MODEL_EMPTY 
{	TokenNameLBRACE	
ER_FEATURE_NAME_NULL	TokenNameIdentifier	 ER  FEATURE  NAME  NULL
,	TokenNameCOMMA	
"Tentando definir um recurso com um nome nulo: {0}#setFeature( null, {1})"	TokenNameStringLiteral	Tentando definir um recurso com um nome nulo: {0}#setFeature( null, {1})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_FEATURE_UNKNOWN */	TokenNameCOMMENT_JAVADOC	 Field ER_FEATURE_UNKNOWN 
{	TokenNameLBRACE	
ER_FEATURE_UNKNOWN	TokenNameIdentifier	 ER  FEATURE  UNKNOWN
,	TokenNameCOMMA	
"Tentando definir o recurso desconhecido "{0}":{1}#setFeature({0},{2})"	TokenNameStringLiteral	Tentando definir o recurso desconhecido "{0}":{1}#setFeature({0},{2})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_GETTING_NULL_FEATURE */	TokenNameCOMMENT_JAVADOC	 Field ER_GETTING_NULL_FEATURE 
{	TokenNameLBRACE	
ER_GETTING_NULL_FEATURE	TokenNameIdentifier	 ER  GETTING  NULL  FEATURE
,	TokenNameCOMMA	
"Tentando obter um recurso com um nome nulo: {0}#getFeature(null)"	TokenNameStringLiteral	Tentando obter um recurso com um nome nulo: {0}#getFeature(null)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_GETTING_NULL_FEATURE */	TokenNameCOMMENT_JAVADOC	 Field ER_GETTING_NULL_FEATURE 
{	TokenNameLBRACE	
ER_GETTING_UNKNOWN_FEATURE	TokenNameIdentifier	 ER  GETTING  UNKNOWN  FEATURE
,	TokenNameCOMMA	
"Tentando obter o recurso desconhecido "{0}":{1}#getFeature({0})"	TokenNameStringLiteral	Tentando obter o recurso desconhecido "{0}":{1}#getFeature({0})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NULL_XPATH_FUNCTION_RESOLVER */	TokenNameCOMMENT_JAVADOC	 Field ER_NULL_XPATH_FUNCTION_RESOLVER 
{	TokenNameLBRACE	
ER_NULL_XPATH_FUNCTION_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  FUNCTION  RESOLVER
,	TokenNameCOMMA	
"Tentando definir um nulo XPathFunctionResolver:{0}#setXPathFunctionResolver(null)"	TokenNameStringLiteral	Tentando definir um nulo XPathFunctionResolver:{0}#setXPathFunctionResolver(null)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NULL_XPATH_VARIABLE_RESOLVER */	TokenNameCOMMENT_JAVADOC	 Field ER_NULL_XPATH_VARIABLE_RESOLVER 
{	TokenNameLBRACE	
ER_NULL_XPATH_VARIABLE_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  VARIABLE  RESOLVER
,	TokenNameCOMMA	
"Tentando definir um nulo XPathVariableResolver:{0}#setXPathVariableResolver(null)"	TokenNameStringLiteral	Tentando definir um nulo XPathVariableResolver:{0}#setXPathVariableResolver(null)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//END: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 	TokenNameCOMMENT_LINE	END: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_LOCALE_NAME_NOT_HANDLED	TokenNameIdentifier	 WG  LOCALE  NAME  NOT  HANDLED
,	TokenNameCOMMA	
"nome de locale na fun‹o format-number ainda n‹o tratado!"	TokenNameStringLiteral	nome de locale na fun‹o format-number ainda n‹o tratado!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PROPERTY_NOT_SUPPORTED	TokenNameIdentifier	 WG  PROPERTY  NOT  SUPPORTED
,	TokenNameCOMMA	
"Propriedade XSL n‹o suportada: {0}"	TokenNameStringLiteral	Propriedade XSL n‹o suportada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_DONT_DO_ANYTHING_WITH_NS	TokenNameIdentifier	 WG  DONT  DO  ANYTHING  WITH  NS
,	TokenNameCOMMA	
"N‹o fazer nada no momento com o espao de nomes {0} na propriedade {1}"	TokenNameStringLiteral	N‹o fazer nada no momento com o espao de nomes {0} na propriedade {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SECURITY_EXCEPTION	TokenNameIdentifier	 WG  SECURITY  EXCEPTION
,	TokenNameCOMMA	
"SecurityException ao tentar acessar a propriedade do sistema XSL: {0}"	TokenNameStringLiteral	SecurityException ao tentar acessar a propriedade do sistema XSL: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_QUO_NO_LONGER_DEFINED	TokenNameIdentifier	 WG  QUO  NO  LONGER  DEFINED
,	TokenNameCOMMA	
"Sintaxe antiga: quo(...) n‹o est‡ mais definida no XPath."	TokenNameStringLiteral	Sintaxe antiga: quo(...) n‹o est‡ mais definida no XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST	TokenNameIdentifier	 WG  NEED  DERIVED  OBJECT  TO  IMPLEMENT  NODETEST
,	TokenNameCOMMA	
"XPath precisa de um objeto derivado para implementar nodeTest!"	TokenNameStringLiteral	XPath precisa de um objeto derivado para implementar nodeTest!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 WG  FUNCTION  TOKEN  NOT  FOUND
,	TokenNameCOMMA	
"Token function n‹o encontrado."	TokenNameStringLiteral	Token function n‹o encontrado.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 WG  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
"N‹o foi poss’vel localizar a fun‹o: {0}"	TokenNameStringLiteral	N‹o foi poss’vel localizar a fun‹o: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Imposs’vel criar URL a partir de: {0}"	TokenNameStringLiteral	Imposs’vel criar URL a partir de: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPAND_ENTITIES_NOT_SUPPORTED	TokenNameIdentifier	 WG  EXPAND  ENTITIES  NOT  SUPPORTED
,	TokenNameCOMMA	
"A op‹o -E n‹o Ž suportada pelo analisador do DTM"	TokenNameStringLiteral	A op‹o -E n‹o Ž suportada pelo analisador do DTM
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 WG  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
"VariableReference fornecido para a vari‡vel fora de contexto ou sem defini‹o! Nome = {0}"	TokenNameStringLiteral	VariableReference fornecido para a vari‡vel fora de contexto ou sem defini‹o! Nome = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_UNSUPPORTED_ENCODING	TokenNameIdentifier	 WG  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Codifica‹o n‹o suportada: {0}"	TokenNameStringLiteral	Codifica‹o n‹o suportada: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"pt"	TokenNameStringLiteral	pt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"pt"	TokenNameStringLiteral	pt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"pt"	TokenNameStringLiteral	pt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"O par‰metro para createMessage estava fora dos limites"	TokenNameStringLiteral	O par‰metro para createMessage estava fora dos limites
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Exce‹o emitida durante chamada messageFormat"	TokenNameStringLiteral	Exce‹o emitida durante chamada messageFormat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Vers‹o Xalan"	TokenNameStringLiteral	>>>>>>> Vers‹o Xalan
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
"sim"	TokenNameStringLiteral	sim
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Linha n¡"	TokenNameStringLiteral	Linha n¡
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Coluna n¡"	TokenNameStringLiteral	Coluna n¡
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: conclu’do"	TokenNameStringLiteral	XSLProcessor: conclu’do
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xpath_option"	TokenNameStringLiteral	xpath_option
,	TokenNameCOMMA	
"op›es xpath:"	TokenNameStringLiteral	op›es xpath:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
" [-in inputXMLURL]"	TokenNameStringLiteral	 [-in inputXMLURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSelect"	TokenNameStringLiteral	optionSelect
,	TokenNameCOMMA	
" [-select xpath expression]"	TokenNameStringLiteral	 [-select xpath expression]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionMatch"	TokenNameStringLiteral	optionMatch
,	TokenNameCOMMA	
"[-match match pattern (para corresponder diagn—sticos)]"	TokenNameStringLiteral	[-match match pattern (para corresponder diagn—sticos)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionAnyExpr"	TokenNameStringLiteral	optionAnyExpr
,	TokenNameCOMMA	
"Ou apenas uma express‹o xpath executar‡ um dump de diagn—stico"	TokenNameStringLiteral	Ou apenas uma express‹o xpath executar‡ um dump de diagn—stico
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"O Processo XSL n‹o obteve xito."	TokenNameStringLiteral	O Processo XSL n‹o obteve xito.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** N‹o foi poss’vel encontrar o analisador **"	TokenNameStringLiteral	** N‹o foi poss’vel encontrar o analisador **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Verifique seu classpath."	TokenNameStringLiteral	Verifique seu classpath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Se voc n‹o tiver o XML Parser para Java da IBM, poder‡ fazer o download dele a partir de"	TokenNameStringLiteral	Se voc n‹o tiver o XML Parser para Java da IBM, poder‡ fazer o download dele a partir de
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"IBM's AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	IBM's AlphaWorks: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"gtone"	TokenNameStringLiteral	gtone
,	TokenNameCOMMA	
">1"	TokenNameStringLiteral	>1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"zero"	TokenNameStringLiteral	zero
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================= INFRASTRUCTURE ====================== 	TokenNameCOMMENT_LINE	================= INFRASTRUCTURE ====================== 
/** Field BAD_CODE */	TokenNameCOMMENT_JAVADOC	 Field BAD_CODE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_CODE	TokenNameIdentifier	 BAD  CODE
=	TokenNameEQUAL	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
;	TokenNameSEMICOLON	
/** Field FORMAT_FAILED */	TokenNameCOMMENT_JAVADOC	 Field FORMAT_FAILED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORMAT_FAILED	TokenNameIdentifier	 FORMAT  FAILED
=	TokenNameEQUAL	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
;	TokenNameSEMICOLON	
/** Field ERROR_RESOURCES */	TokenNameCOMMENT_JAVADOC	 Field ERROR_RESOURCES 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_RESOURCES	TokenNameIdentifier	 ERROR  RESOURCES
=	TokenNameEQUAL	
"org.apache.xpath.res.XPATHErrorResources"	TokenNameStringLiteral	org.apache.xpath.res.XPATHErrorResources
;	TokenNameSEMICOLON	
/** Field ERROR_STRING */	TokenNameCOMMENT_JAVADOC	 Field ERROR_STRING 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_STRING	TokenNameIdentifier	 ERROR  STRING
=	TokenNameEQUAL	
"#error"	TokenNameStringLiteral	#error
;	TokenNameSEMICOLON	
/** Field ERROR_HEADER */	TokenNameCOMMENT_JAVADOC	 Field ERROR_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HEADER	TokenNameIdentifier	 ERROR  HEADER
=	TokenNameEQUAL	
"Erro: "	TokenNameStringLiteral	Erro: 
;	TokenNameSEMICOLON	
/** Field WARNING_HEADER */	TokenNameCOMMENT_JAVADOC	 Field WARNING_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Aviso: "	TokenNameStringLiteral	Aviso: 
;	TokenNameSEMICOLON	
/** Field XSL_HEADER */	TokenNameCOMMENT_JAVADOC	 Field XSL_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSL_HEADER	TokenNameIdentifier	 XSL  HEADER
=	TokenNameEQUAL	
"XSL "	TokenNameStringLiteral	XSL 
;	TokenNameSEMICOLON	
/** Field XML_HEADER */	TokenNameCOMMENT_JAVADOC	 Field XML_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_HEADER	TokenNameIdentifier	 XML  HEADER
=	TokenNameEQUAL	
"XML "	TokenNameStringLiteral	XML 
;	TokenNameSEMICOLON	
/** Field QUERY_HEADER */	TokenNameCOMMENT_JAVADOC	 Field QUERY_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
QUERY_HEADER	TokenNameIdentifier	 QUERY  HEADER
=	TokenNameEQUAL	
"PADRÌO "	TokenNameStringLiteral	PADRÌO 
;	TokenNameSEMICOLON	
/** * Return a named ResourceBundle for a particular locale. This method mimics the behavior * of ResourceBundle.getBundle(). * * @param className Name of local-specific subclass. * @return the ResourceBundle * @throws MissingResourceException */	TokenNameCOMMENT_JAVADOC	 Return a named ResourceBundle for a particular locale. This method mimics the behavior of ResourceBundle.getBundle(). * @param className Name of local-specific subclass. @return the ResourceBundle @throws MissingResourceException 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
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
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
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
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
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
