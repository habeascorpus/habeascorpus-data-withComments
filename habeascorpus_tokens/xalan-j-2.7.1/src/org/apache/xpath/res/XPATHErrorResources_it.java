/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPATHErrorResources_it.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPATHErrorResources_it.java 468655 2006-10-28 07:12:06Z minchau $ 
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
XPATHErrorResources_it	TokenNameIdentifier	 XPATH Error Resources it
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
"La funzione corrente () non  consentita in un modello di corrispondenza."	TokenNameStringLiteral	La funzione corrente () non  consentita in un modello di corrispondenza.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CURRENT_TAKES_NO_ARGS	TokenNameIdentifier	 ER  CURRENT  TAKES  NO  ARGS
,	TokenNameCOMMA	
"La funzione corrente () non accetta argomenti."	TokenNameStringLiteral	La funzione corrente () non accetta argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DOCUMENT_REPLACED	TokenNameIdentifier	 ER  DOCUMENT  REPLACED
,	TokenNameCOMMA	
"L'implementazione della funzione documento ()  stata sostituita da org.apache.xalan.xslt.FuncDocument."	TokenNameStringLiteral	L'implementazione della funzione documento ()  stata sostituita da org.apache.xalan.xslt.FuncDocument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CONTEXT_HAS_NO_OWNERDOC	TokenNameIdentifier	 ER  CONTEXT  HAS  NO  OWNERDOC
,	TokenNameCOMMA	
"il contesto non ha un documento proprietario."	TokenNameStringLiteral	il contesto non ha un documento proprietario.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_LOCALNAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  LOCALNAME  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"local-name() ha troppi argomenti."	TokenNameStringLiteral	local-name() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACEURI_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAMESPACEURI  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"namespace-uri() ha troppi argomenti."	TokenNameStringLiteral	namespace-uri() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NORMALIZESPACE  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"normalize-space() ha troppi argomenti."	TokenNameStringLiteral	normalize-space() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NUMBER_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NUMBER  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"number() ha troppi argomenti."	TokenNameStringLiteral	number() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAME  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"name() ha troppi argomenti."	TokenNameStringLiteral	name() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STRING_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRING  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"string() ha troppi argomenti."	TokenNameStringLiteral	string() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STRINGLENGTH_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRINGLENGTH  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"string-length() ha troppi argomenti."	TokenNameStringLiteral	string-length() ha troppi argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TRANSLATE_TAKES_3_ARGS	TokenNameIdentifier	 ER  TRANSLATE  TAKES 3  ARGS
,	TokenNameCOMMA	
"La funzione translate() richiede tre argomenti."	TokenNameStringLiteral	La funzione translate() richiede tre argomenti.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNPARSEDENTITYURI_TAKES_1_ARG	TokenNameIdentifier	 ER  UNPARSEDENTITYURI  TAKES 1  ARG
,	TokenNameCOMMA	
"La funzione unparsed-entity-uri richiede un argomento."	TokenNameStringLiteral	La funzione unparsed-entity-uri richiede un argomento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NAMESPACEAXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  NAMESPACEAXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"namespace axis non ancora implementato."	TokenNameStringLiteral	namespace axis non ancora implementato.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_AXIS	TokenNameIdentifier	 ER  UNKNOWN  AXIS
,	TokenNameCOMMA	
"asse sconosciuto: {0}"	TokenNameStringLiteral	asse sconosciuto: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_MATCH_OPERATION	TokenNameIdentifier	 ER  UNKNOWN  MATCH  OPERATION
,	TokenNameCOMMA	
"operazione di corrispondenza sconosciuta."	TokenNameStringLiteral	operazione di corrispondenza sconosciuta.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCORRECT_ARG_LENGTH	TokenNameIdentifier	 ER  INCORRECT  ARG  LENGTH
,	TokenNameCOMMA	
"Lunghezza argomento nella prova nodo processing-instruction() non corretta."	TokenNameStringLiteral	Lunghezza argomento nella prova nodo processing-instruction() non corretta.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NUMBER
,	TokenNameCOMMA	
"Impossibile convertire {0} in un numero"	TokenNameStringLiteral	Impossibile convertire {0} in un numero
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
,	TokenNameCOMMA	
"Impossibile convertire {0} in un NodeList."	TokenNameStringLiteral	Impossibile convertire {0} in un NodeList.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_MUTABLENODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  MUTABLENODELIST
,	TokenNameCOMMA	
"Impossibile convertire {0} in un NodeSetDTM."	TokenNameStringLiteral	Impossibile convertire {0} in un NodeSetDTM.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_TYPE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  TYPE
,	TokenNameCOMMA	
"Impossibile convertire {0} in un type#{1}"	TokenNameStringLiteral	Impossibile convertire {0} in un type#{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_MATCH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  MATCH  PATTERN
,	TokenNameCOMMA	
"Modello corrispondenza previsto in getMatchScore!"	TokenNameStringLiteral	Modello corrispondenza previsto in getMatchScore!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_GET_VAR_NAMED	TokenNameIdentifier	 ER  COULDNOT  GET  VAR  NAMED
,	TokenNameCOMMA	
"Impossibile richiamare la variabile denominata {0}"	TokenNameStringLiteral	Impossibile richiamare la variabile denominata {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  UNKNOWN  OPCODE
,	TokenNameCOMMA	
"ERRORE! Codice operativo sconosciuto: {0}"	TokenNameStringLiteral	ERRORE! Codice operativo sconosciuto: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXTRA_ILLEGAL_TOKENS	TokenNameIdentifier	 ER  EXTRA  ILLEGAL  TOKENS
,	TokenNameCOMMA	
"Token aggiuntivi non validi: {0}"	TokenNameStringLiteral	Token aggiuntivi non validi: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_DOUBLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  DOUBLE  QUOTE
,	TokenNameCOMMA	
"letterale con numero di apici errato... previsti i doppi apici."	TokenNameStringLiteral	letterale con numero di apici errato... previsti i doppi apici.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_SINGLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  SINGLE  QUOTE
,	TokenNameCOMMA	
"letterale con numero di apici errato... previsto un solo apice."	TokenNameStringLiteral	letterale con numero di apici errato... previsto un solo apice.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EMPTY_EXPRESSION	TokenNameIdentifier	 ER  EMPTY  EXPRESSION
,	TokenNameCOMMA	
"Espressione vuota."	TokenNameStringLiteral	Espressione vuota.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EXPECTED_BUT_FOUND	TokenNameIdentifier	 ER  EXPECTED  BUT  FOUND
,	TokenNameCOMMA	
"Era previsto {0}, ma  stato trovato: {1}"	TokenNameStringLiteral	Era previsto {0}, ma  stato trovato: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
,	TokenNameCOMMA	
"Asserzione programmatore errata. - {0}"	TokenNameStringLiteral	Asserzione programmatore errata. - {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL	TokenNameIdentifier	 ER  BOOLEAN  ARG  NO  LONGER  OPTIONAL
,	TokenNameCOMMA	
"Argomento boolean(...) non pi facoltativo con la versione 19990709 XPath."	TokenNameStringLiteral	Argomento boolean(...) non pi facoltativo con la versione 19990709 XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  PRECEDING  ARG
,	TokenNameCOMMA	
"Trovata ',' senza argomento che la precede."	TokenNameStringLiteral	Trovata ',' senza argomento che la precede.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  FOLLOWING  ARG
,	TokenNameCOMMA	
"Trovata ',' senza argomento che la segue."	TokenNameStringLiteral	Trovata ',' senza argomento che la segue.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREDICATE_ILLEGAL_SYNTAX	TokenNameIdentifier	 ER  PREDICATE  ILLEGAL  SYNTAX
,	TokenNameCOMMA	
"'..[predicato]' o '.[predicato]'  una sintassi non valida. Utilizzare 'self::node()[predicato]'."	TokenNameStringLiteral	'..[predicato]' o '.[predicato]'  una sintassi non valida. Utilizzare 'self::node()[predicato]'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_AXIS_NAME	TokenNameIdentifier	 ER  ILLEGAL  AXIS  NAME
,	TokenNameCOMMA	
"nome asse non valido: {0}"	TokenNameStringLiteral	nome asse non valido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_NODETYPE	TokenNameIdentifier	 ER  UNKNOWN  NODETYPE
,	TokenNameCOMMA	
"Nodetype sconosciuto: {0}"	TokenNameStringLiteral	Nodetype sconosciuto: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PATTERN_LITERAL_NEEDS_BE_QUOTED	TokenNameIdentifier	 ER  PATTERN  LITERAL  NEEDS  BE  QUOTED
,	TokenNameCOMMA	
"Il letterale modello ({0}) deve essere racchiuso fra virgolette."	TokenNameStringLiteral	Il letterale modello ({0}) deve essere racchiuso fra virgolette.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_BE_FORMATTED_TO_NUMBER	TokenNameIdentifier	 ER  COULDNOT  BE  FORMATTED  TO  NUMBER
,	TokenNameCOMMA	
"{0} non pu˜ essere formattato in un numero."	TokenNameStringLiteral	{0} non pu˜ essere formattato in un numero.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_CREATE_XMLPROCESSORLIAISON	TokenNameIdentifier	 ER  COULDNOT  CREATE  XMLPROCESSORLIAISON
,	TokenNameCOMMA	
"Impossibile creare XML TransformerFactory Liaison: {0}"	TokenNameStringLiteral	Impossibile creare XML TransformerFactory Liaison: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DIDNOT_FIND_XPATH_SELECT_EXP	TokenNameIdentifier	 ER  DIDNOT  FIND  XPATH  SELECT  EXP
,	TokenNameCOMMA	
"Errore! Impossibile trovare espressione selezione xpath (-select)."	TokenNameStringLiteral	Errore! Impossibile trovare espressione selezione xpath (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH	TokenNameIdentifier	 ER  COULDNOT  FIND  ENDOP  AFTER  OPLOCATIONPATH
,	TokenNameCOMMA	
"ERRORE! Impossibile trovare ENDOP dopo OP_LOCATIONPATH"	TokenNameStringLiteral	ERRORE! Impossibile trovare ENDOP dopo OP_LOCATIONPATH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ERROR_OCCURED	TokenNameIdentifier	 ER  ERROR  OCCURED
,	TokenNameCOMMA	
"Si  verificato un errore."	TokenNameStringLiteral	Si  verificato un errore.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 ER  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
"VariableReference fornito per la variabile  fuori contesto o senza definizione. Nome = {0}"	TokenNameStringLiteral	VariableReference fornito per la variabile  fuori contesto o senza definizione. Nome = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_AXES_NOT_ALLOWED	TokenNameIdentifier	 ER  AXES  NOT  ALLOWED
,	TokenNameCOMMA	
"Sono consentiti solo gli assi child:: e attribute:: nei modelli di corrispondenza. Violazione asse = {0}"	TokenNameStringLiteral	Sono consentiti solo gli assi child:: e attribute:: nei modelli di corrispondenza. Violazione asse = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_KEY_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  KEY  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"key() con numero di argomenti scorretto."	TokenNameStringLiteral	key() con numero di argomenti scorretto.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COUNT_TAKES_1_ARG	TokenNameIdentifier	 ER  COUNT  TAKES 1  ARG
,	TokenNameCOMMA	
"La funzione count richiede un argomento."	TokenNameStringLiteral	La funzione count richiede un argomento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 ER  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
"Impossibile trovare la funzione: {0}"	TokenNameStringLiteral	Impossibile trovare la funzione: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Codifica non supportata: {0}"	TokenNameStringLiteral	Codifica non supportata: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROBLEM_IN_DTM_NEXTSIBLING	TokenNameIdentifier	 ER  PROBLEM  IN  DTM  NEXTSIBLING
,	TokenNameCOMMA	
"Si  verificato un problema in DTM durante l'esecuzione di getNextSibling... tentativo di recupero in corso"	TokenNameStringLiteral	Si  verificato un problema in DTM durante l'esecuzione di getNextSibling... tentativo di recupero in corso
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL	TokenNameIdentifier	 ER  CANNOT  WRITE  TO  EMPTYNODELISTIMPL
,	TokenNameCOMMA	
"Errore di programmazione: Impossibile scrivere su EmptyNodeList."	TokenNameStringLiteral	Errore di programmazione: Impossibile scrivere su EmptyNodeList.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SETDOMFACTORY_NOT_SUPPORTED	TokenNameIdentifier	 ER  SETDOMFACTORY  NOT  SUPPORTED
,	TokenNameCOMMA	
"setDOMFactory non supportato da XPathContext!"	TokenNameStringLiteral	setDOMFactory non supportato da XPathContext!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Il prefisso deve risolvere in uno namespace: {0}"	TokenNameStringLiteral	Il prefisso deve risolvere in uno namespace: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PARSE_NOT_SUPPORTED	TokenNameIdentifier	 ER  PARSE  NOT  SUPPORTED
,	TokenNameCOMMA	
"parse (InputSource source) non supportato in XPathContext! Impossibile aprire {0}"	TokenNameStringLiteral	parse (InputSource source) non supportato in XPathContext! Impossibile aprire {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SAX_API_NOT_HANDLED	TokenNameIdentifier	 ER  SAX  API  NOT  HANDLED
,	TokenNameCOMMA	
"Caratteri SAX API (char ch[]... non gestiti da DTM!"	TokenNameStringLiteral	Caratteri SAX API (char ch[]... non gestiti da DTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_IGNORABLE_WHITESPACE_NOT_HANDLED	TokenNameIdentifier	 ER  IGNORABLE  WHITESPACE  NOT  HANDLED
,	TokenNameCOMMA	
"ignorableWhitespace(char ch[]... non gestiti da DTM!"	TokenNameStringLiteral	ignorableWhitespace(char ch[]... non gestiti da DTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DTM_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  DTM  CANNOT  HANDLE  NODES
,	TokenNameCOMMA	
"DTMLiaison non pu˜ gestire i nodi di tipo {0}"	TokenNameStringLiteral	DTMLiaison non pu˜ gestire i nodi di tipo {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XERCES_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  XERCES  CANNOT  HANDLE  NODES
,	TokenNameCOMMA	
"DOM2Helper non pu˜ gestire i nodi di tipo {0}"	TokenNameStringLiteral	DOM2Helper non pu˜ gestire i nodi di tipo {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XERCES_PARSE_ERROR_DETAILS	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR  DETAILS
,	TokenNameCOMMA	
"Errore DOM2Helper.parse: SystemID - {0} riga - {1}"	TokenNameStringLiteral	Errore DOM2Helper.parse: SystemID - {0} riga - {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XERCES_PARSE_ERROR	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR
,	TokenNameCOMMA	
"Errore DOM2Helper.parse"	TokenNameStringLiteral	Errore DOM2Helper.parse
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Rilevato surrogato UTF-16 non valido: {0} ?"	TokenNameStringLiteral	Rilevato surrogato UTF-16 non valido: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"Errore IO"	TokenNameStringLiteral	Errore IO
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CREATE_URL	TokenNameIdentifier	 ER  CANNOT  CREATE  URL
,	TokenNameCOMMA	
"Impossibile creare url per: {0}"	TokenNameStringLiteral	Impossibile creare url per: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_READOBJECT	TokenNameIdentifier	 ER  XPATH  READOBJECT
,	TokenNameCOMMA	
"In XPath.readObject: {0}"	TokenNameStringLiteral	In XPath.readObject: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  TOKEN  NOT  FOUND
,	TokenNameCOMMA	
"token funzione non trovato."	TokenNameStringLiteral	token funzione non trovato.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier	 ER  CANNOT  DEAL  XPATH  TYPE
,	TokenNameCOMMA	
"Impossibile gestire il tipo XPath: {0}"	TokenNameStringLiteral	Impossibile gestire il tipo XPath: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
"Questo NodeSet non  trasformabile"	TokenNameStringLiteral	Questo NodeSet non  trasformabile
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
"Questo NodeSetDTM non  trasformabile"	TokenNameStringLiteral	Questo NodeSetDTM non  trasformabile
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VAR_NOT_RESOLVABLE	TokenNameIdentifier	 ER  VAR  NOT  RESOLVABLE
,	TokenNameCOMMA	
"Variabile non risolvibile: {0}"	TokenNameStringLiteral	Variabile non risolvibile: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Handler errori nullo"	TokenNameStringLiteral	Handler errori nullo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_PROG_ASSERT_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  PROG  ASSERT  UNKNOWN  OPCODE
,	TokenNameCOMMA	
"Asserzione di programmatore: codice operativo sconosciuto: {0}"	TokenNameStringLiteral	Asserzione di programmatore: codice operativo sconosciuto: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ZERO_OR_ONE	TokenNameIdentifier	 ER  ZERO  OR  ONE
,	TokenNameCOMMA	
"0 oppure 1"	TokenNameStringLiteral	0 oppure 1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"rtf() non supportato da XRTreeFragSelectWrapper"	TokenNameStringLiteral	rtf() non supportato da XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"asNodeIterator() non supportato da XRTreeFragSelectWrapper"	TokenNameStringLiteral	asNodeIterator() non supportato da XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  DETACH  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"detach() non supportato da XRTreeFragSelectWrapper"	TokenNameStringLiteral	detach() non supportato da XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  NUM  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"num() non supportato da XRTreeFragSelectWrapper"	TokenNameStringLiteral	num() non supportato da XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  XSTR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"xstr() non supportato da XRTreeFragSelectWrapper"	TokenNameStringLiteral	xstr() non supportato da XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  STR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"str() non supportato da XRTreeFragSelectWrapper"	TokenNameStringLiteral	str() non supportato da XRTreeFragSelectWrapper
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS	TokenNameIdentifier	 ER  FSB  NOT  SUPPORTED  XSTRINGFORCHARS
,	TokenNameCOMMA	
"fsb() non supportato per XStringForChars"	TokenNameStringLiteral	fsb() non supportato per XStringForChars
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_VAR	TokenNameIdentifier	 ER  COULD  NOT  FIND  VAR
,	TokenNameCOMMA	
"Impossibile trovare la variabile con il nome {0}"	TokenNameStringLiteral	Impossibile trovare la variabile con il nome {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  XSTRINGFORCHARS  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
"XStringForChars non pu˜ accettare una stringa come argomento"	TokenNameStringLiteral	XStringForChars non pu˜ accettare una stringa come argomento
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FASTSTRINGBUFFER_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FASTSTRINGBUFFER  CANNOT  BE  NULL
,	TokenNameCOMMA	
"L'argomento FastStringBuffer non pu˜ essere nullo"	TokenNameStringLiteral	L'argomento FastStringBuffer non pu˜ essere nullo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 o 3"	TokenNameStringLiteral	2 o 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_VARIABLE_ACCESSED_BEFORE_BIND	TokenNameIdentifier	 ER  VARIABLE  ACCESSED  BEFORE  BIND
,	TokenNameCOMMA	
"Variabile acceduta prima che fosse delimitata."	TokenNameStringLiteral	Variabile acceduta prima che fosse delimitata.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_FSB_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  FSB  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
"XStringForFSB non pu˜ accettare una stringa come argomento."	TokenNameStringLiteral	XStringForFSB non pu˜ accettare una stringa come argomento.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_SETTING_WALKER_ROOT_TO_NULL	TokenNameIdentifier	 ER  SETTING  WALKER  ROOT  TO  NULL
,	TokenNameCOMMA	
" !!!! Errore! Si sta impostando il nodo di partenza su null"	TokenNameStringLiteral	 !!!! Errore! Si sta impostando il nodo di partenza su null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESETDTM_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  ITERATE
,	TokenNameCOMMA	
"NodeSetDTM non pu˜ collegarsi al nodo precedente"	TokenNameStringLiteral	NodeSetDTM non pu˜ collegarsi al nodo precedente
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESET_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESET  CANNOT  ITERATE
,	TokenNameCOMMA	
"NodeSet non pu˜ collegarsi al nodo precedente"	TokenNameStringLiteral	NodeSet non pu˜ collegarsi al nodo precedente
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESETDTM_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  INDEX
,	TokenNameCOMMA	
"NodeSetDTM non pu˜ eseguire l'indicizzazione o il conteggio delle funzioni."	TokenNameStringLiteral	NodeSetDTM non pu˜ eseguire l'indicizzazione o il conteggio delle funzioni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
,	TokenNameCOMMA	
"NodeSet non pu˜ eseguire l'indicizzazione o il conteggio delle funzioni."	TokenNameStringLiteral	NodeSet non pu˜ eseguire l'indicizzazione o il conteggio delle funzioni.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANNOT_CALL_SETSHOULDCACHENODE	TokenNameIdentifier	 ER  CANNOT  CALL  SETSHOULDCACHENODE
,	TokenNameCOMMA	
"Impossibile chiamare setShouldCacheNodes dopo aver chiamato nextNode."	TokenNameStringLiteral	Impossibile chiamare setShouldCacheNodes dopo aver chiamato nextNode.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_ONLY_ALLOWS	TokenNameIdentifier	 ER  ONLY  ALLOWS
,	TokenNameCOMMA	
"{0} consente solo {1} argomenti"	TokenNameStringLiteral	{0} consente solo {1} argomenti
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_UNKNOWN_STEP	TokenNameIdentifier	 ER  UNKNOWN  STEP
,	TokenNameCOMMA	
"Asserzione di programmatore in getNextStepPos: stepType sconosciuto: {0}"	TokenNameStringLiteral	Asserzione di programmatore in getNextStepPos: stepType sconosciuto: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Note to translators: A relative location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A relative location path is a form of XPath expression. 
// The message indicates that such an expression was expected following the 	TokenNameCOMMENT_LINE	The message indicates that such an expression was expected following the 
// characters '/' or '//', but was not found. 	TokenNameCOMMENT_LINE	characters '/' or '//', but was not found. 
{	TokenNameLBRACE	
ER_EXPECTED_REL_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  REL  LOC  PATH
,	TokenNameCOMMA	
"Era previsto un percorso relativo dopo il token '/' oppure '//'."	TokenNameStringLiteral	Era previsto un percorso relativo dopo il token '/' oppure '//'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location path is a form of XPath expression. 
// The message indicates that syntactically such an expression was expected,but 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected,but 
// the characters specified by the substitution text were encountered instead. 	TokenNameCOMMENT_LINE	the characters specified by the substitution text were encountered instead. 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH
,	TokenNameCOMMA	
"Era previsto un percorso, ma  stato rilevato il seguente token: {0}"	TokenNameStringLiteral	Era previsto un percorso, ma  stato rilevato il seguente token: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location path is a form of XPath expression. 
// The message indicates that syntactically such a subexpression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such a subexpression was expected, 
// but no more characters were found in the expression. 	TokenNameCOMMENT_LINE	but no more characters were found in the expression. 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_PATH_AT_END_EXPR	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH  AT  END  EXPR
,	TokenNameCOMMA	
"Era previsto un percorso, ma invece  stata trovata la fine dell'espressione XPath."	TokenNameStringLiteral	Era previsto un percorso, ma invece  stata trovata la fine dell'espressione XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location step is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location step is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected 
// following the specified characters. 	TokenNameCOMMENT_LINE	following the specified characters. 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_STEP	TokenNameIdentifier	 ER  EXPECTED  LOC  STEP
,	TokenNameCOMMA	
"Era previsto un passo di posizione dopo il token '/' oppure '//'."	TokenNameStringLiteral	Era previsto un passo di posizione dopo il token '/' oppure '//'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A node test is part of an XPath expression that is 	TokenNameCOMMENT_LINE	Note to translators: A node test is part of an XPath expression that is 
// used to test for particular kinds of nodes. In this case, a node test that 	TokenNameCOMMENT_LINE	used to test for particular kinds of nodes. In this case, a node test that 
// consists of an NCName followed by a colon and an asterisk or that consists 	TokenNameCOMMENT_LINE	consists of an NCName followed by a colon and an asterisk or that consists 
// of a QName was expected, but was not found. 	TokenNameCOMMENT_LINE	of a QName was expected, but was not found. 
{	TokenNameLBRACE	
ER_EXPECTED_NODE_TEST	TokenNameIdentifier	 ER  EXPECTED  NODE  TEST
,	TokenNameCOMMA	
"Era prevista una prova nodo che corrisponde a NCName:* oppure a QName."	TokenNameStringLiteral	Era prevista una prova nodo che corrisponde a NCName:* oppure a QName.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A step pattern is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A step pattern is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected, 
// but the specified character was found in the expression instead. 	TokenNameCOMMENT_LINE	but the specified character was found in the expression instead. 
{	TokenNameLBRACE	
ER_EXPECTED_STEP_PATTERN	TokenNameIdentifier	 ER  EXPECTED  STEP  PATTERN
,	TokenNameCOMMA	
"Era previsto un modello passo, ma  stato rilevato '/'."	TokenNameStringLiteral	Era previsto un modello passo, ma  stato rilevato '/'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A relative path pattern is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A relative path pattern is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected, 
// but was not found. 	TokenNameCOMMENT_LINE	but was not found. 
{	TokenNameLBRACE	
ER_EXPECTED_REL_PATH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  REL  PATH  PATTERN
,	TokenNameCOMMA	
"Era previsto un modello percorso relativo."	TokenNameStringLiteral	Era previsto un modello percorso relativo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The substitution text is the name of a data type. The 	TokenNameCOMMENT_LINE	Note to translators: The substitution text is the name of a data type. The 
// message indicates that a value of a particular type could not be converted 	TokenNameCOMMENT_LINE	message indicates that a value of a particular type could not be converted 
// to a value of type boolean. 	TokenNameCOMMENT_LINE	to a value of type boolean. 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_BOOLEAN	TokenNameIdentifier	 ER  CANT  CONVERT  TO  BOOLEAN
,	TokenNameCOMMA	
"XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in valore booleano."	TokenNameStringLiteral	XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in valore booleano.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and 	TokenNameCOMMENT_LINE	Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and 
// FIRST_ORDERED_NODE_TYPE. 	TokenNameCOMMENT_LINE	FIRST_ORDERED_NODE_TYPE. 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_SINGLENODE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  SINGLENODE
,	TokenNameCOMMA	
"XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in un nodo singolo. Il metodo getSingleNodeValue si applica solo ai tipi ANY_UNORDERED_NODE_TYPE eFIRST_ORDERED_NODE_TYPE."	TokenNameStringLiteral	XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in un nodo singolo. Il metodo getSingleNodeValue si applica solo ai tipi ANY_UNORDERED_NODE_TYPE eFIRST_ORDERED_NODE_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and 	TokenNameCOMMENT_LINE	Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and 
// ORDERED_NODE_SNAPSHOT_TYPE. 	TokenNameCOMMENT_LINE	ORDERED_NODE_SNAPSHOT_TYPE. 
{	TokenNameLBRACE	
ER_CANT_GET_SNAPSHOT_LENGTH	TokenNameIdentifier	 ER  CANT  GET  SNAPSHOT  LENGTH
,	TokenNameCOMMA	
"Il metodo getSnapshotLength non pu˜ essere chiamato al XPathResult dell''''espressione XPath ''{0}'' poichŽ il XPathResultType  {1}. Questo metodo si applica solo ai tipi UNORDERED_NODE_SNAPSHOT_TYPE e ORDERED_NODE_SNAPSHOT_TYPE."	TokenNameStringLiteral	Il metodo getSnapshotLength non pu˜ essere chiamato al XPathResult dell''''espressione XPath ''{0}'' poichŽ il XPathResultType  {1}. Questo metodo si applica solo ai tipi UNORDERED_NODE_SNAPSHOT_TYPE e ORDERED_NODE_SNAPSHOT_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NON_ITERATOR_TYPE	TokenNameIdentifier	 ER  NON  ITERATOR  TYPE
,	TokenNameCOMMA	
"Il metodo iterateNext non pu˜ essere chiamato in XPathResult dell''''espressione XPath ''{0}'' poichŽ XPathResultType  {1}. Questo metodo si applica solo ai tipi UNORDERED_NODE_ITERATOR_TYPE e ORDERED_NODE_ITERATOR_TYPE."	TokenNameStringLiteral	Il metodo iterateNext non pu˜ essere chiamato in XPathResult dell''''espressione XPath ''{0}'' poichŽ XPathResultType  {1}. Questo metodo si applica solo ai tipi UNORDERED_NODE_ITERATOR_TYPE e ORDERED_NODE_ITERATOR_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the document being operated 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the document being operated 
// upon changed, so the iterator object that was being used to traverse the 	TokenNameCOMMENT_LINE	upon changed, so the iterator object that was being used to traverse the 
// document has now become invalid. 	TokenNameCOMMENT_LINE	document has now become invalid. 
{	TokenNameLBRACE	
ER_DOC_MUTATED	TokenNameIdentifier	 ER  DOC  MUTATED
,	TokenNameCOMMA	
"Documento modificato da quando  stato restituito il risultato. Iteratore non valido."	TokenNameStringLiteral	Documento modificato da quando  stato restituito il risultato. Iteratore non valido.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INVALID_XPATH_TYPE	TokenNameIdentifier	 ER  INVALID  XPATH  TYPE
,	TokenNameCOMMA	
"Argomento di tipo XPath non valido: {0}"	TokenNameStringLiteral	Argomento di tipo XPath non valido: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_EMPTY_XPATH_RESULT	TokenNameIdentifier	 ER  EMPTY  XPATH  RESULT
,	TokenNameCOMMA	
"Oggetto risultato XPath vuoto"	TokenNameStringLiteral	Oggetto risultato XPath vuoto
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_INCOMPATIBLE_TYPES	TokenNameIdentifier	 ER  INCOMPATIBLE  TYPES
,	TokenNameCOMMA	
"XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito nel XPathResultType specificato di {2}."	TokenNameStringLiteral	XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito nel XPathResultType specificato di {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_NULL_RESOLVER	TokenNameIdentifier	 ER  NULL  RESOLVER
,	TokenNameCOMMA	
"Impossibile risolvere il prefisso con resolver di prefisso nullo."	TokenNameStringLiteral	Impossibile risolvere il prefisso con resolver di prefisso nullo.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The substitution text is the name of a data type. The 	TokenNameCOMMENT_LINE	Note to translators: The substitution text is the name of a data type. The 
// message indicates that a value of a particular type could not be converted 	TokenNameCOMMENT_LINE	message indicates that a value of a particular type could not be converted 
// to a value of type string. 	TokenNameCOMMENT_LINE	to a value of type string. 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_STRING	TokenNameIdentifier	 ER  CANT  CONVERT  TO  STRING
,	TokenNameCOMMA	
"XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in una stringa."	TokenNameStringLiteral	XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in una stringa.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate snapshotItem, 	TokenNameCOMMENT_LINE	Note to translators: Do not translate snapshotItem, 
// UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE. 	TokenNameCOMMENT_LINE	UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE. 
{	TokenNameLBRACE	
ER_NON_SNAPSHOT_TYPE	TokenNameIdentifier	 ER  NON  SNAPSHOT  TYPE
,	TokenNameCOMMA	
"Il metodo snapshotItem non pu˜ essere chiamato al XPathResult dell''''espressione XPath ''{0}'' poichŽ XPathResultType  {1}. Questo metodo si applica solo ai tipi UNORDERED_NODE_SNAPSHOT_TYPE eORDERED_NODE_SNAPSHOT_TYPE."	TokenNameStringLiteral	Il metodo snapshotItem non pu˜ essere chiamato al XPathResult dell''''espressione XPath ''{0}'' poichŽ XPathResultType  {1}. Questo metodo si applica solo ai tipi UNORDERED_NODE_SNAPSHOT_TYPE eORDERED_NODE_SNAPSHOT_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: XPathEvaluator is a Java interface name. An 	TokenNameCOMMENT_LINE	Note to translators: XPathEvaluator is a Java interface name. An 
// XPathEvaluator is created with respect to a particular XML document, and in 	TokenNameCOMMENT_LINE	XPathEvaluator is created with respect to a particular XML document, and in 
// this case the expression represented by this object was being evaluated with 	TokenNameCOMMENT_LINE	this case the expression represented by this object was being evaluated with 
// respect to a context node from a different document. 	TokenNameCOMMENT_LINE	respect to a context node from a different document. 
{	TokenNameLBRACE	
ER_WRONG_DOCUMENT	TokenNameIdentifier	 ER  WRONG  DOCUMENT
,	TokenNameCOMMA	
"Il nodo di contesto non appartiene al documento collegato a questo XPathEvaluator."	TokenNameStringLiteral	Il nodo di contesto non appartiene al documento collegato a questo XPathEvaluator.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The XPath expression cannot be evaluated with respect 	TokenNameCOMMENT_LINE	Note to translators: The XPath expression cannot be evaluated with respect 
// to this type of node. 	TokenNameCOMMENT_LINE	to this type of node. 
{	TokenNameLBRACE	
ER_WRONG_NODETYPE	TokenNameIdentifier	 ER  WRONG  NODETYPE
,	TokenNameCOMMA	
"Il tipo di nodo di contesto non  supportato."	TokenNameStringLiteral	Il tipo di nodo di contesto non  supportato.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_XPATH_ERROR	TokenNameIdentifier	 ER  XPATH  ERROR
,	TokenNameCOMMA	
"Errore sconosciuto in XPath."	TokenNameStringLiteral	Errore sconosciuto in XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  XPATHRESULTTYPE  TO  NUMBER
,	TokenNameCOMMA	
"XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in un numero"	TokenNameStringLiteral	XPathResult dell''''espressione XPath ''{0}'' ha un XPathResultType di {1} che non pu˜ essere convertito in un numero
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//BEGIN: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 	TokenNameCOMMENT_LINE	BEGIN: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 
/** Field ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED */	TokenNameCOMMENT_JAVADOC	 Field ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED 
{	TokenNameLBRACE	
ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED	TokenNameIdentifier	 ER  EXTENSION  FUNCTION  CANNOT  BE  INVOKED
,	TokenNameCOMMA	
"Funzione di estensione: Impossibile richiamare ''{0}'' quando la funzione XMLConstants.FEATURE_SECURE_PROCESSING  impostata su true."	TokenNameStringLiteral	Funzione di estensione: Impossibile richiamare ''{0}'' quando la funzione XMLConstants.FEATURE_SECURE_PROCESSING  impostata su true.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_RESOLVE_VARIABLE_RETURNS_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_RESOLVE_VARIABLE_RETURNS_NULL 
{	TokenNameLBRACE	
ER_RESOLVE_VARIABLE_RETURNS_NULL	TokenNameIdentifier	 ER  RESOLVE  VARIABLE  RETURNS  NULL
,	TokenNameCOMMA	
"resolveVariable per la variabile {0} che restituisce null"	TokenNameStringLiteral	resolveVariable per la variabile {0} che restituisce null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNSUPPORTED_RETURN_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_UNSUPPORTED_RETURN_TYPE 
{	TokenNameLBRACE	
ER_UNSUPPORTED_RETURN_TYPE	TokenNameIdentifier	 ER  UNSUPPORTED  RETURN  TYPE
,	TokenNameCOMMA	
"Tipo di ritorno non supportato : {0}"	TokenNameStringLiteral	Tipo di ritorno non supportato : {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL 
{	TokenNameLBRACE	
ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  RETURN  TYPE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Il tipo origine e/o ritorno non pu˜ essere nullo"	TokenNameStringLiteral	Il tipo origine e/o ritorno non pu˜ essere nullo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_ARG_CANNOT_BE_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_ARG_CANNOT_BE_NULL 
{	TokenNameLBRACE	
ER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"L''''argomento {0} non pu˜ essere nullo"	TokenNameStringLiteral	L''''argomento {0} non pu˜ essere nullo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OBJECT_MODEL_NULL */	TokenNameCOMMENT_JAVADOC	 Field ER_OBJECT_MODEL_NULL 
{	TokenNameLBRACE	
ER_OBJECT_MODEL_NULL	TokenNameIdentifier	 ER  OBJECT  MODEL  NULL
,	TokenNameCOMMA	
"{0}#isObjectModelSupported( String objectModel ) non pu˜ essere chiamato con objectModel == null"	TokenNameStringLiteral	{0}#isObjectModelSupported( String objectModel ) non pu˜ essere chiamato con objectModel == null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OBJECT_MODEL_EMPTY */	TokenNameCOMMENT_JAVADOC	 Field ER_OBJECT_MODEL_EMPTY 
{	TokenNameLBRACE	
ER_OBJECT_MODEL_EMPTY	TokenNameIdentifier	 ER  OBJECT  MODEL  EMPTY
,	TokenNameCOMMA	
"{0}#isObjectModelSupported( String objectModel ) non pu˜ essere chiamato con objectModel == """	TokenNameStringLiteral	{0}#isObjectModelSupported( String objectModel ) non pu˜ essere chiamato con objectModel == ""
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OBJECT_MODEL_EMPTY */	TokenNameCOMMENT_JAVADOC	 Field ER_OBJECT_MODEL_EMPTY 
{	TokenNameLBRACE	
ER_FEATURE_NAME_NULL	TokenNameIdentifier	 ER  FEATURE  NAME  NULL
,	TokenNameCOMMA	
"Tentativo di impostare una funzione con un nome nullo: {0}#setFeature( null, {1})"	TokenNameStringLiteral	Tentativo di impostare una funzione con un nome nullo: {0}#setFeature( null, {1})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_FEATURE_UNKNOWN */	TokenNameCOMMENT_JAVADOC	 Field ER_FEATURE_UNKNOWN 
{	TokenNameLBRACE	
ER_FEATURE_UNKNOWN	TokenNameIdentifier	 ER  FEATURE  UNKNOWN
,	TokenNameCOMMA	
"Tentativo di impostare una funzione sconosciuta "{0}":{1}#setFeature({0},{2})"	TokenNameStringLiteral	Tentativo di impostare una funzione sconosciuta "{0}":{1}#setFeature({0},{2})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_GETTING_NULL_FEATURE */	TokenNameCOMMENT_JAVADOC	 Field ER_GETTING_NULL_FEATURE 
{	TokenNameLBRACE	
ER_GETTING_NULL_FEATURE	TokenNameIdentifier	 ER  GETTING  NULL  FEATURE
,	TokenNameCOMMA	
"Tentativo di ottenere una funzione con un nome nullo: {0}#getFeature(null)"	TokenNameStringLiteral	Tentativo di ottenere una funzione con un nome nullo: {0}#getFeature(null)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_GETTING_NULL_FEATURE */	TokenNameCOMMENT_JAVADOC	 Field ER_GETTING_NULL_FEATURE 
{	TokenNameLBRACE	
ER_GETTING_UNKNOWN_FEATURE	TokenNameIdentifier	 ER  GETTING  UNKNOWN  FEATURE
,	TokenNameCOMMA	
"Tentativo di ottenere una funzione sconosciuta "{0}":{1}#getFeature({0})"	TokenNameStringLiteral	Tentativo di ottenere una funzione sconosciuta "{0}":{1}#getFeature({0})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NULL_XPATH_FUNCTION_RESOLVER */	TokenNameCOMMENT_JAVADOC	 Field ER_NULL_XPATH_FUNCTION_RESOLVER 
{	TokenNameLBRACE	
ER_NULL_XPATH_FUNCTION_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  FUNCTION  RESOLVER
,	TokenNameCOMMA	
"Tentativo di impostare un XPathFunctionResolver:{0}#setXPathFunctionResolver(null) nullo"	TokenNameStringLiteral	Tentativo di impostare un XPathFunctionResolver:{0}#setXPathFunctionResolver(null) nullo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NULL_XPATH_VARIABLE_RESOLVER */	TokenNameCOMMENT_JAVADOC	 Field ER_NULL_XPATH_VARIABLE_RESOLVER 
{	TokenNameLBRACE	
ER_NULL_XPATH_VARIABLE_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  VARIABLE  RESOLVER
,	TokenNameCOMMA	
"Tentativo di impostare una XPathVariableResolver:{0}#setXPathVariableResolver(null) nulla"	TokenNameStringLiteral	Tentativo di impostare una XPathVariableResolver:{0}#setXPathVariableResolver(null) nulla
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//END: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 	TokenNameCOMMENT_LINE	END: Definitions of error keys used in exception messages of JAXP 1.3 XPath API implementation 
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
{	TokenNameLBRACE	
WG_LOCALE_NAME_NOT_HANDLED	TokenNameIdentifier	 WG  LOCALE  NAME  NOT  HANDLED
,	TokenNameCOMMA	
"nome locale nella funzione format-number non ancora gestito."	TokenNameStringLiteral	nome locale nella funzione format-number non ancora gestito.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_PROPERTY_NOT_SUPPORTED	TokenNameIdentifier	 WG  PROPERTY  NOT  SUPPORTED
,	TokenNameCOMMA	
"Proprietˆ XSL non supportata: {0}"	TokenNameStringLiteral	Proprietˆ XSL non supportata: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_DONT_DO_ANYTHING_WITH_NS	TokenNameIdentifier	 WG  DONT  DO  ANYTHING  WITH  NS
,	TokenNameCOMMA	
"Non eseguire alcune azione per lo namespace {0} nella proprietˆ: {1}"	TokenNameStringLiteral	Non eseguire alcune azione per lo namespace {0} nella proprietˆ: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_SECURITY_EXCEPTION	TokenNameIdentifier	 WG  SECURITY  EXCEPTION
,	TokenNameCOMMA	
"SecurityException durante il tentativo di accesso alla proprietˆ di sistema XSL: {0}"	TokenNameStringLiteral	SecurityException durante il tentativo di accesso alla proprietˆ di sistema XSL: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_QUO_NO_LONGER_DEFINED	TokenNameIdentifier	 WG  QUO  NO  LONGER  DEFINED
,	TokenNameCOMMA	
"Sintassi obsoleta: quo(...) non  pi definito in XPath."	TokenNameStringLiteral	Sintassi obsoleta: quo(...) non  pi definito in XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST	TokenNameIdentifier	 WG  NEED  DERIVED  OBJECT  TO  IMPLEMENT  NODETEST
,	TokenNameCOMMA	
"XPath richiede un oggetto derivato per implementare nodeTest!"	TokenNameStringLiteral	XPath richiede un oggetto derivato per implementare nodeTest!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 WG  FUNCTION  TOKEN  NOT  FOUND
,	TokenNameCOMMA	
"token funzione non trovato."	TokenNameStringLiteral	token funzione non trovato.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 WG  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
"Impossibile trovare la funzione: {0}"	TokenNameStringLiteral	Impossibile trovare la funzione: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Impossibile ricavare l''''URL da: {0}"	TokenNameStringLiteral	Impossibile ricavare l''''URL da: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_EXPAND_ENTITIES_NOT_SUPPORTED	TokenNameIdentifier	 WG  EXPAND  ENTITIES  NOT  SUPPORTED
,	TokenNameCOMMA	
"Opzione -E non supportata per il parser DTM"	TokenNameStringLiteral	Opzione -E non supportata per il parser DTM
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 WG  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
"VariableReference fornito per la variabile  fuori contesto o senza definizione. Nome = {0}"	TokenNameStringLiteral	VariableReference fornito per la variabile  fuori contesto o senza definizione. Nome = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
WG_UNSUPPORTED_ENCODING	TokenNameIdentifier	 WG  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Codifica non supportata: {0}"	TokenNameStringLiteral	Codifica non supportata: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"it"	TokenNameStringLiteral	it
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"it"	TokenNameStringLiteral	it
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"it"	TokenNameStringLiteral	it
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"Il parametro per createMessage fuori limite"	TokenNameStringLiteral	Il parametro per createMessage fuori limite
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Rilevata eccezione durante la chiamata messageFormat"	TokenNameStringLiteral	Rilevata eccezione durante la chiamata messageFormat
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Versione Xalan "	TokenNameStringLiteral	>>>>>>> Versione Xalan 
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
"s“"	TokenNameStringLiteral	s“
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Riga #"	TokenNameStringLiteral	Riga #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Colonna #"	TokenNameStringLiteral	Colonna #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: eseguito"	TokenNameStringLiteral	XSLProcessor: eseguito
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xpath_option"	TokenNameStringLiteral	xpath_option
,	TokenNameCOMMA	
"opzioni xpath: "	TokenNameStringLiteral	opzioni xpath: 
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
" [-select espressione xpath]"	TokenNameStringLiteral	 [-select espressione xpath]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionMatch"	TokenNameStringLiteral	optionMatch
,	TokenNameCOMMA	
" [-match associa il modello (per le diagnostiche di corrispondenza)]"	TokenNameStringLiteral	 [-match associa il modello (per le diagnostiche di corrispondenza)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionAnyExpr"	TokenNameStringLiteral	optionAnyExpr
,	TokenNameCOMMA	
"Oppure per un'espressione xpath eseguirˆ un dump diagnostico"	TokenNameStringLiteral	Oppure per un'espressione xpath eseguirˆ un dump diagnostico
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"Elaborazione XSL non riuscita."	TokenNameStringLiteral	Elaborazione XSL non riuscita.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** Impossibile trovare il parser **"	TokenNameStringLiteral	** Impossibile trovare il parser **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"Controllare il classpath."	TokenNameStringLiteral	Controllare il classpath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Se non si possiede IBM XML Parser per Java,  possibile scaricarlo da"	TokenNameStringLiteral	Se non si possiede IBM XML Parser per Java,  possibile scaricarlo da
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"IBM AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	IBM AlphaWorks: http://www.alphaworks.ibm.com/formula/xml
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
"#errore"	TokenNameStringLiteral	#errore
;	TokenNameSEMICOLON	
/** Field ERROR_HEADER */	TokenNameCOMMENT_JAVADOC	 Field ERROR_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HEADER	TokenNameIdentifier	 ERROR  HEADER
=	TokenNameEQUAL	
"Errore: "	TokenNameStringLiteral	Errore: 
;	TokenNameSEMICOLON	
/** Field WARNING_HEADER */	TokenNameCOMMENT_JAVADOC	 Field WARNING_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Avvertenza: "	TokenNameStringLiteral	Avvertenza: 
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
"MODELLO "	TokenNameStringLiteral	MODELLO 
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
"it"	TokenNameStringLiteral	it
,	TokenNameCOMMA	
"IT"	TokenNameStringLiteral	IT
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
